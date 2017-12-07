/**
 */
package svg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.Text#getX <em>X</em>}</li>
 *   <li>{@link svg.Text#getY <em>Y</em>}</li>
 *   <li>{@link svg.Text#getDx <em>Dx</em>}</li>
 *   <li>{@link svg.Text#getDy <em>Dy</em>}</li>
 *   <li>{@link svg.Text#getTextLength <em>Text Length</em>}</li>
 *   <li>{@link svg.Text#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getText()
 * @model
 * @generated
 */
public interface Text extends GraphicElement {
	/**
	 * Returns the value of the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' containment reference.
	 * @see #setX(Coordinate)
	 * @see svg.SvgPackage#getText_X()
	 * @model containment="true"
	 * @generated
	 */
	Coordinate getX();

	/**
	 * Sets the value of the '{@link svg.Text#getX <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' containment reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(Coordinate value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' containment reference.
	 * @see #setY(Coordinate)
	 * @see svg.SvgPackage#getText_Y()
	 * @model containment="true"
	 * @generated
	 */
	Coordinate getY();

	/**
	 * Sets the value of the '{@link svg.Text#getY <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' containment reference.
	 * @see #getY()
	 * @generated
	 */
	void setY(Coordinate value);

	/**
	 * Returns the value of the '<em><b>Dx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dx</em>' containment reference.
	 * @see #setDx(Length)
	 * @see svg.SvgPackage#getText_Dx()
	 * @model containment="true"
	 * @generated
	 */
	Length getDx();

	/**
	 * Sets the value of the '{@link svg.Text#getDx <em>Dx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dx</em>' containment reference.
	 * @see #getDx()
	 * @generated
	 */
	void setDx(Length value);

	/**
	 * Returns the value of the '<em><b>Dy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dy</em>' containment reference.
	 * @see #setDy(Length)
	 * @see svg.SvgPackage#getText_Dy()
	 * @model containment="true"
	 * @generated
	 */
	Length getDy();

	/**
	 * Sets the value of the '{@link svg.Text#getDy <em>Dy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dy</em>' containment reference.
	 * @see #getDy()
	 * @generated
	 */
	void setDy(Length value);

	/**
	 * Returns the value of the '<em><b>Text Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Length</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Length</em>' containment reference.
	 * @see #setTextLength(Length)
	 * @see svg.SvgPackage#getText_TextLength()
	 * @model containment="true"
	 * @generated
	 */
	Length getTextLength();

	/**
	 * Sets the value of the '{@link svg.Text#getTextLength <em>Text Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Length</em>' containment reference.
	 * @see #getTextLength()
	 * @generated
	 */
	void setTextLength(Length value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see svg.SvgPackage#getText_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link svg.Text#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Text
