package com.designpattern.mediator;

public class Demo {
	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		
		User user1 = new UserImpl(mediator, "Tom Swift");
		User user2 = new UserImpl(mediator, "Maria Chang");
		User user3 = new UserImpl(mediator, "Chris Maier");
		User user4 = new UserImpl(mediator, "Natalia Ted");
		
		mediator.addUsers(user1);
		mediator.addUsers(user2);
		mediator.addUsers(user3);
		mediator.addUsers(user4);

		user1.sendMessage("Hi, how are you guys?");
		
		user1.sendToOne("Hi what's up?", user2);
	}
}
