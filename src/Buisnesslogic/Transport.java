package Buisnesslogic;

public class Transport {

	private String name;
	private String numberPlate;
	private String timeSlot;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumberPlate() {
		return numberPlate;
	}
	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
	public String getTimeSlot() {
		return timeSlot;
	}
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}
	@Override
	public String toString() {
		return "Transport [name=" + name + ", numberPlate=" + numberPlate + ", timeSlot=" + timeSlot + "]";
	}
	public Transport(String name, String numberPlate, String timeSlot) {
		super();
		this.name = name;
		this.numberPlate = numberPlate;
		this.timeSlot = timeSlot;
	}
	
}
