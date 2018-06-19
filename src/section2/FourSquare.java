package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	
	Robot r = new Robot();
	
	void go() {
		// 4. Make the robot move as fast as possible
		
r.penDown();
r.setSpeed(500);
		// 5. Set the pen width to 5
r.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
for (int x = 0; x < 4; x++) {
			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
drawSquare();
			// 8. Turn the robot 90 degrees to the right
r.turn(90);

}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		
		
	
		r.setRandomPenColor();
		
		
 for (int y = 0; y < 4; y++) {
	 	r.move(100);
		r.turn(90);
		
 }
		
	}

	public static void main(String[] args) {
		
		new FourSquare().go();
	}

}



