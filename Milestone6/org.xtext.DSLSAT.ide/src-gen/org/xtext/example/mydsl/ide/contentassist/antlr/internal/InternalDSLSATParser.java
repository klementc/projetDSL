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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_LOWID", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SAT4J'", "'MINISAT'", "'true'", "'false'", "'FromFile'", "'#SOLVER'", "'<=>'", "'=>'", "'v'", "'^'", "'|'", "'('", "')'", "'!'", "'Check'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int RULE_LOWID=5;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
    // InternalDSLSAT.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalDSLSAT.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalDSLSAT.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalDSLSAT.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalDSLSAT.g:69:3: ( rule__Model__Group__0 )
            // InternalDSLSAT.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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


    // $ANTLR start "entryRuleAnnotation"
    // InternalDSLSAT.g:78:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // InternalDSLSAT.g:79:1: ( ruleAnnotation EOF )
            // InternalDSLSAT.g:80:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_1);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalDSLSAT.g:87:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:91:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // InternalDSLSAT.g:92:2: ( ( rule__Annotation__Group__0 ) )
            {
            // InternalDSLSAT.g:92:2: ( ( rule__Annotation__Group__0 ) )
            // InternalDSLSAT.g:93:3: ( rule__Annotation__Group__0 )
            {
             before(grammarAccess.getAnnotationAccess().getGroup()); 
            // InternalDSLSAT.g:94:3: ( rule__Annotation__Group__0 )
            // InternalDSLSAT.g:94:4: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getGroup()); 

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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleBiImplForm"
    // InternalDSLSAT.g:103:1: entryRuleBiImplForm : ruleBiImplForm EOF ;
    public final void entryRuleBiImplForm() throws RecognitionException {
        try {
            // InternalDSLSAT.g:104:1: ( ruleBiImplForm EOF )
            // InternalDSLSAT.g:105:1: ruleBiImplForm EOF
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
    // InternalDSLSAT.g:112:1: ruleBiImplForm : ( ( rule__BiImplForm__Group__0 ) ) ;
    public final void ruleBiImplForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:116:2: ( ( ( rule__BiImplForm__Group__0 ) ) )
            // InternalDSLSAT.g:117:2: ( ( rule__BiImplForm__Group__0 ) )
            {
            // InternalDSLSAT.g:117:2: ( ( rule__BiImplForm__Group__0 ) )
            // InternalDSLSAT.g:118:3: ( rule__BiImplForm__Group__0 )
            {
             before(grammarAccess.getBiImplFormAccess().getGroup()); 
            // InternalDSLSAT.g:119:3: ( rule__BiImplForm__Group__0 )
            // InternalDSLSAT.g:119:4: rule__BiImplForm__Group__0
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
    // InternalDSLSAT.g:128:1: entryRuleImplForm : ruleImplForm EOF ;
    public final void entryRuleImplForm() throws RecognitionException {
        try {
            // InternalDSLSAT.g:129:1: ( ruleImplForm EOF )
            // InternalDSLSAT.g:130:1: ruleImplForm EOF
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
    // InternalDSLSAT.g:137:1: ruleImplForm : ( ( rule__ImplForm__Group__0 ) ) ;
    public final void ruleImplForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:141:2: ( ( ( rule__ImplForm__Group__0 ) ) )
            // InternalDSLSAT.g:142:2: ( ( rule__ImplForm__Group__0 ) )
            {
            // InternalDSLSAT.g:142:2: ( ( rule__ImplForm__Group__0 ) )
            // InternalDSLSAT.g:143:3: ( rule__ImplForm__Group__0 )
            {
             before(grammarAccess.getImplFormAccess().getGroup()); 
            // InternalDSLSAT.g:144:3: ( rule__ImplForm__Group__0 )
            // InternalDSLSAT.g:144:4: rule__ImplForm__Group__0
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
    // InternalDSLSAT.g:153:1: entryRuleOrForm : ruleOrForm EOF ;
    public final void entryRuleOrForm() throws RecognitionException {
        try {
            // InternalDSLSAT.g:154:1: ( ruleOrForm EOF )
            // InternalDSLSAT.g:155:1: ruleOrForm EOF
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
    // InternalDSLSAT.g:162:1: ruleOrForm : ( ( rule__OrForm__Group__0 ) ) ;
    public final void ruleOrForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:166:2: ( ( ( rule__OrForm__Group__0 ) ) )
            // InternalDSLSAT.g:167:2: ( ( rule__OrForm__Group__0 ) )
            {
            // InternalDSLSAT.g:167:2: ( ( rule__OrForm__Group__0 ) )
            // InternalDSLSAT.g:168:3: ( rule__OrForm__Group__0 )
            {
             before(grammarAccess.getOrFormAccess().getGroup()); 
            // InternalDSLSAT.g:169:3: ( rule__OrForm__Group__0 )
            // InternalDSLSAT.g:169:4: rule__OrForm__Group__0
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
    // InternalDSLSAT.g:178:1: entryRuleAndForm : ruleAndForm EOF ;
    public final void entryRuleAndForm() throws RecognitionException {
        try {
            // InternalDSLSAT.g:179:1: ( ruleAndForm EOF )
            // InternalDSLSAT.g:180:1: ruleAndForm EOF
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
    // InternalDSLSAT.g:187:1: ruleAndForm : ( ( rule__AndForm__Group__0 ) ) ;
    public final void ruleAndForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:191:2: ( ( ( rule__AndForm__Group__0 ) ) )
            // InternalDSLSAT.g:192:2: ( ( rule__AndForm__Group__0 ) )
            {
            // InternalDSLSAT.g:192:2: ( ( rule__AndForm__Group__0 ) )
            // InternalDSLSAT.g:193:3: ( rule__AndForm__Group__0 )
            {
             before(grammarAccess.getAndFormAccess().getGroup()); 
            // InternalDSLSAT.g:194:3: ( rule__AndForm__Group__0 )
            // InternalDSLSAT.g:194:4: rule__AndForm__Group__0
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
    // InternalDSLSAT.g:203:1: entryRuleNandForm : ruleNandForm EOF ;
    public final void entryRuleNandForm() throws RecognitionException {
        try {
            // InternalDSLSAT.g:204:1: ( ruleNandForm EOF )
            // InternalDSLSAT.g:205:1: ruleNandForm EOF
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
    // InternalDSLSAT.g:212:1: ruleNandForm : ( ( rule__NandForm__Group__0 ) ) ;
    public final void ruleNandForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:216:2: ( ( ( rule__NandForm__Group__0 ) ) )
            // InternalDSLSAT.g:217:2: ( ( rule__NandForm__Group__0 ) )
            {
            // InternalDSLSAT.g:217:2: ( ( rule__NandForm__Group__0 ) )
            // InternalDSLSAT.g:218:3: ( rule__NandForm__Group__0 )
            {
             before(grammarAccess.getNandFormAccess().getGroup()); 
            // InternalDSLSAT.g:219:3: ( rule__NandForm__Group__0 )
            // InternalDSLSAT.g:219:4: rule__NandForm__Group__0
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
    // InternalDSLSAT.g:228:1: entryRuleForm : ruleForm EOF ;
    public final void entryRuleForm() throws RecognitionException {
        try {
            // InternalDSLSAT.g:229:1: ( ruleForm EOF )
            // InternalDSLSAT.g:230:1: ruleForm EOF
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
    // InternalDSLSAT.g:237:1: ruleForm : ( ( rule__Form__Alternatives ) ) ;
    public final void ruleForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:241:2: ( ( ( rule__Form__Alternatives ) ) )
            // InternalDSLSAT.g:242:2: ( ( rule__Form__Alternatives ) )
            {
            // InternalDSLSAT.g:242:2: ( ( rule__Form__Alternatives ) )
            // InternalDSLSAT.g:243:3: ( rule__Form__Alternatives )
            {
             before(grammarAccess.getFormAccess().getAlternatives()); 
            // InternalDSLSAT.g:244:3: ( rule__Form__Alternatives )
            // InternalDSLSAT.g:244:4: rule__Form__Alternatives
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
    // InternalDSLSAT.g:253:1: entryRuleNotForm : ruleNotForm EOF ;
    public final void entryRuleNotForm() throws RecognitionException {
        try {
            // InternalDSLSAT.g:254:1: ( ruleNotForm EOF )
            // InternalDSLSAT.g:255:1: ruleNotForm EOF
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
    // InternalDSLSAT.g:262:1: ruleNotForm : ( ( rule__NotForm__Group__0 ) ) ;
    public final void ruleNotForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:266:2: ( ( ( rule__NotForm__Group__0 ) ) )
            // InternalDSLSAT.g:267:2: ( ( rule__NotForm__Group__0 ) )
            {
            // InternalDSLSAT.g:267:2: ( ( rule__NotForm__Group__0 ) )
            // InternalDSLSAT.g:268:3: ( rule__NotForm__Group__0 )
            {
             before(grammarAccess.getNotFormAccess().getGroup()); 
            // InternalDSLSAT.g:269:3: ( rule__NotForm__Group__0 )
            // InternalDSLSAT.g:269:4: rule__NotForm__Group__0
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
    // InternalDSLSAT.g:278:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // InternalDSLSAT.g:279:1: ( ruleVar EOF )
            // InternalDSLSAT.g:280:1: ruleVar EOF
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
    // InternalDSLSAT.g:287:1: ruleVar : ( ( rule__Var__IdAssignment ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:291:2: ( ( ( rule__Var__IdAssignment ) ) )
            // InternalDSLSAT.g:292:2: ( ( rule__Var__IdAssignment ) )
            {
            // InternalDSLSAT.g:292:2: ( ( rule__Var__IdAssignment ) )
            // InternalDSLSAT.g:293:3: ( rule__Var__IdAssignment )
            {
             before(grammarAccess.getVarAccess().getIdAssignment()); 
            // InternalDSLSAT.g:294:3: ( rule__Var__IdAssignment )
            // InternalDSLSAT.g:294:4: rule__Var__IdAssignment
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
    // InternalDSLSAT.g:303:1: entryRuleConst : ruleConst EOF ;
    public final void entryRuleConst() throws RecognitionException {
        try {
            // InternalDSLSAT.g:304:1: ( ruleConst EOF )
            // InternalDSLSAT.g:305:1: ruleConst EOF
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
    // InternalDSLSAT.g:312:1: ruleConst : ( ( rule__Const__ValAssignment ) ) ;
    public final void ruleConst() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:316:2: ( ( ( rule__Const__ValAssignment ) ) )
            // InternalDSLSAT.g:317:2: ( ( rule__Const__ValAssignment ) )
            {
            // InternalDSLSAT.g:317:2: ( ( rule__Const__ValAssignment ) )
            // InternalDSLSAT.g:318:3: ( rule__Const__ValAssignment )
            {
             before(grammarAccess.getConstAccess().getValAssignment()); 
            // InternalDSLSAT.g:319:3: ( rule__Const__ValAssignment )
            // InternalDSLSAT.g:319:4: rule__Const__ValAssignment
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


    // $ANTLR start "rule__Model__Alternatives_2"
    // InternalDSLSAT.g:327:1: rule__Model__Alternatives_2 : ( ( ( rule__Model__FormAssignment_2_0 ) ) | ( ( rule__Model__Group_2_1__0 ) ) );
    public final void rule__Model__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:331:1: ( ( ( rule__Model__FormAssignment_2_0 ) ) | ( ( rule__Model__Group_2_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_LOWID||(LA1_0>=14 && LA1_0<=15)||LA1_0==23||LA1_0==25) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDSLSAT.g:332:2: ( ( rule__Model__FormAssignment_2_0 ) )
                    {
                    // InternalDSLSAT.g:332:2: ( ( rule__Model__FormAssignment_2_0 ) )
                    // InternalDSLSAT.g:333:3: ( rule__Model__FormAssignment_2_0 )
                    {
                     before(grammarAccess.getModelAccess().getFormAssignment_2_0()); 
                    // InternalDSLSAT.g:334:3: ( rule__Model__FormAssignment_2_0 )
                    // InternalDSLSAT.g:334:4: rule__Model__FormAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__FormAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getFormAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSLSAT.g:338:2: ( ( rule__Model__Group_2_1__0 ) )
                    {
                    // InternalDSLSAT.g:338:2: ( ( rule__Model__Group_2_1__0 ) )
                    // InternalDSLSAT.g:339:3: ( rule__Model__Group_2_1__0 )
                    {
                     before(grammarAccess.getModelAccess().getGroup_2_1()); 
                    // InternalDSLSAT.g:340:3: ( rule__Model__Group_2_1__0 )
                    // InternalDSLSAT.g:340:4: rule__Model__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Model__Alternatives_2"


    // $ANTLR start "rule__Annotation__SolverAlternatives_1_0"
    // InternalDSLSAT.g:348:1: rule__Annotation__SolverAlternatives_1_0 : ( ( 'SAT4J' ) | ( 'MINISAT' ) );
    public final void rule__Annotation__SolverAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:352:1: ( ( 'SAT4J' ) | ( 'MINISAT' ) )
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
                    // InternalDSLSAT.g:353:2: ( 'SAT4J' )
                    {
                    // InternalDSLSAT.g:353:2: ( 'SAT4J' )
                    // InternalDSLSAT.g:354:3: 'SAT4J'
                    {
                     before(grammarAccess.getAnnotationAccess().getSolverSAT4JKeyword_1_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAnnotationAccess().getSolverSAT4JKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSLSAT.g:359:2: ( 'MINISAT' )
                    {
                    // InternalDSLSAT.g:359:2: ( 'MINISAT' )
                    // InternalDSLSAT.g:360:3: 'MINISAT'
                    {
                     before(grammarAccess.getAnnotationAccess().getSolverMINISATKeyword_1_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAnnotationAccess().getSolverMINISATKeyword_1_0_1()); 

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
    // $ANTLR end "rule__Annotation__SolverAlternatives_1_0"


    // $ANTLR start "rule__Form__Alternatives"
    // InternalDSLSAT.g:369:1: rule__Form__Alternatives : ( ( ( rule__Form__FormAssignment_0 ) ) | ( ( rule__Form__FormAssignment_1 ) ) | ( ( rule__Form__FormAssignment_2 ) ) | ( ( rule__Form__Group_3__0 ) ) );
    public final void rule__Form__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:373:1: ( ( ( rule__Form__FormAssignment_0 ) ) | ( ( rule__Form__FormAssignment_1 ) ) | ( ( rule__Form__FormAssignment_2 ) ) | ( ( rule__Form__Group_3__0 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 14:
            case 15:
                {
                alt3=1;
                }
                break;
            case RULE_LOWID:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            case 23:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDSLSAT.g:374:2: ( ( rule__Form__FormAssignment_0 ) )
                    {
                    // InternalDSLSAT.g:374:2: ( ( rule__Form__FormAssignment_0 ) )
                    // InternalDSLSAT.g:375:3: ( rule__Form__FormAssignment_0 )
                    {
                     before(grammarAccess.getFormAccess().getFormAssignment_0()); 
                    // InternalDSLSAT.g:376:3: ( rule__Form__FormAssignment_0 )
                    // InternalDSLSAT.g:376:4: rule__Form__FormAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Form__FormAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormAccess().getFormAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSLSAT.g:380:2: ( ( rule__Form__FormAssignment_1 ) )
                    {
                    // InternalDSLSAT.g:380:2: ( ( rule__Form__FormAssignment_1 ) )
                    // InternalDSLSAT.g:381:3: ( rule__Form__FormAssignment_1 )
                    {
                     before(grammarAccess.getFormAccess().getFormAssignment_1()); 
                    // InternalDSLSAT.g:382:3: ( rule__Form__FormAssignment_1 )
                    // InternalDSLSAT.g:382:4: rule__Form__FormAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Form__FormAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormAccess().getFormAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSLSAT.g:386:2: ( ( rule__Form__FormAssignment_2 ) )
                    {
                    // InternalDSLSAT.g:386:2: ( ( rule__Form__FormAssignment_2 ) )
                    // InternalDSLSAT.g:387:3: ( rule__Form__FormAssignment_2 )
                    {
                     before(grammarAccess.getFormAccess().getFormAssignment_2()); 
                    // InternalDSLSAT.g:388:3: ( rule__Form__FormAssignment_2 )
                    // InternalDSLSAT.g:388:4: rule__Form__FormAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Form__FormAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormAccess().getFormAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSLSAT.g:392:2: ( ( rule__Form__Group_3__0 ) )
                    {
                    // InternalDSLSAT.g:392:2: ( ( rule__Form__Group_3__0 ) )
                    // InternalDSLSAT.g:393:3: ( rule__Form__Group_3__0 )
                    {
                     before(grammarAccess.getFormAccess().getGroup_3()); 
                    // InternalDSLSAT.g:394:3: ( rule__Form__Group_3__0 )
                    // InternalDSLSAT.g:394:4: rule__Form__Group_3__0
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
    // InternalDSLSAT.g:402:1: rule__Const__ValAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Const__ValAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:406:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDSLSAT.g:407:2: ( 'true' )
                    {
                    // InternalDSLSAT.g:407:2: ( 'true' )
                    // InternalDSLSAT.g:408:3: 'true'
                    {
                     before(grammarAccess.getConstAccess().getValTrueKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getConstAccess().getValTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSLSAT.g:413:2: ( 'false' )
                    {
                    // InternalDSLSAT.g:413:2: ( 'false' )
                    // InternalDSLSAT.g:414:3: 'false'
                    {
                     before(grammarAccess.getConstAccess().getValFalseKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
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


    // $ANTLR start "rule__Model__Group__0"
    // InternalDSLSAT.g:423:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:427:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDSLSAT.g:428:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalDSLSAT.g:435:1: rule__Model__Group__0__Impl : ( ( rule__Model__AnnotAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:439:1: ( ( ( rule__Model__AnnotAssignment_0 )? ) )
            // InternalDSLSAT.g:440:1: ( ( rule__Model__AnnotAssignment_0 )? )
            {
            // InternalDSLSAT.g:440:1: ( ( rule__Model__AnnotAssignment_0 )? )
            // InternalDSLSAT.g:441:2: ( rule__Model__AnnotAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getAnnotAssignment_0()); 
            // InternalDSLSAT.g:442:2: ( rule__Model__AnnotAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDSLSAT.g:442:3: rule__Model__AnnotAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__AnnotAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getAnnotAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalDSLSAT.g:450:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:454:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalDSLSAT.g:455:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalDSLSAT.g:462:1: rule__Model__Group__1__Impl : ( ( rule__Model__XheckAssignment_1 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:466:1: ( ( ( rule__Model__XheckAssignment_1 )? ) )
            // InternalDSLSAT.g:467:1: ( ( rule__Model__XheckAssignment_1 )? )
            {
            // InternalDSLSAT.g:467:1: ( ( rule__Model__XheckAssignment_1 )? )
            // InternalDSLSAT.g:468:2: ( rule__Model__XheckAssignment_1 )?
            {
             before(grammarAccess.getModelAccess().getXheckAssignment_1()); 
            // InternalDSLSAT.g:469:2: ( rule__Model__XheckAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDSLSAT.g:469:3: rule__Model__XheckAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__XheckAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getXheckAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalDSLSAT.g:477:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:481:1: ( rule__Model__Group__2__Impl )
            // InternalDSLSAT.g:482:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalDSLSAT.g:488:1: rule__Model__Group__2__Impl : ( ( rule__Model__Alternatives_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:492:1: ( ( ( rule__Model__Alternatives_2 ) ) )
            // InternalDSLSAT.g:493:1: ( ( rule__Model__Alternatives_2 ) )
            {
            // InternalDSLSAT.g:493:1: ( ( rule__Model__Alternatives_2 ) )
            // InternalDSLSAT.g:494:2: ( rule__Model__Alternatives_2 )
            {
             before(grammarAccess.getModelAccess().getAlternatives_2()); 
            // InternalDSLSAT.g:495:2: ( rule__Model__Alternatives_2 )
            // InternalDSLSAT.g:495:3: rule__Model__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group_2_1__0"
    // InternalDSLSAT.g:504:1: rule__Model__Group_2_1__0 : rule__Model__Group_2_1__0__Impl rule__Model__Group_2_1__1 ;
    public final void rule__Model__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:508:1: ( rule__Model__Group_2_1__0__Impl rule__Model__Group_2_1__1 )
            // InternalDSLSAT.g:509:2: rule__Model__Group_2_1__0__Impl rule__Model__Group_2_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_2_1__1();

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
    // $ANTLR end "rule__Model__Group_2_1__0"


    // $ANTLR start "rule__Model__Group_2_1__0__Impl"
    // InternalDSLSAT.g:516:1: rule__Model__Group_2_1__0__Impl : ( 'FromFile' ) ;
    public final void rule__Model__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:520:1: ( ( 'FromFile' ) )
            // InternalDSLSAT.g:521:1: ( 'FromFile' )
            {
            // InternalDSLSAT.g:521:1: ( 'FromFile' )
            // InternalDSLSAT.g:522:2: 'FromFile'
            {
             before(grammarAccess.getModelAccess().getFromFileKeyword_2_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFromFileKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Model__Group_2_1__0__Impl"


    // $ANTLR start "rule__Model__Group_2_1__1"
    // InternalDSLSAT.g:531:1: rule__Model__Group_2_1__1 : rule__Model__Group_2_1__1__Impl ;
    public final void rule__Model__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:535:1: ( rule__Model__Group_2_1__1__Impl )
            // InternalDSLSAT.g:536:2: rule__Model__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Model__Group_2_1__1"


    // $ANTLR start "rule__Model__Group_2_1__1__Impl"
    // InternalDSLSAT.g:542:1: rule__Model__Group_2_1__1__Impl : ( ( rule__Model__PathAssignment_2_1_1 ) ) ;
    public final void rule__Model__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:546:1: ( ( ( rule__Model__PathAssignment_2_1_1 ) ) )
            // InternalDSLSAT.g:547:1: ( ( rule__Model__PathAssignment_2_1_1 ) )
            {
            // InternalDSLSAT.g:547:1: ( ( rule__Model__PathAssignment_2_1_1 ) )
            // InternalDSLSAT.g:548:2: ( rule__Model__PathAssignment_2_1_1 )
            {
             before(grammarAccess.getModelAccess().getPathAssignment_2_1_1()); 
            // InternalDSLSAT.g:549:2: ( rule__Model__PathAssignment_2_1_1 )
            // InternalDSLSAT.g:549:3: rule__Model__PathAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__PathAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPathAssignment_2_1_1()); 

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
    // $ANTLR end "rule__Model__Group_2_1__1__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // InternalDSLSAT.g:558:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:562:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // InternalDSLSAT.g:563:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Annotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__1();

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
    // $ANTLR end "rule__Annotation__Group__0"


    // $ANTLR start "rule__Annotation__Group__0__Impl"
    // InternalDSLSAT.g:570:1: rule__Annotation__Group__0__Impl : ( '#SOLVER' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:574:1: ( ( '#SOLVER' ) )
            // InternalDSLSAT.g:575:1: ( '#SOLVER' )
            {
            // InternalDSLSAT.g:575:1: ( '#SOLVER' )
            // InternalDSLSAT.g:576:2: '#SOLVER'
            {
             before(grammarAccess.getAnnotationAccess().getSOLVERKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getSOLVERKeyword_0()); 

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
    // $ANTLR end "rule__Annotation__Group__0__Impl"


    // $ANTLR start "rule__Annotation__Group__1"
    // InternalDSLSAT.g:585:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:589:1: ( rule__Annotation__Group__1__Impl )
            // InternalDSLSAT.g:590:2: rule__Annotation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__1__Impl();

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
    // $ANTLR end "rule__Annotation__Group__1"


    // $ANTLR start "rule__Annotation__Group__1__Impl"
    // InternalDSLSAT.g:596:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__SolverAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:600:1: ( ( ( rule__Annotation__SolverAssignment_1 ) ) )
            // InternalDSLSAT.g:601:1: ( ( rule__Annotation__SolverAssignment_1 ) )
            {
            // InternalDSLSAT.g:601:1: ( ( rule__Annotation__SolverAssignment_1 ) )
            // InternalDSLSAT.g:602:2: ( rule__Annotation__SolverAssignment_1 )
            {
             before(grammarAccess.getAnnotationAccess().getSolverAssignment_1()); 
            // InternalDSLSAT.g:603:2: ( rule__Annotation__SolverAssignment_1 )
            // InternalDSLSAT.g:603:3: rule__Annotation__SolverAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__SolverAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getSolverAssignment_1()); 

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
    // $ANTLR end "rule__Annotation__Group__1__Impl"


    // $ANTLR start "rule__BiImplForm__Group__0"
    // InternalDSLSAT.g:612:1: rule__BiImplForm__Group__0 : rule__BiImplForm__Group__0__Impl rule__BiImplForm__Group__1 ;
    public final void rule__BiImplForm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:616:1: ( rule__BiImplForm__Group__0__Impl rule__BiImplForm__Group__1 )
            // InternalDSLSAT.g:617:2: rule__BiImplForm__Group__0__Impl rule__BiImplForm__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDSLSAT.g:624:1: rule__BiImplForm__Group__0__Impl : ( ruleImplForm ) ;
    public final void rule__BiImplForm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:628:1: ( ( ruleImplForm ) )
            // InternalDSLSAT.g:629:1: ( ruleImplForm )
            {
            // InternalDSLSAT.g:629:1: ( ruleImplForm )
            // InternalDSLSAT.g:630:2: ruleImplForm
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
    // InternalDSLSAT.g:639:1: rule__BiImplForm__Group__1 : rule__BiImplForm__Group__1__Impl ;
    public final void rule__BiImplForm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:643:1: ( rule__BiImplForm__Group__1__Impl )
            // InternalDSLSAT.g:644:2: rule__BiImplForm__Group__1__Impl
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
    // InternalDSLSAT.g:650:1: rule__BiImplForm__Group__1__Impl : ( ( rule__BiImplForm__Group_1__0 )* ) ;
    public final void rule__BiImplForm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:654:1: ( ( ( rule__BiImplForm__Group_1__0 )* ) )
            // InternalDSLSAT.g:655:1: ( ( rule__BiImplForm__Group_1__0 )* )
            {
            // InternalDSLSAT.g:655:1: ( ( rule__BiImplForm__Group_1__0 )* )
            // InternalDSLSAT.g:656:2: ( rule__BiImplForm__Group_1__0 )*
            {
             before(grammarAccess.getBiImplFormAccess().getGroup_1()); 
            // InternalDSLSAT.g:657:2: ( rule__BiImplForm__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDSLSAT.g:657:3: rule__BiImplForm__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BiImplForm__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalDSLSAT.g:666:1: rule__BiImplForm__Group_1__0 : rule__BiImplForm__Group_1__0__Impl rule__BiImplForm__Group_1__1 ;
    public final void rule__BiImplForm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:670:1: ( rule__BiImplForm__Group_1__0__Impl rule__BiImplForm__Group_1__1 )
            // InternalDSLSAT.g:671:2: rule__BiImplForm__Group_1__0__Impl rule__BiImplForm__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDSLSAT.g:678:1: rule__BiImplForm__Group_1__0__Impl : ( () ) ;
    public final void rule__BiImplForm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:682:1: ( ( () ) )
            // InternalDSLSAT.g:683:1: ( () )
            {
            // InternalDSLSAT.g:683:1: ( () )
            // InternalDSLSAT.g:684:2: ()
            {
             before(grammarAccess.getBiImplFormAccess().getBiImplFormLeftAction_1_0()); 
            // InternalDSLSAT.g:685:2: ()
            // InternalDSLSAT.g:685:3: 
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
    // InternalDSLSAT.g:693:1: rule__BiImplForm__Group_1__1 : rule__BiImplForm__Group_1__1__Impl rule__BiImplForm__Group_1__2 ;
    public final void rule__BiImplForm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:697:1: ( rule__BiImplForm__Group_1__1__Impl rule__BiImplForm__Group_1__2 )
            // InternalDSLSAT.g:698:2: rule__BiImplForm__Group_1__1__Impl rule__BiImplForm__Group_1__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalDSLSAT.g:705:1: rule__BiImplForm__Group_1__1__Impl : ( '<=>' ) ;
    public final void rule__BiImplForm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:709:1: ( ( '<=>' ) )
            // InternalDSLSAT.g:710:1: ( '<=>' )
            {
            // InternalDSLSAT.g:710:1: ( '<=>' )
            // InternalDSLSAT.g:711:2: '<=>'
            {
             before(grammarAccess.getBiImplFormAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDSLSAT.g:720:1: rule__BiImplForm__Group_1__2 : rule__BiImplForm__Group_1__2__Impl ;
    public final void rule__BiImplForm__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:724:1: ( rule__BiImplForm__Group_1__2__Impl )
            // InternalDSLSAT.g:725:2: rule__BiImplForm__Group_1__2__Impl
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
    // InternalDSLSAT.g:731:1: rule__BiImplForm__Group_1__2__Impl : ( ( rule__BiImplForm__RightAssignment_1_2 ) ) ;
    public final void rule__BiImplForm__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:735:1: ( ( ( rule__BiImplForm__RightAssignment_1_2 ) ) )
            // InternalDSLSAT.g:736:1: ( ( rule__BiImplForm__RightAssignment_1_2 ) )
            {
            // InternalDSLSAT.g:736:1: ( ( rule__BiImplForm__RightAssignment_1_2 ) )
            // InternalDSLSAT.g:737:2: ( rule__BiImplForm__RightAssignment_1_2 )
            {
             before(grammarAccess.getBiImplFormAccess().getRightAssignment_1_2()); 
            // InternalDSLSAT.g:738:2: ( rule__BiImplForm__RightAssignment_1_2 )
            // InternalDSLSAT.g:738:3: rule__BiImplForm__RightAssignment_1_2
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
    // InternalDSLSAT.g:747:1: rule__ImplForm__Group__0 : rule__ImplForm__Group__0__Impl rule__ImplForm__Group__1 ;
    public final void rule__ImplForm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:751:1: ( rule__ImplForm__Group__0__Impl rule__ImplForm__Group__1 )
            // InternalDSLSAT.g:752:2: rule__ImplForm__Group__0__Impl rule__ImplForm__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalDSLSAT.g:759:1: rule__ImplForm__Group__0__Impl : ( ruleOrForm ) ;
    public final void rule__ImplForm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:763:1: ( ( ruleOrForm ) )
            // InternalDSLSAT.g:764:1: ( ruleOrForm )
            {
            // InternalDSLSAT.g:764:1: ( ruleOrForm )
            // InternalDSLSAT.g:765:2: ruleOrForm
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
    // InternalDSLSAT.g:774:1: rule__ImplForm__Group__1 : rule__ImplForm__Group__1__Impl ;
    public final void rule__ImplForm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:778:1: ( rule__ImplForm__Group__1__Impl )
            // InternalDSLSAT.g:779:2: rule__ImplForm__Group__1__Impl
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
    // InternalDSLSAT.g:785:1: rule__ImplForm__Group__1__Impl : ( ( rule__ImplForm__Group_1__0 )* ) ;
    public final void rule__ImplForm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:789:1: ( ( ( rule__ImplForm__Group_1__0 )* ) )
            // InternalDSLSAT.g:790:1: ( ( rule__ImplForm__Group_1__0 )* )
            {
            // InternalDSLSAT.g:790:1: ( ( rule__ImplForm__Group_1__0 )* )
            // InternalDSLSAT.g:791:2: ( rule__ImplForm__Group_1__0 )*
            {
             before(grammarAccess.getImplFormAccess().getGroup_1()); 
            // InternalDSLSAT.g:792:2: ( rule__ImplForm__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDSLSAT.g:792:3: rule__ImplForm__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ImplForm__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalDSLSAT.g:801:1: rule__ImplForm__Group_1__0 : rule__ImplForm__Group_1__0__Impl rule__ImplForm__Group_1__1 ;
    public final void rule__ImplForm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:805:1: ( rule__ImplForm__Group_1__0__Impl rule__ImplForm__Group_1__1 )
            // InternalDSLSAT.g:806:2: rule__ImplForm__Group_1__0__Impl rule__ImplForm__Group_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalDSLSAT.g:813:1: rule__ImplForm__Group_1__0__Impl : ( () ) ;
    public final void rule__ImplForm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:817:1: ( ( () ) )
            // InternalDSLSAT.g:818:1: ( () )
            {
            // InternalDSLSAT.g:818:1: ( () )
            // InternalDSLSAT.g:819:2: ()
            {
             before(grammarAccess.getImplFormAccess().getImplFormLeftAction_1_0()); 
            // InternalDSLSAT.g:820:2: ()
            // InternalDSLSAT.g:820:3: 
            {
            }

             after(grammarAccess.getImplFormAccess().getImplFormLeftAction_1_0()); 

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
    // InternalDSLSAT.g:828:1: rule__ImplForm__Group_1__1 : rule__ImplForm__Group_1__1__Impl rule__ImplForm__Group_1__2 ;
    public final void rule__ImplForm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:832:1: ( rule__ImplForm__Group_1__1__Impl rule__ImplForm__Group_1__2 )
            // InternalDSLSAT.g:833:2: rule__ImplForm__Group_1__1__Impl rule__ImplForm__Group_1__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalDSLSAT.g:840:1: rule__ImplForm__Group_1__1__Impl : ( '=>' ) ;
    public final void rule__ImplForm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:844:1: ( ( '=>' ) )
            // InternalDSLSAT.g:845:1: ( '=>' )
            {
            // InternalDSLSAT.g:845:1: ( '=>' )
            // InternalDSLSAT.g:846:2: '=>'
            {
             before(grammarAccess.getImplFormAccess().getEqualsSignGreaterThanSignKeyword_1_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalDSLSAT.g:855:1: rule__ImplForm__Group_1__2 : rule__ImplForm__Group_1__2__Impl ;
    public final void rule__ImplForm__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:859:1: ( rule__ImplForm__Group_1__2__Impl )
            // InternalDSLSAT.g:860:2: rule__ImplForm__Group_1__2__Impl
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
    // InternalDSLSAT.g:866:1: rule__ImplForm__Group_1__2__Impl : ( ( rule__ImplForm__RightAssignment_1_2 ) ) ;
    public final void rule__ImplForm__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:870:1: ( ( ( rule__ImplForm__RightAssignment_1_2 ) ) )
            // InternalDSLSAT.g:871:1: ( ( rule__ImplForm__RightAssignment_1_2 ) )
            {
            // InternalDSLSAT.g:871:1: ( ( rule__ImplForm__RightAssignment_1_2 ) )
            // InternalDSLSAT.g:872:2: ( rule__ImplForm__RightAssignment_1_2 )
            {
             before(grammarAccess.getImplFormAccess().getRightAssignment_1_2()); 
            // InternalDSLSAT.g:873:2: ( rule__ImplForm__RightAssignment_1_2 )
            // InternalDSLSAT.g:873:3: rule__ImplForm__RightAssignment_1_2
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
    // InternalDSLSAT.g:882:1: rule__OrForm__Group__0 : rule__OrForm__Group__0__Impl rule__OrForm__Group__1 ;
    public final void rule__OrForm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:886:1: ( rule__OrForm__Group__0__Impl rule__OrForm__Group__1 )
            // InternalDSLSAT.g:887:2: rule__OrForm__Group__0__Impl rule__OrForm__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDSLSAT.g:894:1: rule__OrForm__Group__0__Impl : ( ruleAndForm ) ;
    public final void rule__OrForm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:898:1: ( ( ruleAndForm ) )
            // InternalDSLSAT.g:899:1: ( ruleAndForm )
            {
            // InternalDSLSAT.g:899:1: ( ruleAndForm )
            // InternalDSLSAT.g:900:2: ruleAndForm
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
    // InternalDSLSAT.g:909:1: rule__OrForm__Group__1 : rule__OrForm__Group__1__Impl ;
    public final void rule__OrForm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:913:1: ( rule__OrForm__Group__1__Impl )
            // InternalDSLSAT.g:914:2: rule__OrForm__Group__1__Impl
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
    // InternalDSLSAT.g:920:1: rule__OrForm__Group__1__Impl : ( ( rule__OrForm__Group_1__0 )* ) ;
    public final void rule__OrForm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:924:1: ( ( ( rule__OrForm__Group_1__0 )* ) )
            // InternalDSLSAT.g:925:1: ( ( rule__OrForm__Group_1__0 )* )
            {
            // InternalDSLSAT.g:925:1: ( ( rule__OrForm__Group_1__0 )* )
            // InternalDSLSAT.g:926:2: ( rule__OrForm__Group_1__0 )*
            {
             before(grammarAccess.getOrFormAccess().getGroup_1()); 
            // InternalDSLSAT.g:927:2: ( rule__OrForm__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDSLSAT.g:927:3: rule__OrForm__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__OrForm__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalDSLSAT.g:936:1: rule__OrForm__Group_1__0 : rule__OrForm__Group_1__0__Impl rule__OrForm__Group_1__1 ;
    public final void rule__OrForm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:940:1: ( rule__OrForm__Group_1__0__Impl rule__OrForm__Group_1__1 )
            // InternalDSLSAT.g:941:2: rule__OrForm__Group_1__0__Impl rule__OrForm__Group_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDSLSAT.g:948:1: rule__OrForm__Group_1__0__Impl : ( () ) ;
    public final void rule__OrForm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:952:1: ( ( () ) )
            // InternalDSLSAT.g:953:1: ( () )
            {
            // InternalDSLSAT.g:953:1: ( () )
            // InternalDSLSAT.g:954:2: ()
            {
             before(grammarAccess.getOrFormAccess().getOrFormLeftAction_1_0()); 
            // InternalDSLSAT.g:955:2: ()
            // InternalDSLSAT.g:955:3: 
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
    // InternalDSLSAT.g:963:1: rule__OrForm__Group_1__1 : rule__OrForm__Group_1__1__Impl rule__OrForm__Group_1__2 ;
    public final void rule__OrForm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:967:1: ( rule__OrForm__Group_1__1__Impl rule__OrForm__Group_1__2 )
            // InternalDSLSAT.g:968:2: rule__OrForm__Group_1__1__Impl rule__OrForm__Group_1__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalDSLSAT.g:975:1: rule__OrForm__Group_1__1__Impl : ( 'v' ) ;
    public final void rule__OrForm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:979:1: ( ( 'v' ) )
            // InternalDSLSAT.g:980:1: ( 'v' )
            {
            // InternalDSLSAT.g:980:1: ( 'v' )
            // InternalDSLSAT.g:981:2: 'v'
            {
             before(grammarAccess.getOrFormAccess().getVKeyword_1_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalDSLSAT.g:990:1: rule__OrForm__Group_1__2 : rule__OrForm__Group_1__2__Impl ;
    public final void rule__OrForm__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:994:1: ( rule__OrForm__Group_1__2__Impl )
            // InternalDSLSAT.g:995:2: rule__OrForm__Group_1__2__Impl
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
    // InternalDSLSAT.g:1001:1: rule__OrForm__Group_1__2__Impl : ( ( rule__OrForm__RightAssignment_1_2 ) ) ;
    public final void rule__OrForm__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1005:1: ( ( ( rule__OrForm__RightAssignment_1_2 ) ) )
            // InternalDSLSAT.g:1006:1: ( ( rule__OrForm__RightAssignment_1_2 ) )
            {
            // InternalDSLSAT.g:1006:1: ( ( rule__OrForm__RightAssignment_1_2 ) )
            // InternalDSLSAT.g:1007:2: ( rule__OrForm__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrFormAccess().getRightAssignment_1_2()); 
            // InternalDSLSAT.g:1008:2: ( rule__OrForm__RightAssignment_1_2 )
            // InternalDSLSAT.g:1008:3: rule__OrForm__RightAssignment_1_2
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
    // InternalDSLSAT.g:1017:1: rule__AndForm__Group__0 : rule__AndForm__Group__0__Impl rule__AndForm__Group__1 ;
    public final void rule__AndForm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1021:1: ( rule__AndForm__Group__0__Impl rule__AndForm__Group__1 )
            // InternalDSLSAT.g:1022:2: rule__AndForm__Group__0__Impl rule__AndForm__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalDSLSAT.g:1029:1: rule__AndForm__Group__0__Impl : ( ruleNandForm ) ;
    public final void rule__AndForm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1033:1: ( ( ruleNandForm ) )
            // InternalDSLSAT.g:1034:1: ( ruleNandForm )
            {
            // InternalDSLSAT.g:1034:1: ( ruleNandForm )
            // InternalDSLSAT.g:1035:2: ruleNandForm
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
    // InternalDSLSAT.g:1044:1: rule__AndForm__Group__1 : rule__AndForm__Group__1__Impl ;
    public final void rule__AndForm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1048:1: ( rule__AndForm__Group__1__Impl )
            // InternalDSLSAT.g:1049:2: rule__AndForm__Group__1__Impl
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
    // InternalDSLSAT.g:1055:1: rule__AndForm__Group__1__Impl : ( ( rule__AndForm__Group_1__0 )* ) ;
    public final void rule__AndForm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1059:1: ( ( ( rule__AndForm__Group_1__0 )* ) )
            // InternalDSLSAT.g:1060:1: ( ( rule__AndForm__Group_1__0 )* )
            {
            // InternalDSLSAT.g:1060:1: ( ( rule__AndForm__Group_1__0 )* )
            // InternalDSLSAT.g:1061:2: ( rule__AndForm__Group_1__0 )*
            {
             before(grammarAccess.getAndFormAccess().getGroup_1()); 
            // InternalDSLSAT.g:1062:2: ( rule__AndForm__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDSLSAT.g:1062:3: rule__AndForm__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__AndForm__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalDSLSAT.g:1071:1: rule__AndForm__Group_1__0 : rule__AndForm__Group_1__0__Impl rule__AndForm__Group_1__1 ;
    public final void rule__AndForm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1075:1: ( rule__AndForm__Group_1__0__Impl rule__AndForm__Group_1__1 )
            // InternalDSLSAT.g:1076:2: rule__AndForm__Group_1__0__Impl rule__AndForm__Group_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalDSLSAT.g:1083:1: rule__AndForm__Group_1__0__Impl : ( () ) ;
    public final void rule__AndForm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1087:1: ( ( () ) )
            // InternalDSLSAT.g:1088:1: ( () )
            {
            // InternalDSLSAT.g:1088:1: ( () )
            // InternalDSLSAT.g:1089:2: ()
            {
             before(grammarAccess.getAndFormAccess().getAndFormLeftAction_1_0()); 
            // InternalDSLSAT.g:1090:2: ()
            // InternalDSLSAT.g:1090:3: 
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
    // InternalDSLSAT.g:1098:1: rule__AndForm__Group_1__1 : rule__AndForm__Group_1__1__Impl rule__AndForm__Group_1__2 ;
    public final void rule__AndForm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1102:1: ( rule__AndForm__Group_1__1__Impl rule__AndForm__Group_1__2 )
            // InternalDSLSAT.g:1103:2: rule__AndForm__Group_1__1__Impl rule__AndForm__Group_1__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalDSLSAT.g:1110:1: rule__AndForm__Group_1__1__Impl : ( '^' ) ;
    public final void rule__AndForm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1114:1: ( ( '^' ) )
            // InternalDSLSAT.g:1115:1: ( '^' )
            {
            // InternalDSLSAT.g:1115:1: ( '^' )
            // InternalDSLSAT.g:1116:2: '^'
            {
             before(grammarAccess.getAndFormAccess().getCircumflexAccentKeyword_1_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDSLSAT.g:1125:1: rule__AndForm__Group_1__2 : rule__AndForm__Group_1__2__Impl ;
    public final void rule__AndForm__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1129:1: ( rule__AndForm__Group_1__2__Impl )
            // InternalDSLSAT.g:1130:2: rule__AndForm__Group_1__2__Impl
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
    // InternalDSLSAT.g:1136:1: rule__AndForm__Group_1__2__Impl : ( ( rule__AndForm__RightAssignment_1_2 ) ) ;
    public final void rule__AndForm__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1140:1: ( ( ( rule__AndForm__RightAssignment_1_2 ) ) )
            // InternalDSLSAT.g:1141:1: ( ( rule__AndForm__RightAssignment_1_2 ) )
            {
            // InternalDSLSAT.g:1141:1: ( ( rule__AndForm__RightAssignment_1_2 ) )
            // InternalDSLSAT.g:1142:2: ( rule__AndForm__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndFormAccess().getRightAssignment_1_2()); 
            // InternalDSLSAT.g:1143:2: ( rule__AndForm__RightAssignment_1_2 )
            // InternalDSLSAT.g:1143:3: rule__AndForm__RightAssignment_1_2
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
    // InternalDSLSAT.g:1152:1: rule__NandForm__Group__0 : rule__NandForm__Group__0__Impl rule__NandForm__Group__1 ;
    public final void rule__NandForm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1156:1: ( rule__NandForm__Group__0__Impl rule__NandForm__Group__1 )
            // InternalDSLSAT.g:1157:2: rule__NandForm__Group__0__Impl rule__NandForm__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDSLSAT.g:1164:1: rule__NandForm__Group__0__Impl : ( ruleForm ) ;
    public final void rule__NandForm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1168:1: ( ( ruleForm ) )
            // InternalDSLSAT.g:1169:1: ( ruleForm )
            {
            // InternalDSLSAT.g:1169:1: ( ruleForm )
            // InternalDSLSAT.g:1170:2: ruleForm
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
    // InternalDSLSAT.g:1179:1: rule__NandForm__Group__1 : rule__NandForm__Group__1__Impl ;
    public final void rule__NandForm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1183:1: ( rule__NandForm__Group__1__Impl )
            // InternalDSLSAT.g:1184:2: rule__NandForm__Group__1__Impl
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
    // InternalDSLSAT.g:1190:1: rule__NandForm__Group__1__Impl : ( ( rule__NandForm__Group_1__0 )* ) ;
    public final void rule__NandForm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1194:1: ( ( ( rule__NandForm__Group_1__0 )* ) )
            // InternalDSLSAT.g:1195:1: ( ( rule__NandForm__Group_1__0 )* )
            {
            // InternalDSLSAT.g:1195:1: ( ( rule__NandForm__Group_1__0 )* )
            // InternalDSLSAT.g:1196:2: ( rule__NandForm__Group_1__0 )*
            {
             before(grammarAccess.getNandFormAccess().getGroup_1()); 
            // InternalDSLSAT.g:1197:2: ( rule__NandForm__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDSLSAT.g:1197:3: rule__NandForm__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__NandForm__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalDSLSAT.g:1206:1: rule__NandForm__Group_1__0 : rule__NandForm__Group_1__0__Impl rule__NandForm__Group_1__1 ;
    public final void rule__NandForm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1210:1: ( rule__NandForm__Group_1__0__Impl rule__NandForm__Group_1__1 )
            // InternalDSLSAT.g:1211:2: rule__NandForm__Group_1__0__Impl rule__NandForm__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDSLSAT.g:1218:1: rule__NandForm__Group_1__0__Impl : ( () ) ;
    public final void rule__NandForm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1222:1: ( ( () ) )
            // InternalDSLSAT.g:1223:1: ( () )
            {
            // InternalDSLSAT.g:1223:1: ( () )
            // InternalDSLSAT.g:1224:2: ()
            {
             before(grammarAccess.getNandFormAccess().getNandFormLeftAction_1_0()); 
            // InternalDSLSAT.g:1225:2: ()
            // InternalDSLSAT.g:1225:3: 
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
    // InternalDSLSAT.g:1233:1: rule__NandForm__Group_1__1 : rule__NandForm__Group_1__1__Impl rule__NandForm__Group_1__2 ;
    public final void rule__NandForm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1237:1: ( rule__NandForm__Group_1__1__Impl rule__NandForm__Group_1__2 )
            // InternalDSLSAT.g:1238:2: rule__NandForm__Group_1__1__Impl rule__NandForm__Group_1__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalDSLSAT.g:1245:1: rule__NandForm__Group_1__1__Impl : ( '|' ) ;
    public final void rule__NandForm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1249:1: ( ( '|' ) )
            // InternalDSLSAT.g:1250:1: ( '|' )
            {
            // InternalDSLSAT.g:1250:1: ( '|' )
            // InternalDSLSAT.g:1251:2: '|'
            {
             before(grammarAccess.getNandFormAccess().getVerticalLineKeyword_1_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDSLSAT.g:1260:1: rule__NandForm__Group_1__2 : rule__NandForm__Group_1__2__Impl ;
    public final void rule__NandForm__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1264:1: ( rule__NandForm__Group_1__2__Impl )
            // InternalDSLSAT.g:1265:2: rule__NandForm__Group_1__2__Impl
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
    // InternalDSLSAT.g:1271:1: rule__NandForm__Group_1__2__Impl : ( ( rule__NandForm__RightAssignment_1_2 ) ) ;
    public final void rule__NandForm__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1275:1: ( ( ( rule__NandForm__RightAssignment_1_2 ) ) )
            // InternalDSLSAT.g:1276:1: ( ( rule__NandForm__RightAssignment_1_2 ) )
            {
            // InternalDSLSAT.g:1276:1: ( ( rule__NandForm__RightAssignment_1_2 ) )
            // InternalDSLSAT.g:1277:2: ( rule__NandForm__RightAssignment_1_2 )
            {
             before(grammarAccess.getNandFormAccess().getRightAssignment_1_2()); 
            // InternalDSLSAT.g:1278:2: ( rule__NandForm__RightAssignment_1_2 )
            // InternalDSLSAT.g:1278:3: rule__NandForm__RightAssignment_1_2
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
    // InternalDSLSAT.g:1287:1: rule__Form__Group_3__0 : rule__Form__Group_3__0__Impl rule__Form__Group_3__1 ;
    public final void rule__Form__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1291:1: ( rule__Form__Group_3__0__Impl rule__Form__Group_3__1 )
            // InternalDSLSAT.g:1292:2: rule__Form__Group_3__0__Impl rule__Form__Group_3__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDSLSAT.g:1299:1: rule__Form__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Form__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1303:1: ( ( '(' ) )
            // InternalDSLSAT.g:1304:1: ( '(' )
            {
            // InternalDSLSAT.g:1304:1: ( '(' )
            // InternalDSLSAT.g:1305:2: '('
            {
             before(grammarAccess.getFormAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDSLSAT.g:1314:1: rule__Form__Group_3__1 : rule__Form__Group_3__1__Impl rule__Form__Group_3__2 ;
    public final void rule__Form__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1318:1: ( rule__Form__Group_3__1__Impl rule__Form__Group_3__2 )
            // InternalDSLSAT.g:1319:2: rule__Form__Group_3__1__Impl rule__Form__Group_3__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalDSLSAT.g:1326:1: rule__Form__Group_3__1__Impl : ( ( rule__Form__FormAssignment_3_1 ) ) ;
    public final void rule__Form__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1330:1: ( ( ( rule__Form__FormAssignment_3_1 ) ) )
            // InternalDSLSAT.g:1331:1: ( ( rule__Form__FormAssignment_3_1 ) )
            {
            // InternalDSLSAT.g:1331:1: ( ( rule__Form__FormAssignment_3_1 ) )
            // InternalDSLSAT.g:1332:2: ( rule__Form__FormAssignment_3_1 )
            {
             before(grammarAccess.getFormAccess().getFormAssignment_3_1()); 
            // InternalDSLSAT.g:1333:2: ( rule__Form__FormAssignment_3_1 )
            // InternalDSLSAT.g:1333:3: rule__Form__FormAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Form__FormAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getFormAssignment_3_1()); 

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
    // InternalDSLSAT.g:1341:1: rule__Form__Group_3__2 : rule__Form__Group_3__2__Impl ;
    public final void rule__Form__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1345:1: ( rule__Form__Group_3__2__Impl )
            // InternalDSLSAT.g:1346:2: rule__Form__Group_3__2__Impl
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
    // InternalDSLSAT.g:1352:1: rule__Form__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Form__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1356:1: ( ( ')' ) )
            // InternalDSLSAT.g:1357:1: ( ')' )
            {
            // InternalDSLSAT.g:1357:1: ( ')' )
            // InternalDSLSAT.g:1358:2: ')'
            {
             before(grammarAccess.getFormAccess().getRightParenthesisKeyword_3_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDSLSAT.g:1368:1: rule__NotForm__Group__0 : rule__NotForm__Group__0__Impl rule__NotForm__Group__1 ;
    public final void rule__NotForm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1372:1: ( rule__NotForm__Group__0__Impl rule__NotForm__Group__1 )
            // InternalDSLSAT.g:1373:2: rule__NotForm__Group__0__Impl rule__NotForm__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDSLSAT.g:1380:1: rule__NotForm__Group__0__Impl : ( '!' ) ;
    public final void rule__NotForm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1384:1: ( ( '!' ) )
            // InternalDSLSAT.g:1385:1: ( '!' )
            {
            // InternalDSLSAT.g:1385:1: ( '!' )
            // InternalDSLSAT.g:1386:2: '!'
            {
             before(grammarAccess.getNotFormAccess().getExclamationMarkKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDSLSAT.g:1395:1: rule__NotForm__Group__1 : rule__NotForm__Group__1__Impl rule__NotForm__Group__2 ;
    public final void rule__NotForm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1399:1: ( rule__NotForm__Group__1__Impl rule__NotForm__Group__2 )
            // InternalDSLSAT.g:1400:2: rule__NotForm__Group__1__Impl rule__NotForm__Group__2
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
    // InternalDSLSAT.g:1407:1: rule__NotForm__Group__1__Impl : ( ruleForm ) ;
    public final void rule__NotForm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1411:1: ( ( ruleForm ) )
            // InternalDSLSAT.g:1412:1: ( ruleForm )
            {
            // InternalDSLSAT.g:1412:1: ( ruleForm )
            // InternalDSLSAT.g:1413:2: ruleForm
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
    // InternalDSLSAT.g:1422:1: rule__NotForm__Group__2 : rule__NotForm__Group__2__Impl ;
    public final void rule__NotForm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1426:1: ( rule__NotForm__Group__2__Impl )
            // InternalDSLSAT.g:1427:2: rule__NotForm__Group__2__Impl
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
    // InternalDSLSAT.g:1433:1: rule__NotForm__Group__2__Impl : ( () ) ;
    public final void rule__NotForm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1437:1: ( ( () ) )
            // InternalDSLSAT.g:1438:1: ( () )
            {
            // InternalDSLSAT.g:1438:1: ( () )
            // InternalDSLSAT.g:1439:2: ()
            {
             before(grammarAccess.getNotFormAccess().getNotFormFormAction_2()); 
            // InternalDSLSAT.g:1440:2: ()
            // InternalDSLSAT.g:1440:3: 
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


    // $ANTLR start "rule__Model__AnnotAssignment_0"
    // InternalDSLSAT.g:1449:1: rule__Model__AnnotAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Model__AnnotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1453:1: ( ( ruleAnnotation ) )
            // InternalDSLSAT.g:1454:2: ( ruleAnnotation )
            {
            // InternalDSLSAT.g:1454:2: ( ruleAnnotation )
            // InternalDSLSAT.g:1455:3: ruleAnnotation
            {
             before(grammarAccess.getModelAccess().getAnnotAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAnnotAnnotationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__AnnotAssignment_0"


    // $ANTLR start "rule__Model__XheckAssignment_1"
    // InternalDSLSAT.g:1464:1: rule__Model__XheckAssignment_1 : ( ( 'Check' ) ) ;
    public final void rule__Model__XheckAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1468:1: ( ( ( 'Check' ) ) )
            // InternalDSLSAT.g:1469:2: ( ( 'Check' ) )
            {
            // InternalDSLSAT.g:1469:2: ( ( 'Check' ) )
            // InternalDSLSAT.g:1470:3: ( 'Check' )
            {
             before(grammarAccess.getModelAccess().getXheckCheckKeyword_1_0()); 
            // InternalDSLSAT.g:1471:3: ( 'Check' )
            // InternalDSLSAT.g:1472:4: 'Check'
            {
             before(grammarAccess.getModelAccess().getXheckCheckKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getXheckCheckKeyword_1_0()); 

            }

             after(grammarAccess.getModelAccess().getXheckCheckKeyword_1_0()); 

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
    // $ANTLR end "rule__Model__XheckAssignment_1"


    // $ANTLR start "rule__Model__FormAssignment_2_0"
    // InternalDSLSAT.g:1483:1: rule__Model__FormAssignment_2_0 : ( ruleBiImplForm ) ;
    public final void rule__Model__FormAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1487:1: ( ( ruleBiImplForm ) )
            // InternalDSLSAT.g:1488:2: ( ruleBiImplForm )
            {
            // InternalDSLSAT.g:1488:2: ( ruleBiImplForm )
            // InternalDSLSAT.g:1489:3: ruleBiImplForm
            {
             before(grammarAccess.getModelAccess().getFormBiImplFormParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBiImplForm();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFormBiImplFormParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Model__FormAssignment_2_0"


    // $ANTLR start "rule__Model__PathAssignment_2_1_1"
    // InternalDSLSAT.g:1498:1: rule__Model__PathAssignment_2_1_1 : ( RULE_STRING ) ;
    public final void rule__Model__PathAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1502:1: ( ( RULE_STRING ) )
            // InternalDSLSAT.g:1503:2: ( RULE_STRING )
            {
            // InternalDSLSAT.g:1503:2: ( RULE_STRING )
            // InternalDSLSAT.g:1504:3: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getPathSTRINGTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getPathSTRINGTerminalRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__Model__PathAssignment_2_1_1"


    // $ANTLR start "rule__Annotation__SolverAssignment_1"
    // InternalDSLSAT.g:1513:1: rule__Annotation__SolverAssignment_1 : ( ( rule__Annotation__SolverAlternatives_1_0 ) ) ;
    public final void rule__Annotation__SolverAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1517:1: ( ( ( rule__Annotation__SolverAlternatives_1_0 ) ) )
            // InternalDSLSAT.g:1518:2: ( ( rule__Annotation__SolverAlternatives_1_0 ) )
            {
            // InternalDSLSAT.g:1518:2: ( ( rule__Annotation__SolverAlternatives_1_0 ) )
            // InternalDSLSAT.g:1519:3: ( rule__Annotation__SolverAlternatives_1_0 )
            {
             before(grammarAccess.getAnnotationAccess().getSolverAlternatives_1_0()); 
            // InternalDSLSAT.g:1520:3: ( rule__Annotation__SolverAlternatives_1_0 )
            // InternalDSLSAT.g:1520:4: rule__Annotation__SolverAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__SolverAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getSolverAlternatives_1_0()); 

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
    // $ANTLR end "rule__Annotation__SolverAssignment_1"


    // $ANTLR start "rule__BiImplForm__RightAssignment_1_2"
    // InternalDSLSAT.g:1528:1: rule__BiImplForm__RightAssignment_1_2 : ( ruleImplForm ) ;
    public final void rule__BiImplForm__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1532:1: ( ( ruleImplForm ) )
            // InternalDSLSAT.g:1533:2: ( ruleImplForm )
            {
            // InternalDSLSAT.g:1533:2: ( ruleImplForm )
            // InternalDSLSAT.g:1534:3: ruleImplForm
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
    // InternalDSLSAT.g:1543:1: rule__ImplForm__RightAssignment_1_2 : ( ruleOrForm ) ;
    public final void rule__ImplForm__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1547:1: ( ( ruleOrForm ) )
            // InternalDSLSAT.g:1548:2: ( ruleOrForm )
            {
            // InternalDSLSAT.g:1548:2: ( ruleOrForm )
            // InternalDSLSAT.g:1549:3: ruleOrForm
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
    // InternalDSLSAT.g:1558:1: rule__OrForm__RightAssignment_1_2 : ( ruleAndForm ) ;
    public final void rule__OrForm__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1562:1: ( ( ruleAndForm ) )
            // InternalDSLSAT.g:1563:2: ( ruleAndForm )
            {
            // InternalDSLSAT.g:1563:2: ( ruleAndForm )
            // InternalDSLSAT.g:1564:3: ruleAndForm
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
    // InternalDSLSAT.g:1573:1: rule__AndForm__RightAssignment_1_2 : ( ruleNandForm ) ;
    public final void rule__AndForm__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1577:1: ( ( ruleNandForm ) )
            // InternalDSLSAT.g:1578:2: ( ruleNandForm )
            {
            // InternalDSLSAT.g:1578:2: ( ruleNandForm )
            // InternalDSLSAT.g:1579:3: ruleNandForm
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
    // InternalDSLSAT.g:1588:1: rule__NandForm__RightAssignment_1_2 : ( ruleForm ) ;
    public final void rule__NandForm__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1592:1: ( ( ruleForm ) )
            // InternalDSLSAT.g:1593:2: ( ruleForm )
            {
            // InternalDSLSAT.g:1593:2: ( ruleForm )
            // InternalDSLSAT.g:1594:3: ruleForm
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


    // $ANTLR start "rule__Form__FormAssignment_0"
    // InternalDSLSAT.g:1603:1: rule__Form__FormAssignment_0 : ( ruleConst ) ;
    public final void rule__Form__FormAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1607:1: ( ( ruleConst ) )
            // InternalDSLSAT.g:1608:2: ( ruleConst )
            {
            // InternalDSLSAT.g:1608:2: ( ruleConst )
            // InternalDSLSAT.g:1609:3: ruleConst
            {
             before(grammarAccess.getFormAccess().getFormConstParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConst();

            state._fsp--;

             after(grammarAccess.getFormAccess().getFormConstParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Form__FormAssignment_0"


    // $ANTLR start "rule__Form__FormAssignment_1"
    // InternalDSLSAT.g:1618:1: rule__Form__FormAssignment_1 : ( ruleVar ) ;
    public final void rule__Form__FormAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1622:1: ( ( ruleVar ) )
            // InternalDSLSAT.g:1623:2: ( ruleVar )
            {
            // InternalDSLSAT.g:1623:2: ( ruleVar )
            // InternalDSLSAT.g:1624:3: ruleVar
            {
             before(grammarAccess.getFormAccess().getFormVarParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getFormAccess().getFormVarParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Form__FormAssignment_1"


    // $ANTLR start "rule__Form__FormAssignment_2"
    // InternalDSLSAT.g:1633:1: rule__Form__FormAssignment_2 : ( ruleNotForm ) ;
    public final void rule__Form__FormAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1637:1: ( ( ruleNotForm ) )
            // InternalDSLSAT.g:1638:2: ( ruleNotForm )
            {
            // InternalDSLSAT.g:1638:2: ( ruleNotForm )
            // InternalDSLSAT.g:1639:3: ruleNotForm
            {
             before(grammarAccess.getFormAccess().getFormNotFormParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNotForm();

            state._fsp--;

             after(grammarAccess.getFormAccess().getFormNotFormParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Form__FormAssignment_2"


    // $ANTLR start "rule__Form__FormAssignment_3_1"
    // InternalDSLSAT.g:1648:1: rule__Form__FormAssignment_3_1 : ( ruleBiImplForm ) ;
    public final void rule__Form__FormAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1652:1: ( ( ruleBiImplForm ) )
            // InternalDSLSAT.g:1653:2: ( ruleBiImplForm )
            {
            // InternalDSLSAT.g:1653:2: ( ruleBiImplForm )
            // InternalDSLSAT.g:1654:3: ruleBiImplForm
            {
             before(grammarAccess.getFormAccess().getFormBiImplFormParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBiImplForm();

            state._fsp--;

             after(grammarAccess.getFormAccess().getFormBiImplFormParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Form__FormAssignment_3_1"


    // $ANTLR start "rule__Var__IdAssignment"
    // InternalDSLSAT.g:1663:1: rule__Var__IdAssignment : ( RULE_LOWID ) ;
    public final void rule__Var__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1667:1: ( ( RULE_LOWID ) )
            // InternalDSLSAT.g:1668:2: ( RULE_LOWID )
            {
            // InternalDSLSAT.g:1668:2: ( RULE_LOWID )
            // InternalDSLSAT.g:1669:3: RULE_LOWID
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
    // InternalDSLSAT.g:1678:1: rule__Const__ValAssignment : ( ( rule__Const__ValAlternatives_0 ) ) ;
    public final void rule__Const__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1682:1: ( ( ( rule__Const__ValAlternatives_0 ) ) )
            // InternalDSLSAT.g:1683:2: ( ( rule__Const__ValAlternatives_0 ) )
            {
            // InternalDSLSAT.g:1683:2: ( ( rule__Const__ValAlternatives_0 ) )
            // InternalDSLSAT.g:1684:3: ( rule__Const__ValAlternatives_0 )
            {
             before(grammarAccess.getConstAccess().getValAlternatives_0()); 
            // InternalDSLSAT.g:1685:3: ( rule__Const__ValAlternatives_0 )
            // InternalDSLSAT.g:1685:4: rule__Const__ValAlternatives_0
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000681C020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000280C020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});

}