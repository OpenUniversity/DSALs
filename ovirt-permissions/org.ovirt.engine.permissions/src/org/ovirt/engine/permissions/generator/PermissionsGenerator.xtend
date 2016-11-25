package org.ovirt.engine.permissions.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.ovirt.engine.permissions.permissions.Command
import org.ovirt.engine.permissions.permissions.Condition
import org.ovirt.engine.permissions.permissions.Permission

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class PermissionsGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile('org/ovirt/engine/core/bll/Permissions.aj',
			'''
				package org.ovirt.engine.core.bll;
				
				import java.util.*;
				import org.ovirt.engine.core.bll.utils.PermissionSubject;
				import org.ovirt.engine.core.common.VdcObjectType;
				import org.ovirt.engine.core.common.businessentities.ActionGroup;
				import org.ovirt.engine.core.compat.Guid;
				import org.ovirt.engine.core.common.errors.EngineMessage;

				import org.slf4j.Logger;
				import org.slf4j.LoggerFactory;

				public privileged aspect Permissions {
					protected Logger log = LoggerFactory.getLogger(getClass());

					/** Infrastructure Code */

					/**
					 * Check if current user is authorized to run current action. Skip check if
					 * MLA is off or command is internal.
					 *
					 * @return <code>true</code> if the user is authorized to run the given action,
					 *   <code>false</code> otherwise
					 */
					public boolean CommandBase.isUserAuthorizedToRunAction() {
					    // Skip check if this is an internal action:
					    if (isInternalExecution()) {
					        if (log.isDebugEnabled()) {
					            log.debug("Permission check skipped for internal action {}.", getActionType());
					        }
					        return true;
					    }

					    // Skip check if multilevel administration is disabled:
					    if (!MultiLevelAdministrationHandler.isMultilevelAdministrationOn()) {
					        if (log.isDebugEnabled()) {
					            log.debug("Permission check for action '{}' skipped because multilevel administration is disabled.",
					                    getActionType());
					        }
					        return true;
					    }

					    // Deny the permissions if there is no logged in user:
					    if (getCurrentUser() == null) {
					        addValidationMessage(EngineMessage.USER_IS_NOT_LOGGED_IN);
					        return false;
					    }

					    // Get identifiers and types of the objects whose permissions have to be
					    // checked:
					    final List<PermissionSubject> permSubjects = getPermissionCheckSubjects();

					    if (permSubjects == null || permSubjects.isEmpty()) {
					        if (log.isDebugEnabled()) {
					            log.debug("The set of objects to check is null or empty for action '{}'.", getActionType());
					        }
					        addValidationMessage(EngineMessage.USER_NOT_AUTHORIZED_TO_PERFORM_ACTION);

					        return false;
					    }

					    if (isQuotaDependant()) {
					        addQuotaPermissionSubject(permSubjects);
					    }

					    if (log.isDebugEnabled()) {
					        StringBuilder builder = getPermissionSubjectsAsStringBuilder(permSubjects);

					        log.debug("Checking whether user '{}' or one of the groups he is member of, have the following permissions: {}",
					                getCurrentUser().getId(),
					                builder.toString());
					    }

					    // If we are here then we should grant the permission:
					    return checkPermissions(permSubjects);
					}

					public boolean CommandBase.checkPermissions(final List<PermissionSubject> permSubjects) {
					    for (PermissionSubject permSubject : permSubjects) {
					        if (!checkSinglePermission(permSubject, getReturnValue().getValidationMessages())) {
					            log.info("No permission found for user '{}' or one of the groups he is member of,"
					                    + " when running action '{}', Required permissions are: Action type: '{}' Action group: '{}'"
					                    + " Object type: '{}'  Object ID: '{}'.",
					                    getCurrentUser().getId(),
					                    getActionType(),
					                    permSubject.getActionGroup().getRoleType().name(),
					                    permSubject.getActionGroup().name(),
					                    permSubject.getObjectType().getVdcObjectTranslation(),
					                    permSubject.getObjectId());
					            return false;
					        }
					    }
					    return true;
					}

					 public final boolean CommandBase.checkSinglePermission(PermissionSubject permSubject, Collection<String> messages) {
					    final Guid objectId = permSubject.getObjectId();
					    final VdcObjectType objectType = permSubject.getObjectType();
					    final ActionGroup objectActionGroup = permSubject.getActionGroup();

					    // if objectId is null we can't check permission
					    if (objectId == null) {
					        if (log.isDebugEnabled()) {
					            log.debug("The object to check is null for action '{}'.", getActionType());
					        }
					        messages.add(EngineMessage.USER_NOT_AUTHORIZED_TO_PERFORM_ACTION.name());
					        return false;
					    }
					    // Check that an action group is defined for this action;
					    if (objectActionGroup == null) {
					        if (log.isDebugEnabled()) {
					            log.debug("No action group is defined for action '{}'.", getActionType());
					        }
					        return false;
					    }

					    // Check the authorization:
					    if (!checkUserAuthorization(getCurrentUser().getId(), objectActionGroup, objectId, objectType)) {
					        messages.add(permSubject.getMessage().name());
					        return false;
					    }
					    return true;
					}

					/**
					 * Checks if the current user is authorized to run the given action on the given object.
					 *
					 * @param userId
					 *            user id to check
					 * @param object
					 *            the object to check
					 * @param type
					 *            the type of the object to check
					 * @return <code>true</code> if the current user is authorized to run the action, <code>false</code> otherwise
					 */
					public boolean CommandBase.checkUserAuthorization(Guid userId,
					        final ActionGroup actionGroup,
					        final Guid object,
					        final VdcObjectType type) {
					    // Grant if there is matching permission in the database:
					    final Guid permId =
					            getDbFacade().getPermissionDao().getEntityPermissions(userId, actionGroup, object, type);
					    if (permId != null) {
					        if (log.isDebugEnabled()) {
					            log.debug("Found permission '{}' for user when running '{}', on '{}' with id '{}'",
					                    permId,
					                    getActionType(),
					                    type.getVdcObjectTranslation(),
					                    object);
					        }
					        return true;
					    }

					    // Deny otherwise:
					    if (log.isDebugEnabled()) {
					        log.debug("No permission found for user when running action '{}', on object '{}' for action group '{}' with id '{}'.",
					                getActionType(),
					                type.getVdcObjectTranslation(),
					                actionGroup,
					                object);
					    }
					    return false;
					}

					boolean around(org.ovirt.engine.core.bll.CommandBase command): execution(* isBackwardsCompatible()) && this(command) {
					    if (!command.isUserAuthorizedToRunAction())
					       return false;
					    return proceed(command);
					}

					/** Command Permissions */

					«FOR command:resource.allContents.filter(typeof(Command)).toIterable»
						«command.compile»
					«ENDFOR»
				}
			'''
		)
	}

	def compile(Command command) '''
		List<PermissionSubject> around(«command.type.qualifiedName» command): execution(* getPermissionCheckSubjects()) && this(command) {
			List<PermissionSubject> permissions = new ArrayList<>();
			«IF command.extends!=null»
			    «IF command.extends.cond!=null»if («IF command.extends.cond.not»!«ENDIF»command.«command.extends.cond.operation.simpleName»())«ENDIF»
			    permissions.addAll(proceed(command));
			«ENDIF»

			«FOR permission:command.permissions»
				«permission.compile»
			«ENDFOR»

			return permissions;
		}

	'''

	def compile(Permission permission) '''
	try {
		«IF permission.conditional»
			if («FOR condition:permission.conditions SEPARATOR ' && ' »«condition.compile»«ENDFOR») {
		«ENDIF»	    
				permissions.add(new PermissionSubject(command.«permission.objectId.simpleName»(),
					VdcObjectType.«permission.objectType.simpleName»,
					ActionGroup.«permission.actionGroup.simpleName»));
		«IF permission.conditional»
			}
		«ENDIF»
	} catch (Exception e) {
		log.error("Could not add permission subject for: VdcObjectType.«permission.objectType.simpleName» ActionGroup.«permission.actionGroup.simpleName»");
	}

	'''

    def compile(Condition condition) '''«IF condition.not»!«ENDIF»command.«condition.operation.simpleName»()'''
}
