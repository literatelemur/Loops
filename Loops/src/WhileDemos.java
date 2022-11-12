/*
 * Some demos of basic while loops.
 * 
 */
public class WhileDemos {

	public static void main(String[] args) {
		// Example 1: This loop repeats 5 times.  Use this as a template for 
		//  a loop that repeats a certain number of times!
//		int i = 0;		// i is called a "counter"
//		while (i < 5) {	// Replace the 5 with the desired number of loop iterations
//			System.out.println("sloths are the best things ever!");
//			i++;
//		}

		// Example 2: This loop also repeats 5 times.  We just start i from
		//  5 and make it count down, instead of starting i from 0 and
		//  making it count up.
//		int i = 5;
//		while (i > 0) {
//			System.out.println("sloths are the best things ever!");
//			i--;
//		}
		
		// Example 3: This loop also repeats 5 times (for i = 1, 2, 3, 4, 5).
//		int i = 1;
//		while (i <= 5) {
//			System.out.println("sloths are the best things ever!");
//			i++;
//		}

		// Example 4: This loop repeats only 3 times (for i = 1, 3, 5).
//		int i = 1;
//		while (i <= 5) {
//			System.out.println("sloths are the best things ever!");
//			i += 2;
//		}

		// Example 5: This loop displays the first 100 positive odd integers
		//  (1, 3, 5, 7, ...) on the screen.
		int x = 1;	// x controls what number to show on the screen
		int i = 0;	// i controls how many times the loop runs
		while (i < 100) {
			System.out.println(i + ", " + x);
			x += 2;
			i++;
		}
	}
}
