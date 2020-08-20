package com.sample.design.pattern.Behavioural.state;

public class HealthyState implements ISoliderState{

	public void obeyCommand(Solider solider) {
		System.out.println("HealthyState");
	}

}
