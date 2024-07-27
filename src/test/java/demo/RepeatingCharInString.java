package demo;

public class RepeatingCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="pineapples";
		int index=-1;
		char fnc = 0 ;
		
		for (char i : str.toCharArray()) {
			
		if(str.indexOf(i)==str.lastIndexOf(i)) {
			
			fnc=i;
			break;
		}
		else {
			index+=1;
		}
		}
	if(index==1) {
		System.out.println("All chars are repeating");
	}
	else {
		
		System.out.println("First non repeating character is " +fnc);
	}
		

	}

}
