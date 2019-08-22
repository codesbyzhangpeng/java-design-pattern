package com.designpattern.bridge;

public class Main {
	
	public static void main(String[] args) {
		Shape greenRectangle = new Rectangle(new GreenRectangle(), 2,2,20, 12);
		greenRectangle.draw();
		
		Shape yellowRectangle = new Rectangle(new YellowRectangle(), 2,2,20, 12);
		yellowRectangle.draw();	
	}

}
