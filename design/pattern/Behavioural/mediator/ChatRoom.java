package com.sample.design.pattern.Behavioural.mediator;

import java.util.ArrayList;
import java.util.List;


public class ChatRoom implements IChatRoom{

	List<User> userList;
	
	ChatRoom(){
		userList = new ArrayList<User>();
	}
	
	public void addUser(User user) {
		//real time this is the place where we have to register/add all the "service/MQ/End-point" to the mediator.
		System.out.println("adding user :"+user.toString());
		userList.add(user);
	}

	public void sendMessgae(String message, List<User> users, User messgeFrom) {
		System.out.println("DEBUG : send chat room messgae");
		for (User usersVar : users){
			if(usersVar.hashCode()!=messgeFrom.hashCode()){
				usersVar.receiveMessage(message, usersVar);
			}
		}
	}

	 

}
