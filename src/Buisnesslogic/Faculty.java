package Buisnesslogic;
import java.util.ArrayList;

import database.DBHandler;

public class Faculty {

	DBHandler db = new DBHandler();
	private String fname;
	private String lname;
	private String cnic;
	private String address;
	private String phoneNo;
	ArrayList<Attendance> attList = new ArrayList<Attendance>();
	public Faculty() {
		super();
	}
	public Faculty(String fname, String lname, String cnic, String address, String phoneNo) {
		this.fname = fname;
		this.lname = lname;
		this.cnic = cnic;
		this.address = address;
		this.phoneNo = phoneNo;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCnic() {
		return cnic;
	}
	public void setCnic(String cnic) {
		this.cnic = cnic;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public void setFaculty(String fname, String lname, String cnic, String address, String phoneNo)
	{
		this.setFname(fname);
		this.setLname(lname);
		this.setCnic(cnic);
		this.setAddress(address);
		this.setPhoneNo(phoneNo);
		db.saveFaculty(this);
	}
	public void markAttendance(Attendance att)
	{
		att.setAtt("P");
		String query = "Update attendence set att = '" + "P" + "' Where rollno = '" + att.getRollno() + "'";
		db.updateAttendance(query);		
	}
	public ArrayList<Attendance> readAttendance()
	{
		return db.readAttendence();		
	}

	public void markGrade(Grade g)
	{
		g.setGrade("A");
		String query = "Update GradeTable set grade = '" + "A" + "' Where id = '" + g.getRollno() + "'";
		db.updateAttendance(query);		
	}
	public ArrayList<Grade> readGrade()
	{
		return db.readGrade();	
	}	
	
}
