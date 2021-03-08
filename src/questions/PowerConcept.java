package questions;

public class PowerConcept {

	public static void main(String[] args) {
		
		// If power is zero of any number result is always 1.
		
		int base = 3;
		int power = 4;
		int result = 1;
		
		while(power != 0){
			result *= base;
			--power;
		}
		
		System.out.println(result);
		
		//2. Method:
		System.out.println(Math.pow(2, 4));
		

	}

}
