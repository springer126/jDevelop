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
		System.out.println("��ǰ�û��߳�����Ϊ�� "+current.getName());
		int total = Thread.activeCount();//Returns the number of active threads in the current thread's thread group
		System.out.println("��߳�����Ϊ�� "+total+" ��");
		Thread[] threads = new Thread[total];
		Thread.enumerate(threads);//����ǰ�߳��������ڵĻ�߳�ȫ��copy��threads
		for(Thread thread:threads) {
			String role = thread.isDaemon()?"-��̨�߳�":"-�û��߳�";
			System.out.println("  "+role+thread.getName());
		}
		System.out.println("---------------------------------------");
		}
}

/***
��ǰ�û��߳�����Ϊ�� main
��߳�����Ϊ�� 4 ��
  -�û��߳�main
  -�û��߳�AWT-Shutdown
  -��̨�߳�AWT-Windows
  -�û��߳�AWT-EventQueue-0
---------------------------------------
��ǰ�û��߳�����Ϊ�� AWT-EventQueue-0
��߳�����Ϊ�� 4 ��
  -�û��߳�AWT-Shutdown
  -��̨�߳�AWT-Windows
  -�û��߳�AWT-EventQueue-0
  -�û��߳�DestroyJavaVM
---------------------------------------
��ǰ�û��߳�����Ϊ�� AWT-EventQueue-0
��߳�����Ϊ�� 4 ��
  -�û��߳�AWT-Shutdown
  -��̨�߳�AWT-Windows AWT-linux??
  -�û��߳�AWT-EventQueue-0 ʱ������
  -�û��߳�DestroyJavaVM ����������߳�
---------------------------------------

swing �̳���awt һ��
 ��̨�߳�AWT-Windows
 * */
