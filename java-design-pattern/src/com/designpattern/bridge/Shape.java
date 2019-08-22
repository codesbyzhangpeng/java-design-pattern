package com.designpattern.bridge;

public abstract class Shape {

	protected DrawAPI drawAPI;

	public Shape(DrawAPI drawAPI) {
		super();
		this.drawAPI = drawAPI;
	}
	
	public abstract void draw();
}
