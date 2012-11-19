package swing;

import java.awt.Frame;

import javax.swing.ImageIcon;

public class TestFrame {
	public static void main(String[] args) {
		Frame fr = new Frame();
		fr.setSize(300,300);
		fr.setVisible(true);
		fr.addWindowListener(new MyWindowListener());
		//fr.setIconImage(new ImageIcon( "e:\\3.gif").getImage());
		
	}

}
