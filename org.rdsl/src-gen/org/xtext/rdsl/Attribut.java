/**
 */
package org.xtext.rdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.Attribut#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rdsl.Attribut#getValeur <em>Valeur</em>}</li>
 * </ul>
 *
 * @see org.xtext.rdsl.RdslPackage#getAttribut()
 * @model
 * @generated
 */
public interface Attribut extends EObject
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
   * @see org.xtext.rdsl.RdslPackage#getAttribut_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Attribut#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Valeur</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valeur</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valeur</em>' attribute.
   * @see #setValeur(String)
   * @see org.xtext.rdsl.RdslPackage#getAttribut_Valeur()
   * @model
   * @generated
   */
  String getValeur();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Attribut#getValeur <em>Valeur</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valeur</em>' attribute.
   * @see #getValeur()
   * @generated
   */
  void setValeur(String value);

} // Attribut
