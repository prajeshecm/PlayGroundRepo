package com.sample.design.pattern.Behavioural.command;

public class OilChangeCommand implements IMechanicCommand{

	Mechanic mechanic = new Mechanic();
	
	public void execute() {
		System.out.println("DEBUG : oilchangeCommand is started executing");
		mechanic.oilCheck();
	}

}
