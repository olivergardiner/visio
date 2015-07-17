package uk.org.whitecottage.visio;

import java.util.ArrayList;
import java.util.List;

import uk.org.whitecottage.visio.jaxb.visio2003.PageType;
import uk.org.whitecottage.visio.jaxb.visio2003.ShapeType;
import uk.org.whitecottage.visio.jaxb.visio2003.ShapesType;

public class Page extends VisioElement {
	protected PageType _page;
	protected ShapesType _shapes;
	
	protected List<Shape> shapes;

	public Page() {
		shapes = new ArrayList<Shape>();
	}

	public Page(PageType page) {
		this();
		
		_page = page;
		
		for (Object o: page.getPageSheetOrShapesOrConnects()) {
			if (o instanceof ShapesType) {
				_shapes = (ShapesType) o;
			}
		}
		
		if (_shapes == null) {
			_shapes = new ShapesType();
			page.getPageSheetOrShapesOrConnects().add(_shapes);
		}
		
		for (ShapeType shape: _shapes.getShape()) {
			shapes.add(new Shape(shape));
		}
	}
	
	public void addShape(Shape shape) {
		shapes.add(shape);
		_shapes.getShape().add(shape.getShape());
	}
}
