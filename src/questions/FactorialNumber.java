package questions;

public class FactorialNumber {

	public static void main(String[] args) {

		// Factorial number:
		// Exp: !5 = 5x4x3x2x1 = 120
		// Factorial of 0 is always 1.

		getFactorial(5);

	}

	public static void getFactorial(int num) {

		int fact = 1;

		int i = 1;
		for (;i <= num;) {
			fact *= i;
			i++;
		}

		System.out.println(fact);
		
		
		
	}

}
