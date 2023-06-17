package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
public static void main(String[] args) {
		
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
		int num;
		// 3. Set your variable equal to a positive number less than 4 using      
		num = ran.nextInt(4);
		// 3. Print your variable to the console
		System.out.println(num);
		// 4. Get the user to enter something that they think is awesome
		String cool = JOptionPane.showInputDialog("Tell me something cool.");
		// 5. If your variable is  0
		if(num == (0)) {
		JOptionPane.showMessageDialog(null, "That's Awesome");
		}
		// 6. If your variable is  1
	
		JOptionPane.showMessageDialog(null, "That's ok");
	
		// 7. If your variable is  2
	
		JOptionPane.showMessageDialog(null, "That's boring");
	
		// 8. If your variable is  3
	
		JOptionPane.showMessageDialog(null, "That was not bad");

}

}
