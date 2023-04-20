
public class GeneralStaff extends Employee{
	
	private String duty;
	
	public GeneralStaff() {
		super();
		duty="";
	}
	public GeneralStaff(String duty) {
		super();
		this.duty=duty;
	}
	
	public GeneralStaff(String deptName,String duty) {
		super(deptName);
		this.duty=duty;
	}
	
	public GeneralStaff(String name,int birthYear, String deptName,String duty) {
		super(name,birthYear,deptName);
		this.duty=duty;
	}
	
	public String getDuty() {
		return this.duty;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof GeneralStaff) {
			GeneralStaff otherGeneralStaff=(GeneralStaff)o;
			if(super.equals(otherGeneralStaff)) {
				if(this.duty==otherGeneralStaff.duty) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		String s=super.toString();
		s+=String.format(" GeneralStaff: Duty: %10s",this.duty);
		return s;
	}
	

}
