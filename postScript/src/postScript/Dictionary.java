/**
 */
package postScript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link postScript.Dictionary#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see postScript.PostScriptPackage#getDictionary()
 * @model
 * @generated
 */
public interface Dictionary extends postScript.Object {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' reference list.
	 * The list contents are of type {@link postScript.DictionaryEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' reference list.
	 * @see postScript.PostScriptPackage#getDictionary_Entries()
	 * @model
	 * @generated
	 */
	EList<DictionaryEntry> getEntries();

} // Dictionary
