/**
 */
package svg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import svg.Coordinate;
import svg.Ellipse;
import svg.Length;
import svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ellipse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link svg.impl.EllipseImpl#getCx <em>Cx</em>}</li>
 *   <li>{@link svg.impl.EllipseImpl#getCy <em>Cy</em>}</li>
 *   <li>{@link svg.impl.EllipseImpl#getRx <em>Rx</em>}</li>
 *   <li>{@link svg.impl.EllipseImpl#getRy <em>Ry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EllipseImpl extends GraphicElementImpl implements Ellipse {
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
	 * The cached value of the '{@link #getRx() <em>Rx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx()
	 * @generated
	 * @ordered
	 */
	protected Length rx;

	/**
	 * The cached value of the '{@link #getRy() <em>Ry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRy()
	 * @generated
	 * @ordered
	 */
	protected Length ry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EllipseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.ELLIPSE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.ELLIPSE__CX,
					oldCx, newCx);
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
				msgs = ((InternalEObject) cx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPackage.ELLIPSE__CX,
						null, msgs);
			if (newCx != null)
				msgs = ((InternalEObject) newCx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPackage.ELLIPSE__CX,
						null, msgs);
			msgs = basicSetCx(newCx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.ELLIPSE__CX, newCx, newCx));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.ELLIPSE__CY,
					oldCy, newCy);
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
				msgs = ((InternalEObject) cy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPackage.ELLIPSE__CY,
						null, msgs);
			if (newCy != null)
				msgs = ((InternalEObject) newCy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPackage.ELLIPSE__CY,
						null, msgs);
			msgs = basicSetCy(newCy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.ELLIPSE__CY, newCy, newCy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length getRx() {
		return rx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRx(Length newRx, NotificationChain msgs) {
		Length oldRx = rx;
		rx = newRx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.ELLIPSE__RX,
					oldRx, newRx);
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
	public void setRx(Length newRx) {
		if (newRx != rx) {
			NotificationChain msgs = null;
			if (rx != null)
				msgs = ((InternalEObject) rx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPackage.ELLIPSE__RX,
						null, msgs);
			if (newRx != null)
				msgs = ((InternalEObject) newRx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPackage.ELLIPSE__RX,
						null, msgs);
			msgs = basicSetRx(newRx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.ELLIPSE__RX, newRx, newRx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length getRy() {
		return ry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRy(Length newRy, NotificationChain msgs) {
		Length oldRy = ry;
		ry = newRy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.ELLIPSE__RY,
					oldRy, newRy);
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
	public void setRy(Length newRy) {
		if (newRy != ry) {
			NotificationChain msgs = null;
			if (ry != null)
				msgs = ((InternalEObject) ry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPackage.ELLIPSE__RY,
						null, msgs);
			if (newRy != null)
				msgs = ((InternalEObject) newRy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPackage.ELLIPSE__RY,
						null, msgs);
			msgs = basicSetRy(newRy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.ELLIPSE__RY, newRy, newRy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SvgPackage.ELLIPSE__CX:
			return basicSetCx(null, msgs);
		case SvgPackage.ELLIPSE__CY:
			return basicSetCy(null, msgs);
		case SvgPackage.ELLIPSE__RX:
			return basicSetRx(null, msgs);
		case SvgPackage.ELLIPSE__RY:
			return basicSetRy(null, msgs);
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
		case SvgPackage.ELLIPSE__CX:
			return getCx();
		case SvgPackage.ELLIPSE__CY:
			return getCy();
		case SvgPackage.ELLIPSE__RX:
			return getRx();
		case SvgPackage.ELLIPSE__RY:
			return getRy();
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
		case SvgPackage.ELLIPSE__CX:
			setCx((Coordinate) newValue);
			return;
		case SvgPackage.ELLIPSE__CY:
			setCy((Coordinate) newValue);
			return;
		case SvgPackage.ELLIPSE__RX:
			setRx((Length) newValue);
			return;
		case SvgPackage.ELLIPSE__RY:
			setRy((Length) newValue);
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
		case SvgPackage.ELLIPSE__CX:
			setCx((Coordinate) null);
			return;
		case SvgPackage.ELLIPSE__CY:
			setCy((Coordinate) null);
			return;
		case SvgPackage.ELLIPSE__RX:
			setRx((Length) null);
			return;
		case SvgPackage.ELLIPSE__RY:
			setRy((Length) null);
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
		case SvgPackage.ELLIPSE__CX:
			return cx != null;
		case SvgPackage.ELLIPSE__CY:
			return cy != null;
		case SvgPackage.ELLIPSE__RX:
			return rx != null;
		case SvgPackage.ELLIPSE__RY:
			return ry != null;
		}
		return super.eIsSet(featureID);
	}

} //EllipseImpl
