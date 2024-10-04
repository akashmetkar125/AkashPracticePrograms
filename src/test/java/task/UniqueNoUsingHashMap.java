package task;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UniqueNoUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,1,2,1,3,4,9,3,9,5,5};
		
		HashMap <Integer,Integer> uniqueNo = new HashMap();
		for(int num : arr) {
			uniqueNo.put(num, uniqueNo.getOrDefault(num, 0)+ 1);
		}
		
		for(Map.Entry<Integer,Integer> entry: uniqueNo.entrySet()) {
			
			if(entry.getValue()==1) {
			System.out.println("Unique no in array is " +entry.getKey());			
//		}else {
//				System.out.println("No unique no is present in given array");
//			}
		}
	}
}
}
