package demo;

import org.openqa.selenium.InvalidArgumentException;
import org.testng.reporters.AbstractXmlReporter.Count;

public class StringAnagrams {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(isAnagram("aab", "aab"));
		
	}

	private static boolean isAnagram(String str, String str2) throws Exception {
		// TODO Auto-generated method stub
		
		if(str.length()!=str2.length()) {
			
			throw new InvalidArgumentException("Length of two strings should be same for checking string Anagram");
		}
		
		int[] Count = new int[256];
		
		for (int i=0;i<str.length();i++) {
			
			
			Count[str.charAt(i)] ++;
			Count[str2.charAt(i)] --;
	
		}
		
		for (int i=0;i<Count.length;i++) {
			
			if(Count[i]!=0) {
				
			
				return false;
				
			}
			
		}
		return true;
		
	
	}

}
