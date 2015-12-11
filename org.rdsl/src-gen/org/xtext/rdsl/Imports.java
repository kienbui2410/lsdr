/**
 */
package org.xtext.rdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.Imports#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.rdsl.Imports#getImported <em>Imported</em>}</li>
 * </ul>
 *
 * @see org.xtext.rdsl.RdslPackage#getImports()
 * @model
 * @generated
 */
public interface Imports extends Property
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rdsl.importVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.xtext.rdsl.RdslPackage#getImports_Imports()
   * @model containment="true"
   * @generated
   */
  EList<importVariable> getImports();

  /**
   * Returns the value of the '<em><b>Imported</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported</em>' containment reference.
   * @see #setImported(importVariable)
   * @see org.xtext.rdsl.RdslPackage#getImports_Imported()
   * @model containment="true"
   * @generated
   */
  importVariable getImported();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Imports#getImported <em>Imported</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported</em>' containment reference.
   * @see #getImported()
   * @generated
   */
  void setImported(importVariable value);

} // Imports
