/**
 */
package org.xtext.rdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.Model#getGraphs <em>Graphs</em>}</li>
 *   <li>{@link org.xtext.rdsl.Model#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @see org.xtext.rdsl.RdslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Graphs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Graphs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Graphs</em>' containment reference.
   * @see #setGraphs(Graph)
   * @see org.xtext.rdsl.RdslPackage#getModel_Graphs()
   * @model containment="true"
   * @generated
   */
  Graph getGraphs();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Model#getGraphs <em>Graphs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Graphs</em>' containment reference.
   * @see #getGraphs()
   * @generated
   */
  void setGraphs(Graph value);

  /**
   * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rdsl.Instance}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instances</em>' containment reference list.
   * @see org.xtext.rdsl.RdslPackage#getModel_Instances()
   * @model containment="true"
   * @generated
   */
  EList<Instance> getInstances();

} // Model
