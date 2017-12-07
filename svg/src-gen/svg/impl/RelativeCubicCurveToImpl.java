/**
 */
package svg.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import svg.RelativeCubicCurveTo;
import svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative Cubic Curve To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link svg.impl.RelativeCubicCurveToImpl#getDc1x <em>Dc1x</em>}</li>
 *   <li>{@link svg.impl.RelativeCubicCurveToImpl#getDc1y <em>Dc1y</em>}</li>
 *   <li>{@link svg.impl.RelativeCubicCurveToImpl#getDc2x <em>Dc2x</em>}</li>
 *   <li>{@link svg.impl.RelativeCubicCurveToImpl#getDc2y <em>Dc2y</em>}</li>
 *   <li>{@link svg.impl.RelativeCubicCurveToImpl#getDx <em>Dx</em>}</li>
 *   <li>{@link svg.impl.RelativeCubicCurveToImpl#getDy <em>Dy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelativeCubicCurveToImpl extends PathValueImpl implements RelativeCubicCurveTo {
	/**
	 * The default value of the '{@link #getDc1x() <em>Dc1x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDc1x()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal DC1X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDc1x() <em>Dc1x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDc1x()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal dc1x = DC1X_EDEFAULT;

	/**
	 * The default value of the '{@link #getDc1y() <em>Dc1y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDc1y()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal DC1Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDc1y() <em>Dc1y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDc1y()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal dc1y = DC1Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getDc2x() <em>Dc2x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDc2x()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal DC2X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDc2x() <em>Dc2x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDc2x()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal dc2x = DC2X_EDEFAULT;

	/**
	 * The default value of the '{@link #getDc2y() <em>Dc2y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDc2y()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal DC2Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDc2y() <em>Dc2y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDc2y()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal dc2y = DC2Y_EDEFAULT;

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
	protected RelativeCubicCurveToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.RELATIVE_CUBIC_CURVE_TO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getDc1x() {
		return dc1x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDc1x(BigDecimal newDc1x) {
		BigDecimal oldDc1x = dc1x;
		dc1x = newDc1x;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RELATIVE_CUBIC_CURVE_TO__DC1X, oldDc1x,
					dc1x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getDc1y() {
		return dc1y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDc1y(BigDecimal newDc1y) {
		BigDecimal oldDc1y = dc1y;
		dc1y = newDc1y;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RELATIVE_CUBIC_CURVE_TO__DC1Y, oldDc1y,
					dc1y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getDc2x() {
		return dc2x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDc2x(BigDecimal newDc2x) {
		BigDecimal oldDc2x = dc2x;
		dc2x = newDc2x;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RELATIVE_CUBIC_CURVE_TO__DC2X, oldDc2x,
					dc2x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getDc2y() {
		return dc2y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDc2y(BigDecimal newDc2y) {
		BigDecimal oldDc2y = dc2y;
		dc2y = newDc2y;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RELATIVE_CUBIC_CURVE_TO__DC2Y, oldDc2y,
					dc2y));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RELATIVE_CUBIC_CURVE_TO__DX, oldDx, dx));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RELATIVE_CUBIC_CURVE_TO__DY, oldDy, dy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO__DC1X:
			return getDc1x();
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO__DC1Y:
			return getDc1y();
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO__DC2X:
			return getDc2x();
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO__DC2Y:
			return getDc2y();
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO__DX:
			return getDx();
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO__DY:
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
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO__DC1X:
			setDc1x((BigDecimal) newValue);
			return;
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO__DC1Y:
			setDc1y((BigDecimal) newValue);
			return;
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO__DC2X:
			setDc2x((BigDecimal) newValue);
			return;
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO__DC2Y:
			setDc2y((BigDecimal) newValue);
			return;
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO__DX:
			setDx((BigDecimal) newValue);
			return;
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO__DY:
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
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO__DC1X:
			setDc1x(DC1X_EDEFAULT);
			return;
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO__DC1Y:
			setDc1y(DC1Y_EDEFAULT);
			return;
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO__DC2X:
			setDc2x(DC2X_EDEFAULT);
			return;
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO__DC2Y:
			setDc2y(DC2Y_EDEFAULT);
			return;
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO__DX:
			setDx(DX_EDEFAULT);
			return;
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO__DY:
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
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO__DC1X:
			return DC1X_EDEFAULT == null ? dc1x != null : !DC1X_EDEFAULT.equals(dc1x);
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO__DC1Y:
			return DC1Y_EDEFAULT == null ? dc1y != null : !DC1Y_EDEFAULT.equals(dc1y);
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO__DC2X:
			return DC2X_EDEFAULT == null ? dc2x != null : !DC2X_EDEFAULT.equals(dc2x);
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO__DC2Y:
			return DC2Y_EDEFAULT == null ? dc2y != null : !DC2Y_EDEFAULT.equals(dc2y);
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO__DX:
			return DX_EDEFAULT == null ? dx != null : !DX_EDEFAULT.equals(dx);
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO__DY:
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
		result.append(" (dc1x: ");
		result.append(dc1x);
		result.append(", dc1y: ");
		result.append(dc1y);
		result.append(", dc2x: ");
		result.append(dc2x);
		result.append(", dc2y: ");
		result.append(dc2y);
		result.append(", dx: ");
		result.append(dx);
		result.append(", dy: ");
		result.append(dy);
		result.append(')');
		return result.toString();
	}

} //RelativeCubicCurveToImpl
