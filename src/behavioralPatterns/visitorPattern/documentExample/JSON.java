package behavioralPatterns.visitorPattern.documentExample;

public class JSON implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	
}
