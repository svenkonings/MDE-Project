/**
 */
package svg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import svg.PreserveAspectRatio;
import svg.SvgPackage;
import svg.Symbol;
import svg.ViewBox;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link svg.impl.SymbolImpl#getPreserveAspectRatio <em>Preserve Aspect Ratio</em>}</li>
 *   <li>{@link svg.impl.SymbolImpl#getViewBox <em>View Box</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymbolImpl extends DefsImpl implements Symbol {
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
	protected SymbolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.SYMBOL;
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
					SvgPackage.SYMBOL__PRESERVE_ASPECT_RATIO, oldPreserveAspectRatio, newPreserveAspectRatio);
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
						EOPPOSITE_FEATURE_BASE - SvgPackage.SYMBOL__PRESERVE_ASPECT_RATIO, null, msgs);
			if (newPreserveAspectRatio != null)
				msgs = ((InternalEObject) newPreserveAspectRatio).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SvgPackage.SYMBOL__PRESERVE_ASPECT_RATIO, null, msgs);
			msgs = basicSetPreserveAspectRatio(newPreserveAspectRatio, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SYMBOL__PRESERVE_ASPECT_RATIO,
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.SYMBOL__VIEW_BOX,
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
						EOPPOSITE_FEATURE_BASE - SvgPackage.SYMBOL__VIEW_BOX, null, msgs);
			if (newViewBox != null)
				msgs = ((InternalEObject) newViewBox).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SvgPackage.SYMBOL__VIEW_BOX, null, msgs);
			msgs = basicSetViewBox(newViewBox, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SYMBOL__VIEW_BOX, newViewBox, newViewBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SvgPackage.SYMBOL__PRESERVE_ASPECT_RATIO:
			return basicSetPreserveAspectRatio(null, msgs);
		case SvgPackage.SYMBOL__VIEW_BOX:
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
		case SvgPackage.SYMBOL__PRESERVE_ASPECT_RATIO:
			return getPreserveAspectRatio();
		case SvgPackage.SYMBOL__VIEW_BOX:
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
		case SvgPackage.SYMBOL__PRESERVE_ASPECT_RATIO:
			setPreserveAspectRatio((PreserveAspectRatio) newValue);
			return;
		case SvgPackage.SYMBOL__VIEW_BOX:
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
		case SvgPackage.SYMBOL__PRESERVE_ASPECT_RATIO:
			setPreserveAspectRatio((PreserveAspectRatio) null);
			return;
		case SvgPackage.SYMBOL__VIEW_BOX:
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
		case SvgPackage.SYMBOL__PRESERVE_ASPECT_RATIO:
			return preserveAspectRatio != null;
		case SvgPackage.SYMBOL__VIEW_BOX:
			return viewBox != null;
		}
		return super.eIsSet(featureID);
	}

} //SymbolImpl
