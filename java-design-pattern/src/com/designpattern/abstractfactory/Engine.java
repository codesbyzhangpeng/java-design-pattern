package com.designpattern.abstractfactory;

public abstract class Engine {

	private Double EngineSpeed; //DrehZahl des Motors
	
	public abstract void revCounter(); //Drehzahl messen

	public Double getEngineSpeed() {
		return EngineSpeed;
	}

	public void setEngineSpeed(Double engineSpeed) {
		EngineSpeed = engineSpeed;
	}

}
