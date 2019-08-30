package com.designpattern.decorator;

public class Main {

	public static void main(String[] args) {
		MacbookPro pc1 = new MacbookPro();
		pc1.increaseVoluem();
		System.out.println(pc1.getDescription());
		System.out.println(pc1.getPrice());
		
		
		System.out.println("---------------------");
		
		AddonTouchbar pcWithTouchbar = new AddonTouchbar(pc1);
		pcWithTouchbar.increaseVoluem();
		System.out.println(pcWithTouchbar.getDescription());
		System.out.println(pcWithTouchbar.getPrice());
		
		System.out.println("---------------------");

		
		AddonI5Processor pc3 = new AddonI5Processor(pcWithTouchbar);
		pc3.increaseVoluem();
		System.out.println(pc3.getDescription());
		System.out.println(pc3.getPrice());

		
	}
}
