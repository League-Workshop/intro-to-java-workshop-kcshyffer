package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot IG88 = new Robot();
	IG88.setSpeed(500);
	IG88.penUp();
	IG88.move(100);
	IG88.penDown();
	for(int i = 0; i<360; i++ ) {
	IG88.turn(1);
		IG88.move(3);}
		
	}
}
