package com.sample.design.pattern.Creational.Factory;

public class CarFactory extends VehicleFactory {
	 
	public Vehicle createVehicle() {
		return new Car();
	}
}
