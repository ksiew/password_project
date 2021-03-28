package jcc.websitetemplate;

/**
 * Contains login data for website accounts, subclasses will implement their own custom fields required
 * for their website
 *
 */
public  class Account {
	protected String password;
	public Account(String pass) {
		password = pass;
	}

	/**
	 * returns true if the password given is the same as the password tied to the account
	 *
	 * Admin account is accessable using the password Admin
	 *
	 * @param pass password being inputted
	 * @return true if password is correct, false otherwise
	 */
	public boolean check(String pass) {
		if(pass == "Admin") {
			return true;
		}
		return pass == password;
	}

	public String getPassword() {
		return password;
	}
}
