package Buisnesslogic;
public class University {

	private String name;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "University [name=" + name + ", address=" + address + "]";
	}
	public University(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public University() {
		
	}
	
	
}
