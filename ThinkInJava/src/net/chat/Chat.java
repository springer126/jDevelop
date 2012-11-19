package net.chat;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Chat extends JFrame {
	
	//List 组件为用户提供了一个可滚动的文本项列表
	List lst  = new List(6);
	
	JTextField jtfIP = new JTextField(15);
	JTextField jtfData = new JTextField(20);
	DatagramSocket ds=null;
	
	public Chat() {
		lst.setFont(new Font("", Font.BOLD,12));
		try {
			ds = new DatagramSocket(3000);
		} catch (SocketException e1) {
			e1.printStackTrace();
		}
		this.add(lst,"Center");
		JPanel jp = new JPanel();
		this.add(jp,"South");
		jp.setLayout(new BorderLayout());
		jp.add(jtfIP,"West");
		jp.add(jtfData,"East");
		
		
		
		new Thread(new Runnable(){
			public void run() {
				byte[] buf = new byte[1024];
				DatagramPacket dp = new DatagramPacket(buf, 1024);
				while(true){
					try {
						ds.receive(dp);
						lst.add(new String(buf,0,dp.getLength())+" from "+dp.getAddress().getHostAddress()+":"+dp.getPort(),0);
					} catch (IOException e) {
						if(!ds.isClosed())		
							e.printStackTrace();
					}
					
				}
					
			}
		}).start();
		
		
		jtfData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				byte[] buf ;
				buf = jtfData.getText().getBytes();
				DatagramPacket dp;
				try {
					dp = new DatagramPacket(buf,buf.length,
							InetAddress.getByName(jtfIP.getText()),3000);
					ds.send(dp);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				jtfData.setText("");
			}
		});
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				ds.close();
				dispose();
				System.exit(0);
			}
		});
		
		this.setSize(400,400);
		this.setVisible(true);
		this.setTitle("聊天室");
		this.setResizable(false);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chat chat = new Chat();

	}

}
