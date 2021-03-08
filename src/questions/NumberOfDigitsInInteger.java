package questions;

import java.util.Scanner;

public class NumberOfDigitsInInteger {
	
	public static void main(String[] args) {
		
//		int num = 1234;
//		int count = 0;
//		
//		while (num != 0) {
//			num = num / 10; // 123 12 1
//			++count; // 1 2 3 4
//		}
		
		countDigit();
		
	}
	
	public static void countDigit(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int count = 0;
		int num = input.nextInt();
		
		while (num != 0) {
			
			//num = input.nextInt();
			num /= 10;
			++count;
		}
		
		System.out.println("Number of digit is " + count);
		
		input.close();
	}

}
