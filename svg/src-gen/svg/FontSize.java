/**
 */
package svg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.FontSize#getFontSize <em>Font Size</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getFontSize()
 * @model
 * @generated
 */
public interface FontSize extends Attribute {
	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size</em>' containment reference.
	 * @see #setFontSize(Length)
	 * @see svg.SvgPackage#getFontSize_FontSize()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Length getFontSize();

	/**
	 * Sets the value of the '{@link svg.FontSize#getFontSize <em>Font Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' containment reference.
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(Length value);

} // FontSize
