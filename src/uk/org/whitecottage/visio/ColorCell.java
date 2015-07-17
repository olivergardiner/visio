package uk.org.whitecottage.visio;

import java.awt.Color;

import uk.org.whitecottage.visio.jaxb.visio2003.CellType;

public class ColorCell extends Cell {

	public ColorCell(String type) {
		super(type);
	}

	public ColorCell(String type, String formula, String unit, Color value) {
		super(type);
		setFormula(formula);
		setUnit(unit);
		setValue(value);
	}

	public ColorCell(String type, CellType cell) {
		super(type, cell);
	}

	public Color getColorValue() {
		return new Color(Integer.valueOf(_cell.getValue()));
	}

	public void setValue(Color value) {
		setValue(String.valueOf(value.getRGB() & 0xffffff));
	}
}
