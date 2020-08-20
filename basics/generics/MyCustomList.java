package com.sample.generics;

import java.util.ArrayList;

//By extending this generic class to Number we are having below advantages:
	//1.we will restrict to only the class which extends to NUMBER
	//2.we will get all the in-built methods of Number (e.g , double below)
public class MyCustomList<T extends Number> {
	
	ArrayList<T> al = new ArrayList<T>();
	
	public void addElement(T val){
		System.out.println("Class Name : "+val.getClass().getSimpleName());
		System.out.println("Doubling the value :"+val.doubleValue());
		al.add(val);
	}
	
	public void removeElement(int index){
		al.remove(index);
		
	}
	
	public T getValue(int index){
		return al.get(index);
	}

}
