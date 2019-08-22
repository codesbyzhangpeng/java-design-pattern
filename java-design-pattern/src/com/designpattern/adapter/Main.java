package com.designpattern.adapter;

public class Main {
	public static void main(String[] args) {
		GoogleMailServer mailServer = new GoogleMailServer();
		mailServer.buildConnect();
		mailServer.sendMail("test@gmail.com", "Das ist die erste Email von google Mail Server");
		
		System.out.println("----------------------------------------");
		
		GoogleMailServerAdapter adapterMailServer = new GoogleMailServerAdapter(mailServer);
		adapterMailServer.connectAndSendMail("zhangpeng@gmail.com", "Das ist die zweite Email von google Adapter", "Zhangpeng C");			
	}
}
