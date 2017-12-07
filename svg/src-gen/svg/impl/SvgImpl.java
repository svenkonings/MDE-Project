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
import svg.PreserveAspectRatio;
import svg.Svg;
import svg.SvgPackage;
import svg.ViewBox;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Svg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link svg.impl.SvgImpl#getX <em>X</em>}</li>
 *   <li>{@link svg.impl.SvgImpl#getY <em>Y</em>}</li>
 *   <li>{@link svg.impl.SvgImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link svg.impl.SvgImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link svg.impl.SvgImpl#getPreserveAspectRatio <em>Preserve Aspect Ratio</em>}</li>
 *   <li>{@link svg.impl.SvgImpl#getViewBox <em>View Box</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SvgImpl extends GroupImpl implements Svg {
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
	 * The cached value of the '{@link #getPreserveAspectRatio() <em>Preserve Aspect Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreserveAspectRatio()
	 * @generated
	 * @ordered
	 */
	protected PreserveAspectRatio preserveAspectRatio;

	/**
	 * The cached value of the '{@link #getViewBox() <em>View Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewBox()
	 * @generated
	 * @ordered
	 */
	protected ViewBox viewBox;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SvgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.SVG;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.SVG__X, oldX,
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
				msgs = ((InternalEObject) x).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPackage.SVG__X, null,
						msgs);
			if (newX != null)
				msgs = ((InternalEObject) newX).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPackage.SVG__X, null,
						msgs);
			msgs = basicSetX(newX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG__X, newX, newX));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.SVG__Y, oldY,
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
				msgs = ((InternalEObject) y).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPackage.SVG__Y, null,
						msgs);
			if (newY != null)
				msgs = ((InternalEObject) newY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPackage.SVG__Y, null,
						msgs);
			msgs = basicSetY(newY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG__Y, newY, newY));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.SVG__WIDTH,
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
				msgs = ((InternalEObject) width).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPackage.SVG__WIDTH,
						null, msgs);
			if (newWidth != null)
				msgs = ((InternalEObject) newWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPackage.SVG__WIDTH,
						null, msgs);
			msgs = basicSetWidth(newWidth, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG__WIDTH, newWidth, newWidth));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.SVG__HEIGHT,
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
				msgs = ((InternalEObject) height).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPackage.SVG__HEIGHT,
						null, msgs);
			if (newHeight != null)
				msgs = ((InternalEObject) newHeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPackage.SVG__HEIGHT,
						null, msgs);
			msgs = basicSetHeight(newHeight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG__HEIGHT, newHeight, newHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreserveAspectRatio getPreserveAspectRatio() {
		return preserveAspectRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreserveAspectRatio(PreserveAspectRatio newPreserveAspectRatio,
			NotificationChain msgs) {
		PreserveAspectRatio oldPreserveAspectRatio = preserveAspectRatio;
		preserveAspectRatio = newPreserveAspectRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SvgPackage.SVG__PRESERVE_ASPECT_RATIO, oldPreserveAspectRatio, newPreserveAspectRatio);
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
	public void setPreserveAspectRatio(PreserveAspectRatio newPreserveAspectRatio) {
		if (newPreserveAspectRatio != preserveAspectRatio) {
			NotificationChain msgs = null;
			if (preserveAspectRatio != null)
				msgs = ((InternalEObject) preserveAspectRatio).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SvgPackage.SVG__PRESERVE_ASPECT_RATIO, null, msgs);
			if (newPreserveAspectRatio != null)
				msgs = ((InternalEObject) newPreserveAspectRatio).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SvgPackage.SVG__PRESERVE_ASPECT_RATIO, null, msgs);
			msgs = basicSetPreserveAspectRatio(newPreserveAspectRatio, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG__PRESERVE_ASPECT_RATIO,
					newPreserveAspectRatio, newPreserveAspectRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewBox getViewBox() {
		return viewBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewBox(ViewBox newViewBox, NotificationChain msgs) {
		ViewBox oldViewBox = viewBox;
		viewBox = newViewBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.SVG__VIEW_BOX,
					oldViewBox, newViewBox);
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
	public void setViewBox(ViewBox newViewBox) {
		if (newViewBox != viewBox) {
			NotificationChain msgs = null;
			if (viewBox != null)
				msgs = ((InternalEObject) viewBox).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SvgPackage.SVG__VIEW_BOX, null, msgs);
			if (newViewBox != null)
				msgs = ((InternalEObject) newViewBox).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SvgPackage.SVG__VIEW_BOX, null, msgs);
			msgs = basicSetViewBox(newViewBox, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG__VIEW_BOX, newViewBox, newViewBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SvgPackage.SVG__X:
			return basicSetX(null, msgs);
		case SvgPackage.SVG__Y:
			return basicSetY(null, msgs);
		case SvgPackage.SVG__WIDTH:
			return basicSetWidth(null, msgs);
		case SvgPackage.SVG__HEIGHT:
			return basicSetHeight(null, msgs);
		case SvgPackage.SVG__PRESERVE_ASPECT_RATIO:
			return basicSetPreserveAspectRatio(null, msgs);
		case SvgPackage.SVG__VIEW_BOX:
			return basicSetViewBox(null, msgs);
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
		case SvgPackage.SVG__X:
			return getX();
		case SvgPackage.SVG__Y:
			return getY();
		case SvgPackage.SVG__WIDTH:
			return getWidth();
		case SvgPackage.SVG__HEIGHT:
			return getHeight();
		case SvgPackage.SVG__PRESERVE_ASPECT_RATIO:
			return getPreserveAspectRatio();
		case SvgPackage.SVG__VIEW_BOX:
			return getViewBox();
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
		case SvgPackage.SVG__X:
			setX((Coordinate) newValue);
			return;
		case SvgPackage.SVG__Y:
			setY((Coordinate) newValue);
			return;
		case SvgPackage.SVG__WIDTH:
			setWidth((Length) newValue);
			return;
		case SvgPackage.SVG__HEIGHT:
			setHeight((Length) newValue);
			return;
		case SvgPackage.SVG__PRESERVE_ASPECT_RATIO:
			setPreserveAspectRatio((PreserveAspectRatio) newValue);
			return;
		case SvgPackage.SVG__VIEW_BOX:
			setViewBox((ViewBox) newValue);
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
		case SvgPackage.SVG__X:
			setX((Coordinate) null);
			return;
		case SvgPackage.SVG__Y:
			setY((Coordinate) null);
			return;
		case SvgPackage.SVG__WIDTH:
			setWidth((Length) null);
			return;
		case SvgPackage.SVG__HEIGHT:
			setHeight((Length) null);
			return;
		case SvgPackage.SVG__PRESERVE_ASPECT_RATIO:
			setPreserveAspectRatio((PreserveAspectRatio) null);
			return;
		case SvgPackage.SVG__VIEW_BOX:
			setViewBox((ViewBox) null);
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
		case SvgPackage.SVG__X:
			return x != null;
		case SvgPackage.SVG__Y:
			return y != null;
		case SvgPackage.SVG__WIDTH:
			return width != null;
		case SvgPackage.SVG__HEIGHT:
			return height != null;
		case SvgPackage.SVG__PRESERVE_ASPECT_RATIO:
			return preserveAspectRatio != null;
		case SvgPackage.SVG__VIEW_BOX:
			return viewBox != null;
		}
		return super.eIsSet(featureID);
	}

} //SvgImpl
