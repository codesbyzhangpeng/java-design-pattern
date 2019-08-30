package com.designpattern.decorator;

public class MacbookPro implements Macbook{

	@Override
	public String getDescription() {
		return "Macbook Pro \n Macbook Standard Edition";
	}

	@Override
	public double getPrice() {
		return 1199.00;
	}

	@Override
	public void increaseVoluem() {
		System.out.println("The volume of Macbook pro has been increased...");
	}

}
