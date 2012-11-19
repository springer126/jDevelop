package net;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

@SuppressWarnings("serial")
public class ShowTXTSample extends JFrame{

	/**
	 * @param args
	 */
	BorderLayout bl = new BorderLayout();
	JTextArea jta = new JTextArea();
	JScrollPane jsp = new JScrollPane(jta);
	JToolBar jtb = new JToolBar();
	JLabel jl = new JLabel("地址");
	JTextField jtf = new JTextField("请输入协议以及IP地址");
	String url_adr = null;
	URL url = null;
	InputStream in =null;
	BufferedReader bfr = null;
	String txt = null;
	
	public ShowTXTSample() {
		// TODO Auto-generated constructor stub
		this.getContentPane().setLayout(bl);
		jtf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				jtf_KeyTyped(e);
			}
		});
		
		jtb.add(jl);
		jtb.add(jtf);
		this.getContentPane().add(jtb,bl.NORTH);
		this.getContentPane().add(jsp,bl.CENTER);
		this.setTitle("显示网络文本数据");
		this.setSize(500,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public  void jtf_KeyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyChar()==KeyEvent.VK_ENTER){
			try{
				url_adr = jtf.getText();
				url = new URL(url_adr);
				in = url.openStream();
				bfr = new BufferedReader(new InputStreamReader(in));
				while((txt=bfr.readLine())!=null){
					jta.append(txt);
					jta.append("\n");
				}
				
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowTXTSample sp = new ShowTXTSample();
	}

}
