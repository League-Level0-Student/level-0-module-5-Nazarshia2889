package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot walle = new Robot();

		//2. Set the speed to 100
		walle.setSpeed(100);
		

		int colorChoice=JOptionPane.showOptionDialog(null, "Which color do you prefer?", "Polygons", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Blue","Red", "Green", "Orange"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice == 0) {
			walle.setPenColor(Color.BLUE);
		}
		else if(colorChoice == 1) {
			walle.setPenColor(Color.RED);
		}
		else if(colorChoice == 2) {
			walle.setPenColor(Color.GREEN);
		}
		else if(colorChoice == 3) {
			walle.setPenColor(Color.ORANGE);
		}
		//4. Ask the use how many polygons they want to be drawn.
		String x = JOptionPane.showInputDialog(null, "How many polygons do you want drawn?");
		int y = Integer.parseInt(x);
		//5. Use the robot to draw the number of polygons the user requested.
		
		for(int i = 0;i<y;i++) {
			for(int j = 0;j<10;j++) {
				walle.penDown();
				walle.turn(36);
				walle.move(20);
			}
			walle.penUp();
			walle.turn(90);
			walle.move(100);
			walle.turn(-90);
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

