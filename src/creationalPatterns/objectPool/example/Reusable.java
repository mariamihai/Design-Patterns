package creationalPatterns.objectPool.example;

/**
 * The resource to be reused. Database connection, etc.
 * 
 * @author miai
 */
class Reusable {

	private int id;
	
	public Reusable(int id) {
		this.id = id;
	}
	
	public String toString() {
		return "Reusable [" + id + "]";
	}
}
