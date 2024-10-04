package task;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DecOrderUniqueNos {
	
	public static void main(String[] args) {
		
		int arr []= {1,2,3,2,3,1,6};
		System.out.println("Array elements in decreasing order given below");
		DecreasingOrder(arr);
		
		System.out.println(" ");
		
		
		System.out.println("Unique elements in array using HashMap given below");
		UniqueNumberHashMap(arr);
		
		System.out.println(" ");
		
		System.out.println("Unique numbers in array using HashSet given below");
		UniqueNumber(arr);
		
	}

	private static void UniqueNumberHashMap(int[] arr) {
		// TODO Auto-generated method stub
				
		HashMap <Integer,Integer> uniqueNo = new HashMap();
		for(int num : arr) {
			uniqueNo.put(num, uniqueNo.getOrDefault(num, 0)+ 1);
		}
		
		for(Map.Entry<Integer,Integer> entry: uniqueNo.entrySet()) {
			
			if(entry.getValue()==1) {
			System.out.println("Unique number in array is " +entry.getKey());			
//		}else {
//				System.out.println("No unique no is present in given array");
//			}
		}
	}
		
	}

	private static void UniqueNumber(int[] arr) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> uniqueNo = new HashSet();
		
		for(int num : arr) {
			uniqueNo.add(num);
		}
		
		for(int n: uniqueNo) {
			System.out.print(n +" ");
		}
		System.out.println(" ");
	}

	public static void DecreasingOrder(int[] arr) {
		// TODO Auto-generated method stub
		
		Arrays.sort(arr);
		
		for(int i=arr.length-1;i>0;i--) {
			
			System.out.print(arr[i] +" ");
			
		}
		System.out.println(" ");
		
	}

}
