/**
 */
package svg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.Circle#getCx <em>Cx</em>}</li>
 *   <li>{@link svg.Circle#getCy <em>Cy</em>}</li>
 *   <li>{@link svg.Circle#getR <em>R</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getCircle()
 * @model
 * @generated
 */
public interface Circle extends GraphicElement {
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
	 * @see svg.SvgPackage#getCircle_Cx()
	 * @model containment="true"
	 * @generated
	 */
	Coordinate getCx();

	/**
	 * Sets the value of the '{@link svg.Circle#getCx <em>Cx</em>}' containment reference.
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
	 * @see svg.SvgPackage#getCircle_Cy()
	 * @model containment="true"
	 * @generated
	 */
	Coordinate getCy();

	/**
	 * Sets the value of the '{@link svg.Circle#getCy <em>Cy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cy</em>' containment reference.
	 * @see #getCy()
	 * @generated
	 */
	void setCy(Coordinate value);

	/**
	 * Returns the value of the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' containment reference.
	 * @see #setR(Length)
	 * @see svg.SvgPackage#getCircle_R()
	 * @model containment="true"
	 * @generated
	 */
	Length getR();

	/**
	 * Sets the value of the '{@link svg.Circle#getR <em>R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' containment reference.
	 * @see #getR()
	 * @generated
	 */
	void setR(Length value);

} // Circle
