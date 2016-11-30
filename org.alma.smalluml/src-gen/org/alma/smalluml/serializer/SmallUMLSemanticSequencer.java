/*
 * generated by Xtext 2.10.0
 */
package org.alma.smalluml.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.alma.smalluml.services.SmallUMLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import smalluml.Attribute;
import smalluml.Cardinality;
import smalluml.Enumeration;
import smalluml.Method;
import smalluml.Real;
import smalluml.Relation;
import smalluml.SmallumlPackage;
import smalluml.Type;
import smalluml.UnlimitedNatural;

@SuppressWarnings("all")
public class SmallUMLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SmallUMLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SmallumlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SmallumlPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case SmallumlPackage.BOOLEAN:
				sequence_Boolean(context, (smalluml.Boolean) semanticObject); 
				return; 
			case SmallumlPackage.CARDINALITY:
				sequence_Cardinality(context, (Cardinality) semanticObject); 
				return; 
			case SmallumlPackage.CLASS:
				sequence_Class(context, (smalluml.Class) semanticObject); 
				return; 
			case SmallumlPackage.ENUMERATION:
				sequence_Enumeration(context, (Enumeration) semanticObject); 
				return; 
			case SmallumlPackage.INTEGER:
				sequence_Integer(context, (smalluml.Integer) semanticObject); 
				return; 
			case SmallumlPackage.METHOD:
				sequence_Method(context, (Method) semanticObject); 
				return; 
			case SmallumlPackage.PACKAGE:
				sequence_Package(context, (smalluml.Package) semanticObject); 
				return; 
			case SmallumlPackage.REAL:
				sequence_Real(context, (Real) semanticObject); 
				return; 
			case SmallumlPackage.RELATION:
				sequence_Relation(context, (Relation) semanticObject); 
				return; 
			case SmallumlPackage.STRING:
				sequence_String0(context, (smalluml.String) semanticObject); 
				return; 
			case SmallumlPackage.TYPE:
				sequence_Type_Impl(context, (Type) semanticObject); 
				return; 
			case SmallumlPackage.UNLIMITED_NATURAL:
				sequence_UnlimitedNatural(context, (UnlimitedNatural) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (name=EString typedValue=Type)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.ATTRIBUTE__TYPED_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.ATTRIBUTE__TYPED_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getTypedValueTypeParserRuleCall_2_0(), semanticObject.getTypedValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Boolean
	 *     Boolean returns Boolean
	 *
	 * Constraint:
	 *     {Boolean}
	 */
	protected void sequence_Boolean(ISerializationContext context, smalluml.Boolean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Cardinality returns Cardinality
	 *
	 * Constraint:
	 *     (lowerBound=EInt upperBound=EInt)
	 */
	protected void sequence_Cardinality(ISerializationContext context, Cardinality semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.CARDINALITY__LOWER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.CARDINALITY__LOWER_BOUND));
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.CARDINALITY__UPPER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.CARDINALITY__UPPER_BOUND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCardinalityAccess().getLowerBoundEIntParserRuleCall_1_0(), semanticObject.getLowerBound());
		feeder.accept(grammarAccess.getCardinalityAccess().getUpperBoundEIntParserRuleCall_3_0(), semanticObject.getUpperBound());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Class returns Class
	 *
	 * Constraint:
	 *     (
	 *         isAbstract?='Abstract'? 
	 *         name=ID 
	 *         (parents+=[Class|ID] parents+=[Class|ID]*)? 
	 *         (attributes+=Attribute attributes+=Attribute*)? 
	 *         (methods+=Method methods+=Method*)?
	 *     )
	 */
	protected void sequence_Class(ISerializationContext context, smalluml.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Enumeration
	 *     Enumeration returns Enumeration
	 *
	 * Constraint:
	 *     (name=ID value+=String0 value+=String0*)
	 */
	protected void sequence_Enumeration(ISerializationContext context, Enumeration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Integer
	 *     Integer returns Integer
	 *
	 * Constraint:
	 *     {Integer}
	 */
	protected void sequence_Integer(ISerializationContext context, smalluml.Integer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Method returns Method
	 *
	 * Constraint:
	 *     (name=ID (parameters+=Attribute parameters+=Attribute*)? returnTypedValue=Type?)
	 */
	protected void sequence_Method(ISerializationContext context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Package returns Package
	 *
	 * Constraint:
	 *     ((class+=Class+ relation+=Relation+) | relation+=Relation+)?
	 */
	protected void sequence_Package(ISerializationContext context, smalluml.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Real
	 *     Real returns Real
	 *
	 * Constraint:
	 *     {Real}
	 */
	protected void sequence_Real(ISerializationContext context, Real semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Relation returns Relation
	 *
	 * Constraint:
	 *     (name=ID cardinality=Cardinality from=[Class|ID] to=[Class|ID])
	 */
	protected void sequence_Relation(ISerializationContext context, Relation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.RELATION__CARDINALITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.RELATION__CARDINALITY));
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.RELATION__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.RELATION__FROM));
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.RELATION__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.RELATION__TO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRelationAccess().getCardinalityCardinalityParserRuleCall_4_0(), semanticObject.getCardinality());
		feeder.accept(grammarAccess.getRelationAccess().getFromClassIDTerminalRuleCall_6_0_1(), semanticObject.getFrom());
		feeder.accept(grammarAccess.getRelationAccess().getToClassIDTerminalRuleCall_8_0_1(), semanticObject.getTo());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns String
	 *     String0 returns String
	 *
	 * Constraint:
	 *     {String}
	 */
	protected void sequence_String0(ISerializationContext context, smalluml.String semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type_Impl returns Type
	 *
	 * Constraint:
	 *     {Type}
	 */
	protected void sequence_Type_Impl(ISerializationContext context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns UnlimitedNatural
	 *     UnlimitedNatural returns UnlimitedNatural
	 *
	 * Constraint:
	 *     {UnlimitedNatural}
	 */
	protected void sequence_UnlimitedNatural(ISerializationContext context, UnlimitedNatural semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
