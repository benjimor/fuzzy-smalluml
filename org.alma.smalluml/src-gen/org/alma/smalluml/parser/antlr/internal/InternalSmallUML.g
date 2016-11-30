/*
 * generated by Xtext 2.10.0
 */
grammar InternalSmallUML;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.alma.smalluml.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.alma.smalluml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.alma.smalluml.services.SmallUMLGrammarAccess;

}

@parser::members {

 	private SmallUMLGrammarAccess grammarAccess;

    public InternalSmallUMLParser(TokenStream input, SmallUMLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Package";
   	}

   	@Override
   	protected SmallUMLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRulePackage
entryRulePackage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPackageRule()); }
	iv_rulePackage=rulePackage
	{ $current=$iv_rulePackage.current; }
	EOF;

// Rule Package
rulePackage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getPackageAccess().getClassClassParserRuleCall_0_0_0());
					}
					lv_class_0_0=ruleClass
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPackageRule());
						}
						add(
							$current,
							"class",
							lv_class_0_0,
							"org.alma.smalluml.SmallUML.Class");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_1=';'
			{
				newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getSemicolonKeyword_0_1());
			}
		)*
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getPackageAccess().getRelationRelationParserRuleCall_1_0_0());
					}
					lv_relation_2_0=ruleRelation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPackageRule());
						}
						add(
							$current,
							"relation",
							lv_relation_2_0,
							"org.alma.smalluml.SmallUML.Relation");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getSemicolonKeyword_1_1());
			}
		)*
	)
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTypeAccess().getBooleanParserRuleCall_0());
		}
		this_Boolean_0=ruleBoolean
		{
			$current = $this_Boolean_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getRealParserRuleCall_1());
		}
		this_Real_1=ruleReal
		{
			$current = $this_Real_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getIntegerParserRuleCall_2());
		}
		this_Integer_2=ruleInteger
		{
			$current = $this_Integer_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getString0ParserRuleCall_3());
		}
		this_String0_3=ruleString0
		{
			$current = $this_String0_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getUnlimitedNaturalParserRuleCall_4());
		}
		this_UnlimitedNatural_4=ruleUnlimitedNatural
		{
			$current = $this_UnlimitedNatural_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_5());
		}
		this_Enumeration_5=ruleEnumeration
		{
			$current = $this_Enumeration_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEnumeration
entryRuleEnumeration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumerationRule()); }
	iv_ruleEnumeration=ruleEnumeration
	{ $current=$iv_ruleEnumeration.current; }
	EOF;

// Rule Enumeration
ruleEnumeration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Enumeration'
		{
			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumerationKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEnumerationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='value'
		{
			newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getValueKeyword_3());
		}
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_5_0());
				}
				lv_value_5_0=ruleString0
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEnumerationRule());
					}
					add(
						$current,
						"value",
						lv_value_5_0,
						"org.alma.smalluml.SmallUML.String0");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getEnumerationAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEnumerationAccess().getValueString0ParserRuleCall_6_1_0());
					}
					lv_value_7_0=ruleString0
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEnumerationRule());
						}
						add(
							$current,
							"value",
							lv_value_7_0,
							"org.alma.smalluml.SmallUML.String0");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleClass
entryRuleClass returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassRule()); }
	iv_ruleClass=ruleClass
	{ $current=$iv_ruleClass.current; }
	EOF;

