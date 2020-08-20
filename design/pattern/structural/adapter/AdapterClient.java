package com.sample.design.pattern.structural.adapter;

public class AdapterClient {
	
	/**
	 *  interface square is totally incompatible with other interface rectangle.
	 *  ShapeAdapter working as a adapter for both the incompatible interfaces.
	 * @param args
	 */
	public static void main(String[] args) {
		IRectangle rectangle = new RectangleImple();
		ISquare square = new ShapeAdapter(rectangle);
		square.draw(10);
	}
}
