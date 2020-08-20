package com.sample.design.pattern.Behavioural.Observer;

public class AppleBuyer implements IProductObserver {

public IProductObservable productObservable;
	
	public AppleBuyer(IProductObservable productObservable) {
		this.productObservable = productObservable;
		this.productObservable.registerVendor(this);
	} 
	
	public AppleBuyer( ) {
	} 
	
	
	public void notifyVendor(String author, int price) {
		System.out.println("Author :"+author+"\n"+ "price : "+price);
		System.out.println("-----------------------------------------");
	}

}
