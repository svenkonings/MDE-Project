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
import svg.Text;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link svg.impl.TextImpl#getX <em>X</em>}</li>
 *   <li>{@link svg.impl.TextImpl#getY <em>Y</em>}</li>
 *   <li>{@link svg.impl.TextImpl#getDx <em>Dx</em>}</li>
 *   <li>{@link svg.impl.TextImpl#getDy <em>Dy</em>}</li>
 *   <li>{@link svg.impl.TextImpl#getTextLength <em>Text Length</em>}</li>
 *   <li>{@link svg.impl.TextImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextImpl extends GraphicElementImpl implements Text {
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
	 * The cached value of the '{@link #getDx() <em>Dx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDx()
	 * @generated
	 * @ordered
	 */
	protected Length dx;

	/**
	 * The cached value of the '{@link #getDy() <em>Dy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDy()
	 * @generated
	 * @ordered
	 */
	protected Length dy;

	/**
	 * The cached value of the '{@link #getTextLength() <em>Text Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextLength()
	 * @generated
	 * @ordered
	 */
	protected Length textLength;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.TEXT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.TEXT__X, oldX,
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
				msgs = ((InternalEObject) x).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPackage.TEXT__X, null,
						msgs);
			if (newX != null)
				msgs = ((InternalEObject) newX).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPackage.TEXT__X, null,
						msgs);
			msgs = basicSetX(newX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.TEXT__X, newX, newX));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.TEXT__Y, oldY,
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
				msgs = ((InternalEObject) y).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPackage.TEXT__Y, null,
						msgs);
			if (newY != null)
				msgs = ((InternalEObject) newY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPackage.TEXT__Y, null,
						msgs);
			msgs = basicSetY(newY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.TEXT__Y, newY, newY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length getDx() {
		return dx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDx(Length newDx, NotificationChain msgs) {
		Length oldDx = dx;
		dx = newDx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.TEXT__DX, oldDx,
					newDx);
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
	public void setDx(Length newDx) {
		if (newDx != dx) {
			NotificationChain msgs = null;
			if (dx != null)
				msgs = ((InternalEObject) dx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPackage.TEXT__DX, null,
						msgs);
			if (newDx != null)
				msgs = ((InternalEObject) newDx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPackage.TEXT__DX, null,
						msgs);
			msgs = basicSetDx(newDx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.TEXT__DX, newDx, newDx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length getDy() {
		return dy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDy(Length newDy, NotificationChain msgs) {
		Length oldDy = dy;
		dy = newDy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.TEXT__DY, oldDy,
					newDy);
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
	public void setDy(Length newDy) {
		if (newDy != dy) {
			NotificationChain msgs = null;
			if (dy != null)
				msgs = ((InternalEObject) dy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPackage.TEXT__DY, null,
						msgs);
			if (newDy != null)
				msgs = ((InternalEObject) newDy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPackage.TEXT__DY, null,
						msgs);
			msgs = basicSetDy(newDy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.TEXT__DY, newDy, newDy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length getTextLength() {
		return textLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextLength(Length newTextLength, NotificationChain msgs) {
		Length oldTextLength = textLength;
		textLength = newTextLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.TEXT__TEXT_LENGTH,
					oldTextLength, newTextLength);
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
	public void setTextLength(Length newTextLength) {
		if (newTextLength != textLength) {
			NotificationChain msgs = null;
			if (textLength != null)
				msgs = ((InternalEObject) textLength).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SvgPackage.TEXT__TEXT_LENGTH, null, msgs);
			if (newTextLength != null)
				msgs = ((InternalEObject) newTextLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SvgPackage.TEXT__TEXT_LENGTH, null, msgs);
			msgs = basicSetTextLength(newTextLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.TEXT__TEXT_LENGTH, newTextLength,
					newTextLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.TEXT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SvgPackage.TEXT__X:
			return basicSetX(null, msgs);
		case SvgPackage.TEXT__Y:
			return basicSetY(null, msgs);
		case SvgPackage.TEXT__DX:
			return basicSetDx(null, msgs);
		case SvgPackage.TEXT__DY:
			return basicSetDy(null, msgs);
		case SvgPackage.TEXT__TEXT_LENGTH:
			return basicSetTextLength(null, msgs);
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
		case SvgPackage.TEXT__X:
			return getX();
		case SvgPackage.TEXT__Y:
			return getY();
		case SvgPackage.TEXT__DX:
			return getDx();
		case SvgPackage.TEXT__DY:
			return getDy();
		case SvgPackage.TEXT__TEXT_LENGTH:
			return getTextLength();
		case SvgPackage.TEXT__TEXT:
			return getText();
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
		case SvgPackage.TEXT__X:
			setX((Coordinate) newValue);
			return;
		case SvgPackage.TEXT__Y:
			setY((Coordinate) newValue);
			return;
		case SvgPackage.TEXT__DX:
			setDx((Length) newValue);
			return;
		case SvgPackage.TEXT__DY:
			setDy((Length) newValue);
			return;
		case SvgPackage.TEXT__TEXT_LENGTH:
			setTextLength((Length) newValue);
			return;
		case SvgPackage.TEXT__TEXT:
			setText((String) newValue);
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
		case SvgPackage.TEXT__X:
			setX((Coordinate) null);
			return;
		case SvgPackage.TEXT__Y:
			setY((Coordinate) null);
			return;
		case SvgPackage.TEXT__DX:
			setDx((Length) null);
			return;
		case SvgPackage.TEXT__DY:
			setDy((Length) null);
			return;
		case SvgPackage.TEXT__TEXT_LENGTH:
			setTextLength((Length) null);
			return;
		case SvgPackage.TEXT__TEXT:
			setText(TEXT_EDEFAULT);
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
		case SvgPackage.TEXT__X:
			return x != null;
		case SvgPackage.TEXT__Y:
			return y != null;
		case SvgPackage.TEXT__DX:
			return dx != null;
		case SvgPackage.TEXT__DY:
			return dy != null;
		case SvgPackage.TEXT__TEXT_LENGTH:
			return textLength != null;
		case SvgPackage.TEXT__TEXT:
			return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
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
		result.append(" (text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //TextImpl
