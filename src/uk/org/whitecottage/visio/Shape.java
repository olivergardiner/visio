package uk.org.whitecottage.visio;

import java.math.BigInteger;

import uk.org.whitecottage.visio.jaxb.visio2003.FillType;
import uk.org.whitecottage.visio.jaxb.visio2003.GeomType;
import uk.org.whitecottage.visio.jaxb.visio2003.LineType;
import uk.org.whitecottage.visio.jaxb.visio2003.ShapeType;
import uk.org.whitecottage.visio.jaxb.visio2003.TextType;
import uk.org.whitecottage.visio.jaxb.visio2003.XFormType;

public class Shape extends VisioElement {
	protected ShapeType _shape;
	protected XForm xform;
	protected Line line;
	protected Fill fill;
	protected Geom geom;
	protected Text text;
	
	public Shape() {
		this(0.0, 0.0, 0.0, 0.0);
	}

	public Shape(double x, double y, double width, double height) {
		_shape = new ShapeType();
		
		xform = new XForm(x, y, width, height);
		_shape.getTextOrXFormOrLine().add(xform.getXForm());
		
		line = new Line();
		_shape.getTextOrXFormOrLine().add(line.getLine());

		fill = new Fill();
		_shape.getTextOrXFormOrLine().add(fill.getFill());

		geom = new Geom();
		_shape.getTextOrXFormOrLine().add(geom.getGeom());

		text = new Text();
		_shape.getTextOrXFormOrLine().add(text.getText());
	}

	public Shape(ShapeType shape) {
		_shape = shape;
		
		XFormType _xform = (XFormType) findElement(_shape.getTextOrXFormOrLine(), "XForm");
		if (_xform != null) {
			xform = new XForm(_xform);
		}
		
		LineType _line = (LineType) findElement(_shape.getTextOrXFormOrLine(), "Line");
		if (_line != null) {
			line = new Line(_line);
		}

		FillType _fill = (FillType) findElement(_shape.getTextOrXFormOrLine(), "Fill");
		if (_fill != null) {
			fill = new Fill(_fill);
		}
		
		GeomType _geom = (GeomType) findElement(_shape.getTextOrXFormOrLine(), "Geom");
		if (_geom != null) {
			geom = new Geom(_geom);
		}
		
		TextType _text = (TextType) findElement(_shape.getTextOrXFormOrLine(), "Text");
		if (_text != null) {
			text = new Text(_text);
		}
	}

	public ShapeType getShape() {
		return _shape;
	}
	
	public void setID(int id) {
		_shape.setID(BigInteger.valueOf(id));
	}
	
	public XForm getXform() {
		if (xform == null) {
			xform = new XForm();
			_shape.getTextOrXFormOrLine().add(xform.getXForm());
		}

		return xform;
	}

	public Line getLine() {
		if (line == null) {
			line = new Line();
			_shape.getTextOrXFormOrLine().add(line.getLine());
		}
		
		return line;
	}

	public Fill getFill() {
		if (fill == null) {
			fill = new Fill();
			_shape.getTextOrXFormOrLine().add(fill.getFill());
		}
		
		return fill;
	}

	public Geom getGeom() {
		if (geom == null) {
			geom = new Geom();
			_shape.getTextOrXFormOrLine().add(geom.getGeom());
		}
		
		return geom;
	}

	public Text getText() {
		if (text == null) {
			text = new Text();
			_shape.getTextOrXFormOrLine().add(text.getText());
		}
		
		return text;
	}
	
	public static Shape createBox(double x, double y, double width, double height) {
		Shape shape = new Shape(x, y, width, height);
		
		Geom geom = shape.getGeom();
		geom.add(new MoveTo(1, "Width*0", 0.0, "Height*0", 0.0));
		geom.add(new LineTo(2, "Width*1", width, "Height*0", 0.0));
		geom.add(new LineTo(3, "Width*1", width, "Height*1", height));
		geom.add(new LineTo(4, "Width*0", 0.0, "Height*1", height));
		geom.add(new LineTo(5, "Geometry1.X1", 0.0, "Geometry1.Y1", 0.0));

		return shape;
	}
}
