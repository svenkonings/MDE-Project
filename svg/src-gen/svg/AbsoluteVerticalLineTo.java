/**
 */
package svg;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Absolute Vertical Line To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.AbsoluteVerticalLineTo#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getAbsoluteVerticalLineTo()
 * @model
 * @generated
 */
public interface AbsoluteVerticalLineTo extends PathValue {
	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(BigDecimal)
	 * @see svg.SvgPackage#getAbsoluteVerticalLineTo_Y()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getY();

	/**
	 * Sets the value of the '{@link svg.AbsoluteVerticalLineTo#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(BigDecimal value);

} // AbsoluteVerticalLineTo
