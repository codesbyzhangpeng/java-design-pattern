package com.designpattern.memento;

import java.util.ArrayList;

public class CareTaker {
	private ArrayList<Memento> mementos;
	
	public CareTaker() {
		mementos = new ArrayList<Memento>();
	}
	
	public void saveState(FitnessPlan fitnessPlan) {
		mementos.add(fitnessPlan.save());
	}

	public void restoreState(FitnessPlan fitnessPlan, int index) {
		fitnessPlan.restore(mementos.get(0));
	}
}
