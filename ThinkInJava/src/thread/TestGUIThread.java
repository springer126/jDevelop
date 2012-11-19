package thread;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestGUIThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("Press me!");
		MyMonitor mm = new MyMonitor();
		button.addActionListener(mm);
		frame.addWindowListener(mm);
		
		frame.add(button,"Center");
		frame.setSize(400,260);
		frame.setVisible(true);
		MyThreadView.view();
		

	}

}

class MyMonitor extends WindowAdapter implements ActionListener,WindowListener{
	public void actionPerformed(ActionEvent e) {
		MyThreadView.view();
		
	}
	
	public void windowClosing(WindowEvent e) {
		MyThreadView.view();
		System.exit(0);
	}
	
//	public void windowClosed(WindowEvent e) {
//		System.exit(0);
//		
//	}
	

}

class MyThreadView {
	public static void view() {
		Thread current = Thread.currentThread();
		System.out.println("当前用户线程名称为： "+current.getName());
		int total = Thread.activeCount();//Returns the number of active threads in the current thread's thread group
		System.out.println("活动线程总数为： "+total+" 个");
		Thread[] threads = new Thread[total];
		Thread.enumerate(threads);//将当前线程所属组内的活动线程全部copy进threads
		for(Thread thread:threads) {
			String role = thread.isDaemon()?"-后台线程":"-用户线程";
			System.out.println("  "+role+thread.getName());
		}
		System.out.println("---------------------------------------");
		}
}

/***
当前用户线程名称为： main
活动线程总数为： 4 个
  -用户线程main
  -用户线程AWT-Shutdown
  -后台线程AWT-Windows
  -用户线程AWT-EventQueue-0
---------------------------------------
当前用户线程名称为： AWT-EventQueue-0
活动线程总数为： 4 个
  -用户线程AWT-Shutdown
  -后台线程AWT-Windows
  -用户线程AWT-EventQueue-0
  -用户线程DestroyJavaVM
---------------------------------------
当前用户线程名称为： AWT-EventQueue-0
活动线程总数为： 4 个
  -用户线程AWT-Shutdown
  -后台线程AWT-Windows AWT-linux??
  -用户线程AWT-EventQueue-0 时间序列
  -用户线程DestroyJavaVM 销毁虚拟机线程
---------------------------------------

swing 继承与awt 一样
 后台线程AWT-Windows
 * */
