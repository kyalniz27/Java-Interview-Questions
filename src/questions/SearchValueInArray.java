package questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchValueInArray {
	
	public static void main(String[] args) {
		
		int[] array = {9,8,7,6,5,4,3,2,1};
		
		//1. Method: Using for loop
		int num = 5;
		for (int i = 0; i < array.length; i++) {
			int j = array[i];
			if (num == j) {
				System.out.println("Number found at index: " + i);
			}
		}
		
		//2. Method: Using binary search method after sorting array 
		Arrays.sort(array);
		System.out.println(Arrays.binarySearch(array, 8));
		
		//3. Method: Using get method without sorting array
		System.out.println(Array.get(array, 3));
		
	}

}
