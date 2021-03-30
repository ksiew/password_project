package examplesites.notes;

import websitetemplate.Account;
import websitetemplate.Web;
import websitetemplate.Website;

/**
 * This website allows its users to write down notes, only viewable by them
 *
 */
public class NotesWebsite extends Website {
	public NotesWebsite(){
		super();
		url = "NOTES";
	}

	@Override
	public Account createAccount(String pass) {
		return new NotesAccount(pass);
	}

	@Override
	public void outputData() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void run(Account account) {
		System.out.println("Your options are: \n WRITE new note \n REMOVE note \n VIEW note \n EXIT notes");
		switch(scan.next()) {
			case "WRITE":
				System.out.println("Type:");
				((NotesAccount)account).addNote(scan.next());
				this.run(account);
				break;
				
			case "REMOVE":
				System.out.println("which note to remove?");
				((NotesAccount)account).removeNote(scan.nextInt());
				this.run(account);
				break;
				
			case "VIEW":
				System.out.println("which note to view?");
				System.out.println(((NotesAccount)account).getNote(scan.nextInt()));
				this.run(account);
				break;
				
			case "EXIT":
				System.out.println("exiting...");
				this.LoginScreen();
				break;
			
			default:
				System.out.println("error");
				this.run(account);
				
		}
		
	}

}
