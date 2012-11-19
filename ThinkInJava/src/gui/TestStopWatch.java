package gui;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestStopWatch extends Frame{

	
	public TestStopWatch() {
		add(new StopWatch());
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
		TestStopWatch f = new TestStopWatch();
		//Image img = f.getToolkit().getImage("logo.gif");
		
		f.setSize(200,100);
		f.setVisible(true);
		

	}

}
