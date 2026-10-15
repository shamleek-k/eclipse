package oops;
abstract class vehicle{
	public abstract void start();
	
	public void sound() {
		System.out.println("beep...beeep");
	}
}
class bike extends Vehicle1{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("kick start ");
		
	}
	
	
}
class train extends Vehicle1{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("button start");
	}
	
}




public class abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       bike b=new bike();
       
       b.sound();
       b.start();
       Vehicle1 t=new train();//upcasting 
       t.sound();
       t.start();
	}

}
