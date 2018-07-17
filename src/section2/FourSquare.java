package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot c3po = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		c3po.setSpeed(500);
		// 5. Set the pen width to 5
c3po.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
for(int i = 0; i<4;i++) {
	c3po.setRandomPenColor();
c3po.turn(90);
	
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right

	}
	}

	
	void drawSquare() {
		;
		/* 3. Fill in the code to draw a square inside the method below. */
		c3po.penDown();
		for(int i = 0; i<4;i++) {
			c3po.move(100);
			c3po.turn(90);
		}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



