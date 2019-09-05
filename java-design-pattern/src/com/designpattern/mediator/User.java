package com.designpattern.mediator;

public abstract class User {
	
	protected ChatMediator mediator;
	protected String name;
	
	public User(ChatMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	public abstract void sendMessage(String message);
	
	public abstract void sendToOne(String message, User user);
	
	public abstract void receiveMessage(String message);
	
	public ChatMediator getMediator() {
		return mediator;
	}

	public void setMediator(ChatMediator mediator) {
		this.mediator = mediator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
