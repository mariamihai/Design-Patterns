package behavioralPatterns.visitorPattern.computerExample.computer;

import behavioralPatterns.visitorPattern.computerExample.visitor.ComputerPartVisitor;

public interface ComputerPart {

	public void accept(ComputerPartVisitor visitor);
}
