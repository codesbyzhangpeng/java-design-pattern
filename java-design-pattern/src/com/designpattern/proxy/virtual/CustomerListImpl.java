package com.designpattern.proxy.virtual;

import java.util.ArrayList;
import java.util.List;

public class CustomerListImpl implements CustomerList{

	@Override
	public List<Customer> getCustomerList() {
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(new Customer("Franziska Schmidt", "AugsburgerStr. 19, Regensburg", true));
		customerList.add(new Customer("Franziska Schmidt", "AugsburgerStr. 19, Regensburg", true));
		customerList.add(new Customer("Franziska Schmidt", "SonnenStr. 19, München", false));
		customerList.add(new Customer("Franziska Schmidt", "AnsbacherStr. 12. Stuttgart", true));
		customerList.add(new Customer("Franziska Schmidt", "FrankfurterStr. 89, Nürnberg", false));		
		System.out.println("Datenbank Abfragen wurden erfolgreich durchgeführt!");
		return customerList;	
	}

}
