package demo;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	System.out.println(isPalindrome("madam"));
		String string ="raceca";
		
		if(isPalindrome(string)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}
		

	}

	private static boolean isPalindrome(String string) {
	
		int left =0;
		int right=string.length()-1;
		
		while(left<right) {
			
			
			
		if(string.charAt(left)!=string.charAt(right)){
			
			return false;
			
		}
		
		left ++;
		right--;
		
		}
		
		return true;
	}
}
