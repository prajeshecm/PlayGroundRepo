package com.sample.design.pattern.Behavioural.template;

public class Car extends DriveTemplate{

	@Override
	public void doClutch() {
		System.out.println("put the car clutch");
	}

	@Override
	public void setGear() {
		System.out.println("put the car Gear");
	}

}
