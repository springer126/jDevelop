package swing;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestMyButton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();
		f.setSize(400,400);
		
		f.addWindowListener(new MyWindowListener());
		MyButton bt1 = new MyButton("��ץ�Ұ�!");
		MyButton bt2 = new MyButton("��ץ�Ұ�!");
		bt1.setFriend(bt2);
		bt2.setFriend(bt1);
		f.add(bt1,"North");
		f.add(bt2,"South");
		
		f.setVisible(true);
		bt2.setVisible(false);
		

	}

}
