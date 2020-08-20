package com.sample.design.pattern.Behavioural.state;

public class InjuredState implements ISoliderState{

	public void obeyCommand(Solider solider) {
		System.out.println("DEBUG : Injured State..");
	}
	
}