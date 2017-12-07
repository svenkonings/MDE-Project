/**
 */
package svg.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import svg.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see svg.SvgPackage
 * @generated
 */
public class SvgAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SvgPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvgAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SvgPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SvgSwitch<Adapter> modelSwitch = new SvgSwitch<Adapter>() {
		@Override
		public Adapter caseElement(Element object) {
			return createElementAdapter();
		}

		@Override
		public Adapter caseStructuralElement(StructuralElement object) {
			return createStructuralElementAdapter();
		}

		@Override
		public Adapter caseUse(Use object) {
			return createUseAdapter();
		}

		@Override
		public Adapter caseClipPath(ClipPath object) {
			return createClipPathAdapter();
		}

		@Override
		public Adapter caseContainerElement(ContainerElement object) {
			return createContainerElementAdapter();
		}

		@Override
		public Adapter caseGroup(Group object) {
			return createGroupAdapter();
		}

		@Override
		public Adapter caseSvg(Svg object) {
			return createSvgAdapter();
		}

		@Override
		public Adapter caseDefs(Defs object) {
			return createDefsAdapter();
		}

		@Override
		public Adapter caseSymbol(Symbol object) {
			return createSymbolAdapter();
		}

		@Override
		public Adapter caseGraphicElement(GraphicElement object) {
			return createGraphicElementAdapter();
		}

		@Override
		public Adapter caseCircle(Circle object) {
			return createCircleAdapter();
		}

		@Override
		public Adapter caseEllipse(Ellipse object) {
			return createEllipseAdapter();
		}

		@Override
		public Adapter caseImage(Image object) {
			return createImageAdapter();
		}

		@Override
		public Adapter caseLine(Line object) {
			return createLineAdapter();
		}

		@Override
		public Adapter casePath(Path object) {
			return createPathAdapter();
		}

		@Override
		public Adapter casePolygon(Polygon object) {
			return createPolygonAdapter();
		}

		@Override
		public Adapter casePolyline(Polyline object) {
			return createPolylineAdapter();
		}

		@Override
		public Adapter caseRect(Rect object) {
			return createRectAdapter();
		}

		@Override
		public Adapter caseText(Text object) {
			return createTextAdapter();
		}

		@Override
		public Adapter caseAttribute(Attribute object) {
			return createAttributeAdapter();
		}

		@Override
		public Adapter caseFill(Fill object) {
			return createFillAdapter();
		}

		@Override
		public Adapter caseStroke(Stroke object) {
			return createStrokeAdapter();
		}

		@Override
		public Adapter caseStrokeWidth(StrokeWidth object) {
			return createStrokeWidthAdapter();
		}

		@Override
		public Adapter caseStrokeDashArray(StrokeDashArray object) {
			return createStrokeDashArrayAdapter();
		}

		@Override
		public Adapter caseStrokeDashOffset(StrokeDashOffset object) {
			return createStrokeDashOffsetAdapter();
		}

		@Override
		public Adapter caseClipPathAttribute(ClipPathAttribute object) {
			return createClipPathAttributeAdapter();
		}

		@Override
		public Adapter caseFontFamily(FontFamily object) {
			return createFontFamilyAdapter();
		}

		@Override
		public Adapter caseFontSize(FontSize object) {
			return createFontSizeAdapter();
		}

		@Override
		public Adapter caseTransform(Transform object) {
			return createTransformAdapter();
		}

		@Override
		public Adapter caseAttributeType(AttributeType object) {
			return createAttributeTypeAdapter();
		}

		@Override
		public Adapter caseLength(Length object) {
			return createLengthAdapter();
		}

		@Override
		public Adapter caseCoordinate(Coordinate object) {
			return createCoordinateAdapter();
		}

		@Override
		public Adapter casePreserveAspectRatio(PreserveAspectRatio object) {
			return createPreserveAspectRatioAdapter();
		}

		@Override
		public Adapter caseViewBox(ViewBox object) {
			return createViewBoxAdapter();
		}

		@Override
		public Adapter casePoint(Point object) {
			return createPointAdapter();
		}

		@Override
		public Adapter caseHref(Href object) {
			return createHrefAdapter();
		}

		@Override
		public Adapter caseLocalIri(LocalIri object) {
			return createLocalIriAdapter();
		}

