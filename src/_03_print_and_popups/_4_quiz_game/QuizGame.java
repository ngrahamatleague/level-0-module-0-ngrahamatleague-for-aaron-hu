package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String prompt1 =  JOptionPane.showInputDialog("What is 74+32?");
				// 3.  Use an if statement to check if their answer is correct
				if(prompt1 .equals("106")) {
				// 4.  if the user's answer was correct, add one to their score 
				JOptionPane.showMessageDialog(null, "Correct!");
				score += 1;
				}
				else {
				score -= 1;
				JOptionPane.showMessageDialog(null, "wrong");
				}
				// 2.  Ask the user a question 
				String prompt2 =  JOptionPane.showInputDialog("What is 94+42?");
				// 3.  Use an if statement to check if their answer is correct
				if(prompt2 .equals("136")) {
				// 4.  if the user's answer was correct, add one to their score 
				JOptionPane.showMessageDialog(null, "Correct!");
				score += 1;
				}
				else {
				score -= 1;
				JOptionPane.showMessageDialog(null, "wrong");
				}
				// 2.  Ask the user a question 
				String prompt3 =  JOptionPane.showInputDialog("What is 5x9?");
				// 3.  Use an if statement to check if their answer is correct
				if(prompt3 .equals("45")) {
				// 4.  if the user's answer was correct, add one to their score 
				JOptionPane.showMessageDialog(null, "Correct!");
				score += 1;
				}
				else {
				score -= 1;
				JOptionPane.showMessageDialog(null, "wrong");
				}
				
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
				JOptionPane.showMessageDialog(null, "Final Score is " +score);
				
	}
}
