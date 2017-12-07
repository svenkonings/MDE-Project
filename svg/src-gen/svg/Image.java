/**
 */
package svg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.Image#getX <em>X</em>}</li>
 *   <li>{@link svg.Image#getY <em>Y</em>}</li>
 *   <li>{@link svg.Image#getWidth <em>Width</em>}</li>
 *   <li>{@link svg.Image#getHeight <em>Height</em>}</li>
 *   <li>{@link svg.Image#getHref <em>Href</em>}</li>
 *   <li>{@link svg.Image#getPreserveAspectRatio <em>Preserve Aspect Ratio</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends GraphicElement {
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
	 * @see svg.SvgPackage#getImage_X()
	 * @model containment="true"
	 * @generated
	 */
	Coordinate getX();

	/**
	 * Sets the value of the '{@link svg.Image#getX <em>X</em>}' containment reference.
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
	 * @see svg.SvgPackage#getImage_Y()
	 * @model containment="true"
	 * @generated
	 */
	Coordinate getY();

	/**
	 * Sets the value of the '{@link svg.Image#getY <em>Y</em>}' containment reference.
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
	 * @see svg.SvgPackage#getImage_Width()
	 * @model containment="true"
	 * @generated
	 */
	Length getWidth();

	/**
	 * Sets the value of the '{@link svg.Image#getWidth <em>Width</em>}' containment reference.
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
	 * @see svg.SvgPackage#getImage_Height()
	 * @model containment="true"
	 * @generated
	 */
	Length getHeight();

	/**
	 * Sets the value of the '{@link svg.Image#getHeight <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' containment reference.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Length value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Href</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' containment reference.
	 * @see #setHref(Href)
	 * @see svg.SvgPackage#getImage_Href()
	 * @model containment="true"
	 * @generated
	 */
	Href getHref();

	/**
	 * Sets the value of the '{@link svg.Image#getHref <em>Href</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' containment reference.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(Href value);

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
	 * @see svg.SvgPackage#getImage_PreserveAspectRatio()
	 * @model containment="true"
	 * @generated
	 */
	PreserveAspectRatio getPreserveAspectRatio();

	/**
	 * Sets the value of the '{@link svg.Image#getPreserveAspectRatio <em>Preserve Aspect Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preserve Aspect Ratio</em>' containment reference.
	 * @see #getPreserveAspectRatio()
	 * @generated
	 */
	void setPreserveAspectRatio(PreserveAspectRatio value);

} // Image
