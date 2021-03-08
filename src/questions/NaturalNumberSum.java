package questions;

public class NaturalNumberSum {

	public static void main(String[] args) {

		// for loop
		int num = 100;
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;
		}

		System.out.println("Sum is " + sum);

		
		//while loop
		int k = 1;
		int sum1 = 0;
		while (k <= num) {
			sum1 += k;
			k++;
		}

		System.out.println("***********");
		System.out.println("Sum is " + sum1);

	}

}
