package uk.org.whitecottage.visio;

import uk.org.whitecottage.visio.jaxb.visio2003.MoveToType;
import uk.org.whitecottage.visio.jaxb.visio2003.XType;
import uk.org.whitecottage.visio.jaxb.visio2003.YType;

public class MoveTo extends GraphicElement {
	protected DoubleCell x;
	protected DoubleCell y;

	public MoveTo() {
		_element = new MoveToType();
		
		x = new DoubleCell("X", null, null, 0.0);
		y = new DoubleCell("Y", null, null, 0.0);
		
		((MoveToType) _element).setX((XType) x.getCell());
		((MoveToType) _element).setY((YType) y.getCell());
	}
	
	public MoveTo(int index) {
		this();
		
		setIndex(index);
	}
	
	public MoveTo(int index, String fx, double x, String fy, double y) {
		this(index);
		
		setX(fx, x);
		setY(fy, y);
	}
	
	public MoveTo(Object element) {
		super(element);
		
		x = new DoubleCell("X", ((MoveToType) _element).getX());
		y = new DoubleCell("Y", ((MoveToType) _element).getY());
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
