package com.designpattern.chainofresponsibility;

public class Main {
	public static void main(String[] args) {
		CalculationChain add = new AddOperation();
		CalculationChain subtract = new SubtractOperation();
		CalculationChain multiply = new MultiplyOperation();
		CalculationChain devide = new DivideOperation();
		
		add.nextChain(subtract);
		subtract.nextChain(multiply);
		multiply.nextChain(devide);
		
		RequestData request = new RequestData(15, 10, "/");
		
		add.Calculate(request);
		
	}
}
