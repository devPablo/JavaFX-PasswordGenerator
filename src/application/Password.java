package application;

import java.util.Random;

public class Password {
	public String length;
	public boolean symbols;
	public boolean numbers;
	public boolean lowercase;
	public boolean ambiguous;
	public boolean uppercase;
	public Random random = new Random();
	
	public Password(String length, boolean symbols, boolean numbers, boolean lowercase, boolean ambiguous, boolean uppercase) {
		this.length = length;
		this.symbols = symbols;
		this.numbers = numbers;
		this.lowercase = lowercase;
		this.ambiguous = ambiguous;
		this.uppercase = uppercase;
	}
	
	public String generatePass() {
		StringBuilder password = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		char c = (char) 0;
		
		if(symbols) {
			sb.append("@#$%");
		}
		if(numbers) {
			sb.append("0123456789");
		}
		if(lowercase) {
			sb.append("abcdefghijklmnopqrstuvwxyz");
		}
		if(uppercase) {
			sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		}
		if(ambiguous) {
			sb.append("{}[]()/\\'\"`~,;:.<>");
		}			
		for(int i = 0; i < Integer.valueOf(this.length); i++) {
			c = sb.charAt(random.nextInt(sb.length()));
			password.append(c);
		}
		return password.toString();		
	}
}
