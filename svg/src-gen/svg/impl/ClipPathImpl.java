/**
 */
package svg.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import svg.ClipPath;
import svg.GraphicElement;
import svg.SvgPackage;
import svg.Use;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clip Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link svg.impl.ClipPathImpl#getGraphicElements <em>Graphic Elements</em>}</li>
 *   <li>{@link svg.impl.ClipPathImpl#getUse <em>Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClipPathImpl extends StructuralElementImpl implements ClipPath {
	/**
	 * The cached value of the '{@link #getGraphicElements() <em>Graphic Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicElements()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphicElement> graphicElements;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected EList<Use> use;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClipPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.CLIP_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphicElement> getGraphicElements() {
		if (graphicElements == null) {
			graphicElements = new EObjectContainmentEList<GraphicElement>(GraphicElement.class, this,
					SvgPackage.CLIP_PATH__GRAPHIC_ELEMENTS);
		}
		return graphicElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Use> getUse() {
		if (use == null) {
			use = new EObjectContainmentEList<Use>(Use.class, this, SvgPackage.CLIP_PATH__USE);
		}
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SvgPackage.CLIP_PATH__GRAPHIC_ELEMENTS:
			return ((InternalEList<?>) getGraphicElements()).basicRemove(otherEnd, msgs);
		case SvgPackage.CLIP_PATH__USE:
			return ((InternalEList<?>) getUse()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SvgPackage.CLIP_PATH__GRAPHIC_ELEMENTS:
			return getGraphicElements();
		case SvgPackage.CLIP_PATH__USE:
			return getUse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SvgPackage.CLIP_PATH__GRAPHIC_ELEMENTS:
			getGraphicElements().clear();
			getGraphicElements().addAll((Collection<? extends GraphicElement>) newValue);
			return;
		case SvgPackage.CLIP_PATH__USE:
			getUse().clear();
			getUse().addAll((Collection<? extends Use>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SvgPackage.CLIP_PATH__GRAPHIC_ELEMENTS:
			getGraphicElements().clear();
			return;
		case SvgPackage.CLIP_PATH__USE:
			getUse().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SvgPackage.CLIP_PATH__GRAPHIC_ELEMENTS:
			return graphicElements != null && !graphicElements.isEmpty();
		case SvgPackage.CLIP_PATH__USE:
			return use != null && !use.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClipPathImpl
