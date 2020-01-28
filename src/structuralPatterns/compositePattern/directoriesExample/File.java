package structuralPatterns.compositePattern.directoriesExample;

public class File extends Component {

	private String extension;
	
	public File(String fileName, String extension, String path) {
		super.setFileName(fileName);
		super.setPath(path);
		setExtension(extension);		
	}
	
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}

	@Override
	public void open() {
		System.out.println("Opening file: " + super.getFileName());
	}
	
	public String toString() {
		return "File [ " + super.getFileName() + "." + getExtension() + " ]";
	}
}
