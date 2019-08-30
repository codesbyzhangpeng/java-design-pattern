package com.designpattern.abstractfactory;

public class FlyRegulator extends Regulator{
	
	public FlyRegulator() {
		System.out.println("The FlyRegulator has been created successfully...");
	}

	@Override
	public void increaseVoltage() {
		System.out.println("The voltage of Flyegulator has been increased successfully...");
	}
}
