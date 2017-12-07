package org.xtext.svg.preserveaspectratio.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.svg.preserveaspectratio.services.SvgPreserveAspectRatioGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSvgPreserveAspectRatioParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'none'", "'xMinYMin'", "'xMidYMin'", "'xMaxYMin'", "'xMinYMid'", "'xMidYMid'", "'xMaxYMid'", "'xMinYMax'", "'xMidYMax'", "'xMaxYMax'", "'meet'", "'slice'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSvgPreserveAspectRatioParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSvgPreserveAspectRatioParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSvgPreserveAspectRatioParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSvgPreserveAspectRatio.g"; }



     	private SvgPreserveAspectRatioGrammarAccess grammarAccess;

        public InternalSvgPreserveAspectRatioParser(TokenStream input, SvgPreserveAspectRatioGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "PreserveAspectRatio";
       	}

       	@Override
       	protected SvgPreserveAspectRatioGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePreserveAspectRatio"
    // InternalSvgPreserveAspectRatio.g:65:1: entryRulePreserveAspectRatio returns [EObject current=null] : iv_rulePreserveAspectRatio= rulePreserveAspectRatio EOF ;
    public final EObject entryRulePreserveAspectRatio() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreserveAspectRatio = null;


        try {
            // InternalSvgPreserveAspectRatio.g:65:60: (iv_rulePreserveAspectRatio= rulePreserveAspectRatio EOF )
            // InternalSvgPreserveAspectRatio.g:66:2: iv_rulePreserveAspectRatio= rulePreserveAspectRatio EOF
            {
             newCompositeNode(grammarAccess.getPreserveAspectRatioRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePreserveAspectRatio=rulePreserveAspectRatio();

            state._fsp--;

             current =iv_rulePreserveAspectRatio; 
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
    // $ANTLR end "entryRulePreserveAspectRatio"


    // $ANTLR start "rulePreserveAspectRatio"
    // InternalSvgPreserveAspectRatio.g:72:1: rulePreserveAspectRatio returns [EObject current=null] : ( ( (lv_align_0_0= ruleAlign ) ) ( (lv_meetOrSlice_1_0= ruleMeetOrSlice ) )? ) ;
    public final EObject rulePreserveAspectRatio() throws RecognitionException {
        EObject current = null;

        Enumerator lv_align_0_0 = null;

        Enumerator lv_meetOrSlice_1_0 = null;



        	enterRule();

        try {
            // InternalSvgPreserveAspectRatio.g:78:2: ( ( ( (lv_align_0_0= ruleAlign ) ) ( (lv_meetOrSlice_1_0= ruleMeetOrSlice ) )? ) )
            // InternalSvgPreserveAspectRatio.g:79:2: ( ( (lv_align_0_0= ruleAlign ) ) ( (lv_meetOrSlice_1_0= ruleMeetOrSlice ) )? )
            {
            // InternalSvgPreserveAspectRatio.g:79:2: ( ( (lv_align_0_0= ruleAlign ) ) ( (lv_meetOrSlice_1_0= ruleMeetOrSlice ) )? )
            // InternalSvgPreserveAspectRatio.g:80:3: ( (lv_align_0_0= ruleAlign ) ) ( (lv_meetOrSlice_1_0= ruleMeetOrSlice ) )?
            {
            // InternalSvgPreserveAspectRatio.g:80:3: ( (lv_align_0_0= ruleAlign ) )
            // InternalSvgPreserveAspectRatio.g:81:4: (lv_align_0_0= ruleAlign )
            {
            // InternalSvgPreserveAspectRatio.g:81:4: (lv_align_0_0= ruleAlign )
            // InternalSvgPreserveAspectRatio.g:82:5: lv_align_0_0= ruleAlign
            {

            					newCompositeNode(grammarAccess.getPreserveAspectRatioAccess().getAlignAlignEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_align_0_0=ruleAlign();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreserveAspectRatioRule());
            					}
            					set(
            						current,
            						"align",
            						lv_align_0_0,
            						"org.xtext.svg.preserveaspectratio.SvgPreserveAspectRatio.Align");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPreserveAspectRatio.g:99:3: ( (lv_meetOrSlice_1_0= ruleMeetOrSlice ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=21 && LA1_0<=22)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSvgPreserveAspectRatio.g:100:4: (lv_meetOrSlice_1_0= ruleMeetOrSlice )
                    {
                    // InternalSvgPreserveAspectRatio.g:100:4: (lv_meetOrSlice_1_0= ruleMeetOrSlice )
                    // InternalSvgPreserveAspectRatio.g:101:5: lv_meetOrSlice_1_0= ruleMeetOrSlice
                    {

                    					newCompositeNode(grammarAccess.getPreserveAspectRatioAccess().getMeetOrSliceMeetOrSliceEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_meetOrSlice_1_0=ruleMeetOrSlice();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPreserveAspectRatioRule());
                    					}
                    					set(
                    						current,
                    						"meetOrSlice",
                    						lv_meetOrSlice_1_0,
                    						"org.xtext.svg.preserveaspectratio.SvgPreserveAspectRatio.MeetOrSlice");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "rulePreserveAspectRatio"


    // $ANTLR start "ruleAlign"
    // InternalSvgPreserveAspectRatio.g:122:1: ruleAlign returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'xMinYMin' ) | (enumLiteral_2= 'xMidYMin' ) | (enumLiteral_3= 'xMaxYMin' ) | (enumLiteral_4= 'xMinYMid' ) | (enumLiteral_5= 'xMidYMid' ) | (enumLiteral_6= 'xMaxYMid' ) | (enumLiteral_7= 'xMinYMax' ) | (enumLiteral_8= 'xMidYMax' ) | (enumLiteral_9= 'xMaxYMax' ) ) ;
    public final Enumerator ruleAlign() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalSvgPreserveAspectRatio.g:128:2: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'xMinYMin' ) | (enumLiteral_2= 'xMidYMin' ) | (enumLiteral_3= 'xMaxYMin' ) | (enumLiteral_4= 'xMinYMid' ) | (enumLiteral_5= 'xMidYMid' ) | (enumLiteral_6= 'xMaxYMid' ) | (enumLiteral_7= 'xMinYMax' ) | (enumLiteral_8= 'xMidYMax' ) | (enumLiteral_9= 'xMaxYMax' ) ) )
            // InternalSvgPreserveAspectRatio.g:129:2: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'xMinYMin' ) | (enumLiteral_2= 'xMidYMin' ) | (enumLiteral_3= 'xMaxYMin' ) | (enumLiteral_4= 'xMinYMid' ) | (enumLiteral_5= 'xMidYMid' ) | (enumLiteral_6= 'xMaxYMid' ) | (enumLiteral_7= 'xMinYMax' ) | (enumLiteral_8= 'xMidYMax' ) | (enumLiteral_9= 'xMaxYMax' ) )
            {
            // InternalSvgPreserveAspectRatio.g:129:2: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'xMinYMin' ) | (enumLiteral_2= 'xMidYMin' ) | (enumLiteral_3= 'xMaxYMin' ) | (enumLiteral_4= 'xMinYMid' ) | (enumLiteral_5= 'xMidYMid' ) | (enumLiteral_6= 'xMaxYMid' ) | (enumLiteral_7= 'xMinYMax' ) | (enumLiteral_8= 'xMidYMax' ) | (enumLiteral_9= 'xMaxYMax' ) )
            int alt2=10;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
                {
                alt2=7;
                }
                break;
            case 18:
                {
                alt2=8;
                }
                break;
            case 19:
                {
                alt2=9;
                }
                break;
            case 20:
                {
                alt2=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSvgPreserveAspectRatio.g:130:3: (enumLiteral_0= 'none' )
                    {
                    // InternalSvgPreserveAspectRatio.g:130:3: (enumLiteral_0= 'none' )
                    // InternalSvgPreserveAspectRatio.g:131:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,11,FOLLOW_2); 

                    				current = grammarAccess.getAlignAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAlignAccess().getNoneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSvgPreserveAspectRatio.g:138:3: (enumLiteral_1= 'xMinYMin' )
                    {
                    // InternalSvgPreserveAspectRatio.g:138:3: (enumLiteral_1= 'xMinYMin' )
                    // InternalSvgPreserveAspectRatio.g:139:4: enumLiteral_1= 'xMinYMin'
                    {
                    enumLiteral_1=(Token)match(input,12,FOLLOW_2); 

                    				current = grammarAccess.getAlignAccess().getXMinYMinEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAlignAccess().getXMinYMinEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSvgPreserveAspectRatio.g:146:3: (enumLiteral_2= 'xMidYMin' )
                    {
                    // InternalSvgPreserveAspectRatio.g:146:3: (enumLiteral_2= 'xMidYMin' )
                    // InternalSvgPreserveAspectRatio.g:147:4: enumLiteral_2= 'xMidYMin'
                    {
                    enumLiteral_2=(Token)match(input,13,FOLLOW_2); 

                    				current = grammarAccess.getAlignAccess().getXMidYMinEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAlignAccess().getXMidYMinEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSvgPreserveAspectRatio.g:154:3: (enumLiteral_3= 'xMaxYMin' )
                    {
                    // InternalSvgPreserveAspectRatio.g:154:3: (enumLiteral_3= 'xMaxYMin' )
                    // InternalSvgPreserveAspectRatio.g:155:4: enumLiteral_3= 'xMaxYMin'
                    {
                    enumLiteral_3=(Token)match(input,14,FOLLOW_2); 

                    				current = grammarAccess.getAlignAccess().getXMaxYMinEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAlignAccess().getXMaxYMinEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSvgPreserveAspectRatio.g:162:3: (enumLiteral_4= 'xMinYMid' )
                    {
                    // InternalSvgPreserveAspectRatio.g:162:3: (enumLiteral_4= 'xMinYMid' )
                    // InternalSvgPreserveAspectRatio.g:163:4: enumLiteral_4= 'xMinYMid'
                    {
                    enumLiteral_4=(Token)match(input,15,FOLLOW_2); 

                    				current = grammarAccess.getAlignAccess().getXMinYMidEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getAlignAccess().getXMinYMidEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSvgPreserveAspectRatio.g:170:3: (enumLiteral_5= 'xMidYMid' )
                    {
                    // InternalSvgPreserveAspectRatio.g:170:3: (enumLiteral_5= 'xMidYMid' )
                    // InternalSvgPreserveAspectRatio.g:171:4: enumLiteral_5= 'xMidYMid'
                    {
                    enumLiteral_5=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getAlignAccess().getXMidYMidEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getAlignAccess().getXMidYMidEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSvgPreserveAspectRatio.g:178:3: (enumLiteral_6= 'xMaxYMid' )
                    {
                    // InternalSvgPreserveAspectRatio.g:178:3: (enumLiteral_6= 'xMaxYMid' )
                    // InternalSvgPreserveAspectRatio.g:179:4: enumLiteral_6= 'xMaxYMid'
                    {
                    enumLiteral_6=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getAlignAccess().getXMaxYMidEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getAlignAccess().getXMaxYMidEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSvgPreserveAspectRatio.g:186:3: (enumLiteral_7= 'xMinYMax' )
                    {
                    // InternalSvgPreserveAspectRatio.g:186:3: (enumLiteral_7= 'xMinYMax' )
                    // InternalSvgPreserveAspectRatio.g:187:4: enumLiteral_7= 'xMinYMax'
                    {
                    enumLiteral_7=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getAlignAccess().getXMinYMaxEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getAlignAccess().getXMinYMaxEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSvgPreserveAspectRatio.g:194:3: (enumLiteral_8= 'xMidYMax' )
                    {
                    // InternalSvgPreserveAspectRatio.g:194:3: (enumLiteral_8= 'xMidYMax' )
                    // InternalSvgPreserveAspectRatio.g:195:4: enumLiteral_8= 'xMidYMax'
                    {
                    enumLiteral_8=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getAlignAccess().getXMidYMaxEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getAlignAccess().getXMidYMaxEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalSvgPreserveAspectRatio.g:202:3: (enumLiteral_9= 'xMaxYMax' )
                    {
                    // InternalSvgPreserveAspectRatio.g:202:3: (enumLiteral_9= 'xMaxYMax' )
                    // InternalSvgPreserveAspectRatio.g:203:4: enumLiteral_9= 'xMaxYMax'
                    {
                    enumLiteral_9=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getAlignAccess().getXMaxYMaxEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getAlignAccess().getXMaxYMaxEnumLiteralDeclaration_9());
                    			

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
    // $ANTLR end "ruleAlign"


    // $ANTLR start "ruleMeetOrSlice"
    // InternalSvgPreserveAspectRatio.g:213:1: ruleMeetOrSlice returns [Enumerator current=null] : ( (enumLiteral_0= 'meet' ) | (enumLiteral_1= 'slice' ) ) ;
    public final Enumerator ruleMeetOrSlice() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSvgPreserveAspectRatio.g:219:2: ( ( (enumLiteral_0= 'meet' ) | (enumLiteral_1= 'slice' ) ) )
            // InternalSvgPreserveAspectRatio.g:220:2: ( (enumLiteral_0= 'meet' ) | (enumLiteral_1= 'slice' ) )
            {
            // InternalSvgPreserveAspectRatio.g:220:2: ( (enumLiteral_0= 'meet' ) | (enumLiteral_1= 'slice' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( (LA3_0==22) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSvgPreserveAspectRatio.g:221:3: (enumLiteral_0= 'meet' )
                    {
                    // InternalSvgPreserveAspectRatio.g:221:3: (enumLiteral_0= 'meet' )
                    // InternalSvgPreserveAspectRatio.g:222:4: enumLiteral_0= 'meet'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getMeetOrSliceAccess().getMeetEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMeetOrSliceAccess().getMeetEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSvgPreserveAspectRatio.g:229:3: (enumLiteral_1= 'slice' )
                    {
                    // InternalSvgPreserveAspectRatio.g:229:3: (enumLiteral_1= 'slice' )
                    // InternalSvgPreserveAspectRatio.g:230:4: enumLiteral_1= 'slice'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getMeetOrSliceAccess().getSliceEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMeetOrSliceAccess().getSliceEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleMeetOrSlice"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000600002L});

}