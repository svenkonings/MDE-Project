package org.xtext.svg.viewbox.parser.antlr.internal;

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
import org.xtext.svg.viewbox.services.SvgViewboxGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSvgViewboxParser extends AbstractInternalAntlrParser {
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


        public InternalSvgViewboxParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSvgViewboxParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSvgViewboxParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSvgViewbox.g"; }



     	private SvgViewboxGrammarAccess grammarAccess;

        public InternalSvgViewboxParser(TokenStream input, SvgViewboxGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ViewBox";
       	}

       	@Override
       	protected SvgViewboxGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleViewBox"
    // InternalSvgViewbox.g:65:1: entryRuleViewBox returns [EObject current=null] : iv_ruleViewBox= ruleViewBox EOF ;
    public final EObject entryRuleViewBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewBox = null;


        try {
            // InternalSvgViewbox.g:65:48: (iv_ruleViewBox= ruleViewBox EOF )
            // InternalSvgViewbox.g:66:2: iv_ruleViewBox= ruleViewBox EOF
            {
             newCompositeNode(grammarAccess.getViewBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleViewBox=ruleViewBox();

            state._fsp--;

             current =iv_ruleViewBox; 
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
    // $ANTLR end "entryRuleViewBox"


    // $ANTLR start "ruleViewBox"
    // InternalSvgViewbox.g:72:1: ruleViewBox returns [EObject current=null] : ( ( (lv_minX_0_0= ruleCoordinate ) ) (otherlv_1= ',' )? ( (lv_minY_2_0= ruleCoordinate ) ) (otherlv_3= ',' )? ( (lv_width_4_0= ruleLength ) ) (otherlv_5= ',' )? ( (lv_height_6_0= ruleLength ) ) ) ;
    public final EObject ruleViewBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_minX_0_0 = null;

        EObject lv_minY_2_0 = null;

        EObject lv_width_4_0 = null;

        EObject lv_height_6_0 = null;



        	enterRule();

        try {
            // InternalSvgViewbox.g:78:2: ( ( ( (lv_minX_0_0= ruleCoordinate ) ) (otherlv_1= ',' )? ( (lv_minY_2_0= ruleCoordinate ) ) (otherlv_3= ',' )? ( (lv_width_4_0= ruleLength ) ) (otherlv_5= ',' )? ( (lv_height_6_0= ruleLength ) ) ) )
            // InternalSvgViewbox.g:79:2: ( ( (lv_minX_0_0= ruleCoordinate ) ) (otherlv_1= ',' )? ( (lv_minY_2_0= ruleCoordinate ) ) (otherlv_3= ',' )? ( (lv_width_4_0= ruleLength ) ) (otherlv_5= ',' )? ( (lv_height_6_0= ruleLength ) ) )
            {
            // InternalSvgViewbox.g:79:2: ( ( (lv_minX_0_0= ruleCoordinate ) ) (otherlv_1= ',' )? ( (lv_minY_2_0= ruleCoordinate ) ) (otherlv_3= ',' )? ( (lv_width_4_0= ruleLength ) ) (otherlv_5= ',' )? ( (lv_height_6_0= ruleLength ) ) )
            // InternalSvgViewbox.g:80:3: ( (lv_minX_0_0= ruleCoordinate ) ) (otherlv_1= ',' )? ( (lv_minY_2_0= ruleCoordinate ) ) (otherlv_3= ',' )? ( (lv_width_4_0= ruleLength ) ) (otherlv_5= ',' )? ( (lv_height_6_0= ruleLength ) )
            {
            // InternalSvgViewbox.g:80:3: ( (lv_minX_0_0= ruleCoordinate ) )
            // InternalSvgViewbox.g:81:4: (lv_minX_0_0= ruleCoordinate )
            {
            // InternalSvgViewbox.g:81:4: (lv_minX_0_0= ruleCoordinate )
            // InternalSvgViewbox.g:82:5: lv_minX_0_0= ruleCoordinate
            {

            					newCompositeNode(grammarAccess.getViewBoxAccess().getMinXCoordinateParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_minX_0_0=ruleCoordinate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getViewBoxRule());
            					}
            					set(
            						current,
            						"minX",
            						lv_minX_0_0,
            						"org.xtext.svg.viewbox.SvgViewbox.Coordinate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgViewbox.g:99:3: (otherlv_1= ',' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSvgViewbox.g:100:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getViewBoxAccess().getCommaKeyword_1());
                    			

                    }
                    break;

            }

            // InternalSvgViewbox.g:105:3: ( (lv_minY_2_0= ruleCoordinate ) )
            // InternalSvgViewbox.g:106:4: (lv_minY_2_0= ruleCoordinate )
            {
            // InternalSvgViewbox.g:106:4: (lv_minY_2_0= ruleCoordinate )
            // InternalSvgViewbox.g:107:5: lv_minY_2_0= ruleCoordinate
            {

            					newCompositeNode(grammarAccess.getViewBoxAccess().getMinYCoordinateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_minY_2_0=ruleCoordinate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getViewBoxRule());
            					}
            					set(
            						current,
            						"minY",
            						lv_minY_2_0,
            						"org.xtext.svg.viewbox.SvgViewbox.Coordinate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgViewbox.g:124:3: (otherlv_3= ',' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSvgViewbox.g:125:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getViewBoxAccess().getCommaKeyword_3());
                    			

                    }
                    break;

            }

            // InternalSvgViewbox.g:130:3: ( (lv_width_4_0= ruleLength ) )
            // InternalSvgViewbox.g:131:4: (lv_width_4_0= ruleLength )
            {
            // InternalSvgViewbox.g:131:4: (lv_width_4_0= ruleLength )
            // InternalSvgViewbox.g:132:5: lv_width_4_0= ruleLength
            {

            					newCompositeNode(grammarAccess.getViewBoxAccess().getWidthLengthParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_3);
            lv_width_4_0=ruleLength();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getViewBoxRule());
            					}
            					set(
            						current,
            						"width",
            						lv_width_4_0,
            						"org.xtext.svg.viewbox.SvgViewbox.Length");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgViewbox.g:149:3: (otherlv_5= ',' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSvgViewbox.g:150:4: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getViewBoxAccess().getCommaKeyword_5());
                    			

                    }
                    break;

            }

            // InternalSvgViewbox.g:155:3: ( (lv_height_6_0= ruleLength ) )
            // InternalSvgViewbox.g:156:4: (lv_height_6_0= ruleLength )
            {
            // InternalSvgViewbox.g:156:4: (lv_height_6_0= ruleLength )
            // InternalSvgViewbox.g:157:5: lv_height_6_0= ruleLength
            {

            					newCompositeNode(grammarAccess.getViewBoxAccess().getHeightLengthParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_height_6_0=ruleLength();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getViewBoxRule());
            					}
            					set(
            						current,
            						"height",
            						lv_height_6_0,
            						"org.xtext.svg.viewbox.SvgViewbox.Length");
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
    // $ANTLR end "ruleViewBox"


    // $ANTLR start "entryRuleCoordinate"
    // InternalSvgViewbox.g:178:1: entryRuleCoordinate returns [EObject current=null] : iv_ruleCoordinate= ruleCoordinate EOF ;
    public final EObject entryRuleCoordinate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinate = null;


        try {
            // InternalSvgViewbox.g:178:51: (iv_ruleCoordinate= ruleCoordinate EOF )
            // InternalSvgViewbox.g:179:2: iv_ruleCoordinate= ruleCoordinate EOF
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
    // InternalSvgViewbox.g:185:1: ruleCoordinate returns [EObject current=null] : ( ( (lv_number_0_0= ruleNumber ) ) ( (lv_unit_1_0= ruleUnit ) )? ) ;
    public final EObject ruleCoordinate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_number_0_0 = null;

        Enumerator lv_unit_1_0 = null;



        	enterRule();

        try {
            // InternalSvgViewbox.g:191:2: ( ( ( (lv_number_0_0= ruleNumber ) ) ( (lv_unit_1_0= ruleUnit ) )? ) )
            // InternalSvgViewbox.g:192:2: ( ( (lv_number_0_0= ruleNumber ) ) ( (lv_unit_1_0= ruleUnit ) )? )
            {
            // InternalSvgViewbox.g:192:2: ( ( (lv_number_0_0= ruleNumber ) ) ( (lv_unit_1_0= ruleUnit ) )? )
            // InternalSvgViewbox.g:193:3: ( (lv_number_0_0= ruleNumber ) ) ( (lv_unit_1_0= ruleUnit ) )?
            {
            // InternalSvgViewbox.g:193:3: ( (lv_number_0_0= ruleNumber ) )
            // InternalSvgViewbox.g:194:4: (lv_number_0_0= ruleNumber )
            {
            // InternalSvgViewbox.g:194:4: (lv_number_0_0= ruleNumber )
            // InternalSvgViewbox.g:195:5: lv_number_0_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getCoordinateAccess().getNumberNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_number_0_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoordinateRule());
            					}
            					set(
            						current,
            						"number",
            						lv_number_0_0,
            						"org.xtext.svg.viewbox.SvgViewbox.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgViewbox.g:212:3: ( (lv_unit_1_0= ruleUnit ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=17 && LA4_0<=25)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSvgViewbox.g:213:4: (lv_unit_1_0= ruleUnit )
                    {
                    // InternalSvgViewbox.g:213:4: (lv_unit_1_0= ruleUnit )
                    // InternalSvgViewbox.g:214:5: lv_unit_1_0= ruleUnit
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
                    						"org.xtext.svg.viewbox.SvgViewbox.Unit");
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


    // $ANTLR start "entryRuleLength"
    // InternalSvgViewbox.g:235:1: entryRuleLength returns [EObject current=null] : iv_ruleLength= ruleLength EOF ;
    public final EObject entryRuleLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLength = null;


        try {
            // InternalSvgViewbox.g:235:47: (iv_ruleLength= ruleLength EOF )
            // InternalSvgViewbox.g:236:2: iv_ruleLength= ruleLength EOF
            {
             newCompositeNode(grammarAccess.getLengthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLength=ruleLength();

            state._fsp--;

             current =iv_ruleLength; 
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
    // $ANTLR end "entryRuleLength"


    // $ANTLR start "ruleLength"
    // InternalSvgViewbox.g:242:1: ruleLength returns [EObject current=null] : ( ( (lv_number_0_0= ruleNumber ) ) ( (lv_unit_1_0= ruleUnit ) )? ) ;
    public final EObject ruleLength() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_number_0_0 = null;

        Enumerator lv_unit_1_0 = null;



        	enterRule();

        try {
            // InternalSvgViewbox.g:248:2: ( ( ( (lv_number_0_0= ruleNumber ) ) ( (lv_unit_1_0= ruleUnit ) )? ) )
            // InternalSvgViewbox.g:249:2: ( ( (lv_number_0_0= ruleNumber ) ) ( (lv_unit_1_0= ruleUnit ) )? )
            {
            // InternalSvgViewbox.g:249:2: ( ( (lv_number_0_0= ruleNumber ) ) ( (lv_unit_1_0= ruleUnit ) )? )
            // InternalSvgViewbox.g:250:3: ( (lv_number_0_0= ruleNumber ) ) ( (lv_unit_1_0= ruleUnit ) )?
            {
            // InternalSvgViewbox.g:250:3: ( (lv_number_0_0= ruleNumber ) )
            // InternalSvgViewbox.g:251:4: (lv_number_0_0= ruleNumber )
            {
            // InternalSvgViewbox.g:251:4: (lv_number_0_0= ruleNumber )
            // InternalSvgViewbox.g:252:5: lv_number_0_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getLengthAccess().getNumberNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_number_0_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLengthRule());
            					}
            					set(
            						current,
            						"number",
            						lv_number_0_0,
            						"org.xtext.svg.viewbox.SvgViewbox.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgViewbox.g:269:3: ( (lv_unit_1_0= ruleUnit ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=17 && LA5_0<=25)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSvgViewbox.g:270:4: (lv_unit_1_0= ruleUnit )
                    {
                    // InternalSvgViewbox.g:270:4: (lv_unit_1_0= ruleUnit )
                    // InternalSvgViewbox.g:271:5: lv_unit_1_0= ruleUnit
                    {

                    					newCompositeNode(grammarAccess.getLengthAccess().getUnitUnitEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_unit_1_0=ruleUnit();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLengthRule());
                    					}
                    					set(
                    						current,
                    						"unit",
                    						lv_unit_1_0,
                    						"org.xtext.svg.viewbox.SvgViewbox.Unit");
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
    // $ANTLR end "ruleLength"


    // $ANTLR start "entryRuleNumber"
    // InternalSvgViewbox.g:292:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalSvgViewbox.g:292:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalSvgViewbox.g:293:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalSvgViewbox.g:299:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? ) | ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? ) ) ;
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
            // InternalSvgViewbox.g:305:2: ( ( (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? ) | ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? ) ) )
            // InternalSvgViewbox.g:306:2: ( (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? ) | ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? ) )
            {
            // InternalSvgViewbox.g:306:2: ( (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? ) | ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? ) )
            int alt12=2;
            switch ( input.LA(1) ) {
            case 14:
                {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_INT) ) {
                    alt12=1;
                }
                else if ( (LA12_1==16) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==RULE_INT) ) {
                    alt12=1;
                }
                else if ( (LA12_2==16) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt12=1;
                }
                break;
            case 16:
                {
                alt12=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSvgViewbox.g:307:3: (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? )
                    {
                    // InternalSvgViewbox.g:307:3: (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? )
                    // InternalSvgViewbox.g:308:4: this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )?
                    {

                    				newCompositeNode(grammarAccess.getNumberAccess().getIntegerParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_5);
                    this_Integer_0=ruleInteger();

                    state._fsp--;


                    				current.merge(this_Integer_0);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalSvgViewbox.g:318:4: ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=12 && LA7_0<=13)) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalSvgViewbox.g:319:5: (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger
                            {
                            // InternalSvgViewbox.g:319:5: (kw= 'E' | kw= 'e' )
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0==12) ) {
                                alt6=1;
                            }
                            else if ( (LA6_0==13) ) {
                                alt6=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 0, input);

                                throw nvae;
                            }
                            switch (alt6) {
                                case 1 :
                                    // InternalSvgViewbox.g:320:6: kw= 'E'
                                    {
                                    kw=(Token)match(input,12,FOLLOW_6); 

                                    						current.merge(kw);
                                    						newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_0_1_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalSvgViewbox.g:326:6: kw= 'e'
                                    {
                                    kw=(Token)match(input,13,FOLLOW_6); 

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
                    // InternalSvgViewbox.g:345:3: ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? )
                    {
                    // InternalSvgViewbox.g:345:3: ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? )
                    // InternalSvgViewbox.g:346:4: (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )?
                    {
                    // InternalSvgViewbox.g:346:4: (kw= '+' | kw= '-' )?
                    int alt8=3;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==14) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==15) ) {
                        alt8=2;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalSvgViewbox.g:347:5: kw= '+'
                            {
                            kw=(Token)match(input,14,FOLLOW_7); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getNumberAccess().getPlusSignKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSvgViewbox.g:353:5: kw= '-'
                            {
                            kw=(Token)match(input,15,FOLLOW_7); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getNumberAccess().getHyphenMinusKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalSvgViewbox.g:359:4: (this_INT_6= RULE_INT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_INT) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSvgViewbox.g:360:5: this_INT_6= RULE_INT
                            {
                            this_INT_6=(Token)match(input,RULE_INT,FOLLOW_8); 

                            					current.merge(this_INT_6);
                            				

                            					newLeafNode(this_INT_6, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1());
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,16,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_2());
                    			
                    this_INT_8=(Token)match(input,RULE_INT,FOLLOW_5); 

                    				current.merge(this_INT_8);
                    			

                    				newLeafNode(this_INT_8, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_3());
                    			
                    // InternalSvgViewbox.g:380:4: ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0>=12 && LA11_0<=13)) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalSvgViewbox.g:381:5: (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger
                            {
                            // InternalSvgViewbox.g:381:5: (kw= 'E' | kw= 'e' )
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0==12) ) {
                                alt10=1;
                            }
                            else if ( (LA10_0==13) ) {
                                alt10=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 0, input);

                                throw nvae;
                            }
                            switch (alt10) {
                                case 1 :
                                    // InternalSvgViewbox.g:382:6: kw= 'E'
                                    {
                                    kw=(Token)match(input,12,FOLLOW_6); 

                                    						current.merge(kw);
                                    						newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_1_4_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalSvgViewbox.g:388:6: kw= 'e'
                                    {
                                    kw=(Token)match(input,13,FOLLOW_6); 

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
    // InternalSvgViewbox.g:410:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalSvgViewbox.g:410:47: (iv_ruleInteger= ruleInteger EOF )
            // InternalSvgViewbox.g:411:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalSvgViewbox.g:417:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalSvgViewbox.g:423:2: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) )
            // InternalSvgViewbox.g:424:2: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            {
            // InternalSvgViewbox.g:424:2: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            // InternalSvgViewbox.g:425:3: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
            {
            // InternalSvgViewbox.g:425:3: (kw= '+' | kw= '-' )?
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==14) ) {
                alt13=1;
            }
            else if ( (LA13_0==15) ) {
                alt13=2;
            }
            switch (alt13) {
                case 1 :
                    // InternalSvgViewbox.g:426:4: kw= '+'
                    {
                    kw=(Token)match(input,14,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIntegerAccess().getPlusSignKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSvgViewbox.g:432:4: kw= '-'
                    {
                    kw=(Token)match(input,15,FOLLOW_9); 

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
    // InternalSvgViewbox.g:449:1: ruleUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'px' ) | (enumLiteral_1= 'em' ) | (enumLiteral_2= 'ex' ) | (enumLiteral_3= 'in' ) | (enumLiteral_4= 'cm' ) | (enumLiteral_5= 'mm' ) | (enumLiteral_6= 'pt' ) | (enumLiteral_7= 'pc' ) | (enumLiteral_8= '%' ) ) ;
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
            // InternalSvgViewbox.g:455:2: ( ( (enumLiteral_0= 'px' ) | (enumLiteral_1= 'em' ) | (enumLiteral_2= 'ex' ) | (enumLiteral_3= 'in' ) | (enumLiteral_4= 'cm' ) | (enumLiteral_5= 'mm' ) | (enumLiteral_6= 'pt' ) | (enumLiteral_7= 'pc' ) | (enumLiteral_8= '%' ) ) )
            // InternalSvgViewbox.g:456:2: ( (enumLiteral_0= 'px' ) | (enumLiteral_1= 'em' ) | (enumLiteral_2= 'ex' ) | (enumLiteral_3= 'in' ) | (enumLiteral_4= 'cm' ) | (enumLiteral_5= 'mm' ) | (enumLiteral_6= 'pt' ) | (enumLiteral_7= 'pc' ) | (enumLiteral_8= '%' ) )
            {
            // InternalSvgViewbox.g:456:2: ( (enumLiteral_0= 'px' ) | (enumLiteral_1= 'em' ) | (enumLiteral_2= 'ex' ) | (enumLiteral_3= 'in' ) | (enumLiteral_4= 'cm' ) | (enumLiteral_5= 'mm' ) | (enumLiteral_6= 'pt' ) | (enumLiteral_7= 'pc' ) | (enumLiteral_8= '%' ) )
            int alt14=9;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt14=1;
                }
                break;
            case 18:
                {
                alt14=2;
                }
                break;
            case 19:
                {
                alt14=3;
                }
                break;
            case 20:
                {
                alt14=4;
                }
                break;
            case 21:
                {
                alt14=5;
                }
                break;
            case 22:
                {
                alt14=6;
                }
                break;
            case 23:
                {
                alt14=7;
                }
                break;
            case 24:
                {
                alt14=8;
                }
                break;
            case 25:
                {
                alt14=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalSvgViewbox.g:457:3: (enumLiteral_0= 'px' )
                    {
                    // InternalSvgViewbox.g:457:3: (enumLiteral_0= 'px' )
                    // InternalSvgViewbox.g:458:4: enumLiteral_0= 'px'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getPxEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnitAccess().getPxEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSvgViewbox.g:465:3: (enumLiteral_1= 'em' )
                    {
                    // InternalSvgViewbox.g:465:3: (enumLiteral_1= 'em' )
                    // InternalSvgViewbox.g:466:4: enumLiteral_1= 'em'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getEmEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUnitAccess().getEmEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSvgViewbox.g:473:3: (enumLiteral_2= 'ex' )
                    {
                    // InternalSvgViewbox.g:473:3: (enumLiteral_2= 'ex' )
                    // InternalSvgViewbox.g:474:4: enumLiteral_2= 'ex'
                    {
                    enumLiteral_2=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getExEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getUnitAccess().getExEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSvgViewbox.g:481:3: (enumLiteral_3= 'in' )
                    {
                    // InternalSvgViewbox.g:481:3: (enumLiteral_3= 'in' )
                    // InternalSvgViewbox.g:482:4: enumLiteral_3= 'in'
                    {
                    enumLiteral_3=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getInEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getUnitAccess().getInEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSvgViewbox.g:489:3: (enumLiteral_4= 'cm' )
                    {
                    // InternalSvgViewbox.g:489:3: (enumLiteral_4= 'cm' )
                    // InternalSvgViewbox.g:490:4: enumLiteral_4= 'cm'
                    {
                    enumLiteral_4=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getCmEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getUnitAccess().getCmEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSvgViewbox.g:497:3: (enumLiteral_5= 'mm' )
                    {
                    // InternalSvgViewbox.g:497:3: (enumLiteral_5= 'mm' )
                    // InternalSvgViewbox.g:498:4: enumLiteral_5= 'mm'
                    {
                    enumLiteral_5=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getMmEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getUnitAccess().getMmEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSvgViewbox.g:505:3: (enumLiteral_6= 'pt' )
                    {
                    // InternalSvgViewbox.g:505:3: (enumLiteral_6= 'pt' )
                    // InternalSvgViewbox.g:506:4: enumLiteral_6= 'pt'
                    {
                    enumLiteral_6=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getPtEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getUnitAccess().getPtEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSvgViewbox.g:513:3: (enumLiteral_7= 'pc' )
                    {
                    // InternalSvgViewbox.g:513:3: (enumLiteral_7= 'pc' )
                    // InternalSvgViewbox.g:514:4: enumLiteral_7= 'pc'
                    {
                    enumLiteral_7=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getPcEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getUnitAccess().getPcEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSvgViewbox.g:521:3: (enumLiteral_8= '%' )
                    {
                    // InternalSvgViewbox.g:521:3: (enumLiteral_8= '%' )
                    // InternalSvgViewbox.g:522:4: enumLiteral_8= '%'
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000001C810L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000003FE0002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});

}