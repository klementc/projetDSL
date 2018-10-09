/*
 * generated by Xtext 2.15.0
 */
grammar InternalDSLSAT;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getModelAccess().getBiImplFormParserRuleCall());
	}
	this_BiImplForm_0=ruleBiImplForm
	{
		$current = $this_BiImplForm_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleBiImplForm
entryRuleBiImplForm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBiImplFormRule()); }
	iv_ruleBiImplForm=ruleBiImplForm
	{ $current=$iv_ruleBiImplForm.current; }
	EOF;

// Rule BiImplForm
ruleBiImplForm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getBiImplFormAccess().getImplFormParserRuleCall_0());
		}
		this_ImplForm_0=ruleImplForm
		{
			$current = $this_ImplForm_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getBiImplFormAccess().getBiImplFormLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='<=>'
			{
				newLeafNode(otherlv_2, grammarAccess.getBiImplFormAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBiImplFormAccess().getRightImplFormParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleImplForm
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBiImplFormRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.example.mydsl.DSLSAT.ImplForm");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleImplForm
entryRuleImplForm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImplFormRule()); }
	iv_ruleImplForm=ruleImplForm
	{ $current=$iv_ruleImplForm.current; }
	EOF;

// Rule ImplForm
ruleImplForm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getImplFormAccess().getOrFormParserRuleCall_0());
		}
		this_OrForm_0=ruleOrForm
		{
			$current = $this_OrForm_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getImplFormAccess().getEqFormLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='=>'
			{
				newLeafNode(otherlv_2, grammarAccess.getImplFormAccess().getEqualsSignGreaterThanSignKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getImplFormAccess().getRightOrFormParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleOrForm
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getImplFormRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.example.mydsl.DSLSAT.OrForm");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleOrForm
entryRuleOrForm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrFormRule()); }
	iv_ruleOrForm=ruleOrForm
	{ $current=$iv_ruleOrForm.current; }
	EOF;

// Rule OrForm
ruleOrForm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getOrFormAccess().getAndFormParserRuleCall_0());
		}
		this_AndForm_0=ruleAndForm
		{
			$current = $this_AndForm_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getOrFormAccess().getOrFormLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='v'
			{
				newLeafNode(otherlv_2, grammarAccess.getOrFormAccess().getVKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOrFormAccess().getRightAndFormParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleAndForm
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOrFormRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.example.mydsl.DSLSAT.AndForm");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAndForm
entryRuleAndForm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndFormRule()); }
	iv_ruleAndForm=ruleAndForm
	{ $current=$iv_ruleAndForm.current; }
	EOF;

// Rule AndForm
ruleAndForm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAndFormAccess().getNandFormParserRuleCall_0());
		}
		this_NandForm_0=ruleNandForm
		{
			$current = $this_NandForm_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAndFormAccess().getAndFormLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='^'
			{
				newLeafNode(otherlv_2, grammarAccess.getAndFormAccess().getCircumflexAccentKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAndFormAccess().getRightNandFormParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleNandForm
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndFormRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.example.mydsl.DSLSAT.NandForm");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleNandForm
entryRuleNandForm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNandFormRule()); }
	iv_ruleNandForm=ruleNandForm
	{ $current=$iv_ruleNandForm.current; }
	EOF;

// Rule NandForm
ruleNandForm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getNandFormAccess().getFormParserRuleCall_0());
		}
		this_Form_0=ruleForm
		{
			$current = $this_Form_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getNandFormAccess().getNandFormLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='|'
			{
				newLeafNode(otherlv_2, grammarAccess.getNandFormAccess().getVerticalLineKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNandFormAccess().getRightFormParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleForm
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNandFormRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.example.mydsl.DSLSAT.Form");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleForm
entryRuleForm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFormRule()); }
	iv_ruleForm=ruleForm
	{ $current=$iv_ruleForm.current; }
	EOF;

// Rule Form
ruleForm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getFormAccess().getFConstParserRuleCall_0_0());
				}
				lv_f_0_0=ruleConst
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFormRule());
					}
					set(
						$current,
						"f",
						lv_f_0_0,
						"org.xtext.example.mydsl.DSLSAT.Const");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getFormAccess().getFVarParserRuleCall_1_0());
				}
				lv_f_1_0=ruleVar
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFormRule());
					}
					set(
						$current,
						"f",
						lv_f_1_0,
						"org.xtext.example.mydsl.DSLSAT.Var");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getFormAccess().getFNotFormParserRuleCall_2_0());
				}
				lv_f_2_0=ruleNotForm
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFormRule());
					}
					set(
						$current,
						"f",
						lv_f_2_0,
						"org.xtext.example.mydsl.DSLSAT.NotForm");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			otherlv_3='('
			{
				newLeafNode(otherlv_3, grammarAccess.getFormAccess().getLeftParenthesisKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFormAccess().getFBiImplFormParserRuleCall_3_1_0());
					}
					lv_f_4_0=ruleBiImplForm
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFormRule());
						}
						set(
							$current,
							"f",
							lv_f_4_0,
							"org.xtext.example.mydsl.DSLSAT.BiImplForm");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_5=')'
			{
				newLeafNode(otherlv_5, grammarAccess.getFormAccess().getRightParenthesisKeyword_3_2());
			}
		)
	)
;

// Entry rule entryRuleNotForm
entryRuleNotForm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNotFormRule()); }
	iv_ruleNotForm=ruleNotForm
	{ $current=$iv_ruleNotForm.current; }
	EOF;

// Rule NotForm
ruleNotForm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='!'
		{
			newLeafNode(otherlv_0, grammarAccess.getNotFormAccess().getExclamationMarkKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getNotFormAccess().getFormParserRuleCall_1());
		}
		this_Form_1=ruleForm
		{
			$current = $this_Form_1.current;
			afterParserOrEnumRuleCall();
		}
		(
			{
				$current = forceCreateModelElementAndSet(
					grammarAccess.getNotFormAccess().getNotFormFormAction_2(),
					$current);
			}
		)
	)
;

// Entry rule entryRuleVar
entryRuleVar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVarRule()); }
	iv_ruleVar=ruleVar
	{ $current=$iv_ruleVar.current; }
	EOF;

// Rule Var
ruleVar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_id_0_0=RULE_LOWID
			{
				newLeafNode(lv_id_0_0, grammarAccess.getVarAccess().getIdLOWIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getVarRule());
				}
				setWithLastConsumed(
					$current,
					"id",
					lv_id_0_0,
					"org.xtext.example.mydsl.DSLSAT.LOWID");
			}
		)
	)
;

// Entry rule entryRuleConst
entryRuleConst returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstRule()); }
	iv_ruleConst=ruleConst
	{ $current=$iv_ruleConst.current; }
	EOF;

// Rule Const
ruleConst returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_val_0_1='true'
				{
					newLeafNode(lv_val_0_1, grammarAccess.getConstAccess().getValTrueKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConstRule());
					}
					setWithLastConsumed($current, "val", lv_val_0_1, null);
				}
				    |
				lv_val_0_2='false'
				{
					newLeafNode(lv_val_0_2, grammarAccess.getConstAccess().getValFalseKeyword_0_1());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConstRule());
					}
					setWithLastConsumed($current, "val", lv_val_0_2, null);
				}
			)
		)
	)
;

RULE_LOWID : ('A'..'Z')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
