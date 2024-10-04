package task;

import java.util.Arrays;

public class SumOfStringArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="12 120 50 15 150";
		
		String[] strArray =str.split(" " );
		
		int [] arr = new int[strArray.length];
		
		int sum=0;
		for (int i=0;i<strArray.length;i++) {
			
			arr[i] =Integer.parseInt(strArray[i]);
			sum+=arr[i] ;
		}
		
		System.out.println("Sum of array elemets " +Arrays.toString(arr));
		System.out.println("Sum of strig array elements is "+sum);

	}

}
