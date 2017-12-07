/*
 * generated by Xtext 2.12.0
 */
package org.xtext.svg.transform.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
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
public class SvgTransformGrammarAccess extends AbstractGrammarElementFinder {
	
	public class TransformElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.svg.transform.SvgTransform.Transform");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTransformAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTransformTransformValueParserRuleCall_0_0 = (RuleCall)cTransformAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cTransformAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cTransformTransformValueParserRuleCall_1_1_0 = (RuleCall)cTransformAssignment_1_1.eContents().get(0);
		
		//Transform:
		//	transform+=TransformValue (','? transform+=TransformValue)*;
		@Override public ParserRule getRule() { return rule; }
		
		//transform+=TransformValue (','? transform+=TransformValue)*
		public Group getGroup() { return cGroup; }
		
		//transform+=TransformValue
		public Assignment getTransformAssignment_0() { return cTransformAssignment_0; }
		
		//TransformValue
		public RuleCall getTransformTransformValueParserRuleCall_0_0() { return cTransformTransformValueParserRuleCall_0_0; }
		
		//(','? transform+=TransformValue)*
		public Group getGroup_1() { return cGroup_1; }
		
		//','?
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }
		
		//transform+=TransformValue
		public Assignment getTransformAssignment_1_1() { return cTransformAssignment_1_1; }
		
		//TransformValue
		public RuleCall getTransformTransformValueParserRuleCall_1_1_0() { return cTransformTransformValueParserRuleCall_1_1_0; }
	}
	public class TransformValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.svg.transform.SvgTransform.TransformValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMatrixParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTranslateParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cScaleParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cRotateParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cSkewXParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cSkewYParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//TransformValue:
		//	Matrix | Translate | Scale | Rotate | SkewX | SkewY;
		@Override public ParserRule getRule() { return rule; }
		
		//Matrix | Translate | Scale | Rotate | SkewX | SkewY
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Matrix
		public RuleCall getMatrixParserRuleCall_0() { return cMatrixParserRuleCall_0; }
		
		//Translate
		public RuleCall getTranslateParserRuleCall_1() { return cTranslateParserRuleCall_1; }
		
		//Scale
		public RuleCall getScaleParserRuleCall_2() { return cScaleParserRuleCall_2; }
		
		//Rotate
		public RuleCall getRotateParserRuleCall_3() { return cRotateParserRuleCall_3; }
		
		//SkewX
		public RuleCall getSkewXParserRuleCall_4() { return cSkewXParserRuleCall_4; }
		
		//SkewY
		public RuleCall getSkewYParserRuleCall_5() { return cSkewYParserRuleCall_5; }
	}
	public class MatrixElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.svg.transform.SvgTransform.Matrix");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMatrixKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cANumberParserRuleCall_2_0 = (RuleCall)cAAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBNumberParserRuleCall_4_0 = (RuleCall)cBAssignment_4.eContents().get(0);
		private final Keyword cCommaKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cCAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cCNumberParserRuleCall_6_0 = (RuleCall)cCAssignment_6.eContents().get(0);
		private final Keyword cCommaKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cDAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cDNumberParserRuleCall_8_0 = (RuleCall)cDAssignment_8.eContents().get(0);
		private final Keyword cCommaKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cEAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cENumberParserRuleCall_10_0 = (RuleCall)cEAssignment_10.eContents().get(0);
		private final Keyword cCommaKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cFAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cFNumberParserRuleCall_12_0 = (RuleCall)cFAssignment_12.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//Matrix:
		//	'matrix'
		//	'('
		//	a=Number ','?
		//	b=Number ','?
		//	c=Number ','?
		//	d=Number ','?
		//	e=Number ','?
		//	f=Number
		//	')';
		@Override public ParserRule getRule() { return rule; }
		
		//'matrix' '(' a=Number ','? b=Number ','? c=Number ','? d=Number ','? e=Number ','? f=Number ')'
		public Group getGroup() { return cGroup; }
		
		//'matrix'
		public Keyword getMatrixKeyword_0() { return cMatrixKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//a=Number
		public Assignment getAAssignment_2() { return cAAssignment_2; }
		
		//Number
		public RuleCall getANumberParserRuleCall_2_0() { return cANumberParserRuleCall_2_0; }
		
		//','?
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }
		
		//b=Number
		public Assignment getBAssignment_4() { return cBAssignment_4; }
		
		//Number
		public RuleCall getBNumberParserRuleCall_4_0() { return cBNumberParserRuleCall_4_0; }
		
		//','?
		public Keyword getCommaKeyword_5() { return cCommaKeyword_5; }
		
		//c=Number
		public Assignment getCAssignment_6() { return cCAssignment_6; }
		
		//Number
		public RuleCall getCNumberParserRuleCall_6_0() { return cCNumberParserRuleCall_6_0; }
		
		//','?
		public Keyword getCommaKeyword_7() { return cCommaKeyword_7; }
		
		//d=Number
		public Assignment getDAssignment_8() { return cDAssignment_8; }
		
		//Number
		public RuleCall getDNumberParserRuleCall_8_0() { return cDNumberParserRuleCall_8_0; }
		
		//','?
		public Keyword getCommaKeyword_9() { return cCommaKeyword_9; }
		
		//e=Number
		public Assignment getEAssignment_10() { return cEAssignment_10; }
		
		//Number
		public RuleCall getENumberParserRuleCall_10_0() { return cENumberParserRuleCall_10_0; }
		
		//','?
		public Keyword getCommaKeyword_11() { return cCommaKeyword_11; }
		
		//f=Number
		public Assignment getFAssignment_12() { return cFAssignment_12; }
		
		//Number
		public RuleCall getFNumberParserRuleCall_12_0() { return cFNumberParserRuleCall_12_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_13() { return cRightParenthesisKeyword_13; }
	}
	public class TranslateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.svg.transform.SvgTransform.Translate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTranslateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cXAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cXNumberParserRuleCall_2_0 = (RuleCall)cXAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cYAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cYNumberParserRuleCall_3_1_0 = (RuleCall)cYAssignment_3_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Translate:
		//	'translate'
		//	'('
		//	x=Number (','? y=Number)?
		//	')';
		@Override public ParserRule getRule() { return rule; }
		
		//'translate' '(' x=Number (','? y=Number)? ')'
		public Group getGroup() { return cGroup; }
		
		//'translate'
		public Keyword getTranslateKeyword_0() { return cTranslateKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//x=Number
		public Assignment getXAssignment_2() { return cXAssignment_2; }
		
		//Number
		public RuleCall getXNumberParserRuleCall_2_0() { return cXNumberParserRuleCall_2_0; }
		
		//(','? y=Number)?
		public Group getGroup_3() { return cGroup_3; }
		
		//','?
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }
		
		//y=Number
		public Assignment getYAssignment_3_1() { return cYAssignment_3_1; }
		
		//Number
		public RuleCall getYNumberParserRuleCall_3_1_0() { return cYNumberParserRuleCall_3_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class ScaleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.svg.transform.SvgTransform.Scale");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cScaleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cXAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cXNumberParserRuleCall_2_0 = (RuleCall)cXAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cYAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cYNumberParserRuleCall_3_1_0 = (RuleCall)cYAssignment_3_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Scale:
		//	'scale'
		//	'('
		//	x=Number (','? y=Number)?
		//	')';
		@Override public ParserRule getRule() { return rule; }
		
		//'scale' '(' x=Number (','? y=Number)? ')'
		public Group getGroup() { return cGroup; }
		
		//'scale'
		public Keyword getScaleKeyword_0() { return cScaleKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//x=Number
		public Assignment getXAssignment_2() { return cXAssignment_2; }
		
		//Number
		public RuleCall getXNumberParserRuleCall_2_0() { return cXNumberParserRuleCall_2_0; }
		
		//(','? y=Number)?
		public Group getGroup_3() { return cGroup_3; }
		
		//','?
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }
		
		//y=Number
		public Assignment getYAssignment_3_1() { return cYAssignment_3_1; }
		
		//Number
		public RuleCall getYNumberParserRuleCall_3_1_0() { return cYNumberParserRuleCall_3_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class RotateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.svg.transform.SvgTransform.Rotate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRotateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cANumberParserRuleCall_2_0 = (RuleCall)cAAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cXAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cXNumberParserRuleCall_3_1_0 = (RuleCall)cXAssignment_3_1.eContents().get(0);
		private final Keyword cCommaKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Assignment cYAssignment_3_3 = (Assignment)cGroup_3.eContents().get(3);
		private final RuleCall cYNumberParserRuleCall_3_3_0 = (RuleCall)cYAssignment_3_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Rotate:
		//	'rotate'
		//	'('
		//	a=Number (','? x=Number ','? y=Number)?
		//	')';
		@Override public ParserRule getRule() { return rule; }
		
		//'rotate' '(' a=Number (','? x=Number ','? y=Number)? ')'
		public Group getGroup() { return cGroup; }
		
		//'rotate'
		public Keyword getRotateKeyword_0() { return cRotateKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//a=Number
		public Assignment getAAssignment_2() { return cAAssignment_2; }
		
		//Number
		public RuleCall getANumberParserRuleCall_2_0() { return cANumberParserRuleCall_2_0; }
		
		//(','? x=Number ','? y=Number)?
		public Group getGroup_3() { return cGroup_3; }
		
		//','?
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }
		
		//x=Number
		public Assignment getXAssignment_3_1() { return cXAssignment_3_1; }
		
		//Number
		public RuleCall getXNumberParserRuleCall_3_1_0() { return cXNumberParserRuleCall_3_1_0; }
		
		//','?
		public Keyword getCommaKeyword_3_2() { return cCommaKeyword_3_2; }
		
		//y=Number
		public Assignment getYAssignment_3_3() { return cYAssignment_3_3; }
		
		//Number
		public RuleCall getYNumberParserRuleCall_3_3_0() { return cYNumberParserRuleCall_3_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class SkewXElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.svg.transform.SvgTransform.SkewX");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSkewXKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cANumberParserRuleCall_2_0 = (RuleCall)cAAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//SkewX:
		//	'skewX'
		//	'('
		//	a=Number
		//	')';
		@Override public ParserRule getRule() { return rule; }
		
		//'skewX' '(' a=Number ')'
		public Group getGroup() { return cGroup; }
		
		//'skewX'
		public Keyword getSkewXKeyword_0() { return cSkewXKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//a=Number
		public Assignment getAAssignment_2() { return cAAssignment_2; }
		
		//Number
		public RuleCall getANumberParserRuleCall_2_0() { return cANumberParserRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class SkewYElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.svg.transform.SvgTransform.SkewY");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSkewYKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cANumberParserRuleCall_2_0 = (RuleCall)cAAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//SkewY:
		//	'skewY'
		//	'('
		//	a=Number
		//	')';
		@Override public ParserRule getRule() { return rule; }
		
		//'skewY' '(' a=Number ')'
		public Group getGroup() { return cGroup; }
		
		//'skewY'
		public Keyword getSkewYKeyword_0() { return cSkewYKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//a=Number
		public Assignment getAAssignment_2() { return cAAssignment_2; }
		
		//Number
		public RuleCall getANumberParserRuleCall_2_0() { return cANumberParserRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class NumberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.svg.transform.SvgTransform.Number");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final RuleCall cIntegerParserRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Group cGroup_0_1 = (Group)cGroup_0.eContents().get(1);
		private final Alternatives cAlternatives_0_1_0 = (Alternatives)cGroup_0_1.eContents().get(0);
		private final Keyword cEKeyword_0_1_0_0 = (Keyword)cAlternatives_0_1_0.eContents().get(0);
		private final Keyword cEKeyword_0_1_0_1 = (Keyword)cAlternatives_0_1_0.eContents().get(1);
		private final RuleCall cIntegerParserRuleCall_0_1_1 = (RuleCall)cGroup_0_1.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_0_0 = (Keyword)cAlternatives_1_0.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_0_1 = (Keyword)cAlternatives_1_0.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Keyword cFullStopKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_1_3 = (RuleCall)cGroup_1.eContents().get(3);
		private final Group cGroup_1_4 = (Group)cGroup_1.eContents().get(4);
		private final Alternatives cAlternatives_1_4_0 = (Alternatives)cGroup_1_4.eContents().get(0);
		private final Keyword cEKeyword_1_4_0_0 = (Keyword)cAlternatives_1_4_0.eContents().get(0);
		private final Keyword cEKeyword_1_4_0_1 = (Keyword)cAlternatives_1_4_0.eContents().get(1);
		private final RuleCall cIntegerParserRuleCall_1_4_1 = (RuleCall)cGroup_1_4.eContents().get(1);
		
		//Number ecore::EBigDecimal:
		//	Integer (('E' | 'e') Integer)? | ('+' | '-')? INT? '.' INT (('E' | 'e') Integer)?;
		@Override public ParserRule getRule() { return rule; }
		
		//Integer (('E' | 'e') Integer)? | ('+' | '-')? INT? '.' INT (('E' | 'e') Integer)?
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Integer (('E' | 'e') Integer)?
		public Group getGroup_0() { return cGroup_0; }
		
		//Integer
		public RuleCall getIntegerParserRuleCall_0_0() { return cIntegerParserRuleCall_0_0; }
		
		//(('E' | 'e') Integer)?
		public Group getGroup_0_1() { return cGroup_0_1; }
		
		//'E' | 'e'
		public Alternatives getAlternatives_0_1_0() { return cAlternatives_0_1_0; }
		
		//'E'
		public Keyword getEKeyword_0_1_0_0() { return cEKeyword_0_1_0_0; }
		
		//'e'
		public Keyword getEKeyword_0_1_0_1() { return cEKeyword_0_1_0_1; }
		
		//Integer
		public RuleCall getIntegerParserRuleCall_0_1_1() { return cIntegerParserRuleCall_0_1_1; }
		
		//('+' | '-')? INT? '.' INT (('E' | 'e') Integer)?
		public Group getGroup_1() { return cGroup_1; }
		
		//('+' | '-')?
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1_0_0() { return cPlusSignKeyword_1_0_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_0_1() { return cHyphenMinusKeyword_1_0_1; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_1_1() { return cINTTerminalRuleCall_1_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_2() { return cFullStopKeyword_1_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_3() { return cINTTerminalRuleCall_1_3; }
		
		//(('E' | 'e') Integer)?
		public Group getGroup_1_4() { return cGroup_1_4; }
		
		//'E' | 'e'
		public Alternatives getAlternatives_1_4_0() { return cAlternatives_1_4_0; }
		
		//'E'
		public Keyword getEKeyword_1_4_0_0() { return cEKeyword_1_4_0_0; }
		
		//'e'
		public Keyword getEKeyword_1_4_0_1() { return cEKeyword_1_4_0_1; }
		
		//Integer
		public RuleCall getIntegerParserRuleCall_1_4_1() { return cIntegerParserRuleCall_1_4_1; }
	}
	public class IntegerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.svg.transform.SvgTransform.Integer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Keyword cPlusSignKeyword_0_0 = (Keyword)cAlternatives_0.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_0_1 = (Keyword)cAlternatives_0.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Integer ecore::EBigInteger:
		//	('+' | '-')? INT;
		@Override public ParserRule getRule() { return rule; }
		
		//('+' | '-')? INT
		public Group getGroup() { return cGroup; }
		
		//('+' | '-')?
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_0_0() { return cPlusSignKeyword_0_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_0_1() { return cHyphenMinusKeyword_0_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	
	
	private final TransformElements pTransform;
	private final TransformValueElements pTransformValue;
	private final MatrixElements pMatrix;
	private final TranslateElements pTranslate;
	private final ScaleElements pScale;
	private final RotateElements pRotate;
	private final SkewXElements pSkewX;
	private final SkewYElements pSkewY;
	private final NumberElements pNumber;
	private final IntegerElements pInteger;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SvgTransformGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pTransform = new TransformElements();
		this.pTransformValue = new TransformValueElements();
		this.pMatrix = new MatrixElements();
		this.pTranslate = new TranslateElements();
		this.pScale = new ScaleElements();
		this.pRotate = new RotateElements();
		this.pSkewX = new SkewXElements();
		this.pSkewY = new SkewYElements();
		this.pNumber = new NumberElements();
		this.pInteger = new IntegerElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.svg.transform.SvgTransform".equals(grammar.getName())) {
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

	
	//Transform:
	//	transform+=TransformValue (','? transform+=TransformValue)*;
	public TransformElements getTransformAccess() {
		return pTransform;
	}
	
	public ParserRule getTransformRule() {
		return getTransformAccess().getRule();
	}
	
	//TransformValue:
	//	Matrix | Translate | Scale | Rotate | SkewX | SkewY;
	public TransformValueElements getTransformValueAccess() {
		return pTransformValue;
	}
	
	public ParserRule getTransformValueRule() {
		return getTransformValueAccess().getRule();
	}
	
	//Matrix:
	//	'matrix'
	//	'('
	//	a=Number ','?
	//	b=Number ','?
	//	c=Number ','?
	//	d=Number ','?
	//	e=Number ','?
	//	f=Number
	//	')';
	public MatrixElements getMatrixAccess() {
		return pMatrix;
	}
	
	public ParserRule getMatrixRule() {
		return getMatrixAccess().getRule();
	}
	
	//Translate:
	//	'translate'
	//	'('
	//	x=Number (','? y=Number)?
	//	')';
	public TranslateElements getTranslateAccess() {
		return pTranslate;
	}
	
	public ParserRule getTranslateRule() {
		return getTranslateAccess().getRule();
	}
	
	//Scale:
	//	'scale'
	//	'('
	//	x=Number (','? y=Number)?
	//	')';
	public ScaleElements getScaleAccess() {
		return pScale;
	}
	
	public ParserRule getScaleRule() {
		return getScaleAccess().getRule();
	}
	
	//Rotate:
	//	'rotate'
	//	'('
	//	a=Number (','? x=Number ','? y=Number)?
	//	')';
	public RotateElements getRotateAccess() {
		return pRotate;
	}
	
	public ParserRule getRotateRule() {
		return getRotateAccess().getRule();
	}
	
	//SkewX:
	//	'skewX'
	//	'('
	//	a=Number
	//	')';
	public SkewXElements getSkewXAccess() {
		return pSkewX;
	}
	
	public ParserRule getSkewXRule() {
		return getSkewXAccess().getRule();
	}
	
	//SkewY:
	//	'skewY'
	//	'('
	//	a=Number
	//	')';
	public SkewYElements getSkewYAccess() {
		return pSkewY;
	}
	
	public ParserRule getSkewYRule() {
		return getSkewYAccess().getRule();
	}
	
	//Number ecore::EBigDecimal:
	//	Integer (('E' | 'e') Integer)? | ('+' | '-')? INT? '.' INT (('E' | 'e') Integer)?;
	public NumberElements getNumberAccess() {
		return pNumber;
	}
	
	public ParserRule getNumberRule() {
		return getNumberAccess().getRule();
	}
	
	//Integer ecore::EBigInteger:
	//	('+' | '-')? INT;
	public IntegerElements getIntegerAccess() {
		return pInteger;
	}
	
	public ParserRule getIntegerRule() {
		return getIntegerAccess().getRule();
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
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
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