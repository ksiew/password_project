package websitetemplate;

import examplesites.bank.BankWebsite;
import examplesites.notes.NotesWebsite;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Web class links together Websites and allows access to them
 */
public class Web {
	protected Scanner scan = new Scanner(System.in);
	ArrayList<Website> websiteList = new ArrayList<>();

	/**
	 * adds Websites to the websiteList
	 */
	public Web() {
		websiteList.add(new BankWebsite());
		websiteList.add(new NotesWebsite());
	}

	/**
	 * Asks the user which Website they want to go to, repeating if no valid url is given
	 */
	public void online() {
		System.out.println("Which website would you like to visit?");
		for (Website website : websiteList) {
			System.out.println(website.getUrl());
		}
		String input = scan.next();
		for (Website website : websiteList) {
			if (input.equals(website.getUrl())) {
				website.LoginScreen();
			}
		}
		if(!input.equals("END")) {
			this.online();
		}
	}
}
