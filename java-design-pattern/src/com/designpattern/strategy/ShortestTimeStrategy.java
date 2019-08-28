package com.designpattern.strategy;

import java.util.ArrayList;

public class ShortestTimeStrategy implements RouteStrategy{

	@Override
	public void calculateRoute(ArrayList<Route> possibleRoutes) {
		Route chosenRoute = getRouteWithShortestTime(possibleRoutes);
		System.out.println("The route has been calculated successfully!");
		System.out.println(chosenRoute);
	}

	private Route getRouteWithShortestTime(ArrayList<Route> possibleRoutes) {
		Route bestRoute = possibleRoutes.get(0);
		for(Route route:possibleRoutes) {
			if(route.getTimeInMinutes() < bestRoute.getTimeInMinutes()) {
				bestRoute = route;
			}
		}
		return bestRoute;
	}

}
