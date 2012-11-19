package gui;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestCardLayout extends Frame{
	CardLayout cl = new CardLayout();
	Panel plCenter = new Panel();

	public TestCardLayout() {
		Panel plWest = new Panel();
		plWest.setLayout(new GridLayout(3,1));
		Button btnPrev = new Button("前一个");
		Button btnNext = new Button("后一个");
		Button btnThree = new Button("第三个");
		plWest.add(btnPrev);
		plWest.add(btnNext);
		plWest.add(btnThree);
		
		
		plCenter.setLayout(cl);
		plCenter.add(new Button("第一个"),"第一个");
		plCenter.add(new Button("第二个"),"第二个");
		plCenter.add(new Button("第三个"),"第三个");
		plCenter.add(new Button("第四个"),"第四个");
		plCenter.add(new Button("第五个"),"第五个");
		this.add(plWest,"West");
		this.add(plCenter);

		class MyActionListener implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("前一个"))
					cl.previous(plCenter);
				else if(e.getActionCommand().equals("后一个"))
					cl.next(plCenter);
				else if(e.getActionCommand().equals("第三个")) 
					cl.show(plCenter, "第三个");
			}
			
		}
		
		MyActionListener mac = new MyActionListener();
		btnPrev.addActionListener(mac);
		btnNext.addActionListener(mac);
		btnThree.addActionListener(mac);
		
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
		TestCardLayout tc = new TestCardLayout();
		tc.setSize(400,400);
		tc.setVisible(true);

	}

}
