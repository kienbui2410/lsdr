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
 *   <li>{@link org.xtext.rdsl.Model#getValmin <em>Valmin</em>}</li>
 *   <li>{@link org.xtext.rdsl.Model#getValmax <em>Valmax</em>}</li>
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

  /**
   * Returns the value of the '<em><b>Valmin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valmin</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valmin</em>' attribute.
   * @see #setValmin(int)
   * @see org.xtext.rdsl.RdslPackage#getModel_Valmin()
   * @model
   * @generated
   */
  int getValmin();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Model#getValmin <em>Valmin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valmin</em>' attribute.
   * @see #getValmin()
   * @generated
   */
  void setValmin(int value);

  /**
   * Returns the value of the '<em><b>Valmax</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valmax</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valmax</em>' attribute.
   * @see #setValmax(int)
   * @see org.xtext.rdsl.RdslPackage#getModel_Valmax()
   * @model
   * @generated
   */
  int getValmax();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Model#getValmax <em>Valmax</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valmax</em>' attribute.
   * @see #getValmax()
   * @generated
   */
  void setValmax(int value);

} // Model
