/**
 */
package org.xtext.rdsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.rdsl.IpAdress;
import org.xtext.rdsl.RdslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ip Adress</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.impl.IpAdressImpl#getIp4 <em>Ip4</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.IpAdressImpl#getIp4last <em>Ip4last</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.IpAdressImpl#getIp6 <em>Ip6</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.IpAdressImpl#getIp6last <em>Ip6last</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IpAdressImpl extends MinimalEObjectImpl.Container implements IpAdress
{
  /**
   * The cached value of the '{@link #getIp4() <em>Ip4</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIp4()
   * @generated
   * @ordered
   */
  protected EList<Integer> ip4;

  /**
   * The default value of the '{@link #getIp4last() <em>Ip4last</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIp4last()
   * @generated
   * @ordered
   */
  protected static final int IP4LAST_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIp4last() <em>Ip4last</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIp4last()
   * @generated
   * @ordered
   */
  protected int ip4last = IP4LAST_EDEFAULT;

  /**
   * The cached value of the '{@link #getIp6() <em>Ip6</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIp6()
   * @generated
   * @ordered
   */
  protected EList<Integer> ip6;

  /**
   * The default value of the '{@link #getIp6last() <em>Ip6last</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIp6last()
   * @generated
   * @ordered
   */
  protected static final int IP6LAST_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIp6last() <em>Ip6last</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIp6last()
   * @generated
   * @ordered
   */
  protected int ip6last = IP6LAST_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IpAdressImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RdslPackage.Literals.IP_ADRESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getIp4()
  {
    if (ip4 == null)
    {
      ip4 = new EDataTypeEList<Integer>(Integer.class, this, RdslPackage.IP_ADRESS__IP4);
    }
    return ip4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIp4last()
  {
    return ip4last;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIp4last(int newIp4last)
  {
    int oldIp4last = ip4last;
    ip4last = newIp4last;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.IP_ADRESS__IP4LAST, oldIp4last, ip4last));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getIp6()
  {
    if (ip6 == null)
    {
      ip6 = new EDataTypeEList<Integer>(Integer.class, this, RdslPackage.IP_ADRESS__IP6);
    }
    return ip6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIp6last()
  {
    return ip6last;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIp6last(int newIp6last)
  {
    int oldIp6last = ip6last;
    ip6last = newIp6last;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.IP_ADRESS__IP6LAST, oldIp6last, ip6last));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RdslPackage.IP_ADRESS__IP4:
        return getIp4();
      case RdslPackage.IP_ADRESS__IP4LAST:
        return getIp4last();
      case RdslPackage.IP_ADRESS__IP6:
        return getIp6();
      case RdslPackage.IP_ADRESS__IP6LAST:
        return getIp6last();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RdslPackage.IP_ADRESS__IP4:
        getIp4().clear();
        getIp4().addAll((Collection<? extends Integer>)newValue);
        return;
      case RdslPackage.IP_ADRESS__IP4LAST:
        setIp4last((Integer)newValue);
        return;
      case RdslPackage.IP_ADRESS__IP6:
        getIp6().clear();
        getIp6().addAll((Collection<? extends Integer>)newValue);
        return;
      case RdslPackage.IP_ADRESS__IP6LAST:
        setIp6last((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RdslPackage.IP_ADRESS__IP4:
        getIp4().clear();
        return;
      case RdslPackage.IP_ADRESS__IP4LAST:
        setIp4last(IP4LAST_EDEFAULT);
        return;
      case RdslPackage.IP_ADRESS__IP6:
        getIp6().clear();
        return;
      case RdslPackage.IP_ADRESS__IP6LAST:
        setIp6last(IP6LAST_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RdslPackage.IP_ADRESS__IP4:
        return ip4 != null && !ip4.isEmpty();
      case RdslPackage.IP_ADRESS__IP4LAST:
        return ip4last != IP4LAST_EDEFAULT;
      case RdslPackage.IP_ADRESS__IP6:
        return ip6 != null && !ip6.isEmpty();
      case RdslPackage.IP_ADRESS__IP6LAST:
        return ip6last != IP6LAST_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (ip4: ");
    result.append(ip4);
    result.append(", ip4last: ");
    result.append(ip4last);
    result.append(", ip6: ");
    result.append(ip6);
    result.append(", ip6last: ");
    result.append(ip6last);
    result.append(')');
    return result.toString();
  }

} //IpAdressImpl
