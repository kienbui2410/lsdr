/*
 * generated by Xtext
 */
package org.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.rdsl.Attribut;
import org.xtext.rdsl.Children;
import org.xtext.rdsl.Component;
import org.xtext.rdsl.Export;
import org.xtext.rdsl.Extends;
import org.xtext.rdsl.Facet;
import org.xtext.rdsl.Facets;
import org.xtext.rdsl.Graph;
import org.xtext.rdsl.Import;
import org.xtext.rdsl.Imports;
import org.xtext.rdsl.ImpotUri;
import org.xtext.rdsl.Initialisation;
import org.xtext.rdsl.Installer;
import org.xtext.rdsl.Instance;
import org.xtext.rdsl.IpTable;
import org.xtext.rdsl.Model;
import org.xtext.rdsl.RdslPackage;
import org.xtext.rdsl.URL;
import org.xtext.rdsl.exportVariable;
import org.xtext.rdsl.importVariable;
import org.xtext.services.RdslGrammarAccess;

@SuppressWarnings("all")
public class RdslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RdslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RdslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RdslPackage.ATTRIBUT:
				sequence_Attribut(context, (Attribut) semanticObject); 
				return; 
			case RdslPackage.CHILDREN:
				sequence_Children(context, (Children) semanticObject); 
				return; 
			case RdslPackage.COMPONENT:
				sequence_Component(context, (Component) semanticObject); 
				return; 
			case RdslPackage.EXPORT:
				sequence_Export(context, (Export) semanticObject); 
				return; 
			case RdslPackage.EXTENDS:
				sequence_Extends(context, (Extends) semanticObject); 
				return; 
			case RdslPackage.FACET:
				sequence_Facet(context, (Facet) semanticObject); 
				return; 
			case RdslPackage.FACETS:
				sequence_Facets(context, (Facets) semanticObject); 
				return; 
			case RdslPackage.GRAPH:
				sequence_Graph(context, (Graph) semanticObject); 
				return; 
			case RdslPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case RdslPackage.IMPORTS:
				sequence_Imports(context, (Imports) semanticObject); 
				return; 
			case RdslPackage.IMPOT_URI:
				sequence_ImpotUri(context, (ImpotUri) semanticObject); 
				return; 
			case RdslPackage.INITIALISATION:
				sequence_Initialisation(context, (Initialisation) semanticObject); 
				return; 
			case RdslPackage.INSTALLER:
				sequence_Installer(context, (Installer) semanticObject); 
				return; 
			case RdslPackage.INSTANCE:
				sequence_Instance(context, (Instance) semanticObject); 
				return; 
			case RdslPackage.IP_TABLE:
				sequence_IpTable(context, (IpTable) semanticObject); 
				return; 
			case RdslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case RdslPackage.URL:
				sequence_URL(context, (URL) semanticObject); 
				return; 
			case RdslPackage.EXPORT_VARIABLE:
				sequence_exportVariable(context, (exportVariable) semanticObject); 
				return; 
			case RdslPackage.IMPORT_VARIABLE:
				sequence_importVariable(context, (importVariable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Attribut returns Attribut
	 *
	 * Constraint:
	 *     (name=ID valeur=VAL)
	 */
	protected void sequence_Attribut(ISerializationContext context, Attribut semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdslPackage.Literals.ATTRIBUT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdslPackage.Literals.ATTRIBUT__NAME));
			if (transientValues.isValueTransient(semanticObject, RdslPackage.Literals.ATTRIBUT__VALEUR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdslPackage.Literals.ATTRIBUT__VALEUR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributAccess().getValeurVALParserRuleCall_2_0(), semanticObject.getValeur());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Children returns Children
	 *
	 * Constraint:
	 *     (children+=[Component|ID]* child=[Component|ID])
	 */
	protected void sequence_Children(ISerializationContext context, Children semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CompFacet returns Component
	 *     Component returns Component
	 *
	 * Constraint:
	 *     (name=ID installers=Installer (childrens+=Children | exports+=Export | imports+=Imports | facets+=Facets | extends+=Extends)*)
	 */
	protected void sequence_Component(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Export returns Export
	 *
	 * Constraint:
	 *     (exports+=exportVariable* export=exportVariable)
	 */
	protected void sequence_Export(ISerializationContext context, Export semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Extends returns Extends
	 *
	 * Constraint:
	 *     supComponent=[Component|ID]
	 */
	protected void sequence_Extends(ISerializationContext context, Extends semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdslPackage.Literals.EXTENDS__SUP_COMPONENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdslPackage.Literals.EXTENDS__SUP_COMPONENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExtendsAccess().getSupComponentComponentIDTerminalRuleCall_2_0_1(), semanticObject.getSupComponent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CompFacet returns Facet
	 *     Facet returns Facet
	 *
	 * Constraint:
	 *     (name=ID exportFacet+=Export* childrenFacet=Children? (supFacets+=[Facet|ID]* supFacet=[Facet|ID])?)
	 */
	protected void sequence_Facet(ISerializationContext context, Facet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Facets returns Facets
	 *
	 * Constraint:
	 *     (facets+=[Facet|ID]* facet=[Facet|ID])
	 */
	protected void sequence_Facets(ISerializationContext context, Facets semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Graph returns Graph
	 *
	 * Constraint:
	 *     (imports+=Import | components+=Component | facetGraphs+=Facet)+
	 */
	protected void sequence_Graph(ISerializationContext context, Graph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     (importURI=ImpotUri | importURI=URL)
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Imports returns Imports
	 *
	 * Constraint:
	 *     (imports+=importVariable* imported=importVariable)
	 */
	protected void sequence_Imports(ISerializationContext context, Imports semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ImpotUri returns ImpotUri
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ImpotUri(ISerializationContext context, ImpotUri semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdslPackage.Literals.IMPOT_URI__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdslPackage.Literals.IMPOT_URI__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImpotUriAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Initialisation returns Initialisation
	 *
	 * Constraint:
	 *     val=INT
	 */
	protected void sequence_Initialisation(ISerializationContext context, Initialisation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdslPackage.Literals.INITIALISATION__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdslPackage.Literals.INITIALISATION__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInitialisationAccess().getValINTTerminalRuleCall_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Installer returns Installer
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Installer(ISerializationContext context, Installer semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RdslPackage.Literals.INSTALLER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RdslPackage.Literals.INSTALLER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInstallerAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Instance returns Instance
	 *
	 * Constraint:
	 *     (
	 *         component=[Component|ID] 
	 *         name=ID 
	 *         fullname+=Fullname* 
	 *         (count='count' val=INT)? 
	 *         valmin=INT? 
	 *         valmax=INT? 
	 *         ipAddress=AType? 
	 *         (ip4+=INT* ip4last=INT)? 
	 *         (ip6+=INT* ip6last=INT)? 
	 *         theLoad=INT? 
	 *         (theState='public' | theState='private')? 
	 *         hostname=ID? 
	 *         iptable+=IpTable* 
	 *         attributes+=Attribut* 
	 *         instances+=Instance*
	 *     )
	 */
	protected void sequence_Instance(ISerializationContext context, Instance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IpTable returns IpTable
	 *
	 * Constraint:
	 *     (
	 *         (traffic='INPUT' | traffic='OUTPUT' | traffic='FORWARD') 
	 *         source+=INT+ 
	 *         sourcefinal=INT 
	 *         destination+=INT+ 
	 *         destinationfinal=INT 
	 *         (protocol='tcp' | protocol='udp') 
	 *         (target='ACCEPT' | target='REJECT' | target='DROP')
	 *     )
	 */
	protected void sequence_IpTable(ISerializationContext context, IpTable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (graphs=Graph | (instances+=Instance* valmin=INT valmax=INT) | (instances+=Instance* valmax=INT) | valmax=INT)?
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     URL returns URL
	 *
	 * Constraint:
	 *     (name=ID (domaine='com' | domaine='org' | domaine='fr' | domaine='net') variable=ID* (variables+=ID wildcard?='*')?)
	 */
	protected void sequence_URL(ISerializationContext context, URL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     exportVariable returns exportVariable
	 *
	 * Constraint:
	 *     (name=ID initial=Initialisation?)
	 */
	protected void sequence_exportVariable(ISerializationContext context, exportVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     importVariable returns importVariable
	 *
	 * Constraint:
	 *     (external?='external'? ((importvariable=[CompFacet|ID] name=ID?) | name=ID) optional?='(optional)'?)
	 */
	protected void sequence_importVariable(ISerializationContext context, importVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
