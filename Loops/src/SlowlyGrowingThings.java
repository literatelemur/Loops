/*
 * Computes the value of the series 1 + 1/2 + 1/3 + ... + 1/n for a
 * user-entered value of n.
 */
import java.util.Scanner;

public class SlowlyGrowingThings {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// Get user input for n
		System.out.println("Enter a value for n:");
		long n = s.nextLong();	// We use long for n and the loop counter, so that the int upper limit of 2^31 - 1 is not an issue

		double sum = 0;
		
		// Repeat n times...
		long t = 1;
		while (t <= n) {
			sum += 1./t;	// Without the 1., this would be an integer division
			t++;
		}
		
		System.out.println(sum);
	}

}
