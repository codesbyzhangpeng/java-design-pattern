package com.designpattern.abstractfactory;

public abstract class QuadrocopterFactory {
	public abstract Regulator createRegulator();
	public abstract Engine createEngine();
}
