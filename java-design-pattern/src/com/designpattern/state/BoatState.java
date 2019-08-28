package com.designpattern.state;

public class BoatState implements State {
	
	private AmphibiousVehicle vehicle;
	
	public BoatState(AmphibiousVehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void accelerate() {
		System.out.println("Mithilfe der Motors und der Schiffschraube schneller werden...");
	}

	@Override
	public void getSlower() {
	
		System.out.println("Schiffschraube zurückziehen und langsamer nach vorner... ");
		
	}

}
