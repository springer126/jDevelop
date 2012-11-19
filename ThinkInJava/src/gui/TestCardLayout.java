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
		Button btnPrev = new Button("ǰһ��");
		Button btnNext = new Button("��һ��");
		Button btnThree = new Button("������");
		plWest.add(btnPrev);
		plWest.add(btnNext);
		plWest.add(btnThree);
		
		
		plCenter.setLayout(cl);
		plCenter.add(new Button("��һ��"),"��һ��");
		plCenter.add(new Button("�ڶ���"),"�ڶ���");
		plCenter.add(new Button("������"),"������");
		plCenter.add(new Button("���ĸ�"),"���ĸ�");
		plCenter.add(new Button("�����"),"�����");
		this.add(plWest,"West");
		this.add(plCenter);

		class MyActionListener implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("ǰһ��"))
					cl.previous(plCenter);
				else if(e.getActionCommand().equals("��һ��"))
					cl.next(plCenter);
				else if(e.getActionCommand().equals("������")) 
					cl.show(plCenter, "������");
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
