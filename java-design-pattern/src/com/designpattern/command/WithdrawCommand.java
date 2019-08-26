package com.designpattern.command;

public class WithdrawCommand implements BankTransactionCommand{

	BankAccount bankAccount;
	private int amount;
	private boolean transactionSucceeded;
		
	public WithdrawCommand(BankAccount bankAccount, int amount) {
		this.bankAccount = bankAccount;
		this.amount = amount;
	}

	@Override
	public void execute() {
		transactionSucceeded = bankAccount.withdraw(amount);
	}

	@Override
	public void undo() {
		
		if(transactionSucceeded) {
			bankAccount.setBalance(bankAccount.getBalance() + amount);
			System.out.println("Auszahlung rückgängig gemacht! Neuer Kontostand ist: " + bankAccount.getBalance() +  " Euro!");
		}
		else {
			System.out.println("Undo konnten nicht durchgeführt werden, da transaction davor fehlgeschlagen ist!");
		}
	}

	@Override
	public String toString() {
		return "WithdrawCommand [bankAccount=" + bankAccount + ", amount=" + amount + ", transactionSucceeded="
				+ transactionSucceeded + "]";
	}
	
	
}
