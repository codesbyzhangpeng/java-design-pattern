package com.designpattern.memento;

public class FitnessPlan {
	
	private String typeOfTraining;
	
	public FitnessPlan(String typeOfTraining) {
		this.typeOfTraining = typeOfTraining;
	}
	
	public Memento save() {
		System.out.println("The new fitnessplan has been saved successfully...");
		return new Memento(typeOfTraining);
	}
	
	public void changeFitnessPlan(String typeOfTraining) {
		this.typeOfTraining = typeOfTraining;
	}
	
	public void restore(Memento memento) {
		this.typeOfTraining = memento.getState();
		System.out.println(memento.getState() + ": has been restored successfully...");
	}

	@Override
	public String toString() {
		return "FitnessPlan [typeOfTraining=" + typeOfTraining + "]";
	}
}
