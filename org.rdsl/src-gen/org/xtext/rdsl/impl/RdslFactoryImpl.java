/**
 */
package org.xtext.rdsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.rdsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdslFactoryImpl extends EFactoryImpl implements RdslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RdslFactory init()
  {
    try
    {
      RdslFactory theRdslFactory = (RdslFactory)EPackage.Registry.INSTANCE.getEFactory(RdslPackage.eNS_URI);
      if (theRdslFactory != null)
      {
        return theRdslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RdslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RdslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RdslPackage.MODEL: return createModel();
      case RdslPackage.GRAPH: return createGraph();
      case RdslPackage.IMPORT: return createImport();
      case RdslPackage.IMPOT_URI: return createImpotUri();
      case RdslPackage.COMP_FACET: return createCompFacet();
      case RdslPackage.COMPONENT: return createComponent();
      case RdslPackage.INSTALLER: return createInstaller();
      case RdslPackage.EXTENDS: return createExtends();
      case RdslPackage.CHILDREN: return createChildren();
      case RdslPackage.EXPORT: return createExport();
      case RdslPackage.EXPORT_VARIABLE: return createexportVariable();
      case RdslPackage.INITIALISATION: return createInitialisation();
      case RdslPackage.IMPORTS: return createImports();
      case RdslPackage.IMPORT_VARIABLE: return createimportVariable();
      case RdslPackage.FACETS: return createFacets();
      case RdslPackage.FACET: return createFacet();
      case RdslPackage.INSTANCE: return createInstance();
      case RdslPackage.ATTRIBUT: return createAttribut();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Graph createGraph()
  {
    GraphImpl graph = new GraphImpl();
    return graph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImpotUri createImpotUri()
  {
    ImpotUriImpl impotUri = new ImpotUriImpl();
    return impotUri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompFacet createCompFacet()
  {
    CompFacetImpl compFacet = new CompFacetImpl();
    return compFacet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Installer createInstaller()
  {
    InstallerImpl installer = new InstallerImpl();
    return installer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Extends createExtends()
  {
    ExtendsImpl extends_ = new ExtendsImpl();
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Children createChildren()
  {
    ChildrenImpl children = new ChildrenImpl();
    return children;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Export createExport()
  {
    ExportImpl export = new ExportImpl();
    return export;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public exportVariable createexportVariable()
  {
    exportVariableImpl exportVariable = new exportVariableImpl();
    return exportVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Initialisation createInitialisation()
  {
    InitialisationImpl initialisation = new InitialisationImpl();
    return initialisation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Imports createImports()
  {
    ImportsImpl imports = new ImportsImpl();
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public importVariable createimportVariable()
  {
    importVariableImpl importVariable = new importVariableImpl();
    return importVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Facets createFacets()
  {
    FacetsImpl facets = new FacetsImpl();
    return facets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Facet createFacet()
  {
    FacetImpl facet = new FacetImpl();
    return facet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instance createInstance()
  {
    InstanceImpl instance = new InstanceImpl();
    return instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribut createAttribut()
  {
    AttributImpl attribut = new AttributImpl();
    return attribut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RdslPackage getRdslPackage()
  {
    return (RdslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RdslPackage getPackage()
  {
    return RdslPackage.eINSTANCE;
  }

} //RdslFactoryImpl
