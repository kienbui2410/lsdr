/**
 */
package org.xtext.rdsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.rdsl.Children;
import org.xtext.rdsl.Component;
import org.xtext.rdsl.RdslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Children</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.impl.ChildrenImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.ChildrenImpl#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChildrenImpl extends PropertyImpl implements Children
{
  /**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<Component> children;

  /**
   * The cached value of the '{@link #getChild() <em>Child</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChild()
   * @generated
   * @ordered
   */
  protected Component child;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChildrenImpl()
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
    return RdslPackage.Literals.CHILDREN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Component> getChildren()
  {
    if (children == null)
    {
      children = new EObjectResolvingEList<Component>(Component.class, this, RdslPackage.CHILDREN__CHILDREN);
    }
    return children;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component getChild()
  {
    if (child != null && child.eIsProxy())
    {
      InternalEObject oldChild = (InternalEObject)child;
      child = (Component)eResolveProxy(oldChild);
      if (child != oldChild)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdslPackage.CHILDREN__CHILD, oldChild, child));
      }
    }
    return child;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component basicGetChild()
  {
    return child;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChild(Component newChild)
  {
    Component oldChild = child;
    child = newChild;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.CHILDREN__CHILD, oldChild, child));
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
      case RdslPackage.CHILDREN__CHILDREN:
        return getChildren();
      case RdslPackage.CHILDREN__CHILD:
        if (resolve) return getChild();
        return basicGetChild();
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
      case RdslPackage.CHILDREN__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends Component>)newValue);
        return;
      case RdslPackage.CHILDREN__CHILD:
        setChild((Component)newValue);
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
      case RdslPackage.CHILDREN__CHILDREN:
        getChildren().clear();
        return;
      case RdslPackage.CHILDREN__CHILD:
        setChild((Component)null);
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
      case RdslPackage.CHILDREN__CHILDREN:
        return children != null && !children.isEmpty();
      case RdslPackage.CHILDREN__CHILD:
        return child != null;
    }
    return super.eIsSet(featureID);
  }

} //ChildrenImpl
