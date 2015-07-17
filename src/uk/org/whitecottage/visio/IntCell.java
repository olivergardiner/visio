package uk.org.whitecottage.visio;

import uk.org.whitecottage.visio.jaxb.visio2003.CellType;

public class IntCell extends Cell {

	public IntCell(String type) {
		super(type);
	}

	public IntCell(String type, String formula, String unit, int value) {
		super(type);
		setFormula(formula);
		setUnit(unit);
		setValue(value);
	}

	public IntCell(String type, CellType cell) {
		super(type, cell);
	}

	public int getIntValue() {
		return Integer.valueOf(_cell.getValue());
	}

	public void setValue(int value) {
		setValue(String.valueOf(value));
	}
}
