package behavioralPatterns.visitorPattern.documentExample;

import java.util.ArrayList;
import java.util.List;

public class Document implements Element {
	
	List<Element> elements = new ArrayList<Element>();
		

	public Document() {}

	public Document(List<Element> elements) {
		super();
		this.elements = elements;
	}
	
	public void add(Element element) {
		elements.add(element);
	}


	@Override
	public void accept(Visitor v) {
		elements.stream().forEach(e -> e.accept(v));

		v.visit(this);
	}
}
