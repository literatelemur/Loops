/*
 * Finds and prints all the perfect numbers between 1 and 10000.
 * A perfect number is defined as a positive integer that's equal to the sum of
 *  all its divisors (excluding itself).
 *  
 */
public class PerfectNumbers {

	public static void main(String[] args) {

		for (int num = 1; num <= 10000; num++) {	// Check each value of num from 1 to 10000 to see if it's perfect
	
			int sum = 0;	// This keeps track of the sum of num's divisors
			for (int d = 1; d < num; d++) {	// Go through all possible divisors of num, from 1 up to num - 1
				// Is d a divisor of num?  If so, add d to sum
				if (num % d == 0)
					sum += d;
			}
			
			if (sum == num)
				System.out.println(num + " is perfect");
		}
	}

}
