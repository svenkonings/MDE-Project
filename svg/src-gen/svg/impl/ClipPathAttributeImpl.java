/**
 */
package svg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import svg.ClipPathAttribute;
import svg.LocalIri;
import svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clip Path Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link svg.impl.ClipPathAttributeImpl#getClipPath <em>Clip Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClipPathAttributeImpl extends AttributeImpl implements ClipPathAttribute {
	/**
	 * The cached value of the '{@link #getClipPath() <em>Clip Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClipPath()
	 * @generated
	 * @ordered
	 */
	protected LocalIri clipPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClipPathAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.CLIP_PATH_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalIri getClipPath() {
		return clipPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClipPath(LocalIri newClipPath, NotificationChain msgs) {
		LocalIri oldClipPath = clipPath;
		clipPath = newClipPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SvgPackage.CLIP_PATH_ATTRIBUTE__CLIP_PATH, oldClipPath, newClipPath);
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
	public void setClipPath(LocalIri newClipPath) {
		if (newClipPath != clipPath) {
			NotificationChain msgs = null;
			if (clipPath != null)
				msgs = ((InternalEObject) clipPath).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SvgPackage.CLIP_PATH_ATTRIBUTE__CLIP_PATH, null, msgs);
			if (newClipPath != null)
				msgs = ((InternalEObject) newClipPath).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SvgPackage.CLIP_PATH_ATTRIBUTE__CLIP_PATH, null, msgs);
			msgs = basicSetClipPath(newClipPath, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.CLIP_PATH_ATTRIBUTE__CLIP_PATH,
					newClipPath, newClipPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SvgPackage.CLIP_PATH_ATTRIBUTE__CLIP_PATH:
			return basicSetClipPath(null, msgs);
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
		case SvgPackage.CLIP_PATH_ATTRIBUTE__CLIP_PATH:
			return getClipPath();
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
		case SvgPackage.CLIP_PATH_ATTRIBUTE__CLIP_PATH:
			setClipPath((LocalIri) newValue);
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
		case SvgPackage.CLIP_PATH_ATTRIBUTE__CLIP_PATH:
			setClipPath((LocalIri) null);
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
		case SvgPackage.CLIP_PATH_ATTRIBUTE__CLIP_PATH:
			return clipPath != null;
		}
		return super.eIsSet(featureID);
	}

} //ClipPathAttributeImpl
