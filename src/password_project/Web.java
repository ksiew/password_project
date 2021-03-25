package password_project;

import java.util.Scanner;

public class Web {
	protected Scanner scan = new Scanner(System.in);
	static Website bank = new Bank();
	static Website notes = new Notes();

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
