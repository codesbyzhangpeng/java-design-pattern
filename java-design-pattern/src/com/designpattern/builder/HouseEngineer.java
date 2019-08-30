package com.designpattern.builder;

public class HouseEngineer {

	public HouseBuilder houseBuilder;

	public HouseEngineer(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	public void buildHouse() {
		houseBuilder.setUpBasement();
		houseBuilder.workOnTheFloor();
		houseBuilder.workOntheKitchen();
		houseBuilder.workOnTheFloor();
	}
	
	public House getHouse() {
		return houseBuilder.getNewHouse();
	}
	
	
}
