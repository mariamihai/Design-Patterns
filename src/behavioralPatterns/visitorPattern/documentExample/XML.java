package behavioralPatterns.visitorPattern.documentExample;

public class XML implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
}
