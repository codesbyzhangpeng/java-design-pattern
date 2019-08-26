package com.designpattern.command;

public class BankAccount {

	private int balance;
	private final int overdriftLimit = -1000;
	
	public void depoist(int amount) {
		balance += amount;
		System.out.println("Einzahlung über " + amount + " erfolgreich! Neuer Kontostand: " + balance + " Euro");
	}
	
	public boolean withdraw(int amount) {
		if(balance - amount >= overdriftLimit) {
			balance -= amount;
			System.out.println("Auszahlung über " + amount + " erfolgreich! Neuer Kontostand: " + balance + " Euro");
			return true;
		}
		else {
			System.out.println("Leider ist nicht genug Geld auf dem Konto!");
			return false;
		}

	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + ", overdriftLimit=" + overdriftLimit + "]";
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
