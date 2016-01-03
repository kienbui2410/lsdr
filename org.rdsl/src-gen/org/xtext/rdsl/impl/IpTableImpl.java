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

import org.xtext.rdsl.IpTable;
import org.xtext.rdsl.RdslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ip Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.impl.IpTableImpl#getTraffic <em>Traffic</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.IpTableImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.IpTableImpl#getSourcefinal <em>Sourcefinal</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.IpTableImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.IpTableImpl#getDestinationfinal <em>Destinationfinal</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.IpTableImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.IpTableImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IpTableImpl extends MinimalEObjectImpl.Container implements IpTable
{
  /**
   * The default value of the '{@link #getTraffic() <em>Traffic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTraffic()
   * @generated
   * @ordered
   */
  protected static final String TRAFFIC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTraffic() <em>Traffic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTraffic()
   * @generated
   * @ordered
   */
  protected String traffic = TRAFFIC_EDEFAULT;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected EList<Integer> source;

  /**
   * The default value of the '{@link #getSourcefinal() <em>Sourcefinal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourcefinal()
   * @generated
   * @ordered
   */
  protected static final int SOURCEFINAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSourcefinal() <em>Sourcefinal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourcefinal()
   * @generated
   * @ordered
   */
  protected int sourcefinal = SOURCEFINAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getDestination() <em>Destination</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected EList<Integer> destination;

  /**
   * The default value of the '{@link #getDestinationfinal() <em>Destinationfinal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestinationfinal()
   * @generated
   * @ordered
   */
  protected static final int DESTINATIONFINAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDestinationfinal() <em>Destinationfinal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestinationfinal()
   * @generated
   * @ordered
   */
  protected int destinationfinal = DESTINATIONFINAL_EDEFAULT;

  /**
   * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtocol()
   * @generated
   * @ordered
   */
  protected static final String PROTOCOL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtocol()
   * @generated
   * @ordered
   */
  protected String protocol = PROTOCOL_EDEFAULT;

  /**
   * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected static final String TARGET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected String target = TARGET_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IpTableImpl()
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
    return RdslPackage.Literals.IP_TABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTraffic()
  {
    return traffic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTraffic(String newTraffic)
  {
    String oldTraffic = traffic;
    traffic = newTraffic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.IP_TABLE__TRAFFIC, oldTraffic, traffic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getSource()
  {
    if (source == null)
    {
      source = new EDataTypeEList<Integer>(Integer.class, this, RdslPackage.IP_TABLE__SOURCE);
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSourcefinal()
  {
    return sourcefinal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourcefinal(int newSourcefinal)
  {
    int oldSourcefinal = sourcefinal;
    sourcefinal = newSourcefinal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.IP_TABLE__SOURCEFINAL, oldSourcefinal, sourcefinal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getDestination()
  {
    if (destination == null)
    {
      destination = new EDataTypeEList<Integer>(Integer.class, this, RdslPackage.IP_TABLE__DESTINATION);
    }
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDestinationfinal()
  {
    return destinationfinal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestinationfinal(int newDestinationfinal)
  {
    int oldDestinationfinal = destinationfinal;
    destinationfinal = newDestinationfinal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.IP_TABLE__DESTINATIONFINAL, oldDestinationfinal, destinationfinal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProtocol()
  {
    return protocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProtocol(String newProtocol)
  {
    String oldProtocol = protocol;
    protocol = newProtocol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.IP_TABLE__PROTOCOL, oldProtocol, protocol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(String newTarget)
  {
    String oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.IP_TABLE__TARGET, oldTarget, target));
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
      case RdslPackage.IP_TABLE__TRAFFIC:
        return getTraffic();
      case RdslPackage.IP_TABLE__SOURCE:
        return getSource();
      case RdslPackage.IP_TABLE__SOURCEFINAL:
        return getSourcefinal();
      case RdslPackage.IP_TABLE__DESTINATION:
        return getDestination();
      case RdslPackage.IP_TABLE__DESTINATIONFINAL:
        return getDestinationfinal();
      case RdslPackage.IP_TABLE__PROTOCOL:
        return getProtocol();
      case RdslPackage.IP_TABLE__TARGET:
        return getTarget();
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
      case RdslPackage.IP_TABLE__TRAFFIC:
        setTraffic((String)newValue);
        return;
      case RdslPackage.IP_TABLE__SOURCE:
        getSource().clear();
        getSource().addAll((Collection<? extends Integer>)newValue);
        return;
      case RdslPackage.IP_TABLE__SOURCEFINAL:
        setSourcefinal((Integer)newValue);
        return;
      case RdslPackage.IP_TABLE__DESTINATION:
        getDestination().clear();
        getDestination().addAll((Collection<? extends Integer>)newValue);
        return;
      case RdslPackage.IP_TABLE__DESTINATIONFINAL:
        setDestinationfinal((Integer)newValue);
        return;
      case RdslPackage.IP_TABLE__PROTOCOL:
        setProtocol((String)newValue);
        return;
      case RdslPackage.IP_TABLE__TARGET:
        setTarget((String)newValue);
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
      case RdslPackage.IP_TABLE__TRAFFIC:
        setTraffic(TRAFFIC_EDEFAULT);
        return;
      case RdslPackage.IP_TABLE__SOURCE:
        getSource().clear();
        return;
      case RdslPackage.IP_TABLE__SOURCEFINAL:
        setSourcefinal(SOURCEFINAL_EDEFAULT);
        return;
      case RdslPackage.IP_TABLE__DESTINATION:
        getDestination().clear();
        return;
      case RdslPackage.IP_TABLE__DESTINATIONFINAL:
        setDestinationfinal(DESTINATIONFINAL_EDEFAULT);
        return;
      case RdslPackage.IP_TABLE__PROTOCOL:
        setProtocol(PROTOCOL_EDEFAULT);
        return;
      case RdslPackage.IP_TABLE__TARGET:
        setTarget(TARGET_EDEFAULT);
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
      case RdslPackage.IP_TABLE__TRAFFIC:
        return TRAFFIC_EDEFAULT == null ? traffic != null : !TRAFFIC_EDEFAULT.equals(traffic);
      case RdslPackage.IP_TABLE__SOURCE:
        return source != null && !source.isEmpty();
      case RdslPackage.IP_TABLE__SOURCEFINAL:
        return sourcefinal != SOURCEFINAL_EDEFAULT;
      case RdslPackage.IP_TABLE__DESTINATION:
        return destination != null && !destination.isEmpty();
      case RdslPackage.IP_TABLE__DESTINATIONFINAL:
        return destinationfinal != DESTINATIONFINAL_EDEFAULT;
      case RdslPackage.IP_TABLE__PROTOCOL:
        return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
      case RdslPackage.IP_TABLE__TARGET:
        return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
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
    result.append(" (traffic: ");
    result.append(traffic);
    result.append(", source: ");
    result.append(source);
    result.append(", sourcefinal: ");
    result.append(sourcefinal);
    result.append(", destination: ");
    result.append(destination);
    result.append(", destinationfinal: ");
    result.append(destinationfinal);
    result.append(", protocol: ");
    result.append(protocol);
    result.append(", target: ");
    result.append(target);
    result.append(')');
    return result.toString();
  }

} //IpTableImpl
