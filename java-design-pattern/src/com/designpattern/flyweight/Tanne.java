package com.designpattern.flyweight;

import java.awt.Color;

public class Tanne implements Tree{

	private Color color;
	private TreeType treeType;
	
	public Tanne() {
		this.color = color.GREEN;
		this.treeType = treeType.TANNE;
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
		// Zeichne die Tanne mithilfe der extrisischen Daten (Kontext)
		System.out.println("Tanne wurde an Position (" + " / " + y + ") mit einer Höhe von "+ height + "gezeichnet!" );
		
	}
	
	
}
