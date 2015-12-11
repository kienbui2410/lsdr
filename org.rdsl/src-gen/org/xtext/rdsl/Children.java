/**
 */
package org.xtext.rdsl;

import org.eclipse.emf.common.util.EList;

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
public interface Children extends Property
{
  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rdsl.Child}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.xtext.rdsl.RdslPackage#getChildren_Children()
   * @model containment="true"
   * @generated
   */
  EList<Child> getChildren();

  /**
   * Returns the value of the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Child</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Child</em>' containment reference.
   * @see #setChild(Child)
   * @see org.xtext.rdsl.RdslPackage#getChildren_Child()
   * @model containment="true"
   * @generated
   */
  Child getChild();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Children#getChild <em>Child</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Child</em>' containment reference.
   * @see #getChild()
   * @generated
   */
  void setChild(Child value);

} // Children