// Rule Class
ruleClass returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_isAbstract_0_0='Abstract'
				{
					newLeafNode(lv_isAbstract_0_0, grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClassRule());
					}
					setWithLastConsumed($current, "isAbstract", true, "Abstract");
				}
			)
		)?
		otherlv_1='Class'
		{
			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClassRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_3='extends'
			{
				newLeafNode(otherlv_3, grammarAccess.getClassAccess().getExtendsKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getClassRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getClassAccess().getParentsClassCrossReference_3_1_0());
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getClassAccess().getCommaKeyword_3_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getClassRule());
							}
						}
						otherlv_6=RULE_ID
						{
							newLeafNode(otherlv_6, grammarAccess.getClassAccess().getParentsClassCrossReference_3_2_1_0());
						}
					)
				)
			)*
		)?
		otherlv_7='{'
		{
			newLeafNode(otherlv_7, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			otherlv_8='attributes'
			{
				newLeafNode(otherlv_8, grammarAccess.getClassAccess().getAttributesKeyword_5_0());
			}
			otherlv_9='{'
			{
				newLeafNode(otherlv_9, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_5_2_0());
					}
					lv_attributes_10_0=ruleAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClassRule());
						}
						add(
							$current,
							"attributes",
							lv_attributes_10_0,
							"org.alma.smalluml.SmallUML.Attribute");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_5_3_0());
					}
					lv_attributes_11_0=ruleAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClassRule());
						}
						add(
							$current,
							"attributes",
							lv_attributes_11_0,
							"org.alma.smalluml.SmallUML.Attribute");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_12='}'
			{
				newLeafNode(otherlv_12, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_4());
			}
		)?
		(
			otherlv_13='methods'
			{
				newLeafNode(otherlv_13, grammarAccess.getClassAccess().getMethodsKeyword_6_0());
			}
			otherlv_14='{'
			{
				newLeafNode(otherlv_14, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_6_2_0());
					}
					lv_methods_15_0=ruleMethod
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClassRule());
						}
						add(
							$current,
							"methods",
							lv_methods_15_0,
							"org.alma.smalluml.SmallUML.Method");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_6_3_0());
					}
					lv_methods_16_0=ruleMethod
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClassRule());
						}
						add(
							$current,
							"methods",
							lv_methods_16_0,
							"org.alma.smalluml.SmallUML.Method");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_17='}'
			{
				newLeafNode(otherlv_17, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6_4());
			}
		)?
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_0_0());
				}
				lv_name_0_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"org.alma.smalluml.SmallUML.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getTypedValueTypeParserRuleCall_2_0());
				}
				lv_typedValue_2_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"typedValue",
						lv_typedValue_2_0,
						"org.alma.smalluml.SmallUML.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleMethod
entryRuleMethod returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMethodRule()); }
	iv_ruleMethod=ruleMethod
	{ $current=$iv_ruleMethod.current; }
	EOF;

// Rule Method
ruleMethod returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getMethodAccess().getMethodAction_0(),
					$current);
			}
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMethodRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMethodAccess().getParametersAttributeParserRuleCall_3_0_0());
					}
					lv_parameters_3_0=ruleAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMethodRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_3_0,
							"org.alma.smalluml.SmallUML.Attribute");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMethodAccess().getParametersAttributeParserRuleCall_3_1_1_0());
						}
						lv_parameters_5_0=ruleAttribute
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMethodRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_5_0,
								"org.alma.smalluml.SmallUML.Attribute");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getRightParenthesisKeyword_4());
		}
		otherlv_7=':'
		{
			newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getColonKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMethodAccess().getReturnTypedValueTypeParserRuleCall_6_0());
				}
				lv_returnTypedValue_8_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMethodRule());
					}
					set(
						$current,
						"returnTypedValue",
						lv_returnTypedValue_8_0,
						"org.alma.smalluml.SmallUML.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRuleRelation
entryRuleRelation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRelationRule()); }
	iv_ruleRelation=ruleRelation
	{ $current=$iv_ruleRelation.current; }
	EOF;

// Rule Relation
ruleRelation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Relation'
		{
			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRelationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='cardinality'
		{
			newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getCardinalityKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRelationAccess().getCardinalityCardinalityParserRuleCall_4_0());
				}
				lv_cardinality_4_0=ruleCardinality
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRelationRule());
					}
					set(
						$current,
						"cardinality",
						lv_cardinality_4_0,
						"org.alma.smalluml.SmallUML.Cardinality");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='from'
		{
			newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getFromKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRelationRule());
					}
				}
				otherlv_6=RULE_ID
				{
					newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getFromClassCrossReference_6_0());
				}
			)
		)
		otherlv_7='to'
		{
			newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getToKeyword_7());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRelationRule());
					}
				}
				otherlv_8=RULE_ID
				{
					newLeafNode(otherlv_8, grammarAccess.getRelationAccess().getToClassCrossReference_8_0());
				}
			)
		)
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleString0
entryRuleString0 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getString0Rule()); }
	iv_ruleString0=ruleString0
	{ $current=$iv_ruleString0.current; }
	EOF;

