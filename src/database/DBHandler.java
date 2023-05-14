package database;
import studentAdmission.Admission;
import java.sql.*;
import java.util.ArrayList;
import Buisnesslogic.*;

public class DBHandler {

	private String username = "root";
	private String password = "2287";
	//connection object
	Connection con;
	public DBHandler() {
		// TODO Auto-generated constructor stub
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nucs",username,password);
			//System.out.println("Connection Successfull\n");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection Failed\n");
			e.printStackTrace();
		}
	}
	//-----------------------------------------------------------------------ADMISSIONS
	public ArrayList<Admission> readAdmission() {

		ArrayList<Admission> admission = new ArrayList<Admission>();
		Statement stm;
		try 
		{
			stm = con.createStatement();

			String query = "SELECT * FROM admissionform";
			ResultSet rs = stm.executeQuery(query);
			while (rs.next()) 
			{
				Admission a = new Admission(rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
				admission.add(a);
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return admission;
	}

	public void saveAdmission(Admission a) {
		try {
			String query = "INSERT INTO admissionform (batch,name,cnic,email,phoneNo,preference,fatherName,fatherCnic,address) VALUES (?,?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, a.getBatch());
			stmt.setString(2, a.getName());
			stmt.setString(3, a.getCnic());
			stmt.setString(4, a.getEmail());
			stmt.setString(5, a.getPhoneNo());
			stmt.setString(6, a.getPreference());
			stmt.setString(7, a.getFatherName());
			stmt.setString(8, a.getFatherCnic());
			stmt.setString(9, a.getAddress());
	
			int rows = stmt.executeUpdate();
			if (rows > 0) {
				System.out.println("A student was added...");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void saveFall2023(Admission a) {
		try {
			String query = "INSERT INTO fall2023 (batch,name,cnic,email,phoneNo,preference,fatherName,fatherCnic,address) VALUES (?,?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, a.getBatch());
			stmt.setString(2, a.getName());
			stmt.setString(3, a.getCnic());
			stmt.setString(4, a.getEmail());
			stmt.setString(5, a.getPhoneNo());
			stmt.setString(6, a.getPreference());
			stmt.setString(7, a.getFatherName());
			stmt.setString(8, a.getFatherCnic());
			stmt.setString(9, a.getAddress());
	
			int rows = stmt.executeUpdate();
			if (rows > 0) {
				System.out.println("A student in fall2023 was added...");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void clearAdmissions()
	{	
		try (Statement st = con.createStatement();)
		{
			String query1 = "Delete from admissionform ";
			st.executeUpdate(query1);
			System.out.println("Succesfully deleted");
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			System.out.println("Error in deletion");
			e.printStackTrace();
		}
	}
	//-----------------------------------------------------------------------STUDENT INFORMATION
	public ArrayList<Student> readStudent() {

		ArrayList<Student> students = new ArrayList<Student>();
		Statement stm;
		try 
		{
			stm = con.createStatement();

			String query = "SELECT * FROM studentInfo";
			ResultSet rs = stm.executeQuery(query);
			while (rs.next()) 
			{
				Student s = new Student(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5));
				students.add(s);
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return students;
	}	

	public void saveStudent(Student s) {
		try {
			String query = "INSERT INTO studentInfo (name,cnic,rollNo,address,phoneNo) VALUES (?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, s.getName());
			stmt.setString(2, s.getCnic());
			stmt.setString(3, s.getRollNo());
			stmt.setString(4, s.getAddress());
			stmt.setString(5, s.getPhoneNo());
	
			int rows = stmt.executeUpdate();
			if (rows > 0) {
				System.out.println("A student was added...");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void deleteStudents(String rollNo)
	{
		
		try (Statement st = con.createStatement();)
		{
			String query1 = "Delete from studentInformation  Where rollNo = '" + rollNo + "'";
			st.executeUpdate(query1);
			System.out.println("Succesfully deleted");
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			System.out.println("Error in deletion");
			e.printStackTrace();
		}
	}
	//-----------------------------------------------------------------------STUDENT ACCOUNT
	public ArrayList<StudentAccount> readStudentAccount() 
	{

		ArrayList<StudentAccount> acc = new ArrayList<StudentAccount>();
		Statement stm;
		try {
			stm = con.createStatement();

			String query = "SELECT * FROM studentAccount";
			ResultSet rs = stm.executeQuery(query);
			while (rs.next()) {
				StudentAccount s = new StudentAccount(rs.getString(1), rs.getString(2));
				acc.add(s);
			}
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return acc;
	}
    	

	public void saveStudentAccount(StudentAccount s) {
		try {
			String query = "INSERT INTO studentAccount (username,password) VALUES (?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, s.getUsername());
			stmt.setString(2, s.getPassword());

			int rows = stmt.executeUpdate();
			if (rows > 0) {
				System.out.println("A student Account was added...");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	//-----------------------------------------------------------------------FACULTY INFORMATION
	public ArrayList<Faculty> readFaculty() {

		ArrayList<Faculty> faculty = new ArrayList<Faculty>();
		Statement stm;
		try {
			stm = con.createStatement();

			String query = "SELECT * FROM facultyInfo";
			ResultSet rs = stm.executeQuery(query);
			while (rs.next()) {
				Faculty f = new Faculty(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5));
				faculty.add(f);
			}
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return faculty;
	}

	public void saveFaculty(Faculty f) {
		try {
			String query = "INSERT INTO facultyInfo (fname,lname,cnic,address,phoneNo) VALUES (?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, f.getFname());
			stmt.setString(2, f.getLname());
			stmt.setString(3, f.getCnic());
			stmt.setString(4, f.getAddress());
			stmt.setString(5, f.getPhoneNo());
	
			int rows = stmt.executeUpdate();
			if (rows > 0) {
				System.out.println("A Faculty was added...");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//-----------------------------------------------------------------------FACULTY ACCOUNT
	public ArrayList<FacultyAccount> readFacultyAccount() 
	{

		ArrayList<FacultyAccount> acc = new ArrayList<FacultyAccount>();
		Statement stm;
		try {
			stm = con.createStatement();

			String query = "SELECT * FROM facultyAccount";
			ResultSet rs = stm.executeQuery(query);
			while (rs.next()) {
				FacultyAccount f = new FacultyAccount(rs.getString(1), rs.getString(2));
				acc.add(f);
			}
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return acc;
	}
    	

	public void saveFacultyAccount(FacultyAccount f) {
		try {
			String query = "INSERT INTO facultyAccount (username,password) VALUES (?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, f.getUsername());
			stmt.setString(2, f.getPassword());

			int rows = stmt.executeUpdate();
			if (rows > 0) {
				System.out.println("A faculty Account was added...");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	//-----------------------------------------------------------------------COURSES
	public ArrayList<Course> readCourse() 
	{

		ArrayList<Course> Courses = new ArrayList<Course>();
		Statement stm;
		try {
			stm = con.createStatement();

			String query = "SELECT * FROM courses";
			ResultSet rs = stm.executeQuery(query);
			while (rs.next()) 
			{
				Course s = new Course(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4));
				Courses.add(s);
			}
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Courses;
	}
	public void saveCourse(Course s) 
	{
		try 
		{
			String query = "INSERT INTO courses (name,creditHrs,type,register) VALUES (?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, s.getName());
			stmt.setString(2, s.getCreditHrs());
			stmt.setString(3, s.getType());
			stmt.setString(4, s.getRegister());
			int rows = stmt.executeUpdate();
			if (rows > 0) 
			{
				System.out.println("A Course was added...");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	//-----------------------------------------------------------------------ATTENDENCE
	public ArrayList<Attendance> readAttendence() {

		ArrayList<Attendance> att = new ArrayList<Attendance>();
		Statement stm;
		try 
		{
			stm = con.createStatement();

			String query = "SELECT * FROM attendence";
			ResultSet rs = stm.executeQuery(query);
			while (rs.next()) 
			{
				Attendance a = new Attendance(rs.getString(1), rs.getString(2), rs.getString(3));
				att.add(a);
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return att;
	}	

	public void saveAttendence(Attendance a) {
		try {
			String query = "INSERT INTO attendence (rollno, name, att) VALUES (?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, a.getRollno());
			stmt.setString(2, a.getName());
			stmt.setString(3, a.getAtt());
	
			int rows = stmt.executeUpdate();
			if (rows > 0) {
				System.out.println("A attendence was added...");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void updateAttendance(String query)
	{
		
		try (Statement st = con.createStatement();)
		{
			st.executeUpdate(query);
			System.out.println("Succesfully updated/deleted Attendance");
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			System.out.println("Error in updation/deletion of Attendance");
			e.printStackTrace();
		}
	}
	//-----------------------------------------------------------------------STUDENT CARD INFORMATION
		public ArrayList<studentCard> readCard() {

			ArrayList<studentCard> studentCard = new ArrayList<studentCard>();
			Statement stm;
			try {
				stm = con.createStatement();

				String query = "SELECT * FROM studentCard";
				ResultSet rs = stm.executeQuery(query);
				while (rs.next()) {
					studentCard f = new studentCard(rs.getString(1), rs.getString(2), rs.getString(3));
					studentCard.add(f);
				}
			}
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return studentCard;
		}

		public void saveCard(studentCard f) {
			try {
				String query = "INSERT INTO studentCard (balance,memberships,degree) VALUES (?,?,?)";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, f.getBalance());
				stmt.setString(2, f.getMemberShips());
				stmt.setString(3, f.getDegree());
		
				int rows = stmt.executeUpdate();
				if (rows > 0) {
					System.out.println("A card was added...");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		//-----------------------------------------------------------------------GRADES INFORMATION
				public ArrayList<Grade> readGrade() {

					ArrayList<Grade> Grade = new ArrayList<Grade>();
					Statement stm;
					try {
						stm = con.createStatement();

						String query = "SELECT * FROM GradeTable";
						ResultSet rs = stm.executeQuery(query);
						while (rs.next()) {
							Grade f = new Grade(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4));
							Grade.add(f);
						}
					}
					catch (SQLException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return Grade;
				}

				public void saveGrade(Grade f) {
					try {
						String query = "INSERT INTO GradeTable (id,name,course,grade) VALUES (?,?,?,?)";
						PreparedStatement stmt = con.prepareStatement(query);
						stmt.setString(1, f.getRollno());
						stmt.setString(2, f.getName());
						stmt.setString(3, f.getCourse());
						stmt.setString(4, f.getGrade());
				
						int rows = stmt.executeUpdate();
						if (rows > 0) {
							System.out.println("A grade was added...");
						}
					} catch (Exception e) {
						System.out.println(e);
					}
				}

}
