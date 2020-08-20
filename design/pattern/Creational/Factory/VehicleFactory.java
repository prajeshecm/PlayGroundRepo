package com.sample.design.pattern.Creational.Factory;

public abstract class VehicleFactory {
	 
	Vehicle vehicle;
	public Vehicle assembleVehicle() {
		System.out.println("Starting to build vehicle");
		vehicle = createVehicle();
		System.out.println("Mounting vehicle parts");
		return vehicle;
	}
	protected abstract Vehicle createVehicle();
}