package questions;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		String act = "mom";
		String rev = "";
		
		for(int i = act.length()-1; i >= 0; i--){
			rev += act.charAt(i);
		}
		
		//System.out.println(rev);
		
		if (act.equals(rev)) {
			System.out.println("It's a palindrome");
		} else {
			System.out.println("It's not a palindrome");
		}
		
	}

}
