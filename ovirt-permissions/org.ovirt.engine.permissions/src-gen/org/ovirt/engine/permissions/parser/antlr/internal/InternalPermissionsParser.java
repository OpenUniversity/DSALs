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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPermissionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'permissions for'", "'overrides'", "':'", "','", "';'", "'object type = '", "'object id = '", "'action group = '", "'if'", "'.'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalPermissionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPermissionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPermissionsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g"; }



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



    // $ANTLR start "entryRuleModel"
    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:76:1: ruleModel returns [EObject current=null] : ( (lv_commands_0_0= ruleCommand ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:79:28: ( ( (lv_commands_0_0= ruleCommand ) )* )
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:80:1: ( (lv_commands_0_0= ruleCommand ) )*
            {
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:80:1: ( (lv_commands_0_0= ruleCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:81:1: (lv_commands_0_0= ruleCommand )
            	    {
            	    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:81:1: (lv_commands_0_0= ruleCommand )
            	    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:82:3: lv_commands_0_0= ruleCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommand_in_ruleModel130);
            	    lv_commands_0_0=ruleCommand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"commands",
            	            		lv_commands_0_0, 
            	            		"Command");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCommand"
    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:106:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:107:2: (iv_ruleCommand= ruleCommand EOF )
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:108:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand166);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:115:1: ruleCommand returns [EObject current=null] : (otherlv_0= 'permissions for' ( ( ruleQualifiedName ) ) ( (lv_overrides_2_0= 'overrides' ) )? otherlv_3= ':' ( ( (lv_permissions_4_0= rulePermission ) ) (otherlv_5= ',' ( (lv_permissions_6_0= rulePermission ) ) )* )? otherlv_7= ';' ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_overrides_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_permissions_4_0 = null;

        EObject lv_permissions_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:118:28: ( (otherlv_0= 'permissions for' ( ( ruleQualifiedName ) ) ( (lv_overrides_2_0= 'overrides' ) )? otherlv_3= ':' ( ( (lv_permissions_4_0= rulePermission ) ) (otherlv_5= ',' ( (lv_permissions_6_0= rulePermission ) ) )* )? otherlv_7= ';' ) )
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:119:1: (otherlv_0= 'permissions for' ( ( ruleQualifiedName ) ) ( (lv_overrides_2_0= 'overrides' ) )? otherlv_3= ':' ( ( (lv_permissions_4_0= rulePermission ) ) (otherlv_5= ',' ( (lv_permissions_6_0= rulePermission ) ) )* )? otherlv_7= ';' )
            {
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:119:1: (otherlv_0= 'permissions for' ( ( ruleQualifiedName ) ) ( (lv_overrides_2_0= 'overrides' ) )? otherlv_3= ':' ( ( (lv_permissions_4_0= rulePermission ) ) (otherlv_5= ',' ( (lv_permissions_6_0= rulePermission ) ) )* )? otherlv_7= ';' )
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:119:3: otherlv_0= 'permissions for' ( ( ruleQualifiedName ) ) ( (lv_overrides_2_0= 'overrides' ) )? otherlv_3= ':' ( ( (lv_permissions_4_0= rulePermission ) ) (otherlv_5= ',' ( (lv_permissions_6_0= rulePermission ) ) )* )? otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleCommand213); 

                	newLeafNode(otherlv_0, grammarAccess.getCommandAccess().getPermissionsForKeyword_0());
                
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:123:1: ( ( ruleQualifiedName ) )
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:124:1: ( ruleQualifiedName )
            {
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:124:1: ( ruleQualifiedName )
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:125:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCommandRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCommandAccess().getTypeJvmDeclaredTypeCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCommand236);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:138:2: ( (lv_overrides_2_0= 'overrides' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:139:1: (lv_overrides_2_0= 'overrides' )
                    {
                    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:139:1: (lv_overrides_2_0= 'overrides' )
                    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:140:3: lv_overrides_2_0= 'overrides'
                    {
                    lv_overrides_2_0=(Token)match(input,12,FOLLOW_12_in_ruleCommand254); 

                            newLeafNode(lv_overrides_2_0, grammarAccess.getCommandAccess().getOverridesOverridesKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCommandRule());
                    	        }
                           		setWithLastConsumed(current, "overrides", true, "overrides");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleCommand280); 

                	newLeafNode(otherlv_3, grammarAccess.getCommandAccess().getColonKeyword_3());
                
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:157:1: ( ( (lv_permissions_4_0= rulePermission ) ) (otherlv_5= ',' ( (lv_permissions_6_0= rulePermission ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:157:2: ( (lv_permissions_4_0= rulePermission ) ) (otherlv_5= ',' ( (lv_permissions_6_0= rulePermission ) ) )*
                    {
                    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:157:2: ( (lv_permissions_4_0= rulePermission ) )
                    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:158:1: (lv_permissions_4_0= rulePermission )
                    {
                    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:158:1: (lv_permissions_4_0= rulePermission )
                    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:159:3: lv_permissions_4_0= rulePermission
                    {
                     
                    	        newCompositeNode(grammarAccess.getCommandAccess().getPermissionsPermissionParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePermission_in_ruleCommand302);
                    lv_permissions_4_0=rulePermission();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCommandRule());
                    	        }
                           		add(
                           			current, 
                           			"permissions",
                            		lv_permissions_4_0, 
                            		"Permission");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:175:2: (otherlv_5= ',' ( (lv_permissions_6_0= rulePermission ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:175:4: otherlv_5= ',' ( (lv_permissions_6_0= rulePermission ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCommand315); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getCommandAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:179:1: ( (lv_permissions_6_0= rulePermission ) )
                    	    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:180:1: (lv_permissions_6_0= rulePermission )
                    	    {
                    	    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:180:1: (lv_permissions_6_0= rulePermission )
                    	    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:181:3: lv_permissions_6_0= rulePermission
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCommandAccess().getPermissionsPermissionParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePermission_in_ruleCommand336);
                    	    lv_permissions_6_0=rulePermission();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCommandRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"permissions",
                    	            		lv_permissions_6_0, 
                    	            		"Permission");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleCommand352); 

                	newLeafNode(otherlv_7, grammarAccess.getCommandAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRulePermission"
    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:209:1: entryRulePermission returns [EObject current=null] : iv_rulePermission= rulePermission EOF ;
    public final EObject entryRulePermission() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermission = null;


        try {
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:210:2: (iv_rulePermission= rulePermission EOF )
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:211:2: iv_rulePermission= rulePermission EOF
            {
             newCompositeNode(grammarAccess.getPermissionRule()); 
            pushFollow(FOLLOW_rulePermission_in_entryRulePermission388);
            iv_rulePermission=rulePermission();

            state._fsp--;

             current =iv_rulePermission; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePermission398); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePermission"


    // $ANTLR start "rulePermission"
    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:218:1: rulePermission returns [EObject current=null] : (otherlv_0= 'object type = ' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'object id = ' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'action group = ' ( (otherlv_5= RULE_ID ) ) ( ( (lv_conditional_6_0= 'if' ) ) ( (otherlv_7= RULE_ID ) ) )? ) ;
    public final EObject rulePermission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_conditional_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:221:28: ( (otherlv_0= 'object type = ' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'object id = ' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'action group = ' ( (otherlv_5= RULE_ID ) ) ( ( (lv_conditional_6_0= 'if' ) ) ( (otherlv_7= RULE_ID ) ) )? ) )
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:222:1: (otherlv_0= 'object type = ' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'object id = ' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'action group = ' ( (otherlv_5= RULE_ID ) ) ( ( (lv_conditional_6_0= 'if' ) ) ( (otherlv_7= RULE_ID ) ) )? )
            {
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:222:1: (otherlv_0= 'object type = ' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'object id = ' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'action group = ' ( (otherlv_5= RULE_ID ) ) ( ( (lv_conditional_6_0= 'if' ) ) ( (otherlv_7= RULE_ID ) ) )? )
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:222:3: otherlv_0= 'object type = ' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'object id = ' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'action group = ' ( (otherlv_5= RULE_ID ) ) ( ( (lv_conditional_6_0= 'if' ) ) ( (otherlv_7= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_rulePermission435); 

                	newLeafNode(otherlv_0, grammarAccess.getPermissionAccess().getObjectTypeKeyword_0());
                
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:226:1: ( (otherlv_1= RULE_ID ) )
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:227:1: (otherlv_1= RULE_ID )
            {
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:227:1: (otherlv_1= RULE_ID )
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:228:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPermissionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePermission455); 

            		newLeafNode(otherlv_1, grammarAccess.getPermissionAccess().getObjectTypeJvmEnumerationLiteralCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_rulePermission467); 

                	newLeafNode(otherlv_2, grammarAccess.getPermissionAccess().getObjectIdKeyword_2());
                
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:243:1: ( (otherlv_3= RULE_ID ) )
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:244:1: (otherlv_3= RULE_ID )
            {
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:244:1: (otherlv_3= RULE_ID )
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:245:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPermissionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePermission487); 

            		newLeafNode(otherlv_3, grammarAccess.getPermissionAccess().getObjectIdJvmOperationCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_rulePermission499); 

                	newLeafNode(otherlv_4, grammarAccess.getPermissionAccess().getActionGroupKeyword_4());
                
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:260:1: ( (otherlv_5= RULE_ID ) )
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:261:1: (otherlv_5= RULE_ID )
            {
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:261:1: (otherlv_5= RULE_ID )
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:262:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPermissionRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePermission519); 

            		newLeafNode(otherlv_5, grammarAccess.getPermissionAccess().getActionGroupJvmEnumerationLiteralCrossReference_5_0()); 
            	

            }


            }

            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:273:2: ( ( (lv_conditional_6_0= 'if' ) ) ( (otherlv_7= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:273:3: ( (lv_conditional_6_0= 'if' ) ) ( (otherlv_7= RULE_ID ) )
                    {
                    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:273:3: ( (lv_conditional_6_0= 'if' ) )
                    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:274:1: (lv_conditional_6_0= 'if' )
                    {
                    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:274:1: (lv_conditional_6_0= 'if' )
                    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:275:3: lv_conditional_6_0= 'if'
                    {
                    lv_conditional_6_0=(Token)match(input,19,FOLLOW_19_in_rulePermission538); 

                            newLeafNode(lv_conditional_6_0, grammarAccess.getPermissionAccess().getConditionalIfKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPermissionRule());
                    	        }
                           		setWithLastConsumed(current, "conditional", true, "if");
                    	    

                    }


                    }

                    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:288:2: ( (otherlv_7= RULE_ID ) )
                    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:289:1: (otherlv_7= RULE_ID )
                    {
                    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:289:1: (otherlv_7= RULE_ID )
                    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:290:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPermissionRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePermission571); 

                    		newLeafNode(otherlv_7, grammarAccess.getPermissionAccess().getConditionJvmOperationCrossReference_6_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePermission"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:309:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:310:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:311:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName610);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName621); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:318:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:321:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:322:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:322:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:322:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName661); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:329:1: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.ovirt.engine.permissions/src-gen/org/ovirt/engine/permissions/parser/antlr/internal/InternalPermissions.g:330:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_ruleQualifiedName680); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName695); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleCommand213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCommand236 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleCommand254 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCommand280 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rulePermission_in_ruleCommand302 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleCommand315 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rulePermission_in_ruleCommand336 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleCommand352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_entryRulePermission388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePermission398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePermission435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePermission455 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePermission467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePermission487 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePermission499 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePermission519 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_rulePermission538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePermission571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName661 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleQualifiedName680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName695 = new BitSet(new long[]{0x0000000000100002L});

}