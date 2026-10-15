package basic;

public class logical_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=30,n2=35;
				
				boolean A = n1==n2;
				boolean B= n1<=n2;
				 System.out.println("A= "+A+"\tB ="+B);
				  
				 //logical not
				 System.out.println("logical Not : !A ="+(!A));
				 System.out.println("logical Not : !B ="+(!B));
				 
				 //logical and
				  System.out.println("logical And : A&&B = "+(A&&B));
				  
				  //logical or
				  System.out.println("logical Or : A||B="+(A||B));
				 
				  
				  System.out.println("logical and : !((a&&b)||(a&&b))="+!((A&&B)||(A&&B)));
				  
				  
				  
				 
	}

}
