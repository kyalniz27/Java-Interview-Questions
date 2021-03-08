package questions;

public class RemoveJunkCharacters {
	
	public static void main(String[] args) {
		
		String string = "!@Mus#$ta&*fa K&*ok(lu)";
		
		string = string.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(string);
	}

}
