package structuralPatterns.compositePattern.directoriesExample;

public class CompositePatternDemo {

	public static void main(String[] args) {
		File f1 = new File("file1", "ext1", "path/to/file");
		File f2 = new File("file2", "ext2", "path/to/file");
		File f3 = new File("file3", "ext1", "path/to/file");
		
		Directory d1 = new Directory("directory1", "path/to/directory");
		Directory d2 = new Directory("directory2", "path/to/directory");
		Directory d3 = new Directory("directory3", "path/to/directory");
		d1.add(d2);
		d1.add(f1);
		d1.add(f2);
		d2.add(d3);
		d2.add(f3);
		
		System.out.println(d1);
		System.out.println("   Components in directory: ");
		d1.getComponents().stream().forEach(System.out::println);
		
		System.out.println("\n   Do something:");
		d1.open();
		d2.open();
		f3.open();
		
	}
}
