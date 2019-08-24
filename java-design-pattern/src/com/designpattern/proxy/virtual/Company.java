package com.designpattern.proxy.virtual;

public class Company {
	private String name;
	private String address;
	private CustomerList customerList;
	
	public Company(String name, String address, CustomerList customerList) {
		this.name = name;
		this.address = address;
		this.customerList = customerList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public CustomerList getCustomerList() {
		return customerList;
	}

	public void setCustomerList(CustomerList customerList) {
		this.customerList = customerList;
	}
	
	
	
}
