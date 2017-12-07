/**
 */
package svg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iri Paint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.IriPaint#getIri <em>Iri</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getIriPaint()
 * @model
 * @generated
 */
public interface IriPaint extends Paint {
	/**
	 * Returns the value of the '<em><b>Iri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iri</em>' containment reference.
	 * @see #setIri(LocalIri)
	 * @see svg.SvgPackage#getIriPaint_Iri()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LocalIri getIri();

	/**
	 * Sets the value of the '{@link svg.IriPaint#getIri <em>Iri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iri</em>' containment reference.
	 * @see #getIri()
	 * @generated
	 */
	void setIri(LocalIri value);

} // IriPaint
