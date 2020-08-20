package com.sample.design.pattern.Behavioural.state;

public class StateClient {
	
	public static void main(String[] args) {
		behavebyState(4);
		behavebyState(3);
		behavebyState(11);
		
	}
		public static void behavebyState(int noOfBullets){
			System.out.println("INFO : no_of_bullets : "+noOfBullets);
			Solider solider = new Solider();
			if(noOfBullets >= 4 && noOfBullets <=10){
				//solider.setSoliderstate(new InjuredState());
				solider.setSoliderstate(solider.getInjuredState());
				solider.doActionByState(solider);
			}else if(noOfBullets >10){
				solider.setSoliderstate(new DeadState());
				solider.doActionByState(solider);
			}else if(noOfBullets >= 1 && noOfBullets <=3){
				solider.setSoliderstate(new HealthyState());
				solider.doActionByState(solider);
			}
		}
}
