package oops;
class finalclass{
	public void display() {
		System.out.println("hello");
	}
}

public class finalkeyword extends finalclass{
	public void display() {
		System.out.println("java programming ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int age =20;
		System.out.println(age);
		
		finalkeyword ob=new finalkeyword();
		ob.display();
	}

}
