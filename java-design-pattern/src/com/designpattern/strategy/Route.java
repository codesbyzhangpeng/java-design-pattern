package com.designpattern.strategy;

public class Route {

	private String name;
	private int timeInMinutes;
	private int distanceInMeters;
	
	public Route(String name, int timeInMinutes, int distanceInMeters) {
		this.name = name;
		this.timeInMinutes = timeInMinutes;
		this.distanceInMeters = distanceInMeters;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTimeInMinutes() {
		return timeInMinutes;
	}
	public void setTimeInMinutes(int timeInMinutes) {
		this.timeInMinutes = timeInMinutes;
	}
	public int getDistanceInMeters() {
		return distanceInMeters;
	}
	public void setDistanceInMeters(int distanceInMeters) {
		this.distanceInMeters = distanceInMeters;
	}
	
	@Override
	public String toString() {
		return "Route [name=" + name + ", timeInMinutes=" + timeInMinutes + ", distanceInMeters=" + distanceInMeters
				+ "]";
	}
}
