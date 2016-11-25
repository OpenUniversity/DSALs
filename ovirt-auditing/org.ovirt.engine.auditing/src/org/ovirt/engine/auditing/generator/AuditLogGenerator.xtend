package org.ovirt.engine.auditing.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.ovirt.engine.auditing.auditLog.Case
import org.ovirt.engine.auditing.auditLog.Command
import org.ovirt.engine.auditing.auditLog.Result
import org.eclipse.xtext.common.types.JvmEnumerationLiteral
import org.eclipse.xtext.common.types.JvmOperation
import java.io.File
import org.eclipse.xtext.nodemodel.ICompositeNode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AuditLogGenerator implements IGenerator {
	private Resource resource;

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		var path = 'org.ovirt.engine.core.bll.'.replaceAll('\\.', File.separator) + 'Logs.aj'
		fsa.generateFile(path, resource.compile)
	}

	def compile(Resource resource) {
	    this.resource = resource
	 '''
		package org.ovirt.engine.core.bll;

		import org.aspectj.lang.annotation.BridgedSourceLocation;
		import org.ovirt.engine.core.common.AuditLogType;
		import org.ovirt.engine.core.bll.CommandActionState;

		public privileged aspect Logs {
			«FOR command:resource.allContents.filter(typeof(Command)).toIterable»
				«command.compile»
			«ENDFOR»
		}
	'''
	}

	def compile(Command command) '''
		«NodeModelUtils.getNode(command).toSourcePosition»
		AuditLogType around(«command.type.qualifiedName» command): execution(* getAuditLogTypeValue()) && this(command) {
			«FOR acase:command.cases»
				«acase.compile»
			«ENDFOR»
			return «IF command.^default != null»AuditLogType.«command.^default.simpleName»«ELSEIF command.overrides»AuditLogType.UNASSIGNED«ELSE»proceed(command)«ENDIF»;
		}

	'''

	def compile(Case acase) '''
		if («acase.result.compile»«IF acase.actionState!=null»«acase.actionState.compile»«ENDIF»«acase.internal.compile»«FOR f:acase.fields»«f.compile»«ENDFOR»«FOR m:acase.methods»«m.compile»«ENDFOR»)
			return AuditLogType.«acase.msg.simpleName»;
	'''

 def compile(Result clause) {
 	switch clause {
 	case SUCCESS: 'command.getSucceeded()'
 	case FAILURE: '!command.getSucceeded()'
 	}
 }

 def compile(boolean internal)
 '''«IF internal» && command.isInternalExecution()«ENDIF»'''

 def compile(JvmEnumerationLiteral actionState)
 ''' && command.getActionState() == CommandActionState.«actionState.simpleName»'''

 def compile(JvmField field)
 ''' && command.«field.simpleName»'''

 def compile(JvmOperation method)
 ''' && command.«method.simpleName»()'''

 def toSourcePosition(ICompositeNode node)
	'''@BridgedSourceLocation(line=«node.startLine», file="«resource.URI.toPlatformString(true)»", module="ovirt.audit")'''
}
