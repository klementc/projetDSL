/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class DSLSATGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.DSLSAT.Model");
		private final RuleCall cBiImplFormParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Model Form:
		//	BiImplForm;
		@Override public ParserRule getRule() { return rule; }
		
		//BiImplForm
		public RuleCall getBiImplFormParserRuleCall() { return cBiImplFormParserRuleCall; }
	}
	public class BiImplFormElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.DSLSAT.BiImplForm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cImplFormParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cBiImplFormLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cLessThanSignEqualsSignGreaterThanSignKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightImplFormParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//BiImplForm Form:
		//	ImplForm ({BiImplForm.left=current} '<=>' right=ImplForm)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ImplForm ({BiImplForm.left=current} '<=>' right=ImplForm)*
		public Group getGroup() { return cGroup; }
		
		//ImplForm
		public RuleCall getImplFormParserRuleCall_0() { return cImplFormParserRuleCall_0; }
		
		//({BiImplForm.left=current} '<=>' right=ImplForm)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{BiImplForm.left=current}
		public Action getBiImplFormLeftAction_1_0() { return cBiImplFormLeftAction_1_0; }
		
		//'<=>'
		public Keyword getLessThanSignEqualsSignGreaterThanSignKeyword_1_1() { return cLessThanSignEqualsSignGreaterThanSignKeyword_1_1; }
		
		//right=ImplForm
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//ImplForm
		public RuleCall getRightImplFormParserRuleCall_1_2_0() { return cRightImplFormParserRuleCall_1_2_0; }
	}
	public class ImplFormElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.DSLSAT.ImplForm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cOrFormParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cEqFormLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightOrFormParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//ImplForm Form:
		//	OrForm ({EqForm.left=current} '=>' right=OrForm)*;
		@Override public ParserRule getRule() { return rule; }
		
		//OrForm ({EqForm.left=current} '=>' right=OrForm)*
		public Group getGroup() { return cGroup; }
		
		//OrForm
		public RuleCall getOrFormParserRuleCall_0() { return cOrFormParserRuleCall_0; }
		
		//({EqForm.left=current} '=>' right=OrForm)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{EqForm.left=current}
		public Action getEqFormLeftAction_1_0() { return cEqFormLeftAction_1_0; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1_1() { return cEqualsSignGreaterThanSignKeyword_1_1; }
		
		//right=OrForm
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//OrForm
		public RuleCall getRightOrFormParserRuleCall_1_2_0() { return cRightOrFormParserRuleCall_1_2_0; }
	}
	public class OrFormElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.DSLSAT.OrForm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAndFormParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cOrFormLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cVKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightAndFormParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//OrForm Form:
		//	AndForm ({OrForm.left=current} 'v' right=AndForm)*;
		@Override public ParserRule getRule() { return rule; }
		
		//AndForm ({OrForm.left=current} 'v' right=AndForm)*
		public Group getGroup() { return cGroup; }
		
		//AndForm
		public RuleCall getAndFormParserRuleCall_0() { return cAndFormParserRuleCall_0; }
		
		//({OrForm.left=current} 'v' right=AndForm)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{OrForm.left=current}
		public Action getOrFormLeftAction_1_0() { return cOrFormLeftAction_1_0; }
		
		//'v'
		public Keyword getVKeyword_1_1() { return cVKeyword_1_1; }
		
		//right=AndForm
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//AndForm
		public RuleCall getRightAndFormParserRuleCall_1_2_0() { return cRightAndFormParserRuleCall_1_2_0; }
	}
	public class AndFormElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.DSLSAT.AndForm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cNandFormParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAndFormLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cCircumflexAccentKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightNandFormParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//AndForm Form:
		//	NandForm ({AndForm.left=current} '^' right=NandForm)*;
		@Override public ParserRule getRule() { return rule; }
		
		//NandForm ({AndForm.left=current} '^' right=NandForm)*
		public Group getGroup() { return cGroup; }
		
		//NandForm
		public RuleCall getNandFormParserRuleCall_0() { return cNandFormParserRuleCall_0; }
		
		//({AndForm.left=current} '^' right=NandForm)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{AndForm.left=current}
		public Action getAndFormLeftAction_1_0() { return cAndFormLeftAction_1_0; }
		
		//'^'
		public Keyword getCircumflexAccentKeyword_1_1() { return cCircumflexAccentKeyword_1_1; }
		
		//right=NandForm
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//NandForm
		public RuleCall getRightNandFormParserRuleCall_1_2_0() { return cRightNandFormParserRuleCall_1_2_0; }
	}
	public class NandFormElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.DSLSAT.NandForm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cFormParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cNandFormLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cVerticalLineKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightFormParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//NandForm Form:
		//	Form ({NandForm.left=current} '|' right=Form)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Form ({NandForm.left=current} '|' right=Form)*
		public Group getGroup() { return cGroup; }
		
		//Form
		public RuleCall getFormParserRuleCall_0() { return cFormParserRuleCall_0; }
		
		//({NandForm.left=current} '|' right=Form)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{NandForm.left=current}
		public Action getNandFormLeftAction_1_0() { return cNandFormLeftAction_1_0; }
		
		//'|'
		public Keyword getVerticalLineKeyword_1_1() { return cVerticalLineKeyword_1_1; }
		
		//right=Form
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Form
		public RuleCall getRightFormParserRuleCall_1_2_0() { return cRightFormParserRuleCall_1_2_0; }
	}
	public class FormElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.DSLSAT.Form");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cFAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cFConstParserRuleCall_0_0 = (RuleCall)cFAssignment_0.eContents().get(0);
		private final Assignment cFAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cFVarParserRuleCall_1_0 = (RuleCall)cFAssignment_1.eContents().get(0);
		private final Assignment cFAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cFNotFormParserRuleCall_2_0 = (RuleCall)cFAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cFAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cFBiImplFormParserRuleCall_3_1_0 = (RuleCall)cFAssignment_3_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		
		//Form:
		//	f=Const
		//	| f=Var
		//	| f=NotForm
		//	| '(' f=BiImplForm ')';
		@Override public ParserRule getRule() { return rule; }
		
		//f=Const | f=Var | f=NotForm | '(' f=BiImplForm ')'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//f=Const
		public Assignment getFAssignment_0() { return cFAssignment_0; }
		
		//Const
		public RuleCall getFConstParserRuleCall_0_0() { return cFConstParserRuleCall_0_0; }
		
		//f=Var
		public Assignment getFAssignment_1() { return cFAssignment_1; }
		
		//Var
		public RuleCall getFVarParserRuleCall_1_0() { return cFVarParserRuleCall_1_0; }
		
		//f=NotForm
		public Assignment getFAssignment_2() { return cFAssignment_2; }
		
		//NotForm
		public RuleCall getFNotFormParserRuleCall_2_0() { return cFNotFormParserRuleCall_2_0; }
		
		//'(' f=BiImplForm ')'
		public Group getGroup_3() { return cGroup_3; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_3_0() { return cLeftParenthesisKeyword_3_0; }
		
		//f=BiImplForm
		public Assignment getFAssignment_3_1() { return cFAssignment_3_1; }
		
		//BiImplForm
		public RuleCall getFBiImplFormParserRuleCall_3_1_0() { return cFBiImplFormParserRuleCall_3_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3_2() { return cRightParenthesisKeyword_3_2; }
	}
	public class NotFormElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.DSLSAT.NotForm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExclamationMarkKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cFormParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Action cNotFormFormAction_2 = (Action)cGroup.eContents().get(2);
		
		//NotForm Form:
		//	'!' Form {NotForm.form=current};
		@Override public ParserRule getRule() { return rule; }
		
		//'!' Form {NotForm.form=current}
		public Group getGroup() { return cGroup; }
		
		//'!'
		public Keyword getExclamationMarkKeyword_0() { return cExclamationMarkKeyword_0; }
		
		//Form
		public RuleCall getFormParserRuleCall_1() { return cFormParserRuleCall_1; }
		
		//{NotForm.form=current}
		public Action getNotFormFormAction_2() { return cNotFormFormAction_2; }
	}
	public class VarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.DSLSAT.Var");
		private final Assignment cIdAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cIdLOWIDTerminalRuleCall_0 = (RuleCall)cIdAssignment.eContents().get(0);
		
		//Var:
		//	id=LOWID;
		@Override public ParserRule getRule() { return rule; }
		
		//id=LOWID
		public Assignment getIdAssignment() { return cIdAssignment; }
		
		//LOWID
		public RuleCall getIdLOWIDTerminalRuleCall_0() { return cIdLOWIDTerminalRuleCall_0; }
	}
	public class ConstElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.DSLSAT.Const");
		private final Assignment cValAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cValAlternatives_0 = (Alternatives)cValAssignment.eContents().get(0);
		private final Keyword cValTrueKeyword_0_0 = (Keyword)cValAlternatives_0.eContents().get(0);
		private final Keyword cValFalseKeyword_0_1 = (Keyword)cValAlternatives_0.eContents().get(1);
		
		//Const:
		//	val=("true" | "false");
		@Override public ParserRule getRule() { return rule; }
		
		//val=("true" | "false")
		public Assignment getValAssignment() { return cValAssignment; }
		
		//("true" | "false")
		public Alternatives getValAlternatives_0() { return cValAlternatives_0; }
		
		//"true"
		public Keyword getValTrueKeyword_0_0() { return cValTrueKeyword_0_0; }
		
		//"false"
		public Keyword getValFalseKeyword_0_1() { return cValFalseKeyword_0_1; }
	}
	
	
	private final ModelElements pModel;
	private final BiImplFormElements pBiImplForm;
	private final ImplFormElements pImplForm;
	private final OrFormElements pOrForm;
	private final AndFormElements pAndForm;
	private final NandFormElements pNandForm;
	private final FormElements pForm;
	private final NotFormElements pNotForm;
	private final VarElements pVar;
	private final ConstElements pConst;
	private final TerminalRule tLOWID;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DSLSATGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pBiImplForm = new BiImplFormElements();
		this.pImplForm = new ImplFormElements();
		this.pOrForm = new OrFormElements();
		this.pAndForm = new AndFormElements();
		this.pNandForm = new NandFormElements();
		this.pForm = new FormElements();
		this.pNotForm = new NotFormElements();
		this.pVar = new VarElements();
		this.pConst = new ConstElements();
		this.tLOWID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.DSLSAT.LOWID");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.DSLSAT".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model Form:
	//	BiImplForm;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//BiImplForm Form:
	//	ImplForm ({BiImplForm.left=current} '<=>' right=ImplForm)*;
	public BiImplFormElements getBiImplFormAccess() {
		return pBiImplForm;
	}
	
	public ParserRule getBiImplFormRule() {
		return getBiImplFormAccess().getRule();
	}
	
	//ImplForm Form:
	//	OrForm ({EqForm.left=current} '=>' right=OrForm)*;
	public ImplFormElements getImplFormAccess() {
		return pImplForm;
	}
	
	public ParserRule getImplFormRule() {
		return getImplFormAccess().getRule();
	}
	
	//OrForm Form:
	//	AndForm ({OrForm.left=current} 'v' right=AndForm)*;
	public OrFormElements getOrFormAccess() {
		return pOrForm;
	}
	
	public ParserRule getOrFormRule() {
		return getOrFormAccess().getRule();
	}
	
	//AndForm Form:
	//	NandForm ({AndForm.left=current} '^' right=NandForm)*;
	public AndFormElements getAndFormAccess() {
		return pAndForm;
	}
	
	public ParserRule getAndFormRule() {
		return getAndFormAccess().getRule();
	}
	
	//NandForm Form:
	//	Form ({NandForm.left=current} '|' right=Form)*;
	public NandFormElements getNandFormAccess() {
		return pNandForm;
	}
	
	public ParserRule getNandFormRule() {
		return getNandFormAccess().getRule();
	}
	
	//Form:
	//	f=Const
	//	| f=Var
	//	| f=NotForm
	//	| '(' f=BiImplForm ')';
	public FormElements getFormAccess() {
		return pForm;
	}
	
	public ParserRule getFormRule() {
		return getFormAccess().getRule();
	}
	
	//NotForm Form:
	//	'!' Form {NotForm.form=current};
	public NotFormElements getNotFormAccess() {
		return pNotForm;
	}
	
	public ParserRule getNotFormRule() {
		return getNotFormAccess().getRule();
	}
	
	//Var:
	//	id=LOWID;
	public VarElements getVarAccess() {
		return pVar;
	}
	
	public ParserRule getVarRule() {
		return getVarAccess().getRule();
	}
	
	//Const:
	//	val=("true" | "false");
	public ConstElements getConstAccess() {
		return pConst;
	}
	
	public ParserRule getConstRule() {
		return getConstAccess().getRule();
	}
	
	//terminal LOWID:
	//	'A'..'Z'+;
	public TerminalRule getLOWIDRule() {
		return tLOWID;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
