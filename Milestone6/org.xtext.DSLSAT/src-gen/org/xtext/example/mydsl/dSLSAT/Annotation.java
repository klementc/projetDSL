/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.dSLSAT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.dSLSAT.Annotation#getSolver <em>Solver</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.dSLSAT.DSLSATPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends EObject
{
  /**
   * Returns the value of the '<em><b>Solver</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Solver</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Solver</em>' attribute.
   * @see #setSolver(String)
   * @see org.xtext.example.mydsl.dSLSAT.DSLSATPackage#getAnnotation_Solver()
   * @model
   * @generated
   */
  String getSolver();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.dSLSAT.Annotation#getSolver <em>Solver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Solver</em>' attribute.
   * @see #getSolver()
   * @generated
   */
  void setSolver(String value);

} // Annotation
