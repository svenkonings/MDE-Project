/**
 */
package svg;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see svg.SvgFactory
 * @model kind="package"
 * @generated
 */
public interface SvgPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "svg";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/svg";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "svg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SvgPackage eINSTANCE = svg.impl.SvgPackageImpl.init();

	/**
	 * The meta object id for the '{@link svg.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.ElementImpl
	 * @see svg.impl.SvgPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ATTRIBUTES = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link svg.impl.StructuralElementImpl <em>Structural Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.StructuralElementImpl
	 * @see svg.impl.SvgPackageImpl#getStructuralElement()
	 * @generated
	 */
	int STRUCTURAL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ELEMENT__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Structural Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Structural Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.UseImpl <em>Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.UseImpl
	 * @see svg.impl.SvgPackageImpl#getUse()
	 * @generated
	 */
	int USE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__NAME = STRUCTURAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__ATTRIBUTES = STRUCTURAL_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__X = STRUCTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__Y = STRUCTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__WIDTH = STRUCTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__HEIGHT = STRUCTURAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__HREF = STRUCTURAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_FEATURE_COUNT = STRUCTURAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_OPERATION_COUNT = STRUCTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.ClipPathImpl <em>Clip Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.ClipPathImpl
	 * @see svg.impl.SvgPackageImpl#getClipPath()
	 * @generated
	 */
	int CLIP_PATH = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__NAME = STRUCTURAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__ATTRIBUTES = STRUCTURAL_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Graphic Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__GRAPHIC_ELEMENTS = STRUCTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__USE = STRUCTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Clip Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_FEATURE_COUNT = STRUCTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Clip Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_OPERATION_COUNT = STRUCTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.ContainerElementImpl <em>Container Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.ContainerElementImpl
	 * @see svg.impl.SvgPackageImpl#getContainerElement()
	 * @generated
	 */
	int CONTAINER_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__NAME = STRUCTURAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__ATTRIBUTES = STRUCTURAL_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__ELEMENTS = STRUCTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT_FEATURE_COUNT = STRUCTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Container Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT_OPERATION_COUNT = STRUCTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.GroupImpl
	 * @see svg.impl.SvgPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = CONTAINER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ATTRIBUTES = CONTAINER_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ELEMENTS = CONTAINER_ELEMENT__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = CONTAINER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = CONTAINER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.SvgImpl <em>Svg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.SvgImpl
	 * @see svg.impl.SvgPackageImpl#getSvg()
	 * @generated
	 */
	int SVG = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__NAME = GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__ATTRIBUTES = GROUP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__ELEMENTS = GROUP__ELEMENTS;

	/**
	 * The feature id for the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__X = GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__Y = GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__WIDTH = GROUP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__HEIGHT = GROUP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Preserve Aspect Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__PRESERVE_ASPECT_RATIO = GROUP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>View Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG__VIEW_BOX = GROUP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Svg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FEATURE_COUNT = GROUP_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Svg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.DefsImpl <em>Defs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.DefsImpl
	 * @see svg.impl.SvgPackageImpl#getDefs()
	 * @generated
	 */
	int DEFS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__NAME = CONTAINER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__ATTRIBUTES = CONTAINER_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS__ELEMENTS = CONTAINER_ELEMENT__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Defs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS_FEATURE_COUNT = CONTAINER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Defs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFS_OPERATION_COUNT = CONTAINER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.SymbolImpl <em>Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.SymbolImpl
	 * @see svg.impl.SvgPackageImpl#getSymbol()
	 * @generated
	 */
	int SYMBOL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__NAME = DEFS__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__ATTRIBUTES = DEFS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__ELEMENTS = DEFS__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Preserve Aspect Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__PRESERVE_ASPECT_RATIO = DEFS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>View Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__VIEW_BOX = DEFS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_FEATURE_COUNT = DEFS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_OPERATION_COUNT = DEFS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.GraphicElementImpl <em>Graphic Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.GraphicElementImpl
	 * @see svg.impl.SvgPackageImpl#getGraphicElement()
	 * @generated
	 */
	int GRAPHIC_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ELEMENT__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Graphic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Graphic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.CircleImpl <em>Circle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.CircleImpl
	 * @see svg.impl.SvgPackageImpl#getCircle()
	 * @generated
	 */
	int CIRCLE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__NAME = GRAPHIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__ATTRIBUTES = GRAPHIC_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Cx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__CX = GRAPHIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__CY = GRAPHIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__R = GRAPHIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FEATURE_COUNT = GRAPHIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_OPERATION_COUNT = GRAPHIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.EllipseImpl <em>Ellipse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.EllipseImpl
	 * @see svg.impl.SvgPackageImpl#getEllipse()
	 * @generated
	 */
	int ELLIPSE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__NAME = GRAPHIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__ATTRIBUTES = GRAPHIC_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Cx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__CX = GRAPHIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__CY = GRAPHIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__RX = GRAPHIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__RY = GRAPHIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ellipse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_FEATURE_COUNT = GRAPHIC_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ellipse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_OPERATION_COUNT = GRAPHIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.ImageImpl
	 * @see svg.impl.SvgPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = GRAPHIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ATTRIBUTES = GRAPHIC_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__X = GRAPHIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__Y = GRAPHIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__WIDTH = GRAPHIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__HEIGHT = GRAPHIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__HREF = GRAPHIC_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Preserve Aspect Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__PRESERVE_ASPECT_RATIO = GRAPHIC_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = GRAPHIC_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = GRAPHIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.LineImpl
	 * @see svg.impl.SvgPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__NAME = GRAPHIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ATTRIBUTES = GRAPHIC_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>X1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__X1 = GRAPHIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__Y1 = GRAPHIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>X2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__X2 = GRAPHIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Y2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__Y2 = GRAPHIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = GRAPHIC_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = GRAPHIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.PathImpl
	 * @see svg.impl.SvgPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__NAME = GRAPHIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__ATTRIBUTES = GRAPHIC_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__PATH = GRAPHIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__PATH_LENGTH = GRAPHIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = GRAPHIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = GRAPHIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.PolygonImpl <em>Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.PolygonImpl
	 * @see svg.impl.SvgPackageImpl#getPolygon()
	 * @generated
	 */
	int POLYGON = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__NAME = GRAPHIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__ATTRIBUTES = GRAPHIC_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__POINTS = GRAPHIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FEATURE_COUNT = GRAPHIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_OPERATION_COUNT = GRAPHIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.PolylineImpl <em>Polyline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.PolylineImpl
	 * @see svg.impl.SvgPackageImpl#getPolyline()
	 * @generated
	 */
	int POLYLINE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__NAME = GRAPHIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__ATTRIBUTES = GRAPHIC_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__POINTS = GRAPHIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Polyline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_FEATURE_COUNT = GRAPHIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Polyline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_OPERATION_COUNT = GRAPHIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.RectImpl <em>Rect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.RectImpl
	 * @see svg.impl.SvgPackageImpl#getRect()
	 * @generated
	 */
	int RECT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__NAME = GRAPHIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__ATTRIBUTES = GRAPHIC_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__X = GRAPHIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__Y = GRAPHIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__WIDTH = GRAPHIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__HEIGHT = GRAPHIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__RX = GRAPHIC_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__RY = GRAPHIC_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Rect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_FEATURE_COUNT = GRAPHIC_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Rect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_OPERATION_COUNT = GRAPHIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.TextImpl
	 * @see svg.impl.SvgPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__NAME = GRAPHIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ATTRIBUTES = GRAPHIC_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__X = GRAPHIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__Y = GRAPHIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__DX = GRAPHIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__DY = GRAPHIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Text Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT_LENGTH = GRAPHIC_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT = GRAPHIC_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = GRAPHIC_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = GRAPHIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.AttributeImpl
	 * @see svg.impl.SvgPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 19;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link svg.impl.FillImpl <em>Fill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.FillImpl
	 * @see svg.impl.SvgPackageImpl#getFill()
	 * @generated
	 */
	int FILL = 20;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL__FILL = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.StrokeImpl <em>Stroke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.StrokeImpl
	 * @see svg.impl.SvgPackageImpl#getStroke()
	 * @generated
	 */
	int STROKE = 21;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROKE__STROKE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stroke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROKE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stroke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROKE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.StrokeWidthImpl <em>Stroke Width</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.StrokeWidthImpl
	 * @see svg.impl.SvgPackageImpl#getStrokeWidth()
	 * @generated
	 */
	int STROKE_WIDTH = 22;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROKE_WIDTH__STROKE_WIDTH = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stroke Width</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROKE_WIDTH_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stroke Width</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROKE_WIDTH_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.StrokeDashArrayImpl <em>Stroke Dash Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.StrokeDashArrayImpl
	 * @see svg.impl.SvgPackageImpl#getStrokeDashArray()
	 * @generated
	 */
	int STROKE_DASH_ARRAY = 23;

	/**
	 * The feature id for the '<em><b>Stroke Dash Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROKE_DASH_ARRAY__STROKE_DASH_ARRAY = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stroke Dash Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROKE_DASH_ARRAY_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stroke Dash Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROKE_DASH_ARRAY_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.StrokeDashOffsetImpl <em>Stroke Dash Offset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.StrokeDashOffsetImpl
	 * @see svg.impl.SvgPackageImpl#getStrokeDashOffset()
	 * @generated
	 */
	int STROKE_DASH_OFFSET = 24;

	/**
	 * The feature id for the '<em><b>Stroke Dash Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROKE_DASH_OFFSET__STROKE_DASH_OFFSET = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stroke Dash Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROKE_DASH_OFFSET_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stroke Dash Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROKE_DASH_OFFSET_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.ClipPathAttributeImpl <em>Clip Path Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.ClipPathAttributeImpl
	 * @see svg.impl.SvgPackageImpl#getClipPathAttribute()
	 * @generated
	 */
	int CLIP_PATH_ATTRIBUTE = 25;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_ATTRIBUTE__CLIP_PATH = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clip Path Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Clip Path Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.FontFamilyImpl <em>Font Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.FontFamilyImpl
	 * @see svg.impl.SvgPackageImpl#getFontFamily()
	 * @generated
	 */
	int FONT_FAMILY = 26;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FAMILY__FONT_FAMILY = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Font Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FAMILY_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Font Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FAMILY_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.FontSizeImpl <em>Font Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.FontSizeImpl
	 * @see svg.impl.SvgPackageImpl#getFontSize()
	 * @generated
	 */
	int FONT_SIZE = 27;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_SIZE__FONT_SIZE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Font Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_SIZE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Font Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_SIZE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.TransformImpl <em>Transform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.TransformImpl
	 * @see svg.impl.SvgPackageImpl#getTransform()
	 * @generated
	 */
	int TRANSFORM = 28;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM__TRANSFORM = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.AttributeTypeImpl
	 * @see svg.impl.SvgPackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 29;

	/**
	 * The number of structural features of the '<em>Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link svg.impl.LengthImpl <em>Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.LengthImpl
	 * @see svg.impl.SvgPackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 30;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__NUMBER = ATTRIBUTE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__UNIT = ATTRIBUTE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FEATURE_COUNT = ATTRIBUTE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_OPERATION_COUNT = ATTRIBUTE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.CoordinateImpl <em>Coordinate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.CoordinateImpl
	 * @see svg.impl.SvgPackageImpl#getCoordinate()
	 * @generated
	 */
	int COORDINATE = 31;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE__NUMBER = ATTRIBUTE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE__UNIT = ATTRIBUTE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_FEATURE_COUNT = ATTRIBUTE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_OPERATION_COUNT = ATTRIBUTE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.PreserveAspectRatioImpl <em>Preserve Aspect Ratio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.PreserveAspectRatioImpl
	 * @see svg.impl.SvgPackageImpl#getPreserveAspectRatio()
	 * @generated
	 */
	int PRESERVE_ASPECT_RATIO = 32;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESERVE_ASPECT_RATIO__ALIGN = ATTRIBUTE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meet Or Slice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESERVE_ASPECT_RATIO__MEET_OR_SLICE = ATTRIBUTE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Preserve Aspect Ratio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESERVE_ASPECT_RATIO_FEATURE_COUNT = ATTRIBUTE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Preserve Aspect Ratio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESERVE_ASPECT_RATIO_OPERATION_COUNT = ATTRIBUTE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.ViewBoxImpl <em>View Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.ViewBoxImpl
	 * @see svg.impl.SvgPackageImpl#getViewBox()
	 * @generated
	 */
	int VIEW_BOX = 33;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_BOX__MIN_X = ATTRIBUTE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_BOX__MIN_Y = ATTRIBUTE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_BOX__WIDTH = ATTRIBUTE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_BOX__HEIGHT = ATTRIBUTE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>View Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_BOX_FEATURE_COUNT = ATTRIBUTE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>View Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_BOX_OPERATION_COUNT = ATTRIBUTE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.PointImpl
	 * @see svg.impl.SvgPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 34;

	/**
	 * The feature id for the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = ATTRIBUTE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = ATTRIBUTE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = ATTRIBUTE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = ATTRIBUTE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.HrefImpl <em>Href</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.HrefImpl
	 * @see svg.impl.SvgPackageImpl#getHref()
	 * @generated
	 */
	int HREF = 35;

	/**
	 * The number of structural features of the '<em>Href</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREF_FEATURE_COUNT = ATTRIBUTE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Href</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREF_OPERATION_COUNT = ATTRIBUTE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.LocalIriImpl <em>Local Iri</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.LocalIriImpl
	 * @see svg.impl.SvgPackageImpl#getLocalIri()
	 * @generated
	 */
	int LOCAL_IRI = 36;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_IRI__ELEMENT_NAME = HREF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Iri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_IRI_FEATURE_COUNT = HREF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Local Iri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_IRI_OPERATION_COUNT = HREF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.Base64RefImpl <em>Base64 Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.Base64RefImpl
	 * @see svg.impl.SvgPackageImpl#getBase64Ref()
	 * @generated
	 */
	int BASE64_REF = 37;

	/**
	 * The feature id for the '<em><b>Base64</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_REF__BASE64 = HREF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base64 Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_REF_FEATURE_COUNT = HREF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Base64 Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_REF_OPERATION_COUNT = HREF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.PaintImpl <em>Paint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.PaintImpl
	 * @see svg.impl.SvgPackageImpl#getPaint()
	 * @generated
	 */
	int PAINT = 38;

	/**
	 * The number of structural features of the '<em>Paint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAINT_FEATURE_COUNT = ATTRIBUTE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Paint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAINT_OPERATION_COUNT = ATTRIBUTE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.IriPaintImpl <em>Iri Paint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.IriPaintImpl
	 * @see svg.impl.SvgPackageImpl#getIriPaint()
	 * @generated
	 */
	int IRI_PAINT = 39;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PAINT__IRI = PAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iri Paint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PAINT_FEATURE_COUNT = PAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Iri Paint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_PAINT_OPERATION_COUNT = PAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.NonePaintImpl <em>None Paint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.NonePaintImpl
	 * @see svg.impl.SvgPackageImpl#getNonePaint()
	 * @generated
	 */
	int NONE_PAINT = 40;

	/**
	 * The number of structural features of the '<em>None Paint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_PAINT_FEATURE_COUNT = PAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>None Paint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_PAINT_OPERATION_COUNT = PAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.ColorImpl <em>Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.ColorImpl
	 * @see svg.impl.SvgPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 41;

	/**
	 * The number of structural features of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_FEATURE_COUNT = PAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_OPERATION_COUNT = PAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.HexColorImpl <em>Hex Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.HexColorImpl
	 * @see svg.impl.SvgPackageImpl#getHexColor()
	 * @generated
	 */
	int HEX_COLOR = 42;

	/**
	 * The feature id for the '<em><b>Hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEX_COLOR__HEX = COLOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hex Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEX_COLOR_FEATURE_COUNT = COLOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hex Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEX_COLOR_OPERATION_COUNT = COLOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.RgbColorImpl <em>Rgb Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.RgbColorImpl
	 * @see svg.impl.SvgPackageImpl#getRgbColor()
	 * @generated
	 */
	int RGB_COLOR = 43;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR__RED = COLOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR__GREEN = COLOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR__BLUE = COLOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rgb Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR_FEATURE_COUNT = COLOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rgb Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR_OPERATION_COUNT = COLOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.RgbPercentageImpl <em>Rgb Percentage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.RgbPercentageImpl
	 * @see svg.impl.SvgPackageImpl#getRgbPercentage()
	 * @generated
	 */
	int RGB_PERCENTAGE = 44;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_PERCENTAGE__RED = COLOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_PERCENTAGE__GREEN = COLOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_PERCENTAGE__BLUE = COLOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rgb Percentage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_PERCENTAGE_FEATURE_COUNT = COLOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rgb Percentage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_PERCENTAGE_OPERATION_COUNT = COLOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.KeywordColorImpl <em>Keyword Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.KeywordColorImpl
	 * @see svg.impl.SvgPackageImpl#getKeywordColor()
	 * @generated
	 */
	int KEYWORD_COLOR = 45;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_COLOR__KEYWORD = COLOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Keyword Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_COLOR_FEATURE_COUNT = COLOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Keyword Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_COLOR_OPERATION_COUNT = COLOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.PathValueImpl <em>Path Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.PathValueImpl
	 * @see svg.impl.SvgPackageImpl#getPathValue()
	 * @generated
	 */
	int PATH_VALUE = 46;

	/**
	 * The number of structural features of the '<em>Path Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VALUE_FEATURE_COUNT = ATTRIBUTE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Path Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VALUE_OPERATION_COUNT = ATTRIBUTE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.AbsoluteMoveToImpl <em>Absolute Move To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.AbsoluteMoveToImpl
	 * @see svg.impl.SvgPackageImpl#getAbsoluteMoveTo()
	 * @generated
	 */
	int ABSOLUTE_MOVE_TO = 47;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_MOVE_TO__X = PATH_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_MOVE_TO__Y = PATH_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Absolute Move To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_MOVE_TO_FEATURE_COUNT = PATH_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Absolute Move To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_MOVE_TO_OPERATION_COUNT = PATH_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.RelativeMoveToImpl <em>Relative Move To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.RelativeMoveToImpl
	 * @see svg.impl.SvgPackageImpl#getRelativeMoveTo()
	 * @generated
	 */
	int RELATIVE_MOVE_TO = 48;

	/**
	 * The feature id for the '<em><b>Dx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_MOVE_TO__DX = PATH_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_MOVE_TO__DY = PATH_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relative Move To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_MOVE_TO_FEATURE_COUNT = PATH_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relative Move To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_MOVE_TO_OPERATION_COUNT = PATH_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.AbsoluteLineToImpl <em>Absolute Line To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.AbsoluteLineToImpl
	 * @see svg.impl.SvgPackageImpl#getAbsoluteLineTo()
	 * @generated
	 */
	int ABSOLUTE_LINE_TO = 49;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_LINE_TO__X = PATH_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_LINE_TO__Y = PATH_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Absolute Line To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_LINE_TO_FEATURE_COUNT = PATH_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Absolute Line To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_LINE_TO_OPERATION_COUNT = PATH_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.RelativeLineToImpl <em>Relative Line To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.RelativeLineToImpl
	 * @see svg.impl.SvgPackageImpl#getRelativeLineTo()
	 * @generated
	 */
	int RELATIVE_LINE_TO = 50;

	/**
	 * The feature id for the '<em><b>Dx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LINE_TO__DX = PATH_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LINE_TO__DY = PATH_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relative Line To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LINE_TO_FEATURE_COUNT = PATH_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relative Line To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LINE_TO_OPERATION_COUNT = PATH_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.AbsoluteHorizontalLineToImpl <em>Absolute Horizontal Line To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.AbsoluteHorizontalLineToImpl
	 * @see svg.impl.SvgPackageImpl#getAbsoluteHorizontalLineTo()
	 * @generated
	 */
	int ABSOLUTE_HORIZONTAL_LINE_TO = 51;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_HORIZONTAL_LINE_TO__X = PATH_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Absolute Horizontal Line To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_HORIZONTAL_LINE_TO_FEATURE_COUNT = PATH_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Absolute Horizontal Line To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_HORIZONTAL_LINE_TO_OPERATION_COUNT = PATH_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.RelativeHorizontalLineToImpl <em>Relative Horizontal Line To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.RelativeHorizontalLineToImpl
	 * @see svg.impl.SvgPackageImpl#getRelativeHorizontalLineTo()
	 * @generated
	 */
	int RELATIVE_HORIZONTAL_LINE_TO = 52;

	/**
	 * The feature id for the '<em><b>Dx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_HORIZONTAL_LINE_TO__DX = PATH_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relative Horizontal Line To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_HORIZONTAL_LINE_TO_FEATURE_COUNT = PATH_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Relative Horizontal Line To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_HORIZONTAL_LINE_TO_OPERATION_COUNT = PATH_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.AbsoluteVerticalLineToImpl <em>Absolute Vertical Line To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.AbsoluteVerticalLineToImpl
	 * @see svg.impl.SvgPackageImpl#getAbsoluteVerticalLineTo()
	 * @generated
	 */
	int ABSOLUTE_VERTICAL_LINE_TO = 53;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_VERTICAL_LINE_TO__Y = PATH_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Absolute Vertical Line To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_VERTICAL_LINE_TO_FEATURE_COUNT = PATH_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Absolute Vertical Line To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_VERTICAL_LINE_TO_OPERATION_COUNT = PATH_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.RelativeVerticalLineToImpl <em>Relative Vertical Line To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.RelativeVerticalLineToImpl
	 * @see svg.impl.SvgPackageImpl#getRelativeVerticalLineTo()
	 * @generated
	 */
	int RELATIVE_VERTICAL_LINE_TO = 54;

	/**
	 * The feature id for the '<em><b>Dy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_VERTICAL_LINE_TO__DY = PATH_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relative Vertical Line To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_VERTICAL_LINE_TO_FEATURE_COUNT = PATH_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Relative Vertical Line To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_VERTICAL_LINE_TO_OPERATION_COUNT = PATH_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.AbsoluteQuadraticCurveToImpl <em>Absolute Quadratic Curve To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.AbsoluteQuadraticCurveToImpl
	 * @see svg.impl.SvgPackageImpl#getAbsoluteQuadraticCurveTo()
	 * @generated
	 */
	int ABSOLUTE_QUADRATIC_CURVE_TO = 55;

	/**
	 * The feature id for the '<em><b>Cx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_QUADRATIC_CURVE_TO__CX = PATH_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_QUADRATIC_CURVE_TO__CY = PATH_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_QUADRATIC_CURVE_TO__X = PATH_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_QUADRATIC_CURVE_TO__Y = PATH_VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Absolute Quadratic Curve To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_QUADRATIC_CURVE_TO_FEATURE_COUNT = PATH_VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Absolute Quadratic Curve To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_QUADRATIC_CURVE_TO_OPERATION_COUNT = PATH_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.RelativeQuadraticCurveToImpl <em>Relative Quadratic Curve To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.RelativeQuadraticCurveToImpl
	 * @see svg.impl.SvgPackageImpl#getRelativeQuadraticCurveTo()
	 * @generated
	 */
	int RELATIVE_QUADRATIC_CURVE_TO = 56;

	/**
	 * The feature id for the '<em><b>Dcx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_QUADRATIC_CURVE_TO__DCX = PATH_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dcy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_QUADRATIC_CURVE_TO__DCY = PATH_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_QUADRATIC_CURVE_TO__DX = PATH_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_QUADRATIC_CURVE_TO__DY = PATH_VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Relative Quadratic Curve To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_QUADRATIC_CURVE_TO_FEATURE_COUNT = PATH_VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Relative Quadratic Curve To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_QUADRATIC_CURVE_TO_OPERATION_COUNT = PATH_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.AbsoluteCubicCurveToImpl <em>Absolute Cubic Curve To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.AbsoluteCubicCurveToImpl
	 * @see svg.impl.SvgPackageImpl#getAbsoluteCubicCurveTo()
	 * @generated
	 */
	int ABSOLUTE_CUBIC_CURVE_TO = 57;

	/**
	 * The feature id for the '<em><b>C1x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_CUBIC_CURVE_TO__C1X = PATH_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>C1y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_CUBIC_CURVE_TO__C1Y = PATH_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>C2x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_CUBIC_CURVE_TO__C2X = PATH_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>C2y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_CUBIC_CURVE_TO__C2Y = PATH_VALUE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_CUBIC_CURVE_TO__X = PATH_VALUE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_CUBIC_CURVE_TO__Y = PATH_VALUE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Absolute Cubic Curve To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_CUBIC_CURVE_TO_FEATURE_COUNT = PATH_VALUE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Absolute Cubic Curve To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_CUBIC_CURVE_TO_OPERATION_COUNT = PATH_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.RelativeCubicCurveToImpl <em>Relative Cubic Curve To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.RelativeCubicCurveToImpl
	 * @see svg.impl.SvgPackageImpl#getRelativeCubicCurveTo()
	 * @generated
	 */
	int RELATIVE_CUBIC_CURVE_TO = 58;

	/**
	 * The feature id for the '<em><b>Dc1x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_CUBIC_CURVE_TO__DC1X = PATH_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dc1y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_CUBIC_CURVE_TO__DC1Y = PATH_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dc2x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_CUBIC_CURVE_TO__DC2X = PATH_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dc2y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_CUBIC_CURVE_TO__DC2Y = PATH_VALUE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_CUBIC_CURVE_TO__DX = PATH_VALUE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_CUBIC_CURVE_TO__DY = PATH_VALUE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Relative Cubic Curve To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_CUBIC_CURVE_TO_FEATURE_COUNT = PATH_VALUE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Relative Cubic Curve To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_CUBIC_CURVE_TO_OPERATION_COUNT = PATH_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.AbsoluteSmoothQuadraticCurveToImpl <em>Absolute Smooth Quadratic Curve To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.AbsoluteSmoothQuadraticCurveToImpl
	 * @see svg.impl.SvgPackageImpl#getAbsoluteSmoothQuadraticCurveTo()
	 * @generated
	 */
	int ABSOLUTE_SMOOTH_QUADRATIC_CURVE_TO = 59;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_SMOOTH_QUADRATIC_CURVE_TO__X = PATH_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_SMOOTH_QUADRATIC_CURVE_TO__Y = PATH_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Absolute Smooth Quadratic Curve To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_SMOOTH_QUADRATIC_CURVE_TO_FEATURE_COUNT = PATH_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Absolute Smooth Quadratic Curve To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_SMOOTH_QUADRATIC_CURVE_TO_OPERATION_COUNT = PATH_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.RelativeSmoothQuadraticCurveToImpl <em>Relative Smooth Quadratic Curve To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.RelativeSmoothQuadraticCurveToImpl
	 * @see svg.impl.SvgPackageImpl#getRelativeSmoothQuadraticCurveTo()
	 * @generated
	 */
	int RELATIVE_SMOOTH_QUADRATIC_CURVE_TO = 60;

	/**
	 * The feature id for the '<em><b>Dx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SMOOTH_QUADRATIC_CURVE_TO__DX = PATH_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SMOOTH_QUADRATIC_CURVE_TO__DY = PATH_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relative Smooth Quadratic Curve To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SMOOTH_QUADRATIC_CURVE_TO_FEATURE_COUNT = PATH_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relative Smooth Quadratic Curve To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SMOOTH_QUADRATIC_CURVE_TO_OPERATION_COUNT = PATH_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.AbsoluteSmoothCubicCurveToImpl <em>Absolute Smooth Cubic Curve To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.AbsoluteSmoothCubicCurveToImpl
	 * @see svg.impl.SvgPackageImpl#getAbsoluteSmoothCubicCurveTo()
	 * @generated
	 */
	int ABSOLUTE_SMOOTH_CUBIC_CURVE_TO = 61;

	/**
	 * The feature id for the '<em><b>Cx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__CX = PATH_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__CY = PATH_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__X = PATH_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__Y = PATH_VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Absolute Smooth Cubic Curve To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_SMOOTH_CUBIC_CURVE_TO_FEATURE_COUNT = PATH_VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Absolute Smooth Cubic Curve To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_SMOOTH_CUBIC_CURVE_TO_OPERATION_COUNT = PATH_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.RelativeSmoothCubicCurveToImpl <em>Relative Smooth Cubic Curve To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.RelativeSmoothCubicCurveToImpl
	 * @see svg.impl.SvgPackageImpl#getRelativeSmoothCubicCurveTo()
	 * @generated
	 */
	int RELATIVE_SMOOTH_CUBIC_CURVE_TO = 62;

	/**
	 * The feature id for the '<em><b>Dcx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SMOOTH_CUBIC_CURVE_TO__DCX = PATH_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dcy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SMOOTH_CUBIC_CURVE_TO__DCY = PATH_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SMOOTH_CUBIC_CURVE_TO__DX = PATH_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SMOOTH_CUBIC_CURVE_TO__DY = PATH_VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Relative Smooth Cubic Curve To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SMOOTH_CUBIC_CURVE_TO_FEATURE_COUNT = PATH_VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Relative Smooth Cubic Curve To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SMOOTH_CUBIC_CURVE_TO_OPERATION_COUNT = PATH_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.ClosePathImpl <em>Close Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.ClosePathImpl
	 * @see svg.impl.SvgPackageImpl#getClosePath()
	 * @generated
	 */
	int CLOSE_PATH = 63;

	/**
	 * The number of structural features of the '<em>Close Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_PATH_FEATURE_COUNT = PATH_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Close Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_PATH_OPERATION_COUNT = PATH_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.TransformValueImpl <em>Transform Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.TransformValueImpl
	 * @see svg.impl.SvgPackageImpl#getTransformValue()
	 * @generated
	 */
	int TRANSFORM_VALUE = 64;

	/**
	 * The number of structural features of the '<em>Transform Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_VALUE_FEATURE_COUNT = ATTRIBUTE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transform Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_VALUE_OPERATION_COUNT = ATTRIBUTE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.MatrixImpl <em>Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.MatrixImpl
	 * @see svg.impl.SvgPackageImpl#getMatrix()
	 * @generated
	 */
	int MATRIX = 65;

	/**
	 * The feature id for the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__A = TRANSFORM_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__B = TRANSFORM_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__C = TRANSFORM_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__D = TRANSFORM_VALUE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>E</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__E = TRANSFORM_VALUE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>F</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__F = TRANSFORM_VALUE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_FEATURE_COUNT = TRANSFORM_VALUE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_OPERATION_COUNT = TRANSFORM_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.TranslateImpl <em>Translate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.TranslateImpl
	 * @see svg.impl.SvgPackageImpl#getTranslate()
	 * @generated
	 */
	int TRANSLATE = 66;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE__X = TRANSFORM_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE__Y = TRANSFORM_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Translate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE_FEATURE_COUNT = TRANSFORM_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Translate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE_OPERATION_COUNT = TRANSFORM_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.ScaleImpl <em>Scale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.ScaleImpl
	 * @see svg.impl.SvgPackageImpl#getScale()
	 * @generated
	 */
	int SCALE = 67;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE__X = TRANSFORM_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE__Y = TRANSFORM_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_FEATURE_COUNT = TRANSFORM_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_OPERATION_COUNT = TRANSFORM_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.RotateImpl <em>Rotate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.RotateImpl
	 * @see svg.impl.SvgPackageImpl#getRotate()
	 * @generated
	 */
	int ROTATE = 68;

	/**
	 * The feature id for the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__A = TRANSFORM_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__X = TRANSFORM_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__Y = TRANSFORM_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_FEATURE_COUNT = TRANSFORM_VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_OPERATION_COUNT = TRANSFORM_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.SkewXImpl <em>Skew X</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.SkewXImpl
	 * @see svg.impl.SvgPackageImpl#getSkewX()
	 * @generated
	 */
	int SKEW_X = 69;

	/**
	 * The feature id for the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKEW_X__A = TRANSFORM_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Skew X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKEW_X_FEATURE_COUNT = TRANSFORM_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Skew X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKEW_X_OPERATION_COUNT = TRANSFORM_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.impl.SkewYImpl <em>Skew Y</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.impl.SkewYImpl
	 * @see svg.impl.SvgPackageImpl#getSkewY()
	 * @generated
	 */
	int SKEW_Y = 70;

	/**
	 * The feature id for the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKEW_Y__A = TRANSFORM_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Skew Y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKEW_Y_FEATURE_COUNT = TRANSFORM_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Skew Y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKEW_Y_OPERATION_COUNT = TRANSFORM_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link svg.Unit <em>Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.Unit
	 * @see svg.impl.SvgPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 71;

	/**
	 * The meta object id for the '{@link svg.Align <em>Align</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.Align
	 * @see svg.impl.SvgPackageImpl#getAlign()
	 * @generated
	 */
	int ALIGN = 72;

	/**
	 * The meta object id for the '{@link svg.MeetOrSlice <em>Meet Or Slice</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.MeetOrSlice
	 * @see svg.impl.SvgPackageImpl#getMeetOrSlice()
	 * @generated
	 */
	int MEET_OR_SLICE = 73;

	/**
	 * The meta object id for the '{@link svg.ColorKeyword <em>Color Keyword</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svg.ColorKeyword
	 * @see svg.impl.SvgPackageImpl#getColorKeyword()
	 * @generated
	 */
	int COLOR_KEYWORD = 74;

	/**
	 * Returns the meta object for class '{@link svg.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see svg.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link svg.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see svg.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link svg.Element#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see svg.Element#getAttributes()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Attributes();

	/**
	 * Returns the meta object for class '{@link svg.StructuralElement <em>Structural Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Element</em>'.
	 * @see svg.StructuralElement
	 * @generated
	 */
	EClass getStructuralElement();

	/**
	 * Returns the meta object for class '{@link svg.Use <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use</em>'.
	 * @see svg.Use
	 * @generated
	 */
	EClass getUse();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Use#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>X</em>'.
	 * @see svg.Use#getX()
	 * @see #getUse()
	 * @generated
	 */
	EReference getUse_X();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Use#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Y</em>'.
	 * @see svg.Use#getY()
	 * @see #getUse()
	 * @generated
	 */
	EReference getUse_Y();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Use#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Width</em>'.
	 * @see svg.Use#getWidth()
	 * @see #getUse()
	 * @generated
	 */
	EReference getUse_Width();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Use#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Height</em>'.
	 * @see svg.Use#getHeight()
	 * @see #getUse()
	 * @generated
	 */
	EReference getUse_Height();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Use#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Href</em>'.
	 * @see svg.Use#getHref()
	 * @see #getUse()
	 * @generated
	 */
	EReference getUse_Href();

	/**
	 * Returns the meta object for class '{@link svg.ClipPath <em>Clip Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clip Path</em>'.
	 * @see svg.ClipPath
	 * @generated
	 */
	EClass getClipPath();

	/**
	 * Returns the meta object for the containment reference list '{@link svg.ClipPath#getGraphicElements <em>Graphic Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Graphic Elements</em>'.
	 * @see svg.ClipPath#getGraphicElements()
	 * @see #getClipPath()
	 * @generated
	 */
	EReference getClipPath_GraphicElements();

	/**
	 * Returns the meta object for the containment reference list '{@link svg.ClipPath#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Use</em>'.
	 * @see svg.ClipPath#getUse()
	 * @see #getClipPath()
	 * @generated
	 */
	EReference getClipPath_Use();

	/**
	 * Returns the meta object for class '{@link svg.ContainerElement <em>Container Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Element</em>'.
	 * @see svg.ContainerElement
	 * @generated
	 */
	EClass getContainerElement();

	/**
	 * Returns the meta object for the containment reference list '{@link svg.ContainerElement#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see svg.ContainerElement#getElements()
	 * @see #getContainerElement()
	 * @generated
	 */
	EReference getContainerElement_Elements();

	/**
	 * Returns the meta object for class '{@link svg.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see svg.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for class '{@link svg.Svg <em>Svg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Svg</em>'.
	 * @see svg.Svg
	 * @generated
	 */
	EClass getSvg();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Svg#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>X</em>'.
	 * @see svg.Svg#getX()
	 * @see #getSvg()
	 * @generated
	 */
	EReference getSvg_X();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Svg#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Y</em>'.
	 * @see svg.Svg#getY()
	 * @see #getSvg()
	 * @generated
	 */
	EReference getSvg_Y();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Svg#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Width</em>'.
	 * @see svg.Svg#getWidth()
	 * @see #getSvg()
	 * @generated
	 */
	EReference getSvg_Width();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Svg#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Height</em>'.
	 * @see svg.Svg#getHeight()
	 * @see #getSvg()
	 * @generated
	 */
	EReference getSvg_Height();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Svg#getPreserveAspectRatio <em>Preserve Aspect Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preserve Aspect Ratio</em>'.
	 * @see svg.Svg#getPreserveAspectRatio()
	 * @see #getSvg()
	 * @generated
	 */
	EReference getSvg_PreserveAspectRatio();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Svg#getViewBox <em>View Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>View Box</em>'.
	 * @see svg.Svg#getViewBox()
	 * @see #getSvg()
	 * @generated
	 */
	EReference getSvg_ViewBox();

	/**
	 * Returns the meta object for class '{@link svg.Defs <em>Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defs</em>'.
	 * @see svg.Defs
	 * @generated
	 */
	EClass getDefs();

	/**
	 * Returns the meta object for class '{@link svg.Symbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol</em>'.
	 * @see svg.Symbol
	 * @generated
	 */
	EClass getSymbol();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Symbol#getPreserveAspectRatio <em>Preserve Aspect Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preserve Aspect Ratio</em>'.
	 * @see svg.Symbol#getPreserveAspectRatio()
	 * @see #getSymbol()
	 * @generated
	 */
	EReference getSymbol_PreserveAspectRatio();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Symbol#getViewBox <em>View Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>View Box</em>'.
	 * @see svg.Symbol#getViewBox()
	 * @see #getSymbol()
	 * @generated
	 */
	EReference getSymbol_ViewBox();

	/**
	 * Returns the meta object for class '{@link svg.GraphicElement <em>Graphic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphic Element</em>'.
	 * @see svg.GraphicElement
	 * @generated
	 */
	EClass getGraphicElement();

	/**
	 * Returns the meta object for class '{@link svg.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circle</em>'.
	 * @see svg.Circle
	 * @generated
	 */
	EClass getCircle();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Circle#getCx <em>Cx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cx</em>'.
	 * @see svg.Circle#getCx()
	 * @see #getCircle()
	 * @generated
	 */
	EReference getCircle_Cx();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Circle#getCy <em>Cy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cy</em>'.
	 * @see svg.Circle#getCy()
	 * @see #getCircle()
	 * @generated
	 */
	EReference getCircle_Cy();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Circle#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>R</em>'.
	 * @see svg.Circle#getR()
	 * @see #getCircle()
	 * @generated
	 */
	EReference getCircle_R();

	/**
	 * Returns the meta object for class '{@link svg.Ellipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ellipse</em>'.
	 * @see svg.Ellipse
	 * @generated
	 */
	EClass getEllipse();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Ellipse#getCx <em>Cx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cx</em>'.
	 * @see svg.Ellipse#getCx()
	 * @see #getEllipse()
	 * @generated
	 */
	EReference getEllipse_Cx();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Ellipse#getCy <em>Cy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cy</em>'.
	 * @see svg.Ellipse#getCy()
	 * @see #getEllipse()
	 * @generated
	 */
	EReference getEllipse_Cy();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Ellipse#getRx <em>Rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rx</em>'.
	 * @see svg.Ellipse#getRx()
	 * @see #getEllipse()
	 * @generated
	 */
	EReference getEllipse_Rx();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Ellipse#getRy <em>Ry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ry</em>'.
	 * @see svg.Ellipse#getRy()
	 * @see #getEllipse()
	 * @generated
	 */
	EReference getEllipse_Ry();

	/**
	 * Returns the meta object for class '{@link svg.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see svg.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Image#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>X</em>'.
	 * @see svg.Image#getX()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_X();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Image#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Y</em>'.
	 * @see svg.Image#getY()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_Y();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Image#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Width</em>'.
	 * @see svg.Image#getWidth()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_Width();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Image#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Height</em>'.
	 * @see svg.Image#getHeight()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_Height();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Image#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Href</em>'.
	 * @see svg.Image#getHref()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_Href();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Image#getPreserveAspectRatio <em>Preserve Aspect Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preserve Aspect Ratio</em>'.
	 * @see svg.Image#getPreserveAspectRatio()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_PreserveAspectRatio();

	/**
	 * Returns the meta object for class '{@link svg.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see svg.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Line#getX1 <em>X1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>X1</em>'.
	 * @see svg.Line#getX1()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_X1();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Line#getY1 <em>Y1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Y1</em>'.
	 * @see svg.Line#getY1()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Y1();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Line#getX2 <em>X2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>X2</em>'.
	 * @see svg.Line#getX2()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_X2();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Line#getY2 <em>Y2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Y2</em>'.
	 * @see svg.Line#getY2()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Y2();

	/**
	 * Returns the meta object for class '{@link svg.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see svg.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the containment reference list '{@link svg.Path#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path</em>'.
	 * @see svg.Path#getPath()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Path();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Path#getPathLength <em>Path Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path Length</em>'.
	 * @see svg.Path#getPathLength()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_PathLength();

	/**
	 * Returns the meta object for class '{@link svg.Polygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon</em>'.
	 * @see svg.Polygon
	 * @generated
	 */
	EClass getPolygon();

	/**
	 * Returns the meta object for the containment reference list '{@link svg.Polygon#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see svg.Polygon#getPoints()
	 * @see #getPolygon()
	 * @generated
	 */
	EReference getPolygon_Points();

	/**
	 * Returns the meta object for class '{@link svg.Polyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polyline</em>'.
	 * @see svg.Polyline
	 * @generated
	 */
	EClass getPolyline();

	/**
	 * Returns the meta object for the containment reference list '{@link svg.Polyline#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see svg.Polyline#getPoints()
	 * @see #getPolyline()
	 * @generated
	 */
	EReference getPolyline_Points();

	/**
	 * Returns the meta object for class '{@link svg.Rect <em>Rect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rect</em>'.
	 * @see svg.Rect
	 * @generated
	 */
	EClass getRect();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Rect#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>X</em>'.
	 * @see svg.Rect#getX()
	 * @see #getRect()
	 * @generated
	 */
	EReference getRect_X();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Rect#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Y</em>'.
	 * @see svg.Rect#getY()
	 * @see #getRect()
	 * @generated
	 */
	EReference getRect_Y();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Rect#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Width</em>'.
	 * @see svg.Rect#getWidth()
	 * @see #getRect()
	 * @generated
	 */
	EReference getRect_Width();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Rect#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Height</em>'.
	 * @see svg.Rect#getHeight()
	 * @see #getRect()
	 * @generated
	 */
	EReference getRect_Height();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Rect#getRx <em>Rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rx</em>'.
	 * @see svg.Rect#getRx()
	 * @see #getRect()
	 * @generated
	 */
	EReference getRect_Rx();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Rect#getRy <em>Ry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ry</em>'.
	 * @see svg.Rect#getRy()
	 * @see #getRect()
	 * @generated
	 */
	EReference getRect_Ry();

	/**
	 * Returns the meta object for class '{@link svg.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see svg.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Text#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>X</em>'.
	 * @see svg.Text#getX()
	 * @see #getText()
	 * @generated
	 */
	EReference getText_X();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Text#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Y</em>'.
	 * @see svg.Text#getY()
	 * @see #getText()
	 * @generated
	 */
	EReference getText_Y();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Text#getDx <em>Dx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dx</em>'.
	 * @see svg.Text#getDx()
	 * @see #getText()
	 * @generated
	 */
	EReference getText_Dx();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Text#getDy <em>Dy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dy</em>'.
	 * @see svg.Text#getDy()
	 * @see #getText()
	 * @generated
	 */
	EReference getText_Dy();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Text#getTextLength <em>Text Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Length</em>'.
	 * @see svg.Text#getTextLength()
	 * @see #getText()
	 * @generated
	 */
	EReference getText_TextLength();

	/**
	 * Returns the meta object for the attribute '{@link svg.Text#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see svg.Text#getText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Text();

	/**
	 * Returns the meta object for class '{@link svg.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see svg.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for class '{@link svg.Fill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fill</em>'.
	 * @see svg.Fill
	 * @generated
	 */
	EClass getFill();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Fill#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fill</em>'.
	 * @see svg.Fill#getFill()
	 * @see #getFill()
	 * @generated
	 */
	EReference getFill_Fill();

	/**
	 * Returns the meta object for class '{@link svg.Stroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stroke</em>'.
	 * @see svg.Stroke
	 * @generated
	 */
	EClass getStroke();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Stroke#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stroke</em>'.
	 * @see svg.Stroke#getStroke()
	 * @see #getStroke()
	 * @generated
	 */
	EReference getStroke_Stroke();

	/**
	 * Returns the meta object for class '{@link svg.StrokeWidth <em>Stroke Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stroke Width</em>'.
	 * @see svg.StrokeWidth
	 * @generated
	 */
	EClass getStrokeWidth();

	/**
	 * Returns the meta object for the attribute '{@link svg.StrokeWidth#getStrokeWidth <em>Stroke Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Width</em>'.
	 * @see svg.StrokeWidth#getStrokeWidth()
	 * @see #getStrokeWidth()
	 * @generated
	 */
	EAttribute getStrokeWidth_StrokeWidth();

	/**
	 * Returns the meta object for class '{@link svg.StrokeDashArray <em>Stroke Dash Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stroke Dash Array</em>'.
	 * @see svg.StrokeDashArray
	 * @generated
	 */
	EClass getStrokeDashArray();

	/**
	 * Returns the meta object for the containment reference list '{@link svg.StrokeDashArray#getStrokeDashArray <em>Stroke Dash Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stroke Dash Array</em>'.
	 * @see svg.StrokeDashArray#getStrokeDashArray()
	 * @see #getStrokeDashArray()
	 * @generated
	 */
	EReference getStrokeDashArray_StrokeDashArray();

	/**
	 * Returns the meta object for class '{@link svg.StrokeDashOffset <em>Stroke Dash Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stroke Dash Offset</em>'.
	 * @see svg.StrokeDashOffset
	 * @generated
	 */
	EClass getStrokeDashOffset();

	/**
	 * Returns the meta object for the containment reference '{@link svg.StrokeDashOffset#getStrokeDashOffset <em>Stroke Dash Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stroke Dash Offset</em>'.
	 * @see svg.StrokeDashOffset#getStrokeDashOffset()
	 * @see #getStrokeDashOffset()
	 * @generated
	 */
	EReference getStrokeDashOffset_StrokeDashOffset();

	/**
	 * Returns the meta object for class '{@link svg.ClipPathAttribute <em>Clip Path Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clip Path Attribute</em>'.
	 * @see svg.ClipPathAttribute
	 * @generated
	 */
	EClass getClipPathAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link svg.ClipPathAttribute#getClipPath <em>Clip Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clip Path</em>'.
	 * @see svg.ClipPathAttribute#getClipPath()
	 * @see #getClipPathAttribute()
	 * @generated
	 */
	EReference getClipPathAttribute_ClipPath();

	/**
	 * Returns the meta object for class '{@link svg.FontFamily <em>Font Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font Family</em>'.
	 * @see svg.FontFamily
	 * @generated
	 */
	EClass getFontFamily();

	/**
	 * Returns the meta object for the attribute '{@link svg.FontFamily#getFontFamily <em>Font Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Family</em>'.
	 * @see svg.FontFamily#getFontFamily()
	 * @see #getFontFamily()
	 * @generated
	 */
	EAttribute getFontFamily_FontFamily();

	/**
	 * Returns the meta object for class '{@link svg.FontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font Size</em>'.
	 * @see svg.FontSize
	 * @generated
	 */
	EClass getFontSize();

	/**
	 * Returns the meta object for the containment reference '{@link svg.FontSize#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font Size</em>'.
	 * @see svg.FontSize#getFontSize()
	 * @see #getFontSize()
	 * @generated
	 */
	EReference getFontSize_FontSize();

	/**
	 * Returns the meta object for class '{@link svg.Transform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform</em>'.
	 * @see svg.Transform
	 * @generated
	 */
	EClass getTransform();

	/**
	 * Returns the meta object for the containment reference list '{@link svg.Transform#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transform</em>'.
	 * @see svg.Transform#getTransform()
	 * @see #getTransform()
	 * @generated
	 */
	EReference getTransform_Transform();

	/**
	 * Returns the meta object for class '{@link svg.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Type</em>'.
	 * @see svg.AttributeType
	 * @generated
	 */
	EClass getAttributeType();

	/**
	 * Returns the meta object for class '{@link svg.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length</em>'.
	 * @see svg.Length
	 * @generated
	 */
	EClass getLength();

	/**
	 * Returns the meta object for the attribute '{@link svg.Length#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see svg.Length#getNumber()
	 * @see #getLength()
	 * @generated
	 */
	EAttribute getLength_Number();

	/**
	 * Returns the meta object for the attribute '{@link svg.Length#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see svg.Length#getUnit()
	 * @see #getLength()
	 * @generated
	 */
	EAttribute getLength_Unit();

	/**
	 * Returns the meta object for class '{@link svg.Coordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinate</em>'.
	 * @see svg.Coordinate
	 * @generated
	 */
	EClass getCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link svg.Coordinate#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see svg.Coordinate#getNumber()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_Number();

	/**
	 * Returns the meta object for the attribute '{@link svg.Coordinate#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see svg.Coordinate#getUnit()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_Unit();

	/**
	 * Returns the meta object for class '{@link svg.PreserveAspectRatio <em>Preserve Aspect Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preserve Aspect Ratio</em>'.
	 * @see svg.PreserveAspectRatio
	 * @generated
	 */
	EClass getPreserveAspectRatio();

	/**
	 * Returns the meta object for the attribute '{@link svg.PreserveAspectRatio#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see svg.PreserveAspectRatio#getAlign()
	 * @see #getPreserveAspectRatio()
	 * @generated
	 */
	EAttribute getPreserveAspectRatio_Align();

	/**
	 * Returns the meta object for the attribute '{@link svg.PreserveAspectRatio#getMeetOrSlice <em>Meet Or Slice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meet Or Slice</em>'.
	 * @see svg.PreserveAspectRatio#getMeetOrSlice()
	 * @see #getPreserveAspectRatio()
	 * @generated
	 */
	EAttribute getPreserveAspectRatio_MeetOrSlice();

	/**
	 * Returns the meta object for class '{@link svg.ViewBox <em>View Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Box</em>'.
	 * @see svg.ViewBox
	 * @generated
	 */
	EClass getViewBox();

	/**
	 * Returns the meta object for the containment reference '{@link svg.ViewBox#getMinX <em>Min X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min X</em>'.
	 * @see svg.ViewBox#getMinX()
	 * @see #getViewBox()
	 * @generated
	 */
	EReference getViewBox_MinX();

	/**
	 * Returns the meta object for the containment reference '{@link svg.ViewBox#getMinY <em>Min Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Y</em>'.
	 * @see svg.ViewBox#getMinY()
	 * @see #getViewBox()
	 * @generated
	 */
	EReference getViewBox_MinY();

	/**
	 * Returns the meta object for the containment reference '{@link svg.ViewBox#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Width</em>'.
	 * @see svg.ViewBox#getWidth()
	 * @see #getViewBox()
	 * @generated
	 */
	EReference getViewBox_Width();

	/**
	 * Returns the meta object for the containment reference '{@link svg.ViewBox#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Height</em>'.
	 * @see svg.ViewBox#getHeight()
	 * @see #getViewBox()
	 * @generated
	 */
	EReference getViewBox_Height();

	/**
	 * Returns the meta object for class '{@link svg.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see svg.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>X</em>'.
	 * @see svg.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EReference getPoint_X();

	/**
	 * Returns the meta object for the containment reference '{@link svg.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Y</em>'.
	 * @see svg.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EReference getPoint_Y();

	/**
	 * Returns the meta object for class '{@link svg.Href <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Href</em>'.
	 * @see svg.Href
	 * @generated
	 */
	EClass getHref();

	/**
	 * Returns the meta object for class '{@link svg.LocalIri <em>Local Iri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Iri</em>'.
	 * @see svg.LocalIri
	 * @generated
	 */
	EClass getLocalIri();

	/**
	 * Returns the meta object for the attribute '{@link svg.LocalIri#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Name</em>'.
	 * @see svg.LocalIri#getElementName()
	 * @see #getLocalIri()
	 * @generated
	 */
	EAttribute getLocalIri_ElementName();

	/**
	 * Returns the meta object for class '{@link svg.Base64Ref <em>Base64 Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base64 Ref</em>'.
	 * @see svg.Base64Ref
	 * @generated
	 */
	EClass getBase64Ref();

	/**
	 * Returns the meta object for the attribute '{@link svg.Base64Ref#getBase64 <em>Base64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base64</em>'.
	 * @see svg.Base64Ref#getBase64()
	 * @see #getBase64Ref()
	 * @generated
	 */
	EAttribute getBase64Ref_Base64();

	/**
	 * Returns the meta object for class '{@link svg.Paint <em>Paint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paint</em>'.
	 * @see svg.Paint
	 * @generated
	 */
	EClass getPaint();

	/**
	 * Returns the meta object for class '{@link svg.IriPaint <em>Iri Paint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iri Paint</em>'.
	 * @see svg.IriPaint
	 * @generated
	 */
	EClass getIriPaint();

	/**
	 * Returns the meta object for the containment reference '{@link svg.IriPaint#getIri <em>Iri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iri</em>'.
	 * @see svg.IriPaint#getIri()
	 * @see #getIriPaint()
	 * @generated
	 */
	EReference getIriPaint_Iri();

	/**
	 * Returns the meta object for class '{@link svg.NonePaint <em>None Paint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>None Paint</em>'.
	 * @see svg.NonePaint
	 * @generated
	 */
	EClass getNonePaint();

	/**
	 * Returns the meta object for class '{@link svg.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color</em>'.
	 * @see svg.Color
	 * @generated
	 */
	EClass getColor();

	/**
	 * Returns the meta object for class '{@link svg.HexColor <em>Hex Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hex Color</em>'.
	 * @see svg.HexColor
	 * @generated
	 */
	EClass getHexColor();

	/**
	 * Returns the meta object for the attribute '{@link svg.HexColor#getHex <em>Hex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hex</em>'.
	 * @see svg.HexColor#getHex()
	 * @see #getHexColor()
	 * @generated
	 */
	EAttribute getHexColor_Hex();

	/**
	 * Returns the meta object for class '{@link svg.RgbColor <em>Rgb Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rgb Color</em>'.
	 * @see svg.RgbColor
	 * @generated
	 */
	EClass getRgbColor();

	/**
	 * Returns the meta object for the attribute '{@link svg.RgbColor#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see svg.RgbColor#getRed()
	 * @see #getRgbColor()
	 * @generated
	 */
	EAttribute getRgbColor_Red();

	/**
	 * Returns the meta object for the attribute '{@link svg.RgbColor#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see svg.RgbColor#getGreen()
	 * @see #getRgbColor()
	 * @generated
	 */
	EAttribute getRgbColor_Green();

	/**
	 * Returns the meta object for the attribute '{@link svg.RgbColor#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see svg.RgbColor#getBlue()
	 * @see #getRgbColor()
	 * @generated
	 */
	EAttribute getRgbColor_Blue();

	/**
	 * Returns the meta object for class '{@link svg.RgbPercentage <em>Rgb Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rgb Percentage</em>'.
	 * @see svg.RgbPercentage
	 * @generated
	 */
	EClass getRgbPercentage();

	/**
	 * Returns the meta object for the attribute '{@link svg.RgbPercentage#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see svg.RgbPercentage#getRed()
	 * @see #getRgbPercentage()
	 * @generated
	 */
	EAttribute getRgbPercentage_Red();

	/**
	 * Returns the meta object for the attribute '{@link svg.RgbPercentage#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see svg.RgbPercentage#getGreen()
	 * @see #getRgbPercentage()
	 * @generated
	 */
	EAttribute getRgbPercentage_Green();

	/**
	 * Returns the meta object for the attribute '{@link svg.RgbPercentage#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see svg.RgbPercentage#getBlue()
	 * @see #getRgbPercentage()
	 * @generated
	 */
	EAttribute getRgbPercentage_Blue();

	/**
	 * Returns the meta object for class '{@link svg.KeywordColor <em>Keyword Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyword Color</em>'.
	 * @see svg.KeywordColor
	 * @generated
	 */
	EClass getKeywordColor();

	/**
	 * Returns the meta object for the attribute '{@link svg.KeywordColor#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see svg.KeywordColor#getKeyword()
	 * @see #getKeywordColor()
	 * @generated
	 */
	EAttribute getKeywordColor_Keyword();

	/**
	 * Returns the meta object for class '{@link svg.PathValue <em>Path Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Value</em>'.
	 * @see svg.PathValue
	 * @generated
	 */
	EClass getPathValue();

	/**
	 * Returns the meta object for class '{@link svg.AbsoluteMoveTo <em>Absolute Move To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Move To</em>'.
	 * @see svg.AbsoluteMoveTo
	 * @generated
	 */
	EClass getAbsoluteMoveTo();

	/**
	 * Returns the meta object for the attribute '{@link svg.AbsoluteMoveTo#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see svg.AbsoluteMoveTo#getX()
	 * @see #getAbsoluteMoveTo()
	 * @generated
	 */
	EAttribute getAbsoluteMoveTo_X();

	/**
	 * Returns the meta object for the attribute '{@link svg.AbsoluteMoveTo#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see svg.AbsoluteMoveTo#getY()
	 * @see #getAbsoluteMoveTo()
	 * @generated
	 */
	EAttribute getAbsoluteMoveTo_Y();

	/**
	 * Returns the meta object for class '{@link svg.RelativeMoveTo <em>Relative Move To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Move To</em>'.
	 * @see svg.RelativeMoveTo
	 * @generated
	 */
	EClass getRelativeMoveTo();

	/**
	 * Returns the meta object for the attribute '{@link svg.RelativeMoveTo#getDx <em>Dx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dx</em>'.
	 * @see svg.RelativeMoveTo#getDx()
	 * @see #getRelativeMoveTo()
	 * @generated
	 */
	EAttribute getRelativeMoveTo_Dx();

	/**
	 * Returns the meta object for the attribute '{@link svg.RelativeMoveTo#getDy <em>Dy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dy</em>'.
	 * @see svg.RelativeMoveTo#getDy()
	 * @see #getRelativeMoveTo()
	 * @generated
	 */
	EAttribute getRelativeMoveTo_Dy();

	/**
	 * Returns the meta object for class '{@link svg.AbsoluteLineTo <em>Absolute Line To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Line To</em>'.
	 * @see svg.AbsoluteLineTo
	 * @generated
	 */
	EClass getAbsoluteLineTo();

	/**
	 * Returns the meta object for the attribute '{@link svg.AbsoluteLineTo#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see svg.AbsoluteLineTo#getX()
	 * @see #getAbsoluteLineTo()
	 * @generated
	 */
	EAttribute getAbsoluteLineTo_X();

	/**
	 * Returns the meta object for the attribute '{@link svg.AbsoluteLineTo#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see svg.AbsoluteLineTo#getY()
	 * @see #getAbsoluteLineTo()
	 * @generated
	 */
	EAttribute getAbsoluteLineTo_Y();

	/**
	 * Returns the meta object for class '{@link svg.RelativeLineTo <em>Relative Line To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Line To</em>'.
	 * @see svg.RelativeLineTo
	 * @generated
	 */
	EClass getRelativeLineTo();

	/**
	 * Returns the meta object for the attribute '{@link svg.RelativeLineTo#getDx <em>Dx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dx</em>'.
	 * @see svg.RelativeLineTo#getDx()
	 * @see #getRelativeLineTo()
	 * @generated
	 */
	EAttribute getRelativeLineTo_Dx();

	/**
	 * Returns the meta object for the attribute '{@link svg.RelativeLineTo#getDy <em>Dy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dy</em>'.
	 * @see svg.RelativeLineTo#getDy()
	 * @see #getRelativeLineTo()
	 * @generated
	 */
	EAttribute getRelativeLineTo_Dy();

	/**
	 * Returns the meta object for class '{@link svg.AbsoluteHorizontalLineTo <em>Absolute Horizontal Line To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Horizontal Line To</em>'.
	 * @see svg.AbsoluteHorizontalLineTo
	 * @generated
	 */
	EClass getAbsoluteHorizontalLineTo();

	/**
	 * Returns the meta object for the attribute '{@link svg.AbsoluteHorizontalLineTo#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see svg.AbsoluteHorizontalLineTo#getX()
	 * @see #getAbsoluteHorizontalLineTo()
	 * @generated
	 */
	EAttribute getAbsoluteHorizontalLineTo_X();

	/**
	 * Returns the meta object for class '{@link svg.RelativeHorizontalLineTo <em>Relative Horizontal Line To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Horizontal Line To</em>'.
	 * @see svg.RelativeHorizontalLineTo
	 * @generated
	 */
	EClass getRelativeHorizontalLineTo();

	/**
	 * Returns the meta object for the attribute '{@link svg.RelativeHorizontalLineTo#getDx <em>Dx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dx</em>'.
	 * @see svg.RelativeHorizontalLineTo#getDx()
	 * @see #getRelativeHorizontalLineTo()
	 * @generated
	 */
	EAttribute getRelativeHorizontalLineTo_Dx();

	/**
	 * Returns the meta object for class '{@link svg.AbsoluteVerticalLineTo <em>Absolute Vertical Line To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Vertical Line To</em>'.
	 * @see svg.AbsoluteVerticalLineTo
	 * @generated
	 */
	EClass getAbsoluteVerticalLineTo();

	/**
	 * Returns the meta object for the attribute '{@link svg.AbsoluteVerticalLineTo#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see svg.AbsoluteVerticalLineTo#getY()
	 * @see #getAbsoluteVerticalLineTo()
	 * @generated
	 */
	EAttribute getAbsoluteVerticalLineTo_Y();

	/**
	 * Returns the meta object for class '{@link svg.RelativeVerticalLineTo <em>Relative Vertical Line To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Vertical Line To</em>'.
	 * @see svg.RelativeVerticalLineTo
	 * @generated
	 */
	EClass getRelativeVerticalLineTo();

	/**
	 * Returns the meta object for the attribute '{@link svg.RelativeVerticalLineTo#getDy <em>Dy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dy</em>'.
	 * @see svg.RelativeVerticalLineTo#getDy()
	 * @see #getRelativeVerticalLineTo()
	 * @generated
	 */
	EAttribute getRelativeVerticalLineTo_Dy();

	/**
	 * Returns the meta object for class '{@link svg.AbsoluteQuadraticCurveTo <em>Absolute Quadratic Curve To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Quadratic Curve To</em>'.
	 * @see svg.AbsoluteQuadraticCurveTo
	 * @generated
	 */
	EClass getAbsoluteQuadraticCurveTo();

	/**
	 * Returns the meta object for the attribute '{@link svg.AbsoluteQuadraticCurveTo#getCx <em>Cx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cx</em>'.
	 * @see svg.AbsoluteQuadraticCurveTo#getCx()
	 * @see #getAbsoluteQuadraticCurveTo()
	 * @generated
	 */
	EAttribute getAbsoluteQuadraticCurveTo_Cx();

	/**
	 * Returns the meta object for the attribute '{@link svg.AbsoluteQuadraticCurveTo#getCy <em>Cy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cy</em>'.
	 * @see svg.AbsoluteQuadraticCurveTo#getCy()
	 * @see #getAbsoluteQuadraticCurveTo()
	 * @generated
	 */
	EAttribute getAbsoluteQuadraticCurveTo_Cy();

	/**
	 * Returns the meta object for the attribute '{@link svg.AbsoluteQuadraticCurveTo#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see svg.AbsoluteQuadraticCurveTo#getX()
	 * @see #getAbsoluteQuadraticCurveTo()
	 * @generated
	 */
	EAttribute getAbsoluteQuadraticCurveTo_X();

	/**
	 * Returns the meta object for the attribute '{@link svg.AbsoluteQuadraticCurveTo#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see svg.AbsoluteQuadraticCurveTo#getY()
	 * @see #getAbsoluteQuadraticCurveTo()
	 * @generated
	 */
	EAttribute getAbsoluteQuadraticCurveTo_Y();

	/**
	 * Returns the meta object for class '{@link svg.RelativeQuadraticCurveTo <em>Relative Quadratic Curve To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Quadratic Curve To</em>'.
	 * @see svg.RelativeQuadraticCurveTo
	 * @generated
	 */
	EClass getRelativeQuadraticCurveTo();

	/**
	 * Returns the meta object for the attribute '{@link svg.RelativeQuadraticCurveTo#getDcx <em>Dcx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dcx</em>'.
	 * @see svg.RelativeQuadraticCurveTo#getDcx()
	 * @see #getRelativeQuadraticCurveTo()
	 * @generated
	 */
	EAttribute getRelativeQuadraticCurveTo_Dcx();

	/**
	 * Returns the meta object for the attribute '{@link svg.RelativeQuadraticCurveTo#getDcy <em>Dcy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dcy</em>'.
	 * @see svg.RelativeQuadraticCurveTo#getDcy()
	 * @see #getRelativeQuadraticCurveTo()
	 * @generated
	 */
	EAttribute getRelativeQuadraticCurveTo_Dcy();

	/**
	 * Returns the meta object for the attribute '{@link svg.RelativeQuadraticCurveTo#getDx <em>Dx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dx</em>'.
	 * @see svg.RelativeQuadraticCurveTo#getDx()
	 * @see #getRelativeQuadraticCurveTo()
	 * @generated
	 */
	EAttribute getRelativeQuadraticCurveTo_Dx();

	/**
	 * Returns the meta object for the attribute '{@link svg.RelativeQuadraticCurveTo#getDy <em>Dy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dy</em>'.
	 * @see svg.RelativeQuadraticCurveTo#getDy()
	 * @see #getRelativeQuadraticCurveTo()
	 * @generated
	 */
	EAttribute getRelativeQuadraticCurveTo_Dy();

	/**
	 * Returns the meta object for class '{@link svg.AbsoluteCubicCurveTo <em>Absolute Cubic Curve To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Cubic Curve To</em>'.
	 * @see svg.AbsoluteCubicCurveTo
	 * @generated
	 */
	EClass getAbsoluteCubicCurveTo();

	/**
	 * Returns the meta object for the attribute '{@link svg.AbsoluteCubicCurveTo#getC1x <em>C1x</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C1x</em>'.
	 * @see svg.AbsoluteCubicCurveTo#getC1x()
	 * @see #getAbsoluteCubicCurveTo()
	 * @generated
	 */
	EAttribute getAbsoluteCubicCurveTo_C1x();

	/**
	 * Returns the meta object for the attribute '{@link svg.AbsoluteCubicCurveTo#getC1y <em>C1y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C1y</em>'.
	 * @see svg.AbsoluteCubicCurveTo#getC1y()
	 * @see #getAbsoluteCubicCurveTo()
	 * @generated
	 */
	EAttribute getAbsoluteCubicCurveTo_C1y();

	/**
	 * Returns the meta object for the attribute '{@link svg.AbsoluteCubicCurveTo#getC2x <em>C2x</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C2x</em>'.
	 * @see svg.AbsoluteCubicCurveTo#getC2x()
	 * @see #getAbsoluteCubicCurveTo()
	 * @generated
	 */
	EAttribute getAbsoluteCubicCurveTo_C2x();

	/**
	 * Returns the meta object for the attribute '{@link svg.AbsoluteCubicCurveTo#getC2y <em>C2y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C2y</em>'.
	 * @see svg.AbsoluteCubicCurveTo#getC2y()
	 * @see #getAbsoluteCubicCurveTo()
	 * @generated
	 */
	EAttribute getAbsoluteCubicCurveTo_C2y();

	/**
	 * Returns the meta object for the attribute '{@link svg.AbsoluteCubicCurveTo#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see svg.AbsoluteCubicCurveTo#getX()
	 * @see #getAbsoluteCubicCurveTo()
	 * @generated
	 */
	EAttribute getAbsoluteCubicCurveTo_X();

	/**
	 * Returns the meta object for the attribute '{@link svg.AbsoluteCubicCurveTo#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see svg.AbsoluteCubicCurveTo#getY()
	 * @see #getAbsoluteCubicCurveTo()
	 * @generated
	 */
	EAttribute getAbsoluteCubicCurveTo_Y();

	/**
	 * Returns the meta object for class '{@link svg.RelativeCubicCurveTo <em>Relative Cubic Curve To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Cubic Curve To</em>'.
	 * @see svg.RelativeCubicCurveTo
	 * @generated
	 */
	EClass getRelativeCubicCurveTo();

	/**
	 * Returns the meta object for the attribute '{@link svg.RelativeCubicCurveTo#getDc1x <em>Dc1x</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dc1x</em>'.
	 * @see svg.RelativeCubicCurveTo#getDc1x()
	 * @see #getRelativeCubicCurveTo()
	 * @generated
	 */
	EAttribute getRelativeCubicCurveTo_Dc1x();

	/**
	 * Returns the meta object for the attribute '{@link svg.RelativeCubicCurveTo#getDc1y <em>Dc1y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dc1y</em>'.
	 * @see svg.RelativeCubicCurveTo#getDc1y()
	 * @see #getRelativeCubicCurveTo()
	 * @generated
	 */
	EAttribute getRelativeCubicCurveTo_Dc1y();

	/**
	 * Returns the meta object for the attribute '{@link svg.RelativeCubicCurveTo#getDc2x <em>Dc2x</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dc2x</em>'.
	 * @see svg.RelativeCubicCurveTo#getDc2x()
	 * @see #getRelativeCubicCurveTo()
	 * @generated
	 */
	EAttribute getRelativeCubicCurveTo_Dc2x();

	/**
	 * Returns the meta object for the attribute '{@link svg.RelativeCubicCurveTo#getDc2y <em>Dc2y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dc2y</em>'.
	 * @see svg.RelativeCubicCurveTo#getDc2y()
	 * @see #getRelativeCubicCurveTo()
	 * @generated
	 */
	EAttribute getRelativeCubicCurveTo_Dc2y();

	/**
	 * Returns the meta object for the attribute '{@link svg.RelativeCubicCurveTo#getDx <em>Dx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dx</em>'.
	 * @see svg.RelativeCubicCurveTo#getDx()
	 * @see #getRelativeCubicCurveTo()
	 * @generated
	 */
	EAttribute getRelativeCubicCurveTo_Dx();

	/**
	 * Returns the meta object for the attribute '{@link svg.RelativeCubicCurveTo#getDy <em>Dy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dy</em>'.
	 * @see svg.RelativeCubicCurveTo#getDy()
	 * @see #getRelativeCubicCurveTo()
	 * @generated
	 */
	EAttribute getRelativeCubicCurveTo_Dy();

	/**
	 * Returns the meta object for class '{@link svg.AbsoluteSmoothQuadraticCurveTo <em>Absolute Smooth Quadratic Curve To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Smooth Quadratic Curve To</em>'.
	 * @see svg.AbsoluteSmoothQuadraticCurveTo
	 * @generated
	 */
	EClass getAbsoluteSmoothQuadraticCurveTo();

	/**
	 * Returns the meta object for the attribute '{@link svg.AbsoluteSmoothQuadraticCurveTo#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see svg.AbsoluteSmoothQuadraticCurveTo#getX()
	 * @see #getAbsoluteSmoothQuadraticCurveTo()
	 * @generated
	 */
	EAttribute getAbsoluteSmoothQuadraticCurveTo_X();

	/**
	 * Returns the meta object for the attribute '{@link svg.AbsoluteSmoothQuadraticCurveTo#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see svg.AbsoluteSmoothQuadraticCurveTo#getY()
	 * @see #getAbsoluteSmoothQuadraticCurveTo()
	 * @generated
	 */
	EAttribute getAbsoluteSmoothQuadraticCurveTo_Y();

	/**
	 * Returns the meta object for class '{@link svg.RelativeSmoothQuadraticCurveTo <em>Relative Smooth Quadratic Curve To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Smooth Quadratic Curve To</em>'.
	 * @see svg.RelativeSmoothQuadraticCurveTo
	 * @generated
	 */
	EClass getRelativeSmoothQuadraticCurveTo();

	/**
	 * Returns the meta object for the attribute '{@link svg.RelativeSmoothQuadraticCurveTo#getDx <em>Dx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dx</em>'.
	 * @see svg.RelativeSmoothQuadraticCurveTo#getDx()
	 * @see #getRelativeSmoothQuadraticCurveTo()
	 * @generated
	 */
	EAttribute getRelativeSmoothQuadraticCurveTo_Dx();

	/**
	 * Returns the meta object for the attribute '{@link svg.RelativeSmoothQuadraticCurveTo#getDy <em>Dy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dy</em>'.
	 * @see svg.RelativeSmoothQuadraticCurveTo#getDy()
	 * @see #getRelativeSmoothQuadraticCurveTo()
	 * @generated
	 */
	EAttribute getRelativeSmoothQuadraticCurveTo_Dy();

	/**
	 * Returns the meta object for class '{@link svg.AbsoluteSmoothCubicCurveTo <em>Absolute Smooth Cubic Curve To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Smooth Cubic Curve To</em>'.
	 * @see svg.AbsoluteSmoothCubicCurveTo
	 * @generated
	 */
	EClass getAbsoluteSmoothCubicCurveTo();

	/**
	 * Returns the meta object for the attribute '{@link svg.AbsoluteSmoothCubicCurveTo#getCx <em>Cx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cx</em>'.
	 * @see svg.AbsoluteSmoothCubicCurveTo#getCx()
	 * @see #getAbsoluteSmoothCubicCurveTo()
	 * @generated
	 */
	EAttribute getAbsoluteSmoothCubicCurveTo_Cx();

	/**
	 * Returns the meta object for the attribute '{@link svg.AbsoluteSmoothCubicCurveTo#getCy <em>Cy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cy</em>'.
	 * @see svg.AbsoluteSmoothCubicCurveTo#getCy()
	 * @see #getAbsoluteSmoothCubicCurveTo()
	 * @generated
	 */
	EAttribute getAbsoluteSmoothCubicCurveTo_Cy();

	/**
	 * Returns the meta object for the attribute '{@link svg.AbsoluteSmoothCubicCurveTo#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see svg.AbsoluteSmoothCubicCurveTo#getX()
	 * @see #getAbsoluteSmoothCubicCurveTo()
	 * @generated
	 */
	EAttribute getAbsoluteSmoothCubicCurveTo_X();

	/**
	 * Returns the meta object for the attribute '{@link svg.AbsoluteSmoothCubicCurveTo#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see svg.AbsoluteSmoothCubicCurveTo#getY()
	 * @see #getAbsoluteSmoothCubicCurveTo()
	 * @generated
	 */
	EAttribute getAbsoluteSmoothCubicCurveTo_Y();

	/**
	 * Returns the meta object for class '{@link svg.RelativeSmoothCubicCurveTo <em>Relative Smooth Cubic Curve To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Smooth Cubic Curve To</em>'.
	 * @see svg.RelativeSmoothCubicCurveTo
	 * @generated
	 */
	EClass getRelativeSmoothCubicCurveTo();

	/**
	 * Returns the meta object for the attribute '{@link svg.RelativeSmoothCubicCurveTo#getDcx <em>Dcx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dcx</em>'.
	 * @see svg.RelativeSmoothCubicCurveTo#getDcx()
	 * @see #getRelativeSmoothCubicCurveTo()
	 * @generated
	 */
	EAttribute getRelativeSmoothCubicCurveTo_Dcx();

	/**
	 * Returns the meta object for the attribute '{@link svg.RelativeSmoothCubicCurveTo#getDcy <em>Dcy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dcy</em>'.
	 * @see svg.RelativeSmoothCubicCurveTo#getDcy()
	 * @see #getRelativeSmoothCubicCurveTo()
	 * @generated
	 */
	EAttribute getRelativeSmoothCubicCurveTo_Dcy();

	/**
	 * Returns the meta object for the attribute '{@link svg.RelativeSmoothCubicCurveTo#getDx <em>Dx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dx</em>'.
	 * @see svg.RelativeSmoothCubicCurveTo#getDx()
	 * @see #getRelativeSmoothCubicCurveTo()
	 * @generated
	 */
	EAttribute getRelativeSmoothCubicCurveTo_Dx();

	/**
	 * Returns the meta object for the attribute '{@link svg.RelativeSmoothCubicCurveTo#getDy <em>Dy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dy</em>'.
	 * @see svg.RelativeSmoothCubicCurveTo#getDy()
	 * @see #getRelativeSmoothCubicCurveTo()
	 * @generated
	 */
	EAttribute getRelativeSmoothCubicCurveTo_Dy();

	/**
	 * Returns the meta object for class '{@link svg.ClosePath <em>Close Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Close Path</em>'.
	 * @see svg.ClosePath
	 * @generated
	 */
	EClass getClosePath();

	/**
	 * Returns the meta object for class '{@link svg.TransformValue <em>Transform Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform Value</em>'.
	 * @see svg.TransformValue
	 * @generated
	 */
	EClass getTransformValue();

	/**
	 * Returns the meta object for class '{@link svg.Matrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix</em>'.
	 * @see svg.Matrix
	 * @generated
	 */
	EClass getMatrix();

	/**
	 * Returns the meta object for the attribute '{@link svg.Matrix#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A</em>'.
	 * @see svg.Matrix#getA()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_A();

	/**
	 * Returns the meta object for the attribute '{@link svg.Matrix#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see svg.Matrix#getB()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_B();

	/**
	 * Returns the meta object for the attribute '{@link svg.Matrix#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C</em>'.
	 * @see svg.Matrix#getC()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_C();

	/**
	 * Returns the meta object for the attribute '{@link svg.Matrix#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see svg.Matrix#getD()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_D();

	/**
	 * Returns the meta object for the attribute '{@link svg.Matrix#getE <em>E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E</em>'.
	 * @see svg.Matrix#getE()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_E();

	/**
	 * Returns the meta object for the attribute '{@link svg.Matrix#getF <em>F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>F</em>'.
	 * @see svg.Matrix#getF()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_F();

	/**
	 * Returns the meta object for class '{@link svg.Translate <em>Translate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translate</em>'.
	 * @see svg.Translate
	 * @generated
	 */
	EClass getTranslate();

	/**
	 * Returns the meta object for the attribute '{@link svg.Translate#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see svg.Translate#getX()
	 * @see #getTranslate()
	 * @generated
	 */
	EAttribute getTranslate_X();

	/**
	 * Returns the meta object for the attribute '{@link svg.Translate#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see svg.Translate#getY()
	 * @see #getTranslate()
	 * @generated
	 */
	EAttribute getTranslate_Y();

	/**
	 * Returns the meta object for class '{@link svg.Scale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scale</em>'.
	 * @see svg.Scale
	 * @generated
	 */
	EClass getScale();

	/**
	 * Returns the meta object for the attribute '{@link svg.Scale#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see svg.Scale#getX()
	 * @see #getScale()
	 * @generated
	 */
	EAttribute getScale_X();

	/**
	 * Returns the meta object for the attribute '{@link svg.Scale#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see svg.Scale#getY()
	 * @see #getScale()
	 * @generated
	 */
	EAttribute getScale_Y();

	/**
	 * Returns the meta object for class '{@link svg.Rotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotate</em>'.
	 * @see svg.Rotate
	 * @generated
	 */
	EClass getRotate();

	/**
	 * Returns the meta object for the attribute '{@link svg.Rotate#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A</em>'.
	 * @see svg.Rotate#getA()
	 * @see #getRotate()
	 * @generated
	 */
	EAttribute getRotate_A();

	/**
	 * Returns the meta object for the attribute '{@link svg.Rotate#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see svg.Rotate#getX()
	 * @see #getRotate()
	 * @generated
	 */
	EAttribute getRotate_X();

	/**
	 * Returns the meta object for the attribute '{@link svg.Rotate#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see svg.Rotate#getY()
	 * @see #getRotate()
	 * @generated
	 */
	EAttribute getRotate_Y();

	/**
	 * Returns the meta object for class '{@link svg.SkewX <em>Skew X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skew X</em>'.
	 * @see svg.SkewX
	 * @generated
	 */
	EClass getSkewX();

	/**
	 * Returns the meta object for the attribute '{@link svg.SkewX#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A</em>'.
	 * @see svg.SkewX#getA()
	 * @see #getSkewX()
	 * @generated
	 */
	EAttribute getSkewX_A();

	/**
	 * Returns the meta object for class '{@link svg.SkewY <em>Skew Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skew Y</em>'.
	 * @see svg.SkewY
	 * @generated
	 */
	EClass getSkewY();

	/**
	 * Returns the meta object for the attribute '{@link svg.SkewY#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A</em>'.
	 * @see svg.SkewY#getA()
	 * @see #getSkewY()
	 * @generated
	 */
	EAttribute getSkewY_A();

	/**
	 * Returns the meta object for enum '{@link svg.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit</em>'.
	 * @see svg.Unit
	 * @generated
	 */
	EEnum getUnit();

	/**
	 * Returns the meta object for enum '{@link svg.Align <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Align</em>'.
	 * @see svg.Align
	 * @generated
	 */
	EEnum getAlign();

	/**
	 * Returns the meta object for enum '{@link svg.MeetOrSlice <em>Meet Or Slice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Meet Or Slice</em>'.
	 * @see svg.MeetOrSlice
	 * @generated
	 */
	EEnum getMeetOrSlice();

	/**
	 * Returns the meta object for enum '{@link svg.ColorKeyword <em>Color Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color Keyword</em>'.
	 * @see svg.ColorKeyword
	 * @generated
	 */
	EEnum getColorKeyword();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SvgFactory getSvgFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link svg.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.ElementImpl
		 * @see svg.impl.SvgPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ATTRIBUTES = eINSTANCE.getElement_Attributes();

		/**
		 * The meta object literal for the '{@link svg.impl.StructuralElementImpl <em>Structural Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.StructuralElementImpl
		 * @see svg.impl.SvgPackageImpl#getStructuralElement()
		 * @generated
		 */
		EClass STRUCTURAL_ELEMENT = eINSTANCE.getStructuralElement();

		/**
		 * The meta object literal for the '{@link svg.impl.UseImpl <em>Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.UseImpl
		 * @see svg.impl.SvgPackageImpl#getUse()
		 * @generated
		 */
		EClass USE = eINSTANCE.getUse();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE__X = eINSTANCE.getUse_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE__Y = eINSTANCE.getUse_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE__WIDTH = eINSTANCE.getUse_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE__HEIGHT = eINSTANCE.getUse_Height();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE__HREF = eINSTANCE.getUse_Href();

		/**
		 * The meta object literal for the '{@link svg.impl.ClipPathImpl <em>Clip Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.ClipPathImpl
		 * @see svg.impl.SvgPackageImpl#getClipPath()
		 * @generated
		 */
		EClass CLIP_PATH = eINSTANCE.getClipPath();

		/**
		 * The meta object literal for the '<em><b>Graphic Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIP_PATH__GRAPHIC_ELEMENTS = eINSTANCE.getClipPath_GraphicElements();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIP_PATH__USE = eINSTANCE.getClipPath_Use();

		/**
		 * The meta object literal for the '{@link svg.impl.ContainerElementImpl <em>Container Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.ContainerElementImpl
		 * @see svg.impl.SvgPackageImpl#getContainerElement()
		 * @generated
		 */
		EClass CONTAINER_ELEMENT = eINSTANCE.getContainerElement();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ELEMENT__ELEMENTS = eINSTANCE.getContainerElement_Elements();

		/**
		 * The meta object literal for the '{@link svg.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.GroupImpl
		 * @see svg.impl.SvgPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '{@link svg.impl.SvgImpl <em>Svg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.SvgImpl
		 * @see svg.impl.SvgPackageImpl#getSvg()
		 * @generated
		 */
		EClass SVG = eINSTANCE.getSvg();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SVG__X = eINSTANCE.getSvg_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SVG__Y = eINSTANCE.getSvg_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SVG__WIDTH = eINSTANCE.getSvg_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SVG__HEIGHT = eINSTANCE.getSvg_Height();

		/**
		 * The meta object literal for the '<em><b>Preserve Aspect Ratio</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SVG__PRESERVE_ASPECT_RATIO = eINSTANCE.getSvg_PreserveAspectRatio();

		/**
		 * The meta object literal for the '<em><b>View Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SVG__VIEW_BOX = eINSTANCE.getSvg_ViewBox();

		/**
		 * The meta object literal for the '{@link svg.impl.DefsImpl <em>Defs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.DefsImpl
		 * @see svg.impl.SvgPackageImpl#getDefs()
		 * @generated
		 */
		EClass DEFS = eINSTANCE.getDefs();

		/**
		 * The meta object literal for the '{@link svg.impl.SymbolImpl <em>Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.SymbolImpl
		 * @see svg.impl.SvgPackageImpl#getSymbol()
		 * @generated
		 */
		EClass SYMBOL = eINSTANCE.getSymbol();

		/**
		 * The meta object literal for the '<em><b>Preserve Aspect Ratio</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL__PRESERVE_ASPECT_RATIO = eINSTANCE.getSymbol_PreserveAspectRatio();

		/**
		 * The meta object literal for the '<em><b>View Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL__VIEW_BOX = eINSTANCE.getSymbol_ViewBox();

		/**
		 * The meta object literal for the '{@link svg.impl.GraphicElementImpl <em>Graphic Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.GraphicElementImpl
		 * @see svg.impl.SvgPackageImpl#getGraphicElement()
		 * @generated
		 */
		EClass GRAPHIC_ELEMENT = eINSTANCE.getGraphicElement();

		/**
		 * The meta object literal for the '{@link svg.impl.CircleImpl <em>Circle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.CircleImpl
		 * @see svg.impl.SvgPackageImpl#getCircle()
		 * @generated
		 */
		EClass CIRCLE = eINSTANCE.getCircle();

		/**
		 * The meta object literal for the '<em><b>Cx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCLE__CX = eINSTANCE.getCircle_Cx();

		/**
		 * The meta object literal for the '<em><b>Cy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCLE__CY = eINSTANCE.getCircle_Cy();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCLE__R = eINSTANCE.getCircle_R();

		/**
		 * The meta object literal for the '{@link svg.impl.EllipseImpl <em>Ellipse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.EllipseImpl
		 * @see svg.impl.SvgPackageImpl#getEllipse()
		 * @generated
		 */
		EClass ELLIPSE = eINSTANCE.getEllipse();

		/**
		 * The meta object literal for the '<em><b>Cx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELLIPSE__CX = eINSTANCE.getEllipse_Cx();

		/**
		 * The meta object literal for the '<em><b>Cy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELLIPSE__CY = eINSTANCE.getEllipse_Cy();

		/**
		 * The meta object literal for the '<em><b>Rx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELLIPSE__RX = eINSTANCE.getEllipse_Rx();

		/**
		 * The meta object literal for the '<em><b>Ry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELLIPSE__RY = eINSTANCE.getEllipse_Ry();

		/**
		 * The meta object literal for the '{@link svg.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.ImageImpl
		 * @see svg.impl.SvgPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__X = eINSTANCE.getImage_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__Y = eINSTANCE.getImage_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__WIDTH = eINSTANCE.getImage_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__HEIGHT = eINSTANCE.getImage_Height();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__HREF = eINSTANCE.getImage_Href();

		/**
		 * The meta object literal for the '<em><b>Preserve Aspect Ratio</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__PRESERVE_ASPECT_RATIO = eINSTANCE.getImage_PreserveAspectRatio();

		/**
		 * The meta object literal for the '{@link svg.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.LineImpl
		 * @see svg.impl.SvgPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>X1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__X1 = eINSTANCE.getLine_X1();

		/**
		 * The meta object literal for the '<em><b>Y1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__Y1 = eINSTANCE.getLine_Y1();

		/**
		 * The meta object literal for the '<em><b>X2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__X2 = eINSTANCE.getLine_X2();

		/**
		 * The meta object literal for the '<em><b>Y2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__Y2 = eINSTANCE.getLine_Y2();

		/**
		 * The meta object literal for the '{@link svg.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.PathImpl
		 * @see svg.impl.SvgPackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__PATH = eINSTANCE.getPath_Path();

		/**
		 * The meta object literal for the '<em><b>Path Length</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__PATH_LENGTH = eINSTANCE.getPath_PathLength();

		/**
		 * The meta object literal for the '{@link svg.impl.PolygonImpl <em>Polygon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.PolygonImpl
		 * @see svg.impl.SvgPackageImpl#getPolygon()
		 * @generated
		 */
		EClass POLYGON = eINSTANCE.getPolygon();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYGON__POINTS = eINSTANCE.getPolygon_Points();

		/**
		 * The meta object literal for the '{@link svg.impl.PolylineImpl <em>Polyline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.PolylineImpl
		 * @see svg.impl.SvgPackageImpl#getPolyline()
		 * @generated
		 */
		EClass POLYLINE = eINSTANCE.getPolyline();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYLINE__POINTS = eINSTANCE.getPolyline_Points();

		/**
		 * The meta object literal for the '{@link svg.impl.RectImpl <em>Rect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.RectImpl
		 * @see svg.impl.SvgPackageImpl#getRect()
		 * @generated
		 */
		EClass RECT = eINSTANCE.getRect();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECT__X = eINSTANCE.getRect_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECT__Y = eINSTANCE.getRect_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECT__WIDTH = eINSTANCE.getRect_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECT__HEIGHT = eINSTANCE.getRect_Height();

		/**
		 * The meta object literal for the '<em><b>Rx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECT__RX = eINSTANCE.getRect_Rx();

		/**
		 * The meta object literal for the '<em><b>Ry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECT__RY = eINSTANCE.getRect_Ry();

		/**
		 * The meta object literal for the '{@link svg.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.TextImpl
		 * @see svg.impl.SvgPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT__X = eINSTANCE.getText_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT__Y = eINSTANCE.getText_Y();

		/**
		 * The meta object literal for the '<em><b>Dx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT__DX = eINSTANCE.getText_Dx();

		/**
		 * The meta object literal for the '<em><b>Dy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT__DY = eINSTANCE.getText_Dy();

		/**
		 * The meta object literal for the '<em><b>Text Length</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT__TEXT_LENGTH = eINSTANCE.getText_TextLength();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT = eINSTANCE.getText_Text();

		/**
		 * The meta object literal for the '{@link svg.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.AttributeImpl
		 * @see svg.impl.SvgPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '{@link svg.impl.FillImpl <em>Fill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.FillImpl
		 * @see svg.impl.SvgPackageImpl#getFill()
		 * @generated
		 */
		EClass FILL = eINSTANCE.getFill();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILL__FILL = eINSTANCE.getFill_Fill();

		/**
		 * The meta object literal for the '{@link svg.impl.StrokeImpl <em>Stroke</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.StrokeImpl
		 * @see svg.impl.SvgPackageImpl#getStroke()
		 * @generated
		 */
		EClass STROKE = eINSTANCE.getStroke();

		/**
		 * The meta object literal for the '<em><b>Stroke</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STROKE__STROKE = eINSTANCE.getStroke_Stroke();

		/**
		 * The meta object literal for the '{@link svg.impl.StrokeWidthImpl <em>Stroke Width</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.StrokeWidthImpl
		 * @see svg.impl.SvgPackageImpl#getStrokeWidth()
		 * @generated
		 */
		EClass STROKE_WIDTH = eINSTANCE.getStrokeWidth();

		/**
		 * The meta object literal for the '<em><b>Stroke Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STROKE_WIDTH__STROKE_WIDTH = eINSTANCE.getStrokeWidth_StrokeWidth();

		/**
		 * The meta object literal for the '{@link svg.impl.StrokeDashArrayImpl <em>Stroke Dash Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.StrokeDashArrayImpl
		 * @see svg.impl.SvgPackageImpl#getStrokeDashArray()
		 * @generated
		 */
		EClass STROKE_DASH_ARRAY = eINSTANCE.getStrokeDashArray();

		/**
		 * The meta object literal for the '<em><b>Stroke Dash Array</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STROKE_DASH_ARRAY__STROKE_DASH_ARRAY = eINSTANCE.getStrokeDashArray_StrokeDashArray();

		/**
		 * The meta object literal for the '{@link svg.impl.StrokeDashOffsetImpl <em>Stroke Dash Offset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.StrokeDashOffsetImpl
		 * @see svg.impl.SvgPackageImpl#getStrokeDashOffset()
		 * @generated
		 */
		EClass STROKE_DASH_OFFSET = eINSTANCE.getStrokeDashOffset();

		/**
		 * The meta object literal for the '<em><b>Stroke Dash Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STROKE_DASH_OFFSET__STROKE_DASH_OFFSET = eINSTANCE.getStrokeDashOffset_StrokeDashOffset();

		/**
		 * The meta object literal for the '{@link svg.impl.ClipPathAttributeImpl <em>Clip Path Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.ClipPathAttributeImpl
		 * @see svg.impl.SvgPackageImpl#getClipPathAttribute()
		 * @generated
		 */
		EClass CLIP_PATH_ATTRIBUTE = eINSTANCE.getClipPathAttribute();

		/**
		 * The meta object literal for the '<em><b>Clip Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIP_PATH_ATTRIBUTE__CLIP_PATH = eINSTANCE.getClipPathAttribute_ClipPath();

		/**
		 * The meta object literal for the '{@link svg.impl.FontFamilyImpl <em>Font Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.FontFamilyImpl
		 * @see svg.impl.SvgPackageImpl#getFontFamily()
		 * @generated
		 */
		EClass FONT_FAMILY = eINSTANCE.getFontFamily();

		/**
		 * The meta object literal for the '<em><b>Font Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_FAMILY__FONT_FAMILY = eINSTANCE.getFontFamily_FontFamily();

		/**
		 * The meta object literal for the '{@link svg.impl.FontSizeImpl <em>Font Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.FontSizeImpl
		 * @see svg.impl.SvgPackageImpl#getFontSize()
		 * @generated
		 */
		EClass FONT_SIZE = eINSTANCE.getFontSize();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FONT_SIZE__FONT_SIZE = eINSTANCE.getFontSize_FontSize();

		/**
		 * The meta object literal for the '{@link svg.impl.TransformImpl <em>Transform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.TransformImpl
		 * @see svg.impl.SvgPackageImpl#getTransform()
		 * @generated
		 */
		EClass TRANSFORM = eINSTANCE.getTransform();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORM__TRANSFORM = eINSTANCE.getTransform_Transform();

		/**
		 * The meta object literal for the '{@link svg.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.AttributeTypeImpl
		 * @see svg.impl.SvgPackageImpl#getAttributeType()
		 * @generated
		 */
		EClass ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

		/**
		 * The meta object literal for the '{@link svg.impl.LengthImpl <em>Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.LengthImpl
		 * @see svg.impl.SvgPackageImpl#getLength()
		 * @generated
		 */
		EClass LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LENGTH__NUMBER = eINSTANCE.getLength_Number();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LENGTH__UNIT = eINSTANCE.getLength_Unit();

		/**
		 * The meta object literal for the '{@link svg.impl.CoordinateImpl <em>Coordinate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.CoordinateImpl
		 * @see svg.impl.SvgPackageImpl#getCoordinate()
		 * @generated
		 */
		EClass COORDINATE = eINSTANCE.getCoordinate();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE__NUMBER = eINSTANCE.getCoordinate_Number();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE__UNIT = eINSTANCE.getCoordinate_Unit();

		/**
		 * The meta object literal for the '{@link svg.impl.PreserveAspectRatioImpl <em>Preserve Aspect Ratio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.PreserveAspectRatioImpl
		 * @see svg.impl.SvgPackageImpl#getPreserveAspectRatio()
		 * @generated
		 */
		EClass PRESERVE_ASPECT_RATIO = eINSTANCE.getPreserveAspectRatio();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESERVE_ASPECT_RATIO__ALIGN = eINSTANCE.getPreserveAspectRatio_Align();

		/**
		 * The meta object literal for the '<em><b>Meet Or Slice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESERVE_ASPECT_RATIO__MEET_OR_SLICE = eINSTANCE.getPreserveAspectRatio_MeetOrSlice();

		/**
		 * The meta object literal for the '{@link svg.impl.ViewBoxImpl <em>View Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.ViewBoxImpl
		 * @see svg.impl.SvgPackageImpl#getViewBox()
		 * @generated
		 */
		EClass VIEW_BOX = eINSTANCE.getViewBox();

		/**
		 * The meta object literal for the '<em><b>Min X</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_BOX__MIN_X = eINSTANCE.getViewBox_MinX();

		/**
		 * The meta object literal for the '<em><b>Min Y</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_BOX__MIN_Y = eINSTANCE.getViewBox_MinY();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_BOX__WIDTH = eINSTANCE.getViewBox_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_BOX__HEIGHT = eINSTANCE.getViewBox_Height();

		/**
		 * The meta object literal for the '{@link svg.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.PointImpl
		 * @see svg.impl.SvgPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT__X = eINSTANCE.getPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT__Y = eINSTANCE.getPoint_Y();

		/**
		 * The meta object literal for the '{@link svg.impl.HrefImpl <em>Href</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.HrefImpl
		 * @see svg.impl.SvgPackageImpl#getHref()
		 * @generated
		 */
		EClass HREF = eINSTANCE.getHref();

		/**
		 * The meta object literal for the '{@link svg.impl.LocalIriImpl <em>Local Iri</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.LocalIriImpl
		 * @see svg.impl.SvgPackageImpl#getLocalIri()
		 * @generated
		 */
		EClass LOCAL_IRI = eINSTANCE.getLocalIri();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_IRI__ELEMENT_NAME = eINSTANCE.getLocalIri_ElementName();

		/**
		 * The meta object literal for the '{@link svg.impl.Base64RefImpl <em>Base64 Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.Base64RefImpl
		 * @see svg.impl.SvgPackageImpl#getBase64Ref()
		 * @generated
		 */
		EClass BASE64_REF = eINSTANCE.getBase64Ref();

		/**
		 * The meta object literal for the '<em><b>Base64</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE64_REF__BASE64 = eINSTANCE.getBase64Ref_Base64();

		/**
		 * The meta object literal for the '{@link svg.impl.PaintImpl <em>Paint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.PaintImpl
		 * @see svg.impl.SvgPackageImpl#getPaint()
		 * @generated
		 */
		EClass PAINT = eINSTANCE.getPaint();

		/**
		 * The meta object literal for the '{@link svg.impl.IriPaintImpl <em>Iri Paint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.IriPaintImpl
		 * @see svg.impl.SvgPackageImpl#getIriPaint()
		 * @generated
		 */
		EClass IRI_PAINT = eINSTANCE.getIriPaint();

		/**
		 * The meta object literal for the '<em><b>Iri</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IRI_PAINT__IRI = eINSTANCE.getIriPaint_Iri();

		/**
		 * The meta object literal for the '{@link svg.impl.NonePaintImpl <em>None Paint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.NonePaintImpl
		 * @see svg.impl.SvgPackageImpl#getNonePaint()
		 * @generated
		 */
		EClass NONE_PAINT = eINSTANCE.getNonePaint();

		/**
		 * The meta object literal for the '{@link svg.impl.ColorImpl <em>Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.ColorImpl
		 * @see svg.impl.SvgPackageImpl#getColor()
		 * @generated
		 */
		EClass COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '{@link svg.impl.HexColorImpl <em>Hex Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.HexColorImpl
		 * @see svg.impl.SvgPackageImpl#getHexColor()
		 * @generated
		 */
		EClass HEX_COLOR = eINSTANCE.getHexColor();

		/**
		 * The meta object literal for the '<em><b>Hex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEX_COLOR__HEX = eINSTANCE.getHexColor_Hex();

		/**
		 * The meta object literal for the '{@link svg.impl.RgbColorImpl <em>Rgb Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.RgbColorImpl
		 * @see svg.impl.SvgPackageImpl#getRgbColor()
		 * @generated
		 */
		EClass RGB_COLOR = eINSTANCE.getRgbColor();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_COLOR__RED = eINSTANCE.getRgbColor_Red();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_COLOR__GREEN = eINSTANCE.getRgbColor_Green();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_COLOR__BLUE = eINSTANCE.getRgbColor_Blue();

		/**
		 * The meta object literal for the '{@link svg.impl.RgbPercentageImpl <em>Rgb Percentage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.RgbPercentageImpl
		 * @see svg.impl.SvgPackageImpl#getRgbPercentage()
		 * @generated
		 */
		EClass RGB_PERCENTAGE = eINSTANCE.getRgbPercentage();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_PERCENTAGE__RED = eINSTANCE.getRgbPercentage_Red();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_PERCENTAGE__GREEN = eINSTANCE.getRgbPercentage_Green();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_PERCENTAGE__BLUE = eINSTANCE.getRgbPercentage_Blue();

		/**
		 * The meta object literal for the '{@link svg.impl.KeywordColorImpl <em>Keyword Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.KeywordColorImpl
		 * @see svg.impl.SvgPackageImpl#getKeywordColor()
		 * @generated
		 */
		EClass KEYWORD_COLOR = eINSTANCE.getKeywordColor();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYWORD_COLOR__KEYWORD = eINSTANCE.getKeywordColor_Keyword();

		/**
		 * The meta object literal for the '{@link svg.impl.PathValueImpl <em>Path Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.PathValueImpl
		 * @see svg.impl.SvgPackageImpl#getPathValue()
		 * @generated
		 */
		EClass PATH_VALUE = eINSTANCE.getPathValue();

		/**
		 * The meta object literal for the '{@link svg.impl.AbsoluteMoveToImpl <em>Absolute Move To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.AbsoluteMoveToImpl
		 * @see svg.impl.SvgPackageImpl#getAbsoluteMoveTo()
		 * @generated
		 */
		EClass ABSOLUTE_MOVE_TO = eINSTANCE.getAbsoluteMoveTo();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_MOVE_TO__X = eINSTANCE.getAbsoluteMoveTo_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_MOVE_TO__Y = eINSTANCE.getAbsoluteMoveTo_Y();

		/**
		 * The meta object literal for the '{@link svg.impl.RelativeMoveToImpl <em>Relative Move To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.RelativeMoveToImpl
		 * @see svg.impl.SvgPackageImpl#getRelativeMoveTo()
		 * @generated
		 */
		EClass RELATIVE_MOVE_TO = eINSTANCE.getRelativeMoveTo();

		/**
		 * The meta object literal for the '<em><b>Dx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_MOVE_TO__DX = eINSTANCE.getRelativeMoveTo_Dx();

		/**
		 * The meta object literal for the '<em><b>Dy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_MOVE_TO__DY = eINSTANCE.getRelativeMoveTo_Dy();

		/**
		 * The meta object literal for the '{@link svg.impl.AbsoluteLineToImpl <em>Absolute Line To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.AbsoluteLineToImpl
		 * @see svg.impl.SvgPackageImpl#getAbsoluteLineTo()
		 * @generated
		 */
		EClass ABSOLUTE_LINE_TO = eINSTANCE.getAbsoluteLineTo();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_LINE_TO__X = eINSTANCE.getAbsoluteLineTo_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_LINE_TO__Y = eINSTANCE.getAbsoluteLineTo_Y();

		/**
		 * The meta object literal for the '{@link svg.impl.RelativeLineToImpl <em>Relative Line To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.RelativeLineToImpl
		 * @see svg.impl.SvgPackageImpl#getRelativeLineTo()
		 * @generated
		 */
		EClass RELATIVE_LINE_TO = eINSTANCE.getRelativeLineTo();

		/**
		 * The meta object literal for the '<em><b>Dx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_LINE_TO__DX = eINSTANCE.getRelativeLineTo_Dx();

		/**
		 * The meta object literal for the '<em><b>Dy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_LINE_TO__DY = eINSTANCE.getRelativeLineTo_Dy();

		/**
		 * The meta object literal for the '{@link svg.impl.AbsoluteHorizontalLineToImpl <em>Absolute Horizontal Line To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.AbsoluteHorizontalLineToImpl
		 * @see svg.impl.SvgPackageImpl#getAbsoluteHorizontalLineTo()
		 * @generated
		 */
		EClass ABSOLUTE_HORIZONTAL_LINE_TO = eINSTANCE.getAbsoluteHorizontalLineTo();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_HORIZONTAL_LINE_TO__X = eINSTANCE.getAbsoluteHorizontalLineTo_X();

		/**
		 * The meta object literal for the '{@link svg.impl.RelativeHorizontalLineToImpl <em>Relative Horizontal Line To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.RelativeHorizontalLineToImpl
		 * @see svg.impl.SvgPackageImpl#getRelativeHorizontalLineTo()
		 * @generated
		 */
		EClass RELATIVE_HORIZONTAL_LINE_TO = eINSTANCE.getRelativeHorizontalLineTo();

		/**
		 * The meta object literal for the '<em><b>Dx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_HORIZONTAL_LINE_TO__DX = eINSTANCE.getRelativeHorizontalLineTo_Dx();

		/**
		 * The meta object literal for the '{@link svg.impl.AbsoluteVerticalLineToImpl <em>Absolute Vertical Line To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.AbsoluteVerticalLineToImpl
		 * @see svg.impl.SvgPackageImpl#getAbsoluteVerticalLineTo()
		 * @generated
		 */
		EClass ABSOLUTE_VERTICAL_LINE_TO = eINSTANCE.getAbsoluteVerticalLineTo();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_VERTICAL_LINE_TO__Y = eINSTANCE.getAbsoluteVerticalLineTo_Y();

		/**
		 * The meta object literal for the '{@link svg.impl.RelativeVerticalLineToImpl <em>Relative Vertical Line To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.RelativeVerticalLineToImpl
		 * @see svg.impl.SvgPackageImpl#getRelativeVerticalLineTo()
		 * @generated
		 */
		EClass RELATIVE_VERTICAL_LINE_TO = eINSTANCE.getRelativeVerticalLineTo();

		/**
		 * The meta object literal for the '<em><b>Dy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_VERTICAL_LINE_TO__DY = eINSTANCE.getRelativeVerticalLineTo_Dy();

		/**
		 * The meta object literal for the '{@link svg.impl.AbsoluteQuadraticCurveToImpl <em>Absolute Quadratic Curve To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.AbsoluteQuadraticCurveToImpl
		 * @see svg.impl.SvgPackageImpl#getAbsoluteQuadraticCurveTo()
		 * @generated
		 */
		EClass ABSOLUTE_QUADRATIC_CURVE_TO = eINSTANCE.getAbsoluteQuadraticCurveTo();

		/**
		 * The meta object literal for the '<em><b>Cx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_QUADRATIC_CURVE_TO__CX = eINSTANCE.getAbsoluteQuadraticCurveTo_Cx();

		/**
		 * The meta object literal for the '<em><b>Cy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_QUADRATIC_CURVE_TO__CY = eINSTANCE.getAbsoluteQuadraticCurveTo_Cy();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_QUADRATIC_CURVE_TO__X = eINSTANCE.getAbsoluteQuadraticCurveTo_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_QUADRATIC_CURVE_TO__Y = eINSTANCE.getAbsoluteQuadraticCurveTo_Y();

		/**
		 * The meta object literal for the '{@link svg.impl.RelativeQuadraticCurveToImpl <em>Relative Quadratic Curve To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.RelativeQuadraticCurveToImpl
		 * @see svg.impl.SvgPackageImpl#getRelativeQuadraticCurveTo()
		 * @generated
		 */
		EClass RELATIVE_QUADRATIC_CURVE_TO = eINSTANCE.getRelativeQuadraticCurveTo();

		/**
		 * The meta object literal for the '<em><b>Dcx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_QUADRATIC_CURVE_TO__DCX = eINSTANCE.getRelativeQuadraticCurveTo_Dcx();

		/**
		 * The meta object literal for the '<em><b>Dcy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_QUADRATIC_CURVE_TO__DCY = eINSTANCE.getRelativeQuadraticCurveTo_Dcy();

		/**
		 * The meta object literal for the '<em><b>Dx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_QUADRATIC_CURVE_TO__DX = eINSTANCE.getRelativeQuadraticCurveTo_Dx();

		/**
		 * The meta object literal for the '<em><b>Dy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_QUADRATIC_CURVE_TO__DY = eINSTANCE.getRelativeQuadraticCurveTo_Dy();

		/**
		 * The meta object literal for the '{@link svg.impl.AbsoluteCubicCurveToImpl <em>Absolute Cubic Curve To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.AbsoluteCubicCurveToImpl
		 * @see svg.impl.SvgPackageImpl#getAbsoluteCubicCurveTo()
		 * @generated
		 */
		EClass ABSOLUTE_CUBIC_CURVE_TO = eINSTANCE.getAbsoluteCubicCurveTo();

		/**
		 * The meta object literal for the '<em><b>C1x</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_CUBIC_CURVE_TO__C1X = eINSTANCE.getAbsoluteCubicCurveTo_C1x();

		/**
		 * The meta object literal for the '<em><b>C1y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_CUBIC_CURVE_TO__C1Y = eINSTANCE.getAbsoluteCubicCurveTo_C1y();

		/**
		 * The meta object literal for the '<em><b>C2x</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_CUBIC_CURVE_TO__C2X = eINSTANCE.getAbsoluteCubicCurveTo_C2x();

		/**
		 * The meta object literal for the '<em><b>C2y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_CUBIC_CURVE_TO__C2Y = eINSTANCE.getAbsoluteCubicCurveTo_C2y();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_CUBIC_CURVE_TO__X = eINSTANCE.getAbsoluteCubicCurveTo_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_CUBIC_CURVE_TO__Y = eINSTANCE.getAbsoluteCubicCurveTo_Y();

		/**
		 * The meta object literal for the '{@link svg.impl.RelativeCubicCurveToImpl <em>Relative Cubic Curve To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.RelativeCubicCurveToImpl
		 * @see svg.impl.SvgPackageImpl#getRelativeCubicCurveTo()
		 * @generated
		 */
		EClass RELATIVE_CUBIC_CURVE_TO = eINSTANCE.getRelativeCubicCurveTo();

		/**
		 * The meta object literal for the '<em><b>Dc1x</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_CUBIC_CURVE_TO__DC1X = eINSTANCE.getRelativeCubicCurveTo_Dc1x();

		/**
		 * The meta object literal for the '<em><b>Dc1y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_CUBIC_CURVE_TO__DC1Y = eINSTANCE.getRelativeCubicCurveTo_Dc1y();

		/**
		 * The meta object literal for the '<em><b>Dc2x</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_CUBIC_CURVE_TO__DC2X = eINSTANCE.getRelativeCubicCurveTo_Dc2x();

		/**
		 * The meta object literal for the '<em><b>Dc2y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_CUBIC_CURVE_TO__DC2Y = eINSTANCE.getRelativeCubicCurveTo_Dc2y();

		/**
		 * The meta object literal for the '<em><b>Dx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_CUBIC_CURVE_TO__DX = eINSTANCE.getRelativeCubicCurveTo_Dx();

		/**
		 * The meta object literal for the '<em><b>Dy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_CUBIC_CURVE_TO__DY = eINSTANCE.getRelativeCubicCurveTo_Dy();

		/**
		 * The meta object literal for the '{@link svg.impl.AbsoluteSmoothQuadraticCurveToImpl <em>Absolute Smooth Quadratic Curve To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.AbsoluteSmoothQuadraticCurveToImpl
		 * @see svg.impl.SvgPackageImpl#getAbsoluteSmoothQuadraticCurveTo()
		 * @generated
		 */
		EClass ABSOLUTE_SMOOTH_QUADRATIC_CURVE_TO = eINSTANCE.getAbsoluteSmoothQuadraticCurveTo();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_SMOOTH_QUADRATIC_CURVE_TO__X = eINSTANCE.getAbsoluteSmoothQuadraticCurveTo_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_SMOOTH_QUADRATIC_CURVE_TO__Y = eINSTANCE.getAbsoluteSmoothQuadraticCurveTo_Y();

		/**
		 * The meta object literal for the '{@link svg.impl.RelativeSmoothQuadraticCurveToImpl <em>Relative Smooth Quadratic Curve To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.RelativeSmoothQuadraticCurveToImpl
		 * @see svg.impl.SvgPackageImpl#getRelativeSmoothQuadraticCurveTo()
		 * @generated
		 */
		EClass RELATIVE_SMOOTH_QUADRATIC_CURVE_TO = eINSTANCE.getRelativeSmoothQuadraticCurveTo();

		/**
		 * The meta object literal for the '<em><b>Dx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_SMOOTH_QUADRATIC_CURVE_TO__DX = eINSTANCE.getRelativeSmoothQuadraticCurveTo_Dx();

		/**
		 * The meta object literal for the '<em><b>Dy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_SMOOTH_QUADRATIC_CURVE_TO__DY = eINSTANCE.getRelativeSmoothQuadraticCurveTo_Dy();

		/**
		 * The meta object literal for the '{@link svg.impl.AbsoluteSmoothCubicCurveToImpl <em>Absolute Smooth Cubic Curve To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.AbsoluteSmoothCubicCurveToImpl
		 * @see svg.impl.SvgPackageImpl#getAbsoluteSmoothCubicCurveTo()
		 * @generated
		 */
		EClass ABSOLUTE_SMOOTH_CUBIC_CURVE_TO = eINSTANCE.getAbsoluteSmoothCubicCurveTo();

		/**
		 * The meta object literal for the '<em><b>Cx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__CX = eINSTANCE.getAbsoluteSmoothCubicCurveTo_Cx();

		/**
		 * The meta object literal for the '<em><b>Cy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__CY = eINSTANCE.getAbsoluteSmoothCubicCurveTo_Cy();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__X = eINSTANCE.getAbsoluteSmoothCubicCurveTo_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__Y = eINSTANCE.getAbsoluteSmoothCubicCurveTo_Y();

		/**
		 * The meta object literal for the '{@link svg.impl.RelativeSmoothCubicCurveToImpl <em>Relative Smooth Cubic Curve To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.RelativeSmoothCubicCurveToImpl
		 * @see svg.impl.SvgPackageImpl#getRelativeSmoothCubicCurveTo()
		 * @generated
		 */
		EClass RELATIVE_SMOOTH_CUBIC_CURVE_TO = eINSTANCE.getRelativeSmoothCubicCurveTo();

		/**
		 * The meta object literal for the '<em><b>Dcx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_SMOOTH_CUBIC_CURVE_TO__DCX = eINSTANCE.getRelativeSmoothCubicCurveTo_Dcx();

		/**
		 * The meta object literal for the '<em><b>Dcy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_SMOOTH_CUBIC_CURVE_TO__DCY = eINSTANCE.getRelativeSmoothCubicCurveTo_Dcy();

		/**
		 * The meta object literal for the '<em><b>Dx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_SMOOTH_CUBIC_CURVE_TO__DX = eINSTANCE.getRelativeSmoothCubicCurveTo_Dx();

		/**
		 * The meta object literal for the '<em><b>Dy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_SMOOTH_CUBIC_CURVE_TO__DY = eINSTANCE.getRelativeSmoothCubicCurveTo_Dy();

		/**
		 * The meta object literal for the '{@link svg.impl.ClosePathImpl <em>Close Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.ClosePathImpl
		 * @see svg.impl.SvgPackageImpl#getClosePath()
		 * @generated
		 */
		EClass CLOSE_PATH = eINSTANCE.getClosePath();

		/**
		 * The meta object literal for the '{@link svg.impl.TransformValueImpl <em>Transform Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.TransformValueImpl
		 * @see svg.impl.SvgPackageImpl#getTransformValue()
		 * @generated
		 */
		EClass TRANSFORM_VALUE = eINSTANCE.getTransformValue();

		/**
		 * The meta object literal for the '{@link svg.impl.MatrixImpl <em>Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.MatrixImpl
		 * @see svg.impl.SvgPackageImpl#getMatrix()
		 * @generated
		 */
		EClass MATRIX = eINSTANCE.getMatrix();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__A = eINSTANCE.getMatrix_A();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__B = eINSTANCE.getMatrix_B();

		/**
		 * The meta object literal for the '<em><b>C</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__C = eINSTANCE.getMatrix_C();

		/**
		 * The meta object literal for the '<em><b>D</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__D = eINSTANCE.getMatrix_D();

		/**
		 * The meta object literal for the '<em><b>E</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__E = eINSTANCE.getMatrix_E();

		/**
		 * The meta object literal for the '<em><b>F</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__F = eINSTANCE.getMatrix_F();

		/**
		 * The meta object literal for the '{@link svg.impl.TranslateImpl <em>Translate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.TranslateImpl
		 * @see svg.impl.SvgPackageImpl#getTranslate()
		 * @generated
		 */
		EClass TRANSLATE = eINSTANCE.getTranslate();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATE__X = eINSTANCE.getTranslate_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATE__Y = eINSTANCE.getTranslate_Y();

		/**
		 * The meta object literal for the '{@link svg.impl.ScaleImpl <em>Scale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.ScaleImpl
		 * @see svg.impl.SvgPackageImpl#getScale()
		 * @generated
		 */
		EClass SCALE = eINSTANCE.getScale();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALE__X = eINSTANCE.getScale_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALE__Y = eINSTANCE.getScale_Y();

		/**
		 * The meta object literal for the '{@link svg.impl.RotateImpl <em>Rotate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.RotateImpl
		 * @see svg.impl.SvgPackageImpl#getRotate()
		 * @generated
		 */
		EClass ROTATE = eINSTANCE.getRotate();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATE__A = eINSTANCE.getRotate_A();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATE__X = eINSTANCE.getRotate_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATE__Y = eINSTANCE.getRotate_Y();

		/**
		 * The meta object literal for the '{@link svg.impl.SkewXImpl <em>Skew X</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.SkewXImpl
		 * @see svg.impl.SvgPackageImpl#getSkewX()
		 * @generated
		 */
		EClass SKEW_X = eINSTANCE.getSkewX();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKEW_X__A = eINSTANCE.getSkewX_A();

		/**
		 * The meta object literal for the '{@link svg.impl.SkewYImpl <em>Skew Y</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.impl.SkewYImpl
		 * @see svg.impl.SvgPackageImpl#getSkewY()
		 * @generated
		 */
		EClass SKEW_Y = eINSTANCE.getSkewY();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKEW_Y__A = eINSTANCE.getSkewY_A();

		/**
		 * The meta object literal for the '{@link svg.Unit <em>Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.Unit
		 * @see svg.impl.SvgPackageImpl#getUnit()
		 * @generated
		 */
		EEnum UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '{@link svg.Align <em>Align</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.Align
		 * @see svg.impl.SvgPackageImpl#getAlign()
		 * @generated
		 */
		EEnum ALIGN = eINSTANCE.getAlign();

		/**
		 * The meta object literal for the '{@link svg.MeetOrSlice <em>Meet Or Slice</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.MeetOrSlice
		 * @see svg.impl.SvgPackageImpl#getMeetOrSlice()
		 * @generated
		 */
		EEnum MEET_OR_SLICE = eINSTANCE.getMeetOrSlice();

		/**
		 * The meta object literal for the '{@link svg.ColorKeyword <em>Color Keyword</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svg.ColorKeyword
		 * @see svg.impl.SvgPackageImpl#getColorKeyword()
		 * @generated
		 */
		EEnum COLOR_KEYWORD = eINSTANCE.getColorKeyword();

	}

} //SvgPackage
