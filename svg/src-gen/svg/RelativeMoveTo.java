/**
 */
package svg;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Move To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.RelativeMoveTo#getDx <em>Dx</em>}</li>
 *   <li>{@link svg.RelativeMoveTo#getDy <em>Dy</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getRelativeMoveTo()
 * @model
 * @generated
 */
public interface RelativeMoveTo extends PathValue {
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
	 * @see svg.SvgPackage#getRelativeMoveTo_Dx()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getDx();

	/**
	 * Sets the value of the '{@link svg.RelativeMoveTo#getDx <em>Dx</em>}' attribute.
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
	 * @see svg.SvgPackage#getRelativeMoveTo_Dy()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getDy();

	/**
	 * Sets the value of the '{@link svg.RelativeMoveTo#getDy <em>Dy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dy</em>' attribute.
	 * @see #getDy()
	 * @generated
	 */
	void setDy(BigDecimal value);

} // RelativeMoveTo
