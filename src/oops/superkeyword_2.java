package oops;
class superclass_2{
	public superclass_2() {
		String name ="anu";
		System.out.println(name);
	}
	public superclass_2(String name) {
	System.out.println(name);	
	}
}

public class superkeyword_2 extends superclass_2 {
	public superkeyword_2() {
		super("arun");
		String name ="anupama";
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superkeyword_2 key=new superkeyword_2();
		
	}

}
