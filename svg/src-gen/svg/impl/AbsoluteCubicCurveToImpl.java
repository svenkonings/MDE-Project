/**
 */
package svg.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import svg.AbsoluteCubicCurveTo;
import svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Absolute Cubic Curve To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link svg.impl.AbsoluteCubicCurveToImpl#getC1x <em>C1x</em>}</li>
 *   <li>{@link svg.impl.AbsoluteCubicCurveToImpl#getC1y <em>C1y</em>}</li>
 *   <li>{@link svg.impl.AbsoluteCubicCurveToImpl#getC2x <em>C2x</em>}</li>
 *   <li>{@link svg.impl.AbsoluteCubicCurveToImpl#getC2y <em>C2y</em>}</li>
 *   <li>{@link svg.impl.AbsoluteCubicCurveToImpl#getX <em>X</em>}</li>
 *   <li>{@link svg.impl.AbsoluteCubicCurveToImpl#getY <em>Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbsoluteCubicCurveToImpl extends PathValueImpl implements AbsoluteCubicCurveTo {
	/**
	 * The default value of the '{@link #getC1x() <em>C1x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC1x()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal C1X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getC1x() <em>C1x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC1x()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal c1x = C1X_EDEFAULT;

	/**
	 * The default value of the '{@link #getC1y() <em>C1y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC1y()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal C1Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getC1y() <em>C1y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC1y()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal c1y = C1Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getC2x() <em>C2x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC2x()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal C2X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getC2x() <em>C2x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC2x()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal c2x = C2X_EDEFAULT;

	/**
	 * The default value of the '{@link #getC2y() <em>C2y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC2y()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal C2Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getC2y() <em>C2y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC2y()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal c2y = C2Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal y = Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbsoluteCubicCurveToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.ABSOLUTE_CUBIC_CURVE_TO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getC1x() {
		return c1x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC1x(BigDecimal newC1x) {
		BigDecimal oldC1x = c1x;
		c1x = newC1x;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__C1X, oldC1x,
					c1x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getC1y() {
		return c1y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC1y(BigDecimal newC1y) {
		BigDecimal oldC1y = c1y;
		c1y = newC1y;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__C1Y, oldC1y,
					c1y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getC2x() {
		return c2x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC2x(BigDecimal newC2x) {
		BigDecimal oldC2x = c2x;
		c2x = newC2x;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__C2X, oldC2x,
					c2x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getC2y() {
		return c2y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC2y(BigDecimal newC2y) {
		BigDecimal oldC2y = c2y;
		c2y = newC2y;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__C2Y, oldC2y,
					c2y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(BigDecimal newX) {
		BigDecimal oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(BigDecimal newY) {
		BigDecimal oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__C1X:
			return getC1x();
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__C1Y:
			return getC1y();
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__C2X:
			return getC2x();
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__C2Y:
			return getC2y();
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__X:
			return getX();
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__Y:
			return getY();
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
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__C1X:
			setC1x((BigDecimal) newValue);
			return;
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__C1Y:
			setC1y((BigDecimal) newValue);
			return;
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__C2X:
			setC2x((BigDecimal) newValue);
			return;
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__C2Y:
			setC2y((BigDecimal) newValue);
			return;
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__X:
			setX((BigDecimal) newValue);
			return;
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__Y:
			setY((BigDecimal) newValue);
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
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__C1X:
			setC1x(C1X_EDEFAULT);
			return;
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__C1Y:
			setC1y(C1Y_EDEFAULT);
			return;
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__C2X:
			setC2x(C2X_EDEFAULT);
			return;
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__C2Y:
			setC2y(C2Y_EDEFAULT);
			return;
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__X:
			setX(X_EDEFAULT);
			return;
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__Y:
			setY(Y_EDEFAULT);
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
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__C1X:
			return C1X_EDEFAULT == null ? c1x != null : !C1X_EDEFAULT.equals(c1x);
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__C1Y:
			return C1Y_EDEFAULT == null ? c1y != null : !C1Y_EDEFAULT.equals(c1y);
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__C2X:
			return C2X_EDEFAULT == null ? c2x != null : !C2X_EDEFAULT.equals(c2x);
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__C2Y:
			return C2Y_EDEFAULT == null ? c2y != null : !C2Y_EDEFAULT.equals(c2y);
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__X:
			return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO__Y:
			return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
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
		result.append(" (c1x: ");
		result.append(c1x);
		result.append(", c1y: ");
		result.append(c1y);
		result.append(", c2x: ");
		result.append(c2x);
		result.append(", c2y: ");
		result.append(c2y);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(')');
		return result.toString();
	}

} //AbsoluteCubicCurveToImpl
