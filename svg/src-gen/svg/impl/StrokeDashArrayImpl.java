/**
 */
package svg.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import svg.Length;
import svg.StrokeDashArray;
import svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stroke Dash Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link svg.impl.StrokeDashArrayImpl#getStrokeDashArray <em>Stroke Dash Array</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrokeDashArrayImpl extends AttributeImpl implements StrokeDashArray {
	/**
	 * The cached value of the '{@link #getStrokeDashArray() <em>Stroke Dash Array</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDashArray()
	 * @generated
	 * @ordered
	 */
	protected EList<Length> strokeDashArray;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrokeDashArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.STROKE_DASH_ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Length> getStrokeDashArray() {
		if (strokeDashArray == null) {
			strokeDashArray = new EObjectContainmentEList<Length>(Length.class, this,
					SvgPackage.STROKE_DASH_ARRAY__STROKE_DASH_ARRAY);
		}
		return strokeDashArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SvgPackage.STROKE_DASH_ARRAY__STROKE_DASH_ARRAY:
			return ((InternalEList<?>) getStrokeDashArray()).basicRemove(otherEnd, msgs);
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
		case SvgPackage.STROKE_DASH_ARRAY__STROKE_DASH_ARRAY:
			return getStrokeDashArray();
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
		case SvgPackage.STROKE_DASH_ARRAY__STROKE_DASH_ARRAY:
			getStrokeDashArray().clear();
			getStrokeDashArray().addAll((Collection<? extends Length>) newValue);
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
		case SvgPackage.STROKE_DASH_ARRAY__STROKE_DASH_ARRAY:
			getStrokeDashArray().clear();
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
		case SvgPackage.STROKE_DASH_ARRAY__STROKE_DASH_ARRAY:
			return strokeDashArray != null && !strokeDashArray.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StrokeDashArrayImpl
