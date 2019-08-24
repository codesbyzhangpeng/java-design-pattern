package com.designpattern.proxy.virtual;

public class Customer {
	private String name;
	private String Address;
	private boolean bonusCard;
		
	public Customer(String name, String address, boolean bonusCard) {
		this.name = name;
		Address = address;
		this.bonusCard = bonusCard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public boolean isBonusCard() {
		return bonusCard;
	}
	public void setBonusCard(boolean bonusCard) {
		this.bonusCard = bonusCard;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", Address=" + Address + ", bonusCard=" + bonusCard + "]";
	}
	
	
}
