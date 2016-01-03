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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_BOOLEAN", "RULE_STRING", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'minAllowedInstances'", "':'", "';'", "'maxAllowedInstances'", "'import'", "'https://'", "'.'", "'com'", "'org'", "'fr'", "'net'", "'/'", "'*'", "'.graph'", "'{'", "'}'", "'installer'", "'extends'", "'children'", "','", "'exports'", "'='", "'imports'", "'external'", "'(optional)'", "'facets'", "'facet'", "'instance'", "'of'", "'name'", "'count'", "'adressType'", "'ipv4'", "'address'", "'ipv6'", "'load'", "'state'", "'public'", "'private'", "'hostname'", "'iptables'", "'-A'", "'INPUT'", "'OUTPUT'", "'FORWARD'", "'-s'", "'-d'", "'-p'", "'tcp'", "'udp'", "'-j'", "'ACCEPT'", "'REJECT'", "'DROP'", "'IPv4'", "'IPv6'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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
    // InternalRdsl.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_graphs_0_0= ruleGraph ) ) | ( ( (lv_instances_1_0= ruleInstance ) )* (otherlv_2= 'minAllowedInstances' otherlv_3= ':' ( (lv_valmin_4_0= RULE_INT ) ) otherlv_5= ';' )? (otherlv_6= 'maxAllowedInstances' otherlv_7= ':' ( (lv_valmax_8_0= RULE_INT ) ) otherlv_9= ';' )? ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_valmin_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_valmax_8_0=null;
        Token otherlv_9=null;
        EObject lv_graphs_0_0 = null;

        EObject lv_instances_1_0 = null;


         enterRule(); 
            
        try {
            // InternalRdsl.g:79:28: ( ( ( (lv_graphs_0_0= ruleGraph ) ) | ( ( (lv_instances_1_0= ruleInstance ) )* (otherlv_2= 'minAllowedInstances' otherlv_3= ':' ( (lv_valmin_4_0= RULE_INT ) ) otherlv_5= ';' )? (otherlv_6= 'maxAllowedInstances' otherlv_7= ':' ( (lv_valmax_8_0= RULE_INT ) ) otherlv_9= ';' )? ) ) )
            // InternalRdsl.g:80:1: ( ( (lv_graphs_0_0= ruleGraph ) ) | ( ( (lv_instances_1_0= ruleInstance ) )* (otherlv_2= 'minAllowedInstances' otherlv_3= ':' ( (lv_valmin_4_0= RULE_INT ) ) otherlv_5= ';' )? (otherlv_6= 'maxAllowedInstances' otherlv_7= ':' ( (lv_valmax_8_0= RULE_INT ) ) otherlv_9= ';' )? ) )
            {
            // InternalRdsl.g:80:1: ( ( (lv_graphs_0_0= ruleGraph ) ) | ( ( (lv_instances_1_0= ruleInstance ) )* (otherlv_2= 'minAllowedInstances' otherlv_3= ':' ( (lv_valmin_4_0= RULE_INT ) ) otherlv_5= ';' )? (otherlv_6= 'maxAllowedInstances' otherlv_7= ':' ( (lv_valmax_8_0= RULE_INT ) ) otherlv_9= ';' )? ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||LA4_0==16||LA4_0==38) ) {
                alt4=1;
            }
            else if ( (LA4_0==EOF||LA4_0==12||LA4_0==15||LA4_0==39) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
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
                    // InternalRdsl.g:99:6: ( ( (lv_instances_1_0= ruleInstance ) )* (otherlv_2= 'minAllowedInstances' otherlv_3= ':' ( (lv_valmin_4_0= RULE_INT ) ) otherlv_5= ';' )? (otherlv_6= 'maxAllowedInstances' otherlv_7= ':' ( (lv_valmax_8_0= RULE_INT ) ) otherlv_9= ';' )? )
                    {
                    // InternalRdsl.g:99:6: ( ( (lv_instances_1_0= ruleInstance ) )* (otherlv_2= 'minAllowedInstances' otherlv_3= ':' ( (lv_valmin_4_0= RULE_INT ) ) otherlv_5= ';' )? (otherlv_6= 'maxAllowedInstances' otherlv_7= ':' ( (lv_valmax_8_0= RULE_INT ) ) otherlv_9= ';' )? )
                    // InternalRdsl.g:99:7: ( (lv_instances_1_0= ruleInstance ) )* (otherlv_2= 'minAllowedInstances' otherlv_3= ':' ( (lv_valmin_4_0= RULE_INT ) ) otherlv_5= ';' )? (otherlv_6= 'maxAllowedInstances' otherlv_7= ':' ( (lv_valmax_8_0= RULE_INT ) ) otherlv_9= ';' )?
                    {
                    // InternalRdsl.g:99:7: ( (lv_instances_1_0= ruleInstance ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==39) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRdsl.g:100:1: (lv_instances_1_0= ruleInstance )
                    	    {
                    	    // InternalRdsl.g:100:1: (lv_instances_1_0= ruleInstance )
                    	    // InternalRdsl.g:101:3: lv_instances_1_0= ruleInstance
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getInstancesInstanceParserRuleCall_1_0_0()); 
                    	    	    
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

                    // InternalRdsl.g:117:3: (otherlv_2= 'minAllowedInstances' otherlv_3= ':' ( (lv_valmin_4_0= RULE_INT ) ) otherlv_5= ';' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==12) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalRdsl.g:117:5: otherlv_2= 'minAllowedInstances' otherlv_3= ':' ( (lv_valmin_4_0= RULE_INT ) ) otherlv_5= ';'
                            {
                            otherlv_2=(Token)match(input,12,FOLLOW_4); 

                                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getMinAllowedInstancesKeyword_1_1_0());
                                
                            otherlv_3=(Token)match(input,13,FOLLOW_5); 

                                	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getColonKeyword_1_1_1());
                                
                            // InternalRdsl.g:125:1: ( (lv_valmin_4_0= RULE_INT ) )
                            // InternalRdsl.g:126:1: (lv_valmin_4_0= RULE_INT )
                            {
                            // InternalRdsl.g:126:1: (lv_valmin_4_0= RULE_INT )
                            // InternalRdsl.g:127:3: lv_valmin_4_0= RULE_INT
                            {
                            lv_valmin_4_0=(Token)match(input,RULE_INT,FOLLOW_6); 

                            			newLeafNode(lv_valmin_4_0, grammarAccess.getModelAccess().getValminINTTerminalRuleCall_1_1_2_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getModelRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"valmin",
                                    		lv_valmin_4_0, 
                                    		"org.eclipse.xtext.common.Terminals.INT");
                            	    

                            }


                            }

                            otherlv_5=(Token)match(input,14,FOLLOW_7); 

                                	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getSemicolonKeyword_1_1_3());
                                

                            }
                            break;

                    }

                    // InternalRdsl.g:147:3: (otherlv_6= 'maxAllowedInstances' otherlv_7= ':' ( (lv_valmax_8_0= RULE_INT ) ) otherlv_9= ';' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==15) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalRdsl.g:147:5: otherlv_6= 'maxAllowedInstances' otherlv_7= ':' ( (lv_valmax_8_0= RULE_INT ) ) otherlv_9= ';'
                            {
                            otherlv_6=(Token)match(input,15,FOLLOW_4); 

                                	newLeafNode(otherlv_6, grammarAccess.getModelAccess().getMaxAllowedInstancesKeyword_1_2_0());
                                
                            otherlv_7=(Token)match(input,13,FOLLOW_5); 

                                	newLeafNode(otherlv_7, grammarAccess.getModelAccess().getColonKeyword_1_2_1());
                                
                            // InternalRdsl.g:155:1: ( (lv_valmax_8_0= RULE_INT ) )
                            // InternalRdsl.g:156:1: (lv_valmax_8_0= RULE_INT )
                            {
                            // InternalRdsl.g:156:1: (lv_valmax_8_0= RULE_INT )
                            // InternalRdsl.g:157:3: lv_valmax_8_0= RULE_INT
                            {
                            lv_valmax_8_0=(Token)match(input,RULE_INT,FOLLOW_6); 

                            			newLeafNode(lv_valmax_8_0, grammarAccess.getModelAccess().getValmaxINTTerminalRuleCall_1_2_2_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getModelRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"valmax",
                                    		lv_valmax_8_0, 
                                    		"org.eclipse.xtext.common.Terminals.INT");
                            	    

                            }


                            }

                            otherlv_9=(Token)match(input,14,FOLLOW_2); 

                                	newLeafNode(otherlv_9, grammarAccess.getModelAccess().getSemicolonKeyword_1_2_3());
                                

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGraph"
    // InternalRdsl.g:185:1: entryRuleGraph returns [EObject current=null] : iv_ruleGraph= ruleGraph EOF ;
    public final EObject entryRuleGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraph = null;


        try {
            // InternalRdsl.g:186:2: (iv_ruleGraph= ruleGraph EOF )
            // InternalRdsl.g:187:2: iv_ruleGraph= ruleGraph EOF
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
    // InternalRdsl.g:194:1: ruleGraph returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) ) | ( (lv_components_1_0= ruleComponent ) ) | ( (lv_facetGraphs_2_0= ruleFacet ) ) )+ ;
    public final EObject ruleGraph() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_components_1_0 = null;

        EObject lv_facetGraphs_2_0 = null;


         enterRule(); 
            
        try {
            // InternalRdsl.g:197:28: ( ( ( (lv_imports_0_0= ruleImport ) ) | ( (lv_components_1_0= ruleComponent ) ) | ( (lv_facetGraphs_2_0= ruleFacet ) ) )+ )
            // InternalRdsl.g:198:1: ( ( (lv_imports_0_0= ruleImport ) ) | ( (lv_components_1_0= ruleComponent ) ) | ( (lv_facetGraphs_2_0= ruleFacet ) ) )+
            {
            // InternalRdsl.g:198:1: ( ( (lv_imports_0_0= ruleImport ) ) | ( (lv_components_1_0= ruleComponent ) ) | ( (lv_facetGraphs_2_0= ruleFacet ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=4;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    alt5=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt5=2;
                    }
                    break;
                case 38:
                    {
                    alt5=3;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // InternalRdsl.g:198:2: ( (lv_imports_0_0= ruleImport ) )
            	    {
            	    // InternalRdsl.g:198:2: ( (lv_imports_0_0= ruleImport ) )
            	    // InternalRdsl.g:199:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalRdsl.g:199:1: (lv_imports_0_0= ruleImport )
            	    // InternalRdsl.g:200:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGraphAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_8);
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
            	    // InternalRdsl.g:217:6: ( (lv_components_1_0= ruleComponent ) )
            	    {
            	    // InternalRdsl.g:217:6: ( (lv_components_1_0= ruleComponent ) )
            	    // InternalRdsl.g:218:1: (lv_components_1_0= ruleComponent )
            	    {
            	    // InternalRdsl.g:218:1: (lv_components_1_0= ruleComponent )
            	    // InternalRdsl.g:219:3: lv_components_1_0= ruleComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGraphAccess().getComponentsComponentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_8);
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
            	    // InternalRdsl.g:236:6: ( (lv_facetGraphs_2_0= ruleFacet ) )
            	    {
            	    // InternalRdsl.g:236:6: ( (lv_facetGraphs_2_0= ruleFacet ) )
            	    // InternalRdsl.g:237:1: (lv_facetGraphs_2_0= ruleFacet )
            	    {
            	    // InternalRdsl.g:237:1: (lv_facetGraphs_2_0= ruleFacet )
            	    // InternalRdsl.g:238:3: lv_facetGraphs_2_0= ruleFacet
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGraphAccess().getFacetGraphsFacetParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_8);
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // InternalRdsl.g:262:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalRdsl.g:263:2: (iv_ruleImport= ruleImport EOF )
            // InternalRdsl.g:264:2: iv_ruleImport= ruleImport EOF
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
    // InternalRdsl.g:271:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( (lv_importURI_1_1= ruleImpotUri | lv_importURI_1_2= ruleURL ) ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_importURI_1_1 = null;

        EObject lv_importURI_1_2 = null;


         enterRule(); 
            
        try {
            // InternalRdsl.g:274:28: ( (otherlv_0= 'import' ( ( (lv_importURI_1_1= ruleImpotUri | lv_importURI_1_2= ruleURL ) ) ) otherlv_2= ';' ) )
            // InternalRdsl.g:275:1: (otherlv_0= 'import' ( ( (lv_importURI_1_1= ruleImpotUri | lv_importURI_1_2= ruleURL ) ) ) otherlv_2= ';' )
            {
            // InternalRdsl.g:275:1: (otherlv_0= 'import' ( ( (lv_importURI_1_1= ruleImpotUri | lv_importURI_1_2= ruleURL ) ) ) otherlv_2= ';' )
            // InternalRdsl.g:275:3: otherlv_0= 'import' ( ( (lv_importURI_1_1= ruleImpotUri | lv_importURI_1_2= ruleURL ) ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // InternalRdsl.g:279:1: ( ( (lv_importURI_1_1= ruleImpotUri | lv_importURI_1_2= ruleURL ) ) )
            // InternalRdsl.g:280:1: ( (lv_importURI_1_1= ruleImpotUri | lv_importURI_1_2= ruleURL ) )
            {
            // InternalRdsl.g:280:1: ( (lv_importURI_1_1= ruleImpotUri | lv_importURI_1_2= ruleURL ) )
            // InternalRdsl.g:281:1: (lv_importURI_1_1= ruleImpotUri | lv_importURI_1_2= ruleURL )
            {
            // InternalRdsl.g:281:1: (lv_importURI_1_1= ruleImpotUri | lv_importURI_1_2= ruleURL )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRdsl.g:282:3: lv_importURI_1_1= ruleImpotUri
                    {
                     
                    	        newCompositeNode(grammarAccess.getImportAccess().getImportURIImpotUriParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_6);
                    lv_importURI_1_1=ruleImpotUri();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImportRule());
                    	        }
                           		set(
                           			current, 
                           			"importURI",
                            		lv_importURI_1_1, 
                            		"org.xtext.Rdsl.ImpotUri");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // InternalRdsl.g:297:8: lv_importURI_1_2= ruleURL
                    {
                     
                    	        newCompositeNode(grammarAccess.getImportAccess().getImportURIURLParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_6);
                    lv_importURI_1_2=ruleURL();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImportRule());
                    	        }
                           		set(
                           			current, 
                           			"importURI",
                            		lv_importURI_1_2, 
                            		"org.xtext.Rdsl.URL");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuleURL"
    // InternalRdsl.g:327:1: entryRuleURL returns [EObject current=null] : iv_ruleURL= ruleURL EOF ;
    public final EObject entryRuleURL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURL = null;


        try {
            // InternalRdsl.g:328:2: (iv_ruleURL= ruleURL EOF )
            // InternalRdsl.g:329:2: iv_ruleURL= ruleURL EOF
            {
             newCompositeNode(grammarAccess.getURLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURL=ruleURL();

            state._fsp--;

             current =iv_ruleURL; 
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
    // $ANTLR end "entryRuleURL"


    // $ANTLR start "ruleURL"
    // InternalRdsl.g:336:1: ruleURL returns [EObject current=null] : (otherlv_0= 'https://' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '.' ( ( (lv_domaine_3_1= 'com' | lv_domaine_3_2= 'org' | lv_domaine_3_3= 'fr' | lv_domaine_3_4= 'net' ) ) ) (otherlv_4= '/' ( (lv_variable_5_0= RULE_ID ) ) )* (otherlv_6= '/' ( (lv_variables_7_0= RULE_ID ) ) ( (lv_wildcard_8_0= '*' ) ) )? ) ;
    public final EObject ruleURL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_domaine_3_1=null;
        Token lv_domaine_3_2=null;
        Token lv_domaine_3_3=null;
        Token lv_domaine_3_4=null;
        Token otherlv_4=null;
        Token lv_variable_5_0=null;
        Token otherlv_6=null;
        Token lv_variables_7_0=null;
        Token lv_wildcard_8_0=null;

         enterRule(); 
            
        try {
            // InternalRdsl.g:339:28: ( (otherlv_0= 'https://' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '.' ( ( (lv_domaine_3_1= 'com' | lv_domaine_3_2= 'org' | lv_domaine_3_3= 'fr' | lv_domaine_3_4= 'net' ) ) ) (otherlv_4= '/' ( (lv_variable_5_0= RULE_ID ) ) )* (otherlv_6= '/' ( (lv_variables_7_0= RULE_ID ) ) ( (lv_wildcard_8_0= '*' ) ) )? ) )
            // InternalRdsl.g:340:1: (otherlv_0= 'https://' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '.' ( ( (lv_domaine_3_1= 'com' | lv_domaine_3_2= 'org' | lv_domaine_3_3= 'fr' | lv_domaine_3_4= 'net' ) ) ) (otherlv_4= '/' ( (lv_variable_5_0= RULE_ID ) ) )* (otherlv_6= '/' ( (lv_variables_7_0= RULE_ID ) ) ( (lv_wildcard_8_0= '*' ) ) )? )
            {
            // InternalRdsl.g:340:1: (otherlv_0= 'https://' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '.' ( ( (lv_domaine_3_1= 'com' | lv_domaine_3_2= 'org' | lv_domaine_3_3= 'fr' | lv_domaine_3_4= 'net' ) ) ) (otherlv_4= '/' ( (lv_variable_5_0= RULE_ID ) ) )* (otherlv_6= '/' ( (lv_variables_7_0= RULE_ID ) ) ( (lv_wildcard_8_0= '*' ) ) )? )
            // InternalRdsl.g:340:3: otherlv_0= 'https://' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '.' ( ( (lv_domaine_3_1= 'com' | lv_domaine_3_2= 'org' | lv_domaine_3_3= 'fr' | lv_domaine_3_4= 'net' ) ) ) (otherlv_4= '/' ( (lv_variable_5_0= RULE_ID ) ) )* (otherlv_6= '/' ( (lv_variables_7_0= RULE_ID ) ) ( (lv_wildcard_8_0= '*' ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

                	newLeafNode(otherlv_0, grammarAccess.getURLAccess().getHttpsKeyword_0());
                
            // InternalRdsl.g:344:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdsl.g:345:1: (lv_name_1_0= RULE_ID )
            {
            // InternalRdsl.g:345:1: (lv_name_1_0= RULE_ID )
            // InternalRdsl.g:346:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			newLeafNode(lv_name_1_0, grammarAccess.getURLAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getURLRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.xtext.Rdsl.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_12); 

                	newLeafNode(otherlv_2, grammarAccess.getURLAccess().getFullStopKeyword_2());
                
            // InternalRdsl.g:366:1: ( ( (lv_domaine_3_1= 'com' | lv_domaine_3_2= 'org' | lv_domaine_3_3= 'fr' | lv_domaine_3_4= 'net' ) ) )
            // InternalRdsl.g:367:1: ( (lv_domaine_3_1= 'com' | lv_domaine_3_2= 'org' | lv_domaine_3_3= 'fr' | lv_domaine_3_4= 'net' ) )
            {
            // InternalRdsl.g:367:1: ( (lv_domaine_3_1= 'com' | lv_domaine_3_2= 'org' | lv_domaine_3_3= 'fr' | lv_domaine_3_4= 'net' ) )
            // InternalRdsl.g:368:1: (lv_domaine_3_1= 'com' | lv_domaine_3_2= 'org' | lv_domaine_3_3= 'fr' | lv_domaine_3_4= 'net' )
            {
            // InternalRdsl.g:368:1: (lv_domaine_3_1= 'com' | lv_domaine_3_2= 'org' | lv_domaine_3_3= 'fr' | lv_domaine_3_4= 'net' )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            case 22:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRdsl.g:369:3: lv_domaine_3_1= 'com'
                    {
                    lv_domaine_3_1=(Token)match(input,19,FOLLOW_13); 

                            newLeafNode(lv_domaine_3_1, grammarAccess.getURLAccess().getDomaineComKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getURLRule());
                    	        }
                           		setWithLastConsumed(current, "domaine", lv_domaine_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // InternalRdsl.g:381:8: lv_domaine_3_2= 'org'
                    {
                    lv_domaine_3_2=(Token)match(input,20,FOLLOW_13); 

                            newLeafNode(lv_domaine_3_2, grammarAccess.getURLAccess().getDomaineOrgKeyword_3_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getURLRule());
                    	        }
                           		setWithLastConsumed(current, "domaine", lv_domaine_3_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // InternalRdsl.g:393:8: lv_domaine_3_3= 'fr'
                    {
                    lv_domaine_3_3=(Token)match(input,21,FOLLOW_13); 

                            newLeafNode(lv_domaine_3_3, grammarAccess.getURLAccess().getDomaineFrKeyword_3_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getURLRule());
                    	        }
                           		setWithLastConsumed(current, "domaine", lv_domaine_3_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // InternalRdsl.g:405:8: lv_domaine_3_4= 'net'
                    {
                    lv_domaine_3_4=(Token)match(input,22,FOLLOW_13); 

                            newLeafNode(lv_domaine_3_4, grammarAccess.getURLAccess().getDomaineNetKeyword_3_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getURLRule());
                    	        }
                           		setWithLastConsumed(current, "domaine", lv_domaine_3_4, null);
                    	    

                    }
                    break;

            }


            }


            }

            // InternalRdsl.g:420:2: (otherlv_4= '/' ( (lv_variable_5_0= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==RULE_ID) ) {
                        int LA8_3 = input.LA(3);

                        if ( (LA8_3==EOF||LA8_3==14||LA8_3==23) ) {
                            alt8=1;
                        }


                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalRdsl.g:420:4: otherlv_4= '/' ( (lv_variable_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,23,FOLLOW_10); 

            	        	newLeafNode(otherlv_4, grammarAccess.getURLAccess().getSolidusKeyword_4_0());
            	        
            	    // InternalRdsl.g:424:1: ( (lv_variable_5_0= RULE_ID ) )
            	    // InternalRdsl.g:425:1: (lv_variable_5_0= RULE_ID )
            	    {
            	    // InternalRdsl.g:425:1: (lv_variable_5_0= RULE_ID )
            	    // InternalRdsl.g:426:3: lv_variable_5_0= RULE_ID
            	    {
            	    lv_variable_5_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            	    			newLeafNode(lv_variable_5_0, grammarAccess.getURLAccess().getVariableIDTerminalRuleCall_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getURLRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"variable",
            	            		lv_variable_5_0, 
            	            		"org.xtext.Rdsl.ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalRdsl.g:442:4: (otherlv_6= '/' ( (lv_variables_7_0= RULE_ID ) ) ( (lv_wildcard_8_0= '*' ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRdsl.g:442:6: otherlv_6= '/' ( (lv_variables_7_0= RULE_ID ) ) ( (lv_wildcard_8_0= '*' ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_10); 

                        	newLeafNode(otherlv_6, grammarAccess.getURLAccess().getSolidusKeyword_5_0());
                        
                    // InternalRdsl.g:446:1: ( (lv_variables_7_0= RULE_ID ) )
                    // InternalRdsl.g:447:1: (lv_variables_7_0= RULE_ID )
                    {
                    // InternalRdsl.g:447:1: (lv_variables_7_0= RULE_ID )
                    // InternalRdsl.g:448:3: lv_variables_7_0= RULE_ID
                    {
                    lv_variables_7_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    			newLeafNode(lv_variables_7_0, grammarAccess.getURLAccess().getVariablesIDTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getURLRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"variables",
                            		lv_variables_7_0, 
                            		"org.xtext.Rdsl.ID");
                    	    

                    }


                    }

                    // InternalRdsl.g:464:2: ( (lv_wildcard_8_0= '*' ) )
                    // InternalRdsl.g:465:1: (lv_wildcard_8_0= '*' )
                    {
                    // InternalRdsl.g:465:1: (lv_wildcard_8_0= '*' )
                    // InternalRdsl.g:466:3: lv_wildcard_8_0= '*'
                    {
                    lv_wildcard_8_0=(Token)match(input,24,FOLLOW_2); 

                            newLeafNode(lv_wildcard_8_0, grammarAccess.getURLAccess().getWildcardAsteriskKeyword_5_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getURLRule());
                    	        }
                           		setWithLastConsumed(current, "wildcard", true, "*");
                    	    

                    }


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
    // $ANTLR end "ruleURL"


    // $ANTLR start "entryRuleImpotUri"
    // InternalRdsl.g:487:1: entryRuleImpotUri returns [EObject current=null] : iv_ruleImpotUri= ruleImpotUri EOF ;
    public final EObject entryRuleImpotUri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpotUri = null;


        try {
            // InternalRdsl.g:488:2: (iv_ruleImpotUri= ruleImpotUri EOF )
            // InternalRdsl.g:489:2: iv_ruleImpotUri= ruleImpotUri EOF
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
    // InternalRdsl.g:496:1: ruleImpotUri returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.graph' ) ;
    public final EObject ruleImpotUri() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalRdsl.g:499:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.graph' ) )
            // InternalRdsl.g:500:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.graph' )
            {
            // InternalRdsl.g:500:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.graph' )
            // InternalRdsl.g:500:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.graph'
            {
            // InternalRdsl.g:500:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdsl.g:501:1: (lv_name_0_0= RULE_ID )
            {
            // InternalRdsl.g:501:1: (lv_name_0_0= RULE_ID )
            // InternalRdsl.g:502:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            otherlv_1=(Token)match(input,25,FOLLOW_2); 

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
    // InternalRdsl.g:532:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalRdsl.g:533:2: (iv_ruleComponent= ruleComponent EOF )
            // InternalRdsl.g:534:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalRdsl.g:541:1: ruleComponent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_installers_2_0= ruleInstaller ) ) ( ( (lv_childrens_3_0= ruleChildren ) ) | ( (lv_exports_4_0= ruleExport ) ) | ( (lv_imports_5_0= ruleImports ) ) | ( (lv_facets_6_0= ruleFacets ) ) | ( (lv_extends_7_0= ruleExtends ) ) )* otherlv_8= '}' ) ;
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
            // InternalRdsl.g:544:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_installers_2_0= ruleInstaller ) ) ( ( (lv_childrens_3_0= ruleChildren ) ) | ( (lv_exports_4_0= ruleExport ) ) | ( (lv_imports_5_0= ruleImports ) ) | ( (lv_facets_6_0= ruleFacets ) ) | ( (lv_extends_7_0= ruleExtends ) ) )* otherlv_8= '}' ) )
            // InternalRdsl.g:545:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_installers_2_0= ruleInstaller ) ) ( ( (lv_childrens_3_0= ruleChildren ) ) | ( (lv_exports_4_0= ruleExport ) ) | ( (lv_imports_5_0= ruleImports ) ) | ( (lv_facets_6_0= ruleFacets ) ) | ( (lv_extends_7_0= ruleExtends ) ) )* otherlv_8= '}' )
            {
            // InternalRdsl.g:545:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_installers_2_0= ruleInstaller ) ) ( ( (lv_childrens_3_0= ruleChildren ) ) | ( (lv_exports_4_0= ruleExport ) ) | ( (lv_imports_5_0= ruleImports ) ) | ( (lv_facets_6_0= ruleFacets ) ) | ( (lv_extends_7_0= ruleExtends ) ) )* otherlv_8= '}' )
            // InternalRdsl.g:545:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_installers_2_0= ruleInstaller ) ) ( ( (lv_childrens_3_0= ruleChildren ) ) | ( (lv_exports_4_0= ruleExport ) ) | ( (lv_imports_5_0= ruleImports ) ) | ( (lv_facets_6_0= ruleFacets ) ) | ( (lv_extends_7_0= ruleExtends ) ) )* otherlv_8= '}'
            {
            // InternalRdsl.g:545:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdsl.g:546:1: (lv_name_0_0= RULE_ID )
            {
            // InternalRdsl.g:546:1: (lv_name_0_0= RULE_ID )
            // InternalRdsl.g:547:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            otherlv_1=(Token)match(input,26,FOLLOW_17); 

                	newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalRdsl.g:567:1: ( (lv_installers_2_0= ruleInstaller ) )
            // InternalRdsl.g:568:1: (lv_installers_2_0= ruleInstaller )
            {
            // InternalRdsl.g:568:1: (lv_installers_2_0= ruleInstaller )
            // InternalRdsl.g:569:3: lv_installers_2_0= ruleInstaller
            {
             
            	        newCompositeNode(grammarAccess.getComponentAccess().getInstallersInstallerParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_18);
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

            // InternalRdsl.g:585:2: ( ( (lv_childrens_3_0= ruleChildren ) ) | ( (lv_exports_4_0= ruleExport ) ) | ( (lv_imports_5_0= ruleImports ) ) | ( (lv_facets_6_0= ruleFacets ) ) | ( (lv_extends_7_0= ruleExtends ) ) )*
            loop10:
            do {
                int alt10=6;
                switch ( input.LA(1) ) {
                case 30:
                    {
                    alt10=1;
                    }
                    break;
                case 32:
                    {
                    alt10=2;
                    }
                    break;
                case 34:
                    {
                    alt10=3;
                    }
                    break;
                case 37:
                    {
                    alt10=4;
                    }
                    break;
                case 29:
                    {
                    alt10=5;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // InternalRdsl.g:585:3: ( (lv_childrens_3_0= ruleChildren ) )
            	    {
            	    // InternalRdsl.g:585:3: ( (lv_childrens_3_0= ruleChildren ) )
            	    // InternalRdsl.g:586:1: (lv_childrens_3_0= ruleChildren )
            	    {
            	    // InternalRdsl.g:586:1: (lv_childrens_3_0= ruleChildren )
            	    // InternalRdsl.g:587:3: lv_childrens_3_0= ruleChildren
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getChildrensChildrenParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_18);
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
            	    // InternalRdsl.g:604:6: ( (lv_exports_4_0= ruleExport ) )
            	    {
            	    // InternalRdsl.g:604:6: ( (lv_exports_4_0= ruleExport ) )
            	    // InternalRdsl.g:605:1: (lv_exports_4_0= ruleExport )
            	    {
            	    // InternalRdsl.g:605:1: (lv_exports_4_0= ruleExport )
            	    // InternalRdsl.g:606:3: lv_exports_4_0= ruleExport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getExportsExportParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_18);
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
            	    // InternalRdsl.g:623:6: ( (lv_imports_5_0= ruleImports ) )
            	    {
            	    // InternalRdsl.g:623:6: ( (lv_imports_5_0= ruleImports ) )
            	    // InternalRdsl.g:624:1: (lv_imports_5_0= ruleImports )
            	    {
            	    // InternalRdsl.g:624:1: (lv_imports_5_0= ruleImports )
            	    // InternalRdsl.g:625:3: lv_imports_5_0= ruleImports
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getImportsImportsParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_18);
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
            	    // InternalRdsl.g:642:6: ( (lv_facets_6_0= ruleFacets ) )
            	    {
            	    // InternalRdsl.g:642:6: ( (lv_facets_6_0= ruleFacets ) )
            	    // InternalRdsl.g:643:1: (lv_facets_6_0= ruleFacets )
            	    {
            	    // InternalRdsl.g:643:1: (lv_facets_6_0= ruleFacets )
            	    // InternalRdsl.g:644:3: lv_facets_6_0= ruleFacets
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getFacetsFacetsParserRuleCall_3_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_18);
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
            	    // InternalRdsl.g:661:6: ( (lv_extends_7_0= ruleExtends ) )
            	    {
            	    // InternalRdsl.g:661:6: ( (lv_extends_7_0= ruleExtends ) )
            	    // InternalRdsl.g:662:1: (lv_extends_7_0= ruleExtends )
            	    {
            	    // InternalRdsl.g:662:1: (lv_extends_7_0= ruleExtends )
            	    // InternalRdsl.g:663:3: lv_extends_7_0= ruleExtends
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getExtendsExtendsParserRuleCall_3_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_18);
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
            	    break loop10;
                }
            } while (true);

            otherlv_8=(Token)match(input,27,FOLLOW_2); 

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
    // InternalRdsl.g:691:1: entryRuleInstaller returns [EObject current=null] : iv_ruleInstaller= ruleInstaller EOF ;
    public final EObject entryRuleInstaller() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstaller = null;


        try {
            // InternalRdsl.g:692:2: (iv_ruleInstaller= ruleInstaller EOF )
            // InternalRdsl.g:693:2: iv_ruleInstaller= ruleInstaller EOF
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
    // InternalRdsl.g:700:1: ruleInstaller returns [EObject current=null] : (otherlv_0= 'installer' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleInstaller() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalRdsl.g:703:28: ( (otherlv_0= 'installer' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalRdsl.g:704:1: (otherlv_0= 'installer' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalRdsl.g:704:1: (otherlv_0= 'installer' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalRdsl.g:704:3: otherlv_0= 'installer' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getInstallerAccess().getInstallerKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_10); 

                	newLeafNode(otherlv_1, grammarAccess.getInstallerAccess().getColonKeyword_1());
                
            // InternalRdsl.g:712:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalRdsl.g:713:1: (lv_name_2_0= RULE_ID )
            {
            // InternalRdsl.g:713:1: (lv_name_2_0= RULE_ID )
            // InternalRdsl.g:714:3: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRdsl.g:742:1: entryRuleExtends returns [EObject current=null] : iv_ruleExtends= ruleExtends EOF ;
    public final EObject entryRuleExtends() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtends = null;


        try {
            // InternalRdsl.g:743:2: (iv_ruleExtends= ruleExtends EOF )
            // InternalRdsl.g:744:2: iv_ruleExtends= ruleExtends EOF
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
    // InternalRdsl.g:751:1: ruleExtends returns [EObject current=null] : (otherlv_0= 'extends' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleExtends() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalRdsl.g:754:28: ( (otherlv_0= 'extends' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalRdsl.g:755:1: (otherlv_0= 'extends' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalRdsl.g:755:1: (otherlv_0= 'extends' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
            // InternalRdsl.g:755:3: otherlv_0= 'extends' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getExtendsAccess().getExtendsKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_10); 

                	newLeafNode(otherlv_1, grammarAccess.getExtendsAccess().getColonKeyword_1());
                
            // InternalRdsl.g:763:1: ( (otherlv_2= RULE_ID ) )
            // InternalRdsl.g:764:1: (otherlv_2= RULE_ID )
            {
            // InternalRdsl.g:764:1: (otherlv_2= RULE_ID )
            // InternalRdsl.g:765:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExtendsRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            		newLeafNode(otherlv_2, grammarAccess.getExtendsAccess().getSupComponentComponentCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRdsl.g:788:1: entryRuleChildren returns [EObject current=null] : iv_ruleChildren= ruleChildren EOF ;
    public final EObject entryRuleChildren() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildren = null;


        try {
            // InternalRdsl.g:789:2: (iv_ruleChildren= ruleChildren EOF )
            // InternalRdsl.g:790:2: iv_ruleChildren= ruleChildren EOF
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
    // InternalRdsl.g:797:1: ruleChildren returns [EObject current=null] : (otherlv_0= 'children' otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )* ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) ;
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
            // InternalRdsl.g:800:28: ( (otherlv_0= 'children' otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )* ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalRdsl.g:801:1: (otherlv_0= 'children' otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )* ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalRdsl.g:801:1: (otherlv_0= 'children' otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )* ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            // InternalRdsl.g:801:3: otherlv_0= 'children' otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )* ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getChildrenAccess().getChildrenKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_10); 

                	newLeafNode(otherlv_1, grammarAccess.getChildrenAccess().getColonKeyword_1());
                
            // InternalRdsl.g:809:1: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==31) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalRdsl.g:809:2: ( (otherlv_2= RULE_ID ) ) otherlv_3= ','
            	    {
            	    // InternalRdsl.g:809:2: ( (otherlv_2= RULE_ID ) )
            	    // InternalRdsl.g:810:1: (otherlv_2= RULE_ID )
            	    {
            	    // InternalRdsl.g:810:1: (otherlv_2= RULE_ID )
            	    // InternalRdsl.g:811:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getChildrenRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    		newLeafNode(otherlv_2, grammarAccess.getChildrenAccess().getChildrenComponentCrossReference_2_0_0()); 
            	    	

            	    }


            	    }

            	    otherlv_3=(Token)match(input,31,FOLLOW_10); 

            	        	newLeafNode(otherlv_3, grammarAccess.getChildrenAccess().getCommaKeyword_2_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalRdsl.g:826:3: ( (otherlv_4= RULE_ID ) )
            // InternalRdsl.g:827:1: (otherlv_4= RULE_ID )
            {
            // InternalRdsl.g:827:1: (otherlv_4= RULE_ID )
            // InternalRdsl.g:828:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChildrenRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_6); 

            		newLeafNode(otherlv_4, grammarAccess.getChildrenAccess().getChildComponentCrossReference_3_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRdsl.g:851:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // InternalRdsl.g:852:2: (iv_ruleExport= ruleExport EOF )
            // InternalRdsl.g:853:2: iv_ruleExport= ruleExport EOF
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
    // InternalRdsl.g:860:1: ruleExport returns [EObject current=null] : (otherlv_0= 'exports' otherlv_1= ':' ( ( (lv_exports_2_0= ruleexportVariable ) ) otherlv_3= ',' )* ( (lv_export_4_0= ruleexportVariable ) ) otherlv_5= ';' ) ;
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
            // InternalRdsl.g:863:28: ( (otherlv_0= 'exports' otherlv_1= ':' ( ( (lv_exports_2_0= ruleexportVariable ) ) otherlv_3= ',' )* ( (lv_export_4_0= ruleexportVariable ) ) otherlv_5= ';' ) )
            // InternalRdsl.g:864:1: (otherlv_0= 'exports' otherlv_1= ':' ( ( (lv_exports_2_0= ruleexportVariable ) ) otherlv_3= ',' )* ( (lv_export_4_0= ruleexportVariable ) ) otherlv_5= ';' )
            {
            // InternalRdsl.g:864:1: (otherlv_0= 'exports' otherlv_1= ':' ( ( (lv_exports_2_0= ruleexportVariable ) ) otherlv_3= ',' )* ( (lv_export_4_0= ruleexportVariable ) ) otherlv_5= ';' )
            // InternalRdsl.g:864:3: otherlv_0= 'exports' otherlv_1= ':' ( ( (lv_exports_2_0= ruleexportVariable ) ) otherlv_3= ',' )* ( (lv_export_4_0= ruleexportVariable ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getExportAccess().getExportsKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_10); 

                	newLeafNode(otherlv_1, grammarAccess.getExportAccess().getColonKeyword_1());
                
            // InternalRdsl.g:872:1: ( ( (lv_exports_2_0= ruleexportVariable ) ) otherlv_3= ',' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==33) ) {
                        int LA12_2 = input.LA(3);

                        if ( (LA12_2==RULE_INT) ) {
                            int LA12_5 = input.LA(4);

                            if ( (LA12_5==31) ) {
                                alt12=1;
                            }


                        }


                    }
                    else if ( (LA12_1==31) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalRdsl.g:872:2: ( (lv_exports_2_0= ruleexportVariable ) ) otherlv_3= ','
            	    {
            	    // InternalRdsl.g:872:2: ( (lv_exports_2_0= ruleexportVariable ) )
            	    // InternalRdsl.g:873:1: (lv_exports_2_0= ruleexportVariable )
            	    {
            	    // InternalRdsl.g:873:1: (lv_exports_2_0= ruleexportVariable )
            	    // InternalRdsl.g:874:3: lv_exports_2_0= ruleexportVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExportAccess().getExportsExportVariableParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_19);
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

            	    otherlv_3=(Token)match(input,31,FOLLOW_10); 

            	        	newLeafNode(otherlv_3, grammarAccess.getExportAccess().getCommaKeyword_2_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalRdsl.g:894:3: ( (lv_export_4_0= ruleexportVariable ) )
            // InternalRdsl.g:895:1: (lv_export_4_0= ruleexportVariable )
            {
            // InternalRdsl.g:895:1: (lv_export_4_0= ruleexportVariable )
            // InternalRdsl.g:896:3: lv_export_4_0= ruleexportVariable
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

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRdsl.g:924:1: entryRuleexportVariable returns [EObject current=null] : iv_ruleexportVariable= ruleexportVariable EOF ;
    public final EObject entryRuleexportVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexportVariable = null;


        try {
            // InternalRdsl.g:925:2: (iv_ruleexportVariable= ruleexportVariable EOF )
            // InternalRdsl.g:926:2: iv_ruleexportVariable= ruleexportVariable EOF
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
    // InternalRdsl.g:933:1: ruleexportVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_initial_1_0= ruleInitialisation ) )? ) ;
    public final EObject ruleexportVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_initial_1_0 = null;


         enterRule(); 
            
        try {
            // InternalRdsl.g:936:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_initial_1_0= ruleInitialisation ) )? ) )
            // InternalRdsl.g:937:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_initial_1_0= ruleInitialisation ) )? )
            {
            // InternalRdsl.g:937:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_initial_1_0= ruleInitialisation ) )? )
            // InternalRdsl.g:937:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_initial_1_0= ruleInitialisation ) )?
            {
            // InternalRdsl.g:937:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdsl.g:938:1: (lv_name_0_0= RULE_ID )
            {
            // InternalRdsl.g:938:1: (lv_name_0_0= RULE_ID )
            // InternalRdsl.g:939:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            // InternalRdsl.g:955:2: ( (lv_initial_1_0= ruleInitialisation ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRdsl.g:956:1: (lv_initial_1_0= ruleInitialisation )
                    {
                    // InternalRdsl.g:956:1: (lv_initial_1_0= ruleInitialisation )
                    // InternalRdsl.g:957:3: lv_initial_1_0= ruleInitialisation
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
    // InternalRdsl.g:981:1: entryRuleInitialisation returns [EObject current=null] : iv_ruleInitialisation= ruleInitialisation EOF ;
    public final EObject entryRuleInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialisation = null;


        try {
            // InternalRdsl.g:982:2: (iv_ruleInitialisation= ruleInitialisation EOF )
            // InternalRdsl.g:983:2: iv_ruleInitialisation= ruleInitialisation EOF
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
    // InternalRdsl.g:990:1: ruleInitialisation returns [EObject current=null] : (otherlv_0= '=' ( (lv_val_1_0= RULE_INT ) ) ) ;
    public final EObject ruleInitialisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;

         enterRule(); 
            
        try {
            // InternalRdsl.g:993:28: ( (otherlv_0= '=' ( (lv_val_1_0= RULE_INT ) ) ) )
            // InternalRdsl.g:994:1: (otherlv_0= '=' ( (lv_val_1_0= RULE_INT ) ) )
            {
            // InternalRdsl.g:994:1: (otherlv_0= '=' ( (lv_val_1_0= RULE_INT ) ) )
            // InternalRdsl.g:994:3: otherlv_0= '=' ( (lv_val_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getInitialisationAccess().getEqualsSignKeyword_0());
                
            // InternalRdsl.g:998:1: ( (lv_val_1_0= RULE_INT ) )
            // InternalRdsl.g:999:1: (lv_val_1_0= RULE_INT )
            {
            // InternalRdsl.g:999:1: (lv_val_1_0= RULE_INT )
            // InternalRdsl.g:1000:3: lv_val_1_0= RULE_INT
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
    // InternalRdsl.g:1024:1: entryRuleImports returns [EObject current=null] : iv_ruleImports= ruleImports EOF ;
    public final EObject entryRuleImports() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImports = null;


        try {
            // InternalRdsl.g:1025:2: (iv_ruleImports= ruleImports EOF )
            // InternalRdsl.g:1026:2: iv_ruleImports= ruleImports EOF
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
    // InternalRdsl.g:1033:1: ruleImports returns [EObject current=null] : (otherlv_0= 'imports' otherlv_1= ':' ( ( (lv_imports_2_0= ruleimportVariable ) ) otherlv_3= ',' )* ( (lv_imported_4_0= ruleimportVariable ) ) otherlv_5= ';' ) ;
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
            // InternalRdsl.g:1036:28: ( (otherlv_0= 'imports' otherlv_1= ':' ( ( (lv_imports_2_0= ruleimportVariable ) ) otherlv_3= ',' )* ( (lv_imported_4_0= ruleimportVariable ) ) otherlv_5= ';' ) )
            // InternalRdsl.g:1037:1: (otherlv_0= 'imports' otherlv_1= ':' ( ( (lv_imports_2_0= ruleimportVariable ) ) otherlv_3= ',' )* ( (lv_imported_4_0= ruleimportVariable ) ) otherlv_5= ';' )
            {
            // InternalRdsl.g:1037:1: (otherlv_0= 'imports' otherlv_1= ':' ( ( (lv_imports_2_0= ruleimportVariable ) ) otherlv_3= ',' )* ( (lv_imported_4_0= ruleimportVariable ) ) otherlv_5= ';' )
            // InternalRdsl.g:1037:3: otherlv_0= 'imports' otherlv_1= ':' ( ( (lv_imports_2_0= ruleimportVariable ) ) otherlv_3= ',' )* ( (lv_imported_4_0= ruleimportVariable ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getImportsAccess().getImportsKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_21); 

                	newLeafNode(otherlv_1, grammarAccess.getImportsAccess().getColonKeyword_1());
                
            // InternalRdsl.g:1045:1: ( ( (lv_imports_2_0= ruleimportVariable ) ) otherlv_3= ',' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==35) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==RULE_ID) ) {
                        switch ( input.LA(3) ) {
                        case 18:
                            {
                            int LA14_3 = input.LA(4);

                            if ( (LA14_3==RULE_ID) ) {
                                int LA14_7 = input.LA(5);

                                if ( (LA14_7==36) ) {
                                    int LA14_4 = input.LA(6);

                                    if ( (LA14_4==31) ) {
                                        alt14=1;
                                    }


                                }
                                else if ( (LA14_7==31) ) {
                                    alt14=1;
                                }


                            }
                            else if ( (LA14_3==24) ) {
                                int LA14_8 = input.LA(5);

                                if ( (LA14_8==36) ) {
                                    int LA14_4 = input.LA(6);

                                    if ( (LA14_4==31) ) {
                                        alt14=1;
                                    }


                                }
                                else if ( (LA14_8==31) ) {
                                    alt14=1;
                                }


                            }


                            }
                            break;
                        case 36:
                            {
                            int LA14_4 = input.LA(4);

                            if ( (LA14_4==31) ) {
                                alt14=1;
                            }


                            }
                            break;
                        case 31:
                            {
                            alt14=1;
                            }
                            break;

                        }

                    }


                }
                else if ( (LA14_0==RULE_ID) ) {
                    switch ( input.LA(2) ) {
                    case 18:
                        {
                        int LA14_3 = input.LA(3);

                        if ( (LA14_3==RULE_ID) ) {
                            int LA14_7 = input.LA(4);

                            if ( (LA14_7==36) ) {
                                int LA14_4 = input.LA(5);

                                if ( (LA14_4==31) ) {
                                    alt14=1;
                                }


                            }
                            else if ( (LA14_7==31) ) {
                                alt14=1;
                            }


                        }
                        else if ( (LA14_3==24) ) {
                            int LA14_8 = input.LA(4);

                            if ( (LA14_8==36) ) {
                                int LA14_4 = input.LA(5);

                                if ( (LA14_4==31) ) {
                                    alt14=1;
                                }


                            }
                            else if ( (LA14_8==31) ) {
                                alt14=1;
                            }


                        }


                        }
                        break;
                    case 36:
                        {
                        int LA14_4 = input.LA(3);

                        if ( (LA14_4==31) ) {
                            alt14=1;
                        }


                        }
                        break;
                    case 31:
                        {
                        alt14=1;
                        }
                        break;

                    }

                }


                switch (alt14) {
            	case 1 :
            	    // InternalRdsl.g:1045:2: ( (lv_imports_2_0= ruleimportVariable ) ) otherlv_3= ','
            	    {
            	    // InternalRdsl.g:1045:2: ( (lv_imports_2_0= ruleimportVariable ) )
            	    // InternalRdsl.g:1046:1: (lv_imports_2_0= ruleimportVariable )
            	    {
            	    // InternalRdsl.g:1046:1: (lv_imports_2_0= ruleimportVariable )
            	    // InternalRdsl.g:1047:3: lv_imports_2_0= ruleimportVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImportsAccess().getImportsImportVariableParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_19);
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

            	    otherlv_3=(Token)match(input,31,FOLLOW_21); 

            	        	newLeafNode(otherlv_3, grammarAccess.getImportsAccess().getCommaKeyword_2_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalRdsl.g:1067:3: ( (lv_imported_4_0= ruleimportVariable ) )
            // InternalRdsl.g:1068:1: (lv_imported_4_0= ruleimportVariable )
            {
            // InternalRdsl.g:1068:1: (lv_imported_4_0= ruleimportVariable )
            // InternalRdsl.g:1069:3: lv_imported_4_0= ruleimportVariable
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

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRdsl.g:1097:1: entryRuleimportVariable returns [EObject current=null] : iv_ruleimportVariable= ruleimportVariable EOF ;
    public final EObject entryRuleimportVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleimportVariable = null;


        try {
            // InternalRdsl.g:1098:2: (iv_ruleimportVariable= ruleimportVariable EOF )
            // InternalRdsl.g:1099:2: iv_ruleimportVariable= ruleimportVariable EOF
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
    // InternalRdsl.g:1106:1: ruleimportVariable returns [EObject current=null] : ( ( (lv_external_0_0= 'external' ) )? ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( (lv_optional_6_0= '(optional)' ) )? ) ;
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
            // InternalRdsl.g:1109:28: ( ( ( (lv_external_0_0= 'external' ) )? ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( (lv_optional_6_0= '(optional)' ) )? ) )
            // InternalRdsl.g:1110:1: ( ( (lv_external_0_0= 'external' ) )? ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( (lv_optional_6_0= '(optional)' ) )? )
            {
            // InternalRdsl.g:1110:1: ( ( (lv_external_0_0= 'external' ) )? ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( (lv_optional_6_0= '(optional)' ) )? )
            // InternalRdsl.g:1110:2: ( (lv_external_0_0= 'external' ) )? ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( (lv_optional_6_0= '(optional)' ) )?
            {
            // InternalRdsl.g:1110:2: ( (lv_external_0_0= 'external' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRdsl.g:1111:1: (lv_external_0_0= 'external' )
                    {
                    // InternalRdsl.g:1111:1: (lv_external_0_0= 'external' )
                    // InternalRdsl.g:1112:3: lv_external_0_0= 'external'
                    {
                    lv_external_0_0=(Token)match(input,35,FOLLOW_10); 

                            newLeafNode(lv_external_0_0, grammarAccess.getImportVariableAccess().getExternalExternalKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImportVariableRule());
                    	        }
                           		setWithLastConsumed(current, "external", true, "external");
                    	    

                    }


                    }
                    break;

            }

            // InternalRdsl.g:1125:3: ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' ) ) | ( (lv_name_5_0= RULE_ID ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==18) ) {
                    alt17=1;
                }
                else if ( (LA17_1==EOF||LA17_1==14||LA17_1==31||LA17_1==36) ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalRdsl.g:1125:4: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' ) )
                    {
                    // InternalRdsl.g:1125:4: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' ) )
                    // InternalRdsl.g:1125:5: ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' )
                    {
                    // InternalRdsl.g:1125:5: ( (otherlv_1= RULE_ID ) )
                    // InternalRdsl.g:1126:1: (otherlv_1= RULE_ID )
                    {
                    // InternalRdsl.g:1126:1: (otherlv_1= RULE_ID )
                    // InternalRdsl.g:1127:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getImportVariableRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_11); 

                    		newLeafNode(otherlv_1, grammarAccess.getImportVariableAccess().getImportvariableCompFacetCrossReference_1_0_0_0()); 
                    	

                    }


                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_22); 

                        	newLeafNode(otherlv_2, grammarAccess.getImportVariableAccess().getFullStopKeyword_1_0_1());
                        
                    // InternalRdsl.g:1142:1: ( ( (lv_name_3_0= RULE_ID ) ) | otherlv_4= '*' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_ID) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==24) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalRdsl.g:1142:2: ( (lv_name_3_0= RULE_ID ) )
                            {
                            // InternalRdsl.g:1142:2: ( (lv_name_3_0= RULE_ID ) )
                            // InternalRdsl.g:1143:1: (lv_name_3_0= RULE_ID )
                            {
                            // InternalRdsl.g:1143:1: (lv_name_3_0= RULE_ID )
                            // InternalRdsl.g:1144:3: lv_name_3_0= RULE_ID
                            {
                            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_23); 

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
                            // InternalRdsl.g:1161:7: otherlv_4= '*'
                            {
                            otherlv_4=(Token)match(input,24,FOLLOW_23); 

                                	newLeafNode(otherlv_4, grammarAccess.getImportVariableAccess().getAsteriskKeyword_1_0_2_1());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRdsl.g:1166:6: ( (lv_name_5_0= RULE_ID ) )
                    {
                    // InternalRdsl.g:1166:6: ( (lv_name_5_0= RULE_ID ) )
                    // InternalRdsl.g:1167:1: (lv_name_5_0= RULE_ID )
                    {
                    // InternalRdsl.g:1167:1: (lv_name_5_0= RULE_ID )
                    // InternalRdsl.g:1168:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_23); 

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

            // InternalRdsl.g:1184:3: ( (lv_optional_6_0= '(optional)' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRdsl.g:1185:1: (lv_optional_6_0= '(optional)' )
                    {
                    // InternalRdsl.g:1185:1: (lv_optional_6_0= '(optional)' )
                    // InternalRdsl.g:1186:3: lv_optional_6_0= '(optional)'
                    {
                    lv_optional_6_0=(Token)match(input,36,FOLLOW_2); 

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
    // InternalRdsl.g:1207:1: entryRuleFacets returns [EObject current=null] : iv_ruleFacets= ruleFacets EOF ;
    public final EObject entryRuleFacets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacets = null;


        try {
            // InternalRdsl.g:1208:2: (iv_ruleFacets= ruleFacets EOF )
            // InternalRdsl.g:1209:2: iv_ruleFacets= ruleFacets EOF
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
    // InternalRdsl.g:1216:1: ruleFacets returns [EObject current=null] : (otherlv_0= 'facets' otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )* ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) ;
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
            // InternalRdsl.g:1219:28: ( (otherlv_0= 'facets' otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )* ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalRdsl.g:1220:1: (otherlv_0= 'facets' otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )* ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalRdsl.g:1220:1: (otherlv_0= 'facets' otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )* ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            // InternalRdsl.g:1220:3: otherlv_0= 'facets' otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )* ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getFacetsAccess().getFacetsKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_10); 

                	newLeafNode(otherlv_1, grammarAccess.getFacetsAccess().getColonKeyword_1());
                
            // InternalRdsl.g:1228:1: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==31) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalRdsl.g:1228:2: ( (otherlv_2= RULE_ID ) ) otherlv_3= ','
            	    {
            	    // InternalRdsl.g:1228:2: ( (otherlv_2= RULE_ID ) )
            	    // InternalRdsl.g:1229:1: (otherlv_2= RULE_ID )
            	    {
            	    // InternalRdsl.g:1229:1: (otherlv_2= RULE_ID )
            	    // InternalRdsl.g:1230:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFacetsRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    		newLeafNode(otherlv_2, grammarAccess.getFacetsAccess().getFacetsFacetCrossReference_2_0_0()); 
            	    	

            	    }


            	    }

            	    otherlv_3=(Token)match(input,31,FOLLOW_10); 

            	        	newLeafNode(otherlv_3, grammarAccess.getFacetsAccess().getCommaKeyword_2_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalRdsl.g:1245:3: ( (otherlv_4= RULE_ID ) )
            // InternalRdsl.g:1246:1: (otherlv_4= RULE_ID )
            {
            // InternalRdsl.g:1246:1: (otherlv_4= RULE_ID )
            // InternalRdsl.g:1247:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFacetsRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_6); 

            		newLeafNode(otherlv_4, grammarAccess.getFacetsAccess().getFacetFacetCrossReference_3_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRdsl.g:1270:1: entryRuleFacet returns [EObject current=null] : iv_ruleFacet= ruleFacet EOF ;
    public final EObject entryRuleFacet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacet = null;


        try {
            // InternalRdsl.g:1271:2: (iv_ruleFacet= ruleFacet EOF )
            // InternalRdsl.g:1272:2: iv_ruleFacet= ruleFacet EOF
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
    // InternalRdsl.g:1279:1: ruleFacet returns [EObject current=null] : (otherlv_0= 'facet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_exportFacet_3_0= ruleExport ) )* ( (lv_childrenFacet_4_0= ruleChildren ) )? (otherlv_5= 'extends' otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )* ( (otherlv_9= RULE_ID ) ) )? otherlv_10= '}' ) ;
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
            // InternalRdsl.g:1282:28: ( (otherlv_0= 'facet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_exportFacet_3_0= ruleExport ) )* ( (lv_childrenFacet_4_0= ruleChildren ) )? (otherlv_5= 'extends' otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )* ( (otherlv_9= RULE_ID ) ) )? otherlv_10= '}' ) )
            // InternalRdsl.g:1283:1: (otherlv_0= 'facet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_exportFacet_3_0= ruleExport ) )* ( (lv_childrenFacet_4_0= ruleChildren ) )? (otherlv_5= 'extends' otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )* ( (otherlv_9= RULE_ID ) ) )? otherlv_10= '}' )
            {
            // InternalRdsl.g:1283:1: (otherlv_0= 'facet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_exportFacet_3_0= ruleExport ) )* ( (lv_childrenFacet_4_0= ruleChildren ) )? (otherlv_5= 'extends' otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )* ( (otherlv_9= RULE_ID ) ) )? otherlv_10= '}' )
            // InternalRdsl.g:1283:3: otherlv_0= 'facet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_exportFacet_3_0= ruleExport ) )* ( (lv_childrenFacet_4_0= ruleChildren ) )? (otherlv_5= 'extends' otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )* ( (otherlv_9= RULE_ID ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_10); 

                	newLeafNode(otherlv_0, grammarAccess.getFacetAccess().getFacetKeyword_0());
                
            // InternalRdsl.g:1287:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalRdsl.g:1288:1: (lv_name_1_0= RULE_ID )
            {
            // InternalRdsl.g:1288:1: (lv_name_1_0= RULE_ID )
            // InternalRdsl.g:1289:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            otherlv_2=(Token)match(input,26,FOLLOW_24); 

                	newLeafNode(otherlv_2, grammarAccess.getFacetAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalRdsl.g:1309:1: ( (lv_exportFacet_3_0= ruleExport ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==32) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRdsl.g:1310:1: (lv_exportFacet_3_0= ruleExport )
            	    {
            	    // InternalRdsl.g:1310:1: (lv_exportFacet_3_0= ruleExport )
            	    // InternalRdsl.g:1311:3: lv_exportFacet_3_0= ruleExport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFacetAccess().getExportFacetExportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_24);
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
            	    break loop20;
                }
            } while (true);

            // InternalRdsl.g:1327:3: ( (lv_childrenFacet_4_0= ruleChildren ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRdsl.g:1328:1: (lv_childrenFacet_4_0= ruleChildren )
                    {
                    // InternalRdsl.g:1328:1: (lv_childrenFacet_4_0= ruleChildren )
                    // InternalRdsl.g:1329:3: lv_childrenFacet_4_0= ruleChildren
                    {
                     
                    	        newCompositeNode(grammarAccess.getFacetAccess().getChildrenFacetChildrenParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_25);
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

            // InternalRdsl.g:1345:3: (otherlv_5= 'extends' otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )* ( (otherlv_9= RULE_ID ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRdsl.g:1345:5: otherlv_5= 'extends' otherlv_6= ':' ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )* ( (otherlv_9= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_4); 

                        	newLeafNode(otherlv_5, grammarAccess.getFacetAccess().getExtendsKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,13,FOLLOW_10); 

                        	newLeafNode(otherlv_6, grammarAccess.getFacetAccess().getColonKeyword_5_1());
                        
                    // InternalRdsl.g:1353:1: ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_ID) ) {
                            int LA22_1 = input.LA(2);

                            if ( (LA22_1==31) ) {
                                alt22=1;
                            }


                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalRdsl.g:1353:2: ( (otherlv_7= RULE_ID ) ) otherlv_8= ','
                    	    {
                    	    // InternalRdsl.g:1353:2: ( (otherlv_7= RULE_ID ) )
                    	    // InternalRdsl.g:1354:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalRdsl.g:1354:1: (otherlv_7= RULE_ID )
                    	    // InternalRdsl.g:1355:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getFacetRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_19); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getFacetAccess().getSupFacetsFacetCrossReference_5_2_0_0()); 
                    	    	

                    	    }


                    	    }

                    	    otherlv_8=(Token)match(input,31,FOLLOW_10); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getFacetAccess().getCommaKeyword_5_2_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    // InternalRdsl.g:1370:3: ( (otherlv_9= RULE_ID ) )
                    // InternalRdsl.g:1371:1: (otherlv_9= RULE_ID )
                    {
                    // InternalRdsl.g:1371:1: (otherlv_9= RULE_ID )
                    // InternalRdsl.g:1372:3: otherlv_9= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFacetRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_26); 

                    		newLeafNode(otherlv_9, grammarAccess.getFacetAccess().getSupFacetFacetCrossReference_5_3_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

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
    // InternalRdsl.g:1395:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // InternalRdsl.g:1396:2: (iv_ruleInstance= ruleInstance EOF )
            // InternalRdsl.g:1397:2: iv_ruleInstance= ruleInstance EOF
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
    // InternalRdsl.g:1404:1: ruleInstance returns [EObject current=null] : (otherlv_0= 'instance' otherlv_1= 'of' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= RULE_ID ) ) ( (lv_fullname_7_0= ruleFullname ) )* otherlv_8= ';' ( ( (lv_count_9_0= 'count' ) ) otherlv_10= ':' ( (lv_val_11_0= RULE_INT ) ) otherlv_12= ';' )? (otherlv_13= 'minAllowedInstances' otherlv_14= ':' ( (lv_valmin_15_0= RULE_INT ) ) otherlv_16= ';' )? (otherlv_17= 'maxAllowedInstances' otherlv_18= ':' ( (lv_valmax_19_0= RULE_INT ) ) otherlv_20= ';' )? (otherlv_21= 'adressType' otherlv_22= ':' ( (lv_ipAddress_23_0= ruleAType ) ) otherlv_24= ';' )? (otherlv_25= 'ipv4' otherlv_26= 'address' otherlv_27= ':' ( ( ( (lv_ip4_28_0= RULE_INT ) ) otherlv_29= '.' )* ( (lv_ip4last_30_0= RULE_INT ) ) ) otherlv_31= ';' )? (otherlv_32= 'ipv6' otherlv_33= 'address' otherlv_34= ':' ( ( ( (lv_ip6_35_0= RULE_INT ) ) otherlv_36= ':' )* ( (lv_ip6last_37_0= RULE_INT ) ) ) otherlv_38= ';' )? (otherlv_39= 'load' otherlv_40= ':' ( (lv_theLoad_41_0= RULE_INT ) ) otherlv_42= ';' )? (otherlv_43= 'state' otherlv_44= ':' ( ( (lv_theState_45_1= 'public' | lv_theState_45_2= 'private' ) ) ) otherlv_46= ';' )? (otherlv_47= 'hostname' otherlv_48= ':' ( (lv_hostname_49_0= RULE_ID ) ) otherlv_50= ';' )? ( (lv_iptable_51_0= ruleIpTable ) )* ( (lv_attributes_52_0= ruleAttribut ) )* ( (lv_instances_53_0= ruleInstance ) )* otherlv_54= '}' ) ;
    public final EObject ruleInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_8=null;
        Token lv_count_9_0=null;
        Token otherlv_10=null;
        Token lv_val_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_valmin_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_valmax_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token lv_ip4_28_0=null;
        Token otherlv_29=null;
        Token lv_ip4last_30_0=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token lv_ip6_35_0=null;
        Token otherlv_36=null;
        Token lv_ip6last_37_0=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token lv_theLoad_41_0=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token lv_theState_45_1=null;
        Token lv_theState_45_2=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token lv_hostname_49_0=null;
        Token otherlv_50=null;
        Token otherlv_54=null;
        AntlrDatatypeRuleToken lv_fullname_7_0 = null;

        AntlrDatatypeRuleToken lv_ipAddress_23_0 = null;

        EObject lv_iptable_51_0 = null;

        EObject lv_attributes_52_0 = null;

        EObject lv_instances_53_0 = null;


         enterRule(); 
            
        try {
            // InternalRdsl.g:1407:28: ( (otherlv_0= 'instance' otherlv_1= 'of' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= RULE_ID ) ) ( (lv_fullname_7_0= ruleFullname ) )* otherlv_8= ';' ( ( (lv_count_9_0= 'count' ) ) otherlv_10= ':' ( (lv_val_11_0= RULE_INT ) ) otherlv_12= ';' )? (otherlv_13= 'minAllowedInstances' otherlv_14= ':' ( (lv_valmin_15_0= RULE_INT ) ) otherlv_16= ';' )? (otherlv_17= 'maxAllowedInstances' otherlv_18= ':' ( (lv_valmax_19_0= RULE_INT ) ) otherlv_20= ';' )? (otherlv_21= 'adressType' otherlv_22= ':' ( (lv_ipAddress_23_0= ruleAType ) ) otherlv_24= ';' )? (otherlv_25= 'ipv4' otherlv_26= 'address' otherlv_27= ':' ( ( ( (lv_ip4_28_0= RULE_INT ) ) otherlv_29= '.' )* ( (lv_ip4last_30_0= RULE_INT ) ) ) otherlv_31= ';' )? (otherlv_32= 'ipv6' otherlv_33= 'address' otherlv_34= ':' ( ( ( (lv_ip6_35_0= RULE_INT ) ) otherlv_36= ':' )* ( (lv_ip6last_37_0= RULE_INT ) ) ) otherlv_38= ';' )? (otherlv_39= 'load' otherlv_40= ':' ( (lv_theLoad_41_0= RULE_INT ) ) otherlv_42= ';' )? (otherlv_43= 'state' otherlv_44= ':' ( ( (lv_theState_45_1= 'public' | lv_theState_45_2= 'private' ) ) ) otherlv_46= ';' )? (otherlv_47= 'hostname' otherlv_48= ':' ( (lv_hostname_49_0= RULE_ID ) ) otherlv_50= ';' )? ( (lv_iptable_51_0= ruleIpTable ) )* ( (lv_attributes_52_0= ruleAttribut ) )* ( (lv_instances_53_0= ruleInstance ) )* otherlv_54= '}' ) )
            // InternalRdsl.g:1408:1: (otherlv_0= 'instance' otherlv_1= 'of' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= RULE_ID ) ) ( (lv_fullname_7_0= ruleFullname ) )* otherlv_8= ';' ( ( (lv_count_9_0= 'count' ) ) otherlv_10= ':' ( (lv_val_11_0= RULE_INT ) ) otherlv_12= ';' )? (otherlv_13= 'minAllowedInstances' otherlv_14= ':' ( (lv_valmin_15_0= RULE_INT ) ) otherlv_16= ';' )? (otherlv_17= 'maxAllowedInstances' otherlv_18= ':' ( (lv_valmax_19_0= RULE_INT ) ) otherlv_20= ';' )? (otherlv_21= 'adressType' otherlv_22= ':' ( (lv_ipAddress_23_0= ruleAType ) ) otherlv_24= ';' )? (otherlv_25= 'ipv4' otherlv_26= 'address' otherlv_27= ':' ( ( ( (lv_ip4_28_0= RULE_INT ) ) otherlv_29= '.' )* ( (lv_ip4last_30_0= RULE_INT ) ) ) otherlv_31= ';' )? (otherlv_32= 'ipv6' otherlv_33= 'address' otherlv_34= ':' ( ( ( (lv_ip6_35_0= RULE_INT ) ) otherlv_36= ':' )* ( (lv_ip6last_37_0= RULE_INT ) ) ) otherlv_38= ';' )? (otherlv_39= 'load' otherlv_40= ':' ( (lv_theLoad_41_0= RULE_INT ) ) otherlv_42= ';' )? (otherlv_43= 'state' otherlv_44= ':' ( ( (lv_theState_45_1= 'public' | lv_theState_45_2= 'private' ) ) ) otherlv_46= ';' )? (otherlv_47= 'hostname' otherlv_48= ':' ( (lv_hostname_49_0= RULE_ID ) ) otherlv_50= ';' )? ( (lv_iptable_51_0= ruleIpTable ) )* ( (lv_attributes_52_0= ruleAttribut ) )* ( (lv_instances_53_0= ruleInstance ) )* otherlv_54= '}' )
            {
            // InternalRdsl.g:1408:1: (otherlv_0= 'instance' otherlv_1= 'of' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= RULE_ID ) ) ( (lv_fullname_7_0= ruleFullname ) )* otherlv_8= ';' ( ( (lv_count_9_0= 'count' ) ) otherlv_10= ':' ( (lv_val_11_0= RULE_INT ) ) otherlv_12= ';' )? (otherlv_13= 'minAllowedInstances' otherlv_14= ':' ( (lv_valmin_15_0= RULE_INT ) ) otherlv_16= ';' )? (otherlv_17= 'maxAllowedInstances' otherlv_18= ':' ( (lv_valmax_19_0= RULE_INT ) ) otherlv_20= ';' )? (otherlv_21= 'adressType' otherlv_22= ':' ( (lv_ipAddress_23_0= ruleAType ) ) otherlv_24= ';' )? (otherlv_25= 'ipv4' otherlv_26= 'address' otherlv_27= ':' ( ( ( (lv_ip4_28_0= RULE_INT ) ) otherlv_29= '.' )* ( (lv_ip4last_30_0= RULE_INT ) ) ) otherlv_31= ';' )? (otherlv_32= 'ipv6' otherlv_33= 'address' otherlv_34= ':' ( ( ( (lv_ip6_35_0= RULE_INT ) ) otherlv_36= ':' )* ( (lv_ip6last_37_0= RULE_INT ) ) ) otherlv_38= ';' )? (otherlv_39= 'load' otherlv_40= ':' ( (lv_theLoad_41_0= RULE_INT ) ) otherlv_42= ';' )? (otherlv_43= 'state' otherlv_44= ':' ( ( (lv_theState_45_1= 'public' | lv_theState_45_2= 'private' ) ) ) otherlv_46= ';' )? (otherlv_47= 'hostname' otherlv_48= ':' ( (lv_hostname_49_0= RULE_ID ) ) otherlv_50= ';' )? ( (lv_iptable_51_0= ruleIpTable ) )* ( (lv_attributes_52_0= ruleAttribut ) )* ( (lv_instances_53_0= ruleInstance ) )* otherlv_54= '}' )
            // InternalRdsl.g:1408:3: otherlv_0= 'instance' otherlv_1= 'of' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= RULE_ID ) ) ( (lv_fullname_7_0= ruleFullname ) )* otherlv_8= ';' ( ( (lv_count_9_0= 'count' ) ) otherlv_10= ':' ( (lv_val_11_0= RULE_INT ) ) otherlv_12= ';' )? (otherlv_13= 'minAllowedInstances' otherlv_14= ':' ( (lv_valmin_15_0= RULE_INT ) ) otherlv_16= ';' )? (otherlv_17= 'maxAllowedInstances' otherlv_18= ':' ( (lv_valmax_19_0= RULE_INT ) ) otherlv_20= ';' )? (otherlv_21= 'adressType' otherlv_22= ':' ( (lv_ipAddress_23_0= ruleAType ) ) otherlv_24= ';' )? (otherlv_25= 'ipv4' otherlv_26= 'address' otherlv_27= ':' ( ( ( (lv_ip4_28_0= RULE_INT ) ) otherlv_29= '.' )* ( (lv_ip4last_30_0= RULE_INT ) ) ) otherlv_31= ';' )? (otherlv_32= 'ipv6' otherlv_33= 'address' otherlv_34= ':' ( ( ( (lv_ip6_35_0= RULE_INT ) ) otherlv_36= ':' )* ( (lv_ip6last_37_0= RULE_INT ) ) ) otherlv_38= ';' )? (otherlv_39= 'load' otherlv_40= ':' ( (lv_theLoad_41_0= RULE_INT ) ) otherlv_42= ';' )? (otherlv_43= 'state' otherlv_44= ':' ( ( (lv_theState_45_1= 'public' | lv_theState_45_2= 'private' ) ) ) otherlv_46= ';' )? (otherlv_47= 'hostname' otherlv_48= ':' ( (lv_hostname_49_0= RULE_ID ) ) otherlv_50= ';' )? ( (lv_iptable_51_0= ruleIpTable ) )* ( (lv_attributes_52_0= ruleAttribut ) )* ( (lv_instances_53_0= ruleInstance ) )* otherlv_54= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_27); 

                	newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getInstanceKeyword_0());
                
            otherlv_1=(Token)match(input,40,FOLLOW_10); 

                	newLeafNode(otherlv_1, grammarAccess.getInstanceAccess().getOfKeyword_1());
                
            // InternalRdsl.g:1416:1: ( (otherlv_2= RULE_ID ) )
            // InternalRdsl.g:1417:1: (otherlv_2= RULE_ID )
            {
            // InternalRdsl.g:1417:1: (otherlv_2= RULE_ID )
            // InternalRdsl.g:1418:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInstanceRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            		newLeafNode(otherlv_2, grammarAccess.getInstanceAccess().getComponentComponentCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_28); 

                	newLeafNode(otherlv_3, grammarAccess.getInstanceAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,41,FOLLOW_4); 

                	newLeafNode(otherlv_4, grammarAccess.getInstanceAccess().getNameKeyword_4());
                
            otherlv_5=(Token)match(input,13,FOLLOW_10); 

                	newLeafNode(otherlv_5, grammarAccess.getInstanceAccess().getColonKeyword_5());
                
            // InternalRdsl.g:1441:1: ( (lv_name_6_0= RULE_ID ) )
            // InternalRdsl.g:1442:1: (lv_name_6_0= RULE_ID )
            {
            // InternalRdsl.g:1442:1: (lv_name_6_0= RULE_ID )
            // InternalRdsl.g:1443:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            			newLeafNode(lv_name_6_0, grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInstanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_6_0, 
                    		"org.xtext.Rdsl.ID");
            	    

            }


            }

            // InternalRdsl.g:1459:2: ( (lv_fullname_7_0= ruleFullname ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_INT && LA24_0<=RULE_ID)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRdsl.g:1460:1: (lv_fullname_7_0= ruleFullname )
            	    {
            	    // InternalRdsl.g:1460:1: (lv_fullname_7_0= ruleFullname )
            	    // InternalRdsl.g:1461:3: lv_fullname_7_0= ruleFullname
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInstanceAccess().getFullnameFullnameParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_29);
            	    lv_fullname_7_0=ruleFullname();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInstanceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fullname",
            	            		lv_fullname_7_0, 
            	            		"org.xtext.Rdsl.Fullname");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_30); 

                	newLeafNode(otherlv_8, grammarAccess.getInstanceAccess().getSemicolonKeyword_8());
                
            // InternalRdsl.g:1481:1: ( ( (lv_count_9_0= 'count' ) ) otherlv_10= ':' ( (lv_val_11_0= RULE_INT ) ) otherlv_12= ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRdsl.g:1481:2: ( (lv_count_9_0= 'count' ) ) otherlv_10= ':' ( (lv_val_11_0= RULE_INT ) ) otherlv_12= ';'
                    {
                    // InternalRdsl.g:1481:2: ( (lv_count_9_0= 'count' ) )
                    // InternalRdsl.g:1482:1: (lv_count_9_0= 'count' )
                    {
                    // InternalRdsl.g:1482:1: (lv_count_9_0= 'count' )
                    // InternalRdsl.g:1483:3: lv_count_9_0= 'count'
                    {
                    lv_count_9_0=(Token)match(input,42,FOLLOW_4); 

                            newLeafNode(lv_count_9_0, grammarAccess.getInstanceAccess().getCountCountKeyword_9_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(current, "count", lv_count_9_0, "count");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,13,FOLLOW_5); 

                        	newLeafNode(otherlv_10, grammarAccess.getInstanceAccess().getColonKeyword_9_1());
                        
                    // InternalRdsl.g:1500:1: ( (lv_val_11_0= RULE_INT ) )
                    // InternalRdsl.g:1501:1: (lv_val_11_0= RULE_INT )
                    {
                    // InternalRdsl.g:1501:1: (lv_val_11_0= RULE_INT )
                    // InternalRdsl.g:1502:3: lv_val_11_0= RULE_INT
                    {
                    lv_val_11_0=(Token)match(input,RULE_INT,FOLLOW_6); 

                    			newLeafNode(lv_val_11_0, grammarAccess.getInstanceAccess().getValINTTerminalRuleCall_9_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_11_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,14,FOLLOW_31); 

                        	newLeafNode(otherlv_12, grammarAccess.getInstanceAccess().getSemicolonKeyword_9_3());
                        

                    }
                    break;

            }

            // InternalRdsl.g:1522:3: (otherlv_13= 'minAllowedInstances' otherlv_14= ':' ( (lv_valmin_15_0= RULE_INT ) ) otherlv_16= ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==12) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRdsl.g:1522:5: otherlv_13= 'minAllowedInstances' otherlv_14= ':' ( (lv_valmin_15_0= RULE_INT ) ) otherlv_16= ';'
                    {
                    otherlv_13=(Token)match(input,12,FOLLOW_4); 

                        	newLeafNode(otherlv_13, grammarAccess.getInstanceAccess().getMinAllowedInstancesKeyword_10_0());
                        
                    otherlv_14=(Token)match(input,13,FOLLOW_5); 

                        	newLeafNode(otherlv_14, grammarAccess.getInstanceAccess().getColonKeyword_10_1());
                        
                    // InternalRdsl.g:1530:1: ( (lv_valmin_15_0= RULE_INT ) )
                    // InternalRdsl.g:1531:1: (lv_valmin_15_0= RULE_INT )
                    {
                    // InternalRdsl.g:1531:1: (lv_valmin_15_0= RULE_INT )
                    // InternalRdsl.g:1532:3: lv_valmin_15_0= RULE_INT
                    {
                    lv_valmin_15_0=(Token)match(input,RULE_INT,FOLLOW_6); 

                    			newLeafNode(lv_valmin_15_0, grammarAccess.getInstanceAccess().getValminINTTerminalRuleCall_10_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valmin",
                            		lv_valmin_15_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }

                    otherlv_16=(Token)match(input,14,FOLLOW_31); 

                        	newLeafNode(otherlv_16, grammarAccess.getInstanceAccess().getSemicolonKeyword_10_3());
                        

                    }
                    break;

            }

            // InternalRdsl.g:1552:3: (otherlv_17= 'maxAllowedInstances' otherlv_18= ':' ( (lv_valmax_19_0= RULE_INT ) ) otherlv_20= ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==15) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRdsl.g:1552:5: otherlv_17= 'maxAllowedInstances' otherlv_18= ':' ( (lv_valmax_19_0= RULE_INT ) ) otherlv_20= ';'
                    {
                    otherlv_17=(Token)match(input,15,FOLLOW_4); 

                        	newLeafNode(otherlv_17, grammarAccess.getInstanceAccess().getMaxAllowedInstancesKeyword_11_0());
                        
                    otherlv_18=(Token)match(input,13,FOLLOW_5); 

                        	newLeafNode(otherlv_18, grammarAccess.getInstanceAccess().getColonKeyword_11_1());
                        
                    // InternalRdsl.g:1560:1: ( (lv_valmax_19_0= RULE_INT ) )
                    // InternalRdsl.g:1561:1: (lv_valmax_19_0= RULE_INT )
                    {
                    // InternalRdsl.g:1561:1: (lv_valmax_19_0= RULE_INT )
                    // InternalRdsl.g:1562:3: lv_valmax_19_0= RULE_INT
                    {
                    lv_valmax_19_0=(Token)match(input,RULE_INT,FOLLOW_6); 

                    			newLeafNode(lv_valmax_19_0, grammarAccess.getInstanceAccess().getValmaxINTTerminalRuleCall_11_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valmax",
                            		lv_valmax_19_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }

                    otherlv_20=(Token)match(input,14,FOLLOW_31); 

                        	newLeafNode(otherlv_20, grammarAccess.getInstanceAccess().getSemicolonKeyword_11_3());
                        

                    }
                    break;

            }

            // InternalRdsl.g:1582:3: (otherlv_21= 'adressType' otherlv_22= ':' ( (lv_ipAddress_23_0= ruleAType ) ) otherlv_24= ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==43) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRdsl.g:1582:5: otherlv_21= 'adressType' otherlv_22= ':' ( (lv_ipAddress_23_0= ruleAType ) ) otherlv_24= ';'
                    {
                    otherlv_21=(Token)match(input,43,FOLLOW_4); 

                        	newLeafNode(otherlv_21, grammarAccess.getInstanceAccess().getAdressTypeKeyword_12_0());
                        
                    otherlv_22=(Token)match(input,13,FOLLOW_32); 

                        	newLeafNode(otherlv_22, grammarAccess.getInstanceAccess().getColonKeyword_12_1());
                        
                    // InternalRdsl.g:1590:1: ( (lv_ipAddress_23_0= ruleAType ) )
                    // InternalRdsl.g:1591:1: (lv_ipAddress_23_0= ruleAType )
                    {
                    // InternalRdsl.g:1591:1: (lv_ipAddress_23_0= ruleAType )
                    // InternalRdsl.g:1592:3: lv_ipAddress_23_0= ruleAType
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstanceAccess().getIpAddressATypeParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FOLLOW_6);
                    lv_ipAddress_23_0=ruleAType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInstanceRule());
                    	        }
                           		set(
                           			current, 
                           			"ipAddress",
                            		lv_ipAddress_23_0, 
                            		"org.xtext.Rdsl.AType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_24=(Token)match(input,14,FOLLOW_33); 

                        	newLeafNode(otherlv_24, grammarAccess.getInstanceAccess().getSemicolonKeyword_12_3());
                        

                    }
                    break;

            }

            // InternalRdsl.g:1612:3: (otherlv_25= 'ipv4' otherlv_26= 'address' otherlv_27= ':' ( ( ( (lv_ip4_28_0= RULE_INT ) ) otherlv_29= '.' )* ( (lv_ip4last_30_0= RULE_INT ) ) ) otherlv_31= ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==44) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRdsl.g:1612:5: otherlv_25= 'ipv4' otherlv_26= 'address' otherlv_27= ':' ( ( ( (lv_ip4_28_0= RULE_INT ) ) otherlv_29= '.' )* ( (lv_ip4last_30_0= RULE_INT ) ) ) otherlv_31= ';'
                    {
                    otherlv_25=(Token)match(input,44,FOLLOW_34); 

                        	newLeafNode(otherlv_25, grammarAccess.getInstanceAccess().getIpv4Keyword_13_0());
                        
                    otherlv_26=(Token)match(input,45,FOLLOW_4); 

                        	newLeafNode(otherlv_26, grammarAccess.getInstanceAccess().getAddressKeyword_13_1());
                        
                    otherlv_27=(Token)match(input,13,FOLLOW_5); 

                        	newLeafNode(otherlv_27, grammarAccess.getInstanceAccess().getColonKeyword_13_2());
                        
                    // InternalRdsl.g:1624:1: ( ( ( (lv_ip4_28_0= RULE_INT ) ) otherlv_29= '.' )* ( (lv_ip4last_30_0= RULE_INT ) ) )
                    // InternalRdsl.g:1624:2: ( ( (lv_ip4_28_0= RULE_INT ) ) otherlv_29= '.' )* ( (lv_ip4last_30_0= RULE_INT ) )
                    {
                    // InternalRdsl.g:1624:2: ( ( (lv_ip4_28_0= RULE_INT ) ) otherlv_29= '.' )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_INT) ) {
                            int LA29_1 = input.LA(2);

                            if ( (LA29_1==18) ) {
                                alt29=1;
                            }


                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalRdsl.g:1624:3: ( (lv_ip4_28_0= RULE_INT ) ) otherlv_29= '.'
                    	    {
                    	    // InternalRdsl.g:1624:3: ( (lv_ip4_28_0= RULE_INT ) )
                    	    // InternalRdsl.g:1625:1: (lv_ip4_28_0= RULE_INT )
                    	    {
                    	    // InternalRdsl.g:1625:1: (lv_ip4_28_0= RULE_INT )
                    	    // InternalRdsl.g:1626:3: lv_ip4_28_0= RULE_INT
                    	    {
                    	    lv_ip4_28_0=(Token)match(input,RULE_INT,FOLLOW_11); 

                    	    			newLeafNode(lv_ip4_28_0, grammarAccess.getInstanceAccess().getIp4INTTerminalRuleCall_13_3_0_0_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"ip4",
                    	            		lv_ip4_28_0, 
                    	            		"org.eclipse.xtext.common.Terminals.INT");
                    	    	    

                    	    }


                    	    }

                    	    otherlv_29=(Token)match(input,18,FOLLOW_5); 

                    	        	newLeafNode(otherlv_29, grammarAccess.getInstanceAccess().getFullStopKeyword_13_3_0_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    // InternalRdsl.g:1646:3: ( (lv_ip4last_30_0= RULE_INT ) )
                    // InternalRdsl.g:1647:1: (lv_ip4last_30_0= RULE_INT )
                    {
                    // InternalRdsl.g:1647:1: (lv_ip4last_30_0= RULE_INT )
                    // InternalRdsl.g:1648:3: lv_ip4last_30_0= RULE_INT
                    {
                    lv_ip4last_30_0=(Token)match(input,RULE_INT,FOLLOW_6); 

                    			newLeafNode(lv_ip4last_30_0, grammarAccess.getInstanceAccess().getIp4lastINTTerminalRuleCall_13_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ip4last",
                            		lv_ip4last_30_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }

                    otherlv_31=(Token)match(input,14,FOLLOW_35); 

                        	newLeafNode(otherlv_31, grammarAccess.getInstanceAccess().getSemicolonKeyword_13_4());
                        

                    }
                    break;

            }

            // InternalRdsl.g:1668:3: (otherlv_32= 'ipv6' otherlv_33= 'address' otherlv_34= ':' ( ( ( (lv_ip6_35_0= RULE_INT ) ) otherlv_36= ':' )* ( (lv_ip6last_37_0= RULE_INT ) ) ) otherlv_38= ';' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==46) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRdsl.g:1668:5: otherlv_32= 'ipv6' otherlv_33= 'address' otherlv_34= ':' ( ( ( (lv_ip6_35_0= RULE_INT ) ) otherlv_36= ':' )* ( (lv_ip6last_37_0= RULE_INT ) ) ) otherlv_38= ';'
                    {
                    otherlv_32=(Token)match(input,46,FOLLOW_34); 

                        	newLeafNode(otherlv_32, grammarAccess.getInstanceAccess().getIpv6Keyword_14_0());
                        
                    otherlv_33=(Token)match(input,45,FOLLOW_4); 

                        	newLeafNode(otherlv_33, grammarAccess.getInstanceAccess().getAddressKeyword_14_1());
                        
                    otherlv_34=(Token)match(input,13,FOLLOW_5); 

                        	newLeafNode(otherlv_34, grammarAccess.getInstanceAccess().getColonKeyword_14_2());
                        
                    // InternalRdsl.g:1680:1: ( ( ( (lv_ip6_35_0= RULE_INT ) ) otherlv_36= ':' )* ( (lv_ip6last_37_0= RULE_INT ) ) )
                    // InternalRdsl.g:1680:2: ( ( (lv_ip6_35_0= RULE_INT ) ) otherlv_36= ':' )* ( (lv_ip6last_37_0= RULE_INT ) )
                    {
                    // InternalRdsl.g:1680:2: ( ( (lv_ip6_35_0= RULE_INT ) ) otherlv_36= ':' )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_INT) ) {
                            int LA31_1 = input.LA(2);

                            if ( (LA31_1==13) ) {
                                alt31=1;
                            }


                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalRdsl.g:1680:3: ( (lv_ip6_35_0= RULE_INT ) ) otherlv_36= ':'
                    	    {
                    	    // InternalRdsl.g:1680:3: ( (lv_ip6_35_0= RULE_INT ) )
                    	    // InternalRdsl.g:1681:1: (lv_ip6_35_0= RULE_INT )
                    	    {
                    	    // InternalRdsl.g:1681:1: (lv_ip6_35_0= RULE_INT )
                    	    // InternalRdsl.g:1682:3: lv_ip6_35_0= RULE_INT
                    	    {
                    	    lv_ip6_35_0=(Token)match(input,RULE_INT,FOLLOW_4); 

                    	    			newLeafNode(lv_ip6_35_0, grammarAccess.getInstanceAccess().getIp6INTTerminalRuleCall_14_3_0_0_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"ip6",
                    	            		lv_ip6_35_0, 
                    	            		"org.eclipse.xtext.common.Terminals.INT");
                    	    	    

                    	    }


                    	    }

                    	    otherlv_36=(Token)match(input,13,FOLLOW_5); 

                    	        	newLeafNode(otherlv_36, grammarAccess.getInstanceAccess().getColonKeyword_14_3_0_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    // InternalRdsl.g:1702:3: ( (lv_ip6last_37_0= RULE_INT ) )
                    // InternalRdsl.g:1703:1: (lv_ip6last_37_0= RULE_INT )
                    {
                    // InternalRdsl.g:1703:1: (lv_ip6last_37_0= RULE_INT )
                    // InternalRdsl.g:1704:3: lv_ip6last_37_0= RULE_INT
                    {
                    lv_ip6last_37_0=(Token)match(input,RULE_INT,FOLLOW_6); 

                    			newLeafNode(lv_ip6last_37_0, grammarAccess.getInstanceAccess().getIp6lastINTTerminalRuleCall_14_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ip6last",
                            		lv_ip6last_37_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }

                    otherlv_38=(Token)match(input,14,FOLLOW_36); 

                        	newLeafNode(otherlv_38, grammarAccess.getInstanceAccess().getSemicolonKeyword_14_4());
                        

                    }
                    break;

            }

            // InternalRdsl.g:1724:3: (otherlv_39= 'load' otherlv_40= ':' ( (lv_theLoad_41_0= RULE_INT ) ) otherlv_42= ';' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==47) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRdsl.g:1724:5: otherlv_39= 'load' otherlv_40= ':' ( (lv_theLoad_41_0= RULE_INT ) ) otherlv_42= ';'
                    {
                    otherlv_39=(Token)match(input,47,FOLLOW_4); 

                        	newLeafNode(otherlv_39, grammarAccess.getInstanceAccess().getLoadKeyword_15_0());
                        
                    otherlv_40=(Token)match(input,13,FOLLOW_5); 

                        	newLeafNode(otherlv_40, grammarAccess.getInstanceAccess().getColonKeyword_15_1());
                        
                    // InternalRdsl.g:1732:1: ( (lv_theLoad_41_0= RULE_INT ) )
                    // InternalRdsl.g:1733:1: (lv_theLoad_41_0= RULE_INT )
                    {
                    // InternalRdsl.g:1733:1: (lv_theLoad_41_0= RULE_INT )
                    // InternalRdsl.g:1734:3: lv_theLoad_41_0= RULE_INT
                    {
                    lv_theLoad_41_0=(Token)match(input,RULE_INT,FOLLOW_6); 

                    			newLeafNode(lv_theLoad_41_0, grammarAccess.getInstanceAccess().getTheLoadINTTerminalRuleCall_15_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"theLoad",
                            		lv_theLoad_41_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }

                    otherlv_42=(Token)match(input,14,FOLLOW_37); 

                        	newLeafNode(otherlv_42, grammarAccess.getInstanceAccess().getSemicolonKeyword_15_3());
                        

                    }
                    break;

            }

            // InternalRdsl.g:1754:3: (otherlv_43= 'state' otherlv_44= ':' ( ( (lv_theState_45_1= 'public' | lv_theState_45_2= 'private' ) ) ) otherlv_46= ';' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==48) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRdsl.g:1754:5: otherlv_43= 'state' otherlv_44= ':' ( ( (lv_theState_45_1= 'public' | lv_theState_45_2= 'private' ) ) ) otherlv_46= ';'
                    {
                    otherlv_43=(Token)match(input,48,FOLLOW_4); 

                        	newLeafNode(otherlv_43, grammarAccess.getInstanceAccess().getStateKeyword_16_0());
                        
                    otherlv_44=(Token)match(input,13,FOLLOW_38); 

                        	newLeafNode(otherlv_44, grammarAccess.getInstanceAccess().getColonKeyword_16_1());
                        
                    // InternalRdsl.g:1762:1: ( ( (lv_theState_45_1= 'public' | lv_theState_45_2= 'private' ) ) )
                    // InternalRdsl.g:1763:1: ( (lv_theState_45_1= 'public' | lv_theState_45_2= 'private' ) )
                    {
                    // InternalRdsl.g:1763:1: ( (lv_theState_45_1= 'public' | lv_theState_45_2= 'private' ) )
                    // InternalRdsl.g:1764:1: (lv_theState_45_1= 'public' | lv_theState_45_2= 'private' )
                    {
                    // InternalRdsl.g:1764:1: (lv_theState_45_1= 'public' | lv_theState_45_2= 'private' )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==49) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==50) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalRdsl.g:1765:3: lv_theState_45_1= 'public'
                            {
                            lv_theState_45_1=(Token)match(input,49,FOLLOW_6); 

                                    newLeafNode(lv_theState_45_1, grammarAccess.getInstanceAccess().getTheStatePublicKeyword_16_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInstanceRule());
                            	        }
                                   		setWithLastConsumed(current, "theState", lv_theState_45_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // InternalRdsl.g:1777:8: lv_theState_45_2= 'private'
                            {
                            lv_theState_45_2=(Token)match(input,50,FOLLOW_6); 

                                    newLeafNode(lv_theState_45_2, grammarAccess.getInstanceAccess().getTheStatePrivateKeyword_16_2_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInstanceRule());
                            	        }
                                   		setWithLastConsumed(current, "theState", lv_theState_45_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    otherlv_46=(Token)match(input,14,FOLLOW_39); 

                        	newLeafNode(otherlv_46, grammarAccess.getInstanceAccess().getSemicolonKeyword_16_3());
                        

                    }
                    break;

            }

            // InternalRdsl.g:1796:3: (otherlv_47= 'hostname' otherlv_48= ':' ( (lv_hostname_49_0= RULE_ID ) ) otherlv_50= ';' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==51) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRdsl.g:1796:5: otherlv_47= 'hostname' otherlv_48= ':' ( (lv_hostname_49_0= RULE_ID ) ) otherlv_50= ';'
                    {
                    otherlv_47=(Token)match(input,51,FOLLOW_4); 

                        	newLeafNode(otherlv_47, grammarAccess.getInstanceAccess().getHostnameKeyword_17_0());
                        
                    otherlv_48=(Token)match(input,13,FOLLOW_10); 

                        	newLeafNode(otherlv_48, grammarAccess.getInstanceAccess().getColonKeyword_17_1());
                        
                    // InternalRdsl.g:1804:1: ( (lv_hostname_49_0= RULE_ID ) )
                    // InternalRdsl.g:1805:1: (lv_hostname_49_0= RULE_ID )
                    {
                    // InternalRdsl.g:1805:1: (lv_hostname_49_0= RULE_ID )
                    // InternalRdsl.g:1806:3: lv_hostname_49_0= RULE_ID
                    {
                    lv_hostname_49_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    			newLeafNode(lv_hostname_49_0, grammarAccess.getInstanceAccess().getHostnameIDTerminalRuleCall_17_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"hostname",
                            		lv_hostname_49_0, 
                            		"org.xtext.Rdsl.ID");
                    	    

                    }


                    }

                    otherlv_50=(Token)match(input,14,FOLLOW_40); 

                        	newLeafNode(otherlv_50, grammarAccess.getInstanceAccess().getSemicolonKeyword_17_3());
                        

                    }
                    break;

            }

            // InternalRdsl.g:1826:3: ( (lv_iptable_51_0= ruleIpTable ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==52) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalRdsl.g:1827:1: (lv_iptable_51_0= ruleIpTable )
            	    {
            	    // InternalRdsl.g:1827:1: (lv_iptable_51_0= ruleIpTable )
            	    // InternalRdsl.g:1828:3: lv_iptable_51_0= ruleIpTable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInstanceAccess().getIptableIpTableParserRuleCall_18_0()); 
            	    	    
            	    pushFollow(FOLLOW_40);
            	    lv_iptable_51_0=ruleIpTable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInstanceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"iptable",
            	            		lv_iptable_51_0, 
            	            		"org.xtext.Rdsl.IpTable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // InternalRdsl.g:1844:3: ( (lv_attributes_52_0= ruleAttribut ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalRdsl.g:1845:1: (lv_attributes_52_0= ruleAttribut )
            	    {
            	    // InternalRdsl.g:1845:1: (lv_attributes_52_0= ruleAttribut )
            	    // InternalRdsl.g:1846:3: lv_attributes_52_0= ruleAttribut
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInstanceAccess().getAttributesAttributParserRuleCall_19_0()); 
            	    	    
            	    pushFollow(FOLLOW_41);
            	    lv_attributes_52_0=ruleAttribut();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInstanceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_52_0, 
            	            		"org.xtext.Rdsl.Attribut");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // InternalRdsl.g:1862:3: ( (lv_instances_53_0= ruleInstance ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==39) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalRdsl.g:1863:1: (lv_instances_53_0= ruleInstance )
            	    {
            	    // InternalRdsl.g:1863:1: (lv_instances_53_0= ruleInstance )
            	    // InternalRdsl.g:1864:3: lv_instances_53_0= ruleInstance
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInstanceAccess().getInstancesInstanceParserRuleCall_20_0()); 
            	    	    
            	    pushFollow(FOLLOW_42);
            	    lv_instances_53_0=ruleInstance();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInstanceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instances",
            	            		lv_instances_53_0, 
            	            		"org.xtext.Rdsl.Instance");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_54=(Token)match(input,27,FOLLOW_2); 

                	newLeafNode(otherlv_54, grammarAccess.getInstanceAccess().getRightCurlyBracketKeyword_21());
                

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
    // InternalRdsl.g:1892:1: entryRuleIpTable returns [EObject current=null] : iv_ruleIpTable= ruleIpTable EOF ;
    public final EObject entryRuleIpTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIpTable = null;


        try {
            // InternalRdsl.g:1893:2: (iv_ruleIpTable= ruleIpTable EOF )
            // InternalRdsl.g:1894:2: iv_ruleIpTable= ruleIpTable EOF
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
    // InternalRdsl.g:1901:1: ruleIpTable returns [EObject current=null] : (otherlv_0= 'iptables' otherlv_1= '-A' ( ( (lv_traffic_2_1= 'INPUT' | lv_traffic_2_2= 'OUTPUT' | lv_traffic_2_3= 'FORWARD' ) ) ) (otherlv_3= '-s' ( ( (lv_source_4_0= RULE_INT ) ) otherlv_5= '.' )+ ( (lv_sourcefinal_6_0= RULE_INT ) ) ) (otherlv_7= '-d' ( ( (lv_destination_8_0= RULE_INT ) ) otherlv_9= '.' )+ ( (lv_destinationfinal_10_0= RULE_INT ) ) ) (otherlv_11= '-p' ( ( (lv_protocol_12_1= 'tcp' | lv_protocol_12_2= 'udp' ) ) ) ) otherlv_13= '-j' ( ( (lv_target_14_1= 'ACCEPT' | lv_target_14_2= 'REJECT' | lv_target_14_3= 'DROP' ) ) ) otherlv_15= ';' ) ;
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
            // InternalRdsl.g:1904:28: ( (otherlv_0= 'iptables' otherlv_1= '-A' ( ( (lv_traffic_2_1= 'INPUT' | lv_traffic_2_2= 'OUTPUT' | lv_traffic_2_3= 'FORWARD' ) ) ) (otherlv_3= '-s' ( ( (lv_source_4_0= RULE_INT ) ) otherlv_5= '.' )+ ( (lv_sourcefinal_6_0= RULE_INT ) ) ) (otherlv_7= '-d' ( ( (lv_destination_8_0= RULE_INT ) ) otherlv_9= '.' )+ ( (lv_destinationfinal_10_0= RULE_INT ) ) ) (otherlv_11= '-p' ( ( (lv_protocol_12_1= 'tcp' | lv_protocol_12_2= 'udp' ) ) ) ) otherlv_13= '-j' ( ( (lv_target_14_1= 'ACCEPT' | lv_target_14_2= 'REJECT' | lv_target_14_3= 'DROP' ) ) ) otherlv_15= ';' ) )
            // InternalRdsl.g:1905:1: (otherlv_0= 'iptables' otherlv_1= '-A' ( ( (lv_traffic_2_1= 'INPUT' | lv_traffic_2_2= 'OUTPUT' | lv_traffic_2_3= 'FORWARD' ) ) ) (otherlv_3= '-s' ( ( (lv_source_4_0= RULE_INT ) ) otherlv_5= '.' )+ ( (lv_sourcefinal_6_0= RULE_INT ) ) ) (otherlv_7= '-d' ( ( (lv_destination_8_0= RULE_INT ) ) otherlv_9= '.' )+ ( (lv_destinationfinal_10_0= RULE_INT ) ) ) (otherlv_11= '-p' ( ( (lv_protocol_12_1= 'tcp' | lv_protocol_12_2= 'udp' ) ) ) ) otherlv_13= '-j' ( ( (lv_target_14_1= 'ACCEPT' | lv_target_14_2= 'REJECT' | lv_target_14_3= 'DROP' ) ) ) otherlv_15= ';' )
            {
            // InternalRdsl.g:1905:1: (otherlv_0= 'iptables' otherlv_1= '-A' ( ( (lv_traffic_2_1= 'INPUT' | lv_traffic_2_2= 'OUTPUT' | lv_traffic_2_3= 'FORWARD' ) ) ) (otherlv_3= '-s' ( ( (lv_source_4_0= RULE_INT ) ) otherlv_5= '.' )+ ( (lv_sourcefinal_6_0= RULE_INT ) ) ) (otherlv_7= '-d' ( ( (lv_destination_8_0= RULE_INT ) ) otherlv_9= '.' )+ ( (lv_destinationfinal_10_0= RULE_INT ) ) ) (otherlv_11= '-p' ( ( (lv_protocol_12_1= 'tcp' | lv_protocol_12_2= 'udp' ) ) ) ) otherlv_13= '-j' ( ( (lv_target_14_1= 'ACCEPT' | lv_target_14_2= 'REJECT' | lv_target_14_3= 'DROP' ) ) ) otherlv_15= ';' )
            // InternalRdsl.g:1905:3: otherlv_0= 'iptables' otherlv_1= '-A' ( ( (lv_traffic_2_1= 'INPUT' | lv_traffic_2_2= 'OUTPUT' | lv_traffic_2_3= 'FORWARD' ) ) ) (otherlv_3= '-s' ( ( (lv_source_4_0= RULE_INT ) ) otherlv_5= '.' )+ ( (lv_sourcefinal_6_0= RULE_INT ) ) ) (otherlv_7= '-d' ( ( (lv_destination_8_0= RULE_INT ) ) otherlv_9= '.' )+ ( (lv_destinationfinal_10_0= RULE_INT ) ) ) (otherlv_11= '-p' ( ( (lv_protocol_12_1= 'tcp' | lv_protocol_12_2= 'udp' ) ) ) ) otherlv_13= '-j' ( ( (lv_target_14_1= 'ACCEPT' | lv_target_14_2= 'REJECT' | lv_target_14_3= 'DROP' ) ) ) otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_43); 

                	newLeafNode(otherlv_0, grammarAccess.getIpTableAccess().getIptablesKeyword_0());
                
            otherlv_1=(Token)match(input,53,FOLLOW_44); 

                	newLeafNode(otherlv_1, grammarAccess.getIpTableAccess().getAKeyword_1());
                
            // InternalRdsl.g:1913:1: ( ( (lv_traffic_2_1= 'INPUT' | lv_traffic_2_2= 'OUTPUT' | lv_traffic_2_3= 'FORWARD' ) ) )
            // InternalRdsl.g:1914:1: ( (lv_traffic_2_1= 'INPUT' | lv_traffic_2_2= 'OUTPUT' | lv_traffic_2_3= 'FORWARD' ) )
            {
            // InternalRdsl.g:1914:1: ( (lv_traffic_2_1= 'INPUT' | lv_traffic_2_2= 'OUTPUT' | lv_traffic_2_3= 'FORWARD' ) )
            // InternalRdsl.g:1915:1: (lv_traffic_2_1= 'INPUT' | lv_traffic_2_2= 'OUTPUT' | lv_traffic_2_3= 'FORWARD' )
            {
            // InternalRdsl.g:1915:1: (lv_traffic_2_1= 'INPUT' | lv_traffic_2_2= 'OUTPUT' | lv_traffic_2_3= 'FORWARD' )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt40=1;
                }
                break;
            case 55:
                {
                alt40=2;
                }
                break;
            case 56:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalRdsl.g:1916:3: lv_traffic_2_1= 'INPUT'
                    {
                    lv_traffic_2_1=(Token)match(input,54,FOLLOW_45); 

                            newLeafNode(lv_traffic_2_1, grammarAccess.getIpTableAccess().getTrafficINPUTKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIpTableRule());
                    	        }
                           		setWithLastConsumed(current, "traffic", lv_traffic_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // InternalRdsl.g:1928:8: lv_traffic_2_2= 'OUTPUT'
                    {
                    lv_traffic_2_2=(Token)match(input,55,FOLLOW_45); 

                            newLeafNode(lv_traffic_2_2, grammarAccess.getIpTableAccess().getTrafficOUTPUTKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIpTableRule());
                    	        }
                           		setWithLastConsumed(current, "traffic", lv_traffic_2_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // InternalRdsl.g:1940:8: lv_traffic_2_3= 'FORWARD'
                    {
                    lv_traffic_2_3=(Token)match(input,56,FOLLOW_45); 

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

            // InternalRdsl.g:1955:2: (otherlv_3= '-s' ( ( (lv_source_4_0= RULE_INT ) ) otherlv_5= '.' )+ ( (lv_sourcefinal_6_0= RULE_INT ) ) )
            // InternalRdsl.g:1955:4: otherlv_3= '-s' ( ( (lv_source_4_0= RULE_INT ) ) otherlv_5= '.' )+ ( (lv_sourcefinal_6_0= RULE_INT ) )
            {
            otherlv_3=(Token)match(input,57,FOLLOW_5); 

                	newLeafNode(otherlv_3, grammarAccess.getIpTableAccess().getSKeyword_3_0());
                
            // InternalRdsl.g:1959:1: ( ( (lv_source_4_0= RULE_INT ) ) otherlv_5= '.' )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_INT) ) {
                    int LA41_1 = input.LA(2);

                    if ( (LA41_1==18) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // InternalRdsl.g:1959:2: ( (lv_source_4_0= RULE_INT ) ) otherlv_5= '.'
            	    {
            	    // InternalRdsl.g:1959:2: ( (lv_source_4_0= RULE_INT ) )
            	    // InternalRdsl.g:1960:1: (lv_source_4_0= RULE_INT )
            	    {
            	    // InternalRdsl.g:1960:1: (lv_source_4_0= RULE_INT )
            	    // InternalRdsl.g:1961:3: lv_source_4_0= RULE_INT
            	    {
            	    lv_source_4_0=(Token)match(input,RULE_INT,FOLLOW_11); 

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

            	    otherlv_5=(Token)match(input,18,FOLLOW_5); 

            	        	newLeafNode(otherlv_5, grammarAccess.getIpTableAccess().getFullStopKeyword_3_1_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            // InternalRdsl.g:1981:3: ( (lv_sourcefinal_6_0= RULE_INT ) )
            // InternalRdsl.g:1982:1: (lv_sourcefinal_6_0= RULE_INT )
            {
            // InternalRdsl.g:1982:1: (lv_sourcefinal_6_0= RULE_INT )
            // InternalRdsl.g:1983:3: lv_sourcefinal_6_0= RULE_INT
            {
            lv_sourcefinal_6_0=(Token)match(input,RULE_INT,FOLLOW_46); 

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

            // InternalRdsl.g:1999:3: (otherlv_7= '-d' ( ( (lv_destination_8_0= RULE_INT ) ) otherlv_9= '.' )+ ( (lv_destinationfinal_10_0= RULE_INT ) ) )
            // InternalRdsl.g:1999:5: otherlv_7= '-d' ( ( (lv_destination_8_0= RULE_INT ) ) otherlv_9= '.' )+ ( (lv_destinationfinal_10_0= RULE_INT ) )
            {
            otherlv_7=(Token)match(input,58,FOLLOW_5); 

                	newLeafNode(otherlv_7, grammarAccess.getIpTableAccess().getDKeyword_4_0());
                
            // InternalRdsl.g:2003:1: ( ( (lv_destination_8_0= RULE_INT ) ) otherlv_9= '.' )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_INT) ) {
                    int LA42_1 = input.LA(2);

                    if ( (LA42_1==18) ) {
                        alt42=1;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // InternalRdsl.g:2003:2: ( (lv_destination_8_0= RULE_INT ) ) otherlv_9= '.'
            	    {
            	    // InternalRdsl.g:2003:2: ( (lv_destination_8_0= RULE_INT ) )
            	    // InternalRdsl.g:2004:1: (lv_destination_8_0= RULE_INT )
            	    {
            	    // InternalRdsl.g:2004:1: (lv_destination_8_0= RULE_INT )
            	    // InternalRdsl.g:2005:3: lv_destination_8_0= RULE_INT
            	    {
            	    lv_destination_8_0=(Token)match(input,RULE_INT,FOLLOW_11); 

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

            	    otherlv_9=(Token)match(input,18,FOLLOW_5); 

            	        	newLeafNode(otherlv_9, grammarAccess.getIpTableAccess().getFullStopKeyword_4_1_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            // InternalRdsl.g:2025:3: ( (lv_destinationfinal_10_0= RULE_INT ) )
            // InternalRdsl.g:2026:1: (lv_destinationfinal_10_0= RULE_INT )
            {
            // InternalRdsl.g:2026:1: (lv_destinationfinal_10_0= RULE_INT )
            // InternalRdsl.g:2027:3: lv_destinationfinal_10_0= RULE_INT
            {
            lv_destinationfinal_10_0=(Token)match(input,RULE_INT,FOLLOW_47); 

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

            // InternalRdsl.g:2043:3: (otherlv_11= '-p' ( ( (lv_protocol_12_1= 'tcp' | lv_protocol_12_2= 'udp' ) ) ) )
            // InternalRdsl.g:2043:5: otherlv_11= '-p' ( ( (lv_protocol_12_1= 'tcp' | lv_protocol_12_2= 'udp' ) ) )
            {
            otherlv_11=(Token)match(input,59,FOLLOW_48); 

                	newLeafNode(otherlv_11, grammarAccess.getIpTableAccess().getPKeyword_5_0());
                
            // InternalRdsl.g:2047:1: ( ( (lv_protocol_12_1= 'tcp' | lv_protocol_12_2= 'udp' ) ) )
            // InternalRdsl.g:2048:1: ( (lv_protocol_12_1= 'tcp' | lv_protocol_12_2= 'udp' ) )
            {
            // InternalRdsl.g:2048:1: ( (lv_protocol_12_1= 'tcp' | lv_protocol_12_2= 'udp' ) )
            // InternalRdsl.g:2049:1: (lv_protocol_12_1= 'tcp' | lv_protocol_12_2= 'udp' )
            {
            // InternalRdsl.g:2049:1: (lv_protocol_12_1= 'tcp' | lv_protocol_12_2= 'udp' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==60) ) {
                alt43=1;
            }
            else if ( (LA43_0==61) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalRdsl.g:2050:3: lv_protocol_12_1= 'tcp'
                    {
                    lv_protocol_12_1=(Token)match(input,60,FOLLOW_49); 

                            newLeafNode(lv_protocol_12_1, grammarAccess.getIpTableAccess().getProtocolTcpKeyword_5_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIpTableRule());
                    	        }
                           		setWithLastConsumed(current, "protocol", lv_protocol_12_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // InternalRdsl.g:2062:8: lv_protocol_12_2= 'udp'
                    {
                    lv_protocol_12_2=(Token)match(input,61,FOLLOW_49); 

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

            otherlv_13=(Token)match(input,62,FOLLOW_50); 

                	newLeafNode(otherlv_13, grammarAccess.getIpTableAccess().getJKeyword_6());
                
            // InternalRdsl.g:2081:1: ( ( (lv_target_14_1= 'ACCEPT' | lv_target_14_2= 'REJECT' | lv_target_14_3= 'DROP' ) ) )
            // InternalRdsl.g:2082:1: ( (lv_target_14_1= 'ACCEPT' | lv_target_14_2= 'REJECT' | lv_target_14_3= 'DROP' ) )
            {
            // InternalRdsl.g:2082:1: ( (lv_target_14_1= 'ACCEPT' | lv_target_14_2= 'REJECT' | lv_target_14_3= 'DROP' ) )
            // InternalRdsl.g:2083:1: (lv_target_14_1= 'ACCEPT' | lv_target_14_2= 'REJECT' | lv_target_14_3= 'DROP' )
            {
            // InternalRdsl.g:2083:1: (lv_target_14_1= 'ACCEPT' | lv_target_14_2= 'REJECT' | lv_target_14_3= 'DROP' )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt44=1;
                }
                break;
            case 64:
                {
                alt44=2;
                }
                break;
            case 65:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalRdsl.g:2084:3: lv_target_14_1= 'ACCEPT'
                    {
                    lv_target_14_1=(Token)match(input,63,FOLLOW_6); 

                            newLeafNode(lv_target_14_1, grammarAccess.getIpTableAccess().getTargetACCEPTKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIpTableRule());
                    	        }
                           		setWithLastConsumed(current, "target", lv_target_14_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // InternalRdsl.g:2096:8: lv_target_14_2= 'REJECT'
                    {
                    lv_target_14_2=(Token)match(input,64,FOLLOW_6); 

                            newLeafNode(lv_target_14_2, grammarAccess.getIpTableAccess().getTargetREJECTKeyword_7_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIpTableRule());
                    	        }
                           		setWithLastConsumed(current, "target", lv_target_14_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // InternalRdsl.g:2108:8: lv_target_14_3= 'DROP'
                    {
                    lv_target_14_3=(Token)match(input,65,FOLLOW_6); 

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

            otherlv_15=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRdsl.g:2135:1: entryRuleAttribut returns [EObject current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final EObject entryRuleAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribut = null;


        try {
            // InternalRdsl.g:2136:2: (iv_ruleAttribut= ruleAttribut EOF )
            // InternalRdsl.g:2137:2: iv_ruleAttribut= ruleAttribut EOF
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
    // InternalRdsl.g:2144:1: ruleAttribut returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_valeur_2_0= ruleVAL ) ) otherlv_3= ';' ) ;
    public final EObject ruleAttribut() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_valeur_2_0 = null;


         enterRule(); 
            
        try {
            // InternalRdsl.g:2147:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_valeur_2_0= ruleVAL ) ) otherlv_3= ';' ) )
            // InternalRdsl.g:2148:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_valeur_2_0= ruleVAL ) ) otherlv_3= ';' )
            {
            // InternalRdsl.g:2148:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_valeur_2_0= ruleVAL ) ) otherlv_3= ';' )
            // InternalRdsl.g:2148:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_valeur_2_0= ruleVAL ) ) otherlv_3= ';'
            {
            // InternalRdsl.g:2148:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRdsl.g:2149:1: (lv_name_0_0= RULE_ID )
            {
            // InternalRdsl.g:2149:1: (lv_name_0_0= RULE_ID )
            // InternalRdsl.g:2150:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_1=(Token)match(input,13,FOLLOW_51); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributAccess().getColonKeyword_1());
                
            // InternalRdsl.g:2170:1: ( (lv_valeur_2_0= ruleVAL ) )
            // InternalRdsl.g:2171:1: (lv_valeur_2_0= ruleVAL )
            {
            // InternalRdsl.g:2171:1: (lv_valeur_2_0= ruleVAL )
            // InternalRdsl.g:2172:3: lv_valeur_2_0= ruleVAL
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

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRdsl.g:2200:1: entryRuleFullname returns [String current=null] : iv_ruleFullname= ruleFullname EOF ;
    public final String entryRuleFullname() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFullname = null;


        try {
            // InternalRdsl.g:2201:2: (iv_ruleFullname= ruleFullname EOF )
            // InternalRdsl.g:2202:2: iv_ruleFullname= ruleFullname EOF
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
    // InternalRdsl.g:2209:1: ruleFullname returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFullname() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalRdsl.g:2212:28: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) )
            // InternalRdsl.g:2213:1: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
            {
            // InternalRdsl.g:2213:1: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_INT) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalRdsl.g:2213:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getFullnameAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalRdsl.g:2221:10: this_INT_1= RULE_INT
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
    // InternalRdsl.g:2236:1: entryRuleVAL returns [String current=null] : iv_ruleVAL= ruleVAL EOF ;
    public final String entryRuleVAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVAL = null;


        try {
            // InternalRdsl.g:2237:2: (iv_ruleVAL= ruleVAL EOF )
            // InternalRdsl.g:2238:2: iv_ruleVAL= ruleVAL EOF
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
    // InternalRdsl.g:2245:1: ruleVAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BOOLEAN_0= RULE_BOOLEAN | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleVAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOLEAN_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;

         enterRule(); 
            
        try {
            // InternalRdsl.g:2248:28: ( (this_BOOLEAN_0= RULE_BOOLEAN | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) )
            // InternalRdsl.g:2249:1: (this_BOOLEAN_0= RULE_BOOLEAN | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING )
            {
            // InternalRdsl.g:2249:1: (this_BOOLEAN_0= RULE_BOOLEAN | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING )
            int alt46=3;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt46=1;
                }
                break;
            case RULE_INT:
                {
                alt46=2;
                }
                break;
            case RULE_STRING:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalRdsl.g:2249:6: this_BOOLEAN_0= RULE_BOOLEAN
                    {
                    this_BOOLEAN_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    		current.merge(this_BOOLEAN_0);
                        
                     
                        newLeafNode(this_BOOLEAN_0, grammarAccess.getVALAccess().getBOOLEANTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalRdsl.g:2257:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getVALAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalRdsl.g:2265:10: this_STRING_2= RULE_STRING
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
    // InternalRdsl.g:2280:1: entryRuleAType returns [String current=null] : iv_ruleAType= ruleAType EOF ;
    public final String entryRuleAType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAType = null;


        try {
            // InternalRdsl.g:2281:2: (iv_ruleAType= ruleAType EOF )
            // InternalRdsl.g:2282:2: iv_ruleAType= ruleAType EOF
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
    // InternalRdsl.g:2289:1: ruleAType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'IPv4' | kw= 'IPv6' ) ;
    public final AntlrDatatypeRuleToken ruleAType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalRdsl.g:2292:28: ( (kw= 'IPv4' | kw= 'IPv6' ) )
            // InternalRdsl.g:2293:1: (kw= 'IPv4' | kw= 'IPv6' )
            {
            // InternalRdsl.g:2293:1: (kw= 'IPv4' | kw= 'IPv6' )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==66) ) {
                alt47=1;
            }
            else if ( (LA47_0==67) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalRdsl.g:2294:2: kw= 'IPv4'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getATypeAccess().getIPv4Keyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalRdsl.g:2301:2: kw= 'IPv6'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000008000009002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000004000010022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002568000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000168000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0019DC8008009020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0019D88008009020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0019D08008009020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0019C08008009020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0019808008009020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0019008008009020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0018008008009020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010008008009020L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000008008009020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000008008009000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00000000000000D0L});

}