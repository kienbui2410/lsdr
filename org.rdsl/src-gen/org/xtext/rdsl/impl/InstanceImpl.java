/**
 */
package org.xtext.rdsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.rdsl.Attribut;
import org.xtext.rdsl.Component;
import org.xtext.rdsl.Instance;
import org.xtext.rdsl.IpAdress;
import org.xtext.rdsl.IpTable;
import org.xtext.rdsl.Load;
import org.xtext.rdsl.RdslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.impl.InstanceImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.InstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.InstanceImpl#getFullname <em>Fullname</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.InstanceImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.InstanceImpl#getVal <em>Val</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.InstanceImpl#getValmin <em>Valmin</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.InstanceImpl#getValmax <em>Valmax</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.InstanceImpl#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.InstanceImpl#getIpadress <em>Ipadress</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.InstanceImpl#getTheLoad <em>The Load</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.InstanceImpl#getTheState <em>The State</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.InstanceImpl#getHostname <em>Hostname</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.InstanceImpl#getTcp <em>Tcp</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.InstanceImpl#getUdp <em>Udp</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.InstanceImpl#getIptable <em>Iptable</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.InstanceImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.InstanceImpl#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceImpl extends MinimalEObjectImpl.Container implements Instance
{
  /**
   * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected Component component;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFullname() <em>Fullname</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFullname()
   * @generated
   * @ordered
   */
  protected EList<String> fullname;

  /**
   * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCount()
   * @generated
   * @ordered
   */
  protected static final String COUNT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCount()
   * @generated
   * @ordered
   */
  protected String count = COUNT_EDEFAULT;

  /**
   * The default value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected static final int VAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected int val = VAL_EDEFAULT;

  /**
   * The default value of the '{@link #getValmin() <em>Valmin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValmin()
   * @generated
   * @ordered
   */
  protected static final int VALMIN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValmin() <em>Valmin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValmin()
   * @generated
   * @ordered
   */
  protected int valmin = VALMIN_EDEFAULT;

  /**
   * The default value of the '{@link #getValmax() <em>Valmax</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValmax()
   * @generated
   * @ordered
   */
  protected static final int VALMAX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValmax() <em>Valmax</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValmax()
   * @generated
   * @ordered
   */
  protected int valmax = VALMAX_EDEFAULT;

  /**
   * The default value of the '{@link #getIpAddress() <em>Ip Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIpAddress()
   * @generated
   * @ordered
   */
  protected static final String IP_ADDRESS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIpAddress() <em>Ip Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIpAddress()
   * @generated
   * @ordered
   */
  protected String ipAddress = IP_ADDRESS_EDEFAULT;

  /**
   * The cached value of the '{@link #getIpadress() <em>Ipadress</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIpadress()
   * @generated
   * @ordered
   */
  protected IpAdress ipadress;

  /**
   * The cached value of the '{@link #getTheLoad() <em>The Load</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTheLoad()
   * @generated
   * @ordered
   */
  protected Load theLoad;

  /**
   * The default value of the '{@link #getTheState() <em>The State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTheState()
   * @generated
   * @ordered
   */
  protected static final String THE_STATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTheState() <em>The State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTheState()
   * @generated
   * @ordered
   */
  protected String theState = THE_STATE_EDEFAULT;

  /**
   * The default value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHostname()
   * @generated
   * @ordered
   */
  protected static final String HOSTNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHostname()
   * @generated
   * @ordered
   */
  protected String hostname = HOSTNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTcp() <em>Tcp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTcp()
   * @generated
   * @ordered
   */
  protected static final int TCP_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTcp() <em>Tcp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTcp()
   * @generated
   * @ordered
   */
  protected int tcp = TCP_EDEFAULT;

  /**
   * The default value of the '{@link #getUdp() <em>Udp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUdp()
   * @generated
   * @ordered
   */
  protected static final int UDP_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getUdp() <em>Udp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUdp()
   * @generated
   * @ordered
   */
  protected int udp = UDP_EDEFAULT;

  /**
   * The cached value of the '{@link #getIptable() <em>Iptable</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIptable()
   * @generated
   * @ordered
   */
  protected EList<IpTable> iptable;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribut> attributes;

  /**
   * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstances()
   * @generated
   * @ordered
   */
  protected EList<Instance> instances;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstanceImpl()
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
    return RdslPackage.Literals.INSTANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component getComponent()
  {
    if (component != null && component.eIsProxy())
    {
      InternalEObject oldComponent = (InternalEObject)component;
      component = (Component)eResolveProxy(oldComponent);
      if (component != oldComponent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdslPackage.INSTANCE__COMPONENT, oldComponent, component));
      }
    }
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component basicGetComponent()
  {
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponent(Component newComponent)
  {
    Component oldComponent = component;
    component = newComponent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.INSTANCE__COMPONENT, oldComponent, component));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.INSTANCE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getFullname()
  {
    if (fullname == null)
    {
      fullname = new EDataTypeEList<String>(String.class, this, RdslPackage.INSTANCE__FULLNAME);
    }
    return fullname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCount()
  {
    return count;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCount(String newCount)
  {
    String oldCount = count;
    count = newCount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.INSTANCE__COUNT, oldCount, count));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal(int newVal)
  {
    int oldVal = val;
    val = newVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.INSTANCE__VAL, oldVal, val));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValmin()
  {
    return valmin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValmin(int newValmin)
  {
    int oldValmin = valmin;
    valmin = newValmin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.INSTANCE__VALMIN, oldValmin, valmin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValmax()
  {
    return valmax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValmax(int newValmax)
  {
    int oldValmax = valmax;
    valmax = newValmax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.INSTANCE__VALMAX, oldValmax, valmax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIpAddress()
  {
    return ipAddress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIpAddress(String newIpAddress)
  {
    String oldIpAddress = ipAddress;
    ipAddress = newIpAddress;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.INSTANCE__IP_ADDRESS, oldIpAddress, ipAddress));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IpAdress getIpadress()
  {
    return ipadress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIpadress(IpAdress newIpadress, NotificationChain msgs)
  {
    IpAdress oldIpadress = ipadress;
    ipadress = newIpadress;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdslPackage.INSTANCE__IPADRESS, oldIpadress, newIpadress);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIpadress(IpAdress newIpadress)
  {
    if (newIpadress != ipadress)
    {
      NotificationChain msgs = null;
      if (ipadress != null)
        msgs = ((InternalEObject)ipadress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdslPackage.INSTANCE__IPADRESS, null, msgs);
      if (newIpadress != null)
        msgs = ((InternalEObject)newIpadress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdslPackage.INSTANCE__IPADRESS, null, msgs);
      msgs = basicSetIpadress(newIpadress, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.INSTANCE__IPADRESS, newIpadress, newIpadress));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Load getTheLoad()
  {
    return theLoad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTheLoad(Load newTheLoad, NotificationChain msgs)
  {
    Load oldTheLoad = theLoad;
    theLoad = newTheLoad;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdslPackage.INSTANCE__THE_LOAD, oldTheLoad, newTheLoad);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTheLoad(Load newTheLoad)
  {
    if (newTheLoad != theLoad)
    {
      NotificationChain msgs = null;
      if (theLoad != null)
        msgs = ((InternalEObject)theLoad).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdslPackage.INSTANCE__THE_LOAD, null, msgs);
      if (newTheLoad != null)
        msgs = ((InternalEObject)newTheLoad).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdslPackage.INSTANCE__THE_LOAD, null, msgs);
      msgs = basicSetTheLoad(newTheLoad, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.INSTANCE__THE_LOAD, newTheLoad, newTheLoad));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTheState()
  {
    return theState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTheState(String newTheState)
  {
    String oldTheState = theState;
    theState = newTheState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.INSTANCE__THE_STATE, oldTheState, theState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHostname()
  {
    return hostname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHostname(String newHostname)
  {
    String oldHostname = hostname;
    hostname = newHostname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.INSTANCE__HOSTNAME, oldHostname, hostname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTcp()
  {
    return tcp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTcp(int newTcp)
  {
    int oldTcp = tcp;
    tcp = newTcp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.INSTANCE__TCP, oldTcp, tcp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getUdp()
  {
    return udp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUdp(int newUdp)
  {
    int oldUdp = udp;
    udp = newUdp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.INSTANCE__UDP, oldUdp, udp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IpTable> getIptable()
  {
    if (iptable == null)
    {
      iptable = new EObjectContainmentEList<IpTable>(IpTable.class, this, RdslPackage.INSTANCE__IPTABLE);
    }
    return iptable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribut> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribut>(Attribut.class, this, RdslPackage.INSTANCE__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Instance> getInstances()
  {
    if (instances == null)
    {
      instances = new EObjectContainmentEList<Instance>(Instance.class, this, RdslPackage.INSTANCE__INSTANCES);
    }
    return instances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RdslPackage.INSTANCE__IPADRESS:
        return basicSetIpadress(null, msgs);
      case RdslPackage.INSTANCE__THE_LOAD:
        return basicSetTheLoad(null, msgs);
      case RdslPackage.INSTANCE__IPTABLE:
        return ((InternalEList<?>)getIptable()).basicRemove(otherEnd, msgs);
      case RdslPackage.INSTANCE__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case RdslPackage.INSTANCE__INSTANCES:
        return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case RdslPackage.INSTANCE__COMPONENT:
        if (resolve) return getComponent();
        return basicGetComponent();
      case RdslPackage.INSTANCE__NAME:
        return getName();
      case RdslPackage.INSTANCE__FULLNAME:
        return getFullname();
      case RdslPackage.INSTANCE__COUNT:
        return getCount();
      case RdslPackage.INSTANCE__VAL:
        return getVal();
      case RdslPackage.INSTANCE__VALMIN:
        return getValmin();
      case RdslPackage.INSTANCE__VALMAX:
        return getValmax();
      case RdslPackage.INSTANCE__IP_ADDRESS:
        return getIpAddress();
      case RdslPackage.INSTANCE__IPADRESS:
        return getIpadress();
      case RdslPackage.INSTANCE__THE_LOAD:
        return getTheLoad();
      case RdslPackage.INSTANCE__THE_STATE:
        return getTheState();
      case RdslPackage.INSTANCE__HOSTNAME:
        return getHostname();
      case RdslPackage.INSTANCE__TCP:
        return getTcp();
      case RdslPackage.INSTANCE__UDP:
        return getUdp();
      case RdslPackage.INSTANCE__IPTABLE:
        return getIptable();
      case RdslPackage.INSTANCE__ATTRIBUTES:
        return getAttributes();
      case RdslPackage.INSTANCE__INSTANCES:
        return getInstances();
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
      case RdslPackage.INSTANCE__COMPONENT:
        setComponent((Component)newValue);
        return;
      case RdslPackage.INSTANCE__NAME:
        setName((String)newValue);
        return;
      case RdslPackage.INSTANCE__FULLNAME:
        getFullname().clear();
        getFullname().addAll((Collection<? extends String>)newValue);
        return;
      case RdslPackage.INSTANCE__COUNT:
        setCount((String)newValue);
        return;
      case RdslPackage.INSTANCE__VAL:
        setVal((Integer)newValue);
        return;
      case RdslPackage.INSTANCE__VALMIN:
        setValmin((Integer)newValue);
        return;
      case RdslPackage.INSTANCE__VALMAX:
        setValmax((Integer)newValue);
        return;
      case RdslPackage.INSTANCE__IP_ADDRESS:
        setIpAddress((String)newValue);
        return;
      case RdslPackage.INSTANCE__IPADRESS:
        setIpadress((IpAdress)newValue);
        return;
      case RdslPackage.INSTANCE__THE_LOAD:
        setTheLoad((Load)newValue);
        return;
      case RdslPackage.INSTANCE__THE_STATE:
        setTheState((String)newValue);
        return;
      case RdslPackage.INSTANCE__HOSTNAME:
        setHostname((String)newValue);
        return;
      case RdslPackage.INSTANCE__TCP:
        setTcp((Integer)newValue);
        return;
      case RdslPackage.INSTANCE__UDP:
        setUdp((Integer)newValue);
        return;
      case RdslPackage.INSTANCE__IPTABLE:
        getIptable().clear();
        getIptable().addAll((Collection<? extends IpTable>)newValue);
        return;
      case RdslPackage.INSTANCE__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribut>)newValue);
        return;
      case RdslPackage.INSTANCE__INSTANCES:
        getInstances().clear();
        getInstances().addAll((Collection<? extends Instance>)newValue);
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
      case RdslPackage.INSTANCE__COMPONENT:
        setComponent((Component)null);
        return;
      case RdslPackage.INSTANCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RdslPackage.INSTANCE__FULLNAME:
        getFullname().clear();
        return;
      case RdslPackage.INSTANCE__COUNT:
        setCount(COUNT_EDEFAULT);
        return;
      case RdslPackage.INSTANCE__VAL:
        setVal(VAL_EDEFAULT);
        return;
      case RdslPackage.INSTANCE__VALMIN:
        setValmin(VALMIN_EDEFAULT);
        return;
      case RdslPackage.INSTANCE__VALMAX:
        setValmax(VALMAX_EDEFAULT);
        return;
      case RdslPackage.INSTANCE__IP_ADDRESS:
        setIpAddress(IP_ADDRESS_EDEFAULT);
        return;
      case RdslPackage.INSTANCE__IPADRESS:
        setIpadress((IpAdress)null);
        return;
      case RdslPackage.INSTANCE__THE_LOAD:
        setTheLoad((Load)null);
        return;
      case RdslPackage.INSTANCE__THE_STATE:
        setTheState(THE_STATE_EDEFAULT);
        return;
      case RdslPackage.INSTANCE__HOSTNAME:
        setHostname(HOSTNAME_EDEFAULT);
        return;
      case RdslPackage.INSTANCE__TCP:
        setTcp(TCP_EDEFAULT);
        return;
      case RdslPackage.INSTANCE__UDP:
        setUdp(UDP_EDEFAULT);
        return;
      case RdslPackage.INSTANCE__IPTABLE:
        getIptable().clear();
        return;
      case RdslPackage.INSTANCE__ATTRIBUTES:
        getAttributes().clear();
        return;
      case RdslPackage.INSTANCE__INSTANCES:
        getInstances().clear();
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
      case RdslPackage.INSTANCE__COMPONENT:
        return component != null;
      case RdslPackage.INSTANCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RdslPackage.INSTANCE__FULLNAME:
        return fullname != null && !fullname.isEmpty();
      case RdslPackage.INSTANCE__COUNT:
        return COUNT_EDEFAULT == null ? count != null : !COUNT_EDEFAULT.equals(count);
      case RdslPackage.INSTANCE__VAL:
        return val != VAL_EDEFAULT;
      case RdslPackage.INSTANCE__VALMIN:
        return valmin != VALMIN_EDEFAULT;
      case RdslPackage.INSTANCE__VALMAX:
        return valmax != VALMAX_EDEFAULT;
      case RdslPackage.INSTANCE__IP_ADDRESS:
        return IP_ADDRESS_EDEFAULT == null ? ipAddress != null : !IP_ADDRESS_EDEFAULT.equals(ipAddress);
      case RdslPackage.INSTANCE__IPADRESS:
        return ipadress != null;
      case RdslPackage.INSTANCE__THE_LOAD:
        return theLoad != null;
      case RdslPackage.INSTANCE__THE_STATE:
        return THE_STATE_EDEFAULT == null ? theState != null : !THE_STATE_EDEFAULT.equals(theState);
      case RdslPackage.INSTANCE__HOSTNAME:
        return HOSTNAME_EDEFAULT == null ? hostname != null : !HOSTNAME_EDEFAULT.equals(hostname);
      case RdslPackage.INSTANCE__TCP:
        return tcp != TCP_EDEFAULT;
      case RdslPackage.INSTANCE__UDP:
        return udp != UDP_EDEFAULT;
      case RdslPackage.INSTANCE__IPTABLE:
        return iptable != null && !iptable.isEmpty();
      case RdslPackage.INSTANCE__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case RdslPackage.INSTANCE__INSTANCES:
        return instances != null && !instances.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", fullname: ");
    result.append(fullname);
    result.append(", count: ");
    result.append(count);
    result.append(", val: ");
    result.append(val);
    result.append(", valmin: ");
    result.append(valmin);
    result.append(", valmax: ");
    result.append(valmax);
    result.append(", ipAddress: ");
    result.append(ipAddress);
    result.append(", theState: ");
    result.append(theState);
    result.append(", hostname: ");
    result.append(hostname);
    result.append(", tcp: ");
    result.append(tcp);
    result.append(", udp: ");
    result.append(udp);
    result.append(')');
    return result.toString();
  }

} //InstanceImpl
