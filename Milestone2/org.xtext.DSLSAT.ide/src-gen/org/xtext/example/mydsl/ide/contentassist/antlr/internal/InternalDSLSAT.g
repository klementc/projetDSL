/*
 * generated by Xtext 2.15.0
 */
grammar InternalDSLSAT;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getBiImplFormParserRuleCall()); }
		ruleBiImplForm
		{ after(grammarAccess.getModelAccess().getBiImplFormParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBiImplForm
entryRuleBiImplForm
:
{ before(grammarAccess.getBiImplFormRule()); }
	 ruleBiImplForm
{ after(grammarAccess.getBiImplFormRule()); } 
	 EOF 
;

// Rule BiImplForm
ruleBiImplForm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBiImplFormAccess().getGroup()); }
		(rule__BiImplForm__Group__0)
		{ after(grammarAccess.getBiImplFormAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleImplForm
entryRuleImplForm
:
{ before(grammarAccess.getImplFormRule()); }
	 ruleImplForm
{ after(grammarAccess.getImplFormRule()); } 
	 EOF 
;

// Rule ImplForm
ruleImplForm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImplFormAccess().getGroup()); }
		(rule__ImplForm__Group__0)
		{ after(grammarAccess.getImplFormAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOrForm
entryRuleOrForm
:
{ before(grammarAccess.getOrFormRule()); }
	 ruleOrForm
{ after(grammarAccess.getOrFormRule()); } 
	 EOF 
;

// Rule OrForm
ruleOrForm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOrFormAccess().getGroup()); }
		(rule__OrForm__Group__0)
		{ after(grammarAccess.getOrFormAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAndForm
entryRuleAndForm
:
{ before(grammarAccess.getAndFormRule()); }
	 ruleAndForm
{ after(grammarAccess.getAndFormRule()); } 
	 EOF 
;

// Rule AndForm
ruleAndForm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAndFormAccess().getGroup()); }
		(rule__AndForm__Group__0)
		{ after(grammarAccess.getAndFormAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNandForm
entryRuleNandForm
:
{ before(grammarAccess.getNandFormRule()); }
	 ruleNandForm
{ after(grammarAccess.getNandFormRule()); } 
	 EOF 
;

// Rule NandForm
ruleNandForm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNandFormAccess().getGroup()); }
		(rule__NandForm__Group__0)
		{ after(grammarAccess.getNandFormAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleForm
entryRuleForm
:
{ before(grammarAccess.getFormRule()); }
	 ruleForm
{ after(grammarAccess.getFormRule()); } 
	 EOF 
;

// Rule Form
ruleForm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFormAccess().getAlternatives()); }
		(rule__Form__Alternatives)
		{ after(grammarAccess.getFormAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNotForm
entryRuleNotForm
:
{ before(grammarAccess.getNotFormRule()); }
	 ruleNotForm
{ after(grammarAccess.getNotFormRule()); } 
	 EOF 
;

// Rule NotForm
ruleNotForm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNotFormAccess().getGroup()); }
		(rule__NotForm__Group__0)
		{ after(grammarAccess.getNotFormAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVar
entryRuleVar
:
{ before(grammarAccess.getVarRule()); }
	 ruleVar
{ after(grammarAccess.getVarRule()); } 
	 EOF 
;

// Rule Var
ruleVar 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVarAccess().getIdAssignment()); }
		(rule__Var__IdAssignment)
		{ after(grammarAccess.getVarAccess().getIdAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConst
entryRuleConst
:
{ before(grammarAccess.getConstRule()); }
	 ruleConst
{ after(grammarAccess.getConstRule()); } 
	 EOF 
;

// Rule Const
ruleConst 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConstAccess().getValAssignment()); }
		(rule__Const__ValAssignment)
		{ after(grammarAccess.getConstAccess().getValAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Form__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFormAccess().getFAssignment_0()); }
		(rule__Form__FAssignment_0)
		{ after(grammarAccess.getFormAccess().getFAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getFormAccess().getFAssignment_1()); }
		(rule__Form__FAssignment_1)
		{ after(grammarAccess.getFormAccess().getFAssignment_1()); }
	)
	|
	(
		{ before(grammarAccess.getFormAccess().getFAssignment_2()); }
		(rule__Form__FAssignment_2)
		{ after(grammarAccess.getFormAccess().getFAssignment_2()); }
	)
	|
	(
		{ before(grammarAccess.getFormAccess().getGroup_3()); }
		(rule__Form__Group_3__0)
		{ after(grammarAccess.getFormAccess().getGroup_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Const__ValAlternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConstAccess().getValTrueKeyword_0_0()); }
		'true'
		{ after(grammarAccess.getConstAccess().getValTrueKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getConstAccess().getValFalseKeyword_0_1()); }
		'false'
		{ after(grammarAccess.getConstAccess().getValFalseKeyword_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BiImplForm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BiImplForm__Group__0__Impl
	rule__BiImplForm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BiImplForm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBiImplFormAccess().getImplFormParserRuleCall_0()); }
	ruleImplForm
	{ after(grammarAccess.getBiImplFormAccess().getImplFormParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BiImplForm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BiImplForm__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BiImplForm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBiImplFormAccess().getGroup_1()); }
	(rule__BiImplForm__Group_1__0)*
	{ after(grammarAccess.getBiImplFormAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BiImplForm__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BiImplForm__Group_1__0__Impl
	rule__BiImplForm__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BiImplForm__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBiImplFormAccess().getBiImplFormLeftAction_1_0()); }
	()
	{ after(grammarAccess.getBiImplFormAccess().getBiImplFormLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BiImplForm__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BiImplForm__Group_1__1__Impl
	rule__BiImplForm__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BiImplForm__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBiImplFormAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1()); }
	'<=>'
	{ after(grammarAccess.getBiImplFormAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BiImplForm__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BiImplForm__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BiImplForm__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBiImplFormAccess().getRightAssignment_1_2()); }
	(rule__BiImplForm__RightAssignment_1_2)
	{ after(grammarAccess.getBiImplFormAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ImplForm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImplForm__Group__0__Impl
	rule__ImplForm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplForm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImplFormAccess().getOrFormParserRuleCall_0()); }
	ruleOrForm
	{ after(grammarAccess.getImplFormAccess().getOrFormParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplForm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImplForm__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplForm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImplFormAccess().getGroup_1()); }
	(rule__ImplForm__Group_1__0)*
	{ after(grammarAccess.getImplFormAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ImplForm__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImplForm__Group_1__0__Impl
	rule__ImplForm__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplForm__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImplFormAccess().getEqFormLeftAction_1_0()); }
	()
	{ after(grammarAccess.getImplFormAccess().getEqFormLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplForm__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImplForm__Group_1__1__Impl
	rule__ImplForm__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplForm__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImplFormAccess().getEqualsSignGreaterThanSignKeyword_1_1()); }
	'=>'
	{ after(grammarAccess.getImplFormAccess().getEqualsSignGreaterThanSignKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplForm__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImplForm__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplForm__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImplFormAccess().getRightAssignment_1_2()); }
	(rule__ImplForm__RightAssignment_1_2)
	{ after(grammarAccess.getImplFormAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrForm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrForm__Group__0__Impl
	rule__OrForm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrForm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrFormAccess().getAndFormParserRuleCall_0()); }
	ruleAndForm
	{ after(grammarAccess.getOrFormAccess().getAndFormParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrForm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrForm__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrForm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrFormAccess().getGroup_1()); }
	(rule__OrForm__Group_1__0)*
	{ after(grammarAccess.getOrFormAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrForm__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrForm__Group_1__0__Impl
	rule__OrForm__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrForm__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrFormAccess().getOrFormLeftAction_1_0()); }
	()
	{ after(grammarAccess.getOrFormAccess().getOrFormLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrForm__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrForm__Group_1__1__Impl
	rule__OrForm__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OrForm__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrFormAccess().getVKeyword_1_1()); }
	'v'
	{ after(grammarAccess.getOrFormAccess().getVKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrForm__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrForm__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrForm__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrFormAccess().getRightAssignment_1_2()); }
	(rule__OrForm__RightAssignment_1_2)
	{ after(grammarAccess.getOrFormAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndForm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndForm__Group__0__Impl
	rule__AndForm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndForm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndFormAccess().getNandFormParserRuleCall_0()); }
	ruleNandForm
	{ after(grammarAccess.getAndFormAccess().getNandFormParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndForm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndForm__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndForm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndFormAccess().getGroup_1()); }
	(rule__AndForm__Group_1__0)*
	{ after(grammarAccess.getAndFormAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndForm__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndForm__Group_1__0__Impl
	rule__AndForm__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndForm__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndFormAccess().getAndFormLeftAction_1_0()); }
	()
	{ after(grammarAccess.getAndFormAccess().getAndFormLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndForm__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndForm__Group_1__1__Impl
	rule__AndForm__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AndForm__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndFormAccess().getCircumflexAccentKeyword_1_1()); }
	'^'
	{ after(grammarAccess.getAndFormAccess().getCircumflexAccentKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndForm__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndForm__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndForm__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndFormAccess().getRightAssignment_1_2()); }
	(rule__AndForm__RightAssignment_1_2)
	{ after(grammarAccess.getAndFormAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NandForm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NandForm__Group__0__Impl
	rule__NandForm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NandForm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNandFormAccess().getFormParserRuleCall_0()); }
	ruleForm
	{ after(grammarAccess.getNandFormAccess().getFormParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NandForm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NandForm__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NandForm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNandFormAccess().getGroup_1()); }
	(rule__NandForm__Group_1__0)*
	{ after(grammarAccess.getNandFormAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NandForm__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NandForm__Group_1__0__Impl
	rule__NandForm__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NandForm__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNandFormAccess().getNandFormLeftAction_1_0()); }
	()
	{ after(grammarAccess.getNandFormAccess().getNandFormLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NandForm__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NandForm__Group_1__1__Impl
	rule__NandForm__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NandForm__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNandFormAccess().getVerticalLineKeyword_1_1()); }
	'|'
	{ after(grammarAccess.getNandFormAccess().getVerticalLineKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NandForm__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NandForm__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NandForm__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNandFormAccess().getRightAssignment_1_2()); }
	(rule__NandForm__RightAssignment_1_2)
	{ after(grammarAccess.getNandFormAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Form__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Form__Group_3__0__Impl
	rule__Form__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Form__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFormAccess().getLeftParenthesisKeyword_3_0()); }
	'('
	{ after(grammarAccess.getFormAccess().getLeftParenthesisKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Form__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Form__Group_3__1__Impl
	rule__Form__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Form__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFormAccess().getFAssignment_3_1()); }
	(rule__Form__FAssignment_3_1)
	{ after(grammarAccess.getFormAccess().getFAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Form__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Form__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Form__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFormAccess().getRightParenthesisKeyword_3_2()); }
	')'
	{ after(grammarAccess.getFormAccess().getRightParenthesisKeyword_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NotForm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NotForm__Group__0__Impl
	rule__NotForm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NotForm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNotFormAccess().getExclamationMarkKeyword_0()); }
	'!'
	{ after(grammarAccess.getNotFormAccess().getExclamationMarkKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NotForm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NotForm__Group__1__Impl
	rule__NotForm__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NotForm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNotFormAccess().getFormParserRuleCall_1()); }
	ruleForm
	{ after(grammarAccess.getNotFormAccess().getFormParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NotForm__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NotForm__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NotForm__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNotFormAccess().getNotFormFormAction_2()); }
	()
	{ after(grammarAccess.getNotFormAccess().getNotFormFormAction_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BiImplForm__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBiImplFormAccess().getRightImplFormParserRuleCall_1_2_0()); }
		ruleImplForm
		{ after(grammarAccess.getBiImplFormAccess().getRightImplFormParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImplForm__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImplFormAccess().getRightOrFormParserRuleCall_1_2_0()); }
		ruleOrForm
		{ after(grammarAccess.getImplFormAccess().getRightOrFormParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrForm__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOrFormAccess().getRightAndFormParserRuleCall_1_2_0()); }
		ruleAndForm
		{ after(grammarAccess.getOrFormAccess().getRightAndFormParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndForm__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndFormAccess().getRightNandFormParserRuleCall_1_2_0()); }
		ruleNandForm
		{ after(grammarAccess.getAndFormAccess().getRightNandFormParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NandForm__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNandFormAccess().getRightFormParserRuleCall_1_2_0()); }
		ruleForm
		{ after(grammarAccess.getNandFormAccess().getRightFormParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Form__FAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFormAccess().getFConstParserRuleCall_0_0()); }
		ruleConst
		{ after(grammarAccess.getFormAccess().getFConstParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Form__FAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFormAccess().getFVarParserRuleCall_1_0()); }
		ruleVar
		{ after(grammarAccess.getFormAccess().getFVarParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Form__FAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFormAccess().getFNotFormParserRuleCall_2_0()); }
		ruleNotForm
		{ after(grammarAccess.getFormAccess().getFNotFormParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Form__FAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFormAccess().getFBiImplFormParserRuleCall_3_1_0()); }
		ruleBiImplForm
		{ after(grammarAccess.getFormAccess().getFBiImplFormParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__IdAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarAccess().getIdLOWIDTerminalRuleCall_0()); }
		RULE_LOWID
		{ after(grammarAccess.getVarAccess().getIdLOWIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Const__ValAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConstAccess().getValAlternatives_0()); }
		(rule__Const__ValAlternatives_0)
		{ after(grammarAccess.getConstAccess().getValAlternatives_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_LOWID : ('A'..'Z')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
