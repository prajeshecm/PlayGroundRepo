package com.sample.design.pattern.structural.Bridge;

public class Hibernate implements IJPA {

	@Override
	public void persistObj(Object object) {
		System.out.println("INFO : Hibernate persisObj :"+object);
	}

}
