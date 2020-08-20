package com.sample.design.pattern.
structural.decorator;

public class AddSauce extends PizzaDecorator{

	IPizza pizza;
	
	public AddSauce(IPizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public int getCost() {
		int cost_After_Sauce =pizza.getCost()+2;
		System.out.println("cost_After_Sause :"+cost_After_Sauce);
		return cost_After_Sauce;
	}

	@Override
	public String getDetails() {
		String details_After_Sauce =pizza.getDetails()+" added tomato sause";
		System.out.println("details_After_Sause :"+details_After_Sauce);
		return details_After_Sauce+": "+newFunctionDub();
	}
	
	public String newFunctionDub(){
		System.out.println("new function");
		return "new function";
	}

}
