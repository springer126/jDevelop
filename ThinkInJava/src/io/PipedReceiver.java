package io;
import java.io.PipedInputStream;


public class PipedReceiver extends Thread {
	private PipedInputStream input = new PipedInputStream();
	
	public PipedInputStream getInput(){
		return input;
	}
	
	public void run() {
		//String strInfo = new String("Hello ,receiver!");
		byte[] buf = new byte[1024];
		try{
			int len = input.read(buf);
			System.out.println(new String(buf,0,len));
			input.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
