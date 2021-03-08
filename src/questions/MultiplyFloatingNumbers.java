package questions;

public class MultiplyFloatingNumbers {
	
	public static void main(String[] args) {
		
		multiply(2.4f, 3.5f);
		
	}
	
	public static void multiply(float f1, float f2){
		
		float result = f1 * f2;
		System.out.printf("%.2f",result);
	}

}
