package testcourse;

public class TestCourse {

		private String courseName;                            // Code from powerpoint slides chapter 6 slide 22
		private String[] students = new String[100];               
		private int numberOfStudents;
		public TestCourse(String courseName) {
		this.courseName = courseName;
		}
		public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
		}
		void showStudent() {
		for(int i=0; i< this.numberOfStudents; i++)
		System.out.println(this.students[i]);
		}
		public String[] getStudents() {              // Code from powerpoint slides chapter 6 slide 23
		return students;


		
		}
		public int getNumberOfStudents() {           
		return numberOfStudents;
		}
		public String getCourseName() {
		return courseName;
		}

		public void dropStudent(String student) {
	
		}
		public static void main(String[] args) {                  // Starting  main method
		// TODO Auto-generated method stub
		TestCourse course1 = new TestCourse("Data Structures" );   // Initalize course 1 as Data Structures as instructed
		course1.addStudent("Peter Jones");                         // Adding the 3 student names to course 1
		course1.addStudent("Brain Smith");
		course1.addStudent("Anne Kennedy");
		TestCourse course2 = new TestCourse("Database Systems" );   // Initalize course 2 as Database systems as instructed 
		course2.addStudent("Peter Jones");                          // Adding the 2 student names to course 2
		course2.addStudent("Steve Smith");

		System.out.println("Course 1 is " +course1.getCourseName()+ " Course 1 has " + course1.numberOfStudents+ " The students in course 1 are ");
		course1.showStudent();
		System.out.println("Course 2 name is " +course2.getCourseName()+ " and there are " + course2.numberOfStudents+ " students are named " );
		course2.showStudent();
		}

}

