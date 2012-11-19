package io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipeStreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PipedSender sender = new PipedSender();
		PipedReceiver receiver = new PipedReceiver();
		PipedOutputStream out = sender.getOut();
		PipedInputStream in = receiver.getInput();
		
		try {
			out.connect(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sender.start();
		receiver.start();
		

	}

}
