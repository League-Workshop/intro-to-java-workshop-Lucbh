package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		
		String[] questions = new String[5];
		
		questions[0] = "What is 5 + 1";
		questions[1] = "What is 7- 2";
		questions[2] = "What is 4 + 15";
		questions[3] = "What is 5 * 4";
		questions[4] = "What is 9 + 10";
		
		String[] answers = new String[5];
		
		answers[0] = "6";
		answers[1] = "5";
		answers[2] = "19";
		answers[3] = "20";
		answers[4] = "19";
		
		// 2.  Ask the user a question 
		
		for(int i = 0;i < 5; i++)  {
		
		String a = JOptionPane.showInputDialog(questions[i]);
		// 3.  Use an if statement to check if their answer is correct
		if (a.equalsIgnoreCase(answers[i])) {
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		score = score + 1;
		}
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		JOptionPane.showMessageDialog(null, "You got " + score);
		// 6.  After all the questions have been asked, print the user's score 
		
		
	}
}
