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
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__NAME = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.CompFacetImpl <em>Comp Facet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.CompFacetImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getCompFacet()
   * @generated
   */
  int COMP_FACET = 3;

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
  int COMPONENT = 4;

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
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__PROPERTIES = COMP_FACET_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = COMP_FACET_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.InstallerImpl <em>Installer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.InstallerImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getInstaller()
   * @generated
   */
  int INSTALLER = 5;

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
   * The meta object id for the '{@link org.xtext.rdsl.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.PropertyImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 6;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.ExtendsImpl <em>Extends</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.ExtendsImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getExtends()
   * @generated
   */
  int EXTENDS = 7;

  /**
   * The feature id for the '<em><b>Sup Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS__SUP_COMPONENT = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Extends</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.ChildrenImpl <em>Children</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.ChildrenImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getChildren()
   * @generated
   */
  int CHILDREN = 8;

  /**
   * The feature id for the '<em><b>Children</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILDREN__CHILDREN = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Child</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILDREN__CHILD = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Children</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILDREN_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.ExportImpl <em>Export</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.ExportImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getExport()
   * @generated
   */
  int EXPORT = 9;

  /**
   * The feature id for the '<em><b>Exports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT__EXPORTS = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Export</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT__EXPORT = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Export</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.exportVariableImpl <em>export Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.exportVariableImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getexportVariable()
   * @generated
   */
  int EXPORT_VARIABLE = 10;

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
  int INITIALISATION = 11;

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
  int IMPORTS = 12;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTS__IMPORTS = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Imported</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTS__IMPORTED = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Imports</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTS_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.importVariableImpl <em>import Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.importVariableImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getimportVariable()
   * @generated
   */
  int IMPORT_VARIABLE = 13;

  /**
   * The feature id for the '<em><b>Importvariable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_VARIABLE__IMPORTVARIABLE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_VARIABLE__NAME = 1;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_VARIABLE__OPTIONAL = 2;

  /**
   * The number of structural features of the '<em>import Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_VARIABLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.FacetsImpl <em>Facets</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.FacetsImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getFacets()
   * @generated
   */
  int FACETS = 14;

  /**
   * The feature id for the '<em><b>Facets</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACETS__FACETS = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Facet</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACETS__FACET = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Facets</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACETS_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.FacetImpl <em>Facet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.FacetImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getFacet()
   * @generated
   */
  int FACET = 15;

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
  int INSTANCE = 16;

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
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__VAL = 2;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__ATTRIBUTES = 3;

  /**
   * The feature id for the '<em><b>Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__INSTANCES = 4;

  /**
   * The number of structural features of the '<em>Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.rdsl.impl.AttributImpl <em>Attribut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rdsl.impl.AttributImpl
   * @see org.xtext.rdsl.impl.RdslPackageImpl#getAttribut()
   * @generated
   */
  int ATTRIBUT = 17;

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
   * Returns the meta object for the attribute '{@link org.xtext.rdsl.Import#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.rdsl.Import#getName()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_Name();

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
   * Returns the meta object for the containment reference list '{@link org.xtext.rdsl.Component#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.xtext.rdsl.Component#getProperties()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Properties();

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
   * Returns the meta object for class '{@link org.xtext.rdsl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.xtext.rdsl.Property
   * @generated
   */
  EClass getProperty();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__NAME = eINSTANCE.getImport_Name();

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
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__PROPERTIES = eINSTANCE.getComponent_Properties();

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
     * The meta object literal for the '{@link org.xtext.rdsl.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rdsl.impl.PropertyImpl
     * @see org.xtext.rdsl.impl.RdslPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

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
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__VAL = eINSTANCE.getInstance_Val();

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
