/*
 * generated by Xtext
 */
grammar InternalRdsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getGraphsGraphParserRuleCall_0_0()); 
	    }
		lv_graphs_0_0=ruleGraph		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		set(
       			$current, 
       			"graphs",
        		lv_graphs_0_0, 
        		"Graph");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getInstancesInstanceParserRuleCall_1_0()); 
	    }
		lv_instances_1_0=ruleInstance		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"instances",
        		lv_instances_1_0, 
        		"Instance");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleGraph
entryRuleGraph returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGraphRule()); }
	 iv_ruleGraph=ruleGraph 
	 { $current=$iv_ruleGraph.current; } 
	 EOF 
;

// Rule Graph
ruleGraph returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getGraphAccess().getImportsImportParserRuleCall_0_0()); 
	    }
		lv_imports_0_0=ruleImport		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGraphRule());
	        }
       		add(
       			$current, 
       			"imports",
        		lv_imports_0_0, 
        		"Import");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getGraphAccess().getComponentsComponentParserRuleCall_1_0()); 
	    }
		lv_components_1_0=ruleComponent		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGraphRule());
	        }
       		add(
       			$current, 
       			"components",
        		lv_components_1_0, 
        		"Component");
	        afterParserOrEnumRuleCall();
	    }

)
)+(
(
		{ 
	        newCompositeNode(grammarAccess.getGraphAccess().getFacetGraphsFacetParserRuleCall_2_0()); 
	    }
		lv_facetGraphs_2_0=ruleFacet		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGraphRule());
	        }
       		add(
       			$current, 
       			"facetGraphs",
        		lv_facetGraphs_2_0, 
        		"Facet");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	 iv_ruleImport=ruleImport 
	 { $current=$iv_ruleImport.current; } 
	 EOF 
;

// Rule Import
ruleImport returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='import' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getImportAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getImportRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='.graph' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getImportAccess().getGraphKeyword_2());
    }
	otherlv_3=';' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getImportAccess().getSemicolonKeyword_3());
    }
)
;







// Entry rule entryRuleComponent
entryRuleComponent returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getComponentRule()); }
	 iv_ruleComponent=ruleComponent 
	 { $current=$iv_ruleComponent.current; } 
	 EOF 
;

// Rule Component
ruleComponent returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getComponentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getComponentAccess().getInstallersInstallerParserRuleCall_2_0()); 
	    }
		lv_installers_2_0=ruleInstaller		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getComponentRule());
	        }
       		set(
       			$current, 
       			"installers",
        		lv_installers_2_0, 
        		"Installer");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getComponentAccess().getPropertiesPropertyParserRuleCall_3_0()); 
	    }
		lv_properties_3_0=ruleProperty		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getComponentRule());
	        }
       		add(
       			$current, 
       			"properties",
        		lv_properties_3_0, 
        		"Property");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleInstaller
entryRuleInstaller returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInstallerRule()); }
	 iv_ruleInstaller=ruleInstaller 
	 { $current=$iv_ruleInstaller.current; } 
	 EOF 
;

// Rule Installer
ruleInstaller returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='installer:' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getInstallerAccess().getInstallerKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getInstallerAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInstallerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2=';' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getInstallerAccess().getSemicolonKeyword_2());
    }
)
;





// Entry rule entryRuleProperty
entryRuleProperty returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPropertyRule()); }
	 iv_ruleProperty=ruleProperty 
	 { $current=$iv_ruleProperty.current; } 
	 EOF 
;

// Rule Property
ruleProperty returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getPropertyAccess().getChildrenParserRuleCall_0()); 
    }
    this_Children_0=ruleChildren
    { 
        $current = $this_Children_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPropertyAccess().getExportParserRuleCall_1()); 
    }
    this_Export_1=ruleExport
    { 
        $current = $this_Export_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPropertyAccess().getImportsParserRuleCall_2()); 
    }
    this_Imports_2=ruleImports
    { 
        $current = $this_Imports_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPropertyAccess().getFacetsParserRuleCall_3()); 
    }
    this_Facets_3=ruleFacets
    { 
        $current = $this_Facets_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPropertyAccess().getExtendsParserRuleCall_4()); 
    }
    this_Extends_4=ruleExtends
    { 
        $current = $this_Extends_4.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleExtends
entryRuleExtends returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExtendsRule()); }
	 iv_ruleExtends=ruleExtends 
	 { $current=$iv_ruleExtends.current; } 
	 EOF 
