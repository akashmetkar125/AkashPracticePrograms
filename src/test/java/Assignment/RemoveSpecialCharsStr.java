package assignment;

public class RemoveSpecialCharsStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="India@Is$Great";		
		String result=RemoveSpecialChars(str);
		System.out.println(result);	

	}

	private static String RemoveSpecialChars(String str) {
		// TODO Auto-generated method stub
		
		return str.replaceAll("[^a-zA-Z0-9]", "");
		
	}

}
