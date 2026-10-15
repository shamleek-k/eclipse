package methodandconstructor;

public class methodcategories {
//	1.function with  no return type and with parameter 
		public void areaOfRectangle(float l,float b) {
			float area;
			area=l*b;
			System.out.println("area :"+area);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodcategories ob=new methodcategories();
		ob.areaOfRectangle(5f, 10f);
		
		

	}

}
