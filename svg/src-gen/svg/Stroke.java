/**
 */
package svg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stroke</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.Stroke#getStroke <em>Stroke</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getStroke()
 * @model
 * @generated
 */
public interface Stroke extends Attribute {
	/**
	 * Returns the value of the '<em><b>Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke</em>' containment reference.
	 * @see #setStroke(Paint)
	 * @see svg.SvgPackage#getStroke_Stroke()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Paint getStroke();

	/**
	 * Sets the value of the '{@link svg.Stroke#getStroke <em>Stroke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke</em>' containment reference.
	 * @see #getStroke()
	 * @generated
	 */
	void setStroke(Paint value);

} // Stroke
