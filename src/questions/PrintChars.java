package questions;

public class PrintChars {
	
	public static void main(String[] args) {
		
		for(char c = 'a'; c <= 'z'; c++){
			System.out.print(c + " ");
		}
		
		char ch = 'A';
		
		while(ch <= 'Z'){
			System.out.print(ch + " ");
			ch++;
		}
		
	}

}
