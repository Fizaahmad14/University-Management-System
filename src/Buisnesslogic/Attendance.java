package Buisnesslogic;
import database.DBHandler;

public class Attendance{

	DBHandler db = new DBHandler();
	private String att;
	private String name;
	private String rollno;
	
public Attendance() {
		super();
	}
	public Attendance(String rollno, String name, String att) {
		this.att = att;
		this.name = name;
		this.rollno = rollno;
	}


	public String getAtt() {
		return att;
	}


	public void setAtt(String att) {
		this.att = att;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public void setAttendence(String rollno, String name, String att) {
		this.setName(name);
		this.setAtt(att);
		this.setRollno(rollno);
		db.saveAttendence(this); 
	}
	

}
