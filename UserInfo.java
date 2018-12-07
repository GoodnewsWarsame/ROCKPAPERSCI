package Login;

public class UserInfo {
	private String Username;
	private String Password;
	private UserInfo[] Account;
	private int count;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return Username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		Username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "UserInfo [Username=" + Username + ", Password=" + Password + "]";
	}

	public UserInfo[] getAccount() {
		return Account;
	}

	public void setAccount(UserInfo[] account) {
		Account = account;
	}

	public UserInfo() {
		super();
		this.Account = new UserInfo[100];
	}

	public UserInfo(String User, String pass) {
		this.Username = User;
		this.Password = pass;

	}

	public void addUser(String user, String pass) {
		UserInfo account = new UserInfo(user,pass);
		addUser(account);
	}

	public void addUser(UserInfo Acc) {
		Account[count] = Acc;
		count++;
	}
/*
 * method to assure that username and password are equal to temps
 */
	public void Search(String User, String pass) {
		try {
		String success ="LOGGED IN";
		String error = "error";
		for (int i = 0; i < Account.length; i++) {
			String loginUsername = Account[i].getUsername();
			String loginPass = Account[i].getPassword();
			if (User.equals(loginUsername) && (pass.equals(loginPass))) {
				System.out.println(success);
			}
				
				

	}
		
}
	catch(NullPointerException e) {
		System.out.println("error");
	}
	
}
}