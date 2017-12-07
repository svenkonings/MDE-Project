/**
 */
package svg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.ViewBox#getMinX <em>Min X</em>}</li>
 *   <li>{@link svg.ViewBox#getMinY <em>Min Y</em>}</li>
 *   <li>{@link svg.ViewBox#getWidth <em>Width</em>}</li>
 *   <li>{@link svg.ViewBox#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getViewBox()
 * @model
 * @generated
 */
public interface ViewBox extends AttributeType {
	/**
	 * Returns the value of the '<em><b>Min X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min X</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min X</em>' containment reference.
	 * @see #setMinX(Coordinate)
	 * @see svg.SvgPackage#getViewBox_MinX()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coordinate getMinX();

	/**
	 * Sets the value of the '{@link svg.ViewBox#getMinX <em>Min X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min X</em>' containment reference.
	 * @see #getMinX()
	 * @generated
	 */
	void setMinX(Coordinate value);

	/**
	 * Returns the value of the '<em><b>Min Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Y</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Y</em>' containment reference.
	 * @see #setMinY(Coordinate)
	 * @see svg.SvgPackage#getViewBox_MinY()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coordinate getMinY();

	/**
	 * Sets the value of the '{@link svg.ViewBox#getMinY <em>Min Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Y</em>' containment reference.
	 * @see #getMinY()
	 * @generated
	 */
	void setMinY(Coordinate value);

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
	 * @see svg.SvgPackage#getViewBox_Width()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Length getWidth();

	/**
	 * Sets the value of the '{@link svg.ViewBox#getWidth <em>Width</em>}' containment reference.
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
	 * @see svg.SvgPackage#getViewBox_Height()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Length getHeight();

	/**
	 * Sets the value of the '{@link svg.ViewBox#getHeight <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' containment reference.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Length value);

} // ViewBox
