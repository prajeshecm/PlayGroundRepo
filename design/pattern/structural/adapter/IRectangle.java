package com.sample.design.pattern.structural.adapter;

public interface IRectangle {

	/**
	 * interface square is totally incompatible with other interface rectangle.
	 * @param length
	 * @param breadth
	 */
	public  abstract void draw(int length, int breadth);

}
