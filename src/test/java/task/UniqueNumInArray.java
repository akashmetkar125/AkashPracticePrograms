package task;

import java.util.ArrayList;

public class UniqueNumInArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,5,5,5,1,2,1,1,9,2};
		 int k=0;
		
		ArrayList al =new ArrayList();
		for(int i=0;i<a.length;i++) {
			
			if(!al.contains(a[i])) {
				
				al.add(a[i]);
				k++;
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					k++;
					
				}	
				
			}
//			System.out.println(a[i]+ ":" +k);
			if(k==1) 
				System.out.println(a[i] +" is unique number in Array");		
		}
		}
	}
}

