package com.designpattern.mediator;

public interface ChatMediator {
	public void addUsers(User user);
	public void sendToOne(String message, User user);
	public void sendToAll(String message, User user);
}
