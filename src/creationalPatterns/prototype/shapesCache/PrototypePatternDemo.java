package creationalPatterns.prototype.shapesCache;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		ShapeCache cache = new ShapeCache();
		cache.loadCache();
		
		System.out.println(cache.getShape("circle"));
		System.out.println(cache.getShape("rectangle"));
		System.out.println(cache.getShape("square"));
		
	}

}
