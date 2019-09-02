package com.designpattern.prototype;

public class Address implements Cloneable{

	private String Street;
	private int postalCode;
	private int houseNumber;
	
	public Address(String street, int postalCode, int houseNumber) {
		Street = street;
		this.postalCode = postalCode;
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	@Override
	protected Address clone() throws CloneNotSupportedException {
		return (Address)super.clone();
	}

	@Override
	public String toString() {
		return "Address [Street=" + Street + ", postalCode=" + postalCode + ", houseNumber=" + houseNumber + "]";
	}

}
