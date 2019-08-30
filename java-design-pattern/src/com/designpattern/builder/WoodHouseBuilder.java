package com.designpattern.builder;

public class WoodHouseBuilder extends HouseBuilder {

	protected House house;
	
	public WoodHouseBuilder() {
		this.house = new House();		
	}
	
	@Override
	public void workOnTheFloor() {
		house.setFloor("The floor of the wood house has been finished...");
	}

	@Override
	public void workOntheKitchen() {
		house.setKitchen("A new kitchen for the wood house has been built up...");
	}
	
	
	@Override
	public void setUpBasement() {
		house.setBasement("The basement of the wood house has been established...");
	}

	@Override
	public void workOnTheRoof() {
		house.setRoofOfHouse("The roof of the wood House has been established");
	}


	@Override
	public House getNewHouse() {
		System.out.println(house);
		return house;
	}

}
