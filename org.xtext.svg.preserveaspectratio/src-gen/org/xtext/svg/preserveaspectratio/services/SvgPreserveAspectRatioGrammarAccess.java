/*
 * generated by Xtext 2.12.0
 */
package org.xtext.svg.preserveaspectratio.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SvgPreserveAspectRatioGrammarAccess extends AbstractGrammarElementFinder {
	
	public class PreserveAspectRatioElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.svg.preserveaspectratio.SvgPreserveAspectRatio.PreserveAspectRatio");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAlignAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAlignAlignEnumRuleCall_0_0 = (RuleCall)cAlignAssignment_0.eContents().get(0);
		private final Assignment cMeetOrSliceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMeetOrSliceMeetOrSliceEnumRuleCall_1_0 = (RuleCall)cMeetOrSliceAssignment_1.eContents().get(0);
		
		//PreserveAspectRatio:
		//	align=Align meetOrSlice=MeetOrSlice?;
		@Override public ParserRule getRule() { return rule; }
		
		//align=Align meetOrSlice=MeetOrSlice?
		public Group getGroup() { return cGroup; }
		
		//align=Align
		public Assignment getAlignAssignment_0() { return cAlignAssignment_0; }
		
		//Align
		public RuleCall getAlignAlignEnumRuleCall_0_0() { return cAlignAlignEnumRuleCall_0_0; }
		
		//meetOrSlice=MeetOrSlice?
		public Assignment getMeetOrSliceAssignment_1() { return cMeetOrSliceAssignment_1; }
		
		//MeetOrSlice
		public RuleCall getMeetOrSliceMeetOrSliceEnumRuleCall_1_0() { return cMeetOrSliceMeetOrSliceEnumRuleCall_1_0; }
	}
	
	public class AlignElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.svg.preserveaspectratio.SvgPreserveAspectRatio.Align");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cNoneEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cNoneNoneKeyword_0_0 = (Keyword)cNoneEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cXMinYMinEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cXMinYMinXMinYMinKeyword_1_0 = (Keyword)cXMinYMinEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cXMidYMinEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cXMidYMinXMidYMinKeyword_2_0 = (Keyword)cXMidYMinEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cXMaxYMinEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cXMaxYMinXMaxYMinKeyword_3_0 = (Keyword)cXMaxYMinEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cXMinYMidEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cXMinYMidXMinYMidKeyword_4_0 = (Keyword)cXMinYMidEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cXMidYMidEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cXMidYMidXMidYMidKeyword_5_0 = (Keyword)cXMidYMidEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cXMaxYMidEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cXMaxYMidXMaxYMidKeyword_6_0 = (Keyword)cXMaxYMidEnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cXMinYMaxEnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cXMinYMaxXMinYMaxKeyword_7_0 = (Keyword)cXMinYMaxEnumLiteralDeclaration_7.eContents().get(0);
		private final EnumLiteralDeclaration cXMidYMaxEnumLiteralDeclaration_8 = (EnumLiteralDeclaration)cAlternatives.eContents().get(8);
		private final Keyword cXMidYMaxXMidYMaxKeyword_8_0 = (Keyword)cXMidYMaxEnumLiteralDeclaration_8.eContents().get(0);
		private final EnumLiteralDeclaration cXMaxYMaxEnumLiteralDeclaration_9 = (EnumLiteralDeclaration)cAlternatives.eContents().get(9);
		private final Keyword cXMaxYMaxXMaxYMaxKeyword_9_0 = (Keyword)cXMaxYMaxEnumLiteralDeclaration_9.eContents().get(0);
		
		//enum Align:
		//	none | xMinYMin | xMidYMin | xMaxYMin | xMinYMid | xMidYMid | xMaxYMid | xMinYMax | xMidYMax | xMaxYMax;
		public EnumRule getRule() { return rule; }
		
		//none | xMinYMin | xMidYMin | xMaxYMin | xMinYMid | xMidYMid | xMaxYMid | xMinYMax | xMidYMax | xMaxYMax
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//none
		public EnumLiteralDeclaration getNoneEnumLiteralDeclaration_0() { return cNoneEnumLiteralDeclaration_0; }
		
		//'none'
		public Keyword getNoneNoneKeyword_0_0() { return cNoneNoneKeyword_0_0; }
		
		//xMinYMin
		public EnumLiteralDeclaration getXMinYMinEnumLiteralDeclaration_1() { return cXMinYMinEnumLiteralDeclaration_1; }
		
		//'xMinYMin'
		public Keyword getXMinYMinXMinYMinKeyword_1_0() { return cXMinYMinXMinYMinKeyword_1_0; }
		
		//xMidYMin
		public EnumLiteralDeclaration getXMidYMinEnumLiteralDeclaration_2() { return cXMidYMinEnumLiteralDeclaration_2; }
		
		//'xMidYMin'
		public Keyword getXMidYMinXMidYMinKeyword_2_0() { return cXMidYMinXMidYMinKeyword_2_0; }
		
		//xMaxYMin
		public EnumLiteralDeclaration getXMaxYMinEnumLiteralDeclaration_3() { return cXMaxYMinEnumLiteralDeclaration_3; }
		
		//'xMaxYMin'
		public Keyword getXMaxYMinXMaxYMinKeyword_3_0() { return cXMaxYMinXMaxYMinKeyword_3_0; }
		
		//xMinYMid
		public EnumLiteralDeclaration getXMinYMidEnumLiteralDeclaration_4() { return cXMinYMidEnumLiteralDeclaration_4; }
		
		//'xMinYMid'
		public Keyword getXMinYMidXMinYMidKeyword_4_0() { return cXMinYMidXMinYMidKeyword_4_0; }
		
		//xMidYMid
		public EnumLiteralDeclaration getXMidYMidEnumLiteralDeclaration_5() { return cXMidYMidEnumLiteralDeclaration_5; }
		
		//'xMidYMid'
		public Keyword getXMidYMidXMidYMidKeyword_5_0() { return cXMidYMidXMidYMidKeyword_5_0; }
		
		//xMaxYMid
		public EnumLiteralDeclaration getXMaxYMidEnumLiteralDeclaration_6() { return cXMaxYMidEnumLiteralDeclaration_6; }
		
		//'xMaxYMid'
		public Keyword getXMaxYMidXMaxYMidKeyword_6_0() { return cXMaxYMidXMaxYMidKeyword_6_0; }
		
		//xMinYMax
		public EnumLiteralDeclaration getXMinYMaxEnumLiteralDeclaration_7() { return cXMinYMaxEnumLiteralDeclaration_7; }
		
		//'xMinYMax'
		public Keyword getXMinYMaxXMinYMaxKeyword_7_0() { return cXMinYMaxXMinYMaxKeyword_7_0; }
		
		//xMidYMax
		public EnumLiteralDeclaration getXMidYMaxEnumLiteralDeclaration_8() { return cXMidYMaxEnumLiteralDeclaration_8; }
		
		//'xMidYMax'
		public Keyword getXMidYMaxXMidYMaxKeyword_8_0() { return cXMidYMaxXMidYMaxKeyword_8_0; }
		
		//xMaxYMax
		public EnumLiteralDeclaration getXMaxYMaxEnumLiteralDeclaration_9() { return cXMaxYMaxEnumLiteralDeclaration_9; }
		
		//'xMaxYMax'
		public Keyword getXMaxYMaxXMaxYMaxKeyword_9_0() { return cXMaxYMaxXMaxYMaxKeyword_9_0; }
	}
	public class MeetOrSliceElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.svg.preserveaspectratio.SvgPreserveAspectRatio.MeetOrSlice");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMeetEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMeetMeetKeyword_0_0 = (Keyword)cMeetEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSliceEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSliceSliceKeyword_1_0 = (Keyword)cSliceEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum MeetOrSlice:
		//	meet | slice;
		public EnumRule getRule() { return rule; }
		
		//meet | slice
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//meet
		public EnumLiteralDeclaration getMeetEnumLiteralDeclaration_0() { return cMeetEnumLiteralDeclaration_0; }
		
		//'meet'
		public Keyword getMeetMeetKeyword_0_0() { return cMeetMeetKeyword_0_0; }
		
		//slice
		public EnumLiteralDeclaration getSliceEnumLiteralDeclaration_1() { return cSliceEnumLiteralDeclaration_1; }
		
		//'slice'
		public Keyword getSliceSliceKeyword_1_0() { return cSliceSliceKeyword_1_0; }
	}
	
	private final PreserveAspectRatioElements pPreserveAspectRatio;
	private final AlignElements eAlign;
	private final MeetOrSliceElements eMeetOrSlice;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SvgPreserveAspectRatioGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pPreserveAspectRatio = new PreserveAspectRatioElements();
		this.eAlign = new AlignElements();
		this.eMeetOrSlice = new MeetOrSliceElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.svg.preserveaspectratio.SvgPreserveAspectRatio".equals(grammar.getName())) {
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

	
	//PreserveAspectRatio:
	//	align=Align meetOrSlice=MeetOrSlice?;
	public PreserveAspectRatioElements getPreserveAspectRatioAccess() {
		return pPreserveAspectRatio;
	}
	
	public ParserRule getPreserveAspectRatioRule() {
		return getPreserveAspectRatioAccess().getRule();
	}
	
	//enum Align:
	//	none | xMinYMin | xMidYMin | xMaxYMin | xMinYMid | xMidYMid | xMaxYMid | xMinYMax | xMidYMax | xMaxYMax;
	public AlignElements getAlignAccess() {
		return eAlign;
	}
	
	public EnumRule getAlignRule() {
		return getAlignAccess().getRule();
	}
	
	//enum MeetOrSlice:
	//	meet | slice;
	public MeetOrSliceElements getMeetOrSliceAccess() {
		return eMeetOrSlice;
	}
	
	public EnumRule getMeetOrSliceRule() {
		return getMeetOrSliceAccess().getRule();
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