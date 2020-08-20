package com.sample.design.pattern.Behavioural.mediator;

import java.util.List;

public interface IChatRoom {
	
	public void addUser(User user);
	
	public void sendMessgae(String message,List<User> users, User messgeFrom);

}
