package ssa;

import java.text.DecimalFormat;

public class Mainline {
//	static int depositCounter = 0;
//	static int withdrawCounter = 0;
//	static int transactionCounter = 0;
//	static String accountTypeIn;

	public static void main(String[] args) {
			
		Account checking1 = new Account();
		checking1.setDescription("My personal checking account");
		checking1.deposit(800.00);
		System.out.println(checking1.print());
		checking1.deposit(300.00);
		System.out.println(checking1.print());
		checking1.withdraw(699.99);
		System.out.println(checking1.print());
		checking1.deposit(149.99);
		System.out.println(checking1.print());
		checking1.withdraw(950.00); // this should fail!
		System.out.println(checking1.print());
		checking1.withdraw(200.00);
		System.out.println(checking1.print());

		Account savings1 = new Account("My personal savings account");
		savings1.deposit(1000.00);
		System.out.println(savings1.print());
		savings1.deposit(400.00);
		System.out.println(savings1.print());
		savings1.withdraw(750.00);
		System.out.println(savings1.print());
		savings1.withdraw(250.00);
		System.out.println(savings1.print());
		savings1.deposit(650.00);
		System.out.println(savings1.print());

		//Results of basic challenge
		System.out.println("Your checking " + checking1.print());
		System.out.println("Your savings " + savings1.print());
		
		//Moves $100.00 from savings to checking
		checking1.transferFrom(savings1, 100.00);
		System.out.println("Your checking " + checking1.print());
		System.out.println("Your savings " + savings1.print());
		
		Account checking2 = new Account("My slush fund checking account");
		checking2.deposit(300.00);
		System.out.println(checking2.print());
		checking2.withdraw(150.00);
		System.out.println(checking2.print());
		checking2.deposit(250.00);
		System.out.println(checking2.print());
		
		System.out.println(checking1.print());
		System.out.println(checking2.print());
		System.out.println(savings1.print());
		
		
		//Prints totals
//		System.out.println("Total Deposits    : " + (checking1.getDepositCounter() + savings1.getDepositCounter()) + 
//												" (" + checking1.getDepositCounter() + " from Checking, "	+
//		                                         savings1.getDepositCounter() + " from Savings)");
//		System.out.println("Total Withdrawals : "+ (checking1.getWithdrawCounter() + savings1.getWithdrawCounter()) +
//												" (" + checking1.getWithdrawCounter() + " from Checking, "	+
//												savings1.getWithdrawCounter() + " from Savings)");
//		System.out.println("Total Transactions: "+ (checking1.getTransactionCounter() + savings1.getTransactionCounter()) +
//												" (" + checking1.getTransactionCounter() + " from Checking, "	+
//												savings1.getTransactionCounter() + " from Savings)");
//		DecimalFormat decimalBalance = new DecimalFormat("000.00");
//		System.out.print("Checking Balance History: ");
//		for (int i=0; i<checking1.getBalanceHistorySize(); i++) {
//			System.out.print(decimalBalance.format(checking1.getBalanceHistory(i)) + " | ");}
//		System.out.println(decimalBalance.format(checking1.getBalance()));
//		System.out.print("Savings Balance History: ");
//		for (int i=0; i<savings1.getBalanceHistorySize(); i++) {
//			System.out.print(decimalBalance.format(savings1.getBalanceHistory(i)) + " | ");}
//		System.out.print(decimalBalance.format(savings1.getBalance()));

			
		}
	}


