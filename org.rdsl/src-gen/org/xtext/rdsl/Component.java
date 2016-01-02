/**
 */
package org.xtext.rdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.Component#getInstallers <em>Installers</em>}</li>
 *   <li>{@link org.xtext.rdsl.Component#getChildrens <em>Childrens</em>}</li>
 *   <li>{@link org.xtext.rdsl.Component#getExports <em>Exports</em>}</li>
 *   <li>{@link org.xtext.rdsl.Component#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.rdsl.Component#getFacets <em>Facets</em>}</li>
 *   <li>{@link org.xtext.rdsl.Component#getExtends <em>Extends</em>}</li>
 * </ul>
 *
 * @see org.xtext.rdsl.RdslPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends CompFacet
{
  /**
   * Returns the value of the '<em><b>Installers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Installers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Installers</em>' containment reference.
   * @see #setInstallers(Installer)
   * @see org.xtext.rdsl.RdslPackage#getComponent_Installers()
   * @model containment="true"
   * @generated
   */
  Installer getInstallers();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Component#getInstallers <em>Installers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Installers</em>' containment reference.
   * @see #getInstallers()
   * @generated
   */
  void setInstallers(Installer value);

  /**
   * Returns the value of the '<em><b>Childrens</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rdsl.Children}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Childrens</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Childrens</em>' containment reference list.
   * @see org.xtext.rdsl.RdslPackage#getComponent_Childrens()
   * @model containment="true"
   * @generated
   */
  EList<Children> getChildrens();

  /**
   * Returns the value of the '<em><b>Exports</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rdsl.Export}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exports</em>' containment reference list.
   * @see org.xtext.rdsl.RdslPackage#getComponent_Exports()
   * @model containment="true"
   * @generated
   */
  EList<Export> getExports();

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rdsl.Imports}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.xtext.rdsl.RdslPackage#getComponent_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Imports> getImports();

  /**
   * Returns the value of the '<em><b>Facets</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rdsl.Facets}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Facets</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Facets</em>' containment reference list.
   * @see org.xtext.rdsl.RdslPackage#getComponent_Facets()
   * @model containment="true"
   * @generated
   */
  EList<Facets> getFacets();

  /**
   * Returns the value of the '<em><b>Extends</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rdsl.Extends}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends</em>' containment reference list.
   * @see org.xtext.rdsl.RdslPackage#getComponent_Extends()
   * @model containment="true"
   * @generated
   */
  EList<Extends> getExtends();

} // Component
