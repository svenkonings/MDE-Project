/**
 */
package svg;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Horizontal Line To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.RelativeHorizontalLineTo#getDx <em>Dx</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getRelativeHorizontalLineTo()
 * @model
 * @generated
 */
public interface RelativeHorizontalLineTo extends PathValue {
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
	 * @see svg.SvgPackage#getRelativeHorizontalLineTo_Dx()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getDx();

	/**
	 * Sets the value of the '{@link svg.RelativeHorizontalLineTo#getDx <em>Dx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dx</em>' attribute.
	 * @see #getDx()
	 * @generated
	 */
	void setDx(BigDecimal value);

} // RelativeHorizontalLineTo
