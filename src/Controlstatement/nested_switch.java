package Controlstatement;

public class nested_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int school=1;
		char department='b';
		switch (school) {
		case 1 :System.out.println("school of computer science ");
			switch (department) {
			case 'a':System.out.println("a.dept of informatics");
			break;
			case 'b':System.out.println("b.dept of machine learning ");
			break;
			
			}
			break;
		case 2 :System.out.println("school of buisness ");
		switch (department) {
		case 'a':System.out.println("a.dept of commerce");
		break;
		case 'b':System.out.println("b.dept of purchasing ");
		break;
			
		
		}
		break;
		case 3 :System.out.println("school of engineereing  ");
		switch (department) {
		case 'a':System.out.println("a.dept of mech engineering");
		break;
		case 'b':System.out.println("b.dept of mech electronics engineering ");
		break;
		
	}
		break;
		
		default : System.out.println("choose correct option");
		}
	}

}
