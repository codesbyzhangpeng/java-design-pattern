package com.designpattern.flyweight;

public class Main {
	
	public static void main(String[] args) {
		
		Tree tree1 = TreeFactory.getTree(TreeType.TANNE);
		tree1.drawTree(4, 4, 25);
		
		Tree tree2 = TreeFactory.getTree(TreeType.BIRKE);
		tree2.drawTree(8, 8, 25);
		
		Tree tree3 = TreeFactory.getTree(TreeType.BIRKE);
		tree3.drawTree(12, 12, 25);
		
		Tree tree4 = TreeFactory.getTree(TreeType.TANNE);
		tree4.drawTree(16, 16, 25);
		
		Tree tree5 = TreeFactory.getTree(TreeType.BIRKE);
		tree5.drawTree(12, 20, 25);
	}

}
