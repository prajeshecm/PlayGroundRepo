package com.sample.design.pattern.Behavioural.template;

public class Bike extends DriveTemplate{

	@Override
	public void doClutch() {
		System.out.println("put the bike clutch");
	}

	@Override
	public void setGear() {
		System.out.println("put the bike gear ..");
	}

}
