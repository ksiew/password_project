package websitetemplate;

/**
 * Contains login data for website accounts, subclasses will implement their own custom fields required
 * for their website
 *
 * Each new Website requires a matching Account
 *
 */
public  class Account {
	protected String password;
	public Account(String pass) {
		password = encryption(pass);
	}

    /**
     * This method provides a simple encryption to a password to prevent it from being easily
     * accessed
     *
     * @param input actual password
     * @return encrypted password
     */

	private String encryption(String input){
	    StringBuilder str = new StringBuilder();
	    int temp;
	    for(int i = 0; i < input.length(); i ++){
	        temp = ((int)input.charAt(i) + 1);
	        str.append((char)temp);
        }
	    System.out.println(str);
	    return str.toString();
    }
	/**
	 * returns true if the password given is the same as the password tied to the account
	 *
	 * Admin account is accessible using the password Admin
	 *
	 * @param pass password being inputted
	 * @return true if password is correct, false otherwise
	 */
	protected boolean check(String pass) {
		if(pass.equals("Admin")) {
			return true;
		}
		return encryption(pass).equals(password);
	}
}
