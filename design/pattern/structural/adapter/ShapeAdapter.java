package com.sample.design.pattern.structural.adapter;

public  class ShapeAdapter implements ISquare{

	IRectangle rectangle;
	
	ShapeAdapter(IRectangle rectangle){
		System.out.println("INFO : ShapeAdapter Constructor :"+rectangle);
		this.rectangle = rectangle;
	}
	
	@Override
	public void draw(int side) {
		//working as a adapter for both the incompatible interfaces.
		System.out.println("INFO : Adapter called with side as : "+side);
		rectangle.draw(side, side);
	}

}
