package com.sample.generics;

public class GenericContainer <T,E> extends Number{
	
	 
	private static final long serialVersionUID = -9091500668791320878L;
	T item1;
	E item2;

	GenericContainer(){
		
	}
	
	GenericContainer(T item1,E item2){
		this.item1=item1;
		this.item2=item2;
		
	}

	public T getItem1() {
		return item1;
	}

	public void setItem1(T item1) {
		this.item1 = item1;
	}

	public E getItem2() {
		return item2;
	}

	public void setItem2(E item2) {
		this.item2 = item2;
	}
	
	
	public void addItem1(T item1,E item2){
		this.item1=item1;
		this.item2=item2;
	}

	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}

}
