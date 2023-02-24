
//URL FOR THE YOUTUBE VIDEO
//(https://youtu.be/CMkfWmykM0E)


//AT the end of this class i have commented the code for my menu


package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Driver_SchoolDB {

	public static void main(String[] args) {
		
		String fileName="SchoolDB_Initial.txt";
		Scanner inStream=null;
		
		try {
			File theFile = new File (fileName);
			inStream = new Scanner(theFile);
			while(inStream.hasNextLine()) {
				System.out.println(inStream.nextLine());
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found "+fileName);
		}
		finally {
			if(inStream!=null) {
				inStream.close();
			}
		}
		
		Course c1 = new Course(true,771,"MAT",4);
		
		Faculty f1 = new Faculty();
		Faculty f2 = new Faculty(true);
		Faculty f3 = new Faculty("MAT",false);
		Faculty f4 = new Faculty("Superman",1938,"PHY",true);
		
		Student s1 = new Student();
		Student s2 = new Student(false);
		Student s3 = new Student("Math",false);
		Student s4 = new Student("Wonderwoman",1941,"JST",true);
		
		GeneralStaff g1 = new GeneralStaff();
		GeneralStaff g2 = new GeneralStaff("advise students");
		GeneralStaff g3 = new GeneralStaff("Sanitation","clean");
		GeneralStaff g4 = new GeneralStaff("Flash Gordon",1934,"Security","safety");
		
		Course c2 = new Course(true,777,"CMP",4);
		Course c3 = new Course(true,711,"CMP",4);
		Course c4 = new Course(true,723,"MAT",4);
		Course c5 = new Course(false,168,"CMP",4);
		Course c6 = new Course(false,338,"CMP",4);
		
		System.out.println("\n**************************************************************");
		System.out.println("SCHOOL DATABASE INFO:\n");
		System.out.println("************************************************");
		System.out.println("COURSES:");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		System.out.println(c5.toString());
		System.out.println(c6.toString());
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("PERSONS:");
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("EMPLOYEES:");
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("GENERAL STAFF:");
		System.out.println(g1.toString());
		System.out.println(g2.toString());
		System.out.println(g3.toString());
		System.out.println(g4.toString());
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("FACULTY:");
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
		System.out.println(f4.toString());
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("STUDENTS:");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		System.out.println("************************************************");
		System.out.println("**************************************************************\n");

	}

}




/*
 * 																	MENU CLASS CODE

import java.io.PrintWriter;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		Course[] courses = new Course[3];
		Faculty[] faculty = new Faculty[3];
		GeneralStaff[] generalStaff = new GeneralStaff[3];
		Student[] students = new Student[3];
		int n;
		int action=1;
		
		
														//PRINTING DETAILS
														//LOOP SO KEEP ASKING USER ABOUT DIFFERENT ACTIONS 
														//0 INPUT REQUIRED TO EXIT LOOP
		while(action!=0) {
			System.out.println("\n\n********************************************************************************");
			System.out.println("\t\t\t\tMENU FOR THE SCHOOL DATABASE!!!");
			System.out.println("********************************************************************************");
			System.out.println("0. Exit.");
			System.out.println("100. Display all the Objects created.");
			System.out.println("1. Create 3 new Course Objects.");
			System.out.println("2. Create 3 new Faculty Objects.");
			System.out.println("3. Create 3 new GeneralStaff Objects.");
			System.out.println("4. Create 3 new Student objects.");
			System.out.println("5. Add 2 new Courses to a Faculty object.");
			System.out.println("6. Add 2 new Courses to a Student object.");
			System.out.println("7. Add an array of 2 Courses to a Faculty object.");
			System.out.println("8. Add an array of 2 Courses to a Student object.");
			System.out.println("9. Get the Course at index from a Faculty object.");
			System.out.println("10. Get the Course at index from a Student Object.");
			System.out.println("11. From a Faculty object Check if that Faculty teaches a specific Course.");
			System.out.println("12. Determine which Faculty object teaches the most and the least courses.");
			System.out.println("13. Determine which Course is the minimum of all Course objects in the catalog.");
			System.out.println("14. Determine which Course is the maximum of all Course objects in the catalog.");
			System.out.println("15. Determine which Student has the most and least credits.");
			System.out.println("16. To write the details of all the OBJECTS created so far to a file name SchoolDB_Updated.txt");
		
			System.out.print("\nEnter one of the actions from top: ");
			action=scnr.nextInt();
			
			if(action==0) {
				System.out.println("/nYou have pressed 0 to EXIT. HAVE A GOOD DAY!!!");
			}
			
									//TO DISPLAY ALL THE OBJECTS CREATED
			else if(action==100) {
				System.out.println("\nCOURSES:");
				for(int i=0;i<courses.length;i++) {
					if(courses[i]!=null) {
						System.out.println("Course "+(i+1)+": "+courses[i].toString());
					}
				}
				System.out.println("\n\nFACULTY:");
				for(int i=0;i<faculty.length;i++) {
					if(faculty[i]!=null) {
						System.out.println("Faculty "+(i+1)+": "+faculty[i].toString());
					}
				}
				System.out.println("\n\nGENERAL STAFF:");
				for(int i=0;i<generalStaff.length;i++) {
					if(generalStaff[i]!=null) {
						System.out.println("General Staff "+(i+1)+": "+generalStaff[i].toString());
					}
				}
				System.out.println("\n\nSTUDENTS:");
				for(int i=0;i<students.length;i++) {
					if(students[i]!=null) {
						System.out.println("Students "+(i+1)+": "+students[i].toString());
					}
				}
			}
			
														//FOR CREATING 3 NEW COURSE OBJECTS
			else if(action==1) {
				System.out.println("\t\t\t      (1. Creating 3 new Course Objects:)");
				n=0;
				while(n<3) {
					System.out.println("\n\t\t\t\t\t  COURSE "+(n+1)+":\n");
					System.out.println("Enter the information for the course "+(n+1)+" in the following format ONLY:");
					courses[n]=createCourseUserBased();
					n++;
				}
			}
			
													//FOR CREATING 3 NEW FACULTY OBJECTS
			else if(action==2) {
				n=0;
				System.out.println("\n\t\t\t      (2. Creating 3 new Faculty Objects:)");
				while(n<3) {
					System.out.println("\n\t\t\t\t\t  FACULTY "+(n+1)+":\n");
					System.out.println("Enter the information for the Faculty "+(n+1)+" in the following format ONLY:");
					faculty[n]=createFacultyUserBased();
					n++;
				}
			}
			
												//FOR CREATING 3 NEW GENERALSTAFF OBJECTS
			else if(action==3) {
				n=0;
				System.out.println("\n\t\t\t      (3. Creating 3 new GeneralStaff Objects:)");
				while(n<3) {
					System.out.println("\n\t\t\t\t\t  GENERAL STAFF "+(n+1)+":\n");
					System.out.println("Enter the information for the General Staff "+(n+1)+" in the following format ONLY:");
					generalStaff[n]=createGeneralStaffUserBased();
					n++;
				}
			}
			
										//FOR CREATING 3 NEW STUDENT OBJECTS
			else if(action==4) {
				n=0;
				System.out.println("\n\t\t\t      (4. Creating 3 new Student Objects:)");
				while(n<3) {
					System.out.println("\n\t\t\t\t\t  STUDENT "+(n+1)+":\n");
					System.out.println("Enter the information for the Student "+(n+1)+" in the following format ONLY:");
					students[n]=createStudentUserBased();
					n++;
				}
			}
			
									//FOR ADDING 2 NEW COURSES TO A FACULTY OBJECT
			else if(action==5) {
				System.out.println("\n\t\t\t      (5. Adding 2 new Courses to a Faculty member:)");
				System.out.println("We gonna add the first two courses from our previous courses "
						+ "that we created to the first Faculty member we created.");
				
				faculty[0].addCourseTaught(courses[0]);
				faculty[0].addCourseTaught(courses[1]);
				
				System.out.println("First two Courses have been added to the first Faculty member.");
				
			}
			
										//FOR ADDING 2 NEW COURSES TO A STUDENT OBJECT
			else if(action==6) {
				System.out.println("\n\t\t\t      (6. Adding 2 new Courses to a Student member:)");
				System.out.println("We gonna add the last two courses from our previous courses \n"
						+ "that we created to the second Student member we created.");
				
				students[1].addCourseTaken(courses[1]);
				students[1].addCourseTaken(courses[2]);
				
				System.out.println("Last two Courses have been added to the second Student object.");
			}
			
									//FOR ADDING AN ARRAY OF COURSES TO A FACULTY OBJECT
			else if(action==7) {
				System.out.println("\n\t\t\t      (7. Adding an array of 2 courses to a Faculty object.)");
				System.out.println("We gonna create 2 new courses and save them in an array\n"
						+ "then pass that array to the second Faculty mmember we created.");
				System.out.println("Enter information for the first New Course in the following format:");
				Course[] c=new Course[2];
				c[0]=createCourseUserBased();
				System.out.println("Enter information for the second New Course in the following format:");
				c[1]=createCourseUserBased();
				faculty[1].addCoursesTaught(c);
				System.out.println("Two new Courses have been added to the second Faculty member.");
			}
			
									//FOR ADDING AN ARRAY OF COURSES TO A STUDENT OBJECT
			else if(action==8) {
				System.out.println("\n\t\t\t     (8. Adding an array of 2 courses to a Student object)");
				System.out.println("We gonna create 2 new courses and save them in an array\n"
						+ "then pass that array to the first Student object we created.");
				System.out.println("Enter information for the first New Course in the following format:");
				Course[] c=new Course[2];
				c[0]=createCourseUserBased();
				System.out.println("Enter information for the second New Course in the following format:");
				c[1]=createCourseUserBased();
				students[0].addCoursesTaken(c);
				System.out.println("Two new Courses have been added to the first Student object.");
			}
			
									//FOR ACCESSING A COURSE FROM FACULTY OBJECT USING AN INDEX AND THEN PRINTING IT
			else if(action==9) {
				System.out.println("\n\t\t\t     (9. Accessing a Course from a faculty member and printing it.)");
				System.out.print("Enter a Course index for the second Faculty member: ");
				int i=scnr.nextInt();
				Course c=faculty[1].getCourseTaught(i);
				if(c!=null) {
					System.out.println("Course for index "+i+": "+c.toString());
				}
				else {
					System.out.println("Sorry the Index you entered is invalid.");
				}
			}
			
									//FOR ACCESSING A COURSE FROM A STUDENT OBJECT AND PRINTING IT
			else if(action==10) {
				System.out.println("\n\t\t\t     (10. Accessing a Course from a Student object and printing it.)");
				System.out.print("Enter a Course index for the first Student object: ");
				int i=scnr.nextInt();
				String s=students[0].getCourseTakenAsString(i);
				if(s.length()!=0) {
					System.out.println("Course for index "+i+": "+s);
				}
				else {
					System.out.println("Sorry the Index you entered is invalid.");
				}
			}
			
								//CHECKING IF SOME FACULTY TEACHES A SPECIFIC COURSE
			else if(action==11) {
				System.out.println("\n\t\t\t(11. We gonna pick a course from the Courses and then pick a Faculty member and check if that Faculty Teaches that Course.)");
				int f;
				int c;
				int a=0;
				while(true) {
					System.out.print("Enter a valid Faculty member number: ");
					f=scnr.nextInt();
					if(faculty[f-1]!=null) {
						break;
					}
				}
				while(true) {
					System.out.print("Enter a valid Course number: ");
					c=scnr.nextInt();
					if(courses[c-1]!=null) {
						break;
					}
				}
				for(int i=0;i<faculty[f-1].getNumCoursesTaught();i++) {
					if(faculty[f-1].getCourseTaught(i).equals(courses[c-1])) {
						System.out.println("Yes Faculty at number "+f+" teaches the course at number "+c+".");
						a++;
						break;
					}
				}
				if(a==0) {
					System.out.println("No, Faculty at number "+f+" does not teach the course at number "+c+".");
				}
				
			}
			
											//DETERMINING WHICH FACULTY TEACHES THE MOST AND LEAST COURSES
			else if(action==12) {
				System.out.println("\n\t\t\t  (12. Determining which Faculty teaches the most Courses and which teaches the Least number of Courses.)");
				if(faculty.length>0 && faculty[0]!=null) {
					int fHigher=0;
					int fLower=0;
					for(int i=0;i<faculty.length;i++) {
						if(faculty[i]==null) {
							break;
						}
						Faculty f=faculty[i];
						if(f.getNumCoursesTaught()<faculty[fLower].getNumCoursesTaught()) {
							fLower=i;
						}
						if(f.getNumCoursesTaught()>faculty[fHigher].getNumCoursesTaught()) {
							fHigher=i;
						}
					}
					
					System.out.println("Faculty number "+(fHigher+1)+" teaches the most Courses. Here is the Information:\n");
					System.out.println(faculty[fHigher].toString());
					System.out.println("\nFaculty number "+(fLower+1)+" teaches the Least number of Courses. Here is the information:\n");
					System.out.println(faculty[fLower].toString());
				}
				else {
					System.out.println("Sorry there are no Faculty Objects.");
				}
			}
			
										//DETERMINE WHICH COURSE IS MINIMUM OF ALL COURSES
			else if(action==13) {
				System.out.println("\n\t\t\t  (13. Determining which Course is the minimum of all Courses from our Courses array.)");
				int cMin=0;
				if(courses.length>0 && courses[0]!=null) {
					for(int i=0;i<courses.length;i++) {
						if(courses[i]==null) {
							break;
						}
						else if(courses[i].compareTo(courses[0])==-1) {
							cMin=i;
						}
					}
					System.out.println("Course number "+(cMin+1)+" is the minimum course. Here is the information:\n");
					System.out.println(courses[cMin].toString());
				}
				else {
					System.out.println("Sorry there are no Course objects.");
				}
			}
			
									//DETERMINE WHICH COURSE IS THE MAXIMUM OF ALL COURSES
			else if(action==14) {
				System.out.println("\n\t\t\t  (14. Determining which Course is the maximum of all Courses from our Courses array.)");
				int cMax=0;
				if(courses.length>0 && courses[0]!=null) {
					for(int i=0;i<courses.length;i++) {
						if(courses[i]==null) {
							break;
						}
						else if(courses[i].compareTo(courses[0])==1) {
							cMax=i;
						}
					}
					System.out.println("Course number "+(cMax+1)+" is the maximum course. Here is the information:\n");
					System.out.println(courses[cMax].toString());
				}
				else {
					System.out.println("Sorry there are no Course objects.");
				}
			}
			
							//DETERMINE WHICH STUDENT HAS THE MOST AND LEAST CREDITS
			else if(action==15) {
				System.out.println("\n\t\t\t   (15. Dtermining which Student has the most and which Student has the least Credits.)");
				int sHigher=0;
				int sLower=0;
				if(students.length>0 && students[0]!=null) {
					for(int i=0;i<faculty.length;i++) {
						if(students[i]==null) {
							break;
						}
						if(students[i].compareTo(students[sHigher])==1) {
							sHigher=i;
						}
						if(students[i].compareTo(students[sLower])==-1) {
							sLower=i;
						}
					}
					
					System.out.println("Student number "+(sHigher+1)+" has the most Credits. Here is the Information:\n");
					System.out.println(students[sHigher].toString());
					System.out.println("\nStudent number "+(sLower+1)+" has the Least number of Credits. Here is the information:\n");
					System.out.println(students[sLower].toString());
				}
				else {
					System.out.println("Sorry there are no Student Objects.");
				}
			}
			
									//TO WRITE ALL THE OBJECTS DETAILS TO A PLAIN TEXT FILE.
			else if(action==16) {
				PrintWriter outStream = null;
				String s="";
				for(int i=0;i<courses.length;i++) {
					if(courses[i]!=null) {
						s+=courses[i].toString()+"\n";
					}
				}
				for(int i=0;i<faculty.length;i++) {
					if(faculty[i]!=null) {
						s+=faculty[i].toString()+"\n";
					}
				}
				for(int i=0;i<generalStaff.length;i++) {
					if(generalStaff[i]!=null) {
						s+=generalStaff[i].toString()+"\n";
					}
				}
				for(int i=0;i<students.length;i++) {
					if(students[i]!=null) {
						s+=students[i].toString()+"\n";
					}
				}
				try {
					outStream=new PrintWriter("SchoolDB_Updated.txt");
					outStream.println(s);
					System.out.println("/nDetails of all the OBJECTS created so far has been written to a file name SchoolDB_Updated.txt");
				}
				catch(Exception e) {
					System.out.println("Error Try Again!!!");
				}
				finally {
					if(outStream!=null) {
						outStream.checkError();
					}
				}
				
			}
		}

	}
	
	
												//METHODS TO CREATE OBJECTS
	
	public static Course createCourseUserBased() {
		Course c;
		Scanner scnr=new Scanner(System.in);
		while(true) {
			System.out.println("Course DEPARTMENT,Course NUMBER,Course CREDITS,is Course a GRADUATE Course(true/false): ");
			String data=scnr.nextLine();
			String[] arr=data.split(",");
			if(arr.length==4) {
				try {
					arr[3]=arr[3].toLowerCase();
					c=new Course(Boolean.parseBoolean(arr[3]),Integer.parseInt(arr[1]),arr[0],Integer.parseInt(arr[2]));
					break;
				}
				catch(Exception e) {
					System.out.println("Invalid Information, FORMAT or ORDER. TRY AGAIN!!!");
				}
			}
			else {
				System.out.println("Invalid Information, FORMAT or ORDER. TRY AGAIN!!!");
			}
		}
		return c;
	}
	
	public static Faculty createFacultyUserBased() {
		Faculty f;
		Scanner scnr=new Scanner(System.in);
		while(true) {
			System.out.print("NAME,Birth Year,Department Name,is tenured(true/false): ");
			String data=scnr.nextLine();
			String[] arr=data.split(",");
			if(arr.length==4) {
				try {
					f=new Faculty(arr[0],Integer.parseInt(arr[1]),arr[2],Boolean.parseBoolean(arr[3]));
					break;
				}
				catch(Exception e) {
					System.out.println("Invalid Information, FORMAT or ORDER. TRY AGAIN!!!");
				}
			}
			else {
				System.out.println("Invalid Information, FORMAT or ORDER. TRY AGAIN!!!");
			}
		}
		return f;
	}
	
	public static GeneralStaff createGeneralStaffUserBased() {
		GeneralStaff g;
		Scanner scnr=new Scanner(System.in);
		while(true) {
			System.out.print("NAME,Birth Year,Department Name,Duty: ");
			String data=scnr.nextLine();
			String[] arr=data.split(",");
			if(arr.length==4) {
				try {
					g=new GeneralStaff(arr[0],Integer.parseInt(arr[1]),arr[2],arr[3]);
					break;
				}
				catch(Exception e) {
					System.out.println("Invalid Information, FORMAT or ORDER. TRY AGAIN!!!");
				}
			}
			else {
				System.out.println("Invalid Information, FORMAT or ORDER. TRY AGAIN!!!");
			}
		}
		return g;
	}
	
	public static Student createStudentUserBased() {
		Student s;
		Scanner scnr=new Scanner(System.in);
		while(true) {
			System.out.print("NAME,Birth Year,Major,is a graduate student(true/false): ");
			String data=scnr.nextLine();
			String[] arr=data.split(",");
			if(arr.length==4) {
				try {
					s=new Student(arr[0],Integer.parseInt(arr[1]),arr[2],Boolean.parseBoolean(arr[3]));
					break;
				}
				catch(Exception e) {
					System.out.println("Invalid Information, FORMAT or ORDER. TRY AGAIN!!!");
				}
			}
			else {
				System.out.println("Invalid Information, FORMAT or ORDER. TRY AGAIN!!!");
			}
		}
		return s;
	}
	
	
}

 * 
 * 
 * 
 */
