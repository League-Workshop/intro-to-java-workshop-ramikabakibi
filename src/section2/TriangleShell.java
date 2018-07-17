package section2;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
Robot c3po = new Robot();
	
	void go() {
		
		// 6. Make the robot go as fast as possible
c3po.setSpeed(500);
		// 4. make a variable to hold the length of the triangle and set it to 50
int length = 50;
		// 7. Use a for loop to repeat steps #9 to #10, 60 times
for(int i = 0; i<60;i++) {
	c3po.penDown();
	c3po.setRandomPenColor();
length+=10;
drawTriangle(length);
c3po.turn(6);
}			// 9. Change the color of the pen to a random color
	
			// 8. Increase the length variable by 10
	
			// 5. call your drawTriangle() method using your length variable
	
			// 10. Turn the robot 6 degrees to the right

	}

	/* 2. fill in the method below to draw a triangle. Use the length variable when you call move(). */
	private void drawTriangle(int length) {
		for(int i = 0; i<3;i++)	{
		c3po.move(length);
		c3po.turn(120);
		}
	}
		

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
