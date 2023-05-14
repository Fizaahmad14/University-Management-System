package Buisnesslogic;
import database.DBHandler;

public class StudentAccount {

	private String username;
	private String password;
	DBHandler db = new DBHandler();
	
	public StudentAccount() {
		super();
	}
	public StudentAccount(String username, String password) {
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
	public void setStudentAccout(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
		db.saveStudentAccount(this); 
	}

}
