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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.rdsl.Children;
import org.xtext.rdsl.Export;
import org.xtext.rdsl.Facet;
import org.xtext.rdsl.RdslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.impl.FacetImpl#getExportFacet <em>Export Facet</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.FacetImpl#getChildrenFacet <em>Children Facet</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.FacetImpl#getSupFacets <em>Sup Facets</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.FacetImpl#getSupFacet <em>Sup Facet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacetImpl extends CompFacetImpl implements Facet
{
  /**
   * The cached value of the '{@link #getExportFacet() <em>Export Facet</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExportFacet()
   * @generated
   * @ordered
   */
  protected EList<Export> exportFacet;

  /**
   * The cached value of the '{@link #getChildrenFacet() <em>Children Facet</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildrenFacet()
   * @generated
   * @ordered
   */
  protected Children childrenFacet;

  /**
   * The cached value of the '{@link #getSupFacets() <em>Sup Facets</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupFacets()
   * @generated
   * @ordered
   */
  protected EList<Facet> supFacets;

  /**
   * The cached value of the '{@link #getSupFacet() <em>Sup Facet</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupFacet()
   * @generated
   * @ordered
   */
  protected Facet supFacet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FacetImpl()
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
    return RdslPackage.Literals.FACET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Export> getExportFacet()
  {
    if (exportFacet == null)
    {
      exportFacet = new EObjectContainmentEList<Export>(Export.class, this, RdslPackage.FACET__EXPORT_FACET);
    }
    return exportFacet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Children getChildrenFacet()
  {
    return childrenFacet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChildrenFacet(Children newChildrenFacet, NotificationChain msgs)
  {
    Children oldChildrenFacet = childrenFacet;
    childrenFacet = newChildrenFacet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdslPackage.FACET__CHILDREN_FACET, oldChildrenFacet, newChildrenFacet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChildrenFacet(Children newChildrenFacet)
  {
    if (newChildrenFacet != childrenFacet)
    {
      NotificationChain msgs = null;
      if (childrenFacet != null)
        msgs = ((InternalEObject)childrenFacet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdslPackage.FACET__CHILDREN_FACET, null, msgs);
      if (newChildrenFacet != null)
        msgs = ((InternalEObject)newChildrenFacet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdslPackage.FACET__CHILDREN_FACET, null, msgs);
      msgs = basicSetChildrenFacet(newChildrenFacet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.FACET__CHILDREN_FACET, newChildrenFacet, newChildrenFacet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Facet> getSupFacets()
  {
    if (supFacets == null)
    {
      supFacets = new EObjectResolvingEList<Facet>(Facet.class, this, RdslPackage.FACET__SUP_FACETS);
    }
    return supFacets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Facet getSupFacet()
  {
    if (supFacet != null && supFacet.eIsProxy())
    {
      InternalEObject oldSupFacet = (InternalEObject)supFacet;
      supFacet = (Facet)eResolveProxy(oldSupFacet);
      if (supFacet != oldSupFacet)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdslPackage.FACET__SUP_FACET, oldSupFacet, supFacet));
      }
    }
    return supFacet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Facet basicGetSupFacet()
  {
    return supFacet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSupFacet(Facet newSupFacet)
  {
    Facet oldSupFacet = supFacet;
    supFacet = newSupFacet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.FACET__SUP_FACET, oldSupFacet, supFacet));
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
      case RdslPackage.FACET__EXPORT_FACET:
        return ((InternalEList<?>)getExportFacet()).basicRemove(otherEnd, msgs);
      case RdslPackage.FACET__CHILDREN_FACET:
        return basicSetChildrenFacet(null, msgs);
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
      case RdslPackage.FACET__EXPORT_FACET:
        return getExportFacet();
      case RdslPackage.FACET__CHILDREN_FACET:
        return getChildrenFacet();
      case RdslPackage.FACET__SUP_FACETS:
        return getSupFacets();
      case RdslPackage.FACET__SUP_FACET:
        if (resolve) return getSupFacet();
        return basicGetSupFacet();
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
      case RdslPackage.FACET__EXPORT_FACET:
        getExportFacet().clear();
        getExportFacet().addAll((Collection<? extends Export>)newValue);
        return;
      case RdslPackage.FACET__CHILDREN_FACET:
        setChildrenFacet((Children)newValue);
        return;
      case RdslPackage.FACET__SUP_FACETS:
        getSupFacets().clear();
        getSupFacets().addAll((Collection<? extends Facet>)newValue);
        return;
      case RdslPackage.FACET__SUP_FACET:
        setSupFacet((Facet)newValue);
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
      case RdslPackage.FACET__EXPORT_FACET:
        getExportFacet().clear();
        return;
      case RdslPackage.FACET__CHILDREN_FACET:
        setChildrenFacet((Children)null);
        return;
      case RdslPackage.FACET__SUP_FACETS:
        getSupFacets().clear();
        return;
      case RdslPackage.FACET__SUP_FACET:
        setSupFacet((Facet)null);
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
      case RdslPackage.FACET__EXPORT_FACET:
        return exportFacet != null && !exportFacet.isEmpty();
      case RdslPackage.FACET__CHILDREN_FACET:
        return childrenFacet != null;
      case RdslPackage.FACET__SUP_FACETS:
        return supFacets != null && !supFacets.isEmpty();
      case RdslPackage.FACET__SUP_FACET:
        return supFacet != null;
    }
    return super.eIsSet(featureID);
  }

} //FacetImpl
