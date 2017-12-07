/**
 */
package svg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.Point#getX <em>X</em>}</li>
 *   <li>{@link svg.Point#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends AttributeType {
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
	 * @see svg.SvgPackage#getPoint_X()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coordinate getX();

	/**
	 * Sets the value of the '{@link svg.Point#getX <em>X</em>}' containment reference.
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
	 * @see svg.SvgPackage#getPoint_Y()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coordinate getY();

	/**
	 * Sets the value of the '{@link svg.Point#getY <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' containment reference.
	 * @see #getY()
	 * @generated
	 */
	void setY(Coordinate value);

} // Point
