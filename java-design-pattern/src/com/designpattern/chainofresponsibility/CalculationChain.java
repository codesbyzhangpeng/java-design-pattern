package com.designpattern.chainofresponsibility;

public interface CalculationChain {
	public void nextChain(CalculationChain nextInChain);
	public void Calculate(RequestData request);
}
