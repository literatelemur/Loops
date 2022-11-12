/*
 * Checks whether a user-entered integer is prime.
 * A prime number is divisible by only itself and 1.
 *  2 is the smallest (and the only even) prime number.
 */
import java.util.Scanner;

public class PrimeChecker {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// Get user input for a number to check
		System.out.println("Enter a number to check:");
		int num = s.nextInt();
		
		boolean divisorFound = false;	// This variable keeps track of whether we've found a working divisor
		for (int d = 2; d < num; d++) {	// Check all the potential divisors d, from 2 up to num - 1
			if (num % d == 0) {			// If we find a working divisor, set divisorFound to true and stop the loop
				divisorFound = true;
				break;
			}
		}

		// If we make it through the entire loop without finding a working divisor, divisorFound
		//  will still have its original value of false.
		
		if (!divisorFound) {	// divisorFound is a boolean value, so you can use it directly in an if statement like this
			System.out.println(num + " is prime!");
		} else {
			System.out.println(num + " is not prime!");
		}
	}
}
