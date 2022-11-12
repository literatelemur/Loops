/*
 * This program uses the Caesar cipher to encrypt a string.
 * 
 */
import java.util.Scanner;

public class SecretMessages {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// Get user input for message to encrypt, and the shift amount
		System.out.println("Enter the message to encrypt:");
		String message = s.nextLine();
		System.out.println("Enter the desired shift amount:");
		int shift = s.nextInt();

		message = message.toUpperCase();	// This converts message to upper case
		String result = "";		// This holds the encrypted message - we build it one character at a time

		// Go through every character in the message
		for (int i = 0; i < message.length(); i++) {
			// Get the character at index i of the string
			char c = message.charAt(i);
			if (c >= 'A' && c <= 'Z') {	// If c is a letter...
				char newChar = (char)(c + shift);	// Shift the character by the specified amount
				if (newChar > 'Z')			// Reset from Z back to A if needed
					newChar = (char)(newChar - 26);
				if (newChar < 'A')			// Reset from A back to Z if needed
					newChar = (char)(newChar + 26);
				result = result + newChar;	// Add the new character to the result
			} else {					// If c is not a letter...
				result = result + c;		// Add the original character to the result
			}
		}
		
		System.out.println(result);
	}
}
