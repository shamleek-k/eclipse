package oops;
class superclass_1{
	
	public void display() {
		String name="anu";
		System.out.println(name);
	}
}
public class superkeyword_1 extends superclass_1{
	public void display() {
		String name ="anupama";
		super.display();
		System.out.println(name );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superkeyword_1 key =new superkeyword_1();
		key.display();

	}

}
