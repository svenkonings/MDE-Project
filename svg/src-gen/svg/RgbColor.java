/**
 */
package svg;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rgb Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.RgbColor#getRed <em>Red</em>}</li>
 *   <li>{@link svg.RgbColor#getGreen <em>Green</em>}</li>
 *   <li>{@link svg.RgbColor#getBlue <em>Blue</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getRgbColor()
 * @model
 * @generated
 */
public interface RgbColor extends Color {
	/**
	 * Returns the value of the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Red</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red</em>' attribute.
	 * @see #setRed(BigInteger)
	 * @see svg.SvgPackage#getRgbColor_Red()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getRed();

	/**
	 * Sets the value of the '{@link svg.RgbColor#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red</em>' attribute.
	 * @see #getRed()
	 * @generated
	 */
	void setRed(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Green</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green</em>' attribute.
	 * @see #setGreen(BigInteger)
	 * @see svg.SvgPackage#getRgbColor_Green()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getGreen();

	/**
	 * Sets the value of the '{@link svg.RgbColor#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green</em>' attribute.
	 * @see #getGreen()
	 * @generated
	 */
	void setGreen(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue</em>' attribute.
	 * @see #setBlue(BigInteger)
	 * @see svg.SvgPackage#getRgbColor_Blue()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getBlue();

	/**
	 * Sets the value of the '{@link svg.RgbColor#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue</em>' attribute.
	 * @see #getBlue()
	 * @generated
	 */
	void setBlue(BigInteger value);

} // RgbColor
