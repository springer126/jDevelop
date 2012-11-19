package gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class GraphicsTest {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(400,400);
		f.setVisible(true);
		//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Graphics g = f.getGraphics();
		//g.draw3DRect(0, 0, 300, 130,true);
		g.setColor(Color.RED);
		//g.drawRect(10,10,100,100);
		g.fillRect(3, 3, 100, 100);
		
	}

}
