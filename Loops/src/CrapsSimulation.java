/*
 * Simulation of a craps game.
 * 
 * Craps is played by repeatedly rolling two 6-sided dice.  On the first roll:
 * - A 7 or 11 wins immediately
 * - A 2, 3, or 12 loses immediately
 * - Anything else (4, 5, 6, 8, 9, 10) becomes the player's "point."  Once the point has been
 *   established, the player keeps rolling until s/he gets his/her point before rolling a 7, s/he wins.
 *   If the player gets a 7 before rolling his/her point, s/he loses.
 */
public class CrapsSimulation {

	public static void main(String[] args) {
		
		// Make the first roll
		int d1 = (int)(6*Math.random()) + 1;
		int d2 = (int)(6*Math.random()) + 1;
		int sum = d1 + d2;
		System.out.println(d1 + ", " + d2);
		
		if (sum == 7 || sum == 11)		// Immediate win
			System.out.println("You win!!!!!!! :)");
		else if (sum == 2 || sum == 3 || sum == 12)	// Immediate loss
			System.out.println("You lose!!!!!!! :(");
		else {	// Point established - keep rolling
			int point = sum;
			System.out.println("Your point is now " + point);
			while (true) {
				// Roll the dice again
				d1 = (int)(6*Math.random()) + 1;
				d2 = (int)(6*Math.random()) + 1;
				sum = d1 + d2;
				System.out.println(d1 + ", " + d2);
				
				if (sum == point) {	// Point rolled - win
					System.out.println("You win!!!!!!! :)");
					break;
				} else if (sum == 7) {	// 7 rolled - lose
					System.out.println("You lose!!!!!!! :(");
					break;
				}
			}
		}
			
	}

}
