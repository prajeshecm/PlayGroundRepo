package com.sample.design.pattern.Creational.Singleton;

public class SingletonClient {

	
	public static void main(String[] args) {
		
	/*	
	    //Approach which shows we are calling the same instance again and again.
	    SingletonService s1 = new SingletonService();
		s1.sayHI("Balaji");

		SingletonService s2 = new SingletonService();
		s2.sayHI("ravi");
		
		SingletonService s3 = new SingletonService();
		s3.sayHI("shiva");
		
		System.out.println("s1 objcode ::"+s1.hashCode());
		System.out.println("s2 objcode ::"+s2.hashCode());
		System.out.println("s3 objcode ::"+s3.hashCode());*/
		
		
		SingletonService s1 = SingletonService.getInstance();
		s1.sayHI("Balaji");

		SingletonService s2 = SingletonService.getInstance();
		s2.sayHI("ravi");
		
		SingletonService s3 = SingletonService.getInstance();
		s3.sayHI("shiva");
		
		/*SingletonService s4 = new SingletonService();
		s3.sayHI("durai");*/
		System.out.println("s1 objcode ::"+s1.hashCode());
		System.out.println("s2 objcode ::"+s2.hashCode());
		System.out.println("s3 objcode ::"+s3.hashCode());
		
		/*//System.out.println("s4 objcode ::"+s4.hashCode());
		System.out.println("s1 getUUID ::"+s1.UUID.randomUUID());
		System.out.println("s2 getUUID ::"+s2.UUID.randomUUID());
		System.out.println("s3 getUUID ::"+s3.UUID.randomUUID());
		
		System.out.println("s1 getUUID version::"+s1.UUID);
		System.out.println("s2 getUUID version::"+s2.UUID.version());
		System.out.println("s3 getUUID version ::"+s3.UUID.version());
		
		
		System.out.println("s1 serialVersionUID ::"+s1.serialVersionUID);
		System.out.println("s2 serialVersionUID ::"+s2.serialVersionUID);
		System.out.println("s3 serialVersionUID ::"+s3.serialVersionUID);*/
		
	}
	 
}
