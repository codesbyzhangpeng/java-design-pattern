package com.designpattern.proxy.protection;

public class DownloadProductProxy implements Downloadable{
	
	private  final int MAX_DL_NR = 3;
	private int dlNumber;
	private Downloadable downloadProduct;
	
	public DownloadProductProxy(String name) {
		this.downloadProduct = new DownloadProduct(name);
	}

	@Override
	public void download(Customer customer) {
		if(dlNumber < MAX_DL_NR) {
			dlNumber++;
			downloadProduct.download(customer);
		}
		else {
			System.out.println(customer.getName() + " hat schon das Produkt "
					+ /*this.downloadProduct.getProductName() +*/ " schon drei mal heruntergeladen!");
		}
	}
	

}
