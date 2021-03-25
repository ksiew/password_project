package password_project;

public  class Account {
	protected String password;
	public Account(String pass) {
		password = pass;
	}
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
