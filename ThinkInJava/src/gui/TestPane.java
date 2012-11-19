package gui;


import java.awt.Frame;
import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;



@SuppressWarnings("serial")
public class TestPane extends Frame{

	
	
	public TestPane() {
		JMenuBar jmb = new JMenuBar();
		JMenu jm1 = new JMenu("²Ëµ¥");
		JMenu jm2 = new JMenu("¹¤¾ß");
		JMenu jm3 = new JMenu("°ïÖú");
		JMenuItem[] items = {
		  new JMenuItem("Item1"),new JMenuItem("Item2"),new JMenuItem("Item3"),
		  new JMenuItem("Item4"),new JMenuItem("Item5"),new JMenuItem("Item6"),
		  new JMenuItem("Item7"),new JMenuItem("Item8"),new JMenuItem("Item9")
		};
		
		for(int i=0;i<9;i++){
			if(i%3==0)jm1.add(items[i]);
			else if(i%3==1)jm2.add(items[i]);
			else if(i%3==2)jm3.add(items[i]);
		}
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		this.add(jmb,"North");
		
		TextArea ta = new TextArea("",50,50,TextArea.SCROLLBARS_NONE);
		ScrollPane sp = new ScrollPane();
		sp.add(ta);
		add(sp,"Center");
		
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
		TestPane tc = new TestPane();
		tc.setSize(600,400);
		tc.setVisible(true);

	}

}
