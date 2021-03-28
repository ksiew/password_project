package examplesites.bank;

import websitetemplate.Account;

/**
 * This account is for banks, money can be deposited, withdrawn, or viewed
 *
 */
public class Bank_Account extends Account {
	double money;
	public Bank_Account(String pass,double cash) {
		super(pass);
		money = cash;
	}
	public void deposit(double amount) {
		money += amount;
	}
	public void withdraw(double amount) {
		money -= amount;
	}
	public double getMoney() {
		return money;
	}

}
