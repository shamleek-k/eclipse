package methodandconstructor;

import java.util.Scanner;

public class methodScanner {
	public void add() {
		Scanner scan =new Scanner(System.in);
		int num1,num2,sum;
		System.out.println("enter the first number");
		num1=scan.nextInt();
		System.out.println("enter the second number ");
		num2=scan.nextInt();
		sum=num1+num2;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodScanner ob= new methodScanner();
		ob.add();
	}

}
