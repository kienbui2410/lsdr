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
public interface Facet extends CompFacet
{
  /**
   * Returns the value of the '<em><b>Export Facet</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rdsl.Export}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Export Facet</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Export Facet</em>' containment reference list.
   * @see org.xtext.rdsl.RdslPackage#getFacet_ExportFacet()
   * @model containment="true"
   * @generated
   */
  EList<Export> getExportFacet();

  /**
   * Returns the value of the '<em><b>Children Facet</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children Facet</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children Facet</em>' containment reference.
   * @see #setChildrenFacet(Children)
   * @see org.xtext.rdsl.RdslPackage#getFacet_ChildrenFacet()
   * @model containment="true"
   * @generated
   */
  Children getChildrenFacet();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Facet#getChildrenFacet <em>Children Facet</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Children Facet</em>' containment reference.
   * @see #getChildrenFacet()
   * @generated
   */
  void setChildrenFacet(Children value);

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
