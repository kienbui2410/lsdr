/**
 */
package org.xtext.rdsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.rdsl.CompFacet;
import org.xtext.rdsl.RdslPackage;
import org.xtext.rdsl.importVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>import Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.impl.importVariableImpl#isExternal <em>External</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.importVariableImpl#getImportvariable <em>Importvariable</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.importVariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rdsl.impl.importVariableImpl#isOptional <em>Optional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class importVariableImpl extends MinimalEObjectImpl.Container implements importVariable
{
  /**
   * The default value of the '{@link #isExternal() <em>External</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExternal()
   * @generated
   * @ordered
   */
  protected static final boolean EXTERNAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExternal() <em>External</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExternal()
   * @generated
   * @ordered
   */
  protected boolean external = EXTERNAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getImportvariable() <em>Importvariable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportvariable()
   * @generated
   * @ordered
   */
  protected CompFacet importvariable;

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
   * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected static final boolean OPTIONAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected boolean optional = OPTIONAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected importVariableImpl()
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
    return RdslPackage.Literals.IMPORT_VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExternal()
  {
    return external;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExternal(boolean newExternal)
  {
    boolean oldExternal = external;
    external = newExternal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.IMPORT_VARIABLE__EXTERNAL, oldExternal, external));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompFacet getImportvariable()
  {
    if (importvariable != null && importvariable.eIsProxy())
    {
      InternalEObject oldImportvariable = (InternalEObject)importvariable;
      importvariable = (CompFacet)eResolveProxy(oldImportvariable);
      if (importvariable != oldImportvariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdslPackage.IMPORT_VARIABLE__IMPORTVARIABLE, oldImportvariable, importvariable));
      }
    }
    return importvariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompFacet basicGetImportvariable()
  {
    return importvariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportvariable(CompFacet newImportvariable)
  {
    CompFacet oldImportvariable = importvariable;
    importvariable = newImportvariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.IMPORT_VARIABLE__IMPORTVARIABLE, oldImportvariable, importvariable));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.IMPORT_VARIABLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOptional()
  {
    return optional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptional(boolean newOptional)
  {
    boolean oldOptional = optional;
    optional = newOptional;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdslPackage.IMPORT_VARIABLE__OPTIONAL, oldOptional, optional));
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
      case RdslPackage.IMPORT_VARIABLE__EXTERNAL:
        return isExternal();
      case RdslPackage.IMPORT_VARIABLE__IMPORTVARIABLE:
        if (resolve) return getImportvariable();
        return basicGetImportvariable();
      case RdslPackage.IMPORT_VARIABLE__NAME:
        return getName();
      case RdslPackage.IMPORT_VARIABLE__OPTIONAL:
        return isOptional();
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
      case RdslPackage.IMPORT_VARIABLE__EXTERNAL:
        setExternal((Boolean)newValue);
        return;
      case RdslPackage.IMPORT_VARIABLE__IMPORTVARIABLE:
        setImportvariable((CompFacet)newValue);
        return;
      case RdslPackage.IMPORT_VARIABLE__NAME:
        setName((String)newValue);
        return;
      case RdslPackage.IMPORT_VARIABLE__OPTIONAL:
        setOptional((Boolean)newValue);
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
      case RdslPackage.IMPORT_VARIABLE__EXTERNAL:
        setExternal(EXTERNAL_EDEFAULT);
        return;
      case RdslPackage.IMPORT_VARIABLE__IMPORTVARIABLE:
        setImportvariable((CompFacet)null);
        return;
      case RdslPackage.IMPORT_VARIABLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RdslPackage.IMPORT_VARIABLE__OPTIONAL:
        setOptional(OPTIONAL_EDEFAULT);
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
      case RdslPackage.IMPORT_VARIABLE__EXTERNAL:
        return external != EXTERNAL_EDEFAULT;
      case RdslPackage.IMPORT_VARIABLE__IMPORTVARIABLE:
        return importvariable != null;
      case RdslPackage.IMPORT_VARIABLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RdslPackage.IMPORT_VARIABLE__OPTIONAL:
        return optional != OPTIONAL_EDEFAULT;
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
    result.append(" (external: ");
    result.append(external);
    result.append(", name: ");
    result.append(name);
    result.append(", optional: ");
    result.append(optional);
    result.append(')');
    return result.toString();
  }

} //importVariableImpl
