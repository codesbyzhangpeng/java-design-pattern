package com.designpattern.builder;

public abstract class HouseBuilder {
	public abstract void setUpBasement();
	public abstract void workOnTheFloor();
	public abstract void workOntheKitchen();
	
	public abstract void workOnTheRoof();
	
	public abstract House getNewHouse();

}
