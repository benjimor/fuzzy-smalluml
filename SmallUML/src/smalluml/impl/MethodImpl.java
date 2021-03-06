/**
 */
package smalluml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smalluml.Attribute;
import smalluml.Method;
import smalluml.SmallumlPackage;
import smalluml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smalluml.impl.MethodImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link smalluml.impl.MethodImpl#getReturnTypedValue <em>Return Typed Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends NamedElementImpl implements Method {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> parameters;

	/**
	 * The cached value of the '{@link #getReturnTypedValue() <em>Return Typed Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnTypedValue()
	 * @generated
	 * @ordered
	 */
	protected Type returnTypedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmallumlPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Attribute>(Attribute.class, this, SmallumlPackage.METHOD__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getReturnTypedValue() {
		if (returnTypedValue != null && returnTypedValue.eIsProxy()) {
			InternalEObject oldReturnTypedValue = (InternalEObject)returnTypedValue;
			returnTypedValue = (Type)eResolveProxy(oldReturnTypedValue);
			if (returnTypedValue != oldReturnTypedValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmallumlPackage.METHOD__RETURN_TYPED_VALUE, oldReturnTypedValue, returnTypedValue));
			}
		}
		return returnTypedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetReturnTypedValue() {
		return returnTypedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnTypedValue(Type newReturnTypedValue) {
		Type oldReturnTypedValue = returnTypedValue;
		returnTypedValue = newReturnTypedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.METHOD__RETURN_TYPED_VALUE, oldReturnTypedValue, returnTypedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmallumlPackage.METHOD__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmallumlPackage.METHOD__PARAMETERS:
				return getParameters();
			case SmallumlPackage.METHOD__RETURN_TYPED_VALUE:
				if (resolve) return getReturnTypedValue();
				return basicGetReturnTypedValue();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmallumlPackage.METHOD__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Attribute>)newValue);
				return;
			case SmallumlPackage.METHOD__RETURN_TYPED_VALUE:
				setReturnTypedValue((Type)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case SmallumlPackage.METHOD__PARAMETERS:
				getParameters().clear();
				return;
			case SmallumlPackage.METHOD__RETURN_TYPED_VALUE:
				setReturnTypedValue((Type)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SmallumlPackage.METHOD__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case SmallumlPackage.METHOD__RETURN_TYPED_VALUE:
				return returnTypedValue != null;
		}
		return super.eIsSet(featureID);
	}

} //MethodImpl
