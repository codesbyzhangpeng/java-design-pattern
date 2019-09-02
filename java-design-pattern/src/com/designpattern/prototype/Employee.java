package com.designpattern.prototype;

public class Employee implements Cloneable{
	public String firstName;
	public String lastName;
	public Address address;
	
	public Employee(String firstName, String lastName, Address address) {
		//load data from the database...
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	protected Employee clone() {
		
		try{
			Employee employeeCopy = (Employee)super.clone();
			employeeCopy.address = employeeCopy.address.clone();
			return employeeCopy;
		}catch(CloneNotSupportedException e) {
			System.out.println("The clone of the employee is not successful...");
		}
		return null;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}
		
}
