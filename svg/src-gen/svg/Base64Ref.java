/**
 */
package svg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base64 Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.Base64Ref#getBase64 <em>Base64</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getBase64Ref()
 * @model
 * @generated
 */
public interface Base64Ref extends Href {
	/**
	 * Returns the value of the '<em><b>Base64</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base64</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base64</em>' attribute.
	 * @see #setBase64(String)
	 * @see svg.SvgPackage#getBase64Ref_Base64()
	 * @model required="true"
	 * @generated
	 */
	String getBase64();

	/**
	 * Sets the value of the '{@link svg.Base64Ref#getBase64 <em>Base64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base64</em>' attribute.
	 * @see #getBase64()
	 * @generated
	 */
	void setBase64(String value);

} // Base64Ref
