package oops;
public class MethodOverloading {
	public static void add() {
		int num1 = 10,num2=20;
		System.out.println("sum "+(num1+num2));
	}
	public static void add(int num1,float num2) {
		float sum=num1+num2;
		System.out.println("SUM="+sum);
		
	}
	public static void add(float num1,int num2) {
		float sum =num1+num2;
		System.out.println("SUM="+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		
		
	
	}

}
