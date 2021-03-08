package questions;

public class AverageOfNumbersInArray {
	
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,8,9};
		System.out.println("Average of numbers is: " + averageOfArray(array));
	}
	
	public static int averageOfArray(int[] arr){
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
		}
		
		return sum / arr.length;
		
	}
	

}
