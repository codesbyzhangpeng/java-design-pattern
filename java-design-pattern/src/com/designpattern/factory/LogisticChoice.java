package com.designpattern.factory;

public class LogisticChoice extends Logistic{
	
	private String transportType;

	public LogisticChoice(String transportType) {
		this.transportType = transportType;
	}

	@Override
	protected Transport transportFactory() {
		Transport transport = null;
		if(transportType.equalsIgnoreCase("container")) {
			transport = new TransportViaSea();
		}else if(transportType.equalsIgnoreCase("train")) {
			transport = new TransportViaTrain();
		}else if(transportType.equals("flight")) {
			transport = new TransportViaFlight();
		}
		else {
			throw new RuntimeException("invalid transport type...");
		}
		return transport;
	}

}
