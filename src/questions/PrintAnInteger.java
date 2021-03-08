package questions;

import java.util.Scanner;

public class PrintAnInteger {

	public static void main(String[] args) {
		
		
		enterNumber();
		
	}
	
	public static void enterNumber(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		
		int num = input.nextInt();
		
		System.out.println("The number you enter is " + num);
		
		input.close();
	}

}
