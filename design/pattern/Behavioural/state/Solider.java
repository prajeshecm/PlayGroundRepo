package com.sample.design.pattern.Behavioural.state;

public class Solider {
	
	ISoliderState healthyState;
	
	ISoliderState injuredState;
	
	ISoliderState deadState;
	
	ISoliderState soliderstate;
	
	Solider(){
		this.healthyState = new HealthyState();
		this.injuredState = new InjuredState();
		this.deadState = new DeadState();
		this.soliderstate = healthyState;
	}
	
	public void doActionByState(Solider solider){
		soliderstate.obeyCommand(solider);
	}

	public ISoliderState getHealthyState() {
		return healthyState;
	}

	public void setHealthyState(ISoliderState healthyState) {
		this.healthyState = healthyState;
	}

	public ISoliderState getInjuredState() {
		return injuredState;
	}

	public void setInjuredState(ISoliderState injuredState) {
		this.injuredState = injuredState;
	}

	public ISoliderState getDeadState() {
		return deadState;
	}

	public void setDeadState(ISoliderState deadState) {
		this.deadState = deadState;
	}

	public ISoliderState getSoliderstate() {
		return soliderstate;
	}

	public void setSoliderstate(ISoliderState soliderstate) {
		this.soliderstate = soliderstate;
	}
}
