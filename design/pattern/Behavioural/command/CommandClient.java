package com.sample.design.pattern.Behavioural.command;

import java.util.TreeSet;

public class CommandClient {
	
	public static final String OIL_CHECK="OIL_CHECK";
	public static final String BREAK_CHECK="BREAK_CHECK";
	public static final String WHEEL_CHECK="WHEEL_CHECK";
    
	public static void main(String[] args) {
		Manager manager=new Manager();
	    
		//s1:Client is adding the request as  a command.
		IMechanicCommand oilCheckCommand = new OilChangeCommand();
		IMechanicCommand breakCheckcommand = new BreakCheckCommand();
		IMechanicCommand wheelCheckcommand = new WheelCheckCommand();
		
		//s2:and pass the comment manager/invoker.Then manager add those request.
		manager.addRequest(OIL_CHECK ,oilCheckCommand);
		manager.addRequest(BREAK_CHECK ,breakCheckcommand);
		manager.addRequest(WHEEL_CHECK ,wheelCheckcommand);
		System.out.println("---------------------");
		
		//s3:Manager process the request to mechanic based on the type.
		manager.processRequest(OIL_CHECK);
		System.out.println("---------------------");
		manager.processRequest(BREAK_CHECK);
		System.out.println("---------------------");
		manager.processRequest(WHEEL_CHECK);
		
	}

}
