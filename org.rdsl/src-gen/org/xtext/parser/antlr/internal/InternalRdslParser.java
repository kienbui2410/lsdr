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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_STRING", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.graph'", "';'", "'{'", "'}'", "'installer:'", "'extends:'", "'children:'", "','", "'exports:'", "'='", "'imports:'", "'external'", "'.'", "'*'", "'(optional)'", "'facets:'", "'facet'", "'instance'", "'of'", "'name:'", "'count:'", "':'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
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
        	return "Model";	
       	}
       	
       	@Override
       	protected RdslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_graphs_0_0= ruleGraph ) ) | ( (lv_instances_1_0= ruleInstance ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_graphs_0_0 = null;

        EObject lv_instances_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:79:28: ( ( ( (lv_graphs_0_0= ruleGraph ) ) | ( (lv_instances_1_0= ruleInstance ) )* ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:80:1: ( ( (lv_graphs_0_0= ruleGraph ) ) | ( (lv_instances_1_0= ruleInstance ) )* )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:80:1: ( ( (lv_graphs_0_0= ruleGraph ) ) | ( (lv_instances_1_0= ruleInstance ) )* )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==EOF||LA2_0==30) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:80:2: ( (lv_graphs_0_0= ruleGraph ) )
                    {
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:80:2: ( (lv_graphs_0_0= ruleGraph ) )
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:81:1: (lv_graphs_0_0= ruleGraph )
                    {
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:81:1: (lv_graphs_0_0= ruleGraph )
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:82:3: lv_graphs_0_0= ruleGraph
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getGraphsGraphParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGraph_in_ruleModel131);
                    lv_graphs_0_0=ruleGraph();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"graphs",
                            		lv_graphs_0_0, 
                            		"Graph");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:99:6: ( (lv_instances_1_0= ruleInstance ) )*
                    {
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:99:6: ( (lv_instances_1_0= ruleInstance ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==30) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:100:1: (lv_instances_1_0= ruleInstance )
                    	    {
                    	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:100:1: (lv_instances_1_0= ruleInstance )
                    	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:101:3: lv_instances_1_0= ruleInstance
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getInstancesInstanceParserRuleCall_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInstance_in_ruleModel158);
                    	    lv_instances_1_0=ruleInstance();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"instances",
                    	            		lv_instances_1_0, 
                    	            		"Instance");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGraph"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:125:1: entryRuleGraph returns [EObject current=null] : iv_ruleGraph= ruleGraph EOF ;
    public final EObject entryRuleGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraph = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:126:2: (iv_ruleGraph= ruleGraph EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:127:2: iv_ruleGraph= ruleGraph EOF
            {
             newCompositeNode(grammarAccess.getGraphRule()); 
            pushFollow(FOLLOW_ruleGraph_in_entryRuleGraph195);
            iv_ruleGraph=ruleGraph();

            state._fsp--;

             current =iv_ruleGraph; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGraph205); 

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
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:134:1: ruleGraph returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_components_1_0= ruleComponent ) )+ ( (lv_facetGraphs_2_0= ruleFacet ) )* ) ;
    public final EObject ruleGraph() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_components_1_0 = null;

        EObject lv_facetGraphs_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:137:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_components_1_0= ruleComponent ) )+ ( (lv_facetGraphs_2_0= ruleFacet ) )* ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:138:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_components_1_0= ruleComponent ) )+ ( (lv_facetGraphs_2_0= ruleFacet ) )* )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:138:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_components_1_0= ruleComponent ) )+ ( (lv_facetGraphs_2_0= ruleFacet ) )* )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:138:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_components_1_0= ruleComponent ) )+ ( (lv_facetGraphs_2_0= ruleFacet ) )*
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:138:2: ( (lv_imports_0_0= ruleImport ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:139:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:139:1: (lv_imports_0_0= ruleImport )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:140:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGraphAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleGraph251);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_0_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:156:3: ( (lv_components_1_0= ruleComponent ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:157:1: (lv_components_1_0= ruleComponent )
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:157:1: (lv_components_1_0= ruleComponent )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:158:3: lv_components_1_0= ruleComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGraphAccess().getComponentsComponentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComponent_in_ruleGraph273);
            	    lv_components_1_0=ruleComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_1_0, 
            	            		"Component");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:174:3: ( (lv_facetGraphs_2_0= ruleFacet ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==29) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:175:1: (lv_facetGraphs_2_0= ruleFacet )
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:175:1: (lv_facetGraphs_2_0= ruleFacet )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:176:3: lv_facetGraphs_2_0= ruleFacet
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGraphAccess().getFacetGraphsFacetParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFacet_in_ruleGraph295);
            	    lv_facetGraphs_2_0=ruleFacet();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"facetGraphs",
            	            		lv_facetGraphs_2_0, 
            	            		"Facet");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleGraph"


    // $ANTLR start "entryRuleImport"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:200:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:201:2: (iv_ruleImport= ruleImport EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:202:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport332);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport342); 

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
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:209:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '.graph' otherlv_3= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:212:28: ( (otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '.graph' otherlv_3= ';' ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:213:1: (otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '.graph' otherlv_3= ';' )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:213:1: (otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '.graph' otherlv_3= ';' )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:213:3: otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '.graph' otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImport379); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:217:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:218:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:218:1: (lv_name_1_0= RULE_ID )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:219:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImport396); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleImport413); 

                	newLeafNode(otherlv_2, grammarAccess.getImportAccess().getGraphKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleImport425); 

                	newLeafNode(otherlv_3, grammarAccess.getImportAccess().getSemicolonKeyword_3());
                

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
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:253:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:254:2: (iv_ruleComponent= ruleComponent EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:255:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent463);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent473); 

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
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:262:1: ruleComponent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_installers_2_0= ruleInstaller ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_installers_2_0 = null;

        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:265:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_installers_2_0= ruleInstaller ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:266:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_installers_2_0= ruleInstaller ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:266:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_installers_2_0= ruleInstaller ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:266:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_installers_2_0= ruleInstaller ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}'
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:266:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:267:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:267:1: (lv_name_0_0= RULE_ID )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:268:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponent515); 

            			newLeafNode(lv_name_0_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleComponent532); 

                	newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:288:1: ( (lv_installers_2_0= ruleInstaller ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:289:1: (lv_installers_2_0= ruleInstaller )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:289:1: (lv_installers_2_0= ruleInstaller )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:290:3: lv_installers_2_0= ruleInstaller
            {
             
            	        newCompositeNode(grammarAccess.getComponentAccess().getInstallersInstallerParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleInstaller_in_ruleComponent553);
            lv_installers_2_0=ruleInstaller();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	        }
                   		set(
                   			current, 
                   			"installers",
                    		lv_installers_2_0, 
                    		"Installer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:306:2: ( (lv_properties_3_0= ruleProperty ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=18 && LA6_0<=19)||LA6_0==21||LA6_0==23||LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:307:1: (lv_properties_3_0= ruleProperty )
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:307:1: (lv_properties_3_0= ruleProperty )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:308:3: lv_properties_3_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleComponent574);
            	    lv_properties_3_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_3_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleComponent587); 

                	newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:336:1: entryRuleInstaller returns [EObject current=null] : iv_ruleInstaller= ruleInstaller EOF ;
    public final EObject entryRuleInstaller() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstaller = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:337:2: (iv_ruleInstaller= ruleInstaller EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:338:2: iv_ruleInstaller= ruleInstaller EOF
            {
             newCompositeNode(grammarAccess.getInstallerRule()); 
            pushFollow(FOLLOW_ruleInstaller_in_entryRuleInstaller623);
            iv_ruleInstaller=ruleInstaller();

            state._fsp--;

             current =iv_ruleInstaller; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstaller633); 

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
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:345:1: ruleInstaller returns [EObject current=null] : (otherlv_0= 'installer:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleInstaller() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:348:28: ( (otherlv_0= 'installer:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:349:1: (otherlv_0= 'installer:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:349:1: (otherlv_0= 'installer:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:349:3: otherlv_0= 'installer:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleInstaller670); 

                	newLeafNode(otherlv_0, grammarAccess.getInstallerAccess().getInstallerKeyword_0());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:353:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:354:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:354:1: (lv_name_1_0= RULE_ID )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:355:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstaller687); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleInstaller704); 

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
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:383:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:384:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:385:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty740);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty750); 

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
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:392:1: ruleProperty returns [EObject current=null] : (this_Children_0= ruleChildren | this_Export_1= ruleExport | this_Imports_2= ruleImports | this_Facets_3= ruleFacets | this_Extends_4= ruleExtends ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Children_0 = null;

        EObject this_Export_1 = null;

        EObject this_Imports_2 = null;

        EObject this_Facets_3 = null;

        EObject this_Extends_4 = null;


         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:395:28: ( (this_Children_0= ruleChildren | this_Export_1= ruleExport | this_Imports_2= ruleImports | this_Facets_3= ruleFacets | this_Extends_4= ruleExtends ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:396:1: (this_Children_0= ruleChildren | this_Export_1= ruleExport | this_Imports_2= ruleImports | this_Facets_3= ruleFacets | this_Extends_4= ruleExtends )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:396:1: (this_Children_0= ruleChildren | this_Export_1= ruleExport | this_Imports_2= ruleImports | this_Facets_3= ruleFacets | this_Extends_4= ruleExtends )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 23:
                {
                alt7=3;
                }
                break;
            case 28:
                {
                alt7=4;
                }
                break;
            case 18:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:397:5: this_Children_0= ruleChildren
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getChildrenParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChildren_in_ruleProperty797);
                    this_Children_0=ruleChildren();

                    state._fsp--;

                     
                            current = this_Children_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:407:5: this_Export_1= ruleExport
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getExportParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExport_in_ruleProperty824);
                    this_Export_1=ruleExport();

                    state._fsp--;

                     
                            current = this_Export_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:417:5: this_Imports_2= ruleImports
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getImportsParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleImports_in_ruleProperty851);
                    this_Imports_2=ruleImports();

                    state._fsp--;

                     
                            current = this_Imports_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:427:5: this_Facets_3= ruleFacets
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getFacetsParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleFacets_in_ruleProperty878);
                    this_Facets_3=ruleFacets();

                    state._fsp--;

                     
                            current = this_Facets_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:437:5: this_Extends_4= ruleExtends
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getExtendsParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleExtends_in_ruleProperty905);
                    this_Extends_4=ruleExtends();

                    state._fsp--;

                     
                            current = this_Extends_4; 
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


    // $ANTLR start "entryRuleExtends"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:453:1: entryRuleExtends returns [EObject current=null] : iv_ruleExtends= ruleExtends EOF ;
    public final EObject entryRuleExtends() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtends = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:454:2: (iv_ruleExtends= ruleExtends EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:455:2: iv_ruleExtends= ruleExtends EOF
            {
             newCompositeNode(grammarAccess.getExtendsRule()); 
            pushFollow(FOLLOW_ruleExtends_in_entryRuleExtends940);
            iv_ruleExtends=ruleExtends();

            state._fsp--;

             current =iv_ruleExtends; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtends950); 

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
    // $ANTLR end "entryRuleExtends"


    // $ANTLR start "ruleExtends"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:462:1: ruleExtends returns [EObject current=null] : (otherlv_0= 'extends:' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleExtends() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:465:28: ( (otherlv_0= 'extends:' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:466:1: (otherlv_0= 'extends:' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:466:1: (otherlv_0= 'extends:' ( (otherlv_1= RULE_ID ) ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:466:3: otherlv_0= 'extends:' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleExtends987); 

                	newLeafNode(otherlv_0, grammarAccess.getExtendsAccess().getExtendsKeyword_0());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:470:1: ( (otherlv_1= RULE_ID ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:471:1: (otherlv_1= RULE_ID )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:471:1: (otherlv_1= RULE_ID )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:472:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExtendsRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtends1007); 

            		newLeafNode(otherlv_1, grammarAccess.getExtendsAccess().getSupComponentComponentCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleExtends"


    // $ANTLR start "entryRuleChildren"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:491:1: entryRuleChildren returns [EObject current=null] : iv_ruleChildren= ruleChildren EOF ;
    public final EObject entryRuleChildren() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildren = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:492:2: (iv_ruleChildren= ruleChildren EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:493:2: iv_ruleChildren= ruleChildren EOF
            {
             newCompositeNode(grammarAccess.getChildrenRule()); 
            pushFollow(FOLLOW_ruleChildren_in_entryRuleChildren1043);
            iv_ruleChildren=ruleChildren();

            state._fsp--;

             current =iv_ruleChildren; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChildren1053); 

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
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:500:1: ruleChildren returns [EObject current=null] : (otherlv_0= 'children:' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )* ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleChildren() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:503:28: ( (otherlv_0= 'children:' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )* ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:504:1: (otherlv_0= 'children:' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )* ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:504:1: (otherlv_0= 'children:' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )* ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:504:3: otherlv_0= 'children:' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )* ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleChildren1090); 

                	newLeafNode(otherlv_0, grammarAccess.getChildrenAccess().getChildrenKeyword_0());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:508:1: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==20) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:508:2: ( (otherlv_1= RULE_ID ) ) otherlv_2= ','
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:508:2: ( (otherlv_1= RULE_ID ) )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:509:1: (otherlv_1= RULE_ID )
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:509:1: (otherlv_1= RULE_ID )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:510:3: otherlv_1= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getChildrenRule());
            	    	        }
            	            
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChildren1111); 

            	    		newLeafNode(otherlv_1, grammarAccess.getChildrenAccess().getChildrenComponentCrossReference_1_0_0()); 
            	    	

            	    }


            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleChildren1123); 

            	        	newLeafNode(otherlv_2, grammarAccess.getChildrenAccess().getCommaKeyword_1_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:525:3: ( (otherlv_3= RULE_ID ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:526:1: (otherlv_3= RULE_ID )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:526:1: (otherlv_3= RULE_ID )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:527:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChildrenRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChildren1145); 

            		newLeafNode(otherlv_3, grammarAccess.getChildrenAccess().getChildComponentCrossReference_2_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleChildren1157); 

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


    // $ANTLR start "entryRuleExport"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:550:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:551:2: (iv_ruleExport= ruleExport EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:552:2: iv_ruleExport= ruleExport EOF
            {
             newCompositeNode(grammarAccess.getExportRule()); 
            pushFollow(FOLLOW_ruleExport_in_entryRuleExport1193);
            iv_ruleExport=ruleExport();

            state._fsp--;

             current =iv_ruleExport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExport1203); 

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
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:559:1: ruleExport returns [EObject current=null] : (otherlv_0= 'exports:' ( ( (lv_exports_1_0= ruleexportVariable ) ) otherlv_2= ',' )* ( (lv_export_3_0= ruleexportVariable ) ) otherlv_4= ';' ) ;
    public final EObject ruleExport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_exports_1_0 = null;

        EObject lv_export_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:562:28: ( (otherlv_0= 'exports:' ( ( (lv_exports_1_0= ruleexportVariable ) ) otherlv_2= ',' )* ( (lv_export_3_0= ruleexportVariable ) ) otherlv_4= ';' ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:563:1: (otherlv_0= 'exports:' ( ( (lv_exports_1_0= ruleexportVariable ) ) otherlv_2= ',' )* ( (lv_export_3_0= ruleexportVariable ) ) otherlv_4= ';' )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:563:1: (otherlv_0= 'exports:' ( ( (lv_exports_1_0= ruleexportVariable ) ) otherlv_2= ',' )* ( (lv_export_3_0= ruleexportVariable ) ) otherlv_4= ';' )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:563:3: otherlv_0= 'exports:' ( ( (lv_exports_1_0= ruleexportVariable ) ) otherlv_2= ',' )* ( (lv_export_3_0= ruleexportVariable ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleExport1240); 

                	newLeafNode(otherlv_0, grammarAccess.getExportAccess().getExportsKeyword_0());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:567:1: ( ( (lv_exports_1_0= ruleexportVariable ) ) otherlv_2= ',' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==22) ) {
                        int LA9_2 = input.LA(3);

                        if ( (LA9_2==RULE_INT) ) {
                            int LA9_5 = input.LA(4);

                            if ( (LA9_5==20) ) {
                                alt9=1;
                            }


                        }


                    }
                    else if ( (LA9_1==20) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:567:2: ( (lv_exports_1_0= ruleexportVariable ) ) otherlv_2= ','
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:567:2: ( (lv_exports_1_0= ruleexportVariable ) )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:568:1: (lv_exports_1_0= ruleexportVariable )
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:568:1: (lv_exports_1_0= ruleexportVariable )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:569:3: lv_exports_1_0= ruleexportVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExportAccess().getExportsExportVariableParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleexportVariable_in_ruleExport1262);
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

            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleExport1274); 

            	        	newLeafNode(otherlv_2, grammarAccess.getExportAccess().getCommaKeyword_1_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:589:3: ( (lv_export_3_0= ruleexportVariable ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:590:1: (lv_export_3_0= ruleexportVariable )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:590:1: (lv_export_3_0= ruleexportVariable )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:591:3: lv_export_3_0= ruleexportVariable
            {
             
            	        newCompositeNode(grammarAccess.getExportAccess().getExportExportVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleexportVariable_in_ruleExport1297);
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

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleExport1309); 

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
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:619:1: entryRuleexportVariable returns [EObject current=null] : iv_ruleexportVariable= ruleexportVariable EOF ;
    public final EObject entryRuleexportVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexportVariable = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:620:2: (iv_ruleexportVariable= ruleexportVariable EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:621:2: iv_ruleexportVariable= ruleexportVariable EOF
            {
             newCompositeNode(grammarAccess.getExportVariableRule()); 
            pushFollow(FOLLOW_ruleexportVariable_in_entryRuleexportVariable1345);
            iv_ruleexportVariable=ruleexportVariable();

            state._fsp--;

             current =iv_ruleexportVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexportVariable1355); 

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
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:628:1: ruleexportVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_initial_1_0= ruleInitialisation ) )? ) ;
    public final EObject ruleexportVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_initial_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:631:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_initial_1_0= ruleInitialisation ) )? ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:632:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_initial_1_0= ruleInitialisation ) )? )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:632:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_initial_1_0= ruleInitialisation ) )? )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:632:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_initial_1_0= ruleInitialisation ) )?
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:632:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:633:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:633:1: (lv_name_0_0= RULE_ID )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:634:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleexportVariable1397); 

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

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:650:2: ( (lv_initial_1_0= ruleInitialisation ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:651:1: (lv_initial_1_0= ruleInitialisation )
                    {
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:651:1: (lv_initial_1_0= ruleInitialisation )
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:652:3: lv_initial_1_0= ruleInitialisation
                    {
                     
                    	        newCompositeNode(grammarAccess.getExportVariableAccess().getInitialInitialisationParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInitialisation_in_ruleexportVariable1423);
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
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:676:1: entryRuleInitialisation returns [EObject current=null] : iv_ruleInitialisation= ruleInitialisation EOF ;
    public final EObject entryRuleInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialisation = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:677:2: (iv_ruleInitialisation= ruleInitialisation EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:678:2: iv_ruleInitialisation= ruleInitialisation EOF
            {
             newCompositeNode(grammarAccess.getInitialisationRule()); 
            pushFollow(FOLLOW_ruleInitialisation_in_entryRuleInitialisation1460);
            iv_ruleInitialisation=ruleInitialisation();

            state._fsp--;

             current =iv_ruleInitialisation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitialisation1470); 

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
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:685:1: ruleInitialisation returns [EObject current=null] : (otherlv_0= '=' ( (lv_val_1_0= RULE_INT ) ) ) ;
    public final EObject ruleInitialisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;

         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:688:28: ( (otherlv_0= '=' ( (lv_val_1_0= RULE_INT ) ) ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:689:1: (otherlv_0= '=' ( (lv_val_1_0= RULE_INT ) ) )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:689:1: (otherlv_0= '=' ( (lv_val_1_0= RULE_INT ) ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:689:3: otherlv_0= '=' ( (lv_val_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleInitialisation1507); 

                	newLeafNode(otherlv_0, grammarAccess.getInitialisationAccess().getEqualsSignKeyword_0());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:693:1: ( (lv_val_1_0= RULE_INT ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:694:1: (lv_val_1_0= RULE_INT )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:694:1: (lv_val_1_0= RULE_INT )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:695:3: lv_val_1_0= RULE_INT
            {
            lv_val_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInitialisation1524); 

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
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:719:1: entryRuleImports returns [EObject current=null] : iv_ruleImports= ruleImports EOF ;
    public final EObject entryRuleImports() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImports = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:720:2: (iv_ruleImports= ruleImports EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:721:2: iv_ruleImports= ruleImports EOF
            {
             newCompositeNode(grammarAccess.getImportsRule()); 
            pushFollow(FOLLOW_ruleImports_in_entryRuleImports1565);
            iv_ruleImports=ruleImports();

            state._fsp--;

             current =iv_ruleImports; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImports1575); 

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
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:728:1: ruleImports returns [EObject current=null] : (otherlv_0= 'imports:' ( ( (lv_imports_1_0= ruleimportVariable ) ) otherlv_2= ',' )* ( (lv_imported_3_0= ruleimportVariable ) ) otherlv_4= ';' ) ;
    public final EObject ruleImports() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_imports_1_0 = null;

        EObject lv_imported_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:731:28: ( (otherlv_0= 'imports:' ( ( (lv_imports_1_0= ruleimportVariable ) ) otherlv_2= ',' )* ( (lv_imported_3_0= ruleimportVariable ) ) otherlv_4= ';' ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:732:1: (otherlv_0= 'imports:' ( ( (lv_imports_1_0= ruleimportVariable ) ) otherlv_2= ',' )* ( (lv_imported_3_0= ruleimportVariable ) ) otherlv_4= ';' )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:732:1: (otherlv_0= 'imports:' ( ( (lv_imports_1_0= ruleimportVariable ) ) otherlv_2= ',' )* ( (lv_imported_3_0= ruleimportVariable ) ) otherlv_4= ';' )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:732:3: otherlv_0= 'imports:' ( ( (lv_imports_1_0= ruleimportVariable ) ) otherlv_2= ',' )* ( (lv_imported_3_0= ruleimportVariable ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleImports1612); 

                	newLeafNode(otherlv_0, grammarAccess.getImportsAccess().getImportsKeyword_0());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:736:1: ( ( (lv_imports_1_0= ruleimportVariable ) ) otherlv_2= ',' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==RULE_ID) ) {
                        switch ( input.LA(3) ) {
                        case 27:
                            {
                            int LA11_3 = input.LA(4);

                            if ( (LA11_3==20) ) {
                                alt11=1;
                            }


                            }
                            break;
                        case 20:
                            {
                            alt11=1;
                            }
                            break;
                        case 25:
                            {
                            int LA11_6 = input.LA(4);

                            if ( (LA11_6==RULE_ID) ) {
                                int LA11_7 = input.LA(5);

                                if ( (LA11_7==27) ) {
                                    int LA11_3 = input.LA(6);

                                    if ( (LA11_3==20) ) {
                                        alt11=1;
                                    }


                                }
                                else if ( (LA11_7==20) ) {
                                    alt11=1;
                                }


                            }
                            else if ( (LA11_6==26) ) {
                                int LA11_8 = input.LA(5);

                                if ( (LA11_8==27) ) {
                                    int LA11_3 = input.LA(6);

                                    if ( (LA11_3==20) ) {
                                        alt11=1;
                                    }


                                }
                                else if ( (LA11_8==20) ) {
                                    alt11=1;
                                }


                            }


                            }
                            break;

                        }

                    }


                }
                else if ( (LA11_0==RULE_ID) ) {
                    switch ( input.LA(2) ) {
                    case 27:
                        {
                        int LA11_3 = input.LA(3);

                        if ( (LA11_3==20) ) {
                            alt11=1;
                        }


                        }
                        break;
                    case 20:
                        {
                        alt11=1;
                        }
                        break;
                    case 25:
                        {
                        int LA11_6 = input.LA(3);

                        if ( (LA11_6==RULE_ID) ) {
                            int LA11_7 = input.LA(4);

                            if ( (LA11_7==27) ) {
                                int LA11_3 = input.LA(5);

                                if ( (LA11_3==20) ) {
                                    alt11=1;
                                }


                            }
                            else if ( (LA11_7==20) ) {
                                alt11=1;
                            }


                        }
                        else if ( (LA11_6==26) ) {
                            int LA11_8 = input.LA(4);

                            if ( (LA11_8==27) ) {
                                int LA11_3 = input.LA(5);

                                if ( (LA11_3==20) ) {
                                    alt11=1;
                                }


                            }
                            else if ( (LA11_8==20) ) {
                                alt11=1;
                            }


                        }


                        }
                        break;

                    }

                }


                switch (alt11) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:736:2: ( (lv_imports_1_0= ruleimportVariable ) ) otherlv_2= ','
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:736:2: ( (lv_imports_1_0= ruleimportVariable ) )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:737:1: (lv_imports_1_0= ruleimportVariable )
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:737:1: (lv_imports_1_0= ruleimportVariable )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:738:3: lv_imports_1_0= ruleimportVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImportsAccess().getImportsImportVariableParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleimportVariable_in_ruleImports1634);
            	    lv_imports_1_0=ruleimportVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImportsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_1_0, 
            	            		"importVariable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleImports1646); 

            	        	newLeafNode(otherlv_2, grammarAccess.getImportsAccess().getCommaKeyword_1_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:758:3: ( (lv_imported_3_0= ruleimportVariable ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:759:1: (lv_imported_3_0= ruleimportVariable )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:759:1: (lv_imported_3_0= ruleimportVariable )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:760:3: lv_imported_3_0= ruleimportVariable
            {
             
            	        newCompositeNode(grammarAccess.getImportsAccess().getImportedImportVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleimportVariable_in_ruleImports1669);
            lv_imported_3_0=ruleimportVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportsRule());
            	        }
                   		set(
                   			current, 
                   			"imported",
                    		lv_imported_3_0, 
                    		"importVariable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleImports1681); 

                	newLeafNode(otherlv_4, grammarAccess.getImportsAccess().getSemicolonKeyword_3());
                

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
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:788:1: entryRuleimportVariable returns [EObject current=null] : iv_ruleimportVariable= ruleimportVariable EOF ;
    public final EObject entryRuleimportVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleimportVariable = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:789:2: (iv_ruleimportVariable= ruleimportVariable EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:790:2: iv_ruleimportVariable= ruleimportVariable EOF
            {
             newCompositeNode(grammarAccess.getImportVariableRule()); 
            pushFollow(FOLLOW_ruleimportVariable_in_entryRuleimportVariable1717);
            iv_ruleimportVariable=ruleimportVariable();

            state._fsp--;

             current =iv_ruleimportVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleimportVariable1727); 

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
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:797:1: ruleimportVariable returns [EObject current=null] : ( (otherlv_0= 'external' )? ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( (lv_optional_6_0= '(optional)' ) )? ) ;
    public final EObject ruleimportVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token lv_optional_6_0=null;

         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:800:28: ( ( (otherlv_0= 'external' )? ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( (lv_optional_6_0= '(optional)' ) )? ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:801:1: ( (otherlv_0= 'external' )? ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( (lv_optional_6_0= '(optional)' ) )? )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:801:1: ( (otherlv_0= 'external' )? ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( (lv_optional_6_0= '(optional)' ) )? )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:801:2: (otherlv_0= 'external' )? ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( (lv_optional_6_0= '(optional)' ) )?
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:801:2: (otherlv_0= 'external' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:801:4: otherlv_0= 'external'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleimportVariable1765); 

                        	newLeafNode(otherlv_0, grammarAccess.getImportVariableAccess().getExternalKeyword_0());
                        

                    }
                    break;

            }

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:805:3: ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' ) ) | ( (lv_name_5_0= RULE_ID ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==EOF||LA14_1==14||LA14_1==20||LA14_1==27) ) {
                    alt14=2;
                }
                else if ( (LA14_1==25) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:805:4: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' ) )
                    {
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:805:4: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' ) )
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:805:5: ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' )
                    {
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:805:5: ( (otherlv_1= RULE_ID ) )
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:806:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:806:1: (otherlv_1= RULE_ID )
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:807:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getImportVariableRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleimportVariable1789); 

                    		newLeafNode(otherlv_1, grammarAccess.getImportVariableAccess().getImportvariableCompFacetCrossReference_1_0_0_0()); 
                    	

                    }


                    }

                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleimportVariable1801); 

                        	newLeafNode(otherlv_2, grammarAccess.getImportVariableAccess().getFullStopKeyword_1_0_1());
                        
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:822:1: ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_ID) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==26) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:822:2: ( (lv_name_3_0= RULE_ID ) )
                            {
                            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:822:2: ( (lv_name_3_0= RULE_ID ) )
                            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:823:1: (lv_name_3_0= RULE_ID )
                            {
                            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:823:1: (lv_name_3_0= RULE_ID )
                            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:824:3: lv_name_3_0= RULE_ID
                            {
                            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleimportVariable1819); 

                            			newLeafNode(lv_name_3_0, grammarAccess.getImportVariableAccess().getNameIDTerminalRuleCall_1_0_2_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getImportVariableRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"name",
                                    		lv_name_3_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:841:7: otherlv_4= '*'
                            {
                            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleimportVariable1842); 

                                	newLeafNode(otherlv_4, grammarAccess.getImportVariableAccess().getAsteriskKeyword_1_0_2_1());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:846:6: ( (lv_name_5_0= RULE_ID ) )
                    {
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:846:6: ( (lv_name_5_0= RULE_ID ) )
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:847:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:847:1: (lv_name_5_0= RULE_ID )
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:848:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleimportVariable1867); 

                    			newLeafNode(lv_name_5_0, grammarAccess.getImportVariableAccess().getNameIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImportVariableRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_5_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:864:3: ( (lv_optional_6_0= '(optional)' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:865:1: (lv_optional_6_0= '(optional)' )
                    {
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:865:1: (lv_optional_6_0= '(optional)' )
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:866:3: lv_optional_6_0= '(optional)'
                    {
                    lv_optional_6_0=(Token)match(input,27,FOLLOW_27_in_ruleimportVariable1891); 

                            newLeafNode(lv_optional_6_0, grammarAccess.getImportVariableAccess().getOptionalOptionalKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImportVariableRule());
                    	        }
                           		setWithLastConsumed(current, "optional", true, "(optional)");
                    	    

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
    // $ANTLR end "ruleimportVariable"


    // $ANTLR start "entryRuleFacets"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:887:1: entryRuleFacets returns [EObject current=null] : iv_ruleFacets= ruleFacets EOF ;
    public final EObject entryRuleFacets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacets = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:888:2: (iv_ruleFacets= ruleFacets EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:889:2: iv_ruleFacets= ruleFacets EOF
            {
             newCompositeNode(grammarAccess.getFacetsRule()); 
            pushFollow(FOLLOW_ruleFacets_in_entryRuleFacets1941);
            iv_ruleFacets=ruleFacets();

            state._fsp--;

             current =iv_ruleFacets; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFacets1951); 

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
    // $ANTLR end "entryRuleFacets"


    // $ANTLR start "ruleFacets"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:896:1: ruleFacets returns [EObject current=null] : (otherlv_0= 'facets:' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )* ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleFacets() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:899:28: ( (otherlv_0= 'facets:' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )* ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:900:1: (otherlv_0= 'facets:' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )* ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:900:1: (otherlv_0= 'facets:' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )* ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:900:3: otherlv_0= 'facets:' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )* ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleFacets1988); 

                	newLeafNode(otherlv_0, grammarAccess.getFacetsAccess().getFacetsKeyword_0());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:904:1: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==20) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:904:2: ( (otherlv_1= RULE_ID ) ) otherlv_2= ','
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:904:2: ( (otherlv_1= RULE_ID ) )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:905:1: (otherlv_1= RULE_ID )
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:905:1: (otherlv_1= RULE_ID )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:906:3: otherlv_1= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFacetsRule());
            	    	        }
            	            
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFacets2009); 

            	    		newLeafNode(otherlv_1, grammarAccess.getFacetsAccess().getFacetsFacetCrossReference_1_0_0()); 
            	    	

            	    }


            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleFacets2021); 

            	        	newLeafNode(otherlv_2, grammarAccess.getFacetsAccess().getCommaKeyword_1_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:921:3: ( (otherlv_3= RULE_ID ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:922:1: (otherlv_3= RULE_ID )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:922:1: (otherlv_3= RULE_ID )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:923:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFacetsRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFacets2043); 

            		newLeafNode(otherlv_3, grammarAccess.getFacetsAccess().getFacetFacetCrossReference_2_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleFacets2055); 

                	newLeafNode(otherlv_4, grammarAccess.getFacetsAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleFacets"


    // $ANTLR start "entryRuleFacet"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:946:1: entryRuleFacet returns [EObject current=null] : iv_ruleFacet= ruleFacet EOF ;
    public final EObject entryRuleFacet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacet = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:947:2: (iv_ruleFacet= ruleFacet EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:948:2: iv_ruleFacet= ruleFacet EOF
            {
             newCompositeNode(grammarAccess.getFacetRule()); 
            pushFollow(FOLLOW_ruleFacet_in_entryRuleFacet2091);
            iv_ruleFacet=ruleFacet();

            state._fsp--;

             current =iv_ruleFacet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFacet2101); 

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
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:955:1: ruleFacet returns [EObject current=null] : (otherlv_0= 'facet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_exportFacet_3_0= ruleExport ) )* ( (lv_childrenFacet_4_0= ruleChildren ) )? (otherlv_5= 'extends:' ( ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' )* ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleFacet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_exportFacet_3_0 = null;

        EObject lv_childrenFacet_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:958:28: ( (otherlv_0= 'facet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_exportFacet_3_0= ruleExport ) )* ( (lv_childrenFacet_4_0= ruleChildren ) )? (otherlv_5= 'extends:' ( ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' )* ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:959:1: (otherlv_0= 'facet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_exportFacet_3_0= ruleExport ) )* ( (lv_childrenFacet_4_0= ruleChildren ) )? (otherlv_5= 'extends:' ( ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' )* ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:959:1: (otherlv_0= 'facet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_exportFacet_3_0= ruleExport ) )* ( (lv_childrenFacet_4_0= ruleChildren ) )? (otherlv_5= 'extends:' ( ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' )* ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:959:3: otherlv_0= 'facet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_exportFacet_3_0= ruleExport ) )* ( (lv_childrenFacet_4_0= ruleChildren ) )? (otherlv_5= 'extends:' ( ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' )* ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleFacet2138); 

                	newLeafNode(otherlv_0, grammarAccess.getFacetAccess().getFacetKeyword_0());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:963:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:964:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:964:1: (lv_name_1_0= RULE_ID )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:965:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFacet2155); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleFacet2172); 

                	newLeafNode(otherlv_2, grammarAccess.getFacetAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:985:1: ( (lv_exportFacet_3_0= ruleExport ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:986:1: (lv_exportFacet_3_0= ruleExport )
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:986:1: (lv_exportFacet_3_0= ruleExport )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:987:3: lv_exportFacet_3_0= ruleExport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFacetAccess().getExportFacetExportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExport_in_ruleFacet2193);
            	    lv_exportFacet_3_0=ruleExport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFacetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exportFacet",
            	            		lv_exportFacet_3_0, 
            	            		"Export");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1003:3: ( (lv_childrenFacet_4_0= ruleChildren ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1004:1: (lv_childrenFacet_4_0= ruleChildren )
                    {
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1004:1: (lv_childrenFacet_4_0= ruleChildren )
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1005:3: lv_childrenFacet_4_0= ruleChildren
                    {
                     
                    	        newCompositeNode(grammarAccess.getFacetAccess().getChildrenFacetChildrenParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleChildren_in_ruleFacet2215);
                    lv_childrenFacet_4_0=ruleChildren();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFacetRule());
                    	        }
                           		set(
                           			current, 
                           			"childrenFacet",
                            		lv_childrenFacet_4_0, 
                            		"Children");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1021:3: (otherlv_5= 'extends:' ( ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' )* ( (otherlv_8= RULE_ID ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==18) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1021:5: otherlv_5= 'extends:' ( ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' )* ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleFacet2229); 

                        	newLeafNode(otherlv_5, grammarAccess.getFacetAccess().getExtendsKeyword_5_0());
                        
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1025:1: ( ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID) ) {
                            int LA19_1 = input.LA(2);

                            if ( (LA19_1==20) ) {
                                alt19=1;
                            }


                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1025:2: ( (otherlv_6= RULE_ID ) ) otherlv_7= ','
                    	    {
                    	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1025:2: ( (otherlv_6= RULE_ID ) )
                    	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1026:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1026:1: (otherlv_6= RULE_ID )
                    	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1027:3: otherlv_6= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getFacetRule());
                    	    	        }
                    	            
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFacet2250); 

                    	    		newLeafNode(otherlv_6, grammarAccess.getFacetAccess().getSupFacetsFacetCrossReference_5_1_0_0()); 
                    	    	

                    	    }


                    	    }

                    	    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleFacet2262); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getFacetAccess().getCommaKeyword_5_1_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1042:3: ( (otherlv_8= RULE_ID ) )
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1043:1: (otherlv_8= RULE_ID )
                    {
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1043:1: (otherlv_8= RULE_ID )
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1044:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFacetRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFacet2284); 

                    		newLeafNode(otherlv_8, grammarAccess.getFacetAccess().getSupFacetFacetCrossReference_5_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleFacet2298); 

                	newLeafNode(otherlv_9, grammarAccess.getFacetAccess().getRightCurlyBracketKeyword_6());
                

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


    // $ANTLR start "entryRuleInstance"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1067:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1068:2: (iv_ruleInstance= ruleInstance EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1069:2: iv_ruleInstance= ruleInstance EOF
            {
             newCompositeNode(grammarAccess.getInstanceRule()); 
            pushFollow(FOLLOW_ruleInstance_in_entryRuleInstance2334);
            iv_ruleInstance=ruleInstance();

            state._fsp--;

             current =iv_ruleInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstance2344); 

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
    // $ANTLR end "entryRuleInstance"


    // $ANTLR start "ruleInstance"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1076:1: ruleInstance returns [EObject current=null] : (otherlv_0= 'instance' otherlv_1= 'of' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'name:' ( (lv_name_5_0= RULE_ID ) ) (this_ID_6= RULE_ID | this_INT_7= RULE_INT )* otherlv_8= ';' (otherlv_9= 'count:' ( (lv_val_10_0= RULE_INT ) ) otherlv_11= ';' )? ( (lv_attributes_12_0= ruleAttribut ) )* ( (lv_instances_13_0= ruleInstance ) )* otherlv_14= '}' ) ;
    public final EObject ruleInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token this_ID_6=null;
        Token this_INT_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_val_10_0=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        EObject lv_attributes_12_0 = null;

        EObject lv_instances_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1079:28: ( (otherlv_0= 'instance' otherlv_1= 'of' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'name:' ( (lv_name_5_0= RULE_ID ) ) (this_ID_6= RULE_ID | this_INT_7= RULE_INT )* otherlv_8= ';' (otherlv_9= 'count:' ( (lv_val_10_0= RULE_INT ) ) otherlv_11= ';' )? ( (lv_attributes_12_0= ruleAttribut ) )* ( (lv_instances_13_0= ruleInstance ) )* otherlv_14= '}' ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1080:1: (otherlv_0= 'instance' otherlv_1= 'of' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'name:' ( (lv_name_5_0= RULE_ID ) ) (this_ID_6= RULE_ID | this_INT_7= RULE_INT )* otherlv_8= ';' (otherlv_9= 'count:' ( (lv_val_10_0= RULE_INT ) ) otherlv_11= ';' )? ( (lv_attributes_12_0= ruleAttribut ) )* ( (lv_instances_13_0= ruleInstance ) )* otherlv_14= '}' )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1080:1: (otherlv_0= 'instance' otherlv_1= 'of' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'name:' ( (lv_name_5_0= RULE_ID ) ) (this_ID_6= RULE_ID | this_INT_7= RULE_INT )* otherlv_8= ';' (otherlv_9= 'count:' ( (lv_val_10_0= RULE_INT ) ) otherlv_11= ';' )? ( (lv_attributes_12_0= ruleAttribut ) )* ( (lv_instances_13_0= ruleInstance ) )* otherlv_14= '}' )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1080:3: otherlv_0= 'instance' otherlv_1= 'of' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'name:' ( (lv_name_5_0= RULE_ID ) ) (this_ID_6= RULE_ID | this_INT_7= RULE_INT )* otherlv_8= ';' (otherlv_9= 'count:' ( (lv_val_10_0= RULE_INT ) ) otherlv_11= ';' )? ( (lv_attributes_12_0= ruleAttribut ) )* ( (lv_instances_13_0= ruleInstance ) )* otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleInstance2381); 

                	newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getInstanceKeyword_0());
                
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleInstance2393); 

                	newLeafNode(otherlv_1, grammarAccess.getInstanceAccess().getOfKeyword_1());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1088:1: ( (otherlv_2= RULE_ID ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1089:1: (otherlv_2= RULE_ID )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1089:1: (otherlv_2= RULE_ID )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1090:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInstanceRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstance2413); 

            		newLeafNode(otherlv_2, grammarAccess.getInstanceAccess().getComponentComponentCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleInstance2425); 

                	newLeafNode(otherlv_3, grammarAccess.getInstanceAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleInstance2437); 

                	newLeafNode(otherlv_4, grammarAccess.getInstanceAccess().getNameKeyword_4());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1109:1: ( (lv_name_5_0= RULE_ID ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1110:1: (lv_name_5_0= RULE_ID )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1110:1: (lv_name_5_0= RULE_ID )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1111:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstance2454); 

            			newLeafNode(lv_name_5_0, grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInstanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"ID");
            	    

            }


            }

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1127:2: (this_ID_6= RULE_ID | this_INT_7= RULE_INT )*
            loop21:
            do {
                int alt21=3;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }
                else if ( (LA21_0==RULE_INT) ) {
                    alt21=2;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1127:3: this_ID_6= RULE_ID
            	    {
            	    this_ID_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstance2471); 
            	     
            	        newLeafNode(this_ID_6, grammarAccess.getInstanceAccess().getIDTerminalRuleCall_6_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1132:6: this_INT_7= RULE_INT
            	    {
            	    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInstance2487); 
            	     
            	        newLeafNode(this_INT_7, grammarAccess.getInstanceAccess().getINTTerminalRuleCall_6_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleInstance2500); 

                	newLeafNode(otherlv_8, grammarAccess.getInstanceAccess().getSemicolonKeyword_7());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1140:1: (otherlv_9= 'count:' ( (lv_val_10_0= RULE_INT ) ) otherlv_11= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1140:3: otherlv_9= 'count:' ( (lv_val_10_0= RULE_INT ) ) otherlv_11= ';'
                    {
                    otherlv_9=(Token)match(input,33,FOLLOW_33_in_ruleInstance2513); 

                        	newLeafNode(otherlv_9, grammarAccess.getInstanceAccess().getCountKeyword_8_0());
                        
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1144:1: ( (lv_val_10_0= RULE_INT ) )
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1145:1: (lv_val_10_0= RULE_INT )
                    {
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1145:1: (lv_val_10_0= RULE_INT )
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1146:3: lv_val_10_0= RULE_INT
                    {
                    lv_val_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInstance2530); 

                    			newLeafNode(lv_val_10_0, grammarAccess.getInstanceAccess().getValINTTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_10_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleInstance2547); 

                        	newLeafNode(otherlv_11, grammarAccess.getInstanceAccess().getSemicolonKeyword_8_2());
                        

                    }
                    break;

            }

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1166:3: ( (lv_attributes_12_0= ruleAttribut ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1167:1: (lv_attributes_12_0= ruleAttribut )
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1167:1: (lv_attributes_12_0= ruleAttribut )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1168:3: lv_attributes_12_0= ruleAttribut
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInstanceAccess().getAttributesAttributParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribut_in_ruleInstance2570);
            	    lv_attributes_12_0=ruleAttribut();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInstanceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_12_0, 
            	            		"Attribut");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1184:3: ( (lv_instances_13_0= ruleInstance ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==30) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1185:1: (lv_instances_13_0= ruleInstance )
            	    {
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1185:1: (lv_instances_13_0= ruleInstance )
            	    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1186:3: lv_instances_13_0= ruleInstance
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInstanceAccess().getInstancesInstanceParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstance_in_ruleInstance2592);
            	    lv_instances_13_0=ruleInstance();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInstanceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instances",
            	            		lv_instances_13_0, 
            	            		"Instance");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_14=(Token)match(input,16,FOLLOW_16_in_ruleInstance2605); 

                	newLeafNode(otherlv_14, grammarAccess.getInstanceAccess().getRightCurlyBracketKeyword_11());
                

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
    // $ANTLR end "ruleInstance"


    // $ANTLR start "entryRuleAttribut"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1214:1: entryRuleAttribut returns [EObject current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final EObject entryRuleAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribut = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1215:2: (iv_ruleAttribut= ruleAttribut EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1216:2: iv_ruleAttribut= ruleAttribut EOF
            {
             newCompositeNode(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_ruleAttribut_in_entryRuleAttribut2641);
            iv_ruleAttribut=ruleAttribut();

            state._fsp--;

             current =iv_ruleAttribut; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribut2651); 

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
    // $ANTLR end "entryRuleAttribut"


    // $ANTLR start "ruleAttribut"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1223:1: ruleAttribut returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_valeur_2_0= ruleVAL ) ) otherlv_3= ';' ) ;
    public final EObject ruleAttribut() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_valeur_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1226:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_valeur_2_0= ruleVAL ) ) otherlv_3= ';' ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1227:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_valeur_2_0= ruleVAL ) ) otherlv_3= ';' )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1227:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_valeur_2_0= ruleVAL ) ) otherlv_3= ';' )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1227:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_valeur_2_0= ruleVAL ) ) otherlv_3= ';'
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1227:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1228:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1228:1: (lv_name_0_0= RULE_ID )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1229:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribut2693); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleAttribut2710); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributAccess().getColonKeyword_1());
                
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1249:1: ( (lv_valeur_2_0= ruleVAL ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1250:1: (lv_valeur_2_0= ruleVAL )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1250:1: (lv_valeur_2_0= ruleVAL )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1251:3: lv_valeur_2_0= ruleVAL
            {
             
            	        newCompositeNode(grammarAccess.getAttributAccess().getValeurVALParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVAL_in_ruleAttribut2731);
            lv_valeur_2_0=ruleVAL();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributRule());
            	        }
                   		set(
                   			current, 
                   			"valeur",
                    		lv_valeur_2_0, 
                    		"VAL");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleAttribut2743); 

                	newLeafNode(otherlv_3, grammarAccess.getAttributAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleAttribut"


    // $ANTLR start "entryRuleVAL"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1279:1: entryRuleVAL returns [String current=null] : iv_ruleVAL= ruleVAL EOF ;
    public final String entryRuleVAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVAL = null;


        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1280:2: (iv_ruleVAL= ruleVAL EOF )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1281:2: iv_ruleVAL= ruleVAL EOF
            {
             newCompositeNode(grammarAccess.getVALRule()); 
            pushFollow(FOLLOW_ruleVAL_in_entryRuleVAL2780);
            iv_ruleVAL=ruleVAL();

            state._fsp--;

             current =iv_ruleVAL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVAL2791); 

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
    // $ANTLR end "entryRuleVAL"


    // $ANTLR start "ruleVAL"
    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1288:1: ruleVAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BOOLEAN_0= RULE_BOOLEAN | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleVAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOLEAN_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;

         enterRule(); 
            
        try {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1291:28: ( (this_BOOLEAN_0= RULE_BOOLEAN | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) )
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1292:1: (this_BOOLEAN_0= RULE_BOOLEAN | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING )
            {
            // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1292:1: (this_BOOLEAN_0= RULE_BOOLEAN | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING )
            int alt25=3;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt25=1;
                }
                break;
            case RULE_INT:
                {
                alt25=2;
                }
                break;
            case RULE_STRING:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1292:6: this_BOOLEAN_0= RULE_BOOLEAN
                    {
                    this_BOOLEAN_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleVAL2831); 

                    		current.merge(this_BOOLEAN_0);
                        
                     
                        newLeafNode(this_BOOLEAN_0, grammarAccess.getVALAccess().getBOOLEANTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1300:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVAL2857); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getVALAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.rdsl/src-gen/org/xtext/parser/antlr/internal/InternalRdsl.g:1308:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVAL2883); 

                    		current.merge(this_STRING_2);
                        
                     
                        newLeafNode(this_STRING_2, grammarAccess.getVALAccess().getSTRINGTerminalRuleCall_2()); 
                        

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
    // $ANTLR end "ruleVAL"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraph_in_ruleModel131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstance_in_ruleModel158 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleGraph_in_entryRuleGraph195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGraph205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleGraph251 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleGraph273 = new BitSet(new long[]{0x0000000020000012L});
    public static final BitSet FOLLOW_ruleFacet_in_ruleGraph295 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport379 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImport396 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImport413 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImport425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponent515 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleComponent532 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleInstaller_in_ruleComponent553 = new BitSet(new long[]{0x0000000010AD0000L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleComponent574 = new BitSet(new long[]{0x0000000010AD0000L});
    public static final BitSet FOLLOW_16_in_ruleComponent587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstaller_in_entryRuleInstaller623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstaller633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleInstaller670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstaller687 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInstaller704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChildren_in_ruleProperty797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExport_in_ruleProperty824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImports_in_ruleProperty851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFacets_in_ruleProperty878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtends_in_ruleProperty905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtends_in_entryRuleExtends940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtends950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleExtends987 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtends1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChildren_in_entryRuleChildren1043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChildren1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleChildren1090 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChildren1111 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleChildren1123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChildren1145 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleChildren1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExport_in_entryRuleExport1193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExport1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleExport1240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleexportVariable_in_ruleExport1262 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleExport1274 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleexportVariable_in_ruleExport1297 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExport1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexportVariable_in_entryRuleexportVariable1345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexportVariable1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleexportVariable1397 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleInitialisation_in_ruleexportVariable1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialisation_in_entryRuleInitialisation1460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitialisation1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleInitialisation1507 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInitialisation1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImports_in_entryRuleImports1565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImports1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleImports1612 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_ruleimportVariable_in_ruleImports1634 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleImports1646 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_ruleimportVariable_in_ruleImports1669 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImports1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleimportVariable_in_entryRuleimportVariable1717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleimportVariable1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleimportVariable1765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleimportVariable1789 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleimportVariable1801 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleimportVariable1819 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_26_in_ruleimportVariable1842 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleimportVariable1867 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleimportVariable1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFacets_in_entryRuleFacets1941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFacets1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleFacets1988 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFacets2009 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFacets2021 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFacets2043 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFacets2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFacet_in_entryRuleFacet2091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFacet2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFacet2138 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFacet2155 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFacet2172 = new BitSet(new long[]{0x00000000002D0000L});
    public static final BitSet FOLLOW_ruleExport_in_ruleFacet2193 = new BitSet(new long[]{0x00000000002D0000L});
    public static final BitSet FOLLOW_ruleChildren_in_ruleFacet2215 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_18_in_ruleFacet2229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFacet2250 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFacet2262 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFacet2284 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFacet2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstance_in_entryRuleInstance2334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstance2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleInstance2381 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleInstance2393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstance2413 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInstance2425 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleInstance2437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstance2454 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstance2471 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInstance2487 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_14_in_ruleInstance2500 = new BitSet(new long[]{0x0000000240010010L});
    public static final BitSet FOLLOW_33_in_ruleInstance2513 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInstance2530 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInstance2547 = new BitSet(new long[]{0x0000000040010010L});
    public static final BitSet FOLLOW_ruleAttribut_in_ruleInstance2570 = new BitSet(new long[]{0x0000000040010010L});
    public static final BitSet FOLLOW_ruleInstance_in_ruleInstance2592 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_16_in_ruleInstance2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_entryRuleAttribut2641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribut2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribut2693 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleAttribut2710 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleVAL_in_ruleAttribut2731 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAttribut2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAL_in_entryRuleVAL2780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVAL2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleVAL2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVAL2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVAL2883 = new BitSet(new long[]{0x0000000000000002L});

}