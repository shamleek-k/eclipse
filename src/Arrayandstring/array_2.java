package Arrayandstring;

import java.util.Scanner;

public class array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int arraysize;
		
		System.out.println("enter array size");
		arraysize=scan.nextInt();
		
		int arr[] = new int [arraysize];
		System.out.println("enter array elements ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
			
		}
		 System.out.println("array elemts");
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
	}

}
