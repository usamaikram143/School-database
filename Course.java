package project;

public class Course implements Comparable<Course> {
	
	private boolean isGraduateCourse;
	private int courseNum;
	private String courseDept;
	private int numCredits;
	
	
	public Course (boolean isGraduateCourse, int courseNum, String courseDept, int numCredits) {
		this.isGraduateCourse=isGraduateCourse;
		this.courseNum=courseNum;
		this.courseDept=courseDept;
		this.numCredits=numCredits;
	}
	
	public boolean isGraduateCourse() {
		return this.isGraduateCourse;
	}
	
	public int getCourseNum() {
		return this.courseNum;
	}
	
	public String getCourseDept() {
		return this.courseDept;
	}
	
	public int getNumCredits() {
		return this.numCredits;
	}
	
	public String getCourseName() {
		if(this.isGraduateCourse) {
			return "G"+this.courseDept+this.courseNum;
		}
		
		return "U"+this.courseDept+this.courseNum;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Course) {
			Course otherCourse=(Course)o;
			if(this.isGraduateCourse==otherCourse.isGraduateCourse) {
				if(this.courseNum==otherCourse.courseNum) {
					if(this.courseDept==otherCourse.courseDept) {
						if(this.numCredits==otherCourse.numCredits) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		String s="";
		if(this.isGraduateCourse) {
			s="Graduate";
		}
		else {
			s="Undergraduate";
		}
		
		return String.format("Course: %3s-%3d | Number of Credits: %02d | "+s
				,this.courseDept,this.courseNum,this.numCredits);
	}
	
	public int compareTo(Course c) {
		if(this.courseNum<c.courseNum) {
			return -1;
		}
		else if(this.courseNum>c.courseNum) {
			return 1;
		}
		else {
			return 0;
		}	
	}

	
	
	
	
	
	
	
	
}
