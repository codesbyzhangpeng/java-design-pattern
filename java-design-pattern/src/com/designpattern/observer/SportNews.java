package com.designpattern.observer;

public class SportNews extends NewsSubject{
	private Newsletter currentNewslettter;
	
	public SportNews(Newsletter currentNewslettter) {
		this.currentNewslettter = currentNewslettter;
	}

	public Newsletter getCurrentNewslettter() {
		return currentNewslettter;
	}

	public void setCurrentNewslettter(Newsletter currentNewslettter) {
		this.currentNewslettter = currentNewslettter;
		System.out.println("A brand new newsletter appeared...");
		this.pushNews(this.currentNewslettter);
	}	
	
}
