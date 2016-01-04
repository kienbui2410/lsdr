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

import org.xtext.rdsl.Children;
import org.xtext.rdsl.Component;
import org.xtext.rdsl.Export;
import org.xtext.rdsl.Extends;
import org.xtext.rdsl.Facets;
import org.xtext.rdsl.Imports;
import org.xtext.rdsl.Installer;
import org.xtext.rdsl.RdslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.impl.ComponentImpl#getInstallers <em>Installers</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.ComponentImpl#getChildrens <em>Childrens</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.ComponentImpl#getExports <em>Exports</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.ComponentImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.ComponentImpl#getFacets <em>Facets</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.ComponentImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.ComponentImpl#getValmin <em>Valmin</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.ComponentImpl#getValmax <em>Valmax</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends CompFacetImpl implements Component
{
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
   * The cached value of the '{@link #getChildrens() <em>Childrens</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildrens()
   * @generated
   * @ordered
   */
  protected EList<Children> childrens;

  /**
   * The cached value of the '{@link #getExports() <em>Exports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExports()
   * @generated
   * @ordered
   */
  protected EList<Export> exports;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Imports> imports;

  /**
   * The cached value of the '{@link #getFacets() <em>Facets</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFacets()
   * @generated
   * @ordered
   */
  protected EList<Facets> facets;

  /**
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected EList<Extends> extends_;

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
  public EList<Children> getChildrens()
  {
    if (childrens == null)
    {
      childrens = new EObjectContainmentEList<Children>(Children.class, this, RdslPackage.COMPONENT__CHILDRENS);
    }
    return childrens;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Export> getExports()
  {
    if (exports == null)
    {
      exports = new EObjectContainmentEList<Export>(Export.class, this, RdslPackage.COMPONENT__EXPORTS);
    }
    return exports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Imports> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Imports>(Imports.class, this, RdslPackage.COMPONENT__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Facets> getFacets()
  {
    if (facets == null)
    {
      facets = new EObjectContainmentEList<Facets>(Facets.class, this, RdslPackage.COMPONENT__FACETS);
    }
    return facets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Extends> getExtends()
  {
    if (extends_ == null)
    {
      extends_ = new EObjectContainmentEList<Extends>(Extends.class, this, RdslPackage.COMPONENT__EXTENDS);
    }
    return extends_;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.COMPONENT__VALMIN, oldValmin, valmin));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.COMPONENT__VALMAX, oldValmax, valmax));
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
      case RdslPackage.COMPONENT__INSTALLERS:
        return basicSetInstallers(null, msgs);
      case RdslPackage.COMPONENT__CHILDRENS:
        return ((InternalEList<?>)getChildrens()).basicRemove(otherEnd, msgs);
      case RdslPackage.COMPONENT__EXPORTS:
        return ((InternalEList<?>)getExports()).basicRemove(otherEnd, msgs);
      case RdslPackage.COMPONENT__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case RdslPackage.COMPONENT__FACETS:
        return ((InternalEList<?>)getFacets()).basicRemove(otherEnd, msgs);
      case RdslPackage.COMPONENT__EXTENDS:
        return ((InternalEList<?>)getExtends()).basicRemove(otherEnd, msgs);
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
      case RdslPackage.COMPONENT__INSTALLERS:
        return getInstallers();
      case RdslPackage.COMPONENT__CHILDRENS:
        return getChildrens();
      case RdslPackage.COMPONENT__EXPORTS:
        return getExports();
      case RdslPackage.COMPONENT__IMPORTS:
        return getImports();
      case RdslPackage.COMPONENT__FACETS:
        return getFacets();
      case RdslPackage.COMPONENT__EXTENDS:
        return getExtends();
      case RdslPackage.COMPONENT__VALMIN:
        return getValmin();
      case RdslPackage.COMPONENT__VALMAX:
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
      case RdslPackage.COMPONENT__INSTALLERS:
        setInstallers((Installer)newValue);
        return;
      case RdslPackage.COMPONENT__CHILDRENS:
        getChildrens().clear();
        getChildrens().addAll((Collection<? extends Children>)newValue);
        return;
      case RdslPackage.COMPONENT__EXPORTS:
        getExports().clear();
        getExports().addAll((Collection<? extends Export>)newValue);
        return;
      case RdslPackage.COMPONENT__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Imports>)newValue);
        return;
      case RdslPackage.COMPONENT__FACETS:
        getFacets().clear();
        getFacets().addAll((Collection<? extends Facets>)newValue);
        return;
      case RdslPackage.COMPONENT__EXTENDS:
        getExtends().clear();
        getExtends().addAll((Collection<? extends Extends>)newValue);
        return;
      case RdslPackage.COMPONENT__VALMIN:
        setValmin((Integer)newValue);
        return;
      case RdslPackage.COMPONENT__VALMAX:
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
      case RdslPackage.COMPONENT__INSTALLERS:
        setInstallers((Installer)null);
        return;
      case RdslPackage.COMPONENT__CHILDRENS:
        getChildrens().clear();
        return;
      case RdslPackage.COMPONENT__EXPORTS:
        getExports().clear();
        return;
      case RdslPackage.COMPONENT__IMPORTS:
        getImports().clear();
        return;
      case RdslPackage.COMPONENT__FACETS:
        getFacets().clear();
        return;
      case RdslPackage.COMPONENT__EXTENDS:
        getExtends().clear();
        return;
      case RdslPackage.COMPONENT__VALMIN:
        setValmin(VALMIN_EDEFAULT);
        return;
      case RdslPackage.COMPONENT__VALMAX:
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
      case RdslPackage.COMPONENT__INSTALLERS:
        return installers != null;
      case RdslPackage.COMPONENT__CHILDRENS:
        return childrens != null && !childrens.isEmpty();
      case RdslPackage.COMPONENT__EXPORTS:
        return exports != null && !exports.isEmpty();
      case RdslPackage.COMPONENT__IMPORTS:
        return imports != null && !imports.isEmpty();
      case RdslPackage.COMPONENT__FACETS:
        return facets != null && !facets.isEmpty();
      case RdslPackage.COMPONENT__EXTENDS:
        return extends_ != null && !extends_.isEmpty();
      case RdslPackage.COMPONENT__VALMIN:
        return valmin != VALMIN_EDEFAULT;
      case RdslPackage.COMPONENT__VALMAX:
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

} //ComponentImpl
