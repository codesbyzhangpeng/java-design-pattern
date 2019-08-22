package com.designpattern.bridge;

public class GreenRectangle implements DrawAPI{

	@Override
	public void draw(int x, int y, int length, int width) {
		System.out.println("Das Rechteck mit einer Länge: " + length
				+ " und einer Breite von: " + width + " wurde erfolgreich erstellt");
	}

}
