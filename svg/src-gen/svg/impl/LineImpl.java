/**
 */
package svg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import svg.Coordinate;
import svg.Line;
import svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link svg.impl.LineImpl#getX1 <em>X1</em>}</li>
 *   <li>{@link svg.impl.LineImpl#getY1 <em>Y1</em>}</li>
 *   <li>{@link svg.impl.LineImpl#getX2 <em>X2</em>}</li>
 *   <li>{@link svg.impl.LineImpl#getY2 <em>Y2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineImpl extends GraphicElementImpl implements Line {
	/**
	 * The cached value of the '{@link #getX1() <em>X1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX1()
	 * @generated
	 * @ordered
	 */
	protected Coordinate x1;

	/**
	 * The cached value of the '{@link #getY1() <em>Y1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1()
	 * @generated
	 * @ordered
	 */
	protected Coordinate y1;

	/**
	 * The cached value of the '{@link #getX2() <em>X2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX2()
	 * @generated
	 * @ordered
	 */
	protected Coordinate x2;

	/**
	 * The cached value of the '{@link #getY2() <em>Y2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2()
	 * @generated
	 * @ordered
	 */
	protected Coordinate y2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinate getX1() {
		return x1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetX1(Coordinate newX1, NotificationChain msgs) {
		Coordinate oldX1 = x1;
		x1 = newX1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.LINE__X1, oldX1,
					newX1);
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
	public void setX1(Coordinate newX1) {
		if (newX1 != x1) {
			NotificationChain msgs = null;
			if (x1 != null)
				msgs = ((InternalEObject) x1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPackage.LINE__X1, null,
						msgs);
			if (newX1 != null)
				msgs = ((InternalEObject) newX1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPackage.LINE__X1, null,
						msgs);
			msgs = basicSetX1(newX1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.LINE__X1, newX1, newX1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinate getY1() {
		return y1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetY1(Coordinate newY1, NotificationChain msgs) {
		Coordinate oldY1 = y1;
		y1 = newY1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.LINE__Y1, oldY1,
					newY1);
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
	public void setY1(Coordinate newY1) {
		if (newY1 != y1) {
			NotificationChain msgs = null;
			if (y1 != null)
				msgs = ((InternalEObject) y1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPackage.LINE__Y1, null,
						msgs);
			if (newY1 != null)
				msgs = ((InternalEObject) newY1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPackage.LINE__Y1, null,
						msgs);
			msgs = basicSetY1(newY1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.LINE__Y1, newY1, newY1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinate getX2() {
		return x2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetX2(Coordinate newX2, NotificationChain msgs) {
		Coordinate oldX2 = x2;
		x2 = newX2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.LINE__X2, oldX2,
					newX2);
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
	public void setX2(Coordinate newX2) {
		if (newX2 != x2) {
			NotificationChain msgs = null;
			if (x2 != null)
				msgs = ((InternalEObject) x2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPackage.LINE__X2, null,
						msgs);
			if (newX2 != null)
				msgs = ((InternalEObject) newX2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPackage.LINE__X2, null,
						msgs);
			msgs = basicSetX2(newX2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.LINE__X2, newX2, newX2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinate getY2() {
		return y2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetY2(Coordinate newY2, NotificationChain msgs) {
		Coordinate oldY2 = y2;
		y2 = newY2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.LINE__Y2, oldY2,
					newY2);
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
	public void setY2(Coordinate newY2) {
		if (newY2 != y2) {
			NotificationChain msgs = null;
			if (y2 != null)
				msgs = ((InternalEObject) y2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPackage.LINE__Y2, null,
						msgs);
			if (newY2 != null)
				msgs = ((InternalEObject) newY2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPackage.LINE__Y2, null,
						msgs);
			msgs = basicSetY2(newY2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.LINE__Y2, newY2, newY2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SvgPackage.LINE__X1:
			return basicSetX1(null, msgs);
		case SvgPackage.LINE__Y1:
			return basicSetY1(null, msgs);
		case SvgPackage.LINE__X2:
			return basicSetX2(null, msgs);
		case SvgPackage.LINE__Y2:
			return basicSetY2(null, msgs);
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
		case SvgPackage.LINE__X1:
			return getX1();
		case SvgPackage.LINE__Y1:
			return getY1();
		case SvgPackage.LINE__X2:
			return getX2();
		case SvgPackage.LINE__Y2:
			return getY2();
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
		case SvgPackage.LINE__X1:
			setX1((Coordinate) newValue);
			return;
		case SvgPackage.LINE__Y1:
			setY1((Coordinate) newValue);
			return;
		case SvgPackage.LINE__X2:
			setX2((Coordinate) newValue);
			return;
		case SvgPackage.LINE__Y2:
			setY2((Coordinate) newValue);
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
		case SvgPackage.LINE__X1:
			setX1((Coordinate) null);
			return;
		case SvgPackage.LINE__Y1:
			setY1((Coordinate) null);
			return;
		case SvgPackage.LINE__X2:
			setX2((Coordinate) null);
			return;
		case SvgPackage.LINE__Y2:
			setY2((Coordinate) null);
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
		case SvgPackage.LINE__X1:
			return x1 != null;
		case SvgPackage.LINE__Y1:
			return y1 != null;
		case SvgPackage.LINE__X2:
			return x2 != null;
		case SvgPackage.LINE__Y2:
			return y2 != null;
		}
		return super.eIsSet(featureID);
	}

} //LineImpl
