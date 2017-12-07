/**
 */
package svg.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import svg.RelativeSmoothQuadraticCurveTo;
import svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative Smooth Quadratic Curve To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link svg.impl.RelativeSmoothQuadraticCurveToImpl#getDx <em>Dx</em>}</li>
 *   <li>{@link svg.impl.RelativeSmoothQuadraticCurveToImpl#getDy <em>Dy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelativeSmoothQuadraticCurveToImpl extends PathValueImpl implements RelativeSmoothQuadraticCurveTo {
	/**
	 * The default value of the '{@link #getDx() <em>Dx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDx()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal DX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDx() <em>Dx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDx()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal dx = DX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDy() <em>Dy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDy()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal DY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDy() <em>Dy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDy()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal dy = DY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativeSmoothQuadraticCurveToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.RELATIVE_SMOOTH_QUADRATIC_CURVE_TO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getDx() {
		return dx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDx(BigDecimal newDx) {
		BigDecimal oldDx = dx;
		dx = newDx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RELATIVE_SMOOTH_QUADRATIC_CURVE_TO__DX,
					oldDx, dx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getDy() {
		return dy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDy(BigDecimal newDy) {
		BigDecimal oldDy = dy;
		dy = newDy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RELATIVE_SMOOTH_QUADRATIC_CURVE_TO__DY,
					oldDy, dy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SvgPackage.RELATIVE_SMOOTH_QUADRATIC_CURVE_TO__DX:
			return getDx();
		case SvgPackage.RELATIVE_SMOOTH_QUADRATIC_CURVE_TO__DY:
			return getDy();
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
		case SvgPackage.RELATIVE_SMOOTH_QUADRATIC_CURVE_TO__DX:
			setDx((BigDecimal) newValue);
			return;
		case SvgPackage.RELATIVE_SMOOTH_QUADRATIC_CURVE_TO__DY:
			setDy((BigDecimal) newValue);
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
		case SvgPackage.RELATIVE_SMOOTH_QUADRATIC_CURVE_TO__DX:
			setDx(DX_EDEFAULT);
			return;
		case SvgPackage.RELATIVE_SMOOTH_QUADRATIC_CURVE_TO__DY:
			setDy(DY_EDEFAULT);
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
		case SvgPackage.RELATIVE_SMOOTH_QUADRATIC_CURVE_TO__DX:
			return DX_EDEFAULT == null ? dx != null : !DX_EDEFAULT.equals(dx);
		case SvgPackage.RELATIVE_SMOOTH_QUADRATIC_CURVE_TO__DY:
			return DY_EDEFAULT == null ? dy != null : !DY_EDEFAULT.equals(dy);
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
		result.append(" (dx: ");
		result.append(dx);
		result.append(", dy: ");
		result.append(dy);
		result.append(')');
		return result.toString();
	}

} //RelativeSmoothQuadraticCurveToImpl
