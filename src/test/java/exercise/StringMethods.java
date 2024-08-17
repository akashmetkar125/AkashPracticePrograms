package exercise;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "India is my country";
		String a ="India is MY country";
		String b =" India is MY country ";
		int s1 =s.length();
		System.out.println(s1);
		
		char s2 = s.charAt(18);
		System.out.println(s2);
		
		System.out.println(s.indexOf('y'));
		System.out.println(s.indexOf('y', s.indexOf('y')+1));
		
		System.out.println(s.indexOf("myy"));
		
		System.out.println(s.equalsIgnoreCase(a));
		
		System.out.println(s.substring(0,5));
		System.out.println(s.substring(6,19));
		System.out.println(s.substring(6));
		
		System.out.println(b.trim());
		System.out.println(b.replaceAll(" ", ""));
		String b1 =b.replaceAll(" ", "");
		System.out.println(b1.replaceAll("MY", "my"));
		
		System.out.println(s.concat(" and I love my country"));
		
		
		

	}

}
