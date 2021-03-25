package password_project;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class Website extends Web{
	protected Map<String,Account> accounts = new HashMap<String,Account>();
	
	//abstract to add subclass to accounts
	public abstract void addAccount(String name, String pass);

	
	public void removeAccount(String name) {
		System.out.println("input password: ");
		if(scan.next().equals(accounts.get(name).getPassword())) {
			System.out.println("account removed");
			accounts.remove(name);
		}else {
			System.out.println("wrong password");
		}
		this.frontPage();
	}
	
	//frontPage will link to Login,addAccount,removeAccount, and exit website
	public void frontPage() {
		String u;
		String p;
		System.out.println("Your options are: \n CREATE account \n DELETE account \n LOGIN \n EXIT");
		switch(scan.next()) {
			case "LOGIN":
				System.out.println("enter username");
				this.logIn(scan.next());
				break;
			
			case "CREATE":
				System.out.println("enter username");
				u = scan.next();
				System.out.println("enter password");
				p = scan.next();
				this.addAccount(u, p);
				this.frontPage();
				break;
				
			case "DELETE":
				System.out.println("enter username");
				u = scan.next();
				this.removeAccount(u);
				this.frontPage();
				break;
				
			case "EXIT":
				System.out.println("exiting...");
				this.online();
				break;
	
				
			default:
				this.frontPage();
				break;
		}
	}
	public void logIn(String name) {
		System.out.println("input password");
		if(accounts.containsKey(name) && accounts.get(name).getPassword().equals(scan.next())) {
			this.run(accounts.get(name));
		}else {
			System.out.println("error logging in");
			this.frontPage();
		}
	}
	
	
	public abstract void outputData();
	
	//run will take place after logged in within the subclass website
	public abstract void run(Account account);
	
	
}
