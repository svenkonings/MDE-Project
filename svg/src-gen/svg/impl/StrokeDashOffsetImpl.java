/**
 */
package svg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import svg.Length;
import svg.StrokeDashOffset;
import svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stroke Dash Offset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link svg.impl.StrokeDashOffsetImpl#getStrokeDashOffset <em>Stroke Dash Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrokeDashOffsetImpl extends AttributeImpl implements StrokeDashOffset {
	/**
	 * The cached value of the '{@link #getStrokeDashOffset() <em>Stroke Dash Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDashOffset()
	 * @generated
	 * @ordered
	 */
	protected Length strokeDashOffset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrokeDashOffsetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.STROKE_DASH_OFFSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length getStrokeDashOffset() {
		return strokeDashOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrokeDashOffset(Length newStrokeDashOffset, NotificationChain msgs) {
		Length oldStrokeDashOffset = strokeDashOffset;
		strokeDashOffset = newStrokeDashOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SvgPackage.STROKE_DASH_OFFSET__STROKE_DASH_OFFSET, oldStrokeDashOffset, newStrokeDashOffset);
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
	public void setStrokeDashOffset(Length newStrokeDashOffset) {
		if (newStrokeDashOffset != strokeDashOffset) {
			NotificationChain msgs = null;
			if (strokeDashOffset != null)
				msgs = ((InternalEObject) strokeDashOffset).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SvgPackage.STROKE_DASH_OFFSET__STROKE_DASH_OFFSET, null, msgs);
			if (newStrokeDashOffset != null)
				msgs = ((InternalEObject) newStrokeDashOffset).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SvgPackage.STROKE_DASH_OFFSET__STROKE_DASH_OFFSET, null, msgs);
			msgs = basicSetStrokeDashOffset(newStrokeDashOffset, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.STROKE_DASH_OFFSET__STROKE_DASH_OFFSET,
					newStrokeDashOffset, newStrokeDashOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SvgPackage.STROKE_DASH_OFFSET__STROKE_DASH_OFFSET:
			return basicSetStrokeDashOffset(null, msgs);
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
		case SvgPackage.STROKE_DASH_OFFSET__STROKE_DASH_OFFSET:
			return getStrokeDashOffset();
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
		case SvgPackage.STROKE_DASH_OFFSET__STROKE_DASH_OFFSET:
			setStrokeDashOffset((Length) newValue);
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
		case SvgPackage.STROKE_DASH_OFFSET__STROKE_DASH_OFFSET:
			setStrokeDashOffset((Length) null);
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
		case SvgPackage.STROKE_DASH_OFFSET__STROKE_DASH_OFFSET:
			return strokeDashOffset != null;
		}
		return super.eIsSet(featureID);
	}

} //StrokeDashOffsetImpl
