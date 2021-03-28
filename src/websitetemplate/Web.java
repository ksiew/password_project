package websitetemplate;

import examplesites.bank.BankWebsite;
import examplesites.notes.NotesWebsite;

import java.util.Scanner;

/**
 * The Web class links together Websites and allows access to them
 *
 */
public class Web {
	protected Scanner scan = new Scanner(System.in);

	//add new websites here using: static Website *name* = new *class*
	static Website bank = new BankWebsite();
	static Website notes = new NotesWebsite();

	/**
	 * Asks the user which Website they want to go to
	 *
	 */
	public void online() {
		System.out.println("Which website would you like to visit? \n BANK \n NOTES");
		switch(scan.next()) {
			case "BANK":
				bank.frontPage();
				break;
			case "NOTES":
				notes.frontPage();
				break;
			default:
				System.out.println("error");
				this.online();
		}
	}
}
