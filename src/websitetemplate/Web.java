package websitetemplate;

import examplesites.bank.BankWebsite;
import examplesites.notes.NotesWebsite;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Web class links together Websites and allows access to them
 *
 */
public class Web {
	protected Scanner scan = new Scanner(System.in);
	ArrayList<Website> websiteList = new ArrayList<>();
	//add new websites here using
	public Web() {
		websiteList.add(new BankWebsite());
		websiteList.add(new NotesWebsite());
	}

	/**
	 * Asks the user which Website they want to go to
	 *
	 */
	public void online() {
		System.out.println("Which website would you like to visit?");
		for(int i = 0; i < websiteList.size(); i ++){
			System.out.println(websiteList.get(i).getUrl());
		}
		String input = scan.next();
		for(int i = 0; i < websiteList.size(); i ++){
			if(input.equals(websiteList.get(i).getUrl())){
				websiteList.get(i).LoginScreen();
			}
		}
		this.online();
	}
}
