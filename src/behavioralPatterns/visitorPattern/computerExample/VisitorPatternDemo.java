package behavioralPatterns.visitorPattern.computerExample;

import java.util.ArrayList;
import java.util.List;

import behavioralPatterns.visitorPattern.computerExample.computer.*;
import behavioralPatterns.visitorPattern.computerExample.visitor.*;

public class VisitorPatternDemo {

	public static void main(String[] args) {
		ComputerPartVisitor visitor = new ComputerPartDisplayVisitor();
		
		ComputerPart keyboard = new Keyboard();
		ComputerPart mouse = new Mouse();
		ComputerPart monitor = new Monitor();

		List<ComputerPart> parts = new ArrayList<ComputerPart>();
		parts.add(keyboard);
		parts.add(mouse);
		parts.add(monitor);
		ComputerPart computer = new Computer(parts);
		
		monitor.accept(visitor);
		System.out.println();
		computer.accept(visitor);
	}

}
