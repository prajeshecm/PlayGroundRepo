package com.sample.design.pattern.Behavioural.command;

import java.util.HashMap;
import java.util.Map;

public class Manager {

	
	/**
	 * Kind of broker or invoker just receive the request and process it.
	 */
	Map<String,IMechanicCommand> requestMap = new HashMap<String,IMechanicCommand>();
	IMechanicCommand command;
	
	public void addRequest(String requesType,IMechanicCommand command){
		System.out.println("INFO: adding the request : " + requesType);
		requestMap.put(requesType,command);
	}
	
	public void processRequest(String requesType){
		System.out.println("INFO: processing the request :"+requesType);
		if(requestMap.containsKey(requesType)){
			requestMap.get(requesType).execute();
		}
	}
}
