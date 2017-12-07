package org.eclipse.m2m.qvt.oml.blackbox;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.svg.coordinate.SvgCoordinateStandaloneSetup;
import org.xtext.svg.href.SvgHrefStandaloneSetup;
import org.xtext.svg.length.SvgLengthStandaloneSetup;
import org.xtext.svg.lengths.SvgLengthsStandaloneSetup;
import org.xtext.svg.localiri.SvgLocalIriStandaloneSetup;
import org.xtext.svg.paint.SvgPaintStandaloneSetup;
import org.xtext.svg.path.SvgPathStandaloneSetup;
import org.xtext.svg.points.SvgPointsStandaloneSetup;
import org.xtext.svg.preserveaspectratio.SvgPreserveAspectRatioStandaloneSetup;
import org.xtext.svg.transform.SvgTransformStandaloneSetup;
import org.xtext.svg.viewbox.SvgViewboxStandaloneSetup;
import com.google.inject.Injector;

import svg.Coordinate;
import svg.Href;
import svg.Length;
import svg.LocalIri;
import svg.Paint;
import svg.Path;
import svg.PathValue;
import svg.Point;
import svg.Polygon;
import svg.PreserveAspectRatio;
import svg.StrokeDashArray;
import svg.SvgPackage;
import svg.Transform;
import svg.TransformValue;
import svg.ViewBox;


public class ParserLibrary {
	
	public ParserLibrary() {
		super();
	}

	private static EObject parse(ISetup setup, String value) {
		if (value == null) {
			return null;
		}
		Injector injector = setup.createInjectorAndDoEMFRegistration();
		SvgPackage.eINSTANCE.eClass();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.createResource(URI.createURI("dummy:/dummy.mydsl"));
		InputStream in = new ByteArrayInputStream(value.getBytes());
		try {
			resource.load(in, resourceSet.getLoadOptions());
		} catch (IOException e) {
			e.printStackTrace();
		}
		EList<EObject> objects = resource.getContents();
		if (objects.isEmpty()) {
			System.out.println("Couldn't parse object: " + value);
			return null;
		}
		return objects.get(0);
	}
	
	public Coordinate getCoordinate(String value) {
		return (Coordinate) parse(new SvgCoordinateStandaloneSetup(), value);
	}
	
	public Length getLength(String value) {
		return (Length) parse(new SvgLengthStandaloneSetup(), value);
	}
	
	public EList<Length> getLengths(String value) {
		return ((StrokeDashArray) parse(new SvgLengthsStandaloneSetup(), value)).getStrokeDashArray();
	}
	
	public PreserveAspectRatio getPreserveAspectRatio(String value) {
		return (PreserveAspectRatio) parse(new SvgPreserveAspectRatioStandaloneSetup(), value);
	}
	
	public ViewBox getViewBox(String value) {
		return (ViewBox) parse(new SvgViewboxStandaloneSetup(), value);
	}
	
	public EList<Point> getPoints(String value) {
		return ((Polygon) parse(new SvgPointsStandaloneSetup(), value)).getPoints();
	}
	
	public Href getHref(String value) {
		return (Href) parse(new SvgHrefStandaloneSetup(), value);
	}
	
	public LocalIri getLocalIri(String value) {
		return (LocalIri) parse(new SvgLocalIriStandaloneSetup(), value);
	}
	
	public Paint getPaint(String value) {
		return (Paint) parse(new SvgPaintStandaloneSetup(), value);
	}
	
	public EList<PathValue> getPath(String value) {
		return ((Path) parse(new SvgPathStandaloneSetup(), value)).getPath();
	}
	
	public EList<TransformValue> getTransform(String value) {
		return ((Transform) parse(new SvgTransformStandaloneSetup(), value)).getTransform();
	}
}
