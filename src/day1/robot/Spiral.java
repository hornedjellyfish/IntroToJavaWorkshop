package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {

		Robot Dot= new Robot();
		
		Dot.penDown();

		Dot.setSpeed(10);

		// 4. Do the following (steps 7-9) 75 times
for (int i=0; i>75; i++)
	Dot.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
	Dot.move(500);
	Dot.turn(120);
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
	
			// 9. Set the pen width to i

	}
}
