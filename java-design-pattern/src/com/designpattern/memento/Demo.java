package com.designpattern.memento;

public class Demo {
	public static void main(String[] args) {
		CareTaker careTaker = new CareTaker();
		
		FitnessPlan fitnessPlan = new FitnessPlan("KraftTraining...");
		careTaker.saveState(fitnessPlan);
		
		System.out.println(fitnessPlan);
		
		fitnessPlan.changeFitnessPlan("AusdauerTraining...");
		System.out.println(fitnessPlan);
		careTaker.saveState(fitnessPlan);
		
		fitnessPlan.changeFitnessPlan("Gemisches Training...");
		System.out.println(fitnessPlan);
		careTaker.saveState(fitnessPlan);
		
		fitnessPlan.changeFitnessPlan("Jogging...");
		System.out.println(fitnessPlan);
		careTaker.saveState(fitnessPlan);
		
		careTaker.restoreState(fitnessPlan, 2);
		
		
	}
}
