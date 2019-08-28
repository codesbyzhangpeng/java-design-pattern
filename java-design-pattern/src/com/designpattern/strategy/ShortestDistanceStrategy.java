package com.designpattern.strategy;

import java.util.ArrayList;

public class ShortestDistanceStrategy implements RouteStrategy{

	@Override
	public void calculateRoute(ArrayList<Route> possibleRoutes) {
		Route chosenRoute = getRouteWithShortestDistance(possibleRoutes);
		System.out.println("The route has been calculated successfully!");
		System.out.println(chosenRoute);
	}

	private Route getRouteWithShortestDistance(ArrayList<Route> possibleRoutes) {
		Route bestRoute = possibleRoutes.get(0);
		for(Route route:possibleRoutes) {
			if(route.getDistanceInMeters() < bestRoute.getDistanceInMeters()) {
				bestRoute = route;
			}
		}
		return bestRoute;
	}

}
