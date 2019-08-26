package com.designpattern.command;

public class DepositCommand implements BankTransactionCommand {

	BankAccount bankAccount;
	private int amount;
		
	public DepositCommand(BankAccount bankAccount, int amount) {
		super();
		this.bankAccount = bankAccount;
		this.amount = amount;
	}

	@Override
	public void execute() {
		bankAccount.depoist(amount);
	}
	
	@Override
	public void undo() {
		bankAccount.setBalance(bankAccount.getBalance() - amount);
		System.out.println("Einzahlung rückgängig gemacht! Neuer Kontostand ist " + bankAccount.getBalance() + " Euro!");
	}

	@Override
	public String toString() {
		return "DepositCommand [bankAccount=" + bankAccount + ", amount=" + amount + "]";
	}
	
	


}
