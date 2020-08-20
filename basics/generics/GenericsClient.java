package com.sample.generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class GenericsClient {
	
	//Cover generics with generic class , generic method , extends , super, wildCard , CCMI scenario for customer usages.
	public static void main(String[] args) {
		
		
	try {
		ContainerObject obj = new ContainerObject(12, "hello");
		//ContainerObject obj2 = null;
		//System.out.println("obj2 :"+ obj2.toString());
		//String value = (String) obj.getItem1();//java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
	} catch (Exception e) {
		e.printStackTrace();
	}
	GenericContainer<Integer, String> containerGenric = new GenericContainer<Integer, String>(12,"hello");
	Integer value2 = containerGenric.getItem1();
	//Integer value2 = (Integer)containerGenric.getItem1(); // no need of type casting as compiler will take care of that
	System.out.println("value2 : "+value2);
	
	GenericContainer<String, String> containerGenric2 = new GenericContainer<String, String>();
	containerGenric2.addItem1("hiii", "hell000o");
	String value3 = containerGenric2.getItem1();
	System.out.println("value3 : "+value3);
	
	Set<String> set1 = new HashSet<String>();
	set1.add("hello");
	set1.add("how");
	//set1.add(10);
	set1.add("are u");
	
	
	Set<String> set2 = new HashSet<String>();
	set2.add("hello");
	set2.add("I am good");
	set2.add("how are u");
	
	Set<String> set3 = getUnionSet(set1,set2);
	
	
	Iterator<String> itr= set3.iterator();
	
	while(itr.hasNext()){
		String unionValue = itr.next();
		System.out.println("unionValue :"+unionValue);
	}
	
	invokeUserDefinedGenericCall();
	}
	
	
	//get the union from the two sets
	public static <E>Set<E> getUnionSet(Set<E> set1,Set<E> set2){
		Set<E> set3 = new HashSet<E>(set1);
		set3.addAll(set2);
		return set3;
	}

	
	
	
	public static void invokeUserDefinedGenericCall(){
		//UserDefinedContainer<List<ManagerTemp>> managerObjlist = new UserDefinedContainer<List<ManagerTemp>>();
		UserDefinedContainer<ManagerTemp> managerObj = new UserDefinedContainer<ManagerTemp>();
		
		/*List<ManagerTemp> mangerlist = new ArrayList<ManagerTemp>();
		
		ManagerTemp manager1 = new  ManagerTemp("shan", 150);
		manager1.setNoofEmployee(10);
		manager1.setRegion("chennai");
		//managerObj.setUserDefinedObj(manager1);
		
		ManagerTemp manager2 = new  ManagerTemp("shan", 150);
		manager2.setNoofEmployee(20);
		manager2.setRegion("bangaore");
		mangerlist.add(manager1);
		mangerlist.add(manager2);*/
		
		ManagerTemp manager1 = new  ManagerTemp("shan", 150);
		manager1.setNoofEmployee(10);
		manager1.setRegion("chennai");
		managerObj.setUserDefinedObj(manager1);
		
		ManagerTemp mt = managerObj.getUserDefinedObj();
		System.out.println("mt :"+ mt);
		
		
		UserDefinedContainer<EmployeeTemp> empObj = new UserDefinedContainer<EmployeeTemp>();
		EmployeeTemp employer1 = new  EmployeeTemp("praji", 140);
		empObj.setUserDefinedObj(employer1);
		
		EmployeeTemp et = empObj.getUserDefinedObj();
		System.out.println("et :"+ et);
		/*
*/	}
}
