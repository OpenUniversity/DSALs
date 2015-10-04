/*
 * generated by Xtext
 */
grammar InternalPermissions;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.ovirt.engine.permissions.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.ovirt.engine.permissions.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.ovirt.engine.permissions.services.PermissionsGrammarAccess;

}

@parser::members {
 
 	private PermissionsGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(PermissionsGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getCommandsAssignment()); }
(rule__Model__CommandsAssignment)*
{ after(grammarAccess.getModelAccess().getCommandsAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCommand
entryRuleCommand 
:
{ before(grammarAccess.getCommandRule()); }
	 ruleCommand
{ after(grammarAccess.getCommandRule()); } 
	 EOF 
;

// Rule Command
ruleCommand
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCommandAccess().getGroup()); }
(rule__Command__Group__0)
{ after(grammarAccess.getCommandAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePermission
entryRulePermission 
:
{ before(grammarAccess.getPermissionRule()); }
	 rulePermission
{ after(grammarAccess.getPermissionRule()); } 
	 EOF 
;

// Rule Permission
rulePermission
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPermissionAccess().getGroup()); }
(rule__Permission__Group__0)
{ after(grammarAccess.getPermissionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleQualifiedName
entryRuleQualifiedName 
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
(rule__QualifiedName__Group__0)
{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Command__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Command__Group__0__Impl
	rule__Command__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Command__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCommandAccess().getPermissionsForKeyword_0()); }

	'permissions for' 

{ after(grammarAccess.getCommandAccess().getPermissionsForKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Command__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Command__Group__1__Impl
	rule__Command__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Command__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCommandAccess().getTypeAssignment_1()); }
(rule__Command__TypeAssignment_1)
{ after(grammarAccess.getCommandAccess().getTypeAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Command__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Command__Group__2__Impl
	rule__Command__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Command__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCommandAccess().getOverridesAssignment_2()); }
(rule__Command__OverridesAssignment_2)?
{ after(grammarAccess.getCommandAccess().getOverridesAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Command__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Command__Group__3__Impl
	rule__Command__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Command__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCommandAccess().getColonKeyword_3()); }

	':' 

{ after(grammarAccess.getCommandAccess().getColonKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Command__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Command__Group__4__Impl
	rule__Command__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Command__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCommandAccess().getGroup_4()); }
(rule__Command__Group_4__0)?
{ after(grammarAccess.getCommandAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Command__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Command__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Command__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCommandAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getCommandAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__Command__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Command__Group_4__0__Impl
	rule__Command__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Command__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCommandAccess().getPermissionsAssignment_4_0()); }
(rule__Command__PermissionsAssignment_4_0)
{ after(grammarAccess.getCommandAccess().getPermissionsAssignment_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Command__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Command__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Command__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCommandAccess().getGroup_4_1()); }
(rule__Command__Group_4_1__0)*
{ after(grammarAccess.getCommandAccess().getGroup_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Command__Group_4_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Command__Group_4_1__0__Impl
	rule__Command__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Command__Group_4_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCommandAccess().getCommaKeyword_4_1_0()); }

	',' 

{ after(grammarAccess.getCommandAccess().getCommaKeyword_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Command__Group_4_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Command__Group_4_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Command__Group_4_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCommandAccess().getPermissionsAssignment_4_1_1()); }
(rule__Command__PermissionsAssignment_4_1_1)
{ after(grammarAccess.getCommandAccess().getPermissionsAssignment_4_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Permission__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Permission__Group__0__Impl
	rule__Permission__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Permission__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPermissionAccess().getObjectTypeKeyword_0()); }

	'object type = ' 

{ after(grammarAccess.getPermissionAccess().getObjectTypeKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Permission__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Permission__Group__1__Impl
	rule__Permission__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Permission__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPermissionAccess().getObjectTypeAssignment_1()); }
(rule__Permission__ObjectTypeAssignment_1)
{ after(grammarAccess.getPermissionAccess().getObjectTypeAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Permission__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Permission__Group__2__Impl
	rule__Permission__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Permission__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPermissionAccess().getObjectIdKeyword_2()); }

	'object id = ' 

{ after(grammarAccess.getPermissionAccess().getObjectIdKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Permission__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Permission__Group__3__Impl
	rule__Permission__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Permission__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPermissionAccess().getObjectIdAssignment_3()); }
(rule__Permission__ObjectIdAssignment_3)
{ after(grammarAccess.getPermissionAccess().getObjectIdAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Permission__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Permission__Group__4__Impl
	rule__Permission__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Permission__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPermissionAccess().getActionGroupKeyword_4()); }

	'action group = ' 

{ after(grammarAccess.getPermissionAccess().getActionGroupKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Permission__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Permission__Group__5__Impl
	rule__Permission__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Permission__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPermissionAccess().getActionGroupAssignment_5()); }
(rule__Permission__ActionGroupAssignment_5)
{ after(grammarAccess.getPermissionAccess().getActionGroupAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Permission__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Permission__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Permission__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPermissionAccess().getGroup_6()); }
(rule__Permission__Group_6__0)?
{ after(grammarAccess.getPermissionAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__Permission__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Permission__Group_6__0__Impl
	rule__Permission__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Permission__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPermissionAccess().getConditionalAssignment_6_0()); }
(rule__Permission__ConditionalAssignment_6_0)
{ after(grammarAccess.getPermissionAccess().getConditionalAssignment_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Permission__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Permission__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Permission__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPermissionAccess().getConditionAssignment_6_1()); }
(rule__Permission__ConditionAssignment_6_1)
{ after(grammarAccess.getPermissionAccess().getConditionAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QualifiedName__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
(rule__QualifiedName__Group_1__0)*
{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QualifiedName__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }

	'.' 

{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Model__CommandsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0()); }
	ruleCommand{ after(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Command__TypeAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCommandAccess().getTypeJvmDeclaredTypeCrossReference_1_0()); }
(
{ before(grammarAccess.getCommandAccess().getTypeJvmDeclaredTypeQualifiedNameParserRuleCall_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getCommandAccess().getTypeJvmDeclaredTypeQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getCommandAccess().getTypeJvmDeclaredTypeCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Command__OverridesAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCommandAccess().getOverridesOverridesKeyword_2_0()); }
(
{ before(grammarAccess.getCommandAccess().getOverridesOverridesKeyword_2_0()); }

	'overrides' 

{ after(grammarAccess.getCommandAccess().getOverridesOverridesKeyword_2_0()); }
)

{ after(grammarAccess.getCommandAccess().getOverridesOverridesKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Command__PermissionsAssignment_4_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCommandAccess().getPermissionsPermissionParserRuleCall_4_0_0()); }
	rulePermission{ after(grammarAccess.getCommandAccess().getPermissionsPermissionParserRuleCall_4_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Command__PermissionsAssignment_4_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCommandAccess().getPermissionsPermissionParserRuleCall_4_1_1_0()); }
	rulePermission{ after(grammarAccess.getCommandAccess().getPermissionsPermissionParserRuleCall_4_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Permission__ObjectTypeAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPermissionAccess().getObjectTypeJvmEnumerationLiteralCrossReference_1_0()); }
(
{ before(grammarAccess.getPermissionAccess().getObjectTypeJvmEnumerationLiteralIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getPermissionAccess().getObjectTypeJvmEnumerationLiteralIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getPermissionAccess().getObjectTypeJvmEnumerationLiteralCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Permission__ObjectIdAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPermissionAccess().getObjectIdJvmOperationCrossReference_3_0()); }
(
{ before(grammarAccess.getPermissionAccess().getObjectIdJvmOperationIDTerminalRuleCall_3_0_1()); }
	RULE_ID{ after(grammarAccess.getPermissionAccess().getObjectIdJvmOperationIDTerminalRuleCall_3_0_1()); }
)
{ after(grammarAccess.getPermissionAccess().getObjectIdJvmOperationCrossReference_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Permission__ActionGroupAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPermissionAccess().getActionGroupJvmEnumerationLiteralCrossReference_5_0()); }
(
{ before(grammarAccess.getPermissionAccess().getActionGroupJvmEnumerationLiteralIDTerminalRuleCall_5_0_1()); }
	RULE_ID{ after(grammarAccess.getPermissionAccess().getActionGroupJvmEnumerationLiteralIDTerminalRuleCall_5_0_1()); }
)
{ after(grammarAccess.getPermissionAccess().getActionGroupJvmEnumerationLiteralCrossReference_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Permission__ConditionalAssignment_6_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPermissionAccess().getConditionalIfKeyword_6_0_0()); }
(
{ before(grammarAccess.getPermissionAccess().getConditionalIfKeyword_6_0_0()); }

	'if' 

{ after(grammarAccess.getPermissionAccess().getConditionalIfKeyword_6_0_0()); }
)

{ after(grammarAccess.getPermissionAccess().getConditionalIfKeyword_6_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Permission__ConditionAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPermissionAccess().getConditionJvmOperationCrossReference_6_1_0()); }
(
{ before(grammarAccess.getPermissionAccess().getConditionJvmOperationIDTerminalRuleCall_6_1_0_1()); }
	RULE_ID{ after(grammarAccess.getPermissionAccess().getConditionJvmOperationIDTerminalRuleCall_6_1_0_1()); }
)
{ after(grammarAccess.getPermissionAccess().getConditionJvmOperationCrossReference_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

