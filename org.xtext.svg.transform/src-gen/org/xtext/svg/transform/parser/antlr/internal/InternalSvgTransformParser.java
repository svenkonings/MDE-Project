package org.xtext.svg.transform.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.svg.transform.services.SvgTransformGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSvgTransformParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'matrix'", "'('", "')'", "'translate'", "'scale'", "'rotate'", "'skewX'", "'skewY'", "'E'", "'e'", "'+'", "'-'", "'.'"
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


        public InternalSvgTransformParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSvgTransformParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSvgTransformParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSvgTransform.g"; }



     	private SvgTransformGrammarAccess grammarAccess;

        public InternalSvgTransformParser(TokenStream input, SvgTransformGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Transform";
       	}

       	@Override
       	protected SvgTransformGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTransform"
    // InternalSvgTransform.g:64:1: entryRuleTransform returns [EObject current=null] : iv_ruleTransform= ruleTransform EOF ;
    public final EObject entryRuleTransform() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransform = null;


        try {
            // InternalSvgTransform.g:64:50: (iv_ruleTransform= ruleTransform EOF )
            // InternalSvgTransform.g:65:2: iv_ruleTransform= ruleTransform EOF
            {
             newCompositeNode(grammarAccess.getTransformRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransform=ruleTransform();

            state._fsp--;

             current =iv_ruleTransform; 
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
    // $ANTLR end "entryRuleTransform"


    // $ANTLR start "ruleTransform"
    // InternalSvgTransform.g:71:1: ruleTransform returns [EObject current=null] : ( ( (lv_transform_0_0= ruleTransformValue ) ) ( (otherlv_1= ',' )? ( (lv_transform_2_0= ruleTransformValue ) ) )* ) ;
    public final EObject ruleTransform() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_transform_0_0 = null;

        EObject lv_transform_2_0 = null;



        	enterRule();

        try {
            // InternalSvgTransform.g:77:2: ( ( ( (lv_transform_0_0= ruleTransformValue ) ) ( (otherlv_1= ',' )? ( (lv_transform_2_0= ruleTransformValue ) ) )* ) )
            // InternalSvgTransform.g:78:2: ( ( (lv_transform_0_0= ruleTransformValue ) ) ( (otherlv_1= ',' )? ( (lv_transform_2_0= ruleTransformValue ) ) )* )
            {
            // InternalSvgTransform.g:78:2: ( ( (lv_transform_0_0= ruleTransformValue ) ) ( (otherlv_1= ',' )? ( (lv_transform_2_0= ruleTransformValue ) ) )* )
            // InternalSvgTransform.g:79:3: ( (lv_transform_0_0= ruleTransformValue ) ) ( (otherlv_1= ',' )? ( (lv_transform_2_0= ruleTransformValue ) ) )*
            {
            // InternalSvgTransform.g:79:3: ( (lv_transform_0_0= ruleTransformValue ) )
            // InternalSvgTransform.g:80:4: (lv_transform_0_0= ruleTransformValue )
            {
            // InternalSvgTransform.g:80:4: (lv_transform_0_0= ruleTransformValue )
            // InternalSvgTransform.g:81:5: lv_transform_0_0= ruleTransformValue
            {

            					newCompositeNode(grammarAccess.getTransformAccess().getTransformTransformValueParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_transform_0_0=ruleTransformValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransformRule());
            					}
            					add(
            						current,
            						"transform",
            						lv_transform_0_0,
            						"org.xtext.svg.transform.SvgTransform.TransformValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgTransform.g:98:3: ( (otherlv_1= ',' )? ( (lv_transform_2_0= ruleTransformValue ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=11 && LA2_0<=12)||(LA2_0>=15 && LA2_0<=19)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSvgTransform.g:99:4: (otherlv_1= ',' )? ( (lv_transform_2_0= ruleTransformValue ) )
            	    {
            	    // InternalSvgTransform.g:99:4: (otherlv_1= ',' )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==11) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalSvgTransform.g:100:5: otherlv_1= ','
            	            {
            	            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            	            					newLeafNode(otherlv_1, grammarAccess.getTransformAccess().getCommaKeyword_1_0());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSvgTransform.g:105:4: ( (lv_transform_2_0= ruleTransformValue ) )
            	    // InternalSvgTransform.g:106:5: (lv_transform_2_0= ruleTransformValue )
            	    {
            	    // InternalSvgTransform.g:106:5: (lv_transform_2_0= ruleTransformValue )
            	    // InternalSvgTransform.g:107:6: lv_transform_2_0= ruleTransformValue
            	    {

            	    						newCompositeNode(grammarAccess.getTransformAccess().getTransformTransformValueParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_transform_2_0=ruleTransformValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTransformRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transform",
            	    							lv_transform_2_0,
            	    							"org.xtext.svg.transform.SvgTransform.TransformValue");
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
    // $ANTLR end "ruleTransform"


    // $ANTLR start "entryRuleTransformValue"
    // InternalSvgTransform.g:129:1: entryRuleTransformValue returns [EObject current=null] : iv_ruleTransformValue= ruleTransformValue EOF ;
    public final EObject entryRuleTransformValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformValue = null;


        try {
            // InternalSvgTransform.g:129:55: (iv_ruleTransformValue= ruleTransformValue EOF )
            // InternalSvgTransform.g:130:2: iv_ruleTransformValue= ruleTransformValue EOF
            {
             newCompositeNode(grammarAccess.getTransformValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransformValue=ruleTransformValue();

            state._fsp--;

             current =iv_ruleTransformValue; 
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
    // $ANTLR end "entryRuleTransformValue"


    // $ANTLR start "ruleTransformValue"
    // InternalSvgTransform.g:136:1: ruleTransformValue returns [EObject current=null] : (this_Matrix_0= ruleMatrix | this_Translate_1= ruleTranslate | this_Scale_2= ruleScale | this_Rotate_3= ruleRotate | this_SkewX_4= ruleSkewX | this_SkewY_5= ruleSkewY ) ;
    public final EObject ruleTransformValue() throws RecognitionException {
        EObject current = null;

        EObject this_Matrix_0 = null;

        EObject this_Translate_1 = null;

        EObject this_Scale_2 = null;

        EObject this_Rotate_3 = null;

        EObject this_SkewX_4 = null;

        EObject this_SkewY_5 = null;



        	enterRule();

        try {
            // InternalSvgTransform.g:142:2: ( (this_Matrix_0= ruleMatrix | this_Translate_1= ruleTranslate | this_Scale_2= ruleScale | this_Rotate_3= ruleRotate | this_SkewX_4= ruleSkewX | this_SkewY_5= ruleSkewY ) )
            // InternalSvgTransform.g:143:2: (this_Matrix_0= ruleMatrix | this_Translate_1= ruleTranslate | this_Scale_2= ruleScale | this_Rotate_3= ruleRotate | this_SkewX_4= ruleSkewX | this_SkewY_5= ruleSkewY )
            {
            // InternalSvgTransform.g:143:2: (this_Matrix_0= ruleMatrix | this_Translate_1= ruleTranslate | this_Scale_2= ruleScale | this_Rotate_3= ruleRotate | this_SkewX_4= ruleSkewX | this_SkewY_5= ruleSkewY )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            case 18:
                {
                alt3=5;
                }
                break;
            case 19:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSvgTransform.g:144:3: this_Matrix_0= ruleMatrix
                    {

                    			newCompositeNode(grammarAccess.getTransformValueAccess().getMatrixParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Matrix_0=ruleMatrix();

                    state._fsp--;


                    			current = this_Matrix_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSvgTransform.g:153:3: this_Translate_1= ruleTranslate
                    {

                    			newCompositeNode(grammarAccess.getTransformValueAccess().getTranslateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Translate_1=ruleTranslate();

                    state._fsp--;


                    			current = this_Translate_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSvgTransform.g:162:3: this_Scale_2= ruleScale
                    {

                    			newCompositeNode(grammarAccess.getTransformValueAccess().getScaleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Scale_2=ruleScale();

                    state._fsp--;


                    			current = this_Scale_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSvgTransform.g:171:3: this_Rotate_3= ruleRotate
                    {

                    			newCompositeNode(grammarAccess.getTransformValueAccess().getRotateParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rotate_3=ruleRotate();

                    state._fsp--;


                    			current = this_Rotate_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSvgTransform.g:180:3: this_SkewX_4= ruleSkewX
                    {

                    			newCompositeNode(grammarAccess.getTransformValueAccess().getSkewXParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_SkewX_4=ruleSkewX();

                    state._fsp--;


                    			current = this_SkewX_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSvgTransform.g:189:3: this_SkewY_5= ruleSkewY
                    {

                    			newCompositeNode(grammarAccess.getTransformValueAccess().getSkewYParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_SkewY_5=ruleSkewY();

                    state._fsp--;


                    			current = this_SkewY_5;
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
    // $ANTLR end "ruleTransformValue"


    // $ANTLR start "entryRuleMatrix"
    // InternalSvgTransform.g:201:1: entryRuleMatrix returns [EObject current=null] : iv_ruleMatrix= ruleMatrix EOF ;
    public final EObject entryRuleMatrix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrix = null;


        try {
            // InternalSvgTransform.g:201:47: (iv_ruleMatrix= ruleMatrix EOF )
            // InternalSvgTransform.g:202:2: iv_ruleMatrix= ruleMatrix EOF
            {
             newCompositeNode(grammarAccess.getMatrixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatrix=ruleMatrix();

            state._fsp--;

             current =iv_ruleMatrix; 
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
    // $ANTLR end "entryRuleMatrix"


    // $ANTLR start "ruleMatrix"
    // InternalSvgTransform.g:208:1: ruleMatrix returns [EObject current=null] : (otherlv_0= 'matrix' otherlv_1= '(' ( (lv_a_2_0= ruleNumber ) ) (otherlv_3= ',' )? ( (lv_b_4_0= ruleNumber ) ) (otherlv_5= ',' )? ( (lv_c_6_0= ruleNumber ) ) (otherlv_7= ',' )? ( (lv_d_8_0= ruleNumber ) ) (otherlv_9= ',' )? ( (lv_e_10_0= ruleNumber ) ) (otherlv_11= ',' )? ( (lv_f_12_0= ruleNumber ) ) otherlv_13= ')' ) ;
    public final EObject ruleMatrix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_a_2_0 = null;

        AntlrDatatypeRuleToken lv_b_4_0 = null;

        AntlrDatatypeRuleToken lv_c_6_0 = null;

        AntlrDatatypeRuleToken lv_d_8_0 = null;

        AntlrDatatypeRuleToken lv_e_10_0 = null;

        AntlrDatatypeRuleToken lv_f_12_0 = null;



        	enterRule();

        try {
            // InternalSvgTransform.g:214:2: ( (otherlv_0= 'matrix' otherlv_1= '(' ( (lv_a_2_0= ruleNumber ) ) (otherlv_3= ',' )? ( (lv_b_4_0= ruleNumber ) ) (otherlv_5= ',' )? ( (lv_c_6_0= ruleNumber ) ) (otherlv_7= ',' )? ( (lv_d_8_0= ruleNumber ) ) (otherlv_9= ',' )? ( (lv_e_10_0= ruleNumber ) ) (otherlv_11= ',' )? ( (lv_f_12_0= ruleNumber ) ) otherlv_13= ')' ) )
            // InternalSvgTransform.g:215:2: (otherlv_0= 'matrix' otherlv_1= '(' ( (lv_a_2_0= ruleNumber ) ) (otherlv_3= ',' )? ( (lv_b_4_0= ruleNumber ) ) (otherlv_5= ',' )? ( (lv_c_6_0= ruleNumber ) ) (otherlv_7= ',' )? ( (lv_d_8_0= ruleNumber ) ) (otherlv_9= ',' )? ( (lv_e_10_0= ruleNumber ) ) (otherlv_11= ',' )? ( (lv_f_12_0= ruleNumber ) ) otherlv_13= ')' )
            {
            // InternalSvgTransform.g:215:2: (otherlv_0= 'matrix' otherlv_1= '(' ( (lv_a_2_0= ruleNumber ) ) (otherlv_3= ',' )? ( (lv_b_4_0= ruleNumber ) ) (otherlv_5= ',' )? ( (lv_c_6_0= ruleNumber ) ) (otherlv_7= ',' )? ( (lv_d_8_0= ruleNumber ) ) (otherlv_9= ',' )? ( (lv_e_10_0= ruleNumber ) ) (otherlv_11= ',' )? ( (lv_f_12_0= ruleNumber ) ) otherlv_13= ')' )
            // InternalSvgTransform.g:216:3: otherlv_0= 'matrix' otherlv_1= '(' ( (lv_a_2_0= ruleNumber ) ) (otherlv_3= ',' )? ( (lv_b_4_0= ruleNumber ) ) (otherlv_5= ',' )? ( (lv_c_6_0= ruleNumber ) ) (otherlv_7= ',' )? ( (lv_d_8_0= ruleNumber ) ) (otherlv_9= ',' )? ( (lv_e_10_0= ruleNumber ) ) (otherlv_11= ',' )? ( (lv_f_12_0= ruleNumber ) ) otherlv_13= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMatrixAccess().getMatrixKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getMatrixAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSvgTransform.g:224:3: ( (lv_a_2_0= ruleNumber ) )
            // InternalSvgTransform.g:225:4: (lv_a_2_0= ruleNumber )
            {
            // InternalSvgTransform.g:225:4: (lv_a_2_0= ruleNumber )
            // InternalSvgTransform.g:226:5: lv_a_2_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getMatrixAccess().getANumberParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_a_2_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMatrixRule());
            					}
            					set(
            						current,
            						"a",
            						lv_a_2_0,
            						"org.xtext.svg.transform.SvgTransform.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgTransform.g:243:3: (otherlv_3= ',' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSvgTransform.g:244:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,11,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getMatrixAccess().getCommaKeyword_3());
                    			

                    }
                    break;

            }

            // InternalSvgTransform.g:249:3: ( (lv_b_4_0= ruleNumber ) )
            // InternalSvgTransform.g:250:4: (lv_b_4_0= ruleNumber )
            {
            // InternalSvgTransform.g:250:4: (lv_b_4_0= ruleNumber )
            // InternalSvgTransform.g:251:5: lv_b_4_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getMatrixAccess().getBNumberParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_b_4_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMatrixRule());
            					}
            					set(
            						current,
            						"b",
            						lv_b_4_0,
            						"org.xtext.svg.transform.SvgTransform.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgTransform.g:268:3: (otherlv_5= ',' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSvgTransform.g:269:4: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,11,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getMatrixAccess().getCommaKeyword_5());
                    			

                    }
                    break;

            }

            // InternalSvgTransform.g:274:3: ( (lv_c_6_0= ruleNumber ) )
            // InternalSvgTransform.g:275:4: (lv_c_6_0= ruleNumber )
            {
            // InternalSvgTransform.g:275:4: (lv_c_6_0= ruleNumber )
            // InternalSvgTransform.g:276:5: lv_c_6_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getMatrixAccess().getCNumberParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_c_6_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMatrixRule());
            					}
            					set(
            						current,
            						"c",
            						lv_c_6_0,
            						"org.xtext.svg.transform.SvgTransform.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgTransform.g:293:3: (otherlv_7= ',' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSvgTransform.g:294:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,11,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getMatrixAccess().getCommaKeyword_7());
                    			

                    }
                    break;

            }

            // InternalSvgTransform.g:299:3: ( (lv_d_8_0= ruleNumber ) )
            // InternalSvgTransform.g:300:4: (lv_d_8_0= ruleNumber )
            {
            // InternalSvgTransform.g:300:4: (lv_d_8_0= ruleNumber )
            // InternalSvgTransform.g:301:5: lv_d_8_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getMatrixAccess().getDNumberParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_7);
            lv_d_8_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMatrixRule());
            					}
            					set(
            						current,
            						"d",
            						lv_d_8_0,
            						"org.xtext.svg.transform.SvgTransform.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgTransform.g:318:3: (otherlv_9= ',' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSvgTransform.g:319:4: otherlv_9= ','
                    {
                    otherlv_9=(Token)match(input,11,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getMatrixAccess().getCommaKeyword_9());
                    			

                    }
                    break;

            }

            // InternalSvgTransform.g:324:3: ( (lv_e_10_0= ruleNumber ) )
            // InternalSvgTransform.g:325:4: (lv_e_10_0= ruleNumber )
            {
            // InternalSvgTransform.g:325:4: (lv_e_10_0= ruleNumber )
            // InternalSvgTransform.g:326:5: lv_e_10_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getMatrixAccess().getENumberParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_7);
            lv_e_10_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMatrixRule());
            					}
            					set(
            						current,
            						"e",
            						lv_e_10_0,
            						"org.xtext.svg.transform.SvgTransform.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgTransform.g:343:3: (otherlv_11= ',' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==11) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSvgTransform.g:344:4: otherlv_11= ','
                    {
                    otherlv_11=(Token)match(input,11,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getMatrixAccess().getCommaKeyword_11());
                    			

                    }
                    break;

            }

            // InternalSvgTransform.g:349:3: ( (lv_f_12_0= ruleNumber ) )
            // InternalSvgTransform.g:350:4: (lv_f_12_0= ruleNumber )
            {
            // InternalSvgTransform.g:350:4: (lv_f_12_0= ruleNumber )
            // InternalSvgTransform.g:351:5: lv_f_12_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getMatrixAccess().getFNumberParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_8);
            lv_f_12_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMatrixRule());
            					}
            					set(
            						current,
            						"f",
            						lv_f_12_0,
            						"org.xtext.svg.transform.SvgTransform.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getMatrixAccess().getRightParenthesisKeyword_13());
            		

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
    // $ANTLR end "ruleMatrix"


    // $ANTLR start "entryRuleTranslate"
    // InternalSvgTransform.g:376:1: entryRuleTranslate returns [EObject current=null] : iv_ruleTranslate= ruleTranslate EOF ;
    public final EObject entryRuleTranslate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTranslate = null;


        try {
            // InternalSvgTransform.g:376:50: (iv_ruleTranslate= ruleTranslate EOF )
            // InternalSvgTransform.g:377:2: iv_ruleTranslate= ruleTranslate EOF
            {
             newCompositeNode(grammarAccess.getTranslateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTranslate=ruleTranslate();

            state._fsp--;

             current =iv_ruleTranslate; 
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
    // $ANTLR end "entryRuleTranslate"


    // $ANTLR start "ruleTranslate"
    // InternalSvgTransform.g:383:1: ruleTranslate returns [EObject current=null] : (otherlv_0= 'translate' otherlv_1= '(' ( (lv_x_2_0= ruleNumber ) ) ( (otherlv_3= ',' )? ( (lv_y_4_0= ruleNumber ) ) )? otherlv_5= ')' ) ;
    public final EObject ruleTranslate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_x_2_0 = null;

        AntlrDatatypeRuleToken lv_y_4_0 = null;



        	enterRule();

        try {
            // InternalSvgTransform.g:389:2: ( (otherlv_0= 'translate' otherlv_1= '(' ( (lv_x_2_0= ruleNumber ) ) ( (otherlv_3= ',' )? ( (lv_y_4_0= ruleNumber ) ) )? otherlv_5= ')' ) )
            // InternalSvgTransform.g:390:2: (otherlv_0= 'translate' otherlv_1= '(' ( (lv_x_2_0= ruleNumber ) ) ( (otherlv_3= ',' )? ( (lv_y_4_0= ruleNumber ) ) )? otherlv_5= ')' )
            {
            // InternalSvgTransform.g:390:2: (otherlv_0= 'translate' otherlv_1= '(' ( (lv_x_2_0= ruleNumber ) ) ( (otherlv_3= ',' )? ( (lv_y_4_0= ruleNumber ) ) )? otherlv_5= ')' )
            // InternalSvgTransform.g:391:3: otherlv_0= 'translate' otherlv_1= '(' ( (lv_x_2_0= ruleNumber ) ) ( (otherlv_3= ',' )? ( (lv_y_4_0= ruleNumber ) ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTranslateAccess().getTranslateKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getTranslateAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSvgTransform.g:399:3: ( (lv_x_2_0= ruleNumber ) )
            // InternalSvgTransform.g:400:4: (lv_x_2_0= ruleNumber )
            {
            // InternalSvgTransform.g:400:4: (lv_x_2_0= ruleNumber )
            // InternalSvgTransform.g:401:5: lv_x_2_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getTranslateAccess().getXNumberParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_x_2_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTranslateRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_2_0,
            						"org.xtext.svg.transform.SvgTransform.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgTransform.g:418:3: ( (otherlv_3= ',' )? ( (lv_y_4_0= ruleNumber ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT||LA10_0==11||(LA10_0>=22 && LA10_0<=24)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSvgTransform.g:419:4: (otherlv_3= ',' )? ( (lv_y_4_0= ruleNumber ) )
                    {
                    // InternalSvgTransform.g:419:4: (otherlv_3= ',' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==11) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSvgTransform.g:420:5: otherlv_3= ','
                            {
                            otherlv_3=(Token)match(input,11,FOLLOW_6); 

                            					newLeafNode(otherlv_3, grammarAccess.getTranslateAccess().getCommaKeyword_3_0());
                            				

                            }
                            break;

                    }

                    // InternalSvgTransform.g:425:4: ( (lv_y_4_0= ruleNumber ) )
                    // InternalSvgTransform.g:426:5: (lv_y_4_0= ruleNumber )
                    {
                    // InternalSvgTransform.g:426:5: (lv_y_4_0= ruleNumber )
                    // InternalSvgTransform.g:427:6: lv_y_4_0= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getTranslateAccess().getYNumberParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_y_4_0=ruleNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTranslateRule());
                    						}
                    						set(
                    							current,
                    							"y",
                    							lv_y_4_0,
                    							"org.xtext.svg.transform.SvgTransform.Number");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTranslateAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleTranslate"


    // $ANTLR start "entryRuleScale"
    // InternalSvgTransform.g:453:1: entryRuleScale returns [EObject current=null] : iv_ruleScale= ruleScale EOF ;
    public final EObject entryRuleScale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScale = null;


        try {
            // InternalSvgTransform.g:453:46: (iv_ruleScale= ruleScale EOF )
            // InternalSvgTransform.g:454:2: iv_ruleScale= ruleScale EOF
            {
             newCompositeNode(grammarAccess.getScaleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScale=ruleScale();

            state._fsp--;

             current =iv_ruleScale; 
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
    // $ANTLR end "entryRuleScale"


    // $ANTLR start "ruleScale"
    // InternalSvgTransform.g:460:1: ruleScale returns [EObject current=null] : (otherlv_0= 'scale' otherlv_1= '(' ( (lv_x_2_0= ruleNumber ) ) ( (otherlv_3= ',' )? ( (lv_y_4_0= ruleNumber ) ) )? otherlv_5= ')' ) ;
    public final EObject ruleScale() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_x_2_0 = null;

        AntlrDatatypeRuleToken lv_y_4_0 = null;



        	enterRule();

        try {
            // InternalSvgTransform.g:466:2: ( (otherlv_0= 'scale' otherlv_1= '(' ( (lv_x_2_0= ruleNumber ) ) ( (otherlv_3= ',' )? ( (lv_y_4_0= ruleNumber ) ) )? otherlv_5= ')' ) )
            // InternalSvgTransform.g:467:2: (otherlv_0= 'scale' otherlv_1= '(' ( (lv_x_2_0= ruleNumber ) ) ( (otherlv_3= ',' )? ( (lv_y_4_0= ruleNumber ) ) )? otherlv_5= ')' )
            {
            // InternalSvgTransform.g:467:2: (otherlv_0= 'scale' otherlv_1= '(' ( (lv_x_2_0= ruleNumber ) ) ( (otherlv_3= ',' )? ( (lv_y_4_0= ruleNumber ) ) )? otherlv_5= ')' )
            // InternalSvgTransform.g:468:3: otherlv_0= 'scale' otherlv_1= '(' ( (lv_x_2_0= ruleNumber ) ) ( (otherlv_3= ',' )? ( (lv_y_4_0= ruleNumber ) ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getScaleAccess().getScaleKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getScaleAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSvgTransform.g:476:3: ( (lv_x_2_0= ruleNumber ) )
            // InternalSvgTransform.g:477:4: (lv_x_2_0= ruleNumber )
            {
            // InternalSvgTransform.g:477:4: (lv_x_2_0= ruleNumber )
            // InternalSvgTransform.g:478:5: lv_x_2_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getScaleAccess().getXNumberParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_x_2_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScaleRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_2_0,
            						"org.xtext.svg.transform.SvgTransform.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgTransform.g:495:3: ( (otherlv_3= ',' )? ( (lv_y_4_0= ruleNumber ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT||LA12_0==11||(LA12_0>=22 && LA12_0<=24)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSvgTransform.g:496:4: (otherlv_3= ',' )? ( (lv_y_4_0= ruleNumber ) )
                    {
                    // InternalSvgTransform.g:496:4: (otherlv_3= ',' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==11) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalSvgTransform.g:497:5: otherlv_3= ','
                            {
                            otherlv_3=(Token)match(input,11,FOLLOW_6); 

                            					newLeafNode(otherlv_3, grammarAccess.getScaleAccess().getCommaKeyword_3_0());
                            				

                            }
                            break;

                    }

                    // InternalSvgTransform.g:502:4: ( (lv_y_4_0= ruleNumber ) )
                    // InternalSvgTransform.g:503:5: (lv_y_4_0= ruleNumber )
                    {
                    // InternalSvgTransform.g:503:5: (lv_y_4_0= ruleNumber )
                    // InternalSvgTransform.g:504:6: lv_y_4_0= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getScaleAccess().getYNumberParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_y_4_0=ruleNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScaleRule());
                    						}
                    						set(
                    							current,
                    							"y",
                    							lv_y_4_0,
                    							"org.xtext.svg.transform.SvgTransform.Number");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getScaleAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleScale"


    // $ANTLR start "entryRuleRotate"
    // InternalSvgTransform.g:530:1: entryRuleRotate returns [EObject current=null] : iv_ruleRotate= ruleRotate EOF ;
    public final EObject entryRuleRotate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotate = null;


        try {
            // InternalSvgTransform.g:530:47: (iv_ruleRotate= ruleRotate EOF )
            // InternalSvgTransform.g:531:2: iv_ruleRotate= ruleRotate EOF
            {
             newCompositeNode(grammarAccess.getRotateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotate=ruleRotate();

            state._fsp--;

             current =iv_ruleRotate; 
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
    // $ANTLR end "entryRuleRotate"


    // $ANTLR start "ruleRotate"
    // InternalSvgTransform.g:537:1: ruleRotate returns [EObject current=null] : (otherlv_0= 'rotate' otherlv_1= '(' ( (lv_a_2_0= ruleNumber ) ) ( (otherlv_3= ',' )? ( (lv_x_4_0= ruleNumber ) ) (otherlv_5= ',' )? ( (lv_y_6_0= ruleNumber ) ) )? otherlv_7= ')' ) ;
    public final EObject ruleRotate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_a_2_0 = null;

        AntlrDatatypeRuleToken lv_x_4_0 = null;

        AntlrDatatypeRuleToken lv_y_6_0 = null;



        	enterRule();

        try {
            // InternalSvgTransform.g:543:2: ( (otherlv_0= 'rotate' otherlv_1= '(' ( (lv_a_2_0= ruleNumber ) ) ( (otherlv_3= ',' )? ( (lv_x_4_0= ruleNumber ) ) (otherlv_5= ',' )? ( (lv_y_6_0= ruleNumber ) ) )? otherlv_7= ')' ) )
            // InternalSvgTransform.g:544:2: (otherlv_0= 'rotate' otherlv_1= '(' ( (lv_a_2_0= ruleNumber ) ) ( (otherlv_3= ',' )? ( (lv_x_4_0= ruleNumber ) ) (otherlv_5= ',' )? ( (lv_y_6_0= ruleNumber ) ) )? otherlv_7= ')' )
            {
            // InternalSvgTransform.g:544:2: (otherlv_0= 'rotate' otherlv_1= '(' ( (lv_a_2_0= ruleNumber ) ) ( (otherlv_3= ',' )? ( (lv_x_4_0= ruleNumber ) ) (otherlv_5= ',' )? ( (lv_y_6_0= ruleNumber ) ) )? otherlv_7= ')' )
            // InternalSvgTransform.g:545:3: otherlv_0= 'rotate' otherlv_1= '(' ( (lv_a_2_0= ruleNumber ) ) ( (otherlv_3= ',' )? ( (lv_x_4_0= ruleNumber ) ) (otherlv_5= ',' )? ( (lv_y_6_0= ruleNumber ) ) )? otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRotateAccess().getRotateKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSvgTransform.g:553:3: ( (lv_a_2_0= ruleNumber ) )
            // InternalSvgTransform.g:554:4: (lv_a_2_0= ruleNumber )
            {
            // InternalSvgTransform.g:554:4: (lv_a_2_0= ruleNumber )
            // InternalSvgTransform.g:555:5: lv_a_2_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getRotateAccess().getANumberParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_a_2_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateRule());
            					}
            					set(
            						current,
            						"a",
            						lv_a_2_0,
            						"org.xtext.svg.transform.SvgTransform.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSvgTransform.g:572:3: ( (otherlv_3= ',' )? ( (lv_x_4_0= ruleNumber ) ) (otherlv_5= ',' )? ( (lv_y_6_0= ruleNumber ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT||LA15_0==11||(LA15_0>=22 && LA15_0<=24)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSvgTransform.g:573:4: (otherlv_3= ',' )? ( (lv_x_4_0= ruleNumber ) ) (otherlv_5= ',' )? ( (lv_y_6_0= ruleNumber ) )
                    {
                    // InternalSvgTransform.g:573:4: (otherlv_3= ',' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==11) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalSvgTransform.g:574:5: otherlv_3= ','
                            {
                            otherlv_3=(Token)match(input,11,FOLLOW_6); 

                            					newLeafNode(otherlv_3, grammarAccess.getRotateAccess().getCommaKeyword_3_0());
                            				

                            }
                            break;

                    }

                    // InternalSvgTransform.g:579:4: ( (lv_x_4_0= ruleNumber ) )
                    // InternalSvgTransform.g:580:5: (lv_x_4_0= ruleNumber )
                    {
                    // InternalSvgTransform.g:580:5: (lv_x_4_0= ruleNumber )
                    // InternalSvgTransform.g:581:6: lv_x_4_0= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getRotateAccess().getXNumberParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_x_4_0=ruleNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRotateRule());
                    						}
                    						set(
                    							current,
                    							"x",
                    							lv_x_4_0,
                    							"org.xtext.svg.transform.SvgTransform.Number");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSvgTransform.g:598:4: (otherlv_5= ',' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==11) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalSvgTransform.g:599:5: otherlv_5= ','
                            {
                            otherlv_5=(Token)match(input,11,FOLLOW_6); 

                            					newLeafNode(otherlv_5, grammarAccess.getRotateAccess().getCommaKeyword_3_2());
                            				

                            }
                            break;

                    }

                    // InternalSvgTransform.g:604:4: ( (lv_y_6_0= ruleNumber ) )
                    // InternalSvgTransform.g:605:5: (lv_y_6_0= ruleNumber )
                    {
                    // InternalSvgTransform.g:605:5: (lv_y_6_0= ruleNumber )
                    // InternalSvgTransform.g:606:6: lv_y_6_0= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getRotateAccess().getYNumberParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_y_6_0=ruleNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRotateRule());
                    						}
                    						set(
                    							current,
                    							"y",
                    							lv_y_6_0,
                    							"org.xtext.svg.transform.SvgTransform.Number");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRotateAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleRotate"


    // $ANTLR start "entryRuleSkewX"
    // InternalSvgTransform.g:632:1: entryRuleSkewX returns [EObject current=null] : iv_ruleSkewX= ruleSkewX EOF ;
    public final EObject entryRuleSkewX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkewX = null;


        try {
            // InternalSvgTransform.g:632:46: (iv_ruleSkewX= ruleSkewX EOF )
            // InternalSvgTransform.g:633:2: iv_ruleSkewX= ruleSkewX EOF
            {
             newCompositeNode(grammarAccess.getSkewXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkewX=ruleSkewX();

            state._fsp--;

             current =iv_ruleSkewX; 
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
    // $ANTLR end "entryRuleSkewX"


    // $ANTLR start "ruleSkewX"
    // InternalSvgTransform.g:639:1: ruleSkewX returns [EObject current=null] : (otherlv_0= 'skewX' otherlv_1= '(' ( (lv_a_2_0= ruleNumber ) ) otherlv_3= ')' ) ;
    public final EObject ruleSkewX() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_a_2_0 = null;



        	enterRule();

        try {
            // InternalSvgTransform.g:645:2: ( (otherlv_0= 'skewX' otherlv_1= '(' ( (lv_a_2_0= ruleNumber ) ) otherlv_3= ')' ) )
            // InternalSvgTransform.g:646:2: (otherlv_0= 'skewX' otherlv_1= '(' ( (lv_a_2_0= ruleNumber ) ) otherlv_3= ')' )
            {
            // InternalSvgTransform.g:646:2: (otherlv_0= 'skewX' otherlv_1= '(' ( (lv_a_2_0= ruleNumber ) ) otherlv_3= ')' )
            // InternalSvgTransform.g:647:3: otherlv_0= 'skewX' otherlv_1= '(' ( (lv_a_2_0= ruleNumber ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSkewXAccess().getSkewXKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSkewXAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSvgTransform.g:655:3: ( (lv_a_2_0= ruleNumber ) )
            // InternalSvgTransform.g:656:4: (lv_a_2_0= ruleNumber )
            {
            // InternalSvgTransform.g:656:4: (lv_a_2_0= ruleNumber )
            // InternalSvgTransform.g:657:5: lv_a_2_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getSkewXAccess().getANumberParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_a_2_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSkewXRule());
            					}
            					set(
            						current,
            						"a",
            						lv_a_2_0,
            						"org.xtext.svg.transform.SvgTransform.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSkewXAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleSkewX"


    // $ANTLR start "entryRuleSkewY"
    // InternalSvgTransform.g:682:1: entryRuleSkewY returns [EObject current=null] : iv_ruleSkewY= ruleSkewY EOF ;
    public final EObject entryRuleSkewY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkewY = null;


        try {
            // InternalSvgTransform.g:682:46: (iv_ruleSkewY= ruleSkewY EOF )
            // InternalSvgTransform.g:683:2: iv_ruleSkewY= ruleSkewY EOF
            {
             newCompositeNode(grammarAccess.getSkewYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkewY=ruleSkewY();

            state._fsp--;

             current =iv_ruleSkewY; 
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
    // $ANTLR end "entryRuleSkewY"


    // $ANTLR start "ruleSkewY"
    // InternalSvgTransform.g:689:1: ruleSkewY returns [EObject current=null] : (otherlv_0= 'skewY' otherlv_1= '(' ( (lv_a_2_0= ruleNumber ) ) otherlv_3= ')' ) ;
    public final EObject ruleSkewY() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_a_2_0 = null;



        	enterRule();

        try {
            // InternalSvgTransform.g:695:2: ( (otherlv_0= 'skewY' otherlv_1= '(' ( (lv_a_2_0= ruleNumber ) ) otherlv_3= ')' ) )
            // InternalSvgTransform.g:696:2: (otherlv_0= 'skewY' otherlv_1= '(' ( (lv_a_2_0= ruleNumber ) ) otherlv_3= ')' )
            {
            // InternalSvgTransform.g:696:2: (otherlv_0= 'skewY' otherlv_1= '(' ( (lv_a_2_0= ruleNumber ) ) otherlv_3= ')' )
            // InternalSvgTransform.g:697:3: otherlv_0= 'skewY' otherlv_1= '(' ( (lv_a_2_0= ruleNumber ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSkewYAccess().getSkewYKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSkewYAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSvgTransform.g:705:3: ( (lv_a_2_0= ruleNumber ) )
            // InternalSvgTransform.g:706:4: (lv_a_2_0= ruleNumber )
            {
            // InternalSvgTransform.g:706:4: (lv_a_2_0= ruleNumber )
            // InternalSvgTransform.g:707:5: lv_a_2_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getSkewYAccess().getANumberParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_a_2_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSkewYRule());
            					}
            					set(
            						current,
            						"a",
            						lv_a_2_0,
            						"org.xtext.svg.transform.SvgTransform.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSkewYAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleSkewY"


    // $ANTLR start "entryRuleNumber"
    // InternalSvgTransform.g:732:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalSvgTransform.g:732:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalSvgTransform.g:733:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalSvgTransform.g:739:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? ) | ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? ) ) ;
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
            // InternalSvgTransform.g:745:2: ( ( (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? ) | ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? ) ) )
            // InternalSvgTransform.g:746:2: ( (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? ) | ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? ) )
            {
            // InternalSvgTransform.g:746:2: ( (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? ) | ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? ) )
            int alt22=2;
            switch ( input.LA(1) ) {
            case 22:
                {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==RULE_INT) ) {
                    alt22=1;
                }
                else if ( (LA22_1==24) ) {
                    alt22=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==RULE_INT) ) {
                    alt22=1;
                }
                else if ( (LA22_2==24) ) {
                    alt22=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt22=1;
                }
                break;
            case 24:
                {
                alt22=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalSvgTransform.g:747:3: (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? )
                    {
                    // InternalSvgTransform.g:747:3: (this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )? )
                    // InternalSvgTransform.g:748:4: this_Integer_0= ruleInteger ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )?
                    {

                    				newCompositeNode(grammarAccess.getNumberAccess().getIntegerParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_10);
                    this_Integer_0=ruleInteger();

                    state._fsp--;


                    				current.merge(this_Integer_0);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalSvgTransform.g:758:4: ( (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=20 && LA17_0<=21)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalSvgTransform.g:759:5: (kw= 'E' | kw= 'e' ) this_Integer_3= ruleInteger
                            {
                            // InternalSvgTransform.g:759:5: (kw= 'E' | kw= 'e' )
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==20) ) {
                                alt16=1;
                            }
                            else if ( (LA16_0==21) ) {
                                alt16=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 16, 0, input);

                                throw nvae;
                            }
                            switch (alt16) {
                                case 1 :
                                    // InternalSvgTransform.g:760:6: kw= 'E'
                                    {
                                    kw=(Token)match(input,20,FOLLOW_11); 

                                    						current.merge(kw);
                                    						newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_0_1_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalSvgTransform.g:766:6: kw= 'e'
                                    {
                                    kw=(Token)match(input,21,FOLLOW_11); 

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
                    // InternalSvgTransform.g:785:3: ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? )
                    {
                    // InternalSvgTransform.g:785:3: ( (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )? )
                    // InternalSvgTransform.g:786:4: (kw= '+' | kw= '-' )? (this_INT_6= RULE_INT )? kw= '.' this_INT_8= RULE_INT ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )?
                    {
                    // InternalSvgTransform.g:786:4: (kw= '+' | kw= '-' )?
                    int alt18=3;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==22) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==23) ) {
                        alt18=2;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalSvgTransform.g:787:5: kw= '+'
                            {
                            kw=(Token)match(input,22,FOLLOW_12); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getNumberAccess().getPlusSignKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSvgTransform.g:793:5: kw= '-'
                            {
                            kw=(Token)match(input,23,FOLLOW_12); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getNumberAccess().getHyphenMinusKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalSvgTransform.g:799:4: (this_INT_6= RULE_INT )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_INT) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalSvgTransform.g:800:5: this_INT_6= RULE_INT
                            {
                            this_INT_6=(Token)match(input,RULE_INT,FOLLOW_13); 

                            					current.merge(this_INT_6);
                            				

                            					newLeafNode(this_INT_6, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1());
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,24,FOLLOW_14); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_2());
                    			
                    this_INT_8=(Token)match(input,RULE_INT,FOLLOW_10); 

                    				current.merge(this_INT_8);
                    			

                    				newLeafNode(this_INT_8, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_3());
                    			
                    // InternalSvgTransform.g:820:4: ( (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=20 && LA21_0<=21)) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalSvgTransform.g:821:5: (kw= 'E' | kw= 'e' ) this_Integer_11= ruleInteger
                            {
                            // InternalSvgTransform.g:821:5: (kw= 'E' | kw= 'e' )
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( (LA20_0==20) ) {
                                alt20=1;
                            }
                            else if ( (LA20_0==21) ) {
                                alt20=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 20, 0, input);

                                throw nvae;
                            }
                            switch (alt20) {
                                case 1 :
                                    // InternalSvgTransform.g:822:6: kw= 'E'
                                    {
                                    kw=(Token)match(input,20,FOLLOW_11); 

                                    						current.merge(kw);
                                    						newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_1_4_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalSvgTransform.g:828:6: kw= 'e'
                                    {
                                    kw=(Token)match(input,21,FOLLOW_11); 

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
    // InternalSvgTransform.g:850:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalSvgTransform.g:850:47: (iv_ruleInteger= ruleInteger EOF )
            // InternalSvgTransform.g:851:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalSvgTransform.g:857:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalSvgTransform.g:863:2: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) )
            // InternalSvgTransform.g:864:2: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            {
            // InternalSvgTransform.g:864:2: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            // InternalSvgTransform.g:865:3: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
            {
            // InternalSvgTransform.g:865:3: (kw= '+' | kw= '-' )?
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==22) ) {
                alt23=1;
            }
            else if ( (LA23_0==23) ) {
                alt23=2;
            }
            switch (alt23) {
                case 1 :
                    // InternalSvgTransform.g:866:4: kw= '+'
                    {
                    kw=(Token)match(input,22,FOLLOW_14); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIntegerAccess().getPlusSignKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSvgTransform.g:872:4: kw= '-'
                    {
                    kw=(Token)match(input,23,FOLLOW_14); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000F9802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000F9800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001C00010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001C00810L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001C04810L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});

}