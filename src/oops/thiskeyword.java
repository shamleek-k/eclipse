package oops;

public class thiskeyword {
	//instance variable 
	String name ;
	int rno;
	float fee;
	
	public thiskeyword(String name,int rno,float fee) {
		this.name=name;
		this.rno=rno;
		this.fee=fee;
		
		
	}
	public void display() {
		System.out.println("name ="+name);
		System.out.println("roll number="+rno);
		System.out.println("fees ="+fee);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiskeyword ob=new thiskeyword("faris", 21, 15000);
				ob.display();
				
		
		

	}

}
