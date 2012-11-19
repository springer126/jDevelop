package gui;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class TestCheckBox extends Frame{
	Checkbox cb1 = new Checkbox("ÄãÏ²»¶ÎÒÂð£¿",true);
	CheckboxGroup cbg = new CheckboxGroup();
	Checkbox cb2 = new Checkbox("Ï²»¶",true,cbg);
	Checkbox cb3 = new Checkbox("²»Ï²»¶",false,cbg);
	
	class CbItemListener implements ItemListener{

		public void itemStateChanged(ItemEvent e) {
			Checkbox cb = (Checkbox)e.getItemSelectable();
			if(cb.getLabel().equals("ÄãÏ²»¶ÎÒÂð£¿")){
				if(cb.getState()==true)
					System.out.println("ÎÒºÜ¸ßÐË£¡");
				else
					System.out.println("ÎÒºÜÉËÐÄ£¡");
			}
			/*
			else if(cb.getLabel().equals("Ï²»¶")){
				if(e.getStateChange()==ItemEvent.SELECTED)
					System.out.println("ÎÒÒ²Ï²»¶Äã£¡");
				else
					System.out.println("ÎÒÒ²²»Ï²»¶Äã£¡");
			}
			*/
			else{
				Checkbox cbx = cbg.getSelectedCheckbox();
				if(cbx!=null)
					System.out.println(cbx.getLabel());
			}
				
		}
	}
	
	public TestCheckBox() {
		FlowLayout fl = new FlowLayout();
		CbItemListener cbItemListener = new CbItemListener();
		setLayout(fl);
		add(cb1);
		add(cb2);
		add(cb3);
		cb1.addItemListener(cbItemListener);
		cb2.addItemListener(cbItemListener);
		cb3.addItemListener(cbItemListener);
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
		TestCheckBox tcb = new TestCheckBox();
		tcb.setSize(400,400);
		tcb.setVisible(true);

	}

}
