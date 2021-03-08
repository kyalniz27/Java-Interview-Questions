package questions;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		// 153 ==> 1*1*1 + 5*5*5 + 3*3*3 => 1 + 125 + 27 = 153 (it's a Armstrong number)
		
		int num = 153;
		int actNum = num;
		int result = 0;
		
		while (actNum != 0) {
			int n = actNum % 10;
			result += Math.pow(n,3);
			actNum /= 10;
		}
		
		if (result == num) {
			System.out.println(num + " is an armstrong number");
		} else{
			System.out.println(num + " is NOT an armstrong number");
		}
		
	}

}
