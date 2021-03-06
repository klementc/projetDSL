/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.dSLSAT.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.dSLSAT.DSLSATPackage;
import org.xtext.example.mydsl.dSLSAT.Form;
import org.xtext.example.mydsl.dSLSAT.NotForm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.dSLSAT.impl.NotFormImpl#getForm <em>Form</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotFormImpl extends FormImpl implements NotForm
{
  /**
   * The cached value of the '{@link #getForm() <em>Form</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForm()
   * @generated
   * @ordered
   */
  protected Form form;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NotFormImpl()
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
    return DSLSATPackage.Literals.NOT_FORM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Form getForm()
  {
    return form;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForm(Form newForm, NotificationChain msgs)
  {
    Form oldForm = form;
    form = newForm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DSLSATPackage.NOT_FORM__FORM, oldForm, newForm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForm(Form newForm)
  {
    if (newForm != form)
    {
      NotificationChain msgs = null;
      if (form != null)
        msgs = ((InternalEObject)form).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DSLSATPackage.NOT_FORM__FORM, null, msgs);
      if (newForm != null)
        msgs = ((InternalEObject)newForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DSLSATPackage.NOT_FORM__FORM, null, msgs);
      msgs = basicSetForm(newForm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLSATPackage.NOT_FORM__FORM, newForm, newForm));
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
      case DSLSATPackage.NOT_FORM__FORM:
        return basicSetForm(null, msgs);
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
      case DSLSATPackage.NOT_FORM__FORM:
        return getForm();
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
      case DSLSATPackage.NOT_FORM__FORM:
        setForm((Form)newValue);
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
      case DSLSATPackage.NOT_FORM__FORM:
        setForm((Form)null);
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
      case DSLSATPackage.NOT_FORM__FORM:
        return form != null;
    }
    return super.eIsSet(featureID);
  }

} //NotFormImpl
