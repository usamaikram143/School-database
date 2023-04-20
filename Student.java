
public class Student extends Person {
	
	private static int numStudents=0;
	private int studentID;
	private Course[] coursesTaken;
	private int numCoursesTaken;
	private boolean isGraduate;
	private String major;
	
	public Student() {
		super();
		coursesTaken=new Course[50];
		numCoursesTaken=0;
		isGraduate=false;
		major="undeclared";
		numStudents++;
		studentID=numStudents;
	}
	
	public Student(boolean isGraduate) {
		this();
		this.isGraduate=isGraduate;
	}
	
	public Student(String major,boolean isGraduate) {
		this();
		this.major=major;
		this.isGraduate=isGraduate;
	}
	
	public Student(String name,int birthYear,String major,boolean isGraduate) {
		this();
		super.setName(name);
		super.setBirthYear(birthYear);
		this.major=major;
		this.isGraduate=isGraduate;
	}
	
	public boolean isGraduate() {
		return this.isGraduate;
	}
	
	public int getNumCoursesTaken() {
		return this.numCoursesTaken;
	}
	
	public static int getNumStudents() {
		return numStudents;
	}
	
	public int getStudentID() {
		return this.studentID;
	}
	
	public String getMajor() {
		return this.major;
	}
	
	public void setIsGraduate(boolean isGraduate) {
		this.isGraduate=isGraduate;
	}
	
	public void setMajor(String major) {
		this.major=major;
	}
	
	public void addCourseTaken(Course course) {
		if(this.numCoursesTaken<50) {
			this.coursesTaken[this.numCoursesTaken]=course;
			this.numCoursesTaken++;
		}
	}
	
	public void addCoursesTaken(Course[] course) {
		for(int i=0;i<course.length;i++) {
			this.addCourseTaken(course[i]);
		}
	}
	
	public Course getCourseTaken(int index) {
		if(index<this.numCoursesTaken && index>-1) {
			return this.coursesTaken[index];
		}
		
		return null;
	}
	
	public String getCourseTakenAsString(int index) {
		if(index<this.numCoursesTaken && index>-1) {
			return this.coursesTaken[index].getCourseDept()+"-"+this.coursesTaken[index].getCourseNum();
		}
		return "";
	}
	
	public String getAllCoursesTakenAsString() {
		String s="";
		for(int i=0;i<this.numCoursesTaken;i++) {
			s+=this.getCourseTakenAsString(i);
			if(i!=this.numCoursesTaken-1) {
				s+=",";
			}
		}
		return s;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Student) {
			Student otherStudent=(Student)o;
			if(super.equals(otherStudent)) {
				if(this.isGraduate==otherStudent.isGraduate) {
					if(this.major==otherStudent.major) {
						if(this.studentID==otherStudent.studentID) {
							if(this.numCoursesTaken==otherStudent.numCoursesTaken) {
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		String s=super.toString();
		String graduate;
		if(this.isGraduate) {
			graduate="Graduate";
		}
		else {
			graduate="Undergraduate";
		}
		s+=String.format(" Student: studentID: %04d | "
				+ "Major %20s | "
				+ "%14s | "
				+ "Number of Courses Taken: %3d | "
				+ "Courses Taken: %s",this.studentID,this.major,graduate,
				this.numCoursesTaken,this.getAllCoursesTakenAsString());
		return s;
	}
	
	
	public int compareTo(Student s) {
		if(this.numCoursesTaken<s.numCoursesTaken) {
			return -1;
		}
		else if(this.numCoursesTaken>s.numCoursesTaken) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
