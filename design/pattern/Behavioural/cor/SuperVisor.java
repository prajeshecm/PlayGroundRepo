package com.sample.design.pattern.Behavioural.cor;

public class SuperVisor extends Approver {
	 
	@Override
	public void approveRequest(LeaveRequest request) {
 
		if (request.getDays() <= 5) {
			System.out.println("Leave request approved for " + request.getDays() + " days by Supervisor");
		} else {
			System.out.println("SuperVisor cant approve");
			super.approveRequest(request);
		}
 
	}
 
}