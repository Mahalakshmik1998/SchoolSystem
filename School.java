package SchoolManagementSystem;

import java.util.Scanner;

public class School
{
	String SchoolName,PrincipalName;
	String NumberOfStudent,NumberOfTeacher;
	String Course;
	//String Gender;
	String StudentName,StudentId; 
	//char grade;
	Double fees;
	Double Salary;
	int ch;
	Scanner sc=new Scanner(System.in);
	void get()
	{
		System.out.println("********School Management System*********");
		System.out.println("Enter the School Name");
		String SchoolName=sc.next();
		System.out.println("Enter the Principal Name");
		String PrincipalName=sc.next();
		System.out.println("Enter the Number of Student");
		String NumberOfStudent=sc.next();
		System.out.println("Enter the Number of Teacher");
		String NumberOfTeacher=sc.next();
	
		System.out.println("********Students Information********");
		System.out.println("Enter the StudentName");
		String StudentName=sc.next();
		System.out.println("Enter the StudentId");
		String StudentId=sc.next();
		System.out.println("********Faculties Information********");
		System.out.println("Enter the FacultyName");
		String FacultyName=sc.next();
		System.out.println("Enter the FacultyId");
		String FacultyId=sc.next();
		System.out.println("Enter the FacultySalary");
		String FacultySalary=sc.next();
		System.out.println("********Courses were offered*********");
		System.out.println("*1.Computer Science*");
		System.out.println("*2.Physics*");
		System.out.println("*3.Chemistry*");
		System.out.println("*4.Maths*");
		System.out.println("*5.Accounts*");
		System.out.println("Enter Your Choice:");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("1.Computer Science");
			System.out.println("Fees for Computer Science Rs.5000");
			break;
		case 2:
			System.out.println("2.Physics");
			System.out.println("Fees for Physics Rs.4000");
			break;
		case 3:
			System.out.println("3.Chemistry");
			System.out.println("Fees for Chemistry Rs.3000");
			break;
		case 4:
			System.out.println("4.Maths");
			System.out.println("Fees for Maths Rs.2000");
			break;
		case 5:
			System.out.println("5.Accounts");
			System.out.println("Fees for Accounts Rs.1000");
			break;
		case 6:
            System.exit(0);
		}
		
		
		
	}
	

	public static void main(String[] args) 
	{
		School sms=new School();
		sms.get();
		
	}

}
