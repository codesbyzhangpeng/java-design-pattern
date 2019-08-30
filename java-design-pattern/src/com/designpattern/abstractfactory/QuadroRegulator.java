package com.designpattern.abstractfactory;

public class QuadroRegulator extends Regulator{
	
	public QuadroRegulator() {
		System.out.println("The QuadroRegulator has been created successfully...");
	}

	@Override
	public void increaseVoltage() {
		System.out.println("The voltage of QuadroRegulator has been increased successfully...");
	}
}
