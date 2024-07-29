package Assignment;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> map = new HashMap<>();
		map.put("India", "Delhi");
		map.put("England", "London");
		map.put("Australai", "Canberra");
		
		for (Map.Entry<String,String> entry : map.entrySet()) {
			
//			System.out.println(entry.getKey() + " " + entry.getValue());			
		System.out.println("Key= " +entry.getKey() + " Value= " +entry.getValue());
		
			}
		
	
		for(String key : map.keySet()){			
			System.out.println(key + " : " + map.get(key));
			
		}
		
		
	}

}
