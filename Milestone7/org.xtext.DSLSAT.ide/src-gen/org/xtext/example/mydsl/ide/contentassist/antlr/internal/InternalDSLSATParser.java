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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_LOWID", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SAT4J'", "'MINISAT'", "'YALSAT'", "'true'", "'false'", "'FromFile'", "'#SOLVER'", "'<=>'", "'=>'", "'v'", "'^'", "'|'", "'('", "')'", "'!'"
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


    // $ANTLR start "rule__Model__Alternatives_1"
    // InternalDSLSAT.g:327:1: rule__Model__Alternatives_1 : ( ( ( rule__Model__FormAssignment_1_0 ) ) | ( ( rule__Model__Group_1_1__0 ) ) );
    public final void rule__Model__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:331:1: ( ( ( rule__Model__FormAssignment_1_0 ) ) | ( ( rule__Model__Group_1_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_LOWID||(LA1_0>=15 && LA1_0<=16)||LA1_0==24||LA1_0==26) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDSLSAT.g:332:2: ( ( rule__Model__FormAssignment_1_0 ) )
                    {
                    // InternalDSLSAT.g:332:2: ( ( rule__Model__FormAssignment_1_0 ) )
                    // InternalDSLSAT.g:333:3: ( rule__Model__FormAssignment_1_0 )
                    {
                     before(grammarAccess.getModelAccess().getFormAssignment_1_0()); 
                    // InternalDSLSAT.g:334:3: ( rule__Model__FormAssignment_1_0 )
                    // InternalDSLSAT.g:334:4: rule__Model__FormAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__FormAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getFormAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSLSAT.g:338:2: ( ( rule__Model__Group_1_1__0 ) )
                    {
                    // InternalDSLSAT.g:338:2: ( ( rule__Model__Group_1_1__0 ) )
                    // InternalDSLSAT.g:339:3: ( rule__Model__Group_1_1__0 )
                    {
                     before(grammarAccess.getModelAccess().getGroup_1_1()); 
                    // InternalDSLSAT.g:340:3: ( rule__Model__Group_1_1__0 )
                    // InternalDSLSAT.g:340:4: rule__Model__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Model__Alternatives_1"


    // $ANTLR start "rule__Annotation__SolverAlternatives_1_0"
    // InternalDSLSAT.g:348:1: rule__Annotation__SolverAlternatives_1_0 : ( ( 'SAT4J' ) | ( 'MINISAT' ) | ( 'YALSAT' ) );
    public final void rule__Annotation__SolverAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:352:1: ( ( 'SAT4J' ) | ( 'MINISAT' ) | ( 'YALSAT' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            default:
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
                case 3 :
                    // InternalDSLSAT.g:365:2: ( 'YALSAT' )
                    {
                    // InternalDSLSAT.g:365:2: ( 'YALSAT' )
                    // InternalDSLSAT.g:366:3: 'YALSAT'
                    {
                     before(grammarAccess.getAnnotationAccess().getSolverYALSATKeyword_1_0_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getAnnotationAccess().getSolverYALSATKeyword_1_0_2()); 

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
    // InternalDSLSAT.g:375:1: rule__Form__Alternatives : ( ( ( rule__Form__FormAssignment_0 ) ) | ( ( rule__Form__FormAssignment_1 ) ) | ( ( rule__Form__FormAssignment_2 ) ) | ( ( rule__Form__Group_3__0 ) ) );
    public final void rule__Form__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:379:1: ( ( ( rule__Form__FormAssignment_0 ) ) | ( ( rule__Form__FormAssignment_1 ) ) | ( ( rule__Form__FormAssignment_2 ) ) | ( ( rule__Form__Group_3__0 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
                {
                alt3=1;
                }
                break;
            case RULE_LOWID:
                {
                alt3=2;
                }
                break;
            case 26:
                {
                alt3=3;
                }
                break;
            case 24:
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
                    // InternalDSLSAT.g:380:2: ( ( rule__Form__FormAssignment_0 ) )
                    {
                    // InternalDSLSAT.g:380:2: ( ( rule__Form__FormAssignment_0 ) )
                    // InternalDSLSAT.g:381:3: ( rule__Form__FormAssignment_0 )
                    {
                     before(grammarAccess.getFormAccess().getFormAssignment_0()); 
                    // InternalDSLSAT.g:382:3: ( rule__Form__FormAssignment_0 )
                    // InternalDSLSAT.g:382:4: rule__Form__FormAssignment_0
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
                    // InternalDSLSAT.g:386:2: ( ( rule__Form__FormAssignment_1 ) )
                    {
                    // InternalDSLSAT.g:386:2: ( ( rule__Form__FormAssignment_1 ) )
                    // InternalDSLSAT.g:387:3: ( rule__Form__FormAssignment_1 )
                    {
                     before(grammarAccess.getFormAccess().getFormAssignment_1()); 
                    // InternalDSLSAT.g:388:3: ( rule__Form__FormAssignment_1 )
                    // InternalDSLSAT.g:388:4: rule__Form__FormAssignment_1
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
                    // InternalDSLSAT.g:392:2: ( ( rule__Form__FormAssignment_2 ) )
                    {
                    // InternalDSLSAT.g:392:2: ( ( rule__Form__FormAssignment_2 ) )
                    // InternalDSLSAT.g:393:3: ( rule__Form__FormAssignment_2 )
                    {
                     before(grammarAccess.getFormAccess().getFormAssignment_2()); 
                    // InternalDSLSAT.g:394:3: ( rule__Form__FormAssignment_2 )
                    // InternalDSLSAT.g:394:4: rule__Form__FormAssignment_2
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
                    // InternalDSLSAT.g:398:2: ( ( rule__Form__Group_3__0 ) )
                    {
                    // InternalDSLSAT.g:398:2: ( ( rule__Form__Group_3__0 ) )
                    // InternalDSLSAT.g:399:3: ( rule__Form__Group_3__0 )
                    {
                     before(grammarAccess.getFormAccess().getGroup_3()); 
                    // InternalDSLSAT.g:400:3: ( rule__Form__Group_3__0 )
                    // InternalDSLSAT.g:400:4: rule__Form__Group_3__0
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
    // InternalDSLSAT.g:408:1: rule__Const__ValAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Const__ValAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:412:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDSLSAT.g:413:2: ( 'true' )
                    {
                    // InternalDSLSAT.g:413:2: ( 'true' )
                    // InternalDSLSAT.g:414:3: 'true'
                    {
                     before(grammarAccess.getConstAccess().getValTrueKeyword_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getConstAccess().getValTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSLSAT.g:419:2: ( 'false' )
                    {
                    // InternalDSLSAT.g:419:2: ( 'false' )
                    // InternalDSLSAT.g:420:3: 'false'
                    {
                     before(grammarAccess.getConstAccess().getValFalseKeyword_0_1()); 
                    match(input,16,FOLLOW_2); 
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
    // InternalDSLSAT.g:429:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:433:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDSLSAT.g:434:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalDSLSAT.g:441:1: rule__Model__Group__0__Impl : ( ( rule__Model__AnnotAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:445:1: ( ( ( rule__Model__AnnotAssignment_0 )? ) )
            // InternalDSLSAT.g:446:1: ( ( rule__Model__AnnotAssignment_0 )? )
            {
            // InternalDSLSAT.g:446:1: ( ( rule__Model__AnnotAssignment_0 )? )
            // InternalDSLSAT.g:447:2: ( rule__Model__AnnotAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getAnnotAssignment_0()); 
            // InternalDSLSAT.g:448:2: ( rule__Model__AnnotAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDSLSAT.g:448:3: rule__Model__AnnotAssignment_0
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
    // InternalDSLSAT.g:456:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:460:1: ( rule__Model__Group__1__Impl )
            // InternalDSLSAT.g:461:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

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
    // InternalDSLSAT.g:467:1: rule__Model__Group__1__Impl : ( ( rule__Model__Alternatives_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:471:1: ( ( ( rule__Model__Alternatives_1 ) ) )
            // InternalDSLSAT.g:472:1: ( ( rule__Model__Alternatives_1 ) )
            {
            // InternalDSLSAT.g:472:1: ( ( rule__Model__Alternatives_1 ) )
            // InternalDSLSAT.g:473:2: ( rule__Model__Alternatives_1 )
            {
             before(grammarAccess.getModelAccess().getAlternatives_1()); 
            // InternalDSLSAT.g:474:2: ( rule__Model__Alternatives_1 )
            // InternalDSLSAT.g:474:3: rule__Model__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAlternatives_1()); 

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


    // $ANTLR start "rule__Model__Group_1_1__0"
    // InternalDSLSAT.g:483:1: rule__Model__Group_1_1__0 : rule__Model__Group_1_1__0__Impl rule__Model__Group_1_1__1 ;
    public final void rule__Model__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:487:1: ( rule__Model__Group_1_1__0__Impl rule__Model__Group_1_1__1 )
            // InternalDSLSAT.g:488:2: rule__Model__Group_1_1__0__Impl rule__Model__Group_1_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_1_1__1();

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
    // $ANTLR end "rule__Model__Group_1_1__0"


    // $ANTLR start "rule__Model__Group_1_1__0__Impl"
    // InternalDSLSAT.g:495:1: rule__Model__Group_1_1__0__Impl : ( 'FromFile' ) ;
    public final void rule__Model__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:499:1: ( ( 'FromFile' ) )
            // InternalDSLSAT.g:500:1: ( 'FromFile' )
            {
            // InternalDSLSAT.g:500:1: ( 'FromFile' )
            // InternalDSLSAT.g:501:2: 'FromFile'
            {
             before(grammarAccess.getModelAccess().getFromFileKeyword_1_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFromFileKeyword_1_1_0()); 

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
    // $ANTLR end "rule__Model__Group_1_1__0__Impl"


    // $ANTLR start "rule__Model__Group_1_1__1"
    // InternalDSLSAT.g:510:1: rule__Model__Group_1_1__1 : rule__Model__Group_1_1__1__Impl ;
    public final void rule__Model__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:514:1: ( rule__Model__Group_1_1__1__Impl )
            // InternalDSLSAT.g:515:2: rule__Model__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Model__Group_1_1__1"


    // $ANTLR start "rule__Model__Group_1_1__1__Impl"
    // InternalDSLSAT.g:521:1: rule__Model__Group_1_1__1__Impl : ( ( rule__Model__PathAssignment_1_1_1 ) ) ;
    public final void rule__Model__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:525:1: ( ( ( rule__Model__PathAssignment_1_1_1 ) ) )
            // InternalDSLSAT.g:526:1: ( ( rule__Model__PathAssignment_1_1_1 ) )
            {
            // InternalDSLSAT.g:526:1: ( ( rule__Model__PathAssignment_1_1_1 ) )
            // InternalDSLSAT.g:527:2: ( rule__Model__PathAssignment_1_1_1 )
            {
             before(grammarAccess.getModelAccess().getPathAssignment_1_1_1()); 
            // InternalDSLSAT.g:528:2: ( rule__Model__PathAssignment_1_1_1 )
            // InternalDSLSAT.g:528:3: rule__Model__PathAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__PathAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPathAssignment_1_1_1()); 

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
    // $ANTLR end "rule__Model__Group_1_1__1__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // InternalDSLSAT.g:537:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:541:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // InternalDSLSAT.g:542:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
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
    // InternalDSLSAT.g:549:1: rule__Annotation__Group__0__Impl : ( '#SOLVER' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:553:1: ( ( '#SOLVER' ) )
            // InternalDSLSAT.g:554:1: ( '#SOLVER' )
            {
            // InternalDSLSAT.g:554:1: ( '#SOLVER' )
            // InternalDSLSAT.g:555:2: '#SOLVER'
            {
             before(grammarAccess.getAnnotationAccess().getSOLVERKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDSLSAT.g:564:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:568:1: ( rule__Annotation__Group__1__Impl )
            // InternalDSLSAT.g:569:2: rule__Annotation__Group__1__Impl
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
    // InternalDSLSAT.g:575:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__SolverAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:579:1: ( ( ( rule__Annotation__SolverAssignment_1 ) ) )
            // InternalDSLSAT.g:580:1: ( ( rule__Annotation__SolverAssignment_1 ) )
            {
            // InternalDSLSAT.g:580:1: ( ( rule__Annotation__SolverAssignment_1 ) )
            // InternalDSLSAT.g:581:2: ( rule__Annotation__SolverAssignment_1 )
            {
             before(grammarAccess.getAnnotationAccess().getSolverAssignment_1()); 
            // InternalDSLSAT.g:582:2: ( rule__Annotation__SolverAssignment_1 )
            // InternalDSLSAT.g:582:3: rule__Annotation__SolverAssignment_1
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
    // InternalDSLSAT.g:591:1: rule__BiImplForm__Group__0 : rule__BiImplForm__Group__0__Impl rule__BiImplForm__Group__1 ;
    public final void rule__BiImplForm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:595:1: ( rule__BiImplForm__Group__0__Impl rule__BiImplForm__Group__1 )
            // InternalDSLSAT.g:596:2: rule__BiImplForm__Group__0__Impl rule__BiImplForm__Group__1
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
    // InternalDSLSAT.g:603:1: rule__BiImplForm__Group__0__Impl : ( ruleImplForm ) ;
    public final void rule__BiImplForm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:607:1: ( ( ruleImplForm ) )
            // InternalDSLSAT.g:608:1: ( ruleImplForm )
            {
            // InternalDSLSAT.g:608:1: ( ruleImplForm )
            // InternalDSLSAT.g:609:2: ruleImplForm
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
    // InternalDSLSAT.g:618:1: rule__BiImplForm__Group__1 : rule__BiImplForm__Group__1__Impl ;
    public final void rule__BiImplForm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:622:1: ( rule__BiImplForm__Group__1__Impl )
            // InternalDSLSAT.g:623:2: rule__BiImplForm__Group__1__Impl
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
    // InternalDSLSAT.g:629:1: rule__BiImplForm__Group__1__Impl : ( ( rule__BiImplForm__Group_1__0 )* ) ;
    public final void rule__BiImplForm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:633:1: ( ( ( rule__BiImplForm__Group_1__0 )* ) )
            // InternalDSLSAT.g:634:1: ( ( rule__BiImplForm__Group_1__0 )* )
            {
            // InternalDSLSAT.g:634:1: ( ( rule__BiImplForm__Group_1__0 )* )
            // InternalDSLSAT.g:635:2: ( rule__BiImplForm__Group_1__0 )*
            {
             before(grammarAccess.getBiImplFormAccess().getGroup_1()); 
            // InternalDSLSAT.g:636:2: ( rule__BiImplForm__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDSLSAT.g:636:3: rule__BiImplForm__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BiImplForm__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalDSLSAT.g:645:1: rule__BiImplForm__Group_1__0 : rule__BiImplForm__Group_1__0__Impl rule__BiImplForm__Group_1__1 ;
    public final void rule__BiImplForm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:649:1: ( rule__BiImplForm__Group_1__0__Impl rule__BiImplForm__Group_1__1 )
            // InternalDSLSAT.g:650:2: rule__BiImplForm__Group_1__0__Impl rule__BiImplForm__Group_1__1
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
    // InternalDSLSAT.g:657:1: rule__BiImplForm__Group_1__0__Impl : ( () ) ;
    public final void rule__BiImplForm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:661:1: ( ( () ) )
            // InternalDSLSAT.g:662:1: ( () )
            {
            // InternalDSLSAT.g:662:1: ( () )
            // InternalDSLSAT.g:663:2: ()
            {
             before(grammarAccess.getBiImplFormAccess().getBiImplFormLeftAction_1_0()); 
            // InternalDSLSAT.g:664:2: ()
            // InternalDSLSAT.g:664:3: 
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
    // InternalDSLSAT.g:672:1: rule__BiImplForm__Group_1__1 : rule__BiImplForm__Group_1__1__Impl rule__BiImplForm__Group_1__2 ;
    public final void rule__BiImplForm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:676:1: ( rule__BiImplForm__Group_1__1__Impl rule__BiImplForm__Group_1__2 )
            // InternalDSLSAT.g:677:2: rule__BiImplForm__Group_1__1__Impl rule__BiImplForm__Group_1__2
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
    // InternalDSLSAT.g:684:1: rule__BiImplForm__Group_1__1__Impl : ( '<=>' ) ;
    public final void rule__BiImplForm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:688:1: ( ( '<=>' ) )
            // InternalDSLSAT.g:689:1: ( '<=>' )
            {
            // InternalDSLSAT.g:689:1: ( '<=>' )
            // InternalDSLSAT.g:690:2: '<=>'
            {
             before(grammarAccess.getBiImplFormAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalDSLSAT.g:699:1: rule__BiImplForm__Group_1__2 : rule__BiImplForm__Group_1__2__Impl ;
    public final void rule__BiImplForm__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:703:1: ( rule__BiImplForm__Group_1__2__Impl )
            // InternalDSLSAT.g:704:2: rule__BiImplForm__Group_1__2__Impl
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
    // InternalDSLSAT.g:710:1: rule__BiImplForm__Group_1__2__Impl : ( ( rule__BiImplForm__RightAssignment_1_2 ) ) ;
    public final void rule__BiImplForm__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:714:1: ( ( ( rule__BiImplForm__RightAssignment_1_2 ) ) )
            // InternalDSLSAT.g:715:1: ( ( rule__BiImplForm__RightAssignment_1_2 ) )
            {
            // InternalDSLSAT.g:715:1: ( ( rule__BiImplForm__RightAssignment_1_2 ) )
            // InternalDSLSAT.g:716:2: ( rule__BiImplForm__RightAssignment_1_2 )
            {
             before(grammarAccess.getBiImplFormAccess().getRightAssignment_1_2()); 
            // InternalDSLSAT.g:717:2: ( rule__BiImplForm__RightAssignment_1_2 )
            // InternalDSLSAT.g:717:3: rule__BiImplForm__RightAssignment_1_2
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
    // InternalDSLSAT.g:726:1: rule__ImplForm__Group__0 : rule__ImplForm__Group__0__Impl rule__ImplForm__Group__1 ;
    public final void rule__ImplForm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:730:1: ( rule__ImplForm__Group__0__Impl rule__ImplForm__Group__1 )
            // InternalDSLSAT.g:731:2: rule__ImplForm__Group__0__Impl rule__ImplForm__Group__1
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
    // InternalDSLSAT.g:738:1: rule__ImplForm__Group__0__Impl : ( ruleOrForm ) ;
    public final void rule__ImplForm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:742:1: ( ( ruleOrForm ) )
            // InternalDSLSAT.g:743:1: ( ruleOrForm )
            {
            // InternalDSLSAT.g:743:1: ( ruleOrForm )
            // InternalDSLSAT.g:744:2: ruleOrForm
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
    // InternalDSLSAT.g:753:1: rule__ImplForm__Group__1 : rule__ImplForm__Group__1__Impl ;
    public final void rule__ImplForm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:757:1: ( rule__ImplForm__Group__1__Impl )
            // InternalDSLSAT.g:758:2: rule__ImplForm__Group__1__Impl
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
    // InternalDSLSAT.g:764:1: rule__ImplForm__Group__1__Impl : ( ( rule__ImplForm__Group_1__0 )* ) ;
    public final void rule__ImplForm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:768:1: ( ( ( rule__ImplForm__Group_1__0 )* ) )
            // InternalDSLSAT.g:769:1: ( ( rule__ImplForm__Group_1__0 )* )
            {
            // InternalDSLSAT.g:769:1: ( ( rule__ImplForm__Group_1__0 )* )
            // InternalDSLSAT.g:770:2: ( rule__ImplForm__Group_1__0 )*
            {
             before(grammarAccess.getImplFormAccess().getGroup_1()); 
            // InternalDSLSAT.g:771:2: ( rule__ImplForm__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDSLSAT.g:771:3: rule__ImplForm__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ImplForm__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalDSLSAT.g:780:1: rule__ImplForm__Group_1__0 : rule__ImplForm__Group_1__0__Impl rule__ImplForm__Group_1__1 ;
    public final void rule__ImplForm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:784:1: ( rule__ImplForm__Group_1__0__Impl rule__ImplForm__Group_1__1 )
            // InternalDSLSAT.g:785:2: rule__ImplForm__Group_1__0__Impl rule__ImplForm__Group_1__1
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
    // InternalDSLSAT.g:792:1: rule__ImplForm__Group_1__0__Impl : ( () ) ;
    public final void rule__ImplForm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:796:1: ( ( () ) )
            // InternalDSLSAT.g:797:1: ( () )
            {
            // InternalDSLSAT.g:797:1: ( () )
            // InternalDSLSAT.g:798:2: ()
            {
             before(grammarAccess.getImplFormAccess().getImplFormLeftAction_1_0()); 
            // InternalDSLSAT.g:799:2: ()
            // InternalDSLSAT.g:799:3: 
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
    // InternalDSLSAT.g:807:1: rule__ImplForm__Group_1__1 : rule__ImplForm__Group_1__1__Impl rule__ImplForm__Group_1__2 ;
    public final void rule__ImplForm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:811:1: ( rule__ImplForm__Group_1__1__Impl rule__ImplForm__Group_1__2 )
            // InternalDSLSAT.g:812:2: rule__ImplForm__Group_1__1__Impl rule__ImplForm__Group_1__2
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
    // InternalDSLSAT.g:819:1: rule__ImplForm__Group_1__1__Impl : ( '=>' ) ;
    public final void rule__ImplForm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:823:1: ( ( '=>' ) )
            // InternalDSLSAT.g:824:1: ( '=>' )
            {
            // InternalDSLSAT.g:824:1: ( '=>' )
            // InternalDSLSAT.g:825:2: '=>'
            {
             before(grammarAccess.getImplFormAccess().getEqualsSignGreaterThanSignKeyword_1_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalDSLSAT.g:834:1: rule__ImplForm__Group_1__2 : rule__ImplForm__Group_1__2__Impl ;
    public final void rule__ImplForm__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:838:1: ( rule__ImplForm__Group_1__2__Impl )
            // InternalDSLSAT.g:839:2: rule__ImplForm__Group_1__2__Impl
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
    // InternalDSLSAT.g:845:1: rule__ImplForm__Group_1__2__Impl : ( ( rule__ImplForm__RightAssignment_1_2 ) ) ;
    public final void rule__ImplForm__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:849:1: ( ( ( rule__ImplForm__RightAssignment_1_2 ) ) )
            // InternalDSLSAT.g:850:1: ( ( rule__ImplForm__RightAssignment_1_2 ) )
            {
            // InternalDSLSAT.g:850:1: ( ( rule__ImplForm__RightAssignment_1_2 ) )
            // InternalDSLSAT.g:851:2: ( rule__ImplForm__RightAssignment_1_2 )
            {
             before(grammarAccess.getImplFormAccess().getRightAssignment_1_2()); 
            // InternalDSLSAT.g:852:2: ( rule__ImplForm__RightAssignment_1_2 )
            // InternalDSLSAT.g:852:3: rule__ImplForm__RightAssignment_1_2
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
    // InternalDSLSAT.g:861:1: rule__OrForm__Group__0 : rule__OrForm__Group__0__Impl rule__OrForm__Group__1 ;
    public final void rule__OrForm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:865:1: ( rule__OrForm__Group__0__Impl rule__OrForm__Group__1 )
            // InternalDSLSAT.g:866:2: rule__OrForm__Group__0__Impl rule__OrForm__Group__1
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
    // InternalDSLSAT.g:873:1: rule__OrForm__Group__0__Impl : ( ruleAndForm ) ;
    public final void rule__OrForm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:877:1: ( ( ruleAndForm ) )
            // InternalDSLSAT.g:878:1: ( ruleAndForm )
            {
            // InternalDSLSAT.g:878:1: ( ruleAndForm )
            // InternalDSLSAT.g:879:2: ruleAndForm
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
    // InternalDSLSAT.g:888:1: rule__OrForm__Group__1 : rule__OrForm__Group__1__Impl ;
    public final void rule__OrForm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:892:1: ( rule__OrForm__Group__1__Impl )
            // InternalDSLSAT.g:893:2: rule__OrForm__Group__1__Impl
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
    // InternalDSLSAT.g:899:1: rule__OrForm__Group__1__Impl : ( ( rule__OrForm__Group_1__0 )* ) ;
    public final void rule__OrForm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:903:1: ( ( ( rule__OrForm__Group_1__0 )* ) )
            // InternalDSLSAT.g:904:1: ( ( rule__OrForm__Group_1__0 )* )
            {
            // InternalDSLSAT.g:904:1: ( ( rule__OrForm__Group_1__0 )* )
            // InternalDSLSAT.g:905:2: ( rule__OrForm__Group_1__0 )*
            {
             before(grammarAccess.getOrFormAccess().getGroup_1()); 
            // InternalDSLSAT.g:906:2: ( rule__OrForm__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDSLSAT.g:906:3: rule__OrForm__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__OrForm__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalDSLSAT.g:915:1: rule__OrForm__Group_1__0 : rule__OrForm__Group_1__0__Impl rule__OrForm__Group_1__1 ;
    public final void rule__OrForm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:919:1: ( rule__OrForm__Group_1__0__Impl rule__OrForm__Group_1__1 )
            // InternalDSLSAT.g:920:2: rule__OrForm__Group_1__0__Impl rule__OrForm__Group_1__1
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
    // InternalDSLSAT.g:927:1: rule__OrForm__Group_1__0__Impl : ( () ) ;
    public final void rule__OrForm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:931:1: ( ( () ) )
            // InternalDSLSAT.g:932:1: ( () )
            {
            // InternalDSLSAT.g:932:1: ( () )
            // InternalDSLSAT.g:933:2: ()
            {
             before(grammarAccess.getOrFormAccess().getOrFormLeftAction_1_0()); 
            // InternalDSLSAT.g:934:2: ()
            // InternalDSLSAT.g:934:3: 
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
    // InternalDSLSAT.g:942:1: rule__OrForm__Group_1__1 : rule__OrForm__Group_1__1__Impl rule__OrForm__Group_1__2 ;
    public final void rule__OrForm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:946:1: ( rule__OrForm__Group_1__1__Impl rule__OrForm__Group_1__2 )
            // InternalDSLSAT.g:947:2: rule__OrForm__Group_1__1__Impl rule__OrForm__Group_1__2
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
    // InternalDSLSAT.g:954:1: rule__OrForm__Group_1__1__Impl : ( 'v' ) ;
    public final void rule__OrForm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:958:1: ( ( 'v' ) )
            // InternalDSLSAT.g:959:1: ( 'v' )
            {
            // InternalDSLSAT.g:959:1: ( 'v' )
            // InternalDSLSAT.g:960:2: 'v'
            {
             before(grammarAccess.getOrFormAccess().getVKeyword_1_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDSLSAT.g:969:1: rule__OrForm__Group_1__2 : rule__OrForm__Group_1__2__Impl ;
    public final void rule__OrForm__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:973:1: ( rule__OrForm__Group_1__2__Impl )
            // InternalDSLSAT.g:974:2: rule__OrForm__Group_1__2__Impl
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
    // InternalDSLSAT.g:980:1: rule__OrForm__Group_1__2__Impl : ( ( rule__OrForm__RightAssignment_1_2 ) ) ;
    public final void rule__OrForm__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:984:1: ( ( ( rule__OrForm__RightAssignment_1_2 ) ) )
            // InternalDSLSAT.g:985:1: ( ( rule__OrForm__RightAssignment_1_2 ) )
            {
            // InternalDSLSAT.g:985:1: ( ( rule__OrForm__RightAssignment_1_2 ) )
            // InternalDSLSAT.g:986:2: ( rule__OrForm__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrFormAccess().getRightAssignment_1_2()); 
            // InternalDSLSAT.g:987:2: ( rule__OrForm__RightAssignment_1_2 )
            // InternalDSLSAT.g:987:3: rule__OrForm__RightAssignment_1_2
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
    // InternalDSLSAT.g:996:1: rule__AndForm__Group__0 : rule__AndForm__Group__0__Impl rule__AndForm__Group__1 ;
    public final void rule__AndForm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1000:1: ( rule__AndForm__Group__0__Impl rule__AndForm__Group__1 )
            // InternalDSLSAT.g:1001:2: rule__AndForm__Group__0__Impl rule__AndForm__Group__1
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
    // InternalDSLSAT.g:1008:1: rule__AndForm__Group__0__Impl : ( ruleNandForm ) ;
    public final void rule__AndForm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1012:1: ( ( ruleNandForm ) )
            // InternalDSLSAT.g:1013:1: ( ruleNandForm )
            {
            // InternalDSLSAT.g:1013:1: ( ruleNandForm )
            // InternalDSLSAT.g:1014:2: ruleNandForm
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
    // InternalDSLSAT.g:1023:1: rule__AndForm__Group__1 : rule__AndForm__Group__1__Impl ;
    public final void rule__AndForm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1027:1: ( rule__AndForm__Group__1__Impl )
            // InternalDSLSAT.g:1028:2: rule__AndForm__Group__1__Impl
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
    // InternalDSLSAT.g:1034:1: rule__AndForm__Group__1__Impl : ( ( rule__AndForm__Group_1__0 )* ) ;
    public final void rule__AndForm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1038:1: ( ( ( rule__AndForm__Group_1__0 )* ) )
            // InternalDSLSAT.g:1039:1: ( ( rule__AndForm__Group_1__0 )* )
            {
            // InternalDSLSAT.g:1039:1: ( ( rule__AndForm__Group_1__0 )* )
            // InternalDSLSAT.g:1040:2: ( rule__AndForm__Group_1__0 )*
            {
             before(grammarAccess.getAndFormAccess().getGroup_1()); 
            // InternalDSLSAT.g:1041:2: ( rule__AndForm__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDSLSAT.g:1041:3: rule__AndForm__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__AndForm__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalDSLSAT.g:1050:1: rule__AndForm__Group_1__0 : rule__AndForm__Group_1__0__Impl rule__AndForm__Group_1__1 ;
    public final void rule__AndForm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1054:1: ( rule__AndForm__Group_1__0__Impl rule__AndForm__Group_1__1 )
            // InternalDSLSAT.g:1055:2: rule__AndForm__Group_1__0__Impl rule__AndForm__Group_1__1
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
    // InternalDSLSAT.g:1062:1: rule__AndForm__Group_1__0__Impl : ( () ) ;
    public final void rule__AndForm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1066:1: ( ( () ) )
            // InternalDSLSAT.g:1067:1: ( () )
            {
            // InternalDSLSAT.g:1067:1: ( () )
            // InternalDSLSAT.g:1068:2: ()
            {
             before(grammarAccess.getAndFormAccess().getAndFormLeftAction_1_0()); 
            // InternalDSLSAT.g:1069:2: ()
            // InternalDSLSAT.g:1069:3: 
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
    // InternalDSLSAT.g:1077:1: rule__AndForm__Group_1__1 : rule__AndForm__Group_1__1__Impl rule__AndForm__Group_1__2 ;
    public final void rule__AndForm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1081:1: ( rule__AndForm__Group_1__1__Impl rule__AndForm__Group_1__2 )
            // InternalDSLSAT.g:1082:2: rule__AndForm__Group_1__1__Impl rule__AndForm__Group_1__2
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
    // InternalDSLSAT.g:1089:1: rule__AndForm__Group_1__1__Impl : ( '^' ) ;
    public final void rule__AndForm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1093:1: ( ( '^' ) )
            // InternalDSLSAT.g:1094:1: ( '^' )
            {
            // InternalDSLSAT.g:1094:1: ( '^' )
            // InternalDSLSAT.g:1095:2: '^'
            {
             before(grammarAccess.getAndFormAccess().getCircumflexAccentKeyword_1_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDSLSAT.g:1104:1: rule__AndForm__Group_1__2 : rule__AndForm__Group_1__2__Impl ;
    public final void rule__AndForm__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1108:1: ( rule__AndForm__Group_1__2__Impl )
            // InternalDSLSAT.g:1109:2: rule__AndForm__Group_1__2__Impl
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
    // InternalDSLSAT.g:1115:1: rule__AndForm__Group_1__2__Impl : ( ( rule__AndForm__RightAssignment_1_2 ) ) ;
    public final void rule__AndForm__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1119:1: ( ( ( rule__AndForm__RightAssignment_1_2 ) ) )
            // InternalDSLSAT.g:1120:1: ( ( rule__AndForm__RightAssignment_1_2 ) )
            {
            // InternalDSLSAT.g:1120:1: ( ( rule__AndForm__RightAssignment_1_2 ) )
            // InternalDSLSAT.g:1121:2: ( rule__AndForm__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndFormAccess().getRightAssignment_1_2()); 
            // InternalDSLSAT.g:1122:2: ( rule__AndForm__RightAssignment_1_2 )
            // InternalDSLSAT.g:1122:3: rule__AndForm__RightAssignment_1_2
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
    // InternalDSLSAT.g:1131:1: rule__NandForm__Group__0 : rule__NandForm__Group__0__Impl rule__NandForm__Group__1 ;
    public final void rule__NandForm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1135:1: ( rule__NandForm__Group__0__Impl rule__NandForm__Group__1 )
            // InternalDSLSAT.g:1136:2: rule__NandForm__Group__0__Impl rule__NandForm__Group__1
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
    // InternalDSLSAT.g:1143:1: rule__NandForm__Group__0__Impl : ( ruleForm ) ;
    public final void rule__NandForm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1147:1: ( ( ruleForm ) )
            // InternalDSLSAT.g:1148:1: ( ruleForm )
            {
            // InternalDSLSAT.g:1148:1: ( ruleForm )
            // InternalDSLSAT.g:1149:2: ruleForm
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
    // InternalDSLSAT.g:1158:1: rule__NandForm__Group__1 : rule__NandForm__Group__1__Impl ;
    public final void rule__NandForm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1162:1: ( rule__NandForm__Group__1__Impl )
            // InternalDSLSAT.g:1163:2: rule__NandForm__Group__1__Impl
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
    // InternalDSLSAT.g:1169:1: rule__NandForm__Group__1__Impl : ( ( rule__NandForm__Group_1__0 )* ) ;
    public final void rule__NandForm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1173:1: ( ( ( rule__NandForm__Group_1__0 )* ) )
            // InternalDSLSAT.g:1174:1: ( ( rule__NandForm__Group_1__0 )* )
            {
            // InternalDSLSAT.g:1174:1: ( ( rule__NandForm__Group_1__0 )* )
            // InternalDSLSAT.g:1175:2: ( rule__NandForm__Group_1__0 )*
            {
             before(grammarAccess.getNandFormAccess().getGroup_1()); 
            // InternalDSLSAT.g:1176:2: ( rule__NandForm__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDSLSAT.g:1176:3: rule__NandForm__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__NandForm__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalDSLSAT.g:1185:1: rule__NandForm__Group_1__0 : rule__NandForm__Group_1__0__Impl rule__NandForm__Group_1__1 ;
    public final void rule__NandForm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1189:1: ( rule__NandForm__Group_1__0__Impl rule__NandForm__Group_1__1 )
            // InternalDSLSAT.g:1190:2: rule__NandForm__Group_1__0__Impl rule__NandForm__Group_1__1
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
    // InternalDSLSAT.g:1197:1: rule__NandForm__Group_1__0__Impl : ( () ) ;
    public final void rule__NandForm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1201:1: ( ( () ) )
            // InternalDSLSAT.g:1202:1: ( () )
            {
            // InternalDSLSAT.g:1202:1: ( () )
            // InternalDSLSAT.g:1203:2: ()
            {
             before(grammarAccess.getNandFormAccess().getNandFormLeftAction_1_0()); 
            // InternalDSLSAT.g:1204:2: ()
            // InternalDSLSAT.g:1204:3: 
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
    // InternalDSLSAT.g:1212:1: rule__NandForm__Group_1__1 : rule__NandForm__Group_1__1__Impl rule__NandForm__Group_1__2 ;
    public final void rule__NandForm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1216:1: ( rule__NandForm__Group_1__1__Impl rule__NandForm__Group_1__2 )
            // InternalDSLSAT.g:1217:2: rule__NandForm__Group_1__1__Impl rule__NandForm__Group_1__2
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
    // InternalDSLSAT.g:1224:1: rule__NandForm__Group_1__1__Impl : ( '|' ) ;
    public final void rule__NandForm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1228:1: ( ( '|' ) )
            // InternalDSLSAT.g:1229:1: ( '|' )
            {
            // InternalDSLSAT.g:1229:1: ( '|' )
            // InternalDSLSAT.g:1230:2: '|'
            {
             before(grammarAccess.getNandFormAccess().getVerticalLineKeyword_1_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDSLSAT.g:1239:1: rule__NandForm__Group_1__2 : rule__NandForm__Group_1__2__Impl ;
    public final void rule__NandForm__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1243:1: ( rule__NandForm__Group_1__2__Impl )
            // InternalDSLSAT.g:1244:2: rule__NandForm__Group_1__2__Impl
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
    // InternalDSLSAT.g:1250:1: rule__NandForm__Group_1__2__Impl : ( ( rule__NandForm__RightAssignment_1_2 ) ) ;
    public final void rule__NandForm__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1254:1: ( ( ( rule__NandForm__RightAssignment_1_2 ) ) )
            // InternalDSLSAT.g:1255:1: ( ( rule__NandForm__RightAssignment_1_2 ) )
            {
            // InternalDSLSAT.g:1255:1: ( ( rule__NandForm__RightAssignment_1_2 ) )
            // InternalDSLSAT.g:1256:2: ( rule__NandForm__RightAssignment_1_2 )
            {
             before(grammarAccess.getNandFormAccess().getRightAssignment_1_2()); 
            // InternalDSLSAT.g:1257:2: ( rule__NandForm__RightAssignment_1_2 )
            // InternalDSLSAT.g:1257:3: rule__NandForm__RightAssignment_1_2
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
    // InternalDSLSAT.g:1266:1: rule__Form__Group_3__0 : rule__Form__Group_3__0__Impl rule__Form__Group_3__1 ;
    public final void rule__Form__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1270:1: ( rule__Form__Group_3__0__Impl rule__Form__Group_3__1 )
            // InternalDSLSAT.g:1271:2: rule__Form__Group_3__0__Impl rule__Form__Group_3__1
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
    // InternalDSLSAT.g:1278:1: rule__Form__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Form__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1282:1: ( ( '(' ) )
            // InternalDSLSAT.g:1283:1: ( '(' )
            {
            // InternalDSLSAT.g:1283:1: ( '(' )
            // InternalDSLSAT.g:1284:2: '('
            {
             before(grammarAccess.getFormAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDSLSAT.g:1293:1: rule__Form__Group_3__1 : rule__Form__Group_3__1__Impl rule__Form__Group_3__2 ;
    public final void rule__Form__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1297:1: ( rule__Form__Group_3__1__Impl rule__Form__Group_3__2 )
            // InternalDSLSAT.g:1298:2: rule__Form__Group_3__1__Impl rule__Form__Group_3__2
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
    // InternalDSLSAT.g:1305:1: rule__Form__Group_3__1__Impl : ( ( rule__Form__FormAssignment_3_1 ) ) ;
    public final void rule__Form__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1309:1: ( ( ( rule__Form__FormAssignment_3_1 ) ) )
            // InternalDSLSAT.g:1310:1: ( ( rule__Form__FormAssignment_3_1 ) )
            {
            // InternalDSLSAT.g:1310:1: ( ( rule__Form__FormAssignment_3_1 ) )
            // InternalDSLSAT.g:1311:2: ( rule__Form__FormAssignment_3_1 )
            {
             before(grammarAccess.getFormAccess().getFormAssignment_3_1()); 
            // InternalDSLSAT.g:1312:2: ( rule__Form__FormAssignment_3_1 )
            // InternalDSLSAT.g:1312:3: rule__Form__FormAssignment_3_1
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
    // InternalDSLSAT.g:1320:1: rule__Form__Group_3__2 : rule__Form__Group_3__2__Impl ;
    public final void rule__Form__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1324:1: ( rule__Form__Group_3__2__Impl )
            // InternalDSLSAT.g:1325:2: rule__Form__Group_3__2__Impl
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
    // InternalDSLSAT.g:1331:1: rule__Form__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Form__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1335:1: ( ( ')' ) )
            // InternalDSLSAT.g:1336:1: ( ')' )
            {
            // InternalDSLSAT.g:1336:1: ( ')' )
            // InternalDSLSAT.g:1337:2: ')'
            {
             before(grammarAccess.getFormAccess().getRightParenthesisKeyword_3_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDSLSAT.g:1347:1: rule__NotForm__Group__0 : rule__NotForm__Group__0__Impl rule__NotForm__Group__1 ;
    public final void rule__NotForm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1351:1: ( rule__NotForm__Group__0__Impl rule__NotForm__Group__1 )
            // InternalDSLSAT.g:1352:2: rule__NotForm__Group__0__Impl rule__NotForm__Group__1
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
    // InternalDSLSAT.g:1359:1: rule__NotForm__Group__0__Impl : ( '!' ) ;
    public final void rule__NotForm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1363:1: ( ( '!' ) )
            // InternalDSLSAT.g:1364:1: ( '!' )
            {
            // InternalDSLSAT.g:1364:1: ( '!' )
            // InternalDSLSAT.g:1365:2: '!'
            {
             before(grammarAccess.getNotFormAccess().getExclamationMarkKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDSLSAT.g:1374:1: rule__NotForm__Group__1 : rule__NotForm__Group__1__Impl rule__NotForm__Group__2 ;
    public final void rule__NotForm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1378:1: ( rule__NotForm__Group__1__Impl rule__NotForm__Group__2 )
            // InternalDSLSAT.g:1379:2: rule__NotForm__Group__1__Impl rule__NotForm__Group__2
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
    // InternalDSLSAT.g:1386:1: rule__NotForm__Group__1__Impl : ( ruleForm ) ;
    public final void rule__NotForm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1390:1: ( ( ruleForm ) )
            // InternalDSLSAT.g:1391:1: ( ruleForm )
            {
            // InternalDSLSAT.g:1391:1: ( ruleForm )
            // InternalDSLSAT.g:1392:2: ruleForm
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
    // InternalDSLSAT.g:1401:1: rule__NotForm__Group__2 : rule__NotForm__Group__2__Impl ;
    public final void rule__NotForm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1405:1: ( rule__NotForm__Group__2__Impl )
            // InternalDSLSAT.g:1406:2: rule__NotForm__Group__2__Impl
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
    // InternalDSLSAT.g:1412:1: rule__NotForm__Group__2__Impl : ( () ) ;
    public final void rule__NotForm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1416:1: ( ( () ) )
            // InternalDSLSAT.g:1417:1: ( () )
            {
            // InternalDSLSAT.g:1417:1: ( () )
            // InternalDSLSAT.g:1418:2: ()
            {
             before(grammarAccess.getNotFormAccess().getNotFormFormAction_2()); 
            // InternalDSLSAT.g:1419:2: ()
            // InternalDSLSAT.g:1419:3: 
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
    // InternalDSLSAT.g:1428:1: rule__Model__AnnotAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Model__AnnotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1432:1: ( ( ruleAnnotation ) )
            // InternalDSLSAT.g:1433:2: ( ruleAnnotation )
            {
            // InternalDSLSAT.g:1433:2: ( ruleAnnotation )
            // InternalDSLSAT.g:1434:3: ruleAnnotation
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


    // $ANTLR start "rule__Model__FormAssignment_1_0"
    // InternalDSLSAT.g:1443:1: rule__Model__FormAssignment_1_0 : ( ruleBiImplForm ) ;
    public final void rule__Model__FormAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1447:1: ( ( ruleBiImplForm ) )
            // InternalDSLSAT.g:1448:2: ( ruleBiImplForm )
            {
            // InternalDSLSAT.g:1448:2: ( ruleBiImplForm )
            // InternalDSLSAT.g:1449:3: ruleBiImplForm
            {
             before(grammarAccess.getModelAccess().getFormBiImplFormParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBiImplForm();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFormBiImplFormParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Model__FormAssignment_1_0"


    // $ANTLR start "rule__Model__PathAssignment_1_1_1"
    // InternalDSLSAT.g:1458:1: rule__Model__PathAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__Model__PathAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1462:1: ( ( RULE_STRING ) )
            // InternalDSLSAT.g:1463:2: ( RULE_STRING )
            {
            // InternalDSLSAT.g:1463:2: ( RULE_STRING )
            // InternalDSLSAT.g:1464:3: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getPathSTRINGTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getPathSTRINGTerminalRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__Model__PathAssignment_1_1_1"


    // $ANTLR start "rule__Annotation__SolverAssignment_1"
    // InternalDSLSAT.g:1473:1: rule__Annotation__SolverAssignment_1 : ( ( rule__Annotation__SolverAlternatives_1_0 ) ) ;
    public final void rule__Annotation__SolverAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1477:1: ( ( ( rule__Annotation__SolverAlternatives_1_0 ) ) )
            // InternalDSLSAT.g:1478:2: ( ( rule__Annotation__SolverAlternatives_1_0 ) )
            {
            // InternalDSLSAT.g:1478:2: ( ( rule__Annotation__SolverAlternatives_1_0 ) )
            // InternalDSLSAT.g:1479:3: ( rule__Annotation__SolverAlternatives_1_0 )
            {
             before(grammarAccess.getAnnotationAccess().getSolverAlternatives_1_0()); 
            // InternalDSLSAT.g:1480:3: ( rule__Annotation__SolverAlternatives_1_0 )
            // InternalDSLSAT.g:1480:4: rule__Annotation__SolverAlternatives_1_0
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
    // InternalDSLSAT.g:1488:1: rule__BiImplForm__RightAssignment_1_2 : ( ruleImplForm ) ;
    public final void rule__BiImplForm__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1492:1: ( ( ruleImplForm ) )
            // InternalDSLSAT.g:1493:2: ( ruleImplForm )
            {
            // InternalDSLSAT.g:1493:2: ( ruleImplForm )
            // InternalDSLSAT.g:1494:3: ruleImplForm
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
    // InternalDSLSAT.g:1503:1: rule__ImplForm__RightAssignment_1_2 : ( ruleOrForm ) ;
    public final void rule__ImplForm__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1507:1: ( ( ruleOrForm ) )
            // InternalDSLSAT.g:1508:2: ( ruleOrForm )
            {
            // InternalDSLSAT.g:1508:2: ( ruleOrForm )
            // InternalDSLSAT.g:1509:3: ruleOrForm
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
    // InternalDSLSAT.g:1518:1: rule__OrForm__RightAssignment_1_2 : ( ruleAndForm ) ;
    public final void rule__OrForm__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1522:1: ( ( ruleAndForm ) )
            // InternalDSLSAT.g:1523:2: ( ruleAndForm )
            {
            // InternalDSLSAT.g:1523:2: ( ruleAndForm )
            // InternalDSLSAT.g:1524:3: ruleAndForm
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
    // InternalDSLSAT.g:1533:1: rule__AndForm__RightAssignment_1_2 : ( ruleNandForm ) ;
    public final void rule__AndForm__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1537:1: ( ( ruleNandForm ) )
            // InternalDSLSAT.g:1538:2: ( ruleNandForm )
            {
            // InternalDSLSAT.g:1538:2: ( ruleNandForm )
            // InternalDSLSAT.g:1539:3: ruleNandForm
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
    // InternalDSLSAT.g:1548:1: rule__NandForm__RightAssignment_1_2 : ( ruleForm ) ;
    public final void rule__NandForm__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1552:1: ( ( ruleForm ) )
            // InternalDSLSAT.g:1553:2: ( ruleForm )
            {
            // InternalDSLSAT.g:1553:2: ( ruleForm )
            // InternalDSLSAT.g:1554:3: ruleForm
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
    // InternalDSLSAT.g:1563:1: rule__Form__FormAssignment_0 : ( ruleConst ) ;
    public final void rule__Form__FormAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1567:1: ( ( ruleConst ) )
            // InternalDSLSAT.g:1568:2: ( ruleConst )
            {
            // InternalDSLSAT.g:1568:2: ( ruleConst )
            // InternalDSLSAT.g:1569:3: ruleConst
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
    // InternalDSLSAT.g:1578:1: rule__Form__FormAssignment_1 : ( ruleVar ) ;
    public final void rule__Form__FormAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1582:1: ( ( ruleVar ) )
            // InternalDSLSAT.g:1583:2: ( ruleVar )
            {
            // InternalDSLSAT.g:1583:2: ( ruleVar )
            // InternalDSLSAT.g:1584:3: ruleVar
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
    // InternalDSLSAT.g:1593:1: rule__Form__FormAssignment_2 : ( ruleNotForm ) ;
    public final void rule__Form__FormAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1597:1: ( ( ruleNotForm ) )
            // InternalDSLSAT.g:1598:2: ( ruleNotForm )
            {
            // InternalDSLSAT.g:1598:2: ( ruleNotForm )
            // InternalDSLSAT.g:1599:3: ruleNotForm
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
    // InternalDSLSAT.g:1608:1: rule__Form__FormAssignment_3_1 : ( ruleBiImplForm ) ;
    public final void rule__Form__FormAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1612:1: ( ( ruleBiImplForm ) )
            // InternalDSLSAT.g:1613:2: ( ruleBiImplForm )
            {
            // InternalDSLSAT.g:1613:2: ( ruleBiImplForm )
            // InternalDSLSAT.g:1614:3: ruleBiImplForm
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
    // InternalDSLSAT.g:1623:1: rule__Var__IdAssignment : ( RULE_LOWID ) ;
    public final void rule__Var__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1627:1: ( ( RULE_LOWID ) )
            // InternalDSLSAT.g:1628:2: ( RULE_LOWID )
            {
            // InternalDSLSAT.g:1628:2: ( RULE_LOWID )
            // InternalDSLSAT.g:1629:3: RULE_LOWID
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
    // InternalDSLSAT.g:1638:1: rule__Const__ValAssignment : ( ( rule__Const__ValAlternatives_0 ) ) ;
    public final void rule__Const__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSAT.g:1642:1: ( ( ( rule__Const__ValAlternatives_0 ) ) )
            // InternalDSLSAT.g:1643:2: ( ( rule__Const__ValAlternatives_0 ) )
            {
            // InternalDSLSAT.g:1643:2: ( ( rule__Const__ValAlternatives_0 ) )
            // InternalDSLSAT.g:1644:3: ( rule__Const__ValAlternatives_0 )
            {
             before(grammarAccess.getConstAccess().getValAlternatives_0()); 
            // InternalDSLSAT.g:1645:3: ( rule__Const__ValAlternatives_0 )
            // InternalDSLSAT.g:1645:4: rule__Const__ValAlternatives_0
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000005038020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000005018020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});

}