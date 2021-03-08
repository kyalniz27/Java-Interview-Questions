package questions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;

public class LeapYear {
	
	public static void main(String[] args) {
		
		// Leap year is a year which is divisible by 4 or 400 but not 100. 
		// We can solve this problem using java date-time classes
		
		//1.
		LocalDateTime localDateTime = LocalDateTime.now();
		
		if (localDateTime.toLocalDate().isLeapYear()) {
			System.out.println(localDateTime.getYear() + " is a leap year.");
		} else {
			System.out.println(localDateTime.getYear() + " is not a leap year.");
		}
		
		//2. 
		LocalDate localDate = LocalDate.now();
		if (localDate.isLeapYear()) {
			System.out.println(localDate.getYear() + " is a leap year.");
		} else {
			System.out.println(localDate.getYear() + " is not a leap year.");
		}
		
		
		//3.
		if (Year.now().isLeap()) {
			 System.out.println("Current year is a leap year");
		} else {
			 System.out.println("Current year is NOT a leap year");	
		}
		
		//4.
		
		System.out.println(isLeap(2023));
		
		
	}
	
	public static boolean isLeap(int year){
		return ((year % 4 == 0) || (year % 400 == 0) && (year % 100 != 0));
		//return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
	}

}
