package swing;

import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindowListener implements WindowListener{

	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Frame is opening!");
		
	}

	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub	
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0);
		//e.getSource()
		//(Window)(e.getComponent()).dispose();
		
	}

	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
