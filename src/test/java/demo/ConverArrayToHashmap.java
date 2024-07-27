package demo;

import java.util.HashMap;

public class ConverArrayToHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"Name", "Akash", "Place", "Naigaon", "BG", "Bpos"};
		
		HashMap <String, String> map = ConverArrayToHashmap(arr);	
		
		for (String key : map.keySet()) {
			
			System.out.println(key + " : "  +map.get(key) );
	
		}
	}
	
	public static HashMap<String, String> ConverArrayToHashmap(String[] arr) {
		
		HashMap <String, String> map = new HashMap<>();
		
		if (arr.length%2!=0) {
			
			throw new IllegalArgumentException  ("Array size should be even to convert into Hashmap");
			//System.out.println("Array size should be even to convert into Hashmap");
		}
		
		for (int i=0;i<arr.length;i+=2) {
			
			map.put(arr[i], arr[i+1]);
			
		}
		return map;
		
	}

}
