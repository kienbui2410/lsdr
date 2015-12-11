package org.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.RdslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRdslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'{'", "'extends:'", "','", "'}'", "'installer:'", "'children:'", "'exports:'", "'='", "'imports:'", "'external'", "'(optional)'", "'facet'", "'#'", "' '"
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
    public static final int T__26=26;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRdslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRdslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRdslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g"; }



     	private RdslGrammarAccess grammarAccess;
     	
        public InternalRdslParser(TokenStream input, RdslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Graph";	
       	}
       	
       	@Override
       	protected RdslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleGraph"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:67:1: entryRuleGraph returns [EObject current=null] : iv_ruleGraph= ruleGraph EOF ;
    public final EObject entryRuleGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraph = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:68:2: (iv_ruleGraph= ruleGraph EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:69:2: iv_ruleGraph= ruleGraph EOF
            {
             newCompositeNode(grammarAccess.getGraphRule()); 
            pushFollow(FOLLOW_ruleGraph_in_entryRuleGraph75);
            iv_ruleGraph=ruleGraph();

            state._fsp--;

             current =iv_ruleGraph; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGraph85); 

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
    // $ANTLR end "entryRuleGraph"


    // $ANTLR start "ruleGraph"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:76:1: ruleGraph returns [EObject current=null] : ( ( (lv_comments_0_0= ruleComment ) )* ( (lv_imports_1_0= ruleImport ) )* ( (lv_components_2_0= ruleComponent ) )+ ) ;
    public final EObject ruleGraph() throws RecognitionException {
        EObject current = null;

        EObject lv_comments_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_components_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:79:28: ( ( ( (lv_comments_0_0= ruleComment ) )* ( (lv_imports_1_0= ruleImport ) )* ( (lv_components_2_0= ruleComponent ) )+ ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:80:1: ( ( (lv_comments_0_0= ruleComment ) )* ( (lv_imports_1_0= ruleImport ) )* ( (lv_components_2_0= ruleComponent ) )+ )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:80:1: ( ( (lv_comments_0_0= ruleComment ) )* ( (lv_imports_1_0= ruleImport ) )* ( (lv_components_2_0= ruleComponent ) )+ )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:80:2: ( (lv_comments_0_0= ruleComment ) )* ( (lv_imports_1_0= ruleImport ) )* ( (lv_components_2_0= ruleComponent ) )+
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:80:2: ( (lv_comments_0_0= ruleComment ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==25) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==RULE_ID) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:81:1: (lv_comments_0_0= ruleComment )
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:81:1: (lv_comments_0_0= ruleComment )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:82:3: lv_comments_0_0= ruleComment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGraphAccess().getCommentsCommentParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComment_in_ruleGraph131);
            	    lv_comments_0_0=ruleComment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"comments",
            	            		lv_comments_0_0, 
            	            		"Comment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:98:3: ( (lv_imports_1_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:99:1: (lv_imports_1_0= ruleImport )
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:99:1: (lv_imports_1_0= ruleImport )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:100:3: lv_imports_1_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGraphAccess().getImportsImportParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleGraph153);
            	    lv_imports_1_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_1_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:116:3: ( (lv_components_2_0= ruleComponent ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:117:1: (lv_components_2_0= ruleComponent )
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:117:1: (lv_components_2_0= ruleComponent )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:118:3: lv_components_2_0= ruleComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGraphAccess().getComponentsComponentParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComponent_in_ruleGraph175);
            	    lv_components_2_0=ruleComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_2_0, 
            	            		"Component");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // $ANTLR end "ruleGraph"


    // $ANTLR start "entryRuleImport"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:142:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:143:2: (iv_ruleImport= ruleImport EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:144:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport212);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport222); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:151:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:154:28: ( (otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:155:1: (otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:155:1: (otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:155:3: otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport259); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:159:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:160:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:160:1: (lv_name_1_0= RULE_ID )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:161:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImport276); 

            			newLeafNode(lv_name_1_0, grammarAccess.getImportAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleImport293); 

                	newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleComponent"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:189:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:190:2: (iv_ruleComponent= ruleComponent EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:191:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent329);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent339); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:198:1: ruleComponent returns [EObject current=null] : ( ( (lv_comments_0_0= ruleComment ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_comments_3_0= ruleComment ) )* ( (lv_installers_4_0= ruleInstaller ) ) ( (lv_comments_5_0= ruleComment ) )* ( (lv_properties_6_0= ruleProperty ) )* ( (lv_comments_7_0= ruleComment ) )* (otherlv_8= 'extends:' ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ',' )* ( (otherlv_11= RULE_ID ) ) )? ( (lv_comments_12_0= ruleComment ) )* otherlv_13= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_comments_0_0 = null;

        EObject lv_comments_3_0 = null;

        EObject lv_installers_4_0 = null;

        EObject lv_comments_5_0 = null;

        EObject lv_properties_6_0 = null;

        EObject lv_comments_7_0 = null;

        EObject lv_comments_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:201:28: ( ( ( (lv_comments_0_0= ruleComment ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_comments_3_0= ruleComment ) )* ( (lv_installers_4_0= ruleInstaller ) ) ( (lv_comments_5_0= ruleComment ) )* ( (lv_properties_6_0= ruleProperty ) )* ( (lv_comments_7_0= ruleComment ) )* (otherlv_8= 'extends:' ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ',' )* ( (otherlv_11= RULE_ID ) ) )? ( (lv_comments_12_0= ruleComment ) )* otherlv_13= '}' ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:202:1: ( ( (lv_comments_0_0= ruleComment ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_comments_3_0= ruleComment ) )* ( (lv_installers_4_0= ruleInstaller ) ) ( (lv_comments_5_0= ruleComment ) )* ( (lv_properties_6_0= ruleProperty ) )* ( (lv_comments_7_0= ruleComment ) )* (otherlv_8= 'extends:' ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ',' )* ( (otherlv_11= RULE_ID ) ) )? ( (lv_comments_12_0= ruleComment ) )* otherlv_13= '}' )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:202:1: ( ( (lv_comments_0_0= ruleComment ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_comments_3_0= ruleComment ) )* ( (lv_installers_4_0= ruleInstaller ) ) ( (lv_comments_5_0= ruleComment ) )* ( (lv_properties_6_0= ruleProperty ) )* ( (lv_comments_7_0= ruleComment ) )* (otherlv_8= 'extends:' ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ',' )* ( (otherlv_11= RULE_ID ) ) )? ( (lv_comments_12_0= ruleComment ) )* otherlv_13= '}' )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:202:2: ( (lv_comments_0_0= ruleComment ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_comments_3_0= ruleComment ) )* ( (lv_installers_4_0= ruleInstaller ) ) ( (lv_comments_5_0= ruleComment ) )* ( (lv_properties_6_0= ruleProperty ) )* ( (lv_comments_7_0= ruleComment ) )* (otherlv_8= 'extends:' ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ',' )* ( (otherlv_11= RULE_ID ) ) )? ( (lv_comments_12_0= ruleComment ) )* otherlv_13= '}'
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:202:2: ( (lv_comments_0_0= ruleComment ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:203:1: (lv_comments_0_0= ruleComment )
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:203:1: (lv_comments_0_0= ruleComment )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:204:3: lv_comments_0_0= ruleComment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getCommentsCommentParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComment_in_ruleComponent385);
            	    lv_comments_0_0=ruleComment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"comments",
            	            		lv_comments_0_0, 
            	            		"Comment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:220:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:221:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:221:1: (lv_name_1_0= RULE_ID )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:222:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponent403); 

            			newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleComponent420); 

                	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:242:1: ( (lv_comments_3_0= ruleComment ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:243:1: (lv_comments_3_0= ruleComment )
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:243:1: (lv_comments_3_0= ruleComment )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:244:3: lv_comments_3_0= ruleComment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getCommentsCommentParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComment_in_ruleComponent441);
            	    lv_comments_3_0=ruleComment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"comments",
            	            		lv_comments_3_0, 
            	            		"Comment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:260:3: ( (lv_installers_4_0= ruleInstaller ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:261:1: (lv_installers_4_0= ruleInstaller )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:261:1: (lv_installers_4_0= ruleInstaller )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:262:3: lv_installers_4_0= ruleInstaller
            {
             
            	        newCompositeNode(grammarAccess.getComponentAccess().getInstallersInstallerParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleInstaller_in_ruleComponent463);
            lv_installers_4_0=ruleInstaller();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	        }
                   		set(
                   			current, 
                   			"installers",
                    		lv_installers_4_0, 
                    		"Installer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:278:2: ( (lv_comments_5_0= ruleComment ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==RULE_ID) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:279:1: (lv_comments_5_0= ruleComment )
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:279:1: (lv_comments_5_0= ruleComment )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:280:3: lv_comments_5_0= ruleComment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getCommentsCommentParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComment_in_ruleComponent484);
            	    lv_comments_5_0=ruleComment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"comments",
            	            		lv_comments_5_0, 
            	            		"Comment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:296:3: ( (lv_properties_6_0= ruleProperty ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=18 && LA7_0<=19)||LA7_0==21||LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:297:1: (lv_properties_6_0= ruleProperty )
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:297:1: (lv_properties_6_0= ruleProperty )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:298:3: lv_properties_6_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getPropertiesPropertyParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleComponent506);
            	    lv_properties_6_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_6_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:314:3: ( (lv_comments_7_0= ruleComment ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==RULE_ID) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:315:1: (lv_comments_7_0= ruleComment )
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:315:1: (lv_comments_7_0= ruleComment )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:316:3: lv_comments_7_0= ruleComment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getCommentsCommentParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComment_in_ruleComponent528);
            	    lv_comments_7_0=ruleComment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"comments",
            	            		lv_comments_7_0, 
            	            		"Comment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:332:3: (otherlv_8= 'extends:' ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ',' )* ( (otherlv_11= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:332:5: otherlv_8= 'extends:' ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ',' )* ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleComponent542); 

                        	newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getExtendsKeyword_8_0());
                        
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:336:1: ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ',' )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID) ) {
                            int LA9_1 = input.LA(2);

                            if ( (LA9_1==15) ) {
                                alt9=1;
                            }


                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:336:2: ( (otherlv_9= RULE_ID ) ) otherlv_10= ','
                    	    {
                    	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:336:2: ( (otherlv_9= RULE_ID ) )
                    	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:337:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:337:1: (otherlv_9= RULE_ID )
                    	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:338:3: otherlv_9= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getComponentRule());
                    	    	        }
                    	            
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponent563); 

                    	    		newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getSupComponentsComponentCrossReference_8_1_0_0()); 
                    	    	

                    	    }


                    	    }

                    	    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleComponent575); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getComponentAccess().getCommaKeyword_8_1_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:353:3: ( (otherlv_11= RULE_ID ) )
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:354:1: (otherlv_11= RULE_ID )
                    {
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:354:1: (otherlv_11= RULE_ID )
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:355:3: otherlv_11= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getComponentRule());
                    	        }
                            
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponent597); 

                    		newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getSupComponentComponentCrossReference_8_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:366:4: ( (lv_comments_12_0= ruleComment ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:367:1: (lv_comments_12_0= ruleComment )
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:367:1: (lv_comments_12_0= ruleComment )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:368:3: lv_comments_12_0= ruleComment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getCommentsCommentParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComment_in_ruleComponent620);
            	    lv_comments_12_0=ruleComment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"comments",
            	            		lv_comments_12_0, 
            	            		"Comment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleComponent633); 

                	newLeafNode(otherlv_13, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleInstaller"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:396:1: entryRuleInstaller returns [EObject current=null] : iv_ruleInstaller= ruleInstaller EOF ;
    public final EObject entryRuleInstaller() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstaller = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:397:2: (iv_ruleInstaller= ruleInstaller EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:398:2: iv_ruleInstaller= ruleInstaller EOF
            {
             newCompositeNode(grammarAccess.getInstallerRule()); 
            pushFollow(FOLLOW_ruleInstaller_in_entryRuleInstaller669);
            iv_ruleInstaller=ruleInstaller();

            state._fsp--;

             current =iv_ruleInstaller; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstaller679); 

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
    // $ANTLR end "entryRuleInstaller"


    // $ANTLR start "ruleInstaller"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:405:1: ruleInstaller returns [EObject current=null] : (otherlv_0= 'installer:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleInstaller() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:408:28: ( (otherlv_0= 'installer:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:409:1: (otherlv_0= 'installer:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:409:1: (otherlv_0= 'installer:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:409:3: otherlv_0= 'installer:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleInstaller716); 

                	newLeafNode(otherlv_0, grammarAccess.getInstallerAccess().getInstallerKeyword_0());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:413:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:414:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:414:1: (lv_name_1_0= RULE_ID )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:415:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstaller733); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInstallerAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInstallerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInstaller750); 

                	newLeafNode(otherlv_2, grammarAccess.getInstallerAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleInstaller"


    // $ANTLR start "entryRuleProperty"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:443:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:444:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:445:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty786);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty796); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:452:1: ruleProperty returns [EObject current=null] : (this_Children_0= ruleChildren | this_Export_1= ruleExport | this_Imports_2= ruleImports | this_Facet_3= ruleFacet ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Children_0 = null;

        EObject this_Export_1 = null;

        EObject this_Imports_2 = null;

        EObject this_Facet_3 = null;


         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:455:28: ( (this_Children_0= ruleChildren | this_Export_1= ruleExport | this_Imports_2= ruleImports | this_Facet_3= ruleFacet ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:456:1: (this_Children_0= ruleChildren | this_Export_1= ruleExport | this_Imports_2= ruleImports | this_Facet_3= ruleFacet )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:456:1: (this_Children_0= ruleChildren | this_Export_1= ruleExport | this_Imports_2= ruleImports | this_Facet_3= ruleFacet )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt12=1;
                }
                break;
            case 19:
                {
                alt12=2;
                }
                break;
            case 21:
                {
                alt12=3;
                }
                break;
            case 24:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:457:5: this_Children_0= ruleChildren
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getChildrenParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChildren_in_ruleProperty843);
                    this_Children_0=ruleChildren();

                    state._fsp--;

                     
                            current = this_Children_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:467:5: this_Export_1= ruleExport
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getExportParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExport_in_ruleProperty870);
                    this_Export_1=ruleExport();

                    state._fsp--;

                     
                            current = this_Export_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:477:5: this_Imports_2= ruleImports
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getImportsParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleImports_in_ruleProperty897);
                    this_Imports_2=ruleImports();

                    state._fsp--;

                     
                            current = this_Imports_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:487:5: this_Facet_3= ruleFacet
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getFacetParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleFacet_in_ruleProperty924);
                    this_Facet_3=ruleFacet();

                    state._fsp--;

                     
                            current = this_Facet_3; 
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleChildren"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:503:1: entryRuleChildren returns [EObject current=null] : iv_ruleChildren= ruleChildren EOF ;
    public final EObject entryRuleChildren() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildren = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:504:2: (iv_ruleChildren= ruleChildren EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:505:2: iv_ruleChildren= ruleChildren EOF
            {
             newCompositeNode(grammarAccess.getChildrenRule()); 
            pushFollow(FOLLOW_ruleChildren_in_entryRuleChildren959);
            iv_ruleChildren=ruleChildren();

            state._fsp--;

             current =iv_ruleChildren; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChildren969); 

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
    // $ANTLR end "entryRuleChildren"


    // $ANTLR start "ruleChildren"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:512:1: ruleChildren returns [EObject current=null] : (otherlv_0= 'children:' ( ( (lv_children_1_0= ruleChild ) ) otherlv_2= ',' )* ( (lv_child_3_0= ruleChild ) ) otherlv_4= ';' ) ;
    public final EObject ruleChildren() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_children_1_0 = null;

        EObject lv_child_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:515:28: ( (otherlv_0= 'children:' ( ( (lv_children_1_0= ruleChild ) ) otherlv_2= ',' )* ( (lv_child_3_0= ruleChild ) ) otherlv_4= ';' ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:516:1: (otherlv_0= 'children:' ( ( (lv_children_1_0= ruleChild ) ) otherlv_2= ',' )* ( (lv_child_3_0= ruleChild ) ) otherlv_4= ';' )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:516:1: (otherlv_0= 'children:' ( ( (lv_children_1_0= ruleChild ) ) otherlv_2= ',' )* ( (lv_child_3_0= ruleChild ) ) otherlv_4= ';' )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:516:3: otherlv_0= 'children:' ( ( (lv_children_1_0= ruleChild ) ) otherlv_2= ',' )* ( (lv_child_3_0= ruleChild ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleChildren1006); 

                	newLeafNode(otherlv_0, grammarAccess.getChildrenAccess().getChildrenKeyword_0());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:520:1: ( ( (lv_children_1_0= ruleChild ) ) otherlv_2= ',' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==15) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:520:2: ( (lv_children_1_0= ruleChild ) ) otherlv_2= ','
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:520:2: ( (lv_children_1_0= ruleChild ) )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:521:1: (lv_children_1_0= ruleChild )
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:521:1: (lv_children_1_0= ruleChild )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:522:3: lv_children_1_0= ruleChild
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChildrenAccess().getChildrenChildParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChild_in_ruleChildren1028);
            	    lv_children_1_0=ruleChild();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getChildrenRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"children",
            	            		lv_children_1_0, 
            	            		"Child");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleChildren1040); 

            	        	newLeafNode(otherlv_2, grammarAccess.getChildrenAccess().getCommaKeyword_1_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:542:3: ( (lv_child_3_0= ruleChild ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:543:1: (lv_child_3_0= ruleChild )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:543:1: (lv_child_3_0= ruleChild )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:544:3: lv_child_3_0= ruleChild
            {
             
            	        newCompositeNode(grammarAccess.getChildrenAccess().getChildChildParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleChild_in_ruleChildren1063);
            lv_child_3_0=ruleChild();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChildrenRule());
            	        }
                   		set(
                   			current, 
                   			"child",
                    		lv_child_3_0, 
                    		"Child");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleChildren1075); 

                	newLeafNode(otherlv_4, grammarAccess.getChildrenAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleChildren"


    // $ANTLR start "entryRuleChild"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:572:1: entryRuleChild returns [EObject current=null] : iv_ruleChild= ruleChild EOF ;
    public final EObject entryRuleChild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:573:2: (iv_ruleChild= ruleChild EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:574:2: iv_ruleChild= ruleChild EOF
            {
             newCompositeNode(grammarAccess.getChildRule()); 
            pushFollow(FOLLOW_ruleChild_in_entryRuleChild1111);
            iv_ruleChild=ruleChild();

            state._fsp--;

             current =iv_ruleChild; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChild1121); 

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
    // $ANTLR end "entryRuleChild"


    // $ANTLR start "ruleChild"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:581:1: ruleChild returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleChild() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:584:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:585:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:585:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:586:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:586:1: (lv_name_0_0= RULE_ID )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:587:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChild1162); 

            			newLeafNode(lv_name_0_0, grammarAccess.getChildAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChildRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleChild"


    // $ANTLR start "entryRuleExport"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:611:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:612:2: (iv_ruleExport= ruleExport EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:613:2: iv_ruleExport= ruleExport EOF
            {
             newCompositeNode(grammarAccess.getExportRule()); 
            pushFollow(FOLLOW_ruleExport_in_entryRuleExport1202);
            iv_ruleExport=ruleExport();

            state._fsp--;

             current =iv_ruleExport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExport1212); 

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
    // $ANTLR end "entryRuleExport"


    // $ANTLR start "ruleExport"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:620:1: ruleExport returns [EObject current=null] : (otherlv_0= 'exports:' ( ( (lv_exports_1_0= ruleexportVariable ) ) otherlv_2= ',' )* ( (lv_export_3_0= ruleexportVariable ) ) otherlv_4= ';' ) ;
    public final EObject ruleExport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_exports_1_0 = null;

        EObject lv_export_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:623:28: ( (otherlv_0= 'exports:' ( ( (lv_exports_1_0= ruleexportVariable ) ) otherlv_2= ',' )* ( (lv_export_3_0= ruleexportVariable ) ) otherlv_4= ';' ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:624:1: (otherlv_0= 'exports:' ( ( (lv_exports_1_0= ruleexportVariable ) ) otherlv_2= ',' )* ( (lv_export_3_0= ruleexportVariable ) ) otherlv_4= ';' )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:624:1: (otherlv_0= 'exports:' ( ( (lv_exports_1_0= ruleexportVariable ) ) otherlv_2= ',' )* ( (lv_export_3_0= ruleexportVariable ) ) otherlv_4= ';' )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:624:3: otherlv_0= 'exports:' ( ( (lv_exports_1_0= ruleexportVariable ) ) otherlv_2= ',' )* ( (lv_export_3_0= ruleexportVariable ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleExport1249); 

                	newLeafNode(otherlv_0, grammarAccess.getExportAccess().getExportsKeyword_0());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:628:1: ( ( (lv_exports_1_0= ruleexportVariable ) ) otherlv_2= ',' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==20) ) {
                        int LA14_2 = input.LA(3);

                        if ( (LA14_2==RULE_INT) ) {
                            int LA14_5 = input.LA(4);

                            if ( (LA14_5==15) ) {
                                alt14=1;
                            }


                        }


                    }
                    else if ( (LA14_1==15) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:628:2: ( (lv_exports_1_0= ruleexportVariable ) ) otherlv_2= ','
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:628:2: ( (lv_exports_1_0= ruleexportVariable ) )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:629:1: (lv_exports_1_0= ruleexportVariable )
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:629:1: (lv_exports_1_0= ruleexportVariable )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:630:3: lv_exports_1_0= ruleexportVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExportAccess().getExportsExportVariableParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleexportVariable_in_ruleExport1271);
            	    lv_exports_1_0=ruleexportVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExportRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exports",
            	            		lv_exports_1_0, 
            	            		"exportVariable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleExport1283); 

            	        	newLeafNode(otherlv_2, grammarAccess.getExportAccess().getCommaKeyword_1_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:650:3: ( (lv_export_3_0= ruleexportVariable ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:651:1: (lv_export_3_0= ruleexportVariable )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:651:1: (lv_export_3_0= ruleexportVariable )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:652:3: lv_export_3_0= ruleexportVariable
            {
             
            	        newCompositeNode(grammarAccess.getExportAccess().getExportExportVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleexportVariable_in_ruleExport1306);
            lv_export_3_0=ruleexportVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExportRule());
            	        }
                   		set(
                   			current, 
                   			"export",
                    		lv_export_3_0, 
                    		"exportVariable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleExport1318); 

                	newLeafNode(otherlv_4, grammarAccess.getExportAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleExport"


    // $ANTLR start "entryRuleexportVariable"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:680:1: entryRuleexportVariable returns [EObject current=null] : iv_ruleexportVariable= ruleexportVariable EOF ;
    public final EObject entryRuleexportVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexportVariable = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:681:2: (iv_ruleexportVariable= ruleexportVariable EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:682:2: iv_ruleexportVariable= ruleexportVariable EOF
            {
             newCompositeNode(grammarAccess.getExportVariableRule()); 
            pushFollow(FOLLOW_ruleexportVariable_in_entryRuleexportVariable1354);
            iv_ruleexportVariable=ruleexportVariable();

            state._fsp--;

             current =iv_ruleexportVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexportVariable1364); 

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
    // $ANTLR end "entryRuleexportVariable"


    // $ANTLR start "ruleexportVariable"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:689:1: ruleexportVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_initial_1_0= ruleInitialisation ) )? ) ;
    public final EObject ruleexportVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_initial_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:692:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_initial_1_0= ruleInitialisation ) )? ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:693:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_initial_1_0= ruleInitialisation ) )? )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:693:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_initial_1_0= ruleInitialisation ) )? )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:693:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_initial_1_0= ruleInitialisation ) )?
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:693:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:694:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:694:1: (lv_name_0_0= RULE_ID )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:695:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleexportVariable1406); 

            			newLeafNode(lv_name_0_0, grammarAccess.getExportVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExportVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:711:2: ( (lv_initial_1_0= ruleInitialisation ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:712:1: (lv_initial_1_0= ruleInitialisation )
                    {
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:712:1: (lv_initial_1_0= ruleInitialisation )
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:713:3: lv_initial_1_0= ruleInitialisation
                    {
                     
                    	        newCompositeNode(grammarAccess.getExportVariableAccess().getInitialInitialisationParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInitialisation_in_ruleexportVariable1432);
                    lv_initial_1_0=ruleInitialisation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExportVariableRule());
                    	        }
                           		set(
                           			current, 
                           			"initial",
                            		lv_initial_1_0, 
                            		"Initialisation");
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
    // $ANTLR end "ruleexportVariable"


    // $ANTLR start "entryRuleInitialisation"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:737:1: entryRuleInitialisation returns [EObject current=null] : iv_ruleInitialisation= ruleInitialisation EOF ;
    public final EObject entryRuleInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialisation = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:738:2: (iv_ruleInitialisation= ruleInitialisation EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:739:2: iv_ruleInitialisation= ruleInitialisation EOF
            {
             newCompositeNode(grammarAccess.getInitialisationRule()); 
            pushFollow(FOLLOW_ruleInitialisation_in_entryRuleInitialisation1469);
            iv_ruleInitialisation=ruleInitialisation();

            state._fsp--;

             current =iv_ruleInitialisation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitialisation1479); 

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
    // $ANTLR end "entryRuleInitialisation"


    // $ANTLR start "ruleInitialisation"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:746:1: ruleInitialisation returns [EObject current=null] : (otherlv_0= '=' ( (lv_val_1_0= RULE_INT ) ) ) ;
    public final EObject ruleInitialisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;

         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:749:28: ( (otherlv_0= '=' ( (lv_val_1_0= RULE_INT ) ) ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:750:1: (otherlv_0= '=' ( (lv_val_1_0= RULE_INT ) ) )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:750:1: (otherlv_0= '=' ( (lv_val_1_0= RULE_INT ) ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:750:3: otherlv_0= '=' ( (lv_val_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleInitialisation1516); 

                	newLeafNode(otherlv_0, grammarAccess.getInitialisationAccess().getEqualsSignKeyword_0());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:754:1: ( (lv_val_1_0= RULE_INT ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:755:1: (lv_val_1_0= RULE_INT )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:755:1: (lv_val_1_0= RULE_INT )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:756:3: lv_val_1_0= RULE_INT
            {
            lv_val_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInitialisation1533); 

            			newLeafNode(lv_val_1_0, grammarAccess.getInitialisationAccess().getValINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInitialisationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"val",
                    		lv_val_1_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleInitialisation"


    // $ANTLR start "entryRuleImports"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:780:1: entryRuleImports returns [EObject current=null] : iv_ruleImports= ruleImports EOF ;
    public final EObject entryRuleImports() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImports = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:781:2: (iv_ruleImports= ruleImports EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:782:2: iv_ruleImports= ruleImports EOF
            {
             newCompositeNode(grammarAccess.getImportsRule()); 
            pushFollow(FOLLOW_ruleImports_in_entryRuleImports1574);
            iv_ruleImports=ruleImports();

            state._fsp--;

             current =iv_ruleImports; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImports1584); 

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
    // $ANTLR end "entryRuleImports"


    // $ANTLR start "ruleImports"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:789:1: ruleImports returns [EObject current=null] : (otherlv_0= 'imports:' (otherlv_1= 'external' )? ( ( (lv_imports_2_0= ruleimportVariable ) ) otherlv_3= ',' )* ( (lv_imported_4_0= ruleimportVariable ) ) otherlv_5= ';' ) ;
    public final EObject ruleImports() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_imports_2_0 = null;

        EObject lv_imported_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:792:28: ( (otherlv_0= 'imports:' (otherlv_1= 'external' )? ( ( (lv_imports_2_0= ruleimportVariable ) ) otherlv_3= ',' )* ( (lv_imported_4_0= ruleimportVariable ) ) otherlv_5= ';' ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:793:1: (otherlv_0= 'imports:' (otherlv_1= 'external' )? ( ( (lv_imports_2_0= ruleimportVariable ) ) otherlv_3= ',' )* ( (lv_imported_4_0= ruleimportVariable ) ) otherlv_5= ';' )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:793:1: (otherlv_0= 'imports:' (otherlv_1= 'external' )? ( ( (lv_imports_2_0= ruleimportVariable ) ) otherlv_3= ',' )* ( (lv_imported_4_0= ruleimportVariable ) ) otherlv_5= ';' )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:793:3: otherlv_0= 'imports:' (otherlv_1= 'external' )? ( ( (lv_imports_2_0= ruleimportVariable ) ) otherlv_3= ',' )* ( (lv_imported_4_0= ruleimportVariable ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleImports1621); 

                	newLeafNode(otherlv_0, grammarAccess.getImportsAccess().getImportsKeyword_0());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:797:1: (otherlv_1= 'external' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:797:3: otherlv_1= 'external'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleImports1634); 

                        	newLeafNode(otherlv_1, grammarAccess.getImportsAccess().getExternalKeyword_1());
                        

                    }
                    break;

            }

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:801:3: ( ( (lv_imports_2_0= ruleimportVariable ) ) otherlv_3= ',' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==23) ) {
                        int LA17_2 = input.LA(3);

                        if ( (LA17_2==15) ) {
                            alt17=1;
                        }


                    }
                    else if ( (LA17_1==15) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:801:4: ( (lv_imports_2_0= ruleimportVariable ) ) otherlv_3= ','
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:801:4: ( (lv_imports_2_0= ruleimportVariable ) )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:802:1: (lv_imports_2_0= ruleimportVariable )
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:802:1: (lv_imports_2_0= ruleimportVariable )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:803:3: lv_imports_2_0= ruleimportVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImportsAccess().getImportsImportVariableParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleimportVariable_in_ruleImports1658);
            	    lv_imports_2_0=ruleimportVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImportsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_2_0, 
            	            		"importVariable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleImports1670); 

            	        	newLeafNode(otherlv_3, grammarAccess.getImportsAccess().getCommaKeyword_2_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:823:3: ( (lv_imported_4_0= ruleimportVariable ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:824:1: (lv_imported_4_0= ruleimportVariable )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:824:1: (lv_imported_4_0= ruleimportVariable )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:825:3: lv_imported_4_0= ruleimportVariable
            {
             
            	        newCompositeNode(grammarAccess.getImportsAccess().getImportedImportVariableParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleimportVariable_in_ruleImports1693);
            lv_imported_4_0=ruleimportVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportsRule());
            	        }
                   		set(
                   			current, 
                   			"imported",
                    		lv_imported_4_0, 
                    		"importVariable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleImports1705); 

                	newLeafNode(otherlv_5, grammarAccess.getImportsAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleImports"


    // $ANTLR start "entryRuleimportVariable"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:853:1: entryRuleimportVariable returns [EObject current=null] : iv_ruleimportVariable= ruleimportVariable EOF ;
    public final EObject entryRuleimportVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleimportVariable = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:854:2: (iv_ruleimportVariable= ruleimportVariable EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:855:2: iv_ruleimportVariable= ruleimportVariable EOF
            {
             newCompositeNode(grammarAccess.getImportVariableRule()); 
            pushFollow(FOLLOW_ruleimportVariable_in_entryRuleimportVariable1741);
            iv_ruleimportVariable=ruleimportVariable();

            state._fsp--;

             current =iv_ruleimportVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleimportVariable1751); 

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
    // $ANTLR end "entryRuleimportVariable"


    // $ANTLR start "ruleimportVariable"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:862:1: ruleimportVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(optional)' )? ) ;
    public final EObject ruleimportVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:865:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(optional)' )? ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:866:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(optional)' )? )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:866:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(optional)' )? )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:866:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(optional)' )?
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:866:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:867:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:867:1: (lv_name_0_0= RULE_ID )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:868:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleimportVariable1793); 

            			newLeafNode(lv_name_0_0, grammarAccess.getImportVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:884:2: (otherlv_1= '(optional)' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:884:4: otherlv_1= '(optional)'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleimportVariable1811); 

                        	newLeafNode(otherlv_1, grammarAccess.getImportVariableAccess().getOptionalKeyword_1());
                        

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
    // $ANTLR end "ruleimportVariable"


    // $ANTLR start "entryRuleFacet"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:896:1: entryRuleFacet returns [EObject current=null] : iv_ruleFacet= ruleFacet EOF ;
    public final EObject entryRuleFacet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacet = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:897:2: (iv_ruleFacet= ruleFacet EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:898:2: iv_ruleFacet= ruleFacet EOF
            {
             newCompositeNode(grammarAccess.getFacetRule()); 
            pushFollow(FOLLOW_ruleFacet_in_entryRuleFacet1849);
            iv_ruleFacet=ruleFacet();

            state._fsp--;

             current =iv_ruleFacet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFacet1859); 

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
    // $ANTLR end "entryRuleFacet"


    // $ANTLR start "ruleFacet"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:905:1: ruleFacet returns [EObject current=null] : (otherlv_0= 'facet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= 'extends:' ( ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' )* ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) ;
    public final EObject ruleFacet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:908:28: ( (otherlv_0= 'facet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= 'extends:' ( ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' )* ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:909:1: (otherlv_0= 'facet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= 'extends:' ( ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' )* ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:909:1: (otherlv_0= 'facet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= 'extends:' ( ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' )* ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:909:3: otherlv_0= 'facet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= 'extends:' ( ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' )* ( (otherlv_8= RULE_ID ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleFacet1896); 

                	newLeafNode(otherlv_0, grammarAccess.getFacetAccess().getFacetKeyword_0());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:913:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:914:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:914:1: (lv_name_1_0= RULE_ID )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:915:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFacet1913); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFacetAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFacetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleFacet1930); 

                	newLeafNode(otherlv_2, grammarAccess.getFacetAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:935:1: ( (otherlv_3= RULE_ID ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:936:1: (otherlv_3= RULE_ID )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:936:1: (otherlv_3= RULE_ID )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:937:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFacetRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFacet1950); 

            		newLeafNode(otherlv_3, grammarAccess.getFacetAccess().getExportFacetExportCrossReference_3_0()); 
            	

            }


            }

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:948:2: ( (otherlv_4= RULE_ID ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:949:1: (otherlv_4= RULE_ID )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:949:1: (otherlv_4= RULE_ID )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:950:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFacetRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFacet1970); 

            		newLeafNode(otherlv_4, grammarAccess.getFacetAccess().getChildrenFacetChildrenCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleFacet1982); 

                	newLeafNode(otherlv_5, grammarAccess.getFacetAccess().getExtendsKeyword_5());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:965:1: ( ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==15) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:965:2: ( (otherlv_6= RULE_ID ) ) otherlv_7= ','
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:965:2: ( (otherlv_6= RULE_ID ) )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:966:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:966:1: (otherlv_6= RULE_ID )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:967:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFacetRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFacet2003); 

            	    		newLeafNode(otherlv_6, grammarAccess.getFacetAccess().getSupFacetsFacetCrossReference_6_0_0()); 
            	    	

            	    }


            	    }

            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleFacet2015); 

            	        	newLeafNode(otherlv_7, grammarAccess.getFacetAccess().getCommaKeyword_6_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:982:3: ( (otherlv_8= RULE_ID ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:983:1: (otherlv_8= RULE_ID )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:983:1: (otherlv_8= RULE_ID )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:984:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFacetRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFacet2037); 

            		newLeafNode(otherlv_8, grammarAccess.getFacetAccess().getSupFacetFacetCrossReference_7_0()); 
            	

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleFacet2049); 

                	newLeafNode(otherlv_9, grammarAccess.getFacetAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleFacet"


    // $ANTLR start "entryRuleComment"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1007:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1008:2: (iv_ruleComment= ruleComment EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1009:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment2085);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment2095); 

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
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1016:1: ruleComment returns [EObject current=null] : (otherlv_0= '#' ( ( (lv_values_1_0= RULE_ID ) ) otherlv_2= ' ' )* ( (lv_value_3_0= RULE_ID ) ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1019:28: ( (otherlv_0= '#' ( ( (lv_values_1_0= RULE_ID ) ) otherlv_2= ' ' )* ( (lv_value_3_0= RULE_ID ) ) ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1020:1: (otherlv_0= '#' ( ( (lv_values_1_0= RULE_ID ) ) otherlv_2= ' ' )* ( (lv_value_3_0= RULE_ID ) ) )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1020:1: (otherlv_0= '#' ( ( (lv_values_1_0= RULE_ID ) ) otherlv_2= ' ' )* ( (lv_value_3_0= RULE_ID ) ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1020:3: otherlv_0= '#' ( ( (lv_values_1_0= RULE_ID ) ) otherlv_2= ' ' )* ( (lv_value_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleComment2132); 

                	newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getNumberSignKeyword_0());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1024:1: ( ( (lv_values_1_0= RULE_ID ) ) otherlv_2= ' ' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==26) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1024:2: ( (lv_values_1_0= RULE_ID ) ) otherlv_2= ' '
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1024:2: ( (lv_values_1_0= RULE_ID ) )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1025:1: (lv_values_1_0= RULE_ID )
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1025:1: (lv_values_1_0= RULE_ID )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1026:3: lv_values_1_0= RULE_ID
            	    {
            	    lv_values_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComment2150); 

            	    			newLeafNode(lv_values_1_0, grammarAccess.getCommentAccess().getValuesIDTerminalRuleCall_1_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCommentRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"values",
            	            		lv_values_1_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleComment2167); 

            	        	newLeafNode(otherlv_2, grammarAccess.getCommentAccess().getSpaceKeyword_1_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1046:3: ( (lv_value_3_0= RULE_ID ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1047:1: (lv_value_3_0= RULE_ID )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1047:1: (lv_value_3_0= RULE_ID )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1048:3: lv_value_3_0= RULE_ID
            {
            lv_value_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComment2186); 

            			newLeafNode(lv_value_3_0, grammarAccess.getCommentAccess().getValueIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleComment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleGraph_in_entryRuleGraph75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGraph85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_ruleGraph131 = new BitSet(new long[]{0x0000000002000810L});
    public static final BitSet FOLLOW_ruleImport_in_ruleGraph153 = new BitSet(new long[]{0x0000000002000810L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleGraph175 = new BitSet(new long[]{0x0000000002000812L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImport276 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImport293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_ruleComponent385 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponent403 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleComponent420 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_ruleComment_in_ruleComponent441 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_ruleInstaller_in_ruleComponent463 = new BitSet(new long[]{0x00000000032D4000L});
    public static final BitSet FOLLOW_ruleComment_in_ruleComponent484 = new BitSet(new long[]{0x00000000032D4000L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleComponent506 = new BitSet(new long[]{0x00000000032D4000L});
    public static final BitSet FOLLOW_ruleComment_in_ruleComponent528 = new BitSet(new long[]{0x0000000002014000L});
    public static final BitSet FOLLOW_14_in_ruleComponent542 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponent563 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleComponent575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponent597 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_ruleComment_in_ruleComponent620 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_16_in_ruleComponent633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstaller_in_entryRuleInstaller669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstaller679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleInstaller716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstaller733 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInstaller750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChildren_in_ruleProperty843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExport_in_ruleProperty870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImports_in_ruleProperty897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFacet_in_ruleProperty924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChildren_in_entryRuleChildren959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChildren969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleChildren1006 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleChild_in_ruleChildren1028 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleChildren1040 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleChild_in_ruleChildren1063 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleChildren1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChild_in_entryRuleChild1111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChild1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChild1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExport_in_entryRuleExport1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExport1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleExport1249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleexportVariable_in_ruleExport1271 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExport1283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleexportVariable_in_ruleExport1306 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExport1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexportVariable_in_entryRuleexportVariable1354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexportVariable1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleexportVariable1406 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleInitialisation_in_ruleexportVariable1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialisation_in_entryRuleInitialisation1469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitialisation1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleInitialisation1516 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInitialisation1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImports_in_entryRuleImports1574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImports1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleImports1621 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_ruleImports1634 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleimportVariable_in_ruleImports1658 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleImports1670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleimportVariable_in_ruleImports1693 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImports1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleimportVariable_in_entryRuleimportVariable1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleimportVariable1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleimportVariable1793 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleimportVariable1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFacet_in_entryRuleFacet1849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFacet1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleFacet1896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFacet1913 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFacet1930 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFacet1950 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFacet1970 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFacet1982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFacet2003 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFacet2015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFacet2037 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFacet2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment2085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleComment2132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComment2150 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleComment2167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComment2186 = new BitSet(new long[]{0x0000000000000002L});

}