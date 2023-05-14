package Buisnesslogic;

import database.DBHandler;

public class FacultyAccount 
{
	private String username;
	private String password;
	DBHandler db = new DBHandler();
	public FacultyAccount() {
		super();
	}
	public FacultyAccount(String username, String password) {
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
	public void setFacultyAccout(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
		db.saveFacultyAccount(this); 
	}
	
	
}
