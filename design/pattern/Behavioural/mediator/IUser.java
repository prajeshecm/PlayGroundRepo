package com.sample.design.pattern.Behavioural.mediator;

import java.util.List;

public interface IUser {
	
	public void sendMessgae(String message,List<User> users, User messgeFrom);
	
	public void receiveMessage(String messgae,User user);

}
