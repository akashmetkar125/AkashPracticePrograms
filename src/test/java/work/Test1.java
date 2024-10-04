package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,4,5,8,2,4,5};
		int k=0;
		Arrays.sort(arr);
		
          for(int i=arr.length-1;i>0;i--) {
			
			System.out.print(arr[i] +" ");
			
		}
          
		  System.out.println(" ");
		
		
		Map <Integer,Integer> map = new HashMap();
		for (int i=0;i<arr.length;i++) {
			
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			
		}
		
         for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
			
			if(entry.getValue()==1) {
			System.out.println("Unique number in array is " +entry.getKey());	
								
	}		
         }
	}
}


