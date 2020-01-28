package behavioralPatterns.visitorPattern.documentExample;

public class ElementVisitor implements Visitor {

	public void visit(Document element) {
		System.out.println("Processing a document.");
	}
	
	public void visit(JSON element) {
		System.out.println("Processing a JSON element.");
	}
	
	public void visit(XML element) {
		System.out.println("Processing a XML element.");
	}
}
