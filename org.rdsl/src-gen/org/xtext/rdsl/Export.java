/**
 */
package org.xtext.rdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Export</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.rdsl.Export#getExports <em>Exports</em>}</li>
 *   <li>{@link org.xtext.rdsl.Export#getExport <em>Export</em>}</li>
 * </ul>
 *
 * @see org.xtext.rdsl.RdslPackage#getExport()
 * @model
 * @generated
 */
public interface Export extends Property
{
  /**
   * Returns the value of the '<em><b>Exports</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rdsl.exportVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exports</em>' containment reference list.
   * @see org.xtext.rdsl.RdslPackage#getExport_Exports()
   * @model containment="true"
   * @generated
   */
  EList<exportVariable> getExports();

  /**
   * Returns the value of the '<em><b>Export</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Export</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Export</em>' containment reference.
   * @see #setExport(exportVariable)
   * @see org.xtext.rdsl.RdslPackage#getExport_Export()
   * @model containment="true"
   * @generated
   */
  exportVariable getExport();

  /**
   * Sets the value of the '{@link org.xtext.rdsl.Export#getExport <em>Export</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Export</em>' containment reference.
   * @see #getExport()
   * @generated
   */
  void setExport(exportVariable value);

} // Export
