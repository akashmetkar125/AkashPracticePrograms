package demo;

import java.util.Arrays;

public class maxElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int [] arr = {12, 12, 37,0, 980, 189, 10};
	
//	Arrays.sort(arr);
//	
//	System.out.println("max " +arr[arr.length-1]);
//	System.out.println("min " +arr[0]);
	
	int max = arr[0];
	int min = arr[0];
	
	for (int i=0;i<arr.length;i++) {
		
		if (arr[i]> max) {
			
			max = arr[i];
		}
		
		if (arr [i]< min) {
			
			min= arr[i];
		}
	}
	System.out.println("Max ele og arr is " +max);
	System.out.println("Min ele og arr is " +min);
		
	}

}

