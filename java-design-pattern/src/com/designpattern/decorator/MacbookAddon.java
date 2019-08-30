package com.designpattern.decorator;

public abstract class MacbookAddon implements Macbook{
	protected Macbook macbook;

	public MacbookAddon(Macbook macbook) {
		this.macbook = macbook;
	}	
}
