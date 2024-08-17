package exercise;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = new HashMap();
		map.put(0, "Akash");
		map.put(1, "Metkar");
		
		System.out.println(map);
		
		map.put(0, "Aakash");
		System.out.println(map);
		
		System.out.println(map.get(0));
		
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		
		for (Map.Entry<Integer,String> entry : map.entrySet()) {
			
		System.out.println("Key: " +entry.getKey() +" Value: "+ entry.getValue());
			
			
		}
		
		System.out.println("");
		for(Object key : map.keySet()) {
			
		 System.out.println(key+ " : " + map.get(key));
			
			
		}


	}

}
