/**
 */
package svg;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stroke Width</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.StrokeWidth#getStrokeWidth <em>Stroke Width</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getStrokeWidth()
 * @model
 * @generated
 */
public interface StrokeWidth extends Attribute {
	/**
	 * Returns the value of the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Width</em>' attribute.
	 * @see #setStrokeWidth(BigDecimal)
	 * @see svg.SvgPackage#getStrokeWidth_StrokeWidth()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getStrokeWidth();

	/**
	 * Sets the value of the '{@link svg.StrokeWidth#getStrokeWidth <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Width</em>' attribute.
	 * @see #getStrokeWidth()
	 * @generated
	 */
	void setStrokeWidth(BigDecimal value);

} // StrokeWidth
