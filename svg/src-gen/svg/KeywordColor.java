/**
 */
package svg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keyword Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.KeywordColor#getKeyword <em>Keyword</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getKeywordColor()
 * @model
 * @generated
 */
public interface KeywordColor extends Color {
	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' attribute.
	 * The literals are from the enumeration {@link svg.ColorKeyword}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keyword</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword</em>' attribute.
	 * @see svg.ColorKeyword
	 * @see #setKeyword(ColorKeyword)
	 * @see svg.SvgPackage#getKeywordColor_Keyword()
	 * @model required="true"
	 * @generated
	 */
	ColorKeyword getKeyword();

	/**
	 * Sets the value of the '{@link svg.KeywordColor#getKeyword <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword</em>' attribute.
	 * @see svg.ColorKeyword
	 * @see #getKeyword()
	 * @generated
	 */
	void setKeyword(ColorKeyword value);

} // KeywordColor
