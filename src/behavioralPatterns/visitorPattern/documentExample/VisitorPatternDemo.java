package behavioralPatterns.visitorPattern.documentExample;

public class VisitorPatternDemo {

	public static void main(String[] args) {
		Visitor v = new ElementVisitor();
		 
        Document d = new Document();
        d.elements.add(new JSON());
        d.elements.add(new JSON());
        d.elements.add(new XML());
 
        d.accept(v);
	}

}
