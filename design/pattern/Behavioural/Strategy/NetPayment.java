package com.sample.design.pattern.Behavioural.Strategy;

public class NetPayment  implements IPayment{

	NetPayment(){
		System.out.println("NetPayment Constructor");
	}

	
	public String doPayment(int amount) {
		return "NetPayment done Successfully";
	}

}
