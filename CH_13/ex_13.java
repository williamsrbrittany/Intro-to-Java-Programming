public class Chapter13Lab3 {

	public static void main(String[] args) {
		//Creating the courses and cloning course1 
		Course course1 = new Course("CIT 249");
		course1.addStudent("S1");
		course1.addStudent("S2");
		course1.addStudent("S3");
		
		Course course2 = (Course) course1.clone();
		course2.addStudent("S4");
		course2.addStudent("S5");
		course2.addStudent("S6");
		
		System.out.println("Students in course " + course1.getCourse1Name());
		
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(course1.getStudents()[i] + " ");
		
		System.out.println("\nStudents in the cloned course " + course2.getCourse1Name());
		
		for (int i = 0; i < course2.getNumberOfStudents(); i++)
			System.out.print(course2.getStudents()[i] + " ");
	}

}

class Course implements Cloneable{
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
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
		
		public String getCourse1Name() {
			return courseName;
		}
		
		public Object clone() {
			try {
				Course c = (Course) super.clone();
				c.students = new String[100];
				System.arraycopy(students, 0, c.students, 0, 100);
				
				c.numberOfStudents = numberOfStudents;
				return c;
			}
			catch (CloneNotSupportedException ex) {
				return null;
			}
		}
		
	}

