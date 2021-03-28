package jcc.examplesites.bank;

import jcc.websitetemplate.Account;

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
