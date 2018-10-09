package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.DSLSATGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLSATParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LOWID", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'<=>'", "'=>'", "'v'", "'^'", "'|'", "'('", "')'", "'!'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int RULE_LOWID=4;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDSLSATParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDSLSATParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDSLSATParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDSLSAT.g"; }


    	private DSLSATGrammarAccess grammarAccess;

    	public void setGrammarAccess(DSLSATGrammarAccess grammarAccess) {
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
    // InternalDSLSAT.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDSLSAT.g:54:1: ( ruleModel EOF )
            // InternalDSLSAT.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDSLSAT.g:62:1: ruleModel : ( ruleBiImplForm ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:66:2: ( ( ruleBiImplForm ) )
            // InternalDSLSAT.g:67:2: ( ruleBiImplForm )
            {
            // InternalDSLSAT.g:67:2: ( ruleBiImplForm )
            // InternalDSLSAT.g:68:3: ruleBiImplForm
            {
             before(grammarAccess.getModelAccess().getBiImplFormParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleBiImplForm();

            state._fsp--;

             after(grammarAccess.getModelAccess().getBiImplFormParserRuleCall()); 

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


    // $ANTLR start "entryRuleBiImplForm"
    // InternalDSLSAT.g:78:1: entryRuleBiImplForm : ruleBiImplForm EOF ;
    public final void entryRuleBiImplForm() throws RecognitionException {
        try {
            // InternalDSLSAT.g:79:1: ( ruleBiImplForm EOF )
            // InternalDSLSAT.g:80:1: ruleBiImplForm EOF
            {
             before(grammarAccess.getBiImplFormRule()); 
            pushFollow(FOLLOW_1);
            ruleBiImplForm();

            state._fsp--;

             after(grammarAccess.getBiImplFormRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBiImplForm"


    // $ANTLR start "ruleBiImplForm"
    // InternalDSLSAT.g:87:1: ruleBiImplForm : ( ( rule__BiImplForm__Group__0 ) ) ;
    public final void ruleBiImplForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:91:2: ( ( ( rule__BiImplForm__Group__0 ) ) )
            // InternalDSLSAT.g:92:2: ( ( rule__BiImplForm__Group__0 ) )
            {
            // InternalDSLSAT.g:92:2: ( ( rule__BiImplForm__Group__0 ) )
            // InternalDSLSAT.g:93:3: ( rule__BiImplForm__Group__0 )
            {
             before(grammarAccess.getBiImplFormAccess().getGroup()); 
            // InternalDSLSAT.g:94:3: ( rule__BiImplForm__Group__0 )
            // InternalDSLSAT.g:94:4: rule__BiImplForm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BiImplForm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBiImplFormAccess().getGroup()); 

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
    // $ANTLR end "ruleBiImplForm"


    // $ANTLR start "entryRuleImplForm"
    // InternalDSLSAT.g:103:1: entryRuleImplForm : ruleImplForm EOF ;
    public final void entryRuleImplForm() throws RecognitionException {
        try {
            // InternalDSLSAT.g:104:1: ( ruleImplForm EOF )
            // InternalDSLSAT.g:105:1: ruleImplForm EOF
            {
             before(grammarAccess.getImplFormRule()); 
            pushFollow(FOLLOW_1);
            ruleImplForm();

            state._fsp--;

             after(grammarAccess.getImplFormRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImplForm"


    // $ANTLR start "ruleImplForm"
    // InternalDSLSAT.g:112:1: ruleImplForm : ( ( rule__ImplForm__Group__0 ) ) ;
    public final void ruleImplForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:116:2: ( ( ( rule__ImplForm__Group__0 ) ) )
            // InternalDSLSAT.g:117:2: ( ( rule__ImplForm__Group__0 ) )
            {
            // InternalDSLSAT.g:117:2: ( ( rule__ImplForm__Group__0 ) )
            // InternalDSLSAT.g:118:3: ( rule__ImplForm__Group__0 )
            {
             before(grammarAccess.getImplFormAccess().getGroup()); 
            // InternalDSLSAT.g:119:3: ( rule__ImplForm__Group__0 )
            // InternalDSLSAT.g:119:4: rule__ImplForm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImplForm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImplFormAccess().getGroup()); 

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
    // $ANTLR end "ruleImplForm"


    // $ANTLR start "entryRuleOrForm"
    // InternalDSLSAT.g:128:1: entryRuleOrForm : ruleOrForm EOF ;
    public final void entryRuleOrForm() throws RecognitionException {
        try {
            // InternalDSLSAT.g:129:1: ( ruleOrForm EOF )
            // InternalDSLSAT.g:130:1: ruleOrForm EOF
            {
             before(grammarAccess.getOrFormRule()); 
            pushFollow(FOLLOW_1);
            ruleOrForm();

            state._fsp--;

             after(grammarAccess.getOrFormRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrForm"


    // $ANTLR start "ruleOrForm"
    // InternalDSLSAT.g:137:1: ruleOrForm : ( ( rule__OrForm__Group__0 ) ) ;
    public final void ruleOrForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:141:2: ( ( ( rule__OrForm__Group__0 ) ) )
            // InternalDSLSAT.g:142:2: ( ( rule__OrForm__Group__0 ) )
            {
            // InternalDSLSAT.g:142:2: ( ( rule__OrForm__Group__0 ) )
            // InternalDSLSAT.g:143:3: ( rule__OrForm__Group__0 )
            {
             before(grammarAccess.getOrFormAccess().getGroup()); 
            // InternalDSLSAT.g:144:3: ( rule__OrForm__Group__0 )
            // InternalDSLSAT.g:144:4: rule__OrForm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrForm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrFormAccess().getGroup()); 

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
    // $ANTLR end "ruleOrForm"


    // $ANTLR start "entryRuleAndForm"
    // InternalDSLSAT.g:153:1: entryRuleAndForm : ruleAndForm EOF ;
    public final void entryRuleAndForm() throws RecognitionException {
        try {
            // InternalDSLSAT.g:154:1: ( ruleAndForm EOF )
            // InternalDSLSAT.g:155:1: ruleAndForm EOF
            {
             before(grammarAccess.getAndFormRule()); 
            pushFollow(FOLLOW_1);
            ruleAndForm();

            state._fsp--;

             after(grammarAccess.getAndFormRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAndForm"


    // $ANTLR start "ruleAndForm"
    // InternalDSLSAT.g:162:1: ruleAndForm : ( ( rule__AndForm__Group__0 ) ) ;
    public final void ruleAndForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:166:2: ( ( ( rule__AndForm__Group__0 ) ) )
            // InternalDSLSAT.g:167:2: ( ( rule__AndForm__Group__0 ) )
            {
            // InternalDSLSAT.g:167:2: ( ( rule__AndForm__Group__0 ) )
            // InternalDSLSAT.g:168:3: ( rule__AndForm__Group__0 )
            {
             before(grammarAccess.getAndFormAccess().getGroup()); 
            // InternalDSLSAT.g:169:3: ( rule__AndForm__Group__0 )
            // InternalDSLSAT.g:169:4: rule__AndForm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndForm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndFormAccess().getGroup()); 

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
    // $ANTLR end "ruleAndForm"


    // $ANTLR start "entryRuleNandForm"
    // InternalDSLSAT.g:178:1: entryRuleNandForm : ruleNandForm EOF ;
    public final void entryRuleNandForm() throws RecognitionException {
        try {
            // InternalDSLSAT.g:179:1: ( ruleNandForm EOF )
            // InternalDSLSAT.g:180:1: ruleNandForm EOF
            {
             before(grammarAccess.getNandFormRule()); 
            pushFollow(FOLLOW_1);
            ruleNandForm();

            state._fsp--;

             after(grammarAccess.getNandFormRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNandForm"


    // $ANTLR start "ruleNandForm"
    // InternalDSLSAT.g:187:1: ruleNandForm : ( ( rule__NandForm__Group__0 ) ) ;
    public final void ruleNandForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:191:2: ( ( ( rule__NandForm__Group__0 ) ) )
            // InternalDSLSAT.g:192:2: ( ( rule__NandForm__Group__0 ) )
            {
            // InternalDSLSAT.g:192:2: ( ( rule__NandForm__Group__0 ) )
            // InternalDSLSAT.g:193:3: ( rule__NandForm__Group__0 )
            {
             before(grammarAccess.getNandFormAccess().getGroup()); 
            // InternalDSLSAT.g:194:3: ( rule__NandForm__Group__0 )
            // InternalDSLSAT.g:194:4: rule__NandForm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NandForm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNandFormAccess().getGroup()); 

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
    // $ANTLR end "ruleNandForm"


    // $ANTLR start "entryRuleForm"
    // InternalDSLSAT.g:203:1: entryRuleForm : ruleForm EOF ;
    public final void entryRuleForm() throws RecognitionException {
        try {
            // InternalDSLSAT.g:204:1: ( ruleForm EOF )
            // InternalDSLSAT.g:205:1: ruleForm EOF
            {
             before(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_1);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getFormRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // InternalDSLSAT.g:212:1: ruleForm : ( ( rule__Form__Alternatives ) ) ;
    public final void ruleForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:216:2: ( ( ( rule__Form__Alternatives ) ) )
            // InternalDSLSAT.g:217:2: ( ( rule__Form__Alternatives ) )
            {
            // InternalDSLSAT.g:217:2: ( ( rule__Form__Alternatives ) )
            // InternalDSLSAT.g:218:3: ( rule__Form__Alternatives )
            {
             before(grammarAccess.getFormAccess().getAlternatives()); 
            // InternalDSLSAT.g:219:3: ( rule__Form__Alternatives )
            // InternalDSLSAT.g:219:4: rule__Form__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Form__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getAlternatives()); 

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
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleNotForm"
    // InternalDSLSAT.g:228:1: entryRuleNotForm : ruleNotForm EOF ;
    public final void entryRuleNotForm() throws RecognitionException {
        try {
            // InternalDSLSAT.g:229:1: ( ruleNotForm EOF )
            // InternalDSLSAT.g:230:1: ruleNotForm EOF
            {
             before(grammarAccess.getNotFormRule()); 
            pushFollow(FOLLOW_1);
            ruleNotForm();

            state._fsp--;

             after(grammarAccess.getNotFormRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNotForm"


    // $ANTLR start "ruleNotForm"
    // InternalDSLSAT.g:237:1: ruleNotForm : ( ( rule__NotForm__Group__0 ) ) ;
    public final void ruleNotForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:241:2: ( ( ( rule__NotForm__Group__0 ) ) )
            // InternalDSLSAT.g:242:2: ( ( rule__NotForm__Group__0 ) )
            {
            // InternalDSLSAT.g:242:2: ( ( rule__NotForm__Group__0 ) )
            // InternalDSLSAT.g:243:3: ( rule__NotForm__Group__0 )
            {
             before(grammarAccess.getNotFormAccess().getGroup()); 
            // InternalDSLSAT.g:244:3: ( rule__NotForm__Group__0 )
            // InternalDSLSAT.g:244:4: rule__NotForm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NotForm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotFormAccess().getGroup()); 

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
    // $ANTLR end "ruleNotForm"


    // $ANTLR start "entryRuleVar"
    // InternalDSLSAT.g:253:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // InternalDSLSAT.g:254:1: ( ruleVar EOF )
            // InternalDSLSAT.g:255:1: ruleVar EOF
            {
             before(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getVarRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalDSLSAT.g:262:1: ruleVar : ( ( rule__Var__IdAssignment ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:266:2: ( ( ( rule__Var__IdAssignment ) ) )
            // InternalDSLSAT.g:267:2: ( ( rule__Var__IdAssignment ) )
            {
            // InternalDSLSAT.g:267:2: ( ( rule__Var__IdAssignment ) )
            // InternalDSLSAT.g:268:3: ( rule__Var__IdAssignment )
            {
             before(grammarAccess.getVarAccess().getIdAssignment()); 
            // InternalDSLSAT.g:269:3: ( rule__Var__IdAssignment )
            // InternalDSLSAT.g:269:4: rule__Var__IdAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Var__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getIdAssignment()); 

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
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleConst"
    // InternalDSLSAT.g:278:1: entryRuleConst : ruleConst EOF ;
    public final void entryRuleConst() throws RecognitionException {
        try {
            // InternalDSLSAT.g:279:1: ( ruleConst EOF )
            // InternalDSLSAT.g:280:1: ruleConst EOF
            {
             before(grammarAccess.getConstRule()); 
            pushFollow(FOLLOW_1);
            ruleConst();

            state._fsp--;

             after(grammarAccess.getConstRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConst"


    // $ANTLR start "ruleConst"
    // InternalDSLSAT.g:287:1: ruleConst : ( ( rule__Const__ValAssignment ) ) ;
    public final void ruleConst() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:291:2: ( ( ( rule__Const__ValAssignment ) ) )
            // InternalDSLSAT.g:292:2: ( ( rule__Const__ValAssignment ) )
            {
            // InternalDSLSAT.g:292:2: ( ( rule__Const__ValAssignment ) )
            // InternalDSLSAT.g:293:3: ( rule__Const__ValAssignment )
            {
             before(grammarAccess.getConstAccess().getValAssignment()); 
            // InternalDSLSAT.g:294:3: ( rule__Const__ValAssignment )
            // InternalDSLSAT.g:294:4: rule__Const__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Const__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConstAccess().getValAssignment()); 

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
    // $ANTLR end "ruleConst"


    // $ANTLR start "rule__Form__Alternatives"
    // InternalDSLSAT.g:302:1: rule__Form__Alternatives : ( ( ( rule__Form__FAssignment_0 ) ) | ( ( rule__Form__FAssignment_1 ) ) | ( ( rule__Form__FAssignment_2 ) ) | ( ( rule__Form__Group_3__0 ) ) );
    public final void rule__Form__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:306:1: ( ( ( rule__Form__FAssignment_0 ) ) | ( ( rule__Form__FAssignment_1 ) ) | ( ( rule__Form__FAssignment_2 ) ) | ( ( rule__Form__Group_3__0 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
                {
                alt1=1;
                }
                break;
            case RULE_LOWID:
                {
                alt1=2;
                }
                break;
            case 21:
                {
                alt1=3;
                }
                break;
            case 19:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDSLSAT.g:307:2: ( ( rule__Form__FAssignment_0 ) )
                    {
                    // InternalDSLSAT.g:307:2: ( ( rule__Form__FAssignment_0 ) )
                    // InternalDSLSAT.g:308:3: ( rule__Form__FAssignment_0 )
                    {
                     before(grammarAccess.getFormAccess().getFAssignment_0()); 
                    // InternalDSLSAT.g:309:3: ( rule__Form__FAssignment_0 )
                    // InternalDSLSAT.g:309:4: rule__Form__FAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Form__FAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormAccess().getFAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSLSAT.g:313:2: ( ( rule__Form__FAssignment_1 ) )
                    {
                    // InternalDSLSAT.g:313:2: ( ( rule__Form__FAssignment_1 ) )
                    // InternalDSLSAT.g:314:3: ( rule__Form__FAssignment_1 )
                    {
                     before(grammarAccess.getFormAccess().getFAssignment_1()); 
                    // InternalDSLSAT.g:315:3: ( rule__Form__FAssignment_1 )
                    // InternalDSLSAT.g:315:4: rule__Form__FAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Form__FAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormAccess().getFAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSLSAT.g:319:2: ( ( rule__Form__FAssignment_2 ) )
                    {
                    // InternalDSLSAT.g:319:2: ( ( rule__Form__FAssignment_2 ) )
                    // InternalDSLSAT.g:320:3: ( rule__Form__FAssignment_2 )
                    {
                     before(grammarAccess.getFormAccess().getFAssignment_2()); 
                    // InternalDSLSAT.g:321:3: ( rule__Form__FAssignment_2 )
                    // InternalDSLSAT.g:321:4: rule__Form__FAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Form__FAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormAccess().getFAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSLSAT.g:325:2: ( ( rule__Form__Group_3__0 ) )
                    {
                    // InternalDSLSAT.g:325:2: ( ( rule__Form__Group_3__0 ) )
                    // InternalDSLSAT.g:326:3: ( rule__Form__Group_3__0 )
                    {
                     before(grammarAccess.getFormAccess().getGroup_3()); 
                    // InternalDSLSAT.g:327:3: ( rule__Form__Group_3__0 )
                    // InternalDSLSAT.g:327:4: rule__Form__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Form__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormAccess().getGroup_3()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Form__Alternatives"


    // $ANTLR start "rule__Const__ValAlternatives_0"
    // InternalDSLSAT.g:335:1: rule__Const__ValAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Const__ValAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:339:1: ( ( 'true' ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDSLSAT.g:340:2: ( 'true' )
                    {
                    // InternalDSLSAT.g:340:2: ( 'true' )
                    // InternalDSLSAT.g:341:3: 'true'
                    {
                     before(grammarAccess.getConstAccess().getValTrueKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getConstAccess().getValTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSLSAT.g:346:2: ( 'false' )
                    {
                    // InternalDSLSAT.g:346:2: ( 'false' )
                    // InternalDSLSAT.g:347:3: 'false'
                    {
                     before(grammarAccess.getConstAccess().getValFalseKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getConstAccess().getValFalseKeyword_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Const__ValAlternatives_0"


    // $ANTLR start "rule__BiImplForm__Group__0"
    // InternalDSLSAT.g:356:1: rule__BiImplForm__Group__0 : rule__BiImplForm__Group__0__Impl rule__BiImplForm__Group__1 ;
    public final void rule__BiImplForm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:360:1: ( rule__BiImplForm__Group__0__Impl rule__BiImplForm__Group__1 )
            // InternalDSLSAT.g:361:2: rule__BiImplForm__Group__0__Impl rule__BiImplForm__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BiImplForm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BiImplForm__Group__1();

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
    // $ANTLR end "rule__BiImplForm__Group__0"


    // $ANTLR start "rule__BiImplForm__Group__0__Impl"
    // InternalDSLSAT.g:368:1: rule__BiImplForm__Group__0__Impl : ( ruleImplForm ) ;
    public final void rule__BiImplForm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:372:1: ( ( ruleImplForm ) )
            // InternalDSLSAT.g:373:1: ( ruleImplForm )
            {
            // InternalDSLSAT.g:373:1: ( ruleImplForm )
            // InternalDSLSAT.g:374:2: ruleImplForm
            {
             before(grammarAccess.getBiImplFormAccess().getImplFormParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleImplForm();

            state._fsp--;

             after(grammarAccess.getBiImplFormAccess().getImplFormParserRuleCall_0()); 

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
    // $ANTLR end "rule__BiImplForm__Group__0__Impl"


    // $ANTLR start "rule__BiImplForm__Group__1"
    // InternalDSLSAT.g:383:1: rule__BiImplForm__Group__1 : rule__BiImplForm__Group__1__Impl ;
    public final void rule__BiImplForm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:387:1: ( rule__BiImplForm__Group__1__Impl )
            // InternalDSLSAT.g:388:2: rule__BiImplForm__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BiImplForm__Group__1__Impl();

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
    // $ANTLR end "rule__BiImplForm__Group__1"


    // $ANTLR start "rule__BiImplForm__Group__1__Impl"
    // InternalDSLSAT.g:394:1: rule__BiImplForm__Group__1__Impl : ( ( rule__BiImplForm__Group_1__0 )* ) ;
    public final void rule__BiImplForm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:398:1: ( ( ( rule__BiImplForm__Group_1__0 )* ) )
            // InternalDSLSAT.g:399:1: ( ( rule__BiImplForm__Group_1__0 )* )
            {
            // InternalDSLSAT.g:399:1: ( ( rule__BiImplForm__Group_1__0 )* )
            // InternalDSLSAT.g:400:2: ( rule__BiImplForm__Group_1__0 )*
            {
             before(grammarAccess.getBiImplFormAccess().getGroup_1()); 
            // InternalDSLSAT.g:401:2: ( rule__BiImplForm__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDSLSAT.g:401:3: rule__BiImplForm__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__BiImplForm__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getBiImplFormAccess().getGroup_1()); 

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
    // $ANTLR end "rule__BiImplForm__Group__1__Impl"


    // $ANTLR start "rule__BiImplForm__Group_1__0"
    // InternalDSLSAT.g:410:1: rule__BiImplForm__Group_1__0 : rule__BiImplForm__Group_1__0__Impl rule__BiImplForm__Group_1__1 ;
    public final void rule__BiImplForm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:414:1: ( rule__BiImplForm__Group_1__0__Impl rule__BiImplForm__Group_1__1 )
            // InternalDSLSAT.g:415:2: rule__BiImplForm__Group_1__0__Impl rule__BiImplForm__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__BiImplForm__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BiImplForm__Group_1__1();

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
    // $ANTLR end "rule__BiImplForm__Group_1__0"


    // $ANTLR start "rule__BiImplForm__Group_1__0__Impl"
    // InternalDSLSAT.g:422:1: rule__BiImplForm__Group_1__0__Impl : ( () ) ;
    public final void rule__BiImplForm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:426:1: ( ( () ) )
            // InternalDSLSAT.g:427:1: ( () )
            {
            // InternalDSLSAT.g:427:1: ( () )
            // InternalDSLSAT.g:428:2: ()
            {
             before(grammarAccess.getBiImplFormAccess().getBiImplFormLeftAction_1_0()); 
            // InternalDSLSAT.g:429:2: ()
            // InternalDSLSAT.g:429:3: 
            {
            }

             after(grammarAccess.getBiImplFormAccess().getBiImplFormLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiImplForm__Group_1__0__Impl"


    // $ANTLR start "rule__BiImplForm__Group_1__1"
    // InternalDSLSAT.g:437:1: rule__BiImplForm__Group_1__1 : rule__BiImplForm__Group_1__1__Impl rule__BiImplForm__Group_1__2 ;
    public final void rule__BiImplForm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:441:1: ( rule__BiImplForm__Group_1__1__Impl rule__BiImplForm__Group_1__2 )
            // InternalDSLSAT.g:442:2: rule__BiImplForm__Group_1__1__Impl rule__BiImplForm__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__BiImplForm__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BiImplForm__Group_1__2();

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
    // $ANTLR end "rule__BiImplForm__Group_1__1"


    // $ANTLR start "rule__BiImplForm__Group_1__1__Impl"
    // InternalDSLSAT.g:449:1: rule__BiImplForm__Group_1__1__Impl : ( '<=>' ) ;
    public final void rule__BiImplForm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:453:1: ( ( '<=>' ) )
            // InternalDSLSAT.g:454:1: ( '<=>' )
            {
            // InternalDSLSAT.g:454:1: ( '<=>' )
            // InternalDSLSAT.g:455:2: '<=>'
            {
             before(grammarAccess.getBiImplFormAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBiImplFormAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1()); 

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
    // $ANTLR end "rule__BiImplForm__Group_1__1__Impl"


    // $ANTLR start "rule__BiImplForm__Group_1__2"
    // InternalDSLSAT.g:464:1: rule__BiImplForm__Group_1__2 : rule__BiImplForm__Group_1__2__Impl ;
    public final void rule__BiImplForm__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:468:1: ( rule__BiImplForm__Group_1__2__Impl )
            // InternalDSLSAT.g:469:2: rule__BiImplForm__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BiImplForm__Group_1__2__Impl();

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
    // $ANTLR end "rule__BiImplForm__Group_1__2"


    // $ANTLR start "rule__BiImplForm__Group_1__2__Impl"
    // InternalDSLSAT.g:475:1: rule__BiImplForm__Group_1__2__Impl : ( ( rule__BiImplForm__RightAssignment_1_2 ) ) ;
    public final void rule__BiImplForm__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:479:1: ( ( ( rule__BiImplForm__RightAssignment_1_2 ) ) )
            // InternalDSLSAT.g:480:1: ( ( rule__BiImplForm__RightAssignment_1_2 ) )
            {
            // InternalDSLSAT.g:480:1: ( ( rule__BiImplForm__RightAssignment_1_2 ) )
            // InternalDSLSAT.g:481:2: ( rule__BiImplForm__RightAssignment_1_2 )
            {
             before(grammarAccess.getBiImplFormAccess().getRightAssignment_1_2()); 
            // InternalDSLSAT.g:482:2: ( rule__BiImplForm__RightAssignment_1_2 )
            // InternalDSLSAT.g:482:3: rule__BiImplForm__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BiImplForm__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getBiImplFormAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__BiImplForm__Group_1__2__Impl"


    // $ANTLR start "rule__ImplForm__Group__0"
    // InternalDSLSAT.g:491:1: rule__ImplForm__Group__0 : rule__ImplForm__Group__0__Impl rule__ImplForm__Group__1 ;
    public final void rule__ImplForm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:495:1: ( rule__ImplForm__Group__0__Impl rule__ImplForm__Group__1 )
            // InternalDSLSAT.g:496:2: rule__ImplForm__Group__0__Impl rule__ImplForm__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ImplForm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplForm__Group__1();

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
    // $ANTLR end "rule__ImplForm__Group__0"


    // $ANTLR start "rule__ImplForm__Group__0__Impl"
    // InternalDSLSAT.g:503:1: rule__ImplForm__Group__0__Impl : ( ruleOrForm ) ;
    public final void rule__ImplForm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:507:1: ( ( ruleOrForm ) )
            // InternalDSLSAT.g:508:1: ( ruleOrForm )
            {
            // InternalDSLSAT.g:508:1: ( ruleOrForm )
            // InternalDSLSAT.g:509:2: ruleOrForm
            {
             before(grammarAccess.getImplFormAccess().getOrFormParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOrForm();

            state._fsp--;

             after(grammarAccess.getImplFormAccess().getOrFormParserRuleCall_0()); 

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
    // $ANTLR end "rule__ImplForm__Group__0__Impl"


    // $ANTLR start "rule__ImplForm__Group__1"
    // InternalDSLSAT.g:518:1: rule__ImplForm__Group__1 : rule__ImplForm__Group__1__Impl ;
    public final void rule__ImplForm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:522:1: ( rule__ImplForm__Group__1__Impl )
            // InternalDSLSAT.g:523:2: rule__ImplForm__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImplForm__Group__1__Impl();

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
    // $ANTLR end "rule__ImplForm__Group__1"


    // $ANTLR start "rule__ImplForm__Group__1__Impl"
    // InternalDSLSAT.g:529:1: rule__ImplForm__Group__1__Impl : ( ( rule__ImplForm__Group_1__0 )* ) ;
    public final void rule__ImplForm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:533:1: ( ( ( rule__ImplForm__Group_1__0 )* ) )
            // InternalDSLSAT.g:534:1: ( ( rule__ImplForm__Group_1__0 )* )
            {
            // InternalDSLSAT.g:534:1: ( ( rule__ImplForm__Group_1__0 )* )
            // InternalDSLSAT.g:535:2: ( rule__ImplForm__Group_1__0 )*
            {
             before(grammarAccess.getImplFormAccess().getGroup_1()); 
            // InternalDSLSAT.g:536:2: ( rule__ImplForm__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDSLSAT.g:536:3: rule__ImplForm__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ImplForm__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getImplFormAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ImplForm__Group__1__Impl"


    // $ANTLR start "rule__ImplForm__Group_1__0"
    // InternalDSLSAT.g:545:1: rule__ImplForm__Group_1__0 : rule__ImplForm__Group_1__0__Impl rule__ImplForm__Group_1__1 ;
    public final void rule__ImplForm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:549:1: ( rule__ImplForm__Group_1__0__Impl rule__ImplForm__Group_1__1 )
            // InternalDSLSAT.g:550:2: rule__ImplForm__Group_1__0__Impl rule__ImplForm__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__ImplForm__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplForm__Group_1__1();

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
    // $ANTLR end "rule__ImplForm__Group_1__0"


    // $ANTLR start "rule__ImplForm__Group_1__0__Impl"
    // InternalDSLSAT.g:557:1: rule__ImplForm__Group_1__0__Impl : ( () ) ;
    public final void rule__ImplForm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:561:1: ( ( () ) )
            // InternalDSLSAT.g:562:1: ( () )
            {
            // InternalDSLSAT.g:562:1: ( () )
            // InternalDSLSAT.g:563:2: ()
            {
             before(grammarAccess.getImplFormAccess().getEqFormLeftAction_1_0()); 
            // InternalDSLSAT.g:564:2: ()
            // InternalDSLSAT.g:564:3: 
            {
            }

             after(grammarAccess.getImplFormAccess().getEqFormLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplForm__Group_1__0__Impl"


    // $ANTLR start "rule__ImplForm__Group_1__1"
    // InternalDSLSAT.g:572:1: rule__ImplForm__Group_1__1 : rule__ImplForm__Group_1__1__Impl rule__ImplForm__Group_1__2 ;
    public final void rule__ImplForm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:576:1: ( rule__ImplForm__Group_1__1__Impl rule__ImplForm__Group_1__2 )
            // InternalDSLSAT.g:577:2: rule__ImplForm__Group_1__1__Impl rule__ImplForm__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__ImplForm__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplForm__Group_1__2();

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
    // $ANTLR end "rule__ImplForm__Group_1__1"


    // $ANTLR start "rule__ImplForm__Group_1__1__Impl"
    // InternalDSLSAT.g:584:1: rule__ImplForm__Group_1__1__Impl : ( '=>' ) ;
    public final void rule__ImplForm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:588:1: ( ( '=>' ) )
            // InternalDSLSAT.g:589:1: ( '=>' )
            {
            // InternalDSLSAT.g:589:1: ( '=>' )
            // InternalDSLSAT.g:590:2: '=>'
            {
             before(grammarAccess.getImplFormAccess().getEqualsSignGreaterThanSignKeyword_1_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getImplFormAccess().getEqualsSignGreaterThanSignKeyword_1_1()); 

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
    // $ANTLR end "rule__ImplForm__Group_1__1__Impl"


    // $ANTLR start "rule__ImplForm__Group_1__2"
    // InternalDSLSAT.g:599:1: rule__ImplForm__Group_1__2 : rule__ImplForm__Group_1__2__Impl ;
    public final void rule__ImplForm__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:603:1: ( rule__ImplForm__Group_1__2__Impl )
            // InternalDSLSAT.g:604:2: rule__ImplForm__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImplForm__Group_1__2__Impl();

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
    // $ANTLR end "rule__ImplForm__Group_1__2"


    // $ANTLR start "rule__ImplForm__Group_1__2__Impl"
    // InternalDSLSAT.g:610:1: rule__ImplForm__Group_1__2__Impl : ( ( rule__ImplForm__RightAssignment_1_2 ) ) ;
    public final void rule__ImplForm__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:614:1: ( ( ( rule__ImplForm__RightAssignment_1_2 ) ) )
            // InternalDSLSAT.g:615:1: ( ( rule__ImplForm__RightAssignment_1_2 ) )
            {
            // InternalDSLSAT.g:615:1: ( ( rule__ImplForm__RightAssignment_1_2 ) )
            // InternalDSLSAT.g:616:2: ( rule__ImplForm__RightAssignment_1_2 )
            {
             before(grammarAccess.getImplFormAccess().getRightAssignment_1_2()); 
            // InternalDSLSAT.g:617:2: ( rule__ImplForm__RightAssignment_1_2 )
            // InternalDSLSAT.g:617:3: rule__ImplForm__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ImplForm__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getImplFormAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__ImplForm__Group_1__2__Impl"


    // $ANTLR start "rule__OrForm__Group__0"
    // InternalDSLSAT.g:626:1: rule__OrForm__Group__0 : rule__OrForm__Group__0__Impl rule__OrForm__Group__1 ;
    public final void rule__OrForm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:630:1: ( rule__OrForm__Group__0__Impl rule__OrForm__Group__1 )
            // InternalDSLSAT.g:631:2: rule__OrForm__Group__0__Impl rule__OrForm__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__OrForm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrForm__Group__1();

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
    // $ANTLR end "rule__OrForm__Group__0"


    // $ANTLR start "rule__OrForm__Group__0__Impl"
    // InternalDSLSAT.g:638:1: rule__OrForm__Group__0__Impl : ( ruleAndForm ) ;
    public final void rule__OrForm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:642:1: ( ( ruleAndForm ) )
            // InternalDSLSAT.g:643:1: ( ruleAndForm )
            {
            // InternalDSLSAT.g:643:1: ( ruleAndForm )
            // InternalDSLSAT.g:644:2: ruleAndForm
            {
             before(grammarAccess.getOrFormAccess().getAndFormParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndForm();

            state._fsp--;

             after(grammarAccess.getOrFormAccess().getAndFormParserRuleCall_0()); 

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
    // $ANTLR end "rule__OrForm__Group__0__Impl"


    // $ANTLR start "rule__OrForm__Group__1"
    // InternalDSLSAT.g:653:1: rule__OrForm__Group__1 : rule__OrForm__Group__1__Impl ;
    public final void rule__OrForm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:657:1: ( rule__OrForm__Group__1__Impl )
            // InternalDSLSAT.g:658:2: rule__OrForm__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrForm__Group__1__Impl();

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
    // $ANTLR end "rule__OrForm__Group__1"


    // $ANTLR start "rule__OrForm__Group__1__Impl"
    // InternalDSLSAT.g:664:1: rule__OrForm__Group__1__Impl : ( ( rule__OrForm__Group_1__0 )* ) ;
    public final void rule__OrForm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:668:1: ( ( ( rule__OrForm__Group_1__0 )* ) )
            // InternalDSLSAT.g:669:1: ( ( rule__OrForm__Group_1__0 )* )
            {
            // InternalDSLSAT.g:669:1: ( ( rule__OrForm__Group_1__0 )* )
            // InternalDSLSAT.g:670:2: ( rule__OrForm__Group_1__0 )*
            {
             before(grammarAccess.getOrFormAccess().getGroup_1()); 
            // InternalDSLSAT.g:671:2: ( rule__OrForm__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDSLSAT.g:671:3: rule__OrForm__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__OrForm__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getOrFormAccess().getGroup_1()); 

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
    // $ANTLR end "rule__OrForm__Group__1__Impl"


    // $ANTLR start "rule__OrForm__Group_1__0"
    // InternalDSLSAT.g:680:1: rule__OrForm__Group_1__0 : rule__OrForm__Group_1__0__Impl rule__OrForm__Group_1__1 ;
    public final void rule__OrForm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:684:1: ( rule__OrForm__Group_1__0__Impl rule__OrForm__Group_1__1 )
            // InternalDSLSAT.g:685:2: rule__OrForm__Group_1__0__Impl rule__OrForm__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__OrForm__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrForm__Group_1__1();

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
    // $ANTLR end "rule__OrForm__Group_1__0"


    // $ANTLR start "rule__OrForm__Group_1__0__Impl"
    // InternalDSLSAT.g:692:1: rule__OrForm__Group_1__0__Impl : ( () ) ;
    public final void rule__OrForm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:696:1: ( ( () ) )
            // InternalDSLSAT.g:697:1: ( () )
            {
            // InternalDSLSAT.g:697:1: ( () )
            // InternalDSLSAT.g:698:2: ()
            {
             before(grammarAccess.getOrFormAccess().getOrFormLeftAction_1_0()); 
            // InternalDSLSAT.g:699:2: ()
            // InternalDSLSAT.g:699:3: 
            {
            }

             after(grammarAccess.getOrFormAccess().getOrFormLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrForm__Group_1__0__Impl"


    // $ANTLR start "rule__OrForm__Group_1__1"
    // InternalDSLSAT.g:707:1: rule__OrForm__Group_1__1 : rule__OrForm__Group_1__1__Impl rule__OrForm__Group_1__2 ;
    public final void rule__OrForm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:711:1: ( rule__OrForm__Group_1__1__Impl rule__OrForm__Group_1__2 )
            // InternalDSLSAT.g:712:2: rule__OrForm__Group_1__1__Impl rule__OrForm__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__OrForm__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrForm__Group_1__2();

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
    // $ANTLR end "rule__OrForm__Group_1__1"


    // $ANTLR start "rule__OrForm__Group_1__1__Impl"
    // InternalDSLSAT.g:719:1: rule__OrForm__Group_1__1__Impl : ( 'v' ) ;
    public final void rule__OrForm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:723:1: ( ( 'v' ) )
            // InternalDSLSAT.g:724:1: ( 'v' )
            {
            // InternalDSLSAT.g:724:1: ( 'v' )
            // InternalDSLSAT.g:725:2: 'v'
            {
             before(grammarAccess.getOrFormAccess().getVKeyword_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOrFormAccess().getVKeyword_1_1()); 

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
    // $ANTLR end "rule__OrForm__Group_1__1__Impl"


    // $ANTLR start "rule__OrForm__Group_1__2"
    // InternalDSLSAT.g:734:1: rule__OrForm__Group_1__2 : rule__OrForm__Group_1__2__Impl ;
    public final void rule__OrForm__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:738:1: ( rule__OrForm__Group_1__2__Impl )
            // InternalDSLSAT.g:739:2: rule__OrForm__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrForm__Group_1__2__Impl();

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
    // $ANTLR end "rule__OrForm__Group_1__2"


    // $ANTLR start "rule__OrForm__Group_1__2__Impl"
    // InternalDSLSAT.g:745:1: rule__OrForm__Group_1__2__Impl : ( ( rule__OrForm__RightAssignment_1_2 ) ) ;
    public final void rule__OrForm__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:749:1: ( ( ( rule__OrForm__RightAssignment_1_2 ) ) )
            // InternalDSLSAT.g:750:1: ( ( rule__OrForm__RightAssignment_1_2 ) )
            {
            // InternalDSLSAT.g:750:1: ( ( rule__OrForm__RightAssignment_1_2 ) )
            // InternalDSLSAT.g:751:2: ( rule__OrForm__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrFormAccess().getRightAssignment_1_2()); 
            // InternalDSLSAT.g:752:2: ( rule__OrForm__RightAssignment_1_2 )
            // InternalDSLSAT.g:752:3: rule__OrForm__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrForm__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrFormAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__OrForm__Group_1__2__Impl"


    // $ANTLR start "rule__AndForm__Group__0"
    // InternalDSLSAT.g:761:1: rule__AndForm__Group__0 : rule__AndForm__Group__0__Impl rule__AndForm__Group__1 ;
    public final void rule__AndForm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:765:1: ( rule__AndForm__Group__0__Impl rule__AndForm__Group__1 )
            // InternalDSLSAT.g:766:2: rule__AndForm__Group__0__Impl rule__AndForm__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__AndForm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndForm__Group__1();

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
    // $ANTLR end "rule__AndForm__Group__0"


    // $ANTLR start "rule__AndForm__Group__0__Impl"
    // InternalDSLSAT.g:773:1: rule__AndForm__Group__0__Impl : ( ruleNandForm ) ;
    public final void rule__AndForm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:777:1: ( ( ruleNandForm ) )
            // InternalDSLSAT.g:778:1: ( ruleNandForm )
            {
            // InternalDSLSAT.g:778:1: ( ruleNandForm )
            // InternalDSLSAT.g:779:2: ruleNandForm
            {
             before(grammarAccess.getAndFormAccess().getNandFormParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNandForm();

            state._fsp--;

             after(grammarAccess.getAndFormAccess().getNandFormParserRuleCall_0()); 

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
    // $ANTLR end "rule__AndForm__Group__0__Impl"


    // $ANTLR start "rule__AndForm__Group__1"
    // InternalDSLSAT.g:788:1: rule__AndForm__Group__1 : rule__AndForm__Group__1__Impl ;
    public final void rule__AndForm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:792:1: ( rule__AndForm__Group__1__Impl )
            // InternalDSLSAT.g:793:2: rule__AndForm__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndForm__Group__1__Impl();

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
    // $ANTLR end "rule__AndForm__Group__1"


    // $ANTLR start "rule__AndForm__Group__1__Impl"
    // InternalDSLSAT.g:799:1: rule__AndForm__Group__1__Impl : ( ( rule__AndForm__Group_1__0 )* ) ;
    public final void rule__AndForm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:803:1: ( ( ( rule__AndForm__Group_1__0 )* ) )
            // InternalDSLSAT.g:804:1: ( ( rule__AndForm__Group_1__0 )* )
            {
            // InternalDSLSAT.g:804:1: ( ( rule__AndForm__Group_1__0 )* )
            // InternalDSLSAT.g:805:2: ( rule__AndForm__Group_1__0 )*
            {
             before(grammarAccess.getAndFormAccess().getGroup_1()); 
            // InternalDSLSAT.g:806:2: ( rule__AndForm__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDSLSAT.g:806:3: rule__AndForm__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__AndForm__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getAndFormAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AndForm__Group__1__Impl"


    // $ANTLR start "rule__AndForm__Group_1__0"
    // InternalDSLSAT.g:815:1: rule__AndForm__Group_1__0 : rule__AndForm__Group_1__0__Impl rule__AndForm__Group_1__1 ;
    public final void rule__AndForm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:819:1: ( rule__AndForm__Group_1__0__Impl rule__AndForm__Group_1__1 )
            // InternalDSLSAT.g:820:2: rule__AndForm__Group_1__0__Impl rule__AndForm__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__AndForm__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndForm__Group_1__1();

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
    // $ANTLR end "rule__AndForm__Group_1__0"


    // $ANTLR start "rule__AndForm__Group_1__0__Impl"
    // InternalDSLSAT.g:827:1: rule__AndForm__Group_1__0__Impl : ( () ) ;
    public final void rule__AndForm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:831:1: ( ( () ) )
            // InternalDSLSAT.g:832:1: ( () )
            {
            // InternalDSLSAT.g:832:1: ( () )
            // InternalDSLSAT.g:833:2: ()
            {
             before(grammarAccess.getAndFormAccess().getAndFormLeftAction_1_0()); 
            // InternalDSLSAT.g:834:2: ()
            // InternalDSLSAT.g:834:3: 
            {
            }

             after(grammarAccess.getAndFormAccess().getAndFormLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndForm__Group_1__0__Impl"


    // $ANTLR start "rule__AndForm__Group_1__1"
    // InternalDSLSAT.g:842:1: rule__AndForm__Group_1__1 : rule__AndForm__Group_1__1__Impl rule__AndForm__Group_1__2 ;
    public final void rule__AndForm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:846:1: ( rule__AndForm__Group_1__1__Impl rule__AndForm__Group_1__2 )
            // InternalDSLSAT.g:847:2: rule__AndForm__Group_1__1__Impl rule__AndForm__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__AndForm__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndForm__Group_1__2();

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
    // $ANTLR end "rule__AndForm__Group_1__1"


    // $ANTLR start "rule__AndForm__Group_1__1__Impl"
    // InternalDSLSAT.g:854:1: rule__AndForm__Group_1__1__Impl : ( '^' ) ;
    public final void rule__AndForm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:858:1: ( ( '^' ) )
            // InternalDSLSAT.g:859:1: ( '^' )
            {
            // InternalDSLSAT.g:859:1: ( '^' )
            // InternalDSLSAT.g:860:2: '^'
            {
             before(grammarAccess.getAndFormAccess().getCircumflexAccentKeyword_1_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAndFormAccess().getCircumflexAccentKeyword_1_1()); 

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
    // $ANTLR end "rule__AndForm__Group_1__1__Impl"


    // $ANTLR start "rule__AndForm__Group_1__2"
    // InternalDSLSAT.g:869:1: rule__AndForm__Group_1__2 : rule__AndForm__Group_1__2__Impl ;
    public final void rule__AndForm__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:873:1: ( rule__AndForm__Group_1__2__Impl )
            // InternalDSLSAT.g:874:2: rule__AndForm__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndForm__Group_1__2__Impl();

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
    // $ANTLR end "rule__AndForm__Group_1__2"


    // $ANTLR start "rule__AndForm__Group_1__2__Impl"
    // InternalDSLSAT.g:880:1: rule__AndForm__Group_1__2__Impl : ( ( rule__AndForm__RightAssignment_1_2 ) ) ;
    public final void rule__AndForm__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:884:1: ( ( ( rule__AndForm__RightAssignment_1_2 ) ) )
            // InternalDSLSAT.g:885:1: ( ( rule__AndForm__RightAssignment_1_2 ) )
            {
            // InternalDSLSAT.g:885:1: ( ( rule__AndForm__RightAssignment_1_2 ) )
            // InternalDSLSAT.g:886:2: ( rule__AndForm__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndFormAccess().getRightAssignment_1_2()); 
            // InternalDSLSAT.g:887:2: ( rule__AndForm__RightAssignment_1_2 )
            // InternalDSLSAT.g:887:3: rule__AndForm__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndForm__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndFormAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__AndForm__Group_1__2__Impl"


    // $ANTLR start "rule__NandForm__Group__0"
    // InternalDSLSAT.g:896:1: rule__NandForm__Group__0 : rule__NandForm__Group__0__Impl rule__NandForm__Group__1 ;
    public final void rule__NandForm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:900:1: ( rule__NandForm__Group__0__Impl rule__NandForm__Group__1 )
            // InternalDSLSAT.g:901:2: rule__NandForm__Group__0__Impl rule__NandForm__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__NandForm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NandForm__Group__1();

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
    // $ANTLR end "rule__NandForm__Group__0"


    // $ANTLR start "rule__NandForm__Group__0__Impl"
    // InternalDSLSAT.g:908:1: rule__NandForm__Group__0__Impl : ( ruleForm ) ;
    public final void rule__NandForm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:912:1: ( ( ruleForm ) )
            // InternalDSLSAT.g:913:1: ( ruleForm )
            {
            // InternalDSLSAT.g:913:1: ( ruleForm )
            // InternalDSLSAT.g:914:2: ruleForm
            {
             before(grammarAccess.getNandFormAccess().getFormParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getNandFormAccess().getFormParserRuleCall_0()); 

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
    // $ANTLR end "rule__NandForm__Group__0__Impl"


    // $ANTLR start "rule__NandForm__Group__1"
    // InternalDSLSAT.g:923:1: rule__NandForm__Group__1 : rule__NandForm__Group__1__Impl ;
    public final void rule__NandForm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:927:1: ( rule__NandForm__Group__1__Impl )
            // InternalDSLSAT.g:928:2: rule__NandForm__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NandForm__Group__1__Impl();

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
    // $ANTLR end "rule__NandForm__Group__1"


    // $ANTLR start "rule__NandForm__Group__1__Impl"
    // InternalDSLSAT.g:934:1: rule__NandForm__Group__1__Impl : ( ( rule__NandForm__Group_1__0 )* ) ;
    public final void rule__NandForm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:938:1: ( ( ( rule__NandForm__Group_1__0 )* ) )
            // InternalDSLSAT.g:939:1: ( ( rule__NandForm__Group_1__0 )* )
            {
            // InternalDSLSAT.g:939:1: ( ( rule__NandForm__Group_1__0 )* )
            // InternalDSLSAT.g:940:2: ( rule__NandForm__Group_1__0 )*
            {
             before(grammarAccess.getNandFormAccess().getGroup_1()); 
            // InternalDSLSAT.g:941:2: ( rule__NandForm__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDSLSAT.g:941:3: rule__NandForm__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__NandForm__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getNandFormAccess().getGroup_1()); 

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
    // $ANTLR end "rule__NandForm__Group__1__Impl"


    // $ANTLR start "rule__NandForm__Group_1__0"
    // InternalDSLSAT.g:950:1: rule__NandForm__Group_1__0 : rule__NandForm__Group_1__0__Impl rule__NandForm__Group_1__1 ;
    public final void rule__NandForm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:954:1: ( rule__NandForm__Group_1__0__Impl rule__NandForm__Group_1__1 )
            // InternalDSLSAT.g:955:2: rule__NandForm__Group_1__0__Impl rule__NandForm__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__NandForm__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NandForm__Group_1__1();

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
    // $ANTLR end "rule__NandForm__Group_1__0"


    // $ANTLR start "rule__NandForm__Group_1__0__Impl"
    // InternalDSLSAT.g:962:1: rule__NandForm__Group_1__0__Impl : ( () ) ;
    public final void rule__NandForm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:966:1: ( ( () ) )
            // InternalDSLSAT.g:967:1: ( () )
            {
            // InternalDSLSAT.g:967:1: ( () )
            // InternalDSLSAT.g:968:2: ()
            {
             before(grammarAccess.getNandFormAccess().getNandFormLeftAction_1_0()); 
            // InternalDSLSAT.g:969:2: ()
            // InternalDSLSAT.g:969:3: 
            {
            }

             after(grammarAccess.getNandFormAccess().getNandFormLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NandForm__Group_1__0__Impl"


    // $ANTLR start "rule__NandForm__Group_1__1"
    // InternalDSLSAT.g:977:1: rule__NandForm__Group_1__1 : rule__NandForm__Group_1__1__Impl rule__NandForm__Group_1__2 ;
    public final void rule__NandForm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:981:1: ( rule__NandForm__Group_1__1__Impl rule__NandForm__Group_1__2 )
            // InternalDSLSAT.g:982:2: rule__NandForm__Group_1__1__Impl rule__NandForm__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__NandForm__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NandForm__Group_1__2();

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
    // $ANTLR end "rule__NandForm__Group_1__1"


    // $ANTLR start "rule__NandForm__Group_1__1__Impl"
    // InternalDSLSAT.g:989:1: rule__NandForm__Group_1__1__Impl : ( '|' ) ;
    public final void rule__NandForm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:993:1: ( ( '|' ) )
            // InternalDSLSAT.g:994:1: ( '|' )
            {
            // InternalDSLSAT.g:994:1: ( '|' )
            // InternalDSLSAT.g:995:2: '|'
            {
             before(grammarAccess.getNandFormAccess().getVerticalLineKeyword_1_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNandFormAccess().getVerticalLineKeyword_1_1()); 

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
    // $ANTLR end "rule__NandForm__Group_1__1__Impl"


    // $ANTLR start "rule__NandForm__Group_1__2"
    // InternalDSLSAT.g:1004:1: rule__NandForm__Group_1__2 : rule__NandForm__Group_1__2__Impl ;
    public final void rule__NandForm__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1008:1: ( rule__NandForm__Group_1__2__Impl )
            // InternalDSLSAT.g:1009:2: rule__NandForm__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NandForm__Group_1__2__Impl();

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
    // $ANTLR end "rule__NandForm__Group_1__2"


    // $ANTLR start "rule__NandForm__Group_1__2__Impl"
    // InternalDSLSAT.g:1015:1: rule__NandForm__Group_1__2__Impl : ( ( rule__NandForm__RightAssignment_1_2 ) ) ;
    public final void rule__NandForm__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1019:1: ( ( ( rule__NandForm__RightAssignment_1_2 ) ) )
            // InternalDSLSAT.g:1020:1: ( ( rule__NandForm__RightAssignment_1_2 ) )
            {
            // InternalDSLSAT.g:1020:1: ( ( rule__NandForm__RightAssignment_1_2 ) )
            // InternalDSLSAT.g:1021:2: ( rule__NandForm__RightAssignment_1_2 )
            {
             before(grammarAccess.getNandFormAccess().getRightAssignment_1_2()); 
            // InternalDSLSAT.g:1022:2: ( rule__NandForm__RightAssignment_1_2 )
            // InternalDSLSAT.g:1022:3: rule__NandForm__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__NandForm__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getNandFormAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__NandForm__Group_1__2__Impl"


    // $ANTLR start "rule__Form__Group_3__0"
    // InternalDSLSAT.g:1031:1: rule__Form__Group_3__0 : rule__Form__Group_3__0__Impl rule__Form__Group_3__1 ;
    public final void rule__Form__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1035:1: ( rule__Form__Group_3__0__Impl rule__Form__Group_3__1 )
            // InternalDSLSAT.g:1036:2: rule__Form__Group_3__0__Impl rule__Form__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Form__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group_3__1();

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
    // $ANTLR end "rule__Form__Group_3__0"


    // $ANTLR start "rule__Form__Group_3__0__Impl"
    // InternalDSLSAT.g:1043:1: rule__Form__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Form__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1047:1: ( ( '(' ) )
            // InternalDSLSAT.g:1048:1: ( '(' )
            {
            // InternalDSLSAT.g:1048:1: ( '(' )
            // InternalDSLSAT.g:1049:2: '('
            {
             before(grammarAccess.getFormAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getLeftParenthesisKeyword_3_0()); 

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
    // $ANTLR end "rule__Form__Group_3__0__Impl"


    // $ANTLR start "rule__Form__Group_3__1"
    // InternalDSLSAT.g:1058:1: rule__Form__Group_3__1 : rule__Form__Group_3__1__Impl rule__Form__Group_3__2 ;
    public final void rule__Form__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1062:1: ( rule__Form__Group_3__1__Impl rule__Form__Group_3__2 )
            // InternalDSLSAT.g:1063:2: rule__Form__Group_3__1__Impl rule__Form__Group_3__2
            {
            pushFollow(FOLLOW_14);
            rule__Form__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group_3__2();

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
    // $ANTLR end "rule__Form__Group_3__1"


    // $ANTLR start "rule__Form__Group_3__1__Impl"
    // InternalDSLSAT.g:1070:1: rule__Form__Group_3__1__Impl : ( ( rule__Form__FAssignment_3_1 ) ) ;
    public final void rule__Form__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1074:1: ( ( ( rule__Form__FAssignment_3_1 ) ) )
            // InternalDSLSAT.g:1075:1: ( ( rule__Form__FAssignment_3_1 ) )
            {
            // InternalDSLSAT.g:1075:1: ( ( rule__Form__FAssignment_3_1 ) )
            // InternalDSLSAT.g:1076:2: ( rule__Form__FAssignment_3_1 )
            {
             before(grammarAccess.getFormAccess().getFAssignment_3_1()); 
            // InternalDSLSAT.g:1077:2: ( rule__Form__FAssignment_3_1 )
            // InternalDSLSAT.g:1077:3: rule__Form__FAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Form__FAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getFAssignment_3_1()); 

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
    // $ANTLR end "rule__Form__Group_3__1__Impl"


    // $ANTLR start "rule__Form__Group_3__2"
    // InternalDSLSAT.g:1085:1: rule__Form__Group_3__2 : rule__Form__Group_3__2__Impl ;
    public final void rule__Form__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1089:1: ( rule__Form__Group_3__2__Impl )
            // InternalDSLSAT.g:1090:2: rule__Form__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group_3__2__Impl();

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
    // $ANTLR end "rule__Form__Group_3__2"


    // $ANTLR start "rule__Form__Group_3__2__Impl"
    // InternalDSLSAT.g:1096:1: rule__Form__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Form__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1100:1: ( ( ')' ) )
            // InternalDSLSAT.g:1101:1: ( ')' )
            {
            // InternalDSLSAT.g:1101:1: ( ')' )
            // InternalDSLSAT.g:1102:2: ')'
            {
             before(grammarAccess.getFormAccess().getRightParenthesisKeyword_3_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getRightParenthesisKeyword_3_2()); 

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
    // $ANTLR end "rule__Form__Group_3__2__Impl"


    // $ANTLR start "rule__NotForm__Group__0"
    // InternalDSLSAT.g:1112:1: rule__NotForm__Group__0 : rule__NotForm__Group__0__Impl rule__NotForm__Group__1 ;
    public final void rule__NotForm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1116:1: ( rule__NotForm__Group__0__Impl rule__NotForm__Group__1 )
            // InternalDSLSAT.g:1117:2: rule__NotForm__Group__0__Impl rule__NotForm__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__NotForm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotForm__Group__1();

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
    // $ANTLR end "rule__NotForm__Group__0"


    // $ANTLR start "rule__NotForm__Group__0__Impl"
    // InternalDSLSAT.g:1124:1: rule__NotForm__Group__0__Impl : ( '!' ) ;
    public final void rule__NotForm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1128:1: ( ( '!' ) )
            // InternalDSLSAT.g:1129:1: ( '!' )
            {
            // InternalDSLSAT.g:1129:1: ( '!' )
            // InternalDSLSAT.g:1130:2: '!'
            {
             before(grammarAccess.getNotFormAccess().getExclamationMarkKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNotFormAccess().getExclamationMarkKeyword_0()); 

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
    // $ANTLR end "rule__NotForm__Group__0__Impl"


    // $ANTLR start "rule__NotForm__Group__1"
    // InternalDSLSAT.g:1139:1: rule__NotForm__Group__1 : rule__NotForm__Group__1__Impl rule__NotForm__Group__2 ;
    public final void rule__NotForm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1143:1: ( rule__NotForm__Group__1__Impl rule__NotForm__Group__2 )
            // InternalDSLSAT.g:1144:2: rule__NotForm__Group__1__Impl rule__NotForm__Group__2
            {
            pushFollow(FOLLOW_1);
            rule__NotForm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotForm__Group__2();

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
    // $ANTLR end "rule__NotForm__Group__1"


    // $ANTLR start "rule__NotForm__Group__1__Impl"
    // InternalDSLSAT.g:1151:1: rule__NotForm__Group__1__Impl : ( ruleForm ) ;
    public final void rule__NotForm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1155:1: ( ( ruleForm ) )
            // InternalDSLSAT.g:1156:1: ( ruleForm )
            {
            // InternalDSLSAT.g:1156:1: ( ruleForm )
            // InternalDSLSAT.g:1157:2: ruleForm
            {
             before(grammarAccess.getNotFormAccess().getFormParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getNotFormAccess().getFormParserRuleCall_1()); 

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
    // $ANTLR end "rule__NotForm__Group__1__Impl"


    // $ANTLR start "rule__NotForm__Group__2"
    // InternalDSLSAT.g:1166:1: rule__NotForm__Group__2 : rule__NotForm__Group__2__Impl ;
    public final void rule__NotForm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1170:1: ( rule__NotForm__Group__2__Impl )
            // InternalDSLSAT.g:1171:2: rule__NotForm__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotForm__Group__2__Impl();

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
    // $ANTLR end "rule__NotForm__Group__2"


    // $ANTLR start "rule__NotForm__Group__2__Impl"
    // InternalDSLSAT.g:1177:1: rule__NotForm__Group__2__Impl : ( () ) ;
    public final void rule__NotForm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1181:1: ( ( () ) )
            // InternalDSLSAT.g:1182:1: ( () )
            {
            // InternalDSLSAT.g:1182:1: ( () )
            // InternalDSLSAT.g:1183:2: ()
            {
             before(grammarAccess.getNotFormAccess().getNotFormFormAction_2()); 
            // InternalDSLSAT.g:1184:2: ()
            // InternalDSLSAT.g:1184:3: 
            {
            }

             after(grammarAccess.getNotFormAccess().getNotFormFormAction_2()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotForm__Group__2__Impl"


    // $ANTLR start "rule__BiImplForm__RightAssignment_1_2"
    // InternalDSLSAT.g:1193:1: rule__BiImplForm__RightAssignment_1_2 : ( ruleImplForm ) ;
    public final void rule__BiImplForm__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1197:1: ( ( ruleImplForm ) )
            // InternalDSLSAT.g:1198:2: ( ruleImplForm )
            {
            // InternalDSLSAT.g:1198:2: ( ruleImplForm )
            // InternalDSLSAT.g:1199:3: ruleImplForm
            {
             before(grammarAccess.getBiImplFormAccess().getRightImplFormParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleImplForm();

            state._fsp--;

             after(grammarAccess.getBiImplFormAccess().getRightImplFormParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__BiImplForm__RightAssignment_1_2"


    // $ANTLR start "rule__ImplForm__RightAssignment_1_2"
    // InternalDSLSAT.g:1208:1: rule__ImplForm__RightAssignment_1_2 : ( ruleOrForm ) ;
    public final void rule__ImplForm__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1212:1: ( ( ruleOrForm ) )
            // InternalDSLSAT.g:1213:2: ( ruleOrForm )
            {
            // InternalDSLSAT.g:1213:2: ( ruleOrForm )
            // InternalDSLSAT.g:1214:3: ruleOrForm
            {
             before(grammarAccess.getImplFormAccess().getRightOrFormParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrForm();

            state._fsp--;

             after(grammarAccess.getImplFormAccess().getRightOrFormParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ImplForm__RightAssignment_1_2"


    // $ANTLR start "rule__OrForm__RightAssignment_1_2"
    // InternalDSLSAT.g:1223:1: rule__OrForm__RightAssignment_1_2 : ( ruleAndForm ) ;
    public final void rule__OrForm__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1227:1: ( ( ruleAndForm ) )
            // InternalDSLSAT.g:1228:2: ( ruleAndForm )
            {
            // InternalDSLSAT.g:1228:2: ( ruleAndForm )
            // InternalDSLSAT.g:1229:3: ruleAndForm
            {
             before(grammarAccess.getOrFormAccess().getRightAndFormParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndForm();

            state._fsp--;

             after(grammarAccess.getOrFormAccess().getRightAndFormParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__OrForm__RightAssignment_1_2"


    // $ANTLR start "rule__AndForm__RightAssignment_1_2"
    // InternalDSLSAT.g:1238:1: rule__AndForm__RightAssignment_1_2 : ( ruleNandForm ) ;
    public final void rule__AndForm__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1242:1: ( ( ruleNandForm ) )
            // InternalDSLSAT.g:1243:2: ( ruleNandForm )
            {
            // InternalDSLSAT.g:1243:2: ( ruleNandForm )
            // InternalDSLSAT.g:1244:3: ruleNandForm
            {
             before(grammarAccess.getAndFormAccess().getRightNandFormParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNandForm();

            state._fsp--;

             after(grammarAccess.getAndFormAccess().getRightNandFormParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__AndForm__RightAssignment_1_2"


    // $ANTLR start "rule__NandForm__RightAssignment_1_2"
    // InternalDSLSAT.g:1253:1: rule__NandForm__RightAssignment_1_2 : ( ruleForm ) ;
    public final void rule__NandForm__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1257:1: ( ( ruleForm ) )
            // InternalDSLSAT.g:1258:2: ( ruleForm )
            {
            // InternalDSLSAT.g:1258:2: ( ruleForm )
            // InternalDSLSAT.g:1259:3: ruleForm
            {
             before(grammarAccess.getNandFormAccess().getRightFormParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getNandFormAccess().getRightFormParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__NandForm__RightAssignment_1_2"


    // $ANTLR start "rule__Form__FAssignment_0"
    // InternalDSLSAT.g:1268:1: rule__Form__FAssignment_0 : ( ruleConst ) ;
    public final void rule__Form__FAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1272:1: ( ( ruleConst ) )
            // InternalDSLSAT.g:1273:2: ( ruleConst )
            {
            // InternalDSLSAT.g:1273:2: ( ruleConst )
            // InternalDSLSAT.g:1274:3: ruleConst
            {
             before(grammarAccess.getFormAccess().getFConstParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConst();

            state._fsp--;

             after(grammarAccess.getFormAccess().getFConstParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Form__FAssignment_0"


    // $ANTLR start "rule__Form__FAssignment_1"
    // InternalDSLSAT.g:1283:1: rule__Form__FAssignment_1 : ( ruleVar ) ;
    public final void rule__Form__FAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1287:1: ( ( ruleVar ) )
            // InternalDSLSAT.g:1288:2: ( ruleVar )
            {
            // InternalDSLSAT.g:1288:2: ( ruleVar )
            // InternalDSLSAT.g:1289:3: ruleVar
            {
             before(grammarAccess.getFormAccess().getFVarParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getFormAccess().getFVarParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Form__FAssignment_1"


    // $ANTLR start "rule__Form__FAssignment_2"
    // InternalDSLSAT.g:1298:1: rule__Form__FAssignment_2 : ( ruleNotForm ) ;
    public final void rule__Form__FAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1302:1: ( ( ruleNotForm ) )
            // InternalDSLSAT.g:1303:2: ( ruleNotForm )
            {
            // InternalDSLSAT.g:1303:2: ( ruleNotForm )
            // InternalDSLSAT.g:1304:3: ruleNotForm
            {
             before(grammarAccess.getFormAccess().getFNotFormParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNotForm();

            state._fsp--;

             after(grammarAccess.getFormAccess().getFNotFormParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Form__FAssignment_2"


    // $ANTLR start "rule__Form__FAssignment_3_1"
    // InternalDSLSAT.g:1313:1: rule__Form__FAssignment_3_1 : ( ruleBiImplForm ) ;
    public final void rule__Form__FAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1317:1: ( ( ruleBiImplForm ) )
            // InternalDSLSAT.g:1318:2: ( ruleBiImplForm )
            {
            // InternalDSLSAT.g:1318:2: ( ruleBiImplForm )
            // InternalDSLSAT.g:1319:3: ruleBiImplForm
            {
             before(grammarAccess.getFormAccess().getFBiImplFormParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBiImplForm();

            state._fsp--;

             after(grammarAccess.getFormAccess().getFBiImplFormParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Form__FAssignment_3_1"


    // $ANTLR start "rule__Var__IdAssignment"
    // InternalDSLSAT.g:1328:1: rule__Var__IdAssignment : ( RULE_LOWID ) ;
    public final void rule__Var__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1332:1: ( ( RULE_LOWID ) )
            // InternalDSLSAT.g:1333:2: ( RULE_LOWID )
            {
            // InternalDSLSAT.g:1333:2: ( RULE_LOWID )
            // InternalDSLSAT.g:1334:3: RULE_LOWID
            {
             before(grammarAccess.getVarAccess().getIdLOWIDTerminalRuleCall_0()); 
            match(input,RULE_LOWID,FOLLOW_2); 
             after(grammarAccess.getVarAccess().getIdLOWIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Var__IdAssignment"


    // $ANTLR start "rule__Const__ValAssignment"
    // InternalDSLSAT.g:1343:1: rule__Const__ValAssignment : ( ( rule__Const__ValAlternatives_0 ) ) ;
    public final void rule__Const__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1347:1: ( ( ( rule__Const__ValAlternatives_0 ) ) )
            // InternalDSLSAT.g:1348:2: ( ( rule__Const__ValAlternatives_0 ) )
            {
            // InternalDSLSAT.g:1348:2: ( ( rule__Const__ValAlternatives_0 ) )
            // InternalDSLSAT.g:1349:3: ( rule__Const__ValAlternatives_0 )
            {
             before(grammarAccess.getConstAccess().getValAlternatives_0()); 
            // InternalDSLSAT.g:1350:3: ( rule__Const__ValAlternatives_0 )
            // InternalDSLSAT.g:1350:4: rule__Const__ValAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Const__ValAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getConstAccess().getValAlternatives_0()); 

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
    // $ANTLR end "rule__Const__ValAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000283010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});

}