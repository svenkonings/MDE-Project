/**
 */
package svg;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Line To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.RelativeLineTo#getDx <em>Dx</em>}</li>
 *   <li>{@link svg.RelativeLineTo#getDy <em>Dy</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getRelativeLineTo()
 * @model
 * @generated
 */
public interface RelativeLineTo extends PathValue {
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
	 * @see svg.SvgPackage#getRelativeLineTo_Dx()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getDx();

	/**
	 * Sets the value of the '{@link svg.RelativeLineTo#getDx <em>Dx</em>}' attribute.
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
	 * @see svg.SvgPackage#getRelativeLineTo_Dy()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getDy();

	/**
	 * Sets the value of the '{@link svg.RelativeLineTo#getDy <em>Dy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dy</em>' attribute.
	 * @see #getDy()
	 * @generated
	 */
	void setDy(BigDecimal value);

} // RelativeLineTo
