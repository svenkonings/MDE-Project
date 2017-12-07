/**
 */
package postScript.impl;

import java.lang.String;

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import postScript.PostScriptPackage;
import postScript.Program;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link postScript.impl.ProgramImpl#getObject <em>Object</em>}</li>
 *   <li>{@link postScript.impl.ProgramImpl#getLowerLeftX <em>Lower Left X</em>}</li>
 *   <li>{@link postScript.impl.ProgramImpl#getLowerLeftY <em>Lower Left Y</em>}</li>
 *   <li>{@link postScript.impl.ProgramImpl#getUpperRightX <em>Upper Right X</em>}</li>
 *   <li>{@link postScript.impl.ProgramImpl#getUpperRightY <em>Upper Right Y</em>}</li>
 *   <li>{@link postScript.impl.ProgramImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link postScript.impl.ProgramImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link postScript.impl.ProgramImpl#getCreationDate <em>Creation Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected EList<postScript.Object> object;

	/**
	 * The default value of the '{@link #getLowerLeftX() <em>Lower Left X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerLeftX()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LOWER_LEFT_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerLeftX() <em>Lower Left X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerLeftX()
	 * @generated
	 * @ordered
	 */
	protected BigInteger lowerLeftX = LOWER_LEFT_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerLeftY() <em>Lower Left Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerLeftY()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LOWER_LEFT_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerLeftY() <em>Lower Left Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerLeftY()
	 * @generated
	 * @ordered
	 */
	protected BigInteger lowerLeftY = LOWER_LEFT_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperRightX() <em>Upper Right X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperRightX()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger UPPER_RIGHT_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperRightX() <em>Upper Right X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperRightX()
	 * @generated
	 * @ordered
	 */
	protected BigInteger upperRightX = UPPER_RIGHT_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperRightY() <em>Upper Right Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperRightY()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger UPPER_RIGHT_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperRightY() <em>Upper Right Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperRightY()
	 * @generated
	 * @ordered
	 */
	protected BigInteger upperRightY = UPPER_RIGHT_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreator() <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected String creator = CREATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected String creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PostScriptPackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<postScript.Object> getObject() {
		if (object == null) {
			object = new EObjectContainmentWithInverseEList<postScript.Object>(postScript.Object.class, this, PostScriptPackage.PROGRAM__OBJECT, PostScriptPackage.OBJECT__PROGRAM);
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLowerLeftX() {
		return lowerLeftX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerLeftX(BigInteger newLowerLeftX) {
		BigInteger oldLowerLeftX = lowerLeftX;
		lowerLeftX = newLowerLeftX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PostScriptPackage.PROGRAM__LOWER_LEFT_X, oldLowerLeftX, lowerLeftX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLowerLeftY() {
		return lowerLeftY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerLeftY(BigInteger newLowerLeftY) {
		BigInteger oldLowerLeftY = lowerLeftY;
		lowerLeftY = newLowerLeftY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PostScriptPackage.PROGRAM__LOWER_LEFT_Y, oldLowerLeftY, lowerLeftY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getUpperRightX() {
		return upperRightX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperRightX(BigInteger newUpperRightX) {
		BigInteger oldUpperRightX = upperRightX;
		upperRightX = newUpperRightX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PostScriptPackage.PROGRAM__UPPER_RIGHT_X, oldUpperRightX, upperRightX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getUpperRightY() {
		return upperRightY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperRightY(BigInteger newUpperRightY) {
		BigInteger oldUpperRightY = upperRightY;
		upperRightY = newUpperRightY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PostScriptPackage.PROGRAM__UPPER_RIGHT_Y, oldUpperRightY, upperRightY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PostScriptPackage.PROGRAM__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(String newCreator) {
		String oldCreator = creator;
		creator = newCreator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PostScriptPackage.PROGRAM__CREATOR, oldCreator, creator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(String newCreationDate) {
		String oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PostScriptPackage.PROGRAM__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PostScriptPackage.PROGRAM__OBJECT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObject()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PostScriptPackage.PROGRAM__OBJECT:
				return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
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
			case PostScriptPackage.PROGRAM__OBJECT:
				return getObject();
			case PostScriptPackage.PROGRAM__LOWER_LEFT_X:
				return getLowerLeftX();
			case PostScriptPackage.PROGRAM__LOWER_LEFT_Y:
				return getLowerLeftY();
			case PostScriptPackage.PROGRAM__UPPER_RIGHT_X:
				return getUpperRightX();
			case PostScriptPackage.PROGRAM__UPPER_RIGHT_Y:
				return getUpperRightY();
			case PostScriptPackage.PROGRAM__TITLE:
				return getTitle();
			case PostScriptPackage.PROGRAM__CREATOR:
				return getCreator();
			case PostScriptPackage.PROGRAM__CREATION_DATE:
				return getCreationDate();
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
			case PostScriptPackage.PROGRAM__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends postScript.Object>)newValue);
				return;
			case PostScriptPackage.PROGRAM__LOWER_LEFT_X:
				setLowerLeftX((BigInteger)newValue);
				return;
			case PostScriptPackage.PROGRAM__LOWER_LEFT_Y:
				setLowerLeftY((BigInteger)newValue);
				return;
			case PostScriptPackage.PROGRAM__UPPER_RIGHT_X:
				setUpperRightX((BigInteger)newValue);
				return;
			case PostScriptPackage.PROGRAM__UPPER_RIGHT_Y:
				setUpperRightY((BigInteger)newValue);
				return;
			case PostScriptPackage.PROGRAM__TITLE:
				setTitle((String)newValue);
				return;
			case PostScriptPackage.PROGRAM__CREATOR:
				setCreator((String)newValue);
				return;
			case PostScriptPackage.PROGRAM__CREATION_DATE:
				setCreationDate((String)newValue);
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
			case PostScriptPackage.PROGRAM__OBJECT:
				getObject().clear();
				return;
			case PostScriptPackage.PROGRAM__LOWER_LEFT_X:
				setLowerLeftX(LOWER_LEFT_X_EDEFAULT);
				return;
			case PostScriptPackage.PROGRAM__LOWER_LEFT_Y:
				setLowerLeftY(LOWER_LEFT_Y_EDEFAULT);
				return;
			case PostScriptPackage.PROGRAM__UPPER_RIGHT_X:
				setUpperRightX(UPPER_RIGHT_X_EDEFAULT);
				return;
			case PostScriptPackage.PROGRAM__UPPER_RIGHT_Y:
				setUpperRightY(UPPER_RIGHT_Y_EDEFAULT);
				return;
			case PostScriptPackage.PROGRAM__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case PostScriptPackage.PROGRAM__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case PostScriptPackage.PROGRAM__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
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
			case PostScriptPackage.PROGRAM__OBJECT:
				return object != null && !object.isEmpty();
			case PostScriptPackage.PROGRAM__LOWER_LEFT_X:
				return LOWER_LEFT_X_EDEFAULT == null ? lowerLeftX != null : !LOWER_LEFT_X_EDEFAULT.equals(lowerLeftX);
			case PostScriptPackage.PROGRAM__LOWER_LEFT_Y:
				return LOWER_LEFT_Y_EDEFAULT == null ? lowerLeftY != null : !LOWER_LEFT_Y_EDEFAULT.equals(lowerLeftY);
			case PostScriptPackage.PROGRAM__UPPER_RIGHT_X:
				return UPPER_RIGHT_X_EDEFAULT == null ? upperRightX != null : !UPPER_RIGHT_X_EDEFAULT.equals(upperRightX);
			case PostScriptPackage.PROGRAM__UPPER_RIGHT_Y:
				return UPPER_RIGHT_Y_EDEFAULT == null ? upperRightY != null : !UPPER_RIGHT_Y_EDEFAULT.equals(upperRightY);
			case PostScriptPackage.PROGRAM__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case PostScriptPackage.PROGRAM__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case PostScriptPackage.PROGRAM__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (lowerLeftX: ");
		result.append(lowerLeftX);
		result.append(", lowerLeftY: ");
		result.append(lowerLeftY);
		result.append(", upperRightX: ");
		result.append(upperRightX);
		result.append(", upperRightY: ");
		result.append(upperRightY);
		result.append(", title: ");
		result.append(title);
		result.append(", creator: ");
		result.append(creator);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(')');
		return result.toString();
	}

} //ProgramImpl
