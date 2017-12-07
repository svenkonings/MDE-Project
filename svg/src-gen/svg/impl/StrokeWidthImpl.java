/**
 */
package svg.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import svg.StrokeWidth;
import svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stroke Width</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link svg.impl.StrokeWidthImpl#getStrokeWidth <em>Stroke Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrokeWidthImpl extends AttributeImpl implements StrokeWidth {
	/**
	 * The default value of the '{@link #getStrokeWidth() <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeWidth()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal STROKE_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrokeWidth() <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeWidth()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal strokeWidth = STROKE_WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrokeWidthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.STROKE_WIDTH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getStrokeWidth() {
		return strokeWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeWidth(BigDecimal newStrokeWidth) {
		BigDecimal oldStrokeWidth = strokeWidth;
		strokeWidth = newStrokeWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.STROKE_WIDTH__STROKE_WIDTH, oldStrokeWidth,
					strokeWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SvgPackage.STROKE_WIDTH__STROKE_WIDTH:
			return getStrokeWidth();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SvgPackage.STROKE_WIDTH__STROKE_WIDTH:
			setStrokeWidth((BigDecimal) newValue);
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
		case SvgPackage.STROKE_WIDTH__STROKE_WIDTH:
			setStrokeWidth(STROKE_WIDTH_EDEFAULT);
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
		case SvgPackage.STROKE_WIDTH__STROKE_WIDTH:
			return STROKE_WIDTH_EDEFAULT == null ? strokeWidth != null : !STROKE_WIDTH_EDEFAULT.equals(strokeWidth);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (strokeWidth: ");
		result.append(strokeWidth);
		result.append(')');
		return result.toString();
	}

} //StrokeWidthImpl
