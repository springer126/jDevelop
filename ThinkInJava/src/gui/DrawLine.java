package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Enumeration;
import java.util.Vector;

public class DrawLine extends Frame{
	
	int orgX,orgY;
	int endX,endY;
	
	Vector<MyLine> lines = new Vector<MyLine>();
	
	@Override
	public void paint(Graphics g) {
		//g.drawLine(orgX,orgY, endX, endY);//ֻ�ǻ���������һ���ߣ�����û�м�¼ͼ�ε���Ϣ
		Enumeration e = lines.elements();
		while(e.hasMoreElements()){
			((MyLine)e.nextElement()).drawMe(g);
		}
	}
	
	public DrawLine() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
		
		this.addMouseListener(
				new MouseAdapter() {
					public void mousePressed(MouseEvent e){
						orgX = e.getX();
						orgY = e.getY();
					}
		
					public void mouseReleased(MouseEvent e){
						endX = e.getX();
						endY = e.getY();
						/*
						Graphics g = getGraphics();
						g.setColor(Color.RED);
						g.setFont(new Font(null,Font.ITALIC|Font.BOLD,15));
						g.drawString("("+orgX+","+orgY+")",orgX,orgY);
						g.drawString("("+e.getX()+","+e.getY()+")", e.getX(), e.getY());
						g.drawLine(orgX,orgY,e.getX(),e.getY());//graphicsӦ����ͬһ������
						*/
						lines.add(new MyLine(orgX,orgY,endX,endY));
						repaint();
					}
				}
				);
	}

	public static void main(String[] args) {
		DrawLine dl = new DrawLine();
		dl.setSize(400,400);
		dl.setVisible(true);
		
	}

}
