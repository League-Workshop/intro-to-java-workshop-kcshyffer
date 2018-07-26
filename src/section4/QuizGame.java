package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int playerScore = (0);
		// 2.  Ask the user a question 
		String a = JOptionPane.showInputDialog("How many rounds are needed to win a Competitive Counter-Strike Global Offensive Game?");
		
		// 3.  Use an if statement to check if their answer is correct
		if (a.equals("16")) {
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		playerScore = playerScore + 1;}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
String b = JOptionPane.showInputDialog("How much does the AWP cost in Counter-Strike Global Offensive?");
		
		// 3.  Use an if statement to check if their answer is correct
		if (b.equals("4,750")) {
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		playerScore = playerScore + 1;}
		
String c = JOptionPane.showInputDialog("How many members on a team in Counter-Strike Global Offensive?");
		
		// 3.  Use an if statement to check if their answer is correct
		if (c.equals("5")) {
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		playerScore = playerScore + 1;}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "You scored " + playerScore + " ponts.");
	}
}
