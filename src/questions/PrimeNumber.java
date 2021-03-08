package questions;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		// Prime number is a number divisible by 1 or by itself.
		// 2 is the lowest prime number.
		
		int num = 15;
		boolean flag = false;
		
		for(int i = 2; i <= num/2; i++ ){
			
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		
		if (!flag) {
			System.out.println(num + " is a prime number");
		} else{
			System.out.println(num + " is not a prime number ");
		}
		
	}

}
