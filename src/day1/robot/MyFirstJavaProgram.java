package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot DotBot= new Robot();
for (int i = 0; i < 4; i++)
{DotBot.penDown();
DotBot.move(90);
DotBot.turn(90);
}

