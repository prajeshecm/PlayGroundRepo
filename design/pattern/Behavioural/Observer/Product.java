package com.sample.design.pattern.Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements IProductObservable{
	public List<IProductObserver>  vendorsList = new ArrayList<IProductObserver>();
	public int productPrice;
	
	Product(){
	}
	
	public void registerVendor(IProductObserver observer) {
		System.out.println("registering the observer :"+observer);
		vendorsList.add(observer);
	}

	public void registerVendorTest(String register) {
		System.out.println("registerVendorTest the observer :"+register);
		IProductObserver observer = null;
		if(register.equalsIgnoreCase("Apple")){
			observer = new AppleBuyer();
		}
		vendorsList.add(observer);
	}
	
	
	public void unRegisterVendor(IProductObserver observer) {
		System.out.println("unRegisterVendor :"+observer);
		if(vendorsList.contains(observer)){
			vendorsList.remove(observer);
		}
	}
	
	

	public void notifyVendor() {
		for (IProductObserver vendor : vendorsList ){
			System.out.println("notifyVendor :"+vendor);
			vendor.notifyVendor("abc", productPrice);
		}
	}
	
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
		notifyVendor();
	}
	
	public int getProductPrice() {
		return productPrice;
	}

}
