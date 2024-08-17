package exercise;

import java.util.List;

public class SumOfPositiveNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> numbers = List.of(1,2,3,-1,-3,-2);	
		System.out.println(SumOfPositiveNumbers(numbers));
			 		
	}

    public static int SumOfPositiveNumbers(List<Integer> numbers) {
		// TODO Auto-generated method stub
		
		int sum=0;
		
		for (int num : numbers) {
		if(num>0) {
			
			sum+=num;
		}			
		}
		return sum;
    }
}
		
	


