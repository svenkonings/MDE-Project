/**
 */
package svg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.Path#getPath <em>Path</em>}</li>
 *   <li>{@link svg.Path#getPathLength <em>Path Length</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getPath()
 * @model
 * @generated
 */
public interface Path extends GraphicElement {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference list.
	 * The list contents are of type {@link svg.PathValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference list.
	 * @see svg.SvgPackage#getPath_Path()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<PathValue> getPath();

	/**
	 * Returns the value of the '<em><b>Path Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Length</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Length</em>' containment reference.
	 * @see #setPathLength(Length)
	 * @see svg.SvgPackage#getPath_PathLength()
	 * @model containment="true"
	 * @generated
	 */
	Length getPathLength();

	/**
	 * Sets the value of the '{@link svg.Path#getPathLength <em>Path Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Length</em>' containment reference.
	 * @see #getPathLength()
	 * @generated
	 */
	void setPathLength(Length value);

} // Path
