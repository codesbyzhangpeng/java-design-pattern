package com.designpattern.mediator;

import java.util.ArrayList;

public class ChatMediatorImpl implements ChatMediator{

	private ArrayList<User> userList;
	
	public ChatMediatorImpl() {
		this.userList = new ArrayList<User>();
	}

	@Override
	public void addUsers(User user) {
		userList.add(user);
	}

	@Override
	public void sendToAll(String message, User user) {
		for(User u: userList) {
			if(u!=user) {
				u.receiveMessage(message);
			}
		}
	}

	@Override
	public void sendToOne(String message, User user) {
		user.receiveMessage(message);
	}
	
}
