package com.designpattern.abstractfactory;

public class FlyFactory extends QuadrocopterFactory {

	@Override
	public Regulator createRegulator() {
		return new FlyRegulator();
	}

	@Override
	public Engine createEngine() {
		return new FlyEngine();
	}

}
