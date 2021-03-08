package questions;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		//1. Method:
		
		int num = 123321;
		int rev = 0;
		int isPal = num;
		
		while(num != 0 ) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		
				
		if (isPal == rev) {
			System.out.println(isPal + " Number is a palindrome" );
		} else{
			System.out.println(isPal + " Number is NOT a palindrome" );
		}
		
	}
	
	//2. Method:
	
	
	

}
