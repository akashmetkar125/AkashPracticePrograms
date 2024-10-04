package work;

import java.util.HashMap;

public class DemoCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="cignititechnology";
     HashMap<Character, Integer> vowelMap = new HashMap<>();
        
        // Define vowels
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        
        // Initialize the map with vowels and set their count to 0
        for (char vowel : vowels) {
            vowelMap.put(vowel, 0);
        }

        // Loop through the string and count vowels
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowelMap.containsKey(ch)) {
                // If the character is a vowel, print it
               System.out.println(ch);
            }
        }
		

	}

}
