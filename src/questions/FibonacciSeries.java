package questions;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		// 0 1 2 3 5 8 13 21 34 ... (sum of first and next number)
		
		int num = 20;
		int n1 = 0;
		int n2 = 1;
		
		for(int i = 1; i <= num; i++){
			System.out.println(n1);
			int sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			
		}
		
		
	}

}
