/**
 */
package svg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preserve Aspect Ratio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.PreserveAspectRatio#getAlign <em>Align</em>}</li>
 *   <li>{@link svg.PreserveAspectRatio#getMeetOrSlice <em>Meet Or Slice</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getPreserveAspectRatio()
 * @model
 * @generated
 */
public interface PreserveAspectRatio extends AttributeType {
	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * The literals are from the enumeration {@link svg.Align}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see svg.Align
	 * @see #setAlign(Align)
	 * @see svg.SvgPackage#getPreserveAspectRatio_Align()
	 * @model required="true"
	 * @generated
	 */
	Align getAlign();

	/**
	 * Sets the value of the '{@link svg.PreserveAspectRatio#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see svg.Align
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(Align value);

	/**
	 * Returns the value of the '<em><b>Meet Or Slice</b></em>' attribute.
	 * The literals are from the enumeration {@link svg.MeetOrSlice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meet Or Slice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meet Or Slice</em>' attribute.
	 * @see svg.MeetOrSlice
	 * @see #setMeetOrSlice(MeetOrSlice)
	 * @see svg.SvgPackage#getPreserveAspectRatio_MeetOrSlice()
	 * @model
	 * @generated
	 */
	MeetOrSlice getMeetOrSlice();

	/**
	 * Sets the value of the '{@link svg.PreserveAspectRatio#getMeetOrSlice <em>Meet Or Slice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meet Or Slice</em>' attribute.
	 * @see svg.MeetOrSlice
	 * @see #getMeetOrSlice()
	 * @generated
	 */
	void setMeetOrSlice(MeetOrSlice value);

} // PreserveAspectRatio
