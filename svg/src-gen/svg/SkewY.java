/**
 */
package svg;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skew Y</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.SkewY#getA <em>A</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getSkewY()
 * @model
 * @generated
 */
public interface SkewY extends TransformValue {
	/**
	 * Returns the value of the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' attribute.
	 * @see #setA(BigDecimal)
	 * @see svg.SvgPackage#getSkewY_A()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getA();

	/**
	 * Sets the value of the '{@link svg.SkewY#getA <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A</em>' attribute.
	 * @see #getA()
	 * @generated
	 */
	void setA(BigDecimal value);

} // SkewY
