/**
 */
package org.xtext.rdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.Instance#getComponent <em>Component</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getInstances <em>Instances</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getFullname <em>Fullname</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getVal <em>Val</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getValnum <em>Valnum</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getValmin <em>Valmin</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getValmax <em>Valmax</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getIp4 <em>Ip4</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getIp4last <em>Ip4last</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getIp6 <em>Ip6</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getIp6last <em>Ip6last</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getTheLoad <em>The Load</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getTheState <em>The State</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getHostname <em>Hostname</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getIptable <em>Iptable</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.xtext.rdsl.RdslPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends EObject
{
  /**
   * Returns the value of the '<em><b>Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' reference.
   * @see #setComponent(Component)
   * @see org.xtext.rdsl.RdslPackage#getInstance_Component()
   * @model
   * @generated
   */
  Component getComponent();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Instance#getComponent <em>Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' reference.
   * @see #getComponent()
   * @generated
   */
  void setComponent(Component value);

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
   * @see org.xtext.rdsl.RdslPackage#getInstance_Instances()
   * @model containment="true"
   * @generated
   */
  EList<Instance> getInstances();

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
   * @see org.xtext.rdsl.RdslPackage#getInstance_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Instance#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Fullname</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fullname</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fullname</em>' attribute list.
   * @see org.xtext.rdsl.RdslPackage#getInstance_Fullname()
   * @model unique="false"
   * @generated
   */
  EList<String> getFullname();

  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute.
   * @see #setVal(int)
   * @see org.xtext.rdsl.RdslPackage#getInstance_Val()
   * @model
   * @generated
   */
  int getVal();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Instance#getVal <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' attribute.
   * @see #getVal()
   * @generated
   */
  void setVal(int value);

  /**
   * Returns the value of the '<em><b>Valnum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valnum</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valnum</em>' attribute.
   * @see #setValnum(int)
   * @see org.xtext.rdsl.RdslPackage#getInstance_Valnum()
   * @model
   * @generated
   */
  int getValnum();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Instance#getValnum <em>Valnum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valnum</em>' attribute.
   * @see #getValnum()
   * @generated
   */
  void setValnum(int value);

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
   * @see org.xtext.rdsl.RdslPackage#getInstance_Valmin()
   * @model
   * @generated
   */
  int getValmin();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Instance#getValmin <em>Valmin</em>}' attribute.
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
   * @see org.xtext.rdsl.RdslPackage#getInstance_Valmax()
   * @model
   * @generated
   */
  int getValmax();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Instance#getValmax <em>Valmax</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valmax</em>' attribute.
   * @see #getValmax()
   * @generated
   */
  void setValmax(int value);

  /**
   * Returns the value of the '<em><b>Ip Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ip Address</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ip Address</em>' attribute.
   * @see #setIpAddress(String)
   * @see org.xtext.rdsl.RdslPackage#getInstance_IpAddress()
   * @model
   * @generated
   */
  String getIpAddress();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Instance#getIpAddress <em>Ip Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ip Address</em>' attribute.
   * @see #getIpAddress()
   * @generated
   */
  void setIpAddress(String value);

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
   * @see org.xtext.rdsl.RdslPackage#getInstance_Ip4()
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
   * @see org.xtext.rdsl.RdslPackage#getInstance_Ip4last()
   * @model
   * @generated
   */
  int getIp4last();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Instance#getIp4last <em>Ip4last</em>}' attribute.
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
   * @see org.xtext.rdsl.RdslPackage#getInstance_Ip6()
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
   * @see org.xtext.rdsl.RdslPackage#getInstance_Ip6last()
   * @model
   * @generated
   */
  int getIp6last();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Instance#getIp6last <em>Ip6last</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ip6last</em>' attribute.
   * @see #getIp6last()
   * @generated
   */
  void setIp6last(int value);

  /**
   * Returns the value of the '<em><b>The Load</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>The Load</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>The Load</em>' attribute.
   * @see #setTheLoad(int)
   * @see org.xtext.rdsl.RdslPackage#getInstance_TheLoad()
   * @model
   * @generated
   */
  int getTheLoad();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Instance#getTheLoad <em>The Load</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>The Load</em>' attribute.
   * @see #getTheLoad()
   * @generated
   */
  void setTheLoad(int value);

  /**
   * Returns the value of the '<em><b>The State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>The State</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>The State</em>' attribute.
   * @see #setTheState(String)
   * @see org.xtext.rdsl.RdslPackage#getInstance_TheState()
   * @model
   * @generated
   */
  String getTheState();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Instance#getTheState <em>The State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>The State</em>' attribute.
   * @see #getTheState()
   * @generated
   */
  void setTheState(String value);

  /**
   * Returns the value of the '<em><b>Hostname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hostname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hostname</em>' attribute.
   * @see #setHostname(String)
   * @see org.xtext.rdsl.RdslPackage#getInstance_Hostname()
   * @model
   * @generated
   */
  String getHostname();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Instance#getHostname <em>Hostname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hostname</em>' attribute.
   * @see #getHostname()
   * @generated
   */
  void setHostname(String value);

  /**
   * Returns the value of the '<em><b>Iptable</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rdsl.IpTable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iptable</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iptable</em>' containment reference list.
   * @see org.xtext.rdsl.RdslPackage#getInstance_Iptable()
   * @model containment="true"
   * @generated
   */
  EList<IpTable> getIptable();

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rdsl.Attribut}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.xtext.rdsl.RdslPackage#getInstance_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribut> getAttributes();

} // Instance
