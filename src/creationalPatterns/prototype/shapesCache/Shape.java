package creationalPatterns.prototype.shapesCache;

public abstract class Shape implements Cloneable {

	private String id = "";
	protected String type = "";
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}

	
	public abstract void draw();
	
	
	public Object clone() {
		Object clone = null;
		
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}

}