// Rule String0
ruleString0 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getString0Access().getStringAction_0(),
					$current);
			}
		)
		otherlv_1='String'
		{
			newLeafNode(otherlv_1, grammarAccess.getString0Access().getStringKeyword_1());
		}
	)
;

// Entry rule entryRuleBoolean
entryRuleBoolean returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBooleanRule()); }
	iv_ruleBoolean=ruleBoolean
	{ $current=$iv_ruleBoolean.current; }
	EOF;

// Rule Boolean
ruleBoolean returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBooleanAccess().getBooleanAction_0(),
					$current);
			}
		)
		otherlv_1='Boolean'
		{
			newLeafNode(otherlv_1, grammarAccess.getBooleanAccess().getBooleanKeyword_1());
		}
	)
;

// Entry rule entryRuleReal
entryRuleReal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRealRule()); }
	iv_ruleReal=ruleReal
	{ $current=$iv_ruleReal.current; }
	EOF;

// Rule Real
ruleReal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRealAccess().getRealAction_0(),
					$current);
			}
		)
		otherlv_1='Real'
		{
			newLeafNode(otherlv_1, grammarAccess.getRealAccess().getRealKeyword_1());
		}
	)
;

// Entry rule entryRuleInteger
entryRuleInteger returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntegerRule()); }
	iv_ruleInteger=ruleInteger
	{ $current=$iv_ruleInteger.current; }
	EOF;

// Rule Integer
ruleInteger returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getIntegerAccess().getIntegerAction_0(),
					$current);
			}
		)
		otherlv_1='Integer'
		{
			newLeafNode(otherlv_1, grammarAccess.getIntegerAccess().getIntegerKeyword_1());
		}
	)
;

// Entry rule entryRuleUnlimitedNatural
entryRuleUnlimitedNatural returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnlimitedNaturalRule()); }
	iv_ruleUnlimitedNatural=ruleUnlimitedNatural
	{ $current=$iv_ruleUnlimitedNatural.current; }
	EOF;

// Rule UnlimitedNatural
ruleUnlimitedNatural returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getUnlimitedNaturalAccess().getUnlimitedNaturalAction_0(),
					$current);
			}
		)
		otherlv_1='UnlimitedNatural'
		{
			newLeafNode(otherlv_1, grammarAccess.getUnlimitedNaturalAccess().getUnlimitedNaturalKeyword_1());
		}
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleCardinality
entryRuleCardinality returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCardinalityRule()); }
	iv_ruleCardinality=ruleCardinality
	{ $current=$iv_ruleCardinality.current; }
	EOF;

// Rule Cardinality
ruleCardinality returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getCardinalityAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCardinalityAccess().getLowerBoundEIntParserRuleCall_1_0());
				}
				lv_lowerBound_1_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCardinalityRule());
					}
					set(
						$current,
						"lowerBound",
						lv_lowerBound_1_0,
						"org.alma.smalluml.SmallUML.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=','
		{
			newLeafNode(otherlv_2, grammarAccess.getCardinalityAccess().getCommaKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCardinalityAccess().getUpperBoundEIntParserRuleCall_3_0());
				}
				lv_upperBound_3_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCardinalityRule());
					}
					set(
						$current,
						"upperBound",
						lv_upperBound_3_0,
						"org.alma.smalluml.SmallUML.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=']'
		{
			newLeafNode(otherlv_4, grammarAccess.getCardinalityAccess().getRightSquareBracketKeyword_4());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
