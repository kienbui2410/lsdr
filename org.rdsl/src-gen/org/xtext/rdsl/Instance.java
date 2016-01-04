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
 *   <li>{@link org.xtext.rdsl.Instance#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getFullname <em>Fullname</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getCount <em>Count</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getVal <em>Val</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getValmin <em>Valmin</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getValmax <em>Valmax</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getIpadress <em>Ipadress</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getTheLoad <em>The Load</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getTheState <em>The State</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getHostname <em>Hostname</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getTcp <em>Tcp</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getUdp <em>Udp</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getIptable <em>Iptable</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.xtext.rdsl.Instance#getInstances <em>Instances</em>}</li>
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
   * Returns the value of the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Count</em>' attribute.
   * @see #setCount(String)
   * @see org.xtext.rdsl.RdslPackage#getInstance_Count()
   * @model
   * @generated
   */
  String getCount();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Instance#getCount <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Count</em>' attribute.
   * @see #getCount()
   * @generated
   */
  void setCount(String value);

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
   * Returns the value of the '<em><b>Ipadress</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ipadress</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ipadress</em>' containment reference.
   * @see #setIpadress(IpAdress)
   * @see org.xtext.rdsl.RdslPackage#getInstance_Ipadress()
   * @model containment="true"
   * @generated
   */
  IpAdress getIpadress();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Instance#getIpadress <em>Ipadress</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ipadress</em>' containment reference.
   * @see #getIpadress()
   * @generated
   */
  void setIpadress(IpAdress value);

  /**
   * Returns the value of the '<em><b>The Load</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>The Load</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>The Load</em>' containment reference.
   * @see #setTheLoad(Load)
   * @see org.xtext.rdsl.RdslPackage#getInstance_TheLoad()
   * @model containment="true"
   * @generated
   */
  Load getTheLoad();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Instance#getTheLoad <em>The Load</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>The Load</em>' containment reference.
   * @see #getTheLoad()
   * @generated
   */
  void setTheLoad(Load value);

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
   * Returns the value of the '<em><b>Tcp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tcp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tcp</em>' attribute.
   * @see #setTcp(int)
   * @see org.xtext.rdsl.RdslPackage#getInstance_Tcp()
   * @model
   * @generated
   */
  int getTcp();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Instance#getTcp <em>Tcp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tcp</em>' attribute.
   * @see #getTcp()
   * @generated
   */
  void setTcp(int value);

  /**
   * Returns the value of the '<em><b>Udp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Udp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Udp</em>' attribute.
   * @see #setUdp(int)
   * @see org.xtext.rdsl.RdslPackage#getInstance_Udp()
   * @model
   * @generated
   */
  int getUdp();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Instance#getUdp <em>Udp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Udp</em>' attribute.
   * @see #getUdp()
   * @generated
   */
  void setUdp(int value);

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

} // Instance
