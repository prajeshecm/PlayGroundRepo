package com.sample.design.pattern.structural.adapter;

public class RectangleImple implements IRectangle{

	@Override
	public void draw(int length, int breadth) {
		System.out.println("INFO : rectangle called with lenght and breadth as :"+length +" , breadth :"+breadth);
	}

}
