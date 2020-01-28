package behavioralPatterns.visitorPattern.documentExample;

public interface Element {

	public void accept(Visitor visitor);
}
