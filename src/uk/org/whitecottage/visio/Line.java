package uk.org.whitecottage.visio;

import java.awt.Color;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import uk.org.whitecottage.visio.jaxb.visio2003.BeginArrowSizeType;
import uk.org.whitecottage.visio.jaxb.visio2003.BeginArrowType;
import uk.org.whitecottage.visio.jaxb.visio2003.CellType;
import uk.org.whitecottage.visio.jaxb.visio2003.EndArrowSizeType;
import uk.org.whitecottage.visio.jaxb.visio2003.EndArrowType;
import uk.org.whitecottage.visio.jaxb.visio2003.LineCapType;
import uk.org.whitecottage.visio.jaxb.visio2003.LineColorTransType;
import uk.org.whitecottage.visio.jaxb.visio2003.LineColorType;
import uk.org.whitecottage.visio.jaxb.visio2003.LinePatternType;
import uk.org.whitecottage.visio.jaxb.visio2003.LineType;
import uk.org.whitecottage.visio.jaxb.visio2003.LineWeightType;
import uk.org.whitecottage.visio.jaxb.visio2003.RoundingType;

public class Line extends VisioElement {
	protected LineType _line;

	protected DoubleCell lineWeight;
	protected ColorCell lineColor;
	protected IntCell linePattern;
	protected DoubleCell rounding;
	protected IntCell beginArrow;
	protected IntCell beginArrowSize;
	protected IntCell endArrow;
	protected IntCell endArrowSize;
	protected IntCell lineCap;
	protected DoubleCell lineColorTrans;

	public Line() {
		_line = new LineType();
		createDefaults();
	}
	
	public Line(LineType line) {
		_line = line;
		for (CellType cell: _line.getLineWeightOrLineColorOrLinePattern()) {
			if (cell instanceof LineWeightType) {
				lineWeight = new DoubleCell("LineWeight", cell);
			} else if (cell instanceof LineColorType) {
				lineColor = new ColorCell("LineColor", cell);
			} else if (cell instanceof LinePatternType) {
				linePattern = new IntCell("LinePattern", cell);
			} else if (cell instanceof RoundingType) {
				rounding = new DoubleCell("Rounding", cell);
			} else if (cell instanceof BeginArrowType) {
				beginArrow = new IntCell("BeginArrow", cell);
			} else if (cell instanceof BeginArrowSizeType) {
				beginArrowSize = new IntCell("BeginArrowSize", cell);
			} else if (cell instanceof EndArrowType) {
				endArrow = new IntCell("EndArrow", cell);
			} else if (cell instanceof EndArrowSizeType) {
				endArrowSize = new IntCell("EndArrowSize", cell);
			} else if (cell instanceof LineCapType) {
				lineCap = new IntCell("LineCap", cell);
			} else if (cell instanceof LineColorTransType) {
				lineColorTrans = new DoubleCell("LineColorTrans", cell);
			}
		}
	}
	
	protected void createDefaults() {
		List<CellType> contents = _line.getLineWeightOrLineColorOrLinePattern();
		
		lineWeight = new DoubleCell("LineWeight", "Inh", null, 0.01);
		contents.add(lineWeight.getCell());
		
		lineColor = new ColorCell("LineColor", "Inh", null, Color.BLACK);
		contents.add(lineColor.getCell());
		
		linePattern = new IntCell("LinePattern", "Inh", null, 1);
		contents.add(linePattern.getCell());
				
		beginArrow = new IntCell("BeginArrow", "Inh", null, 0);
		contents.add(beginArrow.getCell());
		
		beginArrowSize = new IntCell("BeginArrowSize", "Inh", null, 2);
		contents.add(beginArrowSize.getCell());
		
		endArrow = new IntCell("EndArrow", "Inh", null, 0);
		contents.add(endArrow.getCell());
		
		endArrowSize = new IntCell("EndArrowSize", "Inh", null, 2);
		contents.add(endArrowSize.getCell());
		
		lineCap = new IntCell("LineCap", "Inh", null, 0);
		contents.add(lineCap.getCell());
		
		lineColorTrans = new DoubleCell("LineColorTrans", "Inh", null, 0.0);
		contents.add(lineColorTrans.getCell());
	}

