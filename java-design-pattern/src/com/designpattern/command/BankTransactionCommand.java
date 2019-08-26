package com.designpattern.command;

public interface BankTransactionCommand {
	
	public void execute();
	
	public void undo();
	
}
