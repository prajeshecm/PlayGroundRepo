package com.sample.design.pattern.structural.proxy;

public class AttImpl implements INetProvider{

	@Override
	public String getResource(String url) {
		System.out.println("INFO : requested website : "+url);
		return "enjoy the site";
	}

}
