package com.designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		BankAccount user1 = new BankAccount();
		System.out.println("Bankkonto erfolgreich eröffnet: " + user1);
		
		CashMachine cashMachine1 = new CashMachine();
		
		BankTransactionCommand command1 = new DepositCommand(user1, 2000);
		BankTransactionCommand command2 = new WithdrawCommand(user1, 5000);
		BankTransactionCommand command3 = new DepositCommand(user1, 1000);

		cashMachine1.executeBankTransaction(command1);
		
		cashMachine1.executeBankTransaction(command2);
		cashMachine1.executeBankTransaction(command3);
		cashMachine1.undoBankTransaction(command3);
		

		
		cashMachine1.undoBankTransaction(command2);
		
		List<BankTransactionCommand> list = new ArrayList<>();
		list = cashMachine1.getCommandsList();
		
		cashMachine1.undoBankTransaction(command1);
		


		list.forEach(commandlist->System.out.println(commandlist));

				
	}
}
