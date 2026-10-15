package oops;

class birds{
	public void sound () {
		System.out.println("tweet....tweet...");
	}
	}
	class duck{
		public void sound () {
			System.out.println("quack...quack...");
		}
		
	}
public class overriding {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
duck d=new duck();
//birds d=new duck();====dynamic binding 
d.sound();

	}

}
