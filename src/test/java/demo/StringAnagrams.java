package demo;

import org.testng.reporters.AbstractXmlReporter.Count;

public class StringAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isAnagram("aab", "aaa"));
		
	}

	private static boolean isAnagram(String str, String str2) {
		// TODO Auto-generated method stub
		
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
