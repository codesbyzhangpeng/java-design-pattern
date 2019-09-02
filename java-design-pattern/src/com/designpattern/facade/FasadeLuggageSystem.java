package com.designpattern.facade;

public class FasadeLuggageSystem {

	private AirportSystem airportSystem;
	private PlaneSystem planeSystem;
	private LogisticSystem logisticSystem;
	private HotelSystem hotelSystem;
	
	public FasadeLuggageSystem() {
		this.airportSystem = new AirportSystem();
		this.planeSystem = new PlaneSystem();
		this.logisticSystem = new LogisticSystem();
		this.hotelSystem = new HotelSystem();		
	}
	
	public void sendLuggage() {
		airportSystem.checkLuggage();
		airportSystem.bringToPlane();
		planeSystem.bringToAirplane();
		logisticSystem.luggageTransport();
		hotelSystem.bringLuggageToGuest();
	}
	
}
