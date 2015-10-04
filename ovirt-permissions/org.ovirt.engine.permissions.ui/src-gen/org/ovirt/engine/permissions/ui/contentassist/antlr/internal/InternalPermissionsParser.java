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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPermissionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'permissions for'", "':'", "';'", "','", "'object type = '", "'object id = '", "'action group = '", "'.'", "'overrides'", "'if'"
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
    public String getGrammarFileName() { return "../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g"; }


     
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




    // $ANTLR start "entryRuleModel"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:61:1: ( ruleModel EOF )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:69:1: ruleModel : ( ( rule__Model__CommandsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:73:2: ( ( ( rule__Model__CommandsAssignment )* ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:74:1: ( ( rule__Model__CommandsAssignment )* )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:74:1: ( ( rule__Model__CommandsAssignment )* )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:75:1: ( rule__Model__CommandsAssignment )*
            {
             before(grammarAccess.getModelAccess().getCommandsAssignment()); 
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:76:1: ( rule__Model__CommandsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:76:2: rule__Model__CommandsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__CommandsAssignment_in_ruleModel94);
            	    rule__Model__CommandsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getCommandsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCommand"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:88:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:89:1: ( ruleCommand EOF )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:90:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand122);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:97:1: ruleCommand : ( ( rule__Command__Group__0 ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:101:2: ( ( ( rule__Command__Group__0 ) ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:102:1: ( ( rule__Command__Group__0 ) )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:102:1: ( ( rule__Command__Group__0 ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:103:1: ( rule__Command__Group__0 )
            {
             before(grammarAccess.getCommandAccess().getGroup()); 
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:104:1: ( rule__Command__Group__0 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:104:2: rule__Command__Group__0
            {
            pushFollow(FOLLOW_rule__Command__Group__0_in_ruleCommand155);
            rule__Command__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRulePermission"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:116:1: entryRulePermission : rulePermission EOF ;
    public final void entryRulePermission() throws RecognitionException {
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:117:1: ( rulePermission EOF )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:118:1: rulePermission EOF
            {
             before(grammarAccess.getPermissionRule()); 
            pushFollow(FOLLOW_rulePermission_in_entryRulePermission182);
            rulePermission();

            state._fsp--;

             after(grammarAccess.getPermissionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePermission189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePermission"


    // $ANTLR start "rulePermission"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:125:1: rulePermission : ( ( rule__Permission__Group__0 ) ) ;
    public final void rulePermission() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:129:2: ( ( ( rule__Permission__Group__0 ) ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:130:1: ( ( rule__Permission__Group__0 ) )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:130:1: ( ( rule__Permission__Group__0 ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:131:1: ( rule__Permission__Group__0 )
            {
             before(grammarAccess.getPermissionAccess().getGroup()); 
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:132:1: ( rule__Permission__Group__0 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:132:2: rule__Permission__Group__0
            {
            pushFollow(FOLLOW_rule__Permission__Group__0_in_rulePermission215);
            rule__Permission__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPermissionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermission"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:144:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:145:1: ( ruleQualifiedName EOF )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:146:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName242);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:153:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:157:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:158:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:158:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:159:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:160:1: ( rule__QualifiedName__Group__0 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:160:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName275);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__Command__Group__0"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:174:1: rule__Command__Group__0 : rule__Command__Group__0__Impl rule__Command__Group__1 ;
    public final void rule__Command__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:178:1: ( rule__Command__Group__0__Impl rule__Command__Group__1 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:179:2: rule__Command__Group__0__Impl rule__Command__Group__1
            {
            pushFollow(FOLLOW_rule__Command__Group__0__Impl_in_rule__Command__Group__0309);
            rule__Command__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group__1_in_rule__Command__Group__0312);
            rule__Command__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__0"


    // $ANTLR start "rule__Command__Group__0__Impl"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:186:1: rule__Command__Group__0__Impl : ( 'permissions for' ) ;
    public final void rule__Command__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:190:1: ( ( 'permissions for' ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:191:1: ( 'permissions for' )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:191:1: ( 'permissions for' )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:192:1: 'permissions for'
            {
             before(grammarAccess.getCommandAccess().getPermissionsForKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Command__Group__0__Impl340); 
             after(grammarAccess.getCommandAccess().getPermissionsForKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__0__Impl"


    // $ANTLR start "rule__Command__Group__1"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:205:1: rule__Command__Group__1 : rule__Command__Group__1__Impl rule__Command__Group__2 ;
    public final void rule__Command__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:209:1: ( rule__Command__Group__1__Impl rule__Command__Group__2 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:210:2: rule__Command__Group__1__Impl rule__Command__Group__2
            {
            pushFollow(FOLLOW_rule__Command__Group__1__Impl_in_rule__Command__Group__1371);
            rule__Command__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group__2_in_rule__Command__Group__1374);
            rule__Command__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__1"


    // $ANTLR start "rule__Command__Group__1__Impl"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:217:1: rule__Command__Group__1__Impl : ( ( rule__Command__TypeAssignment_1 ) ) ;
    public final void rule__Command__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:221:1: ( ( ( rule__Command__TypeAssignment_1 ) ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:222:1: ( ( rule__Command__TypeAssignment_1 ) )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:222:1: ( ( rule__Command__TypeAssignment_1 ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:223:1: ( rule__Command__TypeAssignment_1 )
            {
             before(grammarAccess.getCommandAccess().getTypeAssignment_1()); 
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:224:1: ( rule__Command__TypeAssignment_1 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:224:2: rule__Command__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Command__TypeAssignment_1_in_rule__Command__Group__1__Impl401);
            rule__Command__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__1__Impl"


    // $ANTLR start "rule__Command__Group__2"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:234:1: rule__Command__Group__2 : rule__Command__Group__2__Impl rule__Command__Group__3 ;
    public final void rule__Command__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:238:1: ( rule__Command__Group__2__Impl rule__Command__Group__3 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:239:2: rule__Command__Group__2__Impl rule__Command__Group__3
            {
            pushFollow(FOLLOW_rule__Command__Group__2__Impl_in_rule__Command__Group__2431);
            rule__Command__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group__3_in_rule__Command__Group__2434);
            rule__Command__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__2"


    // $ANTLR start "rule__Command__Group__2__Impl"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:246:1: rule__Command__Group__2__Impl : ( ( rule__Command__OverridesAssignment_2 )? ) ;
    public final void rule__Command__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:250:1: ( ( ( rule__Command__OverridesAssignment_2 )? ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:251:1: ( ( rule__Command__OverridesAssignment_2 )? )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:251:1: ( ( rule__Command__OverridesAssignment_2 )? )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:252:1: ( rule__Command__OverridesAssignment_2 )?
            {
             before(grammarAccess.getCommandAccess().getOverridesAssignment_2()); 
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:253:1: ( rule__Command__OverridesAssignment_2 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:253:2: rule__Command__OverridesAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Command__OverridesAssignment_2_in_rule__Command__Group__2__Impl461);
                    rule__Command__OverridesAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandAccess().getOverridesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__2__Impl"


    // $ANTLR start "rule__Command__Group__3"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:263:1: rule__Command__Group__3 : rule__Command__Group__3__Impl rule__Command__Group__4 ;
    public final void rule__Command__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:267:1: ( rule__Command__Group__3__Impl rule__Command__Group__4 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:268:2: rule__Command__Group__3__Impl rule__Command__Group__4
            {
            pushFollow(FOLLOW_rule__Command__Group__3__Impl_in_rule__Command__Group__3492);
            rule__Command__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group__4_in_rule__Command__Group__3495);
            rule__Command__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__3"


    // $ANTLR start "rule__Command__Group__3__Impl"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:275:1: rule__Command__Group__3__Impl : ( ':' ) ;
    public final void rule__Command__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:279:1: ( ( ':' ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:280:1: ( ':' )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:280:1: ( ':' )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:281:1: ':'
            {
             before(grammarAccess.getCommandAccess().getColonKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Command__Group__3__Impl523); 
             after(grammarAccess.getCommandAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__3__Impl"


    // $ANTLR start "rule__Command__Group__4"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:294:1: rule__Command__Group__4 : rule__Command__Group__4__Impl rule__Command__Group__5 ;
    public final void rule__Command__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:298:1: ( rule__Command__Group__4__Impl rule__Command__Group__5 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:299:2: rule__Command__Group__4__Impl rule__Command__Group__5
            {
            pushFollow(FOLLOW_rule__Command__Group__4__Impl_in_rule__Command__Group__4554);
            rule__Command__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group__5_in_rule__Command__Group__4557);
            rule__Command__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__4"


    // $ANTLR start "rule__Command__Group__4__Impl"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:306:1: rule__Command__Group__4__Impl : ( ( rule__Command__Group_4__0 )? ) ;
    public final void rule__Command__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:310:1: ( ( ( rule__Command__Group_4__0 )? ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:311:1: ( ( rule__Command__Group_4__0 )? )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:311:1: ( ( rule__Command__Group_4__0 )? )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:312:1: ( rule__Command__Group_4__0 )?
            {
             before(grammarAccess.getCommandAccess().getGroup_4()); 
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:313:1: ( rule__Command__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:313:2: rule__Command__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_4__0_in_rule__Command__Group__4__Impl584);
                    rule__Command__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__4__Impl"


    // $ANTLR start "rule__Command__Group__5"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:323:1: rule__Command__Group__5 : rule__Command__Group__5__Impl ;
    public final void rule__Command__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:327:1: ( rule__Command__Group__5__Impl )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:328:2: rule__Command__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group__5__Impl_in_rule__Command__Group__5615);
            rule__Command__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__5"


    // $ANTLR start "rule__Command__Group__5__Impl"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:334:1: rule__Command__Group__5__Impl : ( ';' ) ;
    public final void rule__Command__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:338:1: ( ( ';' ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:339:1: ( ';' )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:339:1: ( ';' )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:340:1: ';'
            {
             before(grammarAccess.getCommandAccess().getSemicolonKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__Command__Group__5__Impl643); 
             after(grammarAccess.getCommandAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__5__Impl"


    // $ANTLR start "rule__Command__Group_4__0"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:365:1: rule__Command__Group_4__0 : rule__Command__Group_4__0__Impl rule__Command__Group_4__1 ;
    public final void rule__Command__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:369:1: ( rule__Command__Group_4__0__Impl rule__Command__Group_4__1 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:370:2: rule__Command__Group_4__0__Impl rule__Command__Group_4__1
            {
            pushFollow(FOLLOW_rule__Command__Group_4__0__Impl_in_rule__Command__Group_4__0686);
            rule__Command__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group_4__1_in_rule__Command__Group_4__0689);
            rule__Command__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__0"


    // $ANTLR start "rule__Command__Group_4__0__Impl"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:377:1: rule__Command__Group_4__0__Impl : ( ( rule__Command__PermissionsAssignment_4_0 ) ) ;
    public final void rule__Command__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:381:1: ( ( ( rule__Command__PermissionsAssignment_4_0 ) ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:382:1: ( ( rule__Command__PermissionsAssignment_4_0 ) )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:382:1: ( ( rule__Command__PermissionsAssignment_4_0 ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:383:1: ( rule__Command__PermissionsAssignment_4_0 )
            {
             before(grammarAccess.getCommandAccess().getPermissionsAssignment_4_0()); 
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:384:1: ( rule__Command__PermissionsAssignment_4_0 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:384:2: rule__Command__PermissionsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Command__PermissionsAssignment_4_0_in_rule__Command__Group_4__0__Impl716);
            rule__Command__PermissionsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getPermissionsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__0__Impl"


    // $ANTLR start "rule__Command__Group_4__1"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:394:1: rule__Command__Group_4__1 : rule__Command__Group_4__1__Impl ;
    public final void rule__Command__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:398:1: ( rule__Command__Group_4__1__Impl )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:399:2: rule__Command__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_4__1__Impl_in_rule__Command__Group_4__1746);
            rule__Command__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__1"


    // $ANTLR start "rule__Command__Group_4__1__Impl"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:405:1: rule__Command__Group_4__1__Impl : ( ( rule__Command__Group_4_1__0 )* ) ;
    public final void rule__Command__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:409:1: ( ( ( rule__Command__Group_4_1__0 )* ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:410:1: ( ( rule__Command__Group_4_1__0 )* )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:410:1: ( ( rule__Command__Group_4_1__0 )* )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:411:1: ( rule__Command__Group_4_1__0 )*
            {
             before(grammarAccess.getCommandAccess().getGroup_4_1()); 
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:412:1: ( rule__Command__Group_4_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:412:2: rule__Command__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Command__Group_4_1__0_in_rule__Command__Group_4__1__Impl773);
            	    rule__Command__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCommandAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__1__Impl"


    // $ANTLR start "rule__Command__Group_4_1__0"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:426:1: rule__Command__Group_4_1__0 : rule__Command__Group_4_1__0__Impl rule__Command__Group_4_1__1 ;
    public final void rule__Command__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:430:1: ( rule__Command__Group_4_1__0__Impl rule__Command__Group_4_1__1 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:431:2: rule__Command__Group_4_1__0__Impl rule__Command__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Command__Group_4_1__0__Impl_in_rule__Command__Group_4_1__0808);
            rule__Command__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group_4_1__1_in_rule__Command__Group_4_1__0811);
            rule__Command__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4_1__0"


    // $ANTLR start "rule__Command__Group_4_1__0__Impl"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:438:1: rule__Command__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Command__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:442:1: ( ( ',' ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:443:1: ( ',' )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:443:1: ( ',' )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:444:1: ','
            {
             before(grammarAccess.getCommandAccess().getCommaKeyword_4_1_0()); 
            match(input,14,FOLLOW_14_in_rule__Command__Group_4_1__0__Impl839); 
             after(grammarAccess.getCommandAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4_1__0__Impl"


    // $ANTLR start "rule__Command__Group_4_1__1"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:457:1: rule__Command__Group_4_1__1 : rule__Command__Group_4_1__1__Impl ;
    public final void rule__Command__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:461:1: ( rule__Command__Group_4_1__1__Impl )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:462:2: rule__Command__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_4_1__1__Impl_in_rule__Command__Group_4_1__1870);
            rule__Command__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4_1__1"


    // $ANTLR start "rule__Command__Group_4_1__1__Impl"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:468:1: rule__Command__Group_4_1__1__Impl : ( ( rule__Command__PermissionsAssignment_4_1_1 ) ) ;
    public final void rule__Command__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:472:1: ( ( ( rule__Command__PermissionsAssignment_4_1_1 ) ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:473:1: ( ( rule__Command__PermissionsAssignment_4_1_1 ) )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:473:1: ( ( rule__Command__PermissionsAssignment_4_1_1 ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:474:1: ( rule__Command__PermissionsAssignment_4_1_1 )
            {
             before(grammarAccess.getCommandAccess().getPermissionsAssignment_4_1_1()); 
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:475:1: ( rule__Command__PermissionsAssignment_4_1_1 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:475:2: rule__Command__PermissionsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__Command__PermissionsAssignment_4_1_1_in_rule__Command__Group_4_1__1__Impl897);
            rule__Command__PermissionsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getPermissionsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4_1__1__Impl"


    // $ANTLR start "rule__Permission__Group__0"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:489:1: rule__Permission__Group__0 : rule__Permission__Group__0__Impl rule__Permission__Group__1 ;
    public final void rule__Permission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:493:1: ( rule__Permission__Group__0__Impl rule__Permission__Group__1 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:494:2: rule__Permission__Group__0__Impl rule__Permission__Group__1
            {
            pushFollow(FOLLOW_rule__Permission__Group__0__Impl_in_rule__Permission__Group__0931);
            rule__Permission__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Permission__Group__1_in_rule__Permission__Group__0934);
            rule__Permission__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permission__Group__0"


    // $ANTLR start "rule__Permission__Group__0__Impl"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:501:1: rule__Permission__Group__0__Impl : ( 'object type = ' ) ;
    public final void rule__Permission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:505:1: ( ( 'object type = ' ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:506:1: ( 'object type = ' )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:506:1: ( 'object type = ' )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:507:1: 'object type = '
            {
             before(grammarAccess.getPermissionAccess().getObjectTypeKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Permission__Group__0__Impl962); 
             after(grammarAccess.getPermissionAccess().getObjectTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permission__Group__0__Impl"


    // $ANTLR start "rule__Permission__Group__1"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:520:1: rule__Permission__Group__1 : rule__Permission__Group__1__Impl rule__Permission__Group__2 ;
    public final void rule__Permission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:524:1: ( rule__Permission__Group__1__Impl rule__Permission__Group__2 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:525:2: rule__Permission__Group__1__Impl rule__Permission__Group__2
            {
            pushFollow(FOLLOW_rule__Permission__Group__1__Impl_in_rule__Permission__Group__1993);
            rule__Permission__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Permission__Group__2_in_rule__Permission__Group__1996);
            rule__Permission__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permission__Group__1"


    // $ANTLR start "rule__Permission__Group__1__Impl"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:532:1: rule__Permission__Group__1__Impl : ( ( rule__Permission__ObjectTypeAssignment_1 ) ) ;
    public final void rule__Permission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:536:1: ( ( ( rule__Permission__ObjectTypeAssignment_1 ) ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:537:1: ( ( rule__Permission__ObjectTypeAssignment_1 ) )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:537:1: ( ( rule__Permission__ObjectTypeAssignment_1 ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:538:1: ( rule__Permission__ObjectTypeAssignment_1 )
            {
             before(grammarAccess.getPermissionAccess().getObjectTypeAssignment_1()); 
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:539:1: ( rule__Permission__ObjectTypeAssignment_1 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:539:2: rule__Permission__ObjectTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Permission__ObjectTypeAssignment_1_in_rule__Permission__Group__1__Impl1023);
            rule__Permission__ObjectTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPermissionAccess().getObjectTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permission__Group__1__Impl"


    // $ANTLR start "rule__Permission__Group__2"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:549:1: rule__Permission__Group__2 : rule__Permission__Group__2__Impl rule__Permission__Group__3 ;
    public final void rule__Permission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:553:1: ( rule__Permission__Group__2__Impl rule__Permission__Group__3 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:554:2: rule__Permission__Group__2__Impl rule__Permission__Group__3
            {
            pushFollow(FOLLOW_rule__Permission__Group__2__Impl_in_rule__Permission__Group__21053);
            rule__Permission__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Permission__Group__3_in_rule__Permission__Group__21056);
            rule__Permission__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permission__Group__2"


    // $ANTLR start "rule__Permission__Group__2__Impl"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:561:1: rule__Permission__Group__2__Impl : ( 'object id = ' ) ;
    public final void rule__Permission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:565:1: ( ( 'object id = ' ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:566:1: ( 'object id = ' )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:566:1: ( 'object id = ' )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:567:1: 'object id = '
            {
             before(grammarAccess.getPermissionAccess().getObjectIdKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Permission__Group__2__Impl1084); 
             after(grammarAccess.getPermissionAccess().getObjectIdKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permission__Group__2__Impl"


    // $ANTLR start "rule__Permission__Group__3"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:580:1: rule__Permission__Group__3 : rule__Permission__Group__3__Impl rule__Permission__Group__4 ;
    public final void rule__Permission__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:584:1: ( rule__Permission__Group__3__Impl rule__Permission__Group__4 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:585:2: rule__Permission__Group__3__Impl rule__Permission__Group__4
            {
            pushFollow(FOLLOW_rule__Permission__Group__3__Impl_in_rule__Permission__Group__31115);
            rule__Permission__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Permission__Group__4_in_rule__Permission__Group__31118);
            rule__Permission__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permission__Group__3"


    // $ANTLR start "rule__Permission__Group__3__Impl"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:592:1: rule__Permission__Group__3__Impl : ( ( rule__Permission__ObjectIdAssignment_3 ) ) ;
    public final void rule__Permission__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:596:1: ( ( ( rule__Permission__ObjectIdAssignment_3 ) ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:597:1: ( ( rule__Permission__ObjectIdAssignment_3 ) )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:597:1: ( ( rule__Permission__ObjectIdAssignment_3 ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:598:1: ( rule__Permission__ObjectIdAssignment_3 )
            {
             before(grammarAccess.getPermissionAccess().getObjectIdAssignment_3()); 
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:599:1: ( rule__Permission__ObjectIdAssignment_3 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:599:2: rule__Permission__ObjectIdAssignment_3
            {
            pushFollow(FOLLOW_rule__Permission__ObjectIdAssignment_3_in_rule__Permission__Group__3__Impl1145);
            rule__Permission__ObjectIdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPermissionAccess().getObjectIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permission__Group__3__Impl"


    // $ANTLR start "rule__Permission__Group__4"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:609:1: rule__Permission__Group__4 : rule__Permission__Group__4__Impl rule__Permission__Group__5 ;
    public final void rule__Permission__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:613:1: ( rule__Permission__Group__4__Impl rule__Permission__Group__5 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:614:2: rule__Permission__Group__4__Impl rule__Permission__Group__5
            {
            pushFollow(FOLLOW_rule__Permission__Group__4__Impl_in_rule__Permission__Group__41175);
            rule__Permission__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Permission__Group__5_in_rule__Permission__Group__41178);
            rule__Permission__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permission__Group__4"


    // $ANTLR start "rule__Permission__Group__4__Impl"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:621:1: rule__Permission__Group__4__Impl : ( 'action group = ' ) ;
    public final void rule__Permission__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:625:1: ( ( 'action group = ' ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:626:1: ( 'action group = ' )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:626:1: ( 'action group = ' )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:627:1: 'action group = '
            {
             before(grammarAccess.getPermissionAccess().getActionGroupKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Permission__Group__4__Impl1206); 
             after(grammarAccess.getPermissionAccess().getActionGroupKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permission__Group__4__Impl"


    // $ANTLR start "rule__Permission__Group__5"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:640:1: rule__Permission__Group__5 : rule__Permission__Group__5__Impl rule__Permission__Group__6 ;
    public final void rule__Permission__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:644:1: ( rule__Permission__Group__5__Impl rule__Permission__Group__6 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:645:2: rule__Permission__Group__5__Impl rule__Permission__Group__6
            {
            pushFollow(FOLLOW_rule__Permission__Group__5__Impl_in_rule__Permission__Group__51237);
            rule__Permission__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Permission__Group__6_in_rule__Permission__Group__51240);
            rule__Permission__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permission__Group__5"


    // $ANTLR start "rule__Permission__Group__5__Impl"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:652:1: rule__Permission__Group__5__Impl : ( ( rule__Permission__ActionGroupAssignment_5 ) ) ;
    public final void rule__Permission__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:656:1: ( ( ( rule__Permission__ActionGroupAssignment_5 ) ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:657:1: ( ( rule__Permission__ActionGroupAssignment_5 ) )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:657:1: ( ( rule__Permission__ActionGroupAssignment_5 ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:658:1: ( rule__Permission__ActionGroupAssignment_5 )
            {
             before(grammarAccess.getPermissionAccess().getActionGroupAssignment_5()); 
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:659:1: ( rule__Permission__ActionGroupAssignment_5 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:659:2: rule__Permission__ActionGroupAssignment_5
            {
            pushFollow(FOLLOW_rule__Permission__ActionGroupAssignment_5_in_rule__Permission__Group__5__Impl1267);
            rule__Permission__ActionGroupAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPermissionAccess().getActionGroupAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permission__Group__5__Impl"


    // $ANTLR start "rule__Permission__Group__6"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:669:1: rule__Permission__Group__6 : rule__Permission__Group__6__Impl ;
    public final void rule__Permission__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:673:1: ( rule__Permission__Group__6__Impl )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:674:2: rule__Permission__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Permission__Group__6__Impl_in_rule__Permission__Group__61297);
            rule__Permission__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permission__Group__6"


    // $ANTLR start "rule__Permission__Group__6__Impl"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:680:1: rule__Permission__Group__6__Impl : ( ( rule__Permission__Group_6__0 )? ) ;
    public final void rule__Permission__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:684:1: ( ( ( rule__Permission__Group_6__0 )? ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:685:1: ( ( rule__Permission__Group_6__0 )? )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:685:1: ( ( rule__Permission__Group_6__0 )? )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:686:1: ( rule__Permission__Group_6__0 )?
            {
             before(grammarAccess.getPermissionAccess().getGroup_6()); 
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:687:1: ( rule__Permission__Group_6__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:687:2: rule__Permission__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Permission__Group_6__0_in_rule__Permission__Group__6__Impl1324);
                    rule__Permission__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPermissionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permission__Group__6__Impl"


    // $ANTLR start "rule__Permission__Group_6__0"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:711:1: rule__Permission__Group_6__0 : rule__Permission__Group_6__0__Impl rule__Permission__Group_6__1 ;
    public final void rule__Permission__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:715:1: ( rule__Permission__Group_6__0__Impl rule__Permission__Group_6__1 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:716:2: rule__Permission__Group_6__0__Impl rule__Permission__Group_6__1
            {
            pushFollow(FOLLOW_rule__Permission__Group_6__0__Impl_in_rule__Permission__Group_6__01369);
            rule__Permission__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Permission__Group_6__1_in_rule__Permission__Group_6__01372);
            rule__Permission__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permission__Group_6__0"


    // $ANTLR start "rule__Permission__Group_6__0__Impl"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:723:1: rule__Permission__Group_6__0__Impl : ( ( rule__Permission__ConditionalAssignment_6_0 ) ) ;
    public final void rule__Permission__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:727:1: ( ( ( rule__Permission__ConditionalAssignment_6_0 ) ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:728:1: ( ( rule__Permission__ConditionalAssignment_6_0 ) )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:728:1: ( ( rule__Permission__ConditionalAssignment_6_0 ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:729:1: ( rule__Permission__ConditionalAssignment_6_0 )
            {
             before(grammarAccess.getPermissionAccess().getConditionalAssignment_6_0()); 
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:730:1: ( rule__Permission__ConditionalAssignment_6_0 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:730:2: rule__Permission__ConditionalAssignment_6_0
            {
            pushFollow(FOLLOW_rule__Permission__ConditionalAssignment_6_0_in_rule__Permission__Group_6__0__Impl1399);
            rule__Permission__ConditionalAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getPermissionAccess().getConditionalAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permission__Group_6__0__Impl"


    // $ANTLR start "rule__Permission__Group_6__1"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:740:1: rule__Permission__Group_6__1 : rule__Permission__Group_6__1__Impl ;
    public final void rule__Permission__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:744:1: ( rule__Permission__Group_6__1__Impl )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:745:2: rule__Permission__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Permission__Group_6__1__Impl_in_rule__Permission__Group_6__11429);
            rule__Permission__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permission__Group_6__1"


    // $ANTLR start "rule__Permission__Group_6__1__Impl"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:751:1: rule__Permission__Group_6__1__Impl : ( ( rule__Permission__ConditionAssignment_6_1 ) ) ;
    public final void rule__Permission__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:755:1: ( ( ( rule__Permission__ConditionAssignment_6_1 ) ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:756:1: ( ( rule__Permission__ConditionAssignment_6_1 ) )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:756:1: ( ( rule__Permission__ConditionAssignment_6_1 ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:757:1: ( rule__Permission__ConditionAssignment_6_1 )
            {
             before(grammarAccess.getPermissionAccess().getConditionAssignment_6_1()); 
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:758:1: ( rule__Permission__ConditionAssignment_6_1 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:758:2: rule__Permission__ConditionAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Permission__ConditionAssignment_6_1_in_rule__Permission__Group_6__1__Impl1456);
            rule__Permission__ConditionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPermissionAccess().getConditionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permission__Group_6__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:772:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:776:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:777:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01490);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01493);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:784:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:788:1: ( ( RULE_ID ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:789:1: ( RULE_ID )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:789:1: ( RULE_ID )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:790:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1520); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:801:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:805:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:806:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11549);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:812:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:816:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:817:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:817:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:818:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:819:1: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:819:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1576);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:833:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:837:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:838:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01611);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01614);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:845:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:849:1: ( ( '.' ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:850:1: ( '.' )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:850:1: ( '.' )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:851:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,18,FOLLOW_18_in_rule__QualifiedName__Group_1__0__Impl1642); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:864:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:868:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:869:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11673);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:875:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:879:1: ( ( RULE_ID ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:880:1: ( RULE_ID )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:880:1: ( RULE_ID )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:881:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1700); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__CommandsAssignment"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:897:1: rule__Model__CommandsAssignment : ( ruleCommand ) ;
    public final void rule__Model__CommandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:901:1: ( ( ruleCommand ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:902:1: ( ruleCommand )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:902:1: ( ruleCommand )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:903:1: ruleCommand
            {
             before(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleCommand_in_rule__Model__CommandsAssignment1738);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__CommandsAssignment"


    // $ANTLR start "rule__Command__TypeAssignment_1"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:912:1: rule__Command__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Command__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:916:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:917:1: ( ( ruleQualifiedName ) )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:917:1: ( ( ruleQualifiedName ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:918:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getCommandAccess().getTypeJvmDeclaredTypeCrossReference_1_0()); 
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:919:1: ( ruleQualifiedName )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:920:1: ruleQualifiedName
            {
             before(grammarAccess.getCommandAccess().getTypeJvmDeclaredTypeQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Command__TypeAssignment_11773);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCommandAccess().getTypeJvmDeclaredTypeQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCommandAccess().getTypeJvmDeclaredTypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__TypeAssignment_1"


    // $ANTLR start "rule__Command__OverridesAssignment_2"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:931:1: rule__Command__OverridesAssignment_2 : ( ( 'overrides' ) ) ;
    public final void rule__Command__OverridesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:935:1: ( ( ( 'overrides' ) ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:936:1: ( ( 'overrides' ) )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:936:1: ( ( 'overrides' ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:937:1: ( 'overrides' )
            {
             before(grammarAccess.getCommandAccess().getOverridesOverridesKeyword_2_0()); 
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:938:1: ( 'overrides' )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:939:1: 'overrides'
            {
             before(grammarAccess.getCommandAccess().getOverridesOverridesKeyword_2_0()); 
            match(input,19,FOLLOW_19_in_rule__Command__OverridesAssignment_21813); 
             after(grammarAccess.getCommandAccess().getOverridesOverridesKeyword_2_0()); 

            }

             after(grammarAccess.getCommandAccess().getOverridesOverridesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__OverridesAssignment_2"


    // $ANTLR start "rule__Command__PermissionsAssignment_4_0"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:954:1: rule__Command__PermissionsAssignment_4_0 : ( rulePermission ) ;
    public final void rule__Command__PermissionsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:958:1: ( ( rulePermission ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:959:1: ( rulePermission )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:959:1: ( rulePermission )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:960:1: rulePermission
            {
             before(grammarAccess.getCommandAccess().getPermissionsPermissionParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_rulePermission_in_rule__Command__PermissionsAssignment_4_01852);
            rulePermission();

            state._fsp--;

             after(grammarAccess.getCommandAccess().getPermissionsPermissionParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__PermissionsAssignment_4_0"


    // $ANTLR start "rule__Command__PermissionsAssignment_4_1_1"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:969:1: rule__Command__PermissionsAssignment_4_1_1 : ( rulePermission ) ;
    public final void rule__Command__PermissionsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:973:1: ( ( rulePermission ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:974:1: ( rulePermission )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:974:1: ( rulePermission )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:975:1: rulePermission
            {
             before(grammarAccess.getCommandAccess().getPermissionsPermissionParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_rulePermission_in_rule__Command__PermissionsAssignment_4_1_11883);
            rulePermission();

            state._fsp--;

             after(grammarAccess.getCommandAccess().getPermissionsPermissionParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__PermissionsAssignment_4_1_1"


    // $ANTLR start "rule__Permission__ObjectTypeAssignment_1"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:984:1: rule__Permission__ObjectTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Permission__ObjectTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:988:1: ( ( ( RULE_ID ) ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:989:1: ( ( RULE_ID ) )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:989:1: ( ( RULE_ID ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:990:1: ( RULE_ID )
            {
             before(grammarAccess.getPermissionAccess().getObjectTypeJvmEnumerationLiteralCrossReference_1_0()); 
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:991:1: ( RULE_ID )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:992:1: RULE_ID
            {
             before(grammarAccess.getPermissionAccess().getObjectTypeJvmEnumerationLiteralIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Permission__ObjectTypeAssignment_11918); 
             after(grammarAccess.getPermissionAccess().getObjectTypeJvmEnumerationLiteralIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPermissionAccess().getObjectTypeJvmEnumerationLiteralCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permission__ObjectTypeAssignment_1"


    // $ANTLR start "rule__Permission__ObjectIdAssignment_3"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1003:1: rule__Permission__ObjectIdAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Permission__ObjectIdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1007:1: ( ( ( RULE_ID ) ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1008:1: ( ( RULE_ID ) )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1008:1: ( ( RULE_ID ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1009:1: ( RULE_ID )
            {
             before(grammarAccess.getPermissionAccess().getObjectIdJvmOperationCrossReference_3_0()); 
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1010:1: ( RULE_ID )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1011:1: RULE_ID
            {
             before(grammarAccess.getPermissionAccess().getObjectIdJvmOperationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Permission__ObjectIdAssignment_31957); 
             after(grammarAccess.getPermissionAccess().getObjectIdJvmOperationIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPermissionAccess().getObjectIdJvmOperationCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permission__ObjectIdAssignment_3"


    // $ANTLR start "rule__Permission__ActionGroupAssignment_5"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1022:1: rule__Permission__ActionGroupAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Permission__ActionGroupAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1026:1: ( ( ( RULE_ID ) ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1027:1: ( ( RULE_ID ) )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1027:1: ( ( RULE_ID ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1028:1: ( RULE_ID )
            {
             before(grammarAccess.getPermissionAccess().getActionGroupJvmEnumerationLiteralCrossReference_5_0()); 
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1029:1: ( RULE_ID )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1030:1: RULE_ID
            {
             before(grammarAccess.getPermissionAccess().getActionGroupJvmEnumerationLiteralIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Permission__ActionGroupAssignment_51996); 
             after(grammarAccess.getPermissionAccess().getActionGroupJvmEnumerationLiteralIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getPermissionAccess().getActionGroupJvmEnumerationLiteralCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permission__ActionGroupAssignment_5"


    // $ANTLR start "rule__Permission__ConditionalAssignment_6_0"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1041:1: rule__Permission__ConditionalAssignment_6_0 : ( ( 'if' ) ) ;
    public final void rule__Permission__ConditionalAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1045:1: ( ( ( 'if' ) ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1046:1: ( ( 'if' ) )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1046:1: ( ( 'if' ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1047:1: ( 'if' )
            {
             before(grammarAccess.getPermissionAccess().getConditionalIfKeyword_6_0_0()); 
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1048:1: ( 'if' )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1049:1: 'if'
            {
             before(grammarAccess.getPermissionAccess().getConditionalIfKeyword_6_0_0()); 
            match(input,20,FOLLOW_20_in_rule__Permission__ConditionalAssignment_6_02036); 
             after(grammarAccess.getPermissionAccess().getConditionalIfKeyword_6_0_0()); 

            }

             after(grammarAccess.getPermissionAccess().getConditionalIfKeyword_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permission__ConditionalAssignment_6_0"


    // $ANTLR start "rule__Permission__ConditionAssignment_6_1"
    // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1064:1: rule__Permission__ConditionAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Permission__ConditionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1068:1: ( ( ( RULE_ID ) ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1069:1: ( ( RULE_ID ) )
            {
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1069:1: ( ( RULE_ID ) )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1070:1: ( RULE_ID )
            {
             before(grammarAccess.getPermissionAccess().getConditionJvmOperationCrossReference_6_1_0()); 
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1071:1: ( RULE_ID )
            // ../org.ovirt.engine.permissions.ui/src-gen/org/ovirt/engine/permissions/ui/contentassist/antlr/internal/InternalPermissions.g:1072:1: RULE_ID
            {
             before(grammarAccess.getPermissionAccess().getConditionJvmOperationIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Permission__ConditionAssignment_6_12079); 
             after(grammarAccess.getPermissionAccess().getConditionJvmOperationIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getPermissionAccess().getConditionJvmOperationCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permission__ConditionAssignment_6_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__CommandsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__0_in_ruleCommand155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_entryRulePermission182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePermission189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__Group__0_in_rulePermission215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__0__Impl_in_rule__Command__Group__0309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group__1_in_rule__Command__Group__0312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Command__Group__0__Impl340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__1__Impl_in_rule__Command__Group__1371 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_rule__Command__Group__2_in_rule__Command__Group__1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__TypeAssignment_1_in_rule__Command__Group__1__Impl401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__2__Impl_in_rule__Command__Group__2431 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_rule__Command__Group__3_in_rule__Command__Group__2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__OverridesAssignment_2_in_rule__Command__Group__2__Impl461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__3__Impl_in_rule__Command__Group__3492 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Command__Group__4_in_rule__Command__Group__3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Command__Group__3__Impl523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__4__Impl_in_rule__Command__Group__4554 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Command__Group__5_in_rule__Command__Group__4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__0_in_rule__Command__Group__4__Impl584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__5__Impl_in_rule__Command__Group__5615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Command__Group__5__Impl643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__0__Impl_in_rule__Command__Group_4__0686 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Command__Group_4__1_in_rule__Command__Group_4__0689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__PermissionsAssignment_4_0_in_rule__Command__Group_4__0__Impl716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__1__Impl_in_rule__Command__Group_4__1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4_1__0_in_rule__Command__Group_4__1__Impl773 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Command__Group_4_1__0__Impl_in_rule__Command__Group_4_1__0808 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Command__Group_4_1__1_in_rule__Command__Group_4_1__0811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Command__Group_4_1__0__Impl839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4_1__1__Impl_in_rule__Command__Group_4_1__1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__PermissionsAssignment_4_1_1_in_rule__Command__Group_4_1__1__Impl897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__Group__0__Impl_in_rule__Permission__Group__0931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Permission__Group__1_in_rule__Permission__Group__0934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Permission__Group__0__Impl962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__Group__1__Impl_in_rule__Permission__Group__1993 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Permission__Group__2_in_rule__Permission__Group__1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__ObjectTypeAssignment_1_in_rule__Permission__Group__1__Impl1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__Group__2__Impl_in_rule__Permission__Group__21053 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Permission__Group__3_in_rule__Permission__Group__21056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Permission__Group__2__Impl1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__Group__3__Impl_in_rule__Permission__Group__31115 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Permission__Group__4_in_rule__Permission__Group__31118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__ObjectIdAssignment_3_in_rule__Permission__Group__3__Impl1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__Group__4__Impl_in_rule__Permission__Group__41175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Permission__Group__5_in_rule__Permission__Group__41178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Permission__Group__4__Impl1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__Group__5__Impl_in_rule__Permission__Group__51237 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Permission__Group__6_in_rule__Permission__Group__51240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__ActionGroupAssignment_5_in_rule__Permission__Group__5__Impl1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__Group__6__Impl_in_rule__Permission__Group__61297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__Group_6__0_in_rule__Permission__Group__6__Impl1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__Group_6__0__Impl_in_rule__Permission__Group_6__01369 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Permission__Group_6__1_in_rule__Permission__Group_6__01372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__ConditionalAssignment_6_0_in_rule__Permission__Group_6__0__Impl1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__Group_6__1__Impl_in_rule__Permission__Group_6__11429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__ConditionAssignment_6_1_in_rule__Permission__Group_6__1__Impl1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01490 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1576 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01611 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__QualifiedName__Group_1__0__Impl1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Model__CommandsAssignment1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Command__TypeAssignment_11773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Command__OverridesAssignment_21813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_rule__Command__PermissionsAssignment_4_01852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_rule__Command__PermissionsAssignment_4_1_11883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Permission__ObjectTypeAssignment_11918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Permission__ObjectIdAssignment_31957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Permission__ActionGroupAssignment_51996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Permission__ConditionalAssignment_6_02036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Permission__ConditionAssignment_6_12079 = new BitSet(new long[]{0x0000000000000002L});

}