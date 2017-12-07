/**
 */
package svg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Svg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.Svg#getX <em>X</em>}</li>
 *   <li>{@link svg.Svg#getY <em>Y</em>}</li>
 *   <li>{@link svg.Svg#getWidth <em>Width</em>}</li>
 *   <li>{@link svg.Svg#getHeight <em>Height</em>}</li>
 *   <li>{@link svg.Svg#getPreserveAspectRatio <em>Preserve Aspect Ratio</em>}</li>
 *   <li>{@link svg.Svg#getViewBox <em>View Box</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getSvg()
 * @model
 * @generated
 */
public interface Svg extends Group {
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
	 * @see svg.SvgPackage#getSvg_X()
	 * @model containment="true"
	 * @generated
	 */
	Coordinate getX();

	/**
	 * Sets the value of the '{@link svg.Svg#getX <em>X</em>}' containment reference.
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
	 * @see svg.SvgPackage#getSvg_Y()
	 * @model containment="true"
	 * @generated
	 */
	Coordinate getY();

	/**
	 * Sets the value of the '{@link svg.Svg#getY <em>Y</em>}' containment reference.
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
	 * @see svg.SvgPackage#getSvg_Width()
	 * @model containment="true"
	 * @generated
	 */
	Length getWidth();

	/**
	 * Sets the value of the '{@link svg.Svg#getWidth <em>Width</em>}' containment reference.
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
	 * @see svg.SvgPackage#getSvg_Height()
	 * @model containment="true"
	 * @generated
	 */
	Length getHeight();

	/**
	 * Sets the value of the '{@link svg.Svg#getHeight <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' containment reference.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Length value);

	/**
	 * Returns the value of the '<em><b>Preserve Aspect Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preserve Aspect Ratio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preserve Aspect Ratio</em>' containment reference.
	 * @see #setPreserveAspectRatio(PreserveAspectRatio)
	 * @see svg.SvgPackage#getSvg_PreserveAspectRatio()
	 * @model containment="true"
	 * @generated
	 */
	PreserveAspectRatio getPreserveAspectRatio();

	/**
	 * Sets the value of the '{@link svg.Svg#getPreserveAspectRatio <em>Preserve Aspect Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preserve Aspect Ratio</em>' containment reference.
	 * @see #getPreserveAspectRatio()
	 * @generated
	 */
	void setPreserveAspectRatio(PreserveAspectRatio value);

	/**
	 * Returns the value of the '<em><b>View Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Box</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Box</em>' containment reference.
	 * @see #setViewBox(ViewBox)
	 * @see svg.SvgPackage#getSvg_ViewBox()
	 * @model containment="true"
	 * @generated
	 */
	ViewBox getViewBox();

	/**
	 * Sets the value of the '{@link svg.Svg#getViewBox <em>View Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Box</em>' containment reference.
	 * @see #getViewBox()
	 * @generated
	 */
	void setViewBox(ViewBox value);

} // Svg
