package io;

import java.io.PipedOutputStream;

public class PipedSender extends Thread {
	private PipedOutputStream out = new PipedOutputStream();
	
	public PipedOutputStream getOut(){
		return out;
	}
	
	public void run() {
		String strInfo = new String("Hello ,receiver!");
		try{
		out.write(strInfo.getBytes());
		out.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
