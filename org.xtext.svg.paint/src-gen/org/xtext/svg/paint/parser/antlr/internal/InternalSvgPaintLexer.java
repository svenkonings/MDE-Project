package org.xtext.svg.paint.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSvgPaintLexer extends Lexer {
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

    public InternalSvgPaintLexer() {;} 
    public InternalSvgPaintLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSvgPaintLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSvgPaint.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:11:7: ( 'none' )
            // InternalSvgPaint.g:11:9: 'none'
            {
            match("none"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:12:7: ( 'rgb' )
            // InternalSvgPaint.g:12:9: 'rgb'
            {
            match("rgb"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:13:7: ( '(' )
            // InternalSvgPaint.g:13:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:14:7: ( ',' )
            // InternalSvgPaint.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:15:7: ( ')' )
            // InternalSvgPaint.g:15:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:16:7: ( 'url' )
            // InternalSvgPaint.g:16:9: 'url'
            {
            match("url"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:17:7: ( '#' )
            // InternalSvgPaint.g:17:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:18:7: ( 'aliceblue' )
            // InternalSvgPaint.g:18:9: 'aliceblue'
            {
            match("aliceblue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:19:7: ( 'antiquewhite' )
            // InternalSvgPaint.g:19:9: 'antiquewhite'
            {
            match("antiquewhite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:20:7: ( 'aqua' )
            // InternalSvgPaint.g:20:9: 'aqua'
            {
            match("aqua"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:21:7: ( 'aquamarine' )
            // InternalSvgPaint.g:21:9: 'aquamarine'
            {
            match("aquamarine"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:22:7: ( 'azure' )
            // InternalSvgPaint.g:22:9: 'azure'
            {
            match("azure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:23:7: ( 'beige' )
            // InternalSvgPaint.g:23:9: 'beige'
            {
            match("beige"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:24:7: ( 'bisque' )
            // InternalSvgPaint.g:24:9: 'bisque'
            {
            match("bisque"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:25:7: ( 'black' )
            // InternalSvgPaint.g:25:9: 'black'
            {
            match("black"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:26:7: ( 'blanchedalmond' )
            // InternalSvgPaint.g:26:9: 'blanchedalmond'
            {
            match("blanchedalmond"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:27:7: ( 'blue' )
            // InternalSvgPaint.g:27:9: 'blue'
            {
            match("blue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:28:7: ( 'blueviolet' )
            // InternalSvgPaint.g:28:9: 'blueviolet'
            {
            match("blueviolet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:29:7: ( 'brown' )
            // InternalSvgPaint.g:29:9: 'brown'
            {
            match("brown"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:30:7: ( 'burlywood' )
            // InternalSvgPaint.g:30:9: 'burlywood'
            {
            match("burlywood"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:31:7: ( 'cadetblue' )
            // InternalSvgPaint.g:31:9: 'cadetblue'
            {
            match("cadetblue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:32:7: ( 'chartreuse' )
            // InternalSvgPaint.g:32:9: 'chartreuse'
            {
            match("chartreuse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:33:7: ( 'chocolate' )
            // InternalSvgPaint.g:33:9: 'chocolate'
            {
            match("chocolate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:34:7: ( 'coral' )
            // InternalSvgPaint.g:34:9: 'coral'
            {
            match("coral"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:35:7: ( 'cornflowerblue' )
            // InternalSvgPaint.g:35:9: 'cornflowerblue'
            {
            match("cornflowerblue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:36:7: ( 'cornsilk' )
            // InternalSvgPaint.g:36:9: 'cornsilk'
            {
            match("cornsilk"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:37:7: ( 'crimson' )
            // InternalSvgPaint.g:37:9: 'crimson'
            {
            match("crimson"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:38:7: ( 'cyan' )
            // InternalSvgPaint.g:38:9: 'cyan'
            {
            match("cyan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:39:7: ( 'darkblue' )
            // InternalSvgPaint.g:39:9: 'darkblue'
            {
            match("darkblue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:40:7: ( 'darkcyan' )
            // InternalSvgPaint.g:40:9: 'darkcyan'
            {
            match("darkcyan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:41:7: ( 'darkgoldenrod' )
            // InternalSvgPaint.g:41:9: 'darkgoldenrod'
            {
            match("darkgoldenrod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:42:7: ( 'darkgray' )
            // InternalSvgPaint.g:42:9: 'darkgray'
            {
            match("darkgray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:43:7: ( 'darkgreen' )
            // InternalSvgPaint.g:43:9: 'darkgreen'
            {
            match("darkgreen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:44:7: ( 'darkgrey' )
            // InternalSvgPaint.g:44:9: 'darkgrey'
            {
            match("darkgrey"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:45:7: ( 'darkkhaki' )
            // InternalSvgPaint.g:45:9: 'darkkhaki'
            {
            match("darkkhaki"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:46:7: ( 'darkmagenta' )
            // InternalSvgPaint.g:46:9: 'darkmagenta'
            {
            match("darkmagenta"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:47:7: ( 'darkolivegreen' )
            // InternalSvgPaint.g:47:9: 'darkolivegreen'
            {
            match("darkolivegreen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:48:7: ( 'darkorange' )
            // InternalSvgPaint.g:48:9: 'darkorange'
            {
            match("darkorange"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:49:7: ( 'darkorchid' )
            // InternalSvgPaint.g:49:9: 'darkorchid'
            {
            match("darkorchid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:50:7: ( 'darkred' )
            // InternalSvgPaint.g:50:9: 'darkred'
            {
            match("darkred"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:51:7: ( 'darksalmon' )
            // InternalSvgPaint.g:51:9: 'darksalmon'
            {
            match("darksalmon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:52:7: ( 'darkseagreen' )
            // InternalSvgPaint.g:52:9: 'darkseagreen'
            {
            match("darkseagreen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:53:7: ( 'darkslateblue' )
            // InternalSvgPaint.g:53:9: 'darkslateblue'
            {
            match("darkslateblue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:54:7: ( 'darkslategray' )
            // InternalSvgPaint.g:54:9: 'darkslategray'
            {
            match("darkslategray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:55:7: ( 'darkslategrey' )
            // InternalSvgPaint.g:55:9: 'darkslategrey'
            {
            match("darkslategrey"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:56:7: ( 'darkturquoise' )
            // InternalSvgPaint.g:56:9: 'darkturquoise'
            {
            match("darkturquoise"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:57:7: ( 'darkviolet' )
            // InternalSvgPaint.g:57:9: 'darkviolet'
            {
            match("darkviolet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:58:7: ( 'deeppink' )
            // InternalSvgPaint.g:58:9: 'deeppink'
            {
            match("deeppink"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:59:7: ( 'deepskyblue' )
            // InternalSvgPaint.g:59:9: 'deepskyblue'
            {
            match("deepskyblue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:60:7: ( 'dimgray' )
            // InternalSvgPaint.g:60:9: 'dimgray'
            {
            match("dimgray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:61:7: ( 'dimgrey' )
            // InternalSvgPaint.g:61:9: 'dimgrey'
            {
            match("dimgrey"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:62:7: ( 'dodgerblue' )
            // InternalSvgPaint.g:62:9: 'dodgerblue'
            {
            match("dodgerblue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:63:7: ( 'firebrick' )
            // InternalSvgPaint.g:63:9: 'firebrick'
            {
            match("firebrick"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:64:7: ( 'floralwhite' )
            // InternalSvgPaint.g:64:9: 'floralwhite'
            {
            match("floralwhite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:65:7: ( 'forestgreen' )
            // InternalSvgPaint.g:65:9: 'forestgreen'
            {
            match("forestgreen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:66:7: ( 'fuchsia' )
            // InternalSvgPaint.g:66:9: 'fuchsia'
            {
            match("fuchsia"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:67:7: ( 'gainsboro' )
            // InternalSvgPaint.g:67:9: 'gainsboro'
            {
            match("gainsboro"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:68:7: ( 'ghostwhite' )
            // InternalSvgPaint.g:68:9: 'ghostwhite'
            {
            match("ghostwhite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:69:7: ( 'gold' )
            // InternalSvgPaint.g:69:9: 'gold'
            {
            match("gold"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:70:7: ( 'goldenrod' )
            // InternalSvgPaint.g:70:9: 'goldenrod'
            {
            match("goldenrod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:71:7: ( 'gray' )
            // InternalSvgPaint.g:71:9: 'gray'
            {
            match("gray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:72:7: ( 'grey' )
            // InternalSvgPaint.g:72:9: 'grey'
            {
            match("grey"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:73:7: ( 'green' )
            // InternalSvgPaint.g:73:9: 'green'
            {
            match("green"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:74:7: ( 'greenyellow' )
            // InternalSvgPaint.g:74:9: 'greenyellow'
            {
            match("greenyellow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:75:7: ( 'honeydew' )
            // InternalSvgPaint.g:75:9: 'honeydew'
            {
            match("honeydew"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:76:7: ( 'hotpink' )
            // InternalSvgPaint.g:76:9: 'hotpink'
            {
            match("hotpink"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:77:7: ( 'indianred' )
            // InternalSvgPaint.g:77:9: 'indianred'
            {
            match("indianred"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:78:7: ( 'indigo' )
            // InternalSvgPaint.g:78:9: 'indigo'
            {
            match("indigo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:79:7: ( 'ivory' )
            // InternalSvgPaint.g:79:9: 'ivory'
            {
            match("ivory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:80:7: ( 'khaki' )
            // InternalSvgPaint.g:80:9: 'khaki'
            {
            match("khaki"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:81:7: ( 'lavender' )
            // InternalSvgPaint.g:81:9: 'lavender'
            {
            match("lavender"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:82:7: ( 'lavenderblush' )
            // InternalSvgPaint.g:82:9: 'lavenderblush'
            {
            match("lavenderblush"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:83:7: ( 'lawngreen' )
            // InternalSvgPaint.g:83:9: 'lawngreen'
            {
            match("lawngreen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:84:7: ( 'lemonchiffon' )
            // InternalSvgPaint.g:84:9: 'lemonchiffon'
            {
            match("lemonchiffon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:85:7: ( 'lightblue' )
            // InternalSvgPaint.g:85:9: 'lightblue'
            {
            match("lightblue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:86:7: ( 'lightcoral' )
            // InternalSvgPaint.g:86:9: 'lightcoral'
            {
            match("lightcoral"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:87:7: ( 'lightcyan' )
            // InternalSvgPaint.g:87:9: 'lightcyan'
            {
            match("lightcyan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:88:7: ( 'lightgoldenrodyellow' )
            // InternalSvgPaint.g:88:9: 'lightgoldenrodyellow'
            {
            match("lightgoldenrodyellow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:89:7: ( 'lightgray' )
            // InternalSvgPaint.g:89:9: 'lightgray'
            {
            match("lightgray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:90:7: ( 'lightgreen' )
            // InternalSvgPaint.g:90:9: 'lightgreen'
            {
            match("lightgreen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:91:7: ( 'lightgrey' )
            // InternalSvgPaint.g:91:9: 'lightgrey'
            {
            match("lightgrey"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:92:7: ( 'lightpink' )
            // InternalSvgPaint.g:92:9: 'lightpink'
            {
            match("lightpink"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:93:7: ( 'lightsalmon' )
            // InternalSvgPaint.g:93:9: 'lightsalmon'
            {
            match("lightsalmon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:94:7: ( 'lightseagreen' )
            // InternalSvgPaint.g:94:9: 'lightseagreen'
            {
            match("lightseagreen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:95:7: ( 'lightskyblue' )
            // InternalSvgPaint.g:95:9: 'lightskyblue'
            {
            match("lightskyblue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:96:7: ( 'lightslategray' )
            // InternalSvgPaint.g:96:9: 'lightslategray'
            {
            match("lightslategray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:97:8: ( 'lightslategrey' )
            // InternalSvgPaint.g:97:10: 'lightslategrey'
            {
            match("lightslategrey"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:98:8: ( 'lightsteelblue' )
            // InternalSvgPaint.g:98:10: 'lightsteelblue'
            {
            match("lightsteelblue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:99:8: ( 'lightyellow' )
            // InternalSvgPaint.g:99:10: 'lightyellow'
            {
            match("lightyellow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:100:8: ( 'lime' )
            // InternalSvgPaint.g:100:10: 'lime'
            {
            match("lime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:101:8: ( 'limegreen' )
            // InternalSvgPaint.g:101:10: 'limegreen'
            {
            match("limegreen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:102:8: ( 'linen' )
            // InternalSvgPaint.g:102:10: 'linen'
            {
            match("linen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:103:8: ( 'magenta' )
            // InternalSvgPaint.g:103:10: 'magenta'
            {
            match("magenta"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:104:8: ( 'maroon' )
            // InternalSvgPaint.g:104:10: 'maroon'
            {
            match("maroon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:105:8: ( 'mediumaquamarine' )
            // InternalSvgPaint.g:105:10: 'mediumaquamarine'
            {
            match("mediumaquamarine"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:106:8: ( 'mediumblue' )
            // InternalSvgPaint.g:106:10: 'mediumblue'
            {
            match("mediumblue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:107:8: ( 'mediumorchid' )
            // InternalSvgPaint.g:107:10: 'mediumorchid'
            {
            match("mediumorchid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:108:8: ( 'mediumpurple' )
            // InternalSvgPaint.g:108:10: 'mediumpurple'
            {
            match("mediumpurple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:109:8: ( 'mediumseagreen' )
            // InternalSvgPaint.g:109:10: 'mediumseagreen'
            {
            match("mediumseagreen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:110:8: ( 'mediumslateblue' )
            // InternalSvgPaint.g:110:10: 'mediumslateblue'
            {
            match("mediumslateblue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:111:8: ( 'mediumspringgreen' )
            // InternalSvgPaint.g:111:10: 'mediumspringgreen'
            {
            match("mediumspringgreen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:112:8: ( 'mediumturquoise' )
            // InternalSvgPaint.g:112:10: 'mediumturquoise'
            {
            match("mediumturquoise"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:113:8: ( 'mediumvioletred' )
            // InternalSvgPaint.g:113:10: 'mediumvioletred'
            {
            match("mediumvioletred"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:114:8: ( 'midnightblue' )
            // InternalSvgPaint.g:114:10: 'midnightblue'
            {
            match("midnightblue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:115:8: ( 'mintcream' )
            // InternalSvgPaint.g:115:10: 'mintcream'
            {
            match("mintcream"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:116:8: ( 'mistyrose' )
            // InternalSvgPaint.g:116:10: 'mistyrose'
            {
            match("mistyrose"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:117:8: ( 'moccasin' )
            // InternalSvgPaint.g:117:10: 'moccasin'
            {
            match("moccasin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:118:8: ( 'navajowhite' )
            // InternalSvgPaint.g:118:10: 'navajowhite'
            {
            match("navajowhite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:119:8: ( 'navy' )
            // InternalSvgPaint.g:119:10: 'navy'
            {
            match("navy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:120:8: ( 'oldlace' )
            // InternalSvgPaint.g:120:10: 'oldlace'
            {
            match("oldlace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:121:8: ( 'olive' )
            // InternalSvgPaint.g:121:10: 'olive'
            {
            match("olive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:122:8: ( 'olivedrab' )
            // InternalSvgPaint.g:122:10: 'olivedrab'
            {
            match("olivedrab"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:123:8: ( 'orange' )
            // InternalSvgPaint.g:123:10: 'orange'
            {
            match("orange"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:124:8: ( 'orangered' )
            // InternalSvgPaint.g:124:10: 'orangered'
            {
            match("orangered"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:125:8: ( 'orchid' )
            // InternalSvgPaint.g:125:10: 'orchid'
            {
            match("orchid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:126:8: ( 'palegoldenrod' )
            // InternalSvgPaint.g:126:10: 'palegoldenrod'
            {
            match("palegoldenrod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:127:8: ( 'palegreen' )
            // InternalSvgPaint.g:127:10: 'palegreen'
            {
            match("palegreen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:128:8: ( 'paleturquoise' )
            // InternalSvgPaint.g:128:10: 'paleturquoise'
            {
            match("paleturquoise"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:129:8: ( 'palevioletred' )
            // InternalSvgPaint.g:129:10: 'palevioletred'
            {
            match("palevioletred"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:130:8: ( 'papayawhip' )
            // InternalSvgPaint.g:130:10: 'papayawhip'
            {
            match("papayawhip"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:131:8: ( 'peachpuff' )
            // InternalSvgPaint.g:131:10: 'peachpuff'
            {
            match("peachpuff"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:132:8: ( 'peru' )
            // InternalSvgPaint.g:132:10: 'peru'
            {
            match("peru"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:133:8: ( 'pink' )
            // InternalSvgPaint.g:133:10: 'pink'
            {
            match("pink"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:134:8: ( 'plum' )
            // InternalSvgPaint.g:134:10: 'plum'
            {
            match("plum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:135:8: ( 'powderblue' )
            // InternalSvgPaint.g:135:10: 'powderblue'
            {
            match("powderblue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:136:8: ( 'purple' )
            // InternalSvgPaint.g:136:10: 'purple'
            {
            match("purple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:137:8: ( 'red' )
            // InternalSvgPaint.g:137:10: 'red'
            {
            match("red"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:138:8: ( 'rosybrown' )
            // InternalSvgPaint.g:138:10: 'rosybrown'
            {
            match("rosybrown"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:139:8: ( 'royalblue' )
            // InternalSvgPaint.g:139:10: 'royalblue'
            {
            match("royalblue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:140:8: ( 'saddlebrown' )
            // InternalSvgPaint.g:140:10: 'saddlebrown'
            {
            match("saddlebrown"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:141:8: ( 'salmon' )
            // InternalSvgPaint.g:141:10: 'salmon'
            {
            match("salmon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:142:8: ( 'sandybrown' )
            // InternalSvgPaint.g:142:10: 'sandybrown'
            {
            match("sandybrown"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:143:8: ( 'seagreen' )
            // InternalSvgPaint.g:143:10: 'seagreen'
            {
            match("seagreen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:144:8: ( 'seashell' )
            // InternalSvgPaint.g:144:10: 'seashell'
            {
            match("seashell"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:145:8: ( 'sienna' )
            // InternalSvgPaint.g:145:10: 'sienna'
            {
            match("sienna"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:146:8: ( 'silver' )
            // InternalSvgPaint.g:146:10: 'silver'
            {
            match("silver"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:147:8: ( 'skyblue' )
            // InternalSvgPaint.g:147:10: 'skyblue'
            {
            match("skyblue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__150"

    // $ANTLR start "T__151"
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:148:8: ( 'slateblue' )
            // InternalSvgPaint.g:148:10: 'slateblue'
            {
            match("slateblue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__151"

    // $ANTLR start "T__152"
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:149:8: ( 'slategray' )
            // InternalSvgPaint.g:149:10: 'slategray'
            {
            match("slategray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__152"

    // $ANTLR start "T__153"
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:150:8: ( 'slategrey' )
            // InternalSvgPaint.g:150:10: 'slategrey'
            {
            match("slategrey"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__153"

    // $ANTLR start "T__154"
    public final void mT__154() throws RecognitionException {
        try {
            int _type = T__154;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:151:8: ( 'snow' )
            // InternalSvgPaint.g:151:10: 'snow'
            {
            match("snow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__154"

    // $ANTLR start "T__155"
    public final void mT__155() throws RecognitionException {
        try {
            int _type = T__155;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:152:8: ( 'springgreen' )
            // InternalSvgPaint.g:152:10: 'springgreen'
            {
            match("springgreen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__155"

    // $ANTLR start "T__156"
    public final void mT__156() throws RecognitionException {
        try {
            int _type = T__156;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:153:8: ( 'steelblue' )
            // InternalSvgPaint.g:153:10: 'steelblue'
            {
            match("steelblue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__156"

    // $ANTLR start "T__157"
    public final void mT__157() throws RecognitionException {
        try {
            int _type = T__157;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:154:8: ( 'tan' )
            // InternalSvgPaint.g:154:10: 'tan'
            {
            match("tan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__157"

    // $ANTLR start "T__158"
    public final void mT__158() throws RecognitionException {
        try {
            int _type = T__158;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:155:8: ( 'teal' )
            // InternalSvgPaint.g:155:10: 'teal'
            {
            match("teal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__158"

    // $ANTLR start "T__159"
    public final void mT__159() throws RecognitionException {
        try {
            int _type = T__159;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:156:8: ( 'thistle' )
            // InternalSvgPaint.g:156:10: 'thistle'
            {
            match("thistle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__159"

    // $ANTLR start "T__160"
    public final void mT__160() throws RecognitionException {
        try {
            int _type = T__160;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:157:8: ( 'tomato' )
            // InternalSvgPaint.g:157:10: 'tomato'
            {
            match("tomato"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__160"

    // $ANTLR start "T__161"
    public final void mT__161() throws RecognitionException {
        try {
            int _type = T__161;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:158:8: ( 'turquoise' )
            // InternalSvgPaint.g:158:10: 'turquoise'
            {
            match("turquoise"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__161"

    // $ANTLR start "T__162"
    public final void mT__162() throws RecognitionException {
        try {
            int _type = T__162;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:159:8: ( 'violet' )
            // InternalSvgPaint.g:159:10: 'violet'
            {
            match("violet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__162"

    // $ANTLR start "T__163"
    public final void mT__163() throws RecognitionException {
        try {
            int _type = T__163;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:160:8: ( 'wheat' )
            // InternalSvgPaint.g:160:10: 'wheat'
            {
            match("wheat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__163"

    // $ANTLR start "T__164"
    public final void mT__164() throws RecognitionException {
        try {
            int _type = T__164;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:161:8: ( 'white' )
            // InternalSvgPaint.g:161:10: 'white'
            {
            match("white"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__164"

    // $ANTLR start "T__165"
    public final void mT__165() throws RecognitionException {
        try {
            int _type = T__165;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:162:8: ( 'whitesmoke' )
            // InternalSvgPaint.g:162:10: 'whitesmoke'
            {
            match("whitesmoke"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__165"

    // $ANTLR start "T__166"
    public final void mT__166() throws RecognitionException {
        try {
            int _type = T__166;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:163:8: ( 'yellow' )
            // InternalSvgPaint.g:163:10: 'yellow'
            {
            match("yellow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__166"

    // $ANTLR start "T__167"
    public final void mT__167() throws RecognitionException {
        try {
            int _type = T__167;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:164:8: ( 'yellowgreen' )
            // InternalSvgPaint.g:164:10: 'yellowgreen'
            {
            match("yellowgreen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__167"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:1726:10: ( '#' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // InternalSvgPaint.g:1726:12: '#' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match('#'); 
            // InternalSvgPaint.g:1726:16: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='F')||(LA1_0>='a' && LA1_0<='f')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSvgPaint.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_RGB_NUMBER"
    public final void mRULE_RGB_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_RGB_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:1728:17: ( ( '2' '5' '0' .. '5' | '2' '0' .. '4' '0' .. '9' | ( '0..1' )? ( '0..9' )? '0' .. '9' ) )
            // InternalSvgPaint.g:1728:19: ( '2' '5' '0' .. '5' | '2' '0' .. '4' '0' .. '9' | ( '0..1' )? ( '0..9' )? '0' .. '9' )
            {
            // InternalSvgPaint.g:1728:19: ( '2' '5' '0' .. '5' | '2' '0' .. '4' '0' .. '9' | ( '0..1' )? ( '0..9' )? '0' .. '9' )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='2') ) {
                switch ( input.LA(2) ) {
                case '5':
                    {
                    alt4=1;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                    {
                    alt4=2;
                    }
                    break;
                default:
                    alt4=3;}

            }
            else if ( ((LA4_0>='0' && LA4_0<='1')||(LA4_0>='3' && LA4_0<='9')) ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSvgPaint.g:1728:20: '2' '5' '0' .. '5'
                    {
                    match('2'); 
                    match('5'); 
                    matchRange('0','5'); 

                    }
                    break;
                case 2 :
                    // InternalSvgPaint.g:1728:37: '2' '0' .. '4' '0' .. '9'
                    {
                    match('2'); 
                    matchRange('0','4'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 3 :
                    // InternalSvgPaint.g:1728:59: ( '0..1' )? ( '0..9' )? '0' .. '9'
                    {
                    // InternalSvgPaint.g:1728:59: ( '0..1' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='0') ) {
                        int LA2_1 = input.LA(2);

                        if ( (LA2_1=='.') ) {
                            int LA2_3 = input.LA(3);

                            if ( (LA2_3=='.') ) {
                                int LA2_4 = input.LA(4);

                                if ( (LA2_4=='1') ) {
                                    alt2=1;
                                }
                            }
                        }
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalSvgPaint.g:1728:59: '0..1'
                            {
                            match("0..1"); 


                            }
                            break;

                    }

                    // InternalSvgPaint.g:1728:67: ( '0..9' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='0') ) {
                        int LA3_1 = input.LA(2);

                        if ( (LA3_1=='.') ) {
                            alt3=1;
                        }
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalSvgPaint.g:1728:67: '0..9'
                            {
                            match("0..9"); 


                            }
                            break;

                    }

                    matchRange('0','9'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RGB_NUMBER"

    // $ANTLR start "RULE_RGB_PERCENTAGE"
    public final void mRULE_RGB_PERCENTAGE() throws RecognitionException {
        try {
            int _type = RULE_RGB_PERCENTAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:1730:21: ( ( ( '+' | '-' )? RULE_INT '%' | ( '+' | '-' )? ( RULE_INT )? '.' RULE_INT '%' ) )
            // InternalSvgPaint.g:1730:23: ( ( '+' | '-' )? RULE_INT '%' | ( '+' | '-' )? ( RULE_INT )? '.' RULE_INT '%' )
            {
            // InternalSvgPaint.g:1730:23: ( ( '+' | '-' )? RULE_INT '%' | ( '+' | '-' )? ( RULE_INT )? '.' RULE_INT '%' )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalSvgPaint.g:1730:24: ( '+' | '-' )? RULE_INT '%'
                    {
                    // InternalSvgPaint.g:1730:24: ( '+' | '-' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='+'||LA5_0=='-') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalSvgPaint.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 
                    match('%'); 

                    }
                    break;
                case 2 :
                    // InternalSvgPaint.g:1730:48: ( '+' | '-' )? ( RULE_INT )? '.' RULE_INT '%'
                    {
                    // InternalSvgPaint.g:1730:48: ( '+' | '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='+'||LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalSvgPaint.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // InternalSvgPaint.g:1730:59: ( RULE_INT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalSvgPaint.g:1730:59: RULE_INT
                            {
                            mRULE_INT(); 

                            }
                            break;

                    }

                    match('.'); 
                    mRULE_INT(); 
                    match('%'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RGB_PERCENTAGE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:1732:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSvgPaint.g:1732:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSvgPaint.g:1732:11: ( '^' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='^') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSvgPaint.g:1732:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSvgPaint.g:1732:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSvgPaint.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalSvgPaint.g:1734:19: ( ( '0' .. '9' )+ )
            // InternalSvgPaint.g:1734:21: ( '0' .. '9' )+
            {
            // InternalSvgPaint.g:1734:21: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSvgPaint.g:1734:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:1736:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSvgPaint.g:1736:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSvgPaint.g:1736:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') ) {
                alt14=1;
            }
            else if ( (LA14_0=='\'') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSvgPaint.g:1736:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSvgPaint.g:1736:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSvgPaint.g:1736:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSvgPaint.g:1736:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSvgPaint.g:1736:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSvgPaint.g:1736:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalSvgPaint.g:1736:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSvgPaint.g:1736:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:1738:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSvgPaint.g:1738:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSvgPaint.g:1738:24: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSvgPaint.g:1738:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:1740:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSvgPaint.g:1740:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSvgPaint.g:1740:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSvgPaint.g:1740:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalSvgPaint.g:1740:40: ( ( '\\r' )? '\\n' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\n'||LA18_0=='\r') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSvgPaint.g:1740:41: ( '\\r' )? '\\n'
                    {
                    // InternalSvgPaint.g:1740:41: ( '\\r' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\r') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalSvgPaint.g:1740:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:1742:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSvgPaint.g:1742:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSvgPaint.g:1742:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSvgPaint.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSvgPaint.g:1744:16: ( . )
            // InternalSvgPaint.g:1744:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalSvgPaint.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | RULE_HEX | RULE_RGB_NUMBER | RULE_RGB_PERCENTAGE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt20=163;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // InternalSvgPaint.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalSvgPaint.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalSvgPaint.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalSvgPaint.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalSvgPaint.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalSvgPaint.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalSvgPaint.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalSvgPaint.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalSvgPaint.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalSvgPaint.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalSvgPaint.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalSvgPaint.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalSvgPaint.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalSvgPaint.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalSvgPaint.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalSvgPaint.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalSvgPaint.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalSvgPaint.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalSvgPaint.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalSvgPaint.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalSvgPaint.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalSvgPaint.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalSvgPaint.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalSvgPaint.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalSvgPaint.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalSvgPaint.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalSvgPaint.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalSvgPaint.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalSvgPaint.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalSvgPaint.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalSvgPaint.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalSvgPaint.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalSvgPaint.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalSvgPaint.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalSvgPaint.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalSvgPaint.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalSvgPaint.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // InternalSvgPaint.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // InternalSvgPaint.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // InternalSvgPaint.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // InternalSvgPaint.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // InternalSvgPaint.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // InternalSvgPaint.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // InternalSvgPaint.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // InternalSvgPaint.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // InternalSvgPaint.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // InternalSvgPaint.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // InternalSvgPaint.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // InternalSvgPaint.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // InternalSvgPaint.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // InternalSvgPaint.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // InternalSvgPaint.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // InternalSvgPaint.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // InternalSvgPaint.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // InternalSvgPaint.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // InternalSvgPaint.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // InternalSvgPaint.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // InternalSvgPaint.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // InternalSvgPaint.g:1:358: T__72
                {
                mT__72(); 

                }
                break;
            case 60 :
                // InternalSvgPaint.g:1:364: T__73
                {
                mT__73(); 

                }
                break;
            case 61 :
                // InternalSvgPaint.g:1:370: T__74
                {
                mT__74(); 

                }
                break;
            case 62 :
                // InternalSvgPaint.g:1:376: T__75
                {
                mT__75(); 

                }
                break;
            case 63 :
                // InternalSvgPaint.g:1:382: T__76
                {
                mT__76(); 

                }
                break;
            case 64 :
                // InternalSvgPaint.g:1:388: T__77
                {
                mT__77(); 

                }
                break;
            case 65 :
                // InternalSvgPaint.g:1:394: T__78
                {
                mT__78(); 

                }
                break;
            case 66 :
                // InternalSvgPaint.g:1:400: T__79
                {
                mT__79(); 

                }
                break;
            case 67 :
                // InternalSvgPaint.g:1:406: T__80
                {
                mT__80(); 

                }
                break;
            case 68 :
                // InternalSvgPaint.g:1:412: T__81
                {
                mT__81(); 

                }
                break;
            case 69 :
                // InternalSvgPaint.g:1:418: T__82
                {
                mT__82(); 

                }
                break;
            case 70 :
                // InternalSvgPaint.g:1:424: T__83
                {
                mT__83(); 

                }
                break;
            case 71 :
                // InternalSvgPaint.g:1:430: T__84
                {
                mT__84(); 

                }
                break;
            case 72 :
                // InternalSvgPaint.g:1:436: T__85
                {
                mT__85(); 

                }
                break;
            case 73 :
                // InternalSvgPaint.g:1:442: T__86
                {
                mT__86(); 

                }
                break;
            case 74 :
                // InternalSvgPaint.g:1:448: T__87
                {
                mT__87(); 

                }
                break;
            case 75 :
                // InternalSvgPaint.g:1:454: T__88
                {
                mT__88(); 

                }
                break;
            case 76 :
                // InternalSvgPaint.g:1:460: T__89
                {
                mT__89(); 

                }
                break;
            case 77 :
                // InternalSvgPaint.g:1:466: T__90
                {
                mT__90(); 

                }
                break;
            case 78 :
                // InternalSvgPaint.g:1:472: T__91
                {
                mT__91(); 

                }
                break;
            case 79 :
                // InternalSvgPaint.g:1:478: T__92
                {
                mT__92(); 

                }
                break;
            case 80 :
                // InternalSvgPaint.g:1:484: T__93
                {
                mT__93(); 

                }
                break;
            case 81 :
                // InternalSvgPaint.g:1:490: T__94
                {
                mT__94(); 

                }
                break;
            case 82 :
                // InternalSvgPaint.g:1:496: T__95
                {
                mT__95(); 

                }
                break;
            case 83 :
                // InternalSvgPaint.g:1:502: T__96
                {
                mT__96(); 

                }
                break;
            case 84 :
                // InternalSvgPaint.g:1:508: T__97
                {
                mT__97(); 

                }
                break;
            case 85 :
                // InternalSvgPaint.g:1:514: T__98
                {
                mT__98(); 

                }
                break;
            case 86 :
                // InternalSvgPaint.g:1:520: T__99
                {
                mT__99(); 

                }
                break;
            case 87 :
                // InternalSvgPaint.g:1:526: T__100
                {
                mT__100(); 

                }
                break;
            case 88 :
                // InternalSvgPaint.g:1:533: T__101
                {
                mT__101(); 

                }
                break;
            case 89 :
                // InternalSvgPaint.g:1:540: T__102
                {
                mT__102(); 

                }
                break;
            case 90 :
                // InternalSvgPaint.g:1:547: T__103
                {
                mT__103(); 

                }
                break;
            case 91 :
                // InternalSvgPaint.g:1:554: T__104
                {
                mT__104(); 

                }
                break;
            case 92 :
                // InternalSvgPaint.g:1:561: T__105
                {
                mT__105(); 

                }
                break;
            case 93 :
                // InternalSvgPaint.g:1:568: T__106
                {
                mT__106(); 

                }
                break;
            case 94 :
                // InternalSvgPaint.g:1:575: T__107
                {
                mT__107(); 

                }
                break;
            case 95 :
                // InternalSvgPaint.g:1:582: T__108
                {
                mT__108(); 

                }
                break;
            case 96 :
                // InternalSvgPaint.g:1:589: T__109
                {
                mT__109(); 

                }
                break;
            case 97 :
                // InternalSvgPaint.g:1:596: T__110
                {
                mT__110(); 

                }
                break;
            case 98 :
                // InternalSvgPaint.g:1:603: T__111
                {
                mT__111(); 

                }
                break;
            case 99 :
                // InternalSvgPaint.g:1:610: T__112
                {
                mT__112(); 

                }
                break;
            case 100 :
                // InternalSvgPaint.g:1:617: T__113
                {
                mT__113(); 

                }
                break;
            case 101 :
                // InternalSvgPaint.g:1:624: T__114
                {
                mT__114(); 

                }
                break;
            case 102 :
                // InternalSvgPaint.g:1:631: T__115
                {
                mT__115(); 

                }
                break;
            case 103 :
                // InternalSvgPaint.g:1:638: T__116
                {
                mT__116(); 

                }
                break;
            case 104 :
                // InternalSvgPaint.g:1:645: T__117
                {
                mT__117(); 

                }
                break;
            case 105 :
                // InternalSvgPaint.g:1:652: T__118
                {
                mT__118(); 

                }
                break;
            case 106 :
                // InternalSvgPaint.g:1:659: T__119
                {
                mT__119(); 

                }
                break;
            case 107 :
                // InternalSvgPaint.g:1:666: T__120
                {
                mT__120(); 

                }
                break;
            case 108 :
                // InternalSvgPaint.g:1:673: T__121
                {
                mT__121(); 

                }
                break;
            case 109 :
                // InternalSvgPaint.g:1:680: T__122
                {
                mT__122(); 

                }
                break;
            case 110 :
                // InternalSvgPaint.g:1:687: T__123
                {
                mT__123(); 

                }
                break;
            case 111 :
                // InternalSvgPaint.g:1:694: T__124
                {
                mT__124(); 

                }
                break;
            case 112 :
                // InternalSvgPaint.g:1:701: T__125
                {
                mT__125(); 

                }
                break;
            case 113 :
                // InternalSvgPaint.g:1:708: T__126
                {
                mT__126(); 

                }
                break;
            case 114 :
                // InternalSvgPaint.g:1:715: T__127
                {
                mT__127(); 

                }
                break;
            case 115 :
                // InternalSvgPaint.g:1:722: T__128
                {
                mT__128(); 

                }
                break;
            case 116 :
                // InternalSvgPaint.g:1:729: T__129
                {
                mT__129(); 

                }
                break;
            case 117 :
                // InternalSvgPaint.g:1:736: T__130
                {
                mT__130(); 

                }
                break;
            case 118 :
                // InternalSvgPaint.g:1:743: T__131
                {
                mT__131(); 

                }
                break;
            case 119 :
                // InternalSvgPaint.g:1:750: T__132
                {
                mT__132(); 

                }
                break;
            case 120 :
                // InternalSvgPaint.g:1:757: T__133
                {
                mT__133(); 

                }
                break;
            case 121 :
                // InternalSvgPaint.g:1:764: T__134
                {
                mT__134(); 

                }
                break;
            case 122 :
                // InternalSvgPaint.g:1:771: T__135
                {
                mT__135(); 

                }
                break;
            case 123 :
                // InternalSvgPaint.g:1:778: T__136
                {
                mT__136(); 

                }
                break;
            case 124 :
                // InternalSvgPaint.g:1:785: T__137
                {
                mT__137(); 

                }
                break;
            case 125 :
                // InternalSvgPaint.g:1:792: T__138
                {
                mT__138(); 

                }
                break;
            case 126 :
                // InternalSvgPaint.g:1:799: T__139
                {
                mT__139(); 

                }
                break;
            case 127 :
                // InternalSvgPaint.g:1:806: T__140
                {
                mT__140(); 

                }
                break;
            case 128 :
                // InternalSvgPaint.g:1:813: T__141
                {
                mT__141(); 

                }
                break;
            case 129 :
                // InternalSvgPaint.g:1:820: T__142
                {
                mT__142(); 

                }
                break;
            case 130 :
                // InternalSvgPaint.g:1:827: T__143
                {
                mT__143(); 

                }
                break;
            case 131 :
                // InternalSvgPaint.g:1:834: T__144
                {
                mT__144(); 

                }
                break;
            case 132 :
                // InternalSvgPaint.g:1:841: T__145
                {
                mT__145(); 

                }
                break;
            case 133 :
                // InternalSvgPaint.g:1:848: T__146
                {
                mT__146(); 

                }
                break;
            case 134 :
                // InternalSvgPaint.g:1:855: T__147
                {
                mT__147(); 

                }
                break;
            case 135 :
                // InternalSvgPaint.g:1:862: T__148
                {
                mT__148(); 

                }
                break;
            case 136 :
                // InternalSvgPaint.g:1:869: T__149
                {
                mT__149(); 

                }
                break;
            case 137 :
                // InternalSvgPaint.g:1:876: T__150
                {
                mT__150(); 

                }
                break;
            case 138 :
                // InternalSvgPaint.g:1:883: T__151
                {
                mT__151(); 

                }
                break;
            case 139 :
                // InternalSvgPaint.g:1:890: T__152
                {
                mT__152(); 

                }
                break;
            case 140 :
                // InternalSvgPaint.g:1:897: T__153
                {
                mT__153(); 

                }
                break;
            case 141 :
                // InternalSvgPaint.g:1:904: T__154
                {
                mT__154(); 

                }
                break;
            case 142 :
                // InternalSvgPaint.g:1:911: T__155
                {
                mT__155(); 

                }
                break;
            case 143 :
                // InternalSvgPaint.g:1:918: T__156
                {
                mT__156(); 

                }
                break;
            case 144 :
                // InternalSvgPaint.g:1:925: T__157
                {
                mT__157(); 

                }
                break;
            case 145 :
                // InternalSvgPaint.g:1:932: T__158
                {
                mT__158(); 

                }
                break;
            case 146 :
                // InternalSvgPaint.g:1:939: T__159
                {
                mT__159(); 

                }
                break;
            case 147 :
                // InternalSvgPaint.g:1:946: T__160
                {
                mT__160(); 

                }
                break;
            case 148 :
                // InternalSvgPaint.g:1:953: T__161
                {
                mT__161(); 

                }
                break;
            case 149 :
                // InternalSvgPaint.g:1:960: T__162
                {
                mT__162(); 

                }
                break;
            case 150 :
                // InternalSvgPaint.g:1:967: T__163
                {
                mT__163(); 

                }
                break;
            case 151 :
                // InternalSvgPaint.g:1:974: T__164
                {
                mT__164(); 

                }
                break;
            case 152 :
                // InternalSvgPaint.g:1:981: T__165
                {
                mT__165(); 

                }
                break;
            case 153 :
                // InternalSvgPaint.g:1:988: T__166
                {
                mT__166(); 

                }
                break;
            case 154 :
                // InternalSvgPaint.g:1:995: T__167
                {
                mT__167(); 

                }
                break;
            case 155 :
                // InternalSvgPaint.g:1:1002: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 156 :
                // InternalSvgPaint.g:1:1011: RULE_RGB_NUMBER
                {
                mRULE_RGB_NUMBER(); 

                }
                break;
            case 157 :
                // InternalSvgPaint.g:1:1027: RULE_RGB_PERCENTAGE
                {
                mRULE_RGB_PERCENTAGE(); 

                }
                break;
            case 158 :
                // InternalSvgPaint.g:1:1047: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 159 :
                // InternalSvgPaint.g:1:1055: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 160 :
                // InternalSvgPaint.g:1:1067: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 161 :
                // InternalSvgPaint.g:1:1083: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 162 :
                // InternalSvgPaint.g:1:1099: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 163 :
                // InternalSvgPaint.g:1:1107: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA8_eotS =
        "\5\uffff";
    static final String DFA8_eofS =
        "\5\uffff";
    static final String DFA8_minS =
        "\1\53\1\56\1\45\2\uffff";
    static final String DFA8_maxS =
        "\3\71\2\uffff";
    static final String DFA8_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA8_specialS =
        "\5\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\1\uffff\1\1\1\3\1\uffff\12\2",
            "\1\3\1\uffff\12\2",
            "\1\4\10\uffff\1\3\1\uffff\12\2",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1730:23: ( ( '+' | '-' )? RULE_INT '%' | ( '+' | '-' )? ( RULE_INT )? '.' RULE_INT '%' )";
        }
    }
    static final String DFA20_eotS =
        "\1\uffff\2\50\3\uffff\1\50\1\60\22\50\3\161\3\45\1\uffff\3\45\2\uffff\2\50\1\uffff\3\50\3\uffff\1\50\2\uffff\75\50\11\uffff\2\50\1\u00d3\1\u00d4\2\50\1\u00d7\106\50\1\u0122\10\50\2\161\1\u012b\1\50\1\u012d\2\uffff\2\50\1\uffff\2\50\1\u0133\5\50\1\u013a\10\50\1\u0144\12\50\1\u015a\1\u015b\1\u015c\12\50\1\u0169\17\50\1\u017b\1\u017c\1\u017d\13\50\1\u0189\2\50\1\uffff\1\u018c\7\50\1\uffff\1\50\1\uffff\5\50\1\uffff\1\u019a\1\u019b\1\50\1\u019d\2\50\1\uffff\1\u01a0\4\50\1\u01a5\3\50\1\uffff\25\50\3\uffff\1\u01c4\4\50\1\u01c9\1\u01ca\5\50\1\uffff\1\u01d5\10\50\1\u01df\7\50\3\uffff\13\50\1\uffff\2\50\1\uffff\4\50\1\u01fa\1\u01fc\7\50\2\uffff\1\u0204\1\uffff\2\50\1\uffff\4\50\1\uffff\36\50\1\uffff\3\50\1\u022e\2\uffff\12\50\1\uffff\1\50\1\u0240\7\50\1\uffff\1\u024f\1\u0250\7\50\1\u0258\1\50\1\u025a\3\50\1\u025e\1\u025f\6\50\1\u0266\1\50\1\u0268\1\uffff\1\50\1\uffff\1\u026b\6\50\1\uffff\10\50\1\u027a\12\50\1\u0286\7\50\1\u028e\1\u028f\4\50\1\u0294\5\50\1\u029a\1\50\1\uffff\20\50\1\u02ad\1\uffff\13\50\1\u02bb\2\50\2\uffff\7\50\1\uffff\1\50\1\uffff\3\50\2\uffff\1\u02c9\4\50\1\u02cf\1\uffff\1\50\1\uffff\2\50\1\uffff\15\50\1\u02e0\1\uffff\1\u02e1\1\u02e2\1\50\1\u02e4\1\50\1\u02e6\5\50\1\uffff\5\50\1\u02f1\1\50\2\uffff\4\50\1\uffff\4\50\1\u02fb\1\uffff\1\50\1\u02fe\20\50\1\uffff\14\50\1\u031c\1\uffff\13\50\1\u0328\1\u0329\1\uffff\5\50\1\uffff\4\50\1\u0333\1\u0334\1\u0335\4\50\1\u033a\1\u033b\1\50\1\u033d\1\50\3\uffff\1\50\1\uffff\1\u0340\1\uffff\1\u0341\11\50\1\uffff\2\50\1\u034e\2\50\1\u0351\1\50\1\u0353\1\50\1\uffff\1\u0355\1\50\1\uffff\1\u0357\1\50\1\u0359\1\50\1\u035b\1\50\1\u035d\1\50\1\u035f\1\u0360\6\50\1\u0367\12\50\1\u0372\1\u0373\1\uffff\1\u0374\1\u0375\1\50\1\u0377\3\50\1\u037b\3\50\2\uffff\1\u037f\1\u0380\1\u0381\1\50\1\u0383\1\u0384\3\50\3\uffff\1\50\1\u0389\1\50\1\u038b\2\uffff\1\u038c\1\uffff\2\50\2\uffff\2\50\1\u0391\1\u0392\1\u0393\4\50\1\u0398\1\50\1\u039a\1\uffff\2\50\1\uffff\1\u039d\1\uffff\1\50\1\uffff\1\50\1\uffff\1\50\1\uffff\1\u03a1\1\uffff\1\50\1\uffff\1\u03a3\2\uffff\6\50\1\uffff\1\50\1\u03ab\10\50\4\uffff\1\50\1\uffff\2\50\1\u03b7\1\uffff\1\u03b8\1\50\1\u03ba\3\uffff\1\50\2\uffff\1\u03bc\1\50\1\u03be\1\50\1\uffff\1\50\2\uffff\2\50\1\u03c3\1\50\3\uffff\4\50\1\uffff\1\u03ca\1\uffff\1\u03cb\1\u03cc\1\uffff\1\u03cd\2\50\1\uffff\1\50\1\uffff\1\u03d1\4\50\1\u03d6\1\50\1\uffff\13\50\2\uffff\1\u03e3\1\uffff\1\u03e4\1\uffff\1\u03e5\1\uffff\1\u03e6\3\50\1\uffff\1\50\1\u03eb\4\50\4\uffff\1\50\1\u03f1\1\50\1\uffff\1\50\1\u03f4\2\50\1\uffff\1\50\1\u03f9\1\u03fa\5\50\1\u0400\3\50\4\uffff\2\50\1\u0406\1\50\1\uffff\1\u0408\1\u0409\1\u040a\1\u040b\1\u040c\1\uffff\1\50\1\u040e\1\uffff\4\50\2\uffff\5\50\1\uffff\1\u0418\1\u0419\1\u041a\1\u041b\1\u041c\1\uffff\1\u041d\5\uffff\1\50\1\uffff\1\u041f\1\u0420\1\u0421\1\50\1\u0423\4\50\6\uffff\1\50\3\uffff\1\50\1\uffff\1\u042a\1\50\1\u042c\1\u042d\1\50\1\u042f\1\uffff\1\50\2\uffff\1\50\1\uffff\1\u0432\1\50\1\uffff\1\50\1\u0435\1\uffff";
    static final String DFA20_eofS =
        "\u0436\uffff";
    static final String DFA20_minS =
        "\1\0\1\141\1\145\3\uffff\1\162\1\60\1\154\1\145\2\141\1\151\1\141\1\157\1\156\1\150\2\141\1\154\3\141\1\151\1\150\1\145\3\45\1\56\1\60\1\101\1\uffff\2\0\1\52\2\uffff\1\156\1\166\1\uffff\1\142\1\144\1\163\3\uffff\1\154\2\uffff\1\151\1\164\2\165\1\151\1\163\1\141\1\157\1\162\1\144\1\141\1\162\1\151\1\141\1\162\1\145\1\155\1\144\1\162\1\157\1\162\1\143\1\151\1\157\1\154\1\141\1\156\1\144\1\157\1\141\1\166\1\155\2\147\2\144\1\143\1\144\1\141\1\154\1\141\1\156\1\165\1\167\1\162\1\144\1\141\1\145\1\171\1\141\1\157\1\162\1\145\1\156\1\141\1\151\1\155\1\162\1\157\1\145\1\154\2\45\2\uffff\1\56\4\uffff\1\145\1\141\2\60\1\171\1\141\1\60\1\143\1\151\1\141\1\162\1\147\1\161\1\143\1\145\1\167\1\154\1\145\1\162\1\143\1\141\1\155\1\156\1\153\1\160\2\147\1\145\1\162\1\145\1\150\1\156\1\163\1\144\1\171\2\145\1\160\1\151\1\162\1\153\1\145\1\156\1\157\1\150\3\145\1\157\1\151\1\156\2\164\1\143\1\154\1\166\1\156\1\150\1\145\1\141\1\143\1\165\1\153\1\155\1\144\1\160\1\144\1\155\1\144\1\147\1\156\1\166\1\142\1\164\1\167\1\151\1\145\1\60\1\154\1\163\1\141\1\161\1\154\1\141\1\164\1\154\2\45\1\60\1\152\1\60\2\uffff\1\142\1\154\1\uffff\1\145\1\161\1\60\2\145\1\165\1\153\1\143\1\60\1\156\1\171\2\164\1\157\1\154\1\146\1\163\1\60\1\142\1\160\1\162\1\145\1\142\1\141\3\163\1\164\3\60\1\156\1\171\1\151\1\141\1\171\1\151\1\156\1\147\1\156\1\164\1\60\2\156\1\157\1\165\1\151\1\143\1\171\2\141\1\145\1\147\1\151\1\147\1\171\1\150\3\60\1\145\2\154\1\157\1\171\1\162\1\150\1\156\1\145\1\154\1\145\1\60\1\156\1\154\1\uffff\1\60\2\164\1\165\1\145\1\164\1\145\1\157\1\uffff\1\157\1\uffff\1\162\2\142\1\165\1\141\1\uffff\2\60\1\145\1\60\1\150\1\151\1\uffff\1\60\1\167\1\142\1\162\1\154\1\60\1\154\1\151\1\157\1\uffff\1\154\1\171\1\157\1\150\1\141\1\154\1\145\1\141\1\165\2\151\1\153\1\141\2\162\1\154\1\164\1\151\1\142\1\167\1\156\3\uffff\1\60\1\144\2\156\1\157\2\60\1\144\1\162\1\143\1\142\1\162\1\uffff\1\60\1\164\1\156\1\155\1\147\2\162\1\163\1\143\1\60\1\145\1\144\1\157\1\165\1\151\1\141\1\160\3\uffff\1\162\2\145\1\156\1\142\2\145\1\141\1\162\1\165\1\142\1\uffff\1\147\1\142\1\uffff\1\154\2\157\1\164\2\60\2\167\1\157\2\154\1\145\1\162\2\uffff\1\60\1\uffff\1\145\1\157\1\uffff\1\157\1\154\1\145\1\141\1\uffff\1\157\1\154\1\156\1\165\1\141\1\154\2\141\1\147\1\151\1\141\1\144\1\154\2\141\1\162\1\157\1\156\3\171\1\142\1\151\1\167\1\147\1\141\1\157\1\150\1\162\1\145\1\uffff\1\145\1\153\1\162\1\60\2\uffff\2\145\1\150\1\154\2\157\1\151\1\141\2\145\1\uffff\1\141\1\60\1\141\1\150\1\145\1\157\1\151\1\145\1\162\1\uffff\2\60\1\154\1\145\1\162\1\157\1\167\1\165\1\142\1\60\1\142\1\60\1\162\1\145\1\154\2\60\1\145\1\154\1\162\1\147\1\154\1\145\1\60\1\151\1\60\1\uffff\1\155\1\uffff\1\60\1\150\1\167\2\165\1\167\1\151\1\uffff\1\144\1\154\1\157\2\165\1\164\1\167\1\153\1\60\1\145\1\156\1\144\1\171\1\145\1\153\1\145\1\166\1\156\1\150\1\60\1\155\1\147\1\164\1\161\1\154\1\153\1\142\2\60\1\154\1\143\1\150\1\162\1\60\1\162\1\151\1\157\1\154\1\167\1\60\1\145\1\uffff\1\162\1\145\1\151\1\165\1\162\1\141\1\154\1\141\1\156\1\154\1\141\1\171\1\141\1\145\1\154\1\145\1\60\1\uffff\1\161\1\154\1\162\1\165\1\145\1\165\1\151\1\164\1\141\1\163\1\156\1\60\1\141\1\145\2\uffff\1\144\1\145\1\161\1\154\1\150\1\146\1\154\1\uffff\1\162\1\uffff\1\157\1\156\1\154\2\uffff\1\60\1\165\1\141\1\162\1\165\1\60\1\uffff\1\163\1\uffff\1\157\1\162\1\uffff\1\151\1\156\2\145\1\150\1\156\1\141\1\145\1\144\1\145\1\163\2\145\1\60\1\uffff\2\60\1\145\1\60\1\156\1\60\1\151\1\156\1\145\1\147\1\151\1\uffff\1\157\1\162\1\145\1\165\1\145\1\60\1\154\2\uffff\1\165\1\153\1\151\1\145\1\uffff\1\157\1\164\1\144\1\154\1\60\1\uffff\1\144\1\60\1\156\1\146\1\145\1\141\1\156\1\144\1\171\1\145\1\153\1\155\1\147\1\142\1\164\1\145\1\154\1\156\1\uffff\2\165\1\143\1\162\2\141\2\162\1\157\1\142\1\155\1\145\1\60\1\uffff\1\142\1\144\1\145\1\156\1\165\1\145\1\151\1\146\1\165\1\157\1\167\2\60\1\uffff\1\145\2\171\2\145\1\uffff\1\145\1\153\1\145\1\164\3\60\1\151\1\145\1\154\1\164\2\60\1\145\1\60\1\162\3\uffff\1\156\1\uffff\1\60\1\uffff\1\60\1\164\1\147\1\145\1\144\1\156\1\145\1\142\1\157\1\164\1\uffff\1\165\1\145\1\60\1\164\1\145\1\60\1\145\1\60\1\157\1\uffff\1\60\1\154\1\uffff\1\60\1\146\1\60\1\154\1\60\1\145\1\60\1\156\2\60\1\157\1\162\1\154\1\145\1\154\1\157\1\60\1\141\1\145\1\150\1\160\1\147\1\164\1\151\1\161\2\154\2\60\1\uffff\2\60\1\156\1\60\1\157\1\164\1\160\1\60\1\145\1\167\1\156\2\uffff\3\60\1\145\2\60\3\145\3\uffff\1\164\1\60\1\155\1\60\2\uffff\1\60\1\uffff\1\142\1\162\2\uffff\1\141\1\162\3\60\1\145\1\154\1\162\1\151\1\60\1\145\1\60\1\uffff\1\145\1\156\1\uffff\1\60\1\uffff\1\167\1\uffff\1\165\1\uffff\1\157\1\uffff\1\60\1\uffff\1\156\1\uffff\1\60\2\uffff\1\156\1\145\1\165\1\147\1\142\1\167\1\uffff\1\155\1\60\1\151\1\154\1\162\1\145\1\156\1\165\1\145\1\165\4\uffff\1\162\1\uffff\1\151\1\162\1\60\1\uffff\1\60\1\156\1\60\3\uffff\1\156\2\uffff\1\60\1\156\1\60\1\145\1\uffff\1\157\2\uffff\1\154\1\157\1\60\1\145\3\uffff\1\156\1\165\1\141\1\163\1\uffff\1\60\1\uffff\2\60\1\uffff\1\60\1\163\1\156\1\uffff\1\162\1\uffff\1\60\2\145\1\162\1\154\1\60\1\141\1\uffff\1\144\2\145\1\142\1\147\1\157\1\164\1\145\1\157\1\163\1\145\2\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\156\1\165\1\144\1\uffff\1\145\1\60\1\145\2\171\1\145\4\uffff\1\150\1\60\1\157\1\uffff\1\156\1\60\1\141\1\165\1\uffff\1\162\2\60\1\145\1\154\1\147\1\151\1\162\1\60\1\144\1\145\1\144\4\uffff\1\144\1\145\1\60\1\156\1\uffff\5\60\1\uffff\1\144\1\60\1\uffff\2\171\1\145\1\151\2\uffff\1\156\1\165\1\162\1\163\1\145\1\uffff\5\60\1\uffff\1\60\5\uffff\1\171\1\uffff\3\60\1\156\1\60\3\145\1\144\6\uffff\1\145\3\uffff\1\145\1\uffff\1\60\1\145\2\60\1\154\1\60\1\uffff\1\156\2\uffff\1\154\1\uffff\1\60\1\157\1\uffff\1\167\1\60\1\uffff";
    static final String DFA20_maxS =
        "\1\uffff\2\157\3\uffff\1\162\1\146\1\172\1\165\1\171\1\157\1\165\1\162\1\157\1\166\1\150\1\151\1\157\1\162\1\165\1\164\1\165\1\151\1\150\1\145\5\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\156\1\166\1\uffff\1\142\1\144\1\171\3\uffff\1\154\2\uffff\1\151\1\164\2\165\1\151\1\163\1\165\1\157\1\162\1\144\1\157\1\162\1\151\1\141\1\162\1\145\1\155\1\144\1\162\1\157\1\162\1\143\1\151\1\157\1\154\1\145\1\164\1\144\1\157\1\141\1\167\1\155\1\156\1\162\1\144\1\163\1\143\1\151\1\143\1\160\1\162\1\156\1\165\1\167\1\162\1\156\1\141\1\154\1\171\1\141\1\157\1\162\1\145\1\156\1\141\1\151\1\155\1\162\1\157\1\151\1\154\2\71\2\uffff\1\71\4\uffff\1\145\1\171\2\172\1\171\1\141\1\172\1\143\1\151\1\141\1\162\1\147\1\161\1\156\1\145\1\167\1\154\1\145\1\162\1\143\1\156\1\155\1\156\1\153\1\160\2\147\1\145\1\162\1\145\1\150\1\156\1\163\1\144\2\171\1\145\1\160\1\151\1\162\1\153\1\145\1\156\1\157\1\150\3\145\1\157\1\151\1\156\2\164\1\143\1\154\1\166\1\156\1\150\1\145\1\141\1\143\1\165\1\153\1\155\1\144\1\160\1\144\1\155\1\144\1\163\1\156\1\166\1\142\1\164\1\167\1\151\1\145\1\172\1\154\1\163\1\141\1\161\1\154\1\141\1\164\1\154\2\71\1\172\1\152\1\172\2\uffff\1\142\1\154\1\uffff\1\145\1\161\1\172\2\145\1\165\1\153\1\143\1\172\1\156\1\171\2\164\1\157\1\154\2\163\1\172\1\166\1\163\1\162\1\145\1\142\1\141\3\163\1\164\3\172\1\156\1\171\1\151\1\147\1\171\1\151\1\156\1\147\1\156\1\164\1\172\2\156\1\157\1\165\1\151\1\143\1\171\2\141\1\145\1\147\1\151\1\166\1\171\1\150\3\172\1\145\2\154\1\157\1\171\1\162\1\150\1\156\1\145\1\154\1\145\1\172\1\156\1\154\1\uffff\1\172\2\164\1\165\1\145\1\164\1\145\1\157\1\uffff\1\157\1\uffff\1\162\2\142\1\165\1\141\1\uffff\2\172\1\145\1\172\1\150\1\151\1\uffff\1\172\1\167\1\142\1\162\1\154\1\172\1\154\1\151\1\157\1\uffff\1\154\1\171\1\162\1\150\1\141\1\162\1\145\1\154\1\165\2\151\1\153\1\145\2\162\1\154\1\164\1\151\1\142\1\167\1\156\3\uffff\1\172\1\144\2\156\1\157\2\172\1\144\1\162\1\143\1\171\1\162\1\uffff\1\172\1\164\1\156\1\155\1\147\2\162\1\163\1\143\1\172\1\145\1\144\1\162\1\165\1\151\1\141\1\160\3\uffff\1\162\2\145\1\156\1\142\2\145\1\141\1\162\1\165\1\147\1\uffff\1\147\1\142\1\uffff\1\154\2\157\1\164\2\172\2\167\1\157\2\154\1\145\1\162\2\uffff\1\172\1\uffff\1\145\1\157\1\uffff\1\157\1\154\1\145\1\141\1\uffff\1\157\1\154\1\156\1\165\1\141\1\154\1\145\1\141\1\147\1\151\1\143\1\144\1\154\2\141\1\162\1\157\1\156\3\171\1\142\1\151\1\167\1\147\1\141\1\157\1\150\1\162\1\145\1\uffff\1\145\1\153\1\162\1\172\2\uffff\2\145\1\150\1\154\1\171\1\162\1\151\1\164\2\145\1\uffff\1\141\1\172\1\166\1\150\1\145\1\157\1\151\1\145\1\162\1\uffff\2\172\1\154\1\145\1\162\1\157\1\167\1\165\1\142\1\172\1\142\1\172\1\162\1\145\1\154\2\172\1\145\1\154\1\162\1\147\1\154\1\145\1\172\1\151\1\172\1\uffff\1\155\1\uffff\1\172\1\150\1\167\2\165\1\167\1\151\1\uffff\1\144\1\154\1\157\2\165\1\164\1\167\1\153\1\172\1\145\1\156\1\144\2\171\1\153\1\145\1\166\1\156\1\150\1\172\1\155\1\147\1\164\1\161\1\154\1\153\1\142\2\172\1\154\1\143\1\150\1\162\1\172\1\162\1\151\1\157\1\154\1\167\1\172\1\145\1\uffff\1\162\1\145\1\151\1\165\1\162\1\141\1\154\1\145\1\156\1\154\1\141\1\171\1\141\1\145\1\154\1\145\1\172\1\uffff\1\161\1\154\1\162\1\165\1\160\1\165\1\151\1\164\1\141\1\163\1\156\1\172\1\141\1\145\2\uffff\1\144\1\145\1\161\1\154\1\150\1\146\1\154\1\uffff\1\162\1\uffff\1\157\1\156\1\154\2\uffff\1\172\1\165\1\145\1\162\1\165\1\172\1\uffff\1\163\1\uffff\1\157\1\162\1\uffff\1\151\1\156\2\145\1\150\1\156\1\141\1\145\1\144\1\145\1\163\2\145\1\172\1\uffff\2\172\1\145\1\172\1\156\1\172\1\151\1\156\1\145\1\147\1\151\1\uffff\1\157\1\162\1\145\1\165\1\145\1\172\1\154\2\uffff\1\165\1\153\1\151\1\145\1\uffff\1\157\1\164\1\144\1\154\1\172\1\uffff\1\144\1\172\1\156\1\146\1\145\1\141\1\156\1\144\2\171\1\153\1\155\1\147\1\142\1\164\1\145\1\154\1\156\1\uffff\2\165\1\143\1\162\2\141\2\162\1\157\1\142\1\155\1\145\1\172\1\uffff\1\142\1\144\1\145\1\156\1\165\1\145\1\151\1\146\1\165\1\157\1\167\2\172\1\uffff\1\145\2\171\2\145\1\uffff\1\145\1\153\1\145\1\164\3\172\1\151\1\145\1\154\1\164\2\172\1\145\1\172\1\162\3\uffff\1\156\1\uffff\1\172\1\uffff\1\172\1\164\1\147\1\145\1\144\1\156\1\145\1\147\1\157\1\164\1\uffff\1\165\1\145\1\172\1\164\1\145\1\172\1\145\1\172\1\157\1\uffff\1\172\1\154\1\uffff\1\172\1\146\1\172\1\154\1\172\1\145\1\172\1\156\2\172\1\157\1\162\1\154\1\145\1\154\1\157\1\172\1\141\1\145\1\150\1\160\1\147\1\164\1\151\1\161\2\154\2\172\1\uffff\2\172\1\156\1\172\1\157\1\164\1\160\1\172\1\145\1\167\1\156\2\uffff\3\172\1\145\2\172\3\145\3\uffff\1\164\1\172\1\155\1\172\2\uffff\1\172\1\uffff\1\142\1\162\2\uffff\1\141\1\162\3\172\1\145\1\154\1\162\1\151\1\172\1\145\1\172\1\uffff\1\145\1\156\1\uffff\1\172\1\uffff\1\167\1\uffff\1\165\1\uffff\1\157\1\uffff\1\172\1\uffff\1\156\1\uffff\1\172\2\uffff\1\156\1\145\1\165\1\147\1\142\1\167\1\uffff\1\155\1\172\1\151\1\154\1\162\1\145\1\156\1\165\1\145\1\165\4\uffff\1\162\1\uffff\1\151\1\162\1\172\1\uffff\1\172\1\156\1\172\3\uffff\1\156\2\uffff\1\172\1\156\1\172\1\145\1\uffff\1\157\2\uffff\1\154\1\157\1\172\1\145\3\uffff\1\156\1\165\1\145\1\163\1\uffff\1\172\1\uffff\2\172\1\uffff\1\172\1\163\1\156\1\uffff\1\162\1\uffff\1\172\2\145\1\162\1\154\1\172\1\141\1\uffff\1\144\2\145\1\142\1\147\1\157\1\164\1\145\1\157\1\163\1\145\2\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\156\1\165\1\144\1\uffff\1\145\1\172\1\145\2\171\1\145\4\uffff\1\150\1\172\1\157\1\uffff\1\156\1\172\1\145\1\165\1\uffff\1\162\2\172\1\145\1\154\1\147\1\151\1\162\1\172\1\144\1\145\1\144\4\uffff\1\144\1\145\1\172\1\156\1\uffff\5\172\1\uffff\1\144\1\172\1\uffff\2\171\1\145\1\151\2\uffff\1\156\1\165\1\162\1\163\1\145\1\uffff\5\172\1\uffff\1\172\5\uffff\1\171\1\uffff\3\172\1\156\1\172\3\145\1\144\6\uffff\1\145\3\uffff\1\145\1\uffff\1\172\1\145\2\172\1\154\1\172\1\uffff\1\156\2\uffff\1\154\1\uffff\1\172\1\157\1\uffff\1\167\1\172\1\uffff";
    static final String DFA20_acceptS =
        "\3\uffff\1\3\1\4\1\5\32\uffff\1\u009e\3\uffff\1\u00a2\1\u00a3\2\uffff\1\u009e\3\uffff\1\3\1\4\1\5\1\uffff\1\7\1\u009b\77\uffff\1\u009c\1\u009d\1\uffff\1\u009f\1\u00a0\1\u00a1\1\u00a2\133\uffff\1\2\1\177\2\uffff\1\6\112\uffff\1\u0090\10\uffff\1\1\1\uffff\1\155\5\uffff\1\12\6\uffff\1\21\11\uffff\1\34\25\uffff\1\73\1\75\1\76\14\uffff\1\132\21\uffff\1\172\1\173\1\174\13\uffff\1\u008d\2\uffff\1\u0091\15\uffff\1\14\1\15\1\uffff\1\17\2\uffff\1\23\4\uffff\1\30\36\uffff\1\77\4\uffff\1\105\1\106\12\uffff\1\134\11\uffff\1\157\32\uffff\1\u0096\1\uffff\1\u0097\7\uffff\1\16\51\uffff\1\104\21\uffff\1\136\16\uffff\1\161\1\163\7\uffff\1\176\1\uffff\1\u0083\3\uffff\1\u0087\1\u0088\6\uffff\1\u0093\1\uffff\1\u0095\2\uffff\1\u0099\16\uffff\1\33\13\uffff\1\50\7\uffff\1\62\1\63\4\uffff\1\70\5\uffff\1\102\22\uffff\1\135\15\uffff\1\156\15\uffff\1\u0089\5\uffff\1\u0092\20\uffff\1\32\1\35\1\36\1\uffff\1\40\1\uffff\1\42\12\uffff\1\60\11\uffff\1\101\2\uffff\1\107\35\uffff\1\153\13\uffff\1\u0085\1\u0086\11\uffff\1\u0080\1\u0081\1\10\4\uffff\1\24\1\25\1\uffff\1\27\2\uffff\1\41\1\43\14\uffff\1\65\2\uffff\1\71\1\uffff\1\74\1\uffff\1\103\1\uffff\1\111\1\uffff\1\113\1\uffff\1\115\1\uffff\1\117\1\uffff\1\121\1\122\6\uffff\1\133\12\uffff\1\151\1\152\1\160\1\162\1\uffff\1\165\3\uffff\1\171\3\uffff\1\u008a\1\u008b\1\u008c\1\uffff\1\u008f\1\u0094\4\uffff\1\13\1\uffff\1\22\1\26\4\uffff\1\46\1\47\1\51\4\uffff\1\57\1\uffff\1\64\2\uffff\1\72\3\uffff\1\114\1\uffff\1\120\7\uffff\1\140\13\uffff\1\170\1\175\1\uffff\1\u0084\1\uffff\1\u0098\1\uffff\1\154\4\uffff\1\44\6\uffff\1\61\1\66\1\67\1\100\3\uffff\1\123\4\uffff\1\131\14\uffff\1\u0082\1\u008e\1\u009a\1\11\4\uffff\1\52\5\uffff\1\112\2\uffff\1\125\4\uffff\1\141\1\142\5\uffff\1\150\5\uffff\1\37\1\uffff\1\53\1\54\1\55\1\56\1\110\1\uffff\1\124\11\uffff\1\164\1\166\1\167\1\20\1\31\1\45\1\uffff\1\126\1\127\1\130\1\uffff\1\143\6\uffff\1\144\1\uffff\1\146\1\147\1\uffff\1\137\2\uffff\1\145\2\uffff\1\116";
    static final String DFA20_specialS =
        "\1\0\40\uffff\1\1\1\2\u0413\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\45\2\44\2\45\1\44\22\45\1\44\1\45\1\41\1\7\3\45\1\42\1\3\1\5\1\45\1\35\1\4\1\35\1\36\1\43\1\33\1\34\1\32\7\34\7\45\32\40\3\45\1\37\1\40\1\45\1\10\1\11\1\12\1\13\1\40\1\14\1\15\1\16\1\17\1\40\1\20\1\21\1\22\1\1\1\23\1\24\1\40\1\2\1\25\1\26\1\6\1\27\1\30\1\40\1\31\1\40\uff85\45",
            "\1\47\15\uffff\1\46",
            "\1\52\1\uffff\1\51\7\uffff\1\53",
            "",
            "",
            "",
            "\1\57",
            "\12\61\7\uffff\6\61\32\uffff\6\61",
            "\1\62\1\uffff\1\63\2\uffff\1\64\10\uffff\1\65",
            "\1\66\3\uffff\1\67\2\uffff\1\70\5\uffff\1\71\2\uffff\1\72",
            "\1\73\6\uffff\1\74\6\uffff\1\75\2\uffff\1\76\6\uffff\1\77",
            "\1\100\3\uffff\1\101\3\uffff\1\102\5\uffff\1\103",
            "\1\104\2\uffff\1\105\2\uffff\1\106\5\uffff\1\107",
            "\1\110\6\uffff\1\111\6\uffff\1\112\2\uffff\1\113",
            "\1\114",
            "\1\115\7\uffff\1\116",
            "\1\117",
            "\1\120\3\uffff\1\121\3\uffff\1\122",
            "\1\123\3\uffff\1\124\3\uffff\1\125\5\uffff\1\126",
            "\1\127\5\uffff\1\130",
            "\1\131\3\uffff\1\132\3\uffff\1\133\2\uffff\1\134\2\uffff\1\135\5\uffff\1\136",
            "\1\137\3\uffff\1\140\3\uffff\1\141\1\uffff\1\142\1\143\1\uffff\1\144\1\uffff\1\145\3\uffff\1\146",
            "\1\147\3\uffff\1\150\2\uffff\1\151\6\uffff\1\152\5\uffff\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\162\10\uffff\1\162\1\uffff\5\160\1\157\4\162",
            "\1\162\10\uffff\1\163\1\uffff\12\162",
            "\1\162\10\uffff\1\162\1\uffff\12\162",
            "\1\162\1\uffff\12\162",
            "\12\162",
            "\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\0\164",
            "\0\164",
            "\1\165\4\uffff\1\166",
            "",
            "",
            "\1\170",
            "\1\171",
            "",
            "\1\172",
            "\1\173",
            "\1\174\5\uffff\1\175",
            "",
            "",
            "",
            "\1\176",
            "",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085\23\uffff\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a\15\uffff\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a\3\uffff\1\u009b",
            "\1\u009c\5\uffff\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1\1\u00a2",
            "\1\u00a3",
            "\1\u00a4\5\uffff\1\u00a5\1\u00a6",
            "\1\u00a7\12\uffff\1\u00a8",
            "\1\u00a9",
            "\1\u00aa\11\uffff\1\u00ab\4\uffff\1\u00ac",
            "\1\u00ad",
            "\1\u00ae\4\uffff\1\u00af",
            "\1\u00b0\1\uffff\1\u00b1",
            "\1\u00b2\3\uffff\1\u00b3",
            "\1\u00b4\20\uffff\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba\7\uffff\1\u00bb\1\uffff\1\u00bc",
            "\1\u00bd",
            "\1\u00be\6\uffff\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb\3\uffff\1\u00cc",
            "\1\u00cd",
            "\1\162\10\uffff\1\162\1\uffff\6\u00ce\4\162",
            "\1\162\10\uffff\1\162\1\uffff\12\u00cf",
            "",
            "",
            "\1\161\1\uffff\12\162",
            "",
            "",
            "",
            "",
            "\1\u00d0",
            "\1\u00d1\27\uffff\1\u00d2",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d5",
            "\1\u00d6",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de\12\uffff\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6\14\uffff\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f7\23\uffff\1\u00f6",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119\13\uffff\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\162\10\uffff\1\162\1\uffff\12\162",
            "\1\162\10\uffff\1\162\1\uffff\12\162",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u012c",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u012e",
            "\1\u012f",
            "",
            "\1\u0130",
            "\1\u0131",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\14\50\1\u0132\15\50",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\25\50\1\u0139\4\50",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141\14\uffff\1\u0142",
            "\1\u0143",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0145\1\u0146\3\uffff\1\u0147\3\uffff\1\u0148\1\uffff\1\u0149\1\uffff\1\u014a\2\uffff\1\u014b\1\u014c\1\u014d\1\uffff\1\u014e",
            "\1\u014f\2\uffff\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\u0159\25\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160\5\uffff\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\6\50\1\u0168\23\50",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176\14\uffff\1\u0177\1\uffff\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u018a",
            "\1\u018b",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "",
            "\1\u0194",
            "",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u019c",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u019e",
            "\1\u019f",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab\2\uffff\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af\5\uffff\1\u01b0",
            "\1\u01b1",
            "\1\u01b2\3\uffff\1\u01b3\6\uffff\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9\3\uffff\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\30\50\1\u01c3\1\50",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce\1\u01cf\3\uffff\1\u01d0\10\uffff\1\u01d1\2\uffff\1\u01d2\5\uffff\1\u01d3",
            "\1\u01d4",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\3\50\1\u01de\26\50",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2\2\uffff\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "",
            "",
            "",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2\4\uffff\1\u01f3",
            "",
            "\1\u01f4",
            "\1\u01f5",
            "",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\22\50\1\u01fb\7\50",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\1\u0202",
            "\1\u0203",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0205",
            "\1\u0206",
            "",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211\3\uffff\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216\1\uffff\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "\1\u0223",
            "\1\u0224",
            "\1\u0225",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233\11\uffff\1\u0234",
            "\1\u0235\2\uffff\1\u0236",
            "\1\u0237",
            "\1\u0238\3\uffff\1\u0239\5\uffff\1\u023a\1\u023b\7\uffff\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "",
            "\1\u023f",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0241\1\u0242\14\uffff\1\u0243\1\u0244\2\uffff\1\u0245\1\u0246\1\uffff\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\21\50\1\u024e\10\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253",
            "\1\u0254",
            "\1\u0255",
            "\1\u0256",
            "\1\u0257",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0259",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u025b",
            "\1\u025c",
            "\1\u025d",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0260",
            "\1\u0261",
            "\1\u0262",
            "\1\u0263",
            "\1\u0264",
            "\1\u0265",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0267",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0269",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\6\50\1\u026a\23\50",
            "\1\u026c",
            "\1\u026d",
            "\1\u026e",
            "\1\u026f",
            "\1\u0270",
            "\1\u0271",
            "",
            "\1\u0272",
            "\1\u0273",
            "\1\u0274",
            "\1\u0275",
            "\1\u0276",
            "\1\u0277",
            "\1\u0278",
            "\1\u0279",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u027b",
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "\1\u027f\23\uffff\1\u0280",
            "\1\u0281",
            "\1\u0282",
            "\1\u0283",
            "\1\u0284",
            "\1\u0285",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0287",
            "\1\u0288",
            "\1\u0289",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "\1\u028d",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0290",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0295",
            "\1\u0296",
            "\1\u0297",
            "\1\u0298",
            "\1\u0299",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u029b",
            "",
            "\1\u029c",
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "\1\u02a0",
            "\1\u02a1",
            "\1\u02a2",
            "\1\u02a3\3\uffff\1\u02a4",
            "\1\u02a5",
            "\1\u02a6",
            "\1\u02a7",
            "\1\u02a8",
            "\1\u02a9",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u02ae",
            "\1\u02af",
            "\1\u02b0",
            "\1\u02b1",
            "\1\u02b2\6\uffff\1\u02b3\3\uffff\1\u02b4",
            "\1\u02b5",
            "\1\u02b6",
            "\1\u02b7",
            "\1\u02b8",
            "\1\u02b9",
            "\1\u02ba",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u02bc",
            "\1\u02bd",
            "",
            "",
            "\1\u02be",
            "\1\u02bf",
            "\1\u02c0",
            "\1\u02c1",
            "\1\u02c2",
            "\1\u02c3",
            "\1\u02c4",
            "",
            "\1\u02c5",
            "",
            "\1\u02c6",
            "\1\u02c7",
            "\1\u02c8",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u02ca",
            "\1\u02cb\3\uffff\1\u02cc",
            "\1\u02cd",
            "\1\u02ce",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u02d0",
            "",
            "\1\u02d1",
            "\1\u02d2",
            "",
            "\1\u02d3",
            "\1\u02d4",
            "\1\u02d5",
            "\1\u02d6",
            "\1\u02d7",
            "\1\u02d8",
            "\1\u02d9",
            "\1\u02da",
            "\1\u02db",
            "\1\u02dc",
            "\1\u02dd",
            "\1\u02de",
            "\1\u02df",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u02e3",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u02e5",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u02e7",
            "\1\u02e8",
            "\1\u02e9",
            "\1\u02ea",
            "\1\u02eb",
            "",
            "\1\u02ec",
            "\1\u02ed",
            "\1\u02ee",
            "\1\u02ef",
            "\1\u02f0",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u02f2",
            "",
            "",
            "\1\u02f3",
            "\1\u02f4",
            "\1\u02f5",
            "\1\u02f6",
            "",
            "\1\u02f7",
            "\1\u02f8",
            "\1\u02f9",
            "\1\u02fa",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u02fc",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\1\50\1\u02fd\30\50",
            "\1\u02ff",
            "\1\u0300",
            "\1\u0301",
            "\1\u0302",
            "\1\u0303",
            "\1\u0304",
            "\1\u0305",
            "\1\u0306\23\uffff\1\u0307",
            "\1\u0308",
            "\1\u0309",
            "\1\u030a",
            "\1\u030b",
            "\1\u030c",
            "\1\u030d",
            "\1\u030e",
            "\1\u030f",
            "",
            "\1\u0310",
            "\1\u0311",
            "\1\u0312",
            "\1\u0313",
            "\1\u0314",
            "\1\u0315",
            "\1\u0316",
            "\1\u0317",
            "\1\u0318",
            "\1\u0319",
            "\1\u031a",
            "\1\u031b",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u031d",
            "\1\u031e",
            "\1\u031f",
            "\1\u0320",
            "\1\u0321",
            "\1\u0322",
            "\1\u0323",
            "\1\u0324",
            "\1\u0325",
            "\1\u0326",
            "\1\u0327",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u032a",
            "\1\u032b",
            "\1\u032c",
            "\1\u032d",
            "\1\u032e",
            "",
            "\1\u032f",
            "\1\u0330",
            "\1\u0331",
            "\1\u0332",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0336",
            "\1\u0337",
            "\1\u0338",
            "\1\u0339",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u033c",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u033e",
            "",
            "",
            "",
            "\1\u033f",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0342",
            "\1\u0343",
            "\1\u0344",
            "\1\u0345",
            "\1\u0346",
            "\1\u0347",
            "\1\u0348\4\uffff\1\u0349",
            "\1\u034a",
            "\1\u034b",
            "",
            "\1\u034c",
            "\1\u034d",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u034f",
            "\1\u0350",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0352",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0354",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0356",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0358",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u035a",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u035c",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u035e",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0361",
            "\1\u0362",
            "\1\u0363",
            "\1\u0364",
            "\1\u0365",
            "\1\u0366",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0368",
            "\1\u0369",
            "\1\u036a",
            "\1\u036b",
            "\1\u036c",
            "\1\u036d",
            "\1\u036e",
            "\1\u036f",
            "\1\u0370",
            "\1\u0371",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0376",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0378",
            "\1\u0379",
            "\1\u037a",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u037c",
            "\1\u037d",
            "\1\u037e",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0382",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0385",
            "\1\u0386",
            "\1\u0387",
            "",
            "",
            "",
            "\1\u0388",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u038a",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u038d",
            "\1\u038e",
            "",
            "",
            "\1\u038f",
            "\1\u0390",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0394",
            "\1\u0395",
            "\1\u0396",
            "\1\u0397",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0399",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u039b",
            "\1\u039c",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u039e",
            "",
            "\1\u039f",
            "",
            "\1\u03a0",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u03a2",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u03a4",
            "\1\u03a5",
            "\1\u03a6",
            "\1\u03a7",
            "\1\u03a8",
            "\1\u03a9",
            "",
            "\1\u03aa",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u03ac",
            "\1\u03ad",
            "\1\u03ae",
            "\1\u03af",
            "\1\u03b0",
            "\1\u03b1",
            "\1\u03b2",
            "\1\u03b3",
            "",
            "",
            "",
            "",
            "\1\u03b4",
            "",
            "\1\u03b5",
            "\1\u03b6",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u03b9",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "\1\u03bb",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u03bd",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u03bf",
            "",
            "\1\u03c0",
            "",
            "",
            "\1\u03c1",
            "\1\u03c2",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u03c4",
            "",
            "",
            "",
            "\1\u03c5",
            "\1\u03c6",
            "\1\u03c7\3\uffff\1\u03c8",
            "\1\u03c9",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u03ce",
            "\1\u03cf",
            "",
            "\1\u03d0",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u03d2",
            "\1\u03d3",
            "\1\u03d4",
            "\1\u03d5",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u03d7",
            "",
            "\1\u03d8",
            "\1\u03d9",
            "\1\u03da",
            "\1\u03db",
            "\1\u03dc",
            "\1\u03dd",
            "\1\u03de",
            "\1\u03df",
            "\1\u03e0",
            "\1\u03e1",
            "\1\u03e2",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u03e7",
            "\1\u03e8",
            "\1\u03e9",
            "",
            "\1\u03ea",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u03ec",
            "\1\u03ed",
            "\1\u03ee",
            "\1\u03ef",
            "",
            "",
            "",
            "",
            "\1\u03f0",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u03f2",
            "",
            "\1\u03f3",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u03f5\3\uffff\1\u03f6",
            "\1\u03f7",
            "",
            "\1\u03f8",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u03fb",
            "\1\u03fc",
            "\1\u03fd",
            "\1\u03fe",
            "\1\u03ff",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0401",
            "\1\u0402",
            "\1\u0403",
            "",
            "",
            "",
            "",
            "\1\u0404",
            "\1\u0405",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0407",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u040d",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u040f",
            "\1\u0410",
            "\1\u0411",
            "\1\u0412",
            "",
            "",
            "\1\u0413",
            "\1\u0414",
            "\1\u0415",
            "\1\u0416",
            "\1\u0417",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "",
            "",
            "\1\u041e",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0422",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0424",
            "\1\u0425",
            "\1\u0426",
            "\1\u0427",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0428",
            "",
            "",
            "",
            "\1\u0429",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u042b",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u042e",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0430",
            "",
            "",
            "\1\u0431",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0433",
            "",
            "\1\u0434",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | RULE_HEX | RULE_RGB_NUMBER | RULE_RGB_PERCENTAGE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='n') ) {s = 1;}

                        else if ( (LA20_0=='r') ) {s = 2;}

                        else if ( (LA20_0=='(') ) {s = 3;}

                        else if ( (LA20_0==',') ) {s = 4;}

                        else if ( (LA20_0==')') ) {s = 5;}

                        else if ( (LA20_0=='u') ) {s = 6;}

                        else if ( (LA20_0=='#') ) {s = 7;}

                        else if ( (LA20_0=='a') ) {s = 8;}

                        else if ( (LA20_0=='b') ) {s = 9;}

                        else if ( (LA20_0=='c') ) {s = 10;}

                        else if ( (LA20_0=='d') ) {s = 11;}

                        else if ( (LA20_0=='f') ) {s = 12;}

                        else if ( (LA20_0=='g') ) {s = 13;}

                        else if ( (LA20_0=='h') ) {s = 14;}

                        else if ( (LA20_0=='i') ) {s = 15;}

                        else if ( (LA20_0=='k') ) {s = 16;}

                        else if ( (LA20_0=='l') ) {s = 17;}

                        else if ( (LA20_0=='m') ) {s = 18;}

                        else if ( (LA20_0=='o') ) {s = 19;}

                        else if ( (LA20_0=='p') ) {s = 20;}

                        else if ( (LA20_0=='s') ) {s = 21;}

                        else if ( (LA20_0=='t') ) {s = 22;}

                        else if ( (LA20_0=='v') ) {s = 23;}

                        else if ( (LA20_0=='w') ) {s = 24;}

                        else if ( (LA20_0=='y') ) {s = 25;}

                        else if ( (LA20_0=='2') ) {s = 26;}

                        else if ( (LA20_0=='0') ) {s = 27;}

                        else if ( (LA20_0=='1'||(LA20_0>='3' && LA20_0<='9')) ) {s = 28;}

                        else if ( (LA20_0=='+'||LA20_0=='-') ) {s = 29;}

                        else if ( (LA20_0=='.') ) {s = 30;}

                        else if ( (LA20_0=='^') ) {s = 31;}

                        else if ( ((LA20_0>='A' && LA20_0<='Z')||LA20_0=='_'||LA20_0=='e'||LA20_0=='j'||LA20_0=='q'||LA20_0=='x'||LA20_0=='z') ) {s = 32;}

                        else if ( (LA20_0=='\"') ) {s = 33;}

                        else if ( (LA20_0=='\'') ) {s = 34;}

                        else if ( (LA20_0=='/') ) {s = 35;}

                        else if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 36;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||LA20_0=='!'||(LA20_0>='$' && LA20_0<='&')||LA20_0=='*'||(LA20_0>=':' && LA20_0<='@')||(LA20_0>='[' && LA20_0<=']')||LA20_0=='`'||(LA20_0>='{' && LA20_0<='\uFFFF')) ) {s = 37;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_33 = input.LA(1);

                        s = -1;
                        if ( ((LA20_33>='\u0000' && LA20_33<='\uFFFF')) ) {s = 116;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_34 = input.LA(1);

                        s = -1;
                        if ( ((LA20_34>='\u0000' && LA20_34<='\uFFFF')) ) {s = 116;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}