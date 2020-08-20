package com.sample.design.pattern.Behavioural.cor;

public class AccountHead extends Approver {
	 
	@Override
	public void approveRequest(LeaveRequest request) {
		if (request.getDays() > 15) {
			System.out.println("Leave request approved for " + request.getDays() + " days by AccountHead");
		} else {
			System.out.println("A.H cant approve");
			super.approveRequest(request);
		}
 
	}
 
}