/**
 */
package svg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.Line#getX1 <em>X1</em>}</li>
 *   <li>{@link svg.Line#getY1 <em>Y1</em>}</li>
 *   <li>{@link svg.Line#getX2 <em>X2</em>}</li>
 *   <li>{@link svg.Line#getY2 <em>Y2</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends GraphicElement {
	/**
	 * Returns the value of the '<em><b>X1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X1</em>' containment reference.
	 * @see #setX1(Coordinate)
	 * @see svg.SvgPackage#getLine_X1()
	 * @model containment="true"
	 * @generated
	 */
	Coordinate getX1();

	/**
	 * Sets the value of the '{@link svg.Line#getX1 <em>X1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X1</em>' containment reference.
	 * @see #getX1()
	 * @generated
	 */
	void setX1(Coordinate value);

	/**
	 * Returns the value of the '<em><b>Y1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y1</em>' containment reference.
	 * @see #setY1(Coordinate)
	 * @see svg.SvgPackage#getLine_Y1()
	 * @model containment="true"
	 * @generated
	 */
	Coordinate getY1();

	/**
	 * Sets the value of the '{@link svg.Line#getY1 <em>Y1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y1</em>' containment reference.
	 * @see #getY1()
	 * @generated
	 */
	void setY1(Coordinate value);

	/**
	 * Returns the value of the '<em><b>X2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X2</em>' containment reference.
	 * @see #setX2(Coordinate)
	 * @see svg.SvgPackage#getLine_X2()
	 * @model containment="true"
	 * @generated
	 */
	Coordinate getX2();

	/**
	 * Sets the value of the '{@link svg.Line#getX2 <em>X2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X2</em>' containment reference.
	 * @see #getX2()
	 * @generated
	 */
	void setX2(Coordinate value);

	/**
	 * Returns the value of the '<em><b>Y2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y2</em>' containment reference.
	 * @see #setY2(Coordinate)
	 * @see svg.SvgPackage#getLine_Y2()
	 * @model containment="true"
	 * @generated
	 */
	Coordinate getY2();

	/**
	 * Sets the value of the '{@link svg.Line#getY2 <em>Y2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y2</em>' containment reference.
	 * @see #getY2()
	 * @generated
	 */
	void setY2(Coordinate value);

} // Line
