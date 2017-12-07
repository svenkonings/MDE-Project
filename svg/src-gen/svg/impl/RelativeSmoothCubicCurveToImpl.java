/**
 */
package svg.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import svg.RelativeSmoothCubicCurveTo;
import svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative Smooth Cubic Curve To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link svg.impl.RelativeSmoothCubicCurveToImpl#getDcx <em>Dcx</em>}</li>
 *   <li>{@link svg.impl.RelativeSmoothCubicCurveToImpl#getDcy <em>Dcy</em>}</li>
 *   <li>{@link svg.impl.RelativeSmoothCubicCurveToImpl#getDx <em>Dx</em>}</li>
 *   <li>{@link svg.impl.RelativeSmoothCubicCurveToImpl#getDy <em>Dy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelativeSmoothCubicCurveToImpl extends PathValueImpl implements RelativeSmoothCubicCurveTo {
	/**
	 * The default value of the '{@link #getDcx() <em>Dcx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcx()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal DCX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDcx() <em>Dcx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcx()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal dcx = DCX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDcy() <em>Dcy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcy()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal DCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDcy() <em>Dcy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcy()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal dcy = DCY_EDEFAULT;

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
	protected RelativeSmoothCubicCurveToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.RELATIVE_SMOOTH_CUBIC_CURVE_TO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getDcx() {
		return dcx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDcx(BigDecimal newDcx) {
		BigDecimal oldDcx = dcx;
		dcx = newDcx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RELATIVE_SMOOTH_CUBIC_CURVE_TO__DCX,
					oldDcx, dcx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getDcy() {
		return dcy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDcy(BigDecimal newDcy) {
		BigDecimal oldDcy = dcy;
		dcy = newDcy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RELATIVE_SMOOTH_CUBIC_CURVE_TO__DCY,
					oldDcy, dcy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RELATIVE_SMOOTH_CUBIC_CURVE_TO__DX, oldDx,
					dx));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RELATIVE_SMOOTH_CUBIC_CURVE_TO__DY, oldDy,
					dy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SvgPackage.RELATIVE_SMOOTH_CUBIC_CURVE_TO__DCX:
			return getDcx();
		case SvgPackage.RELATIVE_SMOOTH_CUBIC_CURVE_TO__DCY:
			return getDcy();
		case SvgPackage.RELATIVE_SMOOTH_CUBIC_CURVE_TO__DX:
			return getDx();
		case SvgPackage.RELATIVE_SMOOTH_CUBIC_CURVE_TO__DY:
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
		case SvgPackage.RELATIVE_SMOOTH_CUBIC_CURVE_TO__DCX:
			setDcx((BigDecimal) newValue);
			return;
		case SvgPackage.RELATIVE_SMOOTH_CUBIC_CURVE_TO__DCY:
			setDcy((BigDecimal) newValue);
			return;
		case SvgPackage.RELATIVE_SMOOTH_CUBIC_CURVE_TO__DX:
			setDx((BigDecimal) newValue);
			return;
		case SvgPackage.RELATIVE_SMOOTH_CUBIC_CURVE_TO__DY:
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
		case SvgPackage.RELATIVE_SMOOTH_CUBIC_CURVE_TO__DCX:
			setDcx(DCX_EDEFAULT);
			return;
		case SvgPackage.RELATIVE_SMOOTH_CUBIC_CURVE_TO__DCY:
			setDcy(DCY_EDEFAULT);
			return;
		case SvgPackage.RELATIVE_SMOOTH_CUBIC_CURVE_TO__DX:
			setDx(DX_EDEFAULT);
			return;
		case SvgPackage.RELATIVE_SMOOTH_CUBIC_CURVE_TO__DY:
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
		case SvgPackage.RELATIVE_SMOOTH_CUBIC_CURVE_TO__DCX:
			return DCX_EDEFAULT == null ? dcx != null : !DCX_EDEFAULT.equals(dcx);
		case SvgPackage.RELATIVE_SMOOTH_CUBIC_CURVE_TO__DCY:
			return DCY_EDEFAULT == null ? dcy != null : !DCY_EDEFAULT.equals(dcy);
		case SvgPackage.RELATIVE_SMOOTH_CUBIC_CURVE_TO__DX:
			return DX_EDEFAULT == null ? dx != null : !DX_EDEFAULT.equals(dx);
		case SvgPackage.RELATIVE_SMOOTH_CUBIC_CURVE_TO__DY:
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
		result.append(" (dcx: ");
		result.append(dcx);
		result.append(", dcy: ");
		result.append(dcy);
		result.append(", dx: ");
		result.append(dx);
		result.append(", dy: ");
		result.append(dy);
		result.append(')');
		return result.toString();
	}

} //RelativeSmoothCubicCurveToImpl
