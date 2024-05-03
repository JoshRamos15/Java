package extra;

public class Course {
	
		private String courseName;
		private String[] students = new String[100];
		private int numberOfStudent;
		
		Course(){}
		Course(String CourseName){
			this.courseName = courseName;
		}
		public String getCourseName() {
			return this.courseName;
		}
		public void addStudent(String student) {
			students[numberOfStudent] = student;
			numberOfStudent++;
		}
		public void dropStudent(String student) {
			for(int i=0; i<100; i++) {
				if(students[i] == student) students[i] = null;
			}
		}
		public String[] getStudents() {
			return this.students;
		}
		
		public int getNumberOfStudents() {
			return numberOfStudent;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		}

	}
/**
 * Average is sum/nums.length
 */
