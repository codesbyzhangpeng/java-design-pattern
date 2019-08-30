package com.designpattern.abstractfactory;

public class QuadroEngine extends Engine {
	
	public QuadroEngine() {
		System.out.println("The Quadro Engine has been created...");
	}

	@Override
	public void revCounter() {
		System.out.println("The engine speed of the Quadro Machine is counted for 100 circle rotation / minute...");		
	}

}
