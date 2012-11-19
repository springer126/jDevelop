package net.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpSender {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket();
		String s = "hello!文辉";
		//注意中文占用两个字符
		ds.send(new DatagramPacket(s.getBytes(),s.getBytes().length,
				InetAddress.getByName("127.0.0.1"),3000));
		ds.close();
	}

}
