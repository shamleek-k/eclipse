package basic;

import java.util.Scanner;

public class scannerclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String Name;
	int Age;
	String Gender;
	String DOB;
	String Address;
	long phno;
	String emailid;
	String qualification;
	float totalmark;
	String grade;
	String course;
    int totalamount;
    String istitutename;
    boolean joining;
     Scanner scan=new Scanner(System.in);
     
     System.out.println("enter your Name:");
     Name=scan.next();
		System.out.println("enter your Age:");
		Age=scan.nextInt();
		System.out.println("enter your Gender:");
		Gender=scan.next();
		System.out.println("enter your DOB:");
		DOB=scan.next();
		System.out.println("enter your Address:");
		Address=scan.next();
		System.out.println("enter your phno:");
		phno=scan.nextLong();
		System.out.println("enter your emailid:");
		emailid=scan.next();
		System.out.println("enter your qualification:");
		qualification=scan.next();
		System.out.println("enter your total mark:");
		totalmark=scan.nextFloat();
		System.out.println("enter your grade:");
		grade=scan.next();
		System.out.println("enter your course:");
		course=scan.next();
		System.out.println("enter your total amount:");
		totalamount=scan.nextInt();
		System.out.println("enter your institute name:");
		istitutename=scan.next();
		
     
	
	}

}
