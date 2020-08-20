package com.sample.design.pattern.Creational.Factory;

public class BikeFactory extends VehicleFactory {
	 
	public Vehicle createVehicle() {
		return new Bike();
	}
	
	
 
}