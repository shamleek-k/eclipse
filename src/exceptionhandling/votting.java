package exceptionhandling;

import java.util.Scanner;

public class votting {

	public static void main(String[] args) throws agelimitexception {
		// TODO Auto-generated method stub
		int age=18;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your age ");
		age=scan.nextInt();
		try {
		if (age<18) {
			throw new agelimitexception("below 18 is not eligible for votting");
		}
		else {
			System.out.println("eligible for votting");
		}
		}
		catch (agelimitexception e) {
			// TODO: handle exception
			System.out.println(e);
			
		}
			
		
		
	}

}
