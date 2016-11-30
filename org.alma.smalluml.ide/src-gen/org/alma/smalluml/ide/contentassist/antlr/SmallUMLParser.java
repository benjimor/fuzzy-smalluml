/*
 * generated by Xtext 2.10.0
 */
package org.alma.smalluml.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.alma.smalluml.ide.contentassist.antlr.internal.InternalSmallUMLParser;
import org.alma.smalluml.services.SmallUMLGrammarAccess;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class SmallUMLParser extends AbstractContentAssistParser {

	@Inject
	private SmallUMLGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSmallUMLParser createParser() {
		InternalSmallUMLParser result = new InternalSmallUMLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getEFloatAccess().getAlternatives_4_0(), "rule__EFloat__Alternatives_4_0");
					put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
					put(grammarAccess.getPackageAccess().getGroup_0(), "rule__Package__Group_0__0");
					put(grammarAccess.getPackageAccess().getGroup_1(), "rule__Package__Group_1__0");
					put(grammarAccess.getEnumerationAccess().getGroup(), "rule__Enumeration__Group__0");
					put(grammarAccess.getEnumerationAccess().getGroup_6(), "rule__Enumeration__Group_6__0");
					put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
					put(grammarAccess.getClassAccess().getGroup_3(), "rule__Class__Group_3__0");
					put(grammarAccess.getClassAccess().getGroup_3_2(), "rule__Class__Group_3_2__0");
					put(grammarAccess.getClassAccess().getGroup_5(), "rule__Class__Group_5__0");
					put(grammarAccess.getClassAccess().getGroup_6(), "rule__Class__Group_6__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getMethodAccess().getGroup(), "rule__Method__Group__0");
					put(grammarAccess.getMethodAccess().getGroup_3(), "rule__Method__Group_3__0");
					put(grammarAccess.getMethodAccess().getGroup_3_1(), "rule__Method__Group_3_1__0");
					put(grammarAccess.getRelationAccess().getGroup(), "rule__Relation__Group__0");
					put(grammarAccess.getString0Access().getGroup(), "rule__String0__Group__0");
					put(grammarAccess.getType_ImplAccess().getGroup(), "rule__Type_Impl__Group__0");
					put(grammarAccess.getBooleanAccess().getGroup(), "rule__Boolean__Group__0");
					put(grammarAccess.getRealAccess().getGroup(), "rule__Real__Group__0");
					put(grammarAccess.getIntegerAccess().getGroup(), "rule__Integer__Group__0");
					put(grammarAccess.getUnlimitedNaturalAccess().getGroup(), "rule__UnlimitedNatural__Group__0");
					put(grammarAccess.getEFloatAccess().getGroup(), "rule__EFloat__Group__0");
					put(grammarAccess.getEFloatAccess().getGroup_4(), "rule__EFloat__Group_4__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getEBigIntegerAccess().getGroup(), "rule__EBigInteger__Group__0");
					put(grammarAccess.getCardinalityAccess().getGroup(), "rule__Cardinality__Group__0");
					put(grammarAccess.getPackageAccess().getClassAssignment_0_0(), "rule__Package__ClassAssignment_0_0");
					put(grammarAccess.getPackageAccess().getRelationAssignment_1_0(), "rule__Package__RelationAssignment_1_0");
					put(grammarAccess.getEnumerationAccess().getNameAssignment_1(), "rule__Enumeration__NameAssignment_1");
					put(grammarAccess.getEnumerationAccess().getValueAssignment_5(), "rule__Enumeration__ValueAssignment_5");
					put(grammarAccess.getEnumerationAccess().getValueAssignment_6_1(), "rule__Enumeration__ValueAssignment_6_1");
					put(grammarAccess.getClassAccess().getIsAbstractAssignment_0(), "rule__Class__IsAbstractAssignment_0");
					put(grammarAccess.getClassAccess().getNameAssignment_2(), "rule__Class__NameAssignment_2");
					put(grammarAccess.getClassAccess().getParentsAssignment_3_1(), "rule__Class__ParentsAssignment_3_1");
					put(grammarAccess.getClassAccess().getParentsAssignment_3_2_1(), "rule__Class__ParentsAssignment_3_2_1");
					put(grammarAccess.getClassAccess().getAttributesAssignment_5_2(), "rule__Class__AttributesAssignment_5_2");
					put(grammarAccess.getClassAccess().getAttributesAssignment_5_3(), "rule__Class__AttributesAssignment_5_3");
					put(grammarAccess.getClassAccess().getMethodsAssignment_6_2(), "rule__Class__MethodsAssignment_6_2");
					put(grammarAccess.getClassAccess().getMethodsAssignment_6_3(), "rule__Class__MethodsAssignment_6_3");
					put(grammarAccess.getAttributeAccess().getNameAssignment_0(), "rule__Attribute__NameAssignment_0");
					put(grammarAccess.getAttributeAccess().getTypedValueAssignment_2(), "rule__Attribute__TypedValueAssignment_2");
					put(grammarAccess.getMethodAccess().getNameAssignment_1(), "rule__Method__NameAssignment_1");
					put(grammarAccess.getMethodAccess().getParametersAssignment_3_0(), "rule__Method__ParametersAssignment_3_0");
					put(grammarAccess.getMethodAccess().getParametersAssignment_3_1_1(), "rule__Method__ParametersAssignment_3_1_1");
					put(grammarAccess.getMethodAccess().getReturnTypedValueAssignment_6(), "rule__Method__ReturnTypedValueAssignment_6");
					put(grammarAccess.getRelationAccess().getNameAssignment_1(), "rule__Relation__NameAssignment_1");
					put(grammarAccess.getRelationAccess().getCardinalityAssignment_4(), "rule__Relation__CardinalityAssignment_4");
					put(grammarAccess.getRelationAccess().getFromAssignment_6(), "rule__Relation__FromAssignment_6");
					put(grammarAccess.getRelationAccess().getToAssignment_8(), "rule__Relation__ToAssignment_8");
					put(grammarAccess.getCardinalityAccess().getLowerBoundAssignment_1(), "rule__Cardinality__LowerBoundAssignment_1");
					put(grammarAccess.getCardinalityAccess().getUpperBoundAssignment_3(), "rule__Cardinality__UpperBoundAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalSmallUMLParser typedParser = (InternalSmallUMLParser) parser;
			typedParser.entryRulePackage();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SmallUMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SmallUMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}