package com.sample.design.pattern.structural.decorator;

public class DecoratorClient {
	
	public static void main(String[] args) {
		
		//Existing object with cost and its details.
		IPizza pizza = new Pizza();
		pizza.getCost();
		pizza.getDetails();
		
		//Same object adding Sauce to it then whats the cost and its details of the same object..
		System.out.println("-----------------------------");
		IPizza pizzaAfterSause = new AddSauce(pizza);
		pizzaAfterSause.getCost();
		pizzaAfterSause.getDetails();
		System.out.println("-----------------------------");
		
	}

}
