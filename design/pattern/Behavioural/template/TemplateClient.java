package com.sample.design.pattern.Behavioural.template;

public class TemplateClient {
	
	public static void main(String[] args) {
		DriveTemplate driveTemplateBike = new Bike();
		driveTemplateBike.driveTemplateWorkflow();
		
		DriveTemplate driveTemplateCar = new Car();
		driveTemplateCar.driveTemplateWorkflow();
		
	}
}
