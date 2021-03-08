package questions;


public class SumOfTwoPrimeNumbers {
	
	public static void main(String[] args) {
		
		// 34 = 3+31,5+29,11+23,17+17
		//System.out.println(checkPrime(11));
		int num = 34;
		boolean flag = false;
		
		for (int i = 2; i <= num/2; i++) {
			if (checkPrime(i)) {
				if (checkPrime(num-i)) {
					System.out.println(num + " = " + i + " + " + (num-i));
					flag = true;
				}
			}
		}
		
		if (!flag) {
			System.out.println(num + " can not be expressed as the Sum of two numbers.");
		}
		
	}
	
	public static boolean checkPrime(int num){
		
		boolean isPrime = true;
		
		for(int i = 2; i <= num/2; i++){
			if (num%i==0) {
				isPrime = false;
				break;
			}
		}
				
		return isPrime;
		
	}

}
