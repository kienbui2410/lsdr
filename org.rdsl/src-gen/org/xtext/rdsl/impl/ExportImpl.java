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

import org.xtext.rdsl.Export;
import org.xtext.rdsl.RdslPackage;
import org.xtext.rdsl.exportVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Export</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.impl.ExportImpl#getExports <em>Exports</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.ExportImpl#getExport <em>Export</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExportImpl extends MinimalEObjectImpl.Container implements Export
{
  /**
   * The cached value of the '{@link #getExports() <em>Exports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExports()
   * @generated
   * @ordered
   */
  protected EList<exportVariable> exports;

  /**
   * The cached value of the '{@link #getExport() <em>Export</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExport()
   * @generated
   * @ordered
   */
  protected exportVariable export;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExportImpl()
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
    return RdslPackage.Literals.EXPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<exportVariable> getExports()
  {
    if (exports == null)
    {
      exports = new EObjectContainmentEList<exportVariable>(exportVariable.class, this, RdslPackage.EXPORT__EXPORTS);
    }
    return exports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public exportVariable getExport()
  {
    return export;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExport(exportVariable newExport, NotificationChain msgs)
  {
    exportVariable oldExport = export;
    export = newExport;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdslPackage.EXPORT__EXPORT, oldExport, newExport);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExport(exportVariable newExport)
  {
    if (newExport != export)
    {
      NotificationChain msgs = null;
      if (export != null)
        msgs = ((InternalEObject)export).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdslPackage.EXPORT__EXPORT, null, msgs);
      if (newExport != null)
        msgs = ((InternalEObject)newExport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdslPackage.EXPORT__EXPORT, null, msgs);
      msgs = basicSetExport(newExport, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.EXPORT__EXPORT, newExport, newExport));
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
      case RdslPackage.EXPORT__EXPORTS:
        return ((InternalEList<?>)getExports()).basicRemove(otherEnd, msgs);
      case RdslPackage.EXPORT__EXPORT:
        return basicSetExport(null, msgs);
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
      case RdslPackage.EXPORT__EXPORTS:
        return getExports();
      case RdslPackage.EXPORT__EXPORT:
        return getExport();
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
      case RdslPackage.EXPORT__EXPORTS:
        getExports().clear();
        getExports().addAll((Collection<? extends exportVariable>)newValue);
        return;
      case RdslPackage.EXPORT__EXPORT:
        setExport((exportVariable)newValue);
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
      case RdslPackage.EXPORT__EXPORTS:
        getExports().clear();
        return;
      case RdslPackage.EXPORT__EXPORT:
        setExport((exportVariable)null);
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
      case RdslPackage.EXPORT__EXPORTS:
        return exports != null && !exports.isEmpty();
      case RdslPackage.EXPORT__EXPORT:
        return export != null;
    }
    return super.eIsSet(featureID);
  }

} //ExportImpl
