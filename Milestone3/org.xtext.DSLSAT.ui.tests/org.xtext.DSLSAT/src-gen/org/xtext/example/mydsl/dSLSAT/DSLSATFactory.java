/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.dSLSAT;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.dSLSAT.DSLSATPackage
 * @generated
 */
public interface DSLSATFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DSLSATFactory eINSTANCE = org.xtext.example.mydsl.dSLSAT.impl.DSLSATFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Form</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Form</em>'.
   * @generated
   */
  Form createForm();

  /**
   * Returns a new object of class '<em>Var</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var</em>'.
   * @generated
   */
  Var createVar();

  /**
   * Returns a new object of class '<em>Const</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Const</em>'.
   * @generated
   */
  Const createConst();

  /**
   * Returns a new object of class '<em>Bi Impl Form</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bi Impl Form</em>'.
   * @generated
   */
  BiImplForm createBiImplForm();

  /**
   * Returns a new object of class '<em>Impl Form</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Impl Form</em>'.
   * @generated
   */
  ImplForm createImplForm();

  /**
   * Returns a new object of class '<em>Or Form</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Form</em>'.
   * @generated
   */
  OrForm createOrForm();

  /**
   * Returns a new object of class '<em>And Form</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Form</em>'.
   * @generated
   */
  AndForm createAndForm();

  /**
   * Returns a new object of class '<em>Nand Form</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nand Form</em>'.
   * @generated
   */
  NandForm createNandForm();

  /**
   * Returns a new object of class '<em>Not Form</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Form</em>'.
   * @generated
   */
  NotForm createNotForm();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DSLSATPackage getDSLSATPackage();

} //DSLSATFactory
