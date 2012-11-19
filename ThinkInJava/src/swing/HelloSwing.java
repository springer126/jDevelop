package swing;

import java.awt.Image;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class HelloSwing {
    public static void main(String[] args) throws InterruptedException {
    	JFrame frame = new JFrame("Hello Swing!");
        final JLabel label = new JLabel("这是一个标签");
        frame.add(label);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,100);
        frame.setVisible(true);
        frame.setIconImage(new ImageIcon( "e:\\tomcat.ico").getImage());
        frame.addWindowListener(new MyWindowListener());
        /*
        TimeUnit.SECONDS.sleep(5);
        //label.setText("嘿，不同了吧！");
        SwingUtilities.invokeLater(new Runnable(){
        	
			public void run() {
				// TODO Auto-generated method stub
				label.setText("嘿，不同了吧！");
			}
        });
        */
	}
}
