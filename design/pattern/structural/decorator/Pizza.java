package com.sample.design.pattern.structural.decorator;

public class Pizza implements IPizza{

	Pizza(){
	}
	
	@Override
	public int getCost() {
		System.out.println("10.00");
		return 10;
	}

	@Override
	public String getDetails() {
		System.out.println("Madeup with cheese and butter");
		return "Madeup with cheese and butter";
	}

}