	public JAXBElement<LineType> getLine() {
		return new JAXBElement<LineType>(new QName("http://schemas.microsoft.com/visio/2003/core", "Line"), LineType.class, _line);
	}

	public double getLineWeight() {
		return lineWeight.getDoubleValue();
	}

	public Color getLineColor() {
		return lineColor.getColorValue();
	}

	public int getLinePattern() {
		return linePattern.getIntValue();
	}

	public String getRoundingUnit() {
		return rounding.getUnit();
	}

	public double getRounding() {
		return rounding.getDoubleValue();
	}

	public int getBeginArrow() {
		return beginArrow.getIntValue();
	}

	public int getBeginArrowSize() {
		return beginArrowSize.getIntValue();
	}

	public int getEndArrow() {
		return endArrow.getIntValue();
	}

	public int getEndArrowSize() {
		return endArrowSize.getIntValue();
	}

	public int getLineCap() {
		return lineCap.getIntValue();
	}

	public double getLineColorTrans() {
		return lineColorTrans.getDoubleValue();
	}

	public void setLineWeight(double value) {
		if (lineWeight == null) {
			lineWeight = new DoubleCell("LineWeight", "Inh", null, value);
			_line.getLineWeightOrLineColorOrLinePattern().add(lineWeight.getCell());
		} else {
			lineWeight.setValue(value);
		}
	}

	public void setLineColor(Color value) {
		if (lineColor == null) {
			lineColor = new ColorCell("LineColor", "Inh", null, value);
			_line.getLineWeightOrLineColorOrLinePattern().add(lineColor.getCell());
		} else {
			lineColor.setValue(value);
		}
	}

	public void setLinePattern(int value) {
		if (linePattern == null) {
			linePattern = new IntCell("LinePattern", "Inh", null, value);
			_line.getLineWeightOrLineColorOrLinePattern().add(linePattern.getCell());
		} else {
			linePattern.setValue(value);
		}
	}

	public void setRounding(String unit, double value) {
		if (rounding == null) {
			rounding = new DoubleCell("Rounding", null, unit, value);
			_line.getLineWeightOrLineColorOrLinePattern().add(rounding.getCell());
		} else {
			rounding.setUnit(unit);
			rounding.setValue(value);
		}
	}

	public void setBeginArrow(int value) {
		if (beginArrow == null) {
			beginArrow = new IntCell("BeginArrow", "Inh", null, value);
			_line.getLineWeightOrLineColorOrLinePattern().add(beginArrow.getCell());
		} else {
			beginArrow.setValue(value);
		}
	}

	public void setBeginArrowSize(int value) {
		if (beginArrowSize == null) {
			beginArrowSize = new IntCell("BeginArrowSize", "Inh", null, value);
			_line.getLineWeightOrLineColorOrLinePattern().add(beginArrowSize.getCell());
		} else {
			beginArrowSize.setValue(value);
		}
	}

	public void setEndArrow(int value) {
		if (endArrow == null) {
			endArrow = new IntCell("EndArrow", "Inh", null, value);
			_line.getLineWeightOrLineColorOrLinePattern().add(endArrow.getCell());
		} else {
			endArrow.setValue(value);
		}
	}

	public void setEndArrowSize(int value) {
		if (endArrowSize == null) {
			endArrowSize = new IntCell("EndArrowSize", "Inh", null, value);
			_line.getLineWeightOrLineColorOrLinePattern().add(endArrowSize.getCell());
		} else {
			endArrowSize.setValue(value);
		}
	}

	public void setLineCap(int value) {
		if (lineCap == null) {
			lineCap = new IntCell("LineCap", "Inh", null, value);
			_line.getLineWeightOrLineColorOrLinePattern().add(lineCap.getCell());
		} else {
			lineCap.setValue(value);
		}
	}

	public void setColorTrans(double value) {
		if (lineColorTrans == null) {
			lineColorTrans = new DoubleCell("LineColorTrans", "Inh", null, value);
			_line.getLineWeightOrLineColorOrLinePattern().add(lineColorTrans.getCell());
		} else {
			lineColorTrans.setValue(value);
		}
	}
}
