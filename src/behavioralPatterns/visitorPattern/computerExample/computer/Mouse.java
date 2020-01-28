package behavioralPatterns.visitorPattern.computerExample.computer;

import behavioralPatterns.visitorPattern.computerExample.visitor.ComputerPartVisitor;

public class Mouse implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor visitor) {
		visitor.visit(this);
	}

}
