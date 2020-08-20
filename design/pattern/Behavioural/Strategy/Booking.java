package com.sample.design.pattern.Behavioural.Strategy;

import java.io.Serializable;

public class Booking implements Serializable{
	
	private static final long serialVersionUID = -5891412714047830458L;
	IPayment payment;

	Booking (IPayment payment){
		this.payment = payment;
	}
	
 
	public String doPay(int amount){
		return payment.doPayment(amount);
	}
 
}
