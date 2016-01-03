/**
 */
package org.xtext.rdsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.rdsl.Facet;
import org.xtext.rdsl.Facets;
import org.xtext.rdsl.RdslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.impl.FacetsImpl#getFacets <em>Facets</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.FacetsImpl#getFacet <em>Facet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacetsImpl extends MinimalEObjectImpl.Container implements Facets
{
  /**
   * The cached value of the '{@link #getFacets() <em>Facets</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFacets()
   * @generated
   * @ordered
   */
  protected EList<Facet> facets;

  /**
   * The cached value of the '{@link #getFacet() <em>Facet</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFacet()
   * @generated
   * @ordered
   */
  protected Facet facet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FacetsImpl()
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
    return RdslPackage.Literals.FACETS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Facet> getFacets()
  {
    if (facets == null)
    {
      facets = new EObjectResolvingEList<Facet>(Facet.class, this, RdslPackage.FACETS__FACETS);
    }
    return facets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Facet getFacet()
  {
    if (facet != null && facet.eIsProxy())
    {
      InternalEObject oldFacet = (InternalEObject)facet;
      facet = (Facet)eResolveProxy(oldFacet);
      if (facet != oldFacet)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdslPackage.FACETS__FACET, oldFacet, facet));
      }
    }
    return facet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Facet basicGetFacet()
  {
    return facet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFacet(Facet newFacet)
  {
    Facet oldFacet = facet;
    facet = newFacet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.FACETS__FACET, oldFacet, facet));
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
      case RdslPackage.FACETS__FACETS:
        return getFacets();
      case RdslPackage.FACETS__FACET:
        if (resolve) return getFacet();
        return basicGetFacet();
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
      case RdslPackage.FACETS__FACETS:
        getFacets().clear();
        getFacets().addAll((Collection<? extends Facet>)newValue);
        return;
      case RdslPackage.FACETS__FACET:
        setFacet((Facet)newValue);
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
      case RdslPackage.FACETS__FACETS:
        getFacets().clear();
        return;
      case RdslPackage.FACETS__FACET:
        setFacet((Facet)null);
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
      case RdslPackage.FACETS__FACETS:
        return facets != null && !facets.isEmpty();
      case RdslPackage.FACETS__FACET:
        return facet != null;
    }
    return super.eIsSet(featureID);
  }

} //FacetsImpl
