package behavioralPatterns.visitorPattern.computerExample.visitor;

import behavioralPatterns.visitorPattern.computerExample.computer.*;

public interface ComputerPartVisitor {

	public void visit(Computer part);
	public void visit(Mouse part);
	public void visit(Monitor part);
	public void visit(Keyboard part);
}
