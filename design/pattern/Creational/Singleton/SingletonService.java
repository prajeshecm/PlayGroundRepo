package com.sample.design.pattern.Creational.Singleton;

import java.io.Serializable;

public class SingletonService implements Serializable{
	
	public static final long serialVersionUID = 1L;
	
	public transient java.util.UUID UUID ;
	
	
	public java.util.UUID getUUID() {
		return UUID;
	}

	public void setUUID(java.util.UUID uUID) {
		UUID = uUID;
	}


	static SingletonService singletonInstance = null;
	
	private SingletonService(){
		//Making the class as singleton by declaring the constructor as private.
		System.out.println("SingletonService instance created in empty...");
	}
	
	public static SingletonService getInstance(){
		if ( singletonInstance  == null){
			System.out.println("SingletonService instance created...");
			singletonInstance = new SingletonService();
		}
		 return singletonInstance;
	}
	
	
	public String sayHI(String name){
		StringBuilder str= new StringBuilder();
		str.append("Hi,");
		str.append(" ");
		str.append(name);
		System.out.println(""+str.toString());
		return str.toString();
	}

}
