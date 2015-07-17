package uk.org.whitecottage.visio;

import uk.org.whitecottage.visio.jaxb.visio2003.CellType;

public class Cell extends VisioElement {
	protected CellType _cell;
	protected String _type;

	public Cell(String type) {
		_type = type;
		String className = "uk.org.whitecottage.visio.jaxb.visio2003." + type + "Type";
		
		try {
			_cell = (CellType) Class.forName(className).newInstance();
		} catch (Exception e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Cell(String type, String formula, String unit, String value) {
		this(type);
		_cell.setF(formula);
		_cell.setUnit(unit);
		_cell.setValue(value);
	}
	
	public Cell(String type, CellType cell) {
		_type = type;
		_cell = cell;
	}

	public String getType() {
		return _type;
	}

	public String getFormula() {
		return _cell.getF();
	}

	public void setFormula(String formula) {
		_cell.setF(formula);
	}

	public String getUnit() {
		return _cell.getUnit();
	}

	public void setUnit(String unit) {
		_cell.setUnit(unit);
	}

	public String getValue() {
		return _cell.getValue();
	}

	public void setValue(String value) {
		_cell.setValue(value);
	}

	public CellType getCell() {
		return _cell;
	}
}
