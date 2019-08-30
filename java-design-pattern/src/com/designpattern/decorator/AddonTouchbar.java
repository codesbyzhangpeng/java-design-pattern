package com.designpattern.decorator;

public class AddonTouchbar extends MacbookAddon{
	
	public AddonTouchbar(Macbook macbook) {
		super(macbook);
	}

	@Override
	public String getDescription() {
		return macbook.getDescription() + "additional touchbar...";
	}

	@Override
	public double getPrice() {
		return macbook.getPrice() + 400.00;
	}

	@Override
	public void increaseVoluem() {
		System.out.println("The volume of the macbook will be increased with touch bar...");
	}

}
