/**
 */
package svg;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Quadratic Curve To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.RelativeQuadraticCurveTo#getDcx <em>Dcx</em>}</li>
 *   <li>{@link svg.RelativeQuadraticCurveTo#getDcy <em>Dcy</em>}</li>
 *   <li>{@link svg.RelativeQuadraticCurveTo#getDx <em>Dx</em>}</li>
 *   <li>{@link svg.RelativeQuadraticCurveTo#getDy <em>Dy</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getRelativeQuadraticCurveTo()
 * @model
 * @generated
 */
public interface RelativeQuadraticCurveTo extends PathValue {
	/**
	 * Returns the value of the '<em><b>Dcx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dcx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dcx</em>' attribute.
	 * @see #setDcx(BigDecimal)
	 * @see svg.SvgPackage#getRelativeQuadraticCurveTo_Dcx()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getDcx();

	/**
	 * Sets the value of the '{@link svg.RelativeQuadraticCurveTo#getDcx <em>Dcx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcx</em>' attribute.
	 * @see #getDcx()
	 * @generated
	 */
	void setDcx(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Dcy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dcy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dcy</em>' attribute.
	 * @see #setDcy(BigDecimal)
	 * @see svg.SvgPackage#getRelativeQuadraticCurveTo_Dcy()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getDcy();

	/**
	 * Sets the value of the '{@link svg.RelativeQuadraticCurveTo#getDcy <em>Dcy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcy</em>' attribute.
	 * @see #getDcy()
	 * @generated
	 */
	void setDcy(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Dx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dx</em>' attribute.
	 * @see #setDx(BigDecimal)
	 * @see svg.SvgPackage#getRelativeQuadraticCurveTo_Dx()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getDx();

	/**
	 * Sets the value of the '{@link svg.RelativeQuadraticCurveTo#getDx <em>Dx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dx</em>' attribute.
	 * @see #getDx()
	 * @generated
	 */
	void setDx(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Dy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dy</em>' attribute.
	 * @see #setDy(BigDecimal)
	 * @see svg.SvgPackage#getRelativeQuadraticCurveTo_Dy()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getDy();

	/**
	 * Sets the value of the '{@link svg.RelativeQuadraticCurveTo#getDy <em>Dy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dy</em>' attribute.
	 * @see #getDy()
	 * @generated
	 */
	void setDy(BigDecimal value);

} // RelativeQuadraticCurveTo
