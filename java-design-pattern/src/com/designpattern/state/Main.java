package com.designpattern.state;

public class Main {

	public static void main(String[] args) {
		AmphibiousVehicle vehicle = new AmphibiousVehicle();
		vehicle.accelerate();
		vehicle.getSlower();
		
		System.out.println("---------------------");
		vehicle.preparedForBoat();
		vehicle.accelerate();
		vehicle.getSlower();
	}
}
