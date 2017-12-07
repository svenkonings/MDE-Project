/**
 */
package svg;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see svg.SvgPackage
 * @generated
 */
public interface SvgFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SvgFactory eINSTANCE = svg.impl.SvgFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use</em>'.
	 * @generated
	 */
	Use createUse();

	/**
	 * Returns a new object of class '<em>Clip Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clip Path</em>'.
	 * @generated
	 */
	ClipPath createClipPath();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	Group createGroup();

	/**
	 * Returns a new object of class '<em>Svg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Svg</em>'.
	 * @generated
	 */
	Svg createSvg();

	/**
	 * Returns a new object of class '<em>Defs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Defs</em>'.
	 * @generated
	 */
	Defs createDefs();

	/**
	 * Returns a new object of class '<em>Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symbol</em>'.
	 * @generated
	 */
	Symbol createSymbol();

	/**
	 * Returns a new object of class '<em>Circle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circle</em>'.
	 * @generated
	 */
	Circle createCircle();

	/**
	 * Returns a new object of class '<em>Ellipse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ellipse</em>'.
	 * @generated
	 */
	Ellipse createEllipse();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	Image createImage();

	/**
	 * Returns a new object of class '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line</em>'.
	 * @generated
	 */
	Line createLine();

	/**
	 * Returns a new object of class '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path</em>'.
	 * @generated
	 */
	Path createPath();

	/**
	 * Returns a new object of class '<em>Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polygon</em>'.
	 * @generated
	 */
	Polygon createPolygon();

	/**
	 * Returns a new object of class '<em>Polyline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polyline</em>'.
	 * @generated
	 */
	Polyline createPolyline();

	/**
	 * Returns a new object of class '<em>Rect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rect</em>'.
	 * @generated
	 */
	Rect createRect();

	/**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
	Text createText();

	/**
	 * Returns a new object of class '<em>Fill</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fill</em>'.
	 * @generated
	 */
	Fill createFill();

	/**
	 * Returns a new object of class '<em>Stroke</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stroke</em>'.
	 * @generated
	 */
	Stroke createStroke();

	/**
	 * Returns a new object of class '<em>Stroke Width</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stroke Width</em>'.
	 * @generated
	 */
	StrokeWidth createStrokeWidth();

	/**
	 * Returns a new object of class '<em>Stroke Dash Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stroke Dash Array</em>'.
	 * @generated
	 */
	StrokeDashArray createStrokeDashArray();

	/**
	 * Returns a new object of class '<em>Stroke Dash Offset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stroke Dash Offset</em>'.
	 * @generated
	 */
	StrokeDashOffset createStrokeDashOffset();

	/**
	 * Returns a new object of class '<em>Clip Path Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clip Path Attribute</em>'.
	 * @generated
	 */
	ClipPathAttribute createClipPathAttribute();

	/**
	 * Returns a new object of class '<em>Font Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Font Family</em>'.
	 * @generated
	 */
	FontFamily createFontFamily();

	/**
	 * Returns a new object of class '<em>Font Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Font Size</em>'.
	 * @generated
	 */
	FontSize createFontSize();

	/**
	 * Returns a new object of class '<em>Transform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transform</em>'.
	 * @generated
	 */
	Transform createTransform();

	/**
	 * Returns a new object of class '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length</em>'.
	 * @generated
	 */
	Length createLength();

	/**
	 * Returns a new object of class '<em>Coordinate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinate</em>'.
	 * @generated
	 */
	Coordinate createCoordinate();

	/**
	 * Returns a new object of class '<em>Preserve Aspect Ratio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preserve Aspect Ratio</em>'.
	 * @generated
	 */
	PreserveAspectRatio createPreserveAspectRatio();

	/**
	 * Returns a new object of class '<em>View Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Box</em>'.
	 * @generated
	 */
	ViewBox createViewBox();

	/**
	 * Returns a new object of class '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point</em>'.
	 * @generated
	 */
	Point createPoint();

	/**
	 * Returns a new object of class '<em>Local Iri</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Iri</em>'.
	 * @generated
	 */
	LocalIri createLocalIri();

	/**
	 * Returns a new object of class '<em>Base64 Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base64 Ref</em>'.
	 * @generated
	 */
	Base64Ref createBase64Ref();

	/**
	 * Returns a new object of class '<em>Iri Paint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iri Paint</em>'.
	 * @generated
	 */
	IriPaint createIriPaint();

	/**
	 * Returns a new object of class '<em>None Paint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>None Paint</em>'.
	 * @generated
	 */
	NonePaint createNonePaint();

	/**
	 * Returns a new object of class '<em>Hex Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hex Color</em>'.
	 * @generated
	 */
	HexColor createHexColor();

	/**
	 * Returns a new object of class '<em>Rgb Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rgb Color</em>'.
	 * @generated
	 */
	RgbColor createRgbColor();

	/**
	 * Returns a new object of class '<em>Rgb Percentage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rgb Percentage</em>'.
	 * @generated
	 */
	RgbPercentage createRgbPercentage();

	/**
	 * Returns a new object of class '<em>Keyword Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keyword Color</em>'.
	 * @generated
	 */
	KeywordColor createKeywordColor();

	/**
	 * Returns a new object of class '<em>Absolute Move To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Absolute Move To</em>'.
	 * @generated
	 */
	AbsoluteMoveTo createAbsoluteMoveTo();

	/**
	 * Returns a new object of class '<em>Relative Move To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relative Move To</em>'.
	 * @generated
	 */
	RelativeMoveTo createRelativeMoveTo();

	/**
	 * Returns a new object of class '<em>Absolute Line To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Absolute Line To</em>'.
	 * @generated
	 */
	AbsoluteLineTo createAbsoluteLineTo();

	/**
	 * Returns a new object of class '<em>Relative Line To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relative Line To</em>'.
	 * @generated
	 */
	RelativeLineTo createRelativeLineTo();

	/**
	 * Returns a new object of class '<em>Absolute Horizontal Line To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Absolute Horizontal Line To</em>'.
	 * @generated
	 */
	AbsoluteHorizontalLineTo createAbsoluteHorizontalLineTo();

	/**
	 * Returns a new object of class '<em>Relative Horizontal Line To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relative Horizontal Line To</em>'.
	 * @generated
	 */
	RelativeHorizontalLineTo createRelativeHorizontalLineTo();

	/**
	 * Returns a new object of class '<em>Absolute Vertical Line To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Absolute Vertical Line To</em>'.
	 * @generated
	 */
	AbsoluteVerticalLineTo createAbsoluteVerticalLineTo();

	/**
	 * Returns a new object of class '<em>Relative Vertical Line To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relative Vertical Line To</em>'.
	 * @generated
	 */
	RelativeVerticalLineTo createRelativeVerticalLineTo();

	/**
	 * Returns a new object of class '<em>Absolute Quadratic Curve To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Absolute Quadratic Curve To</em>'.
	 * @generated
	 */
	AbsoluteQuadraticCurveTo createAbsoluteQuadraticCurveTo();

	/**
	 * Returns a new object of class '<em>Relative Quadratic Curve To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relative Quadratic Curve To</em>'.
	 * @generated
	 */
	RelativeQuadraticCurveTo createRelativeQuadraticCurveTo();

	/**
	 * Returns a new object of class '<em>Absolute Cubic Curve To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Absolute Cubic Curve To</em>'.
	 * @generated
	 */
	AbsoluteCubicCurveTo createAbsoluteCubicCurveTo();

	/**
	 * Returns a new object of class '<em>Relative Cubic Curve To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relative Cubic Curve To</em>'.
	 * @generated
	 */
	RelativeCubicCurveTo createRelativeCubicCurveTo();

	/**
	 * Returns a new object of class '<em>Absolute Smooth Quadratic Curve To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Absolute Smooth Quadratic Curve To</em>'.
	 * @generated
	 */
	AbsoluteSmoothQuadraticCurveTo createAbsoluteSmoothQuadraticCurveTo();

	/**
	 * Returns a new object of class '<em>Relative Smooth Quadratic Curve To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relative Smooth Quadratic Curve To</em>'.
	 * @generated
	 */
	RelativeSmoothQuadraticCurveTo createRelativeSmoothQuadraticCurveTo();

	/**
	 * Returns a new object of class '<em>Absolute Smooth Cubic Curve To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Absolute Smooth Cubic Curve To</em>'.
	 * @generated
	 */
	AbsoluteSmoothCubicCurveTo createAbsoluteSmoothCubicCurveTo();

	/**
	 * Returns a new object of class '<em>Relative Smooth Cubic Curve To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relative Smooth Cubic Curve To</em>'.
	 * @generated
	 */
	RelativeSmoothCubicCurveTo createRelativeSmoothCubicCurveTo();

	/**
	 * Returns a new object of class '<em>Close Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Close Path</em>'.
	 * @generated
	 */
	ClosePath createClosePath();

	/**
	 * Returns a new object of class '<em>Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matrix</em>'.
	 * @generated
	 */
	Matrix createMatrix();

	/**
	 * Returns a new object of class '<em>Translate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Translate</em>'.
	 * @generated
	 */
	Translate createTranslate();

	/**
	 * Returns a new object of class '<em>Scale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scale</em>'.
	 * @generated
	 */
	Scale createScale();

	/**
	 * Returns a new object of class '<em>Rotate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rotate</em>'.
	 * @generated
	 */
	Rotate createRotate();

	/**
	 * Returns a new object of class '<em>Skew X</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skew X</em>'.
	 * @generated
	 */
	SkewX createSkewX();

	/**
	 * Returns a new object of class '<em>Skew Y</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skew Y</em>'.
	 * @generated
	 */
	SkewY createSkewY();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SvgPackage getSvgPackage();

} //SvgFactory
