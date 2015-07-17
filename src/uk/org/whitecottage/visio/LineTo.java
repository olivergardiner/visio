package uk.org.whitecottage.visio;

import uk.org.whitecottage.visio.jaxb.visio2003.LineToType;
import uk.org.whitecottage.visio.jaxb.visio2003.XType;
import uk.org.whitecottage.visio.jaxb.visio2003.YType;

public class LineTo extends GraphicElement {
	protected DoubleCell x;
	protected DoubleCell y;

	public LineTo() {
		_element = new LineToType();
		
		x = new DoubleCell("X", null, null, 0.0);
		y = new DoubleCell("Y", null, null, 0.0);

		((LineToType) _element).setX((XType) x.getCell());
		((LineToType) _element).setY((YType) y.getCell());
	}
	
	public LineTo(int index) {
		this();
		
		setIndex(index);
	}
	
	public LineTo(int index, String fx, double x, String fy, double y) {
		this(index);
		
		setX(fx, x);
		setY(fy, y);
	}
	
	public LineTo(Object element) {
		super(element);
		
		x = new DoubleCell("X", ((LineToType) _element).getX());
		y = new DoubleCell("Y", ((LineToType) _element).getY());
	}

	public double getX() {
		return x.getDoubleValue();
	}

	public double getY() {
		return y.getDoubleValue();
	}

	public void setX(double value) {
		setX(null, value);
	}
	
	public void setX(String formula, double value) {
		x.setFormula(formula);
		x.setValue(value);
	}

	public void setY(double value) {
		setY(null, value);
	}
	
	public void setY(String formula, double value) {
		y.setFormula(formula);
		y.setValue(value);
	}
}
