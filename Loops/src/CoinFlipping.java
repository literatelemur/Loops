/*
 * Simulates flipping a coin 100000 times and reports the longest consecutive sequence of heads.
 */
public class CoinFlipping {

	public static void main(String[] args) {
		
		final int ITERATIONS = 100;	// Allows us to repeat the experiment multiple times
		int sumLongest = 0;	// Stores the sum of all the longest values (for finding the average later)
		
		for (int j = 0; j < ITERATIONS; j++) {	// Repeat ITERATIONS times...
			int headsInARow = 0;	// Keeps track of the number of heads in a row currently
			int longest = 0;		// Keeps track of the highest number of heads in a row seen so far
		
			for (int i = 0; i < 100000; i++) {	// Repeat 100000 times...
				double r = Math.random();
				// This simulates the coin flip:
				// r < 0.5 -> heads
				// r >= 0.5 -> tails
				
				if (r < 0.5) {
//					System.out.print("H");
					headsInARow++;
					if (headsInARow > longest)	// If the new value of headsInARow exceeds longest, it becomes the new longest
						longest = headsInARow;
				} else {	// Getting tails resets headsInARow to 0
//					System.out.print("T");
					headsInARow = 0;
				}
			}
			System.out.println("\n" + longest);
			sumLongest += longest;
		}
		double avgLongest = (double)sumLongest / ITERATIONS;
		System.out.println(avgLongest);
	}
}
