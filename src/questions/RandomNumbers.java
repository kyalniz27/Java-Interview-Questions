package questions;

import java.util.Random;

public class RandomNumbers {
	
	public static void main(String[] args) {
		
		int[] temps = new int[365];
		
		for(int i=0; i < temps.length; i++){
			Random random = new Random();
			temps[i] = random.nextInt(100);
		}
		
		for(int i=0; i<temps.length; i++){
			System.out.println("temps[" + i + "]=" + temps[i]);
		}
		
	}

}
