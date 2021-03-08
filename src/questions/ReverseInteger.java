package questions;

public class ReverseInteger {
	
	public static void main(String[] args) {
		
		//1. Method: Convert to char array
		
		String string = "afatsuM";
		
		char[] ch  = string.toCharArray();
		
		for (int i = ch.length-1; i >= 0; i--) {
			System.out.print(ch[i] + " \n");
		}
		
		//2. Method: For loop from reverse
		
		String string2 = "afatsuM";
		String rev = "";
		
		for (int i = string2.length()-1; i >= 0; i--) {
			rev += string2.charAt(i);
		}
		
		System.out.println(rev + " ");
		
		//3. Method: StringBuilder or StringBuffer 
		
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append("Orange");
		
		System.out.println(stringBuilder.reverse());
		
		
		
	}

}
