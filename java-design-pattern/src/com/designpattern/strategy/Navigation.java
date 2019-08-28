package com.designpattern.strategy;

import java.util.ArrayList;

public class Navigation {

	private ArrayList<Route> possibleRoute;
	private RouteStrategy chosenStrategy;
	
	public Navigation(ArrayList<Route> possibleRoute) {
		super();
		this.possibleRoute = possibleRoute;
	}

	public void chooseStrategy(RouteStrategy strategy) {
		this.chosenStrategy = strategy;
	}
	
	public void calcualte() {
		System.out.println("The route will be calculated...");
		chosenStrategy.calculateRoute(possibleRoute);
	}
	
	
}
