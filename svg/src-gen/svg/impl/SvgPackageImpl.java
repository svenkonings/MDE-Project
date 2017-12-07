/**
 */
package svg.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import svg.AbsoluteCubicCurveTo;
import svg.AbsoluteHorizontalLineTo;
import svg.AbsoluteLineTo;
import svg.AbsoluteMoveTo;
import svg.AbsoluteQuadraticCurveTo;
import svg.AbsoluteSmoothCubicCurveTo;
import svg.AbsoluteSmoothQuadraticCurveTo;
import svg.AbsoluteVerticalLineTo;
import svg.Align;
import svg.Attribute;
import svg.AttributeType;
import svg.Base64Ref;
import svg.Circle;
import svg.ClipPath;
import svg.ClipPathAttribute;
import svg.ClosePath;
import svg.Color;
import svg.ColorKeyword;
import svg.ContainerElement;
import svg.Coordinate;
import svg.Defs;
import svg.Element;
import svg.Ellipse;
import svg.Fill;
import svg.FontFamily;
import svg.FontSize;
import svg.GraphicElement;
import svg.Group;
import svg.HexColor;
import svg.Href;
import svg.Image;
import svg.IriPaint;
import svg.KeywordColor;
import svg.Length;
import svg.Line;
import svg.LocalIri;
import svg.Matrix;
import svg.MeetOrSlice;
import svg.NonePaint;
import svg.Paint;
import svg.Path;
import svg.PathValue;
import svg.Point;
import svg.Polygon;
import svg.Polyline;
import svg.PreserveAspectRatio;
import svg.Rect;
import svg.RelativeCubicCurveTo;
import svg.RelativeHorizontalLineTo;
import svg.RelativeLineTo;
import svg.RelativeMoveTo;
import svg.RelativeQuadraticCurveTo;
import svg.RelativeSmoothCubicCurveTo;
import svg.RelativeSmoothQuadraticCurveTo;
import svg.RelativeVerticalLineTo;
import svg.RgbColor;
import svg.RgbPercentage;
import svg.Rotate;
import svg.Scale;
import svg.SkewX;
import svg.SkewY;
import svg.Stroke;
import svg.StrokeDashArray;
import svg.StrokeDashOffset;
import svg.StrokeWidth;
import svg.StructuralElement;
import svg.Svg;
import svg.SvgFactory;
import svg.SvgPackage;
import svg.Symbol;
import svg.Text;
import svg.Transform;
import svg.TransformValue;
import svg.Translate;
import svg.Unit;
import svg.Use;
import svg.ViewBox;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SvgPackageImpl extends EPackageImpl implements SvgPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clipPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ellipseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polylineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fillEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strokeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strokeWidthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strokeDashArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strokeDashOffsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clipPathAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontFamilyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preserveAspectRatioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hrefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localIriEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass base64RefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iriPaintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonePaintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hexColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rgbColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rgbPercentageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keywordColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absoluteMoveToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeMoveToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absoluteLineToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeLineToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absoluteHorizontalLineToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeHorizontalLineToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absoluteVerticalLineToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeVerticalLineToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absoluteQuadraticCurveToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeQuadraticCurveToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absoluteCubicCurveToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeCubicCurveToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absoluteSmoothQuadraticCurveToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeSmoothQuadraticCurveToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absoluteSmoothCubicCurveToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeSmoothCubicCurveToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closePathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass translateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skewXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skewYEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alignEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum meetOrSliceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorKeywordEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see svg.SvgPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SvgPackageImpl() {
		super(eNS_URI, SvgFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SvgPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SvgPackage init() {
		if (isInited)
			return (SvgPackage) EPackage.Registry.INSTANCE.getEPackage(SvgPackage.eNS_URI);

		// Obtain or create and register package
		SvgPackageImpl theSvgPackage = (SvgPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof SvgPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new SvgPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSvgPackage.createPackageContents();

		// Initialize created meta-data
		theSvgPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSvgPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SvgPackage.eNS_URI, theSvgPackage);
		return theSvgPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Name() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Attributes() {
		return (EReference) elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralElement() {
		return structuralElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUse() {
		return useEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUse_X() {
		return (EReference) useEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUse_Y() {
		return (EReference) useEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUse_Width() {
		return (EReference) useEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUse_Height() {
		return (EReference) useEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUse_Href() {
		return (EReference) useEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClipPath() {
		return clipPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClipPath_GraphicElements() {
		return (EReference) clipPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClipPath_Use() {
		return (EReference) clipPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerElement() {
		return containerElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerElement_Elements() {
		return (EReference) containerElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvg() {
		return svgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSvg_X() {
		return (EReference) svgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSvg_Y() {
		return (EReference) svgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSvg_Width() {
		return (EReference) svgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSvg_Height() {
		return (EReference) svgEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSvg_PreserveAspectRatio() {
		return (EReference) svgEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSvg_ViewBox() {
		return (EReference) svgEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefs() {
		return defsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbol() {
		return symbolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymbol_PreserveAspectRatio() {
		return (EReference) symbolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymbol_ViewBox() {
		return (EReference) symbolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicElement() {
		return graphicElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircle() {
		return circleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircle_Cx() {
		return (EReference) circleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircle_Cy() {
		return (EReference) circleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircle_R() {
		return (EReference) circleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEllipse() {
		return ellipseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipse_Cx() {
		return (EReference) ellipseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipse_Cy() {
		return (EReference) ellipseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipse_Rx() {
		return (EReference) ellipseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipse_Ry() {
		return (EReference) ellipseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImage_X() {
		return (EReference) imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImage_Y() {
		return (EReference) imageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImage_Width() {
		return (EReference) imageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImage_Height() {
		return (EReference) imageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImage_Href() {
		return (EReference) imageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImage_PreserveAspectRatio() {
		return (EReference) imageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLine() {
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_X1() {
		return (EReference) lineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_Y1() {
		return (EReference) lineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_X2() {
		return (EReference) lineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_Y2() {
		return (EReference) lineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPath() {
		return pathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPath_Path() {
		return (EReference) pathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPath_PathLength() {
		return (EReference) pathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygon() {
		return polygonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygon_Points() {
		return (EReference) polygonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolyline() {
		return polylineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolyline_Points() {
		return (EReference) polylineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRect() {
		return rectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRect_X() {
		return (EReference) rectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRect_Y() {
		return (EReference) rectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRect_Width() {
		return (EReference) rectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRect_Height() {
		return (EReference) rectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRect_Rx() {
		return (EReference) rectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRect_Ry() {
		return (EReference) rectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getText_X() {
		return (EReference) textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getText_Y() {
		return (EReference) textEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getText_Dx() {
		return (EReference) textEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getText_Dy() {
		return (EReference) textEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getText_TextLength() {
		return (EReference) textEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Text() {
		return (EAttribute) textEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFill() {
		return fillEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFill_Fill() {
		return (EReference) fillEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStroke() {
		return strokeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStroke_Stroke() {
		return (EReference) strokeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrokeWidth() {
		return strokeWidthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrokeWidth_StrokeWidth() {
		return (EAttribute) strokeWidthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrokeDashArray() {
		return strokeDashArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrokeDashArray_StrokeDashArray() {
		return (EReference) strokeDashArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrokeDashOffset() {
		return strokeDashOffsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrokeDashOffset_StrokeDashOffset() {
		return (EReference) strokeDashOffsetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClipPathAttribute() {
		return clipPathAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClipPathAttribute_ClipPath() {
		return (EReference) clipPathAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFontFamily() {
		return fontFamilyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFamily_FontFamily() {
		return (EAttribute) fontFamilyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFontSize() {
		return fontSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFontSize_FontSize() {
		return (EReference) fontSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransform() {
		return transformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransform_Transform() {
		return (EReference) transformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeType() {
		return attributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLength() {
		return lengthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLength_Number() {
		return (EAttribute) lengthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLength_Unit() {
		return (EAttribute) lengthEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinate() {
		return coordinateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinate_Number() {
		return (EAttribute) coordinateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinate_Unit() {
		return (EAttribute) coordinateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreserveAspectRatio() {
		return preserveAspectRatioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreserveAspectRatio_Align() {
		return (EAttribute) preserveAspectRatioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreserveAspectRatio_MeetOrSlice() {
		return (EAttribute) preserveAspectRatioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewBox() {
		return viewBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewBox_MinX() {
		return (EReference) viewBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewBox_MinY() {
		return (EReference) viewBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewBox_Width() {
		return (EReference) viewBoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewBox_Height() {
		return (EReference) viewBoxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoint() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPoint_X() {
		return (EReference) pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPoint_Y() {
		return (EReference) pointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHref() {
		return hrefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalIri() {
		return localIriEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalIri_ElementName() {
		return (EAttribute) localIriEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBase64Ref() {
		return base64RefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBase64Ref_Base64() {
		return (EAttribute) base64RefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaint() {
		return paintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIriPaint() {
		return iriPaintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIriPaint_Iri() {
		return (EReference) iriPaintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonePaint() {
		return nonePaintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColor() {
		return colorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHexColor() {
		return hexColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHexColor_Hex() {
		return (EAttribute) hexColorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRgbColor() {
		return rgbColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRgbColor_Red() {
		return (EAttribute) rgbColorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRgbColor_Green() {
		return (EAttribute) rgbColorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRgbColor_Blue() {
		return (EAttribute) rgbColorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRgbPercentage() {
		return rgbPercentageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRgbPercentage_Red() {
		return (EAttribute) rgbPercentageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRgbPercentage_Green() {
		return (EAttribute) rgbPercentageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRgbPercentage_Blue() {
		return (EAttribute) rgbPercentageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeywordColor() {
		return keywordColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeywordColor_Keyword() {
		return (EAttribute) keywordColorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathValue() {
		return pathValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsoluteMoveTo() {
		return absoluteMoveToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteMoveTo_X() {
		return (EAttribute) absoluteMoveToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteMoveTo_Y() {
		return (EAttribute) absoluteMoveToEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeMoveTo() {
		return relativeMoveToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeMoveTo_Dx() {
		return (EAttribute) relativeMoveToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeMoveTo_Dy() {
		return (EAttribute) relativeMoveToEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsoluteLineTo() {
		return absoluteLineToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteLineTo_X() {
		return (EAttribute) absoluteLineToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteLineTo_Y() {
		return (EAttribute) absoluteLineToEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeLineTo() {
		return relativeLineToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeLineTo_Dx() {
		return (EAttribute) relativeLineToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeLineTo_Dy() {
		return (EAttribute) relativeLineToEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsoluteHorizontalLineTo() {
		return absoluteHorizontalLineToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteHorizontalLineTo_X() {
		return (EAttribute) absoluteHorizontalLineToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeHorizontalLineTo() {
		return relativeHorizontalLineToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeHorizontalLineTo_Dx() {
		return (EAttribute) relativeHorizontalLineToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsoluteVerticalLineTo() {
		return absoluteVerticalLineToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteVerticalLineTo_Y() {
		return (EAttribute) absoluteVerticalLineToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeVerticalLineTo() {
		return relativeVerticalLineToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeVerticalLineTo_Dy() {
		return (EAttribute) relativeVerticalLineToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsoluteQuadraticCurveTo() {
		return absoluteQuadraticCurveToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteQuadraticCurveTo_Cx() {
		return (EAttribute) absoluteQuadraticCurveToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteQuadraticCurveTo_Cy() {
		return (EAttribute) absoluteQuadraticCurveToEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteQuadraticCurveTo_X() {
		return (EAttribute) absoluteQuadraticCurveToEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteQuadraticCurveTo_Y() {
		return (EAttribute) absoluteQuadraticCurveToEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeQuadraticCurveTo() {
		return relativeQuadraticCurveToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeQuadraticCurveTo_Dcx() {
		return (EAttribute) relativeQuadraticCurveToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeQuadraticCurveTo_Dcy() {
		return (EAttribute) relativeQuadraticCurveToEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeQuadraticCurveTo_Dx() {
		return (EAttribute) relativeQuadraticCurveToEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeQuadraticCurveTo_Dy() {
		return (EAttribute) relativeQuadraticCurveToEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsoluteCubicCurveTo() {
		return absoluteCubicCurveToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteCubicCurveTo_C1x() {
		return (EAttribute) absoluteCubicCurveToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteCubicCurveTo_C1y() {
		return (EAttribute) absoluteCubicCurveToEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteCubicCurveTo_C2x() {
		return (EAttribute) absoluteCubicCurveToEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteCubicCurveTo_C2y() {
		return (EAttribute) absoluteCubicCurveToEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteCubicCurveTo_X() {
		return (EAttribute) absoluteCubicCurveToEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteCubicCurveTo_Y() {
		return (EAttribute) absoluteCubicCurveToEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeCubicCurveTo() {
		return relativeCubicCurveToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeCubicCurveTo_Dc1x() {
		return (EAttribute) relativeCubicCurveToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeCubicCurveTo_Dc1y() {
		return (EAttribute) relativeCubicCurveToEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeCubicCurveTo_Dc2x() {
		return (EAttribute) relativeCubicCurveToEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeCubicCurveTo_Dc2y() {
		return (EAttribute) relativeCubicCurveToEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeCubicCurveTo_Dx() {
		return (EAttribute) relativeCubicCurveToEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeCubicCurveTo_Dy() {
		return (EAttribute) relativeCubicCurveToEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsoluteSmoothQuadraticCurveTo() {
		return absoluteSmoothQuadraticCurveToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteSmoothQuadraticCurveTo_X() {
		return (EAttribute) absoluteSmoothQuadraticCurveToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteSmoothQuadraticCurveTo_Y() {
		return (EAttribute) absoluteSmoothQuadraticCurveToEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeSmoothQuadraticCurveTo() {
		return relativeSmoothQuadraticCurveToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeSmoothQuadraticCurveTo_Dx() {
		return (EAttribute) relativeSmoothQuadraticCurveToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeSmoothQuadraticCurveTo_Dy() {
		return (EAttribute) relativeSmoothQuadraticCurveToEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsoluteSmoothCubicCurveTo() {
		return absoluteSmoothCubicCurveToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteSmoothCubicCurveTo_Cx() {
		return (EAttribute) absoluteSmoothCubicCurveToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteSmoothCubicCurveTo_Cy() {
		return (EAttribute) absoluteSmoothCubicCurveToEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteSmoothCubicCurveTo_X() {
		return (EAttribute) absoluteSmoothCubicCurveToEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteSmoothCubicCurveTo_Y() {
		return (EAttribute) absoluteSmoothCubicCurveToEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeSmoothCubicCurveTo() {
		return relativeSmoothCubicCurveToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeSmoothCubicCurveTo_Dcx() {
		return (EAttribute) relativeSmoothCubicCurveToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeSmoothCubicCurveTo_Dcy() {
		return (EAttribute) relativeSmoothCubicCurveToEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeSmoothCubicCurveTo_Dx() {
		return (EAttribute) relativeSmoothCubicCurveToEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeSmoothCubicCurveTo_Dy() {
		return (EAttribute) relativeSmoothCubicCurveToEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClosePath() {
		return closePathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformValue() {
		return transformValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatrix() {
		return matrixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix_A() {
		return (EAttribute) matrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix_B() {
		return (EAttribute) matrixEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix_C() {
		return (EAttribute) matrixEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix_D() {
		return (EAttribute) matrixEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix_E() {
		return (EAttribute) matrixEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix_F() {
		return (EAttribute) matrixEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTranslate() {
		return translateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTranslate_X() {
		return (EAttribute) translateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTranslate_Y() {
		return (EAttribute) translateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScale() {
		return scaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScale_X() {
		return (EAttribute) scaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScale_Y() {
		return (EAttribute) scaleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotate() {
		return rotateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotate_A() {
		return (EAttribute) rotateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotate_X() {
		return (EAttribute) rotateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotate_Y() {
		return (EAttribute) rotateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkewX() {
		return skewXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkewX_A() {
		return (EAttribute) skewXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkewY() {
		return skewYEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkewY_A() {
		return (EAttribute) skewYEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnit() {
		return unitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAlign() {
		return alignEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMeetOrSlice() {
		return meetOrSliceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColorKeyword() {
		return colorKeywordEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvgFactory getSvgFactory() {
		return (SvgFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEReference(elementEClass, ELEMENT__ATTRIBUTES);

		structuralElementEClass = createEClass(STRUCTURAL_ELEMENT);

		useEClass = createEClass(USE);
		createEReference(useEClass, USE__X);
		createEReference(useEClass, USE__Y);
		createEReference(useEClass, USE__WIDTH);
		createEReference(useEClass, USE__HEIGHT);
		createEReference(useEClass, USE__HREF);

		clipPathEClass = createEClass(CLIP_PATH);
		createEReference(clipPathEClass, CLIP_PATH__GRAPHIC_ELEMENTS);
		createEReference(clipPathEClass, CLIP_PATH__USE);

		containerElementEClass = createEClass(CONTAINER_ELEMENT);
		createEReference(containerElementEClass, CONTAINER_ELEMENT__ELEMENTS);

		groupEClass = createEClass(GROUP);

		svgEClass = createEClass(SVG);
		createEReference(svgEClass, SVG__X);
		createEReference(svgEClass, SVG__Y);
		createEReference(svgEClass, SVG__WIDTH);
		createEReference(svgEClass, SVG__HEIGHT);
		createEReference(svgEClass, SVG__PRESERVE_ASPECT_RATIO);
		createEReference(svgEClass, SVG__VIEW_BOX);

		defsEClass = createEClass(DEFS);

		symbolEClass = createEClass(SYMBOL);
		createEReference(symbolEClass, SYMBOL__PRESERVE_ASPECT_RATIO);
		createEReference(symbolEClass, SYMBOL__VIEW_BOX);

		graphicElementEClass = createEClass(GRAPHIC_ELEMENT);

		circleEClass = createEClass(CIRCLE);
		createEReference(circleEClass, CIRCLE__CX);
		createEReference(circleEClass, CIRCLE__CY);
		createEReference(circleEClass, CIRCLE__R);

		ellipseEClass = createEClass(ELLIPSE);
		createEReference(ellipseEClass, ELLIPSE__CX);
		createEReference(ellipseEClass, ELLIPSE__CY);
		createEReference(ellipseEClass, ELLIPSE__RX);
		createEReference(ellipseEClass, ELLIPSE__RY);

		imageEClass = createEClass(IMAGE);
		createEReference(imageEClass, IMAGE__X);
		createEReference(imageEClass, IMAGE__Y);
		createEReference(imageEClass, IMAGE__WIDTH);
		createEReference(imageEClass, IMAGE__HEIGHT);
		createEReference(imageEClass, IMAGE__HREF);
		createEReference(imageEClass, IMAGE__PRESERVE_ASPECT_RATIO);

		lineEClass = createEClass(LINE);
		createEReference(lineEClass, LINE__X1);
		createEReference(lineEClass, LINE__Y1);
		createEReference(lineEClass, LINE__X2);
		createEReference(lineEClass, LINE__Y2);

		pathEClass = createEClass(PATH);
		createEReference(pathEClass, PATH__PATH);
		createEReference(pathEClass, PATH__PATH_LENGTH);

		polygonEClass = createEClass(POLYGON);
		createEReference(polygonEClass, POLYGON__POINTS);

		polylineEClass = createEClass(POLYLINE);
		createEReference(polylineEClass, POLYLINE__POINTS);

		rectEClass = createEClass(RECT);
		createEReference(rectEClass, RECT__X);
		createEReference(rectEClass, RECT__Y);
		createEReference(rectEClass, RECT__WIDTH);
		createEReference(rectEClass, RECT__HEIGHT);
		createEReference(rectEClass, RECT__RX);
		createEReference(rectEClass, RECT__RY);

		textEClass = createEClass(TEXT);
		createEReference(textEClass, TEXT__X);
		createEReference(textEClass, TEXT__Y);
		createEReference(textEClass, TEXT__DX);
		createEReference(textEClass, TEXT__DY);
		createEReference(textEClass, TEXT__TEXT_LENGTH);
		createEAttribute(textEClass, TEXT__TEXT);

		attributeEClass = createEClass(ATTRIBUTE);

		fillEClass = createEClass(FILL);
		createEReference(fillEClass, FILL__FILL);

		strokeEClass = createEClass(STROKE);
		createEReference(strokeEClass, STROKE__STROKE);

		strokeWidthEClass = createEClass(STROKE_WIDTH);
		createEAttribute(strokeWidthEClass, STROKE_WIDTH__STROKE_WIDTH);

		strokeDashArrayEClass = createEClass(STROKE_DASH_ARRAY);
		createEReference(strokeDashArrayEClass, STROKE_DASH_ARRAY__STROKE_DASH_ARRAY);

		strokeDashOffsetEClass = createEClass(STROKE_DASH_OFFSET);
		createEReference(strokeDashOffsetEClass, STROKE_DASH_OFFSET__STROKE_DASH_OFFSET);

		clipPathAttributeEClass = createEClass(CLIP_PATH_ATTRIBUTE);
		createEReference(clipPathAttributeEClass, CLIP_PATH_ATTRIBUTE__CLIP_PATH);

		fontFamilyEClass = createEClass(FONT_FAMILY);
		createEAttribute(fontFamilyEClass, FONT_FAMILY__FONT_FAMILY);

		fontSizeEClass = createEClass(FONT_SIZE);
		createEReference(fontSizeEClass, FONT_SIZE__FONT_SIZE);

		transformEClass = createEClass(TRANSFORM);
		createEReference(transformEClass, TRANSFORM__TRANSFORM);

		attributeTypeEClass = createEClass(ATTRIBUTE_TYPE);

		lengthEClass = createEClass(LENGTH);
		createEAttribute(lengthEClass, LENGTH__NUMBER);
		createEAttribute(lengthEClass, LENGTH__UNIT);

		coordinateEClass = createEClass(COORDINATE);
		createEAttribute(coordinateEClass, COORDINATE__NUMBER);
		createEAttribute(coordinateEClass, COORDINATE__UNIT);

		preserveAspectRatioEClass = createEClass(PRESERVE_ASPECT_RATIO);
		createEAttribute(preserveAspectRatioEClass, PRESERVE_ASPECT_RATIO__ALIGN);
		createEAttribute(preserveAspectRatioEClass, PRESERVE_ASPECT_RATIO__MEET_OR_SLICE);

		viewBoxEClass = createEClass(VIEW_BOX);
		createEReference(viewBoxEClass, VIEW_BOX__MIN_X);
		createEReference(viewBoxEClass, VIEW_BOX__MIN_Y);
		createEReference(viewBoxEClass, VIEW_BOX__WIDTH);
		createEReference(viewBoxEClass, VIEW_BOX__HEIGHT);

		pointEClass = createEClass(POINT);
		createEReference(pointEClass, POINT__X);
		createEReference(pointEClass, POINT__Y);

		hrefEClass = createEClass(HREF);

		localIriEClass = createEClass(LOCAL_IRI);
		createEAttribute(localIriEClass, LOCAL_IRI__ELEMENT_NAME);

		base64RefEClass = createEClass(BASE64_REF);
		createEAttribute(base64RefEClass, BASE64_REF__BASE64);

		paintEClass = createEClass(PAINT);

		iriPaintEClass = createEClass(IRI_PAINT);
		createEReference(iriPaintEClass, IRI_PAINT__IRI);

		nonePaintEClass = createEClass(NONE_PAINT);

		colorEClass = createEClass(COLOR);

		hexColorEClass = createEClass(HEX_COLOR);
		createEAttribute(hexColorEClass, HEX_COLOR__HEX);

		rgbColorEClass = createEClass(RGB_COLOR);
		createEAttribute(rgbColorEClass, RGB_COLOR__RED);
		createEAttribute(rgbColorEClass, RGB_COLOR__GREEN);
		createEAttribute(rgbColorEClass, RGB_COLOR__BLUE);

		rgbPercentageEClass = createEClass(RGB_PERCENTAGE);
		createEAttribute(rgbPercentageEClass, RGB_PERCENTAGE__RED);
		createEAttribute(rgbPercentageEClass, RGB_PERCENTAGE__GREEN);
		createEAttribute(rgbPercentageEClass, RGB_PERCENTAGE__BLUE);

		keywordColorEClass = createEClass(KEYWORD_COLOR);
		createEAttribute(keywordColorEClass, KEYWORD_COLOR__KEYWORD);

		pathValueEClass = createEClass(PATH_VALUE);

		absoluteMoveToEClass = createEClass(ABSOLUTE_MOVE_TO);
		createEAttribute(absoluteMoveToEClass, ABSOLUTE_MOVE_TO__X);
		createEAttribute(absoluteMoveToEClass, ABSOLUTE_MOVE_TO__Y);

		relativeMoveToEClass = createEClass(RELATIVE_MOVE_TO);
		createEAttribute(relativeMoveToEClass, RELATIVE_MOVE_TO__DX);
		createEAttribute(relativeMoveToEClass, RELATIVE_MOVE_TO__DY);

		absoluteLineToEClass = createEClass(ABSOLUTE_LINE_TO);
		createEAttribute(absoluteLineToEClass, ABSOLUTE_LINE_TO__X);
		createEAttribute(absoluteLineToEClass, ABSOLUTE_LINE_TO__Y);

		relativeLineToEClass = createEClass(RELATIVE_LINE_TO);
		createEAttribute(relativeLineToEClass, RELATIVE_LINE_TO__DX);
		createEAttribute(relativeLineToEClass, RELATIVE_LINE_TO__DY);

		absoluteHorizontalLineToEClass = createEClass(ABSOLUTE_HORIZONTAL_LINE_TO);
		createEAttribute(absoluteHorizontalLineToEClass, ABSOLUTE_HORIZONTAL_LINE_TO__X);

		relativeHorizontalLineToEClass = createEClass(RELATIVE_HORIZONTAL_LINE_TO);
		createEAttribute(relativeHorizontalLineToEClass, RELATIVE_HORIZONTAL_LINE_TO__DX);

		absoluteVerticalLineToEClass = createEClass(ABSOLUTE_VERTICAL_LINE_TO);
		createEAttribute(absoluteVerticalLineToEClass, ABSOLUTE_VERTICAL_LINE_TO__Y);

		relativeVerticalLineToEClass = createEClass(RELATIVE_VERTICAL_LINE_TO);
		createEAttribute(relativeVerticalLineToEClass, RELATIVE_VERTICAL_LINE_TO__DY);

		absoluteQuadraticCurveToEClass = createEClass(ABSOLUTE_QUADRATIC_CURVE_TO);
		createEAttribute(absoluteQuadraticCurveToEClass, ABSOLUTE_QUADRATIC_CURVE_TO__CX);
		createEAttribute(absoluteQuadraticCurveToEClass, ABSOLUTE_QUADRATIC_CURVE_TO__CY);
		createEAttribute(absoluteQuadraticCurveToEClass, ABSOLUTE_QUADRATIC_CURVE_TO__X);
		createEAttribute(absoluteQuadraticCurveToEClass, ABSOLUTE_QUADRATIC_CURVE_TO__Y);

		relativeQuadraticCurveToEClass = createEClass(RELATIVE_QUADRATIC_CURVE_TO);
		createEAttribute(relativeQuadraticCurveToEClass, RELATIVE_QUADRATIC_CURVE_TO__DCX);
		createEAttribute(relativeQuadraticCurveToEClass, RELATIVE_QUADRATIC_CURVE_TO__DCY);
		createEAttribute(relativeQuadraticCurveToEClass, RELATIVE_QUADRATIC_CURVE_TO__DX);
		createEAttribute(relativeQuadraticCurveToEClass, RELATIVE_QUADRATIC_CURVE_TO__DY);

		absoluteCubicCurveToEClass = createEClass(ABSOLUTE_CUBIC_CURVE_TO);
		createEAttribute(absoluteCubicCurveToEClass, ABSOLUTE_CUBIC_CURVE_TO__C1X);
		createEAttribute(absoluteCubicCurveToEClass, ABSOLUTE_CUBIC_CURVE_TO__C1Y);
		createEAttribute(absoluteCubicCurveToEClass, ABSOLUTE_CUBIC_CURVE_TO__C2X);
		createEAttribute(absoluteCubicCurveToEClass, ABSOLUTE_CUBIC_CURVE_TO__C2Y);
		createEAttribute(absoluteCubicCurveToEClass, ABSOLUTE_CUBIC_CURVE_TO__X);
		createEAttribute(absoluteCubicCurveToEClass, ABSOLUTE_CUBIC_CURVE_TO__Y);

		relativeCubicCurveToEClass = createEClass(RELATIVE_CUBIC_CURVE_TO);
		createEAttribute(relativeCubicCurveToEClass, RELATIVE_CUBIC_CURVE_TO__DC1X);
		createEAttribute(relativeCubicCurveToEClass, RELATIVE_CUBIC_CURVE_TO__DC1Y);
		createEAttribute(relativeCubicCurveToEClass, RELATIVE_CUBIC_CURVE_TO__DC2X);
		createEAttribute(relativeCubicCurveToEClass, RELATIVE_CUBIC_CURVE_TO__DC2Y);
		createEAttribute(relativeCubicCurveToEClass, RELATIVE_CUBIC_CURVE_TO__DX);
		createEAttribute(relativeCubicCurveToEClass, RELATIVE_CUBIC_CURVE_TO__DY);

		absoluteSmoothQuadraticCurveToEClass = createEClass(ABSOLUTE_SMOOTH_QUADRATIC_CURVE_TO);
		createEAttribute(absoluteSmoothQuadraticCurveToEClass, ABSOLUTE_SMOOTH_QUADRATIC_CURVE_TO__X);
		createEAttribute(absoluteSmoothQuadraticCurveToEClass, ABSOLUTE_SMOOTH_QUADRATIC_CURVE_TO__Y);

		relativeSmoothQuadraticCurveToEClass = createEClass(RELATIVE_SMOOTH_QUADRATIC_CURVE_TO);
		createEAttribute(relativeSmoothQuadraticCurveToEClass, RELATIVE_SMOOTH_QUADRATIC_CURVE_TO__DX);
		createEAttribute(relativeSmoothQuadraticCurveToEClass, RELATIVE_SMOOTH_QUADRATIC_CURVE_TO__DY);

		absoluteSmoothCubicCurveToEClass = createEClass(ABSOLUTE_SMOOTH_CUBIC_CURVE_TO);
		createEAttribute(absoluteSmoothCubicCurveToEClass, ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__CX);
		createEAttribute(absoluteSmoothCubicCurveToEClass, ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__CY);
		createEAttribute(absoluteSmoothCubicCurveToEClass, ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__X);
		createEAttribute(absoluteSmoothCubicCurveToEClass, ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__Y);

		relativeSmoothCubicCurveToEClass = createEClass(RELATIVE_SMOOTH_CUBIC_CURVE_TO);
		createEAttribute(relativeSmoothCubicCurveToEClass, RELATIVE_SMOOTH_CUBIC_CURVE_TO__DCX);
		createEAttribute(relativeSmoothCubicCurveToEClass, RELATIVE_SMOOTH_CUBIC_CURVE_TO__DCY);
		createEAttribute(relativeSmoothCubicCurveToEClass, RELATIVE_SMOOTH_CUBIC_CURVE_TO__DX);
		createEAttribute(relativeSmoothCubicCurveToEClass, RELATIVE_SMOOTH_CUBIC_CURVE_TO__DY);

		closePathEClass = createEClass(CLOSE_PATH);

		transformValueEClass = createEClass(TRANSFORM_VALUE);

		matrixEClass = createEClass(MATRIX);
		createEAttribute(matrixEClass, MATRIX__A);
		createEAttribute(matrixEClass, MATRIX__B);
		createEAttribute(matrixEClass, MATRIX__C);
		createEAttribute(matrixEClass, MATRIX__D);
		createEAttribute(matrixEClass, MATRIX__E);
		createEAttribute(matrixEClass, MATRIX__F);

		translateEClass = createEClass(TRANSLATE);
		createEAttribute(translateEClass, TRANSLATE__X);
		createEAttribute(translateEClass, TRANSLATE__Y);

		scaleEClass = createEClass(SCALE);
		createEAttribute(scaleEClass, SCALE__X);
		createEAttribute(scaleEClass, SCALE__Y);

		rotateEClass = createEClass(ROTATE);
		createEAttribute(rotateEClass, ROTATE__A);
		createEAttribute(rotateEClass, ROTATE__X);
		createEAttribute(rotateEClass, ROTATE__Y);

		skewXEClass = createEClass(SKEW_X);
		createEAttribute(skewXEClass, SKEW_X__A);

		skewYEClass = createEClass(SKEW_Y);
		createEAttribute(skewYEClass, SKEW_Y__A);

		// Create enums
		unitEEnum = createEEnum(UNIT);
		alignEEnum = createEEnum(ALIGN);
		meetOrSliceEEnum = createEEnum(MEET_OR_SLICE);
		colorKeywordEEnum = createEEnum(COLOR_KEYWORD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		structuralElementEClass.getESuperTypes().add(this.getElement());
		useEClass.getESuperTypes().add(this.getStructuralElement());
		clipPathEClass.getESuperTypes().add(this.getStructuralElement());
		containerElementEClass.getESuperTypes().add(this.getStructuralElement());
		groupEClass.getESuperTypes().add(this.getContainerElement());
		svgEClass.getESuperTypes().add(this.getGroup());
		defsEClass.getESuperTypes().add(this.getContainerElement());
		symbolEClass.getESuperTypes().add(this.getDefs());
		graphicElementEClass.getESuperTypes().add(this.getElement());
		circleEClass.getESuperTypes().add(this.getGraphicElement());
		ellipseEClass.getESuperTypes().add(this.getGraphicElement());
		imageEClass.getESuperTypes().add(this.getGraphicElement());
		lineEClass.getESuperTypes().add(this.getGraphicElement());
		pathEClass.getESuperTypes().add(this.getGraphicElement());
		polygonEClass.getESuperTypes().add(this.getGraphicElement());
		polylineEClass.getESuperTypes().add(this.getGraphicElement());
		rectEClass.getESuperTypes().add(this.getGraphicElement());
		textEClass.getESuperTypes().add(this.getGraphicElement());
		fillEClass.getESuperTypes().add(this.getAttribute());
		strokeEClass.getESuperTypes().add(this.getAttribute());
		strokeWidthEClass.getESuperTypes().add(this.getAttribute());
		strokeDashArrayEClass.getESuperTypes().add(this.getAttribute());
		strokeDashOffsetEClass.getESuperTypes().add(this.getAttribute());
		clipPathAttributeEClass.getESuperTypes().add(this.getAttribute());
		fontFamilyEClass.getESuperTypes().add(this.getAttribute());
		fontSizeEClass.getESuperTypes().add(this.getAttribute());
		transformEClass.getESuperTypes().add(this.getAttribute());
		lengthEClass.getESuperTypes().add(this.getAttributeType());
		coordinateEClass.getESuperTypes().add(this.getAttributeType());
		preserveAspectRatioEClass.getESuperTypes().add(this.getAttributeType());
		viewBoxEClass.getESuperTypes().add(this.getAttributeType());
		pointEClass.getESuperTypes().add(this.getAttributeType());
		hrefEClass.getESuperTypes().add(this.getAttributeType());
		localIriEClass.getESuperTypes().add(this.getHref());
		base64RefEClass.getESuperTypes().add(this.getHref());
		paintEClass.getESuperTypes().add(this.getAttributeType());
		iriPaintEClass.getESuperTypes().add(this.getPaint());
		nonePaintEClass.getESuperTypes().add(this.getPaint());
		colorEClass.getESuperTypes().add(this.getPaint());
		hexColorEClass.getESuperTypes().add(this.getColor());
		rgbColorEClass.getESuperTypes().add(this.getColor());
		rgbPercentageEClass.getESuperTypes().add(this.getColor());
		keywordColorEClass.getESuperTypes().add(this.getColor());
		pathValueEClass.getESuperTypes().add(this.getAttributeType());
		absoluteMoveToEClass.getESuperTypes().add(this.getPathValue());
		relativeMoveToEClass.getESuperTypes().add(this.getPathValue());
		absoluteLineToEClass.getESuperTypes().add(this.getPathValue());
		relativeLineToEClass.getESuperTypes().add(this.getPathValue());
		absoluteHorizontalLineToEClass.getESuperTypes().add(this.getPathValue());
		relativeHorizontalLineToEClass.getESuperTypes().add(this.getPathValue());
		absoluteVerticalLineToEClass.getESuperTypes().add(this.getPathValue());
		relativeVerticalLineToEClass.getESuperTypes().add(this.getPathValue());
		absoluteQuadraticCurveToEClass.getESuperTypes().add(this.getPathValue());
		relativeQuadraticCurveToEClass.getESuperTypes().add(this.getPathValue());
		absoluteCubicCurveToEClass.getESuperTypes().add(this.getPathValue());
		relativeCubicCurveToEClass.getESuperTypes().add(this.getPathValue());
		absoluteSmoothQuadraticCurveToEClass.getESuperTypes().add(this.getPathValue());
		relativeSmoothQuadraticCurveToEClass.getESuperTypes().add(this.getPathValue());
		absoluteSmoothCubicCurveToEClass.getESuperTypes().add(this.getPathValue());
		relativeSmoothCubicCurveToEClass.getESuperTypes().add(this.getPathValue());
		closePathEClass.getESuperTypes().add(this.getPathValue());
		transformValueEClass.getESuperTypes().add(this.getAttributeType());
		matrixEClass.getESuperTypes().add(this.getTransformValue());
		translateEClass.getESuperTypes().add(this.getTransformValue());
		scaleEClass.getESuperTypes().add(this.getTransformValue());
		rotateEClass.getESuperTypes().add(this.getTransformValue());
		skewXEClass.getESuperTypes().add(this.getTransformValue());
		skewYEClass.getESuperTypes().add(this.getTransformValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(structuralElementEClass, StructuralElement.class, "StructuralElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(useEClass, Use.class, "Use", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUse_X(), this.getCoordinate(), null, "x", null, 0, 1, Use.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUse_Y(), this.getCoordinate(), null, "y", null, 0, 1, Use.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUse_Width(), this.getLength(), null, "width", null, 0, 1, Use.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getUse_Height(), this.getLength(), null, "height", null, 0, 1, Use.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getUse_Href(), this.getHref(), null, "href", null, 0, 1, Use.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clipPathEClass, ClipPath.class, "ClipPath", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClipPath_GraphicElements(), this.getGraphicElement(), null, "graphicElements", null, 0, -1,
				ClipPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClipPath_Use(), this.getUse(), null, "use", null, 0, -1, ClipPath.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(containerElementEClass, ContainerElement.class, "ContainerElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerElement_Elements(), this.getElement(), null, "elements", null, 0, -1,
				ContainerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(svgEClass, Svg.class, "Svg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSvg_X(), this.getCoordinate(), null, "x", null, 0, 1, Svg.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSvg_Y(), this.getCoordinate(), null, "y", null, 0, 1, Svg.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSvg_Width(), this.getLength(), null, "width", null, 0, 1, Svg.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSvg_Height(), this.getLength(), null, "height", null, 0, 1, Svg.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSvg_PreserveAspectRatio(), this.getPreserveAspectRatio(), null, "preserveAspectRatio", null,
				0, 1, Svg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSvg_ViewBox(), this.getViewBox(), null, "viewBox", null, 0, 1, Svg.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(defsEClass, Defs.class, "Defs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(symbolEClass, Symbol.class, "Symbol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSymbol_PreserveAspectRatio(), this.getPreserveAspectRatio(), null, "preserveAspectRatio",
				null, 0, 1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymbol_ViewBox(), this.getViewBox(), null, "viewBox", null, 0, 1, Symbol.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(graphicElementEClass, GraphicElement.class, "GraphicElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(circleEClass, Circle.class, "Circle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCircle_Cx(), this.getCoordinate(), null, "cx", null, 0, 1, Circle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCircle_Cy(), this.getCoordinate(), null, "cy", null, 0, 1, Circle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCircle_R(), this.getLength(), null, "r", null, 0, 1, Circle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(ellipseEClass, Ellipse.class, "Ellipse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEllipse_Cx(), this.getCoordinate(), null, "cx", null, 0, 1, Ellipse.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEllipse_Cy(), this.getCoordinate(), null, "cy", null, 0, 1, Ellipse.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEllipse_Rx(), this.getLength(), null, "rx", null, 0, 1, Ellipse.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEllipse_Ry(), this.getLength(), null, "ry", null, 0, 1, Ellipse.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImage_X(), this.getCoordinate(), null, "x", null, 0, 1, Image.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getImage_Y(), this.getCoordinate(), null, "y", null, 0, 1, Image.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getImage_Width(), this.getLength(), null, "width", null, 0, 1, Image.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getImage_Height(), this.getLength(), null, "height", null, 0, 1, Image.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getImage_Href(), this.getHref(), null, "href", null, 0, 1, Image.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getImage_PreserveAspectRatio(), this.getPreserveAspectRatio(), null, "preserveAspectRatio", null,
				0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLine_X1(), this.getCoordinate(), null, "x1", null, 0, 1, Line.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getLine_Y1(), this.getCoordinate(), null, "y1", null, 0, 1, Line.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getLine_X2(), this.getCoordinate(), null, "x2", null, 0, 1, Line.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getLine_Y2(), this.getCoordinate(), null, "y2", null, 0, 1, Line.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPath_Path(), this.getPathValue(), null, "path", null, 0, -1, Path.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPath_PathLength(), this.getLength(), null, "pathLength", null, 0, 1, Path.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polygonEClass, Polygon.class, "Polygon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolygon_Points(), this.getPoint(), null, "points", null, 0, -1, Polygon.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(polylineEClass, Polyline.class, "Polyline", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolyline_Points(), this.getPoint(), null, "points", null, 0, -1, Polyline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rectEClass, Rect.class, "Rect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRect_X(), this.getCoordinate(), null, "x", null, 0, 1, Rect.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRect_Y(), this.getCoordinate(), null, "y", null, 0, 1, Rect.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRect_Width(), this.getLength(), null, "width", null, 0, 1, Rect.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRect_Height(), this.getLength(), null, "height", null, 0, 1, Rect.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRect_Rx(), this.getLength(), null, "rx", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRect_Ry(), this.getLength(), null, "ry", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getText_X(), this.getCoordinate(), null, "x", null, 0, 1, Text.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getText_Y(), this.getCoordinate(), null, "y", null, 0, 1, Text.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getText_Dx(), this.getLength(), null, "dx", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getText_Dy(), this.getLength(), null, "dy", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getText_TextLength(), this.getLength(), null, "textLength", null, 0, 1, Text.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_Text(), ecorePackage.getEString(), "text", null, 0, 1, Text.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(fillEClass, Fill.class, "Fill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFill_Fill(), this.getPaint(), null, "fill", null, 1, 1, Fill.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(strokeEClass, Stroke.class, "Stroke", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStroke_Stroke(), this.getPaint(), null, "stroke", null, 1, 1, Stroke.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(strokeWidthEClass, StrokeWidth.class, "StrokeWidth", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStrokeWidth_StrokeWidth(), ecorePackage.getEBigDecimal(), "strokeWidth", null, 1, 1,
				StrokeWidth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(strokeDashArrayEClass, StrokeDashArray.class, "StrokeDashArray", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStrokeDashArray_StrokeDashArray(), this.getLength(), null, "strokeDashArray", null, 0, -1,
				StrokeDashArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strokeDashOffsetEClass, StrokeDashOffset.class, "StrokeDashOffset", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStrokeDashOffset_StrokeDashOffset(), this.getLength(), null, "strokeDashOffset", null, 1, 1,
				StrokeDashOffset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clipPathAttributeEClass, ClipPathAttribute.class, "ClipPathAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClipPathAttribute_ClipPath(), this.getLocalIri(), null, "clipPath", null, 1, 1,
				ClipPathAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fontFamilyEClass, FontFamily.class, "FontFamily", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFontFamily_FontFamily(), ecorePackage.getEString(), "fontFamily", null, 1, 1,
				FontFamily.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(fontSizeEClass, FontSize.class, "FontSize", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFontSize_FontSize(), this.getLength(), null, "fontSize", null, 1, 1, FontSize.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformEClass, Transform.class, "Transform", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransform_Transform(), this.getTransformValue(), null, "transform", null, 0, -1,
				Transform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeTypeEClass, AttributeType.class, "AttributeType", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(lengthEClass, Length.class, "Length", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLength_Number(), ecorePackage.getEBigDecimal(), "number", null, 1, 1, Length.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLength_Unit(), this.getUnit(), "unit", null, 0, 1, Length.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinateEClass, Coordinate.class, "Coordinate", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoordinate_Number(), ecorePackage.getEBigDecimal(), "number", null, 1, 1, Coordinate.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinate_Unit(), this.getUnit(), "unit", null, 0, 1, Coordinate.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preserveAspectRatioEClass, PreserveAspectRatio.class, "PreserveAspectRatio", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreserveAspectRatio_Align(), this.getAlign(), "align", null, 1, 1, PreserveAspectRatio.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreserveAspectRatio_MeetOrSlice(), this.getMeetOrSlice(), "meetOrSlice", null, 0, 1,
				PreserveAspectRatio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewBoxEClass, ViewBox.class, "ViewBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewBox_MinX(), this.getCoordinate(), null, "minX", null, 1, 1, ViewBox.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getViewBox_MinY(), this.getCoordinate(), null, "minY", null, 1, 1, ViewBox.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getViewBox_Width(), this.getLength(), null, "width", null, 1, 1, ViewBox.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getViewBox_Height(), this.getLength(), null, "height", null, 1, 1, ViewBox.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPoint_X(), this.getCoordinate(), null, "x", null, 1, 1, Point.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPoint_Y(), this.getCoordinate(), null, "y", null, 1, 1, Point.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(hrefEClass, Href.class, "Href", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(localIriEClass, LocalIri.class, "LocalIri", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalIri_ElementName(), ecorePackage.getEString(), "elementName", null, 1, 1, LocalIri.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(base64RefEClass, Base64Ref.class, "Base64Ref", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBase64Ref_Base64(), ecorePackage.getEString(), "base64", null, 1, 1, Base64Ref.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paintEClass, Paint.class, "Paint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iriPaintEClass, IriPaint.class, "IriPaint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIriPaint_Iri(), this.getLocalIri(), null, "iri", null, 1, 1, IriPaint.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(nonePaintEClass, NonePaint.class, "NonePaint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(colorEClass, Color.class, "Color", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hexColorEClass, HexColor.class, "HexColor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHexColor_Hex(), ecorePackage.getEString(), "hex", null, 1, 1, HexColor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rgbColorEClass, RgbColor.class, "RgbColor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRgbColor_Red(), ecorePackage.getEBigInteger(), "red", null, 1, 1, RgbColor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRgbColor_Green(), ecorePackage.getEBigInteger(), "green", null, 1, 1, RgbColor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRgbColor_Blue(), ecorePackage.getEBigInteger(), "blue", null, 1, 1, RgbColor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rgbPercentageEClass, RgbPercentage.class, "RgbPercentage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRgbPercentage_Red(), ecorePackage.getEBigDecimal(), "red", null, 1, 1, RgbPercentage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRgbPercentage_Green(), ecorePackage.getEBigDecimal(), "green", null, 1, 1,
				RgbPercentage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRgbPercentage_Blue(), ecorePackage.getEBigDecimal(), "blue", null, 1, 1, RgbPercentage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keywordColorEClass, KeywordColor.class, "KeywordColor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeywordColor_Keyword(), this.getColorKeyword(), "keyword", null, 1, 1, KeywordColor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathValueEClass, PathValue.class, "PathValue", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(absoluteMoveToEClass, AbsoluteMoveTo.class, "AbsoluteMoveTo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbsoluteMoveTo_X(), ecorePackage.getEBigDecimal(), "x", null, 1, 1, AbsoluteMoveTo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbsoluteMoveTo_Y(), ecorePackage.getEBigDecimal(), "y", null, 1, 1, AbsoluteMoveTo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relativeMoveToEClass, RelativeMoveTo.class, "RelativeMoveTo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelativeMoveTo_Dx(), ecorePackage.getEBigDecimal(), "dx", null, 1, 1, RelativeMoveTo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeMoveTo_Dy(), ecorePackage.getEBigDecimal(), "dy", null, 1, 1, RelativeMoveTo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absoluteLineToEClass, AbsoluteLineTo.class, "AbsoluteLineTo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbsoluteLineTo_X(), ecorePackage.getEBigDecimal(), "x", null, 1, 1, AbsoluteLineTo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbsoluteLineTo_Y(), ecorePackage.getEBigDecimal(), "y", null, 1, 1, AbsoluteLineTo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relativeLineToEClass, RelativeLineTo.class, "RelativeLineTo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelativeLineTo_Dx(), ecorePackage.getEBigDecimal(), "dx", null, 1, 1, RelativeLineTo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeLineTo_Dy(), ecorePackage.getEBigDecimal(), "dy", null, 1, 1, RelativeLineTo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absoluteHorizontalLineToEClass, AbsoluteHorizontalLineTo.class, "AbsoluteHorizontalLineTo",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbsoluteHorizontalLineTo_X(), ecorePackage.getEBigDecimal(), "x", null, 1, 1,
				AbsoluteHorizontalLineTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relativeHorizontalLineToEClass, RelativeHorizontalLineTo.class, "RelativeHorizontalLineTo",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelativeHorizontalLineTo_Dx(), ecorePackage.getEBigDecimal(), "dx", null, 1, 1,
				RelativeHorizontalLineTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absoluteVerticalLineToEClass, AbsoluteVerticalLineTo.class, "AbsoluteVerticalLineTo", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbsoluteVerticalLineTo_Y(), ecorePackage.getEBigDecimal(), "y", null, 1, 1,
				AbsoluteVerticalLineTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relativeVerticalLineToEClass, RelativeVerticalLineTo.class, "RelativeVerticalLineTo", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelativeVerticalLineTo_Dy(), ecorePackage.getEBigDecimal(), "dy", null, 1, 1,
				RelativeVerticalLineTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absoluteQuadraticCurveToEClass, AbsoluteQuadraticCurveTo.class, "AbsoluteQuadraticCurveTo",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbsoluteQuadraticCurveTo_Cx(), ecorePackage.getEBigDecimal(), "cx", null, 1, 1,
				AbsoluteQuadraticCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbsoluteQuadraticCurveTo_Cy(), ecorePackage.getEBigDecimal(), "cy", null, 1, 1,
				AbsoluteQuadraticCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbsoluteQuadraticCurveTo_X(), ecorePackage.getEBigDecimal(), "x", null, 1, 1,
				AbsoluteQuadraticCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbsoluteQuadraticCurveTo_Y(), ecorePackage.getEBigDecimal(), "y", null, 1, 1,
				AbsoluteQuadraticCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relativeQuadraticCurveToEClass, RelativeQuadraticCurveTo.class, "RelativeQuadraticCurveTo",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelativeQuadraticCurveTo_Dcx(), ecorePackage.getEBigDecimal(), "dcx", null, 1, 1,
				RelativeQuadraticCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeQuadraticCurveTo_Dcy(), ecorePackage.getEBigDecimal(), "dcy", null, 1, 1,
				RelativeQuadraticCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeQuadraticCurveTo_Dx(), ecorePackage.getEBigDecimal(), "dx", null, 1, 1,
				RelativeQuadraticCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeQuadraticCurveTo_Dy(), ecorePackage.getEBigDecimal(), "dy", null, 1, 1,
				RelativeQuadraticCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absoluteCubicCurveToEClass, AbsoluteCubicCurveTo.class, "AbsoluteCubicCurveTo", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbsoluteCubicCurveTo_C1x(), ecorePackage.getEBigDecimal(), "c1x", null, 1, 1,
				AbsoluteCubicCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbsoluteCubicCurveTo_C1y(), ecorePackage.getEBigDecimal(), "c1y", null, 1, 1,
				AbsoluteCubicCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbsoluteCubicCurveTo_C2x(), ecorePackage.getEBigDecimal(), "c2x", null, 1, 1,
				AbsoluteCubicCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbsoluteCubicCurveTo_C2y(), ecorePackage.getEBigDecimal(), "c2y", null, 1, 1,
				AbsoluteCubicCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbsoluteCubicCurveTo_X(), ecorePackage.getEBigDecimal(), "x", null, 1, 1,
				AbsoluteCubicCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbsoluteCubicCurveTo_Y(), ecorePackage.getEBigDecimal(), "y", null, 1, 1,
				AbsoluteCubicCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relativeCubicCurveToEClass, RelativeCubicCurveTo.class, "RelativeCubicCurveTo", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelativeCubicCurveTo_Dc1x(), ecorePackage.getEBigDecimal(), "dc1x", null, 1, 1,
				RelativeCubicCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeCubicCurveTo_Dc1y(), ecorePackage.getEBigDecimal(), "dc1y", null, 1, 1,
				RelativeCubicCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeCubicCurveTo_Dc2x(), ecorePackage.getEBigDecimal(), "dc2x", null, 1, 1,
				RelativeCubicCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeCubicCurveTo_Dc2y(), ecorePackage.getEBigDecimal(), "dc2y", null, 1, 1,
				RelativeCubicCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeCubicCurveTo_Dx(), ecorePackage.getEBigDecimal(), "dx", null, 1, 1,
				RelativeCubicCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeCubicCurveTo_Dy(), ecorePackage.getEBigDecimal(), "dy", null, 1, 1,
				RelativeCubicCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absoluteSmoothQuadraticCurveToEClass, AbsoluteSmoothQuadraticCurveTo.class,
				"AbsoluteSmoothQuadraticCurveTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbsoluteSmoothQuadraticCurveTo_X(), ecorePackage.getEBigDecimal(), "x", null, 1, 1,
				AbsoluteSmoothQuadraticCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbsoluteSmoothQuadraticCurveTo_Y(), ecorePackage.getEBigDecimal(), "y", null, 1, 1,
				AbsoluteSmoothQuadraticCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relativeSmoothQuadraticCurveToEClass, RelativeSmoothQuadraticCurveTo.class,
				"RelativeSmoothQuadraticCurveTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelativeSmoothQuadraticCurveTo_Dx(), ecorePackage.getEBigDecimal(), "dx", null, 1, 1,
				RelativeSmoothQuadraticCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeSmoothQuadraticCurveTo_Dy(), ecorePackage.getEBigDecimal(), "dy", null, 1, 1,
				RelativeSmoothQuadraticCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absoluteSmoothCubicCurveToEClass, AbsoluteSmoothCubicCurveTo.class, "AbsoluteSmoothCubicCurveTo",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbsoluteSmoothCubicCurveTo_Cx(), ecorePackage.getEBigDecimal(), "cx", null, 1, 1,
				AbsoluteSmoothCubicCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbsoluteSmoothCubicCurveTo_Cy(), ecorePackage.getEBigDecimal(), "cy", null, 1, 1,
				AbsoluteSmoothCubicCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbsoluteSmoothCubicCurveTo_X(), ecorePackage.getEBigDecimal(), "x", null, 1, 1,
				AbsoluteSmoothCubicCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbsoluteSmoothCubicCurveTo_Y(), ecorePackage.getEBigDecimal(), "y", null, 1, 1,
				AbsoluteSmoothCubicCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relativeSmoothCubicCurveToEClass, RelativeSmoothCubicCurveTo.class, "RelativeSmoothCubicCurveTo",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelativeSmoothCubicCurveTo_Dcx(), ecorePackage.getEBigDecimal(), "dcx", null, 1, 1,
				RelativeSmoothCubicCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeSmoothCubicCurveTo_Dcy(), ecorePackage.getEBigDecimal(), "dcy", null, 1, 1,
				RelativeSmoothCubicCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeSmoothCubicCurveTo_Dx(), ecorePackage.getEBigDecimal(), "dx", null, 1, 1,
				RelativeSmoothCubicCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeSmoothCubicCurveTo_Dy(), ecorePackage.getEBigDecimal(), "dy", null, 1, 1,
				RelativeSmoothCubicCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(closePathEClass, ClosePath.class, "ClosePath", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(transformValueEClass, TransformValue.class, "TransformValue", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(matrixEClass, Matrix.class, "Matrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatrix_A(), ecorePackage.getEBigDecimal(), "a", null, 1, 1, Matrix.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix_B(), ecorePackage.getEBigDecimal(), "b", null, 1, 1, Matrix.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix_C(), ecorePackage.getEBigDecimal(), "c", null, 1, 1, Matrix.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix_D(), ecorePackage.getEBigDecimal(), "d", null, 1, 1, Matrix.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix_E(), ecorePackage.getEBigDecimal(), "e", null, 1, 1, Matrix.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix_F(), ecorePackage.getEBigDecimal(), "f", null, 1, 1, Matrix.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(translateEClass, Translate.class, "Translate", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTranslate_X(), ecorePackage.getEBigDecimal(), "x", null, 1, 1, Translate.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTranslate_Y(), ecorePackage.getEBigDecimal(), "y", null, 0, 1, Translate.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scaleEClass, Scale.class, "Scale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScale_X(), ecorePackage.getEBigDecimal(), "x", null, 1, 1, Scale.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScale_Y(), ecorePackage.getEBigDecimal(), "y", null, 0, 1, Scale.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rotateEClass, Rotate.class, "Rotate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRotate_A(), ecorePackage.getEBigDecimal(), "a", null, 1, 1, Rotate.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotate_X(), ecorePackage.getEBigDecimal(), "x", null, 0, 1, Rotate.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotate_Y(), ecorePackage.getEBigDecimal(), "y", null, 0, 1, Rotate.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skewXEClass, SkewX.class, "SkewX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSkewX_A(), ecorePackage.getEBigDecimal(), "a", null, 1, 1, SkewX.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skewYEClass, SkewY.class, "SkewY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSkewY_A(), ecorePackage.getEBigDecimal(), "a", null, 1, 1, SkewY.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(unitEEnum, Unit.class, "Unit");
		addEEnumLiteral(unitEEnum, Unit.PX);
		addEEnumLiteral(unitEEnum, Unit.EM);
		addEEnumLiteral(unitEEnum, Unit.EX);
		addEEnumLiteral(unitEEnum, Unit.IN);
		addEEnumLiteral(unitEEnum, Unit.CM);
		addEEnumLiteral(unitEEnum, Unit.MM);
		addEEnumLiteral(unitEEnum, Unit.PT);
		addEEnumLiteral(unitEEnum, Unit.PC);
		addEEnumLiteral(unitEEnum, Unit.PERCENTAGE);

		initEEnum(alignEEnum, Align.class, "Align");
		addEEnumLiteral(alignEEnum, Align.NONE);
		addEEnumLiteral(alignEEnum, Align.XMIN_YMIN);
		addEEnumLiteral(alignEEnum, Align.XMID_YMIN);
		addEEnumLiteral(alignEEnum, Align.XMAX_YMIN);
		addEEnumLiteral(alignEEnum, Align.XMIN_YMID);
		addEEnumLiteral(alignEEnum, Align.XMID_YMID);
		addEEnumLiteral(alignEEnum, Align.XMAX_YMID);
		addEEnumLiteral(alignEEnum, Align.XMIN_YMAX);
		addEEnumLiteral(alignEEnum, Align.XMID_YMAX);
		addEEnumLiteral(alignEEnum, Align.XMAX_YMAX);

		initEEnum(meetOrSliceEEnum, MeetOrSlice.class, "MeetOrSlice");
		addEEnumLiteral(meetOrSliceEEnum, MeetOrSlice.MEET);
		addEEnumLiteral(meetOrSliceEEnum, MeetOrSlice.SLICE);

		initEEnum(colorKeywordEEnum, ColorKeyword.class, "ColorKeyword");
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.ALICEBLUE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.ANTIQUEWHITE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.AQUA);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.AQUAMARINE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.AZURE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.BEIGE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.BISQUE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.BLACK);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.BLANCHEDALMOND);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.BLUE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.BLUEVIOLET);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.BROWN);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.BURLYWOOD);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.CADETBLUE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.CHARTREUSE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.CHOCOLATE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.CORAL);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.CORNFLOWERBLUE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.CORNSILK);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.CRIMSON);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.CYAN);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.DARKBLUE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.DARKCYAN);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.DARKGOLDENROD);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.DARKGRAY);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.DARKGREEN);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.DARKGREY);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.DARKKHAKI);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.DARKMAGENTA);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.DARKOLIVEGREEN);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.DARKORANGE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.DARKORCHID);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.DARKRED);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.DARKSALMON);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.DARKSEAGREEN);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.DARKSLATEBLUE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.DARKSLATEGRAY);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.DARKSLATEGREY);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.DARKTURQUOISE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.DARKVIOLET);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.DEEPPINK);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.DEEPSKYBLUE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.DIMGRAY);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.DIMGREY);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.DODGERBLUE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.FIREBRICK);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.FLORALWHITE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.FORESTGREEN);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.FUCHSIA);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.GAINSBORO);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.GHOSTWHITE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.GOLD);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.GOLDENROD);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.GRAY);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.GREY);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.GREEN);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.GREENYELLOW);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.HONEYDEW);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.HOTPINK);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.INDIANRED);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.INDIGO);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.IVORY);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.KHAKI);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.LAVENDER);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.LAVENDERBLUSH);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.LAWNGREEN);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.LEMONCHIFFON);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.LIGHTBLUE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.LIGHTCORAL);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.LIGHTCYAN);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.LIGHTGOLDENRODYELLOW);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.LIGHTGRAY);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.LIGHTGREEN);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.LIGHTGREY);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.LIGHTPINK);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.LIGHTSALMON);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.LIGHTSEAGREEN);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.LIGHTSKYBLUE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.LIGHTSLATEGRAY);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.LIGHTSLATEGREY);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.LIGHTSTEELBLUE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.LIGHTYELLOW);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.LIME);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.LIMEGREEN);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.LINEN);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.MAGENTA);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.MAROON);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.MEDIUMAQUAMARINE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.MEDIUMBLUE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.MEDIUMORCHID);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.MEDIUMPURPLE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.MEDIUMSEAGREEN);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.MEDIUMSLATEBLUE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.MEDIUMSPRINGGREEN);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.MEDIUMTURQUOISE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.MEDIUMVIOLETRED);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.MIDNIGHTBLUE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.MINTCREAM);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.MISTYROSE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.MOCCASIN);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.NAVAJOWHITE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.NAVY);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.OLDLACE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.OLIVE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.OLIVEDRAB);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.ORANGE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.ORANGERED);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.ORCHID);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.PALEGOLDENROD);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.PALEGREEN);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.PALETURQUOISE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.PALEVIOLETRED);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.PAPAYAWHIP);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.PEACHPUFF);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.PERU);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.PINK);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.PLUM);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.POWDERBLUE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.PURPLE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.RED);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.ROSYBROWN);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.ROYALBLUE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.SADDLEBROWN);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.SALMON);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.SANDYBROWN);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.SEAGREEN);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.SEASHELL);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.SIENNA);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.SILVER);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.SKYBLUE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.SLATEBLUE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.SLATEGRAY);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.SLATEGREY);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.SNOW);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.SPRINGGREEN);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.STEELBLUE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.TAN);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.TEAL);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.THISTLE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.TOMATO);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.TURQUOISE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.VIOLET);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.WHEAT);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.WHITE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.WHITESMOKE);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.YELLOW);
		addEEnumLiteral(colorKeywordEEnum, ColorKeyword.YELLOWGREEN);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";
		addAnnotation(getElement_Attributes(), source, new String[] { "nullFree", "false" });
		addAnnotation(getClipPath_GraphicElements(), source, new String[] { "nullFree", "false" });
		addAnnotation(getClipPath_Use(), source, new String[] { "nullFree", "false" });
		addAnnotation(getContainerElement_Elements(), source, new String[] { "nullFree", "false" });
		addAnnotation(getPath_Path(), source, new String[] { "nullFree", "false" });
		addAnnotation(getPolygon_Points(), source, new String[] { "nullFree", "false" });
		addAnnotation(getPolyline_Points(), source, new String[] { "nullFree", "false" });
		addAnnotation(getStrokeDashArray_StrokeDashArray(), source, new String[] { "nullFree", "false" });
		addAnnotation(getTransform_Transform(), source, new String[] { "nullFree", "false" });
	}

} //SvgPackageImpl
