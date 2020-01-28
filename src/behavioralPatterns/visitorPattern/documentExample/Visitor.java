package behavioralPatterns.visitorPattern.documentExample;

public interface Visitor {
	
	public void visit(Document element);
	public void visit(JSON element);
	public void visit(XML element);
}
