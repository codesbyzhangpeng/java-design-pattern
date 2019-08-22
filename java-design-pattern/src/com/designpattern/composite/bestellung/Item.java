package com.designpattern.composite.bestellung;

import java.util.ArrayList;

public class Item extends Product {
	
	private ArrayList<Product> includedProducts= new ArrayList<>();
	
	public Item(String name) {
		this.setName(name);
	}

	@Override
	public void print(String spacing) {
		System.out.println("Item: " + this.getName() + " includes: ");
		for(Product p: includedProducts) {
			p.print(spacing + "    ");
		}
	}
	
	public void add(Product product) {
		includedProducts.add(product);
	}
	
	public void remove(Product product) {
		includedProducts.remove(product);
	}
	
	public Product getProducts(int index) {
		return includedProducts.get(index);
	}
}
