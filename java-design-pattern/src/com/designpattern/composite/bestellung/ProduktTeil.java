package com.designpattern.composite.bestellung;

public class ProduktTeil extends Product {
	
	private int teilNummer;

	public ProduktTeil(String name, int teilNummer) {
		this.setName(name);
		this.teilNummer = teilNummer;
	}
	
	@Override
	public void print(String spacing) {
		System.out.println(spacing + "->" + this.getName() + " (Produkt Teil: " + this.teilNummer + ")");
	}
}
