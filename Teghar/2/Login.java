class Login{
private String username, password;
 public Login()
 {
	username = "admin";
	password = "12345";
 }
	public Login (String username, String password)
	{
	this.username = username;
	this.password = password;
	}
	public void setUsername(String Username)
	{
	this.username = username;
	}
	public void setPassword(String Password)
	{
	this.password = password;
	}
	public void getUsername()
	{
	return username;
	}
	public void getPassword()
	{
	return password;
	}
}