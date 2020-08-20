package com.sample.design.pattern.structural.Bridge;

public class ORMFramework implements IORMFramework{

	IJPA jpa;
	
	ORMFramework(IJPA jpa){
		 this.jpa = jpa;
	}
	
	@Override
	public void saveObj(Object object) {
		System.out.println("INFO : ORMFramework saveObj :"+object);
		jpa.persistObj(object);
		System.out.println("-------------------------------");
	}

}
