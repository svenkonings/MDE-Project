/**
 */
package svg;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Translate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.Translate#getX <em>X</em>}</li>
 *   <li>{@link svg.Translate#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getTranslate()
 * @model
 * @generated
 */
public interface Translate extends TransformValue {
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
	 * @see svg.SvgPackage#getTranslate_X()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getX();

	/**
	 * Sets the value of the '{@link svg.Translate#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(BigDecimal value);

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
	 * @see svg.SvgPackage#getTranslate_Y()
	 * @model
	 * @generated
	 */
	BigDecimal getY();

	/**
	 * Sets the value of the '{@link svg.Translate#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(BigDecimal value);

} // Translate
