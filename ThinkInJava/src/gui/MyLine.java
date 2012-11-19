package gui;

import java.awt.Graphics;

public class MyLine {
	private int orgX; 
	private int orgY; 
	private int endX; 
	private int endY; 
	
	public MyLine(int orgX,int orgY,int endX,int endY) {
		this.orgX = orgX;
		this.orgY = orgY;
		this.endX = endX;
		this.endY = endY;
	}
	
	public void drawMe(Graphics g){
		g.drawLine(orgX,orgY, endX, endY);
	}
	
}
