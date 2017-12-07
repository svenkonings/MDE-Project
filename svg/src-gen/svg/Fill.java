/**
 */
package svg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.Fill#getFill <em>Fill</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getFill()
 * @model
 * @generated
 */
public interface Fill extends Attribute {
	/**
	 * Returns the value of the '<em><b>Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill</em>' containment reference.
	 * @see #setFill(Paint)
	 * @see svg.SvgPackage#getFill_Fill()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Paint getFill();

	/**
	 * Sets the value of the '{@link svg.Fill#getFill <em>Fill</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill</em>' containment reference.
	 * @see #getFill()
	 * @generated
	 */
	void setFill(Paint value);

} // Fill
