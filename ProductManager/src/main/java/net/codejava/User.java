package net.codejava;

public class User {
	
	private String username;
	private String password;

	protected User() {
	}

	protected User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean check()
	{
		if((username.equals("fresherpro")) && (password.equals("fresherpro")))
			return(true);
		return(false);
	}
}
