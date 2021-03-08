package questions;


public class VowelOrConsonant {
	
	public static void main(String[] args) {
		
		//a e i o u
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Please enter a letter: ");
//		String ch = input.next();
//		
//		if (ch.equalsIgnoreCase("a") || ch.equalsIgnoreCase("e") || ch.equalsIgnoreCase("i") 
//				|| ch.equalsIgnoreCase("o") || ch.equalsIgnoreCase("u")  ) {
//			System.out.println("Letter is a vowel.");
//		} else {
//			System.out.println("Letter is a consonant.");
//		}
	
		isVowel("b");
	
	}
	
	public static void isVowel(String ch) {
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Please enter a letter: ");
//		ch = input.nextLine();
		
				
		switch (ch) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println(ch + " is a vowel");
			break;
		default:
			System.out.println(ch + " is a consonant");
			break;
		}
	
	}
	
	

}
