/**
 */
package org.xtext.rdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ip Adress</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.IpAdress#getIp4 <em>Ip4</em>}</li>
 *   <li>{@link org.xtext.rdsl.IpAdress#getIp4last <em>Ip4last</em>}</li>
 *   <li>{@link org.xtext.rdsl.IpAdress#getIp6 <em>Ip6</em>}</li>
 *   <li>{@link org.xtext.rdsl.IpAdress#getIp6last <em>Ip6last</em>}</li>
 * </ul>
 *
 * @see org.xtext.rdsl.RdslPackage#getIpAdress()
 * @model
 * @generated
 */
public interface IpAdress extends EObject
{
  /**
   * Returns the value of the '<em><b>Ip4</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ip4</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ip4</em>' attribute list.
   * @see org.xtext.rdsl.RdslPackage#getIpAdress_Ip4()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getIp4();

  /**
   * Returns the value of the '<em><b>Ip4last</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ip4last</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ip4last</em>' attribute.
   * @see #setIp4last(int)
   * @see org.xtext.rdsl.RdslPackage#getIpAdress_Ip4last()
   * @model
   * @generated
   */
  int getIp4last();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.IpAdress#getIp4last <em>Ip4last</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ip4last</em>' attribute.
   * @see #getIp4last()
   * @generated
   */
  void setIp4last(int value);

  /**
   * Returns the value of the '<em><b>Ip6</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ip6</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ip6</em>' attribute list.
   * @see org.xtext.rdsl.RdslPackage#getIpAdress_Ip6()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getIp6();

  /**
   * Returns the value of the '<em><b>Ip6last</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ip6last</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ip6last</em>' attribute.
   * @see #setIp6last(int)
   * @see org.xtext.rdsl.RdslPackage#getIpAdress_Ip6last()
   * @model
   * @generated
   */
  int getIp6last();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.IpAdress#getIp6last <em>Ip6last</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ip6last</em>' attribute.
   * @see #getIp6last()
   * @generated
   */
  void setIp6last(int value);

} // IpAdress
