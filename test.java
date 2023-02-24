package project;

public class test {

	public static void main(String[] args) {
		//Course c=new Course(true,101,"CS",3);
		//Course c1=new Course(false,120,"HIS",4);
		//Course c3=new Course(true,101,"CS",3);
		
		Employee e1=new Employee("Usama",1996,"CS");
		Employee e2=new Employee("Usama",1996,"CS");
		
		//System.out.println(c.toString());
		//System.out.println(c1.toString());
		
		//System.out.println(c.equals(c3));
		
		System.out.println(e2.toString());
		System.out.println(e1.equals(e1));
		System.out.println(e1.equals(e2));
		//System.out.println(e1 instanceof Person);
	}

}
