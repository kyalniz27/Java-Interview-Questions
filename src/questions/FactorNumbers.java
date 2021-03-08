package questions;

public class FactorNumbers {

	public static void main(String[] args) {
		
		// 10 ==> 1 2 5 10
		// 20 ==> 1 2 4 5 10
		
		int num = 20;
		
		for(int i = 1; i <= num ; i++){
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}

	}
	
	
}
