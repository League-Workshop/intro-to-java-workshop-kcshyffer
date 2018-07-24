package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	Robot yeet = new Robot();

	void go() {
		
		yeet.setSpeed(999999999);
		yeet.penDown();
		yeet.setPenWidth(5);
	
		for(int i = 0; i < 4; i++) {
		yeet.setRandomPenColor();
		drawSquare();
		yeet.turn(90);
		}
	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		for(int i = 0; i < 4; i++) {
			yeet.turn(90);
			yeet.move(90);
			
			
			}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



