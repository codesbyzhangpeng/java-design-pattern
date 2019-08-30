package com.designpattern.decorator;

public class MacbookAir implements Macbook{

	@Override
	public String getDescription() {
		return "Macbook Air \n Standard Edition...";
	}

	@Override
	public double getPrice() {
		return 899.00;
	}

	@Override
	public void increaseVoluem() {
		System.out.println("The volume of the Macbook Air has been increased...");
	}

}
