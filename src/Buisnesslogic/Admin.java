package Buisnesslogic;

public class Admin {
//read student data from db and assign id's , fee challan 
	private String name;
	private String designation;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Admin [name=" + name + ", designation=" + designation + "]";
	}
	public Admin(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}

}
