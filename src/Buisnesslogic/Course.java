package Buisnesslogic;

import database.DBHandler;

public class Course {

	DBHandler db = new DBHandler();
	private String name;
	private String creditHrs;
	private String type;
	private String register;
	public Course() {
		super();
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCreditHrs() {
		return creditHrs;
	}
	
	public void setCreditHrs(String creditHrs) {
		this.creditHrs = creditHrs;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}
	public Course(String name, String creditHrs, String type, String register) {
		super();
		this.name = name;
		this.creditHrs = creditHrs;
		this.type = type;
		this.register = register;
	}
	public void setCourse(String name, String creditHrs, String type)
	{
		this.setName(name);
		this.setCreditHrs(creditHrs);
		this.setType(type);
		this.setRegister(type);
		db.saveCourse(this);
	}

	
	

}
