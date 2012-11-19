package thread;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadTestSleep {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame  frame = new JFrame();
		JLabel label = new JLabel("clock");
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.add(label,"Center");
		frame.setSize(500,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Thread tt = new MyThread1 (label);
		tt.start();
		

	}

}

class  MyThread1 extends Thread{
	JLabel label;
	public MyThread1(JLabel label) {
		this.label = label;
	}
	
	@Override
	public void run() {
		while(true){
			label.setText(this.getTime());
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	public String getTime(){
		Calendar c = new GregorianCalendar();
		String time = c.get(Calendar.YEAR)+"-"+
					  (c.get(Calendar.MONTH)+1)+"-"	+
					  c.get(Calendar.DATE)+" ";
		int h = c.get(Calendar.HOUR_OF_DAY);
		int m = c.get(Calendar.MINUTE);
		int s = c.get(Calendar.SECOND);
		String ph = (h>10)?"":"0";
		String pm = (m>10)?"":"0";
		String ps = (s>10)?"":"0";
		time += ph+h+":"+pm+m+":"+ps+s;
		return time;
					  
	}
}
