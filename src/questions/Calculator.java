package questions;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("Please enter the first number: ");
			int first = input.nextInt();
			System.out.println("Please enter the second number:");
			int second = input.nextInt();
			System.out.println("Please enter the operator: (+,-,*,/)");
			char sign = input.next().charAt(0);
			
			//swap method
			int temp = first;
			first = second;
			second = temp;
			
			switch (sign) {
			case '+':
				System.out.println("Addition of numbers is: " + (first + second));
				break;
			case '-':
				System.out.println("Subtraction of numbers is: " + (first - second));
				break;
			case '*':
				System.out.println("Multiplication of numbers is: " + (first * second));
				break;
			case '/':
				System.out.println("Division of numbers is: " + (first / second));
				break;

			}
			
			System.out.println("\nDo you want to continue? yes/no");
			String answer = input.next();
			if (answer.equalsIgnoreCase("yes")) {
				continue;
			} else{
				System.out.println("Good bye!");
				//break;
			}
			
			break;
		}
		input.close();

	}

}
