package questions;

import java.util.Arrays;

public class MaxValueInAnrray {

	public static void main(String[] args) {
		
		int[] array = {10,200,30,4,5};
			
		//1. Method using method with return type
		System.out.println(maxValue(array));
		
		//2. Method using sort method
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println("max value in array: " + array[array.length-1]);
		System.out.println("min value in arra: " + array[0]);
	}
	
	public static int maxValue(int[] arr){
		int max = arr[0];
		for(int i = 0; i < arr.length; i++){
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	}

}
