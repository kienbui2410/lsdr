/**
 */
package org.xtext.rdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.Facet#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rdsl.Facet#getExportFacet <em>Export Facet</em>}</li>
 *   <li>{@link org.xtext.rdsl.Facet#getChildrenFacet <em>Children Facet</em>}</li>
 *   <li>{@link org.xtext.rdsl.Facet#getSupFacets <em>Sup Facets</em>}</li>
 *   <li>{@link org.xtext.rdsl.Facet#getSupFacet <em>Sup Facet</em>}</li>
 * </ul>
 *
 * @see org.xtext.rdsl.RdslPackage#getFacet()
 * @model
 * @generated
 */
public interface Facet extends Property
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.rdsl.RdslPackage#getFacet_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Facet#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Export Facet</b></em>' reference list.
   * The list contents are of type {@link org.xtext.rdsl.Export}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Export Facet</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Export Facet</em>' reference list.
   * @see org.xtext.rdsl.RdslPackage#getFacet_ExportFacet()
   * @model
   * @generated
   */
  EList<Export> getExportFacet();

  /**
   * Returns the value of the '<em><b>Children Facet</b></em>' reference list.
   * The list contents are of type {@link org.xtext.rdsl.Children}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children Facet</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children Facet</em>' reference list.
   * @see org.xtext.rdsl.RdslPackage#getFacet_ChildrenFacet()
   * @model
   * @generated
   */
  EList<Children> getChildrenFacet();

  /**
   * Returns the value of the '<em><b>Sup Facets</b></em>' reference list.
   * The list contents are of type {@link org.xtext.rdsl.Facet}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sup Facets</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sup Facets</em>' reference list.
   * @see org.xtext.rdsl.RdslPackage#getFacet_SupFacets()
   * @model
   * @generated
   */
  EList<Facet> getSupFacets();

  /**
   * Returns the value of the '<em><b>Sup Facet</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sup Facet</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sup Facet</em>' reference.
   * @see #setSupFacet(Facet)
   * @see org.xtext.rdsl.RdslPackage#getFacet_SupFacet()
   * @model
   * @generated
   */
  Facet getSupFacet();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Facet#getSupFacet <em>Sup Facet</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sup Facet</em>' reference.
   * @see #getSupFacet()
   * @generated
   */
  void setSupFacet(Facet value);

} // Facet
