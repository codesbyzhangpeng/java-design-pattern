package com.designpattern.abstractfactory;

public class QuadroFactory extends QuadrocopterFactory{

	@Override
	public Regulator createRegulator() {
		return new QuadroRegulator();
	}

	@Override
	public Engine createEngine() {
		return new QuadroEngine();
	}

}