		@Override
		public Adapter caseBase64Ref(Base64Ref object) {
			return createBase64RefAdapter();
		}

		@Override
		public Adapter casePaint(Paint object) {
			return createPaintAdapter();
		}

		@Override
		public Adapter caseIriPaint(IriPaint object) {
			return createIriPaintAdapter();
		}

		@Override
		public Adapter caseNonePaint(NonePaint object) {
			return createNonePaintAdapter();
		}

		@Override
		public Adapter caseColor(Color object) {
			return createColorAdapter();
		}

		@Override
		public Adapter caseHexColor(HexColor object) {
			return createHexColorAdapter();
		}

		@Override
		public Adapter caseRgbColor(RgbColor object) {
			return createRgbColorAdapter();
		}

		@Override
		public Adapter caseRgbPercentage(RgbPercentage object) {
			return createRgbPercentageAdapter();
		}

		@Override
		public Adapter caseKeywordColor(KeywordColor object) {
			return createKeywordColorAdapter();
		}

		@Override
		public Adapter casePathValue(PathValue object) {
			return createPathValueAdapter();
		}

		@Override
		public Adapter caseAbsoluteMoveTo(AbsoluteMoveTo object) {
			return createAbsoluteMoveToAdapter();
		}

		@Override
		public Adapter caseRelativeMoveTo(RelativeMoveTo object) {
			return createRelativeMoveToAdapter();
		}

		@Override
		public Adapter caseAbsoluteLineTo(AbsoluteLineTo object) {
			return createAbsoluteLineToAdapter();
		}

		@Override
		public Adapter caseRelativeLineTo(RelativeLineTo object) {
			return createRelativeLineToAdapter();
		}

		@Override
		public Adapter caseAbsoluteHorizontalLineTo(AbsoluteHorizontalLineTo object) {
			return createAbsoluteHorizontalLineToAdapter();
		}

		@Override
		public Adapter caseRelativeHorizontalLineTo(RelativeHorizontalLineTo object) {
			return createRelativeHorizontalLineToAdapter();
		}

		@Override
		public Adapter caseAbsoluteVerticalLineTo(AbsoluteVerticalLineTo object) {
			return createAbsoluteVerticalLineToAdapter();
		}

		@Override
		public Adapter caseRelativeVerticalLineTo(RelativeVerticalLineTo object) {
			return createRelativeVerticalLineToAdapter();
		}

		@Override
		public Adapter caseAbsoluteQuadraticCurveTo(AbsoluteQuadraticCurveTo object) {
			return createAbsoluteQuadraticCurveToAdapter();
		}

		@Override
		public Adapter caseRelativeQuadraticCurveTo(RelativeQuadraticCurveTo object) {
			return createRelativeQuadraticCurveToAdapter();
		}

		@Override
		public Adapter caseAbsoluteCubicCurveTo(AbsoluteCubicCurveTo object) {
			return createAbsoluteCubicCurveToAdapter();
		}

		@Override
		public Adapter caseRelativeCubicCurveTo(RelativeCubicCurveTo object) {
			return createRelativeCubicCurveToAdapter();
		}

		@Override
		public Adapter caseAbsoluteSmoothQuadraticCurveTo(AbsoluteSmoothQuadraticCurveTo object) {
			return createAbsoluteSmoothQuadraticCurveToAdapter();
		}

		@Override
		public Adapter caseRelativeSmoothQuadraticCurveTo(RelativeSmoothQuadraticCurveTo object) {
			return createRelativeSmoothQuadraticCurveToAdapter();
		}

		@Override
		public Adapter caseAbsoluteSmoothCubicCurveTo(AbsoluteSmoothCubicCurveTo object) {
			return createAbsoluteSmoothCubicCurveToAdapter();
		}

		@Override
		public Adapter caseRelativeSmoothCubicCurveTo(RelativeSmoothCubicCurveTo object) {
			return createRelativeSmoothCubicCurveToAdapter();
		}

		@Override
		public Adapter caseClosePath(ClosePath object) {
			return createClosePathAdapter();
		}

		@Override
		public Adapter caseTransformValue(TransformValue object) {
			return createTransformValueAdapter();
		}

		@Override
		public Adapter caseMatrix(Matrix object) {
			return createMatrixAdapter();
		}

