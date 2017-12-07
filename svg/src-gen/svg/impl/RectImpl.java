/**
 */
package svg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import svg.Coordinate;
import svg.Length;
import svg.Rect;
import svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link svg.impl.RectImpl#getX <em>X</em>}</li>
 *   <li>{@link svg.impl.RectImpl#getY <em>Y</em>}</li>
 *   <li>{@link svg.impl.RectImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link svg.impl.RectImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link svg.impl.RectImpl#getRx <em>Rx</em>}</li>
 *   <li>{@link svg.impl.RectImpl#getRy <em>Ry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RectImpl extends GraphicElementImpl implements Rect {
	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected Coordinate x;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected Coordinate y;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Length width;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected Length height;

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
	protected RectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.RECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinate getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetX(Coordinate newX, NotificationChain msgs) {
		Coordinate oldX = x;
		x = newX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.RECT__X, oldX,
					newX);
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
	public void setX(Coordinate newX) {
		if (newX != x) {
			NotificationChain msgs = null;
			if (x != null)
				msgs = ((InternalEObject) x).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPackage.RECT__X, null,
						msgs);
			if (newX != null)
				msgs = ((InternalEObject) newX).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPackage.RECT__X, null,
						msgs);
			msgs = basicSetX(newX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RECT__X, newX, newX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinate getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetY(Coordinate newY, NotificationChain msgs) {
		Coordinate oldY = y;
		y = newY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.RECT__Y, oldY,
					newY);
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
	public void setY(Coordinate newY) {
		if (newY != y) {
			NotificationChain msgs = null;
			if (y != null)
				msgs = ((InternalEObject) y).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPackage.RECT__Y, null,
						msgs);
			if (newY != null)
				msgs = ((InternalEObject) newY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPackage.RECT__Y, null,
						msgs);
			msgs = basicSetY(newY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RECT__Y, newY, newY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWidth(Length newWidth, NotificationChain msgs) {
		Length oldWidth = width;
		width = newWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.RECT__WIDTH,
					oldWidth, newWidth);
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
	public void setWidth(Length newWidth) {
		if (newWidth != width) {
			NotificationChain msgs = null;
			if (width != null)
				msgs = ((InternalEObject) width).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPackage.RECT__WIDTH,
						null, msgs);
			if (newWidth != null)
				msgs = ((InternalEObject) newWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPackage.RECT__WIDTH,
						null, msgs);
			msgs = basicSetWidth(newWidth, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RECT__WIDTH, newWidth, newWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeight(Length newHeight, NotificationChain msgs) {
		Length oldHeight = height;
		height = newHeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.RECT__HEIGHT,
					oldHeight, newHeight);
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
	public void setHeight(Length newHeight) {
		if (newHeight != height) {
			NotificationChain msgs = null;
			if (height != null)
				msgs = ((InternalEObject) height).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPackage.RECT__HEIGHT,
						null, msgs);
			if (newHeight != null)
				msgs = ((InternalEObject) newHeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPackage.RECT__HEIGHT,
						null, msgs);
			msgs = basicSetHeight(newHeight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RECT__HEIGHT, newHeight, newHeight));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.RECT__RX, oldRx,
					newRx);
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
				msgs = ((InternalEObject) rx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPackage.RECT__RX, null,
						msgs);
			if (newRx != null)
				msgs = ((InternalEObject) newRx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPackage.RECT__RX, null,
						msgs);
			msgs = basicSetRx(newRx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RECT__RX, newRx, newRx));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.RECT__RY, oldRy,
					newRy);
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
				msgs = ((InternalEObject) ry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPackage.RECT__RY, null,
						msgs);
			if (newRy != null)
				msgs = ((InternalEObject) newRy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPackage.RECT__RY, null,
						msgs);
			msgs = basicSetRy(newRy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RECT__RY, newRy, newRy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SvgPackage.RECT__X:
			return basicSetX(null, msgs);
		case SvgPackage.RECT__Y:
			return basicSetY(null, msgs);
		case SvgPackage.RECT__WIDTH:
			return basicSetWidth(null, msgs);
		case SvgPackage.RECT__HEIGHT:
			return basicSetHeight(null, msgs);
		case SvgPackage.RECT__RX:
			return basicSetRx(null, msgs);
		case SvgPackage.RECT__RY:
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
		case SvgPackage.RECT__X:
			return getX();
		case SvgPackage.RECT__Y:
			return getY();
		case SvgPackage.RECT__WIDTH:
			return getWidth();
		case SvgPackage.RECT__HEIGHT:
			return getHeight();
		case SvgPackage.RECT__RX:
			return getRx();
		case SvgPackage.RECT__RY:
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
		case SvgPackage.RECT__X:
			setX((Coordinate) newValue);
			return;
		case SvgPackage.RECT__Y:
			setY((Coordinate) newValue);
			return;
		case SvgPackage.RECT__WIDTH:
			setWidth((Length) newValue);
			return;
		case SvgPackage.RECT__HEIGHT:
			setHeight((Length) newValue);
			return;
		case SvgPackage.RECT__RX:
			setRx((Length) newValue);
			return;
		case SvgPackage.RECT__RY:
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
		case SvgPackage.RECT__X:
			setX((Coordinate) null);
			return;
		case SvgPackage.RECT__Y:
			setY((Coordinate) null);
			return;
		case SvgPackage.RECT__WIDTH:
			setWidth((Length) null);
			return;
		case SvgPackage.RECT__HEIGHT:
			setHeight((Length) null);
			return;
		case SvgPackage.RECT__RX:
			setRx((Length) null);
			return;
		case SvgPackage.RECT__RY:
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
		case SvgPackage.RECT__X:
			return x != null;
		case SvgPackage.RECT__Y:
			return y != null;
		case SvgPackage.RECT__WIDTH:
			return width != null;
		case SvgPackage.RECT__HEIGHT:
			return height != null;
		case SvgPackage.RECT__RX:
			return rx != null;
		case SvgPackage.RECT__RY:
			return ry != null;
		}
		return super.eIsSet(featureID);
	}

} //RectImpl
