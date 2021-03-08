package questions;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		
//		int a = 10;
//		int b = 20;
//		
//		System.out.println("Before swapping a is " + a);
//		System.out.println("Before swapping b is " + b);
//		
//		int temp = a;
//		a = b;
//		b = temp;
//		
//		System.out.println("After swapping a is " + a);
//		System.out.println("After swapping b is " + b);
		
		swappingNumbers(5, 10);
		
	}
	
	public static void swappingNumbers(int a, int b){
		
		System.out.println("Before swapping a is: " + a);
		System.out.println("Before swapping b is: " + b);
		System.out.println("***************************");
		
		int c = a;
		a = b;
		b = c;
		
		System.out.println("After swapping a is: " + a);
		System.out.println("After swapping b is: " + b);
		
	}

}
