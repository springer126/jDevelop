package net;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
		final int length = 100 ; 
		String host = "localhost" ;
		int port = 8000 ;
		Socket[] sockets = new Socket[length];
		for(int i=0;i<length;i++){
			sockets[i] = new Socket(host,port);
			System.out.println("��"+(i+1)+"�����ӳɹ���");
			
		}
		
		 Thread.sleep(3000); 
		    for(int i=0;i<length;i++){ 
		      sockets[i].close();                                         //�Ͽ����� 
		    } 
		
		

	}

}
