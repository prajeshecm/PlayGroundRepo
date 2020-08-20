package com.sample.design.pattern.Behavioural.cor;

public class LeaveSystem {
	 
	public static void main(String[] args) {
 
		Approver supervisor = new SuperVisor();
		Approver manager = new Manager();
		Approver accountHead = new AccountHead();
 
		//reference to the other receiver/controller.
		supervisor.setNext(manager);
		manager.setNext(accountHead);
 
		//Case 1: where the first handler is responding.
		supervisor.approveRequest(new LeaveRequest(4));
		//Case 2: where the first&second handler cant respond and send back to third handler.
		supervisor.approveRequest(new LeaveRequest(40));
		//Case 3: where the first handler cant respond and send back to second handler.
		supervisor.approveRequest(new LeaveRequest(12));
 
	}
 
}