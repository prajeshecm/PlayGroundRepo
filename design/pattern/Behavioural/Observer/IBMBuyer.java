package com.sample.design.pattern.Behavioural.Observer;

public class IBMBuyer implements IProductObserver{

	public IProductObservable productObservable;
	
	public Product product;
	
	public IBMBuyer(IProductObservable productObservable) {
		this.productObservable = productObservable;
		this.productObservable.registerVendor(this);
	} 

	public void notifyVendor(String author, int price) {
		System.out.println("Author :"+author+"\n"+ "price : "+price);
		System.out.println("-----------------------------------------");
		
	}

}
