/**
 */
package svg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stroke Dash Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.StrokeDashArray#getStrokeDashArray <em>Stroke Dash Array</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getStrokeDashArray()
 * @model
 * @generated
 */
public interface StrokeDashArray extends Attribute {
	/**
	 * Returns the value of the '<em><b>Stroke Dash Array</b></em>' containment reference list.
	 * The list contents are of type {@link svg.Length}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke Dash Array</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Dash Array</em>' containment reference list.
	 * @see svg.SvgPackage#getStrokeDashArray_StrokeDashArray()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Length> getStrokeDashArray();

} // StrokeDashArray
