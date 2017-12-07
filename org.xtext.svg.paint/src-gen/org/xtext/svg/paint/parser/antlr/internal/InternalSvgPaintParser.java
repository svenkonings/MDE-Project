package org.xtext.svg.paint.parser.antlr.internal;

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
import org.xtext.svg.paint.services.SvgPaintGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSvgPaintParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HEX", "RULE_RGB_NUMBER", "RULE_RGB_PERCENTAGE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'none'", "'rgb'", "'('", "','", "')'", "'url'", "'#'", "'aliceblue'", "'antiquewhite'", "'aqua'", "'aquamarine'", "'azure'", "'beige'", "'bisque'", "'black'", "'blanchedalmond'", "'blue'", "'blueviolet'", "'brown'", "'burlywood'", "'cadetblue'", "'chartreuse'", "'chocolate'", "'coral'", "'cornflowerblue'", "'cornsilk'", "'crimson'", "'cyan'", "'darkblue'", "'darkcyan'", "'darkgoldenrod'", "'darkgray'", "'darkgreen'", "'darkgrey'", "'darkkhaki'", "'darkmagenta'", "'darkolivegreen'", "'darkorange'", "'darkorchid'", "'darkred'", "'darksalmon'", "'darkseagreen'", "'darkslateblue'", "'darkslategray'", "'darkslategrey'", "'darkturquoise'", "'darkviolet'", "'deeppink'", "'deepskyblue'", "'dimgray'", "'dimgrey'", "'dodgerblue'", "'firebrick'", "'floralwhite'", "'forestgreen'", "'fuchsia'", "'gainsboro'", "'ghostwhite'", "'gold'", "'goldenrod'", "'gray'", "'grey'", "'green'", "'greenyellow'", "'honeydew'", "'hotpink'", "'indianred'", "'indigo'", "'ivory'", "'khaki'", "'lavender'", "'lavenderblush'", "'lawngreen'", "'lemonchiffon'", "'lightblue'", "'lightcoral'", "'lightcyan'", "'lightgoldenrodyellow'", "'lightgray'", "'lightgreen'", "'lightgrey'", "'lightpink'", "'lightsalmon'", "'lightseagreen'", "'lightskyblue'", "'lightslategray'", "'lightslategrey'", "'lightsteelblue'", "'lightyellow'", "'lime'", "'limegreen'", "'linen'", "'magenta'", "'maroon'", "'mediumaquamarine'", "'mediumblue'", "'mediumorchid'", "'mediumpurple'", "'mediumseagreen'", "'mediumslateblue'", "'mediumspringgreen'", "'mediumturquoise'", "'mediumvioletred'", "'midnightblue'", "'mintcream'", "'mistyrose'", "'moccasin'", "'navajowhite'", "'navy'", "'oldlace'", "'olive'", "'olivedrab'", "'orange'", "'orangered'", "'orchid'", "'palegoldenrod'", "'palegreen'", "'paleturquoise'", "'palevioletred'", "'papayawhip'", "'peachpuff'", "'peru'", "'pink'", "'plum'", "'powderblue'", "'purple'", "'red'", "'rosybrown'", "'royalblue'", "'saddlebrown'", "'salmon'", "'sandybrown'", "'seagreen'", "'seashell'", "'sienna'", "'silver'", "'skyblue'", "'slateblue'", "'slategray'", "'slategrey'", "'snow'", "'springgreen'", "'steelblue'", "'tan'", "'teal'", "'thistle'", "'tomato'", "'turquoise'", "'violet'", "'wheat'", "'white'", "'whitesmoke'", "'yellow'", "'yellowgreen'"
    };
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int RULE_HEX=4;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=7;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=8;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int RULE_RGB_PERCENTAGE=6;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__166=166;
    public static final int T__165=165;
    public static final int RULE_RGB_NUMBER=5;
    public static final int T__167=167;
    public static final int T__162=162;
    public static final int T__161=161;
    public static final int T__164=164;
    public static final int T__163=163;
    public static final int T__160=160;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__159=159;
    public static final int T__30=30;
    public static final int T__158=158;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__155=155;
    public static final int T__154=154;
    public static final int T__157=157;
    public static final int T__156=156;
    public static final int T__151=151;
    public static final int T__150=150;
    public static final int T__153=153;
    public static final int T__152=152;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__148=148;
    public static final int T__41=41;
    public static final int T__147=147;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__149=149;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalSvgPaintParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSvgPaintParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSvgPaintParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSvgPaint.g"; }



     	private SvgPaintGrammarAccess grammarAccess;

        public InternalSvgPaintParser(TokenStream input, SvgPaintGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Paint";
       	}

       	@Override
       	protected SvgPaintGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePaint"
    // InternalSvgPaint.g:65:1: entryRulePaint returns [EObject current=null] : iv_rulePaint= rulePaint EOF ;
    public final EObject entryRulePaint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaint = null;


        try {
            // InternalSvgPaint.g:65:46: (iv_rulePaint= rulePaint EOF )
            // InternalSvgPaint.g:66:2: iv_rulePaint= rulePaint EOF
            {
             newCompositeNode(grammarAccess.getPaintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePaint=rulePaint();

            state._fsp--;

             current =iv_rulePaint; 
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
    // $ANTLR end "entryRulePaint"


    // $ANTLR start "rulePaint"
    // InternalSvgPaint.g:72:1: rulePaint returns [EObject current=null] : (this_NonePaint_0= ruleNonePaint | this_IriPaint_1= ruleIriPaint | this_Color_2= ruleColor ) ;
    public final EObject rulePaint() throws RecognitionException {
        EObject current = null;

        EObject this_NonePaint_0 = null;

        EObject this_IriPaint_1 = null;

        EObject this_Color_2 = null;



        	enterRule();

        try {
            // InternalSvgPaint.g:78:2: ( (this_NonePaint_0= ruleNonePaint | this_IriPaint_1= ruleIriPaint | this_Color_2= ruleColor ) )
            // InternalSvgPaint.g:79:2: (this_NonePaint_0= ruleNonePaint | this_IriPaint_1= ruleIriPaint | this_Color_2= ruleColor )
            {
            // InternalSvgPaint.g:79:2: (this_NonePaint_0= ruleNonePaint | this_IriPaint_1= ruleIriPaint | this_Color_2= ruleColor )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case RULE_HEX:
            case 15:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSvgPaint.g:80:3: this_NonePaint_0= ruleNonePaint
                    {

                    			newCompositeNode(grammarAccess.getPaintAccess().getNonePaintParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonePaint_0=ruleNonePaint();

                    state._fsp--;


                    			current = this_NonePaint_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSvgPaint.g:89:3: this_IriPaint_1= ruleIriPaint
                    {

                    			newCompositeNode(grammarAccess.getPaintAccess().getIriPaintParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IriPaint_1=ruleIriPaint();

                    state._fsp--;


                    			current = this_IriPaint_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSvgPaint.g:98:3: this_Color_2= ruleColor
                    {

                    			newCompositeNode(grammarAccess.getPaintAccess().getColorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Color_2=ruleColor();

                    state._fsp--;


                    			current = this_Color_2;
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
    // $ANTLR end "rulePaint"


    // $ANTLR start "entryRuleNonePaint"
    // InternalSvgPaint.g:110:1: entryRuleNonePaint returns [EObject current=null] : iv_ruleNonePaint= ruleNonePaint EOF ;
    public final EObject entryRuleNonePaint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonePaint = null;


        try {
            // InternalSvgPaint.g:110:50: (iv_ruleNonePaint= ruleNonePaint EOF )
            // InternalSvgPaint.g:111:2: iv_ruleNonePaint= ruleNonePaint EOF
            {
             newCompositeNode(grammarAccess.getNonePaintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonePaint=ruleNonePaint();

            state._fsp--;

             current =iv_ruleNonePaint; 
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
    // $ANTLR end "entryRuleNonePaint"


    // $ANTLR start "ruleNonePaint"
    // InternalSvgPaint.g:117:1: ruleNonePaint returns [EObject current=null] : ( () otherlv_1= 'none' ) ;
    public final EObject ruleNonePaint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSvgPaint.g:123:2: ( ( () otherlv_1= 'none' ) )
            // InternalSvgPaint.g:124:2: ( () otherlv_1= 'none' )
            {
            // InternalSvgPaint.g:124:2: ( () otherlv_1= 'none' )
            // InternalSvgPaint.g:125:3: () otherlv_1= 'none'
            {
            // InternalSvgPaint.g:125:3: ()
            // InternalSvgPaint.g:126:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNonePaintAccess().getNonePaintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNonePaintAccess().getNoneKeyword_1());
            		

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
    // $ANTLR end "ruleNonePaint"


    // $ANTLR start "entryRuleColor"
    // InternalSvgPaint.g:140:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalSvgPaint.g:140:46: (iv_ruleColor= ruleColor EOF )
            // InternalSvgPaint.g:141:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalSvgPaint.g:147:1: ruleColor returns [EObject current=null] : (this_HexColor_0= ruleHexColor | this_RgbColor_1= ruleRgbColor | this_RgbPercentage_2= ruleRgbPercentage | this_KeywordColor_3= ruleKeywordColor ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        EObject this_HexColor_0 = null;

        EObject this_RgbColor_1 = null;

        EObject this_RgbPercentage_2 = null;

        EObject this_KeywordColor_3 = null;



        	enterRule();

        try {
            // InternalSvgPaint.g:153:2: ( (this_HexColor_0= ruleHexColor | this_RgbColor_1= ruleRgbColor | this_RgbPercentage_2= ruleRgbPercentage | this_KeywordColor_3= ruleKeywordColor ) )
            // InternalSvgPaint.g:154:2: (this_HexColor_0= ruleHexColor | this_RgbColor_1= ruleRgbColor | this_RgbPercentage_2= ruleRgbPercentage | this_KeywordColor_3= ruleKeywordColor )
            {
            // InternalSvgPaint.g:154:2: (this_HexColor_0= ruleHexColor | this_RgbColor_1= ruleRgbColor | this_RgbPercentage_2= ruleRgbPercentage | this_KeywordColor_3= ruleKeywordColor )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_HEX:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==16) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==RULE_RGB_PERCENTAGE) ) {
                        alt2=3;
                    }
                    else if ( (LA2_4==RULE_RGB_NUMBER) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSvgPaint.g:155:3: this_HexColor_0= ruleHexColor
                    {

                    			newCompositeNode(grammarAccess.getColorAccess().getHexColorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_HexColor_0=ruleHexColor();

                    state._fsp--;


                    			current = this_HexColor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSvgPaint.g:164:3: this_RgbColor_1= ruleRgbColor
                    {

                    			newCompositeNode(grammarAccess.getColorAccess().getRgbColorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RgbColor_1=ruleRgbColor();

                    state._fsp--;


                    			current = this_RgbColor_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSvgPaint.g:173:3: this_RgbPercentage_2= ruleRgbPercentage
                    {

                    			newCompositeNode(grammarAccess.getColorAccess().getRgbPercentageParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RgbPercentage_2=ruleRgbPercentage();

                    state._fsp--;


                    			current = this_RgbPercentage_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSvgPaint.g:182:3: this_KeywordColor_3= ruleKeywordColor
                    {

                    			newCompositeNode(grammarAccess.getColorAccess().getKeywordColorParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_KeywordColor_3=ruleKeywordColor();

                    state._fsp--;


                    			current = this_KeywordColor_3;
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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleHexColor"
    // InternalSvgPaint.g:194:1: entryRuleHexColor returns [EObject current=null] : iv_ruleHexColor= ruleHexColor EOF ;
    public final EObject entryRuleHexColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexColor = null;


        try {
            // InternalSvgPaint.g:194:49: (iv_ruleHexColor= ruleHexColor EOF )
            // InternalSvgPaint.g:195:2: iv_ruleHexColor= ruleHexColor EOF
            {
             newCompositeNode(grammarAccess.getHexColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHexColor=ruleHexColor();

            state._fsp--;

             current =iv_ruleHexColor; 
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
    // $ANTLR end "entryRuleHexColor"


    // $ANTLR start "ruleHexColor"
    // InternalSvgPaint.g:201:1: ruleHexColor returns [EObject current=null] : ( (lv_hex_0_0= RULE_HEX ) ) ;
    public final EObject ruleHexColor() throws RecognitionException {
        EObject current = null;

        Token lv_hex_0_0=null;


        	enterRule();

        try {
            // InternalSvgPaint.g:207:2: ( ( (lv_hex_0_0= RULE_HEX ) ) )
            // InternalSvgPaint.g:208:2: ( (lv_hex_0_0= RULE_HEX ) )
            {
            // InternalSvgPaint.g:208:2: ( (lv_hex_0_0= RULE_HEX ) )
            // InternalSvgPaint.g:209:3: (lv_hex_0_0= RULE_HEX )
            {
            // InternalSvgPaint.g:209:3: (lv_hex_0_0= RULE_HEX )
            // InternalSvgPaint.g:210:4: lv_hex_0_0= RULE_HEX
            {
            lv_hex_0_0=(Token)match(input,RULE_HEX,FOLLOW_2); 

            				newLeafNode(lv_hex_0_0, grammarAccess.getHexColorAccess().getHexHEXTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getHexColorRule());
            				}
            				setWithLastConsumed(
            					current,
            					"hex",
            					lv_hex_0_0,
            					"org.xtext.svg.paint.SvgPaint.HEX");
            			

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
    // $ANTLR end "ruleHexColor"


    // $ANTLR start "entryRuleRgbColor"
    // InternalSvgPaint.g:229:1: entryRuleRgbColor returns [EObject current=null] : iv_ruleRgbColor= ruleRgbColor EOF ;
    public final EObject entryRuleRgbColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRgbColor = null;


        try {
            // InternalSvgPaint.g:229:49: (iv_ruleRgbColor= ruleRgbColor EOF )
            // InternalSvgPaint.g:230:2: iv_ruleRgbColor= ruleRgbColor EOF
            {
             newCompositeNode(grammarAccess.getRgbColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRgbColor=ruleRgbColor();

            state._fsp--;

             current =iv_ruleRgbColor; 
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
    // $ANTLR end "entryRuleRgbColor"


    // $ANTLR start "ruleRgbColor"
    // InternalSvgPaint.g:236:1: ruleRgbColor returns [EObject current=null] : (otherlv_0= 'rgb' otherlv_1= '(' ( (lv_red_2_0= RULE_RGB_NUMBER ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_RGB_NUMBER ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_RGB_NUMBER ) ) otherlv_7= ')' ) ;
    public final EObject ruleRgbColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_red_2_0=null;
        Token otherlv_3=null;
        Token lv_green_4_0=null;
        Token otherlv_5=null;
        Token lv_blue_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalSvgPaint.g:242:2: ( (otherlv_0= 'rgb' otherlv_1= '(' ( (lv_red_2_0= RULE_RGB_NUMBER ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_RGB_NUMBER ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_RGB_NUMBER ) ) otherlv_7= ')' ) )
            // InternalSvgPaint.g:243:2: (otherlv_0= 'rgb' otherlv_1= '(' ( (lv_red_2_0= RULE_RGB_NUMBER ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_RGB_NUMBER ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_RGB_NUMBER ) ) otherlv_7= ')' )
            {
            // InternalSvgPaint.g:243:2: (otherlv_0= 'rgb' otherlv_1= '(' ( (lv_red_2_0= RULE_RGB_NUMBER ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_RGB_NUMBER ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_RGB_NUMBER ) ) otherlv_7= ')' )
            // InternalSvgPaint.g:244:3: otherlv_0= 'rgb' otherlv_1= '(' ( (lv_red_2_0= RULE_RGB_NUMBER ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_RGB_NUMBER ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_RGB_NUMBER ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRgbColorAccess().getRgbKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRgbColorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSvgPaint.g:252:3: ( (lv_red_2_0= RULE_RGB_NUMBER ) )
            // InternalSvgPaint.g:253:4: (lv_red_2_0= RULE_RGB_NUMBER )
            {
            // InternalSvgPaint.g:253:4: (lv_red_2_0= RULE_RGB_NUMBER )
            // InternalSvgPaint.g:254:5: lv_red_2_0= RULE_RGB_NUMBER
            {
            lv_red_2_0=(Token)match(input,RULE_RGB_NUMBER,FOLLOW_5); 

            					newLeafNode(lv_red_2_0, grammarAccess.getRgbColorAccess().getRedRGB_NUMBERTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRgbColorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"red",
            						lv_red_2_0,
            						"org.xtext.svg.paint.SvgPaint.RGB_NUMBER");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getRgbColorAccess().getCommaKeyword_3());
            		
            // InternalSvgPaint.g:274:3: ( (lv_green_4_0= RULE_RGB_NUMBER ) )
            // InternalSvgPaint.g:275:4: (lv_green_4_0= RULE_RGB_NUMBER )
            {
            // InternalSvgPaint.g:275:4: (lv_green_4_0= RULE_RGB_NUMBER )
            // InternalSvgPaint.g:276:5: lv_green_4_0= RULE_RGB_NUMBER
            {
            lv_green_4_0=(Token)match(input,RULE_RGB_NUMBER,FOLLOW_5); 

            					newLeafNode(lv_green_4_0, grammarAccess.getRgbColorAccess().getGreenRGB_NUMBERTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRgbColorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"green",
            						lv_green_4_0,
            						"org.xtext.svg.paint.SvgPaint.RGB_NUMBER");
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getRgbColorAccess().getCommaKeyword_5());
            		
            // InternalSvgPaint.g:296:3: ( (lv_blue_6_0= RULE_RGB_NUMBER ) )
            // InternalSvgPaint.g:297:4: (lv_blue_6_0= RULE_RGB_NUMBER )
            {
            // InternalSvgPaint.g:297:4: (lv_blue_6_0= RULE_RGB_NUMBER )
            // InternalSvgPaint.g:298:5: lv_blue_6_0= RULE_RGB_NUMBER
            {
            lv_blue_6_0=(Token)match(input,RULE_RGB_NUMBER,FOLLOW_6); 

            					newLeafNode(lv_blue_6_0, grammarAccess.getRgbColorAccess().getBlueRGB_NUMBERTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRgbColorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"blue",
            						lv_blue_6_0,
            						"org.xtext.svg.paint.SvgPaint.RGB_NUMBER");
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRgbColorAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleRgbColor"


    // $ANTLR start "entryRuleRgbPercentage"
    // InternalSvgPaint.g:322:1: entryRuleRgbPercentage returns [EObject current=null] : iv_ruleRgbPercentage= ruleRgbPercentage EOF ;
    public final EObject entryRuleRgbPercentage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRgbPercentage = null;


        try {
            // InternalSvgPaint.g:322:54: (iv_ruleRgbPercentage= ruleRgbPercentage EOF )
            // InternalSvgPaint.g:323:2: iv_ruleRgbPercentage= ruleRgbPercentage EOF
            {
             newCompositeNode(grammarAccess.getRgbPercentageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRgbPercentage=ruleRgbPercentage();

            state._fsp--;

             current =iv_ruleRgbPercentage; 
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
    // $ANTLR end "entryRuleRgbPercentage"


    // $ANTLR start "ruleRgbPercentage"
    // InternalSvgPaint.g:329:1: ruleRgbPercentage returns [EObject current=null] : (otherlv_0= 'rgb' otherlv_1= '(' ( (lv_red_2_0= RULE_RGB_PERCENTAGE ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_RGB_PERCENTAGE ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_RGB_PERCENTAGE ) ) otherlv_7= ')' ) ;
    public final EObject ruleRgbPercentage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_red_2_0=null;
        Token otherlv_3=null;
        Token lv_green_4_0=null;
        Token otherlv_5=null;
        Token lv_blue_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalSvgPaint.g:335:2: ( (otherlv_0= 'rgb' otherlv_1= '(' ( (lv_red_2_0= RULE_RGB_PERCENTAGE ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_RGB_PERCENTAGE ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_RGB_PERCENTAGE ) ) otherlv_7= ')' ) )
            // InternalSvgPaint.g:336:2: (otherlv_0= 'rgb' otherlv_1= '(' ( (lv_red_2_0= RULE_RGB_PERCENTAGE ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_RGB_PERCENTAGE ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_RGB_PERCENTAGE ) ) otherlv_7= ')' )
            {
            // InternalSvgPaint.g:336:2: (otherlv_0= 'rgb' otherlv_1= '(' ( (lv_red_2_0= RULE_RGB_PERCENTAGE ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_RGB_PERCENTAGE ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_RGB_PERCENTAGE ) ) otherlv_7= ')' )
            // InternalSvgPaint.g:337:3: otherlv_0= 'rgb' otherlv_1= '(' ( (lv_red_2_0= RULE_RGB_PERCENTAGE ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_RGB_PERCENTAGE ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_RGB_PERCENTAGE ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRgbPercentageAccess().getRgbKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRgbPercentageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSvgPaint.g:345:3: ( (lv_red_2_0= RULE_RGB_PERCENTAGE ) )
            // InternalSvgPaint.g:346:4: (lv_red_2_0= RULE_RGB_PERCENTAGE )
            {
            // InternalSvgPaint.g:346:4: (lv_red_2_0= RULE_RGB_PERCENTAGE )
            // InternalSvgPaint.g:347:5: lv_red_2_0= RULE_RGB_PERCENTAGE
            {
            lv_red_2_0=(Token)match(input,RULE_RGB_PERCENTAGE,FOLLOW_5); 

            					newLeafNode(lv_red_2_0, grammarAccess.getRgbPercentageAccess().getRedRGB_PERCENTAGETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRgbPercentageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"red",
            						lv_red_2_0,
            						"org.xtext.svg.paint.SvgPaint.RGB_PERCENTAGE");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getRgbPercentageAccess().getCommaKeyword_3());
            		
            // InternalSvgPaint.g:367:3: ( (lv_green_4_0= RULE_RGB_PERCENTAGE ) )
            // InternalSvgPaint.g:368:4: (lv_green_4_0= RULE_RGB_PERCENTAGE )
            {
            // InternalSvgPaint.g:368:4: (lv_green_4_0= RULE_RGB_PERCENTAGE )
            // InternalSvgPaint.g:369:5: lv_green_4_0= RULE_RGB_PERCENTAGE
            {
            lv_green_4_0=(Token)match(input,RULE_RGB_PERCENTAGE,FOLLOW_5); 

            					newLeafNode(lv_green_4_0, grammarAccess.getRgbPercentageAccess().getGreenRGB_PERCENTAGETerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRgbPercentageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"green",
            						lv_green_4_0,
            						"org.xtext.svg.paint.SvgPaint.RGB_PERCENTAGE");
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getRgbPercentageAccess().getCommaKeyword_5());
            		
            // InternalSvgPaint.g:389:3: ( (lv_blue_6_0= RULE_RGB_PERCENTAGE ) )
            // InternalSvgPaint.g:390:4: (lv_blue_6_0= RULE_RGB_PERCENTAGE )
            {
            // InternalSvgPaint.g:390:4: (lv_blue_6_0= RULE_RGB_PERCENTAGE )
            // InternalSvgPaint.g:391:5: lv_blue_6_0= RULE_RGB_PERCENTAGE
            {
            lv_blue_6_0=(Token)match(input,RULE_RGB_PERCENTAGE,FOLLOW_6); 

            					newLeafNode(lv_blue_6_0, grammarAccess.getRgbPercentageAccess().getBlueRGB_PERCENTAGETerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRgbPercentageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"blue",
            						lv_blue_6_0,
            						"org.xtext.svg.paint.SvgPaint.RGB_PERCENTAGE");
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRgbPercentageAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleRgbPercentage"


    // $ANTLR start "entryRuleKeywordColor"
    // InternalSvgPaint.g:415:1: entryRuleKeywordColor returns [EObject current=null] : iv_ruleKeywordColor= ruleKeywordColor EOF ;
    public final EObject entryRuleKeywordColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeywordColor = null;


        try {
            // InternalSvgPaint.g:415:53: (iv_ruleKeywordColor= ruleKeywordColor EOF )
            // InternalSvgPaint.g:416:2: iv_ruleKeywordColor= ruleKeywordColor EOF
            {
             newCompositeNode(grammarAccess.getKeywordColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeywordColor=ruleKeywordColor();

            state._fsp--;

             current =iv_ruleKeywordColor; 
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
    // $ANTLR end "entryRuleKeywordColor"


    // $ANTLR start "ruleKeywordColor"
    // InternalSvgPaint.g:422:1: ruleKeywordColor returns [EObject current=null] : ( (lv_keyword_0_0= ruleColorKeyword ) ) ;
    public final EObject ruleKeywordColor() throws RecognitionException {
        EObject current = null;

        Enumerator lv_keyword_0_0 = null;



        	enterRule();

        try {
            // InternalSvgPaint.g:428:2: ( ( (lv_keyword_0_0= ruleColorKeyword ) ) )
            // InternalSvgPaint.g:429:2: ( (lv_keyword_0_0= ruleColorKeyword ) )
            {
            // InternalSvgPaint.g:429:2: ( (lv_keyword_0_0= ruleColorKeyword ) )
            // InternalSvgPaint.g:430:3: (lv_keyword_0_0= ruleColorKeyword )
            {
            // InternalSvgPaint.g:430:3: (lv_keyword_0_0= ruleColorKeyword )
            // InternalSvgPaint.g:431:4: lv_keyword_0_0= ruleColorKeyword
            {

            				newCompositeNode(grammarAccess.getKeywordColorAccess().getKeywordColorKeywordEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_keyword_0_0=ruleColorKeyword();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getKeywordColorRule());
            				}
            				set(
            					current,
            					"keyword",
            					lv_keyword_0_0,
            					"org.xtext.svg.paint.SvgPaint.ColorKeyword");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleKeywordColor"


    // $ANTLR start "entryRuleIriPaint"
    // InternalSvgPaint.g:451:1: entryRuleIriPaint returns [EObject current=null] : iv_ruleIriPaint= ruleIriPaint EOF ;
    public final EObject entryRuleIriPaint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIriPaint = null;


        try {
            // InternalSvgPaint.g:451:49: (iv_ruleIriPaint= ruleIriPaint EOF )
            // InternalSvgPaint.g:452:2: iv_ruleIriPaint= ruleIriPaint EOF
            {
             newCompositeNode(grammarAccess.getIriPaintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIriPaint=ruleIriPaint();

            state._fsp--;

             current =iv_ruleIriPaint; 
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
    // $ANTLR end "entryRuleIriPaint"


    // $ANTLR start "ruleIriPaint"
    // InternalSvgPaint.g:458:1: ruleIriPaint returns [EObject current=null] : ( (lv_iri_0_0= ruleLocalIri ) ) ;
    public final EObject ruleIriPaint() throws RecognitionException {
        EObject current = null;

        EObject lv_iri_0_0 = null;



        	enterRule();

        try {
            // InternalSvgPaint.g:464:2: ( ( (lv_iri_0_0= ruleLocalIri ) ) )
            // InternalSvgPaint.g:465:2: ( (lv_iri_0_0= ruleLocalIri ) )
            {
            // InternalSvgPaint.g:465:2: ( (lv_iri_0_0= ruleLocalIri ) )
            // InternalSvgPaint.g:466:3: (lv_iri_0_0= ruleLocalIri )
            {
            // InternalSvgPaint.g:466:3: (lv_iri_0_0= ruleLocalIri )
            // InternalSvgPaint.g:467:4: lv_iri_0_0= ruleLocalIri
            {

            				newCompositeNode(grammarAccess.getIriPaintAccess().getIriLocalIriParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_iri_0_0=ruleLocalIri();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getIriPaintRule());
            				}
            				set(
            					current,
            					"iri",
            					lv_iri_0_0,
            					"org.xtext.svg.paint.SvgPaint.LocalIri");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleIriPaint"


    // $ANTLR start "entryRuleLocalIri"
    // InternalSvgPaint.g:487:1: entryRuleLocalIri returns [EObject current=null] : iv_ruleLocalIri= ruleLocalIri EOF ;
    public final EObject entryRuleLocalIri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalIri = null;


        try {
            // InternalSvgPaint.g:487:49: (iv_ruleLocalIri= ruleLocalIri EOF )
            // InternalSvgPaint.g:488:2: iv_ruleLocalIri= ruleLocalIri EOF
            {
             newCompositeNode(grammarAccess.getLocalIriRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalIri=ruleLocalIri();

            state._fsp--;

             current =iv_ruleLocalIri; 
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
    // $ANTLR end "entryRuleLocalIri"


    // $ANTLR start "ruleLocalIri"
    // InternalSvgPaint.g:494:1: ruleLocalIri returns [EObject current=null] : (otherlv_0= 'url' otherlv_1= '(' otherlv_2= '#' ( (lv_elementName_3_0= RULE_ID ) ) otherlv_4= ')' ) ;
    public final EObject ruleLocalIri() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_elementName_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSvgPaint.g:500:2: ( (otherlv_0= 'url' otherlv_1= '(' otherlv_2= '#' ( (lv_elementName_3_0= RULE_ID ) ) otherlv_4= ')' ) )
            // InternalSvgPaint.g:501:2: (otherlv_0= 'url' otherlv_1= '(' otherlv_2= '#' ( (lv_elementName_3_0= RULE_ID ) ) otherlv_4= ')' )
            {
            // InternalSvgPaint.g:501:2: (otherlv_0= 'url' otherlv_1= '(' otherlv_2= '#' ( (lv_elementName_3_0= RULE_ID ) ) otherlv_4= ')' )
            // InternalSvgPaint.g:502:3: otherlv_0= 'url' otherlv_1= '(' otherlv_2= '#' ( (lv_elementName_3_0= RULE_ID ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalIriAccess().getUrlKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalIriAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getLocalIriAccess().getNumberSignKeyword_2());
            		
            // InternalSvgPaint.g:514:3: ( (lv_elementName_3_0= RULE_ID ) )
            // InternalSvgPaint.g:515:4: (lv_elementName_3_0= RULE_ID )
            {
            // InternalSvgPaint.g:515:4: (lv_elementName_3_0= RULE_ID )
            // InternalSvgPaint.g:516:5: lv_elementName_3_0= RULE_ID
            {
            lv_elementName_3_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_elementName_3_0, grammarAccess.getLocalIriAccess().getElementNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalIriRule());
            					}
            					setWithLastConsumed(
            						current,
            						"elementName",
            						lv_elementName_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLocalIriAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleLocalIri"


    // $ANTLR start "ruleColorKeyword"
    // InternalSvgPaint.g:540:1: ruleColorKeyword returns [Enumerator current=null] : ( (enumLiteral_0= 'aliceblue' ) | (enumLiteral_1= 'antiquewhite' ) | (enumLiteral_2= 'aqua' ) | (enumLiteral_3= 'aquamarine' ) | (enumLiteral_4= 'azure' ) | (enumLiteral_5= 'beige' ) | (enumLiteral_6= 'bisque' ) | (enumLiteral_7= 'black' ) | (enumLiteral_8= 'blanchedalmond' ) | (enumLiteral_9= 'blue' ) | (enumLiteral_10= 'blueviolet' ) | (enumLiteral_11= 'brown' ) | (enumLiteral_12= 'burlywood' ) | (enumLiteral_13= 'cadetblue' ) | (enumLiteral_14= 'chartreuse' ) | (enumLiteral_15= 'chocolate' ) | (enumLiteral_16= 'coral' ) | (enumLiteral_17= 'cornflowerblue' ) | (enumLiteral_18= 'cornsilk' ) | (enumLiteral_19= 'crimson' ) | (enumLiteral_20= 'cyan' ) | (enumLiteral_21= 'darkblue' ) | (enumLiteral_22= 'darkcyan' ) | (enumLiteral_23= 'darkgoldenrod' ) | (enumLiteral_24= 'darkgray' ) | (enumLiteral_25= 'darkgreen' ) | (enumLiteral_26= 'darkgrey' ) | (enumLiteral_27= 'darkkhaki' ) | (enumLiteral_28= 'darkmagenta' ) | (enumLiteral_29= 'darkolivegreen' ) | (enumLiteral_30= 'darkorange' ) | (enumLiteral_31= 'darkorchid' ) | (enumLiteral_32= 'darkred' ) | (enumLiteral_33= 'darksalmon' ) | (enumLiteral_34= 'darkseagreen' ) | (enumLiteral_35= 'darkslateblue' ) | (enumLiteral_36= 'darkslategray' ) | (enumLiteral_37= 'darkslategrey' ) | (enumLiteral_38= 'darkturquoise' ) | (enumLiteral_39= 'darkviolet' ) | (enumLiteral_40= 'deeppink' ) | (enumLiteral_41= 'deepskyblue' ) | (enumLiteral_42= 'dimgray' ) | (enumLiteral_43= 'dimgrey' ) | (enumLiteral_44= 'dodgerblue' ) | (enumLiteral_45= 'firebrick' ) | (enumLiteral_46= 'floralwhite' ) | (enumLiteral_47= 'forestgreen' ) | (enumLiteral_48= 'fuchsia' ) | (enumLiteral_49= 'gainsboro' ) | (enumLiteral_50= 'ghostwhite' ) | (enumLiteral_51= 'gold' ) | (enumLiteral_52= 'goldenrod' ) | (enumLiteral_53= 'gray' ) | (enumLiteral_54= 'grey' ) | (enumLiteral_55= 'green' ) | (enumLiteral_56= 'greenyellow' ) | (enumLiteral_57= 'honeydew' ) | (enumLiteral_58= 'hotpink' ) | (enumLiteral_59= 'indianred' ) | (enumLiteral_60= 'indigo' ) | (enumLiteral_61= 'ivory' ) | (enumLiteral_62= 'khaki' ) | (enumLiteral_63= 'lavender' ) | (enumLiteral_64= 'lavenderblush' ) | (enumLiteral_65= 'lawngreen' ) | (enumLiteral_66= 'lemonchiffon' ) | (enumLiteral_67= 'lightblue' ) | (enumLiteral_68= 'lightcoral' ) | (enumLiteral_69= 'lightcyan' ) | (enumLiteral_70= 'lightgoldenrodyellow' ) | (enumLiteral_71= 'lightgray' ) | (enumLiteral_72= 'lightgreen' ) | (enumLiteral_73= 'lightgrey' ) | (enumLiteral_74= 'lightpink' ) | (enumLiteral_75= 'lightsalmon' ) | (enumLiteral_76= 'lightseagreen' ) | (enumLiteral_77= 'lightskyblue' ) | (enumLiteral_78= 'lightslategray' ) | (enumLiteral_79= 'lightslategrey' ) | (enumLiteral_80= 'lightsteelblue' ) | (enumLiteral_81= 'lightyellow' ) | (enumLiteral_82= 'lime' ) | (enumLiteral_83= 'limegreen' ) | (enumLiteral_84= 'linen' ) | (enumLiteral_85= 'magenta' ) | (enumLiteral_86= 'maroon' ) | (enumLiteral_87= 'mediumaquamarine' ) | (enumLiteral_88= 'mediumblue' ) | (enumLiteral_89= 'mediumorchid' ) | (enumLiteral_90= 'mediumpurple' ) | (enumLiteral_91= 'mediumseagreen' ) | (enumLiteral_92= 'mediumslateblue' ) | (enumLiteral_93= 'mediumspringgreen' ) | (enumLiteral_94= 'mediumturquoise' ) | (enumLiteral_95= 'mediumvioletred' ) | (enumLiteral_96= 'midnightblue' ) | (enumLiteral_97= 'mintcream' ) | (enumLiteral_98= 'mistyrose' ) | (enumLiteral_99= 'moccasin' ) | (enumLiteral_100= 'navajowhite' ) | (enumLiteral_101= 'navy' ) | (enumLiteral_102= 'oldlace' ) | (enumLiteral_103= 'olive' ) | (enumLiteral_104= 'olivedrab' ) | (enumLiteral_105= 'orange' ) | (enumLiteral_106= 'orangered' ) | (enumLiteral_107= 'orchid' ) | (enumLiteral_108= 'palegoldenrod' ) | (enumLiteral_109= 'palegreen' ) | (enumLiteral_110= 'paleturquoise' ) | (enumLiteral_111= 'palevioletred' ) | (enumLiteral_112= 'papayawhip' ) | (enumLiteral_113= 'peachpuff' ) | (enumLiteral_114= 'peru' ) | (enumLiteral_115= 'pink' ) | (enumLiteral_116= 'plum' ) | (enumLiteral_117= 'powderblue' ) | (enumLiteral_118= 'purple' ) | (enumLiteral_119= 'red' ) | (enumLiteral_120= 'rosybrown' ) | (enumLiteral_121= 'royalblue' ) | (enumLiteral_122= 'saddlebrown' ) | (enumLiteral_123= 'salmon' ) | (enumLiteral_124= 'sandybrown' ) | (enumLiteral_125= 'seagreen' ) | (enumLiteral_126= 'seashell' ) | (enumLiteral_127= 'sienna' ) | (enumLiteral_128= 'silver' ) | (enumLiteral_129= 'skyblue' ) | (enumLiteral_130= 'slateblue' ) | (enumLiteral_131= 'slategray' ) | (enumLiteral_132= 'slategrey' ) | (enumLiteral_133= 'snow' ) | (enumLiteral_134= 'springgreen' ) | (enumLiteral_135= 'steelblue' ) | (enumLiteral_136= 'tan' ) | (enumLiteral_137= 'teal' ) | (enumLiteral_138= 'thistle' ) | (enumLiteral_139= 'tomato' ) | (enumLiteral_140= 'turquoise' ) | (enumLiteral_141= 'violet' ) | (enumLiteral_142= 'wheat' ) | (enumLiteral_143= 'white' ) | (enumLiteral_144= 'whitesmoke' ) | (enumLiteral_145= 'yellow' ) | (enumLiteral_146= 'yellowgreen' ) ) ;
    public final Enumerator ruleColorKeyword() throws RecognitionException {
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
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;
        Token enumLiteral_20=null;
        Token enumLiteral_21=null;
        Token enumLiteral_22=null;
        Token enumLiteral_23=null;
        Token enumLiteral_24=null;
        Token enumLiteral_25=null;
        Token enumLiteral_26=null;
        Token enumLiteral_27=null;
        Token enumLiteral_28=null;
        Token enumLiteral_29=null;
        Token enumLiteral_30=null;
        Token enumLiteral_31=null;
        Token enumLiteral_32=null;
        Token enumLiteral_33=null;
        Token enumLiteral_34=null;
        Token enumLiteral_35=null;
        Token enumLiteral_36=null;
        Token enumLiteral_37=null;
        Token enumLiteral_38=null;
        Token enumLiteral_39=null;
        Token enumLiteral_40=null;
        Token enumLiteral_41=null;
        Token enumLiteral_42=null;
        Token enumLiteral_43=null;
        Token enumLiteral_44=null;
        Token enumLiteral_45=null;
        Token enumLiteral_46=null;
        Token enumLiteral_47=null;
        Token enumLiteral_48=null;
        Token enumLiteral_49=null;
        Token enumLiteral_50=null;
        Token enumLiteral_51=null;
        Token enumLiteral_52=null;
        Token enumLiteral_53=null;
        Token enumLiteral_54=null;
        Token enumLiteral_55=null;
        Token enumLiteral_56=null;
        Token enumLiteral_57=null;
        Token enumLiteral_58=null;
        Token enumLiteral_59=null;
        Token enumLiteral_60=null;
        Token enumLiteral_61=null;
        Token enumLiteral_62=null;
        Token enumLiteral_63=null;
        Token enumLiteral_64=null;
        Token enumLiteral_65=null;
        Token enumLiteral_66=null;
        Token enumLiteral_67=null;
        Token enumLiteral_68=null;
        Token enumLiteral_69=null;
        Token enumLiteral_70=null;
        Token enumLiteral_71=null;
        Token enumLiteral_72=null;
        Token enumLiteral_73=null;
        Token enumLiteral_74=null;
        Token enumLiteral_75=null;
        Token enumLiteral_76=null;
        Token enumLiteral_77=null;
        Token enumLiteral_78=null;
        Token enumLiteral_79=null;
        Token enumLiteral_80=null;
        Token enumLiteral_81=null;
        Token enumLiteral_82=null;
        Token enumLiteral_83=null;
        Token enumLiteral_84=null;
        Token enumLiteral_85=null;
        Token enumLiteral_86=null;
        Token enumLiteral_87=null;
        Token enumLiteral_88=null;
        Token enumLiteral_89=null;
        Token enumLiteral_90=null;
        Token enumLiteral_91=null;
        Token enumLiteral_92=null;
        Token enumLiteral_93=null;
        Token enumLiteral_94=null;
        Token enumLiteral_95=null;
        Token enumLiteral_96=null;
        Token enumLiteral_97=null;
        Token enumLiteral_98=null;
        Token enumLiteral_99=null;
        Token enumLiteral_100=null;
        Token enumLiteral_101=null;
        Token enumLiteral_102=null;
        Token enumLiteral_103=null;
        Token enumLiteral_104=null;
        Token enumLiteral_105=null;
        Token enumLiteral_106=null;
        Token enumLiteral_107=null;
        Token enumLiteral_108=null;
        Token enumLiteral_109=null;
        Token enumLiteral_110=null;
        Token enumLiteral_111=null;
        Token enumLiteral_112=null;
        Token enumLiteral_113=null;
        Token enumLiteral_114=null;
        Token enumLiteral_115=null;
        Token enumLiteral_116=null;
        Token enumLiteral_117=null;
        Token enumLiteral_118=null;
        Token enumLiteral_119=null;
        Token enumLiteral_120=null;
        Token enumLiteral_121=null;
        Token enumLiteral_122=null;
        Token enumLiteral_123=null;
        Token enumLiteral_124=null;
        Token enumLiteral_125=null;
        Token enumLiteral_126=null;
        Token enumLiteral_127=null;
        Token enumLiteral_128=null;
        Token enumLiteral_129=null;
        Token enumLiteral_130=null;
        Token enumLiteral_131=null;
        Token enumLiteral_132=null;
        Token enumLiteral_133=null;
        Token enumLiteral_134=null;
        Token enumLiteral_135=null;
        Token enumLiteral_136=null;
        Token enumLiteral_137=null;
        Token enumLiteral_138=null;
        Token enumLiteral_139=null;
        Token enumLiteral_140=null;
        Token enumLiteral_141=null;
        Token enumLiteral_142=null;
        Token enumLiteral_143=null;
        Token enumLiteral_144=null;
        Token enumLiteral_145=null;
        Token enumLiteral_146=null;


        	enterRule();

        try {
            // InternalSvgPaint.g:546:2: ( ( (enumLiteral_0= 'aliceblue' ) | (enumLiteral_1= 'antiquewhite' ) | (enumLiteral_2= 'aqua' ) | (enumLiteral_3= 'aquamarine' ) | (enumLiteral_4= 'azure' ) | (enumLiteral_5= 'beige' ) | (enumLiteral_6= 'bisque' ) | (enumLiteral_7= 'black' ) | (enumLiteral_8= 'blanchedalmond' ) | (enumLiteral_9= 'blue' ) | (enumLiteral_10= 'blueviolet' ) | (enumLiteral_11= 'brown' ) | (enumLiteral_12= 'burlywood' ) | (enumLiteral_13= 'cadetblue' ) | (enumLiteral_14= 'chartreuse' ) | (enumLiteral_15= 'chocolate' ) | (enumLiteral_16= 'coral' ) | (enumLiteral_17= 'cornflowerblue' ) | (enumLiteral_18= 'cornsilk' ) | (enumLiteral_19= 'crimson' ) | (enumLiteral_20= 'cyan' ) | (enumLiteral_21= 'darkblue' ) | (enumLiteral_22= 'darkcyan' ) | (enumLiteral_23= 'darkgoldenrod' ) | (enumLiteral_24= 'darkgray' ) | (enumLiteral_25= 'darkgreen' ) | (enumLiteral_26= 'darkgrey' ) | (enumLiteral_27= 'darkkhaki' ) | (enumLiteral_28= 'darkmagenta' ) | (enumLiteral_29= 'darkolivegreen' ) | (enumLiteral_30= 'darkorange' ) | (enumLiteral_31= 'darkorchid' ) | (enumLiteral_32= 'darkred' ) | (enumLiteral_33= 'darksalmon' ) | (enumLiteral_34= 'darkseagreen' ) | (enumLiteral_35= 'darkslateblue' ) | (enumLiteral_36= 'darkslategray' ) | (enumLiteral_37= 'darkslategrey' ) | (enumLiteral_38= 'darkturquoise' ) | (enumLiteral_39= 'darkviolet' ) | (enumLiteral_40= 'deeppink' ) | (enumLiteral_41= 'deepskyblue' ) | (enumLiteral_42= 'dimgray' ) | (enumLiteral_43= 'dimgrey' ) | (enumLiteral_44= 'dodgerblue' ) | (enumLiteral_45= 'firebrick' ) | (enumLiteral_46= 'floralwhite' ) | (enumLiteral_47= 'forestgreen' ) | (enumLiteral_48= 'fuchsia' ) | (enumLiteral_49= 'gainsboro' ) | (enumLiteral_50= 'ghostwhite' ) | (enumLiteral_51= 'gold' ) | (enumLiteral_52= 'goldenrod' ) | (enumLiteral_53= 'gray' ) | (enumLiteral_54= 'grey' ) | (enumLiteral_55= 'green' ) | (enumLiteral_56= 'greenyellow' ) | (enumLiteral_57= 'honeydew' ) | (enumLiteral_58= 'hotpink' ) | (enumLiteral_59= 'indianred' ) | (enumLiteral_60= 'indigo' ) | (enumLiteral_61= 'ivory' ) | (enumLiteral_62= 'khaki' ) | (enumLiteral_63= 'lavender' ) | (enumLiteral_64= 'lavenderblush' ) | (enumLiteral_65= 'lawngreen' ) | (enumLiteral_66= 'lemonchiffon' ) | (enumLiteral_67= 'lightblue' ) | (enumLiteral_68= 'lightcoral' ) | (enumLiteral_69= 'lightcyan' ) | (enumLiteral_70= 'lightgoldenrodyellow' ) | (enumLiteral_71= 'lightgray' ) | (enumLiteral_72= 'lightgreen' ) | (enumLiteral_73= 'lightgrey' ) | (enumLiteral_74= 'lightpink' ) | (enumLiteral_75= 'lightsalmon' ) | (enumLiteral_76= 'lightseagreen' ) | (enumLiteral_77= 'lightskyblue' ) | (enumLiteral_78= 'lightslategray' ) | (enumLiteral_79= 'lightslategrey' ) | (enumLiteral_80= 'lightsteelblue' ) | (enumLiteral_81= 'lightyellow' ) | (enumLiteral_82= 'lime' ) | (enumLiteral_83= 'limegreen' ) | (enumLiteral_84= 'linen' ) | (enumLiteral_85= 'magenta' ) | (enumLiteral_86= 'maroon' ) | (enumLiteral_87= 'mediumaquamarine' ) | (enumLiteral_88= 'mediumblue' ) | (enumLiteral_89= 'mediumorchid' ) | (enumLiteral_90= 'mediumpurple' ) | (enumLiteral_91= 'mediumseagreen' ) | (enumLiteral_92= 'mediumslateblue' ) | (enumLiteral_93= 'mediumspringgreen' ) | (enumLiteral_94= 'mediumturquoise' ) | (enumLiteral_95= 'mediumvioletred' ) | (enumLiteral_96= 'midnightblue' ) | (enumLiteral_97= 'mintcream' ) | (enumLiteral_98= 'mistyrose' ) | (enumLiteral_99= 'moccasin' ) | (enumLiteral_100= 'navajowhite' ) | (enumLiteral_101= 'navy' ) | (enumLiteral_102= 'oldlace' ) | (enumLiteral_103= 'olive' ) | (enumLiteral_104= 'olivedrab' ) | (enumLiteral_105= 'orange' ) | (enumLiteral_106= 'orangered' ) | (enumLiteral_107= 'orchid' ) | (enumLiteral_108= 'palegoldenrod' ) | (enumLiteral_109= 'palegreen' ) | (enumLiteral_110= 'paleturquoise' ) | (enumLiteral_111= 'palevioletred' ) | (enumLiteral_112= 'papayawhip' ) | (enumLiteral_113= 'peachpuff' ) | (enumLiteral_114= 'peru' ) | (enumLiteral_115= 'pink' ) | (enumLiteral_116= 'plum' ) | (enumLiteral_117= 'powderblue' ) | (enumLiteral_118= 'purple' ) | (enumLiteral_119= 'red' ) | (enumLiteral_120= 'rosybrown' ) | (enumLiteral_121= 'royalblue' ) | (enumLiteral_122= 'saddlebrown' ) | (enumLiteral_123= 'salmon' ) | (enumLiteral_124= 'sandybrown' ) | (enumLiteral_125= 'seagreen' ) | (enumLiteral_126= 'seashell' ) | (enumLiteral_127= 'sienna' ) | (enumLiteral_128= 'silver' ) | (enumLiteral_129= 'skyblue' ) | (enumLiteral_130= 'slateblue' ) | (enumLiteral_131= 'slategray' ) | (enumLiteral_132= 'slategrey' ) | (enumLiteral_133= 'snow' ) | (enumLiteral_134= 'springgreen' ) | (enumLiteral_135= 'steelblue' ) | (enumLiteral_136= 'tan' ) | (enumLiteral_137= 'teal' ) | (enumLiteral_138= 'thistle' ) | (enumLiteral_139= 'tomato' ) | (enumLiteral_140= 'turquoise' ) | (enumLiteral_141= 'violet' ) | (enumLiteral_142= 'wheat' ) | (enumLiteral_143= 'white' ) | (enumLiteral_144= 'whitesmoke' ) | (enumLiteral_145= 'yellow' ) | (enumLiteral_146= 'yellowgreen' ) ) )
            // InternalSvgPaint.g:547:2: ( (enumLiteral_0= 'aliceblue' ) | (enumLiteral_1= 'antiquewhite' ) | (enumLiteral_2= 'aqua' ) | (enumLiteral_3= 'aquamarine' ) | (enumLiteral_4= 'azure' ) | (enumLiteral_5= 'beige' ) | (enumLiteral_6= 'bisque' ) | (enumLiteral_7= 'black' ) | (enumLiteral_8= 'blanchedalmond' ) | (enumLiteral_9= 'blue' ) | (enumLiteral_10= 'blueviolet' ) | (enumLiteral_11= 'brown' ) | (enumLiteral_12= 'burlywood' ) | (enumLiteral_13= 'cadetblue' ) | (enumLiteral_14= 'chartreuse' ) | (enumLiteral_15= 'chocolate' ) | (enumLiteral_16= 'coral' ) | (enumLiteral_17= 'cornflowerblue' ) | (enumLiteral_18= 'cornsilk' ) | (enumLiteral_19= 'crimson' ) | (enumLiteral_20= 'cyan' ) | (enumLiteral_21= 'darkblue' ) | (enumLiteral_22= 'darkcyan' ) | (enumLiteral_23= 'darkgoldenrod' ) | (enumLiteral_24= 'darkgray' ) | (enumLiteral_25= 'darkgreen' ) | (enumLiteral_26= 'darkgrey' ) | (enumLiteral_27= 'darkkhaki' ) | (enumLiteral_28= 'darkmagenta' ) | (enumLiteral_29= 'darkolivegreen' ) | (enumLiteral_30= 'darkorange' ) | (enumLiteral_31= 'darkorchid' ) | (enumLiteral_32= 'darkred' ) | (enumLiteral_33= 'darksalmon' ) | (enumLiteral_34= 'darkseagreen' ) | (enumLiteral_35= 'darkslateblue' ) | (enumLiteral_36= 'darkslategray' ) | (enumLiteral_37= 'darkslategrey' ) | (enumLiteral_38= 'darkturquoise' ) | (enumLiteral_39= 'darkviolet' ) | (enumLiteral_40= 'deeppink' ) | (enumLiteral_41= 'deepskyblue' ) | (enumLiteral_42= 'dimgray' ) | (enumLiteral_43= 'dimgrey' ) | (enumLiteral_44= 'dodgerblue' ) | (enumLiteral_45= 'firebrick' ) | (enumLiteral_46= 'floralwhite' ) | (enumLiteral_47= 'forestgreen' ) | (enumLiteral_48= 'fuchsia' ) | (enumLiteral_49= 'gainsboro' ) | (enumLiteral_50= 'ghostwhite' ) | (enumLiteral_51= 'gold' ) | (enumLiteral_52= 'goldenrod' ) | (enumLiteral_53= 'gray' ) | (enumLiteral_54= 'grey' ) | (enumLiteral_55= 'green' ) | (enumLiteral_56= 'greenyellow' ) | (enumLiteral_57= 'honeydew' ) | (enumLiteral_58= 'hotpink' ) | (enumLiteral_59= 'indianred' ) | (enumLiteral_60= 'indigo' ) | (enumLiteral_61= 'ivory' ) | (enumLiteral_62= 'khaki' ) | (enumLiteral_63= 'lavender' ) | (enumLiteral_64= 'lavenderblush' ) | (enumLiteral_65= 'lawngreen' ) | (enumLiteral_66= 'lemonchiffon' ) | (enumLiteral_67= 'lightblue' ) | (enumLiteral_68= 'lightcoral' ) | (enumLiteral_69= 'lightcyan' ) | (enumLiteral_70= 'lightgoldenrodyellow' ) | (enumLiteral_71= 'lightgray' ) | (enumLiteral_72= 'lightgreen' ) | (enumLiteral_73= 'lightgrey' ) | (enumLiteral_74= 'lightpink' ) | (enumLiteral_75= 'lightsalmon' ) | (enumLiteral_76= 'lightseagreen' ) | (enumLiteral_77= 'lightskyblue' ) | (enumLiteral_78= 'lightslategray' ) | (enumLiteral_79= 'lightslategrey' ) | (enumLiteral_80= 'lightsteelblue' ) | (enumLiteral_81= 'lightyellow' ) | (enumLiteral_82= 'lime' ) | (enumLiteral_83= 'limegreen' ) | (enumLiteral_84= 'linen' ) | (enumLiteral_85= 'magenta' ) | (enumLiteral_86= 'maroon' ) | (enumLiteral_87= 'mediumaquamarine' ) | (enumLiteral_88= 'mediumblue' ) | (enumLiteral_89= 'mediumorchid' ) | (enumLiteral_90= 'mediumpurple' ) | (enumLiteral_91= 'mediumseagreen' ) | (enumLiteral_92= 'mediumslateblue' ) | (enumLiteral_93= 'mediumspringgreen' ) | (enumLiteral_94= 'mediumturquoise' ) | (enumLiteral_95= 'mediumvioletred' ) | (enumLiteral_96= 'midnightblue' ) | (enumLiteral_97= 'mintcream' ) | (enumLiteral_98= 'mistyrose' ) | (enumLiteral_99= 'moccasin' ) | (enumLiteral_100= 'navajowhite' ) | (enumLiteral_101= 'navy' ) | (enumLiteral_102= 'oldlace' ) | (enumLiteral_103= 'olive' ) | (enumLiteral_104= 'olivedrab' ) | (enumLiteral_105= 'orange' ) | (enumLiteral_106= 'orangered' ) | (enumLiteral_107= 'orchid' ) | (enumLiteral_108= 'palegoldenrod' ) | (enumLiteral_109= 'palegreen' ) | (enumLiteral_110= 'paleturquoise' ) | (enumLiteral_111= 'palevioletred' ) | (enumLiteral_112= 'papayawhip' ) | (enumLiteral_113= 'peachpuff' ) | (enumLiteral_114= 'peru' ) | (enumLiteral_115= 'pink' ) | (enumLiteral_116= 'plum' ) | (enumLiteral_117= 'powderblue' ) | (enumLiteral_118= 'purple' ) | (enumLiteral_119= 'red' ) | (enumLiteral_120= 'rosybrown' ) | (enumLiteral_121= 'royalblue' ) | (enumLiteral_122= 'saddlebrown' ) | (enumLiteral_123= 'salmon' ) | (enumLiteral_124= 'sandybrown' ) | (enumLiteral_125= 'seagreen' ) | (enumLiteral_126= 'seashell' ) | (enumLiteral_127= 'sienna' ) | (enumLiteral_128= 'silver' ) | (enumLiteral_129= 'skyblue' ) | (enumLiteral_130= 'slateblue' ) | (enumLiteral_131= 'slategray' ) | (enumLiteral_132= 'slategrey' ) | (enumLiteral_133= 'snow' ) | (enumLiteral_134= 'springgreen' ) | (enumLiteral_135= 'steelblue' ) | (enumLiteral_136= 'tan' ) | (enumLiteral_137= 'teal' ) | (enumLiteral_138= 'thistle' ) | (enumLiteral_139= 'tomato' ) | (enumLiteral_140= 'turquoise' ) | (enumLiteral_141= 'violet' ) | (enumLiteral_142= 'wheat' ) | (enumLiteral_143= 'white' ) | (enumLiteral_144= 'whitesmoke' ) | (enumLiteral_145= 'yellow' ) | (enumLiteral_146= 'yellowgreen' ) )
            {
            // InternalSvgPaint.g:547:2: ( (enumLiteral_0= 'aliceblue' ) | (enumLiteral_1= 'antiquewhite' ) | (enumLiteral_2= 'aqua' ) | (enumLiteral_3= 'aquamarine' ) | (enumLiteral_4= 'azure' ) | (enumLiteral_5= 'beige' ) | (enumLiteral_6= 'bisque' ) | (enumLiteral_7= 'black' ) | (enumLiteral_8= 'blanchedalmond' ) | (enumLiteral_9= 'blue' ) | (enumLiteral_10= 'blueviolet' ) | (enumLiteral_11= 'brown' ) | (enumLiteral_12= 'burlywood' ) | (enumLiteral_13= 'cadetblue' ) | (enumLiteral_14= 'chartreuse' ) | (enumLiteral_15= 'chocolate' ) | (enumLiteral_16= 'coral' ) | (enumLiteral_17= 'cornflowerblue' ) | (enumLiteral_18= 'cornsilk' ) | (enumLiteral_19= 'crimson' ) | (enumLiteral_20= 'cyan' ) | (enumLiteral_21= 'darkblue' ) | (enumLiteral_22= 'darkcyan' ) | (enumLiteral_23= 'darkgoldenrod' ) | (enumLiteral_24= 'darkgray' ) | (enumLiteral_25= 'darkgreen' ) | (enumLiteral_26= 'darkgrey' ) | (enumLiteral_27= 'darkkhaki' ) | (enumLiteral_28= 'darkmagenta' ) | (enumLiteral_29= 'darkolivegreen' ) | (enumLiteral_30= 'darkorange' ) | (enumLiteral_31= 'darkorchid' ) | (enumLiteral_32= 'darkred' ) | (enumLiteral_33= 'darksalmon' ) | (enumLiteral_34= 'darkseagreen' ) | (enumLiteral_35= 'darkslateblue' ) | (enumLiteral_36= 'darkslategray' ) | (enumLiteral_37= 'darkslategrey' ) | (enumLiteral_38= 'darkturquoise' ) | (enumLiteral_39= 'darkviolet' ) | (enumLiteral_40= 'deeppink' ) | (enumLiteral_41= 'deepskyblue' ) | (enumLiteral_42= 'dimgray' ) | (enumLiteral_43= 'dimgrey' ) | (enumLiteral_44= 'dodgerblue' ) | (enumLiteral_45= 'firebrick' ) | (enumLiteral_46= 'floralwhite' ) | (enumLiteral_47= 'forestgreen' ) | (enumLiteral_48= 'fuchsia' ) | (enumLiteral_49= 'gainsboro' ) | (enumLiteral_50= 'ghostwhite' ) | (enumLiteral_51= 'gold' ) | (enumLiteral_52= 'goldenrod' ) | (enumLiteral_53= 'gray' ) | (enumLiteral_54= 'grey' ) | (enumLiteral_55= 'green' ) | (enumLiteral_56= 'greenyellow' ) | (enumLiteral_57= 'honeydew' ) | (enumLiteral_58= 'hotpink' ) | (enumLiteral_59= 'indianred' ) | (enumLiteral_60= 'indigo' ) | (enumLiteral_61= 'ivory' ) | (enumLiteral_62= 'khaki' ) | (enumLiteral_63= 'lavender' ) | (enumLiteral_64= 'lavenderblush' ) | (enumLiteral_65= 'lawngreen' ) | (enumLiteral_66= 'lemonchiffon' ) | (enumLiteral_67= 'lightblue' ) | (enumLiteral_68= 'lightcoral' ) | (enumLiteral_69= 'lightcyan' ) | (enumLiteral_70= 'lightgoldenrodyellow' ) | (enumLiteral_71= 'lightgray' ) | (enumLiteral_72= 'lightgreen' ) | (enumLiteral_73= 'lightgrey' ) | (enumLiteral_74= 'lightpink' ) | (enumLiteral_75= 'lightsalmon' ) | (enumLiteral_76= 'lightseagreen' ) | (enumLiteral_77= 'lightskyblue' ) | (enumLiteral_78= 'lightslategray' ) | (enumLiteral_79= 'lightslategrey' ) | (enumLiteral_80= 'lightsteelblue' ) | (enumLiteral_81= 'lightyellow' ) | (enumLiteral_82= 'lime' ) | (enumLiteral_83= 'limegreen' ) | (enumLiteral_84= 'linen' ) | (enumLiteral_85= 'magenta' ) | (enumLiteral_86= 'maroon' ) | (enumLiteral_87= 'mediumaquamarine' ) | (enumLiteral_88= 'mediumblue' ) | (enumLiteral_89= 'mediumorchid' ) | (enumLiteral_90= 'mediumpurple' ) | (enumLiteral_91= 'mediumseagreen' ) | (enumLiteral_92= 'mediumslateblue' ) | (enumLiteral_93= 'mediumspringgreen' ) | (enumLiteral_94= 'mediumturquoise' ) | (enumLiteral_95= 'mediumvioletred' ) | (enumLiteral_96= 'midnightblue' ) | (enumLiteral_97= 'mintcream' ) | (enumLiteral_98= 'mistyrose' ) | (enumLiteral_99= 'moccasin' ) | (enumLiteral_100= 'navajowhite' ) | (enumLiteral_101= 'navy' ) | (enumLiteral_102= 'oldlace' ) | (enumLiteral_103= 'olive' ) | (enumLiteral_104= 'olivedrab' ) | (enumLiteral_105= 'orange' ) | (enumLiteral_106= 'orangered' ) | (enumLiteral_107= 'orchid' ) | (enumLiteral_108= 'palegoldenrod' ) | (enumLiteral_109= 'palegreen' ) | (enumLiteral_110= 'paleturquoise' ) | (enumLiteral_111= 'palevioletred' ) | (enumLiteral_112= 'papayawhip' ) | (enumLiteral_113= 'peachpuff' ) | (enumLiteral_114= 'peru' ) | (enumLiteral_115= 'pink' ) | (enumLiteral_116= 'plum' ) | (enumLiteral_117= 'powderblue' ) | (enumLiteral_118= 'purple' ) | (enumLiteral_119= 'red' ) | (enumLiteral_120= 'rosybrown' ) | (enumLiteral_121= 'royalblue' ) | (enumLiteral_122= 'saddlebrown' ) | (enumLiteral_123= 'salmon' ) | (enumLiteral_124= 'sandybrown' ) | (enumLiteral_125= 'seagreen' ) | (enumLiteral_126= 'seashell' ) | (enumLiteral_127= 'sienna' ) | (enumLiteral_128= 'silver' ) | (enumLiteral_129= 'skyblue' ) | (enumLiteral_130= 'slateblue' ) | (enumLiteral_131= 'slategray' ) | (enumLiteral_132= 'slategrey' ) | (enumLiteral_133= 'snow' ) | (enumLiteral_134= 'springgreen' ) | (enumLiteral_135= 'steelblue' ) | (enumLiteral_136= 'tan' ) | (enumLiteral_137= 'teal' ) | (enumLiteral_138= 'thistle' ) | (enumLiteral_139= 'tomato' ) | (enumLiteral_140= 'turquoise' ) | (enumLiteral_141= 'violet' ) | (enumLiteral_142= 'wheat' ) | (enumLiteral_143= 'white' ) | (enumLiteral_144= 'whitesmoke' ) | (enumLiteral_145= 'yellow' ) | (enumLiteral_146= 'yellowgreen' ) )
            int alt3=147;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 23:
                {
                alt3=3;
                }
                break;
            case 24:
                {
                alt3=4;
                }
                break;
            case 25:
                {
                alt3=5;
                }
                break;
            case 26:
                {
                alt3=6;
                }
                break;
            case 27:
                {
                alt3=7;
                }
                break;
            case 28:
                {
                alt3=8;
                }
                break;
            case 29:
                {
                alt3=9;
                }
                break;
            case 30:
                {
                alt3=10;
                }
                break;
            case 31:
                {
                alt3=11;
                }
                break;
            case 32:
                {
                alt3=12;
                }
                break;
            case 33:
                {
                alt3=13;
                }
                break;
            case 34:
                {
                alt3=14;
                }
                break;
            case 35:
                {
                alt3=15;
                }
                break;
            case 36:
                {
                alt3=16;
                }
                break;
            case 37:
                {
                alt3=17;
                }
                break;
            case 38:
                {
                alt3=18;
                }
                break;
            case 39:
                {
                alt3=19;
                }
                break;
            case 40:
                {
                alt3=20;
                }
                break;
            case 41:
                {
                alt3=21;
                }
                break;
            case 42:
                {
                alt3=22;
                }
                break;
            case 43:
                {
                alt3=23;
                }
                break;
            case 44:
                {
                alt3=24;
                }
                break;
            case 45:
                {
                alt3=25;
                }
                break;
            case 46:
                {
                alt3=26;
                }
                break;
            case 47:
                {
                alt3=27;
                }
                break;
            case 48:
                {
                alt3=28;
                }
                break;
            case 49:
                {
                alt3=29;
                }
                break;
            case 50:
                {
                alt3=30;
                }
                break;
            case 51:
                {
                alt3=31;
                }
                break;
            case 52:
                {
                alt3=32;
                }
                break;
            case 53:
                {
                alt3=33;
                }
                break;
            case 54:
                {
                alt3=34;
                }
                break;
            case 55:
                {
                alt3=35;
                }
                break;
            case 56:
                {
                alt3=36;
                }
                break;
            case 57:
                {
                alt3=37;
                }
                break;
            case 58:
                {
                alt3=38;
                }
                break;
            case 59:
                {
                alt3=39;
                }
                break;
            case 60:
                {
                alt3=40;
                }
                break;
            case 61:
                {
                alt3=41;
                }
                break;
            case 62:
                {
                alt3=42;
                }
                break;
            case 63:
                {
                alt3=43;
                }
                break;
            case 64:
                {
                alt3=44;
                }
                break;
            case 65:
                {
                alt3=45;
                }
                break;
            case 66:
                {
                alt3=46;
                }
                break;
            case 67:
                {
                alt3=47;
                }
                break;
            case 68:
                {
                alt3=48;
                }
                break;
            case 69:
                {
                alt3=49;
                }
                break;
            case 70:
                {
                alt3=50;
                }
                break;
            case 71:
                {
                alt3=51;
                }
                break;
            case 72:
                {
                alt3=52;
                }
                break;
            case 73:
                {
                alt3=53;
                }
                break;
            case 74:
                {
                alt3=54;
                }
                break;
            case 75:
                {
                alt3=55;
                }
                break;
            case 76:
                {
                alt3=56;
                }
                break;
            case 77:
                {
                alt3=57;
                }
                break;
            case 78:
                {
                alt3=58;
                }
                break;
            case 79:
                {
                alt3=59;
                }
                break;
            case 80:
                {
                alt3=60;
                }
                break;
            case 81:
                {
                alt3=61;
                }
                break;
            case 82:
                {
                alt3=62;
                }
                break;
            case 83:
                {
                alt3=63;
                }
                break;
            case 84:
                {
                alt3=64;
                }
                break;
            case 85:
                {
                alt3=65;
                }
                break;
            case 86:
                {
                alt3=66;
                }
                break;
            case 87:
                {
                alt3=67;
                }
                break;
            case 88:
                {
                alt3=68;
                }
                break;
            case 89:
                {
                alt3=69;
                }
                break;
            case 90:
                {
                alt3=70;
                }
                break;
            case 91:
                {
                alt3=71;
                }
                break;
            case 92:
                {
                alt3=72;
                }
                break;
            case 93:
                {
                alt3=73;
                }
                break;
            case 94:
                {
                alt3=74;
                }
                break;
            case 95:
                {
                alt3=75;
                }
                break;
            case 96:
                {
                alt3=76;
                }
                break;
            case 97:
                {
                alt3=77;
                }
                break;
            case 98:
                {
                alt3=78;
                }
                break;
            case 99:
                {
                alt3=79;
                }
                break;
            case 100:
                {
                alt3=80;
                }
                break;
            case 101:
                {
                alt3=81;
                }
                break;
            case 102:
                {
                alt3=82;
                }
                break;
            case 103:
                {
                alt3=83;
                }
                break;
            case 104:
                {
                alt3=84;
                }
                break;
            case 105:
                {
                alt3=85;
                }
                break;
            case 106:
                {
                alt3=86;
                }
                break;
            case 107:
                {
                alt3=87;
                }
                break;
            case 108:
                {
                alt3=88;
                }
                break;
            case 109:
                {
                alt3=89;
                }
                break;
            case 110:
                {
                alt3=90;
                }
                break;
            case 111:
                {
                alt3=91;
                }
                break;
            case 112:
                {
                alt3=92;
                }
                break;
            case 113:
                {
                alt3=93;
                }
                break;
            case 114:
                {
                alt3=94;
                }
                break;
            case 115:
                {
                alt3=95;
                }
                break;
            case 116:
                {
                alt3=96;
                }
                break;
            case 117:
                {
                alt3=97;
                }
                break;
            case 118:
                {
                alt3=98;
                }
                break;
            case 119:
                {
                alt3=99;
                }
                break;
            case 120:
                {
                alt3=100;
                }
                break;
            case 121:
                {
                alt3=101;
                }
                break;
            case 122:
                {
                alt3=102;
                }
                break;
            case 123:
                {
                alt3=103;
                }
                break;
            case 124:
                {
                alt3=104;
                }
                break;
            case 125:
                {
                alt3=105;
                }
                break;
            case 126:
                {
                alt3=106;
                }
                break;
            case 127:
                {
                alt3=107;
                }
                break;
            case 128:
                {
                alt3=108;
                }
                break;
            case 129:
                {
                alt3=109;
                }
                break;
            case 130:
                {
                alt3=110;
                }
                break;
            case 131:
                {
                alt3=111;
                }
                break;
            case 132:
                {
                alt3=112;
                }
                break;
            case 133:
                {
                alt3=113;
                }
                break;
            case 134:
                {
                alt3=114;
                }
                break;
            case 135:
                {
                alt3=115;
                }
                break;
            case 136:
                {
                alt3=116;
                }
                break;
            case 137:
                {
                alt3=117;
                }
                break;
            case 138:
                {
                alt3=118;
                }
                break;
            case 139:
                {
                alt3=119;
                }
                break;
            case 140:
                {
                alt3=120;
                }
                break;
            case 141:
                {
                alt3=121;
                }
                break;
            case 142:
                {
                alt3=122;
                }
                break;
            case 143:
                {
                alt3=123;
                }
                break;
            case 144:
                {
                alt3=124;
                }
                break;
            case 145:
                {
                alt3=125;
                }
                break;
            case 146:
                {
                alt3=126;
                }
                break;
            case 147:
                {
                alt3=127;
                }
                break;
            case 148:
                {
                alt3=128;
                }
                break;
            case 149:
                {
                alt3=129;
                }
                break;
            case 150:
                {
                alt3=130;
                }
                break;
            case 151:
                {
                alt3=131;
                }
                break;
            case 152:
                {
                alt3=132;
                }
                break;
            case 153:
                {
                alt3=133;
                }
                break;
            case 154:
                {
                alt3=134;
                }
                break;
            case 155:
                {
                alt3=135;
                }
                break;
            case 156:
                {
                alt3=136;
                }
                break;
            case 157:
                {
                alt3=137;
                }
                break;
            case 158:
                {
                alt3=138;
                }
                break;
            case 159:
                {
                alt3=139;
                }
                break;
            case 160:
                {
                alt3=140;
                }
                break;
            case 161:
                {
                alt3=141;
                }
                break;
            case 162:
                {
                alt3=142;
                }
                break;
            case 163:
                {
                alt3=143;
                }
                break;
            case 164:
                {
                alt3=144;
                }
                break;
            case 165:
                {
                alt3=145;
                }
                break;
            case 166:
                {
                alt3=146;
                }
                break;
            case 167:
                {
                alt3=147;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSvgPaint.g:548:3: (enumLiteral_0= 'aliceblue' )
                    {
                    // InternalSvgPaint.g:548:3: (enumLiteral_0= 'aliceblue' )
                    // InternalSvgPaint.g:549:4: enumLiteral_0= 'aliceblue'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getAliceblueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorKeywordAccess().getAliceblueEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSvgPaint.g:556:3: (enumLiteral_1= 'antiquewhite' )
                    {
                    // InternalSvgPaint.g:556:3: (enumLiteral_1= 'antiquewhite' )
                    // InternalSvgPaint.g:557:4: enumLiteral_1= 'antiquewhite'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getAntiquewhiteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorKeywordAccess().getAntiquewhiteEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSvgPaint.g:564:3: (enumLiteral_2= 'aqua' )
                    {
                    // InternalSvgPaint.g:564:3: (enumLiteral_2= 'aqua' )
                    // InternalSvgPaint.g:565:4: enumLiteral_2= 'aqua'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getAquaEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorKeywordAccess().getAquaEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSvgPaint.g:572:3: (enumLiteral_3= 'aquamarine' )
                    {
                    // InternalSvgPaint.g:572:3: (enumLiteral_3= 'aquamarine' )
                    // InternalSvgPaint.g:573:4: enumLiteral_3= 'aquamarine'
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getAquamarineEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorKeywordAccess().getAquamarineEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSvgPaint.g:580:3: (enumLiteral_4= 'azure' )
                    {
                    // InternalSvgPaint.g:580:3: (enumLiteral_4= 'azure' )
                    // InternalSvgPaint.g:581:4: enumLiteral_4= 'azure'
                    {
                    enumLiteral_4=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getAzureEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getColorKeywordAccess().getAzureEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSvgPaint.g:588:3: (enumLiteral_5= 'beige' )
                    {
                    // InternalSvgPaint.g:588:3: (enumLiteral_5= 'beige' )
                    // InternalSvgPaint.g:589:4: enumLiteral_5= 'beige'
                    {
                    enumLiteral_5=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getBeigeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getColorKeywordAccess().getBeigeEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSvgPaint.g:596:3: (enumLiteral_6= 'bisque' )
                    {
                    // InternalSvgPaint.g:596:3: (enumLiteral_6= 'bisque' )
                    // InternalSvgPaint.g:597:4: enumLiteral_6= 'bisque'
                    {
                    enumLiteral_6=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getBisqueEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getColorKeywordAccess().getBisqueEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSvgPaint.g:604:3: (enumLiteral_7= 'black' )
                    {
                    // InternalSvgPaint.g:604:3: (enumLiteral_7= 'black' )
                    // InternalSvgPaint.g:605:4: enumLiteral_7= 'black'
                    {
                    enumLiteral_7=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getBlackEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getColorKeywordAccess().getBlackEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSvgPaint.g:612:3: (enumLiteral_8= 'blanchedalmond' )
                    {
                    // InternalSvgPaint.g:612:3: (enumLiteral_8= 'blanchedalmond' )
                    // InternalSvgPaint.g:613:4: enumLiteral_8= 'blanchedalmond'
                    {
                    enumLiteral_8=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getBlanchedalmondEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getColorKeywordAccess().getBlanchedalmondEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalSvgPaint.g:620:3: (enumLiteral_9= 'blue' )
                    {
                    // InternalSvgPaint.g:620:3: (enumLiteral_9= 'blue' )
                    // InternalSvgPaint.g:621:4: enumLiteral_9= 'blue'
                    {
                    enumLiteral_9=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getBlueEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getColorKeywordAccess().getBlueEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalSvgPaint.g:628:3: (enumLiteral_10= 'blueviolet' )
                    {
                    // InternalSvgPaint.g:628:3: (enumLiteral_10= 'blueviolet' )
                    // InternalSvgPaint.g:629:4: enumLiteral_10= 'blueviolet'
                    {
                    enumLiteral_10=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getBluevioletEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getColorKeywordAccess().getBluevioletEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalSvgPaint.g:636:3: (enumLiteral_11= 'brown' )
                    {
                    // InternalSvgPaint.g:636:3: (enumLiteral_11= 'brown' )
                    // InternalSvgPaint.g:637:4: enumLiteral_11= 'brown'
                    {
                    enumLiteral_11=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getBrownEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getColorKeywordAccess().getBrownEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalSvgPaint.g:644:3: (enumLiteral_12= 'burlywood' )
                    {
                    // InternalSvgPaint.g:644:3: (enumLiteral_12= 'burlywood' )
                    // InternalSvgPaint.g:645:4: enumLiteral_12= 'burlywood'
                    {
                    enumLiteral_12=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getBurlywoodEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getColorKeywordAccess().getBurlywoodEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalSvgPaint.g:652:3: (enumLiteral_13= 'cadetblue' )
                    {
                    // InternalSvgPaint.g:652:3: (enumLiteral_13= 'cadetblue' )
                    // InternalSvgPaint.g:653:4: enumLiteral_13= 'cadetblue'
                    {
                    enumLiteral_13=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getCadetblueEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getColorKeywordAccess().getCadetblueEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalSvgPaint.g:660:3: (enumLiteral_14= 'chartreuse' )
                    {
                    // InternalSvgPaint.g:660:3: (enumLiteral_14= 'chartreuse' )
                    // InternalSvgPaint.g:661:4: enumLiteral_14= 'chartreuse'
                    {
                    enumLiteral_14=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getChartreuseEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getColorKeywordAccess().getChartreuseEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalSvgPaint.g:668:3: (enumLiteral_15= 'chocolate' )
                    {
                    // InternalSvgPaint.g:668:3: (enumLiteral_15= 'chocolate' )
                    // InternalSvgPaint.g:669:4: enumLiteral_15= 'chocolate'
                    {
                    enumLiteral_15=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getChocolateEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getColorKeywordAccess().getChocolateEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalSvgPaint.g:676:3: (enumLiteral_16= 'coral' )
                    {
                    // InternalSvgPaint.g:676:3: (enumLiteral_16= 'coral' )
                    // InternalSvgPaint.g:677:4: enumLiteral_16= 'coral'
                    {
                    enumLiteral_16=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getCoralEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getColorKeywordAccess().getCoralEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalSvgPaint.g:684:3: (enumLiteral_17= 'cornflowerblue' )
                    {
                    // InternalSvgPaint.g:684:3: (enumLiteral_17= 'cornflowerblue' )
                    // InternalSvgPaint.g:685:4: enumLiteral_17= 'cornflowerblue'
                    {
                    enumLiteral_17=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getCornflowerblueEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getColorKeywordAccess().getCornflowerblueEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalSvgPaint.g:692:3: (enumLiteral_18= 'cornsilk' )
                    {
                    // InternalSvgPaint.g:692:3: (enumLiteral_18= 'cornsilk' )
                    // InternalSvgPaint.g:693:4: enumLiteral_18= 'cornsilk'
                    {
                    enumLiteral_18=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getCornsilkEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getColorKeywordAccess().getCornsilkEnumLiteralDeclaration_18());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalSvgPaint.g:700:3: (enumLiteral_19= 'crimson' )
                    {
                    // InternalSvgPaint.g:700:3: (enumLiteral_19= 'crimson' )
                    // InternalSvgPaint.g:701:4: enumLiteral_19= 'crimson'
                    {
                    enumLiteral_19=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getCrimsonEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_19, grammarAccess.getColorKeywordAccess().getCrimsonEnumLiteralDeclaration_19());
                    			

                    }


                    }
                    break;
                case 21 :
                    // InternalSvgPaint.g:708:3: (enumLiteral_20= 'cyan' )
                    {
                    // InternalSvgPaint.g:708:3: (enumLiteral_20= 'cyan' )
                    // InternalSvgPaint.g:709:4: enumLiteral_20= 'cyan'
                    {
                    enumLiteral_20=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getCyanEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_20, grammarAccess.getColorKeywordAccess().getCyanEnumLiteralDeclaration_20());
                    			

                    }


                    }
                    break;
                case 22 :
                    // InternalSvgPaint.g:716:3: (enumLiteral_21= 'darkblue' )
                    {
                    // InternalSvgPaint.g:716:3: (enumLiteral_21= 'darkblue' )
                    // InternalSvgPaint.g:717:4: enumLiteral_21= 'darkblue'
                    {
                    enumLiteral_21=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getDarkblueEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_21, grammarAccess.getColorKeywordAccess().getDarkblueEnumLiteralDeclaration_21());
                    			

                    }


                    }
                    break;
                case 23 :
                    // InternalSvgPaint.g:724:3: (enumLiteral_22= 'darkcyan' )
                    {
                    // InternalSvgPaint.g:724:3: (enumLiteral_22= 'darkcyan' )
                    // InternalSvgPaint.g:725:4: enumLiteral_22= 'darkcyan'
                    {
                    enumLiteral_22=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getDarkcyanEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_22, grammarAccess.getColorKeywordAccess().getDarkcyanEnumLiteralDeclaration_22());
                    			

                    }


                    }
                    break;
                case 24 :
                    // InternalSvgPaint.g:732:3: (enumLiteral_23= 'darkgoldenrod' )
                    {
                    // InternalSvgPaint.g:732:3: (enumLiteral_23= 'darkgoldenrod' )
                    // InternalSvgPaint.g:733:4: enumLiteral_23= 'darkgoldenrod'
                    {
                    enumLiteral_23=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getDarkgoldenrodEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_23, grammarAccess.getColorKeywordAccess().getDarkgoldenrodEnumLiteralDeclaration_23());
                    			

                    }


                    }
                    break;
                case 25 :
                    // InternalSvgPaint.g:740:3: (enumLiteral_24= 'darkgray' )
                    {
                    // InternalSvgPaint.g:740:3: (enumLiteral_24= 'darkgray' )
                    // InternalSvgPaint.g:741:4: enumLiteral_24= 'darkgray'
                    {
                    enumLiteral_24=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getDarkgrayEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_24, grammarAccess.getColorKeywordAccess().getDarkgrayEnumLiteralDeclaration_24());
                    			

                    }


                    }
                    break;
                case 26 :
                    // InternalSvgPaint.g:748:3: (enumLiteral_25= 'darkgreen' )
                    {
                    // InternalSvgPaint.g:748:3: (enumLiteral_25= 'darkgreen' )
                    // InternalSvgPaint.g:749:4: enumLiteral_25= 'darkgreen'
                    {
                    enumLiteral_25=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getDarkgreenEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_25, grammarAccess.getColorKeywordAccess().getDarkgreenEnumLiteralDeclaration_25());
                    			

                    }


                    }
                    break;
                case 27 :
                    // InternalSvgPaint.g:756:3: (enumLiteral_26= 'darkgrey' )
                    {
                    // InternalSvgPaint.g:756:3: (enumLiteral_26= 'darkgrey' )
                    // InternalSvgPaint.g:757:4: enumLiteral_26= 'darkgrey'
                    {
                    enumLiteral_26=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getDarkgreyEnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_26, grammarAccess.getColorKeywordAccess().getDarkgreyEnumLiteralDeclaration_26());
                    			

                    }


                    }
                    break;
                case 28 :
                    // InternalSvgPaint.g:764:3: (enumLiteral_27= 'darkkhaki' )
                    {
                    // InternalSvgPaint.g:764:3: (enumLiteral_27= 'darkkhaki' )
                    // InternalSvgPaint.g:765:4: enumLiteral_27= 'darkkhaki'
                    {
                    enumLiteral_27=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getDarkkhakiEnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_27, grammarAccess.getColorKeywordAccess().getDarkkhakiEnumLiteralDeclaration_27());
                    			

                    }


                    }
                    break;
                case 29 :
                    // InternalSvgPaint.g:772:3: (enumLiteral_28= 'darkmagenta' )
                    {
                    // InternalSvgPaint.g:772:3: (enumLiteral_28= 'darkmagenta' )
                    // InternalSvgPaint.g:773:4: enumLiteral_28= 'darkmagenta'
                    {
                    enumLiteral_28=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getDarkmagentaEnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_28, grammarAccess.getColorKeywordAccess().getDarkmagentaEnumLiteralDeclaration_28());
                    			

                    }


                    }
                    break;
                case 30 :
                    // InternalSvgPaint.g:780:3: (enumLiteral_29= 'darkolivegreen' )
                    {
                    // InternalSvgPaint.g:780:3: (enumLiteral_29= 'darkolivegreen' )
                    // InternalSvgPaint.g:781:4: enumLiteral_29= 'darkolivegreen'
                    {
                    enumLiteral_29=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getDarkolivegreenEnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_29, grammarAccess.getColorKeywordAccess().getDarkolivegreenEnumLiteralDeclaration_29());
                    			

                    }


                    }
                    break;
                case 31 :
                    // InternalSvgPaint.g:788:3: (enumLiteral_30= 'darkorange' )
                    {
                    // InternalSvgPaint.g:788:3: (enumLiteral_30= 'darkorange' )
                    // InternalSvgPaint.g:789:4: enumLiteral_30= 'darkorange'
                    {
                    enumLiteral_30=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getDarkorangeEnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_30, grammarAccess.getColorKeywordAccess().getDarkorangeEnumLiteralDeclaration_30());
                    			

                    }


                    }
                    break;
                case 32 :
                    // InternalSvgPaint.g:796:3: (enumLiteral_31= 'darkorchid' )
                    {
                    // InternalSvgPaint.g:796:3: (enumLiteral_31= 'darkorchid' )
                    // InternalSvgPaint.g:797:4: enumLiteral_31= 'darkorchid'
                    {
                    enumLiteral_31=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getDarkorchidEnumLiteralDeclaration_31().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_31, grammarAccess.getColorKeywordAccess().getDarkorchidEnumLiteralDeclaration_31());
                    			

                    }


                    }
                    break;
                case 33 :
                    // InternalSvgPaint.g:804:3: (enumLiteral_32= 'darkred' )
                    {
                    // InternalSvgPaint.g:804:3: (enumLiteral_32= 'darkred' )
                    // InternalSvgPaint.g:805:4: enumLiteral_32= 'darkred'
                    {
                    enumLiteral_32=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getDarkredEnumLiteralDeclaration_32().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_32, grammarAccess.getColorKeywordAccess().getDarkredEnumLiteralDeclaration_32());
                    			

                    }


                    }
                    break;
                case 34 :
                    // InternalSvgPaint.g:812:3: (enumLiteral_33= 'darksalmon' )
                    {
                    // InternalSvgPaint.g:812:3: (enumLiteral_33= 'darksalmon' )
                    // InternalSvgPaint.g:813:4: enumLiteral_33= 'darksalmon'
                    {
                    enumLiteral_33=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getDarksalmonEnumLiteralDeclaration_33().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_33, grammarAccess.getColorKeywordAccess().getDarksalmonEnumLiteralDeclaration_33());
                    			

                    }


                    }
                    break;
                case 35 :
                    // InternalSvgPaint.g:820:3: (enumLiteral_34= 'darkseagreen' )
                    {
                    // InternalSvgPaint.g:820:3: (enumLiteral_34= 'darkseagreen' )
                    // InternalSvgPaint.g:821:4: enumLiteral_34= 'darkseagreen'
                    {
                    enumLiteral_34=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getDarkseagreenEnumLiteralDeclaration_34().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_34, grammarAccess.getColorKeywordAccess().getDarkseagreenEnumLiteralDeclaration_34());
                    			

                    }


                    }
                    break;
                case 36 :
                    // InternalSvgPaint.g:828:3: (enumLiteral_35= 'darkslateblue' )
                    {
                    // InternalSvgPaint.g:828:3: (enumLiteral_35= 'darkslateblue' )
                    // InternalSvgPaint.g:829:4: enumLiteral_35= 'darkslateblue'
                    {
                    enumLiteral_35=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getDarkslateblueEnumLiteralDeclaration_35().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_35, grammarAccess.getColorKeywordAccess().getDarkslateblueEnumLiteralDeclaration_35());
                    			

                    }


                    }
                    break;
                case 37 :
                    // InternalSvgPaint.g:836:3: (enumLiteral_36= 'darkslategray' )
                    {
                    // InternalSvgPaint.g:836:3: (enumLiteral_36= 'darkslategray' )
                    // InternalSvgPaint.g:837:4: enumLiteral_36= 'darkslategray'
                    {
                    enumLiteral_36=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getDarkslategrayEnumLiteralDeclaration_36().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_36, grammarAccess.getColorKeywordAccess().getDarkslategrayEnumLiteralDeclaration_36());
                    			

                    }


                    }
                    break;
                case 38 :
                    // InternalSvgPaint.g:844:3: (enumLiteral_37= 'darkslategrey' )
                    {
                    // InternalSvgPaint.g:844:3: (enumLiteral_37= 'darkslategrey' )
                    // InternalSvgPaint.g:845:4: enumLiteral_37= 'darkslategrey'
                    {
                    enumLiteral_37=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getDarkslategreyEnumLiteralDeclaration_37().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_37, grammarAccess.getColorKeywordAccess().getDarkslategreyEnumLiteralDeclaration_37());
                    			

                    }


                    }
                    break;
                case 39 :
                    // InternalSvgPaint.g:852:3: (enumLiteral_38= 'darkturquoise' )
                    {
                    // InternalSvgPaint.g:852:3: (enumLiteral_38= 'darkturquoise' )
                    // InternalSvgPaint.g:853:4: enumLiteral_38= 'darkturquoise'
                    {
                    enumLiteral_38=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getDarkturquoiseEnumLiteralDeclaration_38().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_38, grammarAccess.getColorKeywordAccess().getDarkturquoiseEnumLiteralDeclaration_38());
                    			

                    }


                    }
                    break;
                case 40 :
                    // InternalSvgPaint.g:860:3: (enumLiteral_39= 'darkviolet' )
                    {
                    // InternalSvgPaint.g:860:3: (enumLiteral_39= 'darkviolet' )
                    // InternalSvgPaint.g:861:4: enumLiteral_39= 'darkviolet'
                    {
                    enumLiteral_39=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getDarkvioletEnumLiteralDeclaration_39().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_39, grammarAccess.getColorKeywordAccess().getDarkvioletEnumLiteralDeclaration_39());
                    			

                    }


                    }
                    break;
                case 41 :
                    // InternalSvgPaint.g:868:3: (enumLiteral_40= 'deeppink' )
                    {
                    // InternalSvgPaint.g:868:3: (enumLiteral_40= 'deeppink' )
                    // InternalSvgPaint.g:869:4: enumLiteral_40= 'deeppink'
                    {
                    enumLiteral_40=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getDeeppinkEnumLiteralDeclaration_40().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_40, grammarAccess.getColorKeywordAccess().getDeeppinkEnumLiteralDeclaration_40());
                    			

                    }


                    }
                    break;
                case 42 :
                    // InternalSvgPaint.g:876:3: (enumLiteral_41= 'deepskyblue' )
                    {
                    // InternalSvgPaint.g:876:3: (enumLiteral_41= 'deepskyblue' )
                    // InternalSvgPaint.g:877:4: enumLiteral_41= 'deepskyblue'
                    {
                    enumLiteral_41=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getDeepskyblueEnumLiteralDeclaration_41().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_41, grammarAccess.getColorKeywordAccess().getDeepskyblueEnumLiteralDeclaration_41());
                    			

                    }


                    }
                    break;
                case 43 :
                    // InternalSvgPaint.g:884:3: (enumLiteral_42= 'dimgray' )
                    {
                    // InternalSvgPaint.g:884:3: (enumLiteral_42= 'dimgray' )
                    // InternalSvgPaint.g:885:4: enumLiteral_42= 'dimgray'
                    {
                    enumLiteral_42=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getDimgrayEnumLiteralDeclaration_42().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_42, grammarAccess.getColorKeywordAccess().getDimgrayEnumLiteralDeclaration_42());
                    			

                    }


                    }
                    break;
                case 44 :
                    // InternalSvgPaint.g:892:3: (enumLiteral_43= 'dimgrey' )
                    {
                    // InternalSvgPaint.g:892:3: (enumLiteral_43= 'dimgrey' )
                    // InternalSvgPaint.g:893:4: enumLiteral_43= 'dimgrey'
                    {
                    enumLiteral_43=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getDimgreyEnumLiteralDeclaration_43().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_43, grammarAccess.getColorKeywordAccess().getDimgreyEnumLiteralDeclaration_43());
                    			

                    }


                    }
                    break;
                case 45 :
                    // InternalSvgPaint.g:900:3: (enumLiteral_44= 'dodgerblue' )
                    {
                    // InternalSvgPaint.g:900:3: (enumLiteral_44= 'dodgerblue' )
                    // InternalSvgPaint.g:901:4: enumLiteral_44= 'dodgerblue'
                    {
                    enumLiteral_44=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getDodgerblueEnumLiteralDeclaration_44().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_44, grammarAccess.getColorKeywordAccess().getDodgerblueEnumLiteralDeclaration_44());
                    			

                    }


                    }
                    break;
                case 46 :
                    // InternalSvgPaint.g:908:3: (enumLiteral_45= 'firebrick' )
                    {
                    // InternalSvgPaint.g:908:3: (enumLiteral_45= 'firebrick' )
                    // InternalSvgPaint.g:909:4: enumLiteral_45= 'firebrick'
                    {
                    enumLiteral_45=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getFirebrickEnumLiteralDeclaration_45().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_45, grammarAccess.getColorKeywordAccess().getFirebrickEnumLiteralDeclaration_45());
                    			

                    }


                    }
                    break;
                case 47 :
                    // InternalSvgPaint.g:916:3: (enumLiteral_46= 'floralwhite' )
                    {
                    // InternalSvgPaint.g:916:3: (enumLiteral_46= 'floralwhite' )
                    // InternalSvgPaint.g:917:4: enumLiteral_46= 'floralwhite'
                    {
                    enumLiteral_46=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getFloralwhiteEnumLiteralDeclaration_46().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_46, grammarAccess.getColorKeywordAccess().getFloralwhiteEnumLiteralDeclaration_46());
                    			

                    }


                    }
                    break;
                case 48 :
                    // InternalSvgPaint.g:924:3: (enumLiteral_47= 'forestgreen' )
                    {
                    // InternalSvgPaint.g:924:3: (enumLiteral_47= 'forestgreen' )
                    // InternalSvgPaint.g:925:4: enumLiteral_47= 'forestgreen'
                    {
                    enumLiteral_47=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getForestgreenEnumLiteralDeclaration_47().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_47, grammarAccess.getColorKeywordAccess().getForestgreenEnumLiteralDeclaration_47());
                    			

                    }


                    }
                    break;
                case 49 :
                    // InternalSvgPaint.g:932:3: (enumLiteral_48= 'fuchsia' )
                    {
                    // InternalSvgPaint.g:932:3: (enumLiteral_48= 'fuchsia' )
                    // InternalSvgPaint.g:933:4: enumLiteral_48= 'fuchsia'
                    {
                    enumLiteral_48=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getFuchsiaEnumLiteralDeclaration_48().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_48, grammarAccess.getColorKeywordAccess().getFuchsiaEnumLiteralDeclaration_48());
                    			

                    }


                    }
                    break;
                case 50 :
                    // InternalSvgPaint.g:940:3: (enumLiteral_49= 'gainsboro' )
                    {
                    // InternalSvgPaint.g:940:3: (enumLiteral_49= 'gainsboro' )
                    // InternalSvgPaint.g:941:4: enumLiteral_49= 'gainsboro'
                    {
                    enumLiteral_49=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getGainsboroEnumLiteralDeclaration_49().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_49, grammarAccess.getColorKeywordAccess().getGainsboroEnumLiteralDeclaration_49());
                    			

                    }


                    }
                    break;
                case 51 :
                    // InternalSvgPaint.g:948:3: (enumLiteral_50= 'ghostwhite' )
                    {
                    // InternalSvgPaint.g:948:3: (enumLiteral_50= 'ghostwhite' )
                    // InternalSvgPaint.g:949:4: enumLiteral_50= 'ghostwhite'
                    {
                    enumLiteral_50=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getGhostwhiteEnumLiteralDeclaration_50().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_50, grammarAccess.getColorKeywordAccess().getGhostwhiteEnumLiteralDeclaration_50());
                    			

                    }


                    }
                    break;
                case 52 :
                    // InternalSvgPaint.g:956:3: (enumLiteral_51= 'gold' )
                    {
                    // InternalSvgPaint.g:956:3: (enumLiteral_51= 'gold' )
                    // InternalSvgPaint.g:957:4: enumLiteral_51= 'gold'
                    {
                    enumLiteral_51=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getGoldEnumLiteralDeclaration_51().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_51, grammarAccess.getColorKeywordAccess().getGoldEnumLiteralDeclaration_51());
                    			

                    }


                    }
                    break;
                case 53 :
                    // InternalSvgPaint.g:964:3: (enumLiteral_52= 'goldenrod' )
                    {
                    // InternalSvgPaint.g:964:3: (enumLiteral_52= 'goldenrod' )
                    // InternalSvgPaint.g:965:4: enumLiteral_52= 'goldenrod'
                    {
                    enumLiteral_52=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getGoldenrodEnumLiteralDeclaration_52().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_52, grammarAccess.getColorKeywordAccess().getGoldenrodEnumLiteralDeclaration_52());
                    			

                    }


                    }
                    break;
                case 54 :
                    // InternalSvgPaint.g:972:3: (enumLiteral_53= 'gray' )
                    {
                    // InternalSvgPaint.g:972:3: (enumLiteral_53= 'gray' )
                    // InternalSvgPaint.g:973:4: enumLiteral_53= 'gray'
                    {
                    enumLiteral_53=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getGrayEnumLiteralDeclaration_53().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_53, grammarAccess.getColorKeywordAccess().getGrayEnumLiteralDeclaration_53());
                    			

                    }


                    }
                    break;
                case 55 :
                    // InternalSvgPaint.g:980:3: (enumLiteral_54= 'grey' )
                    {
                    // InternalSvgPaint.g:980:3: (enumLiteral_54= 'grey' )
                    // InternalSvgPaint.g:981:4: enumLiteral_54= 'grey'
                    {
                    enumLiteral_54=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getGreyEnumLiteralDeclaration_54().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_54, grammarAccess.getColorKeywordAccess().getGreyEnumLiteralDeclaration_54());
                    			

                    }


                    }
                    break;
                case 56 :
                    // InternalSvgPaint.g:988:3: (enumLiteral_55= 'green' )
                    {
                    // InternalSvgPaint.g:988:3: (enumLiteral_55= 'green' )
                    // InternalSvgPaint.g:989:4: enumLiteral_55= 'green'
                    {
                    enumLiteral_55=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getGreenEnumLiteralDeclaration_55().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_55, grammarAccess.getColorKeywordAccess().getGreenEnumLiteralDeclaration_55());
                    			

                    }


                    }
                    break;
                case 57 :
                    // InternalSvgPaint.g:996:3: (enumLiteral_56= 'greenyellow' )
                    {
                    // InternalSvgPaint.g:996:3: (enumLiteral_56= 'greenyellow' )
                    // InternalSvgPaint.g:997:4: enumLiteral_56= 'greenyellow'
                    {
                    enumLiteral_56=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getGreenyellowEnumLiteralDeclaration_56().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_56, grammarAccess.getColorKeywordAccess().getGreenyellowEnumLiteralDeclaration_56());
                    			

                    }


                    }
                    break;
                case 58 :
                    // InternalSvgPaint.g:1004:3: (enumLiteral_57= 'honeydew' )
                    {
                    // InternalSvgPaint.g:1004:3: (enumLiteral_57= 'honeydew' )
                    // InternalSvgPaint.g:1005:4: enumLiteral_57= 'honeydew'
                    {
                    enumLiteral_57=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getHoneydewEnumLiteralDeclaration_57().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_57, grammarAccess.getColorKeywordAccess().getHoneydewEnumLiteralDeclaration_57());
                    			

                    }


                    }
                    break;
                case 59 :
                    // InternalSvgPaint.g:1012:3: (enumLiteral_58= 'hotpink' )
                    {
                    // InternalSvgPaint.g:1012:3: (enumLiteral_58= 'hotpink' )
                    // InternalSvgPaint.g:1013:4: enumLiteral_58= 'hotpink'
                    {
                    enumLiteral_58=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getHotpinkEnumLiteralDeclaration_58().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_58, grammarAccess.getColorKeywordAccess().getHotpinkEnumLiteralDeclaration_58());
                    			

                    }


                    }
                    break;
                case 60 :
                    // InternalSvgPaint.g:1020:3: (enumLiteral_59= 'indianred' )
                    {
                    // InternalSvgPaint.g:1020:3: (enumLiteral_59= 'indianred' )
                    // InternalSvgPaint.g:1021:4: enumLiteral_59= 'indianred'
                    {
                    enumLiteral_59=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getIndianredEnumLiteralDeclaration_59().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_59, grammarAccess.getColorKeywordAccess().getIndianredEnumLiteralDeclaration_59());
                    			

                    }


                    }
                    break;
                case 61 :
                    // InternalSvgPaint.g:1028:3: (enumLiteral_60= 'indigo' )
                    {
                    // InternalSvgPaint.g:1028:3: (enumLiteral_60= 'indigo' )
                    // InternalSvgPaint.g:1029:4: enumLiteral_60= 'indigo'
                    {
                    enumLiteral_60=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getIndigoEnumLiteralDeclaration_60().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_60, grammarAccess.getColorKeywordAccess().getIndigoEnumLiteralDeclaration_60());
                    			

                    }


                    }
                    break;
                case 62 :
                    // InternalSvgPaint.g:1036:3: (enumLiteral_61= 'ivory' )
                    {
                    // InternalSvgPaint.g:1036:3: (enumLiteral_61= 'ivory' )
                    // InternalSvgPaint.g:1037:4: enumLiteral_61= 'ivory'
                    {
                    enumLiteral_61=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getIvoryEnumLiteralDeclaration_61().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_61, grammarAccess.getColorKeywordAccess().getIvoryEnumLiteralDeclaration_61());
                    			

                    }


                    }
                    break;
                case 63 :
                    // InternalSvgPaint.g:1044:3: (enumLiteral_62= 'khaki' )
                    {
                    // InternalSvgPaint.g:1044:3: (enumLiteral_62= 'khaki' )
                    // InternalSvgPaint.g:1045:4: enumLiteral_62= 'khaki'
                    {
                    enumLiteral_62=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getKhakiEnumLiteralDeclaration_62().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_62, grammarAccess.getColorKeywordAccess().getKhakiEnumLiteralDeclaration_62());
                    			

                    }


                    }
                    break;
                case 64 :
                    // InternalSvgPaint.g:1052:3: (enumLiteral_63= 'lavender' )
                    {
                    // InternalSvgPaint.g:1052:3: (enumLiteral_63= 'lavender' )
                    // InternalSvgPaint.g:1053:4: enumLiteral_63= 'lavender'
                    {
                    enumLiteral_63=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getLavenderEnumLiteralDeclaration_63().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_63, grammarAccess.getColorKeywordAccess().getLavenderEnumLiteralDeclaration_63());
                    			

                    }


                    }
                    break;
                case 65 :
                    // InternalSvgPaint.g:1060:3: (enumLiteral_64= 'lavenderblush' )
                    {
                    // InternalSvgPaint.g:1060:3: (enumLiteral_64= 'lavenderblush' )
                    // InternalSvgPaint.g:1061:4: enumLiteral_64= 'lavenderblush'
                    {
                    enumLiteral_64=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getLavenderblushEnumLiteralDeclaration_64().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_64, grammarAccess.getColorKeywordAccess().getLavenderblushEnumLiteralDeclaration_64());
                    			

                    }


                    }
                    break;
                case 66 :
                    // InternalSvgPaint.g:1068:3: (enumLiteral_65= 'lawngreen' )
                    {
                    // InternalSvgPaint.g:1068:3: (enumLiteral_65= 'lawngreen' )
                    // InternalSvgPaint.g:1069:4: enumLiteral_65= 'lawngreen'
                    {
                    enumLiteral_65=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getLawngreenEnumLiteralDeclaration_65().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_65, grammarAccess.getColorKeywordAccess().getLawngreenEnumLiteralDeclaration_65());
                    			

                    }


                    }
                    break;
                case 67 :
                    // InternalSvgPaint.g:1076:3: (enumLiteral_66= 'lemonchiffon' )
                    {
                    // InternalSvgPaint.g:1076:3: (enumLiteral_66= 'lemonchiffon' )
                    // InternalSvgPaint.g:1077:4: enumLiteral_66= 'lemonchiffon'
                    {
                    enumLiteral_66=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getLemonchiffonEnumLiteralDeclaration_66().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_66, grammarAccess.getColorKeywordAccess().getLemonchiffonEnumLiteralDeclaration_66());
                    			

                    }


                    }
                    break;
                case 68 :
                    // InternalSvgPaint.g:1084:3: (enumLiteral_67= 'lightblue' )
                    {
                    // InternalSvgPaint.g:1084:3: (enumLiteral_67= 'lightblue' )
                    // InternalSvgPaint.g:1085:4: enumLiteral_67= 'lightblue'
                    {
                    enumLiteral_67=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getLightblueEnumLiteralDeclaration_67().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_67, grammarAccess.getColorKeywordAccess().getLightblueEnumLiteralDeclaration_67());
                    			

                    }


                    }
                    break;
                case 69 :
                    // InternalSvgPaint.g:1092:3: (enumLiteral_68= 'lightcoral' )
                    {
                    // InternalSvgPaint.g:1092:3: (enumLiteral_68= 'lightcoral' )
                    // InternalSvgPaint.g:1093:4: enumLiteral_68= 'lightcoral'
                    {
                    enumLiteral_68=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getLightcoralEnumLiteralDeclaration_68().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_68, grammarAccess.getColorKeywordAccess().getLightcoralEnumLiteralDeclaration_68());
                    			

                    }


                    }
                    break;
                case 70 :
                    // InternalSvgPaint.g:1100:3: (enumLiteral_69= 'lightcyan' )
                    {
                    // InternalSvgPaint.g:1100:3: (enumLiteral_69= 'lightcyan' )
                    // InternalSvgPaint.g:1101:4: enumLiteral_69= 'lightcyan'
                    {
                    enumLiteral_69=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getLightcyanEnumLiteralDeclaration_69().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_69, grammarAccess.getColorKeywordAccess().getLightcyanEnumLiteralDeclaration_69());
                    			

                    }


                    }
                    break;
                case 71 :
                    // InternalSvgPaint.g:1108:3: (enumLiteral_70= 'lightgoldenrodyellow' )
                    {
                    // InternalSvgPaint.g:1108:3: (enumLiteral_70= 'lightgoldenrodyellow' )
                    // InternalSvgPaint.g:1109:4: enumLiteral_70= 'lightgoldenrodyellow'
                    {
                    enumLiteral_70=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getLightgoldenrodyellowEnumLiteralDeclaration_70().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_70, grammarAccess.getColorKeywordAccess().getLightgoldenrodyellowEnumLiteralDeclaration_70());
                    			

                    }


                    }
                    break;
                case 72 :
                    // InternalSvgPaint.g:1116:3: (enumLiteral_71= 'lightgray' )
                    {
                    // InternalSvgPaint.g:1116:3: (enumLiteral_71= 'lightgray' )
                    // InternalSvgPaint.g:1117:4: enumLiteral_71= 'lightgray'
                    {
                    enumLiteral_71=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getLightgrayEnumLiteralDeclaration_71().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_71, grammarAccess.getColorKeywordAccess().getLightgrayEnumLiteralDeclaration_71());
                    			

                    }


                    }
                    break;
                case 73 :
                    // InternalSvgPaint.g:1124:3: (enumLiteral_72= 'lightgreen' )
                    {
                    // InternalSvgPaint.g:1124:3: (enumLiteral_72= 'lightgreen' )
                    // InternalSvgPaint.g:1125:4: enumLiteral_72= 'lightgreen'
                    {
                    enumLiteral_72=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getLightgreenEnumLiteralDeclaration_72().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_72, grammarAccess.getColorKeywordAccess().getLightgreenEnumLiteralDeclaration_72());
                    			

                    }


                    }
                    break;
                case 74 :
                    // InternalSvgPaint.g:1132:3: (enumLiteral_73= 'lightgrey' )
                    {
                    // InternalSvgPaint.g:1132:3: (enumLiteral_73= 'lightgrey' )
                    // InternalSvgPaint.g:1133:4: enumLiteral_73= 'lightgrey'
                    {
                    enumLiteral_73=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getLightgreyEnumLiteralDeclaration_73().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_73, grammarAccess.getColorKeywordAccess().getLightgreyEnumLiteralDeclaration_73());
                    			

                    }


                    }
                    break;
                case 75 :
                    // InternalSvgPaint.g:1140:3: (enumLiteral_74= 'lightpink' )
                    {
                    // InternalSvgPaint.g:1140:3: (enumLiteral_74= 'lightpink' )
                    // InternalSvgPaint.g:1141:4: enumLiteral_74= 'lightpink'
                    {
                    enumLiteral_74=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getLightpinkEnumLiteralDeclaration_74().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_74, grammarAccess.getColorKeywordAccess().getLightpinkEnumLiteralDeclaration_74());
                    			

                    }


                    }
                    break;
                case 76 :
                    // InternalSvgPaint.g:1148:3: (enumLiteral_75= 'lightsalmon' )
                    {
                    // InternalSvgPaint.g:1148:3: (enumLiteral_75= 'lightsalmon' )
                    // InternalSvgPaint.g:1149:4: enumLiteral_75= 'lightsalmon'
                    {
                    enumLiteral_75=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getLightsalmonEnumLiteralDeclaration_75().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_75, grammarAccess.getColorKeywordAccess().getLightsalmonEnumLiteralDeclaration_75());
                    			

                    }


                    }
                    break;
                case 77 :
                    // InternalSvgPaint.g:1156:3: (enumLiteral_76= 'lightseagreen' )
                    {
                    // InternalSvgPaint.g:1156:3: (enumLiteral_76= 'lightseagreen' )
                    // InternalSvgPaint.g:1157:4: enumLiteral_76= 'lightseagreen'
                    {
                    enumLiteral_76=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getLightseagreenEnumLiteralDeclaration_76().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_76, grammarAccess.getColorKeywordAccess().getLightseagreenEnumLiteralDeclaration_76());
                    			

                    }


                    }
                    break;
                case 78 :
                    // InternalSvgPaint.g:1164:3: (enumLiteral_77= 'lightskyblue' )
                    {
                    // InternalSvgPaint.g:1164:3: (enumLiteral_77= 'lightskyblue' )
                    // InternalSvgPaint.g:1165:4: enumLiteral_77= 'lightskyblue'
                    {
                    enumLiteral_77=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getLightskyblueEnumLiteralDeclaration_77().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_77, grammarAccess.getColorKeywordAccess().getLightskyblueEnumLiteralDeclaration_77());
                    			

                    }


                    }
                    break;
                case 79 :
                    // InternalSvgPaint.g:1172:3: (enumLiteral_78= 'lightslategray' )
                    {
                    // InternalSvgPaint.g:1172:3: (enumLiteral_78= 'lightslategray' )
                    // InternalSvgPaint.g:1173:4: enumLiteral_78= 'lightslategray'
                    {
                    enumLiteral_78=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getLightslategrayEnumLiteralDeclaration_78().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_78, grammarAccess.getColorKeywordAccess().getLightslategrayEnumLiteralDeclaration_78());
                    			

                    }


                    }
                    break;
                case 80 :
                    // InternalSvgPaint.g:1180:3: (enumLiteral_79= 'lightslategrey' )
                    {
                    // InternalSvgPaint.g:1180:3: (enumLiteral_79= 'lightslategrey' )
                    // InternalSvgPaint.g:1181:4: enumLiteral_79= 'lightslategrey'
                    {
                    enumLiteral_79=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getLightslategreyEnumLiteralDeclaration_79().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_79, grammarAccess.getColorKeywordAccess().getLightslategreyEnumLiteralDeclaration_79());
                    			

                    }


                    }
                    break;
                case 81 :
                    // InternalSvgPaint.g:1188:3: (enumLiteral_80= 'lightsteelblue' )
                    {
                    // InternalSvgPaint.g:1188:3: (enumLiteral_80= 'lightsteelblue' )
                    // InternalSvgPaint.g:1189:4: enumLiteral_80= 'lightsteelblue'
                    {
                    enumLiteral_80=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getLightsteelblueEnumLiteralDeclaration_80().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_80, grammarAccess.getColorKeywordAccess().getLightsteelblueEnumLiteralDeclaration_80());
                    			

                    }


                    }
                    break;
                case 82 :
                    // InternalSvgPaint.g:1196:3: (enumLiteral_81= 'lightyellow' )
                    {
                    // InternalSvgPaint.g:1196:3: (enumLiteral_81= 'lightyellow' )
                    // InternalSvgPaint.g:1197:4: enumLiteral_81= 'lightyellow'
                    {
                    enumLiteral_81=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getLightyellowEnumLiteralDeclaration_81().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_81, grammarAccess.getColorKeywordAccess().getLightyellowEnumLiteralDeclaration_81());
                    			

                    }


                    }
                    break;
                case 83 :
                    // InternalSvgPaint.g:1204:3: (enumLiteral_82= 'lime' )
                    {
                    // InternalSvgPaint.g:1204:3: (enumLiteral_82= 'lime' )
                    // InternalSvgPaint.g:1205:4: enumLiteral_82= 'lime'
                    {
                    enumLiteral_82=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getLimeEnumLiteralDeclaration_82().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_82, grammarAccess.getColorKeywordAccess().getLimeEnumLiteralDeclaration_82());
                    			

                    }


                    }
                    break;
                case 84 :
                    // InternalSvgPaint.g:1212:3: (enumLiteral_83= 'limegreen' )
                    {
                    // InternalSvgPaint.g:1212:3: (enumLiteral_83= 'limegreen' )
                    // InternalSvgPaint.g:1213:4: enumLiteral_83= 'limegreen'
                    {
                    enumLiteral_83=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getLimegreenEnumLiteralDeclaration_83().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_83, grammarAccess.getColorKeywordAccess().getLimegreenEnumLiteralDeclaration_83());
                    			

                    }


                    }
                    break;
                case 85 :
                    // InternalSvgPaint.g:1220:3: (enumLiteral_84= 'linen' )
                    {
                    // InternalSvgPaint.g:1220:3: (enumLiteral_84= 'linen' )
                    // InternalSvgPaint.g:1221:4: enumLiteral_84= 'linen'
                    {
                    enumLiteral_84=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getLinenEnumLiteralDeclaration_84().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_84, grammarAccess.getColorKeywordAccess().getLinenEnumLiteralDeclaration_84());
                    			

                    }


                    }
                    break;
                case 86 :
                    // InternalSvgPaint.g:1228:3: (enumLiteral_85= 'magenta' )
                    {
                    // InternalSvgPaint.g:1228:3: (enumLiteral_85= 'magenta' )
                    // InternalSvgPaint.g:1229:4: enumLiteral_85= 'magenta'
                    {
                    enumLiteral_85=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getMagentaEnumLiteralDeclaration_85().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_85, grammarAccess.getColorKeywordAccess().getMagentaEnumLiteralDeclaration_85());
                    			

                    }


                    }
                    break;
                case 87 :
                    // InternalSvgPaint.g:1236:3: (enumLiteral_86= 'maroon' )
                    {
                    // InternalSvgPaint.g:1236:3: (enumLiteral_86= 'maroon' )
                    // InternalSvgPaint.g:1237:4: enumLiteral_86= 'maroon'
                    {
                    enumLiteral_86=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getMaroonEnumLiteralDeclaration_86().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_86, grammarAccess.getColorKeywordAccess().getMaroonEnumLiteralDeclaration_86());
                    			

                    }


                    }
                    break;
                case 88 :
                    // InternalSvgPaint.g:1244:3: (enumLiteral_87= 'mediumaquamarine' )
                    {
                    // InternalSvgPaint.g:1244:3: (enumLiteral_87= 'mediumaquamarine' )
                    // InternalSvgPaint.g:1245:4: enumLiteral_87= 'mediumaquamarine'
                    {
                    enumLiteral_87=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getMediumaquamarineEnumLiteralDeclaration_87().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_87, grammarAccess.getColorKeywordAccess().getMediumaquamarineEnumLiteralDeclaration_87());
                    			

                    }


                    }
                    break;
                case 89 :
                    // InternalSvgPaint.g:1252:3: (enumLiteral_88= 'mediumblue' )
                    {
                    // InternalSvgPaint.g:1252:3: (enumLiteral_88= 'mediumblue' )
                    // InternalSvgPaint.g:1253:4: enumLiteral_88= 'mediumblue'
                    {
                    enumLiteral_88=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getMediumblueEnumLiteralDeclaration_88().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_88, grammarAccess.getColorKeywordAccess().getMediumblueEnumLiteralDeclaration_88());
                    			

                    }


                    }
                    break;
                case 90 :
                    // InternalSvgPaint.g:1260:3: (enumLiteral_89= 'mediumorchid' )
                    {
                    // InternalSvgPaint.g:1260:3: (enumLiteral_89= 'mediumorchid' )
                    // InternalSvgPaint.g:1261:4: enumLiteral_89= 'mediumorchid'
                    {
                    enumLiteral_89=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getMediumorchidEnumLiteralDeclaration_89().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_89, grammarAccess.getColorKeywordAccess().getMediumorchidEnumLiteralDeclaration_89());
                    			

                    }


                    }
                    break;
                case 91 :
                    // InternalSvgPaint.g:1268:3: (enumLiteral_90= 'mediumpurple' )
                    {
                    // InternalSvgPaint.g:1268:3: (enumLiteral_90= 'mediumpurple' )
                    // InternalSvgPaint.g:1269:4: enumLiteral_90= 'mediumpurple'
                    {
                    enumLiteral_90=(Token)match(input,111,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getMediumpurpleEnumLiteralDeclaration_90().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_90, grammarAccess.getColorKeywordAccess().getMediumpurpleEnumLiteralDeclaration_90());
                    			

                    }


                    }
                    break;
                case 92 :
                    // InternalSvgPaint.g:1276:3: (enumLiteral_91= 'mediumseagreen' )
                    {
                    // InternalSvgPaint.g:1276:3: (enumLiteral_91= 'mediumseagreen' )
                    // InternalSvgPaint.g:1277:4: enumLiteral_91= 'mediumseagreen'
                    {
                    enumLiteral_91=(Token)match(input,112,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getMediumseagreenEnumLiteralDeclaration_91().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_91, grammarAccess.getColorKeywordAccess().getMediumseagreenEnumLiteralDeclaration_91());
                    			

                    }


                    }
                    break;
                case 93 :
                    // InternalSvgPaint.g:1284:3: (enumLiteral_92= 'mediumslateblue' )
                    {
                    // InternalSvgPaint.g:1284:3: (enumLiteral_92= 'mediumslateblue' )
                    // InternalSvgPaint.g:1285:4: enumLiteral_92= 'mediumslateblue'
                    {
                    enumLiteral_92=(Token)match(input,113,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getMediumslateblueEnumLiteralDeclaration_92().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_92, grammarAccess.getColorKeywordAccess().getMediumslateblueEnumLiteralDeclaration_92());
                    			

                    }


                    }
                    break;
                case 94 :
                    // InternalSvgPaint.g:1292:3: (enumLiteral_93= 'mediumspringgreen' )
                    {
                    // InternalSvgPaint.g:1292:3: (enumLiteral_93= 'mediumspringgreen' )
                    // InternalSvgPaint.g:1293:4: enumLiteral_93= 'mediumspringgreen'
                    {
                    enumLiteral_93=(Token)match(input,114,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getMediumspringgreenEnumLiteralDeclaration_93().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_93, grammarAccess.getColorKeywordAccess().getMediumspringgreenEnumLiteralDeclaration_93());
                    			

                    }


                    }
                    break;
                case 95 :
                    // InternalSvgPaint.g:1300:3: (enumLiteral_94= 'mediumturquoise' )
                    {
                    // InternalSvgPaint.g:1300:3: (enumLiteral_94= 'mediumturquoise' )
                    // InternalSvgPaint.g:1301:4: enumLiteral_94= 'mediumturquoise'
                    {
                    enumLiteral_94=(Token)match(input,115,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getMediumturquoiseEnumLiteralDeclaration_94().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_94, grammarAccess.getColorKeywordAccess().getMediumturquoiseEnumLiteralDeclaration_94());
                    			

                    }


                    }
                    break;
                case 96 :
                    // InternalSvgPaint.g:1308:3: (enumLiteral_95= 'mediumvioletred' )
                    {
                    // InternalSvgPaint.g:1308:3: (enumLiteral_95= 'mediumvioletred' )
                    // InternalSvgPaint.g:1309:4: enumLiteral_95= 'mediumvioletred'
                    {
                    enumLiteral_95=(Token)match(input,116,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getMediumvioletredEnumLiteralDeclaration_95().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_95, grammarAccess.getColorKeywordAccess().getMediumvioletredEnumLiteralDeclaration_95());
                    			

                    }


                    }
                    break;
                case 97 :
                    // InternalSvgPaint.g:1316:3: (enumLiteral_96= 'midnightblue' )
                    {
                    // InternalSvgPaint.g:1316:3: (enumLiteral_96= 'midnightblue' )
                    // InternalSvgPaint.g:1317:4: enumLiteral_96= 'midnightblue'
                    {
                    enumLiteral_96=(Token)match(input,117,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getMidnightblueEnumLiteralDeclaration_96().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_96, grammarAccess.getColorKeywordAccess().getMidnightblueEnumLiteralDeclaration_96());
                    			

                    }


                    }
                    break;
                case 98 :
                    // InternalSvgPaint.g:1324:3: (enumLiteral_97= 'mintcream' )
                    {
                    // InternalSvgPaint.g:1324:3: (enumLiteral_97= 'mintcream' )
                    // InternalSvgPaint.g:1325:4: enumLiteral_97= 'mintcream'
                    {
                    enumLiteral_97=(Token)match(input,118,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getMintcreamEnumLiteralDeclaration_97().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_97, grammarAccess.getColorKeywordAccess().getMintcreamEnumLiteralDeclaration_97());
                    			

                    }


                    }
                    break;
                case 99 :
                    // InternalSvgPaint.g:1332:3: (enumLiteral_98= 'mistyrose' )
                    {
                    // InternalSvgPaint.g:1332:3: (enumLiteral_98= 'mistyrose' )
                    // InternalSvgPaint.g:1333:4: enumLiteral_98= 'mistyrose'
                    {
                    enumLiteral_98=(Token)match(input,119,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getMistyroseEnumLiteralDeclaration_98().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_98, grammarAccess.getColorKeywordAccess().getMistyroseEnumLiteralDeclaration_98());
                    			

                    }


                    }
                    break;
                case 100 :
                    // InternalSvgPaint.g:1340:3: (enumLiteral_99= 'moccasin' )
                    {
                    // InternalSvgPaint.g:1340:3: (enumLiteral_99= 'moccasin' )
                    // InternalSvgPaint.g:1341:4: enumLiteral_99= 'moccasin'
                    {
                    enumLiteral_99=(Token)match(input,120,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getMoccasinEnumLiteralDeclaration_99().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_99, grammarAccess.getColorKeywordAccess().getMoccasinEnumLiteralDeclaration_99());
                    			

                    }


                    }
                    break;
                case 101 :
                    // InternalSvgPaint.g:1348:3: (enumLiteral_100= 'navajowhite' )
                    {
                    // InternalSvgPaint.g:1348:3: (enumLiteral_100= 'navajowhite' )
                    // InternalSvgPaint.g:1349:4: enumLiteral_100= 'navajowhite'
                    {
                    enumLiteral_100=(Token)match(input,121,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getNavajowhiteEnumLiteralDeclaration_100().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_100, grammarAccess.getColorKeywordAccess().getNavajowhiteEnumLiteralDeclaration_100());
                    			

                    }


                    }
                    break;
                case 102 :
                    // InternalSvgPaint.g:1356:3: (enumLiteral_101= 'navy' )
                    {
                    // InternalSvgPaint.g:1356:3: (enumLiteral_101= 'navy' )
                    // InternalSvgPaint.g:1357:4: enumLiteral_101= 'navy'
                    {
                    enumLiteral_101=(Token)match(input,122,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getNavyEnumLiteralDeclaration_101().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_101, grammarAccess.getColorKeywordAccess().getNavyEnumLiteralDeclaration_101());
                    			

                    }


                    }
                    break;
                case 103 :
                    // InternalSvgPaint.g:1364:3: (enumLiteral_102= 'oldlace' )
                    {
                    // InternalSvgPaint.g:1364:3: (enumLiteral_102= 'oldlace' )
                    // InternalSvgPaint.g:1365:4: enumLiteral_102= 'oldlace'
                    {
                    enumLiteral_102=(Token)match(input,123,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getOldlaceEnumLiteralDeclaration_102().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_102, grammarAccess.getColorKeywordAccess().getOldlaceEnumLiteralDeclaration_102());
                    			

                    }


                    }
                    break;
                case 104 :
                    // InternalSvgPaint.g:1372:3: (enumLiteral_103= 'olive' )
                    {
                    // InternalSvgPaint.g:1372:3: (enumLiteral_103= 'olive' )
                    // InternalSvgPaint.g:1373:4: enumLiteral_103= 'olive'
                    {
                    enumLiteral_103=(Token)match(input,124,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getOliveEnumLiteralDeclaration_103().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_103, grammarAccess.getColorKeywordAccess().getOliveEnumLiteralDeclaration_103());
                    			

                    }


                    }
                    break;
                case 105 :
                    // InternalSvgPaint.g:1380:3: (enumLiteral_104= 'olivedrab' )
                    {
                    // InternalSvgPaint.g:1380:3: (enumLiteral_104= 'olivedrab' )
                    // InternalSvgPaint.g:1381:4: enumLiteral_104= 'olivedrab'
                    {
                    enumLiteral_104=(Token)match(input,125,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getOlivedrabEnumLiteralDeclaration_104().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_104, grammarAccess.getColorKeywordAccess().getOlivedrabEnumLiteralDeclaration_104());
                    			

                    }


                    }
                    break;
                case 106 :
                    // InternalSvgPaint.g:1388:3: (enumLiteral_105= 'orange' )
                    {
                    // InternalSvgPaint.g:1388:3: (enumLiteral_105= 'orange' )
                    // InternalSvgPaint.g:1389:4: enumLiteral_105= 'orange'
                    {
                    enumLiteral_105=(Token)match(input,126,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getOrangeEnumLiteralDeclaration_105().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_105, grammarAccess.getColorKeywordAccess().getOrangeEnumLiteralDeclaration_105());
                    			

                    }


                    }
                    break;
                case 107 :
                    // InternalSvgPaint.g:1396:3: (enumLiteral_106= 'orangered' )
                    {
                    // InternalSvgPaint.g:1396:3: (enumLiteral_106= 'orangered' )
                    // InternalSvgPaint.g:1397:4: enumLiteral_106= 'orangered'
                    {
                    enumLiteral_106=(Token)match(input,127,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getOrangeredEnumLiteralDeclaration_106().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_106, grammarAccess.getColorKeywordAccess().getOrangeredEnumLiteralDeclaration_106());
                    			

                    }


                    }
                    break;
                case 108 :
                    // InternalSvgPaint.g:1404:3: (enumLiteral_107= 'orchid' )
                    {
                    // InternalSvgPaint.g:1404:3: (enumLiteral_107= 'orchid' )
                    // InternalSvgPaint.g:1405:4: enumLiteral_107= 'orchid'
                    {
                    enumLiteral_107=(Token)match(input,128,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getOrchidEnumLiteralDeclaration_107().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_107, grammarAccess.getColorKeywordAccess().getOrchidEnumLiteralDeclaration_107());
                    			

                    }


                    }
                    break;
                case 109 :
                    // InternalSvgPaint.g:1412:3: (enumLiteral_108= 'palegoldenrod' )
                    {
                    // InternalSvgPaint.g:1412:3: (enumLiteral_108= 'palegoldenrod' )
                    // InternalSvgPaint.g:1413:4: enumLiteral_108= 'palegoldenrod'
                    {
                    enumLiteral_108=(Token)match(input,129,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getPalegoldenrodEnumLiteralDeclaration_108().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_108, grammarAccess.getColorKeywordAccess().getPalegoldenrodEnumLiteralDeclaration_108());
                    			

                    }


                    }
                    break;
                case 110 :
                    // InternalSvgPaint.g:1420:3: (enumLiteral_109= 'palegreen' )
                    {
                    // InternalSvgPaint.g:1420:3: (enumLiteral_109= 'palegreen' )
                    // InternalSvgPaint.g:1421:4: enumLiteral_109= 'palegreen'
                    {
                    enumLiteral_109=(Token)match(input,130,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getPalegreenEnumLiteralDeclaration_109().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_109, grammarAccess.getColorKeywordAccess().getPalegreenEnumLiteralDeclaration_109());
                    			

                    }


                    }
                    break;
                case 111 :
                    // InternalSvgPaint.g:1428:3: (enumLiteral_110= 'paleturquoise' )
                    {
                    // InternalSvgPaint.g:1428:3: (enumLiteral_110= 'paleturquoise' )
                    // InternalSvgPaint.g:1429:4: enumLiteral_110= 'paleturquoise'
                    {
                    enumLiteral_110=(Token)match(input,131,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getPaleturquoiseEnumLiteralDeclaration_110().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_110, grammarAccess.getColorKeywordAccess().getPaleturquoiseEnumLiteralDeclaration_110());
                    			

                    }


                    }
                    break;
                case 112 :
                    // InternalSvgPaint.g:1436:3: (enumLiteral_111= 'palevioletred' )
                    {
                    // InternalSvgPaint.g:1436:3: (enumLiteral_111= 'palevioletred' )
                    // InternalSvgPaint.g:1437:4: enumLiteral_111= 'palevioletred'
                    {
                    enumLiteral_111=(Token)match(input,132,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getPalevioletredEnumLiteralDeclaration_111().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_111, grammarAccess.getColorKeywordAccess().getPalevioletredEnumLiteralDeclaration_111());
                    			

                    }


                    }
                    break;
                case 113 :
                    // InternalSvgPaint.g:1444:3: (enumLiteral_112= 'papayawhip' )
                    {
                    // InternalSvgPaint.g:1444:3: (enumLiteral_112= 'papayawhip' )
                    // InternalSvgPaint.g:1445:4: enumLiteral_112= 'papayawhip'
                    {
                    enumLiteral_112=(Token)match(input,133,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getPapayawhipEnumLiteralDeclaration_112().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_112, grammarAccess.getColorKeywordAccess().getPapayawhipEnumLiteralDeclaration_112());
                    			

                    }


                    }
                    break;
                case 114 :
                    // InternalSvgPaint.g:1452:3: (enumLiteral_113= 'peachpuff' )
                    {
                    // InternalSvgPaint.g:1452:3: (enumLiteral_113= 'peachpuff' )
                    // InternalSvgPaint.g:1453:4: enumLiteral_113= 'peachpuff'
                    {
                    enumLiteral_113=(Token)match(input,134,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getPeachpuffEnumLiteralDeclaration_113().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_113, grammarAccess.getColorKeywordAccess().getPeachpuffEnumLiteralDeclaration_113());
                    			

                    }


                    }
                    break;
                case 115 :
                    // InternalSvgPaint.g:1460:3: (enumLiteral_114= 'peru' )
                    {
                    // InternalSvgPaint.g:1460:3: (enumLiteral_114= 'peru' )
                    // InternalSvgPaint.g:1461:4: enumLiteral_114= 'peru'
                    {
                    enumLiteral_114=(Token)match(input,135,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getPeruEnumLiteralDeclaration_114().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_114, grammarAccess.getColorKeywordAccess().getPeruEnumLiteralDeclaration_114());
                    			

                    }


                    }
                    break;
                case 116 :
                    // InternalSvgPaint.g:1468:3: (enumLiteral_115= 'pink' )
                    {
                    // InternalSvgPaint.g:1468:3: (enumLiteral_115= 'pink' )
                    // InternalSvgPaint.g:1469:4: enumLiteral_115= 'pink'
                    {
                    enumLiteral_115=(Token)match(input,136,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getPinkEnumLiteralDeclaration_115().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_115, grammarAccess.getColorKeywordAccess().getPinkEnumLiteralDeclaration_115());
                    			

                    }


                    }
                    break;
                case 117 :
                    // InternalSvgPaint.g:1476:3: (enumLiteral_116= 'plum' )
                    {
                    // InternalSvgPaint.g:1476:3: (enumLiteral_116= 'plum' )
                    // InternalSvgPaint.g:1477:4: enumLiteral_116= 'plum'
                    {
                    enumLiteral_116=(Token)match(input,137,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getPlumEnumLiteralDeclaration_116().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_116, grammarAccess.getColorKeywordAccess().getPlumEnumLiteralDeclaration_116());
                    			

                    }


                    }
                    break;
                case 118 :
                    // InternalSvgPaint.g:1484:3: (enumLiteral_117= 'powderblue' )
                    {
                    // InternalSvgPaint.g:1484:3: (enumLiteral_117= 'powderblue' )
                    // InternalSvgPaint.g:1485:4: enumLiteral_117= 'powderblue'
                    {
                    enumLiteral_117=(Token)match(input,138,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getPowderblueEnumLiteralDeclaration_117().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_117, grammarAccess.getColorKeywordAccess().getPowderblueEnumLiteralDeclaration_117());
                    			

                    }


                    }
                    break;
                case 119 :
                    // InternalSvgPaint.g:1492:3: (enumLiteral_118= 'purple' )
                    {
                    // InternalSvgPaint.g:1492:3: (enumLiteral_118= 'purple' )
                    // InternalSvgPaint.g:1493:4: enumLiteral_118= 'purple'
                    {
                    enumLiteral_118=(Token)match(input,139,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getPurpleEnumLiteralDeclaration_118().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_118, grammarAccess.getColorKeywordAccess().getPurpleEnumLiteralDeclaration_118());
                    			

                    }


                    }
                    break;
                case 120 :
                    // InternalSvgPaint.g:1500:3: (enumLiteral_119= 'red' )
                    {
                    // InternalSvgPaint.g:1500:3: (enumLiteral_119= 'red' )
                    // InternalSvgPaint.g:1501:4: enumLiteral_119= 'red'
                    {
                    enumLiteral_119=(Token)match(input,140,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getRedEnumLiteralDeclaration_119().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_119, grammarAccess.getColorKeywordAccess().getRedEnumLiteralDeclaration_119());
                    			

                    }


                    }
                    break;
                case 121 :
                    // InternalSvgPaint.g:1508:3: (enumLiteral_120= 'rosybrown' )
                    {
                    // InternalSvgPaint.g:1508:3: (enumLiteral_120= 'rosybrown' )
                    // InternalSvgPaint.g:1509:4: enumLiteral_120= 'rosybrown'
                    {
                    enumLiteral_120=(Token)match(input,141,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getRosybrownEnumLiteralDeclaration_120().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_120, grammarAccess.getColorKeywordAccess().getRosybrownEnumLiteralDeclaration_120());
                    			

                    }


                    }
                    break;
                case 122 :
                    // InternalSvgPaint.g:1516:3: (enumLiteral_121= 'royalblue' )
                    {
                    // InternalSvgPaint.g:1516:3: (enumLiteral_121= 'royalblue' )
                    // InternalSvgPaint.g:1517:4: enumLiteral_121= 'royalblue'
                    {
                    enumLiteral_121=(Token)match(input,142,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getRoyalblueEnumLiteralDeclaration_121().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_121, grammarAccess.getColorKeywordAccess().getRoyalblueEnumLiteralDeclaration_121());
                    			

                    }


                    }
                    break;
                case 123 :
                    // InternalSvgPaint.g:1524:3: (enumLiteral_122= 'saddlebrown' )
                    {
                    // InternalSvgPaint.g:1524:3: (enumLiteral_122= 'saddlebrown' )
                    // InternalSvgPaint.g:1525:4: enumLiteral_122= 'saddlebrown'
                    {
                    enumLiteral_122=(Token)match(input,143,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getSaddlebrownEnumLiteralDeclaration_122().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_122, grammarAccess.getColorKeywordAccess().getSaddlebrownEnumLiteralDeclaration_122());
                    			

                    }


                    }
                    break;
                case 124 :
                    // InternalSvgPaint.g:1532:3: (enumLiteral_123= 'salmon' )
                    {
                    // InternalSvgPaint.g:1532:3: (enumLiteral_123= 'salmon' )
                    // InternalSvgPaint.g:1533:4: enumLiteral_123= 'salmon'
                    {
                    enumLiteral_123=(Token)match(input,144,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getSalmonEnumLiteralDeclaration_123().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_123, grammarAccess.getColorKeywordAccess().getSalmonEnumLiteralDeclaration_123());
                    			

                    }


                    }
                    break;
                case 125 :
                    // InternalSvgPaint.g:1540:3: (enumLiteral_124= 'sandybrown' )
                    {
                    // InternalSvgPaint.g:1540:3: (enumLiteral_124= 'sandybrown' )
                    // InternalSvgPaint.g:1541:4: enumLiteral_124= 'sandybrown'
                    {
                    enumLiteral_124=(Token)match(input,145,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getSandybrownEnumLiteralDeclaration_124().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_124, grammarAccess.getColorKeywordAccess().getSandybrownEnumLiteralDeclaration_124());
                    			

                    }


                    }
                    break;
                case 126 :
                    // InternalSvgPaint.g:1548:3: (enumLiteral_125= 'seagreen' )
                    {
                    // InternalSvgPaint.g:1548:3: (enumLiteral_125= 'seagreen' )
                    // InternalSvgPaint.g:1549:4: enumLiteral_125= 'seagreen'
                    {
                    enumLiteral_125=(Token)match(input,146,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getSeagreenEnumLiteralDeclaration_125().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_125, grammarAccess.getColorKeywordAccess().getSeagreenEnumLiteralDeclaration_125());
                    			

                    }


                    }
                    break;
                case 127 :
                    // InternalSvgPaint.g:1556:3: (enumLiteral_126= 'seashell' )
                    {
                    // InternalSvgPaint.g:1556:3: (enumLiteral_126= 'seashell' )
                    // InternalSvgPaint.g:1557:4: enumLiteral_126= 'seashell'
                    {
                    enumLiteral_126=(Token)match(input,147,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getSeashellEnumLiteralDeclaration_126().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_126, grammarAccess.getColorKeywordAccess().getSeashellEnumLiteralDeclaration_126());
                    			

                    }


                    }
                    break;
                case 128 :
                    // InternalSvgPaint.g:1564:3: (enumLiteral_127= 'sienna' )
                    {
                    // InternalSvgPaint.g:1564:3: (enumLiteral_127= 'sienna' )
                    // InternalSvgPaint.g:1565:4: enumLiteral_127= 'sienna'
                    {
                    enumLiteral_127=(Token)match(input,148,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getSiennaEnumLiteralDeclaration_127().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_127, grammarAccess.getColorKeywordAccess().getSiennaEnumLiteralDeclaration_127());
                    			

                    }


                    }
                    break;
                case 129 :
                    // InternalSvgPaint.g:1572:3: (enumLiteral_128= 'silver' )
                    {
                    // InternalSvgPaint.g:1572:3: (enumLiteral_128= 'silver' )
                    // InternalSvgPaint.g:1573:4: enumLiteral_128= 'silver'
                    {
                    enumLiteral_128=(Token)match(input,149,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getSilverEnumLiteralDeclaration_128().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_128, grammarAccess.getColorKeywordAccess().getSilverEnumLiteralDeclaration_128());
                    			

                    }


                    }
                    break;
                case 130 :
                    // InternalSvgPaint.g:1580:3: (enumLiteral_129= 'skyblue' )
                    {
                    // InternalSvgPaint.g:1580:3: (enumLiteral_129= 'skyblue' )
                    // InternalSvgPaint.g:1581:4: enumLiteral_129= 'skyblue'
                    {
                    enumLiteral_129=(Token)match(input,150,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getSkyblueEnumLiteralDeclaration_129().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_129, grammarAccess.getColorKeywordAccess().getSkyblueEnumLiteralDeclaration_129());
                    			

                    }


                    }
                    break;
                case 131 :
                    // InternalSvgPaint.g:1588:3: (enumLiteral_130= 'slateblue' )
                    {
                    // InternalSvgPaint.g:1588:3: (enumLiteral_130= 'slateblue' )
                    // InternalSvgPaint.g:1589:4: enumLiteral_130= 'slateblue'
                    {
                    enumLiteral_130=(Token)match(input,151,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getSlateblueEnumLiteralDeclaration_130().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_130, grammarAccess.getColorKeywordAccess().getSlateblueEnumLiteralDeclaration_130());
                    			

                    }


                    }
                    break;
                case 132 :
                    // InternalSvgPaint.g:1596:3: (enumLiteral_131= 'slategray' )
                    {
                    // InternalSvgPaint.g:1596:3: (enumLiteral_131= 'slategray' )
                    // InternalSvgPaint.g:1597:4: enumLiteral_131= 'slategray'
                    {
                    enumLiteral_131=(Token)match(input,152,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getSlategrayEnumLiteralDeclaration_131().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_131, grammarAccess.getColorKeywordAccess().getSlategrayEnumLiteralDeclaration_131());
                    			

                    }


                    }
                    break;
                case 133 :
                    // InternalSvgPaint.g:1604:3: (enumLiteral_132= 'slategrey' )
                    {
                    // InternalSvgPaint.g:1604:3: (enumLiteral_132= 'slategrey' )
                    // InternalSvgPaint.g:1605:4: enumLiteral_132= 'slategrey'
                    {
                    enumLiteral_132=(Token)match(input,153,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getSlategreyEnumLiteralDeclaration_132().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_132, grammarAccess.getColorKeywordAccess().getSlategreyEnumLiteralDeclaration_132());
                    			

                    }


                    }
                    break;
                case 134 :
                    // InternalSvgPaint.g:1612:3: (enumLiteral_133= 'snow' )
                    {
                    // InternalSvgPaint.g:1612:3: (enumLiteral_133= 'snow' )
                    // InternalSvgPaint.g:1613:4: enumLiteral_133= 'snow'
                    {
                    enumLiteral_133=(Token)match(input,154,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getSnowEnumLiteralDeclaration_133().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_133, grammarAccess.getColorKeywordAccess().getSnowEnumLiteralDeclaration_133());
                    			

                    }


                    }
                    break;
                case 135 :
                    // InternalSvgPaint.g:1620:3: (enumLiteral_134= 'springgreen' )
                    {
                    // InternalSvgPaint.g:1620:3: (enumLiteral_134= 'springgreen' )
                    // InternalSvgPaint.g:1621:4: enumLiteral_134= 'springgreen'
                    {
                    enumLiteral_134=(Token)match(input,155,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getSpringgreenEnumLiteralDeclaration_134().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_134, grammarAccess.getColorKeywordAccess().getSpringgreenEnumLiteralDeclaration_134());
                    			

                    }


                    }
                    break;
                case 136 :
                    // InternalSvgPaint.g:1628:3: (enumLiteral_135= 'steelblue' )
                    {
                    // InternalSvgPaint.g:1628:3: (enumLiteral_135= 'steelblue' )
                    // InternalSvgPaint.g:1629:4: enumLiteral_135= 'steelblue'
                    {
                    enumLiteral_135=(Token)match(input,156,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getSteelblueEnumLiteralDeclaration_135().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_135, grammarAccess.getColorKeywordAccess().getSteelblueEnumLiteralDeclaration_135());
                    			

                    }


                    }
                    break;
                case 137 :
                    // InternalSvgPaint.g:1636:3: (enumLiteral_136= 'tan' )
                    {
                    // InternalSvgPaint.g:1636:3: (enumLiteral_136= 'tan' )
                    // InternalSvgPaint.g:1637:4: enumLiteral_136= 'tan'
                    {
                    enumLiteral_136=(Token)match(input,157,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getTanEnumLiteralDeclaration_136().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_136, grammarAccess.getColorKeywordAccess().getTanEnumLiteralDeclaration_136());
                    			

                    }


                    }
                    break;
                case 138 :
                    // InternalSvgPaint.g:1644:3: (enumLiteral_137= 'teal' )
                    {
                    // InternalSvgPaint.g:1644:3: (enumLiteral_137= 'teal' )
                    // InternalSvgPaint.g:1645:4: enumLiteral_137= 'teal'
                    {
                    enumLiteral_137=(Token)match(input,158,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getTealEnumLiteralDeclaration_137().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_137, grammarAccess.getColorKeywordAccess().getTealEnumLiteralDeclaration_137());
                    			

                    }


                    }
                    break;
                case 139 :
                    // InternalSvgPaint.g:1652:3: (enumLiteral_138= 'thistle' )
                    {
                    // InternalSvgPaint.g:1652:3: (enumLiteral_138= 'thistle' )
                    // InternalSvgPaint.g:1653:4: enumLiteral_138= 'thistle'
                    {
                    enumLiteral_138=(Token)match(input,159,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getThistleEnumLiteralDeclaration_138().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_138, grammarAccess.getColorKeywordAccess().getThistleEnumLiteralDeclaration_138());
                    			

                    }


                    }
                    break;
                case 140 :
                    // InternalSvgPaint.g:1660:3: (enumLiteral_139= 'tomato' )
                    {
                    // InternalSvgPaint.g:1660:3: (enumLiteral_139= 'tomato' )
                    // InternalSvgPaint.g:1661:4: enumLiteral_139= 'tomato'
                    {
                    enumLiteral_139=(Token)match(input,160,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getTomatoEnumLiteralDeclaration_139().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_139, grammarAccess.getColorKeywordAccess().getTomatoEnumLiteralDeclaration_139());
                    			

                    }


                    }
                    break;
                case 141 :
                    // InternalSvgPaint.g:1668:3: (enumLiteral_140= 'turquoise' )
                    {
                    // InternalSvgPaint.g:1668:3: (enumLiteral_140= 'turquoise' )
                    // InternalSvgPaint.g:1669:4: enumLiteral_140= 'turquoise'
                    {
                    enumLiteral_140=(Token)match(input,161,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getTurquoiseEnumLiteralDeclaration_140().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_140, grammarAccess.getColorKeywordAccess().getTurquoiseEnumLiteralDeclaration_140());
                    			

                    }


                    }
                    break;
                case 142 :
                    // InternalSvgPaint.g:1676:3: (enumLiteral_141= 'violet' )
                    {
                    // InternalSvgPaint.g:1676:3: (enumLiteral_141= 'violet' )
                    // InternalSvgPaint.g:1677:4: enumLiteral_141= 'violet'
                    {
                    enumLiteral_141=(Token)match(input,162,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getVioletEnumLiteralDeclaration_141().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_141, grammarAccess.getColorKeywordAccess().getVioletEnumLiteralDeclaration_141());
                    			

                    }


                    }
                    break;
                case 143 :
                    // InternalSvgPaint.g:1684:3: (enumLiteral_142= 'wheat' )
                    {
                    // InternalSvgPaint.g:1684:3: (enumLiteral_142= 'wheat' )
                    // InternalSvgPaint.g:1685:4: enumLiteral_142= 'wheat'
                    {
                    enumLiteral_142=(Token)match(input,163,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getWheatEnumLiteralDeclaration_142().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_142, grammarAccess.getColorKeywordAccess().getWheatEnumLiteralDeclaration_142());
                    			

                    }


                    }
                    break;
                case 144 :
                    // InternalSvgPaint.g:1692:3: (enumLiteral_143= 'white' )
                    {
                    // InternalSvgPaint.g:1692:3: (enumLiteral_143= 'white' )
                    // InternalSvgPaint.g:1693:4: enumLiteral_143= 'white'
                    {
                    enumLiteral_143=(Token)match(input,164,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getWhiteEnumLiteralDeclaration_143().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_143, grammarAccess.getColorKeywordAccess().getWhiteEnumLiteralDeclaration_143());
                    			

                    }


                    }
                    break;
                case 145 :
                    // InternalSvgPaint.g:1700:3: (enumLiteral_144= 'whitesmoke' )
                    {
                    // InternalSvgPaint.g:1700:3: (enumLiteral_144= 'whitesmoke' )
                    // InternalSvgPaint.g:1701:4: enumLiteral_144= 'whitesmoke'
                    {
                    enumLiteral_144=(Token)match(input,165,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getWhitesmokeEnumLiteralDeclaration_144().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_144, grammarAccess.getColorKeywordAccess().getWhitesmokeEnumLiteralDeclaration_144());
                    			

                    }


                    }
                    break;
                case 146 :
                    // InternalSvgPaint.g:1708:3: (enumLiteral_145= 'yellow' )
                    {
                    // InternalSvgPaint.g:1708:3: (enumLiteral_145= 'yellow' )
                    // InternalSvgPaint.g:1709:4: enumLiteral_145= 'yellow'
                    {
                    enumLiteral_145=(Token)match(input,166,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getYellowEnumLiteralDeclaration_145().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_145, grammarAccess.getColorKeywordAccess().getYellowEnumLiteralDeclaration_145());
                    			

                    }


                    }
                    break;
                case 147 :
                    // InternalSvgPaint.g:1716:3: (enumLiteral_146= 'yellowgreen' )
                    {
                    // InternalSvgPaint.g:1716:3: (enumLiteral_146= 'yellowgreen' )
                    // InternalSvgPaint.g:1717:4: enumLiteral_146= 'yellowgreen'
                    {
                    enumLiteral_146=(Token)match(input,167,FOLLOW_2); 

                    				current = grammarAccess.getColorKeywordAccess().getYellowgreenEnumLiteralDeclaration_146().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_146, grammarAccess.getColorKeywordAccess().getYellowgreenEnumLiteralDeclaration_146());
                    			

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
    // $ANTLR end "ruleColorKeyword"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});

}