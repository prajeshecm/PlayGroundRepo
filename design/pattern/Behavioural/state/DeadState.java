package com.sample.design.pattern.Behavioural.state;

public class DeadState implements ISoliderState{

	public void obeyCommand(Solider solider) {
		System.out.println("DEBUG : Dead State..");
	}
	
}