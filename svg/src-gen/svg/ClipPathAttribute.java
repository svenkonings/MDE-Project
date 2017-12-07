/**
 */
package svg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clip Path Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.ClipPathAttribute#getClipPath <em>Clip Path</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getClipPathAttribute()
 * @model
 * @generated
 */
public interface ClipPathAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Clip Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clip Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clip Path</em>' containment reference.
	 * @see #setClipPath(LocalIri)
	 * @see svg.SvgPackage#getClipPathAttribute_ClipPath()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LocalIri getClipPath();

	/**
	 * Sets the value of the '{@link svg.ClipPathAttribute#getClipPath <em>Clip Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clip Path</em>' containment reference.
	 * @see #getClipPath()
	 * @generated
	 */
	void setClipPath(LocalIri value);

} // ClipPathAttribute
