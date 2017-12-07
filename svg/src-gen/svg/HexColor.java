/**
 */
package svg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hex Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.HexColor#getHex <em>Hex</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getHexColor()
 * @model
 * @generated
 */
public interface HexColor extends Color {
	/**
	 * Returns the value of the '<em><b>Hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hex</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hex</em>' attribute.
	 * @see #setHex(String)
	 * @see svg.SvgPackage#getHexColor_Hex()
	 * @model required="true"
	 * @generated
	 */
	String getHex();

	/**
	 * Sets the value of the '{@link svg.HexColor#getHex <em>Hex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hex</em>' attribute.
	 * @see #getHex()
	 * @generated
	 */
	void setHex(String value);

} // HexColor
