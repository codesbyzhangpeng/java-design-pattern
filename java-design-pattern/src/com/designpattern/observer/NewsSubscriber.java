package com.designpattern.observer;

public class NewsSubscriber implements NewsObserver{
	private String name;
	
	public NewsSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update(Newsletter newsletter) {
		System.out.println(this.name + " has received a updated news... with the topic" + newsletter.getTopic());
	}

}
