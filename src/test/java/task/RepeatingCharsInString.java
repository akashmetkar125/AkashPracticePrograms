package task;

import java.util.HashMap;
import java.util.Map;

public class RepeatingCharsInString {

	   public static void main(String[] args) {
	        String input = "Selenium";

	        // Convert the string to lowercase to handle both uppercase and lowercase vowels.
	        input = input.toLowerCase();

	        // Create a map to store the count of each vowel.
	        Map<Character, Integer> vowelCount = new HashMap<>();

	        // Initialize the map with vowels and set their count to 0.
	        vowelCount.put('a', 0);
	        vowelCount.put('e', 0);
	        vowelCount.put('i', 0);
	        vowelCount.put('o', 0);
	        vowelCount.put('u', 0);

	        // Iterate through each character in the string.
	        for (char ch : input.toCharArray()) {
	            // Check if the character is a vowel.
	            if (vowelCount.containsKey(ch)) {
	                // Increment the count of the vowel.
	                vowelCount.put(ch, vowelCount.get(ch) + 1);
	            }
	        }

	        // Print the count of each vowel.
	        for (Map.Entry<Character, Integer> entry : vowelCount.entrySet()) {
	            System.out.print(entry.getKey() + "" + entry.getValue() +" ");
	        }
	    }
	}