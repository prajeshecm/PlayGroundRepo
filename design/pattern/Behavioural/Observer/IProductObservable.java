package com.sample.design.pattern.Behavioural.Observer;

public interface IProductObservable {
	
	public void registerVendor(IProductObserver observer);
	
	public void unRegisterVendor(IProductObserver observer);
	
	public void notifyVendor();

}
