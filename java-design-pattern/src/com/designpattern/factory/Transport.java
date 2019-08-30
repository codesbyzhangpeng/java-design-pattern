package com.designpattern.factory;

public abstract class Transport {
	
	public void pickPackageFromCustomer() {
		System.out.println("The packages have been collected from the Customers...");
	}

	public abstract void transportPackage();
	
	public void bringPackagetToReceiver() {
		System.out.println("Packages/goods have been brought to Receivers...");
	}
	
	protected void doSomething() {
		pickPackageFromCustomer();
		transportPackage();
		bringPackagetToReceiver();		
	}

}
