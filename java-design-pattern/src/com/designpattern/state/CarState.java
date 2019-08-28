package com.designpattern.state;

public class CarState implements State{

	private AmphibiousVehicle vehicle;

	public CarState(AmphibiousVehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void accelerate() {
		System.out.println("Mit Motor und den 4 Rädern beschleuigen...");
	}

	@Override
	public void getSlower() {
		System.out.println("Mithilfe der Bremsen langsamer werden...");
	}
	
	
	
	
}
