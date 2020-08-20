package com.sample.design.pattern.Behavioural.Strategy;

public class StrategyClient {
	
public static void main(String[] args) {
	//Making a strategy for using the CashPayment Algorithm.
	Booking cashBooking1 = new Booking(new CashPayment());
	String cashPayment1 = cashBooking1.doPay(10);
	System.out.println("cashPayment1 : "+cashPayment1);
	System.out.println("----------------------------------");
	
	//Making a strategy for using the CardPayment Algorithm.
	Booking cardBooking = new Booking(new CardPayment());
	String cardPayment = cardBooking.doPay(100);
	System.out.println("cardPayment : "+cardPayment);
	System.out.println("----------------------------------");
	
	//Making a strategy for using the NetPayment Algorithm.
	Booking netBooking = new Booking(new NetPayment());
	String netPayment = netBooking.doPay(100);
	System.out.println("netPayment : "+netPayment);
	
	}

}
