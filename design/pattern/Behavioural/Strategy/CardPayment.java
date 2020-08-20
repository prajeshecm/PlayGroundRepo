package com.sample.design.pattern.Behavioural.Strategy;

public class CardPayment implements IPayment{
	
	CardPayment(){
		System.out.println("CardPayment Constructor");
	}

	public String doPayment(int amount) {
		return "CardPayment done Successfully";
	}

}
