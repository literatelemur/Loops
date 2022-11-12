/*
 * This program simulates how the money in an account grows over time,
 * assuming that the interest is compounded annually.
 * 
 * We've added some error checking (input validation) to ensure that the user enters
 * a non-negative value for the starting balance.
 * 
 */
import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// Get user input for starting amount of money, rate of growth, yearly contributions, and
		//  number of years to grow
		
		// Here's a basic error checking loop on the balance, to ensure that the user input is non-negative
//		double balance = -1;	// The initial value here needs to be something that makes (balance < 0) true
//		while (balance < 0) {
//			System.out.println("How much are you starting with?");
//			balance = s.nextDouble();
//			if (balance < 0) {
//				System.out.println("Balance cannot be negative!");
//			}
//		}

		// Here's a version of the above loop using do-while instead of while
		// A do-while loop checks its condition at the end of the loop, which means the loop is guaranteed to run at least once
//		double balance;	// No initial value needed, since balance gets assigned something inside the loop
//		do {
//			System.out.println("How much are you starting with?");
//			balance = s.nextDouble();
//			if (balance < 0) {
//				System.out.println("Balance cannot be negative!");
//			}
//		} while (balance < 0);

		// Here's a deluxe version that also keeps track of the number of invalid entries made by the user!
		// The user is given a maximum of 5 invalid tries before the program exits.
		int timesScrewedUp = 0;
		double balance;
		do {
			System.out.println("How much are you starting with?");
			balance = s.nextDouble();
			if (balance < 0) {
				System.out.println("Balance cannot be negative!");
				timesScrewedUp++;
			}
			
			if (timesScrewedUp == 5) {
				System.out.println("Maximum attempts exceeded!");
				System.exit(1);	// An exit status of 0 usually indicates no errors; a non-zero exit status indicates something went wrong.
			}
		} while (balance < 0);
		
		
		System.out.println("What is the yearly interest rate?");
		double rate = s.nextDouble();
		System.out.println("How much extra do you want to add at the end of each year?");
		double extra = s.nextDouble();
		System.out.println("How many years do you want to let the money grow?");
		int years = s.nextInt();
		
		System.out.format("%4s %12s %12s %12s %12s\n", "Year", "Start Bal", "Interest", "Extra", "End Bal");
		
		int y = 1;
		while (y <= years) {	// This loop repeats "years" times
			double startingBalance = balance;				// Balance at the beginning of year y
			double interest = startingBalance*rate;			// Interest earned during year y
			balance = startingBalance + interest + extra;	// Balance at the end of year y
			System.out.format("%3d $%12.2f $%12.2f $%12.2f $%12.2f\n", y, startingBalance, interest, extra, balance);
			y++;
		}
	}

}
