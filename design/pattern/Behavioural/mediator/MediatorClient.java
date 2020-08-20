package com.sample.design.pattern.Behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorClient {
	
	/**
	 * Scenario : ABC-Corporate has a 5 people and they have to communicate each other , but who will communicate with whom we will not know,
	 * Anyone can communicate with anyone.
	 * Achiveing this using a mediator pattern.
	 * 
	 * Users(with Actions): User(send and receive message) and ChatRoom(addUser and sendMessgae)
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//addUsers 
		User usertoadd = new User();
		usertoadd.setUserName("Balaji");
		usertoadd.addUser(usertoadd);
		
		User usertoadd2 = new User();
		usertoadd2.setUserName("Shiva");
		usertoadd2.addUser(usertoadd2);
		
		User usertoadd3 = new User();
		usertoadd3.setUserName("Ravi");
		usertoadd3.addUser(usertoadd3);
		
		User usertoadd4 = new User();
		usertoadd4.setUserName("Prabhakar");
		usertoadd4.addUser(usertoadd4);
		
		User usertoadd5 = new User();
		usertoadd5.setUserName("Joy");
		usertoadd5.addUser(usertoadd5);
		
		List<User> users = new ArrayList();
		users.add(usertoadd);
		users.add(usertoadd2);
		users.add(usertoadd3);
		users.add(usertoadd4);
		
		// sending a message to the mediator.
		usertoadd.sendMessgae("Can we go for a movie???", users, usertoadd);
		
		//receiving a message from mediator.
		usertoadd3.receiveMessage("sure boss !!!", usertoadd3);
		/*IChatRoom chatRoom = new ChatRoom();
		chatRoom.sendMessgae(message, users, messgeFrom)*/
	}

}
