/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.dSLSAT.AndForm;
import org.xtext.example.mydsl.dSLSAT.BiImplForm;
import org.xtext.example.mydsl.dSLSAT.Const;
import org.xtext.example.mydsl.dSLSAT.DSLSATPackage;
import org.xtext.example.mydsl.dSLSAT.Form;
import org.xtext.example.mydsl.dSLSAT.ImplForm;
import org.xtext.example.mydsl.dSLSAT.NandForm;
import org.xtext.example.mydsl.dSLSAT.NotForm;
import org.xtext.example.mydsl.dSLSAT.OrForm;
import org.xtext.example.mydsl.dSLSAT.Var;
import org.xtext.example.mydsl.services.DSLSATGrammarAccess;

@SuppressWarnings("all")
public class DSLSATSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DSLSATGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DSLSATPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DSLSATPackage.AND_FORM:
				sequence_AndForm(context, (AndForm) semanticObject); 
				return; 
			case DSLSATPackage.BI_IMPL_FORM:
				sequence_BiImplForm(context, (BiImplForm) semanticObject); 
				return; 
			case DSLSATPackage.CONST:
				sequence_Const(context, (Const) semanticObject); 
				return; 
			case DSLSATPackage.FORM:
				sequence_Form(context, (Form) semanticObject); 
				return; 
			case DSLSATPackage.IMPL_FORM:
				sequence_ImplForm(context, (ImplForm) semanticObject); 
				return; 
			case DSLSATPackage.NAND_FORM:
				sequence_NandForm(context, (NandForm) semanticObject); 
				return; 
			case DSLSATPackage.NOT_FORM:
				sequence_NotForm(context, (NotForm) semanticObject); 
				return; 
			case DSLSATPackage.OR_FORM:
				sequence_OrForm(context, (OrForm) semanticObject); 
				return; 
			case DSLSATPackage.VAR:
				sequence_Var(context, (Var) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Model returns AndForm
	 *     BiImplForm returns AndForm
	 *     BiImplForm.BiImplForm_1_0 returns AndForm
	 *     ImplForm returns AndForm
	 *     ImplForm.ImplForm_1_0 returns AndForm
	 *     OrForm returns AndForm
	 *     OrForm.OrForm_1_0 returns AndForm
	 *     AndForm returns AndForm
	 *     AndForm.AndForm_1_0 returns AndForm
	 *
	 * Constraint:
	 *     (left=AndForm_AndForm_1_0 right=NandForm)
	 */
	protected void sequence_AndForm(ISerializationContext context, AndForm semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DSLSATPackage.Literals.AND_FORM__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLSATPackage.Literals.AND_FORM__LEFT));
			if (transientValues.isValueTransient(semanticObject, DSLSATPackage.Literals.AND_FORM__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLSATPackage.Literals.AND_FORM__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndFormAccess().getAndFormLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndFormAccess().getRightNandFormParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns BiImplForm
	 *     BiImplForm returns BiImplForm
	 *     BiImplForm.BiImplForm_1_0 returns BiImplForm
	 *
	 * Constraint:
	 *     (left=BiImplForm_BiImplForm_1_0 right=ImplForm)
	 */
	protected void sequence_BiImplForm(ISerializationContext context, BiImplForm semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DSLSATPackage.Literals.BI_IMPL_FORM__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLSATPackage.Literals.BI_IMPL_FORM__LEFT));
			if (transientValues.isValueTransient(semanticObject, DSLSATPackage.Literals.BI_IMPL_FORM__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLSATPackage.Literals.BI_IMPL_FORM__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBiImplFormAccess().getBiImplFormLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBiImplFormAccess().getRightImplFormParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Const returns Const
	 *
	 * Constraint:
	 *     (val='true' | val='false')
	 */
	protected void sequence_Const(ISerializationContext context, Const semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Form
	 *     BiImplForm returns Form
	 *     BiImplForm.BiImplForm_1_0 returns Form
	 *     ImplForm returns Form
	 *     ImplForm.ImplForm_1_0 returns Form
	 *     OrForm returns Form
	 *     OrForm.OrForm_1_0 returns Form
	 *     AndForm returns Form
	 *     AndForm.AndForm_1_0 returns Form
	 *     NandForm returns Form
	 *     NandForm.NandForm_1_0 returns Form
	 *     Form returns Form
	 *     NotForm.NotForm_2 returns Form
	 *
	 * Constraint:
	 *     (form=Const | form=Var | form=NotForm | form=BiImplForm)
	 */
	protected void sequence_Form(ISerializationContext context, Form semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns ImplForm
	 *     BiImplForm returns ImplForm
	 *     BiImplForm.BiImplForm_1_0 returns ImplForm
	 *     ImplForm returns ImplForm
	 *     ImplForm.ImplForm_1_0 returns ImplForm
	 *
	 * Constraint:
	 *     (left=ImplForm_ImplForm_1_0 right=OrForm)
	 */
	protected void sequence_ImplForm(ISerializationContext context, ImplForm semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DSLSATPackage.Literals.IMPL_FORM__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLSATPackage.Literals.IMPL_FORM__LEFT));
			if (transientValues.isValueTransient(semanticObject, DSLSATPackage.Literals.IMPL_FORM__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLSATPackage.Literals.IMPL_FORM__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImplFormAccess().getImplFormLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getImplFormAccess().getRightOrFormParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns NandForm
	 *     BiImplForm returns NandForm
	 *     BiImplForm.BiImplForm_1_0 returns NandForm
	 *     ImplForm returns NandForm
	 *     ImplForm.ImplForm_1_0 returns NandForm
	 *     OrForm returns NandForm
	 *     OrForm.OrForm_1_0 returns NandForm
	 *     AndForm returns NandForm
	 *     AndForm.AndForm_1_0 returns NandForm
	 *     NandForm returns NandForm
	 *     NandForm.NandForm_1_0 returns NandForm
	 *
	 * Constraint:
	 *     (left=NandForm_NandForm_1_0 right=Form)
	 */
	protected void sequence_NandForm(ISerializationContext context, NandForm semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DSLSATPackage.Literals.NAND_FORM__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLSATPackage.Literals.NAND_FORM__LEFT));
			if (transientValues.isValueTransient(semanticObject, DSLSATPackage.Literals.NAND_FORM__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLSATPackage.Literals.NAND_FORM__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNandFormAccess().getNandFormLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getNandFormAccess().getRightFormParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NotForm returns NotForm
	 *
	 * Constraint:
	 *     form=NotForm_NotForm_2
	 */
	protected void sequence_NotForm(ISerializationContext context, NotForm semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DSLSATPackage.Literals.FORM__FORM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLSATPackage.Literals.FORM__FORM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNotFormAccess().getNotFormFormAction_2(), semanticObject.getForm());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns OrForm
	 *     BiImplForm returns OrForm
	 *     BiImplForm.BiImplForm_1_0 returns OrForm
	 *     ImplForm returns OrForm
	 *     ImplForm.ImplForm_1_0 returns OrForm
	 *     OrForm returns OrForm
	 *     OrForm.OrForm_1_0 returns OrForm
	 *
	 * Constraint:
	 *     (left=OrForm_OrForm_1_0 right=AndForm)
	 */
	protected void sequence_OrForm(ISerializationContext context, OrForm semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DSLSATPackage.Literals.OR_FORM__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLSATPackage.Literals.OR_FORM__LEFT));
			if (transientValues.isValueTransient(semanticObject, DSLSATPackage.Literals.OR_FORM__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLSATPackage.Literals.OR_FORM__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrFormAccess().getOrFormLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrFormAccess().getRightAndFormParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Var returns Var
	 *
	 * Constraint:
	 *     id=LOWID
	 */
	protected void sequence_Var(ISerializationContext context, Var semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DSLSATPackage.Literals.VAR__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLSATPackage.Literals.VAR__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarAccess().getIdLOWIDTerminalRuleCall_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
}
