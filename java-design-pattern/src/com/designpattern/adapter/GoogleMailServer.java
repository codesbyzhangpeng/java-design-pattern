package com.designpattern.adapter;

public class GoogleMailServer {

	public GoogleMailServer() {
		//GoogleMailServer Objekt vorbereiten
	}
	
	public void buildConnect() {
		System.out.println("Verbindung zu Mailkonto erfolgreich aufgebaut...");
	}
	
	public void sendMail(String receiverEmail, String content) {
		System.out.println("Die Email wurde an " + receiverEmail + " gesendet...");
		System.out.println("Inhalt des Emails: " +  content);
	}
}
