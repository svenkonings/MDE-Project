package org.xtext.svg.path.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.svg.path.services.SvgPathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSvgPathParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'+'", "'-'", "'.'", "'M'", "','", "'m'", "'L'", "'l'", "'H'", "'h'", "'V'", "'v'", "'Q'", "'q'", "'C'", "'c'", "'T'", "'t'", "'S'", "'s'", "'Z'", "'z'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSvgPathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSvgPathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSvgPathParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSvgPath.g"; }



     	private SvgPathGrammarAccess grammarAccess;

        public InternalSvgPathParser(TokenStream input, SvgPathGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Path";
       	}

       	@Override
       	protected SvgPathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePath"
    // InternalSvgPath.g:64:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // InternalSvgPath.g:64:45: (iv_rulePath= rulePath EOF )
            // InternalSvgPath.g:65:2: iv_rulePath= rulePath EOF
            {
             newCompositeNode(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePath=rulePath();

            state._fsp--;

             current =iv_rulePath; 
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
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // InternalSvgPath.g:71:1: rulePath returns [EObject current=null] : ( ( (lv_path_0_0= rulePathValue ) ) ( (lv_path_1_0= rulePathValue ) )* ) ;
    public final EObject rulePath() throws RecognitionException {
        EObject current = null;

        EObject lv_path_0_0 = null;

        EObject lv_path_1_0 = null;



        	enterRule();

        try {
            // InternalSvgPath.g:77:2: ( ( ( (lv_path_0_0= rulePathValue ) ) ( (lv_path_1_0= rulePathValue ) )* ) )
            // InternalSvgPath.g:78:2: ( ( (lv_path_0_0= rulePathValue ) ) ( (lv_path_1_0= rulePathValue ) )* )
            {
            // InternalSvgPath.g:78:2: ( ( (lv_path_0_0= rulePathValue ) ) ( (lv_path_1_0= rulePathValue ) )* )
            // InternalSvgPath.g:79:3: ( (lv_path_0_0= rulePathValue ) ) ( (lv_path_1_0= rulePathValue ) )*
            {
            // InternalSvgPath.g:79:3: ( (lv_path_0_0= rulePathValue ) )
            // InternalSvgPath.g:80:4: (lv_path_0_0= rulePathValue )
            {
            // InternalSvgPath.g:80:4: (lv_path_0_0= rulePathValue )
            // InternalSvgPath.g:81:5: lv_path_0_0= rulePathValue
            {

            					newCompositeNode(grammarAccess.getPathAccess().getPathPathValueParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_path_0_0=rulePathValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPathRule());
            					}
            					add(
            						current,
            						"path",
            						lv_path_0_0,
            						"org.xtext.svg.path.SvgPath.PathValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:98:3: ( (lv_path_1_0= rulePathValue ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||(LA1_0>=18 && LA1_0<=34)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSvgPath.g:99:4: (lv_path_1_0= rulePathValue )
            	    {
            	    // InternalSvgPath.g:99:4: (lv_path_1_0= rulePathValue )
            	    // InternalSvgPath.g:100:5: lv_path_1_0= rulePathValue
            	    {

            	    					newCompositeNode(grammarAccess.getPathAccess().getPathPathValueParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_path_1_0=rulePathValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPathRule());
            	    					}
            	    					add(
            	    						current,
            	    						"path",
            	    						lv_path_1_0,
            	    						"org.xtext.svg.path.SvgPath.PathValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRulePathValue"
    // InternalSvgPath.g:121:1: entryRulePathValue returns [EObject current=null] : iv_rulePathValue= rulePathValue EOF ;
    public final EObject entryRulePathValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathValue = null;


        try {
            // InternalSvgPath.g:121:50: (iv_rulePathValue= rulePathValue EOF )
            // InternalSvgPath.g:122:2: iv_rulePathValue= rulePathValue EOF
            {
             newCompositeNode(grammarAccess.getPathValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePathValue=rulePathValue();

            state._fsp--;

             current =iv_rulePathValue; 
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
    // $ANTLR end "entryRulePathValue"


    // $ANTLR start "rulePathValue"
    // InternalSvgPath.g:128:1: rulePathValue returns [EObject current=null] : (this_AbsoluteMoveTo_0= ruleAbsoluteMoveTo | this_RelativeMoveTo_1= ruleRelativeMoveTo | this_AbsoluteLineTo_2= ruleAbsoluteLineTo | this_RelativeLineTo_3= ruleRelativeLineTo | this_AbsoluteHorizontalLineTo_4= ruleAbsoluteHorizontalLineTo | this_RelativeHorizontalLineTo_5= ruleRelativeHorizontalLineTo | this_AbsoluteVerticalLineTo_6= ruleAbsoluteVerticalLineTo | this_RelativeVerticalLineTo_7= ruleRelativeVerticalLineTo | this_AbsoluteQuadraticCurveTo_8= ruleAbsoluteQuadraticCurveTo | this_RelativeQuadraticCurveTo_9= ruleRelativeQuadraticCurveTo | this_AbsoluteCubicCurveTo_10= ruleAbsoluteCubicCurveTo | this_RelativeCubicCurveTo_11= ruleRelativeCubicCurveTo | this_AbsoluteSmoothQuadraticCurveTo_12= ruleAbsoluteSmoothQuadraticCurveTo | this_RelativeSmoothQuadraticCurveTo_13= ruleRelativeSmoothQuadraticCurveTo | this_AbsoluteSmoothCubicCurveTo_14= ruleAbsoluteSmoothCubicCurveTo | this_RelativeSmoothCubicCurveTo_15= ruleRelativeSmoothCubicCurveTo | this_ClosePath_16= ruleClosePath ) ;
    public final EObject rulePathValue() throws RecognitionException {
        EObject current = null;

        EObject this_AbsoluteMoveTo_0 = null;

        EObject this_RelativeMoveTo_1 = null;

        EObject this_AbsoluteLineTo_2 = null;

        EObject this_RelativeLineTo_3 = null;

        EObject this_AbsoluteHorizontalLineTo_4 = null;

        EObject this_RelativeHorizontalLineTo_5 = null;

        EObject this_AbsoluteVerticalLineTo_6 = null;

        EObject this_RelativeVerticalLineTo_7 = null;

        EObject this_AbsoluteQuadraticCurveTo_8 = null;

        EObject this_RelativeQuadraticCurveTo_9 = null;

        EObject this_AbsoluteCubicCurveTo_10 = null;

        EObject this_RelativeCubicCurveTo_11 = null;

        EObject this_AbsoluteSmoothQuadraticCurveTo_12 = null;

        EObject this_RelativeSmoothQuadraticCurveTo_13 = null;

        EObject this_AbsoluteSmoothCubicCurveTo_14 = null;

        EObject this_RelativeSmoothCubicCurveTo_15 = null;

        EObject this_ClosePath_16 = null;



        	enterRule();

        try {
            // InternalSvgPath.g:134:2: ( (this_AbsoluteMoveTo_0= ruleAbsoluteMoveTo | this_RelativeMoveTo_1= ruleRelativeMoveTo | this_AbsoluteLineTo_2= ruleAbsoluteLineTo | this_RelativeLineTo_3= ruleRelativeLineTo | this_AbsoluteHorizontalLineTo_4= ruleAbsoluteHorizontalLineTo | this_RelativeHorizontalLineTo_5= ruleRelativeHorizontalLineTo | this_AbsoluteVerticalLineTo_6= ruleAbsoluteVerticalLineTo | this_RelativeVerticalLineTo_7= ruleRelativeVerticalLineTo | this_AbsoluteQuadraticCurveTo_8= ruleAbsoluteQuadraticCurveTo | this_RelativeQuadraticCurveTo_9= ruleRelativeQuadraticCurveTo | this_AbsoluteCubicCurveTo_10= ruleAbsoluteCubicCurveTo | this_RelativeCubicCurveTo_11= ruleRelativeCubicCurveTo | this_AbsoluteSmoothQuadraticCurveTo_12= ruleAbsoluteSmoothQuadraticCurveTo | this_RelativeSmoothQuadraticCurveTo_13= ruleRelativeSmoothQuadraticCurveTo | this_AbsoluteSmoothCubicCurveTo_14= ruleAbsoluteSmoothCubicCurveTo | this_RelativeSmoothCubicCurveTo_15= ruleRelativeSmoothCubicCurveTo | this_ClosePath_16= ruleClosePath ) )
            // InternalSvgPath.g:135:2: (this_AbsoluteMoveTo_0= ruleAbsoluteMoveTo | this_RelativeMoveTo_1= ruleRelativeMoveTo | this_AbsoluteLineTo_2= ruleAbsoluteLineTo | this_RelativeLineTo_3= ruleRelativeLineTo | this_AbsoluteHorizontalLineTo_4= ruleAbsoluteHorizontalLineTo | this_RelativeHorizontalLineTo_5= ruleRelativeHorizontalLineTo | this_AbsoluteVerticalLineTo_6= ruleAbsoluteVerticalLineTo | this_RelativeVerticalLineTo_7= ruleRelativeVerticalLineTo | this_AbsoluteQuadraticCurveTo_8= ruleAbsoluteQuadraticCurveTo | this_RelativeQuadraticCurveTo_9= ruleRelativeQuadraticCurveTo | this_AbsoluteCubicCurveTo_10= ruleAbsoluteCubicCurveTo | this_RelativeCubicCurveTo_11= ruleRelativeCubicCurveTo | this_AbsoluteSmoothQuadraticCurveTo_12= ruleAbsoluteSmoothQuadraticCurveTo | this_RelativeSmoothQuadraticCurveTo_13= ruleRelativeSmoothQuadraticCurveTo | this_AbsoluteSmoothCubicCurveTo_14= ruleAbsoluteSmoothCubicCurveTo | this_RelativeSmoothCubicCurveTo_15= ruleRelativeSmoothCubicCurveTo | this_ClosePath_16= ruleClosePath )
            {
            // InternalSvgPath.g:135:2: (this_AbsoluteMoveTo_0= ruleAbsoluteMoveTo | this_RelativeMoveTo_1= ruleRelativeMoveTo | this_AbsoluteLineTo_2= ruleAbsoluteLineTo | this_RelativeLineTo_3= ruleRelativeLineTo | this_AbsoluteHorizontalLineTo_4= ruleAbsoluteHorizontalLineTo | this_RelativeHorizontalLineTo_5= ruleRelativeHorizontalLineTo | this_AbsoluteVerticalLineTo_6= ruleAbsoluteVerticalLineTo | this_RelativeVerticalLineTo_7= ruleRelativeVerticalLineTo | this_AbsoluteQuadraticCurveTo_8= ruleAbsoluteQuadraticCurveTo | this_RelativeQuadraticCurveTo_9= ruleRelativeQuadraticCurveTo | this_AbsoluteCubicCurveTo_10= ruleAbsoluteCubicCurveTo | this_RelativeCubicCurveTo_11= ruleRelativeCubicCurveTo | this_AbsoluteSmoothQuadraticCurveTo_12= ruleAbsoluteSmoothQuadraticCurveTo | this_RelativeSmoothQuadraticCurveTo_13= ruleRelativeSmoothQuadraticCurveTo | this_AbsoluteSmoothCubicCurveTo_14= ruleAbsoluteSmoothCubicCurveTo | this_RelativeSmoothCubicCurveTo_15= ruleRelativeSmoothCubicCurveTo | this_ClosePath_16= ruleClosePath )
            int alt2=17;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            case 20:
                {
                alt2=4;
                }
                break;
            case 21:
                {
                alt2=5;
                }
                break;
            case 22:
                {
                alt2=6;
                }
                break;
            case 23:
                {
                alt2=7;
                }
                break;
            case 24:
                {
                alt2=8;
                }
                break;
            case 25:
                {
                alt2=9;
                }
                break;
            case 26:
                {
                alt2=10;
                }
                break;
            case 27:
                {
                alt2=11;
                }
                break;
            case 28:
                {
                alt2=12;
                }
                break;
            case 29:
                {
                alt2=13;
                }
                break;
            case 30:
                {
                alt2=14;
                }
                break;
            case 31:
                {
                alt2=15;
                }
                break;
            case 32:
                {
                alt2=16;
                }
                break;
            case 33:
            case 34:
                {
                alt2=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSvgPath.g:136:3: this_AbsoluteMoveTo_0= ruleAbsoluteMoveTo
                    {

                    			newCompositeNode(grammarAccess.getPathValueAccess().getAbsoluteMoveToParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbsoluteMoveTo_0=ruleAbsoluteMoveTo();

                    state._fsp--;


                    			current = this_AbsoluteMoveTo_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSvgPath.g:145:3: this_RelativeMoveTo_1= ruleRelativeMoveTo
                    {

                    			newCompositeNode(grammarAccess.getPathValueAccess().getRelativeMoveToParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelativeMoveTo_1=ruleRelativeMoveTo();

                    state._fsp--;


                    			current = this_RelativeMoveTo_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSvgPath.g:154:3: this_AbsoluteLineTo_2= ruleAbsoluteLineTo
                    {

                    			newCompositeNode(grammarAccess.getPathValueAccess().getAbsoluteLineToParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbsoluteLineTo_2=ruleAbsoluteLineTo();

                    state._fsp--;


                    			current = this_AbsoluteLineTo_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSvgPath.g:163:3: this_RelativeLineTo_3= ruleRelativeLineTo
                    {

                    			newCompositeNode(grammarAccess.getPathValueAccess().getRelativeLineToParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelativeLineTo_3=ruleRelativeLineTo();

                    state._fsp--;


                    			current = this_RelativeLineTo_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSvgPath.g:172:3: this_AbsoluteHorizontalLineTo_4= ruleAbsoluteHorizontalLineTo
                    {

                    			newCompositeNode(grammarAccess.getPathValueAccess().getAbsoluteHorizontalLineToParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbsoluteHorizontalLineTo_4=ruleAbsoluteHorizontalLineTo();

                    state._fsp--;


                    			current = this_AbsoluteHorizontalLineTo_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSvgPath.g:181:3: this_RelativeHorizontalLineTo_5= ruleRelativeHorizontalLineTo
                    {

                    			newCompositeNode(grammarAccess.getPathValueAccess().getRelativeHorizontalLineToParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelativeHorizontalLineTo_5=ruleRelativeHorizontalLineTo();

                    state._fsp--;


                    			current = this_RelativeHorizontalLineTo_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSvgPath.g:190:3: this_AbsoluteVerticalLineTo_6= ruleAbsoluteVerticalLineTo
                    {

                    			newCompositeNode(grammarAccess.getPathValueAccess().getAbsoluteVerticalLineToParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbsoluteVerticalLineTo_6=ruleAbsoluteVerticalLineTo();

                    state._fsp--;


                    			current = this_AbsoluteVerticalLineTo_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalSvgPath.g:199:3: this_RelativeVerticalLineTo_7= ruleRelativeVerticalLineTo
                    {

                    			newCompositeNode(grammarAccess.getPathValueAccess().getRelativeVerticalLineToParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelativeVerticalLineTo_7=ruleRelativeVerticalLineTo();

                    state._fsp--;


                    			current = this_RelativeVerticalLineTo_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalSvgPath.g:208:3: this_AbsoluteQuadraticCurveTo_8= ruleAbsoluteQuadraticCurveTo
                    {

                    			newCompositeNode(grammarAccess.getPathValueAccess().getAbsoluteQuadraticCurveToParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbsoluteQuadraticCurveTo_8=ruleAbsoluteQuadraticCurveTo();

                    state._fsp--;


                    			current = this_AbsoluteQuadraticCurveTo_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalSvgPath.g:217:3: this_RelativeQuadraticCurveTo_9= ruleRelativeQuadraticCurveTo
                    {

                    			newCompositeNode(grammarAccess.getPathValueAccess().getRelativeQuadraticCurveToParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelativeQuadraticCurveTo_9=ruleRelativeQuadraticCurveTo();

                    state._fsp--;


                    			current = this_RelativeQuadraticCurveTo_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalSvgPath.g:226:3: this_AbsoluteCubicCurveTo_10= ruleAbsoluteCubicCurveTo
                    {

                    			newCompositeNode(grammarAccess.getPathValueAccess().getAbsoluteCubicCurveToParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbsoluteCubicCurveTo_10=ruleAbsoluteCubicCurveTo();

                    state._fsp--;


                    			current = this_AbsoluteCubicCurveTo_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalSvgPath.g:235:3: this_RelativeCubicCurveTo_11= ruleRelativeCubicCurveTo
                    {

                    			newCompositeNode(grammarAccess.getPathValueAccess().getRelativeCubicCurveToParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelativeCubicCurveTo_11=ruleRelativeCubicCurveTo();

                    state._fsp--;


                    			current = this_RelativeCubicCurveTo_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalSvgPath.g:244:3: this_AbsoluteSmoothQuadraticCurveTo_12= ruleAbsoluteSmoothQuadraticCurveTo
                    {

                    			newCompositeNode(grammarAccess.getPathValueAccess().getAbsoluteSmoothQuadraticCurveToParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbsoluteSmoothQuadraticCurveTo_12=ruleAbsoluteSmoothQuadraticCurveTo();

                    state._fsp--;


                    			current = this_AbsoluteSmoothQuadraticCurveTo_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalSvgPath.g:253:3: this_RelativeSmoothQuadraticCurveTo_13= ruleRelativeSmoothQuadraticCurveTo
                    {

                    			newCompositeNode(grammarAccess.getPathValueAccess().getRelativeSmoothQuadraticCurveToParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelativeSmoothQuadraticCurveTo_13=ruleRelativeSmoothQuadraticCurveTo();

                    state._fsp--;


                    			current = this_RelativeSmoothQuadraticCurveTo_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalSvgPath.g:262:3: this_AbsoluteSmoothCubicCurveTo_14= ruleAbsoluteSmoothCubicCurveTo
                    {

                    			newCompositeNode(grammarAccess.getPathValueAccess().getAbsoluteSmoothCubicCurveToParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbsoluteSmoothCubicCurveTo_14=ruleAbsoluteSmoothCubicCurveTo();

                    state._fsp--;


                    			current = this_AbsoluteSmoothCubicCurveTo_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalSvgPath.g:271:3: this_RelativeSmoothCubicCurveTo_15= ruleRelativeSmoothCubicCurveTo
                    {

                    			newCompositeNode(grammarAccess.getPathValueAccess().getRelativeSmoothCubicCurveToParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelativeSmoothCubicCurveTo_15=ruleRelativeSmoothCubicCurveTo();

                    state._fsp--;


                    			current = this_RelativeSmoothCubicCurveTo_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalSvgPath.g:280:3: this_ClosePath_16= ruleClosePath
                    {

                    			newCompositeNode(grammarAccess.getPathValueAccess().getClosePathParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClosePath_16=ruleClosePath();

                    state._fsp--;


                    			current = this_ClosePath_16;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "rulePathValue"


    // $ANTLR start "entryRuleNumber"
    // InternalSvgPath.g:292:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalSvgPath.g:292:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalSvgPath.g:293:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalSvgPath.g:299:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? ) | ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_6=null;
        Token this_INT_8=null;
        AntlrDatatypeRuleToken this_Integer_0 = null;

        AntlrDatatypeRuleToken this_Integer_3 = null;

        AntlrDatatypeRuleToken this_Integer_11 = null;



        	enterRule();

        try {
            // InternalSvgPath.g:305:2: ( ( (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? ) | ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? ) ) )
            // InternalSvgPath.g:306:2: ( (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? ) | ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? ) )
            {
            // InternalSvgPath.g:306:2: ( (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? ) | ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? ) )
            int alt9=2;
            switch ( input.LA(1) ) {
            case 13:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_INT) ) {
                    alt9=1;
                }
                else if ( (LA9_1==15) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==RULE_INT) ) {
                    alt9=1;
                }
                else if ( (LA9_2==15) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case 15:
                {
                alt9=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSvgPath.g:307:3: (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? )
                    {
                    // InternalSvgPath.g:307:3: (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? )
                    // InternalSvgPath.g:308:4: this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )?
                    {

                    				newCompositeNode(grammarAccess.getNumberAccess().getIntegerParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_4);
                    this_Integer_0=ruleInteger();

                    state._fsp--;


                    				current.merge(this_Integer_0);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalSvgPath.g:318:4: ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>=11 && LA4_0<=12)) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalSvgPath.g:319:5: (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger
                            {
                            // InternalSvgPath.g:319:5: (kw= 'E' | kw= 'e' )
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( (LA3_0==11) ) {
                                alt3=1;
                            }
                            else if ( (LA3_0==12) ) {
                                alt3=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 0, input);

                                throw nvae;
                            }
                            switch (alt3) {
                                case 1 :
                                    // InternalSvgPath.g:320:6: kw= 'E'
                                    {
                                    kw=(Token)match(input,11,FOLLOW_5); 

                                    						current.merge(kw);
                                    						newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_0_1_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalSvgPath.g:326:6: kw= 'e'
                                    {
                                    kw=(Token)match(input,12,FOLLOW_5); 

                                    						current.merge(kw);
                                    						newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_0_1_0_1());
                                    					

                                    }
                                    break;

                            }


                            					newCompositeNode(grammarAccess.getNumberAccess().getIntegerParserRuleCall_0_1_1());
                            				
                            pushFollow(FOLLOW_2);
                            this_Integer_3=ruleInteger();

                            state._fsp--;


                            					current.merge(this_Integer_3);
                            				

                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSvgPath.g:345:3: ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? )
                    {
                    // InternalSvgPath.g:345:3: ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? )
                    // InternalSvgPath.g:346:4: (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )?
                    {
                    // InternalSvgPath.g:346:4: (kw= '+' | kw= '-' )?
                    int alt5=3;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==13) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==14) ) {
                        alt5=2;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalSvgPath.g:347:5: kw= '+'
                            {
                            kw=(Token)match(input,13,FOLLOW_6); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getNumberAccess().getPlusSignKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSvgPath.g:353:5: kw= '-'
                            {
                            kw=(Token)match(input,14,FOLLOW_6); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getNumberAccess().getHyphenMinusKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalSvgPath.g:359:4: (this_INT_6= RULE_INT )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_INT) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalSvgPath.g:360:5: this_INT_6= RULE_INT
                            {
                            this_INT_6=(Token)match(input,RULE_INT,FOLLOW_7); 

                            					current.merge(this_INT_6);
                            				

                            					newLeafNode(this_INT_6, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1());
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,15,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_2());
                    			
                    this_INT_8=(Token)match(input,RULE_INT,FOLLOW_4); 

                    				current.merge(this_INT_8);
                    			

                    				newLeafNode(this_INT_8, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_3());
                    			
                    // InternalSvgPath.g:380:4: ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=11 && LA8_0<=12)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalSvgPath.g:381:5: (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger
                            {
                            // InternalSvgPath.g:381:5: (kw= 'E' | kw= 'e' )
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0==11) ) {
                                alt7=1;
                            }
                            else if ( (LA7_0==12) ) {
                                alt7=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 7, 0, input);

                                throw nvae;
                            }
                            switch (alt7) {
                                case 1 :
                                    // InternalSvgPath.g:382:6: kw= 'E'
                                    {
                                    kw=(Token)match(input,11,FOLLOW_5); 

                                    						current.merge(kw);
                                    						newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_1_4_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalSvgPath.g:388:6: kw= 'e'
                                    {
                                    kw=(Token)match(input,12,FOLLOW_5); 

                                    						current.merge(kw);
                                    						newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_1_4_0_1());
                                    					

                                    }
                                    break;

                            }


                            					newCompositeNode(grammarAccess.getNumberAccess().getIntegerParserRuleCall_1_4_1());
                            				
                            pushFollow(FOLLOW_2);
                            this_Integer_11=ruleInteger();

                            state._fsp--;


                            					current.merge(this_Integer_11);
                            				

                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }


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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleInteger"
    // InternalSvgPath.g:410:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalSvgPath.g:410:47: (iv_ruleInteger= ruleInteger EOF )
            // InternalSvgPath.g:411:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger.getText(); 
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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalSvgPath.g:417:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalSvgPath.g:423:2: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) )
            // InternalSvgPath.g:424:2: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            {
            // InternalSvgPath.g:424:2: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            // InternalSvgPath.g:425:3: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
            {
            // InternalSvgPath.g:425:3: (kw= '+' | kw= '-' )?
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            else if ( (LA10_0==14) ) {
                alt10=2;
            }
            switch (alt10) {
                case 1 :
                    // InternalSvgPath.g:426:4: kw= '+'
                    {
                    kw=(Token)match(input,13,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIntegerAccess().getPlusSignKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSvgPath.g:432:4: kw= '-'
                    {
                    kw=(Token)match(input,14,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0_1());
                    			

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleAbsoluteMoveTo"
    // InternalSvgPath.g:449:1: entryRuleAbsoluteMoveTo returns [EObject current=null] : iv_ruleAbsoluteMoveTo= ruleAbsoluteMoveTo EOF ;
    public final EObject entryRuleAbsoluteMoveTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteMoveTo = null;


        try {
            // InternalSvgPath.g:449:55: (iv_ruleAbsoluteMoveTo= ruleAbsoluteMoveTo EOF )
            // InternalSvgPath.g:450:2: iv_ruleAbsoluteMoveTo= ruleAbsoluteMoveTo EOF
            {
             newCompositeNode(grammarAccess.getAbsoluteMoveToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbsoluteMoveTo=ruleAbsoluteMoveTo();

            state._fsp--;

             current =iv_ruleAbsoluteMoveTo; 
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
    // $ANTLR end "entryRuleAbsoluteMoveTo"


    // $ANTLR start "ruleAbsoluteMoveTo"
    // InternalSvgPath.g:456:1: ruleAbsoluteMoveTo returns [EObject current=null] : (otherlv_0= 'M' ( (lv_x_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_y_3_0= ruleNumber ) ) ) ;
    public final EObject ruleAbsoluteMoveTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_x_1_0 = null;

        AntlrDatatypeRuleToken lv_y_3_0 = null;



        	enterRule();

        try {
            // InternalSvgPath.g:462:2: ( (otherlv_0= 'M' ( (lv_x_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_y_3_0= ruleNumber ) ) ) )
            // InternalSvgPath.g:463:2: (otherlv_0= 'M' ( (lv_x_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_y_3_0= ruleNumber ) ) )
            {
            // InternalSvgPath.g:463:2: (otherlv_0= 'M' ( (lv_x_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_y_3_0= ruleNumber ) ) )
            // InternalSvgPath.g:464:3: otherlv_0= 'M' ( (lv_x_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_y_3_0= ruleNumber ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAbsoluteMoveToAccess().getMKeyword_0());
            		
            // InternalSvgPath.g:468:3: ( (lv_x_1_0= ruleNumber ) )
            // InternalSvgPath.g:469:4: (lv_x_1_0= ruleNumber )
            {
            // InternalSvgPath.g:469:4: (lv_x_1_0= ruleNumber )
            // InternalSvgPath.g:470:5: lv_x_1_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getAbsoluteMoveToAccess().getXNumberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_x_1_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsoluteMoveToRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:487:3: (otherlv_2= ',' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSvgPath.g:488:4: otherlv_2= ','
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getAbsoluteMoveToAccess().getCommaKeyword_2());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:493:3: ( (lv_y_3_0= ruleNumber ) )
            // InternalSvgPath.g:494:4: (lv_y_3_0= ruleNumber )
            {
            // InternalSvgPath.g:494:4: (lv_y_3_0= ruleNumber )
            // InternalSvgPath.g:495:5: lv_y_3_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getAbsoluteMoveToAccess().getYNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_y_3_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsoluteMoveToRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_3_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleAbsoluteMoveTo"


    // $ANTLR start "entryRuleRelativeMoveTo"
    // InternalSvgPath.g:516:1: entryRuleRelativeMoveTo returns [EObject current=null] : iv_ruleRelativeMoveTo= ruleRelativeMoveTo EOF ;
    public final EObject entryRuleRelativeMoveTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeMoveTo = null;


        try {
            // InternalSvgPath.g:516:55: (iv_ruleRelativeMoveTo= ruleRelativeMoveTo EOF )
            // InternalSvgPath.g:517:2: iv_ruleRelativeMoveTo= ruleRelativeMoveTo EOF
            {
             newCompositeNode(grammarAccess.getRelativeMoveToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelativeMoveTo=ruleRelativeMoveTo();

            state._fsp--;

             current =iv_ruleRelativeMoveTo; 
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
    // $ANTLR end "entryRuleRelativeMoveTo"


    // $ANTLR start "ruleRelativeMoveTo"
    // InternalSvgPath.g:523:1: ruleRelativeMoveTo returns [EObject current=null] : (otherlv_0= 'm' ( (lv_dx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dy_3_0= ruleNumber ) ) ) ;
    public final EObject ruleRelativeMoveTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_dx_1_0 = null;

        AntlrDatatypeRuleToken lv_dy_3_0 = null;



        	enterRule();

        try {
            // InternalSvgPath.g:529:2: ( (otherlv_0= 'm' ( (lv_dx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dy_3_0= ruleNumber ) ) ) )
            // InternalSvgPath.g:530:2: (otherlv_0= 'm' ( (lv_dx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dy_3_0= ruleNumber ) ) )
            {
            // InternalSvgPath.g:530:2: (otherlv_0= 'm' ( (lv_dx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dy_3_0= ruleNumber ) ) )
            // InternalSvgPath.g:531:3: otherlv_0= 'm' ( (lv_dx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dy_3_0= ruleNumber ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRelativeMoveToAccess().getMKeyword_0());
            		
            // InternalSvgPath.g:535:3: ( (lv_dx_1_0= ruleNumber ) )
            // InternalSvgPath.g:536:4: (lv_dx_1_0= ruleNumber )
            {
            // InternalSvgPath.g:536:4: (lv_dx_1_0= ruleNumber )
            // InternalSvgPath.g:537:5: lv_dx_1_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getRelativeMoveToAccess().getDxNumberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_dx_1_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeMoveToRule());
            					}
            					set(
            						current,
            						"dx",
            						lv_dx_1_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:554:3: (otherlv_2= ',' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSvgPath.g:555:4: otherlv_2= ','
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getRelativeMoveToAccess().getCommaKeyword_2());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:560:3: ( (lv_dy_3_0= ruleNumber ) )
            // InternalSvgPath.g:561:4: (lv_dy_3_0= ruleNumber )
            {
            // InternalSvgPath.g:561:4: (lv_dy_3_0= ruleNumber )
            // InternalSvgPath.g:562:5: lv_dy_3_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getRelativeMoveToAccess().getDyNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_dy_3_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeMoveToRule());
            					}
            					set(
            						current,
            						"dy",
            						lv_dy_3_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleRelativeMoveTo"


    // $ANTLR start "entryRuleAbsoluteLineTo"
    // InternalSvgPath.g:583:1: entryRuleAbsoluteLineTo returns [EObject current=null] : iv_ruleAbsoluteLineTo= ruleAbsoluteLineTo EOF ;
    public final EObject entryRuleAbsoluteLineTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteLineTo = null;


        try {
            // InternalSvgPath.g:583:55: (iv_ruleAbsoluteLineTo= ruleAbsoluteLineTo EOF )
            // InternalSvgPath.g:584:2: iv_ruleAbsoluteLineTo= ruleAbsoluteLineTo EOF
            {
             newCompositeNode(grammarAccess.getAbsoluteLineToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbsoluteLineTo=ruleAbsoluteLineTo();

            state._fsp--;

             current =iv_ruleAbsoluteLineTo; 
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
    // $ANTLR end "entryRuleAbsoluteLineTo"


    // $ANTLR start "ruleAbsoluteLineTo"
    // InternalSvgPath.g:590:1: ruleAbsoluteLineTo returns [EObject current=null] : (otherlv_0= 'L' ( (lv_x_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_y_3_0= ruleNumber ) ) ) ;
    public final EObject ruleAbsoluteLineTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_x_1_0 = null;

        AntlrDatatypeRuleToken lv_y_3_0 = null;



        	enterRule();

        try {
            // InternalSvgPath.g:596:2: ( (otherlv_0= 'L' ( (lv_x_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_y_3_0= ruleNumber ) ) ) )
            // InternalSvgPath.g:597:2: (otherlv_0= 'L' ( (lv_x_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_y_3_0= ruleNumber ) ) )
            {
            // InternalSvgPath.g:597:2: (otherlv_0= 'L' ( (lv_x_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_y_3_0= ruleNumber ) ) )
            // InternalSvgPath.g:598:3: otherlv_0= 'L' ( (lv_x_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_y_3_0= ruleNumber ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAbsoluteLineToAccess().getLKeyword_0());
            		
            // InternalSvgPath.g:602:3: ( (lv_x_1_0= ruleNumber ) )
            // InternalSvgPath.g:603:4: (lv_x_1_0= ruleNumber )
            {
            // InternalSvgPath.g:603:4: (lv_x_1_0= ruleNumber )
            // InternalSvgPath.g:604:5: lv_x_1_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getAbsoluteLineToAccess().getXNumberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_x_1_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsoluteLineToRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:621:3: (otherlv_2= ',' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSvgPath.g:622:4: otherlv_2= ','
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getAbsoluteLineToAccess().getCommaKeyword_2());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:627:3: ( (lv_y_3_0= ruleNumber ) )
            // InternalSvgPath.g:628:4: (lv_y_3_0= ruleNumber )
            {
            // InternalSvgPath.g:628:4: (lv_y_3_0= ruleNumber )
            // InternalSvgPath.g:629:5: lv_y_3_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getAbsoluteLineToAccess().getYNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_y_3_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsoluteLineToRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_3_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleAbsoluteLineTo"


    // $ANTLR start "entryRuleRelativeLineTo"
    // InternalSvgPath.g:650:1: entryRuleRelativeLineTo returns [EObject current=null] : iv_ruleRelativeLineTo= ruleRelativeLineTo EOF ;
    public final EObject entryRuleRelativeLineTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeLineTo = null;


        try {
            // InternalSvgPath.g:650:55: (iv_ruleRelativeLineTo= ruleRelativeLineTo EOF )
            // InternalSvgPath.g:651:2: iv_ruleRelativeLineTo= ruleRelativeLineTo EOF
            {
             newCompositeNode(grammarAccess.getRelativeLineToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelativeLineTo=ruleRelativeLineTo();

            state._fsp--;

             current =iv_ruleRelativeLineTo; 
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
    // $ANTLR end "entryRuleRelativeLineTo"


    // $ANTLR start "ruleRelativeLineTo"
    // InternalSvgPath.g:657:1: ruleRelativeLineTo returns [EObject current=null] : (otherlv_0= 'l' ( (lv_dx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dy_3_0= ruleNumber ) ) ) ;
    public final EObject ruleRelativeLineTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_dx_1_0 = null;

        AntlrDatatypeRuleToken lv_dy_3_0 = null;



        	enterRule();

        try {
            // InternalSvgPath.g:663:2: ( (otherlv_0= 'l' ( (lv_dx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dy_3_0= ruleNumber ) ) ) )
            // InternalSvgPath.g:664:2: (otherlv_0= 'l' ( (lv_dx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dy_3_0= ruleNumber ) ) )
            {
            // InternalSvgPath.g:664:2: (otherlv_0= 'l' ( (lv_dx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dy_3_0= ruleNumber ) ) )
            // InternalSvgPath.g:665:3: otherlv_0= 'l' ( (lv_dx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dy_3_0= ruleNumber ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRelativeLineToAccess().getLKeyword_0());
            		
            // InternalSvgPath.g:669:3: ( (lv_dx_1_0= ruleNumber ) )
            // InternalSvgPath.g:670:4: (lv_dx_1_0= ruleNumber )
            {
            // InternalSvgPath.g:670:4: (lv_dx_1_0= ruleNumber )
            // InternalSvgPath.g:671:5: lv_dx_1_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getRelativeLineToAccess().getDxNumberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_dx_1_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeLineToRule());
            					}
            					set(
            						current,
            						"dx",
            						lv_dx_1_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:688:3: (otherlv_2= ',' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSvgPath.g:689:4: otherlv_2= ','
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getRelativeLineToAccess().getCommaKeyword_2());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:694:3: ( (lv_dy_3_0= ruleNumber ) )
            // InternalSvgPath.g:695:4: (lv_dy_3_0= ruleNumber )
            {
            // InternalSvgPath.g:695:4: (lv_dy_3_0= ruleNumber )
            // InternalSvgPath.g:696:5: lv_dy_3_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getRelativeLineToAccess().getDyNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_dy_3_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeLineToRule());
            					}
            					set(
            						current,
            						"dy",
            						lv_dy_3_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleRelativeLineTo"


    // $ANTLR start "entryRuleAbsoluteHorizontalLineTo"
    // InternalSvgPath.g:717:1: entryRuleAbsoluteHorizontalLineTo returns [EObject current=null] : iv_ruleAbsoluteHorizontalLineTo= ruleAbsoluteHorizontalLineTo EOF ;
    public final EObject entryRuleAbsoluteHorizontalLineTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteHorizontalLineTo = null;


        try {
            // InternalSvgPath.g:717:65: (iv_ruleAbsoluteHorizontalLineTo= ruleAbsoluteHorizontalLineTo EOF )
            // InternalSvgPath.g:718:2: iv_ruleAbsoluteHorizontalLineTo= ruleAbsoluteHorizontalLineTo EOF
            {
             newCompositeNode(grammarAccess.getAbsoluteHorizontalLineToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbsoluteHorizontalLineTo=ruleAbsoluteHorizontalLineTo();

            state._fsp--;

             current =iv_ruleAbsoluteHorizontalLineTo; 
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
    // $ANTLR end "entryRuleAbsoluteHorizontalLineTo"


    // $ANTLR start "ruleAbsoluteHorizontalLineTo"
    // InternalSvgPath.g:724:1: ruleAbsoluteHorizontalLineTo returns [EObject current=null] : (otherlv_0= 'H' ( (lv_x_1_0= ruleNumber ) ) ) ;
    public final EObject ruleAbsoluteHorizontalLineTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_x_1_0 = null;



        	enterRule();

        try {
            // InternalSvgPath.g:730:2: ( (otherlv_0= 'H' ( (lv_x_1_0= ruleNumber ) ) ) )
            // InternalSvgPath.g:731:2: (otherlv_0= 'H' ( (lv_x_1_0= ruleNumber ) ) )
            {
            // InternalSvgPath.g:731:2: (otherlv_0= 'H' ( (lv_x_1_0= ruleNumber ) ) )
            // InternalSvgPath.g:732:3: otherlv_0= 'H' ( (lv_x_1_0= ruleNumber ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAbsoluteHorizontalLineToAccess().getHKeyword_0());
            		
            // InternalSvgPath.g:736:3: ( (lv_x_1_0= ruleNumber ) )
            // InternalSvgPath.g:737:4: (lv_x_1_0= ruleNumber )
            {
            // InternalSvgPath.g:737:4: (lv_x_1_0= ruleNumber )
            // InternalSvgPath.g:738:5: lv_x_1_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getAbsoluteHorizontalLineToAccess().getXNumberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_x_1_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsoluteHorizontalLineToRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleAbsoluteHorizontalLineTo"


    // $ANTLR start "entryRuleRelativeHorizontalLineTo"
    // InternalSvgPath.g:759:1: entryRuleRelativeHorizontalLineTo returns [EObject current=null] : iv_ruleRelativeHorizontalLineTo= ruleRelativeHorizontalLineTo EOF ;
    public final EObject entryRuleRelativeHorizontalLineTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeHorizontalLineTo = null;


        try {
            // InternalSvgPath.g:759:65: (iv_ruleRelativeHorizontalLineTo= ruleRelativeHorizontalLineTo EOF )
            // InternalSvgPath.g:760:2: iv_ruleRelativeHorizontalLineTo= ruleRelativeHorizontalLineTo EOF
            {
             newCompositeNode(grammarAccess.getRelativeHorizontalLineToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelativeHorizontalLineTo=ruleRelativeHorizontalLineTo();

            state._fsp--;

             current =iv_ruleRelativeHorizontalLineTo; 
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
    // $ANTLR end "entryRuleRelativeHorizontalLineTo"


    // $ANTLR start "ruleRelativeHorizontalLineTo"
    // InternalSvgPath.g:766:1: ruleRelativeHorizontalLineTo returns [EObject current=null] : (otherlv_0= 'h' ( (lv_dx_1_0= ruleNumber ) ) ) ;
    public final EObject ruleRelativeHorizontalLineTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_dx_1_0 = null;



        	enterRule();

        try {
            // InternalSvgPath.g:772:2: ( (otherlv_0= 'h' ( (lv_dx_1_0= ruleNumber ) ) ) )
            // InternalSvgPath.g:773:2: (otherlv_0= 'h' ( (lv_dx_1_0= ruleNumber ) ) )
            {
            // InternalSvgPath.g:773:2: (otherlv_0= 'h' ( (lv_dx_1_0= ruleNumber ) ) )
            // InternalSvgPath.g:774:3: otherlv_0= 'h' ( (lv_dx_1_0= ruleNumber ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRelativeHorizontalLineToAccess().getHKeyword_0());
            		
            // InternalSvgPath.g:778:3: ( (lv_dx_1_0= ruleNumber ) )
            // InternalSvgPath.g:779:4: (lv_dx_1_0= ruleNumber )
            {
            // InternalSvgPath.g:779:4: (lv_dx_1_0= ruleNumber )
            // InternalSvgPath.g:780:5: lv_dx_1_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getRelativeHorizontalLineToAccess().getDxNumberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_dx_1_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeHorizontalLineToRule());
            					}
            					set(
            						current,
            						"dx",
            						lv_dx_1_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleRelativeHorizontalLineTo"


    // $ANTLR start "entryRuleAbsoluteVerticalLineTo"
    // InternalSvgPath.g:801:1: entryRuleAbsoluteVerticalLineTo returns [EObject current=null] : iv_ruleAbsoluteVerticalLineTo= ruleAbsoluteVerticalLineTo EOF ;
    public final EObject entryRuleAbsoluteVerticalLineTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteVerticalLineTo = null;


        try {
            // InternalSvgPath.g:801:63: (iv_ruleAbsoluteVerticalLineTo= ruleAbsoluteVerticalLineTo EOF )
            // InternalSvgPath.g:802:2: iv_ruleAbsoluteVerticalLineTo= ruleAbsoluteVerticalLineTo EOF
            {
             newCompositeNode(grammarAccess.getAbsoluteVerticalLineToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbsoluteVerticalLineTo=ruleAbsoluteVerticalLineTo();

            state._fsp--;

             current =iv_ruleAbsoluteVerticalLineTo; 
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
    // $ANTLR end "entryRuleAbsoluteVerticalLineTo"


    // $ANTLR start "ruleAbsoluteVerticalLineTo"
    // InternalSvgPath.g:808:1: ruleAbsoluteVerticalLineTo returns [EObject current=null] : (otherlv_0= 'V' ( (lv_y_1_0= ruleNumber ) ) ) ;
    public final EObject ruleAbsoluteVerticalLineTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_y_1_0 = null;



        	enterRule();

        try {
            // InternalSvgPath.g:814:2: ( (otherlv_0= 'V' ( (lv_y_1_0= ruleNumber ) ) ) )
            // InternalSvgPath.g:815:2: (otherlv_0= 'V' ( (lv_y_1_0= ruleNumber ) ) )
            {
            // InternalSvgPath.g:815:2: (otherlv_0= 'V' ( (lv_y_1_0= ruleNumber ) ) )
            // InternalSvgPath.g:816:3: otherlv_0= 'V' ( (lv_y_1_0= ruleNumber ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAbsoluteVerticalLineToAccess().getVKeyword_0());
            		
            // InternalSvgPath.g:820:3: ( (lv_y_1_0= ruleNumber ) )
            // InternalSvgPath.g:821:4: (lv_y_1_0= ruleNumber )
            {
            // InternalSvgPath.g:821:4: (lv_y_1_0= ruleNumber )
            // InternalSvgPath.g:822:5: lv_y_1_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getAbsoluteVerticalLineToAccess().getYNumberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_y_1_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsoluteVerticalLineToRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_1_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleAbsoluteVerticalLineTo"


    // $ANTLR start "entryRuleRelativeVerticalLineTo"
    // InternalSvgPath.g:843:1: entryRuleRelativeVerticalLineTo returns [EObject current=null] : iv_ruleRelativeVerticalLineTo= ruleRelativeVerticalLineTo EOF ;
    public final EObject entryRuleRelativeVerticalLineTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeVerticalLineTo = null;


        try {
            // InternalSvgPath.g:843:63: (iv_ruleRelativeVerticalLineTo= ruleRelativeVerticalLineTo EOF )
            // InternalSvgPath.g:844:2: iv_ruleRelativeVerticalLineTo= ruleRelativeVerticalLineTo EOF
            {
             newCompositeNode(grammarAccess.getRelativeVerticalLineToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelativeVerticalLineTo=ruleRelativeVerticalLineTo();

            state._fsp--;

             current =iv_ruleRelativeVerticalLineTo; 
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
    // $ANTLR end "entryRuleRelativeVerticalLineTo"


    // $ANTLR start "ruleRelativeVerticalLineTo"
    // InternalSvgPath.g:850:1: ruleRelativeVerticalLineTo returns [EObject current=null] : (otherlv_0= 'v' ( (lv_dy_1_0= ruleNumber ) ) ) ;
    public final EObject ruleRelativeVerticalLineTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_dy_1_0 = null;



        	enterRule();

        try {
            // InternalSvgPath.g:856:2: ( (otherlv_0= 'v' ( (lv_dy_1_0= ruleNumber ) ) ) )
            // InternalSvgPath.g:857:2: (otherlv_0= 'v' ( (lv_dy_1_0= ruleNumber ) ) )
            {
            // InternalSvgPath.g:857:2: (otherlv_0= 'v' ( (lv_dy_1_0= ruleNumber ) ) )
            // InternalSvgPath.g:858:3: otherlv_0= 'v' ( (lv_dy_1_0= ruleNumber ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRelativeVerticalLineToAccess().getVKeyword_0());
            		
            // InternalSvgPath.g:862:3: ( (lv_dy_1_0= ruleNumber ) )
            // InternalSvgPath.g:863:4: (lv_dy_1_0= ruleNumber )
            {
            // InternalSvgPath.g:863:4: (lv_dy_1_0= ruleNumber )
            // InternalSvgPath.g:864:5: lv_dy_1_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getRelativeVerticalLineToAccess().getDyNumberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_dy_1_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeVerticalLineToRule());
            					}
            					set(
            						current,
            						"dy",
            						lv_dy_1_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleRelativeVerticalLineTo"


    // $ANTLR start "entryRuleAbsoluteQuadraticCurveTo"
    // InternalSvgPath.g:885:1: entryRuleAbsoluteQuadraticCurveTo returns [EObject current=null] : iv_ruleAbsoluteQuadraticCurveTo= ruleAbsoluteQuadraticCurveTo EOF ;
    public final EObject entryRuleAbsoluteQuadraticCurveTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteQuadraticCurveTo = null;


        try {
            // InternalSvgPath.g:885:65: (iv_ruleAbsoluteQuadraticCurveTo= ruleAbsoluteQuadraticCurveTo EOF )
            // InternalSvgPath.g:886:2: iv_ruleAbsoluteQuadraticCurveTo= ruleAbsoluteQuadraticCurveTo EOF
            {
             newCompositeNode(grammarAccess.getAbsoluteQuadraticCurveToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbsoluteQuadraticCurveTo=ruleAbsoluteQuadraticCurveTo();

            state._fsp--;

             current =iv_ruleAbsoluteQuadraticCurveTo; 
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
    // $ANTLR end "entryRuleAbsoluteQuadraticCurveTo"


    // $ANTLR start "ruleAbsoluteQuadraticCurveTo"
    // InternalSvgPath.g:892:1: ruleAbsoluteQuadraticCurveTo returns [EObject current=null] : (otherlv_0= 'Q' ( (lv_cx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_cy_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_x_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_y_7_0= ruleNumber ) ) ) ;
    public final EObject ruleAbsoluteQuadraticCurveTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_cx_1_0 = null;

        AntlrDatatypeRuleToken lv_cy_3_0 = null;

        AntlrDatatypeRuleToken lv_x_5_0 = null;

        AntlrDatatypeRuleToken lv_y_7_0 = null;



        	enterRule();

        try {
            // InternalSvgPath.g:898:2: ( (otherlv_0= 'Q' ( (lv_cx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_cy_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_x_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_y_7_0= ruleNumber ) ) ) )
            // InternalSvgPath.g:899:2: (otherlv_0= 'Q' ( (lv_cx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_cy_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_x_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_y_7_0= ruleNumber ) ) )
            {
            // InternalSvgPath.g:899:2: (otherlv_0= 'Q' ( (lv_cx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_cy_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_x_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_y_7_0= ruleNumber ) ) )
            // InternalSvgPath.g:900:3: otherlv_0= 'Q' ( (lv_cx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_cy_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_x_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_y_7_0= ruleNumber ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAbsoluteQuadraticCurveToAccess().getQKeyword_0());
            		
            // InternalSvgPath.g:904:3: ( (lv_cx_1_0= ruleNumber ) )
            // InternalSvgPath.g:905:4: (lv_cx_1_0= ruleNumber )
            {
            // InternalSvgPath.g:905:4: (lv_cx_1_0= ruleNumber )
            // InternalSvgPath.g:906:5: lv_cx_1_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getAbsoluteQuadraticCurveToAccess().getCxNumberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_cx_1_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsoluteQuadraticCurveToRule());
            					}
            					set(
            						current,
            						"cx",
            						lv_cx_1_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:923:3: (otherlv_2= ',' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSvgPath.g:924:4: otherlv_2= ','
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getAbsoluteQuadraticCurveToAccess().getCommaKeyword_2());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:929:3: ( (lv_cy_3_0= ruleNumber ) )
            // InternalSvgPath.g:930:4: (lv_cy_3_0= ruleNumber )
            {
            // InternalSvgPath.g:930:4: (lv_cy_3_0= ruleNumber )
            // InternalSvgPath.g:931:5: lv_cy_3_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getAbsoluteQuadraticCurveToAccess().getCyNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_cy_3_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsoluteQuadraticCurveToRule());
            					}
            					set(
            						current,
            						"cy",
            						lv_cy_3_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:948:3: (otherlv_4= ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSvgPath.g:949:4: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getAbsoluteQuadraticCurveToAccess().getCommaKeyword_4());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:954:3: ( (lv_x_5_0= ruleNumber ) )
            // InternalSvgPath.g:955:4: (lv_x_5_0= ruleNumber )
            {
            // InternalSvgPath.g:955:4: (lv_x_5_0= ruleNumber )
            // InternalSvgPath.g:956:5: lv_x_5_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getAbsoluteQuadraticCurveToAccess().getXNumberParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_x_5_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsoluteQuadraticCurveToRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_5_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:973:3: (otherlv_6= ',' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSvgPath.g:974:4: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getAbsoluteQuadraticCurveToAccess().getCommaKeyword_6());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:979:3: ( (lv_y_7_0= ruleNumber ) )
            // InternalSvgPath.g:980:4: (lv_y_7_0= ruleNumber )
            {
            // InternalSvgPath.g:980:4: (lv_y_7_0= ruleNumber )
            // InternalSvgPath.g:981:5: lv_y_7_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getAbsoluteQuadraticCurveToAccess().getYNumberParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_y_7_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsoluteQuadraticCurveToRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_7_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleAbsoluteQuadraticCurveTo"


    // $ANTLR start "entryRuleRelativeQuadraticCurveTo"
    // InternalSvgPath.g:1002:1: entryRuleRelativeQuadraticCurveTo returns [EObject current=null] : iv_ruleRelativeQuadraticCurveTo= ruleRelativeQuadraticCurveTo EOF ;
    public final EObject entryRuleRelativeQuadraticCurveTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeQuadraticCurveTo = null;


        try {
            // InternalSvgPath.g:1002:65: (iv_ruleRelativeQuadraticCurveTo= ruleRelativeQuadraticCurveTo EOF )
            // InternalSvgPath.g:1003:2: iv_ruleRelativeQuadraticCurveTo= ruleRelativeQuadraticCurveTo EOF
            {
             newCompositeNode(grammarAccess.getRelativeQuadraticCurveToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelativeQuadraticCurveTo=ruleRelativeQuadraticCurveTo();

            state._fsp--;

             current =iv_ruleRelativeQuadraticCurveTo; 
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
    // $ANTLR end "entryRuleRelativeQuadraticCurveTo"


    // $ANTLR start "ruleRelativeQuadraticCurveTo"
    // InternalSvgPath.g:1009:1: ruleRelativeQuadraticCurveTo returns [EObject current=null] : (otherlv_0= 'q' ( (lv_dcx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dcy_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_dx_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_dy_7_0= ruleNumber ) ) ) ;
    public final EObject ruleRelativeQuadraticCurveTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_dcx_1_0 = null;

        AntlrDatatypeRuleToken lv_dcy_3_0 = null;

        AntlrDatatypeRuleToken lv_dx_5_0 = null;

        AntlrDatatypeRuleToken lv_dy_7_0 = null;



        	enterRule();

        try {
            // InternalSvgPath.g:1015:2: ( (otherlv_0= 'q' ( (lv_dcx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dcy_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_dx_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_dy_7_0= ruleNumber ) ) ) )
            // InternalSvgPath.g:1016:2: (otherlv_0= 'q' ( (lv_dcx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dcy_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_dx_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_dy_7_0= ruleNumber ) ) )
            {
            // InternalSvgPath.g:1016:2: (otherlv_0= 'q' ( (lv_dcx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dcy_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_dx_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_dy_7_0= ruleNumber ) ) )
            // InternalSvgPath.g:1017:3: otherlv_0= 'q' ( (lv_dcx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dcy_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_dx_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_dy_7_0= ruleNumber ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRelativeQuadraticCurveToAccess().getQKeyword_0());
            		
            // InternalSvgPath.g:1021:3: ( (lv_dcx_1_0= ruleNumber ) )
            // InternalSvgPath.g:1022:4: (lv_dcx_1_0= ruleNumber )
            {
            // InternalSvgPath.g:1022:4: (lv_dcx_1_0= ruleNumber )
            // InternalSvgPath.g:1023:5: lv_dcx_1_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getRelativeQuadraticCurveToAccess().getDcxNumberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_dcx_1_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeQuadraticCurveToRule());
            					}
            					set(
            						current,
            						"dcx",
            						lv_dcx_1_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:1040:3: (otherlv_2= ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSvgPath.g:1041:4: otherlv_2= ','
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getRelativeQuadraticCurveToAccess().getCommaKeyword_2());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:1046:3: ( (lv_dcy_3_0= ruleNumber ) )
            // InternalSvgPath.g:1047:4: (lv_dcy_3_0= ruleNumber )
            {
            // InternalSvgPath.g:1047:4: (lv_dcy_3_0= ruleNumber )
            // InternalSvgPath.g:1048:5: lv_dcy_3_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getRelativeQuadraticCurveToAccess().getDcyNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_dcy_3_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeQuadraticCurveToRule());
            					}
            					set(
            						current,
            						"dcy",
            						lv_dcy_3_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:1065:3: (otherlv_4= ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSvgPath.g:1066:4: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelativeQuadraticCurveToAccess().getCommaKeyword_4());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:1071:3: ( (lv_dx_5_0= ruleNumber ) )
            // InternalSvgPath.g:1072:4: (lv_dx_5_0= ruleNumber )
            {
            // InternalSvgPath.g:1072:4: (lv_dx_5_0= ruleNumber )
            // InternalSvgPath.g:1073:5: lv_dx_5_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getRelativeQuadraticCurveToAccess().getDxNumberParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_dx_5_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeQuadraticCurveToRule());
            					}
            					set(
            						current,
            						"dx",
            						lv_dx_5_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:1090:3: (otherlv_6= ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==17) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSvgPath.g:1091:4: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelativeQuadraticCurveToAccess().getCommaKeyword_6());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:1096:3: ( (lv_dy_7_0= ruleNumber ) )
            // InternalSvgPath.g:1097:4: (lv_dy_7_0= ruleNumber )
            {
            // InternalSvgPath.g:1097:4: (lv_dy_7_0= ruleNumber )
            // InternalSvgPath.g:1098:5: lv_dy_7_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getRelativeQuadraticCurveToAccess().getDyNumberParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_dy_7_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeQuadraticCurveToRule());
            					}
            					set(
            						current,
            						"dy",
            						lv_dy_7_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleRelativeQuadraticCurveTo"


    // $ANTLR start "entryRuleAbsoluteCubicCurveTo"
    // InternalSvgPath.g:1119:1: entryRuleAbsoluteCubicCurveTo returns [EObject current=null] : iv_ruleAbsoluteCubicCurveTo= ruleAbsoluteCubicCurveTo EOF ;
    public final EObject entryRuleAbsoluteCubicCurveTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteCubicCurveTo = null;


        try {
            // InternalSvgPath.g:1119:61: (iv_ruleAbsoluteCubicCurveTo= ruleAbsoluteCubicCurveTo EOF )
            // InternalSvgPath.g:1120:2: iv_ruleAbsoluteCubicCurveTo= ruleAbsoluteCubicCurveTo EOF
            {
             newCompositeNode(grammarAccess.getAbsoluteCubicCurveToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbsoluteCubicCurveTo=ruleAbsoluteCubicCurveTo();

            state._fsp--;

             current =iv_ruleAbsoluteCubicCurveTo; 
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
    // $ANTLR end "entryRuleAbsoluteCubicCurveTo"


    // $ANTLR start "ruleAbsoluteCubicCurveTo"
    // InternalSvgPath.g:1126:1: ruleAbsoluteCubicCurveTo returns [EObject current=null] : (otherlv_0= 'C' ( (lv_c1x_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_c1y_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_c2x_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_c2y_7_0= ruleNumber ) ) (otherlv_8= ',' )? ( (lv_x_9_0= ruleNumber ) ) (otherlv_10= ',' )? ( (lv_y_11_0= ruleNumber ) ) ) ;
    public final EObject ruleAbsoluteCubicCurveTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_c1x_1_0 = null;

        AntlrDatatypeRuleToken lv_c1y_3_0 = null;

        AntlrDatatypeRuleToken lv_c2x_5_0 = null;

        AntlrDatatypeRuleToken lv_c2y_7_0 = null;

        AntlrDatatypeRuleToken lv_x_9_0 = null;

        AntlrDatatypeRuleToken lv_y_11_0 = null;



        	enterRule();

        try {
            // InternalSvgPath.g:1132:2: ( (otherlv_0= 'C' ( (lv_c1x_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_c1y_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_c2x_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_c2y_7_0= ruleNumber ) ) (otherlv_8= ',' )? ( (lv_x_9_0= ruleNumber ) ) (otherlv_10= ',' )? ( (lv_y_11_0= ruleNumber ) ) ) )
            // InternalSvgPath.g:1133:2: (otherlv_0= 'C' ( (lv_c1x_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_c1y_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_c2x_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_c2y_7_0= ruleNumber ) ) (otherlv_8= ',' )? ( (lv_x_9_0= ruleNumber ) ) (otherlv_10= ',' )? ( (lv_y_11_0= ruleNumber ) ) )
            {
            // InternalSvgPath.g:1133:2: (otherlv_0= 'C' ( (lv_c1x_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_c1y_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_c2x_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_c2y_7_0= ruleNumber ) ) (otherlv_8= ',' )? ( (lv_x_9_0= ruleNumber ) ) (otherlv_10= ',' )? ( (lv_y_11_0= ruleNumber ) ) )
            // InternalSvgPath.g:1134:3: otherlv_0= 'C' ( (lv_c1x_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_c1y_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_c2x_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_c2y_7_0= ruleNumber ) ) (otherlv_8= ',' )? ( (lv_x_9_0= ruleNumber ) ) (otherlv_10= ',' )? ( (lv_y_11_0= ruleNumber ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAbsoluteCubicCurveToAccess().getCKeyword_0());
            		
            // InternalSvgPath.g:1138:3: ( (lv_c1x_1_0= ruleNumber ) )
            // InternalSvgPath.g:1139:4: (lv_c1x_1_0= ruleNumber )
            {
            // InternalSvgPath.g:1139:4: (lv_c1x_1_0= ruleNumber )
            // InternalSvgPath.g:1140:5: lv_c1x_1_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getAbsoluteCubicCurveToAccess().getC1xNumberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_c1x_1_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsoluteCubicCurveToRule());
            					}
            					set(
            						current,
            						"c1x",
            						lv_c1x_1_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:1157:3: (otherlv_2= ',' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSvgPath.g:1158:4: otherlv_2= ','
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getAbsoluteCubicCurveToAccess().getCommaKeyword_2());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:1163:3: ( (lv_c1y_3_0= ruleNumber ) )
            // InternalSvgPath.g:1164:4: (lv_c1y_3_0= ruleNumber )
            {
            // InternalSvgPath.g:1164:4: (lv_c1y_3_0= ruleNumber )
            // InternalSvgPath.g:1165:5: lv_c1y_3_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getAbsoluteCubicCurveToAccess().getC1yNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_c1y_3_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsoluteCubicCurveToRule());
            					}
            					set(
            						current,
            						"c1y",
            						lv_c1y_3_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:1182:3: (otherlv_4= ',' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSvgPath.g:1183:4: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getAbsoluteCubicCurveToAccess().getCommaKeyword_4());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:1188:3: ( (lv_c2x_5_0= ruleNumber ) )
            // InternalSvgPath.g:1189:4: (lv_c2x_5_0= ruleNumber )
            {
            // InternalSvgPath.g:1189:4: (lv_c2x_5_0= ruleNumber )
            // InternalSvgPath.g:1190:5: lv_c2x_5_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getAbsoluteCubicCurveToAccess().getC2xNumberParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_c2x_5_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsoluteCubicCurveToRule());
            					}
            					set(
            						current,
            						"c2x",
            						lv_c2x_5_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:1207:3: (otherlv_6= ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSvgPath.g:1208:4: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getAbsoluteCubicCurveToAccess().getCommaKeyword_6());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:1213:3: ( (lv_c2y_7_0= ruleNumber ) )
            // InternalSvgPath.g:1214:4: (lv_c2y_7_0= ruleNumber )
            {
            // InternalSvgPath.g:1214:4: (lv_c2y_7_0= ruleNumber )
            // InternalSvgPath.g:1215:5: lv_c2y_7_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getAbsoluteCubicCurveToAccess().getC2yNumberParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_c2y_7_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsoluteCubicCurveToRule());
            					}
            					set(
            						current,
            						"c2y",
            						lv_c2y_7_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:1232:3: (otherlv_8= ',' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==17) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSvgPath.g:1233:4: otherlv_8= ','
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getAbsoluteCubicCurveToAccess().getCommaKeyword_8());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:1238:3: ( (lv_x_9_0= ruleNumber ) )
            // InternalSvgPath.g:1239:4: (lv_x_9_0= ruleNumber )
            {
            // InternalSvgPath.g:1239:4: (lv_x_9_0= ruleNumber )
            // InternalSvgPath.g:1240:5: lv_x_9_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getAbsoluteCubicCurveToAccess().getXNumberParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_x_9_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsoluteCubicCurveToRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_9_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:1257:3: (otherlv_10= ',' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==17) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSvgPath.g:1258:4: otherlv_10= ','
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getAbsoluteCubicCurveToAccess().getCommaKeyword_10());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:1263:3: ( (lv_y_11_0= ruleNumber ) )
            // InternalSvgPath.g:1264:4: (lv_y_11_0= ruleNumber )
            {
            // InternalSvgPath.g:1264:4: (lv_y_11_0= ruleNumber )
            // InternalSvgPath.g:1265:5: lv_y_11_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getAbsoluteCubicCurveToAccess().getYNumberParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_2);
            lv_y_11_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsoluteCubicCurveToRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_11_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleAbsoluteCubicCurveTo"


    // $ANTLR start "entryRuleRelativeCubicCurveTo"
    // InternalSvgPath.g:1286:1: entryRuleRelativeCubicCurveTo returns [EObject current=null] : iv_ruleRelativeCubicCurveTo= ruleRelativeCubicCurveTo EOF ;
    public final EObject entryRuleRelativeCubicCurveTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeCubicCurveTo = null;


        try {
            // InternalSvgPath.g:1286:61: (iv_ruleRelativeCubicCurveTo= ruleRelativeCubicCurveTo EOF )
            // InternalSvgPath.g:1287:2: iv_ruleRelativeCubicCurveTo= ruleRelativeCubicCurveTo EOF
            {
             newCompositeNode(grammarAccess.getRelativeCubicCurveToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelativeCubicCurveTo=ruleRelativeCubicCurveTo();

            state._fsp--;

             current =iv_ruleRelativeCubicCurveTo; 
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
    // $ANTLR end "entryRuleRelativeCubicCurveTo"


    // $ANTLR start "ruleRelativeCubicCurveTo"
    // InternalSvgPath.g:1293:1: ruleRelativeCubicCurveTo returns [EObject current=null] : (otherlv_0= 'c' ( (lv_dc1x_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dc1y_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_dc2x_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_dc2y_7_0= ruleNumber ) ) (otherlv_8= ',' )? ( (lv_dx_9_0= ruleNumber ) ) (otherlv_10= ',' )? ( (lv_dy_11_0= ruleNumber ) ) ) ;
    public final EObject ruleRelativeCubicCurveTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_dc1x_1_0 = null;

        AntlrDatatypeRuleToken lv_dc1y_3_0 = null;

        AntlrDatatypeRuleToken lv_dc2x_5_0 = null;

        AntlrDatatypeRuleToken lv_dc2y_7_0 = null;

        AntlrDatatypeRuleToken lv_dx_9_0 = null;

        AntlrDatatypeRuleToken lv_dy_11_0 = null;



        	enterRule();

        try {
            // InternalSvgPath.g:1299:2: ( (otherlv_0= 'c' ( (lv_dc1x_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dc1y_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_dc2x_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_dc2y_7_0= ruleNumber ) ) (otherlv_8= ',' )? ( (lv_dx_9_0= ruleNumber ) ) (otherlv_10= ',' )? ( (lv_dy_11_0= ruleNumber ) ) ) )
            // InternalSvgPath.g:1300:2: (otherlv_0= 'c' ( (lv_dc1x_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dc1y_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_dc2x_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_dc2y_7_0= ruleNumber ) ) (otherlv_8= ',' )? ( (lv_dx_9_0= ruleNumber ) ) (otherlv_10= ',' )? ( (lv_dy_11_0= ruleNumber ) ) )
            {
            // InternalSvgPath.g:1300:2: (otherlv_0= 'c' ( (lv_dc1x_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dc1y_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_dc2x_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_dc2y_7_0= ruleNumber ) ) (otherlv_8= ',' )? ( (lv_dx_9_0= ruleNumber ) ) (otherlv_10= ',' )? ( (lv_dy_11_0= ruleNumber ) ) )
            // InternalSvgPath.g:1301:3: otherlv_0= 'c' ( (lv_dc1x_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dc1y_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_dc2x_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_dc2y_7_0= ruleNumber ) ) (otherlv_8= ',' )? ( (lv_dx_9_0= ruleNumber ) ) (otherlv_10= ',' )? ( (lv_dy_11_0= ruleNumber ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRelativeCubicCurveToAccess().getCKeyword_0());
            		
            // InternalSvgPath.g:1305:3: ( (lv_dc1x_1_0= ruleNumber ) )
            // InternalSvgPath.g:1306:4: (lv_dc1x_1_0= ruleNumber )
            {
            // InternalSvgPath.g:1306:4: (lv_dc1x_1_0= ruleNumber )
            // InternalSvgPath.g:1307:5: lv_dc1x_1_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getRelativeCubicCurveToAccess().getDc1xNumberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_dc1x_1_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeCubicCurveToRule());
            					}
            					set(
            						current,
            						"dc1x",
            						lv_dc1x_1_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:1324:3: (otherlv_2= ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==17) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSvgPath.g:1325:4: otherlv_2= ','
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getRelativeCubicCurveToAccess().getCommaKeyword_2());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:1330:3: ( (lv_dc1y_3_0= ruleNumber ) )
            // InternalSvgPath.g:1331:4: (lv_dc1y_3_0= ruleNumber )
            {
            // InternalSvgPath.g:1331:4: (lv_dc1y_3_0= ruleNumber )
            // InternalSvgPath.g:1332:5: lv_dc1y_3_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getRelativeCubicCurveToAccess().getDc1yNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_dc1y_3_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeCubicCurveToRule());
            					}
            					set(
            						current,
            						"dc1y",
            						lv_dc1y_3_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:1349:3: (otherlv_4= ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==17) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSvgPath.g:1350:4: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelativeCubicCurveToAccess().getCommaKeyword_4());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:1355:3: ( (lv_dc2x_5_0= ruleNumber ) )
            // InternalSvgPath.g:1356:4: (lv_dc2x_5_0= ruleNumber )
            {
            // InternalSvgPath.g:1356:4: (lv_dc2x_5_0= ruleNumber )
            // InternalSvgPath.g:1357:5: lv_dc2x_5_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getRelativeCubicCurveToAccess().getDc2xNumberParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_dc2x_5_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeCubicCurveToRule());
            					}
            					set(
            						current,
            						"dc2x",
            						lv_dc2x_5_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:1374:3: (otherlv_6= ',' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==17) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSvgPath.g:1375:4: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelativeCubicCurveToAccess().getCommaKeyword_6());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:1380:3: ( (lv_dc2y_7_0= ruleNumber ) )
            // InternalSvgPath.g:1381:4: (lv_dc2y_7_0= ruleNumber )
            {
            // InternalSvgPath.g:1381:4: (lv_dc2y_7_0= ruleNumber )
            // InternalSvgPath.g:1382:5: lv_dc2y_7_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getRelativeCubicCurveToAccess().getDc2yNumberParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_dc2y_7_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeCubicCurveToRule());
            					}
            					set(
            						current,
            						"dc2y",
            						lv_dc2y_7_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:1399:3: (otherlv_8= ',' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==17) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSvgPath.g:1400:4: otherlv_8= ','
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getRelativeCubicCurveToAccess().getCommaKeyword_8());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:1405:3: ( (lv_dx_9_0= ruleNumber ) )
            // InternalSvgPath.g:1406:4: (lv_dx_9_0= ruleNumber )
            {
            // InternalSvgPath.g:1406:4: (lv_dx_9_0= ruleNumber )
            // InternalSvgPath.g:1407:5: lv_dx_9_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getRelativeCubicCurveToAccess().getDxNumberParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_dx_9_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeCubicCurveToRule());
            					}
            					set(
            						current,
            						"dx",
            						lv_dx_9_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:1424:3: (otherlv_10= ',' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==17) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSvgPath.g:1425:4: otherlv_10= ','
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getRelativeCubicCurveToAccess().getCommaKeyword_10());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:1430:3: ( (lv_dy_11_0= ruleNumber ) )
            // InternalSvgPath.g:1431:4: (lv_dy_11_0= ruleNumber )
            {
            // InternalSvgPath.g:1431:4: (lv_dy_11_0= ruleNumber )
            // InternalSvgPath.g:1432:5: lv_dy_11_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getRelativeCubicCurveToAccess().getDyNumberParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_2);
            lv_dy_11_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeCubicCurveToRule());
            					}
            					set(
            						current,
            						"dy",
            						lv_dy_11_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleRelativeCubicCurveTo"


    // $ANTLR start "entryRuleAbsoluteSmoothQuadraticCurveTo"
    // InternalSvgPath.g:1453:1: entryRuleAbsoluteSmoothQuadraticCurveTo returns [EObject current=null] : iv_ruleAbsoluteSmoothQuadraticCurveTo= ruleAbsoluteSmoothQuadraticCurveTo EOF ;
    public final EObject entryRuleAbsoluteSmoothQuadraticCurveTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteSmoothQuadraticCurveTo = null;


        try {
            // InternalSvgPath.g:1453:71: (iv_ruleAbsoluteSmoothQuadraticCurveTo= ruleAbsoluteSmoothQuadraticCurveTo EOF )
            // InternalSvgPath.g:1454:2: iv_ruleAbsoluteSmoothQuadraticCurveTo= ruleAbsoluteSmoothQuadraticCurveTo EOF
            {
             newCompositeNode(grammarAccess.getAbsoluteSmoothQuadraticCurveToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbsoluteSmoothQuadraticCurveTo=ruleAbsoluteSmoothQuadraticCurveTo();

            state._fsp--;

             current =iv_ruleAbsoluteSmoothQuadraticCurveTo; 
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
    // $ANTLR end "entryRuleAbsoluteSmoothQuadraticCurveTo"


    // $ANTLR start "ruleAbsoluteSmoothQuadraticCurveTo"
    // InternalSvgPath.g:1460:1: ruleAbsoluteSmoothQuadraticCurveTo returns [EObject current=null] : (otherlv_0= 'T' ( (lv_x_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_y_3_0= ruleNumber ) ) ) ;
    public final EObject ruleAbsoluteSmoothQuadraticCurveTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_x_1_0 = null;

        AntlrDatatypeRuleToken lv_y_3_0 = null;



        	enterRule();

        try {
            // InternalSvgPath.g:1466:2: ( (otherlv_0= 'T' ( (lv_x_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_y_3_0= ruleNumber ) ) ) )
            // InternalSvgPath.g:1467:2: (otherlv_0= 'T' ( (lv_x_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_y_3_0= ruleNumber ) ) )
            {
            // InternalSvgPath.g:1467:2: (otherlv_0= 'T' ( (lv_x_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_y_3_0= ruleNumber ) ) )
            // InternalSvgPath.g:1468:3: otherlv_0= 'T' ( (lv_x_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_y_3_0= ruleNumber ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAbsoluteSmoothQuadraticCurveToAccess().getTKeyword_0());
            		
            // InternalSvgPath.g:1472:3: ( (lv_x_1_0= ruleNumber ) )
            // InternalSvgPath.g:1473:4: (lv_x_1_0= ruleNumber )
            {
            // InternalSvgPath.g:1473:4: (lv_x_1_0= ruleNumber )
            // InternalSvgPath.g:1474:5: lv_x_1_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getAbsoluteSmoothQuadraticCurveToAccess().getXNumberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_x_1_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsoluteSmoothQuadraticCurveToRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:1491:3: (otherlv_2= ',' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==17) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSvgPath.g:1492:4: otherlv_2= ','
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getAbsoluteSmoothQuadraticCurveToAccess().getCommaKeyword_2());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:1497:3: ( (lv_y_3_0= ruleNumber ) )
            // InternalSvgPath.g:1498:4: (lv_y_3_0= ruleNumber )
            {
            // InternalSvgPath.g:1498:4: (lv_y_3_0= ruleNumber )
            // InternalSvgPath.g:1499:5: lv_y_3_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getAbsoluteSmoothQuadraticCurveToAccess().getYNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_y_3_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsoluteSmoothQuadraticCurveToRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_3_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleAbsoluteSmoothQuadraticCurveTo"


    // $ANTLR start "entryRuleRelativeSmoothQuadraticCurveTo"
    // InternalSvgPath.g:1520:1: entryRuleRelativeSmoothQuadraticCurveTo returns [EObject current=null] : iv_ruleRelativeSmoothQuadraticCurveTo= ruleRelativeSmoothQuadraticCurveTo EOF ;
    public final EObject entryRuleRelativeSmoothQuadraticCurveTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeSmoothQuadraticCurveTo = null;


        try {
            // InternalSvgPath.g:1520:71: (iv_ruleRelativeSmoothQuadraticCurveTo= ruleRelativeSmoothQuadraticCurveTo EOF )
            // InternalSvgPath.g:1521:2: iv_ruleRelativeSmoothQuadraticCurveTo= ruleRelativeSmoothQuadraticCurveTo EOF
            {
             newCompositeNode(grammarAccess.getRelativeSmoothQuadraticCurveToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelativeSmoothQuadraticCurveTo=ruleRelativeSmoothQuadraticCurveTo();

            state._fsp--;

             current =iv_ruleRelativeSmoothQuadraticCurveTo; 
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
    // $ANTLR end "entryRuleRelativeSmoothQuadraticCurveTo"


    // $ANTLR start "ruleRelativeSmoothQuadraticCurveTo"
    // InternalSvgPath.g:1527:1: ruleRelativeSmoothQuadraticCurveTo returns [EObject current=null] : (otherlv_0= 't' ( (lv_dx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dy_3_0= ruleNumber ) ) ) ;
    public final EObject ruleRelativeSmoothQuadraticCurveTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_dx_1_0 = null;

        AntlrDatatypeRuleToken lv_dy_3_0 = null;



        	enterRule();

        try {
            // InternalSvgPath.g:1533:2: ( (otherlv_0= 't' ( (lv_dx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dy_3_0= ruleNumber ) ) ) )
            // InternalSvgPath.g:1534:2: (otherlv_0= 't' ( (lv_dx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dy_3_0= ruleNumber ) ) )
            {
            // InternalSvgPath.g:1534:2: (otherlv_0= 't' ( (lv_dx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dy_3_0= ruleNumber ) ) )
            // InternalSvgPath.g:1535:3: otherlv_0= 't' ( (lv_dx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dy_3_0= ruleNumber ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRelativeSmoothQuadraticCurveToAccess().getTKeyword_0());
            		
            // InternalSvgPath.g:1539:3: ( (lv_dx_1_0= ruleNumber ) )
            // InternalSvgPath.g:1540:4: (lv_dx_1_0= ruleNumber )
            {
            // InternalSvgPath.g:1540:4: (lv_dx_1_0= ruleNumber )
            // InternalSvgPath.g:1541:5: lv_dx_1_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getRelativeSmoothQuadraticCurveToAccess().getDxNumberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_dx_1_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeSmoothQuadraticCurveToRule());
            					}
            					set(
            						current,
            						"dx",
            						lv_dx_1_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:1558:3: (otherlv_2= ',' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==17) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSvgPath.g:1559:4: otherlv_2= ','
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getRelativeSmoothQuadraticCurveToAccess().getCommaKeyword_2());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:1564:3: ( (lv_dy_3_0= ruleNumber ) )
            // InternalSvgPath.g:1565:4: (lv_dy_3_0= ruleNumber )
            {
            // InternalSvgPath.g:1565:4: (lv_dy_3_0= ruleNumber )
            // InternalSvgPath.g:1566:5: lv_dy_3_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getRelativeSmoothQuadraticCurveToAccess().getDyNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_dy_3_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeSmoothQuadraticCurveToRule());
            					}
            					set(
            						current,
            						"dy",
            						lv_dy_3_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleRelativeSmoothQuadraticCurveTo"


    // $ANTLR start "entryRuleAbsoluteSmoothCubicCurveTo"
    // InternalSvgPath.g:1587:1: entryRuleAbsoluteSmoothCubicCurveTo returns [EObject current=null] : iv_ruleAbsoluteSmoothCubicCurveTo= ruleAbsoluteSmoothCubicCurveTo EOF ;
    public final EObject entryRuleAbsoluteSmoothCubicCurveTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteSmoothCubicCurveTo = null;


        try {
            // InternalSvgPath.g:1587:67: (iv_ruleAbsoluteSmoothCubicCurveTo= ruleAbsoluteSmoothCubicCurveTo EOF )
            // InternalSvgPath.g:1588:2: iv_ruleAbsoluteSmoothCubicCurveTo= ruleAbsoluteSmoothCubicCurveTo EOF
            {
             newCompositeNode(grammarAccess.getAbsoluteSmoothCubicCurveToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbsoluteSmoothCubicCurveTo=ruleAbsoluteSmoothCubicCurveTo();

            state._fsp--;

             current =iv_ruleAbsoluteSmoothCubicCurveTo; 
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
    // $ANTLR end "entryRuleAbsoluteSmoothCubicCurveTo"


    // $ANTLR start "ruleAbsoluteSmoothCubicCurveTo"
    // InternalSvgPath.g:1594:1: ruleAbsoluteSmoothCubicCurveTo returns [EObject current=null] : (otherlv_0= 'S' ( (lv_cx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_cy_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_x_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_y_7_0= ruleNumber ) ) ) ;
    public final EObject ruleAbsoluteSmoothCubicCurveTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_cx_1_0 = null;

        AntlrDatatypeRuleToken lv_cy_3_0 = null;

        AntlrDatatypeRuleToken lv_x_5_0 = null;

        AntlrDatatypeRuleToken lv_y_7_0 = null;



        	enterRule();

        try {
            // InternalSvgPath.g:1600:2: ( (otherlv_0= 'S' ( (lv_cx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_cy_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_x_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_y_7_0= ruleNumber ) ) ) )
            // InternalSvgPath.g:1601:2: (otherlv_0= 'S' ( (lv_cx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_cy_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_x_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_y_7_0= ruleNumber ) ) )
            {
            // InternalSvgPath.g:1601:2: (otherlv_0= 'S' ( (lv_cx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_cy_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_x_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_y_7_0= ruleNumber ) ) )
            // InternalSvgPath.g:1602:3: otherlv_0= 'S' ( (lv_cx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_cy_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_x_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_y_7_0= ruleNumber ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAbsoluteSmoothCubicCurveToAccess().getSKeyword_0());
            		
            // InternalSvgPath.g:1606:3: ( (lv_cx_1_0= ruleNumber ) )
            // InternalSvgPath.g:1607:4: (lv_cx_1_0= ruleNumber )
            {
            // InternalSvgPath.g:1607:4: (lv_cx_1_0= ruleNumber )
            // InternalSvgPath.g:1608:5: lv_cx_1_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getAbsoluteSmoothCubicCurveToAccess().getCxNumberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_cx_1_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsoluteSmoothCubicCurveToRule());
            					}
            					set(
            						current,
            						"cx",
            						lv_cx_1_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:1625:3: (otherlv_2= ',' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==17) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSvgPath.g:1626:4: otherlv_2= ','
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getAbsoluteSmoothCubicCurveToAccess().getCommaKeyword_2());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:1631:3: ( (lv_cy_3_0= ruleNumber ) )
            // InternalSvgPath.g:1632:4: (lv_cy_3_0= ruleNumber )
            {
            // InternalSvgPath.g:1632:4: (lv_cy_3_0= ruleNumber )
            // InternalSvgPath.g:1633:5: lv_cy_3_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getAbsoluteSmoothCubicCurveToAccess().getCyNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_cy_3_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsoluteSmoothCubicCurveToRule());
            					}
            					set(
            						current,
            						"cy",
            						lv_cy_3_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:1650:3: (otherlv_4= ',' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==17) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSvgPath.g:1651:4: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getAbsoluteSmoothCubicCurveToAccess().getCommaKeyword_4());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:1656:3: ( (lv_x_5_0= ruleNumber ) )
            // InternalSvgPath.g:1657:4: (lv_x_5_0= ruleNumber )
            {
            // InternalSvgPath.g:1657:4: (lv_x_5_0= ruleNumber )
            // InternalSvgPath.g:1658:5: lv_x_5_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getAbsoluteSmoothCubicCurveToAccess().getXNumberParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_x_5_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsoluteSmoothCubicCurveToRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_5_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:1675:3: (otherlv_6= ',' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==17) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSvgPath.g:1676:4: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getAbsoluteSmoothCubicCurveToAccess().getCommaKeyword_6());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:1681:3: ( (lv_y_7_0= ruleNumber ) )
            // InternalSvgPath.g:1682:4: (lv_y_7_0= ruleNumber )
            {
            // InternalSvgPath.g:1682:4: (lv_y_7_0= ruleNumber )
            // InternalSvgPath.g:1683:5: lv_y_7_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getAbsoluteSmoothCubicCurveToAccess().getYNumberParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_y_7_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbsoluteSmoothCubicCurveToRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_7_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleAbsoluteSmoothCubicCurveTo"


    // $ANTLR start "entryRuleRelativeSmoothCubicCurveTo"
    // InternalSvgPath.g:1704:1: entryRuleRelativeSmoothCubicCurveTo returns [EObject current=null] : iv_ruleRelativeSmoothCubicCurveTo= ruleRelativeSmoothCubicCurveTo EOF ;
    public final EObject entryRuleRelativeSmoothCubicCurveTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeSmoothCubicCurveTo = null;


        try {
            // InternalSvgPath.g:1704:67: (iv_ruleRelativeSmoothCubicCurveTo= ruleRelativeSmoothCubicCurveTo EOF )
            // InternalSvgPath.g:1705:2: iv_ruleRelativeSmoothCubicCurveTo= ruleRelativeSmoothCubicCurveTo EOF
            {
             newCompositeNode(grammarAccess.getRelativeSmoothCubicCurveToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelativeSmoothCubicCurveTo=ruleRelativeSmoothCubicCurveTo();

            state._fsp--;

             current =iv_ruleRelativeSmoothCubicCurveTo; 
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
    // $ANTLR end "entryRuleRelativeSmoothCubicCurveTo"


    // $ANTLR start "ruleRelativeSmoothCubicCurveTo"
    // InternalSvgPath.g:1711:1: ruleRelativeSmoothCubicCurveTo returns [EObject current=null] : (otherlv_0= 's' ( (lv_dcx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dcy_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_dx_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_dy_7_0= ruleNumber ) ) ) ;
    public final EObject ruleRelativeSmoothCubicCurveTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_dcx_1_0 = null;

        AntlrDatatypeRuleToken lv_dcy_3_0 = null;

        AntlrDatatypeRuleToken lv_dx_5_0 = null;

        AntlrDatatypeRuleToken lv_dy_7_0 = null;



        	enterRule();

        try {
            // InternalSvgPath.g:1717:2: ( (otherlv_0= 's' ( (lv_dcx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dcy_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_dx_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_dy_7_0= ruleNumber ) ) ) )
            // InternalSvgPath.g:1718:2: (otherlv_0= 's' ( (lv_dcx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dcy_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_dx_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_dy_7_0= ruleNumber ) ) )
            {
            // InternalSvgPath.g:1718:2: (otherlv_0= 's' ( (lv_dcx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dcy_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_dx_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_dy_7_0= ruleNumber ) ) )
            // InternalSvgPath.g:1719:3: otherlv_0= 's' ( (lv_dcx_1_0= ruleNumber ) ) (otherlv_2= ',' )? ( (lv_dcy_3_0= ruleNumber ) ) (otherlv_4= ',' )? ( (lv_dx_5_0= ruleNumber ) ) (otherlv_6= ',' )? ( (lv_dy_7_0= ruleNumber ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRelativeSmoothCubicCurveToAccess().getSKeyword_0());
            		
            // InternalSvgPath.g:1723:3: ( (lv_dcx_1_0= ruleNumber ) )
            // InternalSvgPath.g:1724:4: (lv_dcx_1_0= ruleNumber )
            {
            // InternalSvgPath.g:1724:4: (lv_dcx_1_0= ruleNumber )
            // InternalSvgPath.g:1725:5: lv_dcx_1_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getRelativeSmoothCubicCurveToAccess().getDcxNumberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_dcx_1_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeSmoothCubicCurveToRule());
            					}
            					set(
            						current,
            						"dcx",
            						lv_dcx_1_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:1742:3: (otherlv_2= ',' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==17) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSvgPath.g:1743:4: otherlv_2= ','
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getRelativeSmoothCubicCurveToAccess().getCommaKeyword_2());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:1748:3: ( (lv_dcy_3_0= ruleNumber ) )
            // InternalSvgPath.g:1749:4: (lv_dcy_3_0= ruleNumber )
            {
            // InternalSvgPath.g:1749:4: (lv_dcy_3_0= ruleNumber )
            // InternalSvgPath.g:1750:5: lv_dcy_3_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getRelativeSmoothCubicCurveToAccess().getDcyNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_dcy_3_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeSmoothCubicCurveToRule());
            					}
            					set(
            						current,
            						"dcy",
            						lv_dcy_3_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:1767:3: (otherlv_4= ',' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==17) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSvgPath.g:1768:4: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelativeSmoothCubicCurveToAccess().getCommaKeyword_4());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:1773:3: ( (lv_dx_5_0= ruleNumber ) )
            // InternalSvgPath.g:1774:4: (lv_dx_5_0= ruleNumber )
            {
            // InternalSvgPath.g:1774:4: (lv_dx_5_0= ruleNumber )
            // InternalSvgPath.g:1775:5: lv_dx_5_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getRelativeSmoothCubicCurveToAccess().getDxNumberParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_dx_5_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeSmoothCubicCurveToRule());
            					}
            					set(
            						current,
            						"dx",
            						lv_dx_5_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPath.g:1792:3: (otherlv_6= ',' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==17) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSvgPath.g:1793:4: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelativeSmoothCubicCurveToAccess().getCommaKeyword_6());
                    			

                    }
                    break;

            }

            // InternalSvgPath.g:1798:3: ( (lv_dy_7_0= ruleNumber ) )
            // InternalSvgPath.g:1799:4: (lv_dy_7_0= ruleNumber )
            {
            // InternalSvgPath.g:1799:4: (lv_dy_7_0= ruleNumber )
            // InternalSvgPath.g:1800:5: lv_dy_7_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getRelativeSmoothCubicCurveToAccess().getDyNumberParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_dy_7_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeSmoothCubicCurveToRule());
            					}
            					set(
            						current,
            						"dy",
            						lv_dy_7_0,
            						"org.xtext.svg.path.SvgPath.Number");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleRelativeSmoothCubicCurveTo"


    // $ANTLR start "entryRuleClosePath"
    // InternalSvgPath.g:1821:1: entryRuleClosePath returns [EObject current=null] : iv_ruleClosePath= ruleClosePath EOF ;
    public final EObject entryRuleClosePath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosePath = null;


        try {
            // InternalSvgPath.g:1821:50: (iv_ruleClosePath= ruleClosePath EOF )
            // InternalSvgPath.g:1822:2: iv_ruleClosePath= ruleClosePath EOF
            {
             newCompositeNode(grammarAccess.getClosePathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClosePath=ruleClosePath();

            state._fsp--;

             current =iv_ruleClosePath; 
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
    // $ANTLR end "entryRuleClosePath"


    // $ANTLR start "ruleClosePath"
    // InternalSvgPath.g:1828:1: ruleClosePath returns [EObject current=null] : ( ( () otherlv_1= 'Z' ) | otherlv_2= 'z' ) ;
    public final EObject ruleClosePath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSvgPath.g:1834:2: ( ( ( () otherlv_1= 'Z' ) | otherlv_2= 'z' ) )
            // InternalSvgPath.g:1835:2: ( ( () otherlv_1= 'Z' ) | otherlv_2= 'z' )
            {
            // InternalSvgPath.g:1835:2: ( ( () otherlv_1= 'Z' ) | otherlv_2= 'z' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==33) ) {
                alt39=1;
            }
            else if ( (LA39_0==34) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalSvgPath.g:1836:3: ( () otherlv_1= 'Z' )
                    {
                    // InternalSvgPath.g:1836:3: ( () otherlv_1= 'Z' )
                    // InternalSvgPath.g:1837:4: () otherlv_1= 'Z'
                    {
                    // InternalSvgPath.g:1837:4: ()
                    // InternalSvgPath.g:1838:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getClosePathAccess().getClosePathAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getClosePathAccess().getZKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSvgPath.g:1850:3: otherlv_2= 'z'
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_2); 

                    			newLeafNode(otherlv_2, grammarAccess.getClosePathAccess().getZKeyword_1());
                    		

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
    // $ANTLR end "ruleClosePath"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000007FFFD0002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000E010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000002E010L});

}