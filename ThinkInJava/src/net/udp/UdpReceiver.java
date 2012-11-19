package net.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiver {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		byte[] buf = new byte[1024];
		DatagramSocket ds = new DatagramSocket(3000);
		DatagramPacket dp = new DatagramPacket(buf, 1024);
		ds.receive(dp);
		System.out.println(new String(dp.getData(),0,dp.getLength()));
		System.out.println(dp.getAddress().getHostAddress());
		System.out.println(dp.getPort());
		ds.close();
	}

}


/*
 hello!нд╩т
127.0.0.1
3692

 */