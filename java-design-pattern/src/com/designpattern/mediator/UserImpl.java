package com.designpattern.mediator;

public class UserImpl extends User{

	public UserImpl(ChatMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void sendMessage(String message) {
		System.out.println(this.getName() + "[sent]: " + message);
		mediator.sendToAll(message, this);
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println(this.name + " [received]: " +  message);
	}

	@Override
	public void sendToOne(String message, User user) {
		System.out.println(this.getName() + "[sent]: " + message);
		mediator.sendToOne(message, user);
	}
	
	

}
