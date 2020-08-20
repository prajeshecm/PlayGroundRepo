package com.sample.design.pattern.structural.proxy;

public class BrowserClient {
	
	public static void main(String[] args) {
		System.out.println("DEBUG : started the Proxy pattern");
		String response1 = NetworkDecider.getProxyProvider().getResource("www.google.com");
		System.out.println("Google respone from browser  :"+response1);
		System.out.println("---------------------------------------");
		String response2 = NetworkDecider.getProxyProvider().getResource("www.gaming.com");
		System.out.println("Google respone from browser  :"+response2);
	}

}
