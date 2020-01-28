package structuralPatterns.compositePattern.directoriesExample;

public abstract class Component {

	private String path;
	private String fileName;
	
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public abstract void open();
}
