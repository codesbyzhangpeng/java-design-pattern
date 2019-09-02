package com.designpattern.prototype;

public class Main {
	
	public static void main(String[] args) {
		
		Address address = new Address("Ansbachstreet", 87977, 12);
		Employee employee = new Employee("Tom", "Smith", address);
		
		Employee employee2 = employee.clone();
		
		Address address2 = new Address("Siegfriedstraße", 93051, 12); 
		
		employee2.setFirstName("Thomas");
		employee2.setAddress(address2);
		
		System.out.println(employee);
		System.out.println();
		System.out.println(employee2);
	}
}
