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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.rdsl.Imports;
import org.xtext.rdsl.RdslPackage;
import org.xtext.rdsl.importVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imports</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.impl.ImportsImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.ImportsImpl#getImported <em>Imported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportsImpl extends PropertyImpl implements Imports
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<importVariable> imports;

  /**
   * The cached value of the '{@link #getImported() <em>Imported</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImported()
   * @generated
   * @ordered
   */
  protected importVariable imported;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportsImpl()
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
    return RdslPackage.Literals.IMPORTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<importVariable> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<importVariable>(importVariable.class, this, RdslPackage.IMPORTS__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public importVariable getImported()
  {
    return imported;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImported(importVariable newImported, NotificationChain msgs)
  {
    importVariable oldImported = imported;
    imported = newImported;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdslPackage.IMPORTS__IMPORTED, oldImported, newImported);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImported(importVariable newImported)
  {
    if (newImported != imported)
    {
      NotificationChain msgs = null;
      if (imported != null)
        msgs = ((InternalEObject)imported).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdslPackage.IMPORTS__IMPORTED, null, msgs);
      if (newImported != null)
        msgs = ((InternalEObject)newImported).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdslPackage.IMPORTS__IMPORTED, null, msgs);
      msgs = basicSetImported(newImported, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.IMPORTS__IMPORTED, newImported, newImported));
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
      case RdslPackage.IMPORTS__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case RdslPackage.IMPORTS__IMPORTED:
        return basicSetImported(null, msgs);
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
      case RdslPackage.IMPORTS__IMPORTS:
        return getImports();
      case RdslPackage.IMPORTS__IMPORTED:
        return getImported();
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
      case RdslPackage.IMPORTS__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends importVariable>)newValue);
        return;
      case RdslPackage.IMPORTS__IMPORTED:
        setImported((importVariable)newValue);
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
      case RdslPackage.IMPORTS__IMPORTS:
        getImports().clear();
        return;
      case RdslPackage.IMPORTS__IMPORTED:
        setImported((importVariable)null);
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
      case RdslPackage.IMPORTS__IMPORTS:
        return imports != null && !imports.isEmpty();
      case RdslPackage.IMPORTS__IMPORTED:
        return imported != null;
    }
    return super.eIsSet(featureID);
  }

} //ImportsImpl
