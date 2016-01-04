/**
 */
package org.xtext.rdsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.rdsl.RdslPackage
 * @generated
 */
public interface RdslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RdslFactory eINSTANCE = org.xtext.rdsl.impl.RdslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Graph</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Graph</em>'.
   * @generated
   */
  Graph createGraph();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>URL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>URL</em>'.
   * @generated
   */
  URL createURL();

  /**
   * Returns a new object of class '<em>Impot Uri</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Impot Uri</em>'.
   * @generated
   */
  ImpotUri createImpotUri();

  /**
   * Returns a new object of class '<em>Comp Facet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comp Facet</em>'.
   * @generated
   */
  CompFacet createCompFacet();

  /**
   * Returns a new object of class '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component</em>'.
   * @generated
   */
  Component createComponent();

  /**
   * Returns a new object of class '<em>Installer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Installer</em>'.
   * @generated
   */
  Installer createInstaller();

  /**
   * Returns a new object of class '<em>Extends</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extends</em>'.
   * @generated
   */
  Extends createExtends();

  /**
   * Returns a new object of class '<em>Children</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Children</em>'.
   * @generated
   */
  Children createChildren();

  /**
   * Returns a new object of class '<em>Export</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Export</em>'.
   * @generated
   */
  Export createExport();

  /**
   * Returns a new object of class '<em>export Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>export Variable</em>'.
   * @generated
   */
  exportVariable createexportVariable();

  /**
   * Returns a new object of class '<em>Initialisation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Initialisation</em>'.
   * @generated
   */
  Initialisation createInitialisation();

  /**
   * Returns a new object of class '<em>Imports</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Imports</em>'.
   * @generated
   */
  Imports createImports();

  /**
   * Returns a new object of class '<em>import Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>import Variable</em>'.
   * @generated
   */
  importVariable createimportVariable();

  /**
   * Returns a new object of class '<em>Facets</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Facets</em>'.
   * @generated
   */
  Facets createFacets();

  /**
   * Returns a new object of class '<em>Facet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Facet</em>'.
   * @generated
   */
  Facet createFacet();

  /**
   * Returns a new object of class '<em>Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance</em>'.
   * @generated
   */
  Instance createInstance();

  /**
   * Returns a new object of class '<em>Load</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Load</em>'.
   * @generated
   */
  Load createLoad();

  /**
   * Returns a new object of class '<em>Ip Adress</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ip Adress</em>'.
   * @generated
   */
  IpAdress createIpAdress();

  /**
   * Returns a new object of class '<em>Ip Table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ip Table</em>'.
   * @generated
   */
  IpTable createIpTable();

  /**
   * Returns a new object of class '<em>Attribut</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribut</em>'.
   * @generated
   */
  Attribut createAttribut();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RdslPackage getRdslPackage();

} //RdslFactory
