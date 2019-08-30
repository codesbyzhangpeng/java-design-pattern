package com.designpattern.builder;

public class StoneHouseBuilder extends HouseBuilder{
		
	protected House house;
	
	public StoneHouseBuilder() {
		this.house = new House();
	}
	

	@Override
	public void workOnTheFloor() {
		house.setFloor("The floor of the stone house has been established...");
	}

	@Override
	public void workOntheKitchen() {
		house.setKitchen("A red kitchen of the stone house has been finished... ");
	}
	
	@Override
	public void setUpBasement() {
		house.setBasement("The basement of the stone house has been established...");
		System.out.println(house.getBasement());

	}

	@Override
	public void workOnTheRoof() {
		System.out.println("----------------");
		System.out.println(house.getRoofOfHouse());
		house.setRoofOfHouse("The roof of the Stone House has been established");
		System.out.println(house.getRoofOfHouse());
	}
	
	@Override
	public House getNewHouse() {
		return house;
	}



}
