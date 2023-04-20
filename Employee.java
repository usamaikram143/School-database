
public class Employee extends Person{
	
	private String deptName;
	private static int numEmployees=0;
	private int employeeID;
	
	public Employee() {
		super();
		deptName="";
		numEmployees++;
		employeeID=numEmployees;
	}
	
	public Employee(String deptName) {
		this();
		this.deptName=deptName;
	}
	
	public Employee(String name,int birthYear,String deptName) {
		this();
		super.setName(name);
		super.setBirthYear(birthYear);
		this.deptName=deptName;
		
	}
	
	public String getDeptName() {
		return this.deptName;
	}
	
	public static int getNumEmployees() {
		return numEmployees;
	}
	
	public int getEmployeeID() {
		return this.employeeID;
	}
	
	public void setDeptName(String deptName) {
		this.deptName=deptName;
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(o instanceof Employee) {
			Employee otherEmployee=(Employee)o;
			if(super.equals(otherEmployee)) {
				if(this.deptName==otherEmployee.deptName) {
					if(this.employeeID==otherEmployee.employeeID) {
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
		s=s+String.format(" Employee: Department: %20s | "
				+ "Employee Number: %3d",this.deptName,this.employeeID);
		return s;
	}
	
	public int compareTo(Employee e) {
		if(this.employeeID<e.employeeID) {
			return -1;
		}
		else if(this.employeeID>e.employeeID) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
