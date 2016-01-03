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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.rdsl.Graph;
import org.xtext.rdsl.Instance;
import org.xtext.rdsl.Model;
import org.xtext.rdsl.RdslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.impl.ModelImpl#getGraphs <em>Graphs</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.ModelImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.ModelImpl#getValmin <em>Valmin</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.ModelImpl#getValmax <em>Valmax</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getGraphs() <em>Graphs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGraphs()
   * @generated
   * @ordered
   */
  protected Graph graphs;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return RdslPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Graph getGraphs()
  {
    return graphs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGraphs(Graph newGraphs, NotificationChain msgs)
  {
    Graph oldGraphs = graphs;
    graphs = newGraphs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdslPackage.MODEL__GRAPHS, oldGraphs, newGraphs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGraphs(Graph newGraphs)
  {
    if (newGraphs != graphs)
    {
      NotificationChain msgs = null;
      if (graphs != null)
        msgs = ((InternalEObject)graphs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdslPackage.MODEL__GRAPHS, null, msgs);
      if (newGraphs != null)
        msgs = ((InternalEObject)newGraphs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdslPackage.MODEL__GRAPHS, null, msgs);
      msgs = basicSetGraphs(newGraphs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.MODEL__GRAPHS, newGraphs, newGraphs));
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
      instances = new EObjectContainmentEList<Instance>(Instance.class, this, RdslPackage.MODEL__INSTANCES);
    }
    return instances;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.MODEL__VALMIN, oldValmin, valmin));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.MODEL__VALMAX, oldValmax, valmax));
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
      case RdslPackage.MODEL__GRAPHS:
        return basicSetGraphs(null, msgs);
      case RdslPackage.MODEL__INSTANCES:
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
      case RdslPackage.MODEL__GRAPHS:
        return getGraphs();
      case RdslPackage.MODEL__INSTANCES:
        return getInstances();
      case RdslPackage.MODEL__VALMIN:
        return getValmin();
      case RdslPackage.MODEL__VALMAX:
        return getValmax();
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
      case RdslPackage.MODEL__GRAPHS:
        setGraphs((Graph)newValue);
        return;
      case RdslPackage.MODEL__INSTANCES:
        getInstances().clear();
        getInstances().addAll((Collection<? extends Instance>)newValue);
        return;
      case RdslPackage.MODEL__VALMIN:
        setValmin((Integer)newValue);
        return;
      case RdslPackage.MODEL__VALMAX:
        setValmax((Integer)newValue);
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
      case RdslPackage.MODEL__GRAPHS:
        setGraphs((Graph)null);
        return;
      case RdslPackage.MODEL__INSTANCES:
        getInstances().clear();
        return;
      case RdslPackage.MODEL__VALMIN:
        setValmin(VALMIN_EDEFAULT);
        return;
      case RdslPackage.MODEL__VALMAX:
        setValmax(VALMAX_EDEFAULT);
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
      case RdslPackage.MODEL__GRAPHS:
        return graphs != null;
      case RdslPackage.MODEL__INSTANCES:
        return instances != null && !instances.isEmpty();
      case RdslPackage.MODEL__VALMIN:
        return valmin != VALMIN_EDEFAULT;
      case RdslPackage.MODEL__VALMAX:
        return valmax != VALMAX_EDEFAULT;
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
    result.append(" (valmin: ");
    result.append(valmin);
    result.append(", valmax: ");
    result.append(valmax);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
