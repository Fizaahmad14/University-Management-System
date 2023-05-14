package Buisnesslogic;
import java.util.ArrayList;

import database.DBHandler;

public class Student  
{
	private String name;
	private String cnic;
	private String rollNo; 
	private String address; 
	private String phoneNo;
	ArrayList<Course> courses = new ArrayList<Course>();
	DBHandler db = new DBHandler();
	
	public Student() {
		super();
	}

	public Student(String name, String cnic, String rollNo, String address,String phoneNo) {
		super();
		this.name = name;
		this.cnic = cnic;
		this.rollNo = rollNo;
		this.address = address;
		this.phoneNo = phoneNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCnic() {
		return cnic;
	}
	public void setCnic(String cnic) {
		this.cnic = cnic;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
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
	public ArrayList<Course> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	public void setStudent(String name, String cnic, String rollNo, String address, String phoneNo) {
		this.name = name;
		this.cnic = cnic;
		this.rollNo = rollNo;
		this.address = address;
		this.phoneNo = phoneNo;
		db.saveStudent(this); 
	}
	public void registerCourses(Course obj){
		obj.setRegister("Registered");
		this.courses.add(obj);
		//generateFee
		String query = "Update courses set register = '" + "Registered" + "' Where name = '" + obj.getName() + "'";
		db.updateAttendance(query);
	}
	
	
}
