/**
 */
package svg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clip Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.ClipPath#getGraphicElements <em>Graphic Elements</em>}</li>
 *   <li>{@link svg.ClipPath#getUse <em>Use</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getClipPath()
 * @model
 * @generated
 */
public interface ClipPath extends StructuralElement {
	/**
	 * Returns the value of the '<em><b>Graphic Elements</b></em>' containment reference list.
	 * The list contents are of type {@link svg.GraphicElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graphic Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphic Elements</em>' containment reference list.
	 * @see svg.SvgPackage#getClipPath_GraphicElements()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<GraphicElement> getGraphicElements();

	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference list.
	 * The list contents are of type {@link svg.Use}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' containment reference list.
	 * @see svg.SvgPackage#getClipPath_Use()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Use> getUse();

} // ClipPath
