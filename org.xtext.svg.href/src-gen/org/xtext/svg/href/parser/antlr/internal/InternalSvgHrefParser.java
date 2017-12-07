package org.xtext.svg.href.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.svg.href.services.SvgHrefGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSvgHrefParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BASE64_STRING", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'url'", "'('", "'#'", "')'", "'data'", "':'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_BASE64_STRING=5;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalSvgHrefParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSvgHrefParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSvgHrefParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSvgHref.g"; }



     	private SvgHrefGrammarAccess grammarAccess;

        public InternalSvgHrefParser(TokenStream input, SvgHrefGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Href";
       	}

       	@Override
       	protected SvgHrefGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleHref"
    // InternalSvgHref.g:64:1: entryRuleHref returns [EObject current=null] : iv_ruleHref= ruleHref EOF ;
    public final EObject entryRuleHref() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHref = null;


        try {
            // InternalSvgHref.g:64:45: (iv_ruleHref= ruleHref EOF )
            // InternalSvgHref.g:65:2: iv_ruleHref= ruleHref EOF
            {
             newCompositeNode(grammarAccess.getHrefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHref=ruleHref();

            state._fsp--;

             current =iv_ruleHref; 
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
    // $ANTLR end "entryRuleHref"


    // $ANTLR start "ruleHref"
    // InternalSvgHref.g:71:1: ruleHref returns [EObject current=null] : (this_LocalIri_0= ruleLocalIri | this_Base64Ref_1= ruleBase64Ref ) ;
    public final EObject ruleHref() throws RecognitionException {
        EObject current = null;

        EObject this_LocalIri_0 = null;

        EObject this_Base64Ref_1 = null;



        	enterRule();

        try {
            // InternalSvgHref.g:77:2: ( (this_LocalIri_0= ruleLocalIri | this_Base64Ref_1= ruleBase64Ref ) )
            // InternalSvgHref.g:78:2: (this_LocalIri_0= ruleLocalIri | this_Base64Ref_1= ruleBase64Ref )
            {
            // InternalSvgHref.g:78:2: (this_LocalIri_0= ruleLocalIri | this_Base64Ref_1= ruleBase64Ref )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSvgHref.g:79:3: this_LocalIri_0= ruleLocalIri
                    {

                    			newCompositeNode(grammarAccess.getHrefAccess().getLocalIriParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LocalIri_0=ruleLocalIri();

                    state._fsp--;


                    			current = this_LocalIri_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSvgHref.g:88:3: this_Base64Ref_1= ruleBase64Ref
                    {

                    			newCompositeNode(grammarAccess.getHrefAccess().getBase64RefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Base64Ref_1=ruleBase64Ref();

                    state._fsp--;


                    			current = this_Base64Ref_1;
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
    // $ANTLR end "ruleHref"


    // $ANTLR start "entryRuleLocalIri"
    // InternalSvgHref.g:100:1: entryRuleLocalIri returns [EObject current=null] : iv_ruleLocalIri= ruleLocalIri EOF ;
    public final EObject entryRuleLocalIri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalIri = null;


        try {
            // InternalSvgHref.g:100:49: (iv_ruleLocalIri= ruleLocalIri EOF )
            // InternalSvgHref.g:101:2: iv_ruleLocalIri= ruleLocalIri EOF
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
    // InternalSvgHref.g:107:1: ruleLocalIri returns [EObject current=null] : (otherlv_0= 'url' otherlv_1= '(' otherlv_2= '#' ( (lv_elementName_3_0= RULE_ID ) ) otherlv_4= ')' ) ;
    public final EObject ruleLocalIri() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_elementName_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSvgHref.g:113:2: ( (otherlv_0= 'url' otherlv_1= '(' otherlv_2= '#' ( (lv_elementName_3_0= RULE_ID ) ) otherlv_4= ')' ) )
            // InternalSvgHref.g:114:2: (otherlv_0= 'url' otherlv_1= '(' otherlv_2= '#' ( (lv_elementName_3_0= RULE_ID ) ) otherlv_4= ')' )
            {
            // InternalSvgHref.g:114:2: (otherlv_0= 'url' otherlv_1= '(' otherlv_2= '#' ( (lv_elementName_3_0= RULE_ID ) ) otherlv_4= ')' )
            // InternalSvgHref.g:115:3: otherlv_0= 'url' otherlv_1= '(' otherlv_2= '#' ( (lv_elementName_3_0= RULE_ID ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalIriAccess().getUrlKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalIriAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getLocalIriAccess().getNumberSignKeyword_2());
            		
            // InternalSvgHref.g:127:3: ( (lv_elementName_3_0= RULE_ID ) )
            // InternalSvgHref.g:128:4: (lv_elementName_3_0= RULE_ID )
            {
            // InternalSvgHref.g:128:4: (lv_elementName_3_0= RULE_ID )
            // InternalSvgHref.g:129:5: lv_elementName_3_0= RULE_ID
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

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleBase64Ref"
    // InternalSvgHref.g:153:1: entryRuleBase64Ref returns [EObject current=null] : iv_ruleBase64Ref= ruleBase64Ref EOF ;
    public final EObject entryRuleBase64Ref() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBase64Ref = null;


        try {
            // InternalSvgHref.g:153:50: (iv_ruleBase64Ref= ruleBase64Ref EOF )
            // InternalSvgHref.g:154:2: iv_ruleBase64Ref= ruleBase64Ref EOF
            {
             newCompositeNode(grammarAccess.getBase64RefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBase64Ref=ruleBase64Ref();

            state._fsp--;

             current =iv_ruleBase64Ref; 
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
    // $ANTLR end "entryRuleBase64Ref"


    // $ANTLR start "ruleBase64Ref"
    // InternalSvgHref.g:160:1: ruleBase64Ref returns [EObject current=null] : (otherlv_0= 'data' otherlv_1= ':' ( (lv_base64_2_0= RULE_BASE64_STRING ) ) ) ;
    public final EObject ruleBase64Ref() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_base64_2_0=null;


        	enterRule();

        try {
            // InternalSvgHref.g:166:2: ( (otherlv_0= 'data' otherlv_1= ':' ( (lv_base64_2_0= RULE_BASE64_STRING ) ) ) )
            // InternalSvgHref.g:167:2: (otherlv_0= 'data' otherlv_1= ':' ( (lv_base64_2_0= RULE_BASE64_STRING ) ) )
            {
            // InternalSvgHref.g:167:2: (otherlv_0= 'data' otherlv_1= ':' ( (lv_base64_2_0= RULE_BASE64_STRING ) ) )
            // InternalSvgHref.g:168:3: otherlv_0= 'data' otherlv_1= ':' ( (lv_base64_2_0= RULE_BASE64_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getBase64RefAccess().getDataKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBase64RefAccess().getColonKeyword_1());
            		
            // InternalSvgHref.g:176:3: ( (lv_base64_2_0= RULE_BASE64_STRING ) )
            // InternalSvgHref.g:177:4: (lv_base64_2_0= RULE_BASE64_STRING )
            {
            // InternalSvgHref.g:177:4: (lv_base64_2_0= RULE_BASE64_STRING )
            // InternalSvgHref.g:178:5: lv_base64_2_0= RULE_BASE64_STRING
            {
            lv_base64_2_0=(Token)match(input,RULE_BASE64_STRING,FOLLOW_2); 

            					newLeafNode(lv_base64_2_0, grammarAccess.getBase64RefAccess().getBase64BASE64_STRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBase64RefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"base64",
            						lv_base64_2_0,
            						"org.xtext.svg.href.SvgHref.BASE64_STRING");
            				

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
    // $ANTLR end "ruleBase64Ref"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});

}