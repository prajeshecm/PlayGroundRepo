package com.sample.design.pattern.Behavioural.Strategy;

public class CashPayment implements IPayment{
	
	CashPayment(){
		System.out.println("CashPayment Constructor");
	}

	public String doPayment(int amount) {
		return "CashPayment done Successfully";
	}

}
