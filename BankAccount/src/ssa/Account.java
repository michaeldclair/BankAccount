package ssa;
//adding arbitrary comment for GitHub
import java.text.DecimalFormat;
//import java.util.*;

class Account {

	private int id;
	private String description;
	private double balance;
	private static int accountAssigner = 1;
 	private int depositCounter = 0;
 	private int withdrawCounter = 0;
 	private int transactionCounter = 0;
//	private ArrayList<Double> balanceHistory = new ArrayList<Double>();
//	private int i = 0;
//	private Mainline getAccountType = new Mainline();
//	private String accountType = getAccountType.accountTypeIn;
	
	
	//Standard Constructor
	public Account() {
		System.out.println("Creating new Account");
		this.setId(accountAssigner); 
		accountAssigner++;
		this.setBalance(0);
	}
	//Description Constructor
	public Account(String aDescription) {
		System.out.println("Creating new Account");
		this.setId(accountAssigner); 
		accountAssigner++;
		description = aDescription;
		this.setBalance(0);
	}
	//ID and Description Constructor
	public Account(int aId, String aDescription) {
		System.out.println("Creating new Account");
		this.setId(aId);
		description = aDescription;
		this.setBalance(0);
	}
	//Balance Constructor
	public Account(double aBalance) {
		System.out.println("Creating new Account");
		this.setBalance(aBalance);
		this.setId(accountAssigner); 
		accountAssigner++;	
		}
	
	
		//Getters and Setters
	
	private void setId(int aId) {
		id = aId;
	}
	public int getId() {
		return id;
	}
	public void setDescription(String descriptionBeingSet) {
		description = descriptionBeingSet;
	}
	public String getDescription() {
		return description;
	}
	private void setBalance(double balanceBeingSet) {
		balance = balanceBeingSet;
	}
	public double getBalance() {
		return balance;
	}
	
	

	public double deposit(double aDeposit) {
		
		if (aDeposit == 0) {
			return 0;
		} else {
//		balanceHistory.add(balance);
//		i++;
		balance += aDeposit;
 		depositCounter++;
 		transactionCounter++;
 		System.out.println("That was account " + id + "'s deposit number " + depositCounter + ", and transaction number " + transactionCounter);
		return balance;
		}
	}
	
	public double withdraw(double aWithdraw) {
		
		if ((balance - aWithdraw) < 0) {
			System.out.println("Insufficient funds!");
			return 0;
		} else {
//		balanceHistory.add(balance);
//		i++;
		balance -= aWithdraw;
 		withdrawCounter++;
 		transactionCounter++;
 		System.out.println("That was account " + id + "'s withdrawal number " + withdrawCounter + ", and transaction number " + transactionCounter);
		}
		return balance;
	}
	public String print() {
		DecimalFormat decimalBalance = new DecimalFormat("000.00");
		return ("Account " + id + " balance is $" + decimalBalance.format(balance));
	}
	public void transferFrom(Account account, double amount) {
		this.deposit(amount);
		account.withdraw(amount);
	}
	
//	public Double getBalanceHistory(int j) {
//		return balanceHistory.get(j);
//	}
//	public int getBalanceHistorySize() {
//		return balanceHistory.size();
//	}
//	public int getDepositCounter() {
//		return depositCounter;
//	}
//	public int getWithdrawCounter() {
//		return withdrawCounter;
//	}
//	public int getTransactionCounter() {
//		return transactionCounter;
//	}

	
}
