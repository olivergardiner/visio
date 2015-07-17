package uk.org.whitecottage.visio;

import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import uk.org.whitecottage.visio.jaxb.visio2003.AngleType;
import uk.org.whitecottage.visio.jaxb.visio2003.CellType;
import uk.org.whitecottage.visio.jaxb.visio2003.FlipXType;
import uk.org.whitecottage.visio.jaxb.visio2003.FlipYType;
import uk.org.whitecottage.visio.jaxb.visio2003.HeightType;
import uk.org.whitecottage.visio.jaxb.visio2003.LocPinXType;
import uk.org.whitecottage.visio.jaxb.visio2003.LocPinYType;
import uk.org.whitecottage.visio.jaxb.visio2003.PinXType;
import uk.org.whitecottage.visio.jaxb.visio2003.PinYType;
import uk.org.whitecottage.visio.jaxb.visio2003.ResizeModeType;
import uk.org.whitecottage.visio.jaxb.visio2003.WidthType;
import uk.org.whitecottage.visio.jaxb.visio2003.XFormType;

public class XForm extends VisioElement {
	protected XFormType _xform;
	
	protected DoubleCell pinX;
	protected DoubleCell pinY;
	protected DoubleCell width;
	protected DoubleCell height;
	protected DoubleCell locPinX;
	protected DoubleCell locPinY;
	protected DoubleCell angle;
	protected IntCell flipX;
	protected IntCell flipY;
	protected IntCell resizeMode;
	
	public XForm() {
		_xform = new XFormType();
		
		createDefaults(0.0, 0.0, 0.0, 0.0);
	}

	public XForm(double x, double y, double width, double height) {
		_xform = new XFormType();
		
		createDefaults(x, y, width, height);
	}

	public XForm(XFormType xform) {
		_xform = xform;
		
		for (CellType cell: _xform.getPinXOrPinYOrWidth()) {
			if (cell instanceof PinXType) {
				pinX = new DoubleCell("PinX", cell);
			} else if (cell instanceof PinYType) {
				pinY = new DoubleCell("PinY", cell);
			} else if (cell instanceof WidthType) {
				width = new DoubleCell("Width", cell);
			} else if (cell instanceof HeightType) {
				height = new DoubleCell("Height", cell);
			} else if (cell instanceof LocPinXType) {
				locPinX = new DoubleCell("LocPinX", cell);
			} else if (cell instanceof LocPinYType) {
				locPinY = new DoubleCell("LocPinY", cell);
			} else if (cell instanceof AngleType) {
				angle = new DoubleCell("Angle", cell);
			} else if (cell instanceof FlipXType) {
				flipX = new IntCell("FlipX", cell);
			} else if (cell instanceof FlipYType) {
				flipY = new IntCell("FlipY", cell);
			} else if (cell instanceof ResizeModeType) {
				resizeMode = new IntCell("ResizeMode", cell);
			}
		}
	}

	protected void createDefaults(double x, double y, double width, double height) {
		List<CellType> contents = _xform.getPinXOrPinYOrWidth();

		this.pinX = new DoubleCell("PinX", null, null, x);
		contents.add(this.pinX.getCell());

		this.pinY = new DoubleCell("PinY", null, null, y);
		contents.add(this.pinY.getCell());

		this.width = new DoubleCell("Width", null, null, width);
		contents.add(this.width.getCell());

		this.height = new DoubleCell("Height", null, null, height);
		contents.add(this.height.getCell());

		this.locPinX = new DoubleCell("LocPinX", "Width*0.5", null, width * 0.5);
		contents.add(this.locPinX.getCell());

		this.locPinY = new DoubleCell("LocPinY", "Height*0.5", null, height * 0.5);
		contents.add(this.locPinY.getCell());
		
		this.angle = new DoubleCell("Angle", null, null, 0.0);
		contents.add(this.angle.getCell());

		this.flipX = new IntCell("FlipX", null, null, 0);
		contents.add(this.flipX.getCell());

		this.flipY = new IntCell("FlipY", null, null, 0);
		contents.add(this.flipY.getCell());

		this.resizeMode = new IntCell("ResizeMode", null, null, 0);
		contents.add(this.resizeMode.getCell());
	}
	
