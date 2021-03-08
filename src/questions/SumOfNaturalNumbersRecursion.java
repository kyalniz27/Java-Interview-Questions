package questions;

public class SumOfNaturalNumbersRecursion {
	
	public static void main(String[] args) {
		
		//Natural numbers are positive numbers.
		
		System.out.println(addNum(5));
	}

	
	public static int addNum(int num){
		if (num != 0) {
			return num + addNum(num-1);
		} else {
			return num;
		}
	}
}
