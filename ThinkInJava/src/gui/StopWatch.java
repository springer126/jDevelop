package gui;

import java.awt.AWTEvent;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressWarnings("serial")
public class StopWatch extends Canvas implements Runnable{
	
	long startTime=0;
	long endTime=0;
	boolean bStart = false;
	
	public StopWatch() {
		enableEvents(AWTEvent.MOUSE_EVENT_MASK);
	}
	
	@Override
	protected void processMouseEvent(MouseEvent e) {
		if(e.getID()==MouseEvent.MOUSE_PRESSED){
			startTime = endTime = System.currentTimeMillis();
			bStart = true;
			new Thread(this).start();
			repaint();
		}
		else if(e.getID()==MouseEvent.MOUSE_RELEASED){
			endTime = System.currentTimeMillis();
			bStart = false;
			repaint();
		}
	}
	
	@Override
	public void paint(Graphics g) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		try{
			Date elapseTime = sdf.parse("00:00:00");
			elapseTime.setTime(elapseTime.getTime()+(endTime - startTime));
			String strTime = sdf.format(elapseTime);
			g.fill3DRect(0, 0, 78, 28, true);
			g.setColor(Color.WHITE);
			g.drawString(strTime, 10, 20);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void run() {
		while(bStart){
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
			endTime = System.currentTimeMillis();
			repaint();
		}
	}
	

}
