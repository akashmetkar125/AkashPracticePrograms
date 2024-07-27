package demo;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,1,4,6,9,10,2};
		
		int length = arr.length;
		System.out.println(length);
		
		for (int i=0;i<arr.length;i++) {
			
			for (int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					
				System.out.println(" Dupliacte elements found " + arr[i]);
				}
			}
			
			
			
		}

	}

}
