package behavioralPatterns.visitorPattern.computerExample.computer;

import java.util.ArrayList;
import java.util.List;

import behavioralPatterns.visitorPattern.computerExample.visitor.ComputerPartVisitor;

public class Computer implements ComputerPart {
	
	List<ComputerPart> parts = new ArrayList<ComputerPart>();
	
	public Computer(List<ComputerPart> parts) {
		super();
		this.parts = parts;
	}

	@Override
	public void accept(ComputerPartVisitor visitor) {
		parts.stream().forEach(part -> part.accept(visitor));
		
		visitor.visit(this);
	}

}
