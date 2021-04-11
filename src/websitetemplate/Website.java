package websitetemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * The template for websites
 *
 * To create a new website, have the class extend Website, give it a url
 * and add it to the Web class constructor
 *
 */
public abstract class Website{
	protected Scanner scan = new Scanner(System.in);

	//List of accounts for the website
	protected Map<String,Account> accounts = new HashMap<>();
	//If a user enters a website's url in the Web, they will be taken to that website
	protected String url;
	//abstract to add account to website
	protected void addAccount(String name, String pass) {
		if(accounts.containsKey(name)) {
			System.out.println("name already taken");
		}else {
			accounts.put(name, createAccount(pass));
			System.out.println("account made");
		}
	}

	/**
	 * This method creates an account to be added to the Website
	 *
	 *
	 * @param pass password of the account
	 * @return The account
	 */
	public abstract Account createAccount(String pass);

	/**
	 * creates a prompt to delete an account, requires username and password
	 *
	 * @param name username of account to be deleted
	 */
	public void removeAccount(String name) {
		System.out.println("input password: ");
		if(accounts.get(name).check(scan.next())) {
			System.out.println("account removed");
			accounts.remove(name);
		}else {
			System.out.println("wrong password");
		}
		this.LoginScreen();
	}


	/**
	 * LoginScreen will prompt the user allowing them to Login,addAccount,removeAccount, or exit website
	 */
	public void LoginScreen() {
		String u;
		String p;
		System.out.println("Your options are: \n CREATE account \n DELETE account \n LOGIN \n EXIT " + url);
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
				this.LoginScreen();
				break;
				
			case "DELETE":
				System.out.println("enter username");
				u = scan.next();
				this.removeAccount(u);
				this.LoginScreen();
				break;
				
			case "EXIT":
				System.out.println("exiting...");
				break;
	
				
			default:
				this.LoginScreen();
				break;
		}
	}

	/**
	 * Users log in through this method, done at front page
	 *
	 * @param name Username of account being accessed
	 */
	public void logIn(String name) {
		System.out.println("input password");
		if(accounts.containsKey(name) && accounts.get(name).check(scan.next())) {
			this.run(accounts.get(name));
		}else {
			System.out.println("error logging in");
			this.LoginScreen();
		}
	}

	/**
	 * Gets a website's url for the Web class
	 *
	 * @return A website's url
	 */
	public String getUrl(){ return url; }


	/**
	 * Prompts the user to enter a string for whichever account function they want to use
	 *
	 * TODO add universal website functions to superclass (EX: EXIT)
	 *
	 * @param account The account a function is being run on
	 */
	public abstract void run(Account account);
	
	
}
