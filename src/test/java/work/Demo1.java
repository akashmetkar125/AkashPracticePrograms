package work;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
	
	public static void main(String[] args) {
		
		 String str="Nu10Technologies";
		 String str1=str.toLowerCase();
	       
	       Map<Character,Integer> vowels= new HashMap();
	       
	       vowels.put('a',0);
	       vowels.put('e',0);
	       vowels.put('i',0);
	       vowels.put('o',0);
	       vowels.put('u',0);
	       
	       for (int i = 0; i < str1.length(); i++) {
	            char ch = str1.charAt(i);
	            if (vowels.containsKey(ch)) {
	                // If the character is a vowel, print it
	               System.out.print(ch+ " ");
	            }
	        }
	       	      
	        }
	       
	    }

