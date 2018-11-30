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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_LOWID", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FromFile'", "'#SOLVER'", "'SAT4J'", "'MINISAT'", "'YALSAT'", "'<=>'", "'=>'", "'v'", "'^'", "'|'", "'('", "')'", "'!'", "'true'", "'false'"
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
    // InternalDSLSAT.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_annot_0_0= ruleAnnotation ) )? ( ( (lv_form_1_0= ruleBiImplForm ) ) | (otherlv_2= 'FromFile' ( (lv_path_3_0= RULE_STRING ) ) ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_path_3_0=null;
        EObject lv_annot_0_0 = null;

        EObject lv_form_1_0 = null;



        	enterRule();

        try {
            // InternalDSLSAT.g:77:2: ( ( ( (lv_annot_0_0= ruleAnnotation ) )? ( ( (lv_form_1_0= ruleBiImplForm ) ) | (otherlv_2= 'FromFile' ( (lv_path_3_0= RULE_STRING ) ) ) ) ) )
            // InternalDSLSAT.g:78:2: ( ( (lv_annot_0_0= ruleAnnotation ) )? ( ( (lv_form_1_0= ruleBiImplForm ) ) | (otherlv_2= 'FromFile' ( (lv_path_3_0= RULE_STRING ) ) ) ) )
            {
            // InternalDSLSAT.g:78:2: ( ( (lv_annot_0_0= ruleAnnotation ) )? ( ( (lv_form_1_0= ruleBiImplForm ) ) | (otherlv_2= 'FromFile' ( (lv_path_3_0= RULE_STRING ) ) ) ) )
            // InternalDSLSAT.g:79:3: ( (lv_annot_0_0= ruleAnnotation ) )? ( ( (lv_form_1_0= ruleBiImplForm ) ) | (otherlv_2= 'FromFile' ( (lv_path_3_0= RULE_STRING ) ) ) )
            {
            // InternalDSLSAT.g:79:3: ( (lv_annot_0_0= ruleAnnotation ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDSLSAT.g:80:4: (lv_annot_0_0= ruleAnnotation )
                    {
                    // InternalDSLSAT.g:80:4: (lv_annot_0_0= ruleAnnotation )
                    // InternalDSLSAT.g:81:5: lv_annot_0_0= ruleAnnotation
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getAnnotAnnotationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_annot_0_0=ruleAnnotation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"annot",
                    						lv_annot_0_0,
                    						"org.xtext.example.mydsl.DSLSAT.Annotation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDSLSAT.g:98:3: ( ( (lv_form_1_0= ruleBiImplForm ) ) | (otherlv_2= 'FromFile' ( (lv_path_3_0= RULE_STRING ) ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_LOWID||LA2_0==22||(LA2_0>=24 && LA2_0<=26)) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDSLSAT.g:99:4: ( (lv_form_1_0= ruleBiImplForm ) )
                    {
                    // InternalDSLSAT.g:99:4: ( (lv_form_1_0= ruleBiImplForm ) )
                    // InternalDSLSAT.g:100:5: (lv_form_1_0= ruleBiImplForm )
                    {
                    // InternalDSLSAT.g:100:5: (lv_form_1_0= ruleBiImplForm )
                    // InternalDSLSAT.g:101:6: lv_form_1_0= ruleBiImplForm
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getFormBiImplFormParserRuleCall_1_0_0());
                    					
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
                    break;
                case 2 :
                    // InternalDSLSAT.g:119:4: (otherlv_2= 'FromFile' ( (lv_path_3_0= RULE_STRING ) ) )
                    {
                    // InternalDSLSAT.g:119:4: (otherlv_2= 'FromFile' ( (lv_path_3_0= RULE_STRING ) ) )
                    // InternalDSLSAT.g:120:5: otherlv_2= 'FromFile' ( (lv_path_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    					newLeafNode(otherlv_2, grammarAccess.getModelAccess().getFromFileKeyword_1_1_0());
                    				
                    // InternalDSLSAT.g:124:5: ( (lv_path_3_0= RULE_STRING ) )
                    // InternalDSLSAT.g:125:6: (lv_path_3_0= RULE_STRING )
                    {
                    // InternalDSLSAT.g:125:6: (lv_path_3_0= RULE_STRING )
                    // InternalDSLSAT.g:126:7: lv_path_3_0= RULE_STRING
                    {
                    lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_path_3_0, grammarAccess.getModelAccess().getPathSTRINGTerminalRuleCall_1_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getModelRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"path",
                    								lv_path_3_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAnnotation"
    // InternalDSLSAT.g:148:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalDSLSAT.g:148:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalDSLSAT.g:149:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalDSLSAT.g:155:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '#SOLVER' ( ( (lv_solver_1_1= 'SAT4J' | lv_solver_1_2= 'MINISAT' | lv_solver_1_3= 'YALSAT' ) ) ) ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_solver_1_1=null;
        Token lv_solver_1_2=null;
        Token lv_solver_1_3=null;


        	enterRule();

        try {
            // InternalDSLSAT.g:161:2: ( (otherlv_0= '#SOLVER' ( ( (lv_solver_1_1= 'SAT4J' | lv_solver_1_2= 'MINISAT' | lv_solver_1_3= 'YALSAT' ) ) ) ) )
            // InternalDSLSAT.g:162:2: (otherlv_0= '#SOLVER' ( ( (lv_solver_1_1= 'SAT4J' | lv_solver_1_2= 'MINISAT' | lv_solver_1_3= 'YALSAT' ) ) ) )
            {
            // InternalDSLSAT.g:162:2: (otherlv_0= '#SOLVER' ( ( (lv_solver_1_1= 'SAT4J' | lv_solver_1_2= 'MINISAT' | lv_solver_1_3= 'YALSAT' ) ) ) )
            // InternalDSLSAT.g:163:3: otherlv_0= '#SOLVER' ( ( (lv_solver_1_1= 'SAT4J' | lv_solver_1_2= 'MINISAT' | lv_solver_1_3= 'YALSAT' ) ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getSOLVERKeyword_0());
            		
            // InternalDSLSAT.g:167:3: ( ( (lv_solver_1_1= 'SAT4J' | lv_solver_1_2= 'MINISAT' | lv_solver_1_3= 'YALSAT' ) ) )
            // InternalDSLSAT.g:168:4: ( (lv_solver_1_1= 'SAT4J' | lv_solver_1_2= 'MINISAT' | lv_solver_1_3= 'YALSAT' ) )
            {
            // InternalDSLSAT.g:168:4: ( (lv_solver_1_1= 'SAT4J' | lv_solver_1_2= 'MINISAT' | lv_solver_1_3= 'YALSAT' ) )
            // InternalDSLSAT.g:169:5: (lv_solver_1_1= 'SAT4J' | lv_solver_1_2= 'MINISAT' | lv_solver_1_3= 'YALSAT' )
            {
            // InternalDSLSAT.g:169:5: (lv_solver_1_1= 'SAT4J' | lv_solver_1_2= 'MINISAT' | lv_solver_1_3= 'YALSAT' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDSLSAT.g:170:6: lv_solver_1_1= 'SAT4J'
                    {
                    lv_solver_1_1=(Token)match(input,14,FOLLOW_2); 

                    						newLeafNode(lv_solver_1_1, grammarAccess.getAnnotationAccess().getSolverSAT4JKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAnnotationRule());
                    						}
                    						setWithLastConsumed(current, "solver", lv_solver_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalDSLSAT.g:181:6: lv_solver_1_2= 'MINISAT'
                    {
                    lv_solver_1_2=(Token)match(input,15,FOLLOW_2); 

                    						newLeafNode(lv_solver_1_2, grammarAccess.getAnnotationAccess().getSolverMINISATKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAnnotationRule());
                    						}
                    						setWithLastConsumed(current, "solver", lv_solver_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalDSLSAT.g:192:6: lv_solver_1_3= 'YALSAT'
                    {
                    lv_solver_1_3=(Token)match(input,16,FOLLOW_2); 

                    						newLeafNode(lv_solver_1_3, grammarAccess.getAnnotationAccess().getSolverYALSATKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAnnotationRule());
                    						}
                    						setWithLastConsumed(current, "solver", lv_solver_1_3, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleBiImplForm"
    // InternalDSLSAT.g:209:1: entryRuleBiImplForm returns [EObject current=null] : iv_ruleBiImplForm= ruleBiImplForm EOF ;
    public final EObject entryRuleBiImplForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBiImplForm = null;


        try {
            // InternalDSLSAT.g:209:51: (iv_ruleBiImplForm= ruleBiImplForm EOF )
            // InternalDSLSAT.g:210:2: iv_ruleBiImplForm= ruleBiImplForm EOF
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
    // InternalDSLSAT.g:216:1: ruleBiImplForm returns [EObject current=null] : (this_ImplForm_0= ruleImplForm ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplForm ) ) )* ) ;
    public final EObject ruleBiImplForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ImplForm_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDSLSAT.g:222:2: ( (this_ImplForm_0= ruleImplForm ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplForm ) ) )* ) )
            // InternalDSLSAT.g:223:2: (this_ImplForm_0= ruleImplForm ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplForm ) ) )* )
            {
            // InternalDSLSAT.g:223:2: (this_ImplForm_0= ruleImplForm ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplForm ) ) )* )
            // InternalDSLSAT.g:224:3: this_ImplForm_0= ruleImplForm ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplForm ) ) )*
            {

            			newCompositeNode(grammarAccess.getBiImplFormAccess().getImplFormParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_ImplForm_0=ruleImplForm();

            state._fsp--;


            			current = this_ImplForm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDSLSAT.g:232:3: ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplForm ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDSLSAT.g:233:4: () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplForm ) )
            	    {
            	    // InternalDSLSAT.g:233:4: ()
            	    // InternalDSLSAT.g:234:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getBiImplFormAccess().getBiImplFormLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getBiImplFormAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalDSLSAT.g:244:4: ( (lv_right_3_0= ruleImplForm ) )
            	    // InternalDSLSAT.g:245:5: (lv_right_3_0= ruleImplForm )
            	    {
            	    // InternalDSLSAT.g:245:5: (lv_right_3_0= ruleImplForm )
            	    // InternalDSLSAT.g:246:6: lv_right_3_0= ruleImplForm
            	    {

            	    						newCompositeNode(grammarAccess.getBiImplFormAccess().getRightImplFormParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
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
    // $ANTLR end "ruleBiImplForm"


    // $ANTLR start "entryRuleImplForm"
    // InternalDSLSAT.g:268:1: entryRuleImplForm returns [EObject current=null] : iv_ruleImplForm= ruleImplForm EOF ;
    public final EObject entryRuleImplForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplForm = null;


        try {
            // InternalDSLSAT.g:268:49: (iv_ruleImplForm= ruleImplForm EOF )
            // InternalDSLSAT.g:269:2: iv_ruleImplForm= ruleImplForm EOF
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
    // InternalDSLSAT.g:275:1: ruleImplForm returns [EObject current=null] : (this_OrForm_0= ruleOrForm ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOrForm ) ) )* ) ;
    public final EObject ruleImplForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OrForm_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDSLSAT.g:281:2: ( (this_OrForm_0= ruleOrForm ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOrForm ) ) )* ) )
            // InternalDSLSAT.g:282:2: (this_OrForm_0= ruleOrForm ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOrForm ) ) )* )
            {
            // InternalDSLSAT.g:282:2: (this_OrForm_0= ruleOrForm ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOrForm ) ) )* )
            // InternalDSLSAT.g:283:3: this_OrForm_0= ruleOrForm ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOrForm ) ) )*
            {

            			newCompositeNode(grammarAccess.getImplFormAccess().getOrFormParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_OrForm_0=ruleOrForm();

            state._fsp--;


            			current = this_OrForm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDSLSAT.g:291:3: ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOrForm ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDSLSAT.g:292:4: () otherlv_2= '=>' ( (lv_right_3_0= ruleOrForm ) )
            	    {
            	    // InternalDSLSAT.g:292:4: ()
            	    // InternalDSLSAT.g:293:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getImplFormAccess().getImplFormLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getImplFormAccess().getEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalDSLSAT.g:303:4: ( (lv_right_3_0= ruleOrForm ) )
            	    // InternalDSLSAT.g:304:5: (lv_right_3_0= ruleOrForm )
            	    {
            	    // InternalDSLSAT.g:304:5: (lv_right_3_0= ruleOrForm )
            	    // InternalDSLSAT.g:305:6: lv_right_3_0= ruleOrForm
            	    {

            	    						newCompositeNode(grammarAccess.getImplFormAccess().getRightOrFormParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_8);
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
    // $ANTLR end "ruleImplForm"


    // $ANTLR start "entryRuleOrForm"
    // InternalDSLSAT.g:327:1: entryRuleOrForm returns [EObject current=null] : iv_ruleOrForm= ruleOrForm EOF ;
    public final EObject entryRuleOrForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrForm = null;


        try {
            // InternalDSLSAT.g:327:47: (iv_ruleOrForm= ruleOrForm EOF )
            // InternalDSLSAT.g:328:2: iv_ruleOrForm= ruleOrForm EOF
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
    // InternalDSLSAT.g:334:1: ruleOrForm returns [EObject current=null] : (this_AndForm_0= ruleAndForm ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAndForm ) ) )* ) ;
    public final EObject ruleOrForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndForm_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDSLSAT.g:340:2: ( (this_AndForm_0= ruleAndForm ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAndForm ) ) )* ) )
            // InternalDSLSAT.g:341:2: (this_AndForm_0= ruleAndForm ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAndForm ) ) )* )
            {
            // InternalDSLSAT.g:341:2: (this_AndForm_0= ruleAndForm ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAndForm ) ) )* )
            // InternalDSLSAT.g:342:3: this_AndForm_0= ruleAndForm ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAndForm ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrFormAccess().getAndFormParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_AndForm_0=ruleAndForm();

            state._fsp--;


            			current = this_AndForm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDSLSAT.g:350:3: ( () otherlv_2= 'v' ( (lv_right_3_0= ruleAndForm ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDSLSAT.g:351:4: () otherlv_2= 'v' ( (lv_right_3_0= ruleAndForm ) )
            	    {
            	    // InternalDSLSAT.g:351:4: ()
            	    // InternalDSLSAT.g:352:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrFormAccess().getOrFormLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrFormAccess().getVKeyword_1_1());
            	    			
            	    // InternalDSLSAT.g:362:4: ( (lv_right_3_0= ruleAndForm ) )
            	    // InternalDSLSAT.g:363:5: (lv_right_3_0= ruleAndForm )
            	    {
            	    // InternalDSLSAT.g:363:5: (lv_right_3_0= ruleAndForm )
            	    // InternalDSLSAT.g:364:6: lv_right_3_0= ruleAndForm
            	    {

            	    						newCompositeNode(grammarAccess.getOrFormAccess().getRightAndFormParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
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
    // $ANTLR end "ruleOrForm"


    // $ANTLR start "entryRuleAndForm"
    // InternalDSLSAT.g:386:1: entryRuleAndForm returns [EObject current=null] : iv_ruleAndForm= ruleAndForm EOF ;
    public final EObject entryRuleAndForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndForm = null;


        try {
            // InternalDSLSAT.g:386:48: (iv_ruleAndForm= ruleAndForm EOF )
            // InternalDSLSAT.g:387:2: iv_ruleAndForm= ruleAndForm EOF
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
    // InternalDSLSAT.g:393:1: ruleAndForm returns [EObject current=null] : (this_NandForm_0= ruleNandForm ( () otherlv_2= '^' ( (lv_right_3_0= ruleNandForm ) ) )* ) ;
    public final EObject ruleAndForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NandForm_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDSLSAT.g:399:2: ( (this_NandForm_0= ruleNandForm ( () otherlv_2= '^' ( (lv_right_3_0= ruleNandForm ) ) )* ) )
            // InternalDSLSAT.g:400:2: (this_NandForm_0= ruleNandForm ( () otherlv_2= '^' ( (lv_right_3_0= ruleNandForm ) ) )* )
            {
            // InternalDSLSAT.g:400:2: (this_NandForm_0= ruleNandForm ( () otherlv_2= '^' ( (lv_right_3_0= ruleNandForm ) ) )* )
            // InternalDSLSAT.g:401:3: this_NandForm_0= ruleNandForm ( () otherlv_2= '^' ( (lv_right_3_0= ruleNandForm ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndFormAccess().getNandFormParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_NandForm_0=ruleNandForm();

            state._fsp--;


            			current = this_NandForm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDSLSAT.g:409:3: ( () otherlv_2= '^' ( (lv_right_3_0= ruleNandForm ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDSLSAT.g:410:4: () otherlv_2= '^' ( (lv_right_3_0= ruleNandForm ) )
            	    {
            	    // InternalDSLSAT.g:410:4: ()
            	    // InternalDSLSAT.g:411:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndFormAccess().getAndFormLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndFormAccess().getCircumflexAccentKeyword_1_1());
            	    			
            	    // InternalDSLSAT.g:421:4: ( (lv_right_3_0= ruleNandForm ) )
            	    // InternalDSLSAT.g:422:5: (lv_right_3_0= ruleNandForm )
            	    {
            	    // InternalDSLSAT.g:422:5: (lv_right_3_0= ruleNandForm )
            	    // InternalDSLSAT.g:423:6: lv_right_3_0= ruleNandForm
            	    {

            	    						newCompositeNode(grammarAccess.getAndFormAccess().getRightNandFormParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
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
            	    break loop7;
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
    // InternalDSLSAT.g:445:1: entryRuleNandForm returns [EObject current=null] : iv_ruleNandForm= ruleNandForm EOF ;
    public final EObject entryRuleNandForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNandForm = null;


        try {
            // InternalDSLSAT.g:445:49: (iv_ruleNandForm= ruleNandForm EOF )
            // InternalDSLSAT.g:446:2: iv_ruleNandForm= ruleNandForm EOF
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
    // InternalDSLSAT.g:452:1: ruleNandForm returns [EObject current=null] : (this_Form_0= ruleForm ( () otherlv_2= '|' ( (lv_right_3_0= ruleForm ) ) )* ) ;
    public final EObject ruleNandForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Form_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDSLSAT.g:458:2: ( (this_Form_0= ruleForm ( () otherlv_2= '|' ( (lv_right_3_0= ruleForm ) ) )* ) )
            // InternalDSLSAT.g:459:2: (this_Form_0= ruleForm ( () otherlv_2= '|' ( (lv_right_3_0= ruleForm ) ) )* )
            {
            // InternalDSLSAT.g:459:2: (this_Form_0= ruleForm ( () otherlv_2= '|' ( (lv_right_3_0= ruleForm ) ) )* )
            // InternalDSLSAT.g:460:3: this_Form_0= ruleForm ( () otherlv_2= '|' ( (lv_right_3_0= ruleForm ) ) )*
            {

            			newCompositeNode(grammarAccess.getNandFormAccess().getFormParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_Form_0=ruleForm();

            state._fsp--;


            			current = this_Form_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDSLSAT.g:468:3: ( () otherlv_2= '|' ( (lv_right_3_0= ruleForm ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDSLSAT.g:469:4: () otherlv_2= '|' ( (lv_right_3_0= ruleForm ) )
            	    {
            	    // InternalDSLSAT.g:469:4: ()
            	    // InternalDSLSAT.g:470:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getNandFormAccess().getNandFormLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getNandFormAccess().getVerticalLineKeyword_1_1());
            	    			
            	    // InternalDSLSAT.g:480:4: ( (lv_right_3_0= ruleForm ) )
            	    // InternalDSLSAT.g:481:5: (lv_right_3_0= ruleForm )
            	    {
            	    // InternalDSLSAT.g:481:5: (lv_right_3_0= ruleForm )
            	    // InternalDSLSAT.g:482:6: lv_right_3_0= ruleForm
            	    {

            	    						newCompositeNode(grammarAccess.getNandFormAccess().getRightFormParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
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
            	    break loop8;
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
    // InternalDSLSAT.g:504:1: entryRuleForm returns [EObject current=null] : iv_ruleForm= ruleForm EOF ;
    public final EObject entryRuleForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForm = null;


        try {
            // InternalDSLSAT.g:504:45: (iv_ruleForm= ruleForm EOF )
            // InternalDSLSAT.g:505:2: iv_ruleForm= ruleForm EOF
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
    // InternalDSLSAT.g:511:1: ruleForm returns [EObject current=null] : ( ( (lv_form_0_0= ruleConst ) ) | ( (lv_form_1_0= ruleVar ) ) | ( (lv_form_2_0= ruleNotForm ) ) | (otherlv_3= '(' ( (lv_form_4_0= ruleBiImplForm ) ) otherlv_5= ')' ) ) ;
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
            // InternalDSLSAT.g:517:2: ( ( ( (lv_form_0_0= ruleConst ) ) | ( (lv_form_1_0= ruleVar ) ) | ( (lv_form_2_0= ruleNotForm ) ) | (otherlv_3= '(' ( (lv_form_4_0= ruleBiImplForm ) ) otherlv_5= ')' ) ) )
            // InternalDSLSAT.g:518:2: ( ( (lv_form_0_0= ruleConst ) ) | ( (lv_form_1_0= ruleVar ) ) | ( (lv_form_2_0= ruleNotForm ) ) | (otherlv_3= '(' ( (lv_form_4_0= ruleBiImplForm ) ) otherlv_5= ')' ) )
            {
            // InternalDSLSAT.g:518:2: ( ( (lv_form_0_0= ruleConst ) ) | ( (lv_form_1_0= ruleVar ) ) | ( (lv_form_2_0= ruleNotForm ) ) | (otherlv_3= '(' ( (lv_form_4_0= ruleBiImplForm ) ) otherlv_5= ')' ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 25:
            case 26:
                {
                alt9=1;
                }
                break;
            case RULE_LOWID:
                {
                alt9=2;
                }
                break;
            case 24:
                {
                alt9=3;
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDSLSAT.g:519:3: ( (lv_form_0_0= ruleConst ) )
                    {
                    // InternalDSLSAT.g:519:3: ( (lv_form_0_0= ruleConst ) )
                    // InternalDSLSAT.g:520:4: (lv_form_0_0= ruleConst )
                    {
                    // InternalDSLSAT.g:520:4: (lv_form_0_0= ruleConst )
                    // InternalDSLSAT.g:521:5: lv_form_0_0= ruleConst
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
                    // InternalDSLSAT.g:539:3: ( (lv_form_1_0= ruleVar ) )
                    {
                    // InternalDSLSAT.g:539:3: ( (lv_form_1_0= ruleVar ) )
                    // InternalDSLSAT.g:540:4: (lv_form_1_0= ruleVar )
                    {
                    // InternalDSLSAT.g:540:4: (lv_form_1_0= ruleVar )
                    // InternalDSLSAT.g:541:5: lv_form_1_0= ruleVar
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
                    // InternalDSLSAT.g:559:3: ( (lv_form_2_0= ruleNotForm ) )
                    {
                    // InternalDSLSAT.g:559:3: ( (lv_form_2_0= ruleNotForm ) )
                    // InternalDSLSAT.g:560:4: (lv_form_2_0= ruleNotForm )
                    {
                    // InternalDSLSAT.g:560:4: (lv_form_2_0= ruleNotForm )
                    // InternalDSLSAT.g:561:5: lv_form_2_0= ruleNotForm
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
                    // InternalDSLSAT.g:579:3: (otherlv_3= '(' ( (lv_form_4_0= ruleBiImplForm ) ) otherlv_5= ')' )
                    {
                    // InternalDSLSAT.g:579:3: (otherlv_3= '(' ( (lv_form_4_0= ruleBiImplForm ) ) otherlv_5= ')' )
                    // InternalDSLSAT.g:580:4: otherlv_3= '(' ( (lv_form_4_0= ruleBiImplForm ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getFormAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalDSLSAT.g:584:4: ( (lv_form_4_0= ruleBiImplForm ) )
                    // InternalDSLSAT.g:585:5: (lv_form_4_0= ruleBiImplForm )
                    {
                    // InternalDSLSAT.g:585:5: (lv_form_4_0= ruleBiImplForm )
                    // InternalDSLSAT.g:586:6: lv_form_4_0= ruleBiImplForm
                    {

                    						newCompositeNode(grammarAccess.getFormAccess().getFormBiImplFormParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
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

                    otherlv_5=(Token)match(input,23,FOLLOW_2); 

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
    // InternalDSLSAT.g:612:1: entryRuleNotForm returns [EObject current=null] : iv_ruleNotForm= ruleNotForm EOF ;
    public final EObject entryRuleNotForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotForm = null;


        try {
            // InternalDSLSAT.g:612:48: (iv_ruleNotForm= ruleNotForm EOF )
            // InternalDSLSAT.g:613:2: iv_ruleNotForm= ruleNotForm EOF
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
    // InternalDSLSAT.g:619:1: ruleNotForm returns [EObject current=null] : (otherlv_0= '!' this_Form_1= ruleForm () ) ;
    public final EObject ruleNotForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Form_1 = null;



        	enterRule();

        try {
            // InternalDSLSAT.g:625:2: ( (otherlv_0= '!' this_Form_1= ruleForm () ) )
            // InternalDSLSAT.g:626:2: (otherlv_0= '!' this_Form_1= ruleForm () )
            {
            // InternalDSLSAT.g:626:2: (otherlv_0= '!' this_Form_1= ruleForm () )
            // InternalDSLSAT.g:627:3: otherlv_0= '!' this_Form_1= ruleForm ()
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getNotFormAccess().getExclamationMarkKeyword_0());
            		

            			newCompositeNode(grammarAccess.getNotFormAccess().getFormParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Form_1=ruleForm();

            state._fsp--;


            			current = this_Form_1;
            			afterParserOrEnumRuleCall();
            		
            // InternalDSLSAT.g:639:3: ()
            // InternalDSLSAT.g:640:4: 
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
    // InternalDSLSAT.g:650:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalDSLSAT.g:650:44: (iv_ruleVar= ruleVar EOF )
            // InternalDSLSAT.g:651:2: iv_ruleVar= ruleVar EOF
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
    // InternalDSLSAT.g:657:1: ruleVar returns [EObject current=null] : ( (lv_id_0_0= RULE_LOWID ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalDSLSAT.g:663:2: ( ( (lv_id_0_0= RULE_LOWID ) ) )
            // InternalDSLSAT.g:664:2: ( (lv_id_0_0= RULE_LOWID ) )
            {
            // InternalDSLSAT.g:664:2: ( (lv_id_0_0= RULE_LOWID ) )
            // InternalDSLSAT.g:665:3: (lv_id_0_0= RULE_LOWID )
            {
            // InternalDSLSAT.g:665:3: (lv_id_0_0= RULE_LOWID )
            // InternalDSLSAT.g:666:4: lv_id_0_0= RULE_LOWID
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
    // InternalDSLSAT.g:685:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // InternalDSLSAT.g:685:46: (iv_ruleConst= ruleConst EOF )
            // InternalDSLSAT.g:686:2: iv_ruleConst= ruleConst EOF
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
    // InternalDSLSAT.g:692:1: ruleConst returns [EObject current=null] : ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_1=null;
        Token lv_val_0_2=null;


        	enterRule();

        try {
            // InternalDSLSAT.g:698:2: ( ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) ) )
            // InternalDSLSAT.g:699:2: ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) )
            {
            // InternalDSLSAT.g:699:2: ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) )
            // InternalDSLSAT.g:700:3: ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) )
            {
            // InternalDSLSAT.g:700:3: ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) )
            // InternalDSLSAT.g:701:4: (lv_val_0_1= 'true' | lv_val_0_2= 'false' )
            {
            // InternalDSLSAT.g:701:4: (lv_val_0_1= 'true' | lv_val_0_2= 'false' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDSLSAT.g:702:5: lv_val_0_1= 'true'
                    {
                    lv_val_0_1=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_val_0_1, grammarAccess.getConstAccess().getValTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstRule());
                    					}
                    					setWithLastConsumed(current, "val", lv_val_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalDSLSAT.g:713:5: lv_val_0_2= 'false'
                    {
                    lv_val_0_2=(Token)match(input,26,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000007401020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000007400020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});

}