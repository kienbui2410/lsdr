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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.rdsl.Comment;
import org.xtext.rdsl.Component;
import org.xtext.rdsl.Installer;
import org.xtext.rdsl.Property;
import org.xtext.rdsl.RdslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.impl.ComponentImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.ComponentImpl#getInstallers <em>Installers</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.ComponentImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.ComponentImpl#getSupComponents <em>Sup Components</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.ComponentImpl#getSupComponent <em>Sup Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component
{
  /**
   * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComments()
   * @generated
   * @ordered
   */
  protected EList<Comment> comments;

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
   * The cached value of the '{@link #getInstallers() <em>Installers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstallers()
   * @generated
   * @ordered
   */
  protected Installer installers;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * The cached value of the '{@link #getSupComponents() <em>Sup Components</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupComponents()
   * @generated
   * @ordered
   */
  protected EList<Component> supComponents;

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
  protected ComponentImpl()
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
    return RdslPackage.Literals.COMPONENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Comment> getComments()
  {
    if (comments == null)
    {
      comments = new EObjectContainmentEList<Comment>(Comment.class, this, RdslPackage.COMPONENT__COMMENTS);
    }
    return comments;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.COMPONENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Installer getInstallers()
  {
    return installers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInstallers(Installer newInstallers, NotificationChain msgs)
  {
    Installer oldInstallers = installers;
    installers = newInstallers;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdslPackage.COMPONENT__INSTALLERS, oldInstallers, newInstallers);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstallers(Installer newInstallers)
  {
    if (newInstallers != installers)
    {
      NotificationChain msgs = null;
      if (installers != null)
        msgs = ((InternalEObject)installers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdslPackage.COMPONENT__INSTALLERS, null, msgs);
      if (newInstallers != null)
        msgs = ((InternalEObject)newInstallers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdslPackage.COMPONENT__INSTALLERS, null, msgs);
      msgs = basicSetInstallers(newInstallers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.COMPONENT__INSTALLERS, newInstallers, newInstallers));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, RdslPackage.COMPONENT__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Component> getSupComponents()
  {
    if (supComponents == null)
    {
      supComponents = new EObjectResolvingEList<Component>(Component.class, this, RdslPackage.COMPONENT__SUP_COMPONENTS);
    }
    return supComponents;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdslPackage.COMPONENT__SUP_COMPONENT, oldSupComponent, supComponent));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.COMPONENT__SUP_COMPONENT, oldSupComponent, supComponent));
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
      case RdslPackage.COMPONENT__COMMENTS:
        return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
      case RdslPackage.COMPONENT__INSTALLERS:
        return basicSetInstallers(null, msgs);
      case RdslPackage.COMPONENT__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
      case RdslPackage.COMPONENT__COMMENTS:
        return getComments();
      case RdslPackage.COMPONENT__NAME:
        return getName();
      case RdslPackage.COMPONENT__INSTALLERS:
        return getInstallers();
      case RdslPackage.COMPONENT__PROPERTIES:
        return getProperties();
      case RdslPackage.COMPONENT__SUP_COMPONENTS:
        return getSupComponents();
      case RdslPackage.COMPONENT__SUP_COMPONENT:
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
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RdslPackage.COMPONENT__COMMENTS:
        getComments().clear();
        getComments().addAll((Collection<? extends Comment>)newValue);
        return;
      case RdslPackage.COMPONENT__NAME:
        setName((String)newValue);
        return;
      case RdslPackage.COMPONENT__INSTALLERS:
        setInstallers((Installer)newValue);
        return;
      case RdslPackage.COMPONENT__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
        return;
      case RdslPackage.COMPONENT__SUP_COMPONENTS:
        getSupComponents().clear();
        getSupComponents().addAll((Collection<? extends Component>)newValue);
        return;
      case RdslPackage.COMPONENT__SUP_COMPONENT:
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
      case RdslPackage.COMPONENT__COMMENTS:
        getComments().clear();
        return;
      case RdslPackage.COMPONENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RdslPackage.COMPONENT__INSTALLERS:
        setInstallers((Installer)null);
        return;
      case RdslPackage.COMPONENT__PROPERTIES:
        getProperties().clear();
        return;
      case RdslPackage.COMPONENT__SUP_COMPONENTS:
        getSupComponents().clear();
        return;
      case RdslPackage.COMPONENT__SUP_COMPONENT:
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
      case RdslPackage.COMPONENT__COMMENTS:
        return comments != null && !comments.isEmpty();
      case RdslPackage.COMPONENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RdslPackage.COMPONENT__INSTALLERS:
        return installers != null;
      case RdslPackage.COMPONENT__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case RdslPackage.COMPONENT__SUP_COMPONENTS:
        return supComponents != null && !supComponents.isEmpty();
      case RdslPackage.COMPONENT__SUP_COMPONENT:
        return supComponent != null;
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
    result.append(')');
    return result.toString();
  }

} //ComponentImpl
