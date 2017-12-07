/**
 */
package svg.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import svg.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SvgFactoryImpl extends EFactoryImpl implements SvgFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SvgFactory init() {
		try {
			SvgFactory theSvgFactory = (SvgFactory) EPackage.Registry.INSTANCE.getEFactory(SvgPackage.eNS_URI);
			if (theSvgFactory != null) {
				return theSvgFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SvgFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvgFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SvgPackage.USE:
			return createUse();
		case SvgPackage.CLIP_PATH:
			return createClipPath();
		case SvgPackage.GROUP:
			return createGroup();
		case SvgPackage.SVG:
			return createSvg();
		case SvgPackage.DEFS:
			return createDefs();
		case SvgPackage.SYMBOL:
			return createSymbol();
		case SvgPackage.CIRCLE:
			return createCircle();
		case SvgPackage.ELLIPSE:
			return createEllipse();
		case SvgPackage.IMAGE:
			return createImage();
		case SvgPackage.LINE:
			return createLine();
		case SvgPackage.PATH:
			return createPath();
		case SvgPackage.POLYGON:
			return createPolygon();
		case SvgPackage.POLYLINE:
			return createPolyline();
		case SvgPackage.RECT:
			return createRect();
		case SvgPackage.TEXT:
			return createText();
		case SvgPackage.FILL:
			return createFill();
		case SvgPackage.STROKE:
			return createStroke();
		case SvgPackage.STROKE_WIDTH:
			return createStrokeWidth();
		case SvgPackage.STROKE_DASH_ARRAY:
			return createStrokeDashArray();
		case SvgPackage.STROKE_DASH_OFFSET:
			return createStrokeDashOffset();
		case SvgPackage.CLIP_PATH_ATTRIBUTE:
			return createClipPathAttribute();
		case SvgPackage.FONT_FAMILY:
			return createFontFamily();
		case SvgPackage.FONT_SIZE:
			return createFontSize();
		case SvgPackage.TRANSFORM:
			return createTransform();
		case SvgPackage.LENGTH:
			return createLength();
		case SvgPackage.COORDINATE:
			return createCoordinate();
		case SvgPackage.PRESERVE_ASPECT_RATIO:
			return createPreserveAspectRatio();
		case SvgPackage.VIEW_BOX:
			return createViewBox();
		case SvgPackage.POINT:
			return createPoint();
		case SvgPackage.LOCAL_IRI:
			return createLocalIri();
		case SvgPackage.BASE64_REF:
			return createBase64Ref();
		case SvgPackage.IRI_PAINT:
			return createIriPaint();
		case SvgPackage.NONE_PAINT:
			return createNonePaint();
		case SvgPackage.HEX_COLOR:
			return createHexColor();
		case SvgPackage.RGB_COLOR:
			return createRgbColor();
		case SvgPackage.RGB_PERCENTAGE:
			return createRgbPercentage();
		case SvgPackage.KEYWORD_COLOR:
			return createKeywordColor();
		case SvgPackage.ABSOLUTE_MOVE_TO:
			return createAbsoluteMoveTo();
		case SvgPackage.RELATIVE_MOVE_TO:
			return createRelativeMoveTo();
		case SvgPackage.ABSOLUTE_LINE_TO:
			return createAbsoluteLineTo();
		case SvgPackage.RELATIVE_LINE_TO:
			return createRelativeLineTo();
		case SvgPackage.ABSOLUTE_HORIZONTAL_LINE_TO:
			return createAbsoluteHorizontalLineTo();
		case SvgPackage.RELATIVE_HORIZONTAL_LINE_TO:
			return createRelativeHorizontalLineTo();
		case SvgPackage.ABSOLUTE_VERTICAL_LINE_TO:
			return createAbsoluteVerticalLineTo();
		case SvgPackage.RELATIVE_VERTICAL_LINE_TO:
			return createRelativeVerticalLineTo();
		case SvgPackage.ABSOLUTE_QUADRATIC_CURVE_TO:
			return createAbsoluteQuadraticCurveTo();
		case SvgPackage.RELATIVE_QUADRATIC_CURVE_TO:
			return createRelativeQuadraticCurveTo();
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO:
			return createAbsoluteCubicCurveTo();
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO:
			return createRelativeCubicCurveTo();
		case SvgPackage.ABSOLUTE_SMOOTH_QUADRATIC_CURVE_TO:
			return createAbsoluteSmoothQuadraticCurveTo();
		case SvgPackage.RELATIVE_SMOOTH_QUADRATIC_CURVE_TO:
			return createRelativeSmoothQuadraticCurveTo();
		case SvgPackage.ABSOLUTE_SMOOTH_CUBIC_CURVE_TO:
			return createAbsoluteSmoothCubicCurveTo();
		case SvgPackage.RELATIVE_SMOOTH_CUBIC_CURVE_TO:
			return createRelativeSmoothCubicCurveTo();
		case SvgPackage.CLOSE_PATH:
			return createClosePath();
		case SvgPackage.MATRIX:
			return createMatrix();
		case SvgPackage.TRANSLATE:
			return createTranslate();
		case SvgPackage.SCALE:
			return createScale();
		case SvgPackage.ROTATE:
			return createRotate();
		case SvgPackage.SKEW_X:
			return createSkewX();
		case SvgPackage.SKEW_Y:
			return createSkewY();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case SvgPackage.UNIT:
			return createUnitFromString(eDataType, initialValue);
		case SvgPackage.ALIGN:
			return createAlignFromString(eDataType, initialValue);
		case SvgPackage.MEET_OR_SLICE:
			return createMeetOrSliceFromString(eDataType, initialValue);
		case SvgPackage.COLOR_KEYWORD:
			return createColorKeywordFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case SvgPackage.UNIT:
			return convertUnitToString(eDataType, instanceValue);
		case SvgPackage.ALIGN:
			return convertAlignToString(eDataType, instanceValue);
		case SvgPackage.MEET_OR_SLICE:
			return convertMeetOrSliceToString(eDataType, instanceValue);
		case SvgPackage.COLOR_KEYWORD:
			return convertColorKeywordToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Use createUse() {
		UseImpl use = new UseImpl();
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClipPath createClipPath() {
		ClipPathImpl clipPath = new ClipPathImpl();
		return clipPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Svg createSvg() {
		SvgImpl svg = new SvgImpl();
		return svg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Defs createDefs() {
		DefsImpl defs = new DefsImpl();
		return defs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol createSymbol() {
		SymbolImpl symbol = new SymbolImpl();
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Circle createCircle() {
		CircleImpl circle = new CircleImpl();
		return circle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ellipse createEllipse() {
		EllipseImpl ellipse = new EllipseImpl();
		return ellipse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Path createPath() {
		PathImpl path = new PathImpl();
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polygon createPolygon() {
		PolygonImpl polygon = new PolygonImpl();
		return polygon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polyline createPolyline() {
		PolylineImpl polyline = new PolylineImpl();
		return polyline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rect createRect() {
		RectImpl rect = new RectImpl();
		return rect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fill createFill() {
		FillImpl fill = new FillImpl();
		return fill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stroke createStroke() {
		StrokeImpl stroke = new StrokeImpl();
		return stroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrokeWidth createStrokeWidth() {
		StrokeWidthImpl strokeWidth = new StrokeWidthImpl();
		return strokeWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrokeDashArray createStrokeDashArray() {
		StrokeDashArrayImpl strokeDashArray = new StrokeDashArrayImpl();
		return strokeDashArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrokeDashOffset createStrokeDashOffset() {
		StrokeDashOffsetImpl strokeDashOffset = new StrokeDashOffsetImpl();
		return strokeDashOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClipPathAttribute createClipPathAttribute() {
		ClipPathAttributeImpl clipPathAttribute = new ClipPathAttributeImpl();
		return clipPathAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFamily createFontFamily() {
		FontFamilyImpl fontFamily = new FontFamilyImpl();
		return fontFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontSize createFontSize() {
		FontSizeImpl fontSize = new FontSizeImpl();
		return fontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transform createTransform() {
		TransformImpl transform = new TransformImpl();
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length createLength() {
		LengthImpl length = new LengthImpl();
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinate createCoordinate() {
		CoordinateImpl coordinate = new CoordinateImpl();
		return coordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreserveAspectRatio createPreserveAspectRatio() {
		PreserveAspectRatioImpl preserveAspectRatio = new PreserveAspectRatioImpl();
		return preserveAspectRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewBox createViewBox() {
		ViewBoxImpl viewBox = new ViewBoxImpl();
		return viewBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalIri createLocalIri() {
		LocalIriImpl localIri = new LocalIriImpl();
		return localIri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Ref createBase64Ref() {
		Base64RefImpl base64Ref = new Base64RefImpl();
		return base64Ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IriPaint createIriPaint() {
		IriPaintImpl iriPaint = new IriPaintImpl();
		return iriPaint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonePaint createNonePaint() {
		NonePaintImpl nonePaint = new NonePaintImpl();
		return nonePaint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HexColor createHexColor() {
		HexColorImpl hexColor = new HexColorImpl();
		return hexColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RgbColor createRgbColor() {
		RgbColorImpl rgbColor = new RgbColorImpl();
		return rgbColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RgbPercentage createRgbPercentage() {
		RgbPercentageImpl rgbPercentage = new RgbPercentageImpl();
		return rgbPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeywordColor createKeywordColor() {
		KeywordColorImpl keywordColor = new KeywordColorImpl();
		return keywordColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsoluteMoveTo createAbsoluteMoveTo() {
		AbsoluteMoveToImpl absoluteMoveTo = new AbsoluteMoveToImpl();
		return absoluteMoveTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeMoveTo createRelativeMoveTo() {
		RelativeMoveToImpl relativeMoveTo = new RelativeMoveToImpl();
		return relativeMoveTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsoluteLineTo createAbsoluteLineTo() {
		AbsoluteLineToImpl absoluteLineTo = new AbsoluteLineToImpl();
		return absoluteLineTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeLineTo createRelativeLineTo() {
		RelativeLineToImpl relativeLineTo = new RelativeLineToImpl();
		return relativeLineTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsoluteHorizontalLineTo createAbsoluteHorizontalLineTo() {
		AbsoluteHorizontalLineToImpl absoluteHorizontalLineTo = new AbsoluteHorizontalLineToImpl();
		return absoluteHorizontalLineTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeHorizontalLineTo createRelativeHorizontalLineTo() {
		RelativeHorizontalLineToImpl relativeHorizontalLineTo = new RelativeHorizontalLineToImpl();
		return relativeHorizontalLineTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsoluteVerticalLineTo createAbsoluteVerticalLineTo() {
		AbsoluteVerticalLineToImpl absoluteVerticalLineTo = new AbsoluteVerticalLineToImpl();
		return absoluteVerticalLineTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeVerticalLineTo createRelativeVerticalLineTo() {
		RelativeVerticalLineToImpl relativeVerticalLineTo = new RelativeVerticalLineToImpl();
		return relativeVerticalLineTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsoluteQuadraticCurveTo createAbsoluteQuadraticCurveTo() {
		AbsoluteQuadraticCurveToImpl absoluteQuadraticCurveTo = new AbsoluteQuadraticCurveToImpl();
		return absoluteQuadraticCurveTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeQuadraticCurveTo createRelativeQuadraticCurveTo() {
		RelativeQuadraticCurveToImpl relativeQuadraticCurveTo = new RelativeQuadraticCurveToImpl();
		return relativeQuadraticCurveTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsoluteCubicCurveTo createAbsoluteCubicCurveTo() {
		AbsoluteCubicCurveToImpl absoluteCubicCurveTo = new AbsoluteCubicCurveToImpl();
		return absoluteCubicCurveTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeCubicCurveTo createRelativeCubicCurveTo() {
		RelativeCubicCurveToImpl relativeCubicCurveTo = new RelativeCubicCurveToImpl();
		return relativeCubicCurveTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsoluteSmoothQuadraticCurveTo createAbsoluteSmoothQuadraticCurveTo() {
		AbsoluteSmoothQuadraticCurveToImpl absoluteSmoothQuadraticCurveTo = new AbsoluteSmoothQuadraticCurveToImpl();
		return absoluteSmoothQuadraticCurveTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeSmoothQuadraticCurveTo createRelativeSmoothQuadraticCurveTo() {
		RelativeSmoothQuadraticCurveToImpl relativeSmoothQuadraticCurveTo = new RelativeSmoothQuadraticCurveToImpl();
		return relativeSmoothQuadraticCurveTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsoluteSmoothCubicCurveTo createAbsoluteSmoothCubicCurveTo() {
		AbsoluteSmoothCubicCurveToImpl absoluteSmoothCubicCurveTo = new AbsoluteSmoothCubicCurveToImpl();
		return absoluteSmoothCubicCurveTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeSmoothCubicCurveTo createRelativeSmoothCubicCurveTo() {
		RelativeSmoothCubicCurveToImpl relativeSmoothCubicCurveTo = new RelativeSmoothCubicCurveToImpl();
		return relativeSmoothCubicCurveTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosePath createClosePath() {
		ClosePathImpl closePath = new ClosePathImpl();
		return closePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix createMatrix() {
		MatrixImpl matrix = new MatrixImpl();
		return matrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Translate createTranslate() {
		TranslateImpl translate = new TranslateImpl();
		return translate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scale createScale() {
		ScaleImpl scale = new ScaleImpl();
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rotate createRotate() {
		RotateImpl rotate = new RotateImpl();
		return rotate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkewX createSkewX() {
		SkewXImpl skewX = new SkewXImpl();
		return skewX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkewY createSkewY() {
		SkewYImpl skewY = new SkewYImpl();
		return skewY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnitFromString(EDataType eDataType, String initialValue) {
		Unit result = Unit.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Align createAlignFromString(EDataType eDataType, String initialValue) {
		Align result = Align.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeetOrSlice createMeetOrSliceFromString(EDataType eDataType, String initialValue) {
		MeetOrSlice result = MeetOrSlice.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeetOrSliceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorKeyword createColorKeywordFromString(EDataType eDataType, String initialValue) {
		ColorKeyword result = ColorKeyword.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorKeywordToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvgPackage getSvgPackage() {
		return (SvgPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SvgPackage getPackage() {
		return SvgPackage.eINSTANCE;
	}

} //SvgFactoryImpl
