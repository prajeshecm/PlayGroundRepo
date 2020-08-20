package com.sample.design.pattern.Creational.Factory;

public class FactoryClient {
	
	public static void main(String args[]) {
		VehicleFactory bikeFactory = new BikeFactory();
		//VehicleFactory carFactory = new CarFactory();

		Vehicle bike = bikeFactory.assembleVehicle();
		//Vehicle car = carFactory.assembleVehicle();

		if (bike instanceof Bike) {
			System.out.println("Bike object retrieved");
		}

		/*if (car instanceof Car) {
			System.out.println("Car object retrieved");
		}*/
	}

}