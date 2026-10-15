package Arrayandstring;

public class array_nested4loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[3][2];;
		
		arr[0][0]=20;
		arr[0][1]=30;

		arr[1][0]=40;
		arr[1][1]=50;
		
		arr[2][0]=60;
		arr[2][1]=70;
		 
		
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
	}

}
