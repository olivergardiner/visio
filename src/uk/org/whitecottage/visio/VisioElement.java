package uk.org.whitecottage.visio;

import java.util.List;

public abstract class VisioElement {
	protected Object findElement(List<Object> list, String type) {
		String className = "uk.org.whitecottage.visio.jaxb.visio2003." + type + "Type";
		Class<?> clazz;
		try {
			clazz = Class.forName(className);
			for (Object o: list) {
				if (clazz.isInstance(o)) {
					return o;
				}
			}
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
		}
		
		return null;
	}
}
