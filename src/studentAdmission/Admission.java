package studentAdmission;

import database.DBHandler;

//import application.SampleController;

public class Admission {

	//SampleController s = new SampleController();
	DBHandler db = new DBHandler();
	private String name;
	 
	private String cnic;
	 
    private String email;
    
    private String phoneNo;
    
    private String preference;
    
    private String fatherName;

    private String fatherCnic;
    
    private String address;
    
    private String batch = "23"; 
    
    
    public Admission() {
		super();
	}
	public Admission(String batch, String name, String cnic, String email, String phoneNo, 
    		         String preference, String fatherName,
			         String fatherCnic, String address) 
    {
		super();
		this.batch = batch;
		this.name = name;
		this.cnic = cnic;
		this.email = email;
		this.phoneNo = phoneNo;
		this.preference = preference;
		this.fatherName = fatherName;
		this.fatherCnic = fatherCnic;
		this.address = address;
	}
	//------------------------------------------Address
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//------------------------------------------Cnic
	public String getCnic() {
		return cnic;
	}
	public void setCnic(String cnic) {
		this.cnic = cnic;
	}
	//------------------------------------------Email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//------------------------------------------Father's Cnic
	public String getFatherCnic() {
		return fatherCnic;
	}
	public void setFatherCnic(String fatherCnic) {
		this.fatherCnic = fatherCnic;
	}
	//------------------------------------------Father's Name
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	//------------------------------------------Student Name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//------------------------------------------Phone Number
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	//------------------------------------------Preference
	public String getPreference() {
		return preference;
	}
	public void setPreference(String preference) {
		this.preference = preference;
	}
	//------------------------------------------Batch
	public String getBatch() {
			return this.batch;
		}
	public void setBatch(String batch) {
			this.batch = batch;
		}
	//------------------------------------------setting form
	public void setAdmissionForm(String batch,String name, String cnic, String email, String phoneNo,
			                     String preference,String fatherName, 
			                     String fatherCnic, String address)
	{
		
		this.setBatch(batch);
		this.setName(name);
		this.setCnic(cnic);
		this.setEmail(email);
		this.setPhoneNo(phoneNo);
		this.setPreference(preference);
		this.setFatherName(fatherName);
		this.setFatherCnic(fatherCnic);
		this.setAddress(address);
		db.saveAdmission(this);
	}
	//------------------------------------------records database
	public void setFall2023(String batch,String name, String cnic, String email, String phoneNo,
            String preference,String fatherName, 
            String fatherCnic, String address)
	{
		this.setBatch(batch);
		this.setName(name);
		this.setCnic(cnic);
		this.setEmail(email);
		this.setPhoneNo(phoneNo);
		this.setPreference(preference);
		this.setFatherName(fatherName);
		this.setFatherCnic(fatherCnic);
		this.setAddress(address);
		db.saveFall2023(this);
	}
	

}
