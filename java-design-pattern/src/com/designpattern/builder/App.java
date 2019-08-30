package com.designpattern.builder;

public class App {
	public static void main(String[] args) {
		HouseBuilder woodHouse = new WoodHouseBuilder();
		HouseEngineer engineer = new HouseEngineer(woodHouse);
		engineer.buildHouse();
		engineer.getHouse();
		
		System.out.println("..................................");
		
		HouseBuilder stoneHouse = new StoneHouseBuilder();
		HouseEngineer engineer2 = new HouseEngineer(stoneHouse);
		engineer2.buildHouse();
		House house = engineer2.getHouse();
		System.out.println(house);
		System.out.println(house.getRoofOfHouse());
		
	}
}
