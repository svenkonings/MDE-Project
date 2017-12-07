package org.xtext.svg.points.parser.antlr.internal;

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
import org.xtext.svg.points.services.SvgPointsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSvgPointsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'E'", "'e'", "'+'", "'-'", "'.'", "'px'", "'em'", "'ex'", "'in'", "'cm'", "'mm'", "'pt'", "'pc'", "'%'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSvgPointsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSvgPointsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSvgPointsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSvgPoints.g"; }



     	private SvgPointsGrammarAccess grammarAccess;

        public InternalSvgPointsParser(TokenStream input, SvgPointsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Polygon";
       	}

       	@Override
       	protected SvgPointsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePolygon"
    // InternalSvgPoints.g:65:1: entryRulePolygon returns [EObject current=null] : iv_rulePolygon= rulePolygon EOF ;
    public final EObject entryRulePolygon() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolygon = null;


        try {
            // InternalSvgPoints.g:65:48: (iv_rulePolygon= rulePolygon EOF )
            // InternalSvgPoints.g:66:2: iv_rulePolygon= rulePolygon EOF
            {
             newCompositeNode(grammarAccess.getPolygonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolygon=rulePolygon();

            state._fsp--;

             current =iv_rulePolygon; 
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
    // $ANTLR end "entryRulePolygon"


    // $ANTLR start "rulePolygon"
    // InternalSvgPoints.g:72:1: rulePolygon returns [EObject current=null] : ( ( (lv_points_0_0= rulePoint ) ) ( (otherlv_1= ',' )? ( (lv_points_2_0= rulePoint ) ) )* ) ;
    public final EObject rulePolygon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_points_0_0 = null;

        EObject lv_points_2_0 = null;



        	enterRule();

        try {
            // InternalSvgPoints.g:78:2: ( ( ( (lv_points_0_0= rulePoint ) ) ( (otherlv_1= ',' )? ( (lv_points_2_0= rulePoint ) ) )* ) )
            // InternalSvgPoints.g:79:2: ( ( (lv_points_0_0= rulePoint ) ) ( (otherlv_1= ',' )? ( (lv_points_2_0= rulePoint ) ) )* )
            {
            // InternalSvgPoints.g:79:2: ( ( (lv_points_0_0= rulePoint ) ) ( (otherlv_1= ',' )? ( (lv_points_2_0= rulePoint ) ) )* )
            // InternalSvgPoints.g:80:3: ( (lv_points_0_0= rulePoint ) ) ( (otherlv_1= ',' )? ( (lv_points_2_0= rulePoint ) ) )*
            {
            // InternalSvgPoints.g:80:3: ( (lv_points_0_0= rulePoint ) )
            // InternalSvgPoints.g:81:4: (lv_points_0_0= rulePoint )
            {
            // InternalSvgPoints.g:81:4: (lv_points_0_0= rulePoint )
            // InternalSvgPoints.g:82:5: lv_points_0_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getPolygonAccess().getPointsPointParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_points_0_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolygonRule());
            					}
            					add(
            						current,
            						"points",
            						lv_points_0_0,
            						"org.xtext.svg.points.SvgPoints.Point");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPoints.g:99:3: ( (otherlv_1= ',' )? ( (lv_points_2_0= rulePoint ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_INT||LA2_0==11||(LA2_0>=14 && LA2_0<=16)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSvgPoints.g:100:4: (otherlv_1= ',' )? ( (lv_points_2_0= rulePoint ) )
            	    {
            	    // InternalSvgPoints.g:100:4: (otherlv_1= ',' )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==11) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalSvgPoints.g:101:5: otherlv_1= ','
            	            {
            	            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            	            					newLeafNode(otherlv_1, grammarAccess.getPolygonAccess().getCommaKeyword_1_0());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSvgPoints.g:106:4: ( (lv_points_2_0= rulePoint ) )
            	    // InternalSvgPoints.g:107:5: (lv_points_2_0= rulePoint )
            	    {
            	    // InternalSvgPoints.g:107:5: (lv_points_2_0= rulePoint )
            	    // InternalSvgPoints.g:108:6: lv_points_2_0= rulePoint
            	    {

            	    						newCompositeNode(grammarAccess.getPolygonAccess().getPointsPointParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_points_2_0=rulePoint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPolygonRule());
            	    						}
            	    						add(
            	    							current,
            	    							"points",
            	    							lv_points_2_0,
            	    							"org.xtext.svg.points.SvgPoints.Point");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "rulePolygon"


    // $ANTLR start "entryRulePoint"
    // InternalSvgPoints.g:130:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalSvgPoints.g:130:46: (iv_rulePoint= rulePoint EOF )
            // InternalSvgPoints.g:131:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalSvgPoints.g:137:1: rulePoint returns [EObject current=null] : ( ( (lv_x_0_0= ruleCoordinate ) ) (otherlv_1= ',' )? ( (lv_y_2_0= ruleCoordinate ) ) ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_x_0_0 = null;

        EObject lv_y_2_0 = null;



        	enterRule();

        try {
            // InternalSvgPoints.g:143:2: ( ( ( (lv_x_0_0= ruleCoordinate ) ) (otherlv_1= ',' )? ( (lv_y_2_0= ruleCoordinate ) ) ) )
            // InternalSvgPoints.g:144:2: ( ( (lv_x_0_0= ruleCoordinate ) ) (otherlv_1= ',' )? ( (lv_y_2_0= ruleCoordinate ) ) )
            {
            // InternalSvgPoints.g:144:2: ( ( (lv_x_0_0= ruleCoordinate ) ) (otherlv_1= ',' )? ( (lv_y_2_0= ruleCoordinate ) ) )
            // InternalSvgPoints.g:145:3: ( (lv_x_0_0= ruleCoordinate ) ) (otherlv_1= ',' )? ( (lv_y_2_0= ruleCoordinate ) )
            {
            // InternalSvgPoints.g:145:3: ( (lv_x_0_0= ruleCoordinate ) )
            // InternalSvgPoints.g:146:4: (lv_x_0_0= ruleCoordinate )
            {
            // InternalSvgPoints.g:146:4: (lv_x_0_0= ruleCoordinate )
            // InternalSvgPoints.g:147:5: lv_x_0_0= ruleCoordinate
            {

            					newCompositeNode(grammarAccess.getPointAccess().getXCoordinateParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_x_0_0=ruleCoordinate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPointRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_0_0,
            						"org.xtext.svg.points.SvgPoints.Coordinate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPoints.g:164:3: (otherlv_1= ',' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSvgPoints.g:165:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getPointAccess().getCommaKeyword_1());
                    			

                    }
                    break;

            }

            // InternalSvgPoints.g:170:3: ( (lv_y_2_0= ruleCoordinate ) )
            // InternalSvgPoints.g:171:4: (lv_y_2_0= ruleCoordinate )
            {
            // InternalSvgPoints.g:171:4: (lv_y_2_0= ruleCoordinate )
            // InternalSvgPoints.g:172:5: lv_y_2_0= ruleCoordinate
            {

            					newCompositeNode(grammarAccess.getPointAccess().getYCoordinateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_y_2_0=ruleCoordinate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPointRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_2_0,
            						"org.xtext.svg.points.SvgPoints.Coordinate");
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
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleCoordinate"
    // InternalSvgPoints.g:193:1: entryRuleCoordinate returns [EObject current=null] : iv_ruleCoordinate= ruleCoordinate EOF ;
    public final EObject entryRuleCoordinate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinate = null;


        try {
            // InternalSvgPoints.g:193:51: (iv_ruleCoordinate= ruleCoordinate EOF )
            // InternalSvgPoints.g:194:2: iv_ruleCoordinate= ruleCoordinate EOF
            {
             newCompositeNode(grammarAccess.getCoordinateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordinate=ruleCoordinate();

            state._fsp--;

             current =iv_ruleCoordinate; 
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
    // $ANTLR end "entryRuleCoordinate"


    // $ANTLR start "ruleCoordinate"
    // InternalSvgPoints.g:200:1: ruleCoordinate returns [EObject current=null] : ( ( (lv_number_0_0= ruleNumber ) ) ( (lv_unit_1_0= ruleUnit ) )? ) ;
    public final EObject ruleCoordinate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_number_0_0 = null;

        Enumerator lv_unit_1_0 = null;



        	enterRule();

        try {
            // InternalSvgPoints.g:206:2: ( ( ( (lv_number_0_0= ruleNumber ) ) ( (lv_unit_1_0= ruleUnit ) )? ) )
            // InternalSvgPoints.g:207:2: ( ( (lv_number_0_0= ruleNumber ) ) ( (lv_unit_1_0= ruleUnit ) )? )
            {
            // InternalSvgPoints.g:207:2: ( ( (lv_number_0_0= ruleNumber ) ) ( (lv_unit_1_0= ruleUnit ) )? )
            // InternalSvgPoints.g:208:3: ( (lv_number_0_0= ruleNumber ) ) ( (lv_unit_1_0= ruleUnit ) )?
            {
            // InternalSvgPoints.g:208:3: ( (lv_number_0_0= ruleNumber ) )
            // InternalSvgPoints.g:209:4: (lv_number_0_0= ruleNumber )
            {
            // InternalSvgPoints.g:209:4: (lv_number_0_0= ruleNumber )
            // InternalSvgPoints.g:210:5: lv_number_0_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getCoordinateAccess().getNumberNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_number_0_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoordinateRule());
            					}
            					set(
            						current,
            						"number",
            						lv_number_0_0,
            						"org.xtext.svg.points.SvgPoints.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgPoints.g:227:3: ( (lv_unit_1_0= ruleUnit ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=17 && LA4_0<=25)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSvgPoints.g:228:4: (lv_unit_1_0= ruleUnit )
                    {
                    // InternalSvgPoints.g:228:4: (lv_unit_1_0= ruleUnit )
                    // InternalSvgPoints.g:229:5: lv_unit_1_0= ruleUnit
                    {

                    					newCompositeNode(grammarAccess.getCoordinateAccess().getUnitUnitEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_unit_1_0=ruleUnit();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCoordinateRule());
                    					}
                    					set(
                    						current,
                    						"unit",
                    						lv_unit_1_0,
                    						"org.xtext.svg.points.SvgPoints.Unit");
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
    // $ANTLR end "ruleCoordinate"


    // $ANTLR start "entryRuleNumber"
    // InternalSvgPoints.g:250:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalSvgPoints.g:250:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalSvgPoints.g:251:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalSvgPoints.g:257:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? ) | ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? ) ) ;
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
            // InternalSvgPoints.g:263:2: ( ( (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? ) | ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? ) ) )
            // InternalSvgPoints.g:264:2: ( (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? ) | ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? ) )
            {
            // InternalSvgPoints.g:264:2: ( (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? ) | ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? ) )
            int alt11=2;
            switch ( input.LA(1) ) {
            case 14:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_INT) ) {
                    alt11=1;
                }
                else if ( (LA11_1==16) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==RULE_INT) ) {
                    alt11=1;
                }
                else if ( (LA11_2==16) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt11=1;
                }
                break;
            case 16:
                {
                alt11=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalSvgPoints.g:265:3: (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? )
                    {
                    // InternalSvgPoints.g:265:3: (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? )
                    // InternalSvgPoints.g:266:4: this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )?
                    {

                    				newCompositeNode(grammarAccess.getNumberAccess().getIntegerParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_6);
                    this_Integer_0=ruleInteger();

                    state._fsp--;


                    				current.merge(this_Integer_0);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalSvgPoints.g:276:4: ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=12 && LA6_0<=13)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalSvgPoints.g:277:5: (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger
                            {
                            // InternalSvgPoints.g:277:5: (kw= 'E' | kw= 'e' )
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( (LA5_0==12) ) {
                                alt5=1;
                            }
                            else if ( (LA5_0==13) ) {
                                alt5=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 0, input);

                                throw nvae;
                            }
                            switch (alt5) {
                                case 1 :
                                    // InternalSvgPoints.g:278:6: kw= 'E'
                                    {
                                    kw=(Token)match(input,12,FOLLOW_7); 

                                    						current.merge(kw);
                                    						newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_0_1_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalSvgPoints.g:284:6: kw= 'e'
                                    {
                                    kw=(Token)match(input,13,FOLLOW_7); 

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
                    // InternalSvgPoints.g:303:3: ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? )
                    {
                    // InternalSvgPoints.g:303:3: ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? )
                    // InternalSvgPoints.g:304:4: (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )?
                    {
                    // InternalSvgPoints.g:304:4: (kw= '+' | kw= '-' )?
                    int alt7=3;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==14) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==15) ) {
                        alt7=2;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalSvgPoints.g:305:5: kw= '+'
                            {
                            kw=(Token)match(input,14,FOLLOW_8); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getNumberAccess().getPlusSignKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSvgPoints.g:311:5: kw= '-'
                            {
                            kw=(Token)match(input,15,FOLLOW_8); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getNumberAccess().getHyphenMinusKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalSvgPoints.g:317:4: (this_INT_6= RULE_INT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_INT) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalSvgPoints.g:318:5: this_INT_6= RULE_INT
                            {
                            this_INT_6=(Token)match(input,RULE_INT,FOLLOW_9); 

                            					current.merge(this_INT_6);
                            				

                            					newLeafNode(this_INT_6, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1());
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,16,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_2());
                    			
                    this_INT_8=(Token)match(input,RULE_INT,FOLLOW_6); 

                    				current.merge(this_INT_8);
                    			

                    				newLeafNode(this_INT_8, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_3());
                    			
                    // InternalSvgPoints.g:338:4: ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>=12 && LA10_0<=13)) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalSvgPoints.g:339:5: (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger
                            {
                            // InternalSvgPoints.g:339:5: (kw= 'E' | kw= 'e' )
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0==12) ) {
                                alt9=1;
                            }
                            else if ( (LA9_0==13) ) {
                                alt9=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 9, 0, input);

                                throw nvae;
                            }
                            switch (alt9) {
                                case 1 :
                                    // InternalSvgPoints.g:340:6: kw= 'E'
                                    {
                                    kw=(Token)match(input,12,FOLLOW_7); 

                                    						current.merge(kw);
                                    						newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_1_4_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalSvgPoints.g:346:6: kw= 'e'
                                    {
                                    kw=(Token)match(input,13,FOLLOW_7); 

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
    // InternalSvgPoints.g:368:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalSvgPoints.g:368:47: (iv_ruleInteger= ruleInteger EOF )
            // InternalSvgPoints.g:369:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalSvgPoints.g:375:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalSvgPoints.g:381:2: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) )
            // InternalSvgPoints.g:382:2: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            {
            // InternalSvgPoints.g:382:2: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            // InternalSvgPoints.g:383:3: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
            {
            // InternalSvgPoints.g:383:3: (kw= '+' | kw= '-' )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            else if ( (LA12_0==15) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // InternalSvgPoints.g:384:4: kw= '+'
                    {
                    kw=(Token)match(input,14,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIntegerAccess().getPlusSignKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSvgPoints.g:390:4: kw= '-'
                    {
                    kw=(Token)match(input,15,FOLLOW_10); 

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


    // $ANTLR start "ruleUnit"
    // InternalSvgPoints.g:407:1: ruleUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'px' ) | (enumLiteral_1= 'em' ) | (enumLiteral_2= 'ex' ) | (enumLiteral_3= 'in' ) | (enumLiteral_4= 'cm' ) | (enumLiteral_5= 'mm' ) | (enumLiteral_6= 'pt' ) | (enumLiteral_7= 'pc' ) | (enumLiteral_8= '%' ) ) ;
    public final Enumerator ruleUnit() throws RecognitionException {
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


        	enterRule();

        try {
            // InternalSvgPoints.g:413:2: ( ( (enumLiteral_0= 'px' ) | (enumLiteral_1= 'em' ) | (enumLiteral_2= 'ex' ) | (enumLiteral_3= 'in' ) | (enumLiteral_4= 'cm' ) | (enumLiteral_5= 'mm' ) | (enumLiteral_6= 'pt' ) | (enumLiteral_7= 'pc' ) | (enumLiteral_8= '%' ) ) )
            // InternalSvgPoints.g:414:2: ( (enumLiteral_0= 'px' ) | (enumLiteral_1= 'em' ) | (enumLiteral_2= 'ex' ) | (enumLiteral_3= 'in' ) | (enumLiteral_4= 'cm' ) | (enumLiteral_5= 'mm' ) | (enumLiteral_6= 'pt' ) | (enumLiteral_7= 'pc' ) | (enumLiteral_8= '%' ) )
            {
            // InternalSvgPoints.g:414:2: ( (enumLiteral_0= 'px' ) | (enumLiteral_1= 'em' ) | (enumLiteral_2= 'ex' ) | (enumLiteral_3= 'in' ) | (enumLiteral_4= 'cm' ) | (enumLiteral_5= 'mm' ) | (enumLiteral_6= 'pt' ) | (enumLiteral_7= 'pc' ) | (enumLiteral_8= '%' ) )
            int alt13=9;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt13=1;
                }
                break;
            case 18:
                {
                alt13=2;
                }
                break;
            case 19:
                {
                alt13=3;
                }
                break;
            case 20:
                {
                alt13=4;
                }
                break;
            case 21:
                {
                alt13=5;
                }
                break;
            case 22:
                {
                alt13=6;
                }
                break;
            case 23:
                {
                alt13=7;
                }
                break;
            case 24:
                {
                alt13=8;
                }
                break;
            case 25:
                {
                alt13=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalSvgPoints.g:415:3: (enumLiteral_0= 'px' )
                    {
                    // InternalSvgPoints.g:415:3: (enumLiteral_0= 'px' )
                    // InternalSvgPoints.g:416:4: enumLiteral_0= 'px'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getPxEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnitAccess().getPxEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSvgPoints.g:423:3: (enumLiteral_1= 'em' )
                    {
                    // InternalSvgPoints.g:423:3: (enumLiteral_1= 'em' )
                    // InternalSvgPoints.g:424:4: enumLiteral_1= 'em'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getEmEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUnitAccess().getEmEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSvgPoints.g:431:3: (enumLiteral_2= 'ex' )
                    {
                    // InternalSvgPoints.g:431:3: (enumLiteral_2= 'ex' )
                    // InternalSvgPoints.g:432:4: enumLiteral_2= 'ex'
                    {
                    enumLiteral_2=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getExEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getUnitAccess().getExEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSvgPoints.g:439:3: (enumLiteral_3= 'in' )
                    {
                    // InternalSvgPoints.g:439:3: (enumLiteral_3= 'in' )
                    // InternalSvgPoints.g:440:4: enumLiteral_3= 'in'
                    {
                    enumLiteral_3=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getInEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getUnitAccess().getInEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSvgPoints.g:447:3: (enumLiteral_4= 'cm' )
                    {
                    // InternalSvgPoints.g:447:3: (enumLiteral_4= 'cm' )
                    // InternalSvgPoints.g:448:4: enumLiteral_4= 'cm'
                    {
                    enumLiteral_4=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getCmEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getUnitAccess().getCmEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSvgPoints.g:455:3: (enumLiteral_5= 'mm' )
                    {
                    // InternalSvgPoints.g:455:3: (enumLiteral_5= 'mm' )
                    // InternalSvgPoints.g:456:4: enumLiteral_5= 'mm'
                    {
                    enumLiteral_5=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getMmEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getUnitAccess().getMmEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSvgPoints.g:463:3: (enumLiteral_6= 'pt' )
                    {
                    // InternalSvgPoints.g:463:3: (enumLiteral_6= 'pt' )
                    // InternalSvgPoints.g:464:4: enumLiteral_6= 'pt'
                    {
                    enumLiteral_6=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getPtEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getUnitAccess().getPtEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSvgPoints.g:471:3: (enumLiteral_7= 'pc' )
                    {
                    // InternalSvgPoints.g:471:3: (enumLiteral_7= 'pc' )
                    // InternalSvgPoints.g:472:4: enumLiteral_7= 'pc'
                    {
                    enumLiteral_7=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getPcEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getUnitAccess().getPcEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSvgPoints.g:479:3: (enumLiteral_8= '%' )
                    {
                    // InternalSvgPoints.g:479:3: (enumLiteral_8= '%' )
                    // InternalSvgPoints.g:480:4: enumLiteral_8= '%'
                    {
                    enumLiteral_8=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getPercentageEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getUnitAccess().getPercentageEnumLiteralDeclaration_8());
                    			

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
    // $ANTLR end "ruleUnit"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000001C812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001C810L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000003FE0002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});

}