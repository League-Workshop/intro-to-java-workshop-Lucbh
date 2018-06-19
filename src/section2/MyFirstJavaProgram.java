package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	

	
	public static void main(String[] args) {
		
		Robot r = new Robot();
		
		r.setSpeed(500);
		r.penDown();
		r.setRandomPenColor();


		
		
		for (int x = 0; x >= 0; x++) {
		
			r.move(2);
			r.turn(1);
		
			
	
		
	}
		
	}
}