	public JAXBElement<XFormType> getXForm() {
		return new JAXBElement<XFormType>(new QName("http://schemas.microsoft.com/visio/2003/core", "XForm"), XFormType.class, _xform);
	}
		
	public double getPinX() {
		return pinX.getDoubleValue();
	}

	public double getPinY() {
		return pinY.getDoubleValue();
	}

	public double getWidth() {
		return width.getDoubleValue();
	}

	public double getHeight() {
		return height.getDoubleValue();
	}

	public double getLocPinX() {
		return locPinX.getDoubleValue();
	}

	public double getLocPinY() {
		return locPinY.getDoubleValue();
	}

	public double getAngle() {
		return angle.getDoubleValue();
	}

	public int getFlipX() {
		return flipX.getIntValue();
	}

	public int getFlipY() {
		return flipY.getIntValue();
	}

	public int getResizeMode() {
		return resizeMode.getIntValue();
	}

	public void setPinX(double value) {
		setPinX(null, value);
	}
	
	public void setPinX(String formula, double value) {
		if (pinX == null) {
			pinX = new DoubleCell("PinX", formula, null, value);
			_xform.getPinXOrPinYOrWidth().add(pinX.getCell());
		} else {
			pinX.setFormula(formula);
			pinX.setValue(value);
		}
	}

	public void setPinY(double value) {
		setPinY(null, value);
	}
	
	public void setPinY(String formula, double value) {
		if (pinY == null) {
			pinY = new DoubleCell("PinY", formula, null, value);
			_xform.getPinXOrPinYOrWidth().add(pinY.getCell());
		} else {
			pinY.setFormula(formula);
			pinY.setValue(value);
		}
	}

	public void setWidth(double value) {
		setWidth(null, value);
	}
	
	public void setWidth(String formula, double value) {
		if (width == null) {
			width = new DoubleCell("Width", formula, null, value);
			_xform.getPinXOrPinYOrWidth().add(width.getCell());
		} else {
			width.setFormula(formula);
			width.setValue(value);
		}
	}

	public void setHeight(double value) {
		setHeight(null, value);
	}
	
	public void setHeight(String formula, double value) {
		if (height == null) {
			height = new DoubleCell("Height", formula, null, value);
			_xform.getPinXOrPinYOrWidth().add(height.getCell());
		} else {
			height.setFormula(formula);
			height.setValue(value);
		}
	}

	public void setLocPinX(double value) {
		setLocPinX(null, value);
	}
	
	public void setLocPinX(String formula, double value) {
		if (locPinX == null) {
			locPinX = new DoubleCell("LocPinX", formula, null, value);
			_xform.getPinXOrPinYOrWidth().add(locPinX.getCell());
		} else {
			locPinX.setFormula(formula);
			locPinX.setValue(value);
		}
	}

	public void setLocPinY(double value) {
		setLocPinY(null, value);
	}
	
	public void setLocPinY(String formula, double value) {
		if (locPinY == null) {
			locPinY = new DoubleCell("LocPinY", formula, null, value);
			_xform.getPinXOrPinYOrWidth().add(locPinY.getCell());
		} else {
			locPinY.setFormula(formula);
			locPinY.setValue(value);
		}
	}

	public void setAngle(double value) {
		setLocPinY(null, value);
	}
	
	public void setAngle(String formula, double value) {
		if (angle == null) {
			angle = new DoubleCell("Angle", formula, null, value);
			_xform.getPinXOrPinYOrWidth().add(angle.getCell());
		} else {
			angle.setFormula(formula);
			angle.setValue(value);
		}
	}
	
	public void setFlipX(int value) {
		if (flipX == null) {
			flipX = new IntCell("FlipX", null, null, value);
			_xform.getPinXOrPinYOrWidth().add(flipX.getCell());
		} else {
			flipX.setValue(value);
		}
	}
	
	public void setFlipY(int value) {
		if (flipY == null) {
			flipY = new IntCell("FlipY", null, null, value);
			_xform.getPinXOrPinYOrWidth().add(flipY.getCell());
		} else {
			flipY.setValue(value);
		}
	}
	
	public void setResizeMode(int value) {
		if (resizeMode == null) {
			resizeMode = new IntCell("ResizeMode", null, null, value);
			_xform.getPinXOrPinYOrWidth().add(resizeMode.getCell());
		} else {
			resizeMode.setValue(value);
		}
	}
}
