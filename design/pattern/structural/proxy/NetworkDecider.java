package com.sample.design.pattern.structural.proxy;

/**
 * NetworkDecider classs decides which concrete class to initiate,
 * @author Arsha Prajesh
 *
 */
public class NetworkDecider {
	
	
	public static INetProvider getProxyProvider(){
		return new AttProxyImpl(new AttImpl() );
	}
	
	public static INetProvider getRealProvider(){
		return new AttImpl();
	}

}
