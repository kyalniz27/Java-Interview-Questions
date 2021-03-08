package questions;


public class AlphabetCheck {

	public static void main(String[] args) {
		
		char ch = '%';
		
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println(ch + " is in the alphabet.");
		} else {
			System.out.println(ch + " is not in the alphabet.");
		}
			

	}

}
