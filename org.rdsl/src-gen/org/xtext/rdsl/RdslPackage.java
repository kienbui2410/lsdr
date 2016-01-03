/**
 */
package org.xtext.rdsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.rdsl.RdslFactory
 * @model kind="package"
 * @generated
 */
public interface RdslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rdsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/Rdsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rdsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RdslPackage eINSTANCE = org.xtext.rdsl.impl.RdslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.ModelImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Graphs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GRAPHS = 0;

  /**
   * The feature id for the '<em><b>Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__INSTANCES = 1;

  /**
   * The feature id for the '<em><b>Valmin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__VALMIN = 2;

  /**
   * The feature id for the '<em><b>Valmax</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__VALMAX = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.GraphImpl <em>Graph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.GraphImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getGraph()
   * @generated
   */
  int GRAPH = 1;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH__COMPONENTS = 1;

  /**
   * The feature id for the '<em><b>Facet Graphs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH__FACET_GRAPHS = 2;

  /**
   * The number of structural features of the '<em>Graph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.ImportImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.URLImpl <em>URL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.URLImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getURL()
   * @generated
   */
  int URL = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL__NAME = 0;

  /**
   * The feature id for the '<em><b>Domaine</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL__DOMAINE = 1;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL__VARIABLE = 2;

  /**
   * The feature id for the '<em><b>Variables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL__VARIABLES = 3;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL__WILDCARD = 4;

  /**
   * The number of structural features of the '<em>URL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.ImpotUriImpl <em>Impot Uri</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.ImpotUriImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getImpotUri()
   * @generated
   */
  int IMPOT_URI = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPOT_URI__NAME = 0;

  /**
   * The number of structural features of the '<em>Impot Uri</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPOT_URI_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.CompFacetImpl <em>Comp Facet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.CompFacetImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getCompFacet()
   * @generated
   */
  int COMP_FACET = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMP_FACET__NAME = 0;

  /**
   * The number of structural features of the '<em>Comp Facet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMP_FACET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.ComponentImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = COMP_FACET__NAME;

  /**
   * The feature id for the '<em><b>Installers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__INSTALLERS = COMP_FACET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Childrens</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__CHILDRENS = COMP_FACET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Exports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__EXPORTS = COMP_FACET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__IMPORTS = COMP_FACET_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Facets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__FACETS = COMP_FACET_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__EXTENDS = COMP_FACET_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = COMP_FACET_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.InstallerImpl <em>Installer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.InstallerImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getInstaller()
   * @generated
   */
  int INSTALLER = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALLER__NAME = 0;

  /**
   * The number of structural features of the '<em>Installer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALLER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.ExtendsImpl <em>Extends</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.ExtendsImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getExtends()
   * @generated
   */
  int EXTENDS = 8;

  /**
   * The feature id for the '<em><b>Sup Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS__SUP_COMPONENT = 0;

  /**
   * The number of structural features of the '<em>Extends</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.ChildrenImpl <em>Children</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.ChildrenImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getChildren()
   * @generated
   */
  int CHILDREN = 9;

  /**
   * The feature id for the '<em><b>Children</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILDREN__CHILDREN = 0;

  /**
   * The feature id for the '<em><b>Child</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILDREN__CHILD = 1;

  /**
   * The number of structural features of the '<em>Children</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILDREN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.ExportImpl <em>Export</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.ExportImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getExport()
   * @generated
   */
  int EXPORT = 10;

  /**
   * The feature id for the '<em><b>Exports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT__EXPORTS = 0;

  /**
   * The feature id for the '<em><b>Export</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT__EXPORT = 1;

  /**
   * The number of structural features of the '<em>Export</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.exportVariableImpl <em>export Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.exportVariableImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getexportVariable()
   * @generated
   */
  int EXPORT_VARIABLE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_VARIABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Initial</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_VARIABLE__INITIAL = 1;

  /**
   * The number of structural features of the '<em>export Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_VARIABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.InitialisationImpl <em>Initialisation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.InitialisationImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getInitialisation()
   * @generated
   */
  int INITIALISATION = 12;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALISATION__VAL = 0;

  /**
   * The number of structural features of the '<em>Initialisation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALISATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.ImportsImpl <em>Imports</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.ImportsImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getImports()
   * @generated
   */
  int IMPORTS = 13;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTS__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Imported</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTS__IMPORTED = 1;

  /**
   * The number of structural features of the '<em>Imports</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.importVariableImpl <em>import Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.importVariableImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getimportVariable()
   * @generated
   */
  int IMPORT_VARIABLE = 14;

  /**
   * The feature id for the '<em><b>External</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_VARIABLE__EXTERNAL = 0;

  /**
   * The feature id for the '<em><b>Importvariable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_VARIABLE__IMPORTVARIABLE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_VARIABLE__NAME = 2;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_VARIABLE__OPTIONAL = 3;

  /**
   * The number of structural features of the '<em>import Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_VARIABLE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.FacetsImpl <em>Facets</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.FacetsImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getFacets()
   * @generated
   */
  int FACETS = 15;

  /**
   * The feature id for the '<em><b>Facets</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACETS__FACETS = 0;

  /**
   * The feature id for the '<em><b>Facet</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACETS__FACET = 1;

  /**
   * The number of structural features of the '<em>Facets</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACETS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.FacetImpl <em>Facet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.FacetImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getFacet()
   * @generated
   */
  int FACET = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET__NAME = COMP_FACET__NAME;

  /**
   * The feature id for the '<em><b>Export Facet</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET__EXPORT_FACET = COMP_FACET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Children Facet</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET__CHILDREN_FACET = COMP_FACET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sup Facets</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET__SUP_FACETS = COMP_FACET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Sup Facet</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET__SUP_FACET = COMP_FACET_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Facet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_FEATURE_COUNT = COMP_FACET_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.InstanceImpl <em>Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.InstanceImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getInstance()
   * @generated
   */
  int INSTANCE = 17;

  /**
   * The feature id for the '<em><b>Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__COMPONENT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__NAME = 1;

  /**
   * The feature id for the '<em><b>Fullname</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__FULLNAME = 2;

  /**
   * The feature id for the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__COUNT = 3;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__VAL = 4;

  /**
   * The feature id for the '<em><b>Valmin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__VALMIN = 5;

  /**
   * The feature id for the '<em><b>Valmax</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__VALMAX = 6;

  /**
   * The feature id for the '<em><b>Ip Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__IP_ADDRESS = 7;

  /**
   * The feature id for the '<em><b>Ip4</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__IP4 = 8;

  /**
   * The feature id for the '<em><b>Ip4last</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__IP4LAST = 9;

  /**
   * The feature id for the '<em><b>Ip6</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__IP6 = 10;

  /**
   * The feature id for the '<em><b>Ip6last</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__IP6LAST = 11;

  /**
   * The feature id for the '<em><b>The Load</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__THE_LOAD = 12;

  /**
   * The feature id for the '<em><b>The State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__THE_STATE = 13;

  /**
   * The feature id for the '<em><b>Hostname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__HOSTNAME = 14;

  /**
   * The feature id for the '<em><b>Iptable</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__IPTABLE = 15;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__ATTRIBUTES = 16;

  /**
   * The feature id for the '<em><b>Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__INSTANCES = 17;

  /**
   * The number of structural features of the '<em>Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_FEATURE_COUNT = 18;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.IpTableImpl <em>Ip Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.IpTableImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getIpTable()
   * @generated
   */
  int IP_TABLE = 18;

  /**
   * The feature id for the '<em><b>Traffic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IP_TABLE__TRAFFIC = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IP_TABLE__SOURCE = 1;

  /**
   * The feature id for the '<em><b>Sourcefinal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IP_TABLE__SOURCEFINAL = 2;

  /**
   * The feature id for the '<em><b>Destination</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IP_TABLE__DESTINATION = 3;

  /**
   * The feature id for the '<em><b>Destinationfinal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IP_TABLE__DESTINATIONFINAL = 4;

  /**
   * The feature id for the '<em><b>Protocol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IP_TABLE__PROTOCOL = 5;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IP_TABLE__TARGET = 6;

  /**
   * The number of structural features of the '<em>Ip Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IP_TABLE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.AttributImpl <em>Attribut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.AttributImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getAttribut()
   * @generated
   */
  int ATTRIBUT = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUT__NAME = 0;

  /**
   * The feature id for the '<em><b>Valeur</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUT__VALEUR = 1;

  /**
   * The number of structural features of the '<em>Attribut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUT_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.rdsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.rdsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.rdsl.Model#getGraphs <em>Graphs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Graphs</em>'.
   * @see org.xtext.rdsl.Model#getGraphs()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Graphs();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rdsl.Model#getInstances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instances</em>'.
   * @see org.xtext.rdsl.Model#getInstances()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Instances();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.Model#getValmin <em>Valmin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valmin</em>'.
   * @see org.xtext.rdsl.Model#getValmin()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Valmin();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.Model#getValmax <em>Valmax</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valmax</em>'.
   * @see org.xtext.rdsl.Model#getValmax()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Valmax();

  /**
   * Returns the meta object for class '{@link org.xtext.rdsl.Graph <em>Graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Graph</em>'.
   * @see org.xtext.rdsl.Graph
   * @generated
   */
  EClass getGraph();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rdsl.Graph#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.xtext.rdsl.Graph#getImports()
   * @see #getGraph()
   * @generated
   */
  EReference getGraph_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rdsl.Graph#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see org.xtext.rdsl.Graph#getComponents()
   * @see #getGraph()
   * @generated
   */
  EReference getGraph_Components();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rdsl.Graph#getFacetGraphs <em>Facet Graphs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Facet Graphs</em>'.
   * @see org.xtext.rdsl.Graph#getFacetGraphs()
   * @see #getGraph()
   * @generated
   */
  EReference getGraph_FacetGraphs();

  /**
   * Returns the meta object for class '{@link org.xtext.rdsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.xtext.rdsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.rdsl.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Import URI</em>'.
   * @see org.xtext.rdsl.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EReference getImport_ImportURI();

  /**
   * Returns the meta object for class '{@link org.xtext.rdsl.URL <em>URL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>URL</em>'.
   * @see org.xtext.rdsl.URL
   * @generated
   */
  EClass getURL();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.URL#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.rdsl.URL#getName()
   * @see #getURL()
   * @generated
   */
  EAttribute getURL_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.URL#getDomaine <em>Domaine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Domaine</em>'.
   * @see org.xtext.rdsl.URL#getDomaine()
   * @see #getURL()
   * @generated
   */
  EAttribute getURL_Domaine();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.URL#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see org.xtext.rdsl.URL#getVariable()
   * @see #getURL()
   * @generated
   */
  EAttribute getURL_Variable();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.rdsl.URL#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Variables</em>'.
   * @see org.xtext.rdsl.URL#getVariables()
   * @see #getURL()
   * @generated
   */
  EAttribute getURL_Variables();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.URL#isWildcard <em>Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wildcard</em>'.
   * @see org.xtext.rdsl.URL#isWildcard()
   * @see #getURL()
   * @generated
   */
  EAttribute getURL_Wildcard();

  /**
   * Returns the meta object for class '{@link org.xtext.rdsl.ImpotUri <em>Impot Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Impot Uri</em>'.
   * @see org.xtext.rdsl.ImpotUri
   * @generated
   */
  EClass getImpotUri();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.ImpotUri#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.rdsl.ImpotUri#getName()
   * @see #getImpotUri()
   * @generated
   */
  EAttribute getImpotUri_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.rdsl.CompFacet <em>Comp Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comp Facet</em>'.
   * @see org.xtext.rdsl.CompFacet
   * @generated
   */
  EClass getCompFacet();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.CompFacet#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.rdsl.CompFacet#getName()
   * @see #getCompFacet()
   * @generated
   */
  EAttribute getCompFacet_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.rdsl.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see org.xtext.rdsl.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.rdsl.Component#getInstallers <em>Installers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Installers</em>'.
   * @see org.xtext.rdsl.Component#getInstallers()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Installers();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rdsl.Component#getChildrens <em>Childrens</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Childrens</em>'.
   * @see org.xtext.rdsl.Component#getChildrens()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Childrens();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rdsl.Component#getExports <em>Exports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exports</em>'.
   * @see org.xtext.rdsl.Component#getExports()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Exports();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rdsl.Component#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.xtext.rdsl.Component#getImports()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rdsl.Component#getFacets <em>Facets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Facets</em>'.
   * @see org.xtext.rdsl.Component#getFacets()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Facets();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rdsl.Component#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extends</em>'.
   * @see org.xtext.rdsl.Component#getExtends()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Extends();

  /**
   * Returns the meta object for class '{@link org.xtext.rdsl.Installer <em>Installer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Installer</em>'.
   * @see org.xtext.rdsl.Installer
   * @generated
   */
  EClass getInstaller();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.Installer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.rdsl.Installer#getName()
   * @see #getInstaller()
   * @generated
   */
  EAttribute getInstaller_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.rdsl.Extends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extends</em>'.
   * @see org.xtext.rdsl.Extends
   * @generated
   */
  EClass getExtends();

  /**
   * Returns the meta object for the reference '{@link org.xtext.rdsl.Extends#getSupComponent <em>Sup Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Sup Component</em>'.
   * @see org.xtext.rdsl.Extends#getSupComponent()
   * @see #getExtends()
   * @generated
   */
  EReference getExtends_SupComponent();

  /**
   * Returns the meta object for class '{@link org.xtext.rdsl.Children <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Children</em>'.
   * @see org.xtext.rdsl.Children
   * @generated
   */
  EClass getChildren();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.rdsl.Children#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Children</em>'.
   * @see org.xtext.rdsl.Children#getChildren()
   * @see #getChildren()
   * @generated
   */
  EReference getChildren_Children();

  /**
   * Returns the meta object for the reference '{@link org.xtext.rdsl.Children#getChild <em>Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Child</em>'.
   * @see org.xtext.rdsl.Children#getChild()
   * @see #getChildren()
   * @generated
   */
  EReference getChildren_Child();

  /**
   * Returns the meta object for class '{@link org.xtext.rdsl.Export <em>Export</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Export</em>'.
   * @see org.xtext.rdsl.Export
   * @generated
   */
  EClass getExport();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rdsl.Export#getExports <em>Exports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exports</em>'.
   * @see org.xtext.rdsl.Export#getExports()
   * @see #getExport()
   * @generated
   */
  EReference getExport_Exports();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.rdsl.Export#getExport <em>Export</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Export</em>'.
   * @see org.xtext.rdsl.Export#getExport()
   * @see #getExport()
   * @generated
   */
  EReference getExport_Export();

  /**
   * Returns the meta object for class '{@link org.xtext.rdsl.exportVariable <em>export Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>export Variable</em>'.
   * @see org.xtext.rdsl.exportVariable
   * @generated
   */
  EClass getexportVariable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.exportVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.rdsl.exportVariable#getName()
   * @see #getexportVariable()
   * @generated
   */
  EAttribute getexportVariable_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.rdsl.exportVariable#getInitial <em>Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial</em>'.
   * @see org.xtext.rdsl.exportVariable#getInitial()
   * @see #getexportVariable()
   * @generated
   */
  EReference getexportVariable_Initial();

  /**
   * Returns the meta object for class '{@link org.xtext.rdsl.Initialisation <em>Initialisation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Initialisation</em>'.
   * @see org.xtext.rdsl.Initialisation
   * @generated
   */
  EClass getInitialisation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.Initialisation#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see org.xtext.rdsl.Initialisation#getVal()
   * @see #getInitialisation()
   * @generated
   */
  EAttribute getInitialisation_Val();

  /**
   * Returns the meta object for class '{@link org.xtext.rdsl.Imports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Imports</em>'.
   * @see org.xtext.rdsl.Imports
   * @generated
   */
  EClass getImports();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rdsl.Imports#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.xtext.rdsl.Imports#getImports()
   * @see #getImports()
   * @generated
   */
  EReference getImports_Imports();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.rdsl.Imports#getImported <em>Imported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Imported</em>'.
   * @see org.xtext.rdsl.Imports#getImported()
   * @see #getImports()
   * @generated
   */
  EReference getImports_Imported();

  /**
   * Returns the meta object for class '{@link org.xtext.rdsl.importVariable <em>import Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>import Variable</em>'.
   * @see org.xtext.rdsl.importVariable
   * @generated
   */
  EClass getimportVariable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.importVariable#isExternal <em>External</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>External</em>'.
   * @see org.xtext.rdsl.importVariable#isExternal()
   * @see #getimportVariable()
   * @generated
   */
  EAttribute getimportVariable_External();

  /**
   * Returns the meta object for the reference '{@link org.xtext.rdsl.importVariable#getImportvariable <em>Importvariable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Importvariable</em>'.
   * @see org.xtext.rdsl.importVariable#getImportvariable()
   * @see #getimportVariable()
   * @generated
   */
  EReference getimportVariable_Importvariable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.importVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.rdsl.importVariable#getName()
   * @see #getimportVariable()
   * @generated
   */
  EAttribute getimportVariable_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.importVariable#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see org.xtext.rdsl.importVariable#isOptional()
   * @see #getimportVariable()
   * @generated
   */
  EAttribute getimportVariable_Optional();

  /**
   * Returns the meta object for class '{@link org.xtext.rdsl.Facets <em>Facets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Facets</em>'.
   * @see org.xtext.rdsl.Facets
   * @generated
   */
  EClass getFacets();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.rdsl.Facets#getFacets <em>Facets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Facets</em>'.
   * @see org.xtext.rdsl.Facets#getFacets()
   * @see #getFacets()
   * @generated
   */
  EReference getFacets_Facets();

  /**
   * Returns the meta object for the reference '{@link org.xtext.rdsl.Facets#getFacet <em>Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Facet</em>'.
   * @see org.xtext.rdsl.Facets#getFacet()
   * @see #getFacets()
   * @generated
   */
  EReference getFacets_Facet();

  /**
   * Returns the meta object for class '{@link org.xtext.rdsl.Facet <em>Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Facet</em>'.
   * @see org.xtext.rdsl.Facet
   * @generated
   */
  EClass getFacet();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rdsl.Facet#getExportFacet <em>Export Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Export Facet</em>'.
   * @see org.xtext.rdsl.Facet#getExportFacet()
   * @see #getFacet()
   * @generated
   */
  EReference getFacet_ExportFacet();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.rdsl.Facet#getChildrenFacet <em>Children Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Children Facet</em>'.
   * @see org.xtext.rdsl.Facet#getChildrenFacet()
   * @see #getFacet()
   * @generated
   */
  EReference getFacet_ChildrenFacet();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.rdsl.Facet#getSupFacets <em>Sup Facets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Sup Facets</em>'.
   * @see org.xtext.rdsl.Facet#getSupFacets()
   * @see #getFacet()
   * @generated
   */
  EReference getFacet_SupFacets();

  /**
   * Returns the meta object for the reference '{@link org.xtext.rdsl.Facet#getSupFacet <em>Sup Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Sup Facet</em>'.
   * @see org.xtext.rdsl.Facet#getSupFacet()
   * @see #getFacet()
   * @generated
   */
  EReference getFacet_SupFacet();

  /**
   * Returns the meta object for class '{@link org.xtext.rdsl.Instance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance</em>'.
   * @see org.xtext.rdsl.Instance
   * @generated
   */
  EClass getInstance();

  /**
   * Returns the meta object for the reference '{@link org.xtext.rdsl.Instance#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Component</em>'.
   * @see org.xtext.rdsl.Instance#getComponent()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_Component();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.Instance#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.rdsl.Instance#getName()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.rdsl.Instance#getFullname <em>Fullname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Fullname</em>'.
   * @see org.xtext.rdsl.Instance#getFullname()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_Fullname();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.Instance#getCount <em>Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Count</em>'.
   * @see org.xtext.rdsl.Instance#getCount()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_Count();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.Instance#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see org.xtext.rdsl.Instance#getVal()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_Val();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.Instance#getValmin <em>Valmin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valmin</em>'.
   * @see org.xtext.rdsl.Instance#getValmin()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_Valmin();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.Instance#getValmax <em>Valmax</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valmax</em>'.
   * @see org.xtext.rdsl.Instance#getValmax()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_Valmax();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.Instance#getIpAddress <em>Ip Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ip Address</em>'.
   * @see org.xtext.rdsl.Instance#getIpAddress()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_IpAddress();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.rdsl.Instance#getIp4 <em>Ip4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Ip4</em>'.
   * @see org.xtext.rdsl.Instance#getIp4()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_Ip4();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.Instance#getIp4last <em>Ip4last</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ip4last</em>'.
   * @see org.xtext.rdsl.Instance#getIp4last()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_Ip4last();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.rdsl.Instance#getIp6 <em>Ip6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Ip6</em>'.
   * @see org.xtext.rdsl.Instance#getIp6()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_Ip6();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.Instance#getIp6last <em>Ip6last</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ip6last</em>'.
   * @see org.xtext.rdsl.Instance#getIp6last()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_Ip6last();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.Instance#getTheLoad <em>The Load</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>The Load</em>'.
   * @see org.xtext.rdsl.Instance#getTheLoad()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_TheLoad();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.Instance#getTheState <em>The State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>The State</em>'.
   * @see org.xtext.rdsl.Instance#getTheState()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_TheState();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.Instance#getHostname <em>Hostname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hostname</em>'.
   * @see org.xtext.rdsl.Instance#getHostname()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_Hostname();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rdsl.Instance#getIptable <em>Iptable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Iptable</em>'.
   * @see org.xtext.rdsl.Instance#getIptable()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_Iptable();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rdsl.Instance#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.xtext.rdsl.Instance#getAttributes()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rdsl.Instance#getInstances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instances</em>'.
   * @see org.xtext.rdsl.Instance#getInstances()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_Instances();

  /**
   * Returns the meta object for class '{@link org.xtext.rdsl.IpTable <em>Ip Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ip Table</em>'.
   * @see org.xtext.rdsl.IpTable
   * @generated
   */
  EClass getIpTable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.IpTable#getTraffic <em>Traffic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Traffic</em>'.
   * @see org.xtext.rdsl.IpTable#getTraffic()
   * @see #getIpTable()
   * @generated
   */
  EAttribute getIpTable_Traffic();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.rdsl.IpTable#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Source</em>'.
   * @see org.xtext.rdsl.IpTable#getSource()
   * @see #getIpTable()
   * @generated
   */
  EAttribute getIpTable_Source();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.IpTable#getSourcefinal <em>Sourcefinal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sourcefinal</em>'.
   * @see org.xtext.rdsl.IpTable#getSourcefinal()
   * @see #getIpTable()
   * @generated
   */
  EAttribute getIpTable_Sourcefinal();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.rdsl.IpTable#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Destination</em>'.
   * @see org.xtext.rdsl.IpTable#getDestination()
   * @see #getIpTable()
   * @generated
   */
  EAttribute getIpTable_Destination();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.IpTable#getDestinationfinal <em>Destinationfinal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Destinationfinal</em>'.
   * @see org.xtext.rdsl.IpTable#getDestinationfinal()
   * @see #getIpTable()
   * @generated
   */
  EAttribute getIpTable_Destinationfinal();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.IpTable#getProtocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Protocol</em>'.
   * @see org.xtext.rdsl.IpTable#getProtocol()
   * @see #getIpTable()
   * @generated
   */
  EAttribute getIpTable_Protocol();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.IpTable#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see org.xtext.rdsl.IpTable#getTarget()
   * @see #getIpTable()
   * @generated
   */
  EAttribute getIpTable_Target();

  /**
   * Returns the meta object for class '{@link org.xtext.rdsl.Attribut <em>Attribut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribut</em>'.
   * @see org.xtext.rdsl.Attribut
   * @generated
   */
  EClass getAttribut();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.Attribut#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.rdsl.Attribut#getName()
   * @see #getAttribut()
   * @generated
   */
  EAttribute getAttribut_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.Attribut#getValeur <em>Valeur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valeur</em>'.
   * @see org.xtext.rdsl.Attribut#getValeur()
   * @see #getAttribut()
   * @generated
   */
  EAttribute getAttribut_Valeur();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RdslFactory getRdslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.rdsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rdsl.impl.ModelImpl
     * @see org.xtext.rdsl.impl.RdslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Graphs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__GRAPHS = eINSTANCE.getModel_Graphs();

    /**
     * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__INSTANCES = eINSTANCE.getModel_Instances();

    /**
     * The meta object literal for the '<em><b>Valmin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__VALMIN = eINSTANCE.getModel_Valmin();

    /**
     * The meta object literal for the '<em><b>Valmax</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__VALMAX = eINSTANCE.getModel_Valmax();

    /**
     * The meta object literal for the '{@link org.xtext.rdsl.impl.GraphImpl <em>Graph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rdsl.impl.GraphImpl
     * @see org.xtext.rdsl.impl.RdslPackageImpl#getGraph()
     * @generated
     */
    EClass GRAPH = eINSTANCE.getGraph();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPH__IMPORTS = eINSTANCE.getGraph_Imports();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPH__COMPONENTS = eINSTANCE.getGraph_Components();

    /**
     * The meta object literal for the '<em><b>Facet Graphs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPH__FACET_GRAPHS = eINSTANCE.getGraph_FacetGraphs();

    /**
     * The meta object literal for the '{@link org.xtext.rdsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rdsl.impl.ImportImpl
     * @see org.xtext.rdsl.impl.RdslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

    /**
     * The meta object literal for the '{@link org.xtext.rdsl.impl.URLImpl <em>URL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rdsl.impl.URLImpl
     * @see org.xtext.rdsl.impl.RdslPackageImpl#getURL()
     * @generated
     */
    EClass URL = eINSTANCE.getURL();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URL__NAME = eINSTANCE.getURL_Name();

    /**
     * The meta object literal for the '<em><b>Domaine</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URL__DOMAINE = eINSTANCE.getURL_Domaine();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URL__VARIABLE = eINSTANCE.getURL_Variable();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URL__VARIABLES = eINSTANCE.getURL_Variables();

    /**
     * The meta object literal for the '<em><b>Wildcard</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URL__WILDCARD = eINSTANCE.getURL_Wildcard();

    /**
     * The meta object literal for the '{@link org.xtext.rdsl.impl.ImpotUriImpl <em>Impot Uri</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rdsl.impl.ImpotUriImpl
     * @see org.xtext.rdsl.impl.RdslPackageImpl#getImpotUri()
     * @generated
     */
    EClass IMPOT_URI = eINSTANCE.getImpotUri();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPOT_URI__NAME = eINSTANCE.getImpotUri_Name();

    /**
     * The meta object literal for the '{@link org.xtext.rdsl.impl.CompFacetImpl <em>Comp Facet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rdsl.impl.CompFacetImpl
     * @see org.xtext.rdsl.impl.RdslPackageImpl#getCompFacet()
     * @generated
     */
    EClass COMP_FACET = eINSTANCE.getCompFacet();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMP_FACET__NAME = eINSTANCE.getCompFacet_Name();

    /**
     * The meta object literal for the '{@link org.xtext.rdsl.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rdsl.impl.ComponentImpl
     * @see org.xtext.rdsl.impl.RdslPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Installers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__INSTALLERS = eINSTANCE.getComponent_Installers();

    /**
     * The meta object literal for the '<em><b>Childrens</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__CHILDRENS = eINSTANCE.getComponent_Childrens();

    /**
     * The meta object literal for the '<em><b>Exports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__EXPORTS = eINSTANCE.getComponent_Exports();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__IMPORTS = eINSTANCE.getComponent_Imports();

    /**
     * The meta object literal for the '<em><b>Facets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__FACETS = eINSTANCE.getComponent_Facets();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__EXTENDS = eINSTANCE.getComponent_Extends();

    /**
     * The meta object literal for the '{@link org.xtext.rdsl.impl.InstallerImpl <em>Installer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rdsl.impl.InstallerImpl
     * @see org.xtext.rdsl.impl.RdslPackageImpl#getInstaller()
     * @generated
     */
    EClass INSTALLER = eINSTANCE.getInstaller();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTALLER__NAME = eINSTANCE.getInstaller_Name();

    /**
     * The meta object literal for the '{@link org.xtext.rdsl.impl.ExtendsImpl <em>Extends</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rdsl.impl.ExtendsImpl
     * @see org.xtext.rdsl.impl.RdslPackageImpl#getExtends()
     * @generated
     */
    EClass EXTENDS = eINSTANCE.getExtends();

    /**
     * The meta object literal for the '<em><b>Sup Component</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTENDS__SUP_COMPONENT = eINSTANCE.getExtends_SupComponent();

    /**
     * The meta object literal for the '{@link org.xtext.rdsl.impl.ChildrenImpl <em>Children</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rdsl.impl.ChildrenImpl
     * @see org.xtext.rdsl.impl.RdslPackageImpl#getChildren()
     * @generated
     */
    EClass CHILDREN = eINSTANCE.getChildren();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHILDREN__CHILDREN = eINSTANCE.getChildren_Children();

    /**
     * The meta object literal for the '<em><b>Child</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHILDREN__CHILD = eINSTANCE.getChildren_Child();

    /**
     * The meta object literal for the '{@link org.xtext.rdsl.impl.ExportImpl <em>Export</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rdsl.impl.ExportImpl
     * @see org.xtext.rdsl.impl.RdslPackageImpl#getExport()
     * @generated
     */
    EClass EXPORT = eINSTANCE.getExport();

    /**
     * The meta object literal for the '<em><b>Exports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPORT__EXPORTS = eINSTANCE.getExport_Exports();

    /**
     * The meta object literal for the '<em><b>Export</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPORT__EXPORT = eINSTANCE.getExport_Export();

    /**
     * The meta object literal for the '{@link org.xtext.rdsl.impl.exportVariableImpl <em>export Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rdsl.impl.exportVariableImpl
     * @see org.xtext.rdsl.impl.RdslPackageImpl#getexportVariable()
     * @generated
     */
    EClass EXPORT_VARIABLE = eINSTANCE.getexportVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPORT_VARIABLE__NAME = eINSTANCE.getexportVariable_Name();

    /**
     * The meta object literal for the '<em><b>Initial</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPORT_VARIABLE__INITIAL = eINSTANCE.getexportVariable_Initial();

    /**
     * The meta object literal for the '{@link org.xtext.rdsl.impl.InitialisationImpl <em>Initialisation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rdsl.impl.InitialisationImpl
     * @see org.xtext.rdsl.impl.RdslPackageImpl#getInitialisation()
     * @generated
     */
    EClass INITIALISATION = eINSTANCE.getInitialisation();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INITIALISATION__VAL = eINSTANCE.getInitialisation_Val();

    /**
     * The meta object literal for the '{@link org.xtext.rdsl.impl.ImportsImpl <em>Imports</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rdsl.impl.ImportsImpl
     * @see org.xtext.rdsl.impl.RdslPackageImpl#getImports()
     * @generated
     */
    EClass IMPORTS = eINSTANCE.getImports();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORTS__IMPORTS = eINSTANCE.getImports_Imports();

    /**
     * The meta object literal for the '<em><b>Imported</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORTS__IMPORTED = eINSTANCE.getImports_Imported();

    /**
     * The meta object literal for the '{@link org.xtext.rdsl.impl.importVariableImpl <em>import Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rdsl.impl.importVariableImpl
     * @see org.xtext.rdsl.impl.RdslPackageImpl#getimportVariable()
     * @generated
     */
    EClass IMPORT_VARIABLE = eINSTANCE.getimportVariable();

    /**
     * The meta object literal for the '<em><b>External</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_VARIABLE__EXTERNAL = eINSTANCE.getimportVariable_External();

    /**
     * The meta object literal for the '<em><b>Importvariable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT_VARIABLE__IMPORTVARIABLE = eINSTANCE.getimportVariable_Importvariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_VARIABLE__NAME = eINSTANCE.getimportVariable_Name();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_VARIABLE__OPTIONAL = eINSTANCE.getimportVariable_Optional();

    /**
     * The meta object literal for the '{@link org.xtext.rdsl.impl.FacetsImpl <em>Facets</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rdsl.impl.FacetsImpl
     * @see org.xtext.rdsl.impl.RdslPackageImpl#getFacets()
     * @generated
     */
    EClass FACETS = eINSTANCE.getFacets();

    /**
     * The meta object literal for the '<em><b>Facets</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACETS__FACETS = eINSTANCE.getFacets_Facets();

    /**
     * The meta object literal for the '<em><b>Facet</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACETS__FACET = eINSTANCE.getFacets_Facet();

    /**
     * The meta object literal for the '{@link org.xtext.rdsl.impl.FacetImpl <em>Facet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rdsl.impl.FacetImpl
     * @see org.xtext.rdsl.impl.RdslPackageImpl#getFacet()
     * @generated
     */
    EClass FACET = eINSTANCE.getFacet();

    /**
     * The meta object literal for the '<em><b>Export Facet</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACET__EXPORT_FACET = eINSTANCE.getFacet_ExportFacet();

    /**
     * The meta object literal for the '<em><b>Children Facet</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACET__CHILDREN_FACET = eINSTANCE.getFacet_ChildrenFacet();

    /**
     * The meta object literal for the '<em><b>Sup Facets</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACET__SUP_FACETS = eINSTANCE.getFacet_SupFacets();

    /**
     * The meta object literal for the '<em><b>Sup Facet</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACET__SUP_FACET = eINSTANCE.getFacet_SupFacet();

    /**
     * The meta object literal for the '{@link org.xtext.rdsl.impl.InstanceImpl <em>Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rdsl.impl.InstanceImpl
     * @see org.xtext.rdsl.impl.RdslPackageImpl#getInstance()
     * @generated
     */
    EClass INSTANCE = eINSTANCE.getInstance();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__COMPONENT = eINSTANCE.getInstance_Component();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__NAME = eINSTANCE.getInstance_Name();

    /**
     * The meta object literal for the '<em><b>Fullname</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__FULLNAME = eINSTANCE.getInstance_Fullname();

    /**
     * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__COUNT = eINSTANCE.getInstance_Count();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__VAL = eINSTANCE.getInstance_Val();

    /**
     * The meta object literal for the '<em><b>Valmin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__VALMIN = eINSTANCE.getInstance_Valmin();

    /**
     * The meta object literal for the '<em><b>Valmax</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__VALMAX = eINSTANCE.getInstance_Valmax();

    /**
     * The meta object literal for the '<em><b>Ip Address</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__IP_ADDRESS = eINSTANCE.getInstance_IpAddress();

    /**
     * The meta object literal for the '<em><b>Ip4</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__IP4 = eINSTANCE.getInstance_Ip4();

    /**
     * The meta object literal for the '<em><b>Ip4last</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__IP4LAST = eINSTANCE.getInstance_Ip4last();

    /**
     * The meta object literal for the '<em><b>Ip6</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__IP6 = eINSTANCE.getInstance_Ip6();

    /**
     * The meta object literal for the '<em><b>Ip6last</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__IP6LAST = eINSTANCE.getInstance_Ip6last();

    /**
     * The meta object literal for the '<em><b>The Load</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__THE_LOAD = eINSTANCE.getInstance_TheLoad();

    /**
     * The meta object literal for the '<em><b>The State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__THE_STATE = eINSTANCE.getInstance_TheState();

    /**
     * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__HOSTNAME = eINSTANCE.getInstance_Hostname();

    /**
     * The meta object literal for the '<em><b>Iptable</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__IPTABLE = eINSTANCE.getInstance_Iptable();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__ATTRIBUTES = eINSTANCE.getInstance_Attributes();

    /**
     * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__INSTANCES = eINSTANCE.getInstance_Instances();

    /**
     * The meta object literal for the '{@link org.xtext.rdsl.impl.IpTableImpl <em>Ip Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rdsl.impl.IpTableImpl
     * @see org.xtext.rdsl.impl.RdslPackageImpl#getIpTable()
     * @generated
     */
    EClass IP_TABLE = eINSTANCE.getIpTable();

    /**
     * The meta object literal for the '<em><b>Traffic</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IP_TABLE__TRAFFIC = eINSTANCE.getIpTable_Traffic();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IP_TABLE__SOURCE = eINSTANCE.getIpTable_Source();

    /**
     * The meta object literal for the '<em><b>Sourcefinal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IP_TABLE__SOURCEFINAL = eINSTANCE.getIpTable_Sourcefinal();

    /**
     * The meta object literal for the '<em><b>Destination</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IP_TABLE__DESTINATION = eINSTANCE.getIpTable_Destination();

    /**
     * The meta object literal for the '<em><b>Destinationfinal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IP_TABLE__DESTINATIONFINAL = eINSTANCE.getIpTable_Destinationfinal();

    /**
     * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IP_TABLE__PROTOCOL = eINSTANCE.getIpTable_Protocol();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IP_TABLE__TARGET = eINSTANCE.getIpTable_Target();

    /**
     * The meta object literal for the '{@link org.xtext.rdsl.impl.AttributImpl <em>Attribut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rdsl.impl.AttributImpl
     * @see org.xtext.rdsl.impl.RdslPackageImpl#getAttribut()
     * @generated
     */
    EClass ATTRIBUT = eINSTANCE.getAttribut();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUT__NAME = eINSTANCE.getAttribut_Name();

    /**
     * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUT__VALEUR = eINSTANCE.getAttribut_Valeur();

  }

} //RdslPackage
