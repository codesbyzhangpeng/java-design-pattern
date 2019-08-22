package com.designpattern.composite.bestellung;

public class Main {

	public static void main(String[] args) {
		
		Item bestellung = new Item("Bestellung");
		
		Item tisch = new Item("Tisch");
		ProduktTeil tischPlatte = new ProduktTeil("Tisch Platte", 1);
		ProduktTeil TischFuesse = new ProduktTeil("Tisch Füße", 2);
		tisch.add(TischFuesse);
		tisch.add(tischPlatte);
		
		bestellung.add(tisch);
		
		Item bett = new Item("Bett");
		ProduktTeil matraze = new ProduktTeil("Matraze", 1);
		ProduktTeil lattenrost = new ProduktTeil("Lattenrost", 2);
		ProduktTeil massivholzBett = new ProduktTeil("Massivholzbett", 3);
		bett.add(matraze);
		bett.add(lattenrost);
		bett.add(massivholzBett);
		
		bestellung.add(bett);
		
		Item schrank = new Item("Schrank");
		ProduktTeil schrank_teil = new ProduktTeil("Schrank Teil", 1);
		schrank.add(schrank_teil);
		
		bestellung.add(schrank);
		
		bestellung.print("");		
		
	}
}
