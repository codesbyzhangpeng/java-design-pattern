package com.designpattern.factory;

public class App {
	public static void main(String[] args) {
		Logistic logistic1 = new LogisticChoice("container");
		Transport transportViaContainer = logistic1.getTransport();
		transportViaContainer.doSomething();
		
		System.out.println("--------------------------------------------------");
		
		new LogisticChoice("train").getTransport().doSomething();
		
		System.out.println("--------------------------------------------------");
		
		new LogisticChoice("flight").getTransport().doSomething();
	}
}
