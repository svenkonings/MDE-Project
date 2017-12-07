/**
 */
package svg.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import svg.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see svg.SvgPackage
 * @generated
 */
public class SvgSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SvgPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvgSwitch() {
		if (modelPackage == null) {
			modelPackage = SvgPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case SvgPackage.ELEMENT: {
			Element element = (Element) theEObject;
			T result = caseElement(element);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.STRUCTURAL_ELEMENT: {
			StructuralElement structuralElement = (StructuralElement) theEObject;
			T result = caseStructuralElement(structuralElement);
			if (result == null)
				result = caseElement(structuralElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.USE: {
			Use use = (Use) theEObject;
			T result = caseUse(use);
			if (result == null)
				result = caseStructuralElement(use);
			if (result == null)
				result = caseElement(use);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.CLIP_PATH: {
			ClipPath clipPath = (ClipPath) theEObject;
			T result = caseClipPath(clipPath);
			if (result == null)
				result = caseStructuralElement(clipPath);
			if (result == null)
				result = caseElement(clipPath);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.CONTAINER_ELEMENT: {
			ContainerElement containerElement = (ContainerElement) theEObject;
			T result = caseContainerElement(containerElement);
			if (result == null)
				result = caseStructuralElement(containerElement);
			if (result == null)
				result = caseElement(containerElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.GROUP: {
			Group group = (Group) theEObject;
			T result = caseGroup(group);
			if (result == null)
				result = caseContainerElement(group);
			if (result == null)
				result = caseStructuralElement(group);
			if (result == null)
				result = caseElement(group);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.SVG: {
			Svg svg = (Svg) theEObject;
			T result = caseSvg(svg);
			if (result == null)
				result = caseGroup(svg);
			if (result == null)
				result = caseContainerElement(svg);
			if (result == null)
				result = caseStructuralElement(svg);
			if (result == null)
				result = caseElement(svg);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.DEFS: {
			Defs defs = (Defs) theEObject;
			T result = caseDefs(defs);
			if (result == null)
				result = caseContainerElement(defs);
			if (result == null)
				result = caseStructuralElement(defs);
			if (result == null)
				result = caseElement(defs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.SYMBOL: {
			Symbol symbol = (Symbol) theEObject;
			T result = caseSymbol(symbol);
			if (result == null)
				result = caseDefs(symbol);
			if (result == null)
				result = caseContainerElement(symbol);
			if (result == null)
				result = caseStructuralElement(symbol);
			if (result == null)
				result = caseElement(symbol);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.GRAPHIC_ELEMENT: {
			GraphicElement graphicElement = (GraphicElement) theEObject;
			T result = caseGraphicElement(graphicElement);
			if (result == null)
				result = caseElement(graphicElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.CIRCLE: {
			Circle circle = (Circle) theEObject;
			T result = caseCircle(circle);
			if (result == null)
				result = caseGraphicElement(circle);
			if (result == null)
				result = caseElement(circle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.ELLIPSE: {
			Ellipse ellipse = (Ellipse) theEObject;
			T result = caseEllipse(ellipse);
			if (result == null)
				result = caseGraphicElement(ellipse);
			if (result == null)
				result = caseElement(ellipse);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.IMAGE: {
			Image image = (Image) theEObject;
			T result = caseImage(image);
			if (result == null)
				result = caseGraphicElement(image);
			if (result == null)
				result = caseElement(image);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.LINE: {
			Line line = (Line) theEObject;
			T result = caseLine(line);
			if (result == null)
				result = caseGraphicElement(line);
			if (result == null)
				result = caseElement(line);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.PATH: {
			Path path = (Path) theEObject;
			T result = casePath(path);
			if (result == null)
				result = caseGraphicElement(path);
			if (result == null)
				result = caseElement(path);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.POLYGON: {
			Polygon polygon = (Polygon) theEObject;
			T result = casePolygon(polygon);
			if (result == null)
				result = caseGraphicElement(polygon);
			if (result == null)
				result = caseElement(polygon);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.POLYLINE: {
			Polyline polyline = (Polyline) theEObject;
			T result = casePolyline(polyline);
			if (result == null)
				result = caseGraphicElement(polyline);
			if (result == null)
				result = caseElement(polyline);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.RECT: {
			Rect rect = (Rect) theEObject;
			T result = caseRect(rect);
			if (result == null)
				result = caseGraphicElement(rect);
			if (result == null)
				result = caseElement(rect);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.TEXT: {
			Text text = (Text) theEObject;
			T result = caseText(text);
			if (result == null)
				result = caseGraphicElement(text);
			if (result == null)
				result = caseElement(text);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.ATTRIBUTE: {
			Attribute attribute = (Attribute) theEObject;
			T result = caseAttribute(attribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.FILL: {
			Fill fill = (Fill) theEObject;
			T result = caseFill(fill);
			if (result == null)
				result = caseAttribute(fill);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.STROKE: {
			Stroke stroke = (Stroke) theEObject;
			T result = caseStroke(stroke);
			if (result == null)
				result = caseAttribute(stroke);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.STROKE_WIDTH: {
			StrokeWidth strokeWidth = (StrokeWidth) theEObject;
			T result = caseStrokeWidth(strokeWidth);
			if (result == null)
				result = caseAttribute(strokeWidth);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.STROKE_DASH_ARRAY: {
			StrokeDashArray strokeDashArray = (StrokeDashArray) theEObject;
			T result = caseStrokeDashArray(strokeDashArray);
			if (result == null)
				result = caseAttribute(strokeDashArray);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.STROKE_DASH_OFFSET: {
			StrokeDashOffset strokeDashOffset = (StrokeDashOffset) theEObject;
			T result = caseStrokeDashOffset(strokeDashOffset);
			if (result == null)
				result = caseAttribute(strokeDashOffset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.CLIP_PATH_ATTRIBUTE: {
			ClipPathAttribute clipPathAttribute = (ClipPathAttribute) theEObject;
			T result = caseClipPathAttribute(clipPathAttribute);
			if (result == null)
				result = caseAttribute(clipPathAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.FONT_FAMILY: {
			FontFamily fontFamily = (FontFamily) theEObject;
			T result = caseFontFamily(fontFamily);
			if (result == null)
				result = caseAttribute(fontFamily);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.FONT_SIZE: {
			FontSize fontSize = (FontSize) theEObject;
			T result = caseFontSize(fontSize);
			if (result == null)
				result = caseAttribute(fontSize);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.TRANSFORM: {
			Transform transform = (Transform) theEObject;
			T result = caseTransform(transform);
			if (result == null)
				result = caseAttribute(transform);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.ATTRIBUTE_TYPE: {
			AttributeType attributeType = (AttributeType) theEObject;
			T result = caseAttributeType(attributeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.LENGTH: {
			Length length = (Length) theEObject;
			T result = caseLength(length);
			if (result == null)
				result = caseAttributeType(length);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.COORDINATE: {
			Coordinate coordinate = (Coordinate) theEObject;
			T result = caseCoordinate(coordinate);
			if (result == null)
				result = caseAttributeType(coordinate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.PRESERVE_ASPECT_RATIO: {
			PreserveAspectRatio preserveAspectRatio = (PreserveAspectRatio) theEObject;
			T result = casePreserveAspectRatio(preserveAspectRatio);
			if (result == null)
				result = caseAttributeType(preserveAspectRatio);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.VIEW_BOX: {
			ViewBox viewBox = (ViewBox) theEObject;
			T result = caseViewBox(viewBox);
			if (result == null)
				result = caseAttributeType(viewBox);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.POINT: {
			Point point = (Point) theEObject;
			T result = casePoint(point);
			if (result == null)
				result = caseAttributeType(point);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.HREF: {
			Href href = (Href) theEObject;
			T result = caseHref(href);
			if (result == null)
				result = caseAttributeType(href);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.LOCAL_IRI: {
			LocalIri localIri = (LocalIri) theEObject;
			T result = caseLocalIri(localIri);
			if (result == null)
				result = caseHref(localIri);
			if (result == null)
				result = caseAttributeType(localIri);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.BASE64_REF: {
			Base64Ref base64Ref = (Base64Ref) theEObject;
			T result = caseBase64Ref(base64Ref);
			if (result == null)
				result = caseHref(base64Ref);
			if (result == null)
				result = caseAttributeType(base64Ref);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.PAINT: {
			Paint paint = (Paint) theEObject;
			T result = casePaint(paint);
			if (result == null)
				result = caseAttributeType(paint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.IRI_PAINT: {
			IriPaint iriPaint = (IriPaint) theEObject;
			T result = caseIriPaint(iriPaint);
			if (result == null)
				result = casePaint(iriPaint);
			if (result == null)
				result = caseAttributeType(iriPaint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.NONE_PAINT: {
			NonePaint nonePaint = (NonePaint) theEObject;
			T result = caseNonePaint(nonePaint);
			if (result == null)
				result = casePaint(nonePaint);
			if (result == null)
				result = caseAttributeType(nonePaint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.COLOR: {
			Color color = (Color) theEObject;
			T result = caseColor(color);
			if (result == null)
				result = casePaint(color);
			if (result == null)
				result = caseAttributeType(color);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.HEX_COLOR: {
			HexColor hexColor = (HexColor) theEObject;
			T result = caseHexColor(hexColor);
			if (result == null)
				result = caseColor(hexColor);
			if (result == null)
				result = casePaint(hexColor);
			if (result == null)
				result = caseAttributeType(hexColor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.RGB_COLOR: {
			RgbColor rgbColor = (RgbColor) theEObject;
			T result = caseRgbColor(rgbColor);
			if (result == null)
				result = caseColor(rgbColor);
			if (result == null)
				result = casePaint(rgbColor);
			if (result == null)
				result = caseAttributeType(rgbColor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.RGB_PERCENTAGE: {
			RgbPercentage rgbPercentage = (RgbPercentage) theEObject;
			T result = caseRgbPercentage(rgbPercentage);
			if (result == null)
				result = caseColor(rgbPercentage);
			if (result == null)
				result = casePaint(rgbPercentage);
			if (result == null)
				result = caseAttributeType(rgbPercentage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.KEYWORD_COLOR: {
			KeywordColor keywordColor = (KeywordColor) theEObject;
			T result = caseKeywordColor(keywordColor);
			if (result == null)
				result = caseColor(keywordColor);
			if (result == null)
				result = casePaint(keywordColor);
			if (result == null)
				result = caseAttributeType(keywordColor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.PATH_VALUE: {
			PathValue pathValue = (PathValue) theEObject;
			T result = casePathValue(pathValue);
			if (result == null)
				result = caseAttributeType(pathValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.ABSOLUTE_MOVE_TO: {
			AbsoluteMoveTo absoluteMoveTo = (AbsoluteMoveTo) theEObject;
			T result = caseAbsoluteMoveTo(absoluteMoveTo);
			if (result == null)
				result = casePathValue(absoluteMoveTo);
			if (result == null)
				result = caseAttributeType(absoluteMoveTo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.RELATIVE_MOVE_TO: {
			RelativeMoveTo relativeMoveTo = (RelativeMoveTo) theEObject;
			T result = caseRelativeMoveTo(relativeMoveTo);
			if (result == null)
				result = casePathValue(relativeMoveTo);
			if (result == null)
				result = caseAttributeType(relativeMoveTo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.ABSOLUTE_LINE_TO: {
			AbsoluteLineTo absoluteLineTo = (AbsoluteLineTo) theEObject;
			T result = caseAbsoluteLineTo(absoluteLineTo);
			if (result == null)
				result = casePathValue(absoluteLineTo);
			if (result == null)
				result = caseAttributeType(absoluteLineTo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.RELATIVE_LINE_TO: {
			RelativeLineTo relativeLineTo = (RelativeLineTo) theEObject;
			T result = caseRelativeLineTo(relativeLineTo);
			if (result == null)
				result = casePathValue(relativeLineTo);
			if (result == null)
				result = caseAttributeType(relativeLineTo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.ABSOLUTE_HORIZONTAL_LINE_TO: {
			AbsoluteHorizontalLineTo absoluteHorizontalLineTo = (AbsoluteHorizontalLineTo) theEObject;
			T result = caseAbsoluteHorizontalLineTo(absoluteHorizontalLineTo);
			if (result == null)
				result = casePathValue(absoluteHorizontalLineTo);
			if (result == null)
				result = caseAttributeType(absoluteHorizontalLineTo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.RELATIVE_HORIZONTAL_LINE_TO: {
			RelativeHorizontalLineTo relativeHorizontalLineTo = (RelativeHorizontalLineTo) theEObject;
			T result = caseRelativeHorizontalLineTo(relativeHorizontalLineTo);
			if (result == null)
				result = casePathValue(relativeHorizontalLineTo);
			if (result == null)
				result = caseAttributeType(relativeHorizontalLineTo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.ABSOLUTE_VERTICAL_LINE_TO: {
			AbsoluteVerticalLineTo absoluteVerticalLineTo = (AbsoluteVerticalLineTo) theEObject;
			T result = caseAbsoluteVerticalLineTo(absoluteVerticalLineTo);
			if (result == null)
				result = casePathValue(absoluteVerticalLineTo);
			if (result == null)
				result = caseAttributeType(absoluteVerticalLineTo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.RELATIVE_VERTICAL_LINE_TO: {
			RelativeVerticalLineTo relativeVerticalLineTo = (RelativeVerticalLineTo) theEObject;
			T result = caseRelativeVerticalLineTo(relativeVerticalLineTo);
			if (result == null)
				result = casePathValue(relativeVerticalLineTo);
			if (result == null)
				result = caseAttributeType(relativeVerticalLineTo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.ABSOLUTE_QUADRATIC_CURVE_TO: {
			AbsoluteQuadraticCurveTo absoluteQuadraticCurveTo = (AbsoluteQuadraticCurveTo) theEObject;
			T result = caseAbsoluteQuadraticCurveTo(absoluteQuadraticCurveTo);
			if (result == null)
				result = casePathValue(absoluteQuadraticCurveTo);
			if (result == null)
				result = caseAttributeType(absoluteQuadraticCurveTo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.RELATIVE_QUADRATIC_CURVE_TO: {
			RelativeQuadraticCurveTo relativeQuadraticCurveTo = (RelativeQuadraticCurveTo) theEObject;
			T result = caseRelativeQuadraticCurveTo(relativeQuadraticCurveTo);
			if (result == null)
				result = casePathValue(relativeQuadraticCurveTo);
			if (result == null)
				result = caseAttributeType(relativeQuadraticCurveTo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.ABSOLUTE_CUBIC_CURVE_TO: {
			AbsoluteCubicCurveTo absoluteCubicCurveTo = (AbsoluteCubicCurveTo) theEObject;
			T result = caseAbsoluteCubicCurveTo(absoluteCubicCurveTo);
			if (result == null)
				result = casePathValue(absoluteCubicCurveTo);
			if (result == null)
				result = caseAttributeType(absoluteCubicCurveTo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.RELATIVE_CUBIC_CURVE_TO: {
			RelativeCubicCurveTo relativeCubicCurveTo = (RelativeCubicCurveTo) theEObject;
			T result = caseRelativeCubicCurveTo(relativeCubicCurveTo);
			if (result == null)
				result = casePathValue(relativeCubicCurveTo);
			if (result == null)
				result = caseAttributeType(relativeCubicCurveTo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.ABSOLUTE_SMOOTH_QUADRATIC_CURVE_TO: {
			AbsoluteSmoothQuadraticCurveTo absoluteSmoothQuadraticCurveTo = (AbsoluteSmoothQuadraticCurveTo) theEObject;
			T result = caseAbsoluteSmoothQuadraticCurveTo(absoluteSmoothQuadraticCurveTo);
			if (result == null)
				result = casePathValue(absoluteSmoothQuadraticCurveTo);
			if (result == null)
				result = caseAttributeType(absoluteSmoothQuadraticCurveTo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.RELATIVE_SMOOTH_QUADRATIC_CURVE_TO: {
			RelativeSmoothQuadraticCurveTo relativeSmoothQuadraticCurveTo = (RelativeSmoothQuadraticCurveTo) theEObject;
			T result = caseRelativeSmoothQuadraticCurveTo(relativeSmoothQuadraticCurveTo);
			if (result == null)
				result = casePathValue(relativeSmoothQuadraticCurveTo);
			if (result == null)
				result = caseAttributeType(relativeSmoothQuadraticCurveTo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.ABSOLUTE_SMOOTH_CUBIC_CURVE_TO: {
			AbsoluteSmoothCubicCurveTo absoluteSmoothCubicCurveTo = (AbsoluteSmoothCubicCurveTo) theEObject;
			T result = caseAbsoluteSmoothCubicCurveTo(absoluteSmoothCubicCurveTo);
			if (result == null)
				result = casePathValue(absoluteSmoothCubicCurveTo);
			if (result == null)
				result = caseAttributeType(absoluteSmoothCubicCurveTo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.RELATIVE_SMOOTH_CUBIC_CURVE_TO: {
			RelativeSmoothCubicCurveTo relativeSmoothCubicCurveTo = (RelativeSmoothCubicCurveTo) theEObject;
			T result = caseRelativeSmoothCubicCurveTo(relativeSmoothCubicCurveTo);
			if (result == null)
				result = casePathValue(relativeSmoothCubicCurveTo);
			if (result == null)
				result = caseAttributeType(relativeSmoothCubicCurveTo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.CLOSE_PATH: {
			ClosePath closePath = (ClosePath) theEObject;
			T result = caseClosePath(closePath);
			if (result == null)
				result = casePathValue(closePath);
			if (result == null)
				result = caseAttributeType(closePath);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.TRANSFORM_VALUE: {
			TransformValue transformValue = (TransformValue) theEObject;
			T result = caseTransformValue(transformValue);
			if (result == null)
				result = caseAttributeType(transformValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.MATRIX: {
			Matrix matrix = (Matrix) theEObject;
			T result = caseMatrix(matrix);
			if (result == null)
				result = caseTransformValue(matrix);
			if (result == null)
				result = caseAttributeType(matrix);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.TRANSLATE: {
			Translate translate = (Translate) theEObject;
			T result = caseTranslate(translate);
			if (result == null)
				result = caseTransformValue(translate);
			if (result == null)
				result = caseAttributeType(translate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.SCALE: {
			Scale scale = (Scale) theEObject;
			T result = caseScale(scale);
			if (result == null)
				result = caseTransformValue(scale);
			if (result == null)
				result = caseAttributeType(scale);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.ROTATE: {
			Rotate rotate = (Rotate) theEObject;
			T result = caseRotate(rotate);
			if (result == null)
				result = caseTransformValue(rotate);
			if (result == null)
				result = caseAttributeType(rotate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.SKEW_X: {
			SkewX skewX = (SkewX) theEObject;
			T result = caseSkewX(skewX);
			if (result == null)
				result = caseTransformValue(skewX);
			if (result == null)
				result = caseAttributeType(skewX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SvgPackage.SKEW_Y: {
			SkewY skewY = (SkewY) theEObject;
			T result = caseSkewY(skewY);
			if (result == null)
				result = caseTransformValue(skewY);
			if (result == null)
				result = caseAttributeType(skewY);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralElement(StructuralElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUse(Use object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clip Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clip Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClipPath(ClipPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerElement(ContainerElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Svg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Svg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSvg(Svg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Defs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Defs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefs(Defs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbol(Symbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphic Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphic Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicElement(GraphicElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircle(Circle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ellipse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ellipse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEllipse(Ellipse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine(Line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePath(Path object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygon(Polygon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polyline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polyline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolyline(Polyline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRect(Rect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fill</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fill</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFill(Fill object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stroke</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stroke</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStroke(Stroke object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stroke Width</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stroke Width</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrokeWidth(StrokeWidth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stroke Dash Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stroke Dash Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrokeDashArray(StrokeDashArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stroke Dash Offset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stroke Dash Offset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrokeDashOffset(StrokeDashOffset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clip Path Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clip Path Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClipPathAttribute(ClipPathAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font Family</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font Family</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFontFamily(FontFamily object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFontSize(FontSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransform(Transform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeType(AttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLength(Length object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinate(Coordinate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preserve Aspect Ratio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preserve Aspect Ratio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreserveAspectRatio(PreserveAspectRatio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewBox(ViewBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoint(Point object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Href</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Href</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHref(Href object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Iri</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Iri</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalIri(LocalIri object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base64 Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base64 Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBase64Ref(Base64Ref object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaint(Paint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iri Paint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iri Paint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIriPaint(IriPaint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>None Paint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>None Paint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonePaint(NonePaint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColor(Color object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hex Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hex Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHexColor(HexColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rgb Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rgb Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRgbColor(RgbColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rgb Percentage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rgb Percentage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRgbPercentage(RgbPercentage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keyword Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keyword Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeywordColor(KeywordColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathValue(PathValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absolute Move To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absolute Move To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsoluteMoveTo(AbsoluteMoveTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Move To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Move To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeMoveTo(RelativeMoveTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absolute Line To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absolute Line To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsoluteLineTo(AbsoluteLineTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Line To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Line To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeLineTo(RelativeLineTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absolute Horizontal Line To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absolute Horizontal Line To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsoluteHorizontalLineTo(AbsoluteHorizontalLineTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Horizontal Line To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Horizontal Line To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeHorizontalLineTo(RelativeHorizontalLineTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absolute Vertical Line To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absolute Vertical Line To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsoluteVerticalLineTo(AbsoluteVerticalLineTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Vertical Line To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Vertical Line To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeVerticalLineTo(RelativeVerticalLineTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absolute Quadratic Curve To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absolute Quadratic Curve To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsoluteQuadraticCurveTo(AbsoluteQuadraticCurveTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Quadratic Curve To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Quadratic Curve To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeQuadraticCurveTo(RelativeQuadraticCurveTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absolute Cubic Curve To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absolute Cubic Curve To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsoluteCubicCurveTo(AbsoluteCubicCurveTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Cubic Curve To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Cubic Curve To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeCubicCurveTo(RelativeCubicCurveTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absolute Smooth Quadratic Curve To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absolute Smooth Quadratic Curve To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsoluteSmoothQuadraticCurveTo(AbsoluteSmoothQuadraticCurveTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Smooth Quadratic Curve To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Smooth Quadratic Curve To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeSmoothQuadraticCurveTo(RelativeSmoothQuadraticCurveTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absolute Smooth Cubic Curve To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absolute Smooth Cubic Curve To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsoluteSmoothCubicCurveTo(AbsoluteSmoothCubicCurveTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Smooth Cubic Curve To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Smooth Cubic Curve To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeSmoothCubicCurveTo(RelativeSmoothCubicCurveTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Close Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Close Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClosePath(ClosePath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformValue(TransformValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matrix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatrix(Matrix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Translate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Translate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTranslate(Translate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScale(Scale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotate(Rotate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skew X</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skew X</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkewX(SkewX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skew Y</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skew Y</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkewY(SkewY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SvgSwitch
