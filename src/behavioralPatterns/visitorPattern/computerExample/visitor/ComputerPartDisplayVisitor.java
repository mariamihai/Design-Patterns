package behavioralPatterns.visitorPattern.computerExample.visitor;

import behavioralPatterns.visitorPattern.computerExample.computer.*;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	@Override
	public void visit(Computer part) {
		System.out.println("Displaying Computer.");
	}

	@Override
	public void visit(Mouse part) {
		System.out.println("Displaying Mouse.");
	}

	@Override
	public void visit(Monitor part) {
		System.out.println("Displaying Monitor.");
	}

	@Override
	public void visit(Keyboard part) {
		System.out.println("Displaying Keyboard.");
	}

	
}
