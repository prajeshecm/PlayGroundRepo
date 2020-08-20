package com.sample.design.pattern.Behavioural.cor;

public class Manager extends Approver {
	 
	@Override
	public void approveRequest(LeaveRequest request) {
		if (request.getDays() <= 15 && request.getDays() > 5) {
			System.out.println("Leave request approved for " + request.getDays() + " days by Manager");
		} else {
			System.out.println("Manager cant approve");
			super.approveRequest(request);
		}
 
	}
 
}