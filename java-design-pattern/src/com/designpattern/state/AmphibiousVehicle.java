package com.designpattern.state;

public class AmphibiousVehicle {
	
	private BoatState boat;
	private CarState car;
	
	private State currentState;
	
	public AmphibiousVehicle() {
		boat = new BoatState(this);
		car = new CarState(this);
		currentState = car;
	}
	
	public void preparedForBoat() {
		this.currentState = boat;
		System.out.println("Das Fahrzeug wurde für das Wasser vorbereitet...");
	}
	
	public void preparedForCar() {
		this.currentState = car;
		System.out.println("Das Fahrzeug wurde für das Land vorbereitet...");
	}
	
	public void accelerate() {
		currentState.accelerate();
	}
	
	public void getSlower() {
		currentState.getSlower();
	}
	

}
