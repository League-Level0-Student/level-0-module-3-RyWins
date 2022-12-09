
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.AWTException;
import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) throws AWTException {
		
		//1. Create a new Robot
		Robot rob = new Robot();
		
		
		int count = 0;
	       //  LOOP. Start a while loop to repeat all of the code below ONE time (we will change this later)
		
		while(count < 25) {
		
		String color = JOptionPane.showInputDialog("What color should Rob draw with?");
		
		
		if(color.equals("blue")) {
			rob.setPenColor(99,125, 186);
		}
		else if(color.equals("green")) {
			rob.setPenColor(110, 199, 88);
		}
		else {
			rob.setRandomPenColor();
		}
		
		rob.setSpeed(20);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		rob.penDown();
		rob.turn(90);
		rob.move(250);
		rob.turn(90);
		rob.move(250);
		rob.turn(90);
		rob.move(250);
		rob.turn(90);
		rob.move(250);
		//3. Set the pen width to 10
		rob.setPenWidth(10);
		
		count += 1;
		}
		//4. Ask the user what color pen they would like the robot to draw with
		
		//5. Use an if/else statement to set the pen color that the user requested
		
        //6. If the user doesn't enter anything, choose a random color
		
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}

