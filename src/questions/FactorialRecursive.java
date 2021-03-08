package questions;

public class FactorialRecursive {
	
	public static void main(String[] args) {
		
		//Recursion is the technique of making a function call itself.
		
		System.out.println(multiplyNum(5));
	}
	
	public static int multiplyNum(int num){
		if (num >= 1) {
			return num * multiplyNum(num-1);
		} else{
			return 1;
		}
	}

}
