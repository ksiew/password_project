package jcc.websitetemplate;

import jcc.examplesites.bank.BankWebsite;
import jcc.examplesites.notes.NotesWebsite;

import java.util.Scanner;

/**
 * Contains
 *
 */
public class Web {
	protected Scanner scan = new Scanner(System.in);

	//add new websites here using static Website name = new *class*
	static Website bank = new BankWebsite();
	static Website notes = new NotesWebsite();

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
