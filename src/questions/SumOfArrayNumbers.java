package questions;

public class SumOfArrayNumbers {
	
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,8,9};
		System.out.println("Sum of numbers: " + sumOfArray(array));
		
	}
	
	public static int sumOfArray(int[] arr){
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}

}
