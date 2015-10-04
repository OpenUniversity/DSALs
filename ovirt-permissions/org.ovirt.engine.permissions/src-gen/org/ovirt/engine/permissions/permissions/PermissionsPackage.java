/**
 */
package org.ovirt.engine.permissions.permissions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ovirt.engine.permissions.permissions.PermissionsFactory
 * @model kind="package"
 * @generated
 */
public interface PermissionsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "permissions";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ovirt.org/engine/permissions/Permissions";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "permissions";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PermissionsPackage eINSTANCE = org.ovirt.engine.permissions.permissions.impl.PermissionsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.ovirt.engine.permissions.permissions.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ovirt.engine.permissions.permissions.impl.ModelImpl
   * @see org.ovirt.engine.permissions.permissions.impl.PermissionsPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__COMMANDS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ovirt.engine.permissions.permissions.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ovirt.engine.permissions.permissions.impl.CommandImpl
   * @see org.ovirt.engine.permissions.permissions.impl.PermissionsPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__TYPE = 0;

  /**
   * The feature id for the '<em><b>Overrides</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__OVERRIDES = 1;

  /**
   * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__PERMISSIONS = 2;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.ovirt.engine.permissions.permissions.impl.PermissionImpl <em>Permission</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ovirt.engine.permissions.permissions.impl.PermissionImpl
   * @see org.ovirt.engine.permissions.permissions.impl.PermissionsPackageImpl#getPermission()
   * @generated
   */
  int PERMISSION = 2;

  /**
   * The feature id for the '<em><b>Object Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERMISSION__OBJECT_TYPE = 0;

  /**
   * The feature id for the '<em><b>Object Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERMISSION__OBJECT_ID = 1;

  /**
   * The feature id for the '<em><b>Action Group</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERMISSION__ACTION_GROUP = 2;

  /**
   * The feature id for the '<em><b>Conditional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERMISSION__CONDITIONAL = 3;

  /**
   * The feature id for the '<em><b>Condition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERMISSION__CONDITION = 4;

  /**
   * The number of structural features of the '<em>Permission</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERMISSION_FEATURE_COUNT = 5;


  /**
   * Returns the meta object for class '{@link org.ovirt.engine.permissions.permissions.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.ovirt.engine.permissions.permissions.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.ovirt.engine.permissions.permissions.Model#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see org.ovirt.engine.permissions.permissions.Model#getCommands()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Commands();

  /**
   * Returns the meta object for class '{@link org.ovirt.engine.permissions.permissions.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.ovirt.engine.permissions.permissions.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the reference '{@link org.ovirt.engine.permissions.permissions.Command#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.ovirt.engine.permissions.permissions.Command#getType()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Type();

  /**
   * Returns the meta object for the attribute '{@link org.ovirt.engine.permissions.permissions.Command#isOverrides <em>Overrides</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Overrides</em>'.
   * @see org.ovirt.engine.permissions.permissions.Command#isOverrides()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Overrides();

  /**
   * Returns the meta object for the containment reference list '{@link org.ovirt.engine.permissions.permissions.Command#getPermissions <em>Permissions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Permissions</em>'.
   * @see org.ovirt.engine.permissions.permissions.Command#getPermissions()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Permissions();

  /**
   * Returns the meta object for class '{@link org.ovirt.engine.permissions.permissions.Permission <em>Permission</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Permission</em>'.
   * @see org.ovirt.engine.permissions.permissions.Permission
   * @generated
   */
  EClass getPermission();

  /**
   * Returns the meta object for the reference '{@link org.ovirt.engine.permissions.permissions.Permission#getObjectType <em>Object Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Object Type</em>'.
   * @see org.ovirt.engine.permissions.permissions.Permission#getObjectType()
   * @see #getPermission()
   * @generated
   */
  EReference getPermission_ObjectType();

  /**
   * Returns the meta object for the reference '{@link org.ovirt.engine.permissions.permissions.Permission#getObjectId <em>Object Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Object Id</em>'.
   * @see org.ovirt.engine.permissions.permissions.Permission#getObjectId()
   * @see #getPermission()
   * @generated
   */
  EReference getPermission_ObjectId();

  /**
   * Returns the meta object for the reference '{@link org.ovirt.engine.permissions.permissions.Permission#getActionGroup <em>Action Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Action Group</em>'.
   * @see org.ovirt.engine.permissions.permissions.Permission#getActionGroup()
   * @see #getPermission()
   * @generated
   */
  EReference getPermission_ActionGroup();

  /**
   * Returns the meta object for the attribute '{@link org.ovirt.engine.permissions.permissions.Permission#isConditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Conditional</em>'.
   * @see org.ovirt.engine.permissions.permissions.Permission#isConditional()
   * @see #getPermission()
   * @generated
   */
  EAttribute getPermission_Conditional();

  /**
   * Returns the meta object for the reference '{@link org.ovirt.engine.permissions.permissions.Permission#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Condition</em>'.
   * @see org.ovirt.engine.permissions.permissions.Permission#getCondition()
   * @see #getPermission()
   * @generated
   */
  EReference getPermission_Condition();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PermissionsFactory getPermissionsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.ovirt.engine.permissions.permissions.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ovirt.engine.permissions.permissions.impl.ModelImpl
     * @see org.ovirt.engine.permissions.permissions.impl.PermissionsPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__COMMANDS = eINSTANCE.getModel_Commands();

    /**
     * The meta object literal for the '{@link org.ovirt.engine.permissions.permissions.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ovirt.engine.permissions.permissions.impl.CommandImpl
     * @see org.ovirt.engine.permissions.permissions.impl.PermissionsPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__TYPE = eINSTANCE.getCommand_Type();

    /**
     * The meta object literal for the '<em><b>Overrides</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__OVERRIDES = eINSTANCE.getCommand_Overrides();

    /**
     * The meta object literal for the '<em><b>Permissions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__PERMISSIONS = eINSTANCE.getCommand_Permissions();

    /**
     * The meta object literal for the '{@link org.ovirt.engine.permissions.permissions.impl.PermissionImpl <em>Permission</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ovirt.engine.permissions.permissions.impl.PermissionImpl
     * @see org.ovirt.engine.permissions.permissions.impl.PermissionsPackageImpl#getPermission()
     * @generated
     */
    EClass PERMISSION = eINSTANCE.getPermission();

    /**
     * The meta object literal for the '<em><b>Object Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERMISSION__OBJECT_TYPE = eINSTANCE.getPermission_ObjectType();

    /**
     * The meta object literal for the '<em><b>Object Id</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERMISSION__OBJECT_ID = eINSTANCE.getPermission_ObjectId();

    /**
     * The meta object literal for the '<em><b>Action Group</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERMISSION__ACTION_GROUP = eINSTANCE.getPermission_ActionGroup();

    /**
     * The meta object literal for the '<em><b>Conditional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERMISSION__CONDITIONAL = eINSTANCE.getPermission_Conditional();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERMISSION__CONDITION = eINSTANCE.getPermission_Condition();

  }

} //PermissionsPackage
