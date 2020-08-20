package com.sample.design.pattern.Creational.Prototype;

public class Client {
	
	public static void main(String []args){
		try {
			System.out.println("Creating a new object now");
			Bike bike = new Bike("Honda", 250);
			System.out.println("Object creation done");
			long start = System.currentTimeMillis();
			System.out.println("Creating clone now");
			Bike clonedBike = (Bike)bike.clone();
			long end = System.currentTimeMillis();
			System.out.println("Time required = " + (end - start));
			System.out.println("Clone created");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}