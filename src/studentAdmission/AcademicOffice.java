package studentAdmission;
import java.util.ArrayList;

import Buisnesslogic.Attendance;
import Buisnesslogic.Course;
import Buisnesslogic.Faculty;
import Buisnesslogic.FacultyAccount;
import Buisnesslogic.FeeChallan;
import Buisnesslogic.Grade;
import Buisnesslogic.Student;
import Buisnesslogic.StudentAccount;
import database.DBHandler;

public class AcademicOffice {

	public AcademicOffice() {
		// TODO Auto-generated constructor stub
	}
	DBHandler db = new DBHandler();
	Grade g = new Grade();
	Attendance a = new Attendance();
	Student stud = new Student();
	FeeChallan Fee = new FeeChallan();
	StudentAccount sa = new StudentAccount();
	Faculty fac = new Faculty();
	FacultyAccount fAcc = new FacultyAccount(); 
	
	ArrayList<Course> courses = new ArrayList<Course>();
	ArrayList<Admission> ad = new ArrayList<Admission>();
	ArrayList<Student> s = new ArrayList<Student>();
	ArrayList<Faculty> f = new ArrayList<Faculty>();
	ArrayList<Grade> gList = new ArrayList<Grade>();
	
	public void assignStudentIDs()
	{
		
		s = db.readStudent();
		ad = db.readAdmission();
		String lastRollNo;
		if(s.isEmpty()) 
			lastRollNo = "0000";
		else
			lastRollNo = s.get(s.size()-1).getRollNo();
		int lastFourDigits = Integer.parseInt(lastRollNo.substring(lastRollNo.length()-4));
		//------------------------------------------ASSINGING ROLL NUMBERS, USERNAME, PASSWORD
		for(int i=0; i<ad.size(); i++)
		{
			lastFourDigits++; 
			String newLastFour = Integer.toString(lastFourDigits);
			if(newLastFour.length()==1)
				newLastFour = "000"+newLastFour;
			if(newLastFour.length()==2)
				newLastFour = "00"+newLastFour;
			if(newLastFour.length()==3)
				newLastFour = "0"+newLastFour;
			//------------------------------------------------ROLL NUMBER
			String rollno = ad.get(i).getBatch()+newLastFour;
			String[] array = ad.get(i).getName().split(" ");
			//------------------------------------------------USERNAME/EMAIL
			String username = array[0]+rollno+"@tech.edu.pk";
			//------------------------------------------------PASSWORD
			String password = "tech"+rollno;
			
			stud.setStudent(ad.get(i).getName(), ad.get(i).getCnic(),rollno,ad.get(i).getAddress(),ad.get(i).getPhoneNo());
			sa.setStudentAccout(username, password);
			System.out.println(rollno);
			a.setAttendence(rollno,ad.get(i).getName(), "-");
			g.setStudentGrade(rollno, ad.get(i).getName(), "Data Structures", "-");
		}
		db.clearAdmissions();
	}
	public void assignFacultyIDs()
	{
		f = db.readFaculty();
		for(int i=0; i<f.size(); i++)
		{
			String username = f.get(i).getFname()+"."+f.get(i).getLname()+"@tech.edu.pk";
			String generate = f.get(i).getCnic().substring(f.get(i).getCnic().length()-4);
			String password = f.get(i).getFname()+generate+"@tech";
			fAcc.setFacultyAccout(username, password);
		}
	}
	public ArrayList<Course> getCoursesDB(){
		courses = db.readCourse();
		return courses;
	}
	public String generateFee(ArrayList<Course> courses){
		int fees = 1;
		for(int i=0;  i<courses.size(); i++)
		{
			int ch = Integer.parseInt(courses.get(i).getCreditHrs());
			fees = fees + (ch*8500);
		}
		String finalFee = Integer.toString(fees);
		Fee.setFee(finalFee);
		return finalFee;
	}
	
	public String generateSGPA(ArrayList<Course> c,ArrayList<Grade> g) {
		
		double SGPA = 0;
		double points = 0;
		int crdHrs = 0;
		double grade = 0; 
		for(int i=0; i<5; i++)
		{
			if (g.get(i).getGrade().equals("A+")) grade = 4.00;
			else if (g.get(i).getGrade().equals("A")) grade = 4.00;
			else if (g.get(i).getGrade().equals("A-")) grade = 3.67;
			else if (g.get(i).getGrade().equals("B+")) grade = 3.33;
			else if (g.get(i).getGrade().equals("B")) grade = 3.00;
			else if (g.get(i).getGrade().equals("B-")) grade = 2.67;
			else if (g.get(i).getGrade().equals("C+")) grade = 2.33;
			else if (g.get(i).getGrade().equals("C")) grade = 2.00;
			else if (g.get(i).getGrade().equals("C-")) grade = 1.67;
			else if (g.get(i).getGrade().equals("D+")) grade = 1.33;
			else if (g.get(i).getGrade().equals("D")) grade = 1.00;
			else if (g.get(i).getGrade().equals("F")) grade = 0.00;
			crdHrs += Double.parseDouble(c.get(i).getCreditHrs());
			points += grade*Double.parseDouble(c.get(i).getCreditHrs());
		}
		SGPA = points/crdHrs;
		String.format("%.2f", SGPA);
		System.out.println(SGPA);
		return Double.toString(SGPA);
	}
	
}
