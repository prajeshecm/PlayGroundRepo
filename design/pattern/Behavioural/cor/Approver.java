package com.sample.design.pattern.Behavioural.cor;

public abstract class Approver {

	protected Approver nextApprover; 
	
	public void approveRequest(LeaveRequest request){
		System.out.println("approveRequest :"+nextApprover);
		nextApprover.approveRequest(request);
	}
	
	//setting the reference to the next controller.
	public void setNext(Approver approver){
		System.out.println("setNext :"+approver);
		this.nextApprover = approver;
	}
}
