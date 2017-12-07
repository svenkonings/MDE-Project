/**
 */
package svg;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Absolute Horizontal Line To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.AbsoluteHorizontalLineTo#getX <em>X</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getAbsoluteHorizontalLineTo()
 * @model
 * @generated
 */
public interface AbsoluteHorizontalLineTo extends PathValue {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(BigDecimal)
	 * @see svg.SvgPackage#getAbsoluteHorizontalLineTo_X()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getX();

	/**
	 * Sets the value of the '{@link svg.AbsoluteHorizontalLineTo#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(BigDecimal value);

} // AbsoluteHorizontalLineTo
