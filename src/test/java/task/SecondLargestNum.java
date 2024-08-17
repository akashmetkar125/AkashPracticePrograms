package task;

public class SecondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr []= {1,2,3,11,34,76,67};
		
		int firstLarge=Integer.MIN_VALUE;
		int secondLarge=Integer.MIN_VALUE;
		
		for (int num : arr) {
			
			if(num > firstLarge) {
				
				secondLarge=firstLarge;
				firstLarge=num;
		}
			else if(num> secondLarge && num!=firstLarge) {
				
				secondLarge=num;
				
			}
		}	
			if(secondLarge==Integer.MIN_VALUE) {
				System.out.println("There is no second large element in array");
			}
			else {
				System.out.println("Second Largest element is " +secondLarge);
			}
			
		}

	}
