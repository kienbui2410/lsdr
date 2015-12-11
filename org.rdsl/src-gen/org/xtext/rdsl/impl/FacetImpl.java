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
 *   <li>{@link org.xtext.rdsl.impl.FacetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.FacetImpl#getExportFacet <em>Export Facet</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.FacetImpl#getChildrenFacet <em>Children Facet</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.FacetImpl#getSupFacets <em>Sup Facets</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.FacetImpl#getSupFacet <em>Sup Facet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacetImpl extends PropertyImpl implements Facet
{
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
   * The cached value of the '{@link #getExportFacet() <em>Export Facet</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExportFacet()
   * @generated
   * @ordered
   */
  protected EList<Export> exportFacet;

  /**
   * The cached value of the '{@link #getChildrenFacet() <em>Children Facet</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildrenFacet()
   * @generated
   * @ordered
   */
  protected EList<Children> childrenFacet;

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
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.FACET__NAME, oldName, name));
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
      exportFacet = new EObjectResolvingEList<Export>(Export.class, this, RdslPackage.FACET__EXPORT_FACET);
    }
    return exportFacet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Children> getChildrenFacet()
  {
    if (childrenFacet == null)
    {
      childrenFacet = new EObjectResolvingEList<Children>(Children.class, this, RdslPackage.FACET__CHILDREN_FACET);
    }
    return childrenFacet;
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
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RdslPackage.FACET__NAME:
        return getName();
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
      case RdslPackage.FACET__NAME:
        setName((String)newValue);
        return;
      case RdslPackage.FACET__EXPORT_FACET:
        getExportFacet().clear();
        getExportFacet().addAll((Collection<? extends Export>)newValue);
        return;
      case RdslPackage.FACET__CHILDREN_FACET:
        getChildrenFacet().clear();
        getChildrenFacet().addAll((Collection<? extends Children>)newValue);
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
      case RdslPackage.FACET__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RdslPackage.FACET__EXPORT_FACET:
        getExportFacet().clear();
        return;
      case RdslPackage.FACET__CHILDREN_FACET:
        getChildrenFacet().clear();
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
      case RdslPackage.FACET__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RdslPackage.FACET__EXPORT_FACET:
        return exportFacet != null && !exportFacet.isEmpty();
      case RdslPackage.FACET__CHILDREN_FACET:
        return childrenFacet != null && !childrenFacet.isEmpty();
      case RdslPackage.FACET__SUP_FACETS:
        return supFacets != null && !supFacets.isEmpty();
      case RdslPackage.FACET__SUP_FACET:
        return supFacet != null;
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

} //FacetImpl
