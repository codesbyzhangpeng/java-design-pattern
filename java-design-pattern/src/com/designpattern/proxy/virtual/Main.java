package com.designpattern.proxy.virtual;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		CustomerList list1 = new CustomerListProxyImpl();
		Company comp = new Company("MiddleWare Factory IT Limited", "TheodorStr. 34, Regensburg", list1);
		
		System.out.println("Company name: " + comp.getName());
		
		list1 = comp.getCustomerList();
		
		System.out.println("-------------------------------------------");
		
		List<Customer> cuslist = list1.getCustomerList();
		
		System.out.println("-------------------------------------------");
		
		for(Customer customer: cuslist) {
			System.out.println(customer);
		}
	}

}
