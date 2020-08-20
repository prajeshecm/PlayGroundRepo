package com.sample.design.pattern.Behavioural.mediator;

import java.util.List;

public class User implements IUser{

	 public String userName;
	 
	 public IChatRoom chatRoom;
	 
	 public User(){
		 
		 
	 }
		 
	 public void addUser(User user){
		 chatRoom =new ChatRoom();
		 chatRoom .addUser(user);
	 }

	public void sendMessgae(String message, List<User> users,User messgeFrom) {
		System.out.println("DEBUG : user sending message");
		chatRoom =new ChatRoom();
		chatRoom .sendMessgae(message, users, messgeFrom);
	}

	public void receiveMessage(String messgae, User user) {
		System.out.println("user :" +user+" receiving message:: "+messgae);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + "]";
	}
	
	

}
