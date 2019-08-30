package com.designpattern.abstractfactory;

public class FlyEngine extends Engine {
	
	public FlyEngine() {
		System.out.println("The Fly Engine has been created...");
	}

	@Override
	public void revCounter() {
		System.out.println("The engine speed of the Fly Machine is counted for 300 circle rotation / minute...");		
	}

}
