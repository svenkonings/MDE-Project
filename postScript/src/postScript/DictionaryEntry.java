/**
 */
package postScript;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link postScript.DictionaryEntry#getKey <em>Key</em>}</li>
 *   <li>{@link postScript.DictionaryEntry#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see postScript.PostScriptPackage#getDictionaryEntry()
 * @model
 * @generated
 */
public interface DictionaryEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(postScript.Object)
	 * @see postScript.PostScriptPackage#getDictionaryEntry_Key()
	 * @model containment="true" required="true"
	 * @generated
	 */
	postScript.Object getKey();

	/**
	 * Sets the value of the '{@link postScript.DictionaryEntry#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(postScript.Object value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(postScript.Object)
	 * @see postScript.PostScriptPackage#getDictionaryEntry_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	postScript.Object getValue();

	/**
	 * Sets the value of the '{@link postScript.DictionaryEntry#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(postScript.Object value);

} // DictionaryEntry
