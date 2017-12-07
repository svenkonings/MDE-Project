package org.xtext.svg.lengths.parser.antlr.internal;

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
import org.xtext.svg.lengths.services.SvgLengthsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSvgLengthsParser extends AbstractInternalAntlrParser {
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


        public InternalSvgLengthsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSvgLengthsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSvgLengthsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSvgLengths.g"; }



     	private SvgLengthsGrammarAccess grammarAccess;

        public InternalSvgLengthsParser(TokenStream input, SvgLengthsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "StrokeDashArray";
       	}

       	@Override
       	protected SvgLengthsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStrokeDashArray"
    // InternalSvgLengths.g:65:1: entryRuleStrokeDashArray returns [EObject current=null] : iv_ruleStrokeDashArray= ruleStrokeDashArray EOF ;
    public final EObject entryRuleStrokeDashArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrokeDashArray = null;


        try {
            // InternalSvgLengths.g:65:56: (iv_ruleStrokeDashArray= ruleStrokeDashArray EOF )
            // InternalSvgLengths.g:66:2: iv_ruleStrokeDashArray= ruleStrokeDashArray EOF
            {
             newCompositeNode(grammarAccess.getStrokeDashArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStrokeDashArray=ruleStrokeDashArray();

            state._fsp--;

             current =iv_ruleStrokeDashArray; 
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
    // $ANTLR end "entryRuleStrokeDashArray"


    // $ANTLR start "ruleStrokeDashArray"
    // InternalSvgLengths.g:72:1: ruleStrokeDashArray returns [EObject current=null] : ( ( (lv_strokeDashArray_0_0= ruleLength ) ) ( (otherlv_1= ',' )? ( (lv_strokeDashArray_2_0= ruleLength ) ) )* ) ;
    public final EObject ruleStrokeDashArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_strokeDashArray_0_0 = null;

        EObject lv_strokeDashArray_2_0 = null;



        	enterRule();

        try {
            // InternalSvgLengths.g:78:2: ( ( ( (lv_strokeDashArray_0_0= ruleLength ) ) ( (otherlv_1= ',' )? ( (lv_strokeDashArray_2_0= ruleLength ) ) )* ) )
            // InternalSvgLengths.g:79:2: ( ( (lv_strokeDashArray_0_0= ruleLength ) ) ( (otherlv_1= ',' )? ( (lv_strokeDashArray_2_0= ruleLength ) ) )* )
            {
            // InternalSvgLengths.g:79:2: ( ( (lv_strokeDashArray_0_0= ruleLength ) ) ( (otherlv_1= ',' )? ( (lv_strokeDashArray_2_0= ruleLength ) ) )* )
            // InternalSvgLengths.g:80:3: ( (lv_strokeDashArray_0_0= ruleLength ) ) ( (otherlv_1= ',' )? ( (lv_strokeDashArray_2_0= ruleLength ) ) )*
            {
            // InternalSvgLengths.g:80:3: ( (lv_strokeDashArray_0_0= ruleLength ) )
            // InternalSvgLengths.g:81:4: (lv_strokeDashArray_0_0= ruleLength )
            {
            // InternalSvgLengths.g:81:4: (lv_strokeDashArray_0_0= ruleLength )
            // InternalSvgLengths.g:82:5: lv_strokeDashArray_0_0= ruleLength
            {

            					newCompositeNode(grammarAccess.getStrokeDashArrayAccess().getStrokeDashArrayLengthParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_strokeDashArray_0_0=ruleLength();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStrokeDashArrayRule());
            					}
            					add(
            						current,
            						"strokeDashArray",
            						lv_strokeDashArray_0_0,
            						"org.xtext.svg.lengths.SvgLengths.Length");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgLengths.g:99:3: ( (otherlv_1= ',' )? ( (lv_strokeDashArray_2_0= ruleLength ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_INT||LA2_0==11||(LA2_0>=14 && LA2_0<=16)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSvgLengths.g:100:4: (otherlv_1= ',' )? ( (lv_strokeDashArray_2_0= ruleLength ) )
            	    {
            	    // InternalSvgLengths.g:100:4: (otherlv_1= ',' )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==11) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalSvgLengths.g:101:5: otherlv_1= ','
            	            {
            	            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            	            					newLeafNode(otherlv_1, grammarAccess.getStrokeDashArrayAccess().getCommaKeyword_1_0());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSvgLengths.g:106:4: ( (lv_strokeDashArray_2_0= ruleLength ) )
            	    // InternalSvgLengths.g:107:5: (lv_strokeDashArray_2_0= ruleLength )
            	    {
            	    // InternalSvgLengths.g:107:5: (lv_strokeDashArray_2_0= ruleLength )
            	    // InternalSvgLengths.g:108:6: lv_strokeDashArray_2_0= ruleLength
            	    {

            	    						newCompositeNode(grammarAccess.getStrokeDashArrayAccess().getStrokeDashArrayLengthParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_strokeDashArray_2_0=ruleLength();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStrokeDashArrayRule());
            	    						}
            	    						add(
            	    							current,
            	    							"strokeDashArray",
            	    							lv_strokeDashArray_2_0,
            	    							"org.xtext.svg.lengths.SvgLengths.Length");
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
    // $ANTLR end "ruleStrokeDashArray"


    // $ANTLR start "entryRuleLength"
    // InternalSvgLengths.g:130:1: entryRuleLength returns [EObject current=null] : iv_ruleLength= ruleLength EOF ;
    public final EObject entryRuleLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLength = null;


        try {
            // InternalSvgLengths.g:130:47: (iv_ruleLength= ruleLength EOF )
            // InternalSvgLengths.g:131:2: iv_ruleLength= ruleLength EOF
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
    // InternalSvgLengths.g:137:1: ruleLength returns [EObject current=null] : ( ( (lv_number_0_0= ruleNumber ) ) ( (lv_unit_1_0= ruleUnit ) )? ) ;
    public final EObject ruleLength() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_number_0_0 = null;

        Enumerator lv_unit_1_0 = null;



        	enterRule();

        try {
            // InternalSvgLengths.g:143:2: ( ( ( (lv_number_0_0= ruleNumber ) ) ( (lv_unit_1_0= ruleUnit ) )? ) )
            // InternalSvgLengths.g:144:2: ( ( (lv_number_0_0= ruleNumber ) ) ( (lv_unit_1_0= ruleUnit ) )? )
            {
            // InternalSvgLengths.g:144:2: ( ( (lv_number_0_0= ruleNumber ) ) ( (lv_unit_1_0= ruleUnit ) )? )
            // InternalSvgLengths.g:145:3: ( (lv_number_0_0= ruleNumber ) ) ( (lv_unit_1_0= ruleUnit ) )?
            {
            // InternalSvgLengths.g:145:3: ( (lv_number_0_0= ruleNumber ) )
            // InternalSvgLengths.g:146:4: (lv_number_0_0= ruleNumber )
            {
            // InternalSvgLengths.g:146:4: (lv_number_0_0= ruleNumber )
            // InternalSvgLengths.g:147:5: lv_number_0_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getLengthAccess().getNumberNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_number_0_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLengthRule());
            					}
            					set(
            						current,
            						"number",
            						lv_number_0_0,
            						"org.xtext.svg.lengths.SvgLengths.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgLengths.g:164:3: ( (lv_unit_1_0= ruleUnit ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=17 && LA3_0<=25)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSvgLengths.g:165:4: (lv_unit_1_0= ruleUnit )
                    {
                    // InternalSvgLengths.g:165:4: (lv_unit_1_0= ruleUnit )
                    // InternalSvgLengths.g:166:5: lv_unit_1_0= ruleUnit
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
                    						"org.xtext.svg.lengths.SvgLengths.Unit");
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
    // InternalSvgLengths.g:187:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalSvgLengths.g:187:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalSvgLengths.g:188:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalSvgLengths.g:194:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? ) | ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? ) ) ;
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
            // InternalSvgLengths.g:200:2: ( ( (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? ) | ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? ) ) )
            // InternalSvgLengths.g:201:2: ( (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? ) | ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? ) )
            {
            // InternalSvgLengths.g:201:2: ( (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? ) | ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? ) )
            int alt10=2;
            switch ( input.LA(1) ) {
            case 14:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_INT) ) {
                    alt10=1;
                }
                else if ( (LA10_1==16) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==RULE_INT) ) {
                    alt10=1;
                }
                else if ( (LA10_2==16) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt10=1;
                }
                break;
            case 16:
                {
                alt10=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSvgLengths.g:202:3: (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? )
                    {
                    // InternalSvgLengths.g:202:3: (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? )
                    // InternalSvgLengths.g:203:4: this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )?
                    {

                    				newCompositeNode(grammarAccess.getNumberAccess().getIntegerParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_6);
                    this_Integer_0=ruleInteger();

                    state._fsp--;


                    				current.merge(this_Integer_0);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalSvgLengths.g:213:4: ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=12 && LA5_0<=13)) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalSvgLengths.g:214:5: (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger
                            {
                            // InternalSvgLengths.g:214:5: (kw= 'E' | kw= 'e' )
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( (LA4_0==12) ) {
                                alt4=1;
                            }
                            else if ( (LA4_0==13) ) {
                                alt4=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 0, input);

                                throw nvae;
                            }
                            switch (alt4) {
                                case 1 :
                                    // InternalSvgLengths.g:215:6: kw= 'E'
                                    {
                                    kw=(Token)match(input,12,FOLLOW_7); 

                                    						current.merge(kw);
                                    						newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_0_1_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalSvgLengths.g:221:6: kw= 'e'
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
                    // InternalSvgLengths.g:240:3: ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? )
                    {
                    // InternalSvgLengths.g:240:3: ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? )
                    // InternalSvgLengths.g:241:4: (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )?
                    {
                    // InternalSvgLengths.g:241:4: (kw= '+' | kw= '-' )?
                    int alt6=3;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==14) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==15) ) {
                        alt6=2;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalSvgLengths.g:242:5: kw= '+'
                            {
                            kw=(Token)match(input,14,FOLLOW_8); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getNumberAccess().getPlusSignKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSvgLengths.g:248:5: kw= '-'
                            {
                            kw=(Token)match(input,15,FOLLOW_8); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getNumberAccess().getHyphenMinusKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalSvgLengths.g:254:4: (this_INT_6= RULE_INT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_INT) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalSvgLengths.g:255:5: this_INT_6= RULE_INT
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
                    			
                    // InternalSvgLengths.g:275:4: ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( ((LA9_0>=12 && LA9_0<=13)) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSvgLengths.g:276:5: (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger
                            {
                            // InternalSvgLengths.g:276:5: (kw= 'E' | kw= 'e' )
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0==12) ) {
                                alt8=1;
                            }
                            else if ( (LA8_0==13) ) {
                                alt8=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 8, 0, input);

                                throw nvae;
                            }
                            switch (alt8) {
                                case 1 :
                                    // InternalSvgLengths.g:277:6: kw= 'E'
                                    {
                                    kw=(Token)match(input,12,FOLLOW_7); 

                                    						current.merge(kw);
                                    						newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_1_4_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalSvgLengths.g:283:6: kw= 'e'
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
    // InternalSvgLengths.g:305:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalSvgLengths.g:305:47: (iv_ruleInteger= ruleInteger EOF )
            // InternalSvgLengths.g:306:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalSvgLengths.g:312:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalSvgLengths.g:318:2: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) )
            // InternalSvgLengths.g:319:2: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            {
            // InternalSvgLengths.g:319:2: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            // InternalSvgLengths.g:320:3: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
            {
            // InternalSvgLengths.g:320:3: (kw= '+' | kw= '-' )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            else if ( (LA11_0==15) ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // InternalSvgLengths.g:321:4: kw= '+'
                    {
                    kw=(Token)match(input,14,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIntegerAccess().getPlusSignKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSvgLengths.g:327:4: kw= '-'
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
    // InternalSvgLengths.g:344:1: ruleUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'px' ) | (enumLiteral_1= 'em' ) | (enumLiteral_2= 'ex' ) | (enumLiteral_3= 'in' ) | (enumLiteral_4= 'cm' ) | (enumLiteral_5= 'mm' ) | (enumLiteral_6= 'pt' ) | (enumLiteral_7= 'pc' ) | (enumLiteral_8= '%' ) ) ;
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
            // InternalSvgLengths.g:350:2: ( ( (enumLiteral_0= 'px' ) | (enumLiteral_1= 'em' ) | (enumLiteral_2= 'ex' ) | (enumLiteral_3= 'in' ) | (enumLiteral_4= 'cm' ) | (enumLiteral_5= 'mm' ) | (enumLiteral_6= 'pt' ) | (enumLiteral_7= 'pc' ) | (enumLiteral_8= '%' ) ) )
            // InternalSvgLengths.g:351:2: ( (enumLiteral_0= 'px' ) | (enumLiteral_1= 'em' ) | (enumLiteral_2= 'ex' ) | (enumLiteral_3= 'in' ) | (enumLiteral_4= 'cm' ) | (enumLiteral_5= 'mm' ) | (enumLiteral_6= 'pt' ) | (enumLiteral_7= 'pc' ) | (enumLiteral_8= '%' ) )
            {
            // InternalSvgLengths.g:351:2: ( (enumLiteral_0= 'px' ) | (enumLiteral_1= 'em' ) | (enumLiteral_2= 'ex' ) | (enumLiteral_3= 'in' ) | (enumLiteral_4= 'cm' ) | (enumLiteral_5= 'mm' ) | (enumLiteral_6= 'pt' ) | (enumLiteral_7= 'pc' ) | (enumLiteral_8= '%' ) )
            int alt12=9;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt12=1;
                }
                break;
            case 18:
                {
                alt12=2;
                }
                break;
            case 19:
                {
                alt12=3;
                }
                break;
            case 20:
                {
                alt12=4;
                }
                break;
            case 21:
                {
                alt12=5;
                }
                break;
            case 22:
                {
                alt12=6;
                }
                break;
            case 23:
                {
                alt12=7;
                }
                break;
            case 24:
                {
                alt12=8;
                }
                break;
            case 25:
                {
                alt12=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSvgLengths.g:352:3: (enumLiteral_0= 'px' )
                    {
                    // InternalSvgLengths.g:352:3: (enumLiteral_0= 'px' )
                    // InternalSvgLengths.g:353:4: enumLiteral_0= 'px'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getPxEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnitAccess().getPxEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSvgLengths.g:360:3: (enumLiteral_1= 'em' )
                    {
                    // InternalSvgLengths.g:360:3: (enumLiteral_1= 'em' )
                    // InternalSvgLengths.g:361:4: enumLiteral_1= 'em'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getEmEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUnitAccess().getEmEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSvgLengths.g:368:3: (enumLiteral_2= 'ex' )
                    {
                    // InternalSvgLengths.g:368:3: (enumLiteral_2= 'ex' )
                    // InternalSvgLengths.g:369:4: enumLiteral_2= 'ex'
                    {
                    enumLiteral_2=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getExEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getUnitAccess().getExEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSvgLengths.g:376:3: (enumLiteral_3= 'in' )
                    {
                    // InternalSvgLengths.g:376:3: (enumLiteral_3= 'in' )
                    // InternalSvgLengths.g:377:4: enumLiteral_3= 'in'
                    {
                    enumLiteral_3=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getInEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getUnitAccess().getInEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSvgLengths.g:384:3: (enumLiteral_4= 'cm' )
                    {
                    // InternalSvgLengths.g:384:3: (enumLiteral_4= 'cm' )
                    // InternalSvgLengths.g:385:4: enumLiteral_4= 'cm'
                    {
                    enumLiteral_4=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getCmEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getUnitAccess().getCmEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSvgLengths.g:392:3: (enumLiteral_5= 'mm' )
                    {
                    // InternalSvgLengths.g:392:3: (enumLiteral_5= 'mm' )
                    // InternalSvgLengths.g:393:4: enumLiteral_5= 'mm'
                    {
                    enumLiteral_5=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getMmEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getUnitAccess().getMmEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSvgLengths.g:400:3: (enumLiteral_6= 'pt' )
                    {
                    // InternalSvgLengths.g:400:3: (enumLiteral_6= 'pt' )
                    // InternalSvgLengths.g:401:4: enumLiteral_6= 'pt'
                    {
                    enumLiteral_6=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getPtEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getUnitAccess().getPtEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSvgLengths.g:408:3: (enumLiteral_7= 'pc' )
                    {
                    // InternalSvgLengths.g:408:3: (enumLiteral_7= 'pc' )
                    // InternalSvgLengths.g:409:4: enumLiteral_7= 'pc'
                    {
                    enumLiteral_7=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getPcEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getUnitAccess().getPcEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSvgLengths.g:416:3: (enumLiteral_8= '%' )
                    {
                    // InternalSvgLengths.g:416:3: (enumLiteral_8= '%' )
                    // InternalSvgLengths.g:417:4: enumLiteral_8= '%'
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