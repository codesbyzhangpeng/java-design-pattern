package com.designpattern.factory;

public class TransportViaTrain extends Transport{

	@Override
	public void transportPackage() {
		System.out.println("The packages have been tranported by trains...");
	}
	
}
