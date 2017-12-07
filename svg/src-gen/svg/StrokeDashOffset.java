/**
 */
package svg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stroke Dash Offset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.StrokeDashOffset#getStrokeDashOffset <em>Stroke Dash Offset</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getStrokeDashOffset()
 * @model
 * @generated
 */
public interface StrokeDashOffset extends Attribute {
	/**
	 * Returns the value of the '<em><b>Stroke Dash Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke Dash Offset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Dash Offset</em>' containment reference.
	 * @see #setStrokeDashOffset(Length)
	 * @see svg.SvgPackage#getStrokeDashOffset_StrokeDashOffset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Length getStrokeDashOffset();

	/**
	 * Sets the value of the '{@link svg.StrokeDashOffset#getStrokeDashOffset <em>Stroke Dash Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Dash Offset</em>' containment reference.
	 * @see #getStrokeDashOffset()
	 * @generated
	 */
	void setStrokeDashOffset(Length value);

} // StrokeDashOffset
