package assignment;

public class ArraySort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] a = {2, 4, 12, 3, 14, 34, 23};
		
		for (int i=0;i<a.length-1;i++) {
			
			for (int j=i+1;j<a.length-1;j++) {
				
				if(a[j]>a[j+1])
				{
				
				int tempArray =a[j];
				a[j]=a[j+1];
				a[j+1]=tempArray;
				
			}
			}	
		}
			for(int s : a) {
				
				System.out.print(s+ "," );
			
				
				
			}
		}
	}




		



		