;

// Rule Extends
ruleExtends returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='extends:' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getExtendsAccess().getExtendsKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getExtendsRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getExtendsAccess().getSupComponentComponentCrossReference_1_0()); 
	}

)
))
;





// Entry rule entryRuleChildren
entryRuleChildren returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getChildrenRule()); }
	 iv_ruleChildren=ruleChildren 
	 { $current=$iv_ruleChildren.current; } 
	 EOF 
;

// Rule Children
ruleChildren returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='children:' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getChildrenAccess().getChildrenKeyword_0());
    }
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getChildrenRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getChildrenAccess().getChildrenComponentCrossReference_1_0_0()); 
	}

)
)	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getChildrenAccess().getCommaKeyword_1_1());
    }
)*(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getChildrenRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getChildrenAccess().getChildComponentCrossReference_2_0()); 
	}

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getChildrenAccess().getSemicolonKeyword_3());
    }
)
;





// Entry rule entryRuleExport
entryRuleExport returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExportRule()); }
	 iv_ruleExport=ruleExport 
	 { $current=$iv_ruleExport.current; } 
	 EOF 
;

// Rule Export
ruleExport returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='exports:' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getExportAccess().getExportsKeyword_0());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getExportAccess().getExportsExportVariableParserRuleCall_1_0_0()); 
	    }
		lv_exports_1_0=ruleexportVariable		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExportRule());
	        }
       		add(
       			$current, 
       			"exports",
        		lv_exports_1_0, 
        		"exportVariable");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getExportAccess().getCommaKeyword_1_1());
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getExportAccess().getExportExportVariableParserRuleCall_2_0()); 
	    }
		lv_export_3_0=ruleexportVariable		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExportRule());
	        }
       		set(
       			$current, 
       			"export",
        		lv_export_3_0, 
        		"exportVariable");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getExportAccess().getSemicolonKeyword_3());
    }
)
;





// Entry rule entryRuleexportVariable
entryRuleexportVariable returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExportVariableRule()); }
	 iv_ruleexportVariable=ruleexportVariable 
	 { $current=$iv_ruleexportVariable.current; } 
	 EOF 
;

// Rule exportVariable
ruleexportVariable returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getExportVariableAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExportVariableRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getExportVariableAccess().getInitialInitialisationParserRuleCall_1_0()); 
	    }
		lv_initial_1_0=ruleInitialisation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExportVariableRule());
	        }
       		set(
       			$current, 
       			"initial",
        		lv_initial_1_0, 
        		"Initialisation");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleInitialisation
entryRuleInitialisation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInitialisationRule()); }
	 iv_ruleInitialisation=ruleInitialisation 
	 { $current=$iv_ruleInitialisation.current; } 
	 EOF 
;

// Rule Initialisation
ruleInitialisation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='=' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getInitialisationAccess().getEqualsSignKeyword_0());
    }
(
(
		lv_val_1_0=RULE_INT
		{
			newLeafNode(lv_val_1_0, grammarAccess.getInitialisationAccess().getValINTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInitialisationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"val",
        		lv_val_1_0, 
        		"INT");
	    }

)
))
;





// Entry rule entryRuleImports
entryRuleImports returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImportsRule()); }
	 iv_ruleImports=ruleImports 
	 { $current=$iv_ruleImports.current; } 
	 EOF 
;

// Rule Imports
ruleImports returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='imports:' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getImportsAccess().getImportsKeyword_0());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getImportsAccess().getImportsImportVariableParserRuleCall_1_0_0()); 
	    }
		lv_imports_1_0=ruleimportVariable		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getImportsRule());
	        }
       		add(
       			$current, 
       			"imports",
        		lv_imports_1_0, 
        		"importVariable");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getImportsAccess().getCommaKeyword_1_1());
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getImportsAccess().getImportedImportVariableParserRuleCall_2_0()); 
	    }
		lv_imported_3_0=ruleimportVariable		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getImportsRule());
	        }
       		set(
       			$current, 
       			"imported",
        		lv_imported_3_0, 
        		"importVariable");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getImportsAccess().getSemicolonKeyword_3());
    }
)
;





