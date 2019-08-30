package com.designpattern.abstractfactory;

public abstract class Regulator {
	
	private String currentVoltage; // aktuelle Spannung
	private String CurrentCurrent; //akuteller Strom
	
	public abstract void increaseVoltage();

	public String getCurrentVoltage() {
		return currentVoltage;
	}

	public void setCurrentVoltage(String currentVoltage) {
		this.currentVoltage = currentVoltage;
	}

	public String getCurrentCurrent() {
		return CurrentCurrent;
	}

	public void setCurrentCurrent(String currentCurrent) {
		CurrentCurrent = currentCurrent;
	}
}
