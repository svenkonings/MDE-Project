/**
 */
package svg.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import svg.Align;
import svg.MeetOrSlice;
import svg.PreserveAspectRatio;
import svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preserve Aspect Ratio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link svg.impl.PreserveAspectRatioImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link svg.impl.PreserveAspectRatioImpl#getMeetOrSlice <em>Meet Or Slice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreserveAspectRatioImpl extends AttributeTypeImpl implements PreserveAspectRatio {
	/**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final Align ALIGN_EDEFAULT = Align.NONE;

	/**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected Align align = ALIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeetOrSlice() <em>Meet Or Slice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeetOrSlice()
	 * @generated
	 * @ordered
	 */
	protected static final MeetOrSlice MEET_OR_SLICE_EDEFAULT = MeetOrSlice.MEET;

	/**
	 * The cached value of the '{@link #getMeetOrSlice() <em>Meet Or Slice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeetOrSlice()
	 * @generated
	 * @ordered
	 */
	protected MeetOrSlice meetOrSlice = MEET_OR_SLICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreserveAspectRatioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.PRESERVE_ASPECT_RATIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Align getAlign() {
		return align;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlign(Align newAlign) {
		Align oldAlign = align;
		align = newAlign == null ? ALIGN_EDEFAULT : newAlign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.PRESERVE_ASPECT_RATIO__ALIGN, oldAlign,
					align));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeetOrSlice getMeetOrSlice() {
		return meetOrSlice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeetOrSlice(MeetOrSlice newMeetOrSlice) {
		MeetOrSlice oldMeetOrSlice = meetOrSlice;
		meetOrSlice = newMeetOrSlice == null ? MEET_OR_SLICE_EDEFAULT : newMeetOrSlice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.PRESERVE_ASPECT_RATIO__MEET_OR_SLICE,
					oldMeetOrSlice, meetOrSlice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SvgPackage.PRESERVE_ASPECT_RATIO__ALIGN:
			return getAlign();
		case SvgPackage.PRESERVE_ASPECT_RATIO__MEET_OR_SLICE:
			return getMeetOrSlice();
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
		case SvgPackage.PRESERVE_ASPECT_RATIO__ALIGN:
			setAlign((Align) newValue);
			return;
		case SvgPackage.PRESERVE_ASPECT_RATIO__MEET_OR_SLICE:
			setMeetOrSlice((MeetOrSlice) newValue);
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
		case SvgPackage.PRESERVE_ASPECT_RATIO__ALIGN:
			setAlign(ALIGN_EDEFAULT);
			return;
		case SvgPackage.PRESERVE_ASPECT_RATIO__MEET_OR_SLICE:
			setMeetOrSlice(MEET_OR_SLICE_EDEFAULT);
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
		case SvgPackage.PRESERVE_ASPECT_RATIO__ALIGN:
			return align != ALIGN_EDEFAULT;
		case SvgPackage.PRESERVE_ASPECT_RATIO__MEET_OR_SLICE:
			return meetOrSlice != MEET_OR_SLICE_EDEFAULT;
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
		result.append(" (align: ");
		result.append(align);
		result.append(", meetOrSlice: ");
		result.append(meetOrSlice);
		result.append(')');
		return result.toString();
	}

} //PreserveAspectRatioImpl