// Entry rule entryRuleimportVariable
entryRuleimportVariable returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImportVariableRule()); }
	 iv_ruleimportVariable=ruleimportVariable 
	 { $current=$iv_ruleimportVariable.current; } 
	 EOF 
;

// Rule importVariable
ruleimportVariable returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='external' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getImportVariableAccess().getExternalKeyword_0());
    }
)?(((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getImportVariableRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getImportVariableAccess().getImportvariableCompFacetCrossReference_1_0_0_0()); 
	}

)
)	otherlv_2='.' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getImportVariableAccess().getFullStopKeyword_1_0_1());
    }
((
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getImportVariableAccess().getNameIDTerminalRuleCall_1_0_2_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getImportVariableRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"ID");
	    }

)
)
    |	otherlv_4='*' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getImportVariableAccess().getAsteriskKeyword_1_0_2_1());
    }
))
    |(
(
		lv_name_5_0=RULE_ID
		{
			newLeafNode(lv_name_5_0, grammarAccess.getImportVariableAccess().getNameIDTerminalRuleCall_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getImportVariableRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_5_0, 
        		"ID");
	    }

)
))(
(
		lv_optional_6_0=	'(optional)' 
    {
        newLeafNode(lv_optional_6_0, grammarAccess.getImportVariableAccess().getOptionalOptionalKeyword_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getImportVariableRule());
	        }
       		setWithLastConsumed($current, "optional", true, "(optional)");
	    }

)
)?)
;





// Entry rule entryRuleFacets
entryRuleFacets returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFacetsRule()); }
	 iv_ruleFacets=ruleFacets 
	 { $current=$iv_ruleFacets.current; } 
	 EOF 
;

// Rule Facets
ruleFacets returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='facets:' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFacetsAccess().getFacetsKeyword_0());
    }
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getFacetsRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getFacetsAccess().getFacetsFacetCrossReference_1_0_0()); 
	}

)
)	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getFacetsAccess().getCommaKeyword_1_1());
    }
)*(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getFacetsRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getFacetsAccess().getFacetFacetCrossReference_2_0()); 
	}

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getFacetsAccess().getSemicolonKeyword_3());
    }
)
;





// Entry rule entryRuleFacet
entryRuleFacet returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFacetRule()); }
	 iv_ruleFacet=ruleFacet 
	 { $current=$iv_ruleFacet.current; } 
	 EOF 
;

// Rule Facet
ruleFacet returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='facet' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFacetAccess().getFacetKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getFacetAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFacetRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getFacetAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFacetAccess().getExportFacetExportParserRuleCall_3_0()); 
	    }
		lv_exportFacet_3_0=ruleExport		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFacetRule());
	        }
       		add(
       			$current, 
       			"exportFacet",
        		lv_exportFacet_3_0, 
        		"Export");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getFacetAccess().getChildrenFacetChildrenParserRuleCall_4_0()); 
	    }
		lv_childrenFacet_4_0=ruleChildren		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFacetRule());
	        }
       		set(
       			$current, 
       			"childrenFacet",
        		lv_childrenFacet_4_0, 
        		"Children");
	        afterParserOrEnumRuleCall();
	    }

)
)?(	otherlv_5='extends:' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getFacetAccess().getExtendsKeyword_5_0());
    }
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getFacetRule());
	        }
        }
	otherlv_6=RULE_ID
	{
		newLeafNode(otherlv_6, grammarAccess.getFacetAccess().getSupFacetsFacetCrossReference_5_1_0_0()); 
	}

)
)	otherlv_7=',' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getFacetAccess().getCommaKeyword_5_1_1());
    }
)*(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getFacetRule());
	        }
        }
	otherlv_8=RULE_ID
	{
		newLeafNode(otherlv_8, grammarAccess.getFacetAccess().getSupFacetFacetCrossReference_5_2_0()); 
	}

)
))?	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getFacetAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleInstance
entryRuleInstance returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInstanceRule()); }
	 iv_ruleInstance=ruleInstance 
	 { $current=$iv_ruleInstance.current; } 
	 EOF 
