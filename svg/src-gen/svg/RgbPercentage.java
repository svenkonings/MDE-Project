/**
 */
package svg;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rgb Percentage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.RgbPercentage#getRed <em>Red</em>}</li>
 *   <li>{@link svg.RgbPercentage#getGreen <em>Green</em>}</li>
 *   <li>{@link svg.RgbPercentage#getBlue <em>Blue</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getRgbPercentage()
 * @model
 * @generated
 */
public interface RgbPercentage extends Color {
	/**
	 * Returns the value of the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Red</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red</em>' attribute.
	 * @see #setRed(BigDecimal)
	 * @see svg.SvgPackage#getRgbPercentage_Red()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getRed();

	/**
	 * Sets the value of the '{@link svg.RgbPercentage#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red</em>' attribute.
	 * @see #getRed()
	 * @generated
	 */
	void setRed(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Green</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green</em>' attribute.
	 * @see #setGreen(BigDecimal)
	 * @see svg.SvgPackage#getRgbPercentage_Green()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getGreen();

	/**
	 * Sets the value of the '{@link svg.RgbPercentage#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green</em>' attribute.
	 * @see #getGreen()
	 * @generated
	 */
	void setGreen(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue</em>' attribute.
	 * @see #setBlue(BigDecimal)
	 * @see svg.SvgPackage#getRgbPercentage_Blue()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getBlue();

	/**
	 * Sets the value of the '{@link svg.RgbPercentage#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue</em>' attribute.
	 * @see #getBlue()
	 * @generated
	 */
	void setBlue(BigDecimal value);

} // RgbPercentage
