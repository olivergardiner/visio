package uk.org.whitecottage.visio;

import uk.org.whitecottage.visio.jaxb.visio2003.CellType;

public class DoubleCell extends Cell {

	public DoubleCell(String type) {
		super(type);
	}

	public DoubleCell(String type, String formula, String unit, Double value) {
		super(type);
		setFormula(formula);
		setUnit(unit);
		setValue(value);
	}

	public DoubleCell(String type, CellType cell) {
		super(type, cell);
	}

	public double getDoubleValue() {
		return Double.valueOf(_cell.getValue());
	}

	public void setValue(Double value) {
		setValue(String.valueOf(value));
	}
}
