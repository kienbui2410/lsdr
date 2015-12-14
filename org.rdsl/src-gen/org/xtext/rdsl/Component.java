/**
 */
package org.xtext.rdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.Component#getInstallers <em>Installers</em>}</li>
 *   <li>{@link org.xtext.rdsl.Component#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.xtext.rdsl.RdslPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends CompFacet
{
  /**
   * Returns the value of the '<em><b>Installers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Installers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Installers</em>' containment reference.
   * @see #setInstallers(Installer)
   * @see org.xtext.rdsl.RdslPackage#getComponent_Installers()
   * @model containment="true"
   * @generated
   */
  Installer getInstallers();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Component#getInstallers <em>Installers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Installers</em>' containment reference.
   * @see #getInstallers()
   * @generated
   */
  void setInstallers(Installer value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rdsl.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.xtext.rdsl.RdslPackage#getComponent_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

} // Component
