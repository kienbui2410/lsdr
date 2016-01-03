/**
 */
package org.xtext.rdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.Facets#getFacets <em>Facets</em>}</li>
 *   <li>{@link org.xtext.rdsl.Facets#getFacet <em>Facet</em>}</li>
 * </ul>
 *
 * @see org.xtext.rdsl.RdslPackage#getFacets()
 * @model
 * @generated
 */
public interface Facets extends EObject
{
  /**
   * Returns the value of the '<em><b>Facets</b></em>' reference list.
   * The list contents are of type {@link org.xtext.rdsl.Facet}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Facets</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Facets</em>' reference list.
   * @see org.xtext.rdsl.RdslPackage#getFacets_Facets()
   * @model
   * @generated
   */
  EList<Facet> getFacets();

  /**
   * Returns the value of the '<em><b>Facet</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Facet</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Facet</em>' reference.
   * @see #setFacet(Facet)
   * @see org.xtext.rdsl.RdslPackage#getFacets_Facet()
   * @model
   * @generated
   */
  Facet getFacet();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Facets#getFacet <em>Facet</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Facet</em>' reference.
   * @see #getFacet()
   * @generated
   */
  void setFacet(Facet value);

} // Facets
