package questions;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		
		//1. Method: using loop
		int num = 321;
		int reverse = 0 ;
		
		while (num != 0) {
			reverse = reverse * 10 + num % 10;
			System.out.println("reverse: "+reverse); // 1, 12, 123  
			num = num / 10;
			System.out.println("num: "+num); // 32, 3, 0
			
		}
		
		System.out.println(reverse);
		
		//2. Method: Using StringBuilder or StringBuffer class
		
//		int number = 12345;
//		
//		StringBuffer rev = new StringBuffer(String.valueOf(number));
//		System.out.println(rev.reverse());
		 
		
		
		
	}

}
