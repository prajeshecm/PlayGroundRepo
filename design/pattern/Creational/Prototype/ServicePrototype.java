package com.sample.design.pattern.Creational.Prototype;

public interface ServicePrototype extends Cloneable {
	public Bike clone() throws CloneNotSupportedException;
}