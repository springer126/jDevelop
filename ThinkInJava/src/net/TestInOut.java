package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;



public class TestInOut implements Runnable{

	Process p=null;
	
	public TestInOut() {
		try {
			p = Runtime.getRuntime().exec("java net.MyTest");
		} catch (IOException e) {
			e.printStackTrace();
		}
		new Thread(this).start();
	}
	
	public static void main(String[] args) {
		TestInOut tio = new TestInOut();
		tio.send();
	}

	public void send(){
		OutputStream ops =(OutputStream) p.getOutputStream();
		while(true){
			try {
				ops.write("help\r\n".getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void run() {
		InputStream in = p.getInputStream();
		BufferedReader bfr = new BufferedReader(new InputStreamReader(in));
		
		while(true){
			try {
				String strLine = bfr.readLine();
				System.out.println(strLine);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			
	}

}
