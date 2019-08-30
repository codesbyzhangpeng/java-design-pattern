package com.designpattern.factory;

public abstract class Logistic {
	
	protected abstract Transport transportFactory();
	
	public Transport getTransport() {
		
		Transport transport = transportFactory();

		return transport;
	}
}
