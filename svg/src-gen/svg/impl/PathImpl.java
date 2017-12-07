/**
 */
package svg.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import svg.Length;
import svg.Path;
import svg.PathValue;
import svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link svg.impl.PathImpl#getPath <em>Path</em>}</li>
 *   <li>{@link svg.impl.PathImpl#getPathLength <em>Path Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathImpl extends GraphicElementImpl implements Path {
	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected EList<PathValue> path;

	/**
	 * The cached value of the '{@link #getPathLength() <em>Path Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathLength()
	 * @generated
	 * @ordered
	 */
	protected Length pathLength;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathValue> getPath() {
		if (path == null) {
			path = new EObjectContainmentEList<PathValue>(PathValue.class, this, SvgPackage.PATH__PATH);
		}
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length getPathLength() {
		return pathLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathLength(Length newPathLength, NotificationChain msgs) {
		Length oldPathLength = pathLength;
		pathLength = newPathLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPackage.PATH__PATH_LENGTH,
					oldPathLength, newPathLength);
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
	public void setPathLength(Length newPathLength) {
		if (newPathLength != pathLength) {
			NotificationChain msgs = null;
			if (pathLength != null)
				msgs = ((InternalEObject) pathLength).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SvgPackage.PATH__PATH_LENGTH, null, msgs);
			if (newPathLength != null)
				msgs = ((InternalEObject) newPathLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SvgPackage.PATH__PATH_LENGTH, null, msgs);
			msgs = basicSetPathLength(newPathLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.PATH__PATH_LENGTH, newPathLength,
					newPathLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SvgPackage.PATH__PATH:
			return ((InternalEList<?>) getPath()).basicRemove(otherEnd, msgs);
		case SvgPackage.PATH__PATH_LENGTH:
			return basicSetPathLength(null, msgs);
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
		case SvgPackage.PATH__PATH:
			return getPath();
		case SvgPackage.PATH__PATH_LENGTH:
			return getPathLength();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SvgPackage.PATH__PATH:
			getPath().clear();
			getPath().addAll((Collection<? extends PathValue>) newValue);
			return;
		case SvgPackage.PATH__PATH_LENGTH:
			setPathLength((Length) newValue);
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
		case SvgPackage.PATH__PATH:
			getPath().clear();
			return;
		case SvgPackage.PATH__PATH_LENGTH:
			setPathLength((Length) null);
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
		case SvgPackage.PATH__PATH:
			return path != null && !path.isEmpty();
		case SvgPackage.PATH__PATH_LENGTH:
			return pathLength != null;
		}
		return super.eIsSet(featureID);
	}

} //PathImpl
