/**
 */
package org.xtext.rdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.Component#getComments <em>Comments</em>}</li>
 *   <li>{@link org.xtext.rdsl.Component#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rdsl.Component#getInstallers <em>Installers</em>}</li>
 *   <li>{@link org.xtext.rdsl.Component#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.xtext.rdsl.Component#getSupComponents <em>Sup Components</em>}</li>
 *   <li>{@link org.xtext.rdsl.Component#getSupComponent <em>Sup Component</em>}</li>
 * </ul>
 *
 * @see org.xtext.rdsl.RdslPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject
{
  /**
   * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rdsl.Comment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comments</em>' containment reference list.
   * @see org.xtext.rdsl.RdslPackage#getComponent_Comments()
   * @model containment="true"
   * @generated
   */
  EList<Comment> getComments();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.rdsl.RdslPackage#getComponent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Component#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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

  /**
   * Returns the value of the '<em><b>Sup Components</b></em>' reference list.
   * The list contents are of type {@link org.xtext.rdsl.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sup Components</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sup Components</em>' reference list.
   * @see org.xtext.rdsl.RdslPackage#getComponent_SupComponents()
   * @model
   * @generated
   */
  EList<Component> getSupComponents();

  /**
   * Returns the value of the '<em><b>Sup Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sup Component</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sup Component</em>' reference.
   * @see #setSupComponent(Component)
   * @see org.xtext.rdsl.RdslPackage#getComponent_SupComponent()
   * @model
   * @generated
   */
  Component getSupComponent();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Component#getSupComponent <em>Sup Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sup Component</em>' reference.
   * @see #getSupComponent()
   * @generated
   */
  void setSupComponent(Component value);

} // Component
