/**
 */
package org.xtext.rdsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.rdsl.Component;
import org.xtext.rdsl.Extends;
import org.xtext.rdsl.RdslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extends</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.impl.ExtendsImpl#getSupComponent <em>Sup Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendsImpl extends MinimalEObjectImpl.Container implements Extends
{
  /**
   * The cached value of the '{@link #getSupComponent() <em>Sup Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupComponent()
   * @generated
   * @ordered
   */
  protected Component supComponent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExtendsImpl()
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
    return RdslPackage.Literals.EXTENDS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component getSupComponent()
  {
    if (supComponent != null && supComponent.eIsProxy())
    {
      InternalEObject oldSupComponent = (InternalEObject)supComponent;
      supComponent = (Component)eResolveProxy(oldSupComponent);
      if (supComponent != oldSupComponent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdslPackage.EXTENDS__SUP_COMPONENT, oldSupComponent, supComponent));
      }
    }
    return supComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component basicGetSupComponent()
  {
    return supComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSupComponent(Component newSupComponent)
  {
    Component oldSupComponent = supComponent;
    supComponent = newSupComponent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.EXTENDS__SUP_COMPONENT, oldSupComponent, supComponent));
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
      case RdslPackage.EXTENDS__SUP_COMPONENT:
        if (resolve) return getSupComponent();
        return basicGetSupComponent();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RdslPackage.EXTENDS__SUP_COMPONENT:
        setSupComponent((Component)newValue);
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
      case RdslPackage.EXTENDS__SUP_COMPONENT:
        setSupComponent((Component)null);
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
      case RdslPackage.EXTENDS__SUP_COMPONENT:
        return supComponent != null;
    }
    return super.eIsSet(featureID);
  }

} //ExtendsImpl
