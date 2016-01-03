/**
 */
package org.xtext.rdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ip Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.IpTable#getTraffic <em>Traffic</em>}</li>
 *   <li>{@link org.xtext.rdsl.IpTable#getSource <em>Source</em>}</li>
 *   <li>{@link org.xtext.rdsl.IpTable#getSourcefinal <em>Sourcefinal</em>}</li>
 *   <li>{@link org.xtext.rdsl.IpTable#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.xtext.rdsl.IpTable#getDestinationfinal <em>Destinationfinal</em>}</li>
 *   <li>{@link org.xtext.rdsl.IpTable#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.xtext.rdsl.IpTable#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.xtext.rdsl.RdslPackage#getIpTable()
 * @model
 * @generated
 */
public interface IpTable extends EObject
{
  /**
   * Returns the value of the '<em><b>Traffic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Traffic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Traffic</em>' attribute.
   * @see #setTraffic(String)
   * @see org.xtext.rdsl.RdslPackage#getIpTable_Traffic()
   * @model
   * @generated
   */
  String getTraffic();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.IpTable#getTraffic <em>Traffic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Traffic</em>' attribute.
   * @see #getTraffic()
   * @generated
   */
  void setTraffic(String value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' attribute list.
   * @see org.xtext.rdsl.RdslPackage#getIpTable_Source()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getSource();

  /**
   * Returns the value of the '<em><b>Sourcefinal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sourcefinal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sourcefinal</em>' attribute.
   * @see #setSourcefinal(int)
   * @see org.xtext.rdsl.RdslPackage#getIpTable_Sourcefinal()
   * @model
   * @generated
   */
  int getSourcefinal();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.IpTable#getSourcefinal <em>Sourcefinal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sourcefinal</em>' attribute.
   * @see #getSourcefinal()
   * @generated
   */
  void setSourcefinal(int value);

  /**
   * Returns the value of the '<em><b>Destination</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination</em>' attribute list.
   * @see org.xtext.rdsl.RdslPackage#getIpTable_Destination()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getDestination();

  /**
   * Returns the value of the '<em><b>Destinationfinal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destinationfinal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destinationfinal</em>' attribute.
   * @see #setDestinationfinal(int)
   * @see org.xtext.rdsl.RdslPackage#getIpTable_Destinationfinal()
   * @model
   * @generated
   */
  int getDestinationfinal();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.IpTable#getDestinationfinal <em>Destinationfinal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destinationfinal</em>' attribute.
   * @see #getDestinationfinal()
   * @generated
   */
  void setDestinationfinal(int value);

  /**
   * Returns the value of the '<em><b>Protocol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protocol</em>' attribute.
   * @see #setProtocol(String)
   * @see org.xtext.rdsl.RdslPackage#getIpTable_Protocol()
   * @model
   * @generated
   */
  String getProtocol();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.IpTable#getProtocol <em>Protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Protocol</em>' attribute.
   * @see #getProtocol()
   * @generated
   */
  void setProtocol(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(String)
   * @see org.xtext.rdsl.RdslPackage#getIpTable_Target()
   * @model
   * @generated
   */
  String getTarget();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.IpTable#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
  void setTarget(String value);

} // IpTable
