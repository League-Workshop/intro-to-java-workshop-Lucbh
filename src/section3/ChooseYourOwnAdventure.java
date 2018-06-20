package section3;

import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
	
	public static void main(String[] args) {
		
		
	//JOptionPane.showMessageDialog(null, message);
		//JOptionPane.showInputDialog(message);
		//JOptionPane.showConfirmDialog(null, message);
		//JOptionPane.showOptionDialog(null, message, title, optionType, messageType, icon, options, initialValue);
		
		
		String name = JOptionPane.showInputDialog("Enter your name");
		
		String a = "Wellcome " + name + "! Today you will be doing some random stuff. Get it?";
		
		int b = JOptionPane.showConfirmDialog(null,a);
		
		if (b == 0) {
			JOptionPane.showMessageDialog(null, "Great! Let's begin!");
			
		int c =	JOptionPane.showOptionDialog(null, "Where do you want to travel?", "Choose!", 0 , JOptionPane.INFORMATION_MESSAGE, null, new String[] {"The Jungle","A Volcano","A Castle"}, null);
		
		
		if (c == 2) {
			JOptionPane.showMessageDialog(null, "The great large castle glooms over you. You enter");
		}
		else if (c == 1) {
			JOptionPane.showMessageDialog(null, "A exploding volcano stands before you. You enter");
		}
		else if (c == 0) {
			JOptionPane.showMessageDialog(null, "The green lucious jungle stands before you. You enter");
		}
			
		JOptionPane.showMessageDialog(null, "Oh no! A rock hits your head and you die. The end!");
		
			
			
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Well bye");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
