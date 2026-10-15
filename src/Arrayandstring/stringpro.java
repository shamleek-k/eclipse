package Arrayandstring;

public class stringpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char array
		char exp[]= {'h','e','l','l','0'};
		System.out.println(exp[3]);
		
		System.out.println(exp);
		
		//simple for loop
		for(int i=0;i<exp.length;i++) {
			System.out.println(exp[i]);
		}
		System.out.println("elements \n");
		
		
		//for each
		for(char data:exp ) {
			System.out.println(data);
		}
		
		///string array
		String names[]= {"shamleek","aswajith","sahal","neha","ansila"};
		System.out.println(names[2]);
		
		//length
		String s1="india";
		System.out.println(s1.length());
		
		//contains
		
		String s2="high level language ";
		System.out.println(s2.contains("high"));
		
		//equals
		String s3="athul";
		String s4="ATHUL";
		System.out.println(s3.equals(s4));
		
		//concat
		String s5="mohan";
		String s6="lal";
		System.out.println(s5.concat(s6));
		
		//getbytes
		String s7="ABCDE";
		byte b []=s7.getBytes();
		for (int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}

		
		
		//substring
		String s8="programming";
		System.out.println(s8.substring(3));//start index
		System.out.println(s8.substring(3,9));//start and end index
		
		//startswith
		String s9="java programming";
	//	System.out.println(s9.startswith('j'));
		
		//replace
		String s10="aswajith";
		System.out.println(s10.replace('a', 'b'));
		
		//trim
		String s11="hello java ";
		System.out.println(s11+"programming");
		System.out.println(s11.trim()+"programming");
				
		
		
		
		
		
	

	}

}
