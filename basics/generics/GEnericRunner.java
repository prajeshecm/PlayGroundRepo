package com.sample.generics;

import java.util.ArrayList;
import java.util.List;


//https://www.youtube.com/watch?v=v4o0wyFPwEs&t=21s
public class GEnericRunner {
	
	
	public static void main(String[] args) {
		System.out.println("**********************GENERIC CLASS******************************");
		/*MyCustomList<String> list1 = new MyCustomList<String>();
		list1.addElement("hi");
		list1.addElement("hello how are u");
		System.out.println("result value :"+list1.getValue(1));
		*/
		
		MyCustomList<Integer> list2 = new MyCustomList<Integer>();
		list2.addElement(Integer.valueOf(10));
		list2.addElement(Integer.valueOf(50));
		System.out.println("result value :"+list2.getValue(1));
		
		System.out.println("**********************GENERIC METHOD******************************");
		//ArrayList<Integer> test = new ArrayList<Integer>(List.class.o
		ArrayList<Integer> arrayTest = new ArrayList<Integer>();
		arrayTest.add(10);
		arrayTest.add(20);
		arrayTest.add(30);
				
		Integer intVal = duplicateValueGenerically(new Integer(10));
		System.out.println("intVal : "+intVal.getClass().getSimpleName());
		List<Integer> arrayVal = duplicateValueGenerically(arrayTest);
		System.out.println("arrayVal : "+arrayVal.getClass().getSimpleName());
		System.out.println("arrayVal number :"+arrayVal);
		String strVal = duplicateValueGenerically(new String("Hello"));
		System.out.println("strVal : "+strVal.getClass().getSimpleName());
		
		System.out.println("****************WILDCARD TEST************************************");
		
		ArrayList<Double> arrayDoubleTest = new ArrayList<Double>();
		arrayDoubleTest.add(1.1);
		arrayDoubleTest.add(2.2);
		arrayDoubleTest.add(3.3);
		
		ArrayList<Float> arrayFloatTest = new ArrayList<Float>();
		arrayFloatTest.add(1f);
		arrayFloatTest.add(2f);
		arrayFloatTest.add(3f);
		
		//sumOfNumbers(List.of(1l,2l,3l));
		sumOfNumbers(arrayTest);
		sumOfNumbers(arrayDoubleTest);
		
		sumOfNumbers(arrayFloatTest);
	}
	

	// this duplcateValue method will be used by String , so we need to refactor this method to use it by any type.
	public  static String duplicateValue(String value){
		return value;
	}

	//this method is converted as generics from the above method "duplicateValue".
	public  static <V > V duplicateValueGenerically(V value){
		if (value instanceof Integer){
			// value += value;
			System.out.println("integer type");
		}else if (value instanceof String){
			  //value.concat(value);
			System.out.println("string type");
		}else if (value instanceof List){
			  //value.addAll(value);
			System.out.println("list type");
	}
		return value;
	}
	
	
	//Any list (wildcard of any list) which extends numbers
	static double sumOfNumbers(List<? extends Number> numbers){
		double value = 0.0;
		for (Number number:numbers){
			value += number.doubleValue();
		}
		System.out.println("value :"+value+", type :"+numbers.getClass().getSimpleName());
		return value;
	}
}
