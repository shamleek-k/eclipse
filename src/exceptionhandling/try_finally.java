package exceptionhandling;

public class try_finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		try {
			System.out.println(a/0);
		}
		finally {
			System.out.println("hello shamleek");
		}

	}

}
