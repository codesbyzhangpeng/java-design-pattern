package com.designpattern.strategy;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		
		ArrayList<Route> routelist = new ArrayList<Route>();

		Route route1 = new Route("Green route ", 22, 3000);
		Route route2 = new Route("Yellow Route", 17, 5000);
		Route route3 = new Route("Red Route", 20, 6000);
		
		routelist.add(route1);
		routelist.add(route2);
		routelist.add(route3);
		
		Navigation navigation = new Navigation(routelist);
		
		navigation.chooseStrategy(new ShortestTimeStrategy());
		navigation.calcualte();
		
		System.out.println("--------------------------------------------");
		
		navigation.chooseStrategy(new ShortestDistanceStrategy());
		navigation.calcualte();
		
	}


}
