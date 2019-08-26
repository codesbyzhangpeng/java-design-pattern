package com.designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class CashMachine {
	
	List<BankTransactionCommand> commandsList = new ArrayList<BankTransactionCommand>();
	
	public void executeBankTransaction(BankTransactionCommand command) {
		command.execute();
		commandsList.add(command);
	}
	
	public void undoBankTransaction(BankTransactionCommand command) {
		command.undo();
		commandsList.add(command);
	}

	public List<BankTransactionCommand> getCommandsList() {
		return commandsList;
	}

	public void setCommandsList(List<BankTransactionCommand> commandsList) {
		this.commandsList = commandsList;
	}

	
}
