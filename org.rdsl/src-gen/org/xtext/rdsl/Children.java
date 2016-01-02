/**
 */
package org.xtext.rdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Children</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.Children#getChildren <em>Children</em>}</li>
 *   <li>{@link org.xtext.rdsl.Children#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see org.xtext.rdsl.RdslPackage#getChildren()
 * @model
 * @generated
 */
public interface Children extends EObject
{
  /**
   * Returns the value of the '<em><b>Children</b></em>' reference list.
   * The list contents are of type {@link org.xtext.rdsl.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' reference list.
   * @see org.xtext.rdsl.RdslPackage#getChildren_Children()
   * @model
   * @generated
   */
  EList<Component> getChildren();

  /**
   * Returns the value of the '<em><b>Child</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Child</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Child</em>' reference.
   * @see #setChild(Component)
   * @see org.xtext.rdsl.RdslPackage#getChildren_Child()
   * @model
   * @generated
   */
  Component getChild();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Children#getChild <em>Child</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Child</em>' reference.
   * @see #getChild()
   * @generated
   */
  void setChild(Component value);

} // Children
