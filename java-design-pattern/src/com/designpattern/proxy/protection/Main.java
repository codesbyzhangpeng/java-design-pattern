package com.designpattern.proxy.protection;

public class Main {

	public static void main(String[] args) {
		DownloadProduct javaEbook = new DownloadProduct("Java Ebook");
		
		Customer customer = new Customer("Zhangpeng");
		
		javaEbook.download(customer);	
		javaEbook.download(customer);	
		javaEbook.download(customer);	
		javaEbook.download(customer);	
		
		System.out.println("--------------------------------------------------------------------");
		
		DownloadProductProxy patternEbook = new DownloadProductProxy("Pattern Ebook");
		patternEbook.download(customer);
		patternEbook.download(customer);
		patternEbook.download(customer);
		patternEbook.download(customer);
		javaEbook.download(customer);	
		patternEbook.download(customer);


		
	}

}
