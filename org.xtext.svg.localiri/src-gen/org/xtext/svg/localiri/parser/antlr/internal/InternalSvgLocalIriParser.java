package org.xtext.svg.localiri.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.svg.localiri.services.SvgLocalIriGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSvgLocalIriParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'url'", "'('", "'#'", "')'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalSvgLocalIriParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSvgLocalIriParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSvgLocalIriParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSvgLocalIri.g"; }



     	private SvgLocalIriGrammarAccess grammarAccess;

        public InternalSvgLocalIriParser(TokenStream input, SvgLocalIriGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "LocalIri";
       	}

       	@Override
       	protected SvgLocalIriGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleLocalIri"
    // InternalSvgLocalIri.g:64:1: entryRuleLocalIri returns [EObject current=null] : iv_ruleLocalIri= ruleLocalIri EOF ;
    public final EObject entryRuleLocalIri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalIri = null;


        try {
            // InternalSvgLocalIri.g:64:49: (iv_ruleLocalIri= ruleLocalIri EOF )
            // InternalSvgLocalIri.g:65:2: iv_ruleLocalIri= ruleLocalIri EOF
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
    // InternalSvgLocalIri.g:71:1: ruleLocalIri returns [EObject current=null] : (otherlv_0= 'url' otherlv_1= '(' otherlv_2= '#' ( (lv_elementName_3_0= RULE_ID ) ) otherlv_4= ')' ) ;
    public final EObject ruleLocalIri() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_elementName_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSvgLocalIri.g:77:2: ( (otherlv_0= 'url' otherlv_1= '(' otherlv_2= '#' ( (lv_elementName_3_0= RULE_ID ) ) otherlv_4= ')' ) )
            // InternalSvgLocalIri.g:78:2: (otherlv_0= 'url' otherlv_1= '(' otherlv_2= '#' ( (lv_elementName_3_0= RULE_ID ) ) otherlv_4= ')' )
            {
            // InternalSvgLocalIri.g:78:2: (otherlv_0= 'url' otherlv_1= '(' otherlv_2= '#' ( (lv_elementName_3_0= RULE_ID ) ) otherlv_4= ')' )
            // InternalSvgLocalIri.g:79:3: otherlv_0= 'url' otherlv_1= '(' otherlv_2= '#' ( (lv_elementName_3_0= RULE_ID ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalIriAccess().getUrlKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalIriAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getLocalIriAccess().getNumberSignKeyword_2());
            		
            // InternalSvgLocalIri.g:91:3: ( (lv_elementName_3_0= RULE_ID ) )
            // InternalSvgLocalIri.g:92:4: (lv_elementName_3_0= RULE_ID )
            {
            // InternalSvgLocalIri.g:92:4: (lv_elementName_3_0= RULE_ID )
            // InternalSvgLocalIri.g:93:5: lv_elementName_3_0= RULE_ID
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

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});

}