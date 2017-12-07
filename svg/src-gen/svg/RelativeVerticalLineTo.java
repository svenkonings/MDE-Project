/**
 */
package svg;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Vertical Line To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.RelativeVerticalLineTo#getDy <em>Dy</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getRelativeVerticalLineTo()
 * @model
 * @generated
 */
public interface RelativeVerticalLineTo extends PathValue {
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
	 * @see svg.SvgPackage#getRelativeVerticalLineTo_Dy()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getDy();

	/**
	 * Sets the value of the '{@link svg.RelativeVerticalLineTo#getDy <em>Dy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dy</em>' attribute.
	 * @see #getDy()
	 * @generated
	 */
	void setDy(BigDecimal value);

} // RelativeVerticalLineTo
