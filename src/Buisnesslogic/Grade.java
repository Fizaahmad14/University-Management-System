package Buisnesslogic;

import database.DBHandler;

public class Grade {
		
		private String grade;
		private String name;
		private String rollno;
		private String course;
		
		DBHandler db = new DBHandler();

		public String getGrade() {
			return grade;
		}

		public void setGrade(String grade) {
			this.grade = grade;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRollno() {
			return rollno;
		}

		public void setRollno(String rollno) {
			this.rollno = rollno;
		}

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}

		public Grade(String rollno, String name, String course,String grade) {
			
			this.grade = grade;
			this.name = name;
			this.rollno = rollno;
			this.course = course;
		}
		public Grade() {
			super();
			
		}
		public void setStudentGrade(String rollno, String name,  String course,String grade) {
			
			this.setCourse(course);
			this.setGrade(grade);
			this.setName(name);
			this.setRollno(rollno);
			db.saveGrade(this);
		}
		
		
		
}
