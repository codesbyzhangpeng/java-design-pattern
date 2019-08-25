package com.designpattern.flyweight;

import java.awt.Color;

public class Birke implements Tree {

	private Color color;
	private TreeType treeType;
	
	public Birke() {
		this.color = color.BLACK;
		this.treeType = treeType.BIRKE;
	}
	
	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public TreeType getTreeType() {
		return treeType;
	}

	@Override
	public void drawTree(int x, int y, int height) {
		// Zeichne die Birke mithilfe der extrisischen Daten (Kontext)
		System.out.println("Birke wurde an Position (" + " / " + y + ") mit einer Höhe von "+ height + "gezeichnet!" );
	}

}
