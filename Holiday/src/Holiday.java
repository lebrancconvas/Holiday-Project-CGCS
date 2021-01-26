import javax.swing.*;
import java.awt.*;

class Holiday extends JPanel {
	public static void main(String[] args) {
		Holiday m = new Holiday();
		JFrame f = new JFrame();
		f.add(m);
		f.setTitle("Assignment 1 - Holiday");
		f.setSize(600,600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
	
	public void paintComponent(Graphics g) {
		//Set Background Color
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 600, 600);
		
		//Draw Circle
		g.setColor(Color.WHITE);
		g.fillOval(150, 100, 300, 300);
		
		//LeftBaseLine
		//g.drawLine(200, 311, 150, 410);
		//RightBaseLine
		//g.drawLine(400, 311, 450, 410);
		//UnderBaseLine
		//g.drawLine(150, 410, 450, 410);
		//TopBaseLine
		//g.drawLine(200, 311, 400, 311);
		
		//fillBaseLine
		g.setColor(Color.RED);
		g.fillRect(200, 361, 200, 99);
		int leftTriangleX[] = {200,200,150};
		int leftTriangleY[] = {361,460,460};
		int rightTriangleX[] = {400,400,450};
		int rightTriangleY[] = {361,460,460};
		g.fillPolygon(leftTriangleX, leftTriangleY, 3);
		g.fillPolygon(rightTriangleX, rightTriangleY, 3);
		
		//fillLabel
		g.setColor(Color.YELLOW);
		g.fillRect(240, 390, 120, 40);
		
		//Text
		g.setColor(Color.BLACK);
		g.drawString("Merry Christmas", 248, 414); 
	}
}