package exceptionhandling;

public class try_multiplecatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=30;
		int arr[]=null;
		
		try {
			System.out.println(arr[1]);
		}
		catch(ArithmeticException e1) {
			System.out.println(e1);
		}
		catch(IndexOutOfBoundsException e2) {
			System.out.println(e2);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("heeeeey");
	}

}
