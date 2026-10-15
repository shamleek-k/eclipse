package Controlstatement;

public class else_if_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark=100;
		if(mark>90)  {
			System.out.println("A grade");
			
		}
		else if (mark>70) 
		{ 
			System.out.println("B grade");
		}
		else if(mark>50) {
			System.out.println("c grade");
		}
		else {
			System.out.println("D grade");
		}
	}

}
