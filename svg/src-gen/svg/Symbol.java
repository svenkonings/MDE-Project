/**
 */
package svg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.Symbol#getPreserveAspectRatio <em>Preserve Aspect Ratio</em>}</li>
 *   <li>{@link svg.Symbol#getViewBox <em>View Box</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getSymbol()
 * @model
 * @generated
 */
public interface Symbol extends Defs {
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
	 * @see svg.SvgPackage#getSymbol_PreserveAspectRatio()
	 * @model containment="true"
	 * @generated
	 */
	PreserveAspectRatio getPreserveAspectRatio();

	/**
	 * Sets the value of the '{@link svg.Symbol#getPreserveAspectRatio <em>Preserve Aspect Ratio</em>}' containment reference.
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
	 * @see svg.SvgPackage#getSymbol_ViewBox()
	 * @model containment="true"
	 * @generated
	 */
	ViewBox getViewBox();

	/**
	 * Sets the value of the '{@link svg.Symbol#getViewBox <em>View Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Box</em>' containment reference.
	 * @see #getViewBox()
	 * @generated
	 */
	void setViewBox(ViewBox value);

} // Symbol
