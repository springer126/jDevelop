package gui;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DrawImage extends Frame{

	Image img = this.getToolkit().getImage("Sunset.jpg");
	
	public void paint(Graphics g){
		g.drawImage(img, 0,0,this);
	}
	
	public DrawImage() {
		this.addWindowListener(
				new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						dispose();
						System.exit(0);
					}
				});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawImage f = new DrawImage();
		//Image img = f.getToolkit().getImage("logo.gif");
		
		f.setSize(800,600);
		f.setVisible(true);
		f.paint(f.getGraphics());
		/*
		Graphics g = f.getGraphics();
		while(!g.drawImage(img, 0,0,f)){};
		*/
	}

}
