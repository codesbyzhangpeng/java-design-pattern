package com.designpattern.decorator;

public class AddonI5Processor extends MacbookAddon{

	public AddonI5Processor(Macbook macbook) {
		super(macbook);
	}

	@Override
	public String getDescription() {
		return macbook.getDescription() + " additional i5 processor...";
	}

	@Override
	public double getPrice() {
		return macbook.getPrice() + 100;
	}

	@Override
	public void increaseVoluem() {
		macbook.increaseVoluem();
	}
	
	

}
