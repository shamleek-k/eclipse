package methodandconstructor;

public class methodspro {
	//methd dclrtn
	//non-static /instance method
	public void add() {
		int num1=25,num2=30,sum;
		sum=num1+num2;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=100 ,num2=800;
		System.out.println("maximum value ids : "+ (Math.max(num1, num2)));
		methodspro ob=new methodspro();
		ob.add();
	}
   
}
