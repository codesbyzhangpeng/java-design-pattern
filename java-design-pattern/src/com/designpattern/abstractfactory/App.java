package com.designpattern.abstractfactory;

public class App {
	public static void main(String[] args) {
		FlyFactory ff = new FlyFactory();
		ControllerBoard controller = new ControllerBoard(ff);
		controller.getSpeed();
		controller.increaseVoltage();
		
		System.out.println("---------------------");
		
		new ControllerBoard(new QuadroFactory()).increaseVoltage();
	}
}