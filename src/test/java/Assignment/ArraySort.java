package Assignment;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a ={5,4,1,8,3,9};

		
		for (int i=0;i<a.length-1;i++){
			
			for (int j=0;j<a.length-1;j++) {
			
			if(a[j] > a[j+1]) {
				
				int temp = a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				
			}
	
			}
		}
		
		
		for (int sort: a) {
			
			System.out.print(sort+ " ");
		}
	}

	}


