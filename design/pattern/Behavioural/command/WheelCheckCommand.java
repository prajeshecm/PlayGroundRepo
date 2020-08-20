package com.sample.design.pattern.Behavioural.command;

public class WheelCheckCommand implements IMechanicCommand{

	Mechanic mechanic = new Mechanic();
	
	public void execute() {
		System.out.println("DEBUG : WheelCheckCommand is started executing");
		mechanic.wheelCheck();
	}

}
