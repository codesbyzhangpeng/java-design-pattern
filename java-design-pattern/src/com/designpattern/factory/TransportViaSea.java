package com.designpattern.factory;

public class TransportViaSea extends Transport{

	@Override
	public void transportPackage() {
		System.out.println("The packages have been tranported with Containers...");
	}
	
}
