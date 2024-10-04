package task;

import java.util.HashMap;
import java.util.Map;

public class RepeatIntInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,2,3,4,12,12,10,4};
		
		HashMap<Integer,Integer> map = new HashMap();
		
		for(int num: arr) {
			
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
			
			System.out.print(entry.getKey() + ""+entry.getValue()+" ");
		}

	}

}
