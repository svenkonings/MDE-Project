package org.xtext.svg.coordinate.parser.antlr.internal;

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
import org.xtext.svg.coordinate.services.SvgCoordinateGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSvgCoordinateParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'+'", "'-'", "'.'", "'px'", "'em'", "'ex'", "'in'", "'cm'", "'mm'", "'pt'", "'pc'", "'%'"
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
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSvgCoordinateParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSvgCoordinateParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSvgCoordinateParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSvgCoordinate.g"; }



     	private SvgCoordinateGrammarAccess grammarAccess;

        public InternalSvgCoordinateParser(TokenStream input, SvgCoordinateGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Coordinate";
       	}

       	@Override
       	protected SvgCoordinateGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCoordinate"
    // InternalSvgCoordinate.g:65:1: entryRuleCoordinate returns [EObject current=null] : iv_ruleCoordinate= ruleCoordinate EOF ;
    public final EObject entryRuleCoordinate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinate = null;


        try {
            // InternalSvgCoordinate.g:65:51: (iv_ruleCoordinate= ruleCoordinate EOF )
            // InternalSvgCoordinate.g:66:2: iv_ruleCoordinate= ruleCoordinate EOF
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
    // InternalSvgCoordinate.g:72:1: ruleCoordinate returns [EObject current=null] : ( ( (lv_number_0_0= ruleNumber ) ) ( (lv_unit_1_0= ruleUnit ) )? ) ;
    public final EObject ruleCoordinate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_number_0_0 = null;

        Enumerator lv_unit_1_0 = null;



        	enterRule();

        try {
            // InternalSvgCoordinate.g:78:2: ( ( ( (lv_number_0_0= ruleNumber ) ) ( (lv_unit_1_0= ruleUnit ) )? ) )
            // InternalSvgCoordinate.g:79:2: ( ( (lv_number_0_0= ruleNumber ) ) ( (lv_unit_1_0= ruleUnit ) )? )
            {
            // InternalSvgCoordinate.g:79:2: ( ( (lv_number_0_0= ruleNumber ) ) ( (lv_unit_1_0= ruleUnit ) )? )
            // InternalSvgCoordinate.g:80:3: ( (lv_number_0_0= ruleNumber ) ) ( (lv_unit_1_0= ruleUnit ) )?
            {
            // InternalSvgCoordinate.g:80:3: ( (lv_number_0_0= ruleNumber ) )
            // InternalSvgCoordinate.g:81:4: (lv_number_0_0= ruleNumber )
            {
            // InternalSvgCoordinate.g:81:4: (lv_number_0_0= ruleNumber )
            // InternalSvgCoordinate.g:82:5: lv_number_0_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getCoordinateAccess().getNumberNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_number_0_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoordinateRule());
            					}
            					set(
            						current,
            						"number",
            						lv_number_0_0,
            						"org.xtext.svg.coordinate.SvgCoordinate.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgCoordinate.g:99:3: ( (lv_unit_1_0= ruleUnit ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=16 && LA1_0<=24)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSvgCoordinate.g:100:4: (lv_unit_1_0= ruleUnit )
                    {
                    // InternalSvgCoordinate.g:100:4: (lv_unit_1_0= ruleUnit )
                    // InternalSvgCoordinate.g:101:5: lv_unit_1_0= ruleUnit
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
                    						"org.xtext.svg.coordinate.SvgCoordinate.Unit");
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
    // InternalSvgCoordinate.g:122:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalSvgCoordinate.g:122:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalSvgCoordinate.g:123:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalSvgCoordinate.g:129:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? ) | ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? ) ) ;
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
            // InternalSvgCoordinate.g:135:2: ( ( (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? ) | ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? ) ) )
            // InternalSvgCoordinate.g:136:2: ( (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? ) | ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? ) )
            {
            // InternalSvgCoordinate.g:136:2: ( (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? ) | ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? ) )
            int alt8=2;
            switch ( input.LA(1) ) {
            case 13:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_INT) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==15) ) {
                        alt8=2;
                    }
                    else if ( (LA8_3==EOF||(LA8_3>=11 && LA8_3<=12)||(LA8_3>=16 && LA8_3<=24)) ) {
                        alt8=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA8_1==15) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==RULE_INT) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==15) ) {
                        alt8=2;
                    }
                    else if ( (LA8_3==EOF||(LA8_3>=11 && LA8_3<=12)||(LA8_3>=16 && LA8_3<=24)) ) {
                        alt8=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA8_2==15) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA8_3 = input.LA(2);

                if ( (LA8_3==15) ) {
                    alt8=2;
                }
                else if ( (LA8_3==EOF||(LA8_3>=11 && LA8_3<=12)||(LA8_3>=16 && LA8_3<=24)) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                alt8=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSvgCoordinate.g:137:3: (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? )
                    {
                    // InternalSvgCoordinate.g:137:3: (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? )
                    // InternalSvgCoordinate.g:138:4: this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )?
                    {

                    				newCompositeNode(grammarAccess.getNumberAccess().getIntegerParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_4);
                    this_Integer_0=ruleInteger();

                    state._fsp--;


                    				current.merge(this_Integer_0);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalSvgCoordinate.g:148:4: ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>=11 && LA3_0<=12)) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalSvgCoordinate.g:149:5: (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger
                            {
                            // InternalSvgCoordinate.g:149:5: (kw= 'E' | kw= 'e' )
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( (LA2_0==11) ) {
                                alt2=1;
                            }
                            else if ( (LA2_0==12) ) {
                                alt2=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 0, input);

                                throw nvae;
                            }
                            switch (alt2) {
                                case 1 :
                                    // InternalSvgCoordinate.g:150:6: kw= 'E'
                                    {
                                    kw=(Token)match(input,11,FOLLOW_5); 

                                    						current.merge(kw);
                                    						newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_0_1_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalSvgCoordinate.g:156:6: kw= 'e'
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
                    // InternalSvgCoordinate.g:175:3: ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? )
                    {
                    // InternalSvgCoordinate.g:175:3: ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? )
                    // InternalSvgCoordinate.g:176:4: (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )?
                    {
                    // InternalSvgCoordinate.g:176:4: (kw= '+' | kw= '-' )?
                    int alt4=3;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==13) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==14) ) {
                        alt4=2;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalSvgCoordinate.g:177:5: kw= '+'
                            {
                            kw=(Token)match(input,13,FOLLOW_6); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getNumberAccess().getPlusSignKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSvgCoordinate.g:183:5: kw= '-'
                            {
                            kw=(Token)match(input,14,FOLLOW_6); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getNumberAccess().getHyphenMinusKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalSvgCoordinate.g:189:4: (this_INT_6= RULE_INT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_INT) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalSvgCoordinate.g:190:5: this_INT_6= RULE_INT
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
                    			
                    // InternalSvgCoordinate.g:210:4: ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=11 && LA7_0<=12)) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalSvgCoordinate.g:211:5: (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger
                            {
                            // InternalSvgCoordinate.g:211:5: (kw= 'E' | kw= 'e' )
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0==11) ) {
                                alt6=1;
                            }
                            else if ( (LA6_0==12) ) {
                                alt6=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 0, input);

                                throw nvae;
                            }
                            switch (alt6) {
                                case 1 :
                                    // InternalSvgCoordinate.g:212:6: kw= 'E'
                                    {
                                    kw=(Token)match(input,11,FOLLOW_5); 

                                    						current.merge(kw);
                                    						newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_1_4_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalSvgCoordinate.g:218:6: kw= 'e'
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
    // InternalSvgCoordinate.g:240:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalSvgCoordinate.g:240:47: (iv_ruleInteger= ruleInteger EOF )
            // InternalSvgCoordinate.g:241:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalSvgCoordinate.g:247:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalSvgCoordinate.g:253:2: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) )
            // InternalSvgCoordinate.g:254:2: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            {
            // InternalSvgCoordinate.g:254:2: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            // InternalSvgCoordinate.g:255:3: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
            {
            // InternalSvgCoordinate.g:255:3: (kw= '+' | kw= '-' )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            else if ( (LA9_0==14) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // InternalSvgCoordinate.g:256:4: kw= '+'
                    {
                    kw=(Token)match(input,13,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIntegerAccess().getPlusSignKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSvgCoordinate.g:262:4: kw= '-'
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


    // $ANTLR start "ruleUnit"
    // InternalSvgCoordinate.g:279:1: ruleUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'px' ) | (enumLiteral_1= 'em' ) | (enumLiteral_2= 'ex' ) | (enumLiteral_3= 'in' ) | (enumLiteral_4= 'cm' ) | (enumLiteral_5= 'mm' ) | (enumLiteral_6= 'pt' ) | (enumLiteral_7= 'pc' ) | (enumLiteral_8= '%' ) ) ;
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
            // InternalSvgCoordinate.g:285:2: ( ( (enumLiteral_0= 'px' ) | (enumLiteral_1= 'em' ) | (enumLiteral_2= 'ex' ) | (enumLiteral_3= 'in' ) | (enumLiteral_4= 'cm' ) | (enumLiteral_5= 'mm' ) | (enumLiteral_6= 'pt' ) | (enumLiteral_7= 'pc' ) | (enumLiteral_8= '%' ) ) )
            // InternalSvgCoordinate.g:286:2: ( (enumLiteral_0= 'px' ) | (enumLiteral_1= 'em' ) | (enumLiteral_2= 'ex' ) | (enumLiteral_3= 'in' ) | (enumLiteral_4= 'cm' ) | (enumLiteral_5= 'mm' ) | (enumLiteral_6= 'pt' ) | (enumLiteral_7= 'pc' ) | (enumLiteral_8= '%' ) )
            {
            // InternalSvgCoordinate.g:286:2: ( (enumLiteral_0= 'px' ) | (enumLiteral_1= 'em' ) | (enumLiteral_2= 'ex' ) | (enumLiteral_3= 'in' ) | (enumLiteral_4= 'cm' ) | (enumLiteral_5= 'mm' ) | (enumLiteral_6= 'pt' ) | (enumLiteral_7= 'pc' ) | (enumLiteral_8= '%' ) )
            int alt10=9;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt10=1;
                }
                break;
            case 17:
                {
                alt10=2;
                }
                break;
            case 18:
                {
                alt10=3;
                }
                break;
            case 19:
                {
                alt10=4;
                }
                break;
            case 20:
                {
                alt10=5;
                }
                break;
            case 21:
                {
                alt10=6;
                }
                break;
            case 22:
                {
                alt10=7;
                }
                break;
            case 23:
                {
                alt10=8;
                }
                break;
            case 24:
                {
                alt10=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSvgCoordinate.g:287:3: (enumLiteral_0= 'px' )
                    {
                    // InternalSvgCoordinate.g:287:3: (enumLiteral_0= 'px' )
                    // InternalSvgCoordinate.g:288:4: enumLiteral_0= 'px'
                    {
                    enumLiteral_0=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getPxEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnitAccess().getPxEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSvgCoordinate.g:295:3: (enumLiteral_1= 'em' )
                    {
                    // InternalSvgCoordinate.g:295:3: (enumLiteral_1= 'em' )
                    // InternalSvgCoordinate.g:296:4: enumLiteral_1= 'em'
                    {
                    enumLiteral_1=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getEmEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUnitAccess().getEmEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSvgCoordinate.g:303:3: (enumLiteral_2= 'ex' )
                    {
                    // InternalSvgCoordinate.g:303:3: (enumLiteral_2= 'ex' )
                    // InternalSvgCoordinate.g:304:4: enumLiteral_2= 'ex'
                    {
                    enumLiteral_2=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getExEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getUnitAccess().getExEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSvgCoordinate.g:311:3: (enumLiteral_3= 'in' )
                    {
                    // InternalSvgCoordinate.g:311:3: (enumLiteral_3= 'in' )
                    // InternalSvgCoordinate.g:312:4: enumLiteral_3= 'in'
                    {
                    enumLiteral_3=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getInEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getUnitAccess().getInEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSvgCoordinate.g:319:3: (enumLiteral_4= 'cm' )
                    {
                    // InternalSvgCoordinate.g:319:3: (enumLiteral_4= 'cm' )
                    // InternalSvgCoordinate.g:320:4: enumLiteral_4= 'cm'
                    {
                    enumLiteral_4=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getCmEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getUnitAccess().getCmEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSvgCoordinate.g:327:3: (enumLiteral_5= 'mm' )
                    {
                    // InternalSvgCoordinate.g:327:3: (enumLiteral_5= 'mm' )
                    // InternalSvgCoordinate.g:328:4: enumLiteral_5= 'mm'
                    {
                    enumLiteral_5=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getMmEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getUnitAccess().getMmEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSvgCoordinate.g:335:3: (enumLiteral_6= 'pt' )
                    {
                    // InternalSvgCoordinate.g:335:3: (enumLiteral_6= 'pt' )
                    // InternalSvgCoordinate.g:336:4: enumLiteral_6= 'pt'
                    {
                    enumLiteral_6=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getPtEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getUnitAccess().getPtEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSvgCoordinate.g:343:3: (enumLiteral_7= 'pc' )
                    {
                    // InternalSvgCoordinate.g:343:3: (enumLiteral_7= 'pc' )
                    // InternalSvgCoordinate.g:344:4: enumLiteral_7= 'pc'
                    {
                    enumLiteral_7=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getPcEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getUnitAccess().getPcEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSvgCoordinate.g:351:3: (enumLiteral_8= '%' )
                    {
                    // InternalSvgCoordinate.g:351:3: (enumLiteral_8= '%' )
                    // InternalSvgCoordinate.g:352:4: enumLiteral_8= '%'
                    {
                    enumLiteral_8=(Token)match(input,24,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001FF0002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});

}