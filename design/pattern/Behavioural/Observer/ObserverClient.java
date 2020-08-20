package com.sample.design.pattern.Behavioural.Observer;

public class ObserverClient {
	
	public static void main(String[] args) {
		Product prod = new Product();

	    //IProductObservable productObservable;
		//IProductObserver applebuyer = new AppleBuyer(prod);
		IProductObserver Ibmbuyer = new IBMBuyer(prod);
		
		prod.registerVendorTest("Apple");
		prod.setProductPrice(200);
		//prod.unRegisterVendor(applebuyer);
		
		prod.setProductPrice(300);	
	
	}

}
