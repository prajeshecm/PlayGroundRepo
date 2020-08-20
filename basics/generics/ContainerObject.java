package com.sample.generics;

public class ContainerObject {

	
	Object item1;
	Object item2;

	ContainerObject(Object item1,Object item2){
		this.item1=item1;
		this.item2=item2;
		
	}

	public Object getItem1() {
		return item1;
	}

	public void setItem1(Object item1) {
		this.item1 = item1;
	}

	public Object getItem2() {
		return item2;
	}

	public void setItem2(Object item2) {
		this.item2 = item2;
	}
	
	
}
