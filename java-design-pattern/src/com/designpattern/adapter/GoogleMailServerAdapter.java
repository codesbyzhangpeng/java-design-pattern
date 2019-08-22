package com.designpattern.adapter;

public class GoogleMailServerAdapter implements MainServer {

	GoogleMailServer mainServer;
	
	public GoogleMailServerAdapter(GoogleMailServer mainServer) {
		this.mainServer = mainServer;
	}
	
	@Override
	public void connectAndSendMail(String emailAdress, String content, String receiverName) {
		mainServer.buildConnect();
		System.out.println("Email erfolgreich verschlüsselt...");
		mainServer.sendMail(emailAdress, content);
		System.out.println("Name des Empfängers ist: " + receiverName);
	}

}
