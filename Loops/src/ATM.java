/*
 * This program simulates a simple ATM.
 * 
 * We've added a loop to allow the user to go back to the main menu every time.
 * 
 */

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double balance = 35.27;	// Holds the current balance in the account

		int choice = 0;		// choice needs an initial value here so that the condition in the next line
							//  can be checked the first time the loop is reached.  The initial value can
							//  be anything that's not 4.  If it's 4, the loop condition would be immediately
							//  false, and it wouldn't run at all.
		while (choice != 4) {	// Keep repeating all actions inside until choice is equal to 4
			// Show main menu
			System.out.println("Welcome to the best ATM ever!!!");
			System.out.println("Menu Menu");
			System.out.println("1. Check balance");
			System.out.println("2. Deposit $$");
			System.out.println("3. Withdraw $$");
			System.out.println("4. Exit");
			System.out.println();
			
			// Get user input for his/her choice
			System.out.println("Enter the number of your choice:");
			choice = s.nextInt();
			
			if (choice == 1) {	// check balance
				System.out.format("Balance: $%.2f\n", balance);
				
			} else if (choice == 2) {	// deposit money
				System.out.println("Enter the amount to deposit:");
				double amt = s.nextDouble();
				balance += amt;	// balance = balance + amt;
				System.out.format("New Balance: $%.2f\n", balance);
				
			} else if (choice == 3) {	// withdraw money
				System.out.println("Enter the amount to withdraw:");
				double amt = s.nextDouble();
				if (amt > 0 && amt <= balance) {	// Check that amt is valid
					balance -= amt;	// balance = balance - amt;
					System.out.format("New Balance: $%.2f\n", balance);
				} else if (amt <= 0) {	// amt is negative
					System.out.println("The amount must be positive!");
				} else if (amt > balance) {	// not enough in balance
					System.out.println("Insufficient funds :(");
				}
				
			} else if (choice != 4) {	// error message - appears only if choice is not 1, 2, 3, or 4
				System.out.println("Learn to read your choices better...");
			}
			
		}	// end of the while loop
	}
}