		@Override
		public Adapter caseTranslate(Translate object) {
			return createTranslateAdapter();
		}

		@Override
		public Adapter caseScale(Scale object) {
			return createScaleAdapter();
		}

		@Override
		public Adapter caseRotate(Rotate object) {
			return createRotateAdapter();
		}

		@Override
		public Adapter caseSkewX(SkewX object) {
			return createSkewXAdapter();
		}

		@Override
		public Adapter caseSkewY(SkewY object) {
			return createSkewYAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.StructuralElement <em>Structural Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.StructuralElement
	 * @generated
	 */
	public Adapter createStructuralElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Use <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Use
	 * @generated
	 */
	public Adapter createUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.ClipPath <em>Clip Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.ClipPath
	 * @generated
	 */
	public Adapter createClipPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.ContainerElement <em>Container Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.ContainerElement
	 * @generated
	 */
	public Adapter createContainerElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Svg <em>Svg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Svg
	 * @generated
	 */
	public Adapter createSvgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Defs <em>Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Defs
	 * @generated
	 */
	public Adapter createDefsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Symbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Symbol
	 * @generated
	 */
	public Adapter createSymbolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.GraphicElement <em>Graphic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.GraphicElement
	 * @generated
	 */
	public Adapter createGraphicElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Circle
	 * @generated
	 */
	public Adapter createCircleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Ellipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Ellipse
	 * @generated
	 */
	public Adapter createEllipseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Line
	 * @generated
	 */
	public Adapter createLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Path
	 * @generated
	 */
	public Adapter createPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Polygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Polygon
	 * @generated
	 */
	public Adapter createPolygonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Polyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Polyline
	 * @generated
	 */
	public Adapter createPolylineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Rect <em>Rect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Rect
	 * @generated
	 */
	public Adapter createRectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Fill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Fill
	 * @generated
	 */
	public Adapter createFillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Stroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Stroke
	 * @generated
	 */
	public Adapter createStrokeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.StrokeWidth <em>Stroke Width</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.StrokeWidth
	 * @generated
	 */
	public Adapter createStrokeWidthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.StrokeDashArray <em>Stroke Dash Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.StrokeDashArray
	 * @generated
	 */
	public Adapter createStrokeDashArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.StrokeDashOffset <em>Stroke Dash Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.StrokeDashOffset
	 * @generated
	 */
	public Adapter createStrokeDashOffsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.ClipPathAttribute <em>Clip Path Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.ClipPathAttribute
	 * @generated
	 */
	public Adapter createClipPathAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.FontFamily <em>Font Family</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.FontFamily
	 * @generated
	 */
	public Adapter createFontFamilyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.FontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.FontSize
	 * @generated
	 */
	public Adapter createFontSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Transform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Transform
	 * @generated
	 */
	public Adapter createTransformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.AttributeType
	 * @generated
	 */
	public Adapter createAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Length
	 * @generated
	 */
	public Adapter createLengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Coordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Coordinate
	 * @generated
	 */
	public Adapter createCoordinateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.PreserveAspectRatio <em>Preserve Aspect Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.PreserveAspectRatio
	 * @generated
	 */
	public Adapter createPreserveAspectRatioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.ViewBox <em>View Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.ViewBox
	 * @generated
	 */
	public Adapter createViewBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Point
	 * @generated
	 */
	public Adapter createPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Href <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Href
	 * @generated
	 */
	public Adapter createHrefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.LocalIri <em>Local Iri</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.LocalIri
	 * @generated
	 */
	public Adapter createLocalIriAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Base64Ref <em>Base64 Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Base64Ref
	 * @generated
	 */
	public Adapter createBase64RefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Paint <em>Paint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Paint
	 * @generated
	 */
	public Adapter createPaintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.IriPaint <em>Iri Paint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.IriPaint
	 * @generated
	 */
	public Adapter createIriPaintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.NonePaint <em>None Paint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.NonePaint
	 * @generated
	 */
	public Adapter createNonePaintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Color
	 * @generated
	 */
	public Adapter createColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.HexColor <em>Hex Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.HexColor
	 * @generated
	 */
	public Adapter createHexColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.RgbColor <em>Rgb Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.RgbColor
	 * @generated
	 */
	public Adapter createRgbColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.RgbPercentage <em>Rgb Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.RgbPercentage
	 * @generated
	 */
	public Adapter createRgbPercentageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.KeywordColor <em>Keyword Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.KeywordColor
	 * @generated
	 */
	public Adapter createKeywordColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.PathValue <em>Path Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.PathValue
	 * @generated
	 */
	public Adapter createPathValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.AbsoluteMoveTo <em>Absolute Move To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.AbsoluteMoveTo
	 * @generated
	 */
	public Adapter createAbsoluteMoveToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.RelativeMoveTo <em>Relative Move To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.RelativeMoveTo
	 * @generated
	 */
	public Adapter createRelativeMoveToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.AbsoluteLineTo <em>Absolute Line To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.AbsoluteLineTo
	 * @generated
	 */
	public Adapter createAbsoluteLineToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.RelativeLineTo <em>Relative Line To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.RelativeLineTo
	 * @generated
	 */
	public Adapter createRelativeLineToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.AbsoluteHorizontalLineTo <em>Absolute Horizontal Line To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.AbsoluteHorizontalLineTo
	 * @generated
	 */
	public Adapter createAbsoluteHorizontalLineToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.RelativeHorizontalLineTo <em>Relative Horizontal Line To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.RelativeHorizontalLineTo
	 * @generated
	 */
	public Adapter createRelativeHorizontalLineToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.AbsoluteVerticalLineTo <em>Absolute Vertical Line To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.AbsoluteVerticalLineTo
	 * @generated
	 */
	public Adapter createAbsoluteVerticalLineToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.RelativeVerticalLineTo <em>Relative Vertical Line To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.RelativeVerticalLineTo
	 * @generated
	 */
	public Adapter createRelativeVerticalLineToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.AbsoluteQuadraticCurveTo <em>Absolute Quadratic Curve To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.AbsoluteQuadraticCurveTo
	 * @generated
	 */
	public Adapter createAbsoluteQuadraticCurveToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.RelativeQuadraticCurveTo <em>Relative Quadratic Curve To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.RelativeQuadraticCurveTo
	 * @generated
	 */
	public Adapter createRelativeQuadraticCurveToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.AbsoluteCubicCurveTo <em>Absolute Cubic Curve To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.AbsoluteCubicCurveTo
	 * @generated
	 */
	public Adapter createAbsoluteCubicCurveToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.RelativeCubicCurveTo <em>Relative Cubic Curve To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.RelativeCubicCurveTo
	 * @generated
	 */
	public Adapter createRelativeCubicCurveToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.AbsoluteSmoothQuadraticCurveTo <em>Absolute Smooth Quadratic Curve To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.AbsoluteSmoothQuadraticCurveTo
	 * @generated
	 */
	public Adapter createAbsoluteSmoothQuadraticCurveToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.RelativeSmoothQuadraticCurveTo <em>Relative Smooth Quadratic Curve To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.RelativeSmoothQuadraticCurveTo
	 * @generated
	 */
	public Adapter createRelativeSmoothQuadraticCurveToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.AbsoluteSmoothCubicCurveTo <em>Absolute Smooth Cubic Curve To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.AbsoluteSmoothCubicCurveTo
	 * @generated
	 */
	public Adapter createAbsoluteSmoothCubicCurveToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.RelativeSmoothCubicCurveTo <em>Relative Smooth Cubic Curve To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.RelativeSmoothCubicCurveTo
	 * @generated
	 */
	public Adapter createRelativeSmoothCubicCurveToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.ClosePath <em>Close Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.ClosePath
	 * @generated
	 */
	public Adapter createClosePathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.TransformValue <em>Transform Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.TransformValue
	 * @generated
	 */
	public Adapter createTransformValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Matrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Matrix
	 * @generated
	 */
	public Adapter createMatrixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Translate <em>Translate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Translate
	 * @generated
	 */
	public Adapter createTranslateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Scale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Scale
	 * @generated
	 */
	public Adapter createScaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.Rotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.Rotate
	 * @generated
	 */
	public Adapter createRotateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.SkewX <em>Skew X</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.SkewX
	 * @generated
	 */
	public Adapter createSkewXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svg.SkewY <em>Skew Y</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svg.SkewY
	 * @generated
	 */
	public Adapter createSkewYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SvgAdapterFactory
