package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.DSLSATGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLSATParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LOWID", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Check'", "'<=>'", "'=>'", "'v'", "'^'", "'|'", "'('", "')'", "'!'", "'true'", "'false'"
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
    public static final int T__22=22;
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

        public InternalDSLSATParser(TokenStream input, DSLSATGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DSLSATGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDSLSAT.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDSLSAT.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDSLSAT.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDSLSAT.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_xheck_0_0= 'Check' ) )? ( (lv_form_1_0= ruleBiImplForm ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_xheck_0_0=null;
        EObject lv_form_1_0 = null;



        	enterRule();

        try {
            // InternalDSLSAT.g:77:2: ( ( ( (lv_xheck_0_0= 'Check' ) )? ( (lv_form_1_0= ruleBiImplForm ) ) ) )
            // InternalDSLSAT.g:78:2: ( ( (lv_xheck_0_0= 'Check' ) )? ( (lv_form_1_0= ruleBiImplForm ) ) )
            {
            // InternalDSLSAT.g:78:2: ( ( (lv_xheck_0_0= 'Check' ) )? ( (lv_form_1_0= ruleBiImplForm ) ) )
            // InternalDSLSAT.g:79:3: ( (lv_xheck_0_0= 'Check' ) )? ( (lv_form_1_0= ruleBiImplForm ) )
            {
            // InternalDSLSAT.g:79:3: ( (lv_xheck_0_0= 'Check' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDSLSAT.g:80:4: (lv_xheck_0_0= 'Check' )
                    {
                    // InternalDSLSAT.g:80:4: (lv_xheck_0_0= 'Check' )
                    // InternalDSLSAT.g:81:5: lv_xheck_0_0= 'Check'
                    {
                    lv_xheck_0_0=(Token)match(input,12,FOLLOW_3); 

                    					newLeafNode(lv_xheck_0_0, grammarAccess.getModelAccess().getXheckCheckKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModelRule());
                    					}
                    					setWithLastConsumed(current, "xheck", lv_xheck_0_0, "Check");
                    				

                    }


                    }
                    break;

            }

            // InternalDSLSAT.g:93:3: ( (lv_form_1_0= ruleBiImplForm ) )
            // InternalDSLSAT.g:94:4: (lv_form_1_0= ruleBiImplForm )
            {
            // InternalDSLSAT.g:94:4: (lv_form_1_0= ruleBiImplForm )
            // InternalDSLSAT.g:95:5: lv_form_1_0= ruleBiImplForm
            {

            					newCompositeNode(grammarAccess.getModelAccess().getFormBiImplFormParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_form_1_0=ruleBiImplForm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"form",
            						lv_form_1_0,
            						"org.xtext.example.mydsl.DSLSAT.BiImplForm");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleBiImplForm"
    // InternalDSLSAT.g:116:1: entryRuleBiImplForm returns [EObject current=null] : iv_ruleBiImplForm= ruleBiImplForm EOF ;
    public final EObject entryRuleBiImplForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBiImplForm = null;


        try {
            // InternalDSLSAT.g:116:51: (iv_ruleBiImplForm= ruleBiImplForm EOF )
            // InternalDSLSAT.g:117:2: iv_ruleBiImplForm= ruleBiImplForm EOF
            {
             newCompositeNode(grammarAccess.getBiImplFormRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBiImplForm=ruleBiImplForm();

            state._fsp--;

             current =iv_ruleBiImplForm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBiImplForm"


    // $ANTLR start "ruleBiImplForm"
    // InternalDSLSAT.g:123:1: ruleBiImplForm returns [EObject current=null] : (this_ImplForm_0= ruleImplForm ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplForm ) ) )* ) ;
    public final EObject ruleBiImplForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ImplForm_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDSLSAT.g:129:2: ( (this_ImplForm_0= ruleImplForm ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplForm ) ) )* ) )
            // InternalDSLSAT.g:130:2: (this_ImplForm_0= ruleImplForm ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplForm ) ) )* )
            {
            // InternalDSLSAT.g:130:2: (this_ImplForm_0= ruleImplForm ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplForm ) ) )* )
            // InternalDSLSAT.g:131:3: this_ImplForm_0= ruleImplForm ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplForm ) ) )*
            {

            			newCompositeNode(grammarAccess.getBiImplFormAccess().getImplFormParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_ImplForm_0=ruleImplForm();

            state._fsp--;


            			current = this_ImplForm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDSLSAT.g:139:3: ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplForm ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDSLSAT.g:140:4: () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplForm ) )
            	    {
            	    // InternalDSLSAT.g:140:4: ()
            	    // InternalDSLSAT.g:141:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getBiImplFormAccess().getBiImplFormLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getBiImplFormAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalDSLSAT.g:151:4: ( (lv_right_3_0= ruleImplForm ) )
            	    // InternalDSLSAT.g:152:5: (lv_right_3_0= ruleImplForm )
            	    {
            	    // InternalDSLSAT.g:152:5: (lv_right_3_0= ruleImplForm )
            	    // InternalDSLSAT.g:153:6: lv_right_3_0= ruleImplForm
            	    {

            	    						newCompositeNode(grammarAccess.getBiImplFormAccess().getRightImplFormParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_right_3_0=ruleImplForm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBiImplFormRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.DSLSAT.ImplForm");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleBiImplForm"


    // $ANTLR start "entryRuleImplForm"
    // InternalDSLSAT.g:175:1: entryRuleImplForm returns [EObject current=null] : iv_ruleImplForm= ruleImplForm EOF ;
    public final EObject entryRuleImplForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplForm = null;


        try {
            // InternalDSLSAT.g:175:49: (iv_ruleImplForm= ruleImplForm EOF )
            // InternalDSLSAT.g:176:2: iv_ruleImplForm= ruleImplForm EOF
            {
             newCompositeNode(grammarAccess.getImplFormRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplForm=ruleImplForm();

            state._fsp--;

             current =iv_ruleImplForm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImplForm"


    // $ANTLR start "ruleImplForm"
    // InternalDSLSAT.g:182:1: ruleImplForm returns [EObject current=null] : (this_OrForm_0= ruleOrForm ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOrForm ) ) )* ) ;
    public final EObject ruleImplForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OrForm_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDSLSAT.g:188:2: ( (this_OrForm_0= ruleOrForm ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOrForm ) ) )* ) )
            // InternalDSLSAT.g:189:2: (this_OrForm_0= ruleOrForm ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOrForm ) ) )* )
            {
            // InternalDSLSAT.g:189:2: (this_OrForm_0= ruleOrForm ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOrForm ) ) )* )
            // InternalDSLSAT.g:190:3: this_OrForm_0= ruleOrForm ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOrForm ) ) )*
            {

            			newCompositeNode(grammarAccess.getImplFormAccess().getOrFormParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_OrForm_0=ruleOrForm();

            state._fsp--;


            			current = this_OrForm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDSLSAT.g:198:3: ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOrForm ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDSLSAT.g:199:4: () otherlv_2= '=>' ( (lv_right_3_0= ruleOrForm ) )
            	    {
            	    // InternalDSLSAT.g:199:4: ()
            	    // InternalDSLSAT.g:200:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getImplFormAccess().getImplFormLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getImplFormAccess().getEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalDSLSAT.g:210:4: ( (lv_right_3_0= ruleOrForm ) )
            	    // InternalDSLSAT.g:211:5: (lv_right_3_0= ruleOrForm )
            	    {
            	    // InternalDSLSAT.g:211:5: (lv_right_3_0= ruleOrForm )
            	    // InternalDSLSAT.g:212:6: lv_right_3_0= ruleOrForm
            	    {

            	    						newCompositeNode(grammarAccess.getImplFormAccess().getRightOrFormParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_right_3_0=ruleOrForm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImplFormRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.DSLSAT.OrForm");
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
    // $ANTLR end "ruleImplForm"


    // $ANTLR start "entryRuleOrForm"
    // InternalDSLSAT.g:234:1: entryRuleOrForm returns [EObject current=null] : iv_ruleOrForm= ruleOrForm EOF ;
    public final EObject entryRuleOrForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrForm = null;


        try {
            // InternalDSLSAT.g:234:47: (iv_ruleOrForm= ruleOrForm EOF )
            // InternalDSLSAT.g:235:2: iv_ruleOrForm= ruleOrForm EOF
            {
             newCompositeNode(grammarAccess.getOrFormRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrForm=ruleOrForm();

            state._fsp--;

             current =iv_ruleOrForm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrForm"


    // $ANTLR start "ruleOrForm"
    // InternalDSLSAT.g:241:1: ruleOrForm returns [EObject current=null] : (this_AndForm_0= ruleAndForm ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAndForm ) ) )* ) ;
    public final EObject ruleOrForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndForm_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDSLSAT.g:247:2: ( (this_AndForm_0= ruleAndForm ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAndForm ) ) )* ) )
            // InternalDSLSAT.g:248:2: (this_AndForm_0= ruleAndForm ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAndForm ) ) )* )
            {
            // InternalDSLSAT.g:248:2: (this_AndForm_0= ruleAndForm ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAndForm ) ) )* )
            // InternalDSLSAT.g:249:3: this_AndForm_0= ruleAndForm ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAndForm ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrFormAccess().getAndFormParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_AndForm_0=ruleAndForm();

            state._fsp--;


            			current = this_AndForm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDSLSAT.g:257:3: ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAndForm ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDSLSAT.g:258:4: () otherlv_2= 'v' ( (lv_right_3_0= ruleAndForm ) )
            	    {
            	    // InternalDSLSAT.g:258:4: ()
            	    // InternalDSLSAT.g:259:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrFormAccess().getOrFormLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrFormAccess().getVKeyword_1_1());
            	    			
            	    // InternalDSLSAT.g:269:4: ( (lv_right_3_0= ruleAndForm ) )
            	    // InternalDSLSAT.g:270:5: (lv_right_3_0= ruleAndForm )
            	    {
            	    // InternalDSLSAT.g:270:5: (lv_right_3_0= ruleAndForm )
            	    // InternalDSLSAT.g:271:6: lv_right_3_0= ruleAndForm
            	    {

            	    						newCompositeNode(grammarAccess.getOrFormAccess().getRightAndFormParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_right_3_0=ruleAndForm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrFormRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.DSLSAT.AndForm");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleOrForm"


    // $ANTLR start "entryRuleAndForm"
    // InternalDSLSAT.g:293:1: entryRuleAndForm returns [EObject current=null] : iv_ruleAndForm= ruleAndForm EOF ;
    public final EObject entryRuleAndForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndForm = null;


        try {
            // InternalDSLSAT.g:293:48: (iv_ruleAndForm= ruleAndForm EOF )
            // InternalDSLSAT.g:294:2: iv_ruleAndForm= ruleAndForm EOF
            {
             newCompositeNode(grammarAccess.getAndFormRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndForm=ruleAndForm();

            state._fsp--;

             current =iv_ruleAndForm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAndForm"


    // $ANTLR start "ruleAndForm"
    // InternalDSLSAT.g:300:1: ruleAndForm returns [EObject current=null] : (this_NandForm_0= ruleNandForm ( () otherlv_2= '^' ( (lv_right_3_0= ruleNandForm ) ) )* ) ;
    public final EObject ruleAndForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NandForm_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDSLSAT.g:306:2: ( (this_NandForm_0= ruleNandForm ( () otherlv_2= '^' ( (lv_right_3_0= ruleNandForm ) ) )* ) )
            // InternalDSLSAT.g:307:2: (this_NandForm_0= ruleNandForm ( () otherlv_2= '^' ( (lv_right_3_0= ruleNandForm ) ) )* )
            {
            // InternalDSLSAT.g:307:2: (this_NandForm_0= ruleNandForm ( () otherlv_2= '^' ( (lv_right_3_0= ruleNandForm ) ) )* )
            // InternalDSLSAT.g:308:3: this_NandForm_0= ruleNandForm ( () otherlv_2= '^' ( (lv_right_3_0= ruleNandForm ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndFormAccess().getNandFormParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_NandForm_0=ruleNandForm();

            state._fsp--;


            			current = this_NandForm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDSLSAT.g:316:3: ( () otherlv_2= '^' ( (lv_right_3_0= ruleNandForm ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDSLSAT.g:317:4: () otherlv_2= '^' ( (lv_right_3_0= ruleNandForm ) )
            	    {
            	    // InternalDSLSAT.g:317:4: ()
            	    // InternalDSLSAT.g:318:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndFormAccess().getAndFormLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndFormAccess().getCircumflexAccentKeyword_1_1());
            	    			
            	    // InternalDSLSAT.g:328:4: ( (lv_right_3_0= ruleNandForm ) )
            	    // InternalDSLSAT.g:329:5: (lv_right_3_0= ruleNandForm )
            	    {
            	    // InternalDSLSAT.g:329:5: (lv_right_3_0= ruleNandForm )
            	    // InternalDSLSAT.g:330:6: lv_right_3_0= ruleNandForm
            	    {

            	    						newCompositeNode(grammarAccess.getAndFormAccess().getRightNandFormParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_right_3_0=ruleNandForm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndFormRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.DSLSAT.NandForm");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleAndForm"


    // $ANTLR start "entryRuleNandForm"
    // InternalDSLSAT.g:352:1: entryRuleNandForm returns [EObject current=null] : iv_ruleNandForm= ruleNandForm EOF ;
    public final EObject entryRuleNandForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNandForm = null;


        try {
            // InternalDSLSAT.g:352:49: (iv_ruleNandForm= ruleNandForm EOF )
            // InternalDSLSAT.g:353:2: iv_ruleNandForm= ruleNandForm EOF
            {
             newCompositeNode(grammarAccess.getNandFormRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNandForm=ruleNandForm();

            state._fsp--;

             current =iv_ruleNandForm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNandForm"


    // $ANTLR start "ruleNandForm"
    // InternalDSLSAT.g:359:1: ruleNandForm returns [EObject current=null] : (this_Form_0= ruleForm ( () otherlv_2= '|' ( (lv_right_3_0= ruleForm ) ) )* ) ;
    public final EObject ruleNandForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Form_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDSLSAT.g:365:2: ( (this_Form_0= ruleForm ( () otherlv_2= '|' ( (lv_right_3_0= ruleForm ) ) )* ) )
            // InternalDSLSAT.g:366:2: (this_Form_0= ruleForm ( () otherlv_2= '|' ( (lv_right_3_0= ruleForm ) ) )* )
            {
            // InternalDSLSAT.g:366:2: (this_Form_0= ruleForm ( () otherlv_2= '|' ( (lv_right_3_0= ruleForm ) ) )* )
            // InternalDSLSAT.g:367:3: this_Form_0= ruleForm ( () otherlv_2= '|' ( (lv_right_3_0= ruleForm ) ) )*
            {

            			newCompositeNode(grammarAccess.getNandFormAccess().getFormParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Form_0=ruleForm();

            state._fsp--;


            			current = this_Form_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDSLSAT.g:375:3: ( () otherlv_2= '|' ( (lv_right_3_0= ruleForm ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDSLSAT.g:376:4: () otherlv_2= '|' ( (lv_right_3_0= ruleForm ) )
            	    {
            	    // InternalDSLSAT.g:376:4: ()
            	    // InternalDSLSAT.g:377:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getNandFormAccess().getNandFormLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getNandFormAccess().getVerticalLineKeyword_1_1());
            	    			
            	    // InternalDSLSAT.g:387:4: ( (lv_right_3_0= ruleForm ) )
            	    // InternalDSLSAT.g:388:5: (lv_right_3_0= ruleForm )
            	    {
            	    // InternalDSLSAT.g:388:5: (lv_right_3_0= ruleForm )
            	    // InternalDSLSAT.g:389:6: lv_right_3_0= ruleForm
            	    {

            	    						newCompositeNode(grammarAccess.getNandFormAccess().getRightFormParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_right_3_0=ruleForm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNandFormRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.DSLSAT.Form");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


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
    // $ANTLR end "ruleNandForm"


    // $ANTLR start "entryRuleForm"
    // InternalDSLSAT.g:411:1: entryRuleForm returns [EObject current=null] : iv_ruleForm= ruleForm EOF ;
    public final EObject entryRuleForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForm = null;


        try {
            // InternalDSLSAT.g:411:45: (iv_ruleForm= ruleForm EOF )
            // InternalDSLSAT.g:412:2: iv_ruleForm= ruleForm EOF
            {
             newCompositeNode(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForm=ruleForm();

            state._fsp--;

             current =iv_ruleForm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // InternalDSLSAT.g:418:1: ruleForm returns [EObject current=null] : ( ( (lv_form_0_0= ruleConst ) ) | ( (lv_form_1_0= ruleVar ) ) | ( (lv_form_2_0= ruleNotForm ) ) | (otherlv_3= '(' ( (lv_form_4_0= ruleBiImplForm ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_form_0_0 = null;

        EObject lv_form_1_0 = null;

        EObject lv_form_2_0 = null;

        EObject lv_form_4_0 = null;



        	enterRule();

        try {
            // InternalDSLSAT.g:424:2: ( ( ( (lv_form_0_0= ruleConst ) ) | ( (lv_form_1_0= ruleVar ) ) | ( (lv_form_2_0= ruleNotForm ) ) | (otherlv_3= '(' ( (lv_form_4_0= ruleBiImplForm ) ) otherlv_5= ')' ) ) )
            // InternalDSLSAT.g:425:2: ( ( (lv_form_0_0= ruleConst ) ) | ( (lv_form_1_0= ruleVar ) ) | ( (lv_form_2_0= ruleNotForm ) ) | (otherlv_3= '(' ( (lv_form_4_0= ruleBiImplForm ) ) otherlv_5= ')' ) )
            {
            // InternalDSLSAT.g:425:2: ( ( (lv_form_0_0= ruleConst ) ) | ( (lv_form_1_0= ruleVar ) ) | ( (lv_form_2_0= ruleNotForm ) ) | (otherlv_3= '(' ( (lv_form_4_0= ruleBiImplForm ) ) otherlv_5= ')' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 21:
            case 22:
                {
                alt7=1;
                }
                break;
            case RULE_LOWID:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            case 18:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDSLSAT.g:426:3: ( (lv_form_0_0= ruleConst ) )
                    {
                    // InternalDSLSAT.g:426:3: ( (lv_form_0_0= ruleConst ) )
                    // InternalDSLSAT.g:427:4: (lv_form_0_0= ruleConst )
                    {
                    // InternalDSLSAT.g:427:4: (lv_form_0_0= ruleConst )
                    // InternalDSLSAT.g:428:5: lv_form_0_0= ruleConst
                    {

                    					newCompositeNode(grammarAccess.getFormAccess().getFormConstParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_form_0_0=ruleConst();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormRule());
                    					}
                    					set(
                    						current,
                    						"form",
                    						lv_form_0_0,
                    						"org.xtext.example.mydsl.DSLSAT.Const");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDSLSAT.g:446:3: ( (lv_form_1_0= ruleVar ) )
                    {
                    // InternalDSLSAT.g:446:3: ( (lv_form_1_0= ruleVar ) )
                    // InternalDSLSAT.g:447:4: (lv_form_1_0= ruleVar )
                    {
                    // InternalDSLSAT.g:447:4: (lv_form_1_0= ruleVar )
                    // InternalDSLSAT.g:448:5: lv_form_1_0= ruleVar
                    {

                    					newCompositeNode(grammarAccess.getFormAccess().getFormVarParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_form_1_0=ruleVar();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormRule());
                    					}
                    					set(
                    						current,
                    						"form",
                    						lv_form_1_0,
                    						"org.xtext.example.mydsl.DSLSAT.Var");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDSLSAT.g:466:3: ( (lv_form_2_0= ruleNotForm ) )
                    {
                    // InternalDSLSAT.g:466:3: ( (lv_form_2_0= ruleNotForm ) )
                    // InternalDSLSAT.g:467:4: (lv_form_2_0= ruleNotForm )
                    {
                    // InternalDSLSAT.g:467:4: (lv_form_2_0= ruleNotForm )
                    // InternalDSLSAT.g:468:5: lv_form_2_0= ruleNotForm
                    {

                    					newCompositeNode(grammarAccess.getFormAccess().getFormNotFormParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_form_2_0=ruleNotForm();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormRule());
                    					}
                    					set(
                    						current,
                    						"form",
                    						lv_form_2_0,
                    						"org.xtext.example.mydsl.DSLSAT.NotForm");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDSLSAT.g:486:3: (otherlv_3= '(' ( (lv_form_4_0= ruleBiImplForm ) ) otherlv_5= ')' )
                    {
                    // InternalDSLSAT.g:486:3: (otherlv_3= '(' ( (lv_form_4_0= ruleBiImplForm ) ) otherlv_5= ')' )
                    // InternalDSLSAT.g:487:4: otherlv_3= '(' ( (lv_form_4_0= ruleBiImplForm ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getFormAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalDSLSAT.g:491:4: ( (lv_form_4_0= ruleBiImplForm ) )
                    // InternalDSLSAT.g:492:5: (lv_form_4_0= ruleBiImplForm )
                    {
                    // InternalDSLSAT.g:492:5: (lv_form_4_0= ruleBiImplForm )
                    // InternalDSLSAT.g:493:6: lv_form_4_0= ruleBiImplForm
                    {

                    						newCompositeNode(grammarAccess.getFormAccess().getFormBiImplFormParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_form_4_0=ruleBiImplForm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormRule());
                    						}
                    						set(
                    							current,
                    							"form",
                    							lv_form_4_0,
                    							"org.xtext.example.mydsl.DSLSAT.BiImplForm");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getFormAccess().getRightParenthesisKeyword_3_2());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleNotForm"
    // InternalDSLSAT.g:519:1: entryRuleNotForm returns [EObject current=null] : iv_ruleNotForm= ruleNotForm EOF ;
    public final EObject entryRuleNotForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotForm = null;


        try {
            // InternalDSLSAT.g:519:48: (iv_ruleNotForm= ruleNotForm EOF )
            // InternalDSLSAT.g:520:2: iv_ruleNotForm= ruleNotForm EOF
            {
             newCompositeNode(grammarAccess.getNotFormRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotForm=ruleNotForm();

            state._fsp--;

             current =iv_ruleNotForm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNotForm"


    // $ANTLR start "ruleNotForm"
    // InternalDSLSAT.g:526:1: ruleNotForm returns [EObject current=null] : (otherlv_0= '!' this_Form_1= ruleForm () ) ;
    public final EObject ruleNotForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Form_1 = null;



        	enterRule();

        try {
            // InternalDSLSAT.g:532:2: ( (otherlv_0= '!' this_Form_1= ruleForm () ) )
            // InternalDSLSAT.g:533:2: (otherlv_0= '!' this_Form_1= ruleForm () )
            {
            // InternalDSLSAT.g:533:2: (otherlv_0= '!' this_Form_1= ruleForm () )
            // InternalDSLSAT.g:534:3: otherlv_0= '!' this_Form_1= ruleForm ()
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNotFormAccess().getExclamationMarkKeyword_0());
            		

            			newCompositeNode(grammarAccess.getNotFormAccess().getFormParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Form_1=ruleForm();

            state._fsp--;


            			current = this_Form_1;
            			afterParserOrEnumRuleCall();
            		
            // InternalDSLSAT.g:546:3: ()
            // InternalDSLSAT.g:547:4: 
            {

            				current = forceCreateModelElementAndSet(
            					grammarAccess.getNotFormAccess().getNotFormFormAction_2(),
            					current);
            			

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
    // $ANTLR end "ruleNotForm"


    // $ANTLR start "entryRuleVar"
    // InternalDSLSAT.g:557:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalDSLSAT.g:557:44: (iv_ruleVar= ruleVar EOF )
            // InternalDSLSAT.g:558:2: iv_ruleVar= ruleVar EOF
            {
             newCompositeNode(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;

             current =iv_ruleVar; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalDSLSAT.g:564:1: ruleVar returns [EObject current=null] : ( (lv_id_0_0= RULE_LOWID ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalDSLSAT.g:570:2: ( ( (lv_id_0_0= RULE_LOWID ) ) )
            // InternalDSLSAT.g:571:2: ( (lv_id_0_0= RULE_LOWID ) )
            {
            // InternalDSLSAT.g:571:2: ( (lv_id_0_0= RULE_LOWID ) )
            // InternalDSLSAT.g:572:3: (lv_id_0_0= RULE_LOWID )
            {
            // InternalDSLSAT.g:572:3: (lv_id_0_0= RULE_LOWID )
            // InternalDSLSAT.g:573:4: lv_id_0_0= RULE_LOWID
            {
            lv_id_0_0=(Token)match(input,RULE_LOWID,FOLLOW_2); 

            				newLeafNode(lv_id_0_0, grammarAccess.getVarAccess().getIdLOWIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVarRule());
            				}
            				setWithLastConsumed(
            					current,
            					"id",
            					lv_id_0_0,
            					"org.xtext.example.mydsl.DSLSAT.LOWID");
            			

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
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleConst"
    // InternalDSLSAT.g:592:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // InternalDSLSAT.g:592:46: (iv_ruleConst= ruleConst EOF )
            // InternalDSLSAT.g:593:2: iv_ruleConst= ruleConst EOF
            {
             newCompositeNode(grammarAccess.getConstRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConst=ruleConst();

            state._fsp--;

             current =iv_ruleConst; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConst"


    // $ANTLR start "ruleConst"
    // InternalDSLSAT.g:599:1: ruleConst returns [EObject current=null] : ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_1=null;
        Token lv_val_0_2=null;


        	enterRule();

        try {
            // InternalDSLSAT.g:605:2: ( ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) ) )
            // InternalDSLSAT.g:606:2: ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) )
            {
            // InternalDSLSAT.g:606:2: ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) )
            // InternalDSLSAT.g:607:3: ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) )
            {
            // InternalDSLSAT.g:607:3: ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) )
            // InternalDSLSAT.g:608:4: (lv_val_0_1= 'true' | lv_val_0_2= 'false' )
            {
            // InternalDSLSAT.g:608:4: (lv_val_0_1= 'true' | lv_val_0_2= 'false' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDSLSAT.g:609:5: lv_val_0_1= 'true'
                    {
                    lv_val_0_1=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_val_0_1, grammarAccess.getConstAccess().getValTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstRule());
                    					}
                    					setWithLastConsumed(current, "val", lv_val_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalDSLSAT.g:620:5: lv_val_0_2= 'false'
                    {
                    lv_val_0_2=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_val_0_2, grammarAccess.getConstAccess().getValFalseKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstRule());
                    					}
                    					setWithLastConsumed(current, "val", lv_val_0_2, null);
                    				

                    }
                    break;

            }


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
    // $ANTLR end "ruleConst"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000740010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});

}