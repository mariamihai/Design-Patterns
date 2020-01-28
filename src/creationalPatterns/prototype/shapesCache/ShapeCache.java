package creationalPatterns.prototype.shapesCache;

import java.util.HashMap;

public class ShapeCache {

	private HashMap<String, Shape> shapeMap;
	
	public Shape getShape(String shape) {
		Shape cachedShape = shapeMap.get(shape);
		return (Shape) cachedShape.clone();
	}
	
	public void loadCache() {
		shapeMap = new HashMap<String, Shape>();
		
		Shape circle = new Circle();
		circle.setId("1");
		shapeMap.put("circle", circle);
		
		Shape rectangle = new Rectangle();
		rectangle.setId("2");
		shapeMap.put("rectangle", rectangle);
		
		Shape square = new Square();
		square.setId("3");
		shapeMap.put("square", square);
	}
}
