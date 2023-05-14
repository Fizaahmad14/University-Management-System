package Buisnesslogic;

import database.DBHandler;

public class studentCard extends Student{

	DBHandler db = new DBHandler();
	private String Balance;
	private String MemberShips;
	private String degree;
	public String getBalance() {
		return Balance;
	}
	public void setBalance(String balance) {
		Balance = balance;
	}
	public String getMemberShips() {
		return MemberShips;
	}
	public void setMemberShips(String memberShips) {
		MemberShips = memberShips;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public studentCard(String balance, String memberShips, String degree) {
		this.Balance = balance;
		this.MemberShips = memberShips;
		this.degree = degree;
	}
	public void setStudentCard(String balance, String memberShips, String degree) {
		this.setBalance(balance);
		this.setMemberShips(memberShips);
		this.setDegree(degree);
		db.saveCard(this);
	}
	
	public studentCard() {
		super();
	}

	
	

}
