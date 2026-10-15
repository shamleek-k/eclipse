package methodandconstructor;

import java.util.Scanner;

public class methodscanner_1 {
	public int add(int num1,int num2) {
		int sum;
		return sum=num1+num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodscanner_1 ob =new methodscanner_1();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number : ");
		int num1 = scan.nextInt();
		System.out.println("enter second number  : ");
		int num2 = scan.nextInt();
		System.out.println(ob.add(num1, num2));
	}

}
