package task;

import java.util.HashMap;
import java.util.Map;

public class AlphabetFrequency {
	
    public static void main(String[] args) {
    	
        String str = "Welcome";
        
        Map<Character, Integer>  repeat = AlphabetFrequency.RepeatedCharsCount(str);
        
        for(Map.Entry<Character, Integer>  entry: repeat.entrySet()) {
        	
        	System.out.print(entry.getKey() + ""+ entry.getValue());
        }
        System.out.print(" ");
        for(Character key : repeat.keySet()) {
        	
        	System.out.print(key+ ""+ repeat.get(key) );
        	
        }
    }    
    
   public static Map<Character, Integer> RepeatedCharsCount(String str) {
	   
	   str=str.toLowerCase();	 
	   
	   Map<Character, Integer> repeat = new HashMap<>();
	   
	   for (char ch : str.toCharArray()) {
		   
		  if(Character.isLetter(ch)) {
			  
			repeat.put(ch, repeat.getOrDefault(ch, 0)+1);
		  }
	   }
	   
	   return repeat;
	   
   }
    }
   
        