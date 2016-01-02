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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_STRING", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'.graph'", "'{'", "'}'", "'installer'", "':'", "'extends'", "'children'", "','", "'exports'", "'='", "'imports'", "'external'", "'.'", "'*'", "'(optional)'", "'facets'", "'facet'", "'instance'", "'of'", "'name'", "'count'", "'numInstances'", "'minAllowedInstances'", "'maxAllowedInstances'", "'adressType'", "'ipv4'", "'address'", "'ipv6'", "'load'", "'state'", "'public'", "'private'", "'hostname'", "'iptables'", "'-A'", "'INPUT'", "'OUTPUT'", "'FORWARD'", "'-s'", "'-d'", "'-p'", "'tcp'", "'udp'", "'-j'", "'ACCEPT'", "'REJECT'", "'DROP'", "'IPv4'", "'IPv6'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
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
    public static final int T__62=62;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRdslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRdslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRdslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRdsl.g"; }



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
    // InternalRdsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalRdsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // InternalRdsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRdsl.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_graphs_0_0= ruleGraph ) ) | ( (lv_instances_1_0= ruleInstance ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_graphs_0_0 = null;

        EObject lv_instances_1_0 = null;


         enterRule(); 
            
        try {
            // InternalRdsl.g:79:28: ( ( ( (lv_graphs_0_0= ruleGraph ) ) | ( (lv_instances_1_0= ruleInstance ) )* ) )
            // InternalRdsl.g:80:1: ( ( (lv_graphs_0_0= ruleGraph ) ) | ( (lv_instances_1_0= ruleInstance ) )* )
            {
            // InternalRdsl.g:80:1: ( ( (lv_graphs_0_0= ruleGraph ) ) | ( (lv_instances_1_0= ruleInstance ) )* )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==12||LA2_0==30) ) {
                alt2=1;
            }
            else if ( (LA2_0==EOF||LA2_0==31) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRdsl.g:80:2: ( (lv_graphs_0_0= ruleGraph ) )
                    {
                    // InternalRdsl.g:80:2: ( (lv_graphs_0_0= ruleGraph ) )
                    // InternalRdsl.g:81:1: (lv_graphs_0_0= ruleGraph )
                    {
                    // InternalRdsl.g:81:1: (lv_graphs_0_0= ruleGraph )
                    // InternalRdsl.g:82:3: lv_graphs_0_0= ruleGraph
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getGraphsGraphParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_graphs_0_0=ruleGraph();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"graphs",
                            		lv_graphs_0_0, 
                            		"org.xtext.Rdsl.Graph");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRdsl.g:99:6: ( (lv_instances_1_0= ruleInstance ) )*
                    {
                    // InternalRdsl.g:99:6: ( (lv_instances_1_0= ruleInstance ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==31) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRdsl.g:100:1: (lv_instances_1_0= ruleInstance )
                    	    {
                    	    // InternalRdsl.g:100:1: (lv_instances_1_0= ruleInstance )
                    	    // InternalRdsl.g:101:3: lv_instances_1_0= ruleInstance
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getInstancesInstanceParserRuleCall_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_3);
                    	    lv_instances_1_0=ruleInstance();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"instances",
                    	            		lv_instances_1_0, 
                    	            		"org.xtext.Rdsl.Instance");
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
    // InternalRdsl.g:125:1: entryRuleGraph returns [EObject current=null] : iv_ruleGraph= ruleGraph EOF ;
    public final EObject entryRuleGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraph = null;


        try {
            // InternalRdsl.g:126:2: (iv_ruleGraph= ruleGraph EOF )
            // InternalRdsl.g:127:2: iv_ruleGraph= ruleGraph EOF
            {
             newCompositeNode(grammarAccess.getGraphRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraph=ruleGraph();

            state._fsp--;

             current =iv_ruleGraph; 
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
    // $ANTLR end "entryRuleGraph"


    // $ANTLR start "ruleGraph"
    // InternalRdsl.g:134:1: ruleGraph returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) ) | ( (lv_components_1_0= ruleComponent ) ) | ( (lv_facetGraphs_2_0= ruleFacet ) ) )+ ;
    public final EObject ruleGraph() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_components_1_0 = null;

        EObject lv_facetGraphs_2_0 = null;


         enterRule(); 
            
        try {
            // InternalRdsl.g:137:28: ( ( ( (lv_imports_0_0= ruleImport ) ) | ( (lv_components_1_0= ruleComponent ) ) | ( (lv_facetGraphs_2_0= ruleFacet ) ) )+ )
            // InternalRdsl.g:138:1: ( ( (lv_imports_0_0= ruleImport ) ) | ( (lv_components_1_0= ruleComponent ) ) | ( (lv_facetGraphs_2_0= ruleFacet ) ) )+
            {
            // InternalRdsl.g:138:1: ( ( (lv_imports_0_0= ruleImport ) ) | ( (lv_components_1_0= ruleComponent ) ) | ( (lv_facetGraphs_2_0= ruleFacet ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    alt3=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt3=2;
                    }
                    break;
                case 30:
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalRdsl.g:138:2: ( (lv_imports_0_0= ruleImport ) )
            	    {
            	    // InternalRdsl.g:138:2: ( (lv_imports_0_0= ruleImport ) )
            	    // InternalRdsl.g:139:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalRdsl.g:139:1: (lv_imports_0_0= ruleImport )
            	    // InternalRdsl.g:140:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGraphAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_4);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_0_0, 
            	            		"org.xtext.Rdsl.Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRdsl.g:157:6: ( (lv_components_1_0= ruleComponent ) )
            	    {
            	    // InternalRdsl.g:157:6: ( (lv_components_1_0= ruleComponent ) )
            	    // InternalRdsl.g:158:1: (lv_components_1_0= ruleComponent )
            	    {
            	    // InternalRdsl.g:158:1: (lv_components_1_0= ruleComponent )
            	    // InternalRdsl.g:159:3: lv_components_1_0= ruleComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGraphAccess().getComponentsComponentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_4);
            	    lv_components_1_0=ruleComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_1_0, 
            	            		"org.xtext.Rdsl.Component");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRdsl.g:176:6: ( (lv_facetGraphs_2_0= ruleFacet ) )
            	    {
            	    // InternalRdsl.g:176:6: ( (lv_facetGraphs_2_0= ruleFacet ) )
            	    // InternalRdsl.g:177:1: (lv_facetGraphs_2_0= ruleFacet )
            	    {
            	    // InternalRdsl.g:177:1: (lv_facetGraphs_2_0= ruleFacet )
            	    // InternalRdsl.g:178:3: lv_facetGraphs_2_0= ruleFacet
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGraphAccess().getFacetGraphsFacetParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_4);
            	    lv_facetGraphs_2_0=ruleFacet();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"facetGraphs",
            	            		lv_facetGraphs_2_0, 
            	            		"org.xtext.Rdsl.Facet");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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
    // InternalRdsl.g:202:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalRdsl.g:203:2: (iv_ruleImport= ruleImport EOF )
            // InternalRdsl.g:204:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalRdsl.g:211:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= ruleImpotUri ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_importURI_1_0 = null;


         enterRule(); 
            
        try {
            // InternalRdsl.g:214:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= ruleImpotUri ) ) otherlv_2= ';' ) )
            // InternalRdsl.g:215:1: (otherlv_0= 'import' ( (lv_importURI_1_0= ruleImpotUri ) ) otherlv_2= ';' )
            {
            // InternalRdsl.g:215:1: (otherlv_0= 'import' ( (lv_importURI_1_0= ruleImpotUri ) ) otherlv_2= ';' )
            // InternalRdsl.g:215:3: otherlv_0= 'import' ( (lv_importURI_1_0= ruleImpotUri ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // InternalRdsl.g:219:1: ( (lv_importURI_1_0= ruleImpotUri ) )
            // InternalRdsl.g:220:1: (lv_importURI_1_0= ruleImpotUri )
            {
            // InternalRdsl.g:220:1: (lv_importURI_1_0= ruleImpotUri )
            // InternalRdsl.g:221:3: lv_importURI_1_0= ruleImpotUri
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportURIImpotUriParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_6);
            lv_importURI_1_0=ruleImpotUri();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"org.xtext.Rdsl.ImpotUri");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

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


    // $ANTLR start "entryRuleImpotUri"
    // InternalRdsl.g:249:1: entryRuleImpotUri returns [EObject current=null] : iv_ruleImpotUri= ruleImpotUri EOF ;
    public final EObject entryRuleImpotUri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpotUri = null;


        try {
            // InternalRdsl.g:250:2: (iv_ruleImpotUri= ruleImpotUri EOF )
            // InternalRdsl.g:251:2: iv_ruleImpotUri= ruleImpotUri EOF
            {
             newCompositeNode(grammarAccess.getImpotUriRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImpotUri=ruleImpotUri();

            state._fsp--;

             current =iv_ruleImpotUri; 
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
    // $ANTLR end "entryRuleImpotUri"


    // $ANTLR start "ruleImpotUri"
    // InternalRdsl.g:258:1: ruleImpotUri returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.graph' ) ;
    public final EObject ruleImpotUri() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalRdsl.g:261:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.graph' ) )
            // InternalRdsl.g:262:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.graph' )
            {
            // InternalRdsl.g:262:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.graph' )
            // InternalRdsl.g:262:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.graph'
            {
            // InternalRdsl.g:262:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdsl.g:263:1: (lv_name_0_0= RULE_ID )
            {
            // InternalRdsl.g:263:1: (lv_name_0_0= RULE_ID )
            // InternalRdsl.g:264:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			newLeafNode(lv_name_0_0, grammarAccess.getImpotUriAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImpotUriRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.xtext.Rdsl.ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getImpotUriAccess().getGraphKeyword_1());
                

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
    // $ANTLR end "ruleImpotUri"


    // $ANTLR start "entryRuleComponent"
    // InternalRdsl.g:294:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalRdsl.g:295:2: (iv_ruleComponent= ruleComponent EOF )
            // InternalRdsl.g:296:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalRdsl.g:303:1: ruleComponent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_installers_2_0= ruleInstaller ) ) ( ( (lv_childrens_3_0= ruleChildren ) ) | ( (lv_exports_4_0= ruleExport ) ) | ( (lv_imports_5_0= ruleImports ) ) | ( (lv_facets_6_0= ruleFacets ) ) | ( (lv_extends_7_0= ruleExtends ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_8=null;
        EObject lv_installers_2_0 = null;

        EObject lv_childrens_3_0 = null;

        EObject lv_exports_4_0 = null;

        EObject lv_imports_5_0 = null;

        EObject lv_facets_6_0 = null;

        EObject lv_extends_7_0 = null;


         enterRule(); 
            
        try {
            // InternalRdsl.g:306:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_installers_2_0= ruleInstaller ) ) ( ( (lv_childrens_3_0= ruleChildren ) ) | ( (lv_exports_4_0= ruleExport ) ) | ( (lv_imports_5_0= ruleImports ) ) | ( (lv_facets_6_0= ruleFacets ) ) | ( (lv_extends_7_0= ruleExtends ) ) )* otherlv_8= '}' ) )
            // InternalRdsl.g:307:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_installers_2_0= ruleInstaller ) ) ( ( (lv_childrens_3_0= ruleChildren ) ) | ( (lv_exports_4_0= ruleExport ) ) | ( (lv_imports_5_0= ruleImports ) ) | ( (lv_facets_6_0= ruleFacets ) ) | ( (lv_extends_7_0= ruleExtends ) ) )* otherlv_8= '}' )
            {
            // InternalRdsl.g:307:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_installers_2_0= ruleInstaller ) ) ( ( (lv_childrens_3_0= ruleChildren ) ) | ( (lv_exports_4_0= ruleExport ) ) | ( (lv_imports_5_0= ruleImports ) ) | ( (lv_facets_6_0= ruleFacets ) ) | ( (lv_extends_7_0= ruleExtends ) ) )* otherlv_8= '}' )
            // InternalRdsl.g:307:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_installers_2_0= ruleInstaller ) ) ( ( (lv_childrens_3_0= ruleChildren ) ) | ( (lv_exports_4_0= ruleExport ) ) | ( (lv_imports_5_0= ruleImports ) ) | ( (lv_facets_6_0= ruleFacets ) ) | ( (lv_extends_7_0= ruleExtends ) ) )* otherlv_8= '}'
            {
            // InternalRdsl.g:307:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdsl.g:308:1: (lv_name_0_0= RULE_ID )
            {
            // InternalRdsl.g:308:1: (lv_name_0_0= RULE_ID )
            // InternalRdsl.g:309:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			newLeafNode(lv_name_0_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.xtext.Rdsl.ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_9); 

                	newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalRdsl.g:329:1: ( (lv_installers_2_0= ruleInstaller ) )
            // InternalRdsl.g:330:1: (lv_installers_2_0= ruleInstaller )
            {
            // InternalRdsl.g:330:1: (lv_installers_2_0= ruleInstaller )
            // InternalRdsl.g:331:3: lv_installers_2_0= ruleInstaller
            {
             
            	        newCompositeNode(grammarAccess.getComponentAccess().getInstallersInstallerParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_10);
            lv_installers_2_0=ruleInstaller();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	        }
                   		set(
                   			current, 
                   			"installers",
                    		lv_installers_2_0, 
                    		"org.xtext.Rdsl.Installer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalRdsl.g:347:2: ( ( (lv_childrens_3_0= ruleChildren ) ) | ( (lv_exports_4_0= ruleExport ) ) | ( (lv_imports_5_0= ruleImports ) ) | ( (lv_facets_6_0= ruleFacets ) ) | ( (lv_extends_7_0= ruleExtends ) ) )*
            loop4:
            do {
                int alt4=6;
                switch ( input.LA(1) ) {
                case 20:
                    {
                    alt4=1;
                    }
                    break;
                case 22:
                    {
                    alt4=2;
                    }
                    break;
                case 24:
                    {
                    alt4=3;
                    }
                    break;
                case 29:
                    {
                    alt4=4;
                    }
                    break;
                case 19:
                    {
                    alt4=5;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // InternalRdsl.g:347:3: ( (lv_childrens_3_0= ruleChildren ) )
            	    {
            	    // InternalRdsl.g:347:3: ( (lv_childrens_3_0= ruleChildren ) )
            	    // InternalRdsl.g:348:1: (lv_childrens_3_0= ruleChildren )
            	    {
            	    // InternalRdsl.g:348:1: (lv_childrens_3_0= ruleChildren )
            	    // InternalRdsl.g:349:3: lv_childrens_3_0= ruleChildren
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getChildrensChildrenParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_10);
            	    lv_childrens_3_0=ruleChildren();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"childrens",
            	            		lv_childrens_3_0, 
            	            		"org.xtext.Rdsl.Children");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRdsl.g:366:6: ( (lv_exports_4_0= ruleExport ) )
            	    {
            	    // InternalRdsl.g:366:6: ( (lv_exports_4_0= ruleExport ) )
            	    // InternalRdsl.g:367:1: (lv_exports_4_0= ruleExport )
            	    {
            	    // InternalRdsl.g:367:1: (lv_exports_4_0= ruleExport )
            	    // InternalRdsl.g:368:3: lv_exports_4_0= ruleExport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getExportsExportParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_10);
            	    lv_exports_4_0=ruleExport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exports",
            	            		lv_exports_4_0, 
            	            		"org.xtext.Rdsl.Export");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRdsl.g:385:6: ( (lv_imports_5_0= ruleImports ) )
            	    {
            	    // InternalRdsl.g:385:6: ( (lv_imports_5_0= ruleImports ) )
            	    // InternalRdsl.g:386:1: (lv_imports_5_0= ruleImports )
            	    {
            	    // InternalRdsl.g:386:1: (lv_imports_5_0= ruleImports )
            	    // InternalRdsl.g:387:3: lv_imports_5_0= ruleImports
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getImportsImportsParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_10);
            	    lv_imports_5_0=ruleImports();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_5_0, 
            	            		"org.xtext.Rdsl.Imports");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRdsl.g:404:6: ( (lv_facets_6_0= ruleFacets ) )
            	    {
            	    // InternalRdsl.g:404:6: ( (lv_facets_6_0= ruleFacets ) )
            	    // InternalRdsl.g:405:1: (lv_facets_6_0= ruleFacets )
            	    {
            	    // InternalRdsl.g:405:1: (lv_facets_6_0= ruleFacets )
            	    // InternalRdsl.g:406:3: lv_facets_6_0= ruleFacets
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getFacetsFacetsParserRuleCall_3_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_10);
            	    lv_facets_6_0=ruleFacets();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"facets",
            	            		lv_facets_6_0, 
            	            		"org.xtext.Rdsl.Facets");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRdsl.g:423:6: ( (lv_extends_7_0= ruleExtends ) )
            	    {
            	    // InternalRdsl.g:423:6: ( (lv_extends_7_0= ruleExtends ) )
            	    // InternalRdsl.g:424:1: (lv_extends_7_0= ruleExtends )
            	    {
            	    // InternalRdsl.g:424:1: (lv_extends_7_0= ruleExtends )
            	    // InternalRdsl.g:425:3: lv_extends_7_0= ruleExtends
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getExtendsExtendsParserRuleCall_3_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_10);
            	    lv_extends_7_0=ruleExtends();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"extends",
            	            		lv_extends_7_0, 
            	            		"org.xtext.Rdsl.Extends");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

                	newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4());
                

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
    // InternalRdsl.g:453:1: entryRuleInstaller returns [EObject current=null] : iv_ruleInstaller= ruleInstaller EOF ;
    public final EObject entryRuleInstaller() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstaller = null;


        try {
            // InternalRdsl.g:454:2: (iv_ruleInstaller= ruleInstaller EOF )
            // InternalRdsl.g:455:2: iv_ruleInstaller= ruleInstaller EOF
            {
             newCompositeNode(grammarAccess.getInstallerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstaller=ruleInstaller();

            state._fsp--;

             current =iv_ruleInstaller; 
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
    // $ANTLR end "entryRuleInstaller"


    // $ANTLR start "ruleInstaller"
    // InternalRdsl.g:462:1: ruleInstaller returns [EObject current=null] : (otherlv_0= 'installer' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleInstaller() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalRdsl.g:465:28: ( (otherlv_0= 'installer' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalRdsl.g:466:1: (otherlv_0= 'installer' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalRdsl.g:466:1: (otherlv_0= 'installer' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalRdsl.g:466:3: otherlv_0= 'installer' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); 

                	newLeafNode(otherlv_0, grammarAccess.getInstallerAccess().getInstallerKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getInstallerAccess().getColonKeyword_1());
                
            // InternalRdsl.g:474:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalRdsl.g:475:1: (lv_name_2_0= RULE_ID )
            {
            // InternalRdsl.g:475:1: (lv_name_2_0= RULE_ID )
            // InternalRdsl.g:476:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			newLeafNode(lv_name_2_0, grammarAccess.getInstallerAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInstallerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.xtext.Rdsl.ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getInstallerAccess().getSemicolonKeyword_3());
                

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


    // $ANTLR start "entryRuleExtends"
    // InternalRdsl.g:504:1: entryRuleExtends returns [EObject current=null] : iv_ruleExtends= ruleExtends EOF ;
    public final EObject entryRuleExtends() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtends = null;


        try {
            // InternalRdsl.g:505:2: (iv_ruleExtends= ruleExtends EOF )
            // InternalRdsl.g:506:2: iv_ruleExtends= ruleExtends EOF
            {
             newCompositeNode(grammarAccess.getExtendsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtends=ruleExtends();

            state._fsp--;

             current =iv_ruleExtends; 
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
    // $ANTLR end "entryRuleExtends"


    // $ANTLR start "ruleExtends"
    // InternalRdsl.g:513:1: ruleExtends returns [EObject current=null] : (otherlv_0= 'extends' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleExtends() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalRdsl.g:516:28: ( (otherlv_0= 'extends' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalRdsl.g:517:1: (otherlv_0= 'extends' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalRdsl.g:517:1: (otherlv_0= 'extends' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
            // InternalRdsl.g:517:3: otherlv_0= 'extends' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

                	newLeafNode(otherlv_0, grammarAccess.getExtendsAccess().getExtendsKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getExtendsAccess().getColonKeyword_1());
                
            // InternalRdsl.g:525:1: ( (otherlv_2= RULE_ID ) )
            // InternalRdsl.g:526:1: (otherlv_2= RULE_ID )
            {
            // InternalRdsl.g:526:1: (otherlv_2= RULE_ID )
            // InternalRdsl.g:527:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExtendsRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            		newLeafNode(otherlv_2, grammarAccess.getExtendsAccess().getSupComponentComponentCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getExtendsAccess().getSemicolonKeyword_3());
                

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
    // InternalRdsl.g:550:1: entryRuleChildren returns [EObject current=null] : iv_ruleChildren= ruleChildren EOF ;
    public final EObject entryRuleChildren() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildren = null;


        try {
            // InternalRdsl.g:551:2: (iv_ruleChildren= ruleChildren EOF )
            // InternalRdsl.g:552:2: iv_ruleChildren= ruleChildren EOF
            {
             newCompositeNode(grammarAccess.getChildrenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChildren=ruleChildren();

            state._fsp--;

             current =iv_ruleChildren; 
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
    // $ANTLR end "entryRuleChildren"


    // $ANTLR start "ruleChildren"
    // InternalRdsl.g:559:1: ruleChildren returns [EObject current=null] : (otherlv_0= 'children' otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )* ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) ;
    public final EObject ruleChildren() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // InternalRdsl.g:562:28: ( (otherlv_0= 'children' otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )* ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalRdsl.g:563:1: (otherlv_0= 'children' otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )* ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalRdsl.g:563:1: (otherlv_0= 'children' otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )* ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            // InternalRdsl.g:563:3: otherlv_0= 'children' otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )* ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

                	newLeafNode(otherlv_0, grammarAccess.getChildrenAccess().getChildrenKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getChildrenAccess().getColonKeyword_1());
                
            // InternalRdsl.g:571:1: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==21) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalRdsl.g:571:2: ( (otherlv_2= RULE_ID ) ) otherlv_3= ','
            	    {
            	    // InternalRdsl.g:571:2: ( (otherlv_2= RULE_ID ) )
            	    // InternalRdsl.g:572:1: (otherlv_2= RULE_ID )
            	    {
            	    // InternalRdsl.g:572:1: (otherlv_2= RULE_ID )
            	    // InternalRdsl.g:573:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getChildrenRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    		newLeafNode(otherlv_2, grammarAccess.getChildrenAccess().getChildrenComponentCrossReference_2_0_0()); 
            	    	

            	    }


            	    }

            	    otherlv_3=(Token)match(input,21,FOLLOW_5); 

            	        	newLeafNode(otherlv_3, grammarAccess.getChildrenAccess().getCommaKeyword_2_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalRdsl.g:588:3: ( (otherlv_4= RULE_ID ) )
            // InternalRdsl.g:589:1: (otherlv_4= RULE_ID )
            {
            // InternalRdsl.g:589:1: (otherlv_4= RULE_ID )
            // InternalRdsl.g:590:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChildrenRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_6); 

            		newLeafNode(otherlv_4, grammarAccess.getChildrenAccess().getChildComponentCrossReference_3_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getChildrenAccess().getSemicolonKeyword_4());
                

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
    // InternalRdsl.g:613:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // InternalRdsl.g:614:2: (iv_ruleExport= ruleExport EOF )
            // InternalRdsl.g:615:2: iv_ruleExport= ruleExport EOF
            {
             newCompositeNode(grammarAccess.getExportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExport=ruleExport();

            state._fsp--;

             current =iv_ruleExport; 
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
    // $ANTLR end "entryRuleExport"


    // $ANTLR start "ruleExport"
    // InternalRdsl.g:622:1: ruleExport returns [EObject current=null] : (otherlv_0= 'exports' otherlv_1= ':' ( ( (lv_exports_2_0= ruleexportVariable ) ) otherlv_3= ',' )* ( (lv_export_4_0= ruleexportVariable ) ) otherlv_5= ';' ) ;
    public final EObject ruleExport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exports_2_0 = null;

        EObject lv_export_4_0 = null;


         enterRule(); 
            
        try {
            // InternalRdsl.g:625:28: ( (otherlv_0= 'exports' otherlv_1= ':' ( ( (lv_exports_2_0= ruleexportVariable ) ) otherlv_3= ',' )* ( (lv_export_4_0= ruleexportVariable ) ) otherlv_5= ';' ) )
            // InternalRdsl.g:626:1: (otherlv_0= 'exports' otherlv_1= ':' ( ( (lv_exports_2_0= ruleexportVariable ) ) otherlv_3= ',' )* ( (lv_export_4_0= ruleexportVariable ) ) otherlv_5= ';' )
            {
            // InternalRdsl.g:626:1: (otherlv_0= 'exports' otherlv_1= ':' ( ( (lv_exports_2_0= ruleexportVariable ) ) otherlv_3= ',' )* ( (lv_export_4_0= ruleexportVariable ) ) otherlv_5= ';' )
            // InternalRdsl.g:626:3: otherlv_0= 'exports' otherlv_1= ':' ( ( (lv_exports_2_0= ruleexportVariable ) ) otherlv_3= ',' )* ( (lv_export_4_0= ruleexportVariable ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_11); 

                	newLeafNode(otherlv_0, grammarAccess.getExportAccess().getExportsKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getExportAccess().getColonKeyword_1());
                
            // InternalRdsl.g:634:1: ( ( (lv_exports_2_0= ruleexportVariable ) ) otherlv_3= ',' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==23) ) {
                        int LA6_2 = input.LA(3);

                        if ( (LA6_2==RULE_INT) ) {
                            int LA6_5 = input.LA(4);

                            if ( (LA6_5==21) ) {
                                alt6=1;
                            }


                        }


                    }
                    else if ( (LA6_1==21) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalRdsl.g:634:2: ( (lv_exports_2_0= ruleexportVariable ) ) otherlv_3= ','
            	    {
            	    // InternalRdsl.g:634:2: ( (lv_exports_2_0= ruleexportVariable ) )
            	    // InternalRdsl.g:635:1: (lv_exports_2_0= ruleexportVariable )
            	    {
            	    // InternalRdsl.g:635:1: (lv_exports_2_0= ruleexportVariable )
            	    // InternalRdsl.g:636:3: lv_exports_2_0= ruleexportVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExportAccess().getExportsExportVariableParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_12);
            	    lv_exports_2_0=ruleexportVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExportRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exports",
            	            		lv_exports_2_0, 
            	            		"org.xtext.Rdsl.exportVariable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_3=(Token)match(input,21,FOLLOW_5); 

            	        	newLeafNode(otherlv_3, grammarAccess.getExportAccess().getCommaKeyword_2_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalRdsl.g:656:3: ( (lv_export_4_0= ruleexportVariable ) )
            // InternalRdsl.g:657:1: (lv_export_4_0= ruleexportVariable )
            {
            // InternalRdsl.g:657:1: (lv_export_4_0= ruleexportVariable )
            // InternalRdsl.g:658:3: lv_export_4_0= ruleexportVariable
            {
             
            	        newCompositeNode(grammarAccess.getExportAccess().getExportExportVariableParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_6);
            lv_export_4_0=ruleexportVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExportRule());
            	        }
                   		set(
                   			current, 
                   			"export",
                    		lv_export_4_0, 
                    		"org.xtext.Rdsl.exportVariable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getExportAccess().getSemicolonKeyword_4());
                

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
    // InternalRdsl.g:686:1: entryRuleexportVariable returns [EObject current=null] : iv_ruleexportVariable= ruleexportVariable EOF ;
    public final EObject entryRuleexportVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexportVariable = null;


        try {
            // InternalRdsl.g:687:2: (iv_ruleexportVariable= ruleexportVariable EOF )
            // InternalRdsl.g:688:2: iv_ruleexportVariable= ruleexportVariable EOF
            {
             newCompositeNode(grammarAccess.getExportVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleexportVariable=ruleexportVariable();

            state._fsp--;

             current =iv_ruleexportVariable; 
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
    // $ANTLR end "entryRuleexportVariable"


    // $ANTLR start "ruleexportVariable"
    // InternalRdsl.g:695:1: ruleexportVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_initial_1_0= ruleInitialisation ) )? ) ;
    public final EObject ruleexportVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_initial_1_0 = null;


         enterRule(); 
            
        try {
            // InternalRdsl.g:698:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_initial_1_0= ruleInitialisation ) )? ) )
            // InternalRdsl.g:699:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_initial_1_0= ruleInitialisation ) )? )
            {
            // InternalRdsl.g:699:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_initial_1_0= ruleInitialisation ) )? )
            // InternalRdsl.g:699:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_initial_1_0= ruleInitialisation ) )?
            {
            // InternalRdsl.g:699:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdsl.g:700:1: (lv_name_0_0= RULE_ID )
            {
            // InternalRdsl.g:700:1: (lv_name_0_0= RULE_ID )
            // InternalRdsl.g:701:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            			newLeafNode(lv_name_0_0, grammarAccess.getExportVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExportVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.xtext.Rdsl.ID");
            	    

            }


            }

            // InternalRdsl.g:717:2: ( (lv_initial_1_0= ruleInitialisation ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRdsl.g:718:1: (lv_initial_1_0= ruleInitialisation )
                    {
                    // InternalRdsl.g:718:1: (lv_initial_1_0= ruleInitialisation )
                    // InternalRdsl.g:719:3: lv_initial_1_0= ruleInitialisation
                    {
                     
                    	        newCompositeNode(grammarAccess.getExportVariableAccess().getInitialInitialisationParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_initial_1_0=ruleInitialisation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExportVariableRule());
                    	        }
                           		set(
                           			current, 
                           			"initial",
                            		lv_initial_1_0, 
                            		"org.xtext.Rdsl.Initialisation");
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
    // InternalRdsl.g:743:1: entryRuleInitialisation returns [EObject current=null] : iv_ruleInitialisation= ruleInitialisation EOF ;
    public final EObject entryRuleInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialisation = null;


        try {
            // InternalRdsl.g:744:2: (iv_ruleInitialisation= ruleInitialisation EOF )
            // InternalRdsl.g:745:2: iv_ruleInitialisation= ruleInitialisation EOF
            {
             newCompositeNode(grammarAccess.getInitialisationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialisation=ruleInitialisation();

            state._fsp--;

             current =iv_ruleInitialisation; 
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
    // $ANTLR end "entryRuleInitialisation"


    // $ANTLR start "ruleInitialisation"
    // InternalRdsl.g:752:1: ruleInitialisation returns [EObject current=null] : (otherlv_0= '=' ( (lv_val_1_0= RULE_INT ) ) ) ;
    public final EObject ruleInitialisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;

         enterRule(); 
            
        try {
            // InternalRdsl.g:755:28: ( (otherlv_0= '=' ( (lv_val_1_0= RULE_INT ) ) ) )
            // InternalRdsl.g:756:1: (otherlv_0= '=' ( (lv_val_1_0= RULE_INT ) ) )
            {
            // InternalRdsl.g:756:1: (otherlv_0= '=' ( (lv_val_1_0= RULE_INT ) ) )
            // InternalRdsl.g:756:3: otherlv_0= '=' ( (lv_val_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_14); 

                	newLeafNode(otherlv_0, grammarAccess.getInitialisationAccess().getEqualsSignKeyword_0());
                
            // InternalRdsl.g:760:1: ( (lv_val_1_0= RULE_INT ) )
            // InternalRdsl.g:761:1: (lv_val_1_0= RULE_INT )
            {
            // InternalRdsl.g:761:1: (lv_val_1_0= RULE_INT )
            // InternalRdsl.g:762:3: lv_val_1_0= RULE_INT
            {
            lv_val_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            			newLeafNode(lv_val_1_0, grammarAccess.getInitialisationAccess().getValINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInitialisationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"val",
                    		lv_val_1_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

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
    // InternalRdsl.g:786:1: entryRuleImports returns [EObject current=null] : iv_ruleImports= ruleImports EOF ;
    public final EObject entryRuleImports() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImports = null;


        try {
            // InternalRdsl.g:787:2: (iv_ruleImports= ruleImports EOF )
            // InternalRdsl.g:788:2: iv_ruleImports= ruleImports EOF
            {
             newCompositeNode(grammarAccess.getImportsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImports=ruleImports();

            state._fsp--;

             current =iv_ruleImports; 
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
    // $ANTLR end "entryRuleImports"


    // $ANTLR start "ruleImports"
    // InternalRdsl.g:795:1: ruleImports returns [EObject current=null] : (otherlv_0= 'imports' otherlv_1= ':' ( ( (lv_imports_2_0= ruleimportVariable ) ) otherlv_3= ',' )* ( (lv_imported_4_0= ruleimportVariable ) ) otherlv_5= ';' ) ;
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
            // InternalRdsl.g:798:28: ( (otherlv_0= 'imports' otherlv_1= ':' ( ( (lv_imports_2_0= ruleimportVariable ) ) otherlv_3= ',' )* ( (lv_imported_4_0= ruleimportVariable ) ) otherlv_5= ';' ) )
            // InternalRdsl.g:799:1: (otherlv_0= 'imports' otherlv_1= ':' ( ( (lv_imports_2_0= ruleimportVariable ) ) otherlv_3= ',' )* ( (lv_imported_4_0= ruleimportVariable ) ) otherlv_5= ';' )
            {
            // InternalRdsl.g:799:1: (otherlv_0= 'imports' otherlv_1= ':' ( ( (lv_imports_2_0= ruleimportVariable ) ) otherlv_3= ',' )* ( (lv_imported_4_0= ruleimportVariable ) ) otherlv_5= ';' )
            // InternalRdsl.g:799:3: otherlv_0= 'imports' otherlv_1= ':' ( ( (lv_imports_2_0= ruleimportVariable ) ) otherlv_3= ',' )* ( (lv_imported_4_0= ruleimportVariable ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_11); 

                	newLeafNode(otherlv_0, grammarAccess.getImportsAccess().getImportsKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_15); 

                	newLeafNode(otherlv_1, grammarAccess.getImportsAccess().getColonKeyword_1());
                
            // InternalRdsl.g:807:1: ( ( (lv_imports_2_0= ruleimportVariable ) ) otherlv_3= ',' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==RULE_ID) ) {
                        switch ( input.LA(3) ) {
                        case 28:
                            {
                            int LA8_3 = input.LA(4);

                            if ( (LA8_3==21) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case 21:
                            {
                            alt8=1;
                            }
                            break;
                        case 26:
                            {
                            int LA8_6 = input.LA(4);

                            if ( (LA8_6==RULE_ID) ) {
                                int LA8_7 = input.LA(5);

                                if ( (LA8_7==28) ) {
                                    int LA8_3 = input.LA(6);

                                    if ( (LA8_3==21) ) {
                                        alt8=1;
                                    }


                                }
                                else if ( (LA8_7==21) ) {
                                    alt8=1;
                                }


                            }
                            else if ( (LA8_6==27) ) {
                                int LA8_8 = input.LA(5);

                                if ( (LA8_8==28) ) {
                                    int LA8_3 = input.LA(6);

                                    if ( (LA8_3==21) ) {
                                        alt8=1;
                                    }


                                }
                                else if ( (LA8_8==21) ) {
                                    alt8=1;
                                }


                            }


                            }
                            break;

                        }

                    }


                }
                else if ( (LA8_0==RULE_ID) ) {
                    switch ( input.LA(2) ) {
                    case 28:
                        {
                        int LA8_3 = input.LA(3);

                        if ( (LA8_3==21) ) {
                            alt8=1;
                        }


                        }
                        break;
                    case 21:
                        {
                        alt8=1;
                        }
                        break;
                    case 26:
                        {
                        int LA8_6 = input.LA(3);

                        if ( (LA8_6==RULE_ID) ) {
                            int LA8_7 = input.LA(4);

                            if ( (LA8_7==28) ) {
                                int LA8_3 = input.LA(5);

                                if ( (LA8_3==21) ) {
                                    alt8=1;
                                }


                            }
                            else if ( (LA8_7==21) ) {
                                alt8=1;
                            }


                        }
                        else if ( (LA8_6==27) ) {
                            int LA8_8 = input.LA(4);

                            if ( (LA8_8==28) ) {
                                int LA8_3 = input.LA(5);

                                if ( (LA8_3==21) ) {
                                    alt8=1;
                                }


                            }
                            else if ( (LA8_8==21) ) {
                                alt8=1;
                            }


                        }


                        }
                        break;

                    }

                }


                switch (alt8) {
            	case 1 :
            	    // InternalRdsl.g:807:2: ( (lv_imports_2_0= ruleimportVariable ) ) otherlv_3= ','
            	    {
            	    // InternalRdsl.g:807:2: ( (lv_imports_2_0= ruleimportVariable ) )
            	    // InternalRdsl.g:808:1: (lv_imports_2_0= ruleimportVariable )
            	    {
            	    // InternalRdsl.g:808:1: (lv_imports_2_0= ruleimportVariable )
            	    // InternalRdsl.g:809:3: lv_imports_2_0= ruleimportVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImportsAccess().getImportsImportVariableParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_12);
            	    lv_imports_2_0=ruleimportVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImportsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_2_0, 
            	            		"org.xtext.Rdsl.importVariable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_3=(Token)match(input,21,FOLLOW_15); 

            	        	newLeafNode(otherlv_3, grammarAccess.getImportsAccess().getCommaKeyword_2_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalRdsl.g:829:3: ( (lv_imported_4_0= ruleimportVariable ) )
            // InternalRdsl.g:830:1: (lv_imported_4_0= ruleimportVariable )
            {
            // InternalRdsl.g:830:1: (lv_imported_4_0= ruleimportVariable )
            // InternalRdsl.g:831:3: lv_imported_4_0= ruleimportVariable
            {
             
            	        newCompositeNode(grammarAccess.getImportsAccess().getImportedImportVariableParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_6);
            lv_imported_4_0=ruleimportVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportsRule());
            	        }
                   		set(
                   			current, 
                   			"imported",
                    		lv_imported_4_0, 
                    		"org.xtext.Rdsl.importVariable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

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
    // InternalRdsl.g:859:1: entryRuleimportVariable returns [EObject current=null] : iv_ruleimportVariable= ruleimportVariable EOF ;
    public final EObject entryRuleimportVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleimportVariable = null;


        try {
            // InternalRdsl.g:860:2: (iv_ruleimportVariable= ruleimportVariable EOF )
            // InternalRdsl.g:861:2: iv_ruleimportVariable= ruleimportVariable EOF
            {
             newCompositeNode(grammarAccess.getImportVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleimportVariable=ruleimportVariable();

            state._fsp--;

             current =iv_ruleimportVariable; 
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
    // $ANTLR end "entryRuleimportVariable"


    // $ANTLR start "ruleimportVariable"
    // InternalRdsl.g:868:1: ruleimportVariable returns [EObject current=null] : ( ( (lv_external_0_0= 'external' ) )? ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( (lv_optional_6_0= '(optional)' ) )? ) ;
    public final EObject ruleimportVariable() throws RecognitionException {
        EObject current = null;

        Token lv_external_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token lv_optional_6_0=null;

         enterRule(); 
            
        try {
            // InternalRdsl.g:871:28: ( ( ( (lv_external_0_0= 'external' ) )? ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( (lv_optional_6_0= '(optional)' ) )? ) )
            // InternalRdsl.g:872:1: ( ( (lv_external_0_0= 'external' ) )? ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( (lv_optional_6_0= '(optional)' ) )? )
            {
            // InternalRdsl.g:872:1: ( ( (lv_external_0_0= 'external' ) )? ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( (lv_optional_6_0= '(optional)' ) )? )
            // InternalRdsl.g:872:2: ( (lv_external_0_0= 'external' ) )? ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( (lv_optional_6_0= '(optional)' ) )?
            {
            // InternalRdsl.g:872:2: ( (lv_external_0_0= 'external' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRdsl.g:873:1: (lv_external_0_0= 'external' )
                    {
                    // InternalRdsl.g:873:1: (lv_external_0_0= 'external' )
                    // InternalRdsl.g:874:3: lv_external_0_0= 'external'
                    {
                    lv_external_0_0=(Token)match(input,25,FOLLOW_5); 

                            newLeafNode(lv_external_0_0, grammarAccess.getImportVariableAccess().getExternalExternalKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImportVariableRule());
                    	        }
                           		setWithLastConsumed(current, "external", true, "external");
                    	    

                    }


                    }
                    break;

            }

            // InternalRdsl.g:887:3: ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' ) ) | ( (lv_name_5_0= RULE_ID ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==EOF||LA11_1==13||LA11_1==21||LA11_1==28) ) {
                    alt11=2;
                }
                else if ( (LA11_1==26) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRdsl.g:887:4: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' ) )
                    {
                    // InternalRdsl.g:887:4: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' ) )
                    // InternalRdsl.g:887:5: ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' )
                    {
                    // InternalRdsl.g:887:5: ( (otherlv_1= RULE_ID ) )
                    // InternalRdsl.g:888:1: (otherlv_1= RULE_ID )
                    {
                    // InternalRdsl.g:888:1: (otherlv_1= RULE_ID )
                    // InternalRdsl.g:889:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getImportVariableRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_16); 

                    		newLeafNode(otherlv_1, grammarAccess.getImportVariableAccess().getImportvariableCompFacetCrossReference_1_0_0_0()); 
                    	

                    }


                    }

                    otherlv_2=(Token)match(input,26,FOLLOW_17); 

                        	newLeafNode(otherlv_2, grammarAccess.getImportVariableAccess().getFullStopKeyword_1_0_1());
                        
                    // InternalRdsl.g:904:1: ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==27) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalRdsl.g:904:2: ( (lv_name_3_0= RULE_ID ) )
                            {
                            // InternalRdsl.g:904:2: ( (lv_name_3_0= RULE_ID ) )
                            // InternalRdsl.g:905:1: (lv_name_3_0= RULE_ID )
                            {
                            // InternalRdsl.g:905:1: (lv_name_3_0= RULE_ID )
                            // InternalRdsl.g:906:3: lv_name_3_0= RULE_ID
                            {
                            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                            			newLeafNode(lv_name_3_0, grammarAccess.getImportVariableAccess().getNameIDTerminalRuleCall_1_0_2_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getImportVariableRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"name",
                                    		lv_name_3_0, 
                                    		"org.xtext.Rdsl.ID");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalRdsl.g:923:7: otherlv_4= '*'
                            {
                            otherlv_4=(Token)match(input,27,FOLLOW_18); 

                                	newLeafNode(otherlv_4, grammarAccess.getImportVariableAccess().getAsteriskKeyword_1_0_2_1());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRdsl.g:928:6: ( (lv_name_5_0= RULE_ID ) )
                    {
                    // InternalRdsl.g:928:6: ( (lv_name_5_0= RULE_ID ) )
                    // InternalRdsl.g:929:1: (lv_name_5_0= RULE_ID )
                    {
                    // InternalRdsl.g:929:1: (lv_name_5_0= RULE_ID )
                    // InternalRdsl.g:930:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                    			newLeafNode(lv_name_5_0, grammarAccess.getImportVariableAccess().getNameIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImportVariableRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_5_0, 
                            		"org.xtext.Rdsl.ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalRdsl.g:946:3: ( (lv_optional_6_0= '(optional)' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRdsl.g:947:1: (lv_optional_6_0= '(optional)' )
                    {
                    // InternalRdsl.g:947:1: (lv_optional_6_0= '(optional)' )
                    // InternalRdsl.g:948:3: lv_optional_6_0= '(optional)'
                    {
                    lv_optional_6_0=(Token)match(input,28,FOLLOW_2); 

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
    // InternalRdsl.g:969:1: entryRuleFacets returns [EObject current=null] : iv_ruleFacets= ruleFacets EOF ;
    public final EObject entryRuleFacets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacets = null;


        try {
            // InternalRdsl.g:970:2: (iv_ruleFacets= ruleFacets EOF )
            // InternalRdsl.g:971:2: iv_ruleFacets= ruleFacets EOF
            {
             newCompositeNode(grammarAccess.getFacetsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFacets=ruleFacets();

            state._fsp--;

             current =iv_ruleFacets; 
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
    // $ANTLR end "entryRuleFacets"


    // $ANTLR start "ruleFacets"
    // InternalRdsl.g:978:1: ruleFacets returns [EObject current=null] : (otherlv_0= 'facets' otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )* ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) ;
    public final EObject ruleFacets() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // InternalRdsl.g:981:28: ( (otherlv_0= 'facets' otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )* ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalRdsl.g:982:1: (otherlv_0= 'facets' otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )* ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalRdsl.g:982:1: (otherlv_0= 'facets' otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )* ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            // InternalRdsl.g:982:3: otherlv_0= 'facets' otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )* ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_11); 

                	newLeafNode(otherlv_0, grammarAccess.getFacetsAccess().getFacetsKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getFacetsAccess().getColonKeyword_1());
                
            // InternalRdsl.g:990:1: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==21) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalRdsl.g:990:2: ( (otherlv_2= RULE_ID ) ) otherlv_3= ','
            	    {
            	    // InternalRdsl.g:990:2: ( (otherlv_2= RULE_ID ) )
            	    // InternalRdsl.g:991:1: (otherlv_2= RULE_ID )
            	    {
            	    // InternalRdsl.g:991:1: (otherlv_2= RULE_ID )
            	    // InternalRdsl.g:992:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFacetsRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    		newLeafNode(otherlv_2, grammarAccess.getFacetsAccess().getFacetsFacetCrossReference_2_0_0()); 
            	    	

            	    }


            	    }

            	    otherlv_3=(Token)match(input,21,FOLLOW_5); 

            	        	newLeafNode(otherlv_3, grammarAccess.getFacetsAccess().getCommaKeyword_2_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalRdsl.g:1007:3: ( (otherlv_4= RULE_ID ) )
            // InternalRdsl.g:1008:1: (otherlv_4= RULE_ID )
            {
            // InternalRdsl.g:1008:1: (otherlv_4= RULE_ID )
            // InternalRdsl.g:1009:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFacetsRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_6); 

            		newLeafNode(otherlv_4, grammarAccess.getFacetsAccess().getFacetFacetCrossReference_3_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getFacetsAccess().getSemicolonKeyword_4());
                

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
    // InternalRdsl.g:1032:1: entryRuleFacet returns [EObject current=null] : iv_ruleFacet= ruleFacet EOF ;
    public final EObject entryRuleFacet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacet = null;


        try {
            // InternalRdsl.g:1033:2: (iv_ruleFacet= ruleFacet EOF )
            // InternalRdsl.g:1034:2: iv_ruleFacet= ruleFacet EOF
            {
             newCompositeNode(grammarAccess.getFacetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFacet=ruleFacet();

            state._fsp--;

             current =iv_ruleFacet; 
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
    // $ANTLR end "entryRuleFacet"


    // $ANTLR start "ruleFacet"
    // InternalRdsl.g:1041:1: ruleFacet returns [EObject current=null] : (otherlv_0= 'facet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_exportFacet_3_0= ruleExport ) )* ( (lv_childrenFacet_4_0= ruleChildren ) )? (otherlv_5= 'extends' otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )* ( (otherlv_9= RULE_ID ) ) )? otherlv_10= '}' ) ;
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
        Token otherlv_10=null;
        EObject lv_exportFacet_3_0 = null;

        EObject lv_childrenFacet_4_0 = null;


         enterRule(); 
            
        try {
            // InternalRdsl.g:1044:28: ( (otherlv_0= 'facet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_exportFacet_3_0= ruleExport ) )* ( (lv_childrenFacet_4_0= ruleChildren ) )? (otherlv_5= 'extends' otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )* ( (otherlv_9= RULE_ID ) ) )? otherlv_10= '}' ) )
            // InternalRdsl.g:1045:1: (otherlv_0= 'facet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_exportFacet_3_0= ruleExport ) )* ( (lv_childrenFacet_4_0= ruleChildren ) )? (otherlv_5= 'extends' otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )* ( (otherlv_9= RULE_ID ) ) )? otherlv_10= '}' )
            {
            // InternalRdsl.g:1045:1: (otherlv_0= 'facet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_exportFacet_3_0= ruleExport ) )* ( (lv_childrenFacet_4_0= ruleChildren ) )? (otherlv_5= 'extends' otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )* ( (otherlv_9= RULE_ID ) ) )? otherlv_10= '}' )
            // InternalRdsl.g:1045:3: otherlv_0= 'facet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_exportFacet_3_0= ruleExport ) )* ( (lv_childrenFacet_4_0= ruleChildren ) )? (otherlv_5= 'extends' otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )* ( (otherlv_9= RULE_ID ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getFacetAccess().getFacetKeyword_0());
                
            // InternalRdsl.g:1049:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdsl.g:1050:1: (lv_name_1_0= RULE_ID )
            {
            // InternalRdsl.g:1050:1: (lv_name_1_0= RULE_ID )
            // InternalRdsl.g:1051:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFacetAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFacetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.xtext.Rdsl.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_19); 

                	newLeafNode(otherlv_2, grammarAccess.getFacetAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalRdsl.g:1071:1: ( (lv_exportFacet_3_0= ruleExport ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRdsl.g:1072:1: (lv_exportFacet_3_0= ruleExport )
            	    {
            	    // InternalRdsl.g:1072:1: (lv_exportFacet_3_0= ruleExport )
            	    // InternalRdsl.g:1073:3: lv_exportFacet_3_0= ruleExport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFacetAccess().getExportFacetExportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_19);
            	    lv_exportFacet_3_0=ruleExport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFacetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exportFacet",
            	            		lv_exportFacet_3_0, 
            	            		"org.xtext.Rdsl.Export");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalRdsl.g:1089:3: ( (lv_childrenFacet_4_0= ruleChildren ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRdsl.g:1090:1: (lv_childrenFacet_4_0= ruleChildren )
                    {
                    // InternalRdsl.g:1090:1: (lv_childrenFacet_4_0= ruleChildren )
                    // InternalRdsl.g:1091:3: lv_childrenFacet_4_0= ruleChildren
                    {
                     
                    	        newCompositeNode(grammarAccess.getFacetAccess().getChildrenFacetChildrenParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_20);
                    lv_childrenFacet_4_0=ruleChildren();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFacetRule());
                    	        }
                           		set(
                           			current, 
                           			"childrenFacet",
                            		lv_childrenFacet_4_0, 
                            		"org.xtext.Rdsl.Children");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalRdsl.g:1107:3: (otherlv_5= 'extends' otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )* ( (otherlv_9= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRdsl.g:1107:5: otherlv_5= 'extends' otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )* ( (otherlv_9= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_11); 

                        	newLeafNode(otherlv_5, grammarAccess.getFacetAccess().getExtendsKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,18,FOLLOW_5); 

                        	newLeafNode(otherlv_6, grammarAccess.getFacetAccess().getColonKeyword_5_1());
                        
                    // InternalRdsl.g:1115:1: ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID) ) {
                            int LA16_1 = input.LA(2);

                            if ( (LA16_1==21) ) {
                                alt16=1;
                            }


                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalRdsl.g:1115:2: ( (otherlv_7= RULE_ID ) ) otherlv_8= ','
                    	    {
                    	    // InternalRdsl.g:1115:2: ( (otherlv_7= RULE_ID ) )
                    	    // InternalRdsl.g:1116:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalRdsl.g:1116:1: (otherlv_7= RULE_ID )
                    	    // InternalRdsl.g:1117:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getFacetRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_12); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getFacetAccess().getSupFacetsFacetCrossReference_5_2_0_0()); 
                    	    	

                    	    }


                    	    }

                    	    otherlv_8=(Token)match(input,21,FOLLOW_5); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getFacetAccess().getCommaKeyword_5_2_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    // InternalRdsl.g:1132:3: ( (otherlv_9= RULE_ID ) )
                    // InternalRdsl.g:1133:1: (otherlv_9= RULE_ID )
                    {
                    // InternalRdsl.g:1133:1: (otherlv_9= RULE_ID )
                    // InternalRdsl.g:1134:3: otherlv_9= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFacetRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_21); 

                    		newLeafNode(otherlv_9, grammarAccess.getFacetAccess().getSupFacetFacetCrossReference_5_3_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

                	newLeafNode(otherlv_10, grammarAccess.getFacetAccess().getRightCurlyBracketKeyword_6());
                

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
    // InternalRdsl.g:1157:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // InternalRdsl.g:1158:2: (iv_ruleInstance= ruleInstance EOF )
            // InternalRdsl.g:1159:2: iv_ruleInstance= ruleInstance EOF
            {
             newCompositeNode(grammarAccess.getInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstance=ruleInstance();

            state._fsp--;

             current =iv_ruleInstance; 
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
    // $ANTLR end "entryRuleInstance"


    // $ANTLR start "ruleInstance"
    // InternalRdsl.g:1166:1: ruleInstance returns [EObject current=null] : (otherlv_0= 'instance' otherlv_1= 'of' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_instances_4_0= ruleInstance ) )* otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_ID ) ) ( (lv_fullname_8_0= ruleFullname ) )* otherlv_9= ';' (otherlv_10= 'count' otherlv_11= ':' ( (lv_val_12_0= RULE_INT ) ) otherlv_13= ';' )? (otherlv_14= 'numInstances' otherlv_15= ':' ( (lv_valnum_16_0= RULE_INT ) ) otherlv_17= ';' )? (otherlv_18= 'minAllowedInstances' otherlv_19= ':' ( (lv_valmin_20_0= RULE_INT ) ) otherlv_21= ';' )? (otherlv_22= 'maxAllowedInstances' otherlv_23= ':' ( (lv_valmax_24_0= RULE_INT ) ) otherlv_25= ';' )? (otherlv_26= 'adressType' otherlv_27= ':' ( (lv_ipAddress_28_0= ruleAType ) ) otherlv_29= ';' )? (otherlv_30= 'ipv4' otherlv_31= 'address' otherlv_32= ':' ( ( ( (lv_ip4_33_0= RULE_INT ) ) otherlv_34= '.' )* ( (lv_ip4last_35_0= RULE_INT ) ) ) otherlv_36= ';' )? (otherlv_37= 'ipv6' otherlv_38= 'address' otherlv_39= ':' ( ( ( (lv_ip6_40_0= RULE_INT ) ) otherlv_41= '.' )* ( (lv_ip6last_42_0= RULE_INT ) ) ) otherlv_43= ';' )? (otherlv_44= 'load' otherlv_45= ':' ( (lv_theLoad_46_0= RULE_INT ) ) otherlv_47= ';' )? (otherlv_48= 'state' otherlv_49= ':' ( ( (lv_theState_50_1= 'public' | lv_theState_50_2= 'private' ) ) ) otherlv_51= ';' )? (otherlv_52= 'hostname' otherlv_53= ':' ( (lv_hostname_54_0= RULE_ID ) ) otherlv_55= ';' )? ( (lv_iptable_56_0= ruleIpTable ) )* ( (lv_attributes_57_0= ruleAttribut ) )* otherlv_58= '}' ) ;
    public final EObject ruleInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_val_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_valnum_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_valmin_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_valmax_24_0=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token lv_ip4_33_0=null;
        Token otherlv_34=null;
        Token lv_ip4last_35_0=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token lv_ip6_40_0=null;
        Token otherlv_41=null;
        Token lv_ip6last_42_0=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token lv_theLoad_46_0=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token lv_theState_50_1=null;
        Token lv_theState_50_2=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token lv_hostname_54_0=null;
        Token otherlv_55=null;
        Token otherlv_58=null;
        EObject lv_instances_4_0 = null;

        AntlrDatatypeRuleToken lv_fullname_8_0 = null;

        AntlrDatatypeRuleToken lv_ipAddress_28_0 = null;

        EObject lv_iptable_56_0 = null;

        EObject lv_attributes_57_0 = null;


         enterRule(); 
            
        try {
            // InternalRdsl.g:1169:28: ( (otherlv_0= 'instance' otherlv_1= 'of' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_instances_4_0= ruleInstance ) )* otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_ID ) ) ( (lv_fullname_8_0= ruleFullname ) )* otherlv_9= ';' (otherlv_10= 'count' otherlv_11= ':' ( (lv_val_12_0= RULE_INT ) ) otherlv_13= ';' )? (otherlv_14= 'numInstances' otherlv_15= ':' ( (lv_valnum_16_0= RULE_INT ) ) otherlv_17= ';' )? (otherlv_18= 'minAllowedInstances' otherlv_19= ':' ( (lv_valmin_20_0= RULE_INT ) ) otherlv_21= ';' )? (otherlv_22= 'maxAllowedInstances' otherlv_23= ':' ( (lv_valmax_24_0= RULE_INT ) ) otherlv_25= ';' )? (otherlv_26= 'adressType' otherlv_27= ':' ( (lv_ipAddress_28_0= ruleAType ) ) otherlv_29= ';' )? (otherlv_30= 'ipv4' otherlv_31= 'address' otherlv_32= ':' ( ( ( (lv_ip4_33_0= RULE_INT ) ) otherlv_34= '.' )* ( (lv_ip4last_35_0= RULE_INT ) ) ) otherlv_36= ';' )? (otherlv_37= 'ipv6' otherlv_38= 'address' otherlv_39= ':' ( ( ( (lv_ip6_40_0= RULE_INT ) ) otherlv_41= '.' )* ( (lv_ip6last_42_0= RULE_INT ) ) ) otherlv_43= ';' )? (otherlv_44= 'load' otherlv_45= ':' ( (lv_theLoad_46_0= RULE_INT ) ) otherlv_47= ';' )? (otherlv_48= 'state' otherlv_49= ':' ( ( (lv_theState_50_1= 'public' | lv_theState_50_2= 'private' ) ) ) otherlv_51= ';' )? (otherlv_52= 'hostname' otherlv_53= ':' ( (lv_hostname_54_0= RULE_ID ) ) otherlv_55= ';' )? ( (lv_iptable_56_0= ruleIpTable ) )* ( (lv_attributes_57_0= ruleAttribut ) )* otherlv_58= '}' ) )
            // InternalRdsl.g:1170:1: (otherlv_0= 'instance' otherlv_1= 'of' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_instances_4_0= ruleInstance ) )* otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_ID ) ) ( (lv_fullname_8_0= ruleFullname ) )* otherlv_9= ';' (otherlv_10= 'count' otherlv_11= ':' ( (lv_val_12_0= RULE_INT ) ) otherlv_13= ';' )? (otherlv_14= 'numInstances' otherlv_15= ':' ( (lv_valnum_16_0= RULE_INT ) ) otherlv_17= ';' )? (otherlv_18= 'minAllowedInstances' otherlv_19= ':' ( (lv_valmin_20_0= RULE_INT ) ) otherlv_21= ';' )? (otherlv_22= 'maxAllowedInstances' otherlv_23= ':' ( (lv_valmax_24_0= RULE_INT ) ) otherlv_25= ';' )? (otherlv_26= 'adressType' otherlv_27= ':' ( (lv_ipAddress_28_0= ruleAType ) ) otherlv_29= ';' )? (otherlv_30= 'ipv4' otherlv_31= 'address' otherlv_32= ':' ( ( ( (lv_ip4_33_0= RULE_INT ) ) otherlv_34= '.' )* ( (lv_ip4last_35_0= RULE_INT ) ) ) otherlv_36= ';' )? (otherlv_37= 'ipv6' otherlv_38= 'address' otherlv_39= ':' ( ( ( (lv_ip6_40_0= RULE_INT ) ) otherlv_41= '.' )* ( (lv_ip6last_42_0= RULE_INT ) ) ) otherlv_43= ';' )? (otherlv_44= 'load' otherlv_45= ':' ( (lv_theLoad_46_0= RULE_INT ) ) otherlv_47= ';' )? (otherlv_48= 'state' otherlv_49= ':' ( ( (lv_theState_50_1= 'public' | lv_theState_50_2= 'private' ) ) ) otherlv_51= ';' )? (otherlv_52= 'hostname' otherlv_53= ':' ( (lv_hostname_54_0= RULE_ID ) ) otherlv_55= ';' )? ( (lv_iptable_56_0= ruleIpTable ) )* ( (lv_attributes_57_0= ruleAttribut ) )* otherlv_58= '}' )
            {
            // InternalRdsl.g:1170:1: (otherlv_0= 'instance' otherlv_1= 'of' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_instances_4_0= ruleInstance ) )* otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_ID ) ) ( (lv_fullname_8_0= ruleFullname ) )* otherlv_9= ';' (otherlv_10= 'count' otherlv_11= ':' ( (lv_val_12_0= RULE_INT ) ) otherlv_13= ';' )? (otherlv_14= 'numInstances' otherlv_15= ':' ( (lv_valnum_16_0= RULE_INT ) ) otherlv_17= ';' )? (otherlv_18= 'minAllowedInstances' otherlv_19= ':' ( (lv_valmin_20_0= RULE_INT ) ) otherlv_21= ';' )? (otherlv_22= 'maxAllowedInstances' otherlv_23= ':' ( (lv_valmax_24_0= RULE_INT ) ) otherlv_25= ';' )? (otherlv_26= 'adressType' otherlv_27= ':' ( (lv_ipAddress_28_0= ruleAType ) ) otherlv_29= ';' )? (otherlv_30= 'ipv4' otherlv_31= 'address' otherlv_32= ':' ( ( ( (lv_ip4_33_0= RULE_INT ) ) otherlv_34= '.' )* ( (lv_ip4last_35_0= RULE_INT ) ) ) otherlv_36= ';' )? (otherlv_37= 'ipv6' otherlv_38= 'address' otherlv_39= ':' ( ( ( (lv_ip6_40_0= RULE_INT ) ) otherlv_41= '.' )* ( (lv_ip6last_42_0= RULE_INT ) ) ) otherlv_43= ';' )? (otherlv_44= 'load' otherlv_45= ':' ( (lv_theLoad_46_0= RULE_INT ) ) otherlv_47= ';' )? (otherlv_48= 'state' otherlv_49= ':' ( ( (lv_theState_50_1= 'public' | lv_theState_50_2= 'private' ) ) ) otherlv_51= ';' )? (otherlv_52= 'hostname' otherlv_53= ':' ( (lv_hostname_54_0= RULE_ID ) ) otherlv_55= ';' )? ( (lv_iptable_56_0= ruleIpTable ) )* ( (lv_attributes_57_0= ruleAttribut ) )* otherlv_58= '}' )
            // InternalRdsl.g:1170:3: otherlv_0= 'instance' otherlv_1= 'of' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_instances_4_0= ruleInstance ) )* otherlv_5= 'name' otherlv_6= ':' ( (lv_name_7_0= RULE_ID ) ) ( (lv_fullname_8_0= ruleFullname ) )* otherlv_9= ';' (otherlv_10= 'count' otherlv_11= ':' ( (lv_val_12_0= RULE_INT ) ) otherlv_13= ';' )? (otherlv_14= 'numInstances' otherlv_15= ':' ( (lv_valnum_16_0= RULE_INT ) ) otherlv_17= ';' )? (otherlv_18= 'minAllowedInstances' otherlv_19= ':' ( (lv_valmin_20_0= RULE_INT ) ) otherlv_21= ';' )? (otherlv_22= 'maxAllowedInstances' otherlv_23= ':' ( (lv_valmax_24_0= RULE_INT ) ) otherlv_25= ';' )? (otherlv_26= 'adressType' otherlv_27= ':' ( (lv_ipAddress_28_0= ruleAType ) ) otherlv_29= ';' )? (otherlv_30= 'ipv4' otherlv_31= 'address' otherlv_32= ':' ( ( ( (lv_ip4_33_0= RULE_INT ) ) otherlv_34= '.' )* ( (lv_ip4last_35_0= RULE_INT ) ) ) otherlv_36= ';' )? (otherlv_37= 'ipv6' otherlv_38= 'address' otherlv_39= ':' ( ( ( (lv_ip6_40_0= RULE_INT ) ) otherlv_41= '.' )* ( (lv_ip6last_42_0= RULE_INT ) ) ) otherlv_43= ';' )? (otherlv_44= 'load' otherlv_45= ':' ( (lv_theLoad_46_0= RULE_INT ) ) otherlv_47= ';' )? (otherlv_48= 'state' otherlv_49= ':' ( ( (lv_theState_50_1= 'public' | lv_theState_50_2= 'private' ) ) ) otherlv_51= ';' )? (otherlv_52= 'hostname' otherlv_53= ':' ( (lv_hostname_54_0= RULE_ID ) ) otherlv_55= ';' )? ( (lv_iptable_56_0= ruleIpTable ) )* ( (lv_attributes_57_0= ruleAttribut ) )* otherlv_58= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_22); 

                	newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getInstanceKeyword_0());
                
            otherlv_1=(Token)match(input,32,FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getInstanceAccess().getOfKeyword_1());
                
            // InternalRdsl.g:1178:1: ( (otherlv_2= RULE_ID ) )
            // InternalRdsl.g:1179:1: (otherlv_2= RULE_ID )
            {
            // InternalRdsl.g:1179:1: (otherlv_2= RULE_ID )
            // InternalRdsl.g:1180:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInstanceRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_8); 

            		newLeafNode(otherlv_2, grammarAccess.getInstanceAccess().getComponentComponentCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_23); 

                	newLeafNode(otherlv_3, grammarAccess.getInstanceAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalRdsl.g:1195:1: ( (lv_instances_4_0= ruleInstance ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRdsl.g:1196:1: (lv_instances_4_0= ruleInstance )
            	    {
            	    // InternalRdsl.g:1196:1: (lv_instances_4_0= ruleInstance )
            	    // InternalRdsl.g:1197:3: lv_instances_4_0= ruleInstance
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInstanceAccess().getInstancesInstanceParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_23);
            	    lv_instances_4_0=ruleInstance();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInstanceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instances",
            	            		lv_instances_4_0, 
            	            		"org.xtext.Rdsl.Instance");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_5=(Token)match(input,33,FOLLOW_11); 

                	newLeafNode(otherlv_5, grammarAccess.getInstanceAccess().getNameKeyword_5());
                
            otherlv_6=(Token)match(input,18,FOLLOW_5); 

                	newLeafNode(otherlv_6, grammarAccess.getInstanceAccess().getColonKeyword_6());
                
            // InternalRdsl.g:1221:1: ( (lv_name_7_0= RULE_ID ) )
            // InternalRdsl.g:1222:1: (lv_name_7_0= RULE_ID )
            {
            // InternalRdsl.g:1222:1: (lv_name_7_0= RULE_ID )
            // InternalRdsl.g:1223:3: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            			newLeafNode(lv_name_7_0, grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInstanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_7_0, 
                    		"org.xtext.Rdsl.ID");
            	    

            }


            }

            // InternalRdsl.g:1239:2: ( (lv_fullname_8_0= ruleFullname ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_INT)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRdsl.g:1240:1: (lv_fullname_8_0= ruleFullname )
            	    {
            	    // InternalRdsl.g:1240:1: (lv_fullname_8_0= ruleFullname )
            	    // InternalRdsl.g:1241:3: lv_fullname_8_0= ruleFullname
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInstanceAccess().getFullnameFullnameParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_24);
            	    lv_fullname_8_0=ruleFullname();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInstanceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fullname",
            	            		lv_fullname_8_0, 
            	            		"org.xtext.Rdsl.Fullname");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_25); 

                	newLeafNode(otherlv_9, grammarAccess.getInstanceAccess().getSemicolonKeyword_9());
                
            // InternalRdsl.g:1261:1: (otherlv_10= 'count' otherlv_11= ':' ( (lv_val_12_0= RULE_INT ) ) otherlv_13= ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRdsl.g:1261:3: otherlv_10= 'count' otherlv_11= ':' ( (lv_val_12_0= RULE_INT ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,34,FOLLOW_11); 

                        	newLeafNode(otherlv_10, grammarAccess.getInstanceAccess().getCountKeyword_10_0());
                        
                    otherlv_11=(Token)match(input,18,FOLLOW_14); 

                        	newLeafNode(otherlv_11, grammarAccess.getInstanceAccess().getColonKeyword_10_1());
                        
                    // InternalRdsl.g:1269:1: ( (lv_val_12_0= RULE_INT ) )
                    // InternalRdsl.g:1270:1: (lv_val_12_0= RULE_INT )
                    {
                    // InternalRdsl.g:1270:1: (lv_val_12_0= RULE_INT )
                    // InternalRdsl.g:1271:3: lv_val_12_0= RULE_INT
                    {
                    lv_val_12_0=(Token)match(input,RULE_INT,FOLLOW_6); 

                    			newLeafNode(lv_val_12_0, grammarAccess.getInstanceAccess().getValINTTerminalRuleCall_10_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_12_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,13,FOLLOW_26); 

                        	newLeafNode(otherlv_13, grammarAccess.getInstanceAccess().getSemicolonKeyword_10_3());
                        

                    }
                    break;

            }

            // InternalRdsl.g:1291:3: (otherlv_14= 'numInstances' otherlv_15= ':' ( (lv_valnum_16_0= RULE_INT ) ) otherlv_17= ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRdsl.g:1291:5: otherlv_14= 'numInstances' otherlv_15= ':' ( (lv_valnum_16_0= RULE_INT ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,35,FOLLOW_11); 

                        	newLeafNode(otherlv_14, grammarAccess.getInstanceAccess().getNumInstancesKeyword_11_0());
                        
                    otherlv_15=(Token)match(input,18,FOLLOW_14); 

                        	newLeafNode(otherlv_15, grammarAccess.getInstanceAccess().getColonKeyword_11_1());
                        
                    // InternalRdsl.g:1299:1: ( (lv_valnum_16_0= RULE_INT ) )
                    // InternalRdsl.g:1300:1: (lv_valnum_16_0= RULE_INT )
                    {
                    // InternalRdsl.g:1300:1: (lv_valnum_16_0= RULE_INT )
                    // InternalRdsl.g:1301:3: lv_valnum_16_0= RULE_INT
                    {
                    lv_valnum_16_0=(Token)match(input,RULE_INT,FOLLOW_6); 

                    			newLeafNode(lv_valnum_16_0, grammarAccess.getInstanceAccess().getValnumINTTerminalRuleCall_11_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valnum",
                            		lv_valnum_16_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }

                    otherlv_17=(Token)match(input,13,FOLLOW_27); 

                        	newLeafNode(otherlv_17, grammarAccess.getInstanceAccess().getSemicolonKeyword_11_3());
                        

                    }
                    break;

            }

            // InternalRdsl.g:1321:3: (otherlv_18= 'minAllowedInstances' otherlv_19= ':' ( (lv_valmin_20_0= RULE_INT ) ) otherlv_21= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRdsl.g:1321:5: otherlv_18= 'minAllowedInstances' otherlv_19= ':' ( (lv_valmin_20_0= RULE_INT ) ) otherlv_21= ';'
                    {
                    otherlv_18=(Token)match(input,36,FOLLOW_11); 

                        	newLeafNode(otherlv_18, grammarAccess.getInstanceAccess().getMinAllowedInstancesKeyword_12_0());
                        
                    otherlv_19=(Token)match(input,18,FOLLOW_14); 

                        	newLeafNode(otherlv_19, grammarAccess.getInstanceAccess().getColonKeyword_12_1());
                        
                    // InternalRdsl.g:1329:1: ( (lv_valmin_20_0= RULE_INT ) )
                    // InternalRdsl.g:1330:1: (lv_valmin_20_0= RULE_INT )
                    {
                    // InternalRdsl.g:1330:1: (lv_valmin_20_0= RULE_INT )
                    // InternalRdsl.g:1331:3: lv_valmin_20_0= RULE_INT
                    {
                    lv_valmin_20_0=(Token)match(input,RULE_INT,FOLLOW_6); 

                    			newLeafNode(lv_valmin_20_0, grammarAccess.getInstanceAccess().getValminINTTerminalRuleCall_12_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valmin",
                            		lv_valmin_20_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }

                    otherlv_21=(Token)match(input,13,FOLLOW_28); 

                        	newLeafNode(otherlv_21, grammarAccess.getInstanceAccess().getSemicolonKeyword_12_3());
                        

                    }
                    break;

            }

            // InternalRdsl.g:1351:3: (otherlv_22= 'maxAllowedInstances' otherlv_23= ':' ( (lv_valmax_24_0= RULE_INT ) ) otherlv_25= ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRdsl.g:1351:5: otherlv_22= 'maxAllowedInstances' otherlv_23= ':' ( (lv_valmax_24_0= RULE_INT ) ) otherlv_25= ';'
                    {
                    otherlv_22=(Token)match(input,37,FOLLOW_11); 

                        	newLeafNode(otherlv_22, grammarAccess.getInstanceAccess().getMaxAllowedInstancesKeyword_13_0());
                        
                    otherlv_23=(Token)match(input,18,FOLLOW_14); 

                        	newLeafNode(otherlv_23, grammarAccess.getInstanceAccess().getColonKeyword_13_1());
                        
                    // InternalRdsl.g:1359:1: ( (lv_valmax_24_0= RULE_INT ) )
                    // InternalRdsl.g:1360:1: (lv_valmax_24_0= RULE_INT )
                    {
                    // InternalRdsl.g:1360:1: (lv_valmax_24_0= RULE_INT )
                    // InternalRdsl.g:1361:3: lv_valmax_24_0= RULE_INT
                    {
                    lv_valmax_24_0=(Token)match(input,RULE_INT,FOLLOW_6); 

                    			newLeafNode(lv_valmax_24_0, grammarAccess.getInstanceAccess().getValmaxINTTerminalRuleCall_13_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valmax",
                            		lv_valmax_24_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }

                    otherlv_25=(Token)match(input,13,FOLLOW_29); 

                        	newLeafNode(otherlv_25, grammarAccess.getInstanceAccess().getSemicolonKeyword_13_3());
                        

                    }
                    break;

            }

            // InternalRdsl.g:1381:3: (otherlv_26= 'adressType' otherlv_27= ':' ( (lv_ipAddress_28_0= ruleAType ) ) otherlv_29= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRdsl.g:1381:5: otherlv_26= 'adressType' otherlv_27= ':' ( (lv_ipAddress_28_0= ruleAType ) ) otherlv_29= ';'
                    {
                    otherlv_26=(Token)match(input,38,FOLLOW_11); 

                        	newLeafNode(otherlv_26, grammarAccess.getInstanceAccess().getAdressTypeKeyword_14_0());
                        
                    otherlv_27=(Token)match(input,18,FOLLOW_30); 

                        	newLeafNode(otherlv_27, grammarAccess.getInstanceAccess().getColonKeyword_14_1());
                        
                    // InternalRdsl.g:1389:1: ( (lv_ipAddress_28_0= ruleAType ) )
                    // InternalRdsl.g:1390:1: (lv_ipAddress_28_0= ruleAType )
                    {
                    // InternalRdsl.g:1390:1: (lv_ipAddress_28_0= ruleAType )
                    // InternalRdsl.g:1391:3: lv_ipAddress_28_0= ruleAType
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstanceAccess().getIpAddressATypeParserRuleCall_14_2_0()); 
                    	    
                    pushFollow(FOLLOW_6);
                    lv_ipAddress_28_0=ruleAType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInstanceRule());
                    	        }
                           		set(
                           			current, 
                           			"ipAddress",
                            		lv_ipAddress_28_0, 
                            		"org.xtext.Rdsl.AType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_29=(Token)match(input,13,FOLLOW_31); 

                        	newLeafNode(otherlv_29, grammarAccess.getInstanceAccess().getSemicolonKeyword_14_3());
                        

                    }
                    break;

            }

            // InternalRdsl.g:1411:3: (otherlv_30= 'ipv4' otherlv_31= 'address' otherlv_32= ':' ( ( ( (lv_ip4_33_0= RULE_INT ) ) otherlv_34= '.' )* ( (lv_ip4last_35_0= RULE_INT ) ) ) otherlv_36= ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRdsl.g:1411:5: otherlv_30= 'ipv4' otherlv_31= 'address' otherlv_32= ':' ( ( ( (lv_ip4_33_0= RULE_INT ) ) otherlv_34= '.' )* ( (lv_ip4last_35_0= RULE_INT ) ) ) otherlv_36= ';'
                    {
                    otherlv_30=(Token)match(input,39,FOLLOW_32); 

                        	newLeafNode(otherlv_30, grammarAccess.getInstanceAccess().getIpv4Keyword_15_0());
                        
                    otherlv_31=(Token)match(input,40,FOLLOW_11); 

                        	newLeafNode(otherlv_31, grammarAccess.getInstanceAccess().getAddressKeyword_15_1());
                        
                    otherlv_32=(Token)match(input,18,FOLLOW_14); 

                        	newLeafNode(otherlv_32, grammarAccess.getInstanceAccess().getColonKeyword_15_2());
                        
                    // InternalRdsl.g:1423:1: ( ( ( (lv_ip4_33_0= RULE_INT ) ) otherlv_34= '.' )* ( (lv_ip4last_35_0= RULE_INT ) ) )
                    // InternalRdsl.g:1423:2: ( ( (lv_ip4_33_0= RULE_INT ) ) otherlv_34= '.' )* ( (lv_ip4last_35_0= RULE_INT ) )
                    {
                    // InternalRdsl.g:1423:2: ( ( (lv_ip4_33_0= RULE_INT ) ) otherlv_34= '.' )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_INT) ) {
                            int LA25_1 = input.LA(2);

                            if ( (LA25_1==26) ) {
                                alt25=1;
                            }


                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalRdsl.g:1423:3: ( (lv_ip4_33_0= RULE_INT ) ) otherlv_34= '.'
                    	    {
                    	    // InternalRdsl.g:1423:3: ( (lv_ip4_33_0= RULE_INT ) )
                    	    // InternalRdsl.g:1424:1: (lv_ip4_33_0= RULE_INT )
                    	    {
                    	    // InternalRdsl.g:1424:1: (lv_ip4_33_0= RULE_INT )
                    	    // InternalRdsl.g:1425:3: lv_ip4_33_0= RULE_INT
                    	    {
                    	    lv_ip4_33_0=(Token)match(input,RULE_INT,FOLLOW_16); 

                    	    			newLeafNode(lv_ip4_33_0, grammarAccess.getInstanceAccess().getIp4INTTerminalRuleCall_15_3_0_0_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"ip4",
                    	            		lv_ip4_33_0, 
                    	            		"org.eclipse.xtext.common.Terminals.INT");
                    	    	    

                    	    }


                    	    }

                    	    otherlv_34=(Token)match(input,26,FOLLOW_14); 

                    	        	newLeafNode(otherlv_34, grammarAccess.getInstanceAccess().getFullStopKeyword_15_3_0_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    // InternalRdsl.g:1445:3: ( (lv_ip4last_35_0= RULE_INT ) )
                    // InternalRdsl.g:1446:1: (lv_ip4last_35_0= RULE_INT )
                    {
                    // InternalRdsl.g:1446:1: (lv_ip4last_35_0= RULE_INT )
                    // InternalRdsl.g:1447:3: lv_ip4last_35_0= RULE_INT
                    {
                    lv_ip4last_35_0=(Token)match(input,RULE_INT,FOLLOW_6); 

                    			newLeafNode(lv_ip4last_35_0, grammarAccess.getInstanceAccess().getIp4lastINTTerminalRuleCall_15_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ip4last",
                            		lv_ip4last_35_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }

                    otherlv_36=(Token)match(input,13,FOLLOW_33); 

                        	newLeafNode(otherlv_36, grammarAccess.getInstanceAccess().getSemicolonKeyword_15_4());
                        

                    }
                    break;

            }

            // InternalRdsl.g:1467:3: (otherlv_37= 'ipv6' otherlv_38= 'address' otherlv_39= ':' ( ( ( (lv_ip6_40_0= RULE_INT ) ) otherlv_41= '.' )* ( (lv_ip6last_42_0= RULE_INT ) ) ) otherlv_43= ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==41) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRdsl.g:1467:5: otherlv_37= 'ipv6' otherlv_38= 'address' otherlv_39= ':' ( ( ( (lv_ip6_40_0= RULE_INT ) ) otherlv_41= '.' )* ( (lv_ip6last_42_0= RULE_INT ) ) ) otherlv_43= ';'
                    {
                    otherlv_37=(Token)match(input,41,FOLLOW_32); 

                        	newLeafNode(otherlv_37, grammarAccess.getInstanceAccess().getIpv6Keyword_16_0());
                        
                    otherlv_38=(Token)match(input,40,FOLLOW_11); 

                        	newLeafNode(otherlv_38, grammarAccess.getInstanceAccess().getAddressKeyword_16_1());
                        
                    otherlv_39=(Token)match(input,18,FOLLOW_14); 

                        	newLeafNode(otherlv_39, grammarAccess.getInstanceAccess().getColonKeyword_16_2());
                        
                    // InternalRdsl.g:1479:1: ( ( ( (lv_ip6_40_0= RULE_INT ) ) otherlv_41= '.' )* ( (lv_ip6last_42_0= RULE_INT ) ) )
                    // InternalRdsl.g:1479:2: ( ( (lv_ip6_40_0= RULE_INT ) ) otherlv_41= '.' )* ( (lv_ip6last_42_0= RULE_INT ) )
                    {
                    // InternalRdsl.g:1479:2: ( ( (lv_ip6_40_0= RULE_INT ) ) otherlv_41= '.' )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_INT) ) {
                            int LA27_1 = input.LA(2);

                            if ( (LA27_1==26) ) {
                                alt27=1;
                            }


                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalRdsl.g:1479:3: ( (lv_ip6_40_0= RULE_INT ) ) otherlv_41= '.'
                    	    {
                    	    // InternalRdsl.g:1479:3: ( (lv_ip6_40_0= RULE_INT ) )
                    	    // InternalRdsl.g:1480:1: (lv_ip6_40_0= RULE_INT )
                    	    {
                    	    // InternalRdsl.g:1480:1: (lv_ip6_40_0= RULE_INT )
                    	    // InternalRdsl.g:1481:3: lv_ip6_40_0= RULE_INT
                    	    {
                    	    lv_ip6_40_0=(Token)match(input,RULE_INT,FOLLOW_16); 

                    	    			newLeafNode(lv_ip6_40_0, grammarAccess.getInstanceAccess().getIp6INTTerminalRuleCall_16_3_0_0_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"ip6",
                    	            		lv_ip6_40_0, 
                    	            		"org.eclipse.xtext.common.Terminals.INT");
                    	    	    

                    	    }


                    	    }

                    	    otherlv_41=(Token)match(input,26,FOLLOW_14); 

                    	        	newLeafNode(otherlv_41, grammarAccess.getInstanceAccess().getFullStopKeyword_16_3_0_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    // InternalRdsl.g:1501:3: ( (lv_ip6last_42_0= RULE_INT ) )
                    // InternalRdsl.g:1502:1: (lv_ip6last_42_0= RULE_INT )
                    {
                    // InternalRdsl.g:1502:1: (lv_ip6last_42_0= RULE_INT )
                    // InternalRdsl.g:1503:3: lv_ip6last_42_0= RULE_INT
                    {
                    lv_ip6last_42_0=(Token)match(input,RULE_INT,FOLLOW_6); 

                    			newLeafNode(lv_ip6last_42_0, grammarAccess.getInstanceAccess().getIp6lastINTTerminalRuleCall_16_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ip6last",
                            		lv_ip6last_42_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }

                    otherlv_43=(Token)match(input,13,FOLLOW_34); 

                        	newLeafNode(otherlv_43, grammarAccess.getInstanceAccess().getSemicolonKeyword_16_4());
                        

                    }
                    break;

            }

            // InternalRdsl.g:1523:3: (otherlv_44= 'load' otherlv_45= ':' ( (lv_theLoad_46_0= RULE_INT ) ) otherlv_47= ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==42) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRdsl.g:1523:5: otherlv_44= 'load' otherlv_45= ':' ( (lv_theLoad_46_0= RULE_INT ) ) otherlv_47= ';'
                    {
                    otherlv_44=(Token)match(input,42,FOLLOW_11); 

                        	newLeafNode(otherlv_44, grammarAccess.getInstanceAccess().getLoadKeyword_17_0());
                        
                    otherlv_45=(Token)match(input,18,FOLLOW_14); 

                        	newLeafNode(otherlv_45, grammarAccess.getInstanceAccess().getColonKeyword_17_1());
                        
                    // InternalRdsl.g:1531:1: ( (lv_theLoad_46_0= RULE_INT ) )
                    // InternalRdsl.g:1532:1: (lv_theLoad_46_0= RULE_INT )
                    {
                    // InternalRdsl.g:1532:1: (lv_theLoad_46_0= RULE_INT )
                    // InternalRdsl.g:1533:3: lv_theLoad_46_0= RULE_INT
                    {
                    lv_theLoad_46_0=(Token)match(input,RULE_INT,FOLLOW_6); 

                    			newLeafNode(lv_theLoad_46_0, grammarAccess.getInstanceAccess().getTheLoadINTTerminalRuleCall_17_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"theLoad",
                            		lv_theLoad_46_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }

                    otherlv_47=(Token)match(input,13,FOLLOW_35); 

                        	newLeafNode(otherlv_47, grammarAccess.getInstanceAccess().getSemicolonKeyword_17_3());
                        

                    }
                    break;

            }

            // InternalRdsl.g:1553:3: (otherlv_48= 'state' otherlv_49= ':' ( ( (lv_theState_50_1= 'public' | lv_theState_50_2= 'private' ) ) ) otherlv_51= ';' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==43) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRdsl.g:1553:5: otherlv_48= 'state' otherlv_49= ':' ( ( (lv_theState_50_1= 'public' | lv_theState_50_2= 'private' ) ) ) otherlv_51= ';'
                    {
                    otherlv_48=(Token)match(input,43,FOLLOW_11); 

                        	newLeafNode(otherlv_48, grammarAccess.getInstanceAccess().getStateKeyword_18_0());
                        
                    otherlv_49=(Token)match(input,18,FOLLOW_36); 

                        	newLeafNode(otherlv_49, grammarAccess.getInstanceAccess().getColonKeyword_18_1());
                        
                    // InternalRdsl.g:1561:1: ( ( (lv_theState_50_1= 'public' | lv_theState_50_2= 'private' ) ) )
                    // InternalRdsl.g:1562:1: ( (lv_theState_50_1= 'public' | lv_theState_50_2= 'private' ) )
                    {
                    // InternalRdsl.g:1562:1: ( (lv_theState_50_1= 'public' | lv_theState_50_2= 'private' ) )
                    // InternalRdsl.g:1563:1: (lv_theState_50_1= 'public' | lv_theState_50_2= 'private' )
                    {
                    // InternalRdsl.g:1563:1: (lv_theState_50_1= 'public' | lv_theState_50_2= 'private' )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==44) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==45) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalRdsl.g:1564:3: lv_theState_50_1= 'public'
                            {
                            lv_theState_50_1=(Token)match(input,44,FOLLOW_6); 

                                    newLeafNode(lv_theState_50_1, grammarAccess.getInstanceAccess().getTheStatePublicKeyword_18_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInstanceRule());
                            	        }
                                   		setWithLastConsumed(current, "theState", lv_theState_50_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // InternalRdsl.g:1576:8: lv_theState_50_2= 'private'
                            {
                            lv_theState_50_2=(Token)match(input,45,FOLLOW_6); 

                                    newLeafNode(lv_theState_50_2, grammarAccess.getInstanceAccess().getTheStatePrivateKeyword_18_2_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInstanceRule());
                            	        }
                                   		setWithLastConsumed(current, "theState", lv_theState_50_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    otherlv_51=(Token)match(input,13,FOLLOW_37); 

                        	newLeafNode(otherlv_51, grammarAccess.getInstanceAccess().getSemicolonKeyword_18_3());
                        

                    }
                    break;

            }

            // InternalRdsl.g:1595:3: (otherlv_52= 'hostname' otherlv_53= ':' ( (lv_hostname_54_0= RULE_ID ) ) otherlv_55= ';' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==46) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRdsl.g:1595:5: otherlv_52= 'hostname' otherlv_53= ':' ( (lv_hostname_54_0= RULE_ID ) ) otherlv_55= ';'
                    {
                    otherlv_52=(Token)match(input,46,FOLLOW_11); 

                        	newLeafNode(otherlv_52, grammarAccess.getInstanceAccess().getHostnameKeyword_19_0());
                        
                    otherlv_53=(Token)match(input,18,FOLLOW_5); 

                        	newLeafNode(otherlv_53, grammarAccess.getInstanceAccess().getColonKeyword_19_1());
                        
                    // InternalRdsl.g:1603:1: ( (lv_hostname_54_0= RULE_ID ) )
                    // InternalRdsl.g:1604:1: (lv_hostname_54_0= RULE_ID )
                    {
                    // InternalRdsl.g:1604:1: (lv_hostname_54_0= RULE_ID )
                    // InternalRdsl.g:1605:3: lv_hostname_54_0= RULE_ID
                    {
                    lv_hostname_54_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    			newLeafNode(lv_hostname_54_0, grammarAccess.getInstanceAccess().getHostnameIDTerminalRuleCall_19_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"hostname",
                            		lv_hostname_54_0, 
                            		"org.xtext.Rdsl.ID");
                    	    

                    }


                    }

                    otherlv_55=(Token)match(input,13,FOLLOW_38); 

                        	newLeafNode(otherlv_55, grammarAccess.getInstanceAccess().getSemicolonKeyword_19_3());
                        

                    }
                    break;

            }

            // InternalRdsl.g:1625:3: ( (lv_iptable_56_0= ruleIpTable ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==47) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRdsl.g:1626:1: (lv_iptable_56_0= ruleIpTable )
            	    {
            	    // InternalRdsl.g:1626:1: (lv_iptable_56_0= ruleIpTable )
            	    // InternalRdsl.g:1627:3: lv_iptable_56_0= ruleIpTable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInstanceAccess().getIptableIpTableParserRuleCall_20_0()); 
            	    	    
            	    pushFollow(FOLLOW_38);
            	    lv_iptable_56_0=ruleIpTable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInstanceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"iptable",
            	            		lv_iptable_56_0, 
            	            		"org.xtext.Rdsl.IpTable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // InternalRdsl.g:1643:3: ( (lv_attributes_57_0= ruleAttribut ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalRdsl.g:1644:1: (lv_attributes_57_0= ruleAttribut )
            	    {
            	    // InternalRdsl.g:1644:1: (lv_attributes_57_0= ruleAttribut )
            	    // InternalRdsl.g:1645:3: lv_attributes_57_0= ruleAttribut
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInstanceAccess().getAttributesAttributParserRuleCall_21_0()); 
            	    	    
            	    pushFollow(FOLLOW_39);
            	    lv_attributes_57_0=ruleAttribut();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInstanceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_57_0, 
            	            		"org.xtext.Rdsl.Attribut");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_58=(Token)match(input,16,FOLLOW_2); 

                	newLeafNode(otherlv_58, grammarAccess.getInstanceAccess().getRightCurlyBracketKeyword_22());
                

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


    // $ANTLR start "entryRuleIpTable"
    // InternalRdsl.g:1673:1: entryRuleIpTable returns [EObject current=null] : iv_ruleIpTable= ruleIpTable EOF ;
    public final EObject entryRuleIpTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIpTable = null;


        try {
            // InternalRdsl.g:1674:2: (iv_ruleIpTable= ruleIpTable EOF )
            // InternalRdsl.g:1675:2: iv_ruleIpTable= ruleIpTable EOF
            {
             newCompositeNode(grammarAccess.getIpTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIpTable=ruleIpTable();

            state._fsp--;

             current =iv_ruleIpTable; 
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
    // $ANTLR end "entryRuleIpTable"


    // $ANTLR start "ruleIpTable"
    // InternalRdsl.g:1682:1: ruleIpTable returns [EObject current=null] : (otherlv_0= 'iptables' otherlv_1= '-A' ( ( (lv_traffic_2_1= 'INPUT' | lv_traffic_2_2= 'OUTPUT' | lv_traffic_2_3= 'FORWARD' ) ) ) (otherlv_3= '-s' ( ( (lv_source_4_0= RULE_INT ) ) otherlv_5= '.' )+ ( (lv_sourcefinal_6_0= RULE_INT ) ) ) (otherlv_7= '-d' ( ( (lv_destination_8_0= RULE_INT ) ) otherlv_9= '.' )+ ( (lv_destinationfinal_10_0= RULE_INT ) ) ) (otherlv_11= '-p' ( ( (lv_protocol_12_1= 'tcp' | lv_protocol_12_2= 'udp' ) ) ) ) otherlv_13= '-j' ( ( (lv_target_14_1= 'ACCEPT' | lv_target_14_2= 'REJECT' | lv_target_14_3= 'DROP' ) ) ) otherlv_15= ';' ) ;
    public final EObject ruleIpTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_traffic_2_1=null;
        Token lv_traffic_2_2=null;
        Token lv_traffic_2_3=null;
        Token otherlv_3=null;
        Token lv_source_4_0=null;
        Token otherlv_5=null;
        Token lv_sourcefinal_6_0=null;
        Token otherlv_7=null;
        Token lv_destination_8_0=null;
        Token otherlv_9=null;
        Token lv_destinationfinal_10_0=null;
        Token otherlv_11=null;
        Token lv_protocol_12_1=null;
        Token lv_protocol_12_2=null;
        Token otherlv_13=null;
        Token lv_target_14_1=null;
        Token lv_target_14_2=null;
        Token lv_target_14_3=null;
        Token otherlv_15=null;

         enterRule(); 
            
        try {
            // InternalRdsl.g:1685:28: ( (otherlv_0= 'iptables' otherlv_1= '-A' ( ( (lv_traffic_2_1= 'INPUT' | lv_traffic_2_2= 'OUTPUT' | lv_traffic_2_3= 'FORWARD' ) ) ) (otherlv_3= '-s' ( ( (lv_source_4_0= RULE_INT ) ) otherlv_5= '.' )+ ( (lv_sourcefinal_6_0= RULE_INT ) ) ) (otherlv_7= '-d' ( ( (lv_destination_8_0= RULE_INT ) ) otherlv_9= '.' )+ ( (lv_destinationfinal_10_0= RULE_INT ) ) ) (otherlv_11= '-p' ( ( (lv_protocol_12_1= 'tcp' | lv_protocol_12_2= 'udp' ) ) ) ) otherlv_13= '-j' ( ( (lv_target_14_1= 'ACCEPT' | lv_target_14_2= 'REJECT' | lv_target_14_3= 'DROP' ) ) ) otherlv_15= ';' ) )
            // InternalRdsl.g:1686:1: (otherlv_0= 'iptables' otherlv_1= '-A' ( ( (lv_traffic_2_1= 'INPUT' | lv_traffic_2_2= 'OUTPUT' | lv_traffic_2_3= 'FORWARD' ) ) ) (otherlv_3= '-s' ( ( (lv_source_4_0= RULE_INT ) ) otherlv_5= '.' )+ ( (lv_sourcefinal_6_0= RULE_INT ) ) ) (otherlv_7= '-d' ( ( (lv_destination_8_0= RULE_INT ) ) otherlv_9= '.' )+ ( (lv_destinationfinal_10_0= RULE_INT ) ) ) (otherlv_11= '-p' ( ( (lv_protocol_12_1= 'tcp' | lv_protocol_12_2= 'udp' ) ) ) ) otherlv_13= '-j' ( ( (lv_target_14_1= 'ACCEPT' | lv_target_14_2= 'REJECT' | lv_target_14_3= 'DROP' ) ) ) otherlv_15= ';' )
            {
            // InternalRdsl.g:1686:1: (otherlv_0= 'iptables' otherlv_1= '-A' ( ( (lv_traffic_2_1= 'INPUT' | lv_traffic_2_2= 'OUTPUT' | lv_traffic_2_3= 'FORWARD' ) ) ) (otherlv_3= '-s' ( ( (lv_source_4_0= RULE_INT ) ) otherlv_5= '.' )+ ( (lv_sourcefinal_6_0= RULE_INT ) ) ) (otherlv_7= '-d' ( ( (lv_destination_8_0= RULE_INT ) ) otherlv_9= '.' )+ ( (lv_destinationfinal_10_0= RULE_INT ) ) ) (otherlv_11= '-p' ( ( (lv_protocol_12_1= 'tcp' | lv_protocol_12_2= 'udp' ) ) ) ) otherlv_13= '-j' ( ( (lv_target_14_1= 'ACCEPT' | lv_target_14_2= 'REJECT' | lv_target_14_3= 'DROP' ) ) ) otherlv_15= ';' )
            // InternalRdsl.g:1686:3: otherlv_0= 'iptables' otherlv_1= '-A' ( ( (lv_traffic_2_1= 'INPUT' | lv_traffic_2_2= 'OUTPUT' | lv_traffic_2_3= 'FORWARD' ) ) ) (otherlv_3= '-s' ( ( (lv_source_4_0= RULE_INT ) ) otherlv_5= '.' )+ ( (lv_sourcefinal_6_0= RULE_INT ) ) ) (otherlv_7= '-d' ( ( (lv_destination_8_0= RULE_INT ) ) otherlv_9= '.' )+ ( (lv_destinationfinal_10_0= RULE_INT ) ) ) (otherlv_11= '-p' ( ( (lv_protocol_12_1= 'tcp' | lv_protocol_12_2= 'udp' ) ) ) ) otherlv_13= '-j' ( ( (lv_target_14_1= 'ACCEPT' | lv_target_14_2= 'REJECT' | lv_target_14_3= 'DROP' ) ) ) otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_40); 

                	newLeafNode(otherlv_0, grammarAccess.getIpTableAccess().getIptablesKeyword_0());
                
            otherlv_1=(Token)match(input,48,FOLLOW_41); 

                	newLeafNode(otherlv_1, grammarAccess.getIpTableAccess().getAKeyword_1());
                
            // InternalRdsl.g:1694:1: ( ( (lv_traffic_2_1= 'INPUT' | lv_traffic_2_2= 'OUTPUT' | lv_traffic_2_3= 'FORWARD' ) ) )
            // InternalRdsl.g:1695:1: ( (lv_traffic_2_1= 'INPUT' | lv_traffic_2_2= 'OUTPUT' | lv_traffic_2_3= 'FORWARD' ) )
            {
            // InternalRdsl.g:1695:1: ( (lv_traffic_2_1= 'INPUT' | lv_traffic_2_2= 'OUTPUT' | lv_traffic_2_3= 'FORWARD' ) )
            // InternalRdsl.g:1696:1: (lv_traffic_2_1= 'INPUT' | lv_traffic_2_2= 'OUTPUT' | lv_traffic_2_3= 'FORWARD' )
            {
            // InternalRdsl.g:1696:1: (lv_traffic_2_1= 'INPUT' | lv_traffic_2_2= 'OUTPUT' | lv_traffic_2_3= 'FORWARD' )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt35=1;
                }
                break;
            case 50:
                {
                alt35=2;
                }
                break;
            case 51:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalRdsl.g:1697:3: lv_traffic_2_1= 'INPUT'
                    {
                    lv_traffic_2_1=(Token)match(input,49,FOLLOW_42); 

                            newLeafNode(lv_traffic_2_1, grammarAccess.getIpTableAccess().getTrafficINPUTKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIpTableRule());
                    	        }
                           		setWithLastConsumed(current, "traffic", lv_traffic_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // InternalRdsl.g:1709:8: lv_traffic_2_2= 'OUTPUT'
                    {
                    lv_traffic_2_2=(Token)match(input,50,FOLLOW_42); 

                            newLeafNode(lv_traffic_2_2, grammarAccess.getIpTableAccess().getTrafficOUTPUTKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIpTableRule());
                    	        }
                           		setWithLastConsumed(current, "traffic", lv_traffic_2_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // InternalRdsl.g:1721:8: lv_traffic_2_3= 'FORWARD'
                    {
                    lv_traffic_2_3=(Token)match(input,51,FOLLOW_42); 

                            newLeafNode(lv_traffic_2_3, grammarAccess.getIpTableAccess().getTrafficFORWARDKeyword_2_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIpTableRule());
                    	        }
                           		setWithLastConsumed(current, "traffic", lv_traffic_2_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            // InternalRdsl.g:1736:2: (otherlv_3= '-s' ( ( (lv_source_4_0= RULE_INT ) ) otherlv_5= '.' )+ ( (lv_sourcefinal_6_0= RULE_INT ) ) )
            // InternalRdsl.g:1736:4: otherlv_3= '-s' ( ( (lv_source_4_0= RULE_INT ) ) otherlv_5= '.' )+ ( (lv_sourcefinal_6_0= RULE_INT ) )
            {
            otherlv_3=(Token)match(input,52,FOLLOW_14); 

                	newLeafNode(otherlv_3, grammarAccess.getIpTableAccess().getSKeyword_3_0());
                
            // InternalRdsl.g:1740:1: ( ( (lv_source_4_0= RULE_INT ) ) otherlv_5= '.' )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_INT) ) {
                    int LA36_1 = input.LA(2);

                    if ( (LA36_1==26) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // InternalRdsl.g:1740:2: ( (lv_source_4_0= RULE_INT ) ) otherlv_5= '.'
            	    {
            	    // InternalRdsl.g:1740:2: ( (lv_source_4_0= RULE_INT ) )
            	    // InternalRdsl.g:1741:1: (lv_source_4_0= RULE_INT )
            	    {
            	    // InternalRdsl.g:1741:1: (lv_source_4_0= RULE_INT )
            	    // InternalRdsl.g:1742:3: lv_source_4_0= RULE_INT
            	    {
            	    lv_source_4_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            	    			newLeafNode(lv_source_4_0, grammarAccess.getIpTableAccess().getSourceINTTerminalRuleCall_3_1_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIpTableRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"source",
            	            		lv_source_4_0, 
            	            		"org.eclipse.xtext.common.Terminals.INT");
            	    	    

            	    }


            	    }

            	    otherlv_5=(Token)match(input,26,FOLLOW_14); 

            	        	newLeafNode(otherlv_5, grammarAccess.getIpTableAccess().getFullStopKeyword_3_1_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            // InternalRdsl.g:1762:3: ( (lv_sourcefinal_6_0= RULE_INT ) )
            // InternalRdsl.g:1763:1: (lv_sourcefinal_6_0= RULE_INT )
            {
            // InternalRdsl.g:1763:1: (lv_sourcefinal_6_0= RULE_INT )
            // InternalRdsl.g:1764:3: lv_sourcefinal_6_0= RULE_INT
            {
            lv_sourcefinal_6_0=(Token)match(input,RULE_INT,FOLLOW_43); 

            			newLeafNode(lv_sourcefinal_6_0, grammarAccess.getIpTableAccess().getSourcefinalINTTerminalRuleCall_3_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIpTableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sourcefinal",
                    		lv_sourcefinal_6_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }


            }

            // InternalRdsl.g:1780:3: (otherlv_7= '-d' ( ( (lv_destination_8_0= RULE_INT ) ) otherlv_9= '.' )+ ( (lv_destinationfinal_10_0= RULE_INT ) ) )
            // InternalRdsl.g:1780:5: otherlv_7= '-d' ( ( (lv_destination_8_0= RULE_INT ) ) otherlv_9= '.' )+ ( (lv_destinationfinal_10_0= RULE_INT ) )
            {
            otherlv_7=(Token)match(input,53,FOLLOW_14); 

                	newLeafNode(otherlv_7, grammarAccess.getIpTableAccess().getDKeyword_4_0());
                
            // InternalRdsl.g:1784:1: ( ( (lv_destination_8_0= RULE_INT ) ) otherlv_9= '.' )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_INT) ) {
                    int LA37_1 = input.LA(2);

                    if ( (LA37_1==26) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // InternalRdsl.g:1784:2: ( (lv_destination_8_0= RULE_INT ) ) otherlv_9= '.'
            	    {
            	    // InternalRdsl.g:1784:2: ( (lv_destination_8_0= RULE_INT ) )
            	    // InternalRdsl.g:1785:1: (lv_destination_8_0= RULE_INT )
            	    {
            	    // InternalRdsl.g:1785:1: (lv_destination_8_0= RULE_INT )
            	    // InternalRdsl.g:1786:3: lv_destination_8_0= RULE_INT
            	    {
            	    lv_destination_8_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            	    			newLeafNode(lv_destination_8_0, grammarAccess.getIpTableAccess().getDestinationINTTerminalRuleCall_4_1_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIpTableRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"destination",
            	            		lv_destination_8_0, 
            	            		"org.eclipse.xtext.common.Terminals.INT");
            	    	    

            	    }


            	    }

            	    otherlv_9=(Token)match(input,26,FOLLOW_14); 

            	        	newLeafNode(otherlv_9, grammarAccess.getIpTableAccess().getFullStopKeyword_4_1_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            // InternalRdsl.g:1806:3: ( (lv_destinationfinal_10_0= RULE_INT ) )
            // InternalRdsl.g:1807:1: (lv_destinationfinal_10_0= RULE_INT )
            {
            // InternalRdsl.g:1807:1: (lv_destinationfinal_10_0= RULE_INT )
            // InternalRdsl.g:1808:3: lv_destinationfinal_10_0= RULE_INT
            {
            lv_destinationfinal_10_0=(Token)match(input,RULE_INT,FOLLOW_44); 

            			newLeafNode(lv_destinationfinal_10_0, grammarAccess.getIpTableAccess().getDestinationfinalINTTerminalRuleCall_4_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIpTableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"destinationfinal",
                    		lv_destinationfinal_10_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }


            }

            // InternalRdsl.g:1824:3: (otherlv_11= '-p' ( ( (lv_protocol_12_1= 'tcp' | lv_protocol_12_2= 'udp' ) ) ) )
            // InternalRdsl.g:1824:5: otherlv_11= '-p' ( ( (lv_protocol_12_1= 'tcp' | lv_protocol_12_2= 'udp' ) ) )
            {
            otherlv_11=(Token)match(input,54,FOLLOW_45); 

                	newLeafNode(otherlv_11, grammarAccess.getIpTableAccess().getPKeyword_5_0());
                
            // InternalRdsl.g:1828:1: ( ( (lv_protocol_12_1= 'tcp' | lv_protocol_12_2= 'udp' ) ) )
            // InternalRdsl.g:1829:1: ( (lv_protocol_12_1= 'tcp' | lv_protocol_12_2= 'udp' ) )
            {
            // InternalRdsl.g:1829:1: ( (lv_protocol_12_1= 'tcp' | lv_protocol_12_2= 'udp' ) )
            // InternalRdsl.g:1830:1: (lv_protocol_12_1= 'tcp' | lv_protocol_12_2= 'udp' )
            {
            // InternalRdsl.g:1830:1: (lv_protocol_12_1= 'tcp' | lv_protocol_12_2= 'udp' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==55) ) {
                alt38=1;
            }
            else if ( (LA38_0==56) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalRdsl.g:1831:3: lv_protocol_12_1= 'tcp'
                    {
                    lv_protocol_12_1=(Token)match(input,55,FOLLOW_46); 

                            newLeafNode(lv_protocol_12_1, grammarAccess.getIpTableAccess().getProtocolTcpKeyword_5_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIpTableRule());
                    	        }
                           		setWithLastConsumed(current, "protocol", lv_protocol_12_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // InternalRdsl.g:1843:8: lv_protocol_12_2= 'udp'
                    {
                    lv_protocol_12_2=(Token)match(input,56,FOLLOW_46); 

                            newLeafNode(lv_protocol_12_2, grammarAccess.getIpTableAccess().getProtocolUdpKeyword_5_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIpTableRule());
                    	        }
                           		setWithLastConsumed(current, "protocol", lv_protocol_12_2, null);
                    	    

                    }
                    break;

            }


            }


            }


            }

            otherlv_13=(Token)match(input,57,FOLLOW_47); 

                	newLeafNode(otherlv_13, grammarAccess.getIpTableAccess().getJKeyword_6());
                
            // InternalRdsl.g:1862:1: ( ( (lv_target_14_1= 'ACCEPT' | lv_target_14_2= 'REJECT' | lv_target_14_3= 'DROP' ) ) )
            // InternalRdsl.g:1863:1: ( (lv_target_14_1= 'ACCEPT' | lv_target_14_2= 'REJECT' | lv_target_14_3= 'DROP' ) )
            {
            // InternalRdsl.g:1863:1: ( (lv_target_14_1= 'ACCEPT' | lv_target_14_2= 'REJECT' | lv_target_14_3= 'DROP' ) )
            // InternalRdsl.g:1864:1: (lv_target_14_1= 'ACCEPT' | lv_target_14_2= 'REJECT' | lv_target_14_3= 'DROP' )
            {
            // InternalRdsl.g:1864:1: (lv_target_14_1= 'ACCEPT' | lv_target_14_2= 'REJECT' | lv_target_14_3= 'DROP' )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt39=1;
                }
                break;
            case 59:
                {
                alt39=2;
                }
                break;
            case 60:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalRdsl.g:1865:3: lv_target_14_1= 'ACCEPT'
                    {
                    lv_target_14_1=(Token)match(input,58,FOLLOW_6); 

                            newLeafNode(lv_target_14_1, grammarAccess.getIpTableAccess().getTargetACCEPTKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIpTableRule());
                    	        }
                           		setWithLastConsumed(current, "target", lv_target_14_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // InternalRdsl.g:1877:8: lv_target_14_2= 'REJECT'
                    {
                    lv_target_14_2=(Token)match(input,59,FOLLOW_6); 

                            newLeafNode(lv_target_14_2, grammarAccess.getIpTableAccess().getTargetREJECTKeyword_7_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIpTableRule());
                    	        }
                           		setWithLastConsumed(current, "target", lv_target_14_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // InternalRdsl.g:1889:8: lv_target_14_3= 'DROP'
                    {
                    lv_target_14_3=(Token)match(input,60,FOLLOW_6); 

                            newLeafNode(lv_target_14_3, grammarAccess.getIpTableAccess().getTargetDROPKeyword_7_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIpTableRule());
                    	        }
                           		setWithLastConsumed(current, "target", lv_target_14_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_15=(Token)match(input,13,FOLLOW_2); 

                	newLeafNode(otherlv_15, grammarAccess.getIpTableAccess().getSemicolonKeyword_8());
                

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
    // $ANTLR end "ruleIpTable"


    // $ANTLR start "entryRuleAttribut"
    // InternalRdsl.g:1916:1: entryRuleAttribut returns [EObject current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final EObject entryRuleAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribut = null;


        try {
            // InternalRdsl.g:1917:2: (iv_ruleAttribut= ruleAttribut EOF )
            // InternalRdsl.g:1918:2: iv_ruleAttribut= ruleAttribut EOF
            {
             newCompositeNode(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribut=ruleAttribut();

            state._fsp--;

             current =iv_ruleAttribut; 
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
    // $ANTLR end "entryRuleAttribut"


    // $ANTLR start "ruleAttribut"
    // InternalRdsl.g:1925:1: ruleAttribut returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_valeur_2_0= ruleVAL ) ) otherlv_3= ';' ) ;
    public final EObject ruleAttribut() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_valeur_2_0 = null;


         enterRule(); 
            
        try {
            // InternalRdsl.g:1928:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_valeur_2_0= ruleVAL ) ) otherlv_3= ';' ) )
            // InternalRdsl.g:1929:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_valeur_2_0= ruleVAL ) ) otherlv_3= ';' )
            {
            // InternalRdsl.g:1929:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_valeur_2_0= ruleVAL ) ) otherlv_3= ';' )
            // InternalRdsl.g:1929:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_valeur_2_0= ruleVAL ) ) otherlv_3= ';'
            {
            // InternalRdsl.g:1929:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdsl.g:1930:1: (lv_name_0_0= RULE_ID )
            {
            // InternalRdsl.g:1930:1: (lv_name_0_0= RULE_ID )
            // InternalRdsl.g:1931:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.xtext.Rdsl.ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_48); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributAccess().getColonKeyword_1());
                
            // InternalRdsl.g:1951:1: ( (lv_valeur_2_0= ruleVAL ) )
            // InternalRdsl.g:1952:1: (lv_valeur_2_0= ruleVAL )
            {
            // InternalRdsl.g:1952:1: (lv_valeur_2_0= ruleVAL )
            // InternalRdsl.g:1953:3: lv_valeur_2_0= ruleVAL
            {
             
            	        newCompositeNode(grammarAccess.getAttributAccess().getValeurVALParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_6);
            lv_valeur_2_0=ruleVAL();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributRule());
            	        }
                   		set(
                   			current, 
                   			"valeur",
                    		lv_valeur_2_0, 
                    		"org.xtext.Rdsl.VAL");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

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


    // $ANTLR start "entryRuleFullname"
    // InternalRdsl.g:1981:1: entryRuleFullname returns [String current=null] : iv_ruleFullname= ruleFullname EOF ;
    public final String entryRuleFullname() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFullname = null;


        try {
            // InternalRdsl.g:1982:2: (iv_ruleFullname= ruleFullname EOF )
            // InternalRdsl.g:1983:2: iv_ruleFullname= ruleFullname EOF
            {
             newCompositeNode(grammarAccess.getFullnameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFullname=ruleFullname();

            state._fsp--;

             current =iv_ruleFullname.getText(); 
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
    // $ANTLR end "entryRuleFullname"


    // $ANTLR start "ruleFullname"
    // InternalRdsl.g:1990:1: ruleFullname returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFullname() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalRdsl.g:1993:28: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) )
            // InternalRdsl.g:1994:1: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
            {
            // InternalRdsl.g:1994:1: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_INT) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalRdsl.g:1994:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getFullnameAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalRdsl.g:2002:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getFullnameAccess().getINTTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleFullname"


    // $ANTLR start "entryRuleVAL"
    // InternalRdsl.g:2017:1: entryRuleVAL returns [String current=null] : iv_ruleVAL= ruleVAL EOF ;
    public final String entryRuleVAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVAL = null;


        try {
            // InternalRdsl.g:2018:2: (iv_ruleVAL= ruleVAL EOF )
            // InternalRdsl.g:2019:2: iv_ruleVAL= ruleVAL EOF
            {
             newCompositeNode(grammarAccess.getVALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVAL=ruleVAL();

            state._fsp--;

             current =iv_ruleVAL.getText(); 
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
    // $ANTLR end "entryRuleVAL"


    // $ANTLR start "ruleVAL"
    // InternalRdsl.g:2026:1: ruleVAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BOOLEAN_0= RULE_BOOLEAN | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleVAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOLEAN_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;

         enterRule(); 
            
        try {
            // InternalRdsl.g:2029:28: ( (this_BOOLEAN_0= RULE_BOOLEAN | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) )
            // InternalRdsl.g:2030:1: (this_BOOLEAN_0= RULE_BOOLEAN | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING )
            {
            // InternalRdsl.g:2030:1: (this_BOOLEAN_0= RULE_BOOLEAN | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING )
            int alt41=3;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt41=1;
                }
                break;
            case RULE_INT:
                {
                alt41=2;
                }
                break;
            case RULE_STRING:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalRdsl.g:2030:6: this_BOOLEAN_0= RULE_BOOLEAN
                    {
                    this_BOOLEAN_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    		current.merge(this_BOOLEAN_0);
                        
                     
                        newLeafNode(this_BOOLEAN_0, grammarAccess.getVALAccess().getBOOLEANTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalRdsl.g:2038:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getVALAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalRdsl.g:2046:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAType"
    // InternalRdsl.g:2061:1: entryRuleAType returns [String current=null] : iv_ruleAType= ruleAType EOF ;
    public final String entryRuleAType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAType = null;


        try {
            // InternalRdsl.g:2062:2: (iv_ruleAType= ruleAType EOF )
            // InternalRdsl.g:2063:2: iv_ruleAType= ruleAType EOF
            {
             newCompositeNode(grammarAccess.getATypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAType=ruleAType();

            state._fsp--;

             current =iv_ruleAType.getText(); 
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
    // $ANTLR end "entryRuleAType"


    // $ANTLR start "ruleAType"
    // InternalRdsl.g:2070:1: ruleAType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'IPv4' | kw= 'IPv6' ) ;
    public final AntlrDatatypeRuleToken ruleAType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalRdsl.g:2073:28: ( (kw= 'IPv4' | kw= 'IPv6' ) )
            // InternalRdsl.g:2074:1: (kw= 'IPv4' | kw= 'IPv6' )
            {
            // InternalRdsl.g:2074:1: (kw= 'IPv4' | kw= 'IPv6' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==61) ) {
                alt42=1;
            }
            else if ( (LA42_0==62) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalRdsl.g:2075:2: kw= 'IPv4'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getATypeAccess().getIPv4Keyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalRdsl.g:2082:2: kw= 'IPv6'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getATypeAccess().getIPv6Keyword_1()); 
                        

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
    // $ANTLR end "ruleAType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000040001012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000021590000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000590000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000CEFC00010010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000CEF800010010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000CEF000010010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000CEE000010010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000CEC000010010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000CE8000010010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000CE0000010010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000CC0000010010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000C80000010010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000C00000010010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000010010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x1C00000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00000000000000E0L});

}