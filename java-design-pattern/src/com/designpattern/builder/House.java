package com.designpattern.builder;

public class House {

	private String basement;
	private String floor;
	private String kitchen;
	private String roofOfHouse;
	
	public House() {
		
	}
	
	public String getBasement() {
		return basement;
	}
	public void setBasement(String basement) {
		this.basement = basement;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getKitchen() {
		return kitchen;
	}
	public void setKitchen(String kitchen) {
		this.kitchen = kitchen;
	}
	public String getRoofOfHouse() {
		return roofOfHouse;
	}
	public void setRoofOfHouse(String roofOfHouse) {
		this.roofOfHouse = roofOfHouse;
	}
	
	@Override
	public String toString() {
		return "House [basement=" + basement + ", floor=" + floor + ", kitchen=" + kitchen + ", roofOfHouse=" + roofOfHouse + "]";
	}	
}
