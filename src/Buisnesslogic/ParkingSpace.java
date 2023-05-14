package Buisnesslogic;

public class ParkingSpace {

	public Integer slotNumber;
	public Integer slotTotal;
	public Integer getSlotNumber() {
		return slotNumber;
	}
	public void setSlotNumber(Integer slotNumber) {
		this.slotNumber = slotNumber;
	}
	public Integer getSlotTotal() {
		return slotTotal;
	}
	public void setSlotTotal(Integer slotTotal) {
		this.slotTotal = slotTotal;
	}
	@Override
	public String toString() {
		return "ParkingSpace [slotNumber=" + slotNumber + ", slotTotal=" + slotTotal + "]";
	}
	public ParkingSpace(Integer slotNumber, Integer slotTotal) {
		super();
		this.slotNumber = slotNumber;
		this.slotTotal = slotTotal;
	}
	


}
