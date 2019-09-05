package com.designpattern.chainofresponsibility;

public class RequestData {
	public double x;
	public double y;
	public String Operator;
	
	public RequestData(double x, double y, String operator) {
		this.x = x;
		this.y = y;
		Operator = operator;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getOperator() {
		return Operator;
	}

	public void setOperator(String operator) {
		Operator = operator;
	}
	
	
}