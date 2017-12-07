/**
 */
package svg;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.Matrix#getA <em>A</em>}</li>
 *   <li>{@link svg.Matrix#getB <em>B</em>}</li>
 *   <li>{@link svg.Matrix#getC <em>C</em>}</li>
 *   <li>{@link svg.Matrix#getD <em>D</em>}</li>
 *   <li>{@link svg.Matrix#getE <em>E</em>}</li>
 *   <li>{@link svg.Matrix#getF <em>F</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getMatrix()
 * @model
 * @generated
 */
public interface Matrix extends TransformValue {
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
	 * @see svg.SvgPackage#getMatrix_A()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getA();

	/**
	 * Sets the value of the '{@link svg.Matrix#getA <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A</em>' attribute.
	 * @see #getA()
	 * @generated
	 */
	void setA(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' attribute.
	 * @see #setB(BigDecimal)
	 * @see svg.SvgPackage#getMatrix_B()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getB();

	/**
	 * Sets the value of the '{@link svg.Matrix#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' attribute.
	 * @see #getB()
	 * @generated
	 */
	void setB(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C</em>' attribute.
	 * @see #setC(BigDecimal)
	 * @see svg.SvgPackage#getMatrix_C()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getC();

	/**
	 * Sets the value of the '{@link svg.Matrix#getC <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C</em>' attribute.
	 * @see #getC()
	 * @generated
	 */
	void setC(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>D</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>D</em>' attribute.
	 * @see #setD(BigDecimal)
	 * @see svg.SvgPackage#getMatrix_D()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getD();

	/**
	 * Sets the value of the '{@link svg.Matrix#getD <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>D</em>' attribute.
	 * @see #getD()
	 * @generated
	 */
	void setD(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>E</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>E</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E</em>' attribute.
	 * @see #setE(BigDecimal)
	 * @see svg.SvgPackage#getMatrix_E()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getE();

	/**
	 * Sets the value of the '{@link svg.Matrix#getE <em>E</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E</em>' attribute.
	 * @see #getE()
	 * @generated
	 */
	void setE(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>F</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F</em>' attribute.
	 * @see #setF(BigDecimal)
	 * @see svg.SvgPackage#getMatrix_F()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getF();

	/**
	 * Sets the value of the '{@link svg.Matrix#getF <em>F</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F</em>' attribute.
	 * @see #getF()
	 * @generated
	 */
	void setF(BigDecimal value);

} // Matrix
