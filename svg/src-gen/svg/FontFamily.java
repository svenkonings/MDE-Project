/**
 */
package svg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.FontFamily#getFontFamily <em>Font Family</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getFontFamily()
 * @model
 * @generated
 */
public interface FontFamily extends Attribute {
	/**
	 * Returns the value of the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Family</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Family</em>' attribute.
	 * @see #setFontFamily(String)
	 * @see svg.SvgPackage#getFontFamily_FontFamily()
	 * @model required="true"
	 * @generated
	 */
	String getFontFamily();

	/**
	 * Sets the value of the '{@link svg.FontFamily#getFontFamily <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Family</em>' attribute.
	 * @see #getFontFamily()
	 * @generated
	 */
	void setFontFamily(String value);

} // FontFamily
