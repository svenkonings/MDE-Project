/**
 */
package postScript;

import java.lang.String;

import java.math.BigInteger;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link postScript.Program#getObject <em>Object</em>}</li>
 *   <li>{@link postScript.Program#getLowerLeftX <em>Lower Left X</em>}</li>
 *   <li>{@link postScript.Program#getLowerLeftY <em>Lower Left Y</em>}</li>
 *   <li>{@link postScript.Program#getUpperRightX <em>Upper Right X</em>}</li>
 *   <li>{@link postScript.Program#getUpperRightY <em>Upper Right Y</em>}</li>
 *   <li>{@link postScript.Program#getTitle <em>Title</em>}</li>
 *   <li>{@link postScript.Program#getCreator <em>Creator</em>}</li>
 *   <li>{@link postScript.Program#getCreationDate <em>Creation Date</em>}</li>
 * </ul>
 *
 * @see postScript.PostScriptPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link postScript.Object}.
	 * It is bidirectional and its opposite is '{@link postScript.Object#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see postScript.PostScriptPackage#getProgram_Object()
	 * @see postScript.Object#getProgram
	 * @model opposite="program" containment="true"
	 * @generated
	 */
	EList<postScript.Object> getObject();

	/**
	 * Returns the value of the '<em><b>Lower Left X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Left X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Left X</em>' attribute.
	 * @see #setLowerLeftX(BigInteger)
	 * @see postScript.PostScriptPackage#getProgram_LowerLeftX()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getLowerLeftX();

	/**
	 * Sets the value of the '{@link postScript.Program#getLowerLeftX <em>Lower Left X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Left X</em>' attribute.
	 * @see #getLowerLeftX()
	 * @generated
	 */
	void setLowerLeftX(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Lower Left Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Left Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Left Y</em>' attribute.
	 * @see #setLowerLeftY(BigInteger)
	 * @see postScript.PostScriptPackage#getProgram_LowerLeftY()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getLowerLeftY();

	/**
	 * Sets the value of the '{@link postScript.Program#getLowerLeftY <em>Lower Left Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Left Y</em>' attribute.
	 * @see #getLowerLeftY()
	 * @generated
	 */
	void setLowerLeftY(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Upper Right X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Right X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Right X</em>' attribute.
	 * @see #setUpperRightX(BigInteger)
	 * @see postScript.PostScriptPackage#getProgram_UpperRightX()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getUpperRightX();

	/**
	 * Sets the value of the '{@link postScript.Program#getUpperRightX <em>Upper Right X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Right X</em>' attribute.
	 * @see #getUpperRightX()
	 * @generated
	 */
	void setUpperRightX(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Upper Right Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Right Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Right Y</em>' attribute.
	 * @see #setUpperRightY(BigInteger)
	 * @see postScript.PostScriptPackage#getProgram_UpperRightY()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getUpperRightY();

	/**
	 * Sets the value of the '{@link postScript.Program#getUpperRightY <em>Upper Right Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Right Y</em>' attribute.
	 * @see #getUpperRightY()
	 * @generated
	 */
	void setUpperRightY(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see postScript.PostScriptPackage#getProgram_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link postScript.Program#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator</em>' attribute.
	 * @see #setCreator(String)
	 * @see postScript.PostScriptPackage#getProgram_Creator()
	 * @model
	 * @generated
	 */
	String getCreator();

	/**
	 * Sets the value of the '{@link postScript.Program#getCreator <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' attribute.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(String)
	 * @see postScript.PostScriptPackage#getProgram_CreationDate()
	 * @model
	 * @generated
	 */
	String getCreationDate();

	/**
	 * Sets the value of the '{@link postScript.Program#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(String value);

} // Program
