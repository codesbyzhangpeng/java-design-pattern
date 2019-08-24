package com.designpattern.proxy.protection;

public class DownloadProduct implements Downloadable{
	
	private String productName;
	
	public DownloadProduct(String productName) {
		this.productName = productName;
	}

	@Override
	public void download(Customer customer) {
		System.out.println(customer.getName() + " hat das Produkt: " 
							+ this.productName + "erfolgreich heruntergeladen!");
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}
