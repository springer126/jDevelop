package gui;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class TestChoice extends Frame{

	Choice ch = new Choice();
	class CHItemListener implements ItemListener{

		public void itemStateChanged(ItemEvent e) {
			System.out.println(e.getItem());
			}
				
		}
	
	public TestChoice() {
		FlowLayout fl = new FlowLayout();
		CHItemListener chItemListener = new CHItemListener();
		setLayout(fl);
		ch.add("choice1");
		ch.add("choice2");
		ch.add("choice3");
		add(ch);
		ch.addItemListener(chItemListener);

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
		TestChoice tc = new TestChoice();
		tc.setSize(400,400);
		tc.setVisible(true);

	}

}
