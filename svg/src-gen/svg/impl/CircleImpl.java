/**
 */
package svg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import svg.Circle;
import svg.Coordinate;
import svg.Length;
import svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link svg.impl.CircleImpl#getCx <em>Cx</em>}</li>
 *   <li>{@link svg.impl.CircleImpl#getCy <em>Cy</em>}</li>
 *   <li>{@link svg.impl.CircleImpl#getR <em>R</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CircleImpl extends GraphicElementImpl implements Circle {
	/**
	 * The cached value of the '{@link #getCx() <em>Cx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCx()
	 * @generated
	 * @ordered
	 */
	protected Coordinate cx;

	/**
	 * The cached value of the '{@link #getCy() <em>Cy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCy()
	 * @generated
	 * @ordered
	 */
	protected Coordinate cy;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected Length r;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.CIRCLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinate getCx() {
		return cx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCx(Coordinate newCx, NotificationChain msgs) {
		Coordinate oldCx = cx;
		cx = newCx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.CIRCLE__CX, oldCx,
					newCx);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCx(Coordinate newCx) {
		if (newCx != cx) {
			NotificationChain msgs = null;
			if (cx != null)
				msgs = ((InternalEObject) cx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPackage.CIRCLE__CX, null,
						msgs);
			if (newCx != null)
				msgs = ((InternalEObject) newCx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPackage.CIRCLE__CX, null,
						msgs);
			msgs = basicSetCx(newCx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.CIRCLE__CX, newCx, newCx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinate getCy() {
		return cy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCy(Coordinate newCy, NotificationChain msgs) {
		Coordinate oldCy = cy;
		cy = newCy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.CIRCLE__CY, oldCy,
					newCy);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCy(Coordinate newCy) {
		if (newCy != cy) {
			NotificationChain msgs = null;
			if (cy != null)
				msgs = ((InternalEObject) cy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPackage.CIRCLE__CY, null,
						msgs);
			if (newCy != null)
				msgs = ((InternalEObject) newCy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPackage.CIRCLE__CY, null,
						msgs);
			msgs = basicSetCy(newCy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.CIRCLE__CY, newCy, newCy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length getR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetR(Length newR, NotificationChain msgs) {
		Length oldR = r;
		r = newR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.CIRCLE__R, oldR,
					newR);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(Length newR) {
		if (newR != r) {
			NotificationChain msgs = null;
			if (r != null)
				msgs = ((InternalEObject) r).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPackage.CIRCLE__R, null,
						msgs);
			if (newR != null)
				msgs = ((InternalEObject) newR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPackage.CIRCLE__R, null,
						msgs);
			msgs = basicSetR(newR, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.CIRCLE__R, newR, newR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SvgPackage.CIRCLE__CX:
			return basicSetCx(null, msgs);
		case SvgPackage.CIRCLE__CY:
			return basicSetCy(null, msgs);
		case SvgPackage.CIRCLE__R:
			return basicSetR(null, msgs);
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
		case SvgPackage.CIRCLE__CX:
			return getCx();
		case SvgPackage.CIRCLE__CY:
			return getCy();
		case SvgPackage.CIRCLE__R:
			return getR();
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
		case SvgPackage.CIRCLE__CX:
			setCx((Coordinate) newValue);
			return;
		case SvgPackage.CIRCLE__CY:
			setCy((Coordinate) newValue);
			return;
		case SvgPackage.CIRCLE__R:
			setR((Length) newValue);
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
		case SvgPackage.CIRCLE__CX:
			setCx((Coordinate) null);
			return;
		case SvgPackage.CIRCLE__CY:
			setCy((Coordinate) null);
			return;
		case SvgPackage.CIRCLE__R:
			setR((Length) null);
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
		case SvgPackage.CIRCLE__CX:
			return cx != null;
		case SvgPackage.CIRCLE__CY:
			return cy != null;
		case SvgPackage.CIRCLE__R:
			return r != null;
		}
		return super.eIsSet(featureID);
	}

} //CircleImpl
