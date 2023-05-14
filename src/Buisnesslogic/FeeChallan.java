package Buisnesslogic;
public class FeeChallan {

	public String challanNo;
	public String fee;

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getChallanNo() {
		return challanNo;
	}

	public void setChallanNo(String challanNo) {
		this.challanNo = challanNo;
	}
	public FeeChallan() {
		super();
	}
	public FeeChallan(String challanNo, String fee) {
		super();
		this.challanNo = challanNo;
		this.fee = fee;
	}
}
