package structuralPatterns.compositePattern.directoriesExample;

import java.util.List;
import java.util.ArrayList;

public class Directory extends Component {

	private List<Component> components = new ArrayList<Component>();
	
	public Directory(String fileName, String path) {
		super.setFileName(fileName);
		super.setPath(path);
	}
	
	@Override
	public void open() {
		System.out.println("Opening directory: " + super.getFileName());
	}

	public void add(Component c) {
		components.add(c);
	}
	public void remove(Component c) {
		components.remove(c);
	}
	
	public List<Component> getComponents() {
		return components;
	}
	
	public String toString() {
		return "Directory [ " + super.getFileName() + " ]";
	}
}
