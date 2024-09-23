package assignment;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="India";
		String result=RemoveDupCharsInString(str);
		
		System.out.println("Input String is " +str);
		System.out.println("Removing duplicate in String is " +result);

	}

	private static String RemoveDupCharsInString(String str) {
		// TODO Auto-generated method stub
		
		str=str.toLowerCase();
		LinkedHashSet<Character> set =new LinkedHashSet<>();
		
		for(char c:str.toCharArray()) {
		
			set.add(c);
			
		}
		StringBuilder result=new StringBuilder();
		for(char c : set) {
			
			result.append(c);
					
		}
		
		return result.toString();
	}

}
