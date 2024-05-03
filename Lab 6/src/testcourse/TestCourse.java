package testcourse;

public class TestCourse {
	
		private String DataStructures;
		private String courseName1 = DataStructures;
		private String DatabaseSystems;
		private String courseName2 = DatabaseSystems;
		
		public String[] students = new String[100];
		private int numberOfStudents;
		public TestCourse(String courseName) {
		this.courseName1 = courseName1;
		}
	
	public void Course1(String DataStructures) {
		this.DataStructures = DataStructures;
		
	}
	
	public void Course2(String DatabaseSystems) {
		this.DatabaseSystems = DatabaseSystems;
	}
	
	
	
	
	
	
		public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
		}
	
	
	
	
	
	
	public String[] getStudents() {
		return students;
		}
		public int getNumberOfStudents() {
		return numberOfStudents;
		}
		public String getCourseName() {
		return courseName;
		}
		}

}
}
