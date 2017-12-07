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
import svg.SvgPackage;
import svg.ViewBox;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link svg.impl.ViewBoxImpl#getMinX <em>Min X</em>}</li>
 *   <li>{@link svg.impl.ViewBoxImpl#getMinY <em>Min Y</em>}</li>
 *   <li>{@link svg.impl.ViewBoxImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link svg.impl.ViewBoxImpl#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewBoxImpl extends AttributeTypeImpl implements ViewBox {
	/**
	 * The cached value of the '{@link #getMinX() <em>Min X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinX()
	 * @generated
	 * @ordered
	 */
	protected Coordinate minX;

	/**
	 * The cached value of the '{@link #getMinY() <em>Min Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinY()
	 * @generated
	 * @ordered
	 */
	protected Coordinate minY;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.VIEW_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinate getMinX() {
		return minX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinX(Coordinate newMinX, NotificationChain msgs) {
		Coordinate oldMinX = minX;
		minX = newMinX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.VIEW_BOX__MIN_X,
					oldMinX, newMinX);
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
	public void setMinX(Coordinate newMinX) {
		if (newMinX != minX) {
			NotificationChain msgs = null;
			if (minX != null)
				msgs = ((InternalEObject) minX).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SvgPackage.VIEW_BOX__MIN_X, null, msgs);
			if (newMinX != null)
				msgs = ((InternalEObject) newMinX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SvgPackage.VIEW_BOX__MIN_X, null, msgs);
			msgs = basicSetMinX(newMinX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.VIEW_BOX__MIN_X, newMinX, newMinX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinate getMinY() {
		return minY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinY(Coordinate newMinY, NotificationChain msgs) {
		Coordinate oldMinY = minY;
		minY = newMinY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.VIEW_BOX__MIN_Y,
					oldMinY, newMinY);
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
	public void setMinY(Coordinate newMinY) {
		if (newMinY != minY) {
			NotificationChain msgs = null;
			if (minY != null)
				msgs = ((InternalEObject) minY).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SvgPackage.VIEW_BOX__MIN_Y, null, msgs);
			if (newMinY != null)
				msgs = ((InternalEObject) newMinY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SvgPackage.VIEW_BOX__MIN_Y, null, msgs);
			msgs = basicSetMinY(newMinY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.VIEW_BOX__MIN_Y, newMinY, newMinY));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.VIEW_BOX__WIDTH,
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
				msgs = ((InternalEObject) width).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SvgPackage.VIEW_BOX__WIDTH, null, msgs);
			if (newWidth != null)
				msgs = ((InternalEObject) newWidth).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SvgPackage.VIEW_BOX__WIDTH, null, msgs);
			msgs = basicSetWidth(newWidth, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.VIEW_BOX__WIDTH, newWidth, newWidth));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.VIEW_BOX__HEIGHT,
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
				msgs = ((InternalEObject) height).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SvgPackage.VIEW_BOX__HEIGHT, null, msgs);
			if (newHeight != null)
				msgs = ((InternalEObject) newHeight).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SvgPackage.VIEW_BOX__HEIGHT, null, msgs);
			msgs = basicSetHeight(newHeight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.VIEW_BOX__HEIGHT, newHeight, newHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SvgPackage.VIEW_BOX__MIN_X:
			return basicSetMinX(null, msgs);
		case SvgPackage.VIEW_BOX__MIN_Y:
			return basicSetMinY(null, msgs);
		case SvgPackage.VIEW_BOX__WIDTH:
			return basicSetWidth(null, msgs);
		case SvgPackage.VIEW_BOX__HEIGHT:
			return basicSetHeight(null, msgs);
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
		case SvgPackage.VIEW_BOX__MIN_X:
			return getMinX();
		case SvgPackage.VIEW_BOX__MIN_Y:
			return getMinY();
		case SvgPackage.VIEW_BOX__WIDTH:
			return getWidth();
		case SvgPackage.VIEW_BOX__HEIGHT:
			return getHeight();
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
		case SvgPackage.VIEW_BOX__MIN_X:
			setMinX((Coordinate) newValue);
			return;
		case SvgPackage.VIEW_BOX__MIN_Y:
			setMinY((Coordinate) newValue);
			return;
		case SvgPackage.VIEW_BOX__WIDTH:
			setWidth((Length) newValue);
			return;
		case SvgPackage.VIEW_BOX__HEIGHT:
			setHeight((Length) newValue);
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
		case SvgPackage.VIEW_BOX__MIN_X:
			setMinX((Coordinate) null);
			return;
		case SvgPackage.VIEW_BOX__MIN_Y:
			setMinY((Coordinate) null);
			return;
		case SvgPackage.VIEW_BOX__WIDTH:
			setWidth((Length) null);
			return;
		case SvgPackage.VIEW_BOX__HEIGHT:
			setHeight((Length) null);
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
		case SvgPackage.VIEW_BOX__MIN_X:
			return minX != null;
		case SvgPackage.VIEW_BOX__MIN_Y:
			return minY != null;
		case SvgPackage.VIEW_BOX__WIDTH:
			return width != null;
		case SvgPackage.VIEW_BOX__HEIGHT:
			return height != null;
		}
		return super.eIsSet(featureID);
	}

} //ViewBoxImpl
