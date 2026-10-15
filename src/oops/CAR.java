package oops;

public class CAR implements  Vehicle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1 v= new CAR();
		v.start();
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("self start");
	}

}
