
public class Person implements Comparable<Person>{
	
	private String name;
	private int birthYear;
	
	public Person() {
		this.name="";
		this.birthYear=0;
	}
	
	public Person(String name,int birthYear) {
		this.name=name;
		this.birthYear=birthYear;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getBirthYear() {
		return this.birthYear;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setBirthYear(int year) {
		this.birthYear=year;
	}
	
	@Override
	public String toString() {
		return String.format("Person: Name: %30s | Birth Year: %4d",
				this.name,this.birthYear);
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Person) {
			Person otherPerson=(Person)o;
			if(this.name==otherPerson.name) {
				if(this.birthYear==otherPerson.birthYear) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public int compareTo(Person p) {
		if(this.birthYear<p.birthYear) {
			return -1;
		}
		else if(this.birthYear>p.birthYear) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
