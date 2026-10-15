package basic;

public class instancestatic {
	String name;
	static String course="testing";
	
	public static void main(String args[]) {
		 int mark;
		 instancestatic stud1=new instancestatic();
		 System.out.println("name="+(stud1.name="shamleek"));
		 System.out.println( "course="+course);
		 System.out.println("mark=" +(mark=15));
		 
		 instancestatic stud2=new instancestatic();
		 System.out.println("name="+(stud2.name="aswajith"));
		 System.out.println( "course="+(course="developer"));
		 System.out.println("mark=" +(mark=15));
		 
		 instancestatic stud3=new instancestatic();
		 System.out.println("name="+(stud3.name="sahal"));
		 System.out.println( "course="+(course="developer"));
		 System.out.println("mark=" +(mark=20));
		 
		 instancestatic stud4=new instancestatic();
		 System.out.println("name="+(stud4.name="anupriya"));
		 System.out.println( "course="+course);
		 System.out.println("mark=" +(mark=20));
	}
}
