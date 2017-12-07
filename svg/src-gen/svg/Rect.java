/**
 */
package svg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.Rect#getX <em>X</em>}</li>
 *   <li>{@link svg.Rect#getY <em>Y</em>}</li>
 *   <li>{@link svg.Rect#getWidth <em>Width</em>}</li>
 *   <li>{@link svg.Rect#getHeight <em>Height</em>}</li>
 *   <li>{@link svg.Rect#getRx <em>Rx</em>}</li>
 *   <li>{@link svg.Rect#getRy <em>Ry</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getRect()
 * @model
 * @generated
 */
public interface Rect extends GraphicElement {
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
	 * @see svg.SvgPackage#getRect_X()
	 * @model containment="true"
	 * @generated
	 */
	Coordinate getX();

	/**
	 * Sets the value of the '{@link svg.Rect#getX <em>X</em>}' containment reference.
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
	 * @see svg.SvgPackage#getRect_Y()
	 * @model containment="true"
	 * @generated
	 */
	Coordinate getY();

	/**
	 * Sets the value of the '{@link svg.Rect#getY <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' containment reference.
	 * @see #getY()
	 * @generated
	 */
	void setY(Coordinate value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' containment reference.
	 * @see #setWidth(Length)
	 * @see svg.SvgPackage#getRect_Width()
	 * @model containment="true"
	 * @generated
	 */
	Length getWidth();

	/**
	 * Sets the value of the '{@link svg.Rect#getWidth <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' containment reference.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Length value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' containment reference.
	 * @see #setHeight(Length)
	 * @see svg.SvgPackage#getRect_Height()
	 * @model containment="true"
	 * @generated
	 */
	Length getHeight();

	/**
	 * Sets the value of the '{@link svg.Rect#getHeight <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' containment reference.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Length value);

	/**
	 * Returns the value of the '<em><b>Rx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rx</em>' containment reference.
	 * @see #setRx(Length)
	 * @see svg.SvgPackage#getRect_Rx()
	 * @model containment="true"
	 * @generated
	 */
	Length getRx();

	/**
	 * Sets the value of the '{@link svg.Rect#getRx <em>Rx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rx</em>' containment reference.
	 * @see #getRx()
	 * @generated
	 */
	void setRx(Length value);

	/**
	 * Returns the value of the '<em><b>Ry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ry</em>' containment reference.
	 * @see #setRy(Length)
	 * @see svg.SvgPackage#getRect_Ry()
	 * @model containment="true"
	 * @generated
	 */
	Length getRy();

	/**
	 * Sets the value of the '{@link svg.Rect#getRy <em>Ry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ry</em>' containment reference.
	 * @see #getRy()
	 * @generated
	 */
	void setRy(Length value);

} // Rect
