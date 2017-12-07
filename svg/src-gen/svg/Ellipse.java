/**
 */
package svg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ellipse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.Ellipse#getCx <em>Cx</em>}</li>
 *   <li>{@link svg.Ellipse#getCy <em>Cy</em>}</li>
 *   <li>{@link svg.Ellipse#getRx <em>Rx</em>}</li>
 *   <li>{@link svg.Ellipse#getRy <em>Ry</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getEllipse()
 * @model
 * @generated
 */
public interface Ellipse extends GraphicElement {
	/**
	 * Returns the value of the '<em><b>Cx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cx</em>' containment reference.
	 * @see #setCx(Coordinate)
	 * @see svg.SvgPackage#getEllipse_Cx()
	 * @model containment="true"
	 * @generated
	 */
	Coordinate getCx();

	/**
	 * Sets the value of the '{@link svg.Ellipse#getCx <em>Cx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cx</em>' containment reference.
	 * @see #getCx()
	 * @generated
	 */
	void setCx(Coordinate value);

	/**
	 * Returns the value of the '<em><b>Cy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cy</em>' containment reference.
	 * @see #setCy(Coordinate)
	 * @see svg.SvgPackage#getEllipse_Cy()
	 * @model containment="true"
	 * @generated
	 */
	Coordinate getCy();

	/**
	 * Sets the value of the '{@link svg.Ellipse#getCy <em>Cy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cy</em>' containment reference.
	 * @see #getCy()
	 * @generated
	 */
	void setCy(Coordinate value);

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
	 * @see svg.SvgPackage#getEllipse_Rx()
	 * @model containment="true"
	 * @generated
	 */
	Length getRx();

	/**
	 * Sets the value of the '{@link svg.Ellipse#getRx <em>Rx</em>}' containment reference.
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
	 * @see svg.SvgPackage#getEllipse_Ry()
	 * @model containment="true"
	 * @generated
	 */
	Length getRy();

	/**
	 * Sets the value of the '{@link svg.Ellipse#getRy <em>Ry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ry</em>' containment reference.
	 * @see #getRy()
	 * @generated
	 */
	void setRy(Length value);

} // Ellipse
