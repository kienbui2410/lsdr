/*
 * generated by Xtext
 */
package org.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.services.RdslGrammarAccess;

public class RdslParser extends AbstractContentAssistParser {
	
	@Inject
	private RdslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.ui.contentassist.antlr.internal.InternalRdslParser createParser() {
		org.xtext.ui.contentassist.antlr.internal.InternalRdslParser result = new org.xtext.ui.contentassist.antlr.internal.InternalRdslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelAccess().getAlternatives(), "rule__Model__Alternatives");
					put(grammarAccess.getGraphAccess().getAlternatives(), "rule__Graph__Alternatives");
					put(grammarAccess.getImportAccess().getImportURIAlternatives_1_0(), "rule__Import__ImportURIAlternatives_1_0");
					put(grammarAccess.getURLAccess().getDomaineAlternatives_3_0(), "rule__URL__DomaineAlternatives_3_0");
					put(grammarAccess.getCompFacetAccess().getAlternatives(), "rule__CompFacet__Alternatives");
					put(grammarAccess.getComponentAccess().getAlternatives_3(), "rule__Component__Alternatives_3");
					put(grammarAccess.getImportVariableAccess().getAlternatives_1(), "rule__ImportVariable__Alternatives_1");
					put(grammarAccess.getImportVariableAccess().getAlternatives_1_0_2(), "rule__ImportVariable__Alternatives_1_0_2");
					put(grammarAccess.getInstanceAccess().getTheStateAlternatives_14_2_0(), "rule__Instance__TheStateAlternatives_14_2_0");
					put(grammarAccess.getInstanceAccess().getAlternatives_16(), "rule__Instance__Alternatives_16");
					put(grammarAccess.getIpAdressAccess().getAlternatives(), "rule__IpAdress__Alternatives");
					put(grammarAccess.getIpTableAccess().getTrafficAlternatives_2_0(), "rule__IpTable__TrafficAlternatives_2_0");
					put(grammarAccess.getIpTableAccess().getProtocolAlternatives_5_1_0(), "rule__IpTable__ProtocolAlternatives_5_1_0");
					put(grammarAccess.getIpTableAccess().getTargetAlternatives_7_0(), "rule__IpTable__TargetAlternatives_7_0");
					put(grammarAccess.getFullnameAccess().getAlternatives(), "rule__Fullname__Alternatives");
					put(grammarAccess.getVALAccess().getAlternatives(), "rule__VAL__Alternatives");
					put(grammarAccess.getATypeAccess().getAlternatives(), "rule__AType__Alternatives");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getURLAccess().getGroup(), "rule__URL__Group__0");
					put(grammarAccess.getURLAccess().getGroup_4(), "rule__URL__Group_4__0");
					put(grammarAccess.getURLAccess().getGroup_5(), "rule__URL__Group_5__0");
					put(grammarAccess.getImpotUriAccess().getGroup(), "rule__ImpotUri__Group__0");
					put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
					put(grammarAccess.getComponentAccess().getGroup_5(), "rule__Component__Group_5__0");
					put(grammarAccess.getComponentAccess().getGroup_6(), "rule__Component__Group_6__0");
					put(grammarAccess.getInstallerAccess().getGroup(), "rule__Installer__Group__0");
					put(grammarAccess.getExtendsAccess().getGroup(), "rule__Extends__Group__0");
					put(grammarAccess.getChildrenAccess().getGroup(), "rule__Children__Group__0");
					put(grammarAccess.getChildrenAccess().getGroup_2(), "rule__Children__Group_2__0");
					put(grammarAccess.getExportAccess().getGroup(), "rule__Export__Group__0");
					put(grammarAccess.getExportAccess().getGroup_2(), "rule__Export__Group_2__0");
					put(grammarAccess.getExportVariableAccess().getGroup(), "rule__ExportVariable__Group__0");
					put(grammarAccess.getInitialisationAccess().getGroup(), "rule__Initialisation__Group__0");
					put(grammarAccess.getImportsAccess().getGroup(), "rule__Imports__Group__0");
					put(grammarAccess.getImportsAccess().getGroup_2(), "rule__Imports__Group_2__0");
					put(grammarAccess.getImportVariableAccess().getGroup(), "rule__ImportVariable__Group__0");
					put(grammarAccess.getImportVariableAccess().getGroup_1_0(), "rule__ImportVariable__Group_1_0__0");
					put(grammarAccess.getFacetsAccess().getGroup(), "rule__Facets__Group__0");
					put(grammarAccess.getFacetsAccess().getGroup_2(), "rule__Facets__Group_2__0");
					put(grammarAccess.getFacetAccess().getGroup(), "rule__Facet__Group__0");
					put(grammarAccess.getFacetAccess().getGroup_5(), "rule__Facet__Group_5__0");
					put(grammarAccess.getFacetAccess().getGroup_5_2(), "rule__Facet__Group_5_2__0");
					put(grammarAccess.getInstanceAccess().getGroup(), "rule__Instance__Group__0");
					put(grammarAccess.getInstanceAccess().getGroup_9(), "rule__Instance__Group_9__0");
					put(grammarAccess.getInstanceAccess().getGroup_10(), "rule__Instance__Group_10__0");
					put(grammarAccess.getInstanceAccess().getGroup_11(), "rule__Instance__Group_11__0");
					put(grammarAccess.getInstanceAccess().getGroup_12(), "rule__Instance__Group_12__0");
					put(grammarAccess.getInstanceAccess().getGroup_13(), "rule__Instance__Group_13__0");
					put(grammarAccess.getInstanceAccess().getGroup_14(), "rule__Instance__Group_14__0");
					put(grammarAccess.getInstanceAccess().getGroup_15(), "rule__Instance__Group_15__0");
					put(grammarAccess.getInstanceAccess().getGroup_16_0(), "rule__Instance__Group_16_0__0");
					put(grammarAccess.getInstanceAccess().getGroup_16_1(), "rule__Instance__Group_16_1__0");
					put(grammarAccess.getLoadAccess().getGroup(), "rule__Load__Group__0");
					put(grammarAccess.getIpAdressAccess().getGroup_0(), "rule__IpAdress__Group_0__0");
					put(grammarAccess.getIpAdressAccess().getGroup_0_2(), "rule__IpAdress__Group_0_2__0");
					put(grammarAccess.getIpAdressAccess().getGroup_1(), "rule__IpAdress__Group_1__0");
					put(grammarAccess.getIpAdressAccess().getGroup_1_2(), "rule__IpAdress__Group_1_2__0");
					put(grammarAccess.getIpTableAccess().getGroup(), "rule__IpTable__Group__0");
					put(grammarAccess.getIpTableAccess().getGroup_3(), "rule__IpTable__Group_3__0");
					put(grammarAccess.getIpTableAccess().getGroup_3_1(), "rule__IpTable__Group_3_1__0");
					put(grammarAccess.getIpTableAccess().getGroup_4(), "rule__IpTable__Group_4__0");
					put(grammarAccess.getIpTableAccess().getGroup_4_1(), "rule__IpTable__Group_4_1__0");
					put(grammarAccess.getIpTableAccess().getGroup_5(), "rule__IpTable__Group_5__0");
					put(grammarAccess.getAttributAccess().getGroup(), "rule__Attribut__Group__0");
					put(grammarAccess.getModelAccess().getGraphsAssignment_0(), "rule__Model__GraphsAssignment_0");
					put(grammarAccess.getModelAccess().getInstancesAssignment_1(), "rule__Model__InstancesAssignment_1");
					put(grammarAccess.getGraphAccess().getImportsAssignment_0(), "rule__Graph__ImportsAssignment_0");
					put(grammarAccess.getGraphAccess().getComponentsAssignment_1(), "rule__Graph__ComponentsAssignment_1");
					put(grammarAccess.getGraphAccess().getFacetGraphsAssignment_2(), "rule__Graph__FacetGraphsAssignment_2");
					put(grammarAccess.getImportAccess().getImportURIAssignment_1(), "rule__Import__ImportURIAssignment_1");
					put(grammarAccess.getURLAccess().getNameAssignment_1(), "rule__URL__NameAssignment_1");
					put(grammarAccess.getURLAccess().getDomaineAssignment_3(), "rule__URL__DomaineAssignment_3");
					put(grammarAccess.getURLAccess().getVariableAssignment_4_1(), "rule__URL__VariableAssignment_4_1");
					put(grammarAccess.getURLAccess().getVariablesAssignment_5_1(), "rule__URL__VariablesAssignment_5_1");
					put(grammarAccess.getURLAccess().getWildcardAssignment_5_2(), "rule__URL__WildcardAssignment_5_2");
					put(grammarAccess.getImpotUriAccess().getNameAssignment_0(), "rule__ImpotUri__NameAssignment_0");
					put(grammarAccess.getComponentAccess().getNameAssignment_0(), "rule__Component__NameAssignment_0");
					put(grammarAccess.getComponentAccess().getInstallersAssignment_2(), "rule__Component__InstallersAssignment_2");
					put(grammarAccess.getComponentAccess().getChildrensAssignment_3_0(), "rule__Component__ChildrensAssignment_3_0");
					put(grammarAccess.getComponentAccess().getExportsAssignment_3_1(), "rule__Component__ExportsAssignment_3_1");
					put(grammarAccess.getComponentAccess().getImportsAssignment_3_2(), "rule__Component__ImportsAssignment_3_2");
					put(grammarAccess.getComponentAccess().getFacetsAssignment_3_3(), "rule__Component__FacetsAssignment_3_3");
					put(grammarAccess.getComponentAccess().getExtendsAssignment_3_4(), "rule__Component__ExtendsAssignment_3_4");
					put(grammarAccess.getComponentAccess().getValminAssignment_5_2(), "rule__Component__ValminAssignment_5_2");
					put(grammarAccess.getComponentAccess().getValmaxAssignment_6_2(), "rule__Component__ValmaxAssignment_6_2");
					put(grammarAccess.getInstallerAccess().getNameAssignment_2(), "rule__Installer__NameAssignment_2");
					put(grammarAccess.getExtendsAccess().getSupComponentAssignment_2(), "rule__Extends__SupComponentAssignment_2");
					put(grammarAccess.getChildrenAccess().getChildrenAssignment_2_0(), "rule__Children__ChildrenAssignment_2_0");
					put(grammarAccess.getChildrenAccess().getChildAssignment_3(), "rule__Children__ChildAssignment_3");
					put(grammarAccess.getExportAccess().getExportsAssignment_2_0(), "rule__Export__ExportsAssignment_2_0");
					put(grammarAccess.getExportAccess().getExportAssignment_3(), "rule__Export__ExportAssignment_3");
					put(grammarAccess.getExportVariableAccess().getNameAssignment_0(), "rule__ExportVariable__NameAssignment_0");
					put(grammarAccess.getExportVariableAccess().getInitialAssignment_1(), "rule__ExportVariable__InitialAssignment_1");
					put(grammarAccess.getInitialisationAccess().getValAssignment_1(), "rule__Initialisation__ValAssignment_1");
					put(grammarAccess.getImportsAccess().getImportsAssignment_2_0(), "rule__Imports__ImportsAssignment_2_0");
					put(grammarAccess.getImportsAccess().getImportedAssignment_3(), "rule__Imports__ImportedAssignment_3");
					put(grammarAccess.getImportVariableAccess().getExternalAssignment_0(), "rule__ImportVariable__ExternalAssignment_0");
					put(grammarAccess.getImportVariableAccess().getImportvariableAssignment_1_0_0(), "rule__ImportVariable__ImportvariableAssignment_1_0_0");
					put(grammarAccess.getImportVariableAccess().getNameAssignment_1_0_2_0(), "rule__ImportVariable__NameAssignment_1_0_2_0");
					put(grammarAccess.getImportVariableAccess().getNameAssignment_1_1(), "rule__ImportVariable__NameAssignment_1_1");
					put(grammarAccess.getImportVariableAccess().getOptionalAssignment_2(), "rule__ImportVariable__OptionalAssignment_2");
					put(grammarAccess.getFacetsAccess().getFacetsAssignment_2_0(), "rule__Facets__FacetsAssignment_2_0");
					put(grammarAccess.getFacetsAccess().getFacetAssignment_3(), "rule__Facets__FacetAssignment_3");
					put(grammarAccess.getFacetAccess().getNameAssignment_1(), "rule__Facet__NameAssignment_1");
					put(grammarAccess.getFacetAccess().getExportFacetAssignment_3(), "rule__Facet__ExportFacetAssignment_3");
					put(grammarAccess.getFacetAccess().getChildrenFacetAssignment_4(), "rule__Facet__ChildrenFacetAssignment_4");
					put(grammarAccess.getFacetAccess().getSupFacetsAssignment_5_2_0(), "rule__Facet__SupFacetsAssignment_5_2_0");
					put(grammarAccess.getFacetAccess().getSupFacetAssignment_5_3(), "rule__Facet__SupFacetAssignment_5_3");
					put(grammarAccess.getInstanceAccess().getComponentAssignment_2(), "rule__Instance__ComponentAssignment_2");
					put(grammarAccess.getInstanceAccess().getNameAssignment_6(), "rule__Instance__NameAssignment_6");
					put(grammarAccess.getInstanceAccess().getFullnameAssignment_7(), "rule__Instance__FullnameAssignment_7");
					put(grammarAccess.getInstanceAccess().getCountAssignment_9_0(), "rule__Instance__CountAssignment_9_0");
					put(grammarAccess.getInstanceAccess().getValAssignment_9_2(), "rule__Instance__ValAssignment_9_2");
					put(grammarAccess.getInstanceAccess().getValminAssignment_10_2(), "rule__Instance__ValminAssignment_10_2");
					put(grammarAccess.getInstanceAccess().getValmaxAssignment_11_2(), "rule__Instance__ValmaxAssignment_11_2");
					put(grammarAccess.getInstanceAccess().getIpAddressAssignment_12_2(), "rule__Instance__IpAddressAssignment_12_2");
					put(grammarAccess.getInstanceAccess().getIpadressAssignment_12_5(), "rule__Instance__IpadressAssignment_12_5");
					put(grammarAccess.getInstanceAccess().getTheLoadAssignment_13_0(), "rule__Instance__TheLoadAssignment_13_0");
					put(grammarAccess.getInstanceAccess().getTheStateAssignment_14_2(), "rule__Instance__TheStateAssignment_14_2");
					put(grammarAccess.getInstanceAccess().getHostnameAssignment_15_2(), "rule__Instance__HostnameAssignment_15_2");
					put(grammarAccess.getInstanceAccess().getTcpAssignment_16_0_1(), "rule__Instance__TcpAssignment_16_0_1");
					put(grammarAccess.getInstanceAccess().getUdpAssignment_16_1_1(), "rule__Instance__UdpAssignment_16_1_1");
					put(grammarAccess.getInstanceAccess().getIptableAssignment_17(), "rule__Instance__IptableAssignment_17");
					put(grammarAccess.getInstanceAccess().getAttributesAssignment_18(), "rule__Instance__AttributesAssignment_18");
					put(grammarAccess.getInstanceAccess().getInstancesAssignment_19(), "rule__Instance__InstancesAssignment_19");
					put(grammarAccess.getLoadAccess().getValAssignment_2(), "rule__Load__ValAssignment_2");
					put(grammarAccess.getIpAdressAccess().getIp4Assignment_0_2_0(), "rule__IpAdress__Ip4Assignment_0_2_0");
					put(grammarAccess.getIpAdressAccess().getIp4lastAssignment_0_3(), "rule__IpAdress__Ip4lastAssignment_0_3");
					put(grammarAccess.getIpAdressAccess().getIp6Assignment_1_2_0(), "rule__IpAdress__Ip6Assignment_1_2_0");
					put(grammarAccess.getIpAdressAccess().getIp6lastAssignment_1_3(), "rule__IpAdress__Ip6lastAssignment_1_3");
					put(grammarAccess.getIpTableAccess().getTrafficAssignment_2(), "rule__IpTable__TrafficAssignment_2");
					put(grammarAccess.getIpTableAccess().getSourceAssignment_3_1_0(), "rule__IpTable__SourceAssignment_3_1_0");
					put(grammarAccess.getIpTableAccess().getSourcefinalAssignment_3_2(), "rule__IpTable__SourcefinalAssignment_3_2");
					put(grammarAccess.getIpTableAccess().getDestinationAssignment_4_1_0(), "rule__IpTable__DestinationAssignment_4_1_0");
					put(grammarAccess.getIpTableAccess().getDestinationfinalAssignment_4_2(), "rule__IpTable__DestinationfinalAssignment_4_2");
					put(grammarAccess.getIpTableAccess().getProtocolAssignment_5_1(), "rule__IpTable__ProtocolAssignment_5_1");
					put(grammarAccess.getIpTableAccess().getTargetAssignment_7(), "rule__IpTable__TargetAssignment_7");
					put(grammarAccess.getAttributAccess().getNameAssignment_0(), "rule__Attribut__NameAssignment_0");
					put(grammarAccess.getAttributAccess().getValeurAssignment_2(), "rule__Attribut__ValeurAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.ui.contentassist.antlr.internal.InternalRdslParser typedParser = (org.xtext.ui.contentassist.antlr.internal.InternalRdslParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public RdslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RdslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
