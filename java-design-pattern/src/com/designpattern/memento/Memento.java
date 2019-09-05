package com.designpattern.memento;

public class Memento {
	private String typeOfTraining;

	public Memento(String typeOfTraining) {
		this.typeOfTraining = typeOfTraining;
	}
	
	public String getState() {
		return this.typeOfTraining;
	}
	
}
