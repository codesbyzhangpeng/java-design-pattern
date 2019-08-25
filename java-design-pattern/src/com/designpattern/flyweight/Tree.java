package com.designpattern.flyweight;

import java.awt.Color;

public interface Tree {
	
	public Color getColor();
	public TreeType getTreeType();
	
	public void drawTree(int x, int y, int height);

}
