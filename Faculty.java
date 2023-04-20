
public class Faculty extends Employee {
	
	private Course[] coursesTaught;
	private int numCoursesTaught;
	private boolean isTenured;
	
	public Faculty() {
		super();
		coursesTaught=new Course[100];
		numCoursesTaught=0;
		isTenured=false;
	}
	
	public Faculty(boolean isTenured) {
		this();
		this.isTenured=isTenured;
	}
	
	public Faculty(String deptName,boolean isTenured) {
		this();
		super.setDeptName(deptName);
		this.isTenured=isTenured;
	}
	
	public Faculty(String name,int birthYear,String deptName,boolean isTenured) {
		this();
		super.setName(name);
		super.setBirthYear(birthYear);
		super.setDeptName(deptName);
		this.isTenured=isTenured;
	}
	
	public boolean isTenured() {
		return this.isTenured;
	}
	
	public int getNumCoursesTaught() {
		return this.numCoursesTaught;
	}
	
	public void setIsTenured(boolean isTenured) {
		this.isTenured=isTenured;
	}
	
	public void addCourseTaught(Course course) {
		if(this.numCoursesTaught<100) {
			this.coursesTaught[this.numCoursesTaught]=course;
			this.numCoursesTaught++;
		}
	}
	
	public void addCoursesTaught(Course[] course) {
		for(int i=0;i<course.length;i++) {
			this.addCourseTaught(course[i]);
		}
	}
	
	public Course getCourseTaught(int index) {
		if(index<this.numCoursesTaught && index>-1) {
			return this.coursesTaught[index];
		}
		return null;
	}
	
	public String getCourseTaughtAsString(int index) {
		if(index<this.numCoursesTaught && index>-1) {
			return this.coursesTaught[index].getCourseDept()+"-"+this.coursesTaught[index].getCourseNum();
		}
		return "";
	}
	
	public String getAllCoursesTaughtAsString() {
		String s="";
		for(int i=0;i<this.numCoursesTaught;i++) {
			s+=this.getCourseTaughtAsString(i);
			if(i!=this.numCoursesTaught-1) {
				s+=",";
			}
		}
		return s;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Faculty) {
			Faculty otherFaculty=(Faculty)o;
			if(super.equals(otherFaculty)) {
				if(this.isTenured==otherFaculty.isTenured) {
					if(this.numCoursesTaught==otherFaculty.numCoursesTaught) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		String s=super.toString();
		String tenure="";
		if(this.isTenured()) {
			tenure="Is Tenured";
		}
		else {
			tenure="Not Tenured";
		}
		s+=String.format(" Faculty: %11s | "
				+ "Number of Courses Taught: %3d | "
				+ "Courses Taught: %s",tenure,this.numCoursesTaught,this.getAllCoursesTaughtAsString());
		
		return s;
	}
	
	public int compareTo(Faculty f) {
		if(this.numCoursesTaught<f.numCoursesTaught) {
			return -1;
		}
		else if(this.numCoursesTaught>f.numCoursesTaught) {
			return 1;
		}
		else {
			return 0;
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