;

// Rule Instance
ruleInstance returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='instance' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getInstanceKeyword_0());
    }
	otherlv_1='of' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getInstanceAccess().getOfKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getInstanceRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getInstanceAccess().getComponentComponentCrossReference_2_0()); 
	}

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getInstanceAccess().getLeftCurlyBracketKeyword_3());
    }
	otherlv_4='name:' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getInstanceAccess().getNameKeyword_4());
    }
(
(
		lv_name_5_0=RULE_ID
		{
			newLeafNode(lv_name_5_0, grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_5_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInstanceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_5_0, 
        		"ID");
	    }

)
)(this_ID_6=RULE_ID
    { 
    newLeafNode(this_ID_6, grammarAccess.getInstanceAccess().getIDTerminalRuleCall_6_0()); 
    }

    |this_INT_7=RULE_INT
    { 
    newLeafNode(this_INT_7, grammarAccess.getInstanceAccess().getINTTerminalRuleCall_6_1()); 
    }
)*	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getInstanceAccess().getSemicolonKeyword_7());
    }
(	otherlv_9='count:' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getInstanceAccess().getCountKeyword_8_0());
    }
(
(
		lv_val_10_0=RULE_INT
		{
			newLeafNode(lv_val_10_0, grammarAccess.getInstanceAccess().getValINTTerminalRuleCall_8_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInstanceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"val",
        		lv_val_10_0, 
        		"INT");
	    }

)
)	otherlv_11=';' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getInstanceAccess().getSemicolonKeyword_8_2());
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getInstanceAccess().getAttributesAttributParserRuleCall_9_0()); 
	    }
		lv_attributes_12_0=ruleAttribut		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getInstanceRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_12_0, 
        		"Attribut");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getInstanceAccess().getInstancesInstanceParserRuleCall_10_0()); 
	    }
		lv_instances_13_0=ruleInstance		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getInstanceRule());
	        }
       		add(
       			$current, 
       			"instances",
        		lv_instances_13_0, 
        		"Instance");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_14='}' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getInstanceAccess().getRightCurlyBracketKeyword_11());
    }
)
;





// Entry rule entryRuleAttribut
entryRuleAttribut returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAttributRule()); }
	 iv_ruleAttribut=ruleAttribut 
	 { $current=$iv_ruleAttribut.current; } 
	 EOF 
;

// Rule Attribut
ruleAttribut returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAttributRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)	otherlv_1=':' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAttributAccess().getColonKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAttributAccess().getValeurVALParserRuleCall_2_0()); 
	    }
		lv_valeur_2_0=ruleVAL		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributRule());
	        }
       		set(
       			$current, 
       			"valeur",
        		lv_valeur_2_0, 
        		"VAL");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=';' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getAttributAccess().getSemicolonKeyword_3());
    }
)
;





// Entry rule entryRuleVAL
entryRuleVAL returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getVALRule()); } 
	 iv_ruleVAL=ruleVAL 
	 { $current=$iv_ruleVAL.current.getText(); }  
	 EOF 
;

// Rule VAL
ruleVAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_BOOLEAN_0=RULE_BOOLEAN    {
		$current.merge(this_BOOLEAN_0);
    }

    { 
    newLeafNode(this_BOOLEAN_0, grammarAccess.getVALAccess().getBOOLEANTerminalRuleCall_0()); 
    }

    |    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getVALAccess().getINTTerminalRuleCall_1()); 
    }

    |    this_STRING_2=RULE_STRING    {
		$current.merge(this_STRING_2);
    }

    { 
    newLeafNode(this_STRING_2, grammarAccess.getVALAccess().getSTRINGTerminalRuleCall_2()); 
    }
)
    ;





RULE_BOOLEAN : ('true'|'false');

RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9')*;

RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

