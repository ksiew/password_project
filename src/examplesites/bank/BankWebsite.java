package examplesites.bank;


import websitetemplate.Account;
import websitetemplate.Website;

/**
 * This website allows users to store their imaginary money
 *
 */
public class BankWebsite extends Website {
	public BankWebsite(){
		super();
		url = "BANK";
	}


	@Override
	public void outputData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run(Account account) {
		System.out.println("your options are: \n DEPOSIT money \n WITHDRAW money "
				+  "\n VIEW account \n EXIT bank");
		switch(scan.next()) {
			case "DEPOSIT":
				System.out.println("How much would you like to deposit?");              ;
				((BankAccount)account).deposit(scan.nextDouble());
				this.run(account);
				break;
				
			case "WITHDRAW":
				System.out.println("How much would you like to withdraw?");              ;
				((BankAccount)account).withdraw(scan.nextDouble());
				this.run(account);
				break;
				
			case "VIEW":
				System.out.println("You have " + ((BankAccount) account).getMoney() + " dollars");              ;
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

	@Override
	public void addAccount(String name, String pass) {
		if(accounts.containsKey(name)) {
			System.out.println("name already taken");
		}else {
			System.out.println("how much money?");
			accounts.put(name, new BankAccount(pass,scan.nextDouble()));
		}
		
	}
}
