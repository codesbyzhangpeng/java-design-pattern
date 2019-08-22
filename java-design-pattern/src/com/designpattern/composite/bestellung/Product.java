package com.designpattern.composite.bestellung;

public abstract class Product {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void print(String spacing);

}
