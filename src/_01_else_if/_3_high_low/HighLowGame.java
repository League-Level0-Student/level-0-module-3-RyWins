
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100-1);
		
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
			String guess = JOptionPane.showInputDialog("Pick a number between 1 and 100");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int num = Integer.parseInt(guess);
			// 5. if the guess is correct
			if(num == random) {
				JOptionPane.showMessageDialog(null, "You Win");
			}
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			else if(num == random) {
				System.exit(0);
			}
			// 7. if the guess is high
			else if(num > random) {
				JOptionPane.showMessageDialog(null, "Too High");
				JOptionPane.showMessageDialog(null, "You Lose");
			}
				// 8. Tell them it's too high
			// 9. if the guess is low
			else if(num < random) {
				JOptionPane.showMessageDialog(null, "Too low");
				JOptionPane.showMessageDialog(null, "You Lose");
			}
			
		}	
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}


