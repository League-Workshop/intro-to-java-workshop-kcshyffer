package section3;

import javax.swing.JOptionPane;

import com.sun.scenario.effect.AbstractShadow.ShadowMode;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String a = JOptionPane.showInputDialog("Give me an adjective!");
		// Get the user to enter a type of liquid
		String b = JOptionPane.showInputDialog("Give me a liquid!");
		// Get the user to enter a body part
		String c = JOptionPane.showInputDialog("Give me a body part!");
		// Get the user to enter a verb
		String d = JOptionPane.showInputDialog("Give me a verb!");
		// Get the user to enter a place
		String e = JOptionPane.showInputDialog("Give me a place!");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		JOptionPane.showMessageDialog(null, " Piranhas are more " + a + " during the day, so cross the river at night.\n Piranhas are attracted to fresh " + b + " and will mostl ikely take a bite out of your " + c + " if you " + d + ".\n Whatever you do, if you have an open wound, try to find another way to getback to the " + e + ". Good luck!");
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

