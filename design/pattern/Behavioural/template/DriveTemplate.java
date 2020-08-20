package com.sample.design.pattern.Behavioural.template;

public abstract class DriveTemplate {
	
	public  void startEngine(){
		//duplcate code for both car & bike so moved to the abstarct class.
		System.out.println("starting the engine");
	}
	
	public  void stopEngine(){
		//duplcate code for both car & bike so moved to the abstarct class.
		System.out.println("stopping the engine");
	}

	/** 
	 * implementation is not sure at this point or it get differ from the concrete/imple class so making the method as abstract
	 */
	public abstract void doClutch();
	
	/** 
	 * implementation is not sure at this point or it get differ from the concrete/imple class so making the method as abstract
	 */
	public abstract void setGear();
	
	/*
	 * this is the template pattern to drive the vehicle as per the ABC-Game requirement.
	 */
	public void driveTemplateWorkflow(){
		startEngine();
		doClutch();
		setGear();
		stopEngine();
	}
}
