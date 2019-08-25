package com.designpattern.flyweight;

import java.util.HashMap;

public class TreeFactory {
	
	private static HashMap<TreeType, Tree> treeMap = new HashMap<TreeType, Tree>();
	
	public static Tree getTree(TreeType treeType) {
		if(!treeMap.containsKey(treeType)) {
			Tree tree = null;
			switch(treeType) {
				case TANNE: tree = new Tanne(); System.out.println("Tanne wurde erstellt"); break; 
				case BIRKE: tree = new Birke(); System.out.println("Birke wurde erstellt"); break; 
			}
			if(tree == null) {
				throw new RuntimeException("ungültiger TreeType!");
			}
	
			treeMap.put(treeType, tree);
		}
		
		return treeMap.get(treeType);
	}

}
