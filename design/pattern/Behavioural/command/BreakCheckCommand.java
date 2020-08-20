package com.sample.design.pattern.Behavioural.command;

public class BreakCheckCommand implements IMechanicCommand{

	Mechanic mechanic = new Mechanic();
	
	public void execute() {
		System.out.println("DEBUG : BreakCheckCommand is started executing");
		mechanic.breakCheck();
	}

}
