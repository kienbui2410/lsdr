/**
 */
package org.xtext.rdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.Graph#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.rdsl.Graph#getFacetGraphs <em>Facet Graphs</em>}</li>
 *   <li>{@link org.xtext.rdsl.Graph#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see org.xtext.rdsl.RdslPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rdsl.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.xtext.rdsl.RdslPackage#getGraph_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Facet Graphs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rdsl.Facet}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Facet Graphs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Facet Graphs</em>' containment reference list.
   * @see org.xtext.rdsl.RdslPackage#getGraph_FacetGraphs()
   * @model containment="true"
   * @generated
   */
  EList<Facet> getFacetGraphs();

  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rdsl.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see org.xtext.rdsl.RdslPackage#getGraph_Components()
   * @model containment="true"
   * @generated
   */
  EList<Component> getComponents();

} // Graph
