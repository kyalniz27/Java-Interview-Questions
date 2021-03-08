package questions;

public class CapitalizeLetter {
	
	public static void main(String[] args) {
		
		String string = "mustafa";
		
		string = string.substring(0,3)+string.substring(3, 4).toUpperCase() + string.substring(4);
		System.out.println(string);
		
	}

}
