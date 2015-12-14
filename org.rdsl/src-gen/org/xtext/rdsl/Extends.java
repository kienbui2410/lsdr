/**
 */
package org.xtext.rdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extends</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.Extends#getSupComponent <em>Sup Component</em>}</li>
 * </ul>
 *
 * @see org.xtext.rdsl.RdslPackage#getExtends()
 * @model
 * @generated
 */
public interface Extends extends Property
{
  /**
   * Returns the value of the '<em><b>Sup Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sup Component</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sup Component</em>' reference.
   * @see #setSupComponent(Component)
   * @see org.xtext.rdsl.RdslPackage#getExtends_SupComponent()
   * @model
   * @generated
   */
  Component getSupComponent();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Extends#getSupComponent <em>Sup Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sup Component</em>' reference.
   * @see #getSupComponent()
   * @generated
   */
  void setSupComponent(Component value);

} // Extends
