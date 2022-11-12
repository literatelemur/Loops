/*
 * We modify the original PrimeChecker to produce a list of primes between
 * 2 and a certain upper limit.
 * 
 * This involves a nested loop -- putting a loop inside another loop!
 * 
 */
public class PrimeChecker2 {
	public static void main(String[] args) {

		// The outer loop goes through each value of num between 2-1000
		for (int num = 2; num <= 1000; num++) {

			// Determine whether num is prime (using the same algorithm as before)
			// The inner loop checks the potential divisors of num
			
			boolean divisorFound = false;	// This variable keeps track of whether we've found a working divisor
			for (int d = 2; d < num; d++) {	// Check all the potential divisors d, from 2 up to num - 1
				if (num % d == 0) {			// If we find a working divisor, set divisorFound to true and stop the loop
					divisorFound = true;
					break;
				}
			}

			// If we make it through the entire loop without finding a working divisor, divisorFound
			//  will still have its original value of false.
			
			if (!divisorFound) {	// Show num only if it's prime (i.e., if no divisor has been found)
				System.out.println(num);
			}
		}
	}
}
