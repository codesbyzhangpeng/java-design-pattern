package com.designpattern.bridge;

public class YellowRectangle implements DrawAPI{

	@Override
	public void draw(int x, int y, int length, int width) {
		System.out.println("Das gelbe Rechteck mit einer Länge: " + length
				+ " und einer Breite von: " + width + " wurde erfolgreich erstellt...");		
	}

}
