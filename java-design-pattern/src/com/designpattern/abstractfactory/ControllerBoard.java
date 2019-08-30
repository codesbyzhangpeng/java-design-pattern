package com.designpattern.abstractfactory;

public class ControllerBoard {
	private QuadrocopterFactory usedFactory;
	private Regulator regulator;
	private Engine engine;

	public ControllerBoard(QuadrocopterFactory usedFactory) {
		this.usedFactory = usedFactory;
		createQuadrocopterParts();
	}

	private void createQuadrocopterParts() {
		regulator = usedFactory.createRegulator();
		engine = usedFactory.createEngine();
	}
	
	public void increaseVoltage() {
		regulator.increaseVoltage();
	}
	
	public void getSpeed() {
		engine.getEngineSpeed();
	}
	
}
