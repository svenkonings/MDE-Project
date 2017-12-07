/**
 */
package postScript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link postScript.Array#getObjects <em>Objects</em>}</li>
 * </ul>
 *
 * @see postScript.PostScriptPackage#getArray()
 * @model
 * @generated
 */
public interface Array extends postScript.Object {
	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link postScript.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see postScript.PostScriptPackage#getArray_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<postScript.Object> getObjects();

} // Array
