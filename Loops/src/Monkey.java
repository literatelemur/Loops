/*
 * This program simulates a single monkey typing randomly on a single
 * typewriter.  We assume the monkey is very smart and hits only capital
 * letters.  We track how many keystrokes it takes the monkey to arrive at
 * a certain target string.
 */
public class Monkey {

	public static void main(String[] args) {
		String target = "HAMLET";		// The monkey's target string
		String gibberish = "";			// Keeps track of what the monkey has typed so far

		int keysPressed = 0;	// Keeps track of the number of keys pressed by the monkey so far
		
		// Generate the first target.length() characters at random
		for (int i = 0; i < target.length(); i++) {
			gibberish += (char)('A' + (int)(26*Math.random()));	// This generates a random char between A-Z, and adds it to gibberish
			keysPressed++;
		}

		while (!gibberish.equals(target)) {		// Keep repeating as long as monkeysOutput does not equal target
			gibberish += (char)('A' + (int)(26*Math.random()));	// Add another random character to the end of gibberish
			keysPressed++;
			gibberish = gibberish.substring(1);		// Cut off the first character from gibberish - this allows us to focus
													//  on only the last target.length() characters at a time
		}
		
		System.out.println(gibberish);
		System.out.println(keysPressed);
	}
}
