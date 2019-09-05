package com.designpattern.chainofresponsibility;

public class AddOperation implements CalculationChain{

	CalculationChain nextInChain;
	
	@Override
	public void nextChain(CalculationChain nextInChain) {
		this.nextInChain = nextInChain;
	}

	@Override
	public void Calculate(RequestData request) {
		if(request.Operator.equals("+")) {
			System.out.println(request.getX() + " + "+ request.getY() + 
					" = " + (request.getX() +  request.getY()));
		}else {
			nextInChain.Calculate(request);
		}	
	}

}
