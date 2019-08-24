package com.designpattern.proxy.virtual;

import java.util.List;

public class CustomerListProxyImpl implements CustomerList{

	private CustomerList customerList;
	
	@Override
	public List<Customer> getCustomerList() {
		if(customerList == null) {
			System.out.println("Die Kundenliste wird erzeugt "
					+ "und Daten werden aus der Datenbank geladen!");
			customerList = new CustomerListImpl();
		}
		
		return customerList.getCustomerList();
	}
	

}
