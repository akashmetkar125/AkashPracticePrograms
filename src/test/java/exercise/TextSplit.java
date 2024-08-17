package exercise;

public class TextSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String text="Please use this password to login 'Akashm@789'";
	
		String str = "geekss@for@geekss";
        String[] arrOfStr = str.split("@", 2);
        
        System.out.println(arrOfStr[0]);
        System.out.println(arrOfStr[1]);

        //alternate way to print splited string
        for (String a : arrOfStr)
            System.out.println(a);
		
		
	String[] text1 = 	text.split("'", 2);
	
	System.out.println(text1[0]);
	System.out.println(text1[1]);
	
	
	String[] text2 =text1[1].split("'");
	System.out.println(text2[0]);

	}

}
