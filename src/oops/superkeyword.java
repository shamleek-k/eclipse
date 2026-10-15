package oops;
class superclass{
	String name="ajith";
}


public class superkeyword extends superclass{
	String name ="aswajith";
	
	public void display() {
		System.out.println(super.name);
		System.out.println(name );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superkeyword key=new superkeyword();
		key.display();

	}

}
