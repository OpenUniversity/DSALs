/*
 * generated by Xtext
 */
grammar InternalPermissions;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.ovirt.engine.permissions.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.ovirt.engine.permissions.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.ovirt.engine.permissions.services.PermissionsGrammarAccess;

}

@parser::members {

 	private PermissionsGrammarAccess grammarAccess;
 	
    public InternalPermissionsParser(TokenStream input, PermissionsGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected PermissionsGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0()); 
	    }
		lv_commands_0_0=ruleCommand		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"commands",
        		lv_commands_0_0, 
        		"Command");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleCommand
entryRuleCommand returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCommandRule()); }
	 iv_ruleCommand=ruleCommand 
	 { $current=$iv_ruleCommand.current; } 
	 EOF 
;

// Rule Command
ruleCommand returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='permissions for' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getCommandAccess().getPermissionsForKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getCommandRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getCommandAccess().getTypeJvmDeclaredTypeCrossReference_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_overrides_2_0=	'overrides' 
    {
        newLeafNode(lv_overrides_2_0, grammarAccess.getCommandAccess().getOverridesOverridesKeyword_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCommandRule());
	        }
       		setWithLastConsumed($current, "overrides", true, "overrides");
	    }

)
)?	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getCommandAccess().getColonKeyword_3());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getCommandAccess().getPermissionsPermissionParserRuleCall_4_0_0()); 
	    }
		lv_permissions_4_0=rulePermission		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandRule());
	        }
       		add(
       			$current, 
       			"permissions",
        		lv_permissions_4_0, 
        		"Permission");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getCommandAccess().getCommaKeyword_4_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCommandAccess().getPermissionsPermissionParserRuleCall_4_1_1_0()); 
	    }
		lv_permissions_6_0=rulePermission		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandRule());
	        }
       		add(
       			$current, 
       			"permissions",
        		lv_permissions_6_0, 
        		"Permission");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getCommandAccess().getSemicolonKeyword_5());
    }
)
;





// Entry rule entryRulePermission
entryRulePermission returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPermissionRule()); }
	 iv_rulePermission=rulePermission 
	 { $current=$iv_rulePermission.current; } 
	 EOF 
;

// Rule Permission
rulePermission returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='object type = ' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPermissionAccess().getObjectTypeKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPermissionRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getPermissionAccess().getObjectTypeJvmEnumerationLiteralCrossReference_1_0()); 
	}

)
)	otherlv_2='object id = ' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPermissionAccess().getObjectIdKeyword_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPermissionRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getPermissionAccess().getObjectIdJvmOperationCrossReference_3_0()); 
	}

)
)	otherlv_4='action group = ' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPermissionAccess().getActionGroupKeyword_4());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPermissionRule());
	        }
        }
	otherlv_5=RULE_ID
	{
		newLeafNode(otherlv_5, grammarAccess.getPermissionAccess().getActionGroupJvmEnumerationLiteralCrossReference_5_0()); 
	}

)
)((
(
		lv_conditional_6_0=	'if' 
    {
        newLeafNode(lv_conditional_6_0, grammarAccess.getPermissionAccess().getConditionalIfKeyword_6_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPermissionRule());
	        }
       		setWithLastConsumed($current, "conditional", true, "if");
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPermissionRule());
	        }
        }
	otherlv_7=RULE_ID
	{
		newLeafNode(otherlv_7, grammarAccess.getPermissionAccess().getConditionJvmOperationCrossReference_6_1_0()); 
	}

)
))?)
;





// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); } 
	 iv_ruleQualifiedName=ruleQualifiedName 
	 { $current=$iv_ruleQualifiedName.current.getText(); }  
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


